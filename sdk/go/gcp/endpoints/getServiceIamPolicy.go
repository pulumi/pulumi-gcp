// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package endpoints

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Retrieves the current IAM policy data for service
//
// ## example
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/endpoints"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := endpoints.LookupServiceIamPolicy(ctx, &endpoints.LookupServiceIamPolicyArgs{
//				ServiceName: google_endpoints_service.Endpoints_service.Service_name,
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupServiceIamPolicy(ctx *pulumi.Context, args *LookupServiceIamPolicyArgs, opts ...pulumi.InvokeOption) (*LookupServiceIamPolicyResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupServiceIamPolicyResult
	err := ctx.Invoke("gcp:endpoints/getServiceIamPolicy:getServiceIamPolicy", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getServiceIamPolicy.
type LookupServiceIamPolicyArgs struct {
	ServiceName string `pulumi:"serviceName"`
}

// A collection of values returned by getServiceIamPolicy.
type LookupServiceIamPolicyResult struct {
	// (Computed) The etag of the IAM policy.
	Etag string `pulumi:"etag"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// (Required only by `endpoints.ServiceIamPolicy`) The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData  string `pulumi:"policyData"`
	ServiceName string `pulumi:"serviceName"`
}

func LookupServiceIamPolicyOutput(ctx *pulumi.Context, args LookupServiceIamPolicyOutputArgs, opts ...pulumi.InvokeOption) LookupServiceIamPolicyResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupServiceIamPolicyResult, error) {
			args := v.(LookupServiceIamPolicyArgs)
			r, err := LookupServiceIamPolicy(ctx, &args, opts...)
			var s LookupServiceIamPolicyResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupServiceIamPolicyResultOutput)
}

// A collection of arguments for invoking getServiceIamPolicy.
type LookupServiceIamPolicyOutputArgs struct {
	ServiceName pulumi.StringInput `pulumi:"serviceName"`
}

func (LookupServiceIamPolicyOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupServiceIamPolicyArgs)(nil)).Elem()
}

// A collection of values returned by getServiceIamPolicy.
type LookupServiceIamPolicyResultOutput struct{ *pulumi.OutputState }

func (LookupServiceIamPolicyResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupServiceIamPolicyResult)(nil)).Elem()
}

func (o LookupServiceIamPolicyResultOutput) ToLookupServiceIamPolicyResultOutput() LookupServiceIamPolicyResultOutput {
	return o
}

func (o LookupServiceIamPolicyResultOutput) ToLookupServiceIamPolicyResultOutputWithContext(ctx context.Context) LookupServiceIamPolicyResultOutput {
	return o
}

// (Computed) The etag of the IAM policy.
func (o LookupServiceIamPolicyResultOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceIamPolicyResult) string { return v.Etag }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupServiceIamPolicyResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceIamPolicyResult) string { return v.Id }).(pulumi.StringOutput)
}

// (Required only by `endpoints.ServiceIamPolicy`) The policy data generated by
// a `organizations.getIAMPolicy` data source.
func (o LookupServiceIamPolicyResultOutput) PolicyData() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceIamPolicyResult) string { return v.PolicyData }).(pulumi.StringOutput)
}

func (o LookupServiceIamPolicyResultOutput) ServiceName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceIamPolicyResult) string { return v.ServiceName }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupServiceIamPolicyResultOutput{})
}