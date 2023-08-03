// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package networksecurity

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// AddressGroup is a resource that specifies how a collection of IP/DNS used in Firewall Policy.
//
// To get more information about AddressGroup, see:
//
// * [API documentation](https://cloud.google.com/traffic-director/docs/reference/network-security/rest/v1beta1/organizations.locations.addressGroups)
// * How-to Guides
//   - [Use AddressGroups](https://cloud.google.com/vpc/docs/use-address-groups-firewall-policies)
//
// ## Example Usage
// ### Network Security Address Groups Basic
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/networksecurity"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := networksecurity.NewAddressGroup(ctx, "default", &networksecurity.AddressGroupArgs{
//				Capacity: pulumi.Int(100),
//				Items: pulumi.StringArray{
//					pulumi.String("208.80.154.224/32"),
//				},
//				Location: pulumi.String("us-central1"),
//				Parent:   pulumi.String("projects/my-project-name"),
//				Type:     pulumi.String("IPV4"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Network Security Address Groups Organization Basic
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/networksecurity"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := networksecurity.NewAddressGroup(ctx, "default", &networksecurity.AddressGroupArgs{
//				Capacity: pulumi.Int(100),
//				Items: pulumi.StringArray{
//					pulumi.String("208.80.154.224/32"),
//				},
//				Location: pulumi.String("us-central1"),
//				Parent:   pulumi.String("organizations/123456789"),
//				Type:     pulumi.String("IPV4"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Network Security Address Groups Advanced
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/networksecurity"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := networksecurity.NewAddressGroup(ctx, "default", &networksecurity.AddressGroupArgs{
//				Capacity:    pulumi.Int(100),
//				Description: pulumi.String("my description"),
//				Items: pulumi.StringArray{
//					pulumi.String("208.80.154.224/32"),
//				},
//				Location: pulumi.String("us-central1"),
//				Parent:   pulumi.String("projects/my-project-name"),
//				Type:     pulumi.String("IPV4"),
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
// # AddressGroup can be imported using any of these accepted formats
//
// ```sh
//
//	$ pulumi import gcp:networksecurity/addressGroup:AddressGroup default {{parent}}/locations/{{location}}/addressGroups/{{name}}
//
// ```
type AddressGroup struct {
	pulumi.CustomResourceState

	// Capacity of the Address Group.
	Capacity pulumi.IntOutput `pulumi:"capacity"`
	// The timestamp when the resource was created.
	// A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits.
	// Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z"
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// Free-text description of the resource.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// List of items.
	Items pulumi.StringArrayOutput `pulumi:"items"`
	// Set of label tags associated with the AddressGroup resource.
	// An object containing a list of "key": value pairs. Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
	Labels pulumi.StringMapOutput `pulumi:"labels"`
	// The location of the gateway security policy.
	// The default value is `global`.
	//
	// ***
	Location pulumi.StringOutput `pulumi:"location"`
	// Name of the AddressGroup resource.
	Name pulumi.StringOutput `pulumi:"name"`
	// The name of the parent this address group belongs to. Format: organizations/{organization_id} or projects/{project_id}.
	Parent pulumi.StringPtrOutput `pulumi:"parent"`
	// The type of the Address Group. Possible values are "IPV4" or "IPV6".
	// Possible values are: `IPV4`, `IPV6`.
	Type pulumi.StringOutput `pulumi:"type"`
	// The timestamp when the resource was updated.
	// A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits.
	// Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
	UpdateTime pulumi.StringOutput `pulumi:"updateTime"`
}

