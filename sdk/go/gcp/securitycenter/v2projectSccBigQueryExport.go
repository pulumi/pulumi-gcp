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

// A Cloud Security Command Center (Cloud SCC) Big Query Export Config.
// It represents exporting Security Command Center data, including assets, findings, and security marks
// using gcloud scc bqexports
// > **Note:** In order to use Cloud SCC resources, your organization must be enrolled
// in [SCC Standard/Premium](https://cloud.google.com/security-command-center/docs/quickstart-security-command-center).
// Without doing so, you may run into errors during resource creation.
//
// To get more information about ProjectSccBigQueryExport, see:
//
// * [API documentation](https://cloud.google.com/security-command-center/docs/reference/rest/v2/projects.locations.bigQueryExports)
// * How-to Guides
//   - [Official Documentation](https://cloud.google.com/security-command-center/docs/how-to-analyze-findings-in-big-query)
//
// ## Example Usage
//
// ## Import
//
// ProjectSccBigQueryExport can be imported using any of these accepted formats:
//
// * `projects/{{project}}/locations/{{location}}/bigQueryExports/{{big_query_export_id}}`
//
// * `{{project}}/{{location}}/{{big_query_export_id}}`
//
// * `{{location}}/{{big_query_export_id}}`
//
// When using the `pulumi import` command, ProjectSccBigQueryExport can be imported using one of the formats above. For example:
//
// ```sh
// $ pulumi import gcp:securitycenter/v2ProjectSccBigQueryExport:V2ProjectSccBigQueryExport default projects/{{project}}/locations/{{location}}/bigQueryExports/{{big_query_export_id}}
// ```
//
// ```sh
// $ pulumi import gcp:securitycenter/v2ProjectSccBigQueryExport:V2ProjectSccBigQueryExport default {{project}}/{{location}}/{{big_query_export_id}}
// ```
//
// ```sh
// $ pulumi import gcp:securitycenter/v2ProjectSccBigQueryExport:V2ProjectSccBigQueryExport default {{location}}/{{big_query_export_id}}
// ```
type V2ProjectSccBigQueryExport struct {
	pulumi.CustomResourceState

	// This must be unique within the organization.
	BigQueryExportId pulumi.StringOutput `pulumi:"bigQueryExportId"`
	// The time at which the BigQuery export was created. This field is set by the server and will be ignored if provided on export on creation.
	// A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits.
	// Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// The dataset to write findings' updates to.
	// Its format is "projects/[projectId]/datasets/[bigqueryDatasetId]".
	// BigQuery Dataset unique ID must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_).
	Dataset pulumi.StringPtrOutput `pulumi:"dataset"`
	// The description of the notification config (max of 1024 characters).
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Expression that defines the filter to apply across create/update
	// events of findings. The
	// expression is a list of zero or more restrictions combined via
	// logical operators AND and OR. Parentheses are supported, and OR
	// has higher precedence than AND.
	// Restrictions have the form <field> <operator> <value> and may have
	// a - character in front of them to indicate negation. The fields
	// map to those defined in the corresponding resource.
	// The supported operators are:
	// * = for all value types.
	// * > , <, >=, <= for integer values.
	// * :, meaning substring matching, for strings.
	//   The supported value types are:
	// * string literals in quotes.
	// * integer literals without quotes.
	// * boolean literals true and false without quotes.
	//   See
	//   [Filtering notifications](https://cloud.google.com/security-command-center/docs/how-to-api-filter-notifications)
	//   for information on how to write a filter.
	Filter pulumi.StringPtrOutput `pulumi:"filter"`
	// location Id is provided by organization. If not provided, Use global as default.
	Location pulumi.StringPtrOutput `pulumi:"location"`
	// Email address of the user who last edited the BigQuery export.
	// This field is set by the server and will be ignored if provided on export creation or update.
	MostRecentEditor pulumi.StringOutput `pulumi:"mostRecentEditor"`
	// The resource name of this export, in the format
	// `projects/{{project}}/locations/{{location}}/bigQueryExports/{{big_query_export_id}}`.
	// This field is provided in responses, and is ignored when provided in create requests.
	Name pulumi.StringOutput `pulumi:"name"`
	// The service account that needs permission to create table and upload data to the BigQuery dataset.
	Principal pulumi.StringOutput `pulumi:"principal"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringOutput `pulumi:"project"`
	// The most recent time at which the BigQuery export was updated. This field is set by the server and will be ignored if provided on export creation or update.
	// A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits.
	// Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
	UpdateTime pulumi.StringOutput `pulumi:"updateTime"`
}

// NewV2ProjectSccBigQueryExport registers a new resource with the given unique name, arguments, and options.
func NewV2ProjectSccBigQueryExport(ctx *pulumi.Context,
	name string, args *V2ProjectSccBigQueryExportArgs, opts ...pulumi.ResourceOption) (*V2ProjectSccBigQueryExport, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.BigQueryExportId == nil {
		return nil, errors.New("invalid value for required argument 'BigQueryExportId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource V2ProjectSccBigQueryExport
	err := ctx.RegisterResource("gcp:securitycenter/v2ProjectSccBigQueryExport:V2ProjectSccBigQueryExport", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetV2ProjectSccBigQueryExport gets an existing V2ProjectSccBigQueryExport resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetV2ProjectSccBigQueryExport(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *V2ProjectSccBigQueryExportState, opts ...pulumi.ResourceOption) (*V2ProjectSccBigQueryExport, error) {
	var resource V2ProjectSccBigQueryExport
	err := ctx.ReadResource("gcp:securitycenter/v2ProjectSccBigQueryExport:V2ProjectSccBigQueryExport", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering V2ProjectSccBigQueryExport resources.
type v2projectSccBigQueryExportState struct {
	// This must be unique within the organization.
	BigQueryExportId *string `pulumi:"bigQueryExportId"`
	// The time at which the BigQuery export was created. This field is set by the server and will be ignored if provided on export on creation.
	// A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits.
	// Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
	CreateTime *string `pulumi:"createTime"`
	// The dataset to write findings' updates to.
	// Its format is "projects/[projectId]/datasets/[bigqueryDatasetId]".
	// BigQuery Dataset unique ID must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_).
	Dataset *string `pulumi:"dataset"`
	// The description of the notification config (max of 1024 characters).
	Description *string `pulumi:"description"`
	// Expression that defines the filter to apply across create/update
	// events of findings. The
	// expression is a list of zero or more restrictions combined via
	// logical operators AND and OR. Parentheses are supported, and OR
	// has higher precedence than AND.
	// Restrictions have the form <field> <operator> <value> and may have
	// a - character in front of them to indicate negation. The fields
	// map to those defined in the corresponding resource.
	// The supported operators are:
	// * = for all value types.
	// * > , <, >=, <= for integer values.
	// * :, meaning substring matching, for strings.
	//   The supported value types are:
	// * string literals in quotes.
	// * integer literals without quotes.
	// * boolean literals true and false without quotes.
	//   See
	//   [Filtering notifications](https://cloud.google.com/security-command-center/docs/how-to-api-filter-notifications)
	//   for information on how to write a filter.
	Filter *string `pulumi:"filter"`
	// location Id is provided by organization. If not provided, Use global as default.
	Location *string `pulumi:"location"`
	// Email address of the user who last edited the BigQuery export.
	// This field is set by the server and will be ignored if provided on export creation or update.
	MostRecentEditor *string `pulumi:"mostRecentEditor"`
	// The resource name of this export, in the format
	// `projects/{{project}}/locations/{{location}}/bigQueryExports/{{big_query_export_id}}`.
	// This field is provided in responses, and is ignored when provided in create requests.
	Name *string `pulumi:"name"`
	// The service account that needs permission to create table and upload data to the BigQuery dataset.
	Principal *string `pulumi:"principal"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
	// The most recent time at which the BigQuery export was updated. This field is set by the server and will be ignored if provided on export creation or update.
	// A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits.
	// Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
	UpdateTime *string `pulumi:"updateTime"`
}

