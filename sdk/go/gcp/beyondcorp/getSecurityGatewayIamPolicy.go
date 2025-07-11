// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package beyondcorp

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Retrieves the current IAM policy data for securitygateway
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/beyondcorp"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := beyondcorp.LookupSecurityGatewayIamPolicy(ctx, &beyondcorp.LookupSecurityGatewayIamPolicyArgs{
//				Project:           pulumi.StringRef(example.Project),
//				Location:          pulumi.StringRef(example.Location),
//				SecurityGatewayId: example.SecurityGatewayId,
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupSecurityGatewayIamPolicy(ctx *pulumi.Context, args *LookupSecurityGatewayIamPolicyArgs, opts ...pulumi.InvokeOption) (*LookupSecurityGatewayIamPolicyResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupSecurityGatewayIamPolicyResult
	err := ctx.Invoke("gcp:beyondcorp/getSecurityGatewayIamPolicy:getSecurityGatewayIamPolicy", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSecurityGatewayIamPolicy.
type LookupSecurityGatewayIamPolicyArgs struct {
	// Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122. Must be omitted or set to `global`. Used to find the parent resource to bind the IAM policy to. If not specified,
	// the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
	// location is specified, it is taken from the provider configuration.
	Location *string `pulumi:"location"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project *string `pulumi:"project"`
	// Used to find the parent resource to bind the IAM policy to
	SecurityGatewayId string `pulumi:"securityGatewayId"`
}

// A collection of values returned by getSecurityGatewayIamPolicy.
type LookupSecurityGatewayIamPolicyResult struct {
	// (Computed) The etag of the IAM policy.
	Etag string `pulumi:"etag"`
	// The provider-assigned unique ID for this managed resource.
	Id       string `pulumi:"id"`
	Location string `pulumi:"location"`
	// (Required only by `beyondcorp.SecurityGatewayIamPolicy`) The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData        string `pulumi:"policyData"`
	Project           string `pulumi:"project"`
	SecurityGatewayId string `pulumi:"securityGatewayId"`
}

func LookupSecurityGatewayIamPolicyOutput(ctx *pulumi.Context, args LookupSecurityGatewayIamPolicyOutputArgs, opts ...pulumi.InvokeOption) LookupSecurityGatewayIamPolicyResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupSecurityGatewayIamPolicyResultOutput, error) {
			args := v.(LookupSecurityGatewayIamPolicyArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("gcp:beyondcorp/getSecurityGatewayIamPolicy:getSecurityGatewayIamPolicy", args, LookupSecurityGatewayIamPolicyResultOutput{}, options).(LookupSecurityGatewayIamPolicyResultOutput), nil
		}).(LookupSecurityGatewayIamPolicyResultOutput)
}

// A collection of arguments for invoking getSecurityGatewayIamPolicy.
type LookupSecurityGatewayIamPolicyOutputArgs struct {
	// Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122. Must be omitted or set to `global`. Used to find the parent resource to bind the IAM policy to. If not specified,
	// the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
	// location is specified, it is taken from the provider configuration.
	Location pulumi.StringPtrInput `pulumi:"location"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringPtrInput `pulumi:"project"`
	// Used to find the parent resource to bind the IAM policy to
	SecurityGatewayId pulumi.StringInput `pulumi:"securityGatewayId"`
}

func (LookupSecurityGatewayIamPolicyOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSecurityGatewayIamPolicyArgs)(nil)).Elem()
}

// A collection of values returned by getSecurityGatewayIamPolicy.
type LookupSecurityGatewayIamPolicyResultOutput struct{ *pulumi.OutputState }

func (LookupSecurityGatewayIamPolicyResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSecurityGatewayIamPolicyResult)(nil)).Elem()
}

func (o LookupSecurityGatewayIamPolicyResultOutput) ToLookupSecurityGatewayIamPolicyResultOutput() LookupSecurityGatewayIamPolicyResultOutput {
	return o
}

func (o LookupSecurityGatewayIamPolicyResultOutput) ToLookupSecurityGatewayIamPolicyResultOutputWithContext(ctx context.Context) LookupSecurityGatewayIamPolicyResultOutput {
	return o
}

// (Computed) The etag of the IAM policy.
func (o LookupSecurityGatewayIamPolicyResultOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSecurityGatewayIamPolicyResult) string { return v.Etag }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupSecurityGatewayIamPolicyResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSecurityGatewayIamPolicyResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupSecurityGatewayIamPolicyResultOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSecurityGatewayIamPolicyResult) string { return v.Location }).(pulumi.StringOutput)
}

// (Required only by `beyondcorp.SecurityGatewayIamPolicy`) The policy data generated by
// a `organizations.getIAMPolicy` data source.
func (o LookupSecurityGatewayIamPolicyResultOutput) PolicyData() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSecurityGatewayIamPolicyResult) string { return v.PolicyData }).(pulumi.StringOutput)
}

func (o LookupSecurityGatewayIamPolicyResultOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSecurityGatewayIamPolicyResult) string { return v.Project }).(pulumi.StringOutput)
}

func (o LookupSecurityGatewayIamPolicyResultOutput) SecurityGatewayId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSecurityGatewayIamPolicyResult) string { return v.SecurityGatewayId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupSecurityGatewayIamPolicyResultOutput{})
}
