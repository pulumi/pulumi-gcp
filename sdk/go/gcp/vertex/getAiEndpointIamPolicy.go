// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package vertex

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
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/vertex"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := vertex.LookupAiEndpointIamPolicy(ctx, &vertex.LookupAiEndpointIamPolicyArgs{
//				Project:  pulumi.StringRef(endpoint.Project),
//				Location: pulumi.StringRef(endpoint.Location),
//				Endpoint: endpoint.Name,
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupAiEndpointIamPolicy(ctx *pulumi.Context, args *LookupAiEndpointIamPolicyArgs, opts ...pulumi.InvokeOption) (*LookupAiEndpointIamPolicyResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupAiEndpointIamPolicyResult
	err := ctx.Invoke("gcp:vertex/getAiEndpointIamPolicy:getAiEndpointIamPolicy", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAiEndpointIamPolicy.
type LookupAiEndpointIamPolicyArgs struct {
	// Used to find the parent resource to bind the IAM policy to
	Endpoint string `pulumi:"endpoint"`
	// The location for the resource Used to find the parent resource to bind the IAM policy to. If not specified,
	// the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
	// location is specified, it is taken from the provider configuration.
	Location *string `pulumi:"location"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project *string `pulumi:"project"`
}

// A collection of values returned by getAiEndpointIamPolicy.
type LookupAiEndpointIamPolicyResult struct {
	Endpoint string `pulumi:"endpoint"`
	// (Computed) The etag of the IAM policy.
	Etag string `pulumi:"etag"`
	// The provider-assigned unique ID for this managed resource.
	Id       string `pulumi:"id"`
	Location string `pulumi:"location"`
	// (Required only by `vertex.AiEndpointIamPolicy`) The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData string `pulumi:"policyData"`
	Project    string `pulumi:"project"`
}

func LookupAiEndpointIamPolicyOutput(ctx *pulumi.Context, args LookupAiEndpointIamPolicyOutputArgs, opts ...pulumi.InvokeOption) LookupAiEndpointIamPolicyResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupAiEndpointIamPolicyResultOutput, error) {
			args := v.(LookupAiEndpointIamPolicyArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("gcp:vertex/getAiEndpointIamPolicy:getAiEndpointIamPolicy", args, LookupAiEndpointIamPolicyResultOutput{}, options).(LookupAiEndpointIamPolicyResultOutput), nil
		}).(LookupAiEndpointIamPolicyResultOutput)
}

// A collection of arguments for invoking getAiEndpointIamPolicy.
type LookupAiEndpointIamPolicyOutputArgs struct {
	// Used to find the parent resource to bind the IAM policy to
	Endpoint pulumi.StringInput `pulumi:"endpoint"`
	// The location for the resource Used to find the parent resource to bind the IAM policy to. If not specified,
	// the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
	// location is specified, it is taken from the provider configuration.
	Location pulumi.StringPtrInput `pulumi:"location"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringPtrInput `pulumi:"project"`
}

func (LookupAiEndpointIamPolicyOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAiEndpointIamPolicyArgs)(nil)).Elem()
}

// A collection of values returned by getAiEndpointIamPolicy.
type LookupAiEndpointIamPolicyResultOutput struct{ *pulumi.OutputState }

func (LookupAiEndpointIamPolicyResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAiEndpointIamPolicyResult)(nil)).Elem()
}

func (o LookupAiEndpointIamPolicyResultOutput) ToLookupAiEndpointIamPolicyResultOutput() LookupAiEndpointIamPolicyResultOutput {
	return o
}

func (o LookupAiEndpointIamPolicyResultOutput) ToLookupAiEndpointIamPolicyResultOutputWithContext(ctx context.Context) LookupAiEndpointIamPolicyResultOutput {
	return o
}

func (o LookupAiEndpointIamPolicyResultOutput) Endpoint() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAiEndpointIamPolicyResult) string { return v.Endpoint }).(pulumi.StringOutput)
}

// (Computed) The etag of the IAM policy.
func (o LookupAiEndpointIamPolicyResultOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAiEndpointIamPolicyResult) string { return v.Etag }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupAiEndpointIamPolicyResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAiEndpointIamPolicyResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupAiEndpointIamPolicyResultOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAiEndpointIamPolicyResult) string { return v.Location }).(pulumi.StringOutput)
}

// (Required only by `vertex.AiEndpointIamPolicy`) The policy data generated by
// a `organizations.getIAMPolicy` data source.
func (o LookupAiEndpointIamPolicyResultOutput) PolicyData() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAiEndpointIamPolicyResult) string { return v.PolicyData }).(pulumi.StringOutput)
}

func (o LookupAiEndpointIamPolicyResultOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAiEndpointIamPolicyResult) string { return v.Project }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupAiEndpointIamPolicyResultOutput{})
}