// NewAddressGroup registers a new resource with the given unique name, arguments, and options.
func NewAddressGroup(ctx *pulumi.Context,
	name string, args *AddressGroupArgs, opts ...pulumi.ResourceOption) (*AddressGroup, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Capacity == nil {
		return nil, errors.New("invalid value for required argument 'Capacity'")
	}
	if args.Location == nil {
		return nil, errors.New("invalid value for required argument 'Location'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AddressGroup
	err := ctx.RegisterResource("gcp:networksecurity/addressGroup:AddressGroup", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAddressGroup gets an existing AddressGroup resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAddressGroup(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AddressGroupState, opts ...pulumi.ResourceOption) (*AddressGroup, error) {
	var resource AddressGroup
	err := ctx.ReadResource("gcp:networksecurity/addressGroup:AddressGroup", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AddressGroup resources.
type addressGroupState struct {
	// Capacity of the Address Group.
	Capacity *int `pulumi:"capacity"`
	// The timestamp when the resource was created.
	// A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits.
	// Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z"
	CreateTime *string `pulumi:"createTime"`
	// Free-text description of the resource.
	Description *string `pulumi:"description"`
	// List of items.
	Items []string `pulumi:"items"`
	// Set of label tags associated with the AddressGroup resource.
	// An object containing a list of "key": value pairs. Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
	Labels map[string]string `pulumi:"labels"`
	// The location of the gateway security policy.
	// The default value is `global`.
	//
	// ***
	Location *string `pulumi:"location"`
	// Name of the AddressGroup resource.
	Name *string `pulumi:"name"`
	// The name of the parent this address group belongs to. Format: organizations/{organization_id} or projects/{project_id}.
	Parent *string `pulumi:"parent"`
	// The type of the Address Group. Possible values are "IPV4" or "IPV6".
	// Possible values are: `IPV4`, `IPV6`.
	Type *string `pulumi:"type"`
	// The timestamp when the resource was updated.
	// A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits.
	// Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
	UpdateTime *string `pulumi:"updateTime"`
}

type AddressGroupState struct {
	// Capacity of the Address Group.
	Capacity pulumi.IntPtrInput
	// The timestamp when the resource was created.
	// A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits.
	// Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z"
	CreateTime pulumi.StringPtrInput
	// Free-text description of the resource.
	Description pulumi.StringPtrInput
	// List of items.
	Items pulumi.StringArrayInput
	// Set of label tags associated with the AddressGroup resource.
	// An object containing a list of "key": value pairs. Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
	Labels pulumi.StringMapInput
	// The location of the gateway security policy.
	// The default value is `global`.
	//
	// ***
	Location pulumi.StringPtrInput
	// Name of the AddressGroup resource.
	Name pulumi.StringPtrInput
	// The name of the parent this address group belongs to. Format: organizations/{organization_id} or projects/{project_id}.
	Parent pulumi.StringPtrInput
	// The type of the Address Group. Possible values are "IPV4" or "IPV6".
	// Possible values are: `IPV4`, `IPV6`.
	Type pulumi.StringPtrInput
	// The timestamp when the resource was updated.
	// A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits.
	// Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
	UpdateTime pulumi.StringPtrInput
}

func (AddressGroupState) ElementType() reflect.Type {
	return reflect.TypeOf((*addressGroupState)(nil)).Elem()
}

type addressGroupArgs struct {
	// Capacity of the Address Group.
	Capacity int `pulumi:"capacity"`
	// Free-text description of the resource.
	Description *string `pulumi:"description"`
	// List of items.
	Items []string `pulumi:"items"`
	// Set of label tags associated with the AddressGroup resource.
	// An object containing a list of "key": value pairs. Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
	Labels map[string]string `pulumi:"labels"`
	// The location of the gateway security policy.
	// The default value is `global`.
	//
	// ***
	Location string `pulumi:"location"`
	// Name of the AddressGroup resource.
	Name *string `pulumi:"name"`
	// The name of the parent this address group belongs to. Format: organizations/{organization_id} or projects/{project_id}.
	Parent *string `pulumi:"parent"`
	// The type of the Address Group. Possible values are "IPV4" or "IPV6".
	// Possible values are: `IPV4`, `IPV6`.
	Type string `pulumi:"type"`
}

// The set of arguments for constructing a AddressGroup resource.
type AddressGroupArgs struct {
	// Capacity of the Address Group.
	Capacity pulumi.IntInput
	// Free-text description of the resource.
	Description pulumi.StringPtrInput
	// List of items.
	Items pulumi.StringArrayInput
	// Set of label tags associated with the AddressGroup resource.
	// An object containing a list of "key": value pairs. Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
	Labels pulumi.StringMapInput
	// The location of the gateway security policy.
	// The default value is `global`.
	//
	// ***
	Location pulumi.StringInput
	// Name of the AddressGroup resource.
	Name pulumi.StringPtrInput
	// The name of the parent this address group belongs to. Format: organizations/{organization_id} or projects/{project_id}.
	Parent pulumi.StringPtrInput
	// The type of the Address Group. Possible values are "IPV4" or "IPV6".
	// Possible values are: `IPV4`, `IPV6`.
	Type pulumi.StringInput
}

func (AddressGroupArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*addressGroupArgs)(nil)).Elem()
}

type AddressGroupInput interface {
	pulumi.Input

	ToAddressGroupOutput() AddressGroupOutput
	ToAddressGroupOutputWithContext(ctx context.Context) AddressGroupOutput
}

func (*AddressGroup) ElementType() reflect.Type {
	return reflect.TypeOf((**AddressGroup)(nil)).Elem()
}

func (i *AddressGroup) ToAddressGroupOutput() AddressGroupOutput {
	return i.ToAddressGroupOutputWithContext(context.Background())
}

func (i *AddressGroup) ToAddressGroupOutputWithContext(ctx context.Context) AddressGroupOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AddressGroupOutput)
}

// AddressGroupArrayInput is an input type that accepts AddressGroupArray and AddressGroupArrayOutput values.
// You can construct a concrete instance of `AddressGroupArrayInput` via:
//
//	AddressGroupArray{ AddressGroupArgs{...} }
type AddressGroupArrayInput interface {
	pulumi.Input

	ToAddressGroupArrayOutput() AddressGroupArrayOutput
	ToAddressGroupArrayOutputWithContext(context.Context) AddressGroupArrayOutput
}

type AddressGroupArray []AddressGroupInput

func (AddressGroupArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AddressGroup)(nil)).Elem()
}

func (i AddressGroupArray) ToAddressGroupArrayOutput() AddressGroupArrayOutput {
	return i.ToAddressGroupArrayOutputWithContext(context.Background())
}

