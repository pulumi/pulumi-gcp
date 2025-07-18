// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package securitycenter

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Represents an instance of an Event Threat Detection custom module, including
// its full module name, display name, enablement state, andlast updated time.
// You can create a custom module at the organization level only.
//
// To get more information about EventThreatDetectionCustomModule, see:
//
// * [API documentation](https://cloud.google.com/security-command-center/docs/reference/rest/v1/organizations.eventThreatDetectionSettings.customModules)
// * How-to Guides
//   - [Overview of custom modules for Event Threat Detection](https://cloud.google.com/security-command-center/docs/custom-modules-etd-overview)
//
// ## Example Usage
//
// ## Import
//
// EventThreatDetectionCustomModule can be imported using any of these accepted formats:
//
// * `organizations/{{organization}}/eventThreatDetectionSettings/customModules/{{name}}`
//
// * `{{organization}}/{{name}}`
//
// When using the `pulumi import` command, EventThreatDetectionCustomModule can be imported using one of the formats above. For example:
//
// ```sh
// $ pulumi import gcp:securitycenter/eventThreatDetectionCustomModule:EventThreatDetectionCustomModule default organizations/{{organization}}/eventThreatDetectionSettings/customModules/{{name}}
// ```
//
// ```sh
// $ pulumi import gcp:securitycenter/eventThreatDetectionCustomModule:EventThreatDetectionCustomModule default {{organization}}/{{name}}
// ```
type EventThreatDetectionCustomModule struct {
	pulumi.CustomResourceState

	// Config for the module. For the resident module, its config value is defined at this level.
	// For the inherited module, its config value is inherited from the ancestor module.
	Config pulumi.StringOutput `pulumi:"config"`
	// The human readable name to be displayed for the module.
	DisplayName pulumi.StringPtrOutput `pulumi:"displayName"`
	// The state of enablement for the module at the given level of the hierarchy.
	// Possible values are: `ENABLED`, `DISABLED`.
	EnablementState pulumi.StringOutput `pulumi:"enablementState"`
	// The editor that last updated the custom module
	LastEditor pulumi.StringOutput `pulumi:"lastEditor"`
	// The resource name of the Event Threat Detection custom module.
	// Its format is "organizations/{organization}/eventThreatDetectionSettings/customModules/{module}".
	Name pulumi.StringOutput `pulumi:"name"`
	// Numerical ID of the parent organization.
	Organization pulumi.StringOutput `pulumi:"organization"`
	// Immutable. Type for the module. e.g. CONFIGURABLE_BAD_IP.
	Type pulumi.StringOutput `pulumi:"type"`
	// The time at which the custom module was last updated.
	// A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and
	// up to nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
	UpdateTime pulumi.StringOutput `pulumi:"updateTime"`
}

