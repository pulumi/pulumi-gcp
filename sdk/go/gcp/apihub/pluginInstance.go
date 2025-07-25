// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package apihub

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Description
//
// ## Example Usage
//
// ### Apihub Plugin Instance Basic
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/apihub"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := apihub.NewPluginInstance(ctx, "apihub_plugin_instance_basic", &apihub.PluginInstanceArgs{
//				Location:         pulumi.String("us-central1"),
//				Plugin:           pulumi.String("existing-plugin-id"),
//				PluginInstanceId: pulumi.String("test"),
//				DisplayName:      pulumi.String("Sample Plugin Instance Display Name"),
//				Disable:          pulumi.Bool(false),
//				Actions: apihub.PluginInstanceActionArray{
//					&apihub.PluginInstanceActionArgs{
//						ActionId: pulumi.String("existing-action-id"),
//					},
//				},
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
// PluginInstance can be imported using any of these accepted formats:
//
// * `projects/{{project}}/locations/{{location}}/plugins/{{plugin}}/instances/{{plugin_instance_id}}`
//
// * `{{project}}/{{location}}/{{plugin}}/{{plugin_instance_id}}`
//
// * `{{location}}/{{plugin}}/{{plugin_instance_id}}`
//
// When using the `pulumi import` command, PluginInstance can be imported using one of the formats above. For example:
//
// ```sh
// $ pulumi import gcp:apihub/pluginInstance:PluginInstance default projects/{{project}}/locations/{{location}}/plugins/{{plugin}}/instances/{{plugin_instance_id}}
// ```
//
// ```sh
// $ pulumi import gcp:apihub/pluginInstance:PluginInstance default {{project}}/{{location}}/{{plugin}}/{{plugin_instance_id}}
// ```
//
// ```sh
// $ pulumi import gcp:apihub/pluginInstance:PluginInstance default {{location}}/{{plugin}}/{{plugin_instance_id}}
// ```
type PluginInstance struct {
	pulumi.CustomResourceState

	// The action status for the plugin instance.
	// Structure is documented below.
	Actions PluginInstanceActionArrayOutput `pulumi:"actions"`
	// AuthConfig represents the authentication information.
	// Structure is documented below.
	AuthConfig PluginInstanceAuthConfigPtrOutput `pulumi:"authConfig"`
	// Timestamp indicating when the plugin instance was created.
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// The display name for this plugin instance. Max length is 255 characters.
	Disable pulumi.BoolPtrOutput `pulumi:"disable"`
	// The display name for this plugin instance. Max length is 255 characters.
	DisplayName pulumi.StringOutput `pulumi:"displayName"`
	// Error message describing the failure, if any, during Create, Delete or
	// ApplyConfig operation corresponding to the plugin instance.This field will
	// only be populated if the plugin instance is in the ERROR or FAILED state.
	ErrorMessage pulumi.StringOutput `pulumi:"errorMessage"`
	// Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122.
	Location pulumi.StringOutput `pulumi:"location"`
	// Identifier. The unique name of the plugin instance resource.
	// Format:
	// `projects/{project}/locations/{location}/plugins/{plugin}/instances/{instance}`
	Name pulumi.StringOutput `pulumi:"name"`
	// Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122.
	Plugin pulumi.StringOutput `pulumi:"plugin"`
	// The ID to use for the plugin instance, which will become the final
	// component of the plugin instance's resource name. This field is optional.
	// * If provided, the same will be used. The service will throw an error if
	//   the specified id is already used by another plugin instance in the plugin
	//   resource.
	// * If not provided, a system generated id will be used.
	//   This value should be 4-63 characters, and valid characters
	//   are /a-z[0-9]-_/.
	PluginInstanceId pulumi.StringOutput `pulumi:"pluginInstanceId"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringOutput `pulumi:"project"`
	// The current state of the plugin instance (e.g., enabled, disabled,
	// provisioning).
	// Possible values:
	// STATE_UNSPECIFIED
	// CREATING
	// ACTIVE
	// APPLYING_CONFIG
	// ERROR
	// FAILED
	// DELETING
	State pulumi.StringOutput `pulumi:"state"`
	// Timestamp indicating when the plugin instance was last updated.
	UpdateTime pulumi.StringOutput `pulumi:"updateTime"`
}

// NewPluginInstance registers a new resource with the given unique name, arguments, and options.
func NewPluginInstance(ctx *pulumi.Context,
	name string, args *PluginInstanceArgs, opts ...pulumi.ResourceOption) (*PluginInstance, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DisplayName == nil {
		return nil, errors.New("invalid value for required argument 'DisplayName'")
	}
	if args.Location == nil {
		return nil, errors.New("invalid value for required argument 'Location'")
	}
	if args.Plugin == nil {
		return nil, errors.New("invalid value for required argument 'Plugin'")
	}
	if args.PluginInstanceId == nil {
		return nil, errors.New("invalid value for required argument 'PluginInstanceId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource PluginInstance
	err := ctx.RegisterResource("gcp:apihub/pluginInstance:PluginInstance", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPluginInstance gets an existing PluginInstance resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPluginInstance(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PluginInstanceState, opts ...pulumi.ResourceOption) (*PluginInstance, error) {
	var resource PluginInstance
	err := ctx.ReadResource("gcp:apihub/pluginInstance:PluginInstance", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering PluginInstance resources.
type pluginInstanceState struct {
	// The action status for the plugin instance.
	// Structure is documented below.
	Actions []PluginInstanceAction `pulumi:"actions"`
	// AuthConfig represents the authentication information.
	// Structure is documented below.
	AuthConfig *PluginInstanceAuthConfig `pulumi:"authConfig"`
	// Timestamp indicating when the plugin instance was created.
	CreateTime *string `pulumi:"createTime"`
	// The display name for this plugin instance. Max length is 255 characters.
	Disable *bool `pulumi:"disable"`
	// The display name for this plugin instance. Max length is 255 characters.
	DisplayName *string `pulumi:"displayName"`
	// Error message describing the failure, if any, during Create, Delete or
	// ApplyConfig operation corresponding to the plugin instance.This field will
	// only be populated if the plugin instance is in the ERROR or FAILED state.
	ErrorMessage *string `pulumi:"errorMessage"`
	// Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122.
	Location *string `pulumi:"location"`
	// Identifier. The unique name of the plugin instance resource.
	// Format:
	// `projects/{project}/locations/{location}/plugins/{plugin}/instances/{instance}`
	Name *string `pulumi:"name"`
	// Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122.
	Plugin *string `pulumi:"plugin"`
	// The ID to use for the plugin instance, which will become the final
	// component of the plugin instance's resource name. This field is optional.
	// * If provided, the same will be used. The service will throw an error if
	//   the specified id is already used by another plugin instance in the plugin
	//   resource.
	// * If not provided, a system generated id will be used.
	//   This value should be 4-63 characters, and valid characters
	//   are /a-z[0-9]-_/.
	PluginInstanceId *string `pulumi:"pluginInstanceId"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
	// The current state of the plugin instance (e.g., enabled, disabled,
	// provisioning).
	// Possible values:
	// STATE_UNSPECIFIED
	// CREATING
	// ACTIVE
	// APPLYING_CONFIG
	// ERROR
	// FAILED
	// DELETING
	State *string `pulumi:"state"`
	// Timestamp indicating when the plugin instance was last updated.
	UpdateTime *string `pulumi:"updateTime"`
}

