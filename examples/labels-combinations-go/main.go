// Copyright 2016-2023, Pulumi Corporation.  All rights reserved.

package main

import (
	"encoding/json"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"

	"github.com/pulumi/pulumi-gcp/sdk/v9/go/gcp"
	"github.com/pulumi/pulumi-gcp/sdk/v9/go/gcp/storage"
)

type state struct {
	DefaultLabels map[string]string `json:"defaultLabels"`
	Labels        map[string]string `json:"labels"`
}

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		conf := config.New(ctx, "")
		labelsState := conf.Require("state1")

		var s state

		err := json.Unmarshal([]byte(labelsState), &s)
		if err != nil {
			return err
		}

		labelsMap := pulumi.StringMap{}
		for k, v := range s.Labels {
			labelsMap[k] = pulumi.String(v)
		}

		defaultLabelsMap := pulumi.StringMap{}
		for k, v := range s.DefaultLabels {
			defaultLabelsMap[k] = pulumi.String(v)
		}

		p, err := gcp.NewProvider(ctx, "prov", &gcp.ProviderArgs{
			DefaultLabels: defaultLabelsMap,
		})
		if err != nil {
			return err
		}

		bucket, err := storage.NewBucket(ctx, "demo-bucket", &storage.BucketArgs{
			Location: pulumi.String("US"),
			Labels:   labelsMap,
		}, pulumi.Provider(p))
		if err != nil {
			return err
		}

		ctx.Export("bucket", pulumi.Unsecret(bucket.PulumiLabels.ApplyT(func(x interface{}) string {
			b, err := json.Marshal(x.(map[string]string))
			if err != nil {
				panic(err)
			}
			return string(b)
		})))

		return nil
	})
}
