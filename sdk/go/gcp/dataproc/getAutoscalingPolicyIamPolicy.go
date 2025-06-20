// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dataproc

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Retrieves the current IAM policy data for autoscalingpolicy
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/dataproc"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := dataproc.LookupAutoscalingPolicyIamPolicy(ctx, &dataproc.LookupAutoscalingPolicyIamPolicyArgs{
//				Project:  pulumi.StringRef(basic.Project),
//				Location: pulumi.StringRef(basic.Location),
//				PolicyId: basic.PolicyId,
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupAutoscalingPolicyIamPolicy(ctx *pulumi.Context, args *LookupAutoscalingPolicyIamPolicyArgs, opts ...pulumi.InvokeOption) (*LookupAutoscalingPolicyIamPolicyResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupAutoscalingPolicyIamPolicyResult
	err := ctx.Invoke("gcp:dataproc/getAutoscalingPolicyIamPolicy:getAutoscalingPolicyIamPolicy", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAutoscalingPolicyIamPolicy.
type LookupAutoscalingPolicyIamPolicyArgs struct {
	// The  location where the autoscaling policy should reside.
	// The default value is `global`.
	// Used to find the parent resource to bind the IAM policy to. If not specified,
	// the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
	// location is specified, it is taken from the provider configuration.
	Location *string `pulumi:"location"`
	// Used to find the parent resource to bind the IAM policy to
	PolicyId string `pulumi:"policyId"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project *string `pulumi:"project"`
}

// A collection of values returned by getAutoscalingPolicyIamPolicy.
type LookupAutoscalingPolicyIamPolicyResult struct {
	// (Computed) The etag of the IAM policy.
	Etag string `pulumi:"etag"`
	// The provider-assigned unique ID for this managed resource.
	Id       string `pulumi:"id"`
	Location string `pulumi:"location"`
	// (Required only by `dataproc.AutoscalingPolicyIamPolicy`) The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData string `pulumi:"policyData"`
	PolicyId   string `pulumi:"policyId"`
	Project    string `pulumi:"project"`
}

func LookupAutoscalingPolicyIamPolicyOutput(ctx *pulumi.Context, args LookupAutoscalingPolicyIamPolicyOutputArgs, opts ...pulumi.InvokeOption) LookupAutoscalingPolicyIamPolicyResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupAutoscalingPolicyIamPolicyResultOutput, error) {
			args := v.(LookupAutoscalingPolicyIamPolicyArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("gcp:dataproc/getAutoscalingPolicyIamPolicy:getAutoscalingPolicyIamPolicy", args, LookupAutoscalingPolicyIamPolicyResultOutput{}, options).(LookupAutoscalingPolicyIamPolicyResultOutput), nil
		}).(LookupAutoscalingPolicyIamPolicyResultOutput)
}

// A collection of arguments for invoking getAutoscalingPolicyIamPolicy.
type LookupAutoscalingPolicyIamPolicyOutputArgs struct {
	// The  location where the autoscaling policy should reside.
	// The default value is `global`.
	// Used to find the parent resource to bind the IAM policy to. If not specified,
	// the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
	// location is specified, it is taken from the provider configuration.
	Location pulumi.StringPtrInput `pulumi:"location"`
	// Used to find the parent resource to bind the IAM policy to
	PolicyId pulumi.StringInput `pulumi:"policyId"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringPtrInput `pulumi:"project"`
}

func (LookupAutoscalingPolicyIamPolicyOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAutoscalingPolicyIamPolicyArgs)(nil)).Elem()
}

// A collection of values returned by getAutoscalingPolicyIamPolicy.
type LookupAutoscalingPolicyIamPolicyResultOutput struct{ *pulumi.OutputState }

func (LookupAutoscalingPolicyIamPolicyResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAutoscalingPolicyIamPolicyResult)(nil)).Elem()
}

func (o LookupAutoscalingPolicyIamPolicyResultOutput) ToLookupAutoscalingPolicyIamPolicyResultOutput() LookupAutoscalingPolicyIamPolicyResultOutput {
	return o
}

func (o LookupAutoscalingPolicyIamPolicyResultOutput) ToLookupAutoscalingPolicyIamPolicyResultOutputWithContext(ctx context.Context) LookupAutoscalingPolicyIamPolicyResultOutput {
	return o
}

// (Computed) The etag of the IAM policy.
func (o LookupAutoscalingPolicyIamPolicyResultOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAutoscalingPolicyIamPolicyResult) string { return v.Etag }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupAutoscalingPolicyIamPolicyResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAutoscalingPolicyIamPolicyResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupAutoscalingPolicyIamPolicyResultOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAutoscalingPolicyIamPolicyResult) string { return v.Location }).(pulumi.StringOutput)
}

// (Required only by `dataproc.AutoscalingPolicyIamPolicy`) The policy data generated by
// a `organizations.getIAMPolicy` data source.
func (o LookupAutoscalingPolicyIamPolicyResultOutput) PolicyData() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAutoscalingPolicyIamPolicyResult) string { return v.PolicyData }).(pulumi.StringOutput)
}

func (o LookupAutoscalingPolicyIamPolicyResultOutput) PolicyId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAutoscalingPolicyIamPolicyResult) string { return v.PolicyId }).(pulumi.StringOutput)
}

func (o LookupAutoscalingPolicyIamPolicyResultOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAutoscalingPolicyIamPolicyResult) string { return v.Project }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupAutoscalingPolicyIamPolicyResultOutput{})
}
