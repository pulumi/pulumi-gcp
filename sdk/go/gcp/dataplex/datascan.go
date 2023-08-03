// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dataplex

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Represents a user-visible job which provides the insights for the related data source.
//
// To get more information about Datascan, see:
//
// * [API documentation](https://cloud.google.com/dataplex/docs/reference/rest)
// * How-to Guides
//   - [Official Documentation](https://cloud.google.com/dataplex/docs)
//
// ## Example Usage
// ### Dataplex Datascan Basic Profile
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/dataplex"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := dataplex.NewDatascan(ctx, "basicProfile", &dataplex.DatascanArgs{
//				Data: &dataplex.DatascanDataArgs{
//					Resource: pulumi.String("//bigquery.googleapis.com/projects/bigquery-public-data/datasets/samples/tables/shakespeare"),
//				},
//				DataProfileSpec: nil,
//				DataScanId:      pulumi.String("tf-test-datascan%{random_suffix}"),
//				ExecutionSpec: &dataplex.DatascanExecutionSpecArgs{
//					Trigger: &dataplex.DatascanExecutionSpecTriggerArgs{
//						OnDemand: nil,
//					},
//				},
//				Location: pulumi.String("us-central1"),
//				Project:  pulumi.String("my-project-name"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Dataplex Datascan Full Profile
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/dataplex"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := dataplex.NewDatascan(ctx, "fullProfile", &dataplex.DatascanArgs{
//				Data: &dataplex.DatascanDataArgs{
//					Resource: pulumi.String("//bigquery.googleapis.com/projects/bigquery-public-data/datasets/samples/tables/shakespeare"),
//				},
//				DataProfileSpec: &dataplex.DatascanDataProfileSpecArgs{
//					RowFilter:       pulumi.String("word_count > 10"),
//					SamplingPercent: pulumi.Float64(80),
//				},
//				DataScanId:  pulumi.String("tf-test-datascan%{random_suffix}"),
//				Description: pulumi.String("Example resource - Full Datascan Profile"),
//				DisplayName: pulumi.String("Full Datascan Profile"),
//				ExecutionSpec: &dataplex.DatascanExecutionSpecArgs{
//					Trigger: &dataplex.DatascanExecutionSpecTriggerArgs{
//						Schedule: &dataplex.DatascanExecutionSpecTriggerScheduleArgs{
//							Cron: pulumi.String("TZ=America/New_York 1 1 * * *"),
//						},
//					},
//				},
//				Labels: pulumi.StringMap{
//					"author": pulumi.String("billing"),
//				},
//				Location: pulumi.String("us-central1"),
//				Project:  pulumi.String("my-project-name"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Dataplex Datascan Basic Quality
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/dataplex"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := dataplex.NewDatascan(ctx, "basicQuality", &dataplex.DatascanArgs{
//				Data: &dataplex.DatascanDataArgs{
//					Resource: pulumi.String("//bigquery.googleapis.com/projects/bigquery-public-data/datasets/samples/tables/shakespeare"),
//				},
//				DataQualitySpec: &dataplex.DatascanDataQualitySpecArgs{
//					Rules: dataplex.DatascanDataQualitySpecRuleArray{
//						&dataplex.DatascanDataQualitySpecRuleArgs{
//							Dimension: pulumi.String("VALIDITY"),
//							TableConditionExpectation: &dataplex.DatascanDataQualitySpecRuleTableConditionExpectationArgs{
//								SqlExpression: pulumi.String("COUNT(*) > 0"),
//							},
//						},
//					},
//				},
//				DataScanId: pulumi.String("tf-test-datascan%{random_suffix}"),
//				ExecutionSpec: &dataplex.DatascanExecutionSpecArgs{
//					Trigger: &dataplex.DatascanExecutionSpecTriggerArgs{
//						OnDemand: nil,
//					},
//				},
//				Location: pulumi.String("us-central1"),
//				Project:  pulumi.String("my-project-name"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Dataplex Datascan Full Quality
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/dataplex"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := dataplex.NewDatascan(ctx, "fullQuality", &dataplex.DatascanArgs{
//				Data: &dataplex.DatascanDataArgs{
//					Resource: pulumi.String("//bigquery.googleapis.com/projects/bigquery-public-data/datasets/austin_bikeshare/tables/bikeshare_stations"),
//				},
//				DataQualitySpec: &dataplex.DatascanDataQualitySpecArgs{
//					RowFilter: pulumi.String("station_id > 1000"),
//					Rules: dataplex.DatascanDataQualitySpecRuleArray{
//						&dataplex.DatascanDataQualitySpecRuleArgs{
//							Column:             pulumi.String("address"),
//							Dimension:          pulumi.String("VALIDITY"),
//							NonNullExpectation: nil,
//							Threshold:          pulumi.Float64(0.99),
//						},
//						&dataplex.DatascanDataQualitySpecRuleArgs{
//							Column:     pulumi.String("council_district"),
//							Dimension:  pulumi.String("VALIDITY"),
//							IgnoreNull: pulumi.Bool(true),
//							RangeExpectation: &dataplex.DatascanDataQualitySpecRuleRangeExpectationArgs{
//								MaxValue:         pulumi.String("10"),
//								MinValue:         pulumi.String("1"),
//								StrictMaxEnabled: pulumi.Bool(false),
//								StrictMinEnabled: pulumi.Bool(true),
//							},
//							Threshold: pulumi.Float64(0.9),
//						},
//						&dataplex.DatascanDataQualitySpecRuleArgs{
//							Column:     pulumi.String("power_type"),
//							Dimension:  pulumi.String("VALIDITY"),
//							IgnoreNull: pulumi.Bool(false),
//							RegexExpectation: &dataplex.DatascanDataQualitySpecRuleRegexExpectationArgs{
//								Regex: pulumi.String(".*solar.*"),
//							},
//						},
//						&dataplex.DatascanDataQualitySpecRuleArgs{
//							Column:     pulumi.String("property_type"),
//							Dimension:  pulumi.String("VALIDITY"),
//							IgnoreNull: pulumi.Bool(false),
//							SetExpectation: &dataplex.DatascanDataQualitySpecRuleSetExpectationArgs{
//								Values: pulumi.StringArray{
//									pulumi.String("sidewalk"),
//									pulumi.String("parkland"),
//								},
//							},
//						},
//						&dataplex.DatascanDataQualitySpecRuleArgs{
//							Column:                pulumi.String("address"),
//							Dimension:             pulumi.String("UNIQUENESS"),
//							UniquenessExpectation: nil,
//						},
//						&dataplex.DatascanDataQualitySpecRuleArgs{
//							Column:    pulumi.String("number_of_docks"),
//							Dimension: pulumi.String("VALIDITY"),
//							StatisticRangeExpectation: &dataplex.DatascanDataQualitySpecRuleStatisticRangeExpectationArgs{
//								MaxValue:         pulumi.String("15"),
//								MinValue:         pulumi.String("5"),
//								Statistic:        pulumi.String("MEAN"),
//								StrictMaxEnabled: pulumi.Bool(true),
//								StrictMinEnabled: pulumi.Bool(true),
//							},
//						},
//						&dataplex.DatascanDataQualitySpecRuleArgs{
//							Column:    pulumi.String("footprint_length"),
//							Dimension: pulumi.String("VALIDITY"),
//							RowConditionExpectation: &dataplex.DatascanDataQualitySpecRuleRowConditionExpectationArgs{
//								SqlExpression: pulumi.String("footprint_length > 0 AND footprint_length <= 10"),
//							},
//						},
//						&dataplex.DatascanDataQualitySpecRuleArgs{
//							Dimension: pulumi.String("VALIDITY"),
//							TableConditionExpectation: &dataplex.DatascanDataQualitySpecRuleTableConditionExpectationArgs{
//								SqlExpression: pulumi.String("COUNT(*) > 0"),
//							},
//						},
//					},
//					SamplingPercent: pulumi.Float64(5),
//				},
//				DataScanId:  pulumi.String("tf-test-datascan%{random_suffix}"),
//				Description: pulumi.String("Example resource - Full Datascan Quality"),
//				DisplayName: pulumi.String("Full Datascan Quality"),
//				ExecutionSpec: &dataplex.DatascanExecutionSpecArgs{
//					Field: pulumi.String("modified_date"),
//					Trigger: &dataplex.DatascanExecutionSpecTriggerArgs{
//						Schedule: &dataplex.DatascanExecutionSpecTriggerScheduleArgs{
//							Cron: pulumi.String("TZ=America/New_York 1 1 * * *"),
//						},
//					},
//				},
//				Labels: pulumi.StringMap{
//					"author": pulumi.String("billing"),
//				},
//				Location: pulumi.String("us-central1"),
//				Project:  pulumi.String("my-project-name"),
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
// # Datascan can be imported using any of these accepted formats
//
// ```sh
//
//	$ pulumi import gcp:dataplex/datascan:Datascan default projects/{{project}}/locations/{{location}}/dataScans/{{data_scan_id}}
//
// ```
//
// ```sh
//
//	$ pulumi import gcp:dataplex/datascan:Datascan default {{project}}/{{location}}/{{data_scan_id}}
//
// ```
//
// ```sh
//
//	$ pulumi import gcp:dataplex/datascan:Datascan default {{location}}/{{data_scan_id}}
//
// ```
//
// ```sh
//
//	$ pulumi import gcp:dataplex/datascan:Datascan default {{data_scan_id}}
//
// ```
type Datascan struct {
	pulumi.CustomResourceState

	// The time when the scan was created.
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// The data source for DataScan.
	// Structure is documented below.
	Data DatascanDataOutput `pulumi:"data"`
	// The result of the data profile scan.
	// Structure is documented below.
	DataProfileResults DatascanDataProfileResultArrayOutput `pulumi:"dataProfileResults"`
	// DataProfileScan related setting.
	// Structure is documented below.
	DataProfileSpec DatascanDataProfileSpecPtrOutput `pulumi:"dataProfileSpec"`
	// The result of the data quality scan.
	// Structure is documented below.
	DataQualityResults DatascanDataQualityResultArrayOutput `pulumi:"dataQualityResults"`
	// DataQualityScan related setting.
	// Structure is documented below.
	DataQualitySpec DatascanDataQualitySpecPtrOutput `pulumi:"dataQualitySpec"`
	// DataScan identifier. Must contain only lowercase letters, numbers and hyphens. Must start with a letter. Must end with a number or a letter.
	DataScanId pulumi.StringOutput `pulumi:"dataScanId"`
	// Description of the scan.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// User friendly display name.
	DisplayName pulumi.StringPtrOutput `pulumi:"displayName"`
	// DataScan execution settings.
	// Structure is documented below.
	ExecutionSpec DatascanExecutionSpecOutput `pulumi:"executionSpec"`
	// Status of the data scan execution.
	// Structure is documented below.
	ExecutionStatuses DatascanExecutionStatusArrayOutput `pulumi:"executionStatuses"`
	// User-defined labels for the scan. A list of key->value pairs.
	Labels pulumi.StringMapOutput `pulumi:"labels"`
	// The location where the data scan should reside.
	Location pulumi.StringOutput `pulumi:"location"`
	// The name of the field.
	Name pulumi.StringOutput `pulumi:"name"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringOutput `pulumi:"project"`
	// Current state of the DataScan.
	State pulumi.StringOutput `pulumi:"state"`
	// The field data type.
	Type pulumi.StringOutput `pulumi:"type"`
	// System generated globally unique ID for the scan. This ID will be different if the scan is deleted and re-created with the same name.
	Uid pulumi.StringOutput `pulumi:"uid"`
	// The time when the scan was last updated.
	UpdateTime pulumi.StringOutput `pulumi:"updateTime"`
}

// NewDatascan registers a new resource with the given unique name, arguments, and options.
func NewDatascan(ctx *pulumi.Context,
	name string, args *DatascanArgs, opts ...pulumi.ResourceOption) (*Datascan, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Data == nil {
		return nil, errors.New("invalid value for required argument 'Data'")
	}
	if args.DataScanId == nil {
		return nil, errors.New("invalid value for required argument 'DataScanId'")
	}
	if args.ExecutionSpec == nil {
		return nil, errors.New("invalid value for required argument 'ExecutionSpec'")
	}
	if args.Location == nil {
		return nil, errors.New("invalid value for required argument 'Location'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Datascan
	err := ctx.RegisterResource("gcp:dataplex/datascan:Datascan", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDatascan gets an existing Datascan resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDatascan(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DatascanState, opts ...pulumi.ResourceOption) (*Datascan, error) {
	var resource Datascan
	err := ctx.ReadResource("gcp:dataplex/datascan:Datascan", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Datascan resources.
type datascanState struct {
	// The time when the scan was created.
	CreateTime *string `pulumi:"createTime"`
	// The data source for DataScan.
	// Structure is documented below.
	Data *DatascanData `pulumi:"data"`
	// The result of the data profile scan.
	// Structure is documented below.
	DataProfileResults []DatascanDataProfileResult `pulumi:"dataProfileResults"`
	// DataProfileScan related setting.
	// Structure is documented below.
	DataProfileSpec *DatascanDataProfileSpec `pulumi:"dataProfileSpec"`
	// The result of the data quality scan.
	// Structure is documented below.
	DataQualityResults []DatascanDataQualityResult `pulumi:"dataQualityResults"`
	// DataQualityScan related setting.
	// Structure is documented below.
	DataQualitySpec *DatascanDataQualitySpec `pulumi:"dataQualitySpec"`
	// DataScan identifier. Must contain only lowercase letters, numbers and hyphens. Must start with a letter. Must end with a number or a letter.
	DataScanId *string `pulumi:"dataScanId"`
	// Description of the scan.
	Description *string `pulumi:"description"`
	// User friendly display name.
	DisplayName *string `pulumi:"displayName"`
	// DataScan execution settings.
	// Structure is documented below.
	ExecutionSpec *DatascanExecutionSpec `pulumi:"executionSpec"`
	// Status of the data scan execution.
	// Structure is documented below.
	ExecutionStatuses []DatascanExecutionStatus `pulumi:"executionStatuses"`
	// User-defined labels for the scan. A list of key->value pairs.
	Labels map[string]string `pulumi:"labels"`
	// The location where the data scan should reside.
	Location *string `pulumi:"location"`
	// The name of the field.
	Name *string `pulumi:"name"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
	// Current state of the DataScan.
	State *string `pulumi:"state"`
	// The field data type.
	Type *string `pulumi:"type"`
	// System generated globally unique ID for the scan. This ID will be different if the scan is deleted and re-created with the same name.
	Uid *string `pulumi:"uid"`
	// The time when the scan was last updated.
	UpdateTime *string `pulumi:"updateTime"`
}

