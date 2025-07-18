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

// Describes a view over log entries in a bucket.
//
// To get more information about LogView, see:
//
// * [API documentation](https://cloud.google.com/logging/docs/reference/v2/rest/v2/projects.locations.buckets.views)
// * How-to Guides
//   - [Official Documentation](https://cloud.google.com/logging/docs/apis)
//
// ## Example Usage
//
// ### Logging Log View Basic
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
//			loggingLogView, err := logging.NewProjectBucketConfig(ctx, "logging_log_view", &logging.ProjectBucketConfigArgs{
//				Project:       pulumi.String("my-project-name"),
//				Location:      pulumi.String("global"),
//				RetentionDays: pulumi.Int(30),
//				BucketId:      pulumi.String("_Default"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = logging.NewLogView(ctx, "logging_log_view", &logging.LogViewArgs{
//				Name:        pulumi.String("my-view"),
//				Bucket:      loggingLogView.ID(),
//				Description: pulumi.String("A logging view configured with Terraform"),
//				Filter:      pulumi.String("SOURCE(\"projects/myproject\") AND resource.type = \"gce_instance\" AND LOG_ID(\"stdout\")"),
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
// LogView can be imported using any of these accepted formats:
//
// * `{{parent}}/locations/{{location}}/buckets/{{bucket}}/views/{{name}}`
//
// When using the `pulumi import` command, LogView can be imported using one of the formats above. For example:
//
// ```sh
// $ pulumi import gcp:logging/logView:LogView default {{parent}}/locations/{{location}}/buckets/{{bucket}}/views/{{name}}
// ```
type LogView struct {
	pulumi.CustomResourceState

	// The bucket of the resource
	Bucket pulumi.StringOutput `pulumi:"bucket"`
	// Output only. The creation timestamp of the view.
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// Describes this view.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Filter that restricts which log entries in a bucket are visible in this view. Filters are restricted to be a logical AND of ==/!= of any of the following: - originating project/folder/organization/billing account. - resource type - log id For example: SOURCE("projects/myproject") AND resource.type = "gceInstance" AND LOG_ID("stdout")
	Filter pulumi.StringPtrOutput `pulumi:"filter"`
	// The location of the resource. The supported locations are: global, us-central1, us-east1, us-west1, asia-east1, europe-west1.
	Location pulumi.StringOutput `pulumi:"location"`
	// The resource name of the view. For example: \`projects/my-project/locations/global/buckets/my-bucket/views/my-view\`
	Name pulumi.StringOutput `pulumi:"name"`
	// The parent of the resource.
	Parent pulumi.StringOutput `pulumi:"parent"`
	// Output only. The last update timestamp of the view.
	UpdateTime pulumi.StringOutput `pulumi:"updateTime"`
}

