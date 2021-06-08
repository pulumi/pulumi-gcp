// Copyright 2016-2017, Pulumi Corporation.  All rights reserved.

package main

import (
	"github.com/pulumi/pulumi-gcp/sdk/v5/go/gcp/storage"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		bucket, err := storage.NewBucket(ctx, "demo-bucket", &storage.BucketArgs{})
		if err != nil {
			return err
		}

		ctx.Export("name", bucket.Name)
		return nil
	})
}
