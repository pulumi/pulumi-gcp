// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package compute

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Retrieves the current IAM policy data for subnetwork
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
//			_, err := compute.GetSubnetworkIamPolicy(ctx, &compute.GetSubnetworkIamPolicyArgs{
//				Project:    pulumi.StringRef(network_with_private_secondary_ip_ranges.Project),
//				Region:     pulumi.StringRef(network_with_private_secondary_ip_ranges.Region),
//				Subnetwork: network_with_private_secondary_ip_ranges.Name,
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetSubnetworkIamPolicy(ctx *pulumi.Context, args *GetSubnetworkIamPolicyArgs, opts ...pulumi.InvokeOption) (*GetSubnetworkIamPolicyResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetSubnetworkIamPolicyResult
	err := ctx.Invoke("gcp:compute/getSubnetworkIamPolicy:getSubnetworkIamPolicy", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSubnetworkIamPolicy.
type GetSubnetworkIamPolicyArgs struct {
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project *string `pulumi:"project"`
	// The GCP region for this subnetwork.
	// Used to find the parent resource to bind the IAM policy to. If not specified,
	// the value will be parsed from the identifier of the parent resource. If no region is provided in the parent identifier and no
	// region is specified, it is taken from the provider configuration.
	Region *string `pulumi:"region"`
	// Used to find the parent resource to bind the IAM policy to
	Subnetwork string `pulumi:"subnetwork"`
}

// A collection of values returned by getSubnetworkIamPolicy.
type GetSubnetworkIamPolicyResult struct {
	// (Computed) The etag of the IAM policy.
	Etag string `pulumi:"etag"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// (Required only by `compute.SubnetworkIAMPolicy`) The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData string `pulumi:"policyData"`
	Project    string `pulumi:"project"`
	Region     string `pulumi:"region"`
	Subnetwork string `pulumi:"subnetwork"`
}

func GetSubnetworkIamPolicyOutput(ctx *pulumi.Context, args GetSubnetworkIamPolicyOutputArgs, opts ...pulumi.InvokeOption) GetSubnetworkIamPolicyResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetSubnetworkIamPolicyResultOutput, error) {
			args := v.(GetSubnetworkIamPolicyArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("gcp:compute/getSubnetworkIamPolicy:getSubnetworkIamPolicy", args, GetSubnetworkIamPolicyResultOutput{}, options).(GetSubnetworkIamPolicyResultOutput), nil
		}).(GetSubnetworkIamPolicyResultOutput)
}

// A collection of arguments for invoking getSubnetworkIamPolicy.
type GetSubnetworkIamPolicyOutputArgs struct {
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringPtrInput `pulumi:"project"`
	// The GCP region for this subnetwork.
	// Used to find the parent resource to bind the IAM policy to. If not specified,
	// the value will be parsed from the identifier of the parent resource. If no region is provided in the parent identifier and no
	// region is specified, it is taken from the provider configuration.
	Region pulumi.StringPtrInput `pulumi:"region"`
	// Used to find the parent resource to bind the IAM policy to
	Subnetwork pulumi.StringInput `pulumi:"subnetwork"`
}

func (GetSubnetworkIamPolicyOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSubnetworkIamPolicyArgs)(nil)).Elem()
}

// A collection of values returned by getSubnetworkIamPolicy.
type GetSubnetworkIamPolicyResultOutput struct{ *pulumi.OutputState }

func (GetSubnetworkIamPolicyResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSubnetworkIamPolicyResult)(nil)).Elem()
}

func (o GetSubnetworkIamPolicyResultOutput) ToGetSubnetworkIamPolicyResultOutput() GetSubnetworkIamPolicyResultOutput {
	return o
}

func (o GetSubnetworkIamPolicyResultOutput) ToGetSubnetworkIamPolicyResultOutputWithContext(ctx context.Context) GetSubnetworkIamPolicyResultOutput {
	return o
}

// (Computed) The etag of the IAM policy.
func (o GetSubnetworkIamPolicyResultOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v GetSubnetworkIamPolicyResult) string { return v.Etag }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetSubnetworkIamPolicyResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetSubnetworkIamPolicyResult) string { return v.Id }).(pulumi.StringOutput)
}

// (Required only by `compute.SubnetworkIAMPolicy`) The policy data generated by
// a `organizations.getIAMPolicy` data source.
func (o GetSubnetworkIamPolicyResultOutput) PolicyData() pulumi.StringOutput {
	return o.ApplyT(func(v GetSubnetworkIamPolicyResult) string { return v.PolicyData }).(pulumi.StringOutput)
}

func (o GetSubnetworkIamPolicyResultOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v GetSubnetworkIamPolicyResult) string { return v.Project }).(pulumi.StringOutput)
}

func (o GetSubnetworkIamPolicyResultOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v GetSubnetworkIamPolicyResult) string { return v.Region }).(pulumi.StringOutput)
}

func (o GetSubnetworkIamPolicyResultOutput) Subnetwork() pulumi.StringOutput {
	return o.ApplyT(func(v GetSubnetworkIamPolicyResult) string { return v.Subnetwork }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetSubnetworkIamPolicyResultOutput{})
}
