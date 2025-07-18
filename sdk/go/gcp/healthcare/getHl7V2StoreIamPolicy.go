// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package healthcare

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Retrieves the current IAM policy data for a Google Cloud Healthcare HL7v2 store.
//
// ## example
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/healthcare"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := healthcare.GetHl7V2StoreIamPolicy(ctx, &healthcare.GetHl7V2StoreIamPolicyArgs{
//				Hl7V2StoreId: hl7V2Store.Id,
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetHl7V2StoreIamPolicy(ctx *pulumi.Context, args *GetHl7V2StoreIamPolicyArgs, opts ...pulumi.InvokeOption) (*GetHl7V2StoreIamPolicyResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetHl7V2StoreIamPolicyResult
	err := ctx.Invoke("gcp:healthcare/getHl7V2StoreIamPolicy:getHl7V2StoreIamPolicy", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getHl7V2StoreIamPolicy.
type GetHl7V2StoreIamPolicyArgs struct {
	// The HL7v2 store ID, in the form
	// `{project_id}/{location_name}/{dataset_name}/{hl7_v2_store_name}` or
	// `{location_name}/{dataset_name}/{hl7_v2_store_name}`. In the second form, the provider's
	// project setting will be used as a fallback.
	Hl7V2StoreId string `pulumi:"hl7V2StoreId"`
}

// A collection of values returned by getHl7V2StoreIamPolicy.
type GetHl7V2StoreIamPolicyResult struct {
	// (Computed) The etag of the IAM policy.
	Etag         string `pulumi:"etag"`
	Hl7V2StoreId string `pulumi:"hl7V2StoreId"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// (Computed) The policy data
	PolicyData string `pulumi:"policyData"`
}

func GetHl7V2StoreIamPolicyOutput(ctx *pulumi.Context, args GetHl7V2StoreIamPolicyOutputArgs, opts ...pulumi.InvokeOption) GetHl7V2StoreIamPolicyResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetHl7V2StoreIamPolicyResultOutput, error) {
			args := v.(GetHl7V2StoreIamPolicyArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("gcp:healthcare/getHl7V2StoreIamPolicy:getHl7V2StoreIamPolicy", args, GetHl7V2StoreIamPolicyResultOutput{}, options).(GetHl7V2StoreIamPolicyResultOutput), nil
		}).(GetHl7V2StoreIamPolicyResultOutput)
}

// A collection of arguments for invoking getHl7V2StoreIamPolicy.
type GetHl7V2StoreIamPolicyOutputArgs struct {
	// The HL7v2 store ID, in the form
	// `{project_id}/{location_name}/{dataset_name}/{hl7_v2_store_name}` or
	// `{location_name}/{dataset_name}/{hl7_v2_store_name}`. In the second form, the provider's
	// project setting will be used as a fallback.
	Hl7V2StoreId pulumi.StringInput `pulumi:"hl7V2StoreId"`
}

func (GetHl7V2StoreIamPolicyOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetHl7V2StoreIamPolicyArgs)(nil)).Elem()
}

// A collection of values returned by getHl7V2StoreIamPolicy.
type GetHl7V2StoreIamPolicyResultOutput struct{ *pulumi.OutputState }

func (GetHl7V2StoreIamPolicyResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetHl7V2StoreIamPolicyResult)(nil)).Elem()
}

func (o GetHl7V2StoreIamPolicyResultOutput) ToGetHl7V2StoreIamPolicyResultOutput() GetHl7V2StoreIamPolicyResultOutput {
	return o
}

func (o GetHl7V2StoreIamPolicyResultOutput) ToGetHl7V2StoreIamPolicyResultOutputWithContext(ctx context.Context) GetHl7V2StoreIamPolicyResultOutput {
	return o
}

// (Computed) The etag of the IAM policy.
func (o GetHl7V2StoreIamPolicyResultOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v GetHl7V2StoreIamPolicyResult) string { return v.Etag }).(pulumi.StringOutput)
}

func (o GetHl7V2StoreIamPolicyResultOutput) Hl7V2StoreId() pulumi.StringOutput {
	return o.ApplyT(func(v GetHl7V2StoreIamPolicyResult) string { return v.Hl7V2StoreId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetHl7V2StoreIamPolicyResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetHl7V2StoreIamPolicyResult) string { return v.Id }).(pulumi.StringOutput)
}

// (Computed) The policy data
func (o GetHl7V2StoreIamPolicyResultOutput) PolicyData() pulumi.StringOutput {
	return o.ApplyT(func(v GetHl7V2StoreIamPolicyResult) string { return v.PolicyData }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetHl7V2StoreIamPolicyResultOutput{})
}
