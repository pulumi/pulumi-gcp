// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package runtimeconfig

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/runtimeconfig"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := runtimeconfig.LookupConfigIamPolicy(ctx, &runtimeconfig.LookupConfigIamPolicyArgs{
//				Project: pulumi.StringRef(config.Project),
//				Config:  config.Name,
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupConfigIamPolicy(ctx *pulumi.Context, args *LookupConfigIamPolicyArgs, opts ...pulumi.InvokeOption) (*LookupConfigIamPolicyResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupConfigIamPolicyResult
	err := ctx.Invoke("gcp:runtimeconfig/getConfigIamPolicy:getConfigIamPolicy", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getConfigIamPolicy.
type LookupConfigIamPolicyArgs struct {
	// Used to find the parent resource to bind the IAM policy to
	Config string `pulumi:"config"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project *string `pulumi:"project"`
}

// A collection of values returned by getConfigIamPolicy.
type LookupConfigIamPolicyResult struct {
	Config string `pulumi:"config"`
	// (Computed) The etag of the IAM policy.
	Etag string `pulumi:"etag"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// (Required only by `runtimeconfig.ConfigIamPolicy`) The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData string `pulumi:"policyData"`
	Project    string `pulumi:"project"`
}

func LookupConfigIamPolicyOutput(ctx *pulumi.Context, args LookupConfigIamPolicyOutputArgs, opts ...pulumi.InvokeOption) LookupConfigIamPolicyResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupConfigIamPolicyResultOutput, error) {
			args := v.(LookupConfigIamPolicyArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("gcp:runtimeconfig/getConfigIamPolicy:getConfigIamPolicy", args, LookupConfigIamPolicyResultOutput{}, options).(LookupConfigIamPolicyResultOutput), nil
		}).(LookupConfigIamPolicyResultOutput)
}

// A collection of arguments for invoking getConfigIamPolicy.
type LookupConfigIamPolicyOutputArgs struct {
	// Used to find the parent resource to bind the IAM policy to
	Config pulumi.StringInput `pulumi:"config"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringPtrInput `pulumi:"project"`
}

func (LookupConfigIamPolicyOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupConfigIamPolicyArgs)(nil)).Elem()
}

// A collection of values returned by getConfigIamPolicy.
type LookupConfigIamPolicyResultOutput struct{ *pulumi.OutputState }

func (LookupConfigIamPolicyResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupConfigIamPolicyResult)(nil)).Elem()
}

func (o LookupConfigIamPolicyResultOutput) ToLookupConfigIamPolicyResultOutput() LookupConfigIamPolicyResultOutput {
	return o
}

func (o LookupConfigIamPolicyResultOutput) ToLookupConfigIamPolicyResultOutputWithContext(ctx context.Context) LookupConfigIamPolicyResultOutput {
	return o
}

func (o LookupConfigIamPolicyResultOutput) Config() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConfigIamPolicyResult) string { return v.Config }).(pulumi.StringOutput)
}

// (Computed) The etag of the IAM policy.
func (o LookupConfigIamPolicyResultOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConfigIamPolicyResult) string { return v.Etag }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupConfigIamPolicyResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConfigIamPolicyResult) string { return v.Id }).(pulumi.StringOutput)
}

// (Required only by `runtimeconfig.ConfigIamPolicy`) The policy data generated by
// a `organizations.getIAMPolicy` data source.
func (o LookupConfigIamPolicyResultOutput) PolicyData() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConfigIamPolicyResult) string { return v.PolicyData }).(pulumi.StringOutput)
}

func (o LookupConfigIamPolicyResultOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConfigIamPolicyResult) string { return v.Project }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupConfigIamPolicyResultOutput{})
}
