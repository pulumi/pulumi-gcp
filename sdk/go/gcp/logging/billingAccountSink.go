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

// * [API documentation](https://cloud.google.com/logging/docs/reference/v2/rest/v2/billingAccounts.sinks)
// * How-to Guides
//   - [Exporting Logs](https://cloud.google.com/logging/docs/export)
//
// > **Note** You must have the "Logs Configuration Writer" IAM role (`roles/logging.configWriter`)
// [granted on the billing account](https://cloud.google.com/billing/reference/rest/v1/billingAccounts/getIamPolicy) to
// the credentials used with this provider. [IAM roles granted on a billing account](https://cloud.google.com/billing/docs/how-to/billing-access) are separate from the
// typical IAM roles granted on a project.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/logging"
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/projects"
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/storage"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			log_bucket, err := storage.NewBucket(ctx, "log-bucket", &storage.BucketArgs{
//				Name:     pulumi.String("billing-logging-bucket"),
//				Location: pulumi.String("US"),
//			})
//			if err != nil {
//				return err
//			}
//			my_sink, err := logging.NewBillingAccountSink(ctx, "my-sink", &logging.BillingAccountSinkArgs{
//				Name:           pulumi.String("my-sink"),
//				Description:    pulumi.String("some explanation on what this is"),
//				BillingAccount: pulumi.String("ABCDEF-012345-GHIJKL"),
//				Destination: log_bucket.Name.ApplyT(func(name string) (string, error) {
//					return fmt.Sprintf("storage.googleapis.com/%v", name), nil
//				}).(pulumi.StringOutput),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = projects.NewIAMBinding(ctx, "log-writer", &projects.IAMBindingArgs{
//				Project: pulumi.String("your-project-id"),
//				Role:    pulumi.String("roles/storage.objectCreator"),
//				Members: pulumi.StringArray{
//					my_sink.WriterIdentity,
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
// Billing account logging sinks can be imported using this format:
//
// * `billingAccounts/{{billing_account_id}}/sinks/{{sink_id}}`
//
// When using the `pulumi import` command, billing account logging sinks can be imported using one of the formats above. For example:
//
// ```sh
// $ pulumi import gcp:logging/billingAccountSink:BillingAccountSink default billingAccounts/{{billing_account_id}}/sinks/{{sink_id}}
// ```
type BillingAccountSink struct {
	pulumi.CustomResourceState

	// Options that affect sinks exporting data to BigQuery. Structure documented below.
	BigqueryOptions BillingAccountSinkBigqueryOptionsOutput `pulumi:"bigqueryOptions"`
	// The billing account exported to the sink.
	BillingAccount pulumi.StringOutput `pulumi:"billingAccount"`
	// A description of this sink. The maximum length of the description is 8000 characters.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The destination of the sink (or, in other words, where logs are written to). Can be a
	// Cloud Storage bucket, a PubSub topic, a BigQuery dataset or a Cloud Logging bucket. Examples:
	//
	// - `storage.googleapis.com/[GCS_BUCKET]`
	// - `bigquery.googleapis.com/projects/[PROJECT_ID]/datasets/[DATASET]`
	// - `pubsub.googleapis.com/projects/[PROJECT_ID]/topics/[TOPIC_ID]`
	// - `logging.googleapis.com/projects/[PROJECT_ID]]/locations/global/buckets/[BUCKET_ID]`
	//
	// The writer associated with the sink must have access to write to the above resource.
	Destination pulumi.StringOutput `pulumi:"destination"`
	// If set to True, then this sink is disabled and it does not export any log entries.
	Disabled pulumi.BoolPtrOutput `pulumi:"disabled"`
	// Log entries that match any of the exclusion filters will not be exported. If a log entry is matched by both `filter` and one of `exclusions.filter`, it will not be exported.  Can be repeated multiple times for multiple exclusions. Structure is documented below.
	Exclusions BillingAccountSinkExclusionArrayOutput `pulumi:"exclusions"`
	// The filter to apply when exporting logs. Only log entries that match the filter are exported.
	// See [Advanced Log Filters](https://cloud.google.com/logging/docs/view/advanced_filters) for information on how to
	// write a filter.
	Filter pulumi.StringPtrOutput `pulumi:"filter"`
	// The name of the logging sink.
	Name pulumi.StringOutput `pulumi:"name"`
	// The identity associated with this sink. This identity must be granted write access to the
	// configured `destination`.
	WriterIdentity pulumi.StringOutput `pulumi:"writerIdentity"`
}

