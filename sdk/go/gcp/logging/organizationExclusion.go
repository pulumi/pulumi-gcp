// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package logging

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages an organization-level logging exclusion. For more information see:
//
// * [API documentation](https://cloud.google.com/logging/docs/reference/v2/rest/v2/organizations.exclusions)
// * How-to Guides
//   - [Excluding Logs](https://cloud.google.com/logging/docs/exclusions)
//
// > You can specify exclusions for log sinks created by the provider by using the exclusions field of `logging.OrganizationSink`
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/logging"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := logging.NewOrganizationExclusion(ctx, "my-exclusion", &logging.OrganizationExclusionArgs{
//				Name:        pulumi.String("my-instance-debug-exclusion"),
//				OrgId:       pulumi.String("123456789"),
//				Description: pulumi.String("Exclude GCE instance debug logs"),
//				Filter:      pulumi.String("resource.type = gce_instance AND severity <= DEBUG"),
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
// Organization-level logging exclusions can be imported using their URI, e.g.
//
// * `organizations/{{organization}}/exclusions/{{name}}`
//
// When using the `pulumi import` command, organization-level logging exclusions can be imported using one of the formats above. For example:
//
// ```sh
// $ pulumi import gcp:logging/organizationExclusion:OrganizationExclusion default organizations/{{organization}}/exclusions/{{name}}
// ```
type OrganizationExclusion struct {
	pulumi.CustomResourceState

	// A human-readable description.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Whether this exclusion rule should be disabled or not. This defaults to
	// false.
	Disabled pulumi.BoolPtrOutput `pulumi:"disabled"`
	// The filter to apply when excluding logs. Only log entries that match the filter are excluded.
	// See [Advanced Log Filters](https://cloud.google.com/logging/docs/view/advanced-filters) for information on how to
	// write a filter.
	Filter pulumi.StringOutput `pulumi:"filter"`
	// The name of the logging exclusion.
	Name pulumi.StringOutput `pulumi:"name"`
	// The organization to create the exclusion in.
	OrgId pulumi.StringOutput `pulumi:"orgId"`
}

