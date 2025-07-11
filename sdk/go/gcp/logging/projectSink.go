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

// ## Import
//
// Project-level logging sinks can be imported using their URI, e.g.
//
// * `projects/{{project_id}}/sinks/{{name}}`
//
// When using the `pulumi import` command, project-level logging sinks can be imported using one of the formats above. For example:
//
// ```sh
// $ pulumi import gcp:logging/projectSink:ProjectSink default projects/{{project_id}}/sinks/{{name}}
// ```
type ProjectSink struct {
	pulumi.CustomResourceState

	// Options that affect sinks exporting data to BigQuery. Structure documented below.
	BigqueryOptions ProjectSinkBigqueryOptionsOutput `pulumi:"bigqueryOptions"`
	// A user managed service account that will be used to write
	// the log entries. The format must be `serviceAccount:some@email`. This field can only be specified if you are
	// routing logs to a destination outside this sink's project. If not specified, a Logging service account
	// will automatically be generated.
	CustomWriterIdentity pulumi.StringPtrOutput `pulumi:"customWriterIdentity"`
	// A description of this sink. The maximum length of the description is 8000 characters.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The destination of the sink (or, in other words, where logs are written to). Can be a Cloud Storage bucket, a PubSub topic, a BigQuery dataset, a Cloud Logging bucket, or a Google Cloud project. Examples:
	//
	// - `storage.googleapis.com/[GCS_BUCKET]`
	// - `bigquery.googleapis.com/projects/[PROJECT_ID]/datasets/[DATASET]`
	// - `pubsub.googleapis.com/projects/[PROJECT_ID]/topics/[TOPIC_ID]`
	// - `logging.googleapis.com/projects/[PROJECT_ID]/locations/global/buckets/[BUCKET_ID]`
	// - `logging.googleapis.com/projects/[PROJECT_ID]`
	//
	// The writer associated with the sink must have access to write to the above resource.
	Destination pulumi.StringOutput `pulumi:"destination"`
	// If set to True, then this sink is disabled and it does not export any log entries.
	Disabled pulumi.BoolPtrOutput `pulumi:"disabled"`
	// Log entries that match any of the exclusion filters will not be exported. If a log entry is matched by both `filter` and one of `exclusions.filter`, it will not be exported.  Can be repeated multiple times for multiple exclusions. Structure is documented below.
	Exclusions ProjectSinkExclusionArrayOutput `pulumi:"exclusions"`
	// The filter to apply when exporting logs. Only log entries that match the filter are exported.
	// See [Advanced Log Filters](https://cloud.google.com/logging/docs/view/advanced_filters) for information on how to
	// write a filter.
	Filter pulumi.StringPtrOutput `pulumi:"filter"`
	// The name of the logging sink. Logging automatically creates two sinks: `_Required` and `_Default`.
	Name pulumi.StringOutput `pulumi:"name"`
	// The ID of the project to create the sink in. If omitted, the project associated with the provider is
	// used.
	Project pulumi.StringOutput `pulumi:"project"`
	// Whether or not to create a unique identity associated with this sink. If `false`, then the `writerIdentity` used is `serviceAccount:cloud-logs@system.gserviceaccount.com`. If `true` (the default),
	// then a unique service account is created and used for this sink. If you wish to publish logs across projects or utilize
	// `bigqueryOptions`, you must set `uniqueWriterIdentity` to true.
	UniqueWriterIdentity pulumi.BoolPtrOutput `pulumi:"uniqueWriterIdentity"`
	// The identity associated with this sink. This identity must be granted write access to the
	// configured `destination`.
	WriterIdentity pulumi.StringOutput `pulumi:"writerIdentity"`
}

