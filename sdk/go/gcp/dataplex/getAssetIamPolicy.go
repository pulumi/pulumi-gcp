// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dataplex

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Retrieves the current IAM policy data for asset
//
// ## example
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/dataplex"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := dataplex.LookupAssetIamPolicy(ctx, &dataplex.LookupAssetIamPolicyArgs{
//				Project:      pulumi.StringRef(google_dataplex_asset.Example.Project),
//				Location:     pulumi.StringRef(google_dataplex_asset.Example.Location),
//				Lake:         google_dataplex_asset.Example.Lake,
//				DataplexZone: google_dataplex_asset.Example.Dataplex_zone,
//				Asset:        google_dataplex_asset.Example.Name,
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupAssetIamPolicy(ctx *pulumi.Context, args *LookupAssetIamPolicyArgs, opts ...pulumi.InvokeOption) (*LookupAssetIamPolicyResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupAssetIamPolicyResult
	err := ctx.Invoke("gcp:dataplex/getAssetIamPolicy:getAssetIamPolicy", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAssetIamPolicy.
type LookupAssetIamPolicyArgs struct {
	// Used to find the parent resource to bind the IAM policy to
	Asset        string  `pulumi:"asset"`
	DataplexZone string  `pulumi:"dataplexZone"`
	Lake         string  `pulumi:"lake"`
	Location     *string `pulumi:"location"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project *string `pulumi:"project"`
}

// A collection of values returned by getAssetIamPolicy.
type LookupAssetIamPolicyResult struct {
	Asset        string `pulumi:"asset"`
	DataplexZone string `pulumi:"dataplexZone"`
	// (Computed) The etag of the IAM policy.
	Etag string `pulumi:"etag"`
	// The provider-assigned unique ID for this managed resource.
	Id       string `pulumi:"id"`
	Lake     string `pulumi:"lake"`
	Location string `pulumi:"location"`
	// (Required only by `dataplex.AssetIamPolicy`) The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData string `pulumi:"policyData"`
	Project    string `pulumi:"project"`
}

func LookupAssetIamPolicyOutput(ctx *pulumi.Context, args LookupAssetIamPolicyOutputArgs, opts ...pulumi.InvokeOption) LookupAssetIamPolicyResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupAssetIamPolicyResult, error) {
			args := v.(LookupAssetIamPolicyArgs)
			r, err := LookupAssetIamPolicy(ctx, &args, opts...)
			var s LookupAssetIamPolicyResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupAssetIamPolicyResultOutput)
}

// A collection of arguments for invoking getAssetIamPolicy.
type LookupAssetIamPolicyOutputArgs struct {
	// Used to find the parent resource to bind the IAM policy to
	Asset        pulumi.StringInput    `pulumi:"asset"`
	DataplexZone pulumi.StringInput    `pulumi:"dataplexZone"`
	Lake         pulumi.StringInput    `pulumi:"lake"`
	Location     pulumi.StringPtrInput `pulumi:"location"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringPtrInput `pulumi:"project"`
}

func (LookupAssetIamPolicyOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAssetIamPolicyArgs)(nil)).Elem()
}

// A collection of values returned by getAssetIamPolicy.
type LookupAssetIamPolicyResultOutput struct{ *pulumi.OutputState }

func (LookupAssetIamPolicyResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAssetIamPolicyResult)(nil)).Elem()
}

func (o LookupAssetIamPolicyResultOutput) ToLookupAssetIamPolicyResultOutput() LookupAssetIamPolicyResultOutput {
	return o
}

func (o LookupAssetIamPolicyResultOutput) ToLookupAssetIamPolicyResultOutputWithContext(ctx context.Context) LookupAssetIamPolicyResultOutput {
	return o
}

func (o LookupAssetIamPolicyResultOutput) Asset() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAssetIamPolicyResult) string { return v.Asset }).(pulumi.StringOutput)
}

func (o LookupAssetIamPolicyResultOutput) DataplexZone() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAssetIamPolicyResult) string { return v.DataplexZone }).(pulumi.StringOutput)
}

// (Computed) The etag of the IAM policy.
func (o LookupAssetIamPolicyResultOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAssetIamPolicyResult) string { return v.Etag }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupAssetIamPolicyResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAssetIamPolicyResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupAssetIamPolicyResultOutput) Lake() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAssetIamPolicyResult) string { return v.Lake }).(pulumi.StringOutput)
}

func (o LookupAssetIamPolicyResultOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAssetIamPolicyResult) string { return v.Location }).(pulumi.StringOutput)
}

// (Required only by `dataplex.AssetIamPolicy`) The policy data generated by
// a `organizations.getIAMPolicy` data source.
func (o LookupAssetIamPolicyResultOutput) PolicyData() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAssetIamPolicyResult) string { return v.PolicyData }).(pulumi.StringOutput)
}

func (o LookupAssetIamPolicyResultOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAssetIamPolicyResult) string { return v.Project }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupAssetIamPolicyResultOutput{})
}