type V2ProjectSccBigQueryExportState struct {
	// This must be unique within the organization.
	BigQueryExportId pulumi.StringPtrInput
	// The time at which the BigQuery export was created. This field is set by the server and will be ignored if provided on export on creation.
	// A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits.
	// Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
	CreateTime pulumi.StringPtrInput
	// The dataset to write findings' updates to.
	// Its format is "projects/[projectId]/datasets/[bigqueryDatasetId]".
	// BigQuery Dataset unique ID must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_).
	Dataset pulumi.StringPtrInput
	// The description of the notification config (max of 1024 characters).
	Description pulumi.StringPtrInput
	// Expression that defines the filter to apply across create/update
	// events of findings. The
	// expression is a list of zero or more restrictions combined via
	// logical operators AND and OR. Parentheses are supported, and OR
	// has higher precedence than AND.
	// Restrictions have the form <field> <operator> <value> and may have
	// a - character in front of them to indicate negation. The fields
	// map to those defined in the corresponding resource.
	// The supported operators are:
	// * = for all value types.
	// * > , <, >=, <= for integer values.
	// * :, meaning substring matching, for strings.
	//   The supported value types are:
	// * string literals in quotes.
	// * integer literals without quotes.
	// * boolean literals true and false without quotes.
	//   See
	//   [Filtering notifications](https://cloud.google.com/security-command-center/docs/how-to-api-filter-notifications)
	//   for information on how to write a filter.
	Filter pulumi.StringPtrInput
	// location Id is provided by organization. If not provided, Use global as default.
	Location pulumi.StringPtrInput
	// Email address of the user who last edited the BigQuery export.
	// This field is set by the server and will be ignored if provided on export creation or update.
	MostRecentEditor pulumi.StringPtrInput
	// The resource name of this export, in the format
	// `projects/{{project}}/locations/{{location}}/bigQueryExports/{{big_query_export_id}}`.
	// This field is provided in responses, and is ignored when provided in create requests.
	Name pulumi.StringPtrInput
	// The service account that needs permission to create table and upload data to the BigQuery dataset.
	Principal pulumi.StringPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
	// The most recent time at which the BigQuery export was updated. This field is set by the server and will be ignored if provided on export creation or update.
	// A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits.
	// Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
	UpdateTime pulumi.StringPtrInput
}