// NewBillingAccountSink registers a new resource with the given unique name, arguments, and options.
func NewBillingAccountSink(ctx *pulumi.Context,
	name string, args *BillingAccountSinkArgs, opts ...pulumi.ResourceOption) (*BillingAccountSink, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.BillingAccount == nil {
		return nil, errors.New("invalid value for required argument 'BillingAccount'")
	}
	if args.Destination == nil {
		return nil, errors.New("invalid value for required argument 'Destination'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource BillingAccountSink
	err := ctx.RegisterResource("gcp:logging/billingAccountSink:BillingAccountSink", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetBillingAccountSink gets an existing BillingAccountSink resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetBillingAccountSink(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *BillingAccountSinkState, opts ...pulumi.ResourceOption) (*BillingAccountSink, error) {
	var resource BillingAccountSink
	err := ctx.ReadResource("gcp:logging/billingAccountSink:BillingAccountSink", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering BillingAccountSink resources.
type billingAccountSinkState struct {
	// Options that affect sinks exporting data to BigQuery. Structure documented below.
	BigqueryOptions *BillingAccountSinkBigqueryOptions `pulumi:"bigqueryOptions"`
	// The billing account exported to the sink.
	BillingAccount *string `pulumi:"billingAccount"`
	// A description of this sink. The maximum length of the description is 8000 characters.
	Description *string `pulumi:"description"`
	// The destination of the sink (or, in other words, where logs are written to). Can be a
	// Cloud Storage bucket, a PubSub topic, a BigQuery dataset or a Cloud Logging bucket. Examples:
	//
	// - `storage.googleapis.com/[GCS_BUCKET]`
	// - `bigquery.googleapis.com/projects/[PROJECT_ID]/datasets/[DATASET]`
	// - `pubsub.googleapis.com/projects/[PROJECT_ID]/topics/[TOPIC_ID]`
	// - `logging.googleapis.com/projects/[PROJECT_ID]]/locations/global/buckets/[BUCKET_ID]`
	//
	// The writer associated with the sink must have access to write to the above resource.
	Destination *string `pulumi:"destination"`
	// If set to True, then this sink is disabled and it does not export any log entries.
	Disabled *bool `pulumi:"disabled"`
	// Log entries that match any of the exclusion filters will not be exported. If a log entry is matched by both `filter` and one of `exclusions.filter`, it will not be exported.  Can be repeated multiple times for multiple exclusions. Structure is documented below.
	Exclusions []BillingAccountSinkExclusion `pulumi:"exclusions"`
	// The filter to apply when exporting logs. Only log entries that match the filter are exported.
	// See [Advanced Log Filters](https://cloud.google.com/logging/docs/view/advanced_filters) for information on how to
	// write a filter.
	Filter *string `pulumi:"filter"`
	// The name of the logging sink.
	Name *string `pulumi:"name"`
	// The identity associated with this sink. This identity must be granted write access to the
	// configured `destination`.
	WriterIdentity *string `pulumi:"writerIdentity"`
}

type BillingAccountSinkState struct {
	// Options that affect sinks exporting data to BigQuery. Structure documented below.
	BigqueryOptions BillingAccountSinkBigqueryOptionsPtrInput
	// The billing account exported to the sink.
	BillingAccount pulumi.StringPtrInput
	// A description of this sink. The maximum length of the description is 8000 characters.
	Description pulumi.StringPtrInput
	// The destination of the sink (or, in other words, where logs are written to). Can be a
	// Cloud Storage bucket, a PubSub topic, a BigQuery dataset or a Cloud Logging bucket. Examples:
	//
	// - `storage.googleapis.com/[GCS_BUCKET]`
	// - `bigquery.googleapis.com/projects/[PROJECT_ID]/datasets/[DATASET]`
	// - `pubsub.googleapis.com/projects/[PROJECT_ID]/topics/[TOPIC_ID]`
	// - `logging.googleapis.com/projects/[PROJECT_ID]]/locations/global/buckets/[BUCKET_ID]`
	//
	// The writer associated with the sink must have access to write to the above resource.
	Destination pulumi.StringPtrInput
	// If set to True, then this sink is disabled and it does not export any log entries.
	Disabled pulumi.BoolPtrInput
	// Log entries that match any of the exclusion filters will not be exported. If a log entry is matched by both `filter` and one of `exclusions.filter`, it will not be exported.  Can be repeated multiple times for multiple exclusions. Structure is documented below.
	Exclusions BillingAccountSinkExclusionArrayInput
	// The filter to apply when exporting logs. Only log entries that match the filter are exported.
	// See [Advanced Log Filters](https://cloud.google.com/logging/docs/view/advanced_filters) for information on how to
	// write a filter.
	Filter pulumi.StringPtrInput
	// The name of the logging sink.
	Name pulumi.StringPtrInput
	// The identity associated with this sink. This identity must be granted write access to the
	// configured `destination`.
	WriterIdentity pulumi.StringPtrInput
}

func (BillingAccountSinkState) ElementType() reflect.Type {
	return reflect.TypeOf((*billingAccountSinkState)(nil)).Elem()
}

type billingAccountSinkArgs struct {
	// Options that affect sinks exporting data to BigQuery. Structure documented below.
	BigqueryOptions *BillingAccountSinkBigqueryOptions `pulumi:"bigqueryOptions"`
	// The billing account exported to the sink.
	BillingAccount string `pulumi:"billingAccount"`
	// A description of this sink. The maximum length of the description is 8000 characters.
	Description *string `pulumi:"description"`
	// The destination of the sink (or, in other words, where logs are written to). Can be a
	// Cloud Storage bucket, a PubSub topic, a BigQuery dataset or a Cloud Logging bucket. Examples:
	//
	// - `storage.googleapis.com/[GCS_BUCKET]`
	// - `bigquery.googleapis.com/projects/[PROJECT_ID]/datasets/[DATASET]`
	// - `pubsub.googleapis.com/projects/[PROJECT_ID]/topics/[TOPIC_ID]`
	// - `logging.googleapis.com/projects/[PROJECT_ID]]/locations/global/buckets/[BUCKET_ID]`
	//
	// The writer associated with the sink must have access to write to the above resource.
	Destination string `pulumi:"destination"`
	// If set to True, then this sink is disabled and it does not export any log entries.
	Disabled *bool `pulumi:"disabled"`
	// Log entries that match any of the exclusion filters will not be exported. If a log entry is matched by both `filter` and one of `exclusions.filter`, it will not be exported.  Can be repeated multiple times for multiple exclusions. Structure is documented below.
	Exclusions []BillingAccountSinkExclusion `pulumi:"exclusions"`
	// The filter to apply when exporting logs. Only log entries that match the filter are exported.
	// See [Advanced Log Filters](https://cloud.google.com/logging/docs/view/advanced_filters) for information on how to
	// write a filter.
	Filter *string `pulumi:"filter"`
	// The name of the logging sink.
	Name *string `pulumi:"name"`
}

// The set of arguments for constructing a BillingAccountSink resource.
type BillingAccountSinkArgs struct {
	// Options that affect sinks exporting data to BigQuery. Structure documented below.
	BigqueryOptions BillingAccountSinkBigqueryOptionsPtrInput
	// The billing account exported to the sink.
	BillingAccount pulumi.StringInput
	// A description of this sink. The maximum length of the description is 8000 characters.
	Description pulumi.StringPtrInput
	// The destination of the sink (or, in other words, where logs are written to). Can be a
	// Cloud Storage bucket, a PubSub topic, a BigQuery dataset or a Cloud Logging bucket. Examples:
	//
	// - `storage.googleapis.com/[GCS_BUCKET]`
	// - `bigquery.googleapis.com/projects/[PROJECT_ID]/datasets/[DATASET]`
	// - `pubsub.googleapis.com/projects/[PROJECT_ID]/topics/[TOPIC_ID]`
	// - `logging.googleapis.com/projects/[PROJECT_ID]]/locations/global/buckets/[BUCKET_ID]`
	//
	// The writer associated with the sink must have access to write to the above resource.
	Destination pulumi.StringInput
	// If set to True, then this sink is disabled and it does not export any log entries.
	Disabled pulumi.BoolPtrInput
	// Log entries that match any of the exclusion filters will not be exported. If a log entry is matched by both `filter` and one of `exclusions.filter`, it will not be exported.  Can be repeated multiple times for multiple exclusions. Structure is documented below.
	Exclusions BillingAccountSinkExclusionArrayInput
	// The filter to apply when exporting logs. Only log entries that match the filter are exported.
	// See [Advanced Log Filters](https://cloud.google.com/logging/docs/view/advanced_filters) for information on how to
	// write a filter.
	Filter pulumi.StringPtrInput
	// The name of the logging sink.
	Name pulumi.StringPtrInput
}

func (BillingAccountSinkArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*billingAccountSinkArgs)(nil)).Elem()
}

type BillingAccountSinkInput interface {
	pulumi.Input

	ToBillingAccountSinkOutput() BillingAccountSinkOutput
	ToBillingAccountSinkOutputWithContext(ctx context.Context) BillingAccountSinkOutput
}

func (*BillingAccountSink) ElementType() reflect.Type {
	return reflect.TypeOf((**BillingAccountSink)(nil)).Elem()
}

func (i *BillingAccountSink) ToBillingAccountSinkOutput() BillingAccountSinkOutput {
	return i.ToBillingAccountSinkOutputWithContext(context.Background())
}

func (i *BillingAccountSink) ToBillingAccountSinkOutputWithContext(ctx context.Context) BillingAccountSinkOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BillingAccountSinkOutput)
}

// BillingAccountSinkArrayInput is an input type that accepts BillingAccountSinkArray and BillingAccountSinkArrayOutput values.
// You can construct a concrete instance of `BillingAccountSinkArrayInput` via:
//
//	BillingAccountSinkArray{ BillingAccountSinkArgs{...} }
type BillingAccountSinkArrayInput interface {
	pulumi.Input

	ToBillingAccountSinkArrayOutput() BillingAccountSinkArrayOutput
	ToBillingAccountSinkArrayOutputWithContext(context.Context) BillingAccountSinkArrayOutput
}

type BillingAccountSinkArray []BillingAccountSinkInput

func (BillingAccountSinkArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*BillingAccountSink)(nil)).Elem()
}

