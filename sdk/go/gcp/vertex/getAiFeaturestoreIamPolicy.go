// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package vertex

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-gcp/sdk/v7/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func GetAiFeaturestoreIamPolicy(ctx *pulumi.Context, args *GetAiFeaturestoreIamPolicyArgs, opts ...pulumi.InvokeOption) (*GetAiFeaturestoreIamPolicyResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetAiFeaturestoreIamPolicyResult
	err := ctx.Invoke("gcp:vertex/getAiFeaturestoreIamPolicy:getAiFeaturestoreIamPolicy", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAiFeaturestoreIamPolicy.
type GetAiFeaturestoreIamPolicyArgs struct {
	// Used to find the parent resource to bind the IAM policy to
	Featurestore string `pulumi:"featurestore"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project *string `pulumi:"project"`
	// The region of the dataset. eg us-central1 Used to find the parent resource to bind the IAM policy to. If not specified,
	// the value will be parsed from the identifier of the parent resource. If no region is provided in the parent identifier and no
	// region is specified, it is taken from the provider configuration.
	Region *string `pulumi:"region"`
}

// A collection of values returned by getAiFeaturestoreIamPolicy.
type GetAiFeaturestoreIamPolicyResult struct {
	// (Computed) The etag of the IAM policy.
	Etag         string `pulumi:"etag"`
	Featurestore string `pulumi:"featurestore"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// (Required only by `vertex.AiFeatureStoreIamPolicy`) The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData string `pulumi:"policyData"`
	Project    string `pulumi:"project"`
	Region     string `pulumi:"region"`
}

func GetAiFeaturestoreIamPolicyOutput(ctx *pulumi.Context, args GetAiFeaturestoreIamPolicyOutputArgs, opts ...pulumi.InvokeOption) GetAiFeaturestoreIamPolicyResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetAiFeaturestoreIamPolicyResult, error) {
			args := v.(GetAiFeaturestoreIamPolicyArgs)
			r, err := GetAiFeaturestoreIamPolicy(ctx, &args, opts...)
			var s GetAiFeaturestoreIamPolicyResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetAiFeaturestoreIamPolicyResultOutput)
}

// A collection of arguments for invoking getAiFeaturestoreIamPolicy.
type GetAiFeaturestoreIamPolicyOutputArgs struct {
	// Used to find the parent resource to bind the IAM policy to
	Featurestore pulumi.StringInput `pulumi:"featurestore"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringPtrInput `pulumi:"project"`
	// The region of the dataset. eg us-central1 Used to find the parent resource to bind the IAM policy to. If not specified,
	// the value will be parsed from the identifier of the parent resource. If no region is provided in the parent identifier and no
	// region is specified, it is taken from the provider configuration.
	Region pulumi.StringPtrInput `pulumi:"region"`
}

func (GetAiFeaturestoreIamPolicyOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAiFeaturestoreIamPolicyArgs)(nil)).Elem()
}

// A collection of values returned by getAiFeaturestoreIamPolicy.
type GetAiFeaturestoreIamPolicyResultOutput struct{ *pulumi.OutputState }

func (GetAiFeaturestoreIamPolicyResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAiFeaturestoreIamPolicyResult)(nil)).Elem()
}

func (o GetAiFeaturestoreIamPolicyResultOutput) ToGetAiFeaturestoreIamPolicyResultOutput() GetAiFeaturestoreIamPolicyResultOutput {
	return o
}

func (o GetAiFeaturestoreIamPolicyResultOutput) ToGetAiFeaturestoreIamPolicyResultOutputWithContext(ctx context.Context) GetAiFeaturestoreIamPolicyResultOutput {
	return o
}

// (Computed) The etag of the IAM policy.
func (o GetAiFeaturestoreIamPolicyResultOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v GetAiFeaturestoreIamPolicyResult) string { return v.Etag }).(pulumi.StringOutput)
}

func (o GetAiFeaturestoreIamPolicyResultOutput) Featurestore() pulumi.StringOutput {
	return o.ApplyT(func(v GetAiFeaturestoreIamPolicyResult) string { return v.Featurestore }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetAiFeaturestoreIamPolicyResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetAiFeaturestoreIamPolicyResult) string { return v.Id }).(pulumi.StringOutput)
}

// (Required only by `vertex.AiFeatureStoreIamPolicy`) The policy data generated by
// a `organizations.getIAMPolicy` data source.
func (o GetAiFeaturestoreIamPolicyResultOutput) PolicyData() pulumi.StringOutput {
	return o.ApplyT(func(v GetAiFeaturestoreIamPolicyResult) string { return v.PolicyData }).(pulumi.StringOutput)
}

func (o GetAiFeaturestoreIamPolicyResultOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v GetAiFeaturestoreIamPolicyResult) string { return v.Project }).(pulumi.StringOutput)
}

func (o GetAiFeaturestoreIamPolicyResultOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v GetAiFeaturestoreIamPolicyResult) string { return v.Region }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetAiFeaturestoreIamPolicyResultOutput{})
}