// NewOrganizationExclusion registers a new resource with the given unique name, arguments, and options.
func NewOrganizationExclusion(ctx *pulumi.Context,
	name string, args *OrganizationExclusionArgs, opts ...pulumi.ResourceOption) (*OrganizationExclusion, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Filter == nil {
		return nil, errors.New("invalid value for required argument 'Filter'")
	}
	if args.OrgId == nil {
		return nil, errors.New("invalid value for required argument 'OrgId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource OrganizationExclusion
	err := ctx.RegisterResource("gcp:logging/organizationExclusion:OrganizationExclusion", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetOrganizationExclusion gets an existing OrganizationExclusion resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetOrganizationExclusion(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *OrganizationExclusionState, opts ...pulumi.ResourceOption) (*OrganizationExclusion, error) {
	var resource OrganizationExclusion
	err := ctx.ReadResource("gcp:logging/organizationExclusion:OrganizationExclusion", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering OrganizationExclusion resources.
type organizationExclusionState struct {
	// A human-readable description.
	Description *string `pulumi:"description"`
	// Whether this exclusion rule should be disabled or not. This defaults to
	// false.
	Disabled *bool `pulumi:"disabled"`
	// The filter to apply when excluding logs. Only log entries that match the filter are excluded.
	// See [Advanced Log Filters](https://cloud.google.com/logging/docs/view/advanced-filters) for information on how to
	// write a filter.
	Filter *string `pulumi:"filter"`
	// The name of the logging exclusion.
	Name *string `pulumi:"name"`
	// The organization to create the exclusion in.
	OrgId *string `pulumi:"orgId"`
}

type OrganizationExclusionState struct {
	// A human-readable description.
	Description pulumi.StringPtrInput
	// Whether this exclusion rule should be disabled or not. This defaults to
	// false.
	Disabled pulumi.BoolPtrInput
	// The filter to apply when excluding logs. Only log entries that match the filter are excluded.
	// See [Advanced Log Filters](https://cloud.google.com/logging/docs/view/advanced-filters) for information on how to
	// write a filter.
	Filter pulumi.StringPtrInput
	// The name of the logging exclusion.
	Name pulumi.StringPtrInput
	// The organization to create the exclusion in.
	OrgId pulumi.StringPtrInput
}

func (OrganizationExclusionState) ElementType() reflect.Type {
	return reflect.TypeOf((*organizationExclusionState)(nil)).Elem()
}

type organizationExclusionArgs struct {
	// A human-readable description.
	Description *string `pulumi:"description"`
	// Whether this exclusion rule should be disabled or not. This defaults to
	// false.
	Disabled *bool `pulumi:"disabled"`
	// The filter to apply when excluding logs. Only log entries that match the filter are excluded.
	// See [Advanced Log Filters](https://cloud.google.com/logging/docs/view/advanced-filters) for information on how to
	// write a filter.
	Filter string `pulumi:"filter"`
	// The name of the logging exclusion.
	Name *string `pulumi:"name"`
	// The organization to create the exclusion in.
	OrgId string `pulumi:"orgId"`
}

// The set of arguments for constructing a OrganizationExclusion resource.
type OrganizationExclusionArgs struct {
	// A human-readable description.
	Description pulumi.StringPtrInput
	// Whether this exclusion rule should be disabled or not. This defaults to
	// false.
	Disabled pulumi.BoolPtrInput
	// The filter to apply when excluding logs. Only log entries that match the filter are excluded.
	// See [Advanced Log Filters](https://cloud.google.com/logging/docs/view/advanced-filters) for information on how to
	// write a filter.
	Filter pulumi.StringInput
	// The name of the logging exclusion.
	Name pulumi.StringPtrInput
	// The organization to create the exclusion in.
	OrgId pulumi.StringInput
}

func (OrganizationExclusionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*organizationExclusionArgs)(nil)).Elem()
}

type OrganizationExclusionInput interface {
	pulumi.Input

	ToOrganizationExclusionOutput() OrganizationExclusionOutput
	ToOrganizationExclusionOutputWithContext(ctx context.Context) OrganizationExclusionOutput
}

func (*OrganizationExclusion) ElementType() reflect.Type {
	return reflect.TypeOf((**OrganizationExclusion)(nil)).Elem()
}

func (i *OrganizationExclusion) ToOrganizationExclusionOutput() OrganizationExclusionOutput {
	return i.ToOrganizationExclusionOutputWithContext(context.Background())
}

func (i *OrganizationExclusion) ToOrganizationExclusionOutputWithContext(ctx context.Context) OrganizationExclusionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OrganizationExclusionOutput)
}

// OrganizationExclusionArrayInput is an input type that accepts OrganizationExclusionArray and OrganizationExclusionArrayOutput values.
// You can construct a concrete instance of `OrganizationExclusionArrayInput` via:
//
//	OrganizationExclusionArray{ OrganizationExclusionArgs{...} }
type OrganizationExclusionArrayInput interface {
	pulumi.Input

	ToOrganizationExclusionArrayOutput() OrganizationExclusionArrayOutput
	ToOrganizationExclusionArrayOutputWithContext(context.Context) OrganizationExclusionArrayOutput
}

type OrganizationExclusionArray []OrganizationExclusionInput

func (OrganizationExclusionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OrganizationExclusion)(nil)).Elem()
}

func (i OrganizationExclusionArray) ToOrganizationExclusionArrayOutput() OrganizationExclusionArrayOutput {
	return i.ToOrganizationExclusionArrayOutputWithContext(context.Background())
}

func (i OrganizationExclusionArray) ToOrganizationExclusionArrayOutputWithContext(ctx context.Context) OrganizationExclusionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OrganizationExclusionArrayOutput)
}

// OrganizationExclusionMapInput is an input type that accepts OrganizationExclusionMap and OrganizationExclusionMapOutput values.
// You can construct a concrete instance of `OrganizationExclusionMapInput` via:
//
//	OrganizationExclusionMap{ "key": OrganizationExclusionArgs{...} }
type OrganizationExclusionMapInput interface {
	pulumi.Input

	ToOrganizationExclusionMapOutput() OrganizationExclusionMapOutput
	ToOrganizationExclusionMapOutputWithContext(context.Context) OrganizationExclusionMapOutput
}

