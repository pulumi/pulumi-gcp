// Copyright 2016-2023, Pulumi Corporation.  All rights reserved.

package gcp

import (
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	shim "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim"
)

// GCP has many resources with labels called "terraform_labels". We want to change those
// to "pulumiLabels".
//
// fixLabelNames traverses the TF schema of resources and data sources to find fields
// called "terraform_labels", overriding these with "pulumiLabels" via
// tfbridge.SchemaInfo.
func fixLabelNames(prov *tfbridge.ProviderInfo) {
	// Recursively applies the label fix
	var apply func(string, shim.Schema, *tfbridge.SchemaInfo)
	apply = func(key string, m shim.Schema, info *tfbridge.SchemaInfo) {
		if key == "terraform_labels" {
			info.Name = "pulumiLabels"
		}

		if m == nil {
			return
		}

		switch elem := m.Elem().(type) {
		case shim.Resource:
			obj := elem.Schema()
			if info.Fields == nil {
				info.Fields = make(map[string]*tfbridge.SchemaInfo, obj.Len())
			}
			obj.Range(func(key string, m shim.Schema) bool {
				i, ok := info.Fields[key]
				if !ok {
					i = new(tfbridge.SchemaInfo)
					info.Fields[key] = i
				}
				apply(key, m, i)
				return true
			})
		case shim.Schema:
			if info.Elem == nil {
				info.Elem = new(tfbridge.SchemaInfo)
			}
			apply("", elem, info.Elem)
		}
	}

	update := func(s shim.SchemaMap, fields *map[string]*tfbridge.SchemaInfo) {
		if *fields == nil {
			*fields = make(map[string]*tfbridge.SchemaInfo, s.Len())
		}
		s.Range(func(key string, m shim.Schema) bool {
			i, ok := (*fields)[key]
			if !ok {
				i = new(tfbridge.SchemaInfo)
				(*fields)[key] = i
			}
			apply(key, m, i)
			return true
		})
	}

	rMap := prov.P.ResourcesMap()
	for token, info := range prov.Resources {
		update(rMap.Get(token).Schema(), &info.Fields)
	}

	dMap := prov.P.DataSourcesMap()
	for token, info := range prov.DataSources {
		update(dMap.Get(token).Schema(), &info.Fields)
	}

}