// NewLogView registers a new resource with the given unique name, arguments, and options.
func NewLogView(ctx *pulumi.Context,
	name string, args *LogViewArgs, opts ...pulumi.ResourceOption) (*LogView, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Bucket == nil {
		return nil, errors.New("invalid value for required argument 'Bucket'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource LogView
	err := ctx.RegisterResource("gcp:logging/logView:LogView", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLogView gets an existing LogView resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLogView(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LogViewState, opts ...pulumi.ResourceOption) (*LogView, error) {
	var resource LogView
	err := ctx.ReadResource("gcp:logging/logView:LogView", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering LogView resources.
type logViewState struct {
	// The bucket of the resource
	Bucket *string `pulumi:"bucket"`
	// Output only. The creation timestamp of the view.
	CreateTime *string `pulumi:"createTime"`
	// Describes this view.
	Description *string `pulumi:"description"`
	// Filter that restricts which log entries in a bucket are visible in this view. Filters are restricted to be a logical AND of ==/!= of any of the following: - originating project/folder/organization/billing account. - resource type - log id For example: SOURCE("projects/myproject") AND resource.type = "gceInstance" AND LOG_ID("stdout")
	Filter *string `pulumi:"filter"`
	// The location of the resource. The supported locations are: global, us-central1, us-east1, us-west1, asia-east1, europe-west1.
	Location *string `pulumi:"location"`
	// The resource name of the view. For example: \`projects/my-project/locations/global/buckets/my-bucket/views/my-view\`
	Name *string `pulumi:"name"`
	// The parent of the resource.
	Parent *string `pulumi:"parent"`
	// Output only. The last update timestamp of the view.
	UpdateTime *string `pulumi:"updateTime"`
}

type LogViewState struct {
	// The bucket of the resource
	Bucket pulumi.StringPtrInput
	// Output only. The creation timestamp of the view.
	CreateTime pulumi.StringPtrInput
	// Describes this view.
	Description pulumi.StringPtrInput
	// Filter that restricts which log entries in a bucket are visible in this view. Filters are restricted to be a logical AND of ==/!= of any of the following: - originating project/folder/organization/billing account. - resource type - log id For example: SOURCE("projects/myproject") AND resource.type = "gceInstance" AND LOG_ID("stdout")
	Filter pulumi.StringPtrInput
	// The location of the resource. The supported locations are: global, us-central1, us-east1, us-west1, asia-east1, europe-west1.
	Location pulumi.StringPtrInput
	// The resource name of the view. For example: \`projects/my-project/locations/global/buckets/my-bucket/views/my-view\`
	Name pulumi.StringPtrInput
	// The parent of the resource.
	Parent pulumi.StringPtrInput
	// Output only. The last update timestamp of the view.
	UpdateTime pulumi.StringPtrInput
}

func (LogViewState) ElementType() reflect.Type {
	return reflect.TypeOf((*logViewState)(nil)).Elem()
}

type logViewArgs struct {
	// The bucket of the resource
	Bucket string `pulumi:"bucket"`
	// Describes this view.
	Description *string `pulumi:"description"`
	// Filter that restricts which log entries in a bucket are visible in this view. Filters are restricted to be a logical AND of ==/!= of any of the following: - originating project/folder/organization/billing account. - resource type - log id For example: SOURCE("projects/myproject") AND resource.type = "gceInstance" AND LOG_ID("stdout")
	Filter *string `pulumi:"filter"`
	// The location of the resource. The supported locations are: global, us-central1, us-east1, us-west1, asia-east1, europe-west1.
	Location *string `pulumi:"location"`
	// The resource name of the view. For example: \`projects/my-project/locations/global/buckets/my-bucket/views/my-view\`
	Name *string `pulumi:"name"`
	// The parent of the resource.
	Parent *string `pulumi:"parent"`
}

// The set of arguments for constructing a LogView resource.
type LogViewArgs struct {
	// The bucket of the resource
	Bucket pulumi.StringInput
	// Describes this view.
	Description pulumi.StringPtrInput
	// Filter that restricts which log entries in a bucket are visible in this view. Filters are restricted to be a logical AND of ==/!= of any of the following: - originating project/folder/organization/billing account. - resource type - log id For example: SOURCE("projects/myproject") AND resource.type = "gceInstance" AND LOG_ID("stdout")
	Filter pulumi.StringPtrInput
	// The location of the resource. The supported locations are: global, us-central1, us-east1, us-west1, asia-east1, europe-west1.
	Location pulumi.StringPtrInput
	// The resource name of the view. For example: \`projects/my-project/locations/global/buckets/my-bucket/views/my-view\`
	Name pulumi.StringPtrInput
	// The parent of the resource.
	Parent pulumi.StringPtrInput
}

func (LogViewArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*logViewArgs)(nil)).Elem()
}

type LogViewInput interface {
	pulumi.Input

	ToLogViewOutput() LogViewOutput
	ToLogViewOutputWithContext(ctx context.Context) LogViewOutput
}

func (*LogView) ElementType() reflect.Type {
	return reflect.TypeOf((**LogView)(nil)).Elem()
}

func (i *LogView) ToLogViewOutput() LogViewOutput {
	return i.ToLogViewOutputWithContext(context.Background())
}

func (i *LogView) ToLogViewOutputWithContext(ctx context.Context) LogViewOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LogViewOutput)
}

// LogViewArrayInput is an input type that accepts LogViewArray and LogViewArrayOutput values.
// You can construct a concrete instance of `LogViewArrayInput` via:
//
//	LogViewArray{ LogViewArgs{...} }
type LogViewArrayInput interface {
	pulumi.Input

	ToLogViewArrayOutput() LogViewArrayOutput
	ToLogViewArrayOutputWithContext(context.Context) LogViewArrayOutput
}

type LogViewArray []LogViewInput

func (LogViewArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LogView)(nil)).Elem()
}

func (i LogViewArray) ToLogViewArrayOutput() LogViewArrayOutput {
	return i.ToLogViewArrayOutputWithContext(context.Background())
}

