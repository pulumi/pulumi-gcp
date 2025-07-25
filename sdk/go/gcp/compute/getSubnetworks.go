// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package compute

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Get subnetworks within GCE.
// See [the official documentation](https://cloud.google.com/vpc/docs/subnets)
// and [API](https://cloud.google.com/compute/docs/reference/rest/v1/subnetworks/list).
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
//			_, err := compute.GetSubnetworks(ctx, &compute.GetSubnetworksArgs{
//				Filter:  pulumi.StringRef("ipCidrRange eq 192.168.178.0/24"),
//				Project: pulumi.StringRef("my-project"),
//				Region:  pulumi.StringRef("us-east1"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetSubnetworks(ctx *pulumi.Context, args *GetSubnetworksArgs, opts ...pulumi.InvokeOption) (*GetSubnetworksResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetSubnetworksResult
	err := ctx.Invoke("gcp:compute/getSubnetworks:getSubnetworks", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSubnetworks.
type GetSubnetworksArgs struct {
	// A string filter as defined in the [REST API](https://cloud.google.com/compute/docs/reference/rest/v1/subnetworks/list#query-parameters).
	Filter *string `pulumi:"filter"`
	// The ID of the project in which the resource belongs. If it
	// is not provided, the provider project is used.
	Project *string `pulumi:"project"`
	// The region this subnetwork has been created in. If
	// unspecified, this defaults to the region configured in the provider.
	Region *string `pulumi:"region"`
}

// A collection of values returned by getSubnetworks.
type GetSubnetworksResult struct {
	Filter *string `pulumi:"filter"`
	// The provider-assigned unique ID for this managed resource.
	Id      string  `pulumi:"id"`
	Project *string `pulumi:"project"`
	Region  *string `pulumi:"region"`
	// A list of all retrieved GCE subnetworks. Structure is defined below.
	Subnetworks []GetSubnetworksSubnetwork `pulumi:"subnetworks"`
}

func GetSubnetworksOutput(ctx *pulumi.Context, args GetSubnetworksOutputArgs, opts ...pulumi.InvokeOption) GetSubnetworksResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetSubnetworksResultOutput, error) {
			args := v.(GetSubnetworksArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("gcp:compute/getSubnetworks:getSubnetworks", args, GetSubnetworksResultOutput{}, options).(GetSubnetworksResultOutput), nil
		}).(GetSubnetworksResultOutput)
}

// A collection of arguments for invoking getSubnetworks.
type GetSubnetworksOutputArgs struct {
	// A string filter as defined in the [REST API](https://cloud.google.com/compute/docs/reference/rest/v1/subnetworks/list#query-parameters).
	Filter pulumi.StringPtrInput `pulumi:"filter"`
	// The ID of the project in which the resource belongs. If it
	// is not provided, the provider project is used.
	Project pulumi.StringPtrInput `pulumi:"project"`
	// The region this subnetwork has been created in. If
	// unspecified, this defaults to the region configured in the provider.
	Region pulumi.StringPtrInput `pulumi:"region"`
}

func (GetSubnetworksOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSubnetworksArgs)(nil)).Elem()
}

// A collection of values returned by getSubnetworks.
type GetSubnetworksResultOutput struct{ *pulumi.OutputState }

func (GetSubnetworksResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSubnetworksResult)(nil)).Elem()
}

func (o GetSubnetworksResultOutput) ToGetSubnetworksResultOutput() GetSubnetworksResultOutput {
	return o
}

func (o GetSubnetworksResultOutput) ToGetSubnetworksResultOutputWithContext(ctx context.Context) GetSubnetworksResultOutput {
	return o
}

func (o GetSubnetworksResultOutput) Filter() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSubnetworksResult) *string { return v.Filter }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetSubnetworksResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetSubnetworksResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetSubnetworksResultOutput) Project() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSubnetworksResult) *string { return v.Project }).(pulumi.StringPtrOutput)
}

func (o GetSubnetworksResultOutput) Region() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSubnetworksResult) *string { return v.Region }).(pulumi.StringPtrOutput)
}

// A list of all retrieved GCE subnetworks. Structure is defined below.
func (o GetSubnetworksResultOutput) Subnetworks() GetSubnetworksSubnetworkArrayOutput {
	return o.ApplyT(func(v GetSubnetworksResult) []GetSubnetworksSubnetwork { return v.Subnetworks }).(GetSubnetworksSubnetworkArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetSubnetworksResultOutput{})
}