// NewProjectSink registers a new resource with the given unique name, arguments, and options.
func NewProjectSink(ctx *pulumi.Context,
	name string, args *ProjectSinkArgs, opts ...pulumi.ResourceOption) (*ProjectSink, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Destination == nil {
		return nil, errors.New("invalid value for required argument 'Destination'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ProjectSink
	err := ctx.RegisterResource("gcp:logging/projectSink:ProjectSink", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetProjectSink gets an existing ProjectSink resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetProjectSink(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ProjectSinkState, opts ...pulumi.ResourceOption) (*ProjectSink, error) {
	var resource ProjectSink
	err := ctx.ReadResource("gcp:logging/projectSink:ProjectSink", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ProjectSink resources.
type projectSinkState struct {
	// Options that affect sinks exporting data to BigQuery. Structure documented below.
	BigqueryOptions *ProjectSinkBigqueryOptions `pulumi:"bigqueryOptions"`
	// A user managed service account that will be used to write
	// the log entries. The format must be `serviceAccount:some@email`. This field can only be specified if you are
	// routing logs to a destination outside this sink's project. If not specified, a Logging service account
	// will automatically be generated.
	CustomWriterIdentity *string `pulumi:"customWriterIdentity"`
	// A description of this sink. The maximum length of the description is 8000 characters.
	Description *string `pulumi:"description"`
	// The destination of the sink (or, in other words, where logs are written to). Can be a Cloud Storage bucket, a PubSub topic, a BigQuery dataset, a Cloud Logging bucket, or a Google Cloud project. Examples:
	//
	// - `storage.googleapis.com/[GCS_BUCKET]`
	// - `bigquery.googleapis.com/projects/[PROJECT_ID]/datasets/[DATASET]`
	// - `pubsub.googleapis.com/projects/[PROJECT_ID]/topics/[TOPIC_ID]`
	// - `logging.googleapis.com/projects/[PROJECT_ID]/locations/global/buckets/[BUCKET_ID]`
	// - `logging.googleapis.com/projects/[PROJECT_ID]`
	//
	// The writer associated with the sink must have access to write to the above resource.
	Destination *string `pulumi:"destination"`
	// If set to True, then this sink is disabled and it does not export any log entries.
	Disabled *bool `pulumi:"disabled"`
	// Log entries that match any of the exclusion filters will not be exported. If a log entry is matched by both `filter` and one of `exclusions.filter`, it will not be exported.  Can be repeated multiple times for multiple exclusions. Structure is documented below.
	Exclusions []ProjectSinkExclusion `pulumi:"exclusions"`
	// The filter to apply when exporting logs. Only log entries that match the filter are exported.
	// See [Advanced Log Filters](https://cloud.google.com/logging/docs/view/advanced_filters) for information on how to
	// write a filter.
	Filter *string `pulumi:"filter"`
	// The name of the logging sink. Logging automatically creates two sinks: `_Required` and `_Default`.
	Name *string `pulumi:"name"`
	// The ID of the project to create the sink in. If omitted, the project associated with the provider is
	// used.
	Project *string `pulumi:"project"`
	// Whether or not to create a unique identity associated with this sink. If `false`, then the `writerIdentity` used is `serviceAccount:cloud-logs@system.gserviceaccount.com`. If `true` (the default),
	// then a unique service account is created and used for this sink. If you wish to publish logs across projects or utilize
	// `bigqueryOptions`, you must set `uniqueWriterIdentity` to true.
	UniqueWriterIdentity *bool `pulumi:"uniqueWriterIdentity"`
	// The identity associated with this sink. This identity must be granted write access to the
	// configured `destination`.
	WriterIdentity *string `pulumi:"writerIdentity"`
}

type ProjectSinkState struct {
	// Options that affect sinks exporting data to BigQuery. Structure documented below.
	BigqueryOptions ProjectSinkBigqueryOptionsPtrInput
	// A user managed service account that will be used to write
	// the log entries. The format must be `serviceAccount:some@email`. This field can only be specified if you are
	// routing logs to a destination outside this sink's project. If not specified, a Logging service account
	// will automatically be generated.
	CustomWriterIdentity pulumi.StringPtrInput
	// A description of this sink. The maximum length of the description is 8000 characters.
	Description pulumi.StringPtrInput
	// The destination of the sink (or, in other words, where logs are written to). Can be a Cloud Storage bucket, a PubSub topic, a BigQuery dataset, a Cloud Logging bucket, or a Google Cloud project. Examples:
	//
	// - `storage.googleapis.com/[GCS_BUCKET]`
	// - `bigquery.googleapis.com/projects/[PROJECT_ID]/datasets/[DATASET]`
	// - `pubsub.googleapis.com/projects/[PROJECT_ID]/topics/[TOPIC_ID]`
	// - `logging.googleapis.com/projects/[PROJECT_ID]/locations/global/buckets/[BUCKET_ID]`
	// - `logging.googleapis.com/projects/[PROJECT_ID]`
	//
	// The writer associated with the sink must have access to write to the above resource.
	Destination pulumi.StringPtrInput
	// If set to True, then this sink is disabled and it does not export any log entries.
	Disabled pulumi.BoolPtrInput
	// Log entries that match any of the exclusion filters will not be exported. If a log entry is matched by both `filter` and one of `exclusions.filter`, it will not be exported.  Can be repeated multiple times for multiple exclusions. Structure is documented below.
	Exclusions ProjectSinkExclusionArrayInput
	// The filter to apply when exporting logs. Only log entries that match the filter are exported.
	// See [Advanced Log Filters](https://cloud.google.com/logging/docs/view/advanced_filters) for information on how to
	// write a filter.
	Filter pulumi.StringPtrInput
	// The name of the logging sink. Logging automatically creates two sinks: `_Required` and `_Default`.
	Name pulumi.StringPtrInput
	// The ID of the project to create the sink in. If omitted, the project associated with the provider is
	// used.
	Project pulumi.StringPtrInput
	// Whether or not to create a unique identity associated with this sink. If `false`, then the `writerIdentity` used is `serviceAccount:cloud-logs@system.gserviceaccount.com`. If `true` (the default),
	// then a unique service account is created and used for this sink. If you wish to publish logs across projects or utilize
	// `bigqueryOptions`, you must set `uniqueWriterIdentity` to true.
	UniqueWriterIdentity pulumi.BoolPtrInput
	// The identity associated with this sink. This identity must be granted write access to the
	// configured `destination`.
	WriterIdentity pulumi.StringPtrInput
}

func (ProjectSinkState) ElementType() reflect.Type {
	return reflect.TypeOf((*projectSinkState)(nil)).Elem()
}

type projectSinkArgs struct {
	// Options that affect sinks exporting data to BigQuery. Structure documented below.
	BigqueryOptions *ProjectSinkBigqueryOptions `pulumi:"bigqueryOptions"`
	// A user managed service account that will be used to write
	// the log entries. The format must be `serviceAccount:some@email`. This field can only be specified if you are
	// routing logs to a destination outside this sink's project. If not specified, a Logging service account
	// will automatically be generated.
	CustomWriterIdentity *string `pulumi:"customWriterIdentity"`
	// A description of this sink. The maximum length of the description is 8000 characters.
	Description *string `pulumi:"description"`
	// The destination of the sink (or, in other words, where logs are written to). Can be a Cloud Storage bucket, a PubSub topic, a BigQuery dataset, a Cloud Logging bucket, or a Google Cloud project. Examples:
	//
	// - `storage.googleapis.com/[GCS_BUCKET]`
	// - `bigquery.googleapis.com/projects/[PROJECT_ID]/datasets/[DATASET]`
	// - `pubsub.googleapis.com/projects/[PROJECT_ID]/topics/[TOPIC_ID]`
	// - `logging.googleapis.com/projects/[PROJECT_ID]/locations/global/buckets/[BUCKET_ID]`
	// - `logging.googleapis.com/projects/[PROJECT_ID]`
	//
	// The writer associated with the sink must have access to write to the above resource.
	Destination string `pulumi:"destination"`
	// If set to True, then this sink is disabled and it does not export any log entries.
	Disabled *bool `pulumi:"disabled"`
	// Log entries that match any of the exclusion filters will not be exported. If a log entry is matched by both `filter` and one of `exclusions.filter`, it will not be exported.  Can be repeated multiple times for multiple exclusions. Structure is documented below.
	Exclusions []ProjectSinkExclusion `pulumi:"exclusions"`
	// The filter to apply when exporting logs. Only log entries that match the filter are exported.
	// See [Advanced Log Filters](https://cloud.google.com/logging/docs/view/advanced_filters) for information on how to
	// write a filter.
	Filter *string `pulumi:"filter"`
	// The name of the logging sink. Logging automatically creates two sinks: `_Required` and `_Default`.
	Name *string `pulumi:"name"`
	// The ID of the project to create the sink in. If omitted, the project associated with the provider is
	// used.
	Project *string `pulumi:"project"`
	// Whether or not to create a unique identity associated with this sink. If `false`, then the `writerIdentity` used is `serviceAccount:cloud-logs@system.gserviceaccount.com`. If `true` (the default),
	// then a unique service account is created and used for this sink. If you wish to publish logs across projects or utilize
	// `bigqueryOptions`, you must set `uniqueWriterIdentity` to true.
	UniqueWriterIdentity *bool `pulumi:"uniqueWriterIdentity"`
}

// The set of arguments for constructing a ProjectSink resource.
type ProjectSinkArgs struct {
	// Options that affect sinks exporting data to BigQuery. Structure documented below.
	BigqueryOptions ProjectSinkBigqueryOptionsPtrInput
	// A user managed service account that will be used to write
	// the log entries. The format must be `serviceAccount:some@email`. This field can only be specified if you are
	// routing logs to a destination outside this sink's project. If not specified, a Logging service account
	// will automatically be generated.
	CustomWriterIdentity pulumi.StringPtrInput
	// A description of this sink. The maximum length of the description is 8000 characters.
	Description pulumi.StringPtrInput
	// The destination of the sink (or, in other words, where logs are written to). Can be a Cloud Storage bucket, a PubSub topic, a BigQuery dataset, a Cloud Logging bucket, or a Google Cloud project. Examples:
	//
	// - `storage.googleapis.com/[GCS_BUCKET]`
	// - `bigquery.googleapis.com/projects/[PROJECT_ID]/datasets/[DATASET]`
	// - `pubsub.googleapis.com/projects/[PROJECT_ID]/topics/[TOPIC_ID]`
	// - `logging.googleapis.com/projects/[PROJECT_ID]/locations/global/buckets/[BUCKET_ID]`
	// - `logging.googleapis.com/projects/[PROJECT_ID]`
	//
	// The writer associated with the sink must have access to write to the above resource.
	Destination pulumi.StringInput
	// If set to True, then this sink is disabled and it does not export any log entries.
	Disabled pulumi.BoolPtrInput
	// Log entries that match any of the exclusion filters will not be exported. If a log entry is matched by both `filter` and one of `exclusions.filter`, it will not be exported.  Can be repeated multiple times for multiple exclusions. Structure is documented below.
	Exclusions ProjectSinkExclusionArrayInput
	// The filter to apply when exporting logs. Only log entries that match the filter are exported.
	// See [Advanced Log Filters](https://cloud.google.com/logging/docs/view/advanced_filters) for information on how to
	// write a filter.
	Filter pulumi.StringPtrInput
	// The name of the logging sink. Logging automatically creates two sinks: `_Required` and `_Default`.
	Name pulumi.StringPtrInput
	// The ID of the project to create the sink in. If omitted, the project associated with the provider is
	// used.
	Project pulumi.StringPtrInput
	// Whether or not to create a unique identity associated with this sink. If `false`, then the `writerIdentity` used is `serviceAccount:cloud-logs@system.gserviceaccount.com`. If `true` (the default),
	// then a unique service account is created and used for this sink. If you wish to publish logs across projects or utilize
	// `bigqueryOptions`, you must set `uniqueWriterIdentity` to true.
	UniqueWriterIdentity pulumi.BoolPtrInput
}

func (ProjectSinkArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*projectSinkArgs)(nil)).Elem()
}

type ProjectSinkInput interface {
	pulumi.Input

	ToProjectSinkOutput() ProjectSinkOutput
	ToProjectSinkOutputWithContext(ctx context.Context) ProjectSinkOutput
}

func (*ProjectSink) ElementType() reflect.Type {
	return reflect.TypeOf((**ProjectSink)(nil)).Elem()
}

func (i *ProjectSink) ToProjectSinkOutput() ProjectSinkOutput {
	return i.ToProjectSinkOutputWithContext(context.Background())
}

func (i *ProjectSink) ToProjectSinkOutputWithContext(ctx context.Context) ProjectSinkOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectSinkOutput)
}

// ProjectSinkArrayInput is an input type that accepts ProjectSinkArray and ProjectSinkArrayOutput values.
// You can construct a concrete instance of `ProjectSinkArrayInput` via:
//
//	ProjectSinkArray{ ProjectSinkArgs{...} }
type ProjectSinkArrayInput interface {
	pulumi.Input

	ToProjectSinkArrayOutput() ProjectSinkArrayOutput
	ToProjectSinkArrayOutputWithContext(context.Context) ProjectSinkArrayOutput
}

type ProjectSinkArray []ProjectSinkInput

func (ProjectSinkArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ProjectSink)(nil)).Elem()
}