type PluginInstanceState struct {
	// The action status for the plugin instance.
	// Structure is documented below.
	Actions PluginInstanceActionArrayInput
	// AuthConfig represents the authentication information.
	// Structure is documented below.
	AuthConfig PluginInstanceAuthConfigPtrInput
	// Timestamp indicating when the plugin instance was created.
	CreateTime pulumi.StringPtrInput
	// The display name for this plugin instance. Max length is 255 characters.
	Disable pulumi.BoolPtrInput
	// The display name for this plugin instance. Max length is 255 characters.
	DisplayName pulumi.StringPtrInput
	// Error message describing the failure, if any, during Create, Delete or
	// ApplyConfig operation corresponding to the plugin instance.This field will
	// only be populated if the plugin instance is in the ERROR or FAILED state.
	ErrorMessage pulumi.StringPtrInput
	// Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122.
	Location pulumi.StringPtrInput
	// Identifier. The unique name of the plugin instance resource.
	// Format:
	// `projects/{project}/locations/{location}/plugins/{plugin}/instances/{instance}`
	Name pulumi.StringPtrInput
	// Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122.
	Plugin pulumi.StringPtrInput
	// The ID to use for the plugin instance, which will become the final
	// component of the plugin instance's resource name. This field is optional.
	// * If provided, the same will be used. The service will throw an error if
	//   the specified id is already used by another plugin instance in the plugin
	//   resource.
	// * If not provided, a system generated id will be used.
	//   This value should be 4-63 characters, and valid characters
	//   are /a-z[0-9]-_/.
	PluginInstanceId pulumi.StringPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
	// The current state of the plugin instance (e.g., enabled, disabled,
	// provisioning).
	// Possible values:
	// STATE_UNSPECIFIED
	// CREATING
	// ACTIVE
	// APPLYING_CONFIG
	// ERROR
	// FAILED
	// DELETING
	State pulumi.StringPtrInput
	// Timestamp indicating when the plugin instance was last updated.
	UpdateTime pulumi.StringPtrInput
}