type OrganizationExclusionMap map[string]OrganizationExclusionInput

func (OrganizationExclusionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OrganizationExclusion)(nil)).Elem()
}

func (i OrganizationExclusionMap) ToOrganizationExclusionMapOutput() OrganizationExclusionMapOutput {
	return i.ToOrganizationExclusionMapOutputWithContext(context.Background())
}

func (i OrganizationExclusionMap) ToOrganizationExclusionMapOutputWithContext(ctx context.Context) OrganizationExclusionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OrganizationExclusionMapOutput)
}

type OrganizationExclusionOutput struct{ *pulumi.OutputState }

func (OrganizationExclusionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**OrganizationExclusion)(nil)).Elem()
}

func (o OrganizationExclusionOutput) ToOrganizationExclusionOutput() OrganizationExclusionOutput {
	return o
}

func (o OrganizationExclusionOutput) ToOrganizationExclusionOutputWithContext(ctx context.Context) OrganizationExclusionOutput {
	return o
}

// A human-readable description.
func (o OrganizationExclusionOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *OrganizationExclusion) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Whether this exclusion rule should be disabled or not. This defaults to
// false.
func (o OrganizationExclusionOutput) Disabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *OrganizationExclusion) pulumi.BoolPtrOutput { return v.Disabled }).(pulumi.BoolPtrOutput)
}

// The filter to apply when excluding logs. Only log entries that match the filter are excluded.
// See [Advanced Log Filters](https://cloud.google.com/logging/docs/view/advanced-filters) for information on how to
// write a filter.
func (o OrganizationExclusionOutput) Filter() pulumi.StringOutput {
	return o.ApplyT(func(v *OrganizationExclusion) pulumi.StringOutput { return v.Filter }).(pulumi.StringOutput)
}

// The name of the logging exclusion.
func (o OrganizationExclusionOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *OrganizationExclusion) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The organization to create the exclusion in.
func (o OrganizationExclusionOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v *OrganizationExclusion) pulumi.StringOutput { return v.OrgId }).(pulumi.StringOutput)
}

type OrganizationExclusionArrayOutput struct{ *pulumi.OutputState }

func (OrganizationExclusionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OrganizationExclusion)(nil)).Elem()
}

func (o OrganizationExclusionArrayOutput) ToOrganizationExclusionArrayOutput() OrganizationExclusionArrayOutput {
	return o
}

func (o OrganizationExclusionArrayOutput) ToOrganizationExclusionArrayOutputWithContext(ctx context.Context) OrganizationExclusionArrayOutput {
	return o
}

func (o OrganizationExclusionArrayOutput) Index(i pulumi.IntInput) OrganizationExclusionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *OrganizationExclusion {
		return vs[0].([]*OrganizationExclusion)[vs[1].(int)]
	}).(OrganizationExclusionOutput)
}

type OrganizationExclusionMapOutput struct{ *pulumi.OutputState }

func (OrganizationExclusionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OrganizationExclusion)(nil)).Elem()
}

func (o OrganizationExclusionMapOutput) ToOrganizationExclusionMapOutput() OrganizationExclusionMapOutput {
	return o
}

func (o OrganizationExclusionMapOutput) ToOrganizationExclusionMapOutputWithContext(ctx context.Context) OrganizationExclusionMapOutput {
	return o
}

func (o OrganizationExclusionMapOutput) MapIndex(k pulumi.StringInput) OrganizationExclusionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *OrganizationExclusion {
		return vs[0].(map[string]*OrganizationExclusion)[vs[1].(string)]
	}).(OrganizationExclusionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*OrganizationExclusionInput)(nil)).Elem(), &OrganizationExclusion{})
	pulumi.RegisterInputType(reflect.TypeOf((*OrganizationExclusionArrayInput)(nil)).Elem(), OrganizationExclusionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*OrganizationExclusionMapInput)(nil)).Elem(), OrganizationExclusionMap{})
	pulumi.RegisterOutputType(OrganizationExclusionOutput{})
	pulumi.RegisterOutputType(OrganizationExclusionArrayOutput{})
	pulumi.RegisterOutputType(OrganizationExclusionMapOutput{})
}
