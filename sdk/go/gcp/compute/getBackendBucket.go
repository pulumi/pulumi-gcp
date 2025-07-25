// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package compute

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Get information about a BackendBucket.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/compute"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := compute.LookupBackendBucket(ctx, &compute.LookupBackendBucketArgs{
//				Name: "my-backend",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupBackendBucket(ctx *pulumi.Context, args *LookupBackendBucketArgs, opts ...pulumi.InvokeOption) (*LookupBackendBucketResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupBackendBucketResult
	err := ctx.Invoke("gcp:compute/getBackendBucket:getBackendBucket", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getBackendBucket.
type LookupBackendBucketArgs struct {
	// Name of the resource.
	//
	// ***
	Name string `pulumi:"name"`
	// The ID of the project in which the resource belongs. If it
	// is not provided, the provider project is used.
	Project *string `pulumi:"project"`
}

// A collection of values returned by getBackendBucket.
type LookupBackendBucketResult struct {
	BucketName            string                      `pulumi:"bucketName"`
	CdnPolicies           []GetBackendBucketCdnPolicy `pulumi:"cdnPolicies"`
	CompressionMode       string                      `pulumi:"compressionMode"`
	CreationTimestamp     string                      `pulumi:"creationTimestamp"`
	CustomResponseHeaders []string                    `pulumi:"customResponseHeaders"`
	Description           string                      `pulumi:"description"`
	EdgeSecurityPolicy    string                      `pulumi:"edgeSecurityPolicy"`
	EnableCdn             bool                        `pulumi:"enableCdn"`
	// The provider-assigned unique ID for this managed resource.
	Id                  string  `pulumi:"id"`
	LoadBalancingScheme string  `pulumi:"loadBalancingScheme"`
	Name                string  `pulumi:"name"`
	Project             *string `pulumi:"project"`
	SelfLink            string  `pulumi:"selfLink"`
}

func LookupBackendBucketOutput(ctx *pulumi.Context, args LookupBackendBucketOutputArgs, opts ...pulumi.InvokeOption) LookupBackendBucketResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupBackendBucketResultOutput, error) {
			args := v.(LookupBackendBucketArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("gcp:compute/getBackendBucket:getBackendBucket", args, LookupBackendBucketResultOutput{}, options).(LookupBackendBucketResultOutput), nil
		}).(LookupBackendBucketResultOutput)
}

// A collection of arguments for invoking getBackendBucket.
type LookupBackendBucketOutputArgs struct {
	// Name of the resource.
	//
	// ***
	Name pulumi.StringInput `pulumi:"name"`
	// The ID of the project in which the resource belongs. If it
	// is not provided, the provider project is used.
	Project pulumi.StringPtrInput `pulumi:"project"`
}

func (LookupBackendBucketOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupBackendBucketArgs)(nil)).Elem()
}

// A collection of values returned by getBackendBucket.
type LookupBackendBucketResultOutput struct{ *pulumi.OutputState }

func (LookupBackendBucketResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupBackendBucketResult)(nil)).Elem()
}

func (o LookupBackendBucketResultOutput) ToLookupBackendBucketResultOutput() LookupBackendBucketResultOutput {
	return o
}

func (o LookupBackendBucketResultOutput) ToLookupBackendBucketResultOutputWithContext(ctx context.Context) LookupBackendBucketResultOutput {
	return o
}

func (o LookupBackendBucketResultOutput) BucketName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBackendBucketResult) string { return v.BucketName }).(pulumi.StringOutput)
}

func (o LookupBackendBucketResultOutput) CdnPolicies() GetBackendBucketCdnPolicyArrayOutput {
	return o.ApplyT(func(v LookupBackendBucketResult) []GetBackendBucketCdnPolicy { return v.CdnPolicies }).(GetBackendBucketCdnPolicyArrayOutput)
}

func (o LookupBackendBucketResultOutput) CompressionMode() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBackendBucketResult) string { return v.CompressionMode }).(pulumi.StringOutput)
}

func (o LookupBackendBucketResultOutput) CreationTimestamp() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBackendBucketResult) string { return v.CreationTimestamp }).(pulumi.StringOutput)
}

func (o LookupBackendBucketResultOutput) CustomResponseHeaders() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupBackendBucketResult) []string { return v.CustomResponseHeaders }).(pulumi.StringArrayOutput)
}

func (o LookupBackendBucketResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBackendBucketResult) string { return v.Description }).(pulumi.StringOutput)
}

func (o LookupBackendBucketResultOutput) EdgeSecurityPolicy() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBackendBucketResult) string { return v.EdgeSecurityPolicy }).(pulumi.StringOutput)
}

func (o LookupBackendBucketResultOutput) EnableCdn() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupBackendBucketResult) bool { return v.EnableCdn }).(pulumi.BoolOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupBackendBucketResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBackendBucketResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupBackendBucketResultOutput) LoadBalancingScheme() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBackendBucketResult) string { return v.LoadBalancingScheme }).(pulumi.StringOutput)
}

func (o LookupBackendBucketResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBackendBucketResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupBackendBucketResultOutput) Project() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupBackendBucketResult) *string { return v.Project }).(pulumi.StringPtrOutput)
}

func (o LookupBackendBucketResultOutput) SelfLink() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBackendBucketResult) string { return v.SelfLink }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupBackendBucketResultOutput{})
}
