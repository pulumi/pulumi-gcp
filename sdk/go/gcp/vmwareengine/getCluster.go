// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package vmwareengine

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/vmwareengine"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := vmwareengine.LookupCluster(ctx, &vmwareengine.LookupClusterArgs{
//				Name:   "my-cluster",
//				Parent: "project/locations/us-west1-a/privateClouds/my-cloud",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupCluster(ctx *pulumi.Context, args *LookupClusterArgs, opts ...pulumi.InvokeOption) (*LookupClusterResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupClusterResult
	err := ctx.Invoke("gcp:vmwareengine/getCluster:getCluster", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getCluster.
type LookupClusterArgs struct {
	// Name of the resource.
	Name string `pulumi:"name"`
	// The resource name of the private cloud that this cluster belongs.
	Parent string `pulumi:"parent"`
}

// A collection of values returned by getCluster.
type LookupClusterResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id              string                     `pulumi:"id"`
	Management      bool                       `pulumi:"management"`
	Name            string                     `pulumi:"name"`
	NodeTypeConfigs []GetClusterNodeTypeConfig `pulumi:"nodeTypeConfigs"`
	Parent          string                     `pulumi:"parent"`
	State           string                     `pulumi:"state"`
	Uid             string                     `pulumi:"uid"`
}

func LookupClusterOutput(ctx *pulumi.Context, args LookupClusterOutputArgs, opts ...pulumi.InvokeOption) LookupClusterResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupClusterResult, error) {
			args := v.(LookupClusterArgs)
			r, err := LookupCluster(ctx, &args, opts...)
			var s LookupClusterResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupClusterResultOutput)
}

// A collection of arguments for invoking getCluster.
type LookupClusterOutputArgs struct {
	// Name of the resource.
	Name pulumi.StringInput `pulumi:"name"`
	// The resource name of the private cloud that this cluster belongs.
	Parent pulumi.StringInput `pulumi:"parent"`
}

func (LookupClusterOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupClusterArgs)(nil)).Elem()
}

// A collection of values returned by getCluster.
type LookupClusterResultOutput struct{ *pulumi.OutputState }

func (LookupClusterResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupClusterResult)(nil)).Elem()
}

func (o LookupClusterResultOutput) ToLookupClusterResultOutput() LookupClusterResultOutput {
	return o
}

func (o LookupClusterResultOutput) ToLookupClusterResultOutputWithContext(ctx context.Context) LookupClusterResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupClusterResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupClusterResultOutput) Management() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupClusterResult) bool { return v.Management }).(pulumi.BoolOutput)
}

func (o LookupClusterResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupClusterResultOutput) NodeTypeConfigs() GetClusterNodeTypeConfigArrayOutput {
	return o.ApplyT(func(v LookupClusterResult) []GetClusterNodeTypeConfig { return v.NodeTypeConfigs }).(GetClusterNodeTypeConfigArrayOutput)
}

func (o LookupClusterResultOutput) Parent() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterResult) string { return v.Parent }).(pulumi.StringOutput)
}

func (o LookupClusterResultOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterResult) string { return v.State }).(pulumi.StringOutput)
}

func (o LookupClusterResultOutput) Uid() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterResult) string { return v.Uid }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupClusterResultOutput{})
}