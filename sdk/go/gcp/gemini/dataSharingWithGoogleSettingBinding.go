// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package gemini

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// The resource for managing DataSharingWithGoogle setting bindings for Admin Control.
//
// To get more information about DataSharingWithGoogleSettingBinding, see:
// * How-to Guides
//   - [Gemini Cloud Assist overview](https://cloud.google.com/gemini/docs/cloud-assist/overview)
//
// ## Example Usage
//
// ### Gemini Data Sharing With Google Setting Binding Basic
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/gemini"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			basic, err := gemini.NewDataSharingWithGoogleSetting(ctx, "basic", &gemini.DataSharingWithGoogleSettingArgs{
//				DataSharingWithGoogleSettingId: pulumi.String("ls-tf1"),
//				Location:                       pulumi.String("global"),
//				Labels: pulumi.StringMap{
//					"my_key": pulumi.String("my_value"),
//				},
//				EnablePreviewDataSharing: pulumi.Bool(true),
//				EnableDataSharing:        pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = gemini.NewDataSharingWithGoogleSettingBinding(ctx, "example", &gemini.DataSharingWithGoogleSettingBindingArgs{
//				DataSharingWithGoogleSettingId: basic.DataSharingWithGoogleSettingId,
//				SettingBindingId:               pulumi.String("ls-tf1b1"),
//				Location:                       pulumi.String("global"),
//				Target:                         pulumi.String("projects/980109375338"),
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
// DataSharingWithGoogleSettingBinding can be imported using any of these accepted formats:
//
// * `projects/{{project}}/locations/{{location}}/dataSharingWithGoogleSettings/{{data_sharing_with_google_setting_id}}/settingBindings/{{setting_binding_id}}`
//
// * `{{project}}/{{location}}/{{data_sharing_with_google_setting_id}}/{{setting_binding_id}}`
//
// * `{{location}}/{{data_sharing_with_google_setting_id}}/{{setting_binding_id}}`
//
// When using the `pulumi import` command, DataSharingWithGoogleSettingBinding can be imported using one of the formats above. For example:
//
// ```sh
// $ pulumi import gcp:gemini/dataSharingWithGoogleSettingBinding:DataSharingWithGoogleSettingBinding default projects/{{project}}/locations/{{location}}/dataSharingWithGoogleSettings/{{data_sharing_with_google_setting_id}}/settingBindings/{{setting_binding_id}}
// ```
//
// ```sh
// $ pulumi import gcp:gemini/dataSharingWithGoogleSettingBinding:DataSharingWithGoogleSettingBinding default {{project}}/{{location}}/{{data_sharing_with_google_setting_id}}/{{setting_binding_id}}
// ```
//
// ```sh
// $ pulumi import gcp:gemini/dataSharingWithGoogleSettingBinding:DataSharingWithGoogleSettingBinding default {{location}}/{{data_sharing_with_google_setting_id}}/{{setting_binding_id}}
// ```
type DataSharingWithGoogleSettingBinding struct {
	pulumi.CustomResourceState

	// Create time stamp.
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122.
	DataSharingWithGoogleSettingId pulumi.StringOutput `pulumi:"dataSharingWithGoogleSettingId"`
	// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
	EffectiveLabels pulumi.StringMapOutput `pulumi:"effectiveLabels"`
	// Labels as key value pairs.
	// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
	// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
	Labels pulumi.StringMapOutput `pulumi:"labels"`
	// Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122.
	Location pulumi.StringPtrOutput `pulumi:"location"`
	// Identifier. Name of the resource.
	// Format:projects/{project}/locations/{location}/dataSharingWithGoogleSettings/{setting}/settingBindings/{setting_binding}
	Name pulumi.StringOutput `pulumi:"name"`
	// Product type of the setting binding. Values include GEMINI_IN_BIGQUERY, GEMINI_CLOUD_ASSIST, etc. See [product reference](https://cloud.google.com/gemini/docs/api/reference/rest/v1/projects.locations.dataSharingWithGoogleSettings.settingBindings) for a complete list.
	Product pulumi.StringOutput `pulumi:"product"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringOutput `pulumi:"project"`
	// The combination of labels configured directly on the resource
	// and default labels configured on the provider.
	PulumiLabels pulumi.StringMapOutput `pulumi:"pulumiLabels"`
	// Required. Id of the setting binding.
	SettingBindingId pulumi.StringOutput `pulumi:"settingBindingId"`
	// Target of the binding.
	Target pulumi.StringOutput `pulumi:"target"`
	// Update time stamp.
	UpdateTime pulumi.StringOutput `pulumi:"updateTime"`
}

// NewDataSharingWithGoogleSettingBinding registers a new resource with the given unique name, arguments, and options.
func NewDataSharingWithGoogleSettingBinding(ctx *pulumi.Context,
	name string, args *DataSharingWithGoogleSettingBindingArgs, opts ...pulumi.ResourceOption) (*DataSharingWithGoogleSettingBinding, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DataSharingWithGoogleSettingId == nil {
		return nil, errors.New("invalid value for required argument 'DataSharingWithGoogleSettingId'")
	}
	if args.SettingBindingId == nil {
		return nil, errors.New("invalid value for required argument 'SettingBindingId'")
	}
	if args.Target == nil {
		return nil, errors.New("invalid value for required argument 'Target'")
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"effectiveLabels",
		"pulumiLabels",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource DataSharingWithGoogleSettingBinding
	err := ctx.RegisterResource("gcp:gemini/dataSharingWithGoogleSettingBinding:DataSharingWithGoogleSettingBinding", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDataSharingWithGoogleSettingBinding gets an existing DataSharingWithGoogleSettingBinding resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDataSharingWithGoogleSettingBinding(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DataSharingWithGoogleSettingBindingState, opts ...pulumi.ResourceOption) (*DataSharingWithGoogleSettingBinding, error) {
	var resource DataSharingWithGoogleSettingBinding
	err := ctx.ReadResource("gcp:gemini/dataSharingWithGoogleSettingBinding:DataSharingWithGoogleSettingBinding", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DataSharingWithGoogleSettingBinding resources.
type dataSharingWithGoogleSettingBindingState struct {
	// Create time stamp.
	CreateTime *string `pulumi:"createTime"`
	// Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122.
	DataSharingWithGoogleSettingId *string `pulumi:"dataSharingWithGoogleSettingId"`
	// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
	EffectiveLabels map[string]string `pulumi:"effectiveLabels"`
	// Labels as key value pairs.
	// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
	// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
	Labels map[string]string `pulumi:"labels"`
	// Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122.
	Location *string `pulumi:"location"`
	// Identifier. Name of the resource.
	// Format:projects/{project}/locations/{location}/dataSharingWithGoogleSettings/{setting}/settingBindings/{setting_binding}
	Name *string `pulumi:"name"`
	// Product type of the setting binding. Values include GEMINI_IN_BIGQUERY, GEMINI_CLOUD_ASSIST, etc. See [product reference](https://cloud.google.com/gemini/docs/api/reference/rest/v1/projects.locations.dataSharingWithGoogleSettings.settingBindings) for a complete list.
	Product *string `pulumi:"product"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
	// The combination of labels configured directly on the resource
	// and default labels configured on the provider.
	PulumiLabels map[string]string `pulumi:"pulumiLabels"`
	// Required. Id of the setting binding.
	SettingBindingId *string `pulumi:"settingBindingId"`
	// Target of the binding.
	Target *string `pulumi:"target"`
	// Update time stamp.
	UpdateTime *string `pulumi:"updateTime"`
}

