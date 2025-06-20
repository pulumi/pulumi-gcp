// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package compute

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Retrieves the current IAM policy data for disk
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/compute"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := compute.LookupDiskIamPolicy(ctx, &compute.LookupDiskIamPolicyArgs{
//				Project: pulumi.StringRef(_default.Project),
//				Zone:    pulumi.StringRef(_default.Zone),
//				Name:    _default.Name,
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupDiskIamPolicy(ctx *pulumi.Context, args *LookupDiskIamPolicyArgs, opts ...pulumi.InvokeOption) (*LookupDiskIamPolicyResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupDiskIamPolicyResult
	err := ctx.Invoke("gcp:compute/getDiskIamPolicy:getDiskIamPolicy", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDiskIamPolicy.
type LookupDiskIamPolicyArgs struct {
	// Used to find the parent resource to bind the IAM policy to
	Name string `pulumi:"name"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project *string `pulumi:"project"`
	// A reference to the zone where the disk resides. Used to find the parent resource to bind the IAM policy to. If not specified,
	// the value will be parsed from the identifier of the parent resource. If no zone is provided in the parent identifier and no
	// zone is specified, it is taken from the provider configuration.
	Zone *string `pulumi:"zone"`
}

// A collection of values returned by getDiskIamPolicy.
type LookupDiskIamPolicyResult struct {
	// (Computed) The etag of the IAM policy.
	Etag string `pulumi:"etag"`
	// The provider-assigned unique ID for this managed resource.
	Id   string `pulumi:"id"`
	Name string `pulumi:"name"`
	// (Required only by `compute.DiskIamPolicy`) The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData string `pulumi:"policyData"`
	Project    string `pulumi:"project"`
	Zone       string `pulumi:"zone"`
}

func LookupDiskIamPolicyOutput(ctx *pulumi.Context, args LookupDiskIamPolicyOutputArgs, opts ...pulumi.InvokeOption) LookupDiskIamPolicyResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupDiskIamPolicyResultOutput, error) {
			args := v.(LookupDiskIamPolicyArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("gcp:compute/getDiskIamPolicy:getDiskIamPolicy", args, LookupDiskIamPolicyResultOutput{}, options).(LookupDiskIamPolicyResultOutput), nil
		}).(LookupDiskIamPolicyResultOutput)
}

// A collection of arguments for invoking getDiskIamPolicy.
type LookupDiskIamPolicyOutputArgs struct {
	// Used to find the parent resource to bind the IAM policy to
	Name pulumi.StringInput `pulumi:"name"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringPtrInput `pulumi:"project"`
	// A reference to the zone where the disk resides. Used to find the parent resource to bind the IAM policy to. If not specified,
	// the value will be parsed from the identifier of the parent resource. If no zone is provided in the parent identifier and no
	// zone is specified, it is taken from the provider configuration.
	Zone pulumi.StringPtrInput `pulumi:"zone"`
}

func (LookupDiskIamPolicyOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDiskIamPolicyArgs)(nil)).Elem()
}

// A collection of values returned by getDiskIamPolicy.
type LookupDiskIamPolicyResultOutput struct{ *pulumi.OutputState }

func (LookupDiskIamPolicyResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDiskIamPolicyResult)(nil)).Elem()
}

func (o LookupDiskIamPolicyResultOutput) ToLookupDiskIamPolicyResultOutput() LookupDiskIamPolicyResultOutput {
	return o
}

func (o LookupDiskIamPolicyResultOutput) ToLookupDiskIamPolicyResultOutputWithContext(ctx context.Context) LookupDiskIamPolicyResultOutput {
	return o
}

// (Computed) The etag of the IAM policy.
func (o LookupDiskIamPolicyResultOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDiskIamPolicyResult) string { return v.Etag }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupDiskIamPolicyResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDiskIamPolicyResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupDiskIamPolicyResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDiskIamPolicyResult) string { return v.Name }).(pulumi.StringOutput)
}

// (Required only by `compute.DiskIamPolicy`) The policy data generated by
// a `organizations.getIAMPolicy` data source.
func (o LookupDiskIamPolicyResultOutput) PolicyData() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDiskIamPolicyResult) string { return v.PolicyData }).(pulumi.StringOutput)
}

func (o LookupDiskIamPolicyResultOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDiskIamPolicyResult) string { return v.Project }).(pulumi.StringOutput)
}

func (o LookupDiskIamPolicyResultOutput) Zone() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDiskIamPolicyResult) string { return v.Zone }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupDiskIamPolicyResultOutput{})
}