func (PluginInstanceState) ElementType() reflect.Type {
	return reflect.TypeOf((*pluginInstanceState)(nil)).Elem()
}

type pluginInstanceArgs struct {
	// The action status for the plugin instance.
	// Structure is documented below.
	Actions []PluginInstanceAction `pulumi:"actions"`
	// AuthConfig represents the authentication information.
	// Structure is documented below.
	AuthConfig *PluginInstanceAuthConfig `pulumi:"authConfig"`
	// The display name for this plugin instance. Max length is 255 characters.
	Disable *bool `pulumi:"disable"`
	// The display name for this plugin instance. Max length is 255 characters.
	DisplayName string `pulumi:"displayName"`
	// Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122.
	Location string `pulumi:"location"`
	// Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122.
	Plugin string `pulumi:"plugin"`
	// The ID to use for the plugin instance, which will become the final
	// component of the plugin instance's resource name. This field is optional.
	// * If provided, the same will be used. The service will throw an error if
	//   the specified id is already used by another plugin instance in the plugin
	//   resource.
	// * If not provided, a system generated id will be used.
	//   This value should be 4-63 characters, and valid characters
	//   are /a-z[0-9]-_/.
	PluginInstanceId string `pulumi:"pluginInstanceId"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
}

// The set of arguments for constructing a PluginInstance resource.
type PluginInstanceArgs struct {
	// The action status for the plugin instance.
	// Structure is documented below.
	Actions PluginInstanceActionArrayInput
	// AuthConfig represents the authentication information.
	// Structure is documented below.
	AuthConfig PluginInstanceAuthConfigPtrInput
	// The display name for this plugin instance. Max length is 255 characters.
	Disable pulumi.BoolPtrInput
	// The display name for this plugin instance. Max length is 255 characters.
	DisplayName pulumi.StringInput
	// Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122.
	Location pulumi.StringInput
	// Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122.
	Plugin pulumi.StringInput
	// The ID to use for the plugin instance, which will become the final
	// component of the plugin instance's resource name. This field is optional.
	// * If provided, the same will be used. The service will throw an error if
	//   the specified id is already used by another plugin instance in the plugin
	//   resource.
	// * If not provided, a system generated id will be used.
	//   This value should be 4-63 characters, and valid characters
	//   are /a-z[0-9]-_/.
	PluginInstanceId pulumi.StringInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
}

func (PluginInstanceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*pluginInstanceArgs)(nil)).Elem()
}

type PluginInstanceInput interface {
	pulumi.Input

	ToPluginInstanceOutput() PluginInstanceOutput
	ToPluginInstanceOutputWithContext(ctx context.Context) PluginInstanceOutput
}

func (*PluginInstance) ElementType() reflect.Type {
	return reflect.TypeOf((**PluginInstance)(nil)).Elem()
}

func (i *PluginInstance) ToPluginInstanceOutput() PluginInstanceOutput {
	return i.ToPluginInstanceOutputWithContext(context.Background())
}

func (i *PluginInstance) ToPluginInstanceOutputWithContext(ctx context.Context) PluginInstanceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PluginInstanceOutput)
}

// PluginInstanceArrayInput is an input type that accepts PluginInstanceArray and PluginInstanceArrayOutput values.
// You can construct a concrete instance of `PluginInstanceArrayInput` via:
//
//	PluginInstanceArray{ PluginInstanceArgs{...} }
type PluginInstanceArrayInput interface {
	pulumi.Input

	ToPluginInstanceArrayOutput() PluginInstanceArrayOutput
	ToPluginInstanceArrayOutputWithContext(context.Context) PluginInstanceArrayOutput
}

type PluginInstanceArray []PluginInstanceInput

func (PluginInstanceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PluginInstance)(nil)).Elem()
}

func (i PluginInstanceArray) ToPluginInstanceArrayOutput() PluginInstanceArrayOutput {
	return i.ToPluginInstanceArrayOutputWithContext(context.Background())
}

func (i PluginInstanceArray) ToPluginInstanceArrayOutputWithContext(ctx context.Context) PluginInstanceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PluginInstanceArrayOutput)
}

// PluginInstanceMapInput is an input type that accepts PluginInstanceMap and PluginInstanceMapOutput values.
// You can construct a concrete instance of `PluginInstanceMapInput` via:
//
//	PluginInstanceMap{ "key": PluginInstanceArgs{...} }
type PluginInstanceMapInput interface {
	pulumi.Input

	ToPluginInstanceMapOutput() PluginInstanceMapOutput
	ToPluginInstanceMapOutputWithContext(context.Context) PluginInstanceMapOutput
}

type PluginInstanceMap map[string]PluginInstanceInput

func (PluginInstanceMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PluginInstance)(nil)).Elem()
}

func (i PluginInstanceMap) ToPluginInstanceMapOutput() PluginInstanceMapOutput {
	return i.ToPluginInstanceMapOutputWithContext(context.Background())
}

func (i PluginInstanceMap) ToPluginInstanceMapOutputWithContext(ctx context.Context) PluginInstanceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PluginInstanceMapOutput)
}

type PluginInstanceOutput struct{ *pulumi.OutputState }

func (PluginInstanceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**PluginInstance)(nil)).Elem()
}

func (o PluginInstanceOutput) ToPluginInstanceOutput() PluginInstanceOutput {
	return o
}

func (o PluginInstanceOutput) ToPluginInstanceOutputWithContext(ctx context.Context) PluginInstanceOutput {
	return o
}

// The action status for the plugin instance.
// Structure is documented below.
func (o PluginInstanceOutput) Actions() PluginInstanceActionArrayOutput {
	return o.ApplyT(func(v *PluginInstance) PluginInstanceActionArrayOutput { return v.Actions }).(PluginInstanceActionArrayOutput)
}

// AuthConfig represents the authentication information.
// Structure is documented below.
func (o PluginInstanceOutput) AuthConfig() PluginInstanceAuthConfigPtrOutput {
	return o.ApplyT(func(v *PluginInstance) PluginInstanceAuthConfigPtrOutput { return v.AuthConfig }).(PluginInstanceAuthConfigPtrOutput)
}

// Timestamp indicating when the plugin instance was created.
func (o PluginInstanceOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *PluginInstance) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// The display name for this plugin instance. Max length is 255 characters.
func (o PluginInstanceOutput) Disable() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *PluginInstance) pulumi.BoolPtrOutput { return v.Disable }).(pulumi.BoolPtrOutput)
}

// The display name for this plugin instance. Max length is 255 characters.
func (o PluginInstanceOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v *PluginInstance) pulumi.StringOutput { return v.DisplayName }).(pulumi.StringOutput)
}

// Error message describing the failure, if any, during Create, Delete or
// ApplyConfig operation corresponding to the plugin instance.This field will
// only be populated if the plugin instance is in the ERROR or FAILED state.
func (o PluginInstanceOutput) ErrorMessage() pulumi.StringOutput {
	return o.ApplyT(func(v *PluginInstance) pulumi.StringOutput { return v.ErrorMessage }).(pulumi.StringOutput)
}

// Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122.
func (o PluginInstanceOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *PluginInstance) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// Identifier. The unique name of the plugin instance resource.
// Format:
// `projects/{project}/locations/{location}/plugins/{plugin}/instances/{instance}`
func (o PluginInstanceOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *PluginInstance) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122.
func (o PluginInstanceOutput) Plugin() pulumi.StringOutput {
	return o.ApplyT(func(v *PluginInstance) pulumi.StringOutput { return v.Plugin }).(pulumi.StringOutput)
}

// The ID to use for the plugin instance, which will become the final
// component of the plugin instance's resource name. This field is optional.
//   - If provided, the same will be used. The service will throw an error if
//     the specified id is already used by another plugin instance in the plugin
//     resource.
//   - If not provided, a system generated id will be used.
//     This value should be 4-63 characters, and valid characters
//     are /a-z[0-9]-_/.
func (o PluginInstanceOutput) PluginInstanceId() pulumi.StringOutput {
	return o.ApplyT(func(v *PluginInstance) pulumi.StringOutput { return v.PluginInstanceId }).(pulumi.StringOutput)
}

// The ID of the project in which the resource belongs.
// If it is not provided, the provider project is used.
func (o PluginInstanceOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *PluginInstance) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// The current state of the plugin instance (e.g., enabled, disabled,
// provisioning).
// Possible values:
// STATE_UNSPECIFIED
// CREATING
// ACTIVE
// APPLYING_CONFIG
// ERROR
// FAILED
// DELETING
func (o PluginInstanceOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v *PluginInstance) pulumi.StringOutput { return v.State }).(pulumi.StringOutput)
}

// Timestamp indicating when the plugin instance was last updated.
func (o PluginInstanceOutput) UpdateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *PluginInstance) pulumi.StringOutput { return v.UpdateTime }).(pulumi.StringOutput)
}

type PluginInstanceArrayOutput struct{ *pulumi.OutputState }

func (PluginInstanceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PluginInstance)(nil)).Elem()
}

func (o PluginInstanceArrayOutput) ToPluginInstanceArrayOutput() PluginInstanceArrayOutput {
	return o
}

func (o PluginInstanceArrayOutput) ToPluginInstanceArrayOutputWithContext(ctx context.Context) PluginInstanceArrayOutput {
	return o
}

func (o PluginInstanceArrayOutput) Index(i pulumi.IntInput) PluginInstanceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *PluginInstance {
		return vs[0].([]*PluginInstance)[vs[1].(int)]
	}).(PluginInstanceOutput)
}

type PluginInstanceMapOutput struct{ *pulumi.OutputState }

func (PluginInstanceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PluginInstance)(nil)).Elem()
}

func (o PluginInstanceMapOutput) ToPluginInstanceMapOutput() PluginInstanceMapOutput {
	return o
}

func (o PluginInstanceMapOutput) ToPluginInstanceMapOutputWithContext(ctx context.Context) PluginInstanceMapOutput {
	return o
}

func (o PluginInstanceMapOutput) MapIndex(k pulumi.StringInput) PluginInstanceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *PluginInstance {
		return vs[0].(map[string]*PluginInstance)[vs[1].(string)]
	}).(PluginInstanceOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PluginInstanceInput)(nil)).Elem(), &PluginInstance{})
	pulumi.RegisterInputType(reflect.TypeOf((*PluginInstanceArrayInput)(nil)).Elem(), PluginInstanceArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PluginInstanceMapInput)(nil)).Elem(), PluginInstanceMap{})
	pulumi.RegisterOutputType(PluginInstanceOutput{})
	pulumi.RegisterOutputType(PluginInstanceArrayOutput{})
	pulumi.RegisterOutputType(PluginInstanceMapOutput{})
}