type DataSharingWithGoogleSettingBindingState struct {
	// Create time stamp.
	CreateTime pulumi.StringPtrInput
	// Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122.
	DataSharingWithGoogleSettingId pulumi.StringPtrInput
	// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
	EffectiveLabels pulumi.StringMapInput
	// Labels as key value pairs.
	// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
	// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
	Labels pulumi.StringMapInput
	// Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122.
	Location pulumi.StringPtrInput
	// Identifier. Name of the resource.
	// Format:projects/{project}/locations/{location}/dataSharingWithGoogleSettings/{setting}/settingBindings/{setting_binding}
	Name pulumi.StringPtrInput
	// Product type of the setting binding. Values include GEMINI_IN_BIGQUERY, GEMINI_CLOUD_ASSIST, etc. See [product reference](https://cloud.google.com/gemini/docs/api/reference/rest/v1/projects.locations.dataSharingWithGoogleSettings.settingBindings) for a complete list.
	Product pulumi.StringPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
	// The combination of labels configured directly on the resource
	// and default labels configured on the provider.
	PulumiLabels pulumi.StringMapInput
	// Required. Id of the setting binding.
	SettingBindingId pulumi.StringPtrInput
	// Target of the binding.
	Target pulumi.StringPtrInput
	// Update time stamp.
	UpdateTime pulumi.StringPtrInput
}