func (i BillingAccountSinkArray) ToBillingAccountSinkArrayOutput() BillingAccountSinkArrayOutput {
	return i.ToBillingAccountSinkArrayOutputWithContext(context.Background())
}

func (i BillingAccountSinkArray) ToBillingAccountSinkArrayOutputWithContext(ctx context.Context) BillingAccountSinkArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BillingAccountSinkArrayOutput)
}

// BillingAccountSinkMapInput is an input type that accepts BillingAccountSinkMap and BillingAccountSinkMapOutput values.
// You can construct a concrete instance of `BillingAccountSinkMapInput` via:
//
//	BillingAccountSinkMap{ "key": BillingAccountSinkArgs{...} }
type BillingAccountSinkMapInput interface {
	pulumi.Input

	ToBillingAccountSinkMapOutput() BillingAccountSinkMapOutput
	ToBillingAccountSinkMapOutputWithContext(context.Context) BillingAccountSinkMapOutput
}

type BillingAccountSinkMap map[string]BillingAccountSinkInput

func (BillingAccountSinkMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*BillingAccountSink)(nil)).Elem()
}

func (i BillingAccountSinkMap) ToBillingAccountSinkMapOutput() BillingAccountSinkMapOutput {
	return i.ToBillingAccountSinkMapOutputWithContext(context.Background())
}