func (i ProjectSinkArray) ToProjectSinkArrayOutput() ProjectSinkArrayOutput {
	return i.ToProjectSinkArrayOutputWithContext(context.Background())
}

func (i ProjectSinkArray) ToProjectSinkArrayOutputWithContext(ctx context.Context) ProjectSinkArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectSinkArrayOutput)
}

// ProjectSinkMapInput is an input type that accepts ProjectSinkMap and ProjectSinkMapOutput values.
// You can construct a concrete instance of `ProjectSinkMapInput` via:
//
//	ProjectSinkMap{ "key": ProjectSinkArgs{...} }
type ProjectSinkMapInput interface {
	pulumi.Input

	ToProjectSinkMapOutput() ProjectSinkMapOutput
	ToProjectSinkMapOutputWithContext(context.Context) ProjectSinkMapOutput
}

type ProjectSinkMap map[string]ProjectSinkInput

func (ProjectSinkMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ProjectSink)(nil)).Elem()
}

func (i ProjectSinkMap) ToProjectSinkMapOutput() ProjectSinkMapOutput {
	return i.ToProjectSinkMapOutputWithContext(context.Background())
}

func (i ProjectSinkMap) ToProjectSinkMapOutputWithContext(ctx context.Context) ProjectSinkMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectSinkMapOutput)
}

