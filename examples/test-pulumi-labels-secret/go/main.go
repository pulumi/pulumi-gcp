package main

import (
	"github.com/pulumi/pulumi-gcp/sdk/v9/go/gcp"
	"github.com/pulumi/pulumi-gcp/sdk/v9/go/gcp/storage"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		gcpProvider, err := gcp.NewProvider(ctx, "gcp-provider", &gcp.ProviderArgs{
			DefaultLabels: pulumi.StringMap{
				"hello": pulumi.String("goodbye"),
				"new":   pulumi.String("defaultlabel"),
			},
		})
		if err != nil {
			return err
		}
		goBucket, err := storage.NewBucket(ctx, "go-bucket", &storage.BucketArgs{
			Location: pulumi.String("EU"),
			Labels: pulumi.StringMap{
				"good": pulumi.String("morning"),
				"bad":  pulumi.String("things"),
			},
		}, pulumi.Provider(gcpProvider))
		if err != nil {
			return err
		}

		ctx.Export("pulumiLabels", goBucket.PulumiLabels)
		return nil
	})
}
