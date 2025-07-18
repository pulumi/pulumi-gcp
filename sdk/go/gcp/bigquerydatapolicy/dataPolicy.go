// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package bigquerydatapolicy

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// A BigQuery Data Policy
//
// To get more information about DataPolicy, see:
//
// * [API documentation](https://cloud.google.com/bigquery/docs/reference/bigquerydatapolicy/rest/v1beta1/projects.locations.dataPolicies/create)
// * How-to Guides
//   - [Official Documentation](https://cloud.google.com/bigquery/docs/column-data-masking-intro)
//
// ## Example Usage
//
// ### Bigquery Datapolicy Data Policy Basic
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/bigquerydatapolicy"
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/datacatalog"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			taxonomy, err := datacatalog.NewTaxonomy(ctx, "taxonomy", &datacatalog.TaxonomyArgs{
//				Region:      pulumi.String("us-central1"),
//				DisplayName: pulumi.String("taxonomy"),
//				Description: pulumi.String("A collection of policy tags"),
//				ActivatedPolicyTypes: pulumi.StringArray{
//					pulumi.String("FINE_GRAINED_ACCESS_CONTROL"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			policyTag, err := datacatalog.NewPolicyTag(ctx, "policy_tag", &datacatalog.PolicyTagArgs{
//				Taxonomy:    taxonomy.ID(),
//				DisplayName: pulumi.String("Low security"),
//				Description: pulumi.String("A policy tag normally associated with low security items"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = bigquerydatapolicy.NewDataPolicy(ctx, "data_policy", &bigquerydatapolicy.DataPolicyArgs{
//				Location:       pulumi.String("us-central1"),
//				DataPolicyId:   pulumi.String("data_policy"),
//				PolicyTag:      policyTag.Name,
//				DataPolicyType: pulumi.String("COLUMN_LEVEL_SECURITY_POLICY"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Bigquery Datapolicy Data Policy Routine
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/bigquery"
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/bigquerydatapolicy"
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/datacatalog"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			taxonomy, err := datacatalog.NewTaxonomy(ctx, "taxonomy", &datacatalog.TaxonomyArgs{
//				Region:      pulumi.String("us-central1"),
//				DisplayName: pulumi.String("taxonomy"),
//				Description: pulumi.String("A collection of policy tags"),
//				ActivatedPolicyTypes: pulumi.StringArray{
//					pulumi.String("FINE_GRAINED_ACCESS_CONTROL"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			policyTag, err := datacatalog.NewPolicyTag(ctx, "policy_tag", &datacatalog.PolicyTagArgs{
//				Taxonomy:    taxonomy.ID(),
//				DisplayName: pulumi.String("Low security"),
//				Description: pulumi.String("A policy tag normally associated with low security items"),
//			})
//			if err != nil {
//				return err
//			}
//			test, err := bigquery.NewDataset(ctx, "test", &bigquery.DatasetArgs{
//				DatasetId: pulumi.String("dataset_id"),
//				Location:  pulumi.String("us-central1"),
//			})
//			if err != nil {
//				return err
//			}
//			customMaskingRoutine, err := bigquery.NewRoutine(ctx, "custom_masking_routine", &bigquery.RoutineArgs{
//				DatasetId:          test.DatasetId,
//				RoutineId:          pulumi.String("custom_masking_routine"),
//				RoutineType:        pulumi.String("SCALAR_FUNCTION"),
//				Language:           pulumi.String("SQL"),
//				DataGovernanceType: pulumi.String("DATA_MASKING"),
//				DefinitionBody:     pulumi.String("SAFE.REGEXP_REPLACE(ssn, '[0-9]', 'X')"),
//				ReturnType:         pulumi.String("{\"typeKind\" :  \"STRING\"}"),
//				Arguments: bigquery.RoutineArgumentArray{
//					&bigquery.RoutineArgumentArgs{
//						Name:     pulumi.String("ssn"),
//						DataType: pulumi.String("{\"typeKind\" :  \"STRING\"}"),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = bigquerydatapolicy.NewDataPolicy(ctx, "data_policy", &bigquerydatapolicy.DataPolicyArgs{
//				Location:       pulumi.String("us-central1"),
//				DataPolicyId:   pulumi.String("data_policy"),
//				PolicyTag:      policyTag.Name,
//				DataPolicyType: pulumi.String("DATA_MASKING_POLICY"),
//				DataMaskingPolicy: &bigquerydatapolicy.DataPolicyDataMaskingPolicyArgs{
//					Routine: customMaskingRoutine.ID(),
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
// DataPolicy can be imported using any of these accepted formats:
//
// * `projects/{{project}}/locations/{{location}}/dataPolicies/{{data_policy_id}}`
//
// * `{{project}}/{{location}}/{{data_policy_id}}`
//
// * `{{location}}/{{data_policy_id}}`
//
// When using the `pulumi import` command, DataPolicy can be imported using one of the formats above. For example:
//
// ```sh
// $ pulumi import gcp:bigquerydatapolicy/dataPolicy:DataPolicy default projects/{{project}}/locations/{{location}}/dataPolicies/{{data_policy_id}}
// ```
//
// ```sh
// $ pulumi import gcp:bigquerydatapolicy/dataPolicy:DataPolicy default {{project}}/{{location}}/{{data_policy_id}}
// ```
//
// ```sh
// $ pulumi import gcp:bigquerydatapolicy/dataPolicy:DataPolicy default {{location}}/{{data_policy_id}}
// ```
type DataPolicy struct {
	pulumi.CustomResourceState

	// The data masking policy that specifies the data masking rule to use.
	// Structure is documented below.
	DataMaskingPolicy DataPolicyDataMaskingPolicyPtrOutput `pulumi:"dataMaskingPolicy"`
	// User-assigned (human readable) ID of the data policy that needs to be unique within a project. Used as {dataPolicyId} in part of the resource name.
	DataPolicyId pulumi.StringOutput `pulumi:"dataPolicyId"`
	// The enrollment level of the service.
	// Possible values are: `COLUMN_LEVEL_SECURITY_POLICY`, `DATA_MASKING_POLICY`.
	DataPolicyType pulumi.StringOutput `pulumi:"dataPolicyType"`
	// The name of the location of the data policy.
	Location pulumi.StringOutput `pulumi:"location"`
	// Resource name of this data policy, in the format of projects/{project_number}/locations/{locationId}/dataPolicies/{dataPolicyId}.
	Name pulumi.StringOutput `pulumi:"name"`
	// Policy tag resource name, in the format of projects/{project_number}/locations/{locationId}/taxonomies/{taxonomyId}/policyTags/{policyTag_id}.
	PolicyTag pulumi.StringOutput `pulumi:"policyTag"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringOutput `pulumi:"project"`
}

// NewDataPolicy registers a new resource with the given unique name, arguments, and options.
func NewDataPolicy(ctx *pulumi.Context,
	name string, args *DataPolicyArgs, opts ...pulumi.ResourceOption) (*DataPolicy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DataPolicyId == nil {
		return nil, errors.New("invalid value for required argument 'DataPolicyId'")
	}
	if args.DataPolicyType == nil {
		return nil, errors.New("invalid value for required argument 'DataPolicyType'")
	}
	if args.Location == nil {
		return nil, errors.New("invalid value for required argument 'Location'")
	}
	if args.PolicyTag == nil {
		return nil, errors.New("invalid value for required argument 'PolicyTag'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource DataPolicy
	err := ctx.RegisterResource("gcp:bigquerydatapolicy/dataPolicy:DataPolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDataPolicy gets an existing DataPolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDataPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DataPolicyState, opts ...pulumi.ResourceOption) (*DataPolicy, error) {
	var resource DataPolicy
	err := ctx.ReadResource("gcp:bigquerydatapolicy/dataPolicy:DataPolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DataPolicy resources.
type dataPolicyState struct {
	// The data masking policy that specifies the data masking rule to use.
	// Structure is documented below.
	DataMaskingPolicy *DataPolicyDataMaskingPolicy `pulumi:"dataMaskingPolicy"`
	// User-assigned (human readable) ID of the data policy that needs to be unique within a project. Used as {dataPolicyId} in part of the resource name.
	DataPolicyId *string `pulumi:"dataPolicyId"`
	// The enrollment level of the service.
	// Possible values are: `COLUMN_LEVEL_SECURITY_POLICY`, `DATA_MASKING_POLICY`.
	DataPolicyType *string `pulumi:"dataPolicyType"`
	// The name of the location of the data policy.
	Location *string `pulumi:"location"`
	// Resource name of this data policy, in the format of projects/{project_number}/locations/{locationId}/dataPolicies/{dataPolicyId}.
	Name *string `pulumi:"name"`
	// Policy tag resource name, in the format of projects/{project_number}/locations/{locationId}/taxonomies/{taxonomyId}/policyTags/{policyTag_id}.
	PolicyTag *string `pulumi:"policyTag"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
}

