// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package bigquery

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-gcp/sdk/v7/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Get information about a BigQuery dataset. For more information see
// the [official documentation](https://cloud.google.com/bigquery/docs)
// and [API](https://cloud.google.com/bigquery/docs/reference/rest/v2/datasets).
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v7/go/gcp/bigquery"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := bigquery.LookupDataset(ctx, &bigquery.LookupDatasetArgs{
//				DatasetId: "my-bq-dataset",
//				Project:   pulumi.StringRef("my-project"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupDataset(ctx *pulumi.Context, args *LookupDatasetArgs, opts ...pulumi.InvokeOption) (*LookupDatasetResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupDatasetResult
	err := ctx.Invoke("gcp:bigquery/getDataset:getDataset", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDataset.
type LookupDatasetArgs struct {
	// The dataset ID.
	DatasetId string `pulumi:"datasetId"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
}

// A collection of values returned by getDataset.
type LookupDatasetResult struct {
	Accesses                        []GetDatasetAccessType                     `pulumi:"accesses"`
	CreationTime                    int                                        `pulumi:"creationTime"`
	DatasetId                       string                                     `pulumi:"datasetId"`
	DefaultCollation                string                                     `pulumi:"defaultCollation"`
	DefaultEncryptionConfigurations []GetDatasetDefaultEncryptionConfiguration `pulumi:"defaultEncryptionConfigurations"`
	DefaultPartitionExpirationMs    int                                        `pulumi:"defaultPartitionExpirationMs"`
	DefaultTableExpirationMs        int                                        `pulumi:"defaultTableExpirationMs"`
	DeleteContentsOnDestroy         bool                                       `pulumi:"deleteContentsOnDestroy"`
	Description                     string                                     `pulumi:"description"`
	EffectiveLabels                 map[string]string                          `pulumi:"effectiveLabels"`
	Etag                            string                                     `pulumi:"etag"`
	FriendlyName                    string                                     `pulumi:"friendlyName"`
	// The provider-assigned unique ID for this managed resource.
	Id                  string            `pulumi:"id"`
	IsCaseInsensitive   bool              `pulumi:"isCaseInsensitive"`
	Labels              map[string]string `pulumi:"labels"`
	LastModifiedTime    int               `pulumi:"lastModifiedTime"`
	Location            string            `pulumi:"location"`
	MaxTimeTravelHours  string            `pulumi:"maxTimeTravelHours"`
	Project             *string           `pulumi:"project"`
	PulumiLabels        map[string]string `pulumi:"pulumiLabels"`
	SelfLink            string            `pulumi:"selfLink"`
	StorageBillingModel string            `pulumi:"storageBillingModel"`
}

func LookupDatasetOutput(ctx *pulumi.Context, args LookupDatasetOutputArgs, opts ...pulumi.InvokeOption) LookupDatasetResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupDatasetResult, error) {
			args := v.(LookupDatasetArgs)
			r, err := LookupDataset(ctx, &args, opts...)
			var s LookupDatasetResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupDatasetResultOutput)
}

// A collection of arguments for invoking getDataset.
type LookupDatasetOutputArgs struct {
	// The dataset ID.
	DatasetId pulumi.StringInput `pulumi:"datasetId"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput `pulumi:"project"`
}

func (LookupDatasetOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDatasetArgs)(nil)).Elem()
}

// A collection of values returned by getDataset.
type LookupDatasetResultOutput struct{ *pulumi.OutputState }

func (LookupDatasetResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDatasetResult)(nil)).Elem()
}

func (o LookupDatasetResultOutput) ToLookupDatasetResultOutput() LookupDatasetResultOutput {
	return o
}

func (o LookupDatasetResultOutput) ToLookupDatasetResultOutputWithContext(ctx context.Context) LookupDatasetResultOutput {
	return o
}

func (o LookupDatasetResultOutput) Accesses() GetDatasetAccessTypeArrayOutput {
	return o.ApplyT(func(v LookupDatasetResult) []GetDatasetAccessType { return v.Accesses }).(GetDatasetAccessTypeArrayOutput)
}

func (o LookupDatasetResultOutput) CreationTime() pulumi.IntOutput {
	return o.ApplyT(func(v LookupDatasetResult) int { return v.CreationTime }).(pulumi.IntOutput)
}

func (o LookupDatasetResultOutput) DatasetId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatasetResult) string { return v.DatasetId }).(pulumi.StringOutput)
}

func (o LookupDatasetResultOutput) DefaultCollation() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatasetResult) string { return v.DefaultCollation }).(pulumi.StringOutput)
}

func (o LookupDatasetResultOutput) DefaultEncryptionConfigurations() GetDatasetDefaultEncryptionConfigurationArrayOutput {
	return o.ApplyT(func(v LookupDatasetResult) []GetDatasetDefaultEncryptionConfiguration {
		return v.DefaultEncryptionConfigurations
	}).(GetDatasetDefaultEncryptionConfigurationArrayOutput)
}

func (o LookupDatasetResultOutput) DefaultPartitionExpirationMs() pulumi.IntOutput {
	return o.ApplyT(func(v LookupDatasetResult) int { return v.DefaultPartitionExpirationMs }).(pulumi.IntOutput)
}

func (o LookupDatasetResultOutput) DefaultTableExpirationMs() pulumi.IntOutput {
	return o.ApplyT(func(v LookupDatasetResult) int { return v.DefaultTableExpirationMs }).(pulumi.IntOutput)
}

func (o LookupDatasetResultOutput) DeleteContentsOnDestroy() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupDatasetResult) bool { return v.DeleteContentsOnDestroy }).(pulumi.BoolOutput)
}

func (o LookupDatasetResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatasetResult) string { return v.Description }).(pulumi.StringOutput)
}

func (o LookupDatasetResultOutput) EffectiveLabels() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupDatasetResult) map[string]string { return v.EffectiveLabels }).(pulumi.StringMapOutput)
}

func (o LookupDatasetResultOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatasetResult) string { return v.Etag }).(pulumi.StringOutput)
}

func (o LookupDatasetResultOutput) FriendlyName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatasetResult) string { return v.FriendlyName }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupDatasetResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatasetResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupDatasetResultOutput) IsCaseInsensitive() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupDatasetResult) bool { return v.IsCaseInsensitive }).(pulumi.BoolOutput)
}

func (o LookupDatasetResultOutput) Labels() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupDatasetResult) map[string]string { return v.Labels }).(pulumi.StringMapOutput)
}

func (o LookupDatasetResultOutput) LastModifiedTime() pulumi.IntOutput {
	return o.ApplyT(func(v LookupDatasetResult) int { return v.LastModifiedTime }).(pulumi.IntOutput)
}

func (o LookupDatasetResultOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatasetResult) string { return v.Location }).(pulumi.StringOutput)
}

func (o LookupDatasetResultOutput) MaxTimeTravelHours() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatasetResult) string { return v.MaxTimeTravelHours }).(pulumi.StringOutput)
}

func (o LookupDatasetResultOutput) Project() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupDatasetResult) *string { return v.Project }).(pulumi.StringPtrOutput)
}

func (o LookupDatasetResultOutput) PulumiLabels() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupDatasetResult) map[string]string { return v.PulumiLabels }).(pulumi.StringMapOutput)
}

func (o LookupDatasetResultOutput) SelfLink() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatasetResult) string { return v.SelfLink }).(pulumi.StringOutput)
}

func (o LookupDatasetResultOutput) StorageBillingModel() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatasetResult) string { return v.StorageBillingModel }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupDatasetResultOutput{})
}