func (i BillingAccountSinkMap) ToBillingAccountSinkMapOutputWithContext(ctx context.Context) BillingAccountSinkMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BillingAccountSinkMapOutput)
}

type BillingAccountSinkOutput struct{ *pulumi.OutputState }

func (BillingAccountSinkOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**BillingAccountSink)(nil)).Elem()
}

func (o BillingAccountSinkOutput) ToBillingAccountSinkOutput() BillingAccountSinkOutput {
	return o
}

func (o BillingAccountSinkOutput) ToBillingAccountSinkOutputWithContext(ctx context.Context) BillingAccountSinkOutput {
	return o
}

// Options that affect sinks exporting data to BigQuery. Structure documented below.
func (o BillingAccountSinkOutput) BigqueryOptions() BillingAccountSinkBigqueryOptionsOutput {
	return o.ApplyT(func(v *BillingAccountSink) BillingAccountSinkBigqueryOptionsOutput { return v.BigqueryOptions }).(BillingAccountSinkBigqueryOptionsOutput)
}

// The billing account exported to the sink.
func (o BillingAccountSinkOutput) BillingAccount() pulumi.StringOutput {
	return o.ApplyT(func(v *BillingAccountSink) pulumi.StringOutput { return v.BillingAccount }).(pulumi.StringOutput)
}

