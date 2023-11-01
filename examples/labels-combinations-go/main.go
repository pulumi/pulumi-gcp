// Copyright 2016-2023, Pulumi Corporation.  All rights reserved.

package main

import (
	"encoding/json"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"

	"github.com/pulumi/pulumi-gcp/sdk/v7/go/gcp"
	"github.com/pulumi/pulumi-gcp/sdk/v7/go/gcp/storage"
)

type state struct {
	DefaultTags  map[string]string `json:"defaultTags"`
	ResourceTags map[string]string `json:"resourceTags"`
}

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		conf := config.New(ctx, "")
		tagsState := conf.Require("state1")

		var s state

		err := json.Unmarshal([]byte(tagsState), &s)
		if err != nil {
			return err
		}

		tagsMap := pulumi.StringMap{}
		for k, v := range s.ResourceTags {
			tagsMap[k] = pulumi.String(v)
		}

		defaultTagsMap := pulumi.StringMap{}
		for k, v := range s.DefaultTags {
			defaultTagsMap[k] = pulumi.String(v)
		}

		p, err := gcp.NewProvider(ctx, "prov", &gcp.ProviderArgs{
			DefaultLabels: defaultTagsMap,
		})
		if err != nil {
			return err
		}

		bucket, err := storage.NewBucket(ctx, "demo-bucket", &storage.BucketArgs{
			Location: pulumi.String("US"),
			Labels:   tagsMap,
		}, pulumi.Provider(p))
		if err != nil {
			return err
		}

		ctx.Export("bucket", bucket.TerraformLabels.ApplyT(func(x interface{}) string {
			b, err := json.Marshal(x.(map[string]string))
			if err != nil {
				panic(err)
			}
			return string(b)
		}))

		return nil
	})
}