// NewEventThreatDetectionCustomModule registers a new resource with the given unique name, arguments, and options.
func NewEventThreatDetectionCustomModule(ctx *pulumi.Context,
	name string, args *EventThreatDetectionCustomModuleArgs, opts ...pulumi.ResourceOption) (*EventThreatDetectionCustomModule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Config == nil {
		return nil, errors.New("invalid value for required argument 'Config'")
	}
	if args.EnablementState == nil {
		return nil, errors.New("invalid value for required argument 'EnablementState'")
	}
	if args.Organization == nil {
		return nil, errors.New("invalid value for required argument 'Organization'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource EventThreatDetectionCustomModule
	err := ctx.RegisterResource("gcp:securitycenter/eventThreatDetectionCustomModule:EventThreatDetectionCustomModule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetEventThreatDetectionCustomModule gets an existing EventThreatDetectionCustomModule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetEventThreatDetectionCustomModule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *EventThreatDetectionCustomModuleState, opts ...pulumi.ResourceOption) (*EventThreatDetectionCustomModule, error) {
	var resource EventThreatDetectionCustomModule
	err := ctx.ReadResource("gcp:securitycenter/eventThreatDetectionCustomModule:EventThreatDetectionCustomModule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering EventThreatDetectionCustomModule resources.
type eventThreatDetectionCustomModuleState struct {
	// Config for the module. For the resident module, its config value is defined at this level.
	// For the inherited module, its config value is inherited from the ancestor module.
	Config *string `pulumi:"config"`
	// The human readable name to be displayed for the module.
	DisplayName *string `pulumi:"displayName"`
	// The state of enablement for the module at the given level of the hierarchy.
	// Possible values are: `ENABLED`, `DISABLED`.
	EnablementState *string `pulumi:"enablementState"`
	// The editor that last updated the custom module
	LastEditor *string `pulumi:"lastEditor"`
	// The resource name of the Event Threat Detection custom module.
	// Its format is "organizations/{organization}/eventThreatDetectionSettings/customModules/{module}".
	Name *string `pulumi:"name"`
	// Numerical ID of the parent organization.
	Organization *string `pulumi:"organization"`
	// Immutable. Type for the module. e.g. CONFIGURABLE_BAD_IP.
	Type *string `pulumi:"type"`
	// The time at which the custom module was last updated.
	// A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and
	// up to nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
	UpdateTime *string `pulumi:"updateTime"`
}

type EventThreatDetectionCustomModuleState struct {
	// Config for the module. For the resident module, its config value is defined at this level.
	// For the inherited module, its config value is inherited from the ancestor module.
	Config pulumi.StringPtrInput
	// The human readable name to be displayed for the module.
	DisplayName pulumi.StringPtrInput
	// The state of enablement for the module at the given level of the hierarchy.
	// Possible values are: `ENABLED`, `DISABLED`.
	EnablementState pulumi.StringPtrInput
	// The editor that last updated the custom module
	LastEditor pulumi.StringPtrInput
	// The resource name of the Event Threat Detection custom module.
	// Its format is "organizations/{organization}/eventThreatDetectionSettings/customModules/{module}".
	Name pulumi.StringPtrInput
	// Numerical ID of the parent organization.
	Organization pulumi.StringPtrInput
	// Immutable. Type for the module. e.g. CONFIGURABLE_BAD_IP.
	Type pulumi.StringPtrInput
	// The time at which the custom module was last updated.
	// A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and
	// up to nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
	UpdateTime pulumi.StringPtrInput
}

func (EventThreatDetectionCustomModuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*eventThreatDetectionCustomModuleState)(nil)).Elem()
}

type eventThreatDetectionCustomModuleArgs struct {
	// Config for the module. For the resident module, its config value is defined at this level.
	// For the inherited module, its config value is inherited from the ancestor module.
	Config string `pulumi:"config"`
	// The human readable name to be displayed for the module.
	DisplayName *string `pulumi:"displayName"`
	// The state of enablement for the module at the given level of the hierarchy.
	// Possible values are: `ENABLED`, `DISABLED`.
	EnablementState string `pulumi:"enablementState"`
	// Numerical ID of the parent organization.
	Organization string `pulumi:"organization"`
	// Immutable. Type for the module. e.g. CONFIGURABLE_BAD_IP.
	Type string `pulumi:"type"`
}

// The set of arguments for constructing a EventThreatDetectionCustomModule resource.
type EventThreatDetectionCustomModuleArgs struct {
	// Config for the module. For the resident module, its config value is defined at this level.
	// For the inherited module, its config value is inherited from the ancestor module.
	Config pulumi.StringInput
	// The human readable name to be displayed for the module.
	DisplayName pulumi.StringPtrInput
	// The state of enablement for the module at the given level of the hierarchy.
	// Possible values are: `ENABLED`, `DISABLED`.
	EnablementState pulumi.StringInput
	// Numerical ID of the parent organization.
	Organization pulumi.StringInput
	// Immutable. Type for the module. e.g. CONFIGURABLE_BAD_IP.
	Type pulumi.StringInput
}

func (EventThreatDetectionCustomModuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*eventThreatDetectionCustomModuleArgs)(nil)).Elem()
}

type EventThreatDetectionCustomModuleInput interface {
	pulumi.Input

	ToEventThreatDetectionCustomModuleOutput() EventThreatDetectionCustomModuleOutput
	ToEventThreatDetectionCustomModuleOutputWithContext(ctx context.Context) EventThreatDetectionCustomModuleOutput
}

func (*EventThreatDetectionCustomModule) ElementType() reflect.Type {
	return reflect.TypeOf((**EventThreatDetectionCustomModule)(nil)).Elem()
}

func (i *EventThreatDetectionCustomModule) ToEventThreatDetectionCustomModuleOutput() EventThreatDetectionCustomModuleOutput {
	return i.ToEventThreatDetectionCustomModuleOutputWithContext(context.Background())
}

func (i *EventThreatDetectionCustomModule) ToEventThreatDetectionCustomModuleOutputWithContext(ctx context.Context) EventThreatDetectionCustomModuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EventThreatDetectionCustomModuleOutput)
}

