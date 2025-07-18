// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package iap

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Retrieves the current IAM policy data for appengineversion
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/iap"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := iap.LookupAppEngineVersionIamPolicy(ctx, &iap.LookupAppEngineVersionIamPolicyArgs{
//				Project:   pulumi.StringRef(version.Project),
//				AppId:     version.Project,
//				Service:   version.Service,
//				VersionId: version.VersionId,
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupAppEngineVersionIamPolicy(ctx *pulumi.Context, args *LookupAppEngineVersionIamPolicyArgs, opts ...pulumi.InvokeOption) (*LookupAppEngineVersionIamPolicyResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupAppEngineVersionIamPolicyResult
	err := ctx.Invoke("gcp:iap/getAppEngineVersionIamPolicy:getAppEngineVersionIamPolicy", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAppEngineVersionIamPolicy.
type LookupAppEngineVersionIamPolicyArgs struct {
	// Used to find the parent resource to bind the IAM policy to
	AppId string `pulumi:"appId"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project *string `pulumi:"project"`
	// Service id of the App Engine application Used to find the parent resource to bind the IAM policy to
	Service string `pulumi:"service"`
	// Used to find the parent resource to bind the IAM policy to
	VersionId string `pulumi:"versionId"`
}

// A collection of values returned by getAppEngineVersionIamPolicy.
type LookupAppEngineVersionIamPolicyResult struct {
	AppId string `pulumi:"appId"`
	// (Computed) The etag of the IAM policy.
	Etag string `pulumi:"etag"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// (Required only by `iap.AppEngineVersionIamPolicy`) The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData string `pulumi:"policyData"`
	Project    string `pulumi:"project"`
	Service    string `pulumi:"service"`
	VersionId  string `pulumi:"versionId"`
}

func LookupAppEngineVersionIamPolicyOutput(ctx *pulumi.Context, args LookupAppEngineVersionIamPolicyOutputArgs, opts ...pulumi.InvokeOption) LookupAppEngineVersionIamPolicyResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupAppEngineVersionIamPolicyResultOutput, error) {
			args := v.(LookupAppEngineVersionIamPolicyArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("gcp:iap/getAppEngineVersionIamPolicy:getAppEngineVersionIamPolicy", args, LookupAppEngineVersionIamPolicyResultOutput{}, options).(LookupAppEngineVersionIamPolicyResultOutput), nil
		}).(LookupAppEngineVersionIamPolicyResultOutput)
}

// A collection of arguments for invoking getAppEngineVersionIamPolicy.
type LookupAppEngineVersionIamPolicyOutputArgs struct {
	// Used to find the parent resource to bind the IAM policy to
	AppId pulumi.StringInput `pulumi:"appId"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringPtrInput `pulumi:"project"`
	// Service id of the App Engine application Used to find the parent resource to bind the IAM policy to
	Service pulumi.StringInput `pulumi:"service"`
	// Used to find the parent resource to bind the IAM policy to
	VersionId pulumi.StringInput `pulumi:"versionId"`
}

func (LookupAppEngineVersionIamPolicyOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAppEngineVersionIamPolicyArgs)(nil)).Elem()
}

// A collection of values returned by getAppEngineVersionIamPolicy.
type LookupAppEngineVersionIamPolicyResultOutput struct{ *pulumi.OutputState }

func (LookupAppEngineVersionIamPolicyResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAppEngineVersionIamPolicyResult)(nil)).Elem()
}

func (o LookupAppEngineVersionIamPolicyResultOutput) ToLookupAppEngineVersionIamPolicyResultOutput() LookupAppEngineVersionIamPolicyResultOutput {
	return o
}

func (o LookupAppEngineVersionIamPolicyResultOutput) ToLookupAppEngineVersionIamPolicyResultOutputWithContext(ctx context.Context) LookupAppEngineVersionIamPolicyResultOutput {
	return o
}

func (o LookupAppEngineVersionIamPolicyResultOutput) AppId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAppEngineVersionIamPolicyResult) string { return v.AppId }).(pulumi.StringOutput)
}

// (Computed) The etag of the IAM policy.
func (o LookupAppEngineVersionIamPolicyResultOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAppEngineVersionIamPolicyResult) string { return v.Etag }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupAppEngineVersionIamPolicyResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAppEngineVersionIamPolicyResult) string { return v.Id }).(pulumi.StringOutput)
}

// (Required only by `iap.AppEngineVersionIamPolicy`) The policy data generated by
// a `organizations.getIAMPolicy` data source.
func (o LookupAppEngineVersionIamPolicyResultOutput) PolicyData() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAppEngineVersionIamPolicyResult) string { return v.PolicyData }).(pulumi.StringOutput)
}

func (o LookupAppEngineVersionIamPolicyResultOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAppEngineVersionIamPolicyResult) string { return v.Project }).(pulumi.StringOutput)
}

func (o LookupAppEngineVersionIamPolicyResultOutput) Service() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAppEngineVersionIamPolicyResult) string { return v.Service }).(pulumi.StringOutput)
}

func (o LookupAppEngineVersionIamPolicyResultOutput) VersionId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAppEngineVersionIamPolicyResult) string { return v.VersionId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupAppEngineVersionIamPolicyResultOutput{})
}