func (i AddressGroupArray) ToAddressGroupArrayOutputWithContext(ctx context.Context) AddressGroupArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AddressGroupArrayOutput)
}

// AddressGroupMapInput is an input type that accepts AddressGroupMap and AddressGroupMapOutput values.
// You can construct a concrete instance of `AddressGroupMapInput` via:
//
//	AddressGroupMap{ "key": AddressGroupArgs{...} }
type AddressGroupMapInput interface {
	pulumi.Input

	ToAddressGroupMapOutput() AddressGroupMapOutput
	ToAddressGroupMapOutputWithContext(context.Context) AddressGroupMapOutput
}

type AddressGroupMap map[string]AddressGroupInput

func (AddressGroupMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AddressGroup)(nil)).Elem()
}

func (i AddressGroupMap) ToAddressGroupMapOutput() AddressGroupMapOutput {
	return i.ToAddressGroupMapOutputWithContext(context.Background())
}

func (i AddressGroupMap) ToAddressGroupMapOutputWithContext(ctx context.Context) AddressGroupMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AddressGroupMapOutput)
}

type AddressGroupOutput struct{ *pulumi.OutputState }

func (AddressGroupOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AddressGroup)(nil)).Elem()
}

func (o AddressGroupOutput) ToAddressGroupOutput() AddressGroupOutput {
	return o
}

func (o AddressGroupOutput) ToAddressGroupOutputWithContext(ctx context.Context) AddressGroupOutput {
	return o
}

// Capacity of the Address Group.
func (o AddressGroupOutput) Capacity() pulumi.IntOutput {
	return o.ApplyT(func(v *AddressGroup) pulumi.IntOutput { return v.Capacity }).(pulumi.IntOutput)
}

// The timestamp when the resource was created.
// A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits.
// Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z"
func (o AddressGroupOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *AddressGroup) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// Free-text description of the resource.
func (o AddressGroupOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AddressGroup) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// List of items.
func (o AddressGroupOutput) Items() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *AddressGroup) pulumi.StringArrayOutput { return v.Items }).(pulumi.StringArrayOutput)
}

// Set of label tags associated with the AddressGroup resource.
// An object containing a list of "key": value pairs. Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
func (o AddressGroupOutput) Labels() pulumi.StringMapOutput {
	return o.ApplyT(func(v *AddressGroup) pulumi.StringMapOutput { return v.Labels }).(pulumi.StringMapOutput)
}

// The location of the gateway security policy.
// The default value is `global`.
//
// ***
func (o AddressGroupOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *AddressGroup) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// Name of the AddressGroup resource.
func (o AddressGroupOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *AddressGroup) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The name of the parent this address group belongs to. Format: organizations/{organization_id} or projects/{project_id}.
func (o AddressGroupOutput) Parent() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AddressGroup) pulumi.StringPtrOutput { return v.Parent }).(pulumi.StringPtrOutput)
}

// The type of the Address Group. Possible values are "IPV4" or "IPV6".
// Possible values are: `IPV4`, `IPV6`.
func (o AddressGroupOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *AddressGroup) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

// The timestamp when the resource was updated.
// A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits.
// Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
func (o AddressGroupOutput) UpdateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *AddressGroup) pulumi.StringOutput { return v.UpdateTime }).(pulumi.StringOutput)
}

type AddressGroupArrayOutput struct{ *pulumi.OutputState }

func (AddressGroupArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AddressGroup)(nil)).Elem()
}

func (o AddressGroupArrayOutput) ToAddressGroupArrayOutput() AddressGroupArrayOutput {
	return o
}

func (o AddressGroupArrayOutput) ToAddressGroupArrayOutputWithContext(ctx context.Context) AddressGroupArrayOutput {
	return o
}

func (o AddressGroupArrayOutput) Index(i pulumi.IntInput) AddressGroupOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AddressGroup {
		return vs[0].([]*AddressGroup)[vs[1].(int)]
	}).(AddressGroupOutput)
}

type AddressGroupMapOutput struct{ *pulumi.OutputState }

func (AddressGroupMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AddressGroup)(nil)).Elem()
}

func (o AddressGroupMapOutput) ToAddressGroupMapOutput() AddressGroupMapOutput {
	return o
}

func (o AddressGroupMapOutput) ToAddressGroupMapOutputWithContext(ctx context.Context) AddressGroupMapOutput {
	return o
}

func (o AddressGroupMapOutput) MapIndex(k pulumi.StringInput) AddressGroupOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AddressGroup {
		return vs[0].(map[string]*AddressGroup)[vs[1].(string)]
	}).(AddressGroupOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AddressGroupInput)(nil)).Elem(), &AddressGroup{})
	pulumi.RegisterInputType(reflect.TypeOf((*AddressGroupArrayInput)(nil)).Elem(), AddressGroupArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AddressGroupMapInput)(nil)).Elem(), AddressGroupMap{})
	pulumi.RegisterOutputType(AddressGroupOutput{})
	pulumi.RegisterOutputType(AddressGroupArrayOutput{})
	pulumi.RegisterOutputType(AddressGroupMapOutput{})
}