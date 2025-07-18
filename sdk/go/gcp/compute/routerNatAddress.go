// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package compute

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// A resource used to set the list of IP addresses to be used in a NAT service and manage the draining of destroyed IPs.
//
// > **Note:** This resource is to be used alongside a `compute.RouterNat` resource,
// the router nat resource must have no defined `natIps` or `drainNatIps` parameters,
// instead using the `initialNatIps` parameter to set at least one IP for the creation of the resource.
//
// To get more information about RouterNatAddress, see:
//
// * [API documentation](https://cloud.google.com/compute/docs/reference/rest/v1/routers)
// * How-to Guides
//   - [Google Cloud Router](https://cloud.google.com/router/docs/)
//
// ## Example Usage
//
// ## Import
//
// RouterNatAddress can be imported using any of these accepted formats:
//
// * `projects/{{project}}/regions/{{region}}/routers/{{router}}/{{router_nat}}`
//
// * `{{project}}/{{region}}/{{router}}/{{router_nat}}`
//
// * `{{region}}/{{router}}/{{router_nat}}`
//
// * `{{router}}/{{router_nat}}`
//
// When using the `pulumi import` command, RouterNatAddress can be imported using one of the formats above. For example:
//
// ```sh
// $ pulumi import gcp:compute/routerNatAddress:RouterNatAddress default projects/{{project}}/regions/{{region}}/routers/{{router}}/{{router_nat}}
// ```
//
// ```sh
// $ pulumi import gcp:compute/routerNatAddress:RouterNatAddress default {{project}}/{{region}}/{{router}}/{{router_nat}}
// ```
//
// ```sh
// $ pulumi import gcp:compute/routerNatAddress:RouterNatAddress default {{region}}/{{router}}/{{router_nat}}
// ```
//
// ```sh
// $ pulumi import gcp:compute/routerNatAddress:RouterNatAddress default {{router}}/{{router_nat}}
// ```
type RouterNatAddress struct {
	pulumi.CustomResourceState

	// A list of URLs of the IP resources to be drained. These IPs must be
	// valid static external IPs that have been assigned to the NAT.
	DrainNatIps pulumi.StringArrayOutput `pulumi:"drainNatIps"`
	// Self-links of NAT IPs to be used in a Nat service. Only valid if the referenced RouterNat
	// natIpAllocateOption is set to MANUAL_ONLY.
	NatIps pulumi.StringArrayOutput `pulumi:"natIps"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringOutput `pulumi:"project"`
	// Region where the NAT service reside.
	Region pulumi.StringOutput `pulumi:"region"`
	// The name of the Cloud Router in which the referenced NAT service is configured.
	Router pulumi.StringOutput `pulumi:"router"`
	// The name of the Nat service in which this address will be configured.
	RouterNat pulumi.StringOutput `pulumi:"routerNat"`
}

// NewRouterNatAddress registers a new resource with the given unique name, arguments, and options.
func NewRouterNatAddress(ctx *pulumi.Context,
	name string, args *RouterNatAddressArgs, opts ...pulumi.ResourceOption) (*RouterNatAddress, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.NatIps == nil {
		return nil, errors.New("invalid value for required argument 'NatIps'")
	}
	if args.Router == nil {
		return nil, errors.New("invalid value for required argument 'Router'")
	}
	if args.RouterNat == nil {
		return nil, errors.New("invalid value for required argument 'RouterNat'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource RouterNatAddress
	err := ctx.RegisterResource("gcp:compute/routerNatAddress:RouterNatAddress", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRouterNatAddress gets an existing RouterNatAddress resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRouterNatAddress(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RouterNatAddressState, opts ...pulumi.ResourceOption) (*RouterNatAddress, error) {
	var resource RouterNatAddress
	err := ctx.ReadResource("gcp:compute/routerNatAddress:RouterNatAddress", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering RouterNatAddress resources.
type routerNatAddressState struct {
	// A list of URLs of the IP resources to be drained. These IPs must be
	// valid static external IPs that have been assigned to the NAT.
	DrainNatIps []string `pulumi:"drainNatIps"`
	// Self-links of NAT IPs to be used in a Nat service. Only valid if the referenced RouterNat
	// natIpAllocateOption is set to MANUAL_ONLY.
	NatIps []string `pulumi:"natIps"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
	// Region where the NAT service reside.
	Region *string `pulumi:"region"`
	// The name of the Cloud Router in which the referenced NAT service is configured.
	Router *string `pulumi:"router"`
	// The name of the Nat service in which this address will be configured.
	RouterNat *string `pulumi:"routerNat"`
}