// EventThreatDetectionCustomModuleArrayInput is an input type that accepts EventThreatDetectionCustomModuleArray and EventThreatDetectionCustomModuleArrayOutput values.
// You can construct a concrete instance of `EventThreatDetectionCustomModuleArrayInput` via:
//
//	EventThreatDetectionCustomModuleArray{ EventThreatDetectionCustomModuleArgs{...} }
type EventThreatDetectionCustomModuleArrayInput interface {
	pulumi.Input

	ToEventThreatDetectionCustomModuleArrayOutput() EventThreatDetectionCustomModuleArrayOutput
	ToEventThreatDetectionCustomModuleArrayOutputWithContext(context.Context) EventThreatDetectionCustomModuleArrayOutput
}

type EventThreatDetectionCustomModuleArray []EventThreatDetectionCustomModuleInput

func (EventThreatDetectionCustomModuleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EventThreatDetectionCustomModule)(nil)).Elem()
}

func (i EventThreatDetectionCustomModuleArray) ToEventThreatDetectionCustomModuleArrayOutput() EventThreatDetectionCustomModuleArrayOutput {
	return i.ToEventThreatDetectionCustomModuleArrayOutputWithContext(context.Background())
}

func (i EventThreatDetectionCustomModuleArray) ToEventThreatDetectionCustomModuleArrayOutputWithContext(ctx context.Context) EventThreatDetectionCustomModuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EventThreatDetectionCustomModuleArrayOutput)
}

// EventThreatDetectionCustomModuleMapInput is an input type that accepts EventThreatDetectionCustomModuleMap and EventThreatDetectionCustomModuleMapOutput values.
// You can construct a concrete instance of `EventThreatDetectionCustomModuleMapInput` via:
//
//	EventThreatDetectionCustomModuleMap{ "key": EventThreatDetectionCustomModuleArgs{...} }
type EventThreatDetectionCustomModuleMapInput interface {
	pulumi.Input

	ToEventThreatDetectionCustomModuleMapOutput() EventThreatDetectionCustomModuleMapOutput
	ToEventThreatDetectionCustomModuleMapOutputWithContext(context.Context) EventThreatDetectionCustomModuleMapOutput
}

type EventThreatDetectionCustomModuleMap map[string]EventThreatDetectionCustomModuleInput

func (EventThreatDetectionCustomModuleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EventThreatDetectionCustomModule)(nil)).Elem()
}

func (i EventThreatDetectionCustomModuleMap) ToEventThreatDetectionCustomModuleMapOutput() EventThreatDetectionCustomModuleMapOutput {
	return i.ToEventThreatDetectionCustomModuleMapOutputWithContext(context.Background())
}

func (i EventThreatDetectionCustomModuleMap) ToEventThreatDetectionCustomModuleMapOutputWithContext(ctx context.Context) EventThreatDetectionCustomModuleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EventThreatDetectionCustomModuleMapOutput)
}

type EventThreatDetectionCustomModuleOutput struct{ *pulumi.OutputState }

func (EventThreatDetectionCustomModuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**EventThreatDetectionCustomModule)(nil)).Elem()
}

func (o EventThreatDetectionCustomModuleOutput) ToEventThreatDetectionCustomModuleOutput() EventThreatDetectionCustomModuleOutput {
	return o
}

func (o EventThreatDetectionCustomModuleOutput) ToEventThreatDetectionCustomModuleOutputWithContext(ctx context.Context) EventThreatDetectionCustomModuleOutput {
	return o
}

// Config for the module. For the resident module, its config value is defined at this level.
// For the inherited module, its config value is inherited from the ancestor module.
func (o EventThreatDetectionCustomModuleOutput) Config() pulumi.StringOutput {
	return o.ApplyT(func(v *EventThreatDetectionCustomModule) pulumi.StringOutput { return v.Config }).(pulumi.StringOutput)
}

// The human readable name to be displayed for the module.
func (o EventThreatDetectionCustomModuleOutput) DisplayName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EventThreatDetectionCustomModule) pulumi.StringPtrOutput { return v.DisplayName }).(pulumi.StringPtrOutput)
}