func (V2ProjectSccBigQueryExportState) ElementType() reflect.Type {
	return reflect.TypeOf((*v2projectSccBigQueryExportState)(nil)).Elem()
}

type v2projectSccBigQueryExportArgs struct {
	// This must be unique within the organization.
	BigQueryExportId string `pulumi:"bigQueryExportId"`
	// The dataset to write findings' updates to.
	// Its format is "projects/[projectId]/datasets/[bigqueryDatasetId]".
	// BigQuery Dataset unique ID must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_).
	Dataset *string `pulumi:"dataset"`
	// The description of the notification config (max of 1024 characters).
	Description *string `pulumi:"description"`
	// Expression that defines the filter to apply across create/update
	// events of findings. The
	// expression is a list of zero or more restrictions combined via
	// logical operators AND and OR. Parentheses are supported, and OR
	// has higher precedence than AND.
	// Restrictions have the form <field> <operator> <value> and may have
	// a - character in front of them to indicate negation. The fields
	// map to those defined in the corresponding resource.
	// The supported operators are:
	// * = for all value types.
	// * > , <, >=, <= for integer values.
	// * :, meaning substring matching, for strings.
	//   The supported value types are:
	// * string literals in quotes.
	// * integer literals without quotes.
	// * boolean literals true and false without quotes.
	//   See
	//   [Filtering notifications](https://cloud.google.com/security-command-center/docs/how-to-api-filter-notifications)
	//   for information on how to write a filter.
	Filter *string `pulumi:"filter"`
	// location Id is provided by organization. If not provided, Use global as default.
	Location *string `pulumi:"location"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
}

// The set of arguments for constructing a V2ProjectSccBigQueryExport resource.
type V2ProjectSccBigQueryExportArgs struct {
	// This must be unique within the organization.
	BigQueryExportId pulumi.StringInput
	// The dataset to write findings' updates to.
	// Its format is "projects/[projectId]/datasets/[bigqueryDatasetId]".
	// BigQuery Dataset unique ID must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_).
	Dataset pulumi.StringPtrInput
	// The description of the notification config (max of 1024 characters).
	Description pulumi.StringPtrInput
	// Expression that defines the filter to apply across create/update
	// events of findings. The
	// expression is a list of zero or more restrictions combined via
	// logical operators AND and OR. Parentheses are supported, and OR
	// has higher precedence than AND.
	// Restrictions have the form <field> <operator> <value> and may have
	// a - character in front of them to indicate negation. The fields
	// map to those defined in the corresponding resource.
	// The supported operators are:
	// * = for all value types.
	// * > , <, >=, <= for integer values.
	// * :, meaning substring matching, for strings.
	//   The supported value types are:
	// * string literals in quotes.
	// * integer literals without quotes.
	// * boolean literals true and false without quotes.
	//   See
	//   [Filtering notifications](https://cloud.google.com/security-command-center/docs/how-to-api-filter-notifications)
	//   for information on how to write a filter.
	Filter pulumi.StringPtrInput
	// location Id is provided by organization. If not provided, Use global as default.
	Location pulumi.StringPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
}

func (V2ProjectSccBigQueryExportArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*v2projectSccBigQueryExportArgs)(nil)).Elem()
}

type V2ProjectSccBigQueryExportInput interface {
	pulumi.Input

	ToV2ProjectSccBigQueryExportOutput() V2ProjectSccBigQueryExportOutput
	ToV2ProjectSccBigQueryExportOutputWithContext(ctx context.Context) V2ProjectSccBigQueryExportOutput
}

func (*V2ProjectSccBigQueryExport) ElementType() reflect.Type {
	return reflect.TypeOf((**V2ProjectSccBigQueryExport)(nil)).Elem()
}

func (i *V2ProjectSccBigQueryExport) ToV2ProjectSccBigQueryExportOutput() V2ProjectSccBigQueryExportOutput {
	return i.ToV2ProjectSccBigQueryExportOutputWithContext(context.Background())
}

func (i *V2ProjectSccBigQueryExport) ToV2ProjectSccBigQueryExportOutputWithContext(ctx context.Context) V2ProjectSccBigQueryExportOutput {
	return pulumi.ToOutputWithContext(ctx, i).(V2ProjectSccBigQueryExportOutput)
}

// V2ProjectSccBigQueryExportArrayInput is an input type that accepts V2ProjectSccBigQueryExportArray and V2ProjectSccBigQueryExportArrayOutput values.
// You can construct a concrete instance of `V2ProjectSccBigQueryExportArrayInput` via:
//
//	V2ProjectSccBigQueryExportArray{ V2ProjectSccBigQueryExportArgs{...} }
type V2ProjectSccBigQueryExportArrayInput interface {
	pulumi.Input

	ToV2ProjectSccBigQueryExportArrayOutput() V2ProjectSccBigQueryExportArrayOutput
	ToV2ProjectSccBigQueryExportArrayOutputWithContext(context.Context) V2ProjectSccBigQueryExportArrayOutput
}

type V2ProjectSccBigQueryExportArray []V2ProjectSccBigQueryExportInput

func (V2ProjectSccBigQueryExportArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*V2ProjectSccBigQueryExport)(nil)).Elem()
}

func (i V2ProjectSccBigQueryExportArray) ToV2ProjectSccBigQueryExportArrayOutput() V2ProjectSccBigQueryExportArrayOutput {
	return i.ToV2ProjectSccBigQueryExportArrayOutputWithContext(context.Background())
}

func (i V2ProjectSccBigQueryExportArray) ToV2ProjectSccBigQueryExportArrayOutputWithContext(ctx context.Context) V2ProjectSccBigQueryExportArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(V2ProjectSccBigQueryExportArrayOutput)
}

// V2ProjectSccBigQueryExportMapInput is an input type that accepts V2ProjectSccBigQueryExportMap and V2ProjectSccBigQueryExportMapOutput values.
// You can construct a concrete instance of `V2ProjectSccBigQueryExportMapInput` via:
//
//	V2ProjectSccBigQueryExportMap{ "key": V2ProjectSccBigQueryExportArgs{...} }
type V2ProjectSccBigQueryExportMapInput interface {
	pulumi.Input

	ToV2ProjectSccBigQueryExportMapOutput() V2ProjectSccBigQueryExportMapOutput
	ToV2ProjectSccBigQueryExportMapOutputWithContext(context.Context) V2ProjectSccBigQueryExportMapOutput
}

type V2ProjectSccBigQueryExportMap map[string]V2ProjectSccBigQueryExportInput

func (V2ProjectSccBigQueryExportMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*V2ProjectSccBigQueryExport)(nil)).Elem()
}

func (i V2ProjectSccBigQueryExportMap) ToV2ProjectSccBigQueryExportMapOutput() V2ProjectSccBigQueryExportMapOutput {
	return i.ToV2ProjectSccBigQueryExportMapOutputWithContext(context.Background())
}

func (i V2ProjectSccBigQueryExportMap) ToV2ProjectSccBigQueryExportMapOutputWithContext(ctx context.Context) V2ProjectSccBigQueryExportMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(V2ProjectSccBigQueryExportMapOutput)
}

type V2ProjectSccBigQueryExportOutput struct{ *pulumi.OutputState }

func (V2ProjectSccBigQueryExportOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**V2ProjectSccBigQueryExport)(nil)).Elem()
}

func (o V2ProjectSccBigQueryExportOutput) ToV2ProjectSccBigQueryExportOutput() V2ProjectSccBigQueryExportOutput {
	return o
}

func (o V2ProjectSccBigQueryExportOutput) ToV2ProjectSccBigQueryExportOutputWithContext(ctx context.Context) V2ProjectSccBigQueryExportOutput {
	return o
}

// This must be unique within the organization.
func (o V2ProjectSccBigQueryExportOutput) BigQueryExportId() pulumi.StringOutput {
	return o.ApplyT(func(v *V2ProjectSccBigQueryExport) pulumi.StringOutput { return v.BigQueryExportId }).(pulumi.StringOutput)
}

// The time at which the BigQuery export was created. This field is set by the server and will be ignored if provided on export on creation.
// A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits.
// Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
func (o V2ProjectSccBigQueryExportOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *V2ProjectSccBigQueryExport) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// The dataset to write findings' updates to.
// Its format is "projects/[projectId]/datasets/[bigqueryDatasetId]".
// BigQuery Dataset unique ID must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_).
func (o V2ProjectSccBigQueryExportOutput) Dataset() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *V2ProjectSccBigQueryExport) pulumi.StringPtrOutput { return v.Dataset }).(pulumi.StringPtrOutput)
}

// The description of the notification config (max of 1024 characters).
func (o V2ProjectSccBigQueryExportOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *V2ProjectSccBigQueryExport) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Expression that defines the filter to apply across create/update
// events of findings. The
// expression is a list of zero or more restrictions combined via
// logical operators AND and OR. Parentheses are supported, and OR
// has higher precedence than AND.
// Restrictions have the form <field> <operator> <value> and may have
// a - character in front of them to indicate negation. The fields
// map to those defined in the corresponding resource.
// The supported operators are:
//   - = for all value types.
//   - > , <, >=, <= for integer values.
//   - :, meaning substring matching, for strings.
//     The supported value types are:
//   - string literals in quotes.
//   - integer literals without quotes.
//   - boolean literals true and false without quotes.
//     See
//     [Filtering notifications](https://cloud.google.com/security-command-center/docs/how-to-api-filter-notifications)
//     for information on how to write a filter.
func (o V2ProjectSccBigQueryExportOutput) Filter() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *V2ProjectSccBigQueryExport) pulumi.StringPtrOutput { return v.Filter }).(pulumi.StringPtrOutput)
}

// location Id is provided by organization. If not provided, Use global as default.
func (o V2ProjectSccBigQueryExportOutput) Location() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *V2ProjectSccBigQueryExport) pulumi.StringPtrOutput { return v.Location }).(pulumi.StringPtrOutput)
}

// Email address of the user who last edited the BigQuery export.
// This field is set by the server and will be ignored if provided on export creation or update.
func (o V2ProjectSccBigQueryExportOutput) MostRecentEditor() pulumi.StringOutput {
	return o.ApplyT(func(v *V2ProjectSccBigQueryExport) pulumi.StringOutput { return v.MostRecentEditor }).(pulumi.StringOutput)
}

// The resource name of this export, in the format
// `projects/{{project}}/locations/{{location}}/bigQueryExports/{{big_query_export_id}}`.
// This field is provided in responses, and is ignored when provided in create requests.
func (o V2ProjectSccBigQueryExportOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *V2ProjectSccBigQueryExport) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The service account that needs permission to create table and upload data to the BigQuery dataset.
func (o V2ProjectSccBigQueryExportOutput) Principal() pulumi.StringOutput {
	return o.ApplyT(func(v *V2ProjectSccBigQueryExport) pulumi.StringOutput { return v.Principal }).(pulumi.StringOutput)
}

// The ID of the project in which the resource belongs.
// If it is not provided, the provider project is used.
func (o V2ProjectSccBigQueryExportOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *V2ProjectSccBigQueryExport) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// The most recent time at which the BigQuery export was updated. This field is set by the server and will be ignored if provided on export creation or update.
// A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits.
// Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
func (o V2ProjectSccBigQueryExportOutput) UpdateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *V2ProjectSccBigQueryExport) pulumi.StringOutput { return v.UpdateTime }).(pulumi.StringOutput)
}

type V2ProjectSccBigQueryExportArrayOutput struct{ *pulumi.OutputState }

func (V2ProjectSccBigQueryExportArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*V2ProjectSccBigQueryExport)(nil)).Elem()
}

func (o V2ProjectSccBigQueryExportArrayOutput) ToV2ProjectSccBigQueryExportArrayOutput() V2ProjectSccBigQueryExportArrayOutput {
	return o
}

func (o V2ProjectSccBigQueryExportArrayOutput) ToV2ProjectSccBigQueryExportArrayOutputWithContext(ctx context.Context) V2ProjectSccBigQueryExportArrayOutput {
	return o
}

func (o V2ProjectSccBigQueryExportArrayOutput) Index(i pulumi.IntInput) V2ProjectSccBigQueryExportOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *V2ProjectSccBigQueryExport {
		return vs[0].([]*V2ProjectSccBigQueryExport)[vs[1].(int)]
	}).(V2ProjectSccBigQueryExportOutput)
}

type V2ProjectSccBigQueryExportMapOutput struct{ *pulumi.OutputState }

func (V2ProjectSccBigQueryExportMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*V2ProjectSccBigQueryExport)(nil)).Elem()
}

func (o V2ProjectSccBigQueryExportMapOutput) ToV2ProjectSccBigQueryExportMapOutput() V2ProjectSccBigQueryExportMapOutput {
	return o
}

func (o V2ProjectSccBigQueryExportMapOutput) ToV2ProjectSccBigQueryExportMapOutputWithContext(ctx context.Context) V2ProjectSccBigQueryExportMapOutput {
	return o
}

func (o V2ProjectSccBigQueryExportMapOutput) MapIndex(k pulumi.StringInput) V2ProjectSccBigQueryExportOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *V2ProjectSccBigQueryExport {
		return vs[0].(map[string]*V2ProjectSccBigQueryExport)[vs[1].(string)]
	}).(V2ProjectSccBigQueryExportOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*V2ProjectSccBigQueryExportInput)(nil)).Elem(), &V2ProjectSccBigQueryExport{})
	pulumi.RegisterInputType(reflect.TypeOf((*V2ProjectSccBigQueryExportArrayInput)(nil)).Elem(), V2ProjectSccBigQueryExportArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*V2ProjectSccBigQueryExportMapInput)(nil)).Elem(), V2ProjectSccBigQueryExportMap{})
	pulumi.RegisterOutputType(V2ProjectSccBigQueryExportOutput{})
	pulumi.RegisterOutputType(V2ProjectSccBigQueryExportArrayOutput{})
	pulumi.RegisterOutputType(V2ProjectSccBigQueryExportMapOutput{})
}