// A description of this sink. The maximum length of the description is 8000 characters.
func (o BillingAccountSinkOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *BillingAccountSink) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The destination of the sink (or, in other words, where logs are written to). Can be a
// Cloud Storage bucket, a PubSub topic, a BigQuery dataset or a Cloud Logging bucket. Examples:
//
// - `storage.googleapis.com/[GCS_BUCKET]`
// - `bigquery.googleapis.com/projects/[PROJECT_ID]/datasets/[DATASET]`
// - `pubsub.googleapis.com/projects/[PROJECT_ID]/topics/[TOPIC_ID]`
// - `logging.googleapis.com/projects/[PROJECT_ID]]/locations/global/buckets/[BUCKET_ID]`
//
// The writer associated with the sink must have access to write to the above resource.
func (o BillingAccountSinkOutput) Destination() pulumi.StringOutput {
	return o.ApplyT(func(v *BillingAccountSink) pulumi.StringOutput { return v.Destination }).(pulumi.StringOutput)
}

// If set to True, then this sink is disabled and it does not export any log entries.
func (o BillingAccountSinkOutput) Disabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *BillingAccountSink) pulumi.BoolPtrOutput { return v.Disabled }).(pulumi.BoolPtrOutput)
}

// Log entries that match any of the exclusion filters will not be exported. If a log entry is matched by both `filter` and one of `exclusions.filter`, it will not be exported.  Can be repeated multiple times for multiple exclusions. Structure is documented below.
func (o BillingAccountSinkOutput) Exclusions() BillingAccountSinkExclusionArrayOutput {
	return o.ApplyT(func(v *BillingAccountSink) BillingAccountSinkExclusionArrayOutput { return v.Exclusions }).(BillingAccountSinkExclusionArrayOutput)
}

// The filter to apply when exporting logs. Only log entries that match the filter are exported.
// See [Advanced Log Filters](https://cloud.google.com/logging/docs/view/advanced_filters) for information on how to
// write a filter.
func (o BillingAccountSinkOutput) Filter() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *BillingAccountSink) pulumi.StringPtrOutput { return v.Filter }).(pulumi.StringPtrOutput)
}

// The name of the logging sink.
func (o BillingAccountSinkOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *BillingAccountSink) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The identity associated with this sink. This identity must be granted write access to the
// configured `destination`.
func (o BillingAccountSinkOutput) WriterIdentity() pulumi.StringOutput {
	return o.ApplyT(func(v *BillingAccountSink) pulumi.StringOutput { return v.WriterIdentity }).(pulumi.StringOutput)
}

type BillingAccountSinkArrayOutput struct{ *pulumi.OutputState }

func (BillingAccountSinkArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*BillingAccountSink)(nil)).Elem()
}

func (o BillingAccountSinkArrayOutput) ToBillingAccountSinkArrayOutput() BillingAccountSinkArrayOutput {
	return o
}

func (o BillingAccountSinkArrayOutput) ToBillingAccountSinkArrayOutputWithContext(ctx context.Context) BillingAccountSinkArrayOutput {
	return o
}

func (o BillingAccountSinkArrayOutput) Index(i pulumi.IntInput) BillingAccountSinkOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *BillingAccountSink {
		return vs[0].([]*BillingAccountSink)[vs[1].(int)]
	}).(BillingAccountSinkOutput)
}

type BillingAccountSinkMapOutput struct{ *pulumi.OutputState }

func (BillingAccountSinkMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*BillingAccountSink)(nil)).Elem()
}

func (o BillingAccountSinkMapOutput) ToBillingAccountSinkMapOutput() BillingAccountSinkMapOutput {
	return o
}

func (o BillingAccountSinkMapOutput) ToBillingAccountSinkMapOutputWithContext(ctx context.Context) BillingAccountSinkMapOutput {
	return o
}

func (o BillingAccountSinkMapOutput) MapIndex(k pulumi.StringInput) BillingAccountSinkOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *BillingAccountSink {
		return vs[0].(map[string]*BillingAccountSink)[vs[1].(string)]
	}).(BillingAccountSinkOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*BillingAccountSinkInput)(nil)).Elem(), &BillingAccountSink{})
	pulumi.RegisterInputType(reflect.TypeOf((*BillingAccountSinkArrayInput)(nil)).Elem(), BillingAccountSinkArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*BillingAccountSinkMapInput)(nil)).Elem(), BillingAccountSinkMap{})
	pulumi.RegisterOutputType(BillingAccountSinkOutput{})
	pulumi.RegisterOutputType(BillingAccountSinkArrayOutput{})
	pulumi.RegisterOutputType(BillingAccountSinkMapOutput{})
}
