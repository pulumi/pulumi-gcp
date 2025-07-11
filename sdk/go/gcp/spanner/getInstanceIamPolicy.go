// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package spanner

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Retrieves the current IAM policy data for a Spanner instance.
//
// ## example
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/spanner"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := spanner.GetInstanceIamPolicy(ctx, &spanner.GetInstanceIamPolicyArgs{
//				Project:  pulumi.StringRef(instance.Project),
//				Instance: instance.Name,
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetInstanceIamPolicy(ctx *pulumi.Context, args *GetInstanceIamPolicyArgs, opts ...pulumi.InvokeOption) (*GetInstanceIamPolicyResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetInstanceIamPolicyResult
	err := ctx.Invoke("gcp:spanner/getInstanceIamPolicy:getInstanceIamPolicy", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getInstanceIamPolicy.
type GetInstanceIamPolicyArgs struct {
	// The name of the instance.
	Instance string `pulumi:"instance"`
	// The ID of the project in which the resource belongs. If it
	// is not provided, the provider project is used.
	Project *string `pulumi:"project"`
}

// A collection of values returned by getInstanceIamPolicy.
type GetInstanceIamPolicyResult struct {
	// (Computed) The etag of the IAM policy.
	Etag string `pulumi:"etag"`
	// The provider-assigned unique ID for this managed resource.
	Id       string `pulumi:"id"`
	Instance string `pulumi:"instance"`
	// (Computed) The policy data
	PolicyData string `pulumi:"policyData"`
	Project    string `pulumi:"project"`
}

func GetInstanceIamPolicyOutput(ctx *pulumi.Context, args GetInstanceIamPolicyOutputArgs, opts ...pulumi.InvokeOption) GetInstanceIamPolicyResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetInstanceIamPolicyResultOutput, error) {
			args := v.(GetInstanceIamPolicyArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("gcp:spanner/getInstanceIamPolicy:getInstanceIamPolicy", args, GetInstanceIamPolicyResultOutput{}, options).(GetInstanceIamPolicyResultOutput), nil
		}).(GetInstanceIamPolicyResultOutput)
}

// A collection of arguments for invoking getInstanceIamPolicy.
type GetInstanceIamPolicyOutputArgs struct {
	// The name of the instance.
	Instance pulumi.StringInput `pulumi:"instance"`
	// The ID of the project in which the resource belongs. If it
	// is not provided, the provider project is used.
	Project pulumi.StringPtrInput `pulumi:"project"`
}

func (GetInstanceIamPolicyOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetInstanceIamPolicyArgs)(nil)).Elem()
}

// A collection of values returned by getInstanceIamPolicy.
type GetInstanceIamPolicyResultOutput struct{ *pulumi.OutputState }

func (GetInstanceIamPolicyResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetInstanceIamPolicyResult)(nil)).Elem()
}

func (o GetInstanceIamPolicyResultOutput) ToGetInstanceIamPolicyResultOutput() GetInstanceIamPolicyResultOutput {
	return o
}

func (o GetInstanceIamPolicyResultOutput) ToGetInstanceIamPolicyResultOutputWithContext(ctx context.Context) GetInstanceIamPolicyResultOutput {
	return o
}

// (Computed) The etag of the IAM policy.
func (o GetInstanceIamPolicyResultOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstanceIamPolicyResult) string { return v.Etag }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetInstanceIamPolicyResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstanceIamPolicyResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetInstanceIamPolicyResultOutput) Instance() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstanceIamPolicyResult) string { return v.Instance }).(pulumi.StringOutput)
}

// (Computed) The policy data
func (o GetInstanceIamPolicyResultOutput) PolicyData() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstanceIamPolicyResult) string { return v.PolicyData }).(pulumi.StringOutput)
}

func (o GetInstanceIamPolicyResultOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstanceIamPolicyResult) string { return v.Project }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetInstanceIamPolicyResultOutput{})
}