type RouterNatAddressState struct {
	// A list of URLs of the IP resources to be drained. These IPs must be
	// valid static external IPs that have been assigned to the NAT.
	DrainNatIps pulumi.StringArrayInput
	// Self-links of NAT IPs to be used in a Nat service. Only valid if the referenced RouterNat
	// natIpAllocateOption is set to MANUAL_ONLY.
	NatIps pulumi.StringArrayInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
	// Region where the NAT service reside.
	Region pulumi.StringPtrInput
	// The name of the Cloud Router in which the referenced NAT service is configured.
	Router pulumi.StringPtrInput
	// The name of the Nat service in which this address will be configured.
	RouterNat pulumi.StringPtrInput
}

func (RouterNatAddressState) ElementType() reflect.Type {
	return reflect.TypeOf((*routerNatAddressState)(nil)).Elem()
}

type routerNatAddressArgs struct {
	// A list of URLs of the IP resources to be drained. These IPs must be
	// valid static external IPs that have been assigned to the NAT.
	DrainNatIps []string `pulumi:"drainNatIps"`
	// Self-links of NAT IPs to be used in a Nat service. Only valid if the referenced RouterNat
	// natIpAllocateOption is set to MANUAL_ONLY.
	NatIps []string `pulumi:"natIps"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
	// Region where the NAT service reside.
	Region *string `pulumi:"region"`
	// The name of the Cloud Router in which the referenced NAT service is configured.
	Router string `pulumi:"router"`
	// The name of the Nat service in which this address will be configured.
	RouterNat string `pulumi:"routerNat"`
}

// The set of arguments for constructing a RouterNatAddress resource.
type RouterNatAddressArgs struct {
	// A list of URLs of the IP resources to be drained. These IPs must be
	// valid static external IPs that have been assigned to the NAT.
	DrainNatIps pulumi.StringArrayInput
	// Self-links of NAT IPs to be used in a Nat service. Only valid if the referenced RouterNat
	// natIpAllocateOption is set to MANUAL_ONLY.
	NatIps pulumi.StringArrayInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
	// Region where the NAT service reside.
	Region pulumi.StringPtrInput
	// The name of the Cloud Router in which the referenced NAT service is configured.
	Router pulumi.StringInput
	// The name of the Nat service in which this address will be configured.
	RouterNat pulumi.StringInput
}

func (RouterNatAddressArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*routerNatAddressArgs)(nil)).Elem()
}

type RouterNatAddressInput interface {
	pulumi.Input

	ToRouterNatAddressOutput() RouterNatAddressOutput
	ToRouterNatAddressOutputWithContext(ctx context.Context) RouterNatAddressOutput
}

func (*RouterNatAddress) ElementType() reflect.Type {
	return reflect.TypeOf((**RouterNatAddress)(nil)).Elem()
}

func (i *RouterNatAddress) ToRouterNatAddressOutput() RouterNatAddressOutput {
	return i.ToRouterNatAddressOutputWithContext(context.Background())
}

func (i *RouterNatAddress) ToRouterNatAddressOutputWithContext(ctx context.Context) RouterNatAddressOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RouterNatAddressOutput)
}

// RouterNatAddressArrayInput is an input type that accepts RouterNatAddressArray and RouterNatAddressArrayOutput values.
// You can construct a concrete instance of `RouterNatAddressArrayInput` via:
//
//	RouterNatAddressArray{ RouterNatAddressArgs{...} }
type RouterNatAddressArrayInput interface {
	pulumi.Input

	ToRouterNatAddressArrayOutput() RouterNatAddressArrayOutput
	ToRouterNatAddressArrayOutputWithContext(context.Context) RouterNatAddressArrayOutput
}

type RouterNatAddressArray []RouterNatAddressInput

func (RouterNatAddressArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RouterNatAddress)(nil)).Elem()
}

func (i RouterNatAddressArray) ToRouterNatAddressArrayOutput() RouterNatAddressArrayOutput {
	return i.ToRouterNatAddressArrayOutputWithContext(context.Background())
}

func (i RouterNatAddressArray) ToRouterNatAddressArrayOutputWithContext(ctx context.Context) RouterNatAddressArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RouterNatAddressArrayOutput)
}

// RouterNatAddressMapInput is an input type that accepts RouterNatAddressMap and RouterNatAddressMapOutput values.
// You can construct a concrete instance of `RouterNatAddressMapInput` via:
//
//	RouterNatAddressMap{ "key": RouterNatAddressArgs{...} }
type RouterNatAddressMapInput interface {
	pulumi.Input

	ToRouterNatAddressMapOutput() RouterNatAddressMapOutput
	ToRouterNatAddressMapOutputWithContext(context.Context) RouterNatAddressMapOutput
}

type RouterNatAddressMap map[string]RouterNatAddressInput

func (RouterNatAddressMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RouterNatAddress)(nil)).Elem()
}

func (i RouterNatAddressMap) ToRouterNatAddressMapOutput() RouterNatAddressMapOutput {
	return i.ToRouterNatAddressMapOutputWithContext(context.Background())
}

func (i RouterNatAddressMap) ToRouterNatAddressMapOutputWithContext(ctx context.Context) RouterNatAddressMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RouterNatAddressMapOutput)
}

type RouterNatAddressOutput struct{ *pulumi.OutputState }

func (RouterNatAddressOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**RouterNatAddress)(nil)).Elem()
}

func (o RouterNatAddressOutput) ToRouterNatAddressOutput() RouterNatAddressOutput {
	return o
}

func (o RouterNatAddressOutput) ToRouterNatAddressOutputWithContext(ctx context.Context) RouterNatAddressOutput {
	return o
}

// A list of URLs of the IP resources to be drained. These IPs must be
// valid static external IPs that have been assigned to the NAT.
func (o RouterNatAddressOutput) DrainNatIps() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *RouterNatAddress) pulumi.StringArrayOutput { return v.DrainNatIps }).(pulumi.StringArrayOutput)
}

// Self-links of NAT IPs to be used in a Nat service. Only valid if the referenced RouterNat
// natIpAllocateOption is set to MANUAL_ONLY.
func (o RouterNatAddressOutput) NatIps() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *RouterNatAddress) pulumi.StringArrayOutput { return v.NatIps }).(pulumi.StringArrayOutput)
}

// The ID of the project in which the resource belongs.
// If it is not provided, the provider project is used.
func (o RouterNatAddressOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *RouterNatAddress) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// Region where the NAT service reside.
func (o RouterNatAddressOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v *RouterNatAddress) pulumi.StringOutput { return v.Region }).(pulumi.StringOutput)
}

// The name of the Cloud Router in which the referenced NAT service is configured.
func (o RouterNatAddressOutput) Router() pulumi.StringOutput {
	return o.ApplyT(func(v *RouterNatAddress) pulumi.StringOutput { return v.Router }).(pulumi.StringOutput)
}

// The name of the Nat service in which this address will be configured.
func (o RouterNatAddressOutput) RouterNat() pulumi.StringOutput {
	return o.ApplyT(func(v *RouterNatAddress) pulumi.StringOutput { return v.RouterNat }).(pulumi.StringOutput)
}

type RouterNatAddressArrayOutput struct{ *pulumi.OutputState }

func (RouterNatAddressArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RouterNatAddress)(nil)).Elem()
}

func (o RouterNatAddressArrayOutput) ToRouterNatAddressArrayOutput() RouterNatAddressArrayOutput {
	return o
}

func (o RouterNatAddressArrayOutput) ToRouterNatAddressArrayOutputWithContext(ctx context.Context) RouterNatAddressArrayOutput {
	return o
}

func (o RouterNatAddressArrayOutput) Index(i pulumi.IntInput) RouterNatAddressOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *RouterNatAddress {
		return vs[0].([]*RouterNatAddress)[vs[1].(int)]
	}).(RouterNatAddressOutput)
}

type RouterNatAddressMapOutput struct{ *pulumi.OutputState }

func (RouterNatAddressMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RouterNatAddress)(nil)).Elem()
}

func (o RouterNatAddressMapOutput) ToRouterNatAddressMapOutput() RouterNatAddressMapOutput {
	return o
}

func (o RouterNatAddressMapOutput) ToRouterNatAddressMapOutputWithContext(ctx context.Context) RouterNatAddressMapOutput {
	return o
}

func (o RouterNatAddressMapOutput) MapIndex(k pulumi.StringInput) RouterNatAddressOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *RouterNatAddress {
		return vs[0].(map[string]*RouterNatAddress)[vs[1].(string)]
	}).(RouterNatAddressOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RouterNatAddressInput)(nil)).Elem(), &RouterNatAddress{})
	pulumi.RegisterInputType(reflect.TypeOf((*RouterNatAddressArrayInput)(nil)).Elem(), RouterNatAddressArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RouterNatAddressMapInput)(nil)).Elem(), RouterNatAddressMap{})
	pulumi.RegisterOutputType(RouterNatAddressOutput{})
	pulumi.RegisterOutputType(RouterNatAddressArrayOutput{})
	pulumi.RegisterOutputType(RouterNatAddressMapOutput{})
}
