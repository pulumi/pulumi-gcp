// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package compute

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Represents a Global Address resource. Global addresses are used for
// HTTP(S) load balancing.
//
// To get more information about GlobalAddress, see:
//
// * [API documentation](https://cloud.google.com/compute/docs/reference/v1/globalAddresses)
// * How-to Guides
//   - [Reserving a Static External IP Address](https://cloud.google.com/compute/docs/ip-addresses/reserve-static-external-ip-address)
//
// ## Example Usage
//
// ### Global Address Basic
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
//			_, err := compute.NewGlobalAddress(ctx, "default", &compute.GlobalAddressArgs{
//				Name: pulumi.String("global-appserver-ip"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Global Address Private Services Connect
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
//			network, err := compute.NewNetwork(ctx, "network", &compute.NetworkArgs{
//				Name:                  pulumi.String("my-network-name"),
//				AutoCreateSubnetworks: pulumi.Bool(false),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = compute.NewGlobalAddress(ctx, "default", &compute.GlobalAddressArgs{
//				Name:        pulumi.String("global-psconnect-ip"),
//				AddressType: pulumi.String("INTERNAL"),
//				Purpose:     pulumi.String("PRIVATE_SERVICE_CONNECT"),
//				Network:     network.ID(),
//				Address:     pulumi.String("100.100.100.105"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// GlobalAddress can be imported using any of these accepted formats:
//
// * `projects/{{project}}/global/addresses/{{name}}`
//
// * `{{project}}/{{name}}`
//
// * `{{name}}`
//
// When using the `pulumi import` command, GlobalAddress can be imported using one of the formats above. For example:
//
// ```sh
// $ pulumi import gcp:compute/globalAddress:GlobalAddress default projects/{{project}}/global/addresses/{{name}}
// ```
//
// ```sh
// $ pulumi import gcp:compute/globalAddress:GlobalAddress default {{project}}/{{name}}
// ```
//
// ```sh
// $ pulumi import gcp:compute/globalAddress:GlobalAddress default {{name}}
// ```
type GlobalAddress struct {
	pulumi.CustomResourceState

	// The IP address or beginning of the address range represented by this
	// resource. This can be supplied as an input to reserve a specific
	// address or omitted to allow GCP to choose a valid one for you.
	Address pulumi.StringOutput `pulumi:"address"`
	// The type of the address to reserve.
	// * EXTERNAL indicates public/external single IP address.
	// * INTERNAL indicates internal IP ranges belonging to some network.
	//   Default value is `EXTERNAL`.
	//   Possible values are: `EXTERNAL`, `INTERNAL`.
	AddressType pulumi.StringPtrOutput `pulumi:"addressType"`
	// Creation timestamp in RFC3339 text format.
	CreationTimestamp pulumi.StringOutput `pulumi:"creationTimestamp"`
	// An optional description of this resource.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
	EffectiveLabels pulumi.StringMapOutput `pulumi:"effectiveLabels"`
	// The IP Version that will be used by this address. The default value is `IPV4`.
	// Possible values are: `IPV4`, `IPV6`.
	IpVersion pulumi.StringPtrOutput `pulumi:"ipVersion"`
	// The fingerprint used for optimistic locking of this resource.  Used
	// internally during updates.
	LabelFingerprint pulumi.StringOutput `pulumi:"labelFingerprint"`
	// Labels to apply to this address.  A list of key->value pairs.
	//
	// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
	// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
	Labels pulumi.StringMapOutput `pulumi:"labels"`
	// Name of the resource. Provided by the client when the resource is
	// created. The name must be 1-63 characters long, and comply with
	// RFC1035.  Specifically, the name must be 1-63 characters long and
	// match the regular expression `a-z?` which means
	// the first character must be a lowercase letter, and all following
	// characters must be a dash, lowercase letter, or digit, except the last
	// character, which cannot be a dash.
	Name pulumi.StringOutput `pulumi:"name"`
	// The URL of the network in which to reserve the IP range. The IP range
	// must be in RFC1918 space. The network cannot be deleted if there are
	// any reserved IP ranges referring to it.
	// This should only be set when using an Internal address.
	Network pulumi.StringPtrOutput `pulumi:"network"`
	// The prefix length of the IP range. If not present, it means the
	// address field is a single IP address.
	// This field is not applicable to addresses with addressType=INTERNAL
	// when purpose=PRIVATE_SERVICE_CONNECT
	PrefixLength pulumi.IntOutput `pulumi:"prefixLength"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringOutput `pulumi:"project"`
	// The combination of labels configured directly on the resource
	// and default labels configured on the provider.
	PulumiLabels pulumi.StringMapOutput `pulumi:"pulumiLabels"`
	// The purpose of the resource. Possible values include:
	// * VPC_PEERING - for peer networks
	// * PRIVATE_SERVICE_CONNECT - for  Private Service Connect networks
	Purpose pulumi.StringPtrOutput `pulumi:"purpose"`
	// The URI of the created resource.
	SelfLink pulumi.StringOutput `pulumi:"selfLink"`
}

// NewGlobalAddress registers a new resource with the given unique name, arguments, and options.
func NewGlobalAddress(ctx *pulumi.Context,
	name string, args *GlobalAddressArgs, opts ...pulumi.ResourceOption) (*GlobalAddress, error) {
	if args == nil {
		args = &GlobalAddressArgs{}
	}

	secrets := pulumi.AdditionalSecretOutputs([]string{
		"effectiveLabels",
		"pulumiLabels",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource GlobalAddress
	err := ctx.RegisterResource("gcp:compute/globalAddress:GlobalAddress", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetGlobalAddress gets an existing GlobalAddress resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetGlobalAddress(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *GlobalAddressState, opts ...pulumi.ResourceOption) (*GlobalAddress, error) {
	var resource GlobalAddress
	err := ctx.ReadResource("gcp:compute/globalAddress:GlobalAddress", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering GlobalAddress resources.
type globalAddressState struct {
	// The IP address or beginning of the address range represented by this
	// resource. This can be supplied as an input to reserve a specific
	// address or omitted to allow GCP to choose a valid one for you.
	Address *string `pulumi:"address"`
	// The type of the address to reserve.
	// * EXTERNAL indicates public/external single IP address.
	// * INTERNAL indicates internal IP ranges belonging to some network.
	//   Default value is `EXTERNAL`.
	//   Possible values are: `EXTERNAL`, `INTERNAL`.
	AddressType *string `pulumi:"addressType"`
	// Creation timestamp in RFC3339 text format.
	CreationTimestamp *string `pulumi:"creationTimestamp"`
	// An optional description of this resource.
	Description *string `pulumi:"description"`
	// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
	EffectiveLabels map[string]string `pulumi:"effectiveLabels"`
	// The IP Version that will be used by this address. The default value is `IPV4`.
	// Possible values are: `IPV4`, `IPV6`.
	IpVersion *string `pulumi:"ipVersion"`
	// The fingerprint used for optimistic locking of this resource.  Used
	// internally during updates.
	LabelFingerprint *string `pulumi:"labelFingerprint"`
	// Labels to apply to this address.  A list of key->value pairs.
	//
	// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
	// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
	Labels map[string]string `pulumi:"labels"`
	// Name of the resource. Provided by the client when the resource is
	// created. The name must be 1-63 characters long, and comply with
	// RFC1035.  Specifically, the name must be 1-63 characters long and
	// match the regular expression `a-z?` which means
	// the first character must be a lowercase letter, and all following
	// characters must be a dash, lowercase letter, or digit, except the last
	// character, which cannot be a dash.
	Name *string `pulumi:"name"`
	// The URL of the network in which to reserve the IP range. The IP range
	// must be in RFC1918 space. The network cannot be deleted if there are
	// any reserved IP ranges referring to it.
	// This should only be set when using an Internal address.
	Network *string `pulumi:"network"`
	// The prefix length of the IP range. If not present, it means the
	// address field is a single IP address.
	// This field is not applicable to addresses with addressType=INTERNAL
	// when purpose=PRIVATE_SERVICE_CONNECT
	PrefixLength *int `pulumi:"prefixLength"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
	// The combination of labels configured directly on the resource
	// and default labels configured on the provider.
	PulumiLabels map[string]string `pulumi:"pulumiLabels"`
	// The purpose of the resource. Possible values include:
	// * VPC_PEERING - for peer networks
	// * PRIVATE_SERVICE_CONNECT - for  Private Service Connect networks
	Purpose *string `pulumi:"purpose"`
	// The URI of the created resource.
	SelfLink *string `pulumi:"selfLink"`
}

