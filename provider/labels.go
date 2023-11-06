// Copyright 2016-2023, Pulumi Corporation.  All rights reserved.

package gcp

import (
	"context"
	"fmt"

	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	shim "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim"
	"github.com/pulumi/pulumi/sdk/v3/go/common/resource"
)

// GCP has many resources with labels called "terraform_labels". We want to change those
// to "pulumiLabels".
//
// fixLabelNames traverses the TF schema of resources and data sources to find fields
// called "terraform_labels", overriding these with "pulumiLabels" via
// tfbridge.SchemaInfo.
func fixLabelNames(prov *tfbridge.ProviderInfo) {
	// Recursively applies the label fix and gathers resource paths to pulumiLabels
	var apply func(string, shim.Schema, *tfbridge.SchemaInfo, *[]resource.PropertyPath, resource.PropertyPath)
	apply = func(key string, m shim.Schema, info *tfbridge.SchemaInfo,
		paths *[]resource.PropertyPath,
		currentPath resource.PropertyPath,
	) {
		if key == "terraform_labels" {
			info.Name = "pulumiLabels"
			// Gather all paths to pulumiLabels
			for _, v := range currentPath {
				if v, ok := v.(string); ok && v == "*" {
					panic(fmt.Sprintf("at path %s: globs are not supported", currentPath))
				}
			}
			// we need to reset the `terraformLabels` key that we wrote to currentPath to be `pulumiLabels`
			currentPath = currentPath[:len(currentPath)-1]
			currentPath = append(currentPath, info.Name)
			*paths = append(*paths, currentPath)
		}

		if m == nil {
			return
		}

		switch elem := m.Elem().(type) {
		case shim.Resource: // this is a nested object
			obj := elem.Schema()
			if info.Elem == nil {
				info.Elem = new(tfbridge.SchemaInfo)
			}

			if info.Elem.Fields == nil {
				info.Elem.Fields = make(map[string]*tfbridge.SchemaInfo, obj.Len())
			}
			obj.Range(func(key string, m shim.Schema) bool {
				i, ok := info.Elem.Fields[key]
				if !ok {
					i = new(tfbridge.SchemaInfo)
					info.Elem.Fields[key] = i
				}
				pulumiKey := tfbridge.TerraformToPulumiNameV2(key, obj, info.Elem.Fields)
				currentPath = append(currentPath, pulumiKey)
				apply(key, m, i, paths, currentPath)
				return true
			})
		case shim.Schema: // this is a map or array or a Set
			if info.Elem == nil {
				info.Elem = new(tfbridge.SchemaInfo)
			}
			currentPath = append(currentPath, "*")
			apply("", elem, info.Elem, paths, currentPath)
		}
	}
	// update takes a terraform schema map and a pulumi schema info map of a given resource, and calls `apply` to do
	// necessary resource transformations.
	// - Rename terraformLabels to pulumiLabels at schema generation time
	// - Create a collection of resource property paths that have this pulumiLabels key amd return it.
	update := func(s shim.SchemaMap, fields *map[string]*tfbridge.SchemaInfo) []resource.PropertyPath {
		var paths []resource.PropertyPath

		if *fields == nil {
			*fields = make(map[string]*tfbridge.SchemaInfo, s.Len())
		}
		s.Range(func(key string, m shim.Schema) bool {
			pulumiKey := tfbridge.TerraformToPulumiNameV2(key, s, *fields)
			currentPath := resource.PropertyPath{pulumiKey}
			i, ok := (*fields)[key]
			if !ok {
				i = new(tfbridge.SchemaInfo)
				(*fields)[key] = i
			}
			apply(key, m, i, &paths, currentPath)
			return true
		})
		return paths
	}

	rMap := prov.P.ResourcesMap()
	for token, info := range prov.Resources {
		// Rename pulumiLabel fields and obtain paths
		labelPaths := update(rMap.Get(token).Schema(), &info.Fields)
		if len(labelPaths) > 0 {
			info.TransformOutputs = setLabelsFieldsSecret
			info.TransformFromState = ensureLabelPathsExist(labelPaths)
		}
	}

	dMap := prov.P.DataSourcesMap()
	for token, info := range prov.DataSources {
		update(dMap.Get(token).Schema(), &info.Fields)
	}

}

// pulumiLabels represents a field added upstream via a custom diff, as terraform_labels.
// There is a bug: if this field is nil in the Pulumi state, it will never be added to the state,
// creating a permanent diff.
// See also: https://github.com/pulumi/pulumi-gcp/issues/1314
func ensureLabelPathsExist(paths []resource.PropertyPath) tfbridge.PropertyTransform {
	return func(ctx context.Context, prop resource.PropertyMap) (resource.PropertyMap, error) {
		obj := resource.NewObjectProperty(prop)
		for _, path := range paths {
			// If a `pulumiLabels` field is not set at the expected path, we will set it to an empty property Map,
			// so Diff can detect it.
			if _, found := path.Get(obj); !found {
				path.Set(obj, resource.NewObjectProperty(resource.PropertyMap{}))
			}
		}
		return obj.ObjectValue(), nil
	}
}

// If a resource has a `labels` field, the upstream provider will add the new aggregate label fields, `effectiveLabels`
// and `terraformLabels`. To protect against accidental leaking of secrets via aggregation from resource-level `labels`
// and provider-level `defaultLabels` fields, at runtime, we set these Outputs to Secret, if present.
func setLabelsFieldsSecret(ctx context.Context, prop resource.PropertyMap) (resource.PropertyMap, error) {
	prop["pulumiLabels"] = resource.MakeSecret(prop["pulumiLabels"])
	prop["effectiveLabels"] = resource.MakeSecret(prop["effectiveLabels"])
	return prop, nil
}
