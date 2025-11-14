// Copyright 2016-2023, Pulumi Corporation.  All rights reserved.

package gcp

import (
	"context"

	"github.com/hashicorp/go-cty/cty"

	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	shimv2 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v2"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/walk"
	"github.com/pulumi/pulumi/sdk/v3/go/common/resource"
	"github.com/pulumi/pulumi/sdk/v3/go/property"
)

// fixEmptyLabels applies a state edit to fix
// https://github.com/pulumi/pulumi-gcp/issues/2372.
func fixEmptyLabels(_ context.Context, req shimv2.PlanStateEditRequest) (cty.Value, error) {
	// programLabels holds the labels that we expect to be applied. It is the union of
	// labels (from the resource) and defaultLabels (from the provider).
	//
	// programLabels may not be the full set of labels on the resource, since
	// effective_labels can include labels read from the cloud provider.
	programLabels := property.Map{}

	labelsPropertyName := "labels"
	if req.TfToken == "google_container_cluster" {
		labelsPropertyName = "resourceLabels"
	}

	// Apply default labels first.
	if pConfig := resource.FromResourcePropertyValue(resource.NewProperty(req.ProviderConfig)); pConfig.IsMap() {
		if labels, ok := pConfig.AsMap().GetOk("defaultLabels"); ok && labels.IsMap() {
			programLabels = labels.AsMap()
		}
	}

	// Apply labels next, allowing labels to override defaultLabels.
	if inputs, ok := (resource.PropertyPath{labelsPropertyName}.Get(resource.NewProperty(req.NewInputs))); ok {
		if labels := resource.FromResourcePropertyValue(inputs); labels.IsMap() {
			for k, v := range labels.AsMap().AsMap() {
				programLabels = programLabels.Set(k, v)
			}
		}
	}

	fixMap := func(f func(map[string]cty.Value) map[string]cty.Value) func(cty.Value) cty.Value {
		return func(v cty.Value) cty.Value {
			if !v.Type().IsMapType() || !v.IsKnown() || v.IsNull() {
				return v
			}

			result := f(v.AsValueMap())
			if len(result) == 0 {
				return cty.MapValEmpty(v.Type().ElementType())
			}
			return cty.MapVal(result)
		}
	}

	// fixOutputLabels fixes falsely unknown values label values.
	fixOutputLabels := fixMap(func(m map[string]cty.Value) map[string]cty.Value {
		for k, v := range m {
			if v.IsKnown() {
				// If v is known, so no correction is needed.
				continue
			}
			label, ok := programLabels.GetOk(k) // labels is in the Pulumi namespace
			if !ok || label.IsComputed() || !label.IsString() {
				// If we didn't inherit label from the program or the
				// label is actually unknown, then just continue.
				continue
			}

			// v is incorrectly unknown, so set it to the known value from the
			// program.
			m[k] = cty.StringVal(label.AsString())
		}
		return m
	})

	// Apply f to m[k] if k in m.
	mapIfExists := func(m map[string]cty.Value, k string, f func(cty.Value) cty.Value) {
		v, ok := m[k]
		if ok {
			m[k] = f(v)
		}
	}

	planState := req.PlanState.AsValueMap()
	mapIfExists(planState, "effective_labels", fixOutputLabels)
	mapIfExists(planState, "terraform_labels", fixOutputLabels)
	return cty.ObjectVal(planState), nil
}

// GCP has many resources with labels called "terraform_labels". We want to change those
// to "pulumiLabels".
//
// fixLabelNames traverses the TF schema of resources and data sources to find fields
// called "terraform_labels", overriding these with "pulumiLabels" via
// tfbridge.SchemaInfo.
func fixLabelNames(prov *tfbridge.ProviderInfo) {
	toUpdate := map[string][]resource.PropertyPath{}

	visitor := func(ctx tfbridge.PropertyVisitInfo) (tfbridge.PropertyVisitResult, error) {
		if ctx.Root.PulumiToken() == "" { // Skip unmapped resources and functions
			return tfbridge.PropertyVisitResult{}, nil
		}
		path := ctx.SchemaPath()
		key, ok := path[len(path)-1].(walk.GetAttrStep)
		if !ok {
			return tfbridge.PropertyVisitResult{}, nil
		}
		switch key.Name {
		case "terraform_labels":
			replacingProperty := "pulumiLabels"
			ctx.SchemaInfo().Name = replacingProperty

			// We only apply this transform for resources
			if root, ok := ctx.Root.(tfbridge.VisitResourceRoot); ok {
				schemaPath := tfbridge.SchemaPathToPropertyPath(path,
					root.Schema.Schema(),
					root.Info.Fields)

				toUpdate[root.TfToken] = append(toUpdate[root.TfToken], schemaPath)
				if len(path) == 1 {
					// assuming these properties are top-level, we also need
					// to inject an empty raw state delta piece for the field
					// to handle state upgrades from v8.x to v9
					// see https://github.com/pulumi/pulumi-terraform-bridge/issues/3225
					rawStateDeltaKey := "__pulumi_raw_state_delta"
					toUpdate[root.TfToken] = append(toUpdate[root.TfToken],
						resource.PropertyPath{rawStateDeltaKey, "obj", "ps", replacingProperty},
						resource.PropertyPath{rawStateDeltaKey, "obj", "ps", replacingProperty, "map"},
					)
				}
			}

			ctx.SchemaInfo().Secret = tfbridge.True()

		// This field represents an aggregate of resource-level `labels` and provider-level `defaultLabels` fields.
		// To avoid leaking secrets set via Input on those fields, we mark this field as unconditionally Secret.
		case "effective_labels":
			ctx.SchemaInfo().Secret = tfbridge.True()
		default:
			return tfbridge.PropertyVisitResult{}, nil
		}
		return tfbridge.PropertyVisitResult{HasEffect: true}, nil
	}

	tfbridge.MustTraverseProperties(prov, "fix-label-names", visitor)

	for token, labelPaths := range toUpdate {
		prov.Resources[token].TransformFromState =
			composeTransform(prov.Resources[token].TransformFromState,
				ensureLabelPathsExist(labelPaths))
	}
}