type DatascanState struct {
	// The time when the scan was created.
	CreateTime pulumi.StringPtrInput
	// The data source for DataScan.
	// Structure is documented below.
	Data DatascanDataPtrInput
	// The result of the data profile scan.
	// Structure is documented below.
	DataProfileResults DatascanDataProfileResultArrayInput
	// DataProfileScan related setting.
	// Structure is documented below.
	DataProfileSpec DatascanDataProfileSpecPtrInput
	// The result of the data quality scan.
	// Structure is documented below.
	DataQualityResults DatascanDataQualityResultArrayInput
	// DataQualityScan related setting.
	// Structure is documented below.
	DataQualitySpec DatascanDataQualitySpecPtrInput
	// DataScan identifier. Must contain only lowercase letters, numbers and hyphens. Must start with a letter. Must end with a number or a letter.
	DataScanId pulumi.StringPtrInput
	// Description of the scan.
	Description pulumi.StringPtrInput
	// User friendly display name.
	DisplayName pulumi.StringPtrInput
	// DataScan execution settings.
	// Structure is documented below.
	ExecutionSpec DatascanExecutionSpecPtrInput
	// Status of the data scan execution.
	// Structure is documented below.
	ExecutionStatuses DatascanExecutionStatusArrayInput
	// User-defined labels for the scan. A list of key->value pairs.
	Labels pulumi.StringMapInput
	// The location where the data scan should reside.
	Location pulumi.StringPtrInput
	// The name of the field.
	Name pulumi.StringPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
	// Current state of the DataScan.
	State pulumi.StringPtrInput
	// The field data type.
	Type pulumi.StringPtrInput
	// System generated globally unique ID for the scan. This ID will be different if the scan is deleted and re-created with the same name.
	Uid pulumi.StringPtrInput
	// The time when the scan was last updated.
	UpdateTime pulumi.StringPtrInput
}