// The state of enablement for the module at the given level of the hierarchy.
// Possible values are: `ENABLED`, `DISABLED`.
func (o EventThreatDetectionCustomModuleOutput) EnablementState() pulumi.StringOutput {
	return o.ApplyT(func(v *EventThreatDetectionCustomModule) pulumi.StringOutput { return v.EnablementState }).(pulumi.StringOutput)
}

// The editor that last updated the custom module
func (o EventThreatDetectionCustomModuleOutput) LastEditor() pulumi.StringOutput {
	return o.ApplyT(func(v *EventThreatDetectionCustomModule) pulumi.StringOutput { return v.LastEditor }).(pulumi.StringOutput)
}

// The resource name of the Event Threat Detection custom module.
// Its format is "organizations/{organization}/eventThreatDetectionSettings/customModules/{module}".
func (o EventThreatDetectionCustomModuleOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *EventThreatDetectionCustomModule) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Numerical ID of the parent organization.
func (o EventThreatDetectionCustomModuleOutput) Organization() pulumi.StringOutput {
	return o.ApplyT(func(v *EventThreatDetectionCustomModule) pulumi.StringOutput { return v.Organization }).(pulumi.StringOutput)
}

// Immutable. Type for the module. e.g. CONFIGURABLE_BAD_IP.
func (o EventThreatDetectionCustomModuleOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *EventThreatDetectionCustomModule) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

// The time at which the custom module was last updated.
// A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and
// up to nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
func (o EventThreatDetectionCustomModuleOutput) UpdateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *EventThreatDetectionCustomModule) pulumi.StringOutput { return v.UpdateTime }).(pulumi.StringOutput)
}

type EventThreatDetectionCustomModuleArrayOutput struct{ *pulumi.OutputState }

func (EventThreatDetectionCustomModuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EventThreatDetectionCustomModule)(nil)).Elem()
}

func (o EventThreatDetectionCustomModuleArrayOutput) ToEventThreatDetectionCustomModuleArrayOutput() EventThreatDetectionCustomModuleArrayOutput {
	return o
}

func (o EventThreatDetectionCustomModuleArrayOutput) ToEventThreatDetectionCustomModuleArrayOutputWithContext(ctx context.Context) EventThreatDetectionCustomModuleArrayOutput {
	return o
}

func (o EventThreatDetectionCustomModuleArrayOutput) Index(i pulumi.IntInput) EventThreatDetectionCustomModuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *EventThreatDetectionCustomModule {
		return vs[0].([]*EventThreatDetectionCustomModule)[vs[1].(int)]
	}).(EventThreatDetectionCustomModuleOutput)
}

type EventThreatDetectionCustomModuleMapOutput struct{ *pulumi.OutputState }

func (EventThreatDetectionCustomModuleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EventThreatDetectionCustomModule)(nil)).Elem()
}

func (o EventThreatDetectionCustomModuleMapOutput) ToEventThreatDetectionCustomModuleMapOutput() EventThreatDetectionCustomModuleMapOutput {
	return o
}

func (o EventThreatDetectionCustomModuleMapOutput) ToEventThreatDetectionCustomModuleMapOutputWithContext(ctx context.Context) EventThreatDetectionCustomModuleMapOutput {
	return o
}

func (o EventThreatDetectionCustomModuleMapOutput) MapIndex(k pulumi.StringInput) EventThreatDetectionCustomModuleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *EventThreatDetectionCustomModule {
		return vs[0].(map[string]*EventThreatDetectionCustomModule)[vs[1].(string)]
	}).(EventThreatDetectionCustomModuleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*EventThreatDetectionCustomModuleInput)(nil)).Elem(), &EventThreatDetectionCustomModule{})
	pulumi.RegisterInputType(reflect.TypeOf((*EventThreatDetectionCustomModuleArrayInput)(nil)).Elem(), EventThreatDetectionCustomModuleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*EventThreatDetectionCustomModuleMapInput)(nil)).Elem(), EventThreatDetectionCustomModuleMap{})
	pulumi.RegisterOutputType(EventThreatDetectionCustomModuleOutput{})
	pulumi.RegisterOutputType(EventThreatDetectionCustomModuleArrayOutput{})
	pulumi.RegisterOutputType(EventThreatDetectionCustomModuleMapOutput{})
}