type GlobalAddressState struct {
	// The IP address or beginning of the address range represented by this
	// resource. This can be supplied as an input to reserve a specific
	// address or omitted to allow GCP to choose a valid one for you.
	Address pulumi.StringPtrInput
	// The type of the address to reserve.
	// * EXTERNAL indicates public/external single IP address.
	// * INTERNAL indicates internal IP ranges belonging to some network.
	//   Default value is `EXTERNAL`.
	//   Possible values are: `EXTERNAL`, `INTERNAL`.
	AddressType pulumi.StringPtrInput
	// Creation timestamp in RFC3339 text format.
	CreationTimestamp pulumi.StringPtrInput
	// An optional description of this resource.
	Description pulumi.StringPtrInput
	// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
	EffectiveLabels pulumi.StringMapInput
	// The IP Version that will be used by this address. The default value is `IPV4`.
	// Possible values are: `IPV4`, `IPV6`.
	IpVersion pulumi.StringPtrInput
	// The fingerprint used for optimistic locking of this resource.  Used
	// internally during updates.
	LabelFingerprint pulumi.StringPtrInput
	// Labels to apply to this address.  A list of key->value pairs.
	//
	// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
	// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
	Labels pulumi.StringMapInput
	// Name of the resource. Provided by the client when the resource is
	// created. The name must be 1-63 characters long, and comply with
	// RFC1035.  Specifically, the name must be 1-63 characters long and
	// match the regular expression `a-z?` which means
	// the first character must be a lowercase letter, and all following
	// characters must be a dash, lowercase letter, or digit, except the last
	// character, which cannot be a dash.
	Name pulumi.StringPtrInput
	// The URL of the network in which to reserve the IP range. The IP range
	// must be in RFC1918 space. The network cannot be deleted if there are
	// any reserved IP ranges referring to it.
	// This should only be set when using an Internal address.
	Network pulumi.StringPtrInput
	// The prefix length of the IP range. If not present, it means the
	// address field is a single IP address.
	// This field is not applicable to addresses with addressType=INTERNAL
	// when purpose=PRIVATE_SERVICE_CONNECT
	PrefixLength pulumi.IntPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
	// The combination of labels configured directly on the resource
	// and default labels configured on the provider.
	PulumiLabels pulumi.StringMapInput
	// The purpose of the resource. Possible values include:
	// * VPC_PEERING - for peer networks
	// * PRIVATE_SERVICE_CONNECT - for  Private Service Connect networks
	Purpose pulumi.StringPtrInput
	// The URI of the created resource.
	SelfLink pulumi.StringPtrInput
}