func composeTransform(f1, f2 tfbridge.PropertyTransform) tfbridge.PropertyTransform {
	switch {
	case f1 == nil:
		return f2
	case f2 == nil:
		return f1
	}

	// f1 and f2 are not nil, so apply them both in order.
	return func(ctx context.Context, m resource.PropertyMap) (resource.PropertyMap, error) {
		m, err := f1(ctx, m)
		if err != nil {
			return m, err
		}
		return f2(ctx, m)
	}
}

// pulumiLabels represents a field added upstream via a custom diff, as terraform_labels.
// There is a bug: if this field is nil in the Pulumi state, it will never be added to the state,
// creating a permanent diff.
// See also: https://github.com/pulumi/pulumi-gcp/issues/1314
func ensureLabelPathsExist(paths []resource.PropertyPath) tfbridge.PropertyTransform {
	return func(_ context.Context, prop resource.PropertyMap) (resource.PropertyMap, error) {
		obj := resource.NewObjectProperty(prop)
		for _, path := range expandPathSet(paths, obj) {
			// If a `pulumiLabels` field is not set at the expected path, we will set it to an empty property Map,
			// so Diff can detect it.
			if _, found := path.Get(obj); !found {
				path.Set(obj, resource.NewObjectProperty(resource.PropertyMap{}))
			}
		}
		return obj.ObjectValue(), nil
	}
}

func expandPathSet(paths []resource.PropertyPath, value resource.PropertyValue) []resource.PropertyPath {
	expanded := make([]resource.PropertyPath, 0, len(paths))
	for _, path := range paths {
		expanded = append(expanded, expandGlob(path, value)...)
	}
	return expanded
}

// Expands any globs "*" in path according to value.
//
// If a glob doesn't match any value, the empty set is returned. Non-glob path elements do
// not need to match values to be returned. As an example, consider this PropertyPath:
//
//	foo["*"].bar
//
// Given the value `{ "foo": [ {}, { "v1": 0 } ] }`, `expandGlob(path, value)` would return
// `[foo[0].bar, foo[1].bar]`.
//
// Given the value `{ "missing": true }`, `expandGlob(path, value)` would return the empty
// list: `[]`.
//
// The order or returned paths is non-deterministic due to dictionary iteration.
func expandGlob(path resource.PropertyPath, value resource.PropertyValue) []resource.PropertyPath {
	for i, seg := range path {
		seg, ok := seg.(string)
		// If we don't have a value or seg isn't a glob, continue.
		if !ok || seg != "*" {
			continue
		}
		// Get the item that encloses seg.
		v, ok := path[:i].Get(value)
		if !ok {
			// We have failed to expand, which means that the glob
			// returns empty.
			return nil
		}

		if v.IsSecret() {
			v = v.SecretValue().Element
		}

		switch {
		case v.IsArray():
			results := make([]resource.PropertyPath, 0, len(v.ArrayValue()))
			for el, val := range v.ArrayValue() {
				results = append(results,
					addPrefix(append(path[:i], el),
						expandGlob(path[i+1:], val))...)
			}
			return results
		case v.IsObject():
			results := make([]resource.PropertyPath, 0, len(v.ObjectValue()))
			for el, val := range v.ObjectValue() {
				results = append(results,
					addPrefix(append(path[:i], string(el)),
						expandGlob(path[i+1:], val))...)
			}
			return results
		// v is not glob-able, so we expand to nothing.
		default:
			return nil
		}
	}
	return []resource.PropertyPath{path}
}

func addPrefix(prefix resource.PropertyPath, ends []resource.PropertyPath) []resource.PropertyPath {
	results := make([]resource.PropertyPath, 0, len(ends))
	for _, end := range ends {
		cp := make(resource.PropertyPath, len(prefix)+len(end))
		copy(cp, prefix)
		copy(cp[len(prefix):], end)
		results = append(results, cp)
	}
	return results
}
