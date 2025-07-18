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

// Manages a project-level logging exclusion. For more information see:
//
// * [API documentation](https://cloud.google.com/logging/docs/reference/v2/rest/v2/projects.exclusions)
// * How-to Guides
//   - [Excluding Logs](https://cloud.google.com/logging/docs/exclusions)
//
// > You can specify exclusions for log sinks created by the provider by using the exclusions field of `logging.ProjectSink`
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
//			_, err := logging.NewProjectExclusion(ctx, "my-exclusion", &logging.ProjectExclusionArgs{
//				Name:        pulumi.String("my-instance-debug-exclusion"),
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
// Project-level logging exclusions can be imported using their URI, e.g.
//
// * `projects/{{project_id}}/exclusions/{{name}}`
//
// When using the `pulumi import` command, project-level logging exclusions can be imported using one of the formats above. For example:
//
// ```sh
// $ pulumi import gcp:logging/projectExclusion:ProjectExclusion default projects/{{project_id}}/exclusions/{{name}}
// ```
type ProjectExclusion struct {
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
	// The project to create the exclusion in. If omitted, the project associated with the provider is
	// used.
	Project pulumi.StringOutput `pulumi:"project"`
}

// NewProjectExclusion registers a new resource with the given unique name, arguments, and options.
func NewProjectExclusion(ctx *pulumi.Context,
	name string, args *ProjectExclusionArgs, opts ...pulumi.ResourceOption) (*ProjectExclusion, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Filter == nil {
		return nil, errors.New("invalid value for required argument 'Filter'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ProjectExclusion
	err := ctx.RegisterResource("gcp:logging/projectExclusion:ProjectExclusion", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetProjectExclusion gets an existing ProjectExclusion resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetProjectExclusion(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ProjectExclusionState, opts ...pulumi.ResourceOption) (*ProjectExclusion, error) {
	var resource ProjectExclusion
	err := ctx.ReadResource("gcp:logging/projectExclusion:ProjectExclusion", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ProjectExclusion resources.
type projectExclusionState struct {
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
	// The project to create the exclusion in. If omitted, the project associated with the provider is
	// used.
	Project *string `pulumi:"project"`
}

type ProjectExclusionState struct {
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
	// The project to create the exclusion in. If omitted, the project associated with the provider is
	// used.
	Project pulumi.StringPtrInput
}

func (ProjectExclusionState) ElementType() reflect.Type {
	return reflect.TypeOf((*projectExclusionState)(nil)).Elem()
}

type projectExclusionArgs struct {
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
	// The project to create the exclusion in. If omitted, the project associated with the provider is
	// used.
	Project *string `pulumi:"project"`
}

// The set of arguments for constructing a ProjectExclusion resource.
type ProjectExclusionArgs struct {
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
	// The project to create the exclusion in. If omitted, the project associated with the provider is
	// used.
	Project pulumi.StringPtrInput
}

func (ProjectExclusionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*projectExclusionArgs)(nil)).Elem()
}

type ProjectExclusionInput interface {
	pulumi.Input

	ToProjectExclusionOutput() ProjectExclusionOutput
	ToProjectExclusionOutputWithContext(ctx context.Context) ProjectExclusionOutput
}

func (*ProjectExclusion) ElementType() reflect.Type {
	return reflect.TypeOf((**ProjectExclusion)(nil)).Elem()
}

func (i *ProjectExclusion) ToProjectExclusionOutput() ProjectExclusionOutput {
	return i.ToProjectExclusionOutputWithContext(context.Background())
}

func (i *ProjectExclusion) ToProjectExclusionOutputWithContext(ctx context.Context) ProjectExclusionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectExclusionOutput)
}

// ProjectExclusionArrayInput is an input type that accepts ProjectExclusionArray and ProjectExclusionArrayOutput values.
// You can construct a concrete instance of `ProjectExclusionArrayInput` via:
//
//	ProjectExclusionArray{ ProjectExclusionArgs{...} }
type ProjectExclusionArrayInput interface {
	pulumi.Input

	ToProjectExclusionArrayOutput() ProjectExclusionArrayOutput
	ToProjectExclusionArrayOutputWithContext(context.Context) ProjectExclusionArrayOutput
}

type ProjectExclusionArray []ProjectExclusionInput

func (ProjectExclusionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ProjectExclusion)(nil)).Elem()
}

func (i ProjectExclusionArray) ToProjectExclusionArrayOutput() ProjectExclusionArrayOutput {
	return i.ToProjectExclusionArrayOutputWithContext(context.Background())
}

