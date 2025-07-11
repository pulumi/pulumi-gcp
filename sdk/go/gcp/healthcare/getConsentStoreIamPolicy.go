// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package healthcare

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Retrieves the current IAM policy data for consentstore
//
// ## Example Usage
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
//			_, err := healthcare.LookupConsentStoreIamPolicy(ctx, &healthcare.LookupConsentStoreIamPolicyArgs{
//				Dataset:        my_consent.Dataset,
//				ConsentStoreId: my_consent.Name,
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupConsentStoreIamPolicy(ctx *pulumi.Context, args *LookupConsentStoreIamPolicyArgs, opts ...pulumi.InvokeOption) (*LookupConsentStoreIamPolicyResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupConsentStoreIamPolicyResult
	err := ctx.Invoke("gcp:healthcare/getConsentStoreIamPolicy:getConsentStoreIamPolicy", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getConsentStoreIamPolicy.
type LookupConsentStoreIamPolicyArgs struct {
	// Used to find the parent resource to bind the IAM policy to
	ConsentStoreId string `pulumi:"consentStoreId"`
	// Identifies the dataset addressed by this request. Must be in the format
	// 'projects/{project}/locations/{location}/datasets/{dataset}'
	// Used to find the parent resource to bind the IAM policy to
	Dataset string `pulumi:"dataset"`
}

// A collection of values returned by getConsentStoreIamPolicy.
type LookupConsentStoreIamPolicyResult struct {
	ConsentStoreId string `pulumi:"consentStoreId"`
	Dataset        string `pulumi:"dataset"`
	// (Computed) The etag of the IAM policy.
	Etag string `pulumi:"etag"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// (Required only by `healthcare.ConsentStoreIamPolicy`) The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData string `pulumi:"policyData"`
}

func LookupConsentStoreIamPolicyOutput(ctx *pulumi.Context, args LookupConsentStoreIamPolicyOutputArgs, opts ...pulumi.InvokeOption) LookupConsentStoreIamPolicyResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupConsentStoreIamPolicyResultOutput, error) {
			args := v.(LookupConsentStoreIamPolicyArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("gcp:healthcare/getConsentStoreIamPolicy:getConsentStoreIamPolicy", args, LookupConsentStoreIamPolicyResultOutput{}, options).(LookupConsentStoreIamPolicyResultOutput), nil
		}).(LookupConsentStoreIamPolicyResultOutput)
}

// A collection of arguments for invoking getConsentStoreIamPolicy.
type LookupConsentStoreIamPolicyOutputArgs struct {
	// Used to find the parent resource to bind the IAM policy to
	ConsentStoreId pulumi.StringInput `pulumi:"consentStoreId"`
	// Identifies the dataset addressed by this request. Must be in the format
	// 'projects/{project}/locations/{location}/datasets/{dataset}'
	// Used to find the parent resource to bind the IAM policy to
	Dataset pulumi.StringInput `pulumi:"dataset"`
}

func (LookupConsentStoreIamPolicyOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupConsentStoreIamPolicyArgs)(nil)).Elem()
}

// A collection of values returned by getConsentStoreIamPolicy.
type LookupConsentStoreIamPolicyResultOutput struct{ *pulumi.OutputState }

func (LookupConsentStoreIamPolicyResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupConsentStoreIamPolicyResult)(nil)).Elem()
}

func (o LookupConsentStoreIamPolicyResultOutput) ToLookupConsentStoreIamPolicyResultOutput() LookupConsentStoreIamPolicyResultOutput {
	return o
}

func (o LookupConsentStoreIamPolicyResultOutput) ToLookupConsentStoreIamPolicyResultOutputWithContext(ctx context.Context) LookupConsentStoreIamPolicyResultOutput {
	return o
}

func (o LookupConsentStoreIamPolicyResultOutput) ConsentStoreId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConsentStoreIamPolicyResult) string { return v.ConsentStoreId }).(pulumi.StringOutput)
}

func (o LookupConsentStoreIamPolicyResultOutput) Dataset() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConsentStoreIamPolicyResult) string { return v.Dataset }).(pulumi.StringOutput)
}

// (Computed) The etag of the IAM policy.
func (o LookupConsentStoreIamPolicyResultOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConsentStoreIamPolicyResult) string { return v.Etag }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupConsentStoreIamPolicyResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConsentStoreIamPolicyResult) string { return v.Id }).(pulumi.StringOutput)
}

// (Required only by `healthcare.ConsentStoreIamPolicy`) The policy data generated by
// a `organizations.getIAMPolicy` data source.
func (o LookupConsentStoreIamPolicyResultOutput) PolicyData() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConsentStoreIamPolicyResult) string { return v.PolicyData }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupConsentStoreIamPolicyResultOutput{})
}
