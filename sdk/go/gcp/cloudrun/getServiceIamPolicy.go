// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudrun

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
//	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/cloudrun"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := cloudrun.GetServiceIamPolicy(ctx, &cloudrun.GetServiceIamPolicyArgs{
//				Location: pulumi.StringRef(google_cloud_run_service.Default.Location),
//				Project:  pulumi.StringRef(google_cloud_run_service.Default.Project),
//				Service:  google_cloud_run_service.Default.Name,
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetServiceIamPolicy(ctx *pulumi.Context, args *GetServiceIamPolicyArgs, opts ...pulumi.InvokeOption) (*GetServiceIamPolicyResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetServiceIamPolicyResult
	err := ctx.Invoke("gcp:cloudrun/getServiceIamPolicy:getServiceIamPolicy", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getServiceIamPolicy.
type GetServiceIamPolicyArgs struct {
	// The location of the cloud run instance. eg us-central1 Used to find the parent resource to bind the IAM policy to
	Location *string `pulumi:"location"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project *string `pulumi:"project"`
	// Used to find the parent resource to bind the IAM policy to
	Service string `pulumi:"service"`
}

// A collection of values returned by getServiceIamPolicy.
type GetServiceIamPolicyResult struct {
	// (Computed) The etag of the IAM policy.
	Etag string `pulumi:"etag"`
	// The provider-assigned unique ID for this managed resource.
	Id       string `pulumi:"id"`
	Location string `pulumi:"location"`
	// (Required only by `cloudrun.IamPolicy`) The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData string `pulumi:"policyData"`
	Project    string `pulumi:"project"`
	Service    string `pulumi:"service"`
}

func GetServiceIamPolicyOutput(ctx *pulumi.Context, args GetServiceIamPolicyOutputArgs, opts ...pulumi.InvokeOption) GetServiceIamPolicyResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetServiceIamPolicyResult, error) {
			args := v.(GetServiceIamPolicyArgs)
			r, err := GetServiceIamPolicy(ctx, &args, opts...)
			var s GetServiceIamPolicyResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetServiceIamPolicyResultOutput)
}

// A collection of arguments for invoking getServiceIamPolicy.
type GetServiceIamPolicyOutputArgs struct {
	// The location of the cloud run instance. eg us-central1 Used to find the parent resource to bind the IAM policy to
	Location pulumi.StringPtrInput `pulumi:"location"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringPtrInput `pulumi:"project"`
	// Used to find the parent resource to bind the IAM policy to
	Service pulumi.StringInput `pulumi:"service"`
}

func (GetServiceIamPolicyOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetServiceIamPolicyArgs)(nil)).Elem()
}

// A collection of values returned by getServiceIamPolicy.
type GetServiceIamPolicyResultOutput struct{ *pulumi.OutputState }

func (GetServiceIamPolicyResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetServiceIamPolicyResult)(nil)).Elem()
}

func (o GetServiceIamPolicyResultOutput) ToGetServiceIamPolicyResultOutput() GetServiceIamPolicyResultOutput {
	return o
}

func (o GetServiceIamPolicyResultOutput) ToGetServiceIamPolicyResultOutputWithContext(ctx context.Context) GetServiceIamPolicyResultOutput {
	return o
}

// (Computed) The etag of the IAM policy.
func (o GetServiceIamPolicyResultOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v GetServiceIamPolicyResult) string { return v.Etag }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetServiceIamPolicyResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetServiceIamPolicyResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetServiceIamPolicyResultOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v GetServiceIamPolicyResult) string { return v.Location }).(pulumi.StringOutput)
}

// (Required only by `cloudrun.IamPolicy`) The policy data generated by
// a `organizations.getIAMPolicy` data source.
func (o GetServiceIamPolicyResultOutput) PolicyData() pulumi.StringOutput {
	return o.ApplyT(func(v GetServiceIamPolicyResult) string { return v.PolicyData }).(pulumi.StringOutput)
}

func (o GetServiceIamPolicyResultOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v GetServiceIamPolicyResult) string { return v.Project }).(pulumi.StringOutput)
}

func (o GetServiceIamPolicyResultOutput) Service() pulumi.StringOutput {
	return o.ApplyT(func(v GetServiceIamPolicyResult) string { return v.Service }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetServiceIamPolicyResultOutput{})
}