func (GlobalAddressState) ElementType() reflect.Type {
	return reflect.TypeOf((*globalAddressState)(nil)).Elem()
}

type globalAddressArgs struct {
	// The IP address or beginning of the address range represented by this
	// resource. This can be supplied as an input to reserve a specific
	// address or omitted to allow GCP to choose a valid one for you.
	Address *string `pulumi:"address"`
	// The type of the address to reserve.
	// * EXTERNAL indicates public/external single IP address.
	// * INTERNAL indicates internal IP ranges belonging to some network.
	//   Default value is `EXTERNAL`.
	//   Possible values are: `EXTERNAL`, `INTERNAL`.
	AddressType *string `pulumi:"addressType"`
	// An optional description of this resource.
	Description *string `pulumi:"description"`
	// The IP Version that will be used by this address. The default value is `IPV4`.
	// Possible values are: `IPV4`, `IPV6`.
	IpVersion *string `pulumi:"ipVersion"`
	// Labels to apply to this address.  A list of key->value pairs.
	//
	// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
	// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
	Labels map[string]string `pulumi:"labels"`
	// Name of the resource. Provided by the client when the resource is
	// created. The name must be 1-63 characters long, and comply with
	// RFC1035.  Specifically, the name must be 1-63 characters long and
	// match the regular expression `a-z?` which means
	// the first character must be a lowercase letter, and all following
	// characters must be a dash, lowercase letter, or digit, except the last
	// character, which cannot be a dash.
	Name *string `pulumi:"name"`
	// The URL of the network in which to reserve the IP range. The IP range
	// must be in RFC1918 space. The network cannot be deleted if there are
	// any reserved IP ranges referring to it.
	// This should only be set when using an Internal address.
	Network *string `pulumi:"network"`
	// The prefix length of the IP range. If not present, it means the
	// address field is a single IP address.
	// This field is not applicable to addresses with addressType=INTERNAL
	// when purpose=PRIVATE_SERVICE_CONNECT
	PrefixLength *int `pulumi:"prefixLength"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
	// The purpose of the resource. Possible values include:
	// * VPC_PEERING - for peer networks
	// * PRIVATE_SERVICE_CONNECT - for  Private Service Connect networks
	Purpose *string `pulumi:"purpose"`
}

// The set of arguments for constructing a GlobalAddress resource.
type GlobalAddressArgs struct {
	// The IP address or beginning of the address range represented by this
	// resource. This can be supplied as an input to reserve a specific
	// address or omitted to allow GCP to choose a valid one for you.
	Address pulumi.StringPtrInput
	// The type of the address to reserve.
	// * EXTERNAL indicates public/external single IP address.
	// * INTERNAL indicates internal IP ranges belonging to some network.
	//   Default value is `EXTERNAL`.
	//   Possible values are: `EXTERNAL`, `INTERNAL`.
	AddressType pulumi.StringPtrInput
	// An optional description of this resource.
	Description pulumi.StringPtrInput
	// The IP Version that will be used by this address. The default value is `IPV4`.
	// Possible values are: `IPV4`, `IPV6`.
	IpVersion pulumi.StringPtrInput
	// Labels to apply to this address.  A list of key->value pairs.
	//
	// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
	// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
	Labels pulumi.StringMapInput
	// Name of the resource. Provided by the client when the resource is
	// created. The name must be 1-63 characters long, and comply with
	// RFC1035.  Specifically, the name must be 1-63 characters long and
	// match the regular expression `a-z?` which means
	// the first character must be a lowercase letter, and all following
	// characters must be a dash, lowercase letter, or digit, except the last
	// character, which cannot be a dash.
	Name pulumi.StringPtrInput
	// The URL of the network in which to reserve the IP range. The IP range
	// must be in RFC1918 space. The network cannot be deleted if there are
	// any reserved IP ranges referring to it.
	// This should only be set when using an Internal address.
	Network pulumi.StringPtrInput
	// The prefix length of the IP range. If not present, it means the
	// address field is a single IP address.
	// This field is not applicable to addresses with addressType=INTERNAL
	// when purpose=PRIVATE_SERVICE_CONNECT
	PrefixLength pulumi.IntPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
	// The purpose of the resource. Possible values include:
	// * VPC_PEERING - for peer networks
	// * PRIVATE_SERVICE_CONNECT - for  Private Service Connect networks
	Purpose pulumi.StringPtrInput
}

func (GlobalAddressArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*globalAddressArgs)(nil)).Elem()
}

type GlobalAddressInput interface {
	pulumi.Input

	ToGlobalAddressOutput() GlobalAddressOutput
	ToGlobalAddressOutputWithContext(ctx context.Context) GlobalAddressOutput
}

func (*GlobalAddress) ElementType() reflect.Type {
	return reflect.TypeOf((**GlobalAddress)(nil)).Elem()
}

func (i *GlobalAddress) ToGlobalAddressOutput() GlobalAddressOutput {
	return i.ToGlobalAddressOutputWithContext(context.Background())
}

func (i *GlobalAddress) ToGlobalAddressOutputWithContext(ctx context.Context) GlobalAddressOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GlobalAddressOutput)
}

// GlobalAddressArrayInput is an input type that accepts GlobalAddressArray and GlobalAddressArrayOutput values.
// You can construct a concrete instance of `GlobalAddressArrayInput` via:
//
//	GlobalAddressArray{ GlobalAddressArgs{...} }
type GlobalAddressArrayInput interface {
	pulumi.Input

	ToGlobalAddressArrayOutput() GlobalAddressArrayOutput
	ToGlobalAddressArrayOutputWithContext(context.Context) GlobalAddressArrayOutput
}

type GlobalAddressArray []GlobalAddressInput

func (GlobalAddressArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GlobalAddress)(nil)).Elem()
}

func (i GlobalAddressArray) ToGlobalAddressArrayOutput() GlobalAddressArrayOutput {
	return i.ToGlobalAddressArrayOutputWithContext(context.Background())
}

func (i GlobalAddressArray) ToGlobalAddressArrayOutputWithContext(ctx context.Context) GlobalAddressArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GlobalAddressArrayOutput)
}

// GlobalAddressMapInput is an input type that accepts GlobalAddressMap and GlobalAddressMapOutput values.
// You can construct a concrete instance of `GlobalAddressMapInput` via:
//
//	GlobalAddressMap{ "key": GlobalAddressArgs{...} }
type GlobalAddressMapInput interface {
	pulumi.Input

	ToGlobalAddressMapOutput() GlobalAddressMapOutput
	ToGlobalAddressMapOutputWithContext(context.Context) GlobalAddressMapOutput
}

type GlobalAddressMap map[string]GlobalAddressInput

func (GlobalAddressMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GlobalAddress)(nil)).Elem()
}

func (i GlobalAddressMap) ToGlobalAddressMapOutput() GlobalAddressMapOutput {
	return i.ToGlobalAddressMapOutputWithContext(context.Background())
}

func (i GlobalAddressMap) ToGlobalAddressMapOutputWithContext(ctx context.Context) GlobalAddressMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GlobalAddressMapOutput)
}

type GlobalAddressOutput struct{ *pulumi.OutputState }

func (GlobalAddressOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**GlobalAddress)(nil)).Elem()
}

func (o GlobalAddressOutput) ToGlobalAddressOutput() GlobalAddressOutput {
	return o
}

func (o GlobalAddressOutput) ToGlobalAddressOutputWithContext(ctx context.Context) GlobalAddressOutput {
	return o
}

// The IP address or beginning of the address range represented by this
// resource. This can be supplied as an input to reserve a specific
// address or omitted to allow GCP to choose a valid one for you.
func (o GlobalAddressOutput) Address() pulumi.StringOutput {
	return o.ApplyT(func(v *GlobalAddress) pulumi.StringOutput { return v.Address }).(pulumi.StringOutput)
}

// The type of the address to reserve.
//   - EXTERNAL indicates public/external single IP address.
//   - INTERNAL indicates internal IP ranges belonging to some network.
//     Default value is `EXTERNAL`.
//     Possible values are: `EXTERNAL`, `INTERNAL`.
func (o GlobalAddressOutput) AddressType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GlobalAddress) pulumi.StringPtrOutput { return v.AddressType }).(pulumi.StringPtrOutput)
}

// Creation timestamp in RFC3339 text format.
func (o GlobalAddressOutput) CreationTimestamp() pulumi.StringOutput {
	return o.ApplyT(func(v *GlobalAddress) pulumi.StringOutput { return v.CreationTimestamp }).(pulumi.StringOutput)
}

// An optional description of this resource.
func (o GlobalAddressOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GlobalAddress) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
func (o GlobalAddressOutput) EffectiveLabels() pulumi.StringMapOutput {
	return o.ApplyT(func(v *GlobalAddress) pulumi.StringMapOutput { return v.EffectiveLabels }).(pulumi.StringMapOutput)
}

// The IP Version that will be used by this address. The default value is `IPV4`.
// Possible values are: `IPV4`, `IPV6`.
func (o GlobalAddressOutput) IpVersion() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GlobalAddress) pulumi.StringPtrOutput { return v.IpVersion }).(pulumi.StringPtrOutput)
}

// The fingerprint used for optimistic locking of this resource.  Used
// internally during updates.
func (o GlobalAddressOutput) LabelFingerprint() pulumi.StringOutput {
	return o.ApplyT(func(v *GlobalAddress) pulumi.StringOutput { return v.LabelFingerprint }).(pulumi.StringOutput)
}

// Labels to apply to this address.  A list of key->value pairs.
//
// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
func (o GlobalAddressOutput) Labels() pulumi.StringMapOutput {
	return o.ApplyT(func(v *GlobalAddress) pulumi.StringMapOutput { return v.Labels }).(pulumi.StringMapOutput)
}

// Name of the resource. Provided by the client when the resource is
// created. The name must be 1-63 characters long, and comply with
// RFC1035.  Specifically, the name must be 1-63 characters long and
// match the regular expression `a-z?` which means
// the first character must be a lowercase letter, and all following
// characters must be a dash, lowercase letter, or digit, except the last
// character, which cannot be a dash.
func (o GlobalAddressOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *GlobalAddress) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The URL of the network in which to reserve the IP range. The IP range
// must be in RFC1918 space. The network cannot be deleted if there are
// any reserved IP ranges referring to it.
// This should only be set when using an Internal address.
func (o GlobalAddressOutput) Network() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GlobalAddress) pulumi.StringPtrOutput { return v.Network }).(pulumi.StringPtrOutput)
}

// The prefix length of the IP range. If not present, it means the
// address field is a single IP address.
// This field is not applicable to addresses with addressType=INTERNAL
// when purpose=PRIVATE_SERVICE_CONNECT
func (o GlobalAddressOutput) PrefixLength() pulumi.IntOutput {
	return o.ApplyT(func(v *GlobalAddress) pulumi.IntOutput { return v.PrefixLength }).(pulumi.IntOutput)
}

// The ID of the project in which the resource belongs.
// If it is not provided, the provider project is used.
func (o GlobalAddressOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *GlobalAddress) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// The combination of labels configured directly on the resource
// and default labels configured on the provider.
func (o GlobalAddressOutput) PulumiLabels() pulumi.StringMapOutput {
	return o.ApplyT(func(v *GlobalAddress) pulumi.StringMapOutput { return v.PulumiLabels }).(pulumi.StringMapOutput)
}

// The purpose of the resource. Possible values include:
// * VPC_PEERING - for peer networks
// * PRIVATE_SERVICE_CONNECT - for  Private Service Connect networks
func (o GlobalAddressOutput) Purpose() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GlobalAddress) pulumi.StringPtrOutput { return v.Purpose }).(pulumi.StringPtrOutput)
}

// The URI of the created resource.
func (o GlobalAddressOutput) SelfLink() pulumi.StringOutput {
	return o.ApplyT(func(v *GlobalAddress) pulumi.StringOutput { return v.SelfLink }).(pulumi.StringOutput)
}

type GlobalAddressArrayOutput struct{ *pulumi.OutputState }

func (GlobalAddressArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GlobalAddress)(nil)).Elem()
}

func (o GlobalAddressArrayOutput) ToGlobalAddressArrayOutput() GlobalAddressArrayOutput {
	return o
}

func (o GlobalAddressArrayOutput) ToGlobalAddressArrayOutputWithContext(ctx context.Context) GlobalAddressArrayOutput {
	return o
}

func (o GlobalAddressArrayOutput) Index(i pulumi.IntInput) GlobalAddressOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *GlobalAddress {
		return vs[0].([]*GlobalAddress)[vs[1].(int)]
	}).(GlobalAddressOutput)
}

type GlobalAddressMapOutput struct{ *pulumi.OutputState }

func (GlobalAddressMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GlobalAddress)(nil)).Elem()
}

func (o GlobalAddressMapOutput) ToGlobalAddressMapOutput() GlobalAddressMapOutput {
	return o
}

func (o GlobalAddressMapOutput) ToGlobalAddressMapOutputWithContext(ctx context.Context) GlobalAddressMapOutput {
	return o
}

func (o GlobalAddressMapOutput) MapIndex(k pulumi.StringInput) GlobalAddressOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *GlobalAddress {
		return vs[0].(map[string]*GlobalAddress)[vs[1].(string)]
	}).(GlobalAddressOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*GlobalAddressInput)(nil)).Elem(), &GlobalAddress{})
	pulumi.RegisterInputType(reflect.TypeOf((*GlobalAddressArrayInput)(nil)).Elem(), GlobalAddressArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GlobalAddressMapInput)(nil)).Elem(), GlobalAddressMap{})
	pulumi.RegisterOutputType(GlobalAddressOutput{})
	pulumi.RegisterOutputType(GlobalAddressArrayOutput{})
	pulumi.RegisterOutputType(GlobalAddressMapOutput{})
}