type ProjectSinkOutput struct{ *pulumi.OutputState }

func (ProjectSinkOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ProjectSink)(nil)).Elem()
}

func (o ProjectSinkOutput) ToProjectSinkOutput() ProjectSinkOutput {
	return o
}

func (o ProjectSinkOutput) ToProjectSinkOutputWithContext(ctx context.Context) ProjectSinkOutput {
	return o
}

// Options that affect sinks exporting data to BigQuery. Structure documented below.
func (o ProjectSinkOutput) BigqueryOptions() ProjectSinkBigqueryOptionsOutput {
	return o.ApplyT(func(v *ProjectSink) ProjectSinkBigqueryOptionsOutput { return v.BigqueryOptions }).(ProjectSinkBigqueryOptionsOutput)
}

// A user managed service account that will be used to write
// the log entries. The format must be `serviceAccount:some@email`. This field can only be specified if you are
// routing logs to a destination outside this sink's project. If not specified, a Logging service account
// will automatically be generated.
func (o ProjectSinkOutput) CustomWriterIdentity() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ProjectSink) pulumi.StringPtrOutput { return v.CustomWriterIdentity }).(pulumi.StringPtrOutput)
}

// A description of this sink. The maximum length of the description is 8000 characters.
func (o ProjectSinkOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ProjectSink) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The destination of the sink (or, in other words, where logs are written to). Can be a Cloud Storage bucket, a PubSub topic, a BigQuery dataset, a Cloud Logging bucket, or a Google Cloud project. Examples:
//
// - `storage.googleapis.com/[GCS_BUCKET]`
// - `bigquery.googleapis.com/projects/[PROJECT_ID]/datasets/[DATASET]`
// - `pubsub.googleapis.com/projects/[PROJECT_ID]/topics/[TOPIC_ID]`
// - `logging.googleapis.com/projects/[PROJECT_ID]/locations/global/buckets/[BUCKET_ID]`
// - `logging.googleapis.com/projects/[PROJECT_ID]`
//
// The writer associated with the sink must have access to write to the above resource.
func (o ProjectSinkOutput) Destination() pulumi.StringOutput {
	return o.ApplyT(func(v *ProjectSink) pulumi.StringOutput { return v.Destination }).(pulumi.StringOutput)
}