func (DataSharingWithGoogleSettingBindingState) ElementType() reflect.Type {
	return reflect.TypeOf((*dataSharingWithGoogleSettingBindingState)(nil)).Elem()
}

type dataSharingWithGoogleSettingBindingArgs struct {
	// Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122.
	DataSharingWithGoogleSettingId string `pulumi:"dataSharingWithGoogleSettingId"`
	// Labels as key value pairs.
	// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
	// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
	Labels map[string]string `pulumi:"labels"`
	// Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122.
	Location *string `pulumi:"location"`
	// Product type of the setting binding. Values include GEMINI_IN_BIGQUERY, GEMINI_CLOUD_ASSIST, etc. See [product reference](https://cloud.google.com/gemini/docs/api/reference/rest/v1/projects.locations.dataSharingWithGoogleSettings.settingBindings) for a complete list.
	Product *string `pulumi:"product"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
	// Required. Id of the setting binding.
	SettingBindingId string `pulumi:"settingBindingId"`
	// Target of the binding.
	Target string `pulumi:"target"`
}

// The set of arguments for constructing a DataSharingWithGoogleSettingBinding resource.
type DataSharingWithGoogleSettingBindingArgs struct {
	// Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122.
	DataSharingWithGoogleSettingId pulumi.StringInput
	// Labels as key value pairs.
	// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
	// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
	Labels pulumi.StringMapInput
	// Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122.
	Location pulumi.StringPtrInput
	// Product type of the setting binding. Values include GEMINI_IN_BIGQUERY, GEMINI_CLOUD_ASSIST, etc. See [product reference](https://cloud.google.com/gemini/docs/api/reference/rest/v1/projects.locations.dataSharingWithGoogleSettings.settingBindings) for a complete list.
	Product pulumi.StringPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
	// Required. Id of the setting binding.
	SettingBindingId pulumi.StringInput
	// Target of the binding.
	Target pulumi.StringInput
}

func (DataSharingWithGoogleSettingBindingArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*dataSharingWithGoogleSettingBindingArgs)(nil)).Elem()
}

type DataSharingWithGoogleSettingBindingInput interface {
	pulumi.Input

	ToDataSharingWithGoogleSettingBindingOutput() DataSharingWithGoogleSettingBindingOutput
	ToDataSharingWithGoogleSettingBindingOutputWithContext(ctx context.Context) DataSharingWithGoogleSettingBindingOutput
}

func (*DataSharingWithGoogleSettingBinding) ElementType() reflect.Type {
	return reflect.TypeOf((**DataSharingWithGoogleSettingBinding)(nil)).Elem()
}

func (i *DataSharingWithGoogleSettingBinding) ToDataSharingWithGoogleSettingBindingOutput() DataSharingWithGoogleSettingBindingOutput {
	return i.ToDataSharingWithGoogleSettingBindingOutputWithContext(context.Background())
}

func (i *DataSharingWithGoogleSettingBinding) ToDataSharingWithGoogleSettingBindingOutputWithContext(ctx context.Context) DataSharingWithGoogleSettingBindingOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DataSharingWithGoogleSettingBindingOutput)
}

// DataSharingWithGoogleSettingBindingArrayInput is an input type that accepts DataSharingWithGoogleSettingBindingArray and DataSharingWithGoogleSettingBindingArrayOutput values.
// You can construct a concrete instance of `DataSharingWithGoogleSettingBindingArrayInput` via:
//
//	DataSharingWithGoogleSettingBindingArray{ DataSharingWithGoogleSettingBindingArgs{...} }
type DataSharingWithGoogleSettingBindingArrayInput interface {
	pulumi.Input

	ToDataSharingWithGoogleSettingBindingArrayOutput() DataSharingWithGoogleSettingBindingArrayOutput
	ToDataSharingWithGoogleSettingBindingArrayOutputWithContext(context.Context) DataSharingWithGoogleSettingBindingArrayOutput
}

type DataSharingWithGoogleSettingBindingArray []DataSharingWithGoogleSettingBindingInput

func (DataSharingWithGoogleSettingBindingArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DataSharingWithGoogleSettingBinding)(nil)).Elem()
}

func (i DataSharingWithGoogleSettingBindingArray) ToDataSharingWithGoogleSettingBindingArrayOutput() DataSharingWithGoogleSettingBindingArrayOutput {
	return i.ToDataSharingWithGoogleSettingBindingArrayOutputWithContext(context.Background())
}

func (i DataSharingWithGoogleSettingBindingArray) ToDataSharingWithGoogleSettingBindingArrayOutputWithContext(ctx context.Context) DataSharingWithGoogleSettingBindingArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DataSharingWithGoogleSettingBindingArrayOutput)
}

// DataSharingWithGoogleSettingBindingMapInput is an input type that accepts DataSharingWithGoogleSettingBindingMap and DataSharingWithGoogleSettingBindingMapOutput values.
// You can construct a concrete instance of `DataSharingWithGoogleSettingBindingMapInput` via:
//
//	DataSharingWithGoogleSettingBindingMap{ "key": DataSharingWithGoogleSettingBindingArgs{...} }
type DataSharingWithGoogleSettingBindingMapInput interface {
	pulumi.Input

	ToDataSharingWithGoogleSettingBindingMapOutput() DataSharingWithGoogleSettingBindingMapOutput
	ToDataSharingWithGoogleSettingBindingMapOutputWithContext(context.Context) DataSharingWithGoogleSettingBindingMapOutput
}

type DataSharingWithGoogleSettingBindingMap map[string]DataSharingWithGoogleSettingBindingInput

func (DataSharingWithGoogleSettingBindingMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DataSharingWithGoogleSettingBinding)(nil)).Elem()
}

func (i DataSharingWithGoogleSettingBindingMap) ToDataSharingWithGoogleSettingBindingMapOutput() DataSharingWithGoogleSettingBindingMapOutput {
	return i.ToDataSharingWithGoogleSettingBindingMapOutputWithContext(context.Background())
}

func (i DataSharingWithGoogleSettingBindingMap) ToDataSharingWithGoogleSettingBindingMapOutputWithContext(ctx context.Context) DataSharingWithGoogleSettingBindingMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DataSharingWithGoogleSettingBindingMapOutput)
}

type DataSharingWithGoogleSettingBindingOutput struct{ *pulumi.OutputState }

func (DataSharingWithGoogleSettingBindingOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DataSharingWithGoogleSettingBinding)(nil)).Elem()
}

func (o DataSharingWithGoogleSettingBindingOutput) ToDataSharingWithGoogleSettingBindingOutput() DataSharingWithGoogleSettingBindingOutput {
	return o
}

func (o DataSharingWithGoogleSettingBindingOutput) ToDataSharingWithGoogleSettingBindingOutputWithContext(ctx context.Context) DataSharingWithGoogleSettingBindingOutput {
	return o
}

// Create time stamp.
func (o DataSharingWithGoogleSettingBindingOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *DataSharingWithGoogleSettingBinding) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122.
func (o DataSharingWithGoogleSettingBindingOutput) DataSharingWithGoogleSettingId() pulumi.StringOutput {
	return o.ApplyT(func(v *DataSharingWithGoogleSettingBinding) pulumi.StringOutput {
		return v.DataSharingWithGoogleSettingId
	}).(pulumi.StringOutput)
}

// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
func (o DataSharingWithGoogleSettingBindingOutput) EffectiveLabels() pulumi.StringMapOutput {
	return o.ApplyT(func(v *DataSharingWithGoogleSettingBinding) pulumi.StringMapOutput { return v.EffectiveLabels }).(pulumi.StringMapOutput)
}

// Labels as key value pairs.
// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
func (o DataSharingWithGoogleSettingBindingOutput) Labels() pulumi.StringMapOutput {
	return o.ApplyT(func(v *DataSharingWithGoogleSettingBinding) pulumi.StringMapOutput { return v.Labels }).(pulumi.StringMapOutput)
}

// Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122.
func (o DataSharingWithGoogleSettingBindingOutput) Location() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *DataSharingWithGoogleSettingBinding) pulumi.StringPtrOutput { return v.Location }).(pulumi.StringPtrOutput)
}

// Identifier. Name of the resource.
// Format:projects/{project}/locations/{location}/dataSharingWithGoogleSettings/{setting}/settingBindings/{setting_binding}
func (o DataSharingWithGoogleSettingBindingOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *DataSharingWithGoogleSettingBinding) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Product type of the setting binding. Values include GEMINI_IN_BIGQUERY, GEMINI_CLOUD_ASSIST, etc. See [product reference](https://cloud.google.com/gemini/docs/api/reference/rest/v1/projects.locations.dataSharingWithGoogleSettings.settingBindings) for a complete list.
func (o DataSharingWithGoogleSettingBindingOutput) Product() pulumi.StringOutput {
	return o.ApplyT(func(v *DataSharingWithGoogleSettingBinding) pulumi.StringOutput { return v.Product }).(pulumi.StringOutput)
}

// The ID of the project in which the resource belongs.
// If it is not provided, the provider project is used.
func (o DataSharingWithGoogleSettingBindingOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *DataSharingWithGoogleSettingBinding) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// The combination of labels configured directly on the resource
// and default labels configured on the provider.
func (o DataSharingWithGoogleSettingBindingOutput) PulumiLabels() pulumi.StringMapOutput {
	return o.ApplyT(func(v *DataSharingWithGoogleSettingBinding) pulumi.StringMapOutput { return v.PulumiLabels }).(pulumi.StringMapOutput)
}

// Required. Id of the setting binding.
func (o DataSharingWithGoogleSettingBindingOutput) SettingBindingId() pulumi.StringOutput {
	return o.ApplyT(func(v *DataSharingWithGoogleSettingBinding) pulumi.StringOutput { return v.SettingBindingId }).(pulumi.StringOutput)
}

// Target of the binding.
func (o DataSharingWithGoogleSettingBindingOutput) Target() pulumi.StringOutput {
	return o.ApplyT(func(v *DataSharingWithGoogleSettingBinding) pulumi.StringOutput { return v.Target }).(pulumi.StringOutput)
}

// Update time stamp.
func (o DataSharingWithGoogleSettingBindingOutput) UpdateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *DataSharingWithGoogleSettingBinding) pulumi.StringOutput { return v.UpdateTime }).(pulumi.StringOutput)
}

type DataSharingWithGoogleSettingBindingArrayOutput struct{ *pulumi.OutputState }

func (DataSharingWithGoogleSettingBindingArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DataSharingWithGoogleSettingBinding)(nil)).Elem()
}

func (o DataSharingWithGoogleSettingBindingArrayOutput) ToDataSharingWithGoogleSettingBindingArrayOutput() DataSharingWithGoogleSettingBindingArrayOutput {
	return o
}

func (o DataSharingWithGoogleSettingBindingArrayOutput) ToDataSharingWithGoogleSettingBindingArrayOutputWithContext(ctx context.Context) DataSharingWithGoogleSettingBindingArrayOutput {
	return o
}

func (o DataSharingWithGoogleSettingBindingArrayOutput) Index(i pulumi.IntInput) DataSharingWithGoogleSettingBindingOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DataSharingWithGoogleSettingBinding {
		return vs[0].([]*DataSharingWithGoogleSettingBinding)[vs[1].(int)]
	}).(DataSharingWithGoogleSettingBindingOutput)
}

type DataSharingWithGoogleSettingBindingMapOutput struct{ *pulumi.OutputState }

func (DataSharingWithGoogleSettingBindingMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DataSharingWithGoogleSettingBinding)(nil)).Elem()
}

func (o DataSharingWithGoogleSettingBindingMapOutput) ToDataSharingWithGoogleSettingBindingMapOutput() DataSharingWithGoogleSettingBindingMapOutput {
	return o
}

func (o DataSharingWithGoogleSettingBindingMapOutput) ToDataSharingWithGoogleSettingBindingMapOutputWithContext(ctx context.Context) DataSharingWithGoogleSettingBindingMapOutput {
	return o
}

func (o DataSharingWithGoogleSettingBindingMapOutput) MapIndex(k pulumi.StringInput) DataSharingWithGoogleSettingBindingOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DataSharingWithGoogleSettingBinding {
		return vs[0].(map[string]*DataSharingWithGoogleSettingBinding)[vs[1].(string)]
	}).(DataSharingWithGoogleSettingBindingOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DataSharingWithGoogleSettingBindingInput)(nil)).Elem(), &DataSharingWithGoogleSettingBinding{})
	pulumi.RegisterInputType(reflect.TypeOf((*DataSharingWithGoogleSettingBindingArrayInput)(nil)).Elem(), DataSharingWithGoogleSettingBindingArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DataSharingWithGoogleSettingBindingMapInput)(nil)).Elem(), DataSharingWithGoogleSettingBindingMap{})
	pulumi.RegisterOutputType(DataSharingWithGoogleSettingBindingOutput{})
	pulumi.RegisterOutputType(DataSharingWithGoogleSettingBindingArrayOutput{})
	pulumi.RegisterOutputType(DataSharingWithGoogleSettingBindingMapOutput{})
}