func (i LogViewArray) ToLogViewArrayOutputWithContext(ctx context.Context) LogViewArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LogViewArrayOutput)
}

// LogViewMapInput is an input type that accepts LogViewMap and LogViewMapOutput values.
// You can construct a concrete instance of `LogViewMapInput` via:
//
//	LogViewMap{ "key": LogViewArgs{...} }
type LogViewMapInput interface {
	pulumi.Input

	ToLogViewMapOutput() LogViewMapOutput
	ToLogViewMapOutputWithContext(context.Context) LogViewMapOutput
}

type LogViewMap map[string]LogViewInput

func (LogViewMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LogView)(nil)).Elem()
}

func (i LogViewMap) ToLogViewMapOutput() LogViewMapOutput {
	return i.ToLogViewMapOutputWithContext(context.Background())
}

func (i LogViewMap) ToLogViewMapOutputWithContext(ctx context.Context) LogViewMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LogViewMapOutput)
}

type LogViewOutput struct{ *pulumi.OutputState }

func (LogViewOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**LogView)(nil)).Elem()
}

func (o LogViewOutput) ToLogViewOutput() LogViewOutput {
	return o
}

func (o LogViewOutput) ToLogViewOutputWithContext(ctx context.Context) LogViewOutput {
	return o
}

// The bucket of the resource
func (o LogViewOutput) Bucket() pulumi.StringOutput {
	return o.ApplyT(func(v *LogView) pulumi.StringOutput { return v.Bucket }).(pulumi.StringOutput)
}

// Output only. The creation timestamp of the view.
func (o LogViewOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *LogView) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// Describes this view.
func (o LogViewOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *LogView) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Filter that restricts which log entries in a bucket are visible in this view. Filters are restricted to be a logical AND of ==/!= of any of the following: - originating project/folder/organization/billing account. - resource type - log id For example: SOURCE("projects/myproject") AND resource.type = "gceInstance" AND LOG_ID("stdout")
func (o LogViewOutput) Filter() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *LogView) pulumi.StringPtrOutput { return v.Filter }).(pulumi.StringPtrOutput)
}

// The location of the resource. The supported locations are: global, us-central1, us-east1, us-west1, asia-east1, europe-west1.
func (o LogViewOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *LogView) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// The resource name of the view. For example: \`projects/my-project/locations/global/buckets/my-bucket/views/my-view\`
func (o LogViewOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *LogView) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The parent of the resource.
func (o LogViewOutput) Parent() pulumi.StringOutput {
	return o.ApplyT(func(v *LogView) pulumi.StringOutput { return v.Parent }).(pulumi.StringOutput)
}

// Output only. The last update timestamp of the view.
func (o LogViewOutput) UpdateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *LogView) pulumi.StringOutput { return v.UpdateTime }).(pulumi.StringOutput)
}

type LogViewArrayOutput struct{ *pulumi.OutputState }

func (LogViewArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LogView)(nil)).Elem()
}

func (o LogViewArrayOutput) ToLogViewArrayOutput() LogViewArrayOutput {
	return o
}

func (o LogViewArrayOutput) ToLogViewArrayOutputWithContext(ctx context.Context) LogViewArrayOutput {
	return o
}

func (o LogViewArrayOutput) Index(i pulumi.IntInput) LogViewOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *LogView {
		return vs[0].([]*LogView)[vs[1].(int)]
	}).(LogViewOutput)
}

type LogViewMapOutput struct{ *pulumi.OutputState }

func (LogViewMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LogView)(nil)).Elem()
}

func (o LogViewMapOutput) ToLogViewMapOutput() LogViewMapOutput {
	return o
}

func (o LogViewMapOutput) ToLogViewMapOutputWithContext(ctx context.Context) LogViewMapOutput {
	return o
}

func (o LogViewMapOutput) MapIndex(k pulumi.StringInput) LogViewOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *LogView {
		return vs[0].(map[string]*LogView)[vs[1].(string)]
	}).(LogViewOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*LogViewInput)(nil)).Elem(), &LogView{})
	pulumi.RegisterInputType(reflect.TypeOf((*LogViewArrayInput)(nil)).Elem(), LogViewArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*LogViewMapInput)(nil)).Elem(), LogViewMap{})
	pulumi.RegisterOutputType(LogViewOutput{})
	pulumi.RegisterOutputType(LogViewArrayOutput{})
	pulumi.RegisterOutputType(LogViewMapOutput{})
}
