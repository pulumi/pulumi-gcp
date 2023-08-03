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
//			_, err := vmwareengine.LookupNetwork(ctx, &vmwareengine.LookupNetworkArgs{
//				Name:     "us-central1-default",
//				Location: "us-central1",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupNetwork(ctx *pulumi.Context, args *LookupNetworkArgs, opts ...pulumi.InvokeOption) (*LookupNetworkResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupNetworkResult
	err := ctx.Invoke("gcp:vmwareengine/getNetwork:getNetwork", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getNetwork.
type LookupNetworkArgs struct {
	// Location of the resource.
	//
	// ***
	Location string `pulumi:"location"`
	// Name of the resource.
	Name string `pulumi:"name"`
	// The ID of the project in which the resource belongs. If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
}

// A collection of values returned by getNetwork.
type LookupNetworkResult struct {
	Description string `pulumi:"description"`
	// The provider-assigned unique ID for this managed resource.
	Id          string                 `pulumi:"id"`
	Location    string                 `pulumi:"location"`
	Name        string                 `pulumi:"name"`
	Project     *string                `pulumi:"project"`
	State       string                 `pulumi:"state"`
	Type        string                 `pulumi:"type"`
	Uid         string                 `pulumi:"uid"`
	VpcNetworks []GetNetworkVpcNetwork `pulumi:"vpcNetworks"`
}

func LookupNetworkOutput(ctx *pulumi.Context, args LookupNetworkOutputArgs, opts ...pulumi.InvokeOption) LookupNetworkResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupNetworkResult, error) {
			args := v.(LookupNetworkArgs)
			r, err := LookupNetwork(ctx, &args, opts...)
			var s LookupNetworkResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupNetworkResultOutput)
}

// A collection of arguments for invoking getNetwork.
type LookupNetworkOutputArgs struct {
	// Location of the resource.
	//
	// ***
	Location pulumi.StringInput `pulumi:"location"`
	// Name of the resource.
	Name pulumi.StringInput `pulumi:"name"`
	// The ID of the project in which the resource belongs. If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput `pulumi:"project"`
}

func (LookupNetworkOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupNetworkArgs)(nil)).Elem()
}

// A collection of values returned by getNetwork.
type LookupNetworkResultOutput struct{ *pulumi.OutputState }

func (LookupNetworkResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupNetworkResult)(nil)).Elem()
}

func (o LookupNetworkResultOutput) ToLookupNetworkResultOutput() LookupNetworkResultOutput {
	return o
}

func (o LookupNetworkResultOutput) ToLookupNetworkResultOutputWithContext(ctx context.Context) LookupNetworkResultOutput {
	return o
}

func (o LookupNetworkResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkResult) string { return v.Description }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupNetworkResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupNetworkResultOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkResult) string { return v.Location }).(pulumi.StringOutput)
}

func (o LookupNetworkResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupNetworkResultOutput) Project() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupNetworkResult) *string { return v.Project }).(pulumi.StringPtrOutput)
}

func (o LookupNetworkResultOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkResult) string { return v.State }).(pulumi.StringOutput)
}

func (o LookupNetworkResultOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkResult) string { return v.Type }).(pulumi.StringOutput)
}

func (o LookupNetworkResultOutput) Uid() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkResult) string { return v.Uid }).(pulumi.StringOutput)
}

func (o LookupNetworkResultOutput) VpcNetworks() GetNetworkVpcNetworkArrayOutput {
	return o.ApplyT(func(v LookupNetworkResult) []GetNetworkVpcNetwork { return v.VpcNetworks }).(GetNetworkVpcNetworkArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupNetworkResultOutput{})
}