func (DatascanState) ElementType() reflect.Type {
	return reflect.TypeOf((*datascanState)(nil)).Elem()
}

type datascanArgs struct {
	// The data source for DataScan.
	// Structure is documented below.
	Data DatascanData `pulumi:"data"`
	// DataProfileScan related setting.
	// Structure is documented below.
	DataProfileSpec *DatascanDataProfileSpec `pulumi:"dataProfileSpec"`
	// DataQualityScan related setting.
	// Structure is documented below.
	DataQualitySpec *DatascanDataQualitySpec `pulumi:"dataQualitySpec"`
	// DataScan identifier. Must contain only lowercase letters, numbers and hyphens. Must start with a letter. Must end with a number or a letter.
	DataScanId string `pulumi:"dataScanId"`
	// Description of the scan.
	Description *string `pulumi:"description"`
	// User friendly display name.
	DisplayName *string `pulumi:"displayName"`
	// DataScan execution settings.
	// Structure is documented below.
	ExecutionSpec DatascanExecutionSpec `pulumi:"executionSpec"`
	// User-defined labels for the scan. A list of key->value pairs.
	Labels map[string]string `pulumi:"labels"`
	// The location where the data scan should reside.
	Location string `pulumi:"location"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
}

// The set of arguments for constructing a Datascan resource.
type DatascanArgs struct {
	// The data source for DataScan.
	// Structure is documented below.
	Data DatascanDataInput
	// DataProfileScan related setting.
	// Structure is documented below.
	DataProfileSpec DatascanDataProfileSpecPtrInput
	// DataQualityScan related setting.
	// Structure is documented below.
	DataQualitySpec DatascanDataQualitySpecPtrInput
	// DataScan identifier. Must contain only lowercase letters, numbers and hyphens. Must start with a letter. Must end with a number or a letter.
	DataScanId pulumi.StringInput
	// Description of the scan.
	Description pulumi.StringPtrInput
	// User friendly display name.
	DisplayName pulumi.StringPtrInput
	// DataScan execution settings.
	// Structure is documented below.
	ExecutionSpec DatascanExecutionSpecInput
	// User-defined labels for the scan. A list of key->value pairs.
	Labels pulumi.StringMapInput
	// The location where the data scan should reside.
	Location pulumi.StringInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
}

func (DatascanArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*datascanArgs)(nil)).Elem()
}

type DatascanInput interface {
	pulumi.Input

	ToDatascanOutput() DatascanOutput
	ToDatascanOutputWithContext(ctx context.Context) DatascanOutput
}

func (*Datascan) ElementType() reflect.Type {
	return reflect.TypeOf((**Datascan)(nil)).Elem()
}

func (i *Datascan) ToDatascanOutput() DatascanOutput {
	return i.ToDatascanOutputWithContext(context.Background())
}

func (i *Datascan) ToDatascanOutputWithContext(ctx context.Context) DatascanOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DatascanOutput)
}

// DatascanArrayInput is an input type that accepts DatascanArray and DatascanArrayOutput values.
// You can construct a concrete instance of `DatascanArrayInput` via:
//
//	DatascanArray{ DatascanArgs{...} }
type DatascanArrayInput interface {
	pulumi.Input

	ToDatascanArrayOutput() DatascanArrayOutput
	ToDatascanArrayOutputWithContext(context.Context) DatascanArrayOutput
}

type DatascanArray []DatascanInput

func (DatascanArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Datascan)(nil)).Elem()
}

func (i DatascanArray) ToDatascanArrayOutput() DatascanArrayOutput {
	return i.ToDatascanArrayOutputWithContext(context.Background())
}

func (i DatascanArray) ToDatascanArrayOutputWithContext(ctx context.Context) DatascanArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DatascanArrayOutput)
}

// DatascanMapInput is an input type that accepts DatascanMap and DatascanMapOutput values.
// You can construct a concrete instance of `DatascanMapInput` via:
//
//	DatascanMap{ "key": DatascanArgs{...} }
type DatascanMapInput interface {
	pulumi.Input

	ToDatascanMapOutput() DatascanMapOutput
	ToDatascanMapOutputWithContext(context.Context) DatascanMapOutput
}

type DatascanMap map[string]DatascanInput

func (DatascanMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Datascan)(nil)).Elem()
}

func (i DatascanMap) ToDatascanMapOutput() DatascanMapOutput {
	return i.ToDatascanMapOutputWithContext(context.Background())
}

func (i DatascanMap) ToDatascanMapOutputWithContext(ctx context.Context) DatascanMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DatascanMapOutput)
}

type DatascanOutput struct{ *pulumi.OutputState }

func (DatascanOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Datascan)(nil)).Elem()
}

func (o DatascanOutput) ToDatascanOutput() DatascanOutput {
	return o
}

func (o DatascanOutput) ToDatascanOutputWithContext(ctx context.Context) DatascanOutput {
	return o
}

// The time when the scan was created.
func (o DatascanOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *Datascan) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// The data source for DataScan.
// Structure is documented below.
func (o DatascanOutput) Data() DatascanDataOutput {
	return o.ApplyT(func(v *Datascan) DatascanDataOutput { return v.Data }).(DatascanDataOutput)
}

// The result of the data profile scan.
// Structure is documented below.
func (o DatascanOutput) DataProfileResults() DatascanDataProfileResultArrayOutput {
	return o.ApplyT(func(v *Datascan) DatascanDataProfileResultArrayOutput { return v.DataProfileResults }).(DatascanDataProfileResultArrayOutput)
}

// DataProfileScan related setting.
// Structure is documented below.
func (o DatascanOutput) DataProfileSpec() DatascanDataProfileSpecPtrOutput {
	return o.ApplyT(func(v *Datascan) DatascanDataProfileSpecPtrOutput { return v.DataProfileSpec }).(DatascanDataProfileSpecPtrOutput)
}

// The result of the data quality scan.
// Structure is documented below.
func (o DatascanOutput) DataQualityResults() DatascanDataQualityResultArrayOutput {
	return o.ApplyT(func(v *Datascan) DatascanDataQualityResultArrayOutput { return v.DataQualityResults }).(DatascanDataQualityResultArrayOutput)
}

// DataQualityScan related setting.
// Structure is documented below.
func (o DatascanOutput) DataQualitySpec() DatascanDataQualitySpecPtrOutput {
	return o.ApplyT(func(v *Datascan) DatascanDataQualitySpecPtrOutput { return v.DataQualitySpec }).(DatascanDataQualitySpecPtrOutput)
}

// DataScan identifier. Must contain only lowercase letters, numbers and hyphens. Must start with a letter. Must end with a number or a letter.
func (o DatascanOutput) DataScanId() pulumi.StringOutput {
	return o.ApplyT(func(v *Datascan) pulumi.StringOutput { return v.DataScanId }).(pulumi.StringOutput)
}

// Description of the scan.
func (o DatascanOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Datascan) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// User friendly display name.
func (o DatascanOutput) DisplayName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Datascan) pulumi.StringPtrOutput { return v.DisplayName }).(pulumi.StringPtrOutput)
}

// DataScan execution settings.
// Structure is documented below.
func (o DatascanOutput) ExecutionSpec() DatascanExecutionSpecOutput {
	return o.ApplyT(func(v *Datascan) DatascanExecutionSpecOutput { return v.ExecutionSpec }).(DatascanExecutionSpecOutput)
}

// Status of the data scan execution.
// Structure is documented below.
func (o DatascanOutput) ExecutionStatuses() DatascanExecutionStatusArrayOutput {
	return o.ApplyT(func(v *Datascan) DatascanExecutionStatusArrayOutput { return v.ExecutionStatuses }).(DatascanExecutionStatusArrayOutput)
}

// User-defined labels for the scan. A list of key->value pairs.
func (o DatascanOutput) Labels() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Datascan) pulumi.StringMapOutput { return v.Labels }).(pulumi.StringMapOutput)
}

// The location where the data scan should reside.
func (o DatascanOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *Datascan) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// The name of the field.
func (o DatascanOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Datascan) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The ID of the project in which the resource belongs.
// If it is not provided, the provider project is used.
func (o DatascanOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *Datascan) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// Current state of the DataScan.
func (o DatascanOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v *Datascan) pulumi.StringOutput { return v.State }).(pulumi.StringOutput)
}

// The field data type.
func (o DatascanOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *Datascan) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

// System generated globally unique ID for the scan. This ID will be different if the scan is deleted and re-created with the same name.
func (o DatascanOutput) Uid() pulumi.StringOutput {
	return o.ApplyT(func(v *Datascan) pulumi.StringOutput { return v.Uid }).(pulumi.StringOutput)
}

// The time when the scan was last updated.
func (o DatascanOutput) UpdateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *Datascan) pulumi.StringOutput { return v.UpdateTime }).(pulumi.StringOutput)
}

type DatascanArrayOutput struct{ *pulumi.OutputState }

func (DatascanArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Datascan)(nil)).Elem()
}

func (o DatascanArrayOutput) ToDatascanArrayOutput() DatascanArrayOutput {
	return o
}

func (o DatascanArrayOutput) ToDatascanArrayOutputWithContext(ctx context.Context) DatascanArrayOutput {
	return o
}

func (o DatascanArrayOutput) Index(i pulumi.IntInput) DatascanOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Datascan {
		return vs[0].([]*Datascan)[vs[1].(int)]
	}).(DatascanOutput)
}

type DatascanMapOutput struct{ *pulumi.OutputState }

func (DatascanMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Datascan)(nil)).Elem()
}

func (o DatascanMapOutput) ToDatascanMapOutput() DatascanMapOutput {
	return o
}

func (o DatascanMapOutput) ToDatascanMapOutputWithContext(ctx context.Context) DatascanMapOutput {
	return o
}

func (o DatascanMapOutput) MapIndex(k pulumi.StringInput) DatascanOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Datascan {
		return vs[0].(map[string]*Datascan)[vs[1].(string)]
	}).(DatascanOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DatascanInput)(nil)).Elem(), &Datascan{})
	pulumi.RegisterInputType(reflect.TypeOf((*DatascanArrayInput)(nil)).Elem(), DatascanArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DatascanMapInput)(nil)).Elem(), DatascanMap{})
	pulumi.RegisterOutputType(DatascanOutput{})
	pulumi.RegisterOutputType(DatascanArrayOutput{})
	pulumi.RegisterOutputType(DatascanMapOutput{})
}