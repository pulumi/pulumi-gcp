// Copyright 2016-2024, Pulumi Corporation.  All rights reserved.

package gcp

import (
	"context"

	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	"github.com/pulumi/pulumi/sdk/v3/go/common/resource"
)

func resourceSecretManagerSecret() *tfbridge.ResourceInfo {
	// Between v6..v7 upstream changed the schema from replication.auto to replication.automatic
	// but due to pulumi/pulumi-terraform-bridge#1667 it is not handled correctly in the bridged
	// provider causing unexpected replacements. To compensate, this bit of code auto-migrates
	// Pulumi state into a form that works well with the v7-style schema.
	//
	// replication.automatic: true  --> replication.auto: {}
	//
	// The case of automatic: false or missing automatic does not seem to exist in practice
	// because GCP v6 rejects this and insists on the user setting replication to user_managed.
	fixReplicationAuto := func(pm resource.PropertyMap) resource.PropertyMap {
		pmCopy := pm.Copy()
		replication, gotReplication := pmCopy["replication"]
		if !gotReplication || !replication.IsObject() {
			return pmCopy
		}
		replicationCopy := replication.ObjectValue().Copy()
		automatic, gotAutomatic := replicationCopy["automatic"]
		if !gotAutomatic {
			return pmCopy
		}
		_, gotAuto := replicationCopy["auto"]
		if automatic.IsBool() && automatic.BoolValue() && !gotAuto {
			auto := resource.NewObjectProperty(resource.PropertyMap{})
			replicationCopy["auto"] = auto
		}
		delete(replicationCopy, "automatic")
		pmCopy["replication"] = resource.NewObjectProperty(replicationCopy)
		return pmCopy
	}

	return &tfbridge.ResourceInfo{
		DeleteBeforeReplace: true,
		TransformFromState: func(
			_ context.Context, pm resource.PropertyMap,
		) (resource.PropertyMap, error) {
			return fixReplicationAuto(pm), nil
		},
		Fields: map[string]*tfbridge.SchemaInfo{
			"secret_id": tfbridge.AutoName("secretId", 255, "-"),
		},
	}
}