// If set to True, then this sink is disabled and it does not export any log entries.
func (o ProjectSinkOutput) Disabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ProjectSink) pulumi.BoolPtrOutput { return v.Disabled }).(pulumi.BoolPtrOutput)
}

// Log entries that match any of the exclusion filters will not be exported. If a log entry is matched by both `filter` and one of `exclusions.filter`, it will not be exported.  Can be repeated multiple times for multiple exclusions. Structure is documented below.
func (o ProjectSinkOutput) Exclusions() ProjectSinkExclusionArrayOutput {
	return o.ApplyT(func(v *ProjectSink) ProjectSinkExclusionArrayOutput { return v.Exclusions }).(ProjectSinkExclusionArrayOutput)
}

// The filter to apply when exporting logs. Only log entries that match the filter are exported.
// See [Advanced Log Filters](https://cloud.google.com/logging/docs/view/advanced_filters) for information on how to
// write a filter.
func (o ProjectSinkOutput) Filter() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ProjectSink) pulumi.StringPtrOutput { return v.Filter }).(pulumi.StringPtrOutput)
}

// The name of the logging sink. Logging automatically creates two sinks: `_Required` and `_Default`.
func (o ProjectSinkOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ProjectSink) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The ID of the project to create the sink in. If omitted, the project associated with the provider is
// used.
func (o ProjectSinkOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *ProjectSink) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// Whether or not to create a unique identity associated with this sink. If `false`, then the `writerIdentity` used is `serviceAccount:cloud-logs@system.gserviceaccount.com`. If `true` (the default),
// then a unique service account is created and used for this sink. If you wish to publish logs across projects or utilize
// `bigqueryOptions`, you must set `uniqueWriterIdentity` to true.
func (o ProjectSinkOutput) UniqueWriterIdentity() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ProjectSink) pulumi.BoolPtrOutput { return v.UniqueWriterIdentity }).(pulumi.BoolPtrOutput)
}

