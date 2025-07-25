// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package storage

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Gets existing objects inside an existing bucket in Google Cloud Storage service (GCS).
// See [the official documentation](https://cloud.google.com/storage/docs/key-terms#objects)
// and [API](https://cloud.google.com/storage/docs/json_api/v1/objects/list).
//
// ## Example Usage
//
// Example files stored within a bucket.
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/storage"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := storage.GetBucketObjects(ctx, &storage.GetBucketObjectsArgs{
//				Bucket: "file-store",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetBucketObjects(ctx *pulumi.Context, args *GetBucketObjectsArgs, opts ...pulumi.InvokeOption) (*GetBucketObjectsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetBucketObjectsResult
	err := ctx.Invoke("gcp:storage/getBucketObjects:getBucketObjects", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getBucketObjects.
type GetBucketObjectsArgs struct {
	// The name of the containing bucket.
	Bucket string `pulumi:"bucket"`
	// A glob pattern used to filter results (for example, `foo*bar`).
	MatchGlob *string `pulumi:"matchGlob"`
	// Filter results to include only objects whose names begin with this prefix.
	Prefix *string `pulumi:"prefix"`
}

// A collection of values returned by getBucketObjects.
type GetBucketObjectsResult struct {
	Bucket string `pulumi:"bucket"`
	// A list of retrieved objects contained in the provided GCS bucket. Structure is defined below.
	BucketObjects []GetBucketObjectsBucketObject `pulumi:"bucketObjects"`
	// The provider-assigned unique ID for this managed resource.
	Id        string  `pulumi:"id"`
	MatchGlob *string `pulumi:"matchGlob"`
	Prefix    *string `pulumi:"prefix"`
}

func GetBucketObjectsOutput(ctx *pulumi.Context, args GetBucketObjectsOutputArgs, opts ...pulumi.InvokeOption) GetBucketObjectsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetBucketObjectsResultOutput, error) {
			args := v.(GetBucketObjectsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("gcp:storage/getBucketObjects:getBucketObjects", args, GetBucketObjectsResultOutput{}, options).(GetBucketObjectsResultOutput), nil
		}).(GetBucketObjectsResultOutput)
}

// A collection of arguments for invoking getBucketObjects.
type GetBucketObjectsOutputArgs struct {
	// The name of the containing bucket.
	Bucket pulumi.StringInput `pulumi:"bucket"`
	// A glob pattern used to filter results (for example, `foo*bar`).
	MatchGlob pulumi.StringPtrInput `pulumi:"matchGlob"`
	// Filter results to include only objects whose names begin with this prefix.
	Prefix pulumi.StringPtrInput `pulumi:"prefix"`
}

func (GetBucketObjectsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetBucketObjectsArgs)(nil)).Elem()
}

// A collection of values returned by getBucketObjects.
type GetBucketObjectsResultOutput struct{ *pulumi.OutputState }

func (GetBucketObjectsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetBucketObjectsResult)(nil)).Elem()
}

func (o GetBucketObjectsResultOutput) ToGetBucketObjectsResultOutput() GetBucketObjectsResultOutput {
	return o
}

func (o GetBucketObjectsResultOutput) ToGetBucketObjectsResultOutputWithContext(ctx context.Context) GetBucketObjectsResultOutput {
	return o
}

func (o GetBucketObjectsResultOutput) Bucket() pulumi.StringOutput {
	return o.ApplyT(func(v GetBucketObjectsResult) string { return v.Bucket }).(pulumi.StringOutput)
}

// A list of retrieved objects contained in the provided GCS bucket. Structure is defined below.
func (o GetBucketObjectsResultOutput) BucketObjects() GetBucketObjectsBucketObjectArrayOutput {
	return o.ApplyT(func(v GetBucketObjectsResult) []GetBucketObjectsBucketObject { return v.BucketObjects }).(GetBucketObjectsBucketObjectArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetBucketObjectsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetBucketObjectsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetBucketObjectsResultOutput) MatchGlob() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetBucketObjectsResult) *string { return v.MatchGlob }).(pulumi.StringPtrOutput)
}

func (o GetBucketObjectsResultOutput) Prefix() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetBucketObjectsResult) *string { return v.Prefix }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetBucketObjectsResultOutput{})
}
