// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package compute

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Retrieves the current IAM policy data for snapshot
//
// ## example
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/compute"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := compute.LookupSnapshotIamPolicy(ctx, &compute.LookupSnapshotIamPolicyArgs{
//				Project: pulumi.StringRef(google_compute_snapshot.Snapshot.Project),
//				Name:    google_compute_snapshot.Snapshot.Name,
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupSnapshotIamPolicy(ctx *pulumi.Context, args *LookupSnapshotIamPolicyArgs, opts ...pulumi.InvokeOption) (*LookupSnapshotIamPolicyResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupSnapshotIamPolicyResult
	err := ctx.Invoke("gcp:compute/getSnapshotIamPolicy:getSnapshotIamPolicy", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSnapshotIamPolicy.
type LookupSnapshotIamPolicyArgs struct {
	// Used to find the parent resource to bind the IAM policy to
	Name string `pulumi:"name"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project *string `pulumi:"project"`
}

// A collection of values returned by getSnapshotIamPolicy.
type LookupSnapshotIamPolicyResult struct {
	// (Computed) The etag of the IAM policy.
	Etag string `pulumi:"etag"`
	// The provider-assigned unique ID for this managed resource.
	Id   string `pulumi:"id"`
	Name string `pulumi:"name"`
	// (Required only by `compute.SnapshotIamPolicy`) The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData string `pulumi:"policyData"`
	Project    string `pulumi:"project"`
}

func LookupSnapshotIamPolicyOutput(ctx *pulumi.Context, args LookupSnapshotIamPolicyOutputArgs, opts ...pulumi.InvokeOption) LookupSnapshotIamPolicyResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupSnapshotIamPolicyResult, error) {
			args := v.(LookupSnapshotIamPolicyArgs)
			r, err := LookupSnapshotIamPolicy(ctx, &args, opts...)
			var s LookupSnapshotIamPolicyResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupSnapshotIamPolicyResultOutput)
}

// A collection of arguments for invoking getSnapshotIamPolicy.
type LookupSnapshotIamPolicyOutputArgs struct {
	// Used to find the parent resource to bind the IAM policy to
	Name pulumi.StringInput `pulumi:"name"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringPtrInput `pulumi:"project"`
}

func (LookupSnapshotIamPolicyOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSnapshotIamPolicyArgs)(nil)).Elem()
}

// A collection of values returned by getSnapshotIamPolicy.
type LookupSnapshotIamPolicyResultOutput struct{ *pulumi.OutputState }

func (LookupSnapshotIamPolicyResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSnapshotIamPolicyResult)(nil)).Elem()
}

func (o LookupSnapshotIamPolicyResultOutput) ToLookupSnapshotIamPolicyResultOutput() LookupSnapshotIamPolicyResultOutput {
	return o
}

func (o LookupSnapshotIamPolicyResultOutput) ToLookupSnapshotIamPolicyResultOutputWithContext(ctx context.Context) LookupSnapshotIamPolicyResultOutput {
	return o
}

// (Computed) The etag of the IAM policy.
func (o LookupSnapshotIamPolicyResultOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSnapshotIamPolicyResult) string { return v.Etag }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupSnapshotIamPolicyResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSnapshotIamPolicyResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupSnapshotIamPolicyResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSnapshotIamPolicyResult) string { return v.Name }).(pulumi.StringOutput)
}

// (Required only by `compute.SnapshotIamPolicy`) The policy data generated by
// a `organizations.getIAMPolicy` data source.
func (o LookupSnapshotIamPolicyResultOutput) PolicyData() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSnapshotIamPolicyResult) string { return v.PolicyData }).(pulumi.StringOutput)
}

func (o LookupSnapshotIamPolicyResultOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSnapshotIamPolicyResult) string { return v.Project }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupSnapshotIamPolicyResultOutput{})
}