// The identity associated with this sink. This identity must be granted write access to the
// configured `destination`.
func (o ProjectSinkOutput) WriterIdentity() pulumi.StringOutput {
	return o.ApplyT(func(v *ProjectSink) pulumi.StringOutput { return v.WriterIdentity }).(pulumi.StringOutput)
}

type ProjectSinkArrayOutput struct{ *pulumi.OutputState }

func (ProjectSinkArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ProjectSink)(nil)).Elem()
}

func (o ProjectSinkArrayOutput) ToProjectSinkArrayOutput() ProjectSinkArrayOutput {
	return o
}

func (o ProjectSinkArrayOutput) ToProjectSinkArrayOutputWithContext(ctx context.Context) ProjectSinkArrayOutput {
	return o
}

func (o ProjectSinkArrayOutput) Index(i pulumi.IntInput) ProjectSinkOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ProjectSink {
		return vs[0].([]*ProjectSink)[vs[1].(int)]
	}).(ProjectSinkOutput)
}

type ProjectSinkMapOutput struct{ *pulumi.OutputState }

func (ProjectSinkMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ProjectSink)(nil)).Elem()
}

func (o ProjectSinkMapOutput) ToProjectSinkMapOutput() ProjectSinkMapOutput {
	return o
}

func (o ProjectSinkMapOutput) ToProjectSinkMapOutputWithContext(ctx context.Context) ProjectSinkMapOutput {
	return o
}

func (o ProjectSinkMapOutput) MapIndex(k pulumi.StringInput) ProjectSinkOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ProjectSink {
		return vs[0].(map[string]*ProjectSink)[vs[1].(string)]
	}).(ProjectSinkOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectSinkInput)(nil)).Elem(), &ProjectSink{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectSinkArrayInput)(nil)).Elem(), ProjectSinkArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectSinkMapInput)(nil)).Elem(), ProjectSinkMap{})
	pulumi.RegisterOutputType(ProjectSinkOutput{})
	pulumi.RegisterOutputType(ProjectSinkArrayOutput{})
	pulumi.RegisterOutputType(ProjectSinkMapOutput{})
}
