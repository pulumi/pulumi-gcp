// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package bigquerydatapolicy

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Retrieves the current IAM policy data for datapolicy
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/bigquerydatapolicy"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := bigquerydatapolicy.GetIamPolicy(ctx, &bigquerydatapolicy.GetIamPolicyArgs{
//				Project:      pulumi.StringRef(dataPolicy.Project),
//				Location:     pulumi.StringRef(dataPolicy.Location),
//				DataPolicyId: dataPolicy.DataPolicyId,
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetIamPolicy(ctx *pulumi.Context, args *GetIamPolicyArgs, opts ...pulumi.InvokeOption) (*GetIamPolicyResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetIamPolicyResult
	err := ctx.Invoke("gcp:bigquerydatapolicy/getIamPolicy:getIamPolicy", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getIamPolicy.
type GetIamPolicyArgs struct {
	// Used to find the parent resource to bind the IAM policy to
	DataPolicyId string `pulumi:"dataPolicyId"`
	// The name of the location of the data policy.
	// Used to find the parent resource to bind the IAM policy to. If not specified,
	// the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
	// location is specified, it is taken from the provider configuration.
	Location *string `pulumi:"location"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project *string `pulumi:"project"`
}

// A collection of values returned by getIamPolicy.
type GetIamPolicyResult struct {
	DataPolicyId string `pulumi:"dataPolicyId"`
	// (Computed) The etag of the IAM policy.
	Etag string `pulumi:"etag"`
	// The provider-assigned unique ID for this managed resource.
	Id       string `pulumi:"id"`
	Location string `pulumi:"location"`
	// (Required only by `bigquerydatapolicy.DataPolicyIamPolicy`) The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData string `pulumi:"policyData"`
	Project    string `pulumi:"project"`
}

func GetIamPolicyOutput(ctx *pulumi.Context, args GetIamPolicyOutputArgs, opts ...pulumi.InvokeOption) GetIamPolicyResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetIamPolicyResultOutput, error) {
			args := v.(GetIamPolicyArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("gcp:bigquerydatapolicy/getIamPolicy:getIamPolicy", args, GetIamPolicyResultOutput{}, options).(GetIamPolicyResultOutput), nil
		}).(GetIamPolicyResultOutput)
}

// A collection of arguments for invoking getIamPolicy.
type GetIamPolicyOutputArgs struct {
	// Used to find the parent resource to bind the IAM policy to
	DataPolicyId pulumi.StringInput `pulumi:"dataPolicyId"`
	// The name of the location of the data policy.
	// Used to find the parent resource to bind the IAM policy to. If not specified,
	// the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
	// location is specified, it is taken from the provider configuration.
	Location pulumi.StringPtrInput `pulumi:"location"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringPtrInput `pulumi:"project"`
}

func (GetIamPolicyOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetIamPolicyArgs)(nil)).Elem()
}

// A collection of values returned by getIamPolicy.
type GetIamPolicyResultOutput struct{ *pulumi.OutputState }

func (GetIamPolicyResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetIamPolicyResult)(nil)).Elem()
}

func (o GetIamPolicyResultOutput) ToGetIamPolicyResultOutput() GetIamPolicyResultOutput {
	return o
}

func (o GetIamPolicyResultOutput) ToGetIamPolicyResultOutputWithContext(ctx context.Context) GetIamPolicyResultOutput {
	return o
}

func (o GetIamPolicyResultOutput) DataPolicyId() pulumi.StringOutput {
	return o.ApplyT(func(v GetIamPolicyResult) string { return v.DataPolicyId }).(pulumi.StringOutput)
}

// (Computed) The etag of the IAM policy.
func (o GetIamPolicyResultOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v GetIamPolicyResult) string { return v.Etag }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetIamPolicyResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetIamPolicyResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetIamPolicyResultOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v GetIamPolicyResult) string { return v.Location }).(pulumi.StringOutput)
}

// (Required only by `bigquerydatapolicy.DataPolicyIamPolicy`) The policy data generated by
// a `organizations.getIAMPolicy` data source.
func (o GetIamPolicyResultOutput) PolicyData() pulumi.StringOutput {
	return o.ApplyT(func(v GetIamPolicyResult) string { return v.PolicyData }).(pulumi.StringOutput)
}

func (o GetIamPolicyResultOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v GetIamPolicyResult) string { return v.Project }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetIamPolicyResultOutput{})
}
