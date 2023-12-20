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

	prov.MustTraverseProperties("fix-label-names", func(ctx tfbridge.PropertyVisitInfo) (tfbridge.PropertyVisitResult, error) {
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
				toUpdate[root.TfToken] = append(toUpdate[root.TfToken],
					tfbridge.SchemaPathToPropertyPath(path, ctx.EnclosingSchemaMap(), ctx.EnclosingSchemaInfoMap()))
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
	})

	for token, labelPaths := range toUpdate {
		prov.Resources[token].TransformFromState = ensureLabelPathsExist(labelPaths)
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