type DataPolicyState struct {
	// The data masking policy that specifies the data masking rule to use.
	// Structure is documented below.
	DataMaskingPolicy DataPolicyDataMaskingPolicyPtrInput
	// User-assigned (human readable) ID of the data policy that needs to be unique within a project. Used as {dataPolicyId} in part of the resource name.
	DataPolicyId pulumi.StringPtrInput
	// The enrollment level of the service.
	// Possible values are: `COLUMN_LEVEL_SECURITY_POLICY`, `DATA_MASKING_POLICY`.
	DataPolicyType pulumi.StringPtrInput
	// The name of the location of the data policy.
	Location pulumi.StringPtrInput
	// Resource name of this data policy, in the format of projects/{project_number}/locations/{locationId}/dataPolicies/{dataPolicyId}.
	Name pulumi.StringPtrInput
	// Policy tag resource name, in the format of projects/{project_number}/locations/{locationId}/taxonomies/{taxonomyId}/policyTags/{policyTag_id}.
	PolicyTag pulumi.StringPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
}

func (DataPolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*dataPolicyState)(nil)).Elem()
}

type dataPolicyArgs struct {
	// The data masking policy that specifies the data masking rule to use.
	// Structure is documented below.
	DataMaskingPolicy *DataPolicyDataMaskingPolicy `pulumi:"dataMaskingPolicy"`
	// User-assigned (human readable) ID of the data policy that needs to be unique within a project. Used as {dataPolicyId} in part of the resource name.
	DataPolicyId string `pulumi:"dataPolicyId"`
	// The enrollment level of the service.
	// Possible values are: `COLUMN_LEVEL_SECURITY_POLICY`, `DATA_MASKING_POLICY`.
	DataPolicyType string `pulumi:"dataPolicyType"`
	// The name of the location of the data policy.
	Location string `pulumi:"location"`
	// Policy tag resource name, in the format of projects/{project_number}/locations/{locationId}/taxonomies/{taxonomyId}/policyTags/{policyTag_id}.
	PolicyTag string `pulumi:"policyTag"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
}

// The set of arguments for constructing a DataPolicy resource.
type DataPolicyArgs struct {
	// The data masking policy that specifies the data masking rule to use.
	// Structure is documented below.
	DataMaskingPolicy DataPolicyDataMaskingPolicyPtrInput
	// User-assigned (human readable) ID of the data policy that needs to be unique within a project. Used as {dataPolicyId} in part of the resource name.
	DataPolicyId pulumi.StringInput
	// The enrollment level of the service.
	// Possible values are: `COLUMN_LEVEL_SECURITY_POLICY`, `DATA_MASKING_POLICY`.
	DataPolicyType pulumi.StringInput
	// The name of the location of the data policy.
	Location pulumi.StringInput
	// Policy tag resource name, in the format of projects/{project_number}/locations/{locationId}/taxonomies/{taxonomyId}/policyTags/{policyTag_id}.
	PolicyTag pulumi.StringInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
}

func (DataPolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*dataPolicyArgs)(nil)).Elem()
}

type DataPolicyInput interface {
	pulumi.Input

	ToDataPolicyOutput() DataPolicyOutput
	ToDataPolicyOutputWithContext(ctx context.Context) DataPolicyOutput
}

func (*DataPolicy) ElementType() reflect.Type {
	return reflect.TypeOf((**DataPolicy)(nil)).Elem()
}

func (i *DataPolicy) ToDataPolicyOutput() DataPolicyOutput {
	return i.ToDataPolicyOutputWithContext(context.Background())
}

func (i *DataPolicy) ToDataPolicyOutputWithContext(ctx context.Context) DataPolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DataPolicyOutput)
}

// DataPolicyArrayInput is an input type that accepts DataPolicyArray and DataPolicyArrayOutput values.
// You can construct a concrete instance of `DataPolicyArrayInput` via:
//
//	DataPolicyArray{ DataPolicyArgs{...} }
type DataPolicyArrayInput interface {
	pulumi.Input

	ToDataPolicyArrayOutput() DataPolicyArrayOutput
	ToDataPolicyArrayOutputWithContext(context.Context) DataPolicyArrayOutput
}

type DataPolicyArray []DataPolicyInput

func (DataPolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DataPolicy)(nil)).Elem()
}

func (i DataPolicyArray) ToDataPolicyArrayOutput() DataPolicyArrayOutput {
	return i.ToDataPolicyArrayOutputWithContext(context.Background())
}

func (i DataPolicyArray) ToDataPolicyArrayOutputWithContext(ctx context.Context) DataPolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DataPolicyArrayOutput)
}

// DataPolicyMapInput is an input type that accepts DataPolicyMap and DataPolicyMapOutput values.
// You can construct a concrete instance of `DataPolicyMapInput` via:
//
//	DataPolicyMap{ "key": DataPolicyArgs{...} }
type DataPolicyMapInput interface {
	pulumi.Input

	ToDataPolicyMapOutput() DataPolicyMapOutput
	ToDataPolicyMapOutputWithContext(context.Context) DataPolicyMapOutput
}

type DataPolicyMap map[string]DataPolicyInput

func (DataPolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DataPolicy)(nil)).Elem()
}

func (i DataPolicyMap) ToDataPolicyMapOutput() DataPolicyMapOutput {
	return i.ToDataPolicyMapOutputWithContext(context.Background())
}

func (i DataPolicyMap) ToDataPolicyMapOutputWithContext(ctx context.Context) DataPolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DataPolicyMapOutput)
}

type DataPolicyOutput struct{ *pulumi.OutputState }

func (DataPolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DataPolicy)(nil)).Elem()
}

func (o DataPolicyOutput) ToDataPolicyOutput() DataPolicyOutput {
	return o
}

func (o DataPolicyOutput) ToDataPolicyOutputWithContext(ctx context.Context) DataPolicyOutput {
	return o
}

// The data masking policy that specifies the data masking rule to use.
// Structure is documented below.
func (o DataPolicyOutput) DataMaskingPolicy() DataPolicyDataMaskingPolicyPtrOutput {
	return o.ApplyT(func(v *DataPolicy) DataPolicyDataMaskingPolicyPtrOutput { return v.DataMaskingPolicy }).(DataPolicyDataMaskingPolicyPtrOutput)
}

// User-assigned (human readable) ID of the data policy that needs to be unique within a project. Used as {dataPolicyId} in part of the resource name.
func (o DataPolicyOutput) DataPolicyId() pulumi.StringOutput {
	return o.ApplyT(func(v *DataPolicy) pulumi.StringOutput { return v.DataPolicyId }).(pulumi.StringOutput)
}

// The enrollment level of the service.
// Possible values are: `COLUMN_LEVEL_SECURITY_POLICY`, `DATA_MASKING_POLICY`.
func (o DataPolicyOutput) DataPolicyType() pulumi.StringOutput {
	return o.ApplyT(func(v *DataPolicy) pulumi.StringOutput { return v.DataPolicyType }).(pulumi.StringOutput)
}

// The name of the location of the data policy.
func (o DataPolicyOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *DataPolicy) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// Resource name of this data policy, in the format of projects/{project_number}/locations/{locationId}/dataPolicies/{dataPolicyId}.
func (o DataPolicyOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *DataPolicy) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Policy tag resource name, in the format of projects/{project_number}/locations/{locationId}/taxonomies/{taxonomyId}/policyTags/{policyTag_id}.
func (o DataPolicyOutput) PolicyTag() pulumi.StringOutput {
	return o.ApplyT(func(v *DataPolicy) pulumi.StringOutput { return v.PolicyTag }).(pulumi.StringOutput)
}

// The ID of the project in which the resource belongs.
// If it is not provided, the provider project is used.
func (o DataPolicyOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *DataPolicy) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

type DataPolicyArrayOutput struct{ *pulumi.OutputState }

func (DataPolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DataPolicy)(nil)).Elem()
}

func (o DataPolicyArrayOutput) ToDataPolicyArrayOutput() DataPolicyArrayOutput {
	return o
}

func (o DataPolicyArrayOutput) ToDataPolicyArrayOutputWithContext(ctx context.Context) DataPolicyArrayOutput {
	return o
}

func (o DataPolicyArrayOutput) Index(i pulumi.IntInput) DataPolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DataPolicy {
		return vs[0].([]*DataPolicy)[vs[1].(int)]
	}).(DataPolicyOutput)
}

type DataPolicyMapOutput struct{ *pulumi.OutputState }

func (DataPolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DataPolicy)(nil)).Elem()
}

func (o DataPolicyMapOutput) ToDataPolicyMapOutput() DataPolicyMapOutput {
	return o
}

func (o DataPolicyMapOutput) ToDataPolicyMapOutputWithContext(ctx context.Context) DataPolicyMapOutput {
	return o
}

func (o DataPolicyMapOutput) MapIndex(k pulumi.StringInput) DataPolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DataPolicy {
		return vs[0].(map[string]*DataPolicy)[vs[1].(string)]
	}).(DataPolicyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DataPolicyInput)(nil)).Elem(), &DataPolicy{})
	pulumi.RegisterInputType(reflect.TypeOf((*DataPolicyArrayInput)(nil)).Elem(), DataPolicyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DataPolicyMapInput)(nil)).Elem(), DataPolicyMap{})
	pulumi.RegisterOutputType(DataPolicyOutput{})
	pulumi.RegisterOutputType(DataPolicyArrayOutput{})
	pulumi.RegisterOutputType(DataPolicyMapOutput{})
}
