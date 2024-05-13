// Copyright 2016-2023, Pulumi Corporation.  All rights reserved.

package gcp

import (
	"context"

	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/walk"
	"github.com/pulumi/pulumi/sdk/v3/go/common/resource"
)

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
			ctx.SchemaInfo().Name = "pulumiLabels"

			// We only apply this transform for resources
			if root, ok := ctx.Root.(tfbridge.VisitResourceRoot); ok {
				schemaPath := tfbridge.SchemaPathToPropertyPath(path,
					root.Schema.Schema(),
					root.Info.Fields)

				toUpdate[root.TfToken] = append(toUpdate[root.TfToken], schemaPath)
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