func (i ProjectExclusionArray) ToProjectExclusionArrayOutputWithContext(ctx context.Context) ProjectExclusionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectExclusionArrayOutput)
}

// ProjectExclusionMapInput is an input type that accepts ProjectExclusionMap and ProjectExclusionMapOutput values.
// You can construct a concrete instance of `ProjectExclusionMapInput` via:
//
//	ProjectExclusionMap{ "key": ProjectExclusionArgs{...} }
type ProjectExclusionMapInput interface {
	pulumi.Input

	ToProjectExclusionMapOutput() ProjectExclusionMapOutput
	ToProjectExclusionMapOutputWithContext(context.Context) ProjectExclusionMapOutput
}

type ProjectExclusionMap map[string]ProjectExclusionInput

func (ProjectExclusionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ProjectExclusion)(nil)).Elem()
}

func (i ProjectExclusionMap) ToProjectExclusionMapOutput() ProjectExclusionMapOutput {
	return i.ToProjectExclusionMapOutputWithContext(context.Background())
}

func (i ProjectExclusionMap) ToProjectExclusionMapOutputWithContext(ctx context.Context) ProjectExclusionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectExclusionMapOutput)
}

type ProjectExclusionOutput struct{ *pulumi.OutputState }

func (ProjectExclusionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ProjectExclusion)(nil)).Elem()
}

func (o ProjectExclusionOutput) ToProjectExclusionOutput() ProjectExclusionOutput {
	return o
}

func (o ProjectExclusionOutput) ToProjectExclusionOutputWithContext(ctx context.Context) ProjectExclusionOutput {
	return o
}

// A human-readable description.
func (o ProjectExclusionOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ProjectExclusion) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Whether this exclusion rule should be disabled or not. This defaults to
// false.
func (o ProjectExclusionOutput) Disabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ProjectExclusion) pulumi.BoolPtrOutput { return v.Disabled }).(pulumi.BoolPtrOutput)
}

// The filter to apply when excluding logs. Only log entries that match the filter are excluded.
// See [Advanced Log Filters](https://cloud.google.com/logging/docs/view/advanced-filters) for information on how to
// write a filter.
func (o ProjectExclusionOutput) Filter() pulumi.StringOutput {
	return o.ApplyT(func(v *ProjectExclusion) pulumi.StringOutput { return v.Filter }).(pulumi.StringOutput)
}

// The name of the logging exclusion.
func (o ProjectExclusionOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ProjectExclusion) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The project to create the exclusion in. If omitted, the project associated with the provider is
// used.
func (o ProjectExclusionOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *ProjectExclusion) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

type ProjectExclusionArrayOutput struct{ *pulumi.OutputState }

func (ProjectExclusionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ProjectExclusion)(nil)).Elem()
}

func (o ProjectExclusionArrayOutput) ToProjectExclusionArrayOutput() ProjectExclusionArrayOutput {
	return o
}

func (o ProjectExclusionArrayOutput) ToProjectExclusionArrayOutputWithContext(ctx context.Context) ProjectExclusionArrayOutput {
	return o
}

func (o ProjectExclusionArrayOutput) Index(i pulumi.IntInput) ProjectExclusionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ProjectExclusion {
		return vs[0].([]*ProjectExclusion)[vs[1].(int)]
	}).(ProjectExclusionOutput)
}

type ProjectExclusionMapOutput struct{ *pulumi.OutputState }

func (ProjectExclusionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ProjectExclusion)(nil)).Elem()
}

func (o ProjectExclusionMapOutput) ToProjectExclusionMapOutput() ProjectExclusionMapOutput {
	return o
}

func (o ProjectExclusionMapOutput) ToProjectExclusionMapOutputWithContext(ctx context.Context) ProjectExclusionMapOutput {
	return o
}

func (o ProjectExclusionMapOutput) MapIndex(k pulumi.StringInput) ProjectExclusionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ProjectExclusion {
		return vs[0].(map[string]*ProjectExclusion)[vs[1].(string)]
	}).(ProjectExclusionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectExclusionInput)(nil)).Elem(), &ProjectExclusion{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectExclusionArrayInput)(nil)).Elem(), ProjectExclusionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectExclusionMapInput)(nil)).Elem(), ProjectExclusionMap{})
	pulumi.RegisterOutputType(ProjectExclusionOutput{})
	pulumi.RegisterOutputType(ProjectExclusionArrayOutput{})
	pulumi.RegisterOutputType(ProjectExclusionMapOutput{})
}
