// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dataplex

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// The Dataplex Lake resource
//
// ## Example Usage
//
// ### Basic_lake
// A basic example of a dataplex lake
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/dataplex"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := dataplex.NewLake(ctx, "primary", &dataplex.LakeArgs{
//				Location:    pulumi.String("us-west1"),
//				Name:        pulumi.String("lake"),
//				Description: pulumi.String("Lake for DCL"),
//				DisplayName: pulumi.String("Lake for DCL"),
//				Project:     pulumi.String("my-project-name"),
//				Labels: pulumi.StringMap{
//					"my-lake": pulumi.String("exists"),
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
// Lake can be imported using any of these accepted formats:
//
// * `projects/{{project}}/locations/{{location}}/lakes/{{name}}`
//
// * `{{project}}/{{location}}/{{name}}`
//
// * `{{location}}/{{name}}`
//
// When using the `pulumi import` command, Lake can be imported using one of the formats above. For example:
//
// ```sh
// $ pulumi import gcp:dataplex/lake:Lake default projects/{{project}}/locations/{{location}}/lakes/{{name}}
// ```
//
// ```sh
// $ pulumi import gcp:dataplex/lake:Lake default {{project}}/{{location}}/{{name}}
// ```
//
// ```sh
// $ pulumi import gcp:dataplex/lake:Lake default {{location}}/{{name}}
// ```
type Lake struct {
	pulumi.CustomResourceState

	// Output only. Aggregated status of the underlying assets of the lake.
	AssetStatuses LakeAssetStatusArrayOutput `pulumi:"assetStatuses"`
	// Output only. The time when the lake was created.
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// Optional. Description of the lake.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Optional. User friendly display name.
	DisplayName pulumi.StringPtrOutput `pulumi:"displayName"`
	// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
	EffectiveLabels pulumi.StringMapOutput `pulumi:"effectiveLabels"`
	// Optional. User-defined labels for the lake.
	//
	// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
	// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
	Labels pulumi.StringMapOutput `pulumi:"labels"`
	// The location for the resource
	Location pulumi.StringOutput `pulumi:"location"`
	// Optional. Settings to manage lake and Dataproc Metastore service instance association.
	Metastore LakeMetastorePtrOutput `pulumi:"metastore"`
	// Output only. Metastore status of the lake.
	MetastoreStatuses LakeMetastoreStatusArrayOutput `pulumi:"metastoreStatuses"`
	// The name of the lake.
	//
	// ***
	Name pulumi.StringOutput `pulumi:"name"`
	// The project for the resource
	Project pulumi.StringOutput `pulumi:"project"`
	// The combination of labels configured directly on the resource and default labels configured on the provider.
	PulumiLabels pulumi.StringMapOutput `pulumi:"pulumiLabels"`
	// Output only. Service account associated with this lake. This service account must be authorized to access or operate on resources managed by the lake.
	ServiceAccount pulumi.StringOutput `pulumi:"serviceAccount"`
	// Output only. Current state of the lake. Possible values: STATE_UNSPECIFIED, ACTIVE, CREATING, DELETING, ACTION_REQUIRED
	State pulumi.StringOutput `pulumi:"state"`
	// Output only. System generated globally unique ID for the lake. This ID will be different if the lake is deleted and re-created with the same name.
	Uid pulumi.StringOutput `pulumi:"uid"`
	// Output only. The time when the lake was last updated.
	UpdateTime pulumi.StringOutput `pulumi:"updateTime"`
}

// NewLake registers a new resource with the given unique name, arguments, and options.
func NewLake(ctx *pulumi.Context,
	name string, args *LakeArgs, opts ...pulumi.ResourceOption) (*Lake, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Location == nil {
		return nil, errors.New("invalid value for required argument 'Location'")
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"effectiveLabels",
		"pulumiLabels",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Lake
	err := ctx.RegisterResource("gcp:dataplex/lake:Lake", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLake gets an existing Lake resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLake(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LakeState, opts ...pulumi.ResourceOption) (*Lake, error) {
	var resource Lake
	err := ctx.ReadResource("gcp:dataplex/lake:Lake", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Lake resources.
type lakeState struct {
	// Output only. Aggregated status of the underlying assets of the lake.
	AssetStatuses []LakeAssetStatus `pulumi:"assetStatuses"`
	// Output only. The time when the lake was created.
	CreateTime *string `pulumi:"createTime"`
	// Optional. Description of the lake.
	Description *string `pulumi:"description"`
	// Optional. User friendly display name.
	DisplayName *string `pulumi:"displayName"`
	// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
	EffectiveLabels map[string]string `pulumi:"effectiveLabels"`
	// Optional. User-defined labels for the lake.
	//
	// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
	// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
	Labels map[string]string `pulumi:"labels"`
	// The location for the resource
	Location *string `pulumi:"location"`
	// Optional. Settings to manage lake and Dataproc Metastore service instance association.
	Metastore *LakeMetastore `pulumi:"metastore"`
	// Output only. Metastore status of the lake.
	MetastoreStatuses []LakeMetastoreStatus `pulumi:"metastoreStatuses"`
	// The name of the lake.
	//
	// ***
	Name *string `pulumi:"name"`
	// The project for the resource
	Project *string `pulumi:"project"`
	// The combination of labels configured directly on the resource and default labels configured on the provider.
	PulumiLabels map[string]string `pulumi:"pulumiLabels"`
	// Output only. Service account associated with this lake. This service account must be authorized to access or operate on resources managed by the lake.
	ServiceAccount *string `pulumi:"serviceAccount"`
	// Output only. Current state of the lake. Possible values: STATE_UNSPECIFIED, ACTIVE, CREATING, DELETING, ACTION_REQUIRED
	State *string `pulumi:"state"`
	// Output only. System generated globally unique ID for the lake. This ID will be different if the lake is deleted and re-created with the same name.
	Uid *string `pulumi:"uid"`
	// Output only. The time when the lake was last updated.
	UpdateTime *string `pulumi:"updateTime"`
}

type LakeState struct {
	// Output only. Aggregated status of the underlying assets of the lake.
	AssetStatuses LakeAssetStatusArrayInput
	// Output only. The time when the lake was created.
	CreateTime pulumi.StringPtrInput
	// Optional. Description of the lake.
	Description pulumi.StringPtrInput
	// Optional. User friendly display name.
	DisplayName pulumi.StringPtrInput
	// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
	EffectiveLabels pulumi.StringMapInput
	// Optional. User-defined labels for the lake.
	//
	// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
	// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
	Labels pulumi.StringMapInput
	// The location for the resource
	Location pulumi.StringPtrInput
	// Optional. Settings to manage lake and Dataproc Metastore service instance association.
	Metastore LakeMetastorePtrInput
	// Output only. Metastore status of the lake.
	MetastoreStatuses LakeMetastoreStatusArrayInput
	// The name of the lake.
	//
	// ***
	Name pulumi.StringPtrInput
	// The project for the resource
	Project pulumi.StringPtrInput
	// The combination of labels configured directly on the resource and default labels configured on the provider.
	PulumiLabels pulumi.StringMapInput
	// Output only. Service account associated with this lake. This service account must be authorized to access or operate on resources managed by the lake.
	ServiceAccount pulumi.StringPtrInput
	// Output only. Current state of the lake. Possible values: STATE_UNSPECIFIED, ACTIVE, CREATING, DELETING, ACTION_REQUIRED
	State pulumi.StringPtrInput
	// Output only. System generated globally unique ID for the lake. This ID will be different if the lake is deleted and re-created with the same name.
	Uid pulumi.StringPtrInput
	// Output only. The time when the lake was last updated.
	UpdateTime pulumi.StringPtrInput
}

func (LakeState) ElementType() reflect.Type {
	return reflect.TypeOf((*lakeState)(nil)).Elem()
}

type lakeArgs struct {
	// Optional. Description of the lake.
	Description *string `pulumi:"description"`
	// Optional. User friendly display name.
	DisplayName *string `pulumi:"displayName"`
	// Optional. User-defined labels for the lake.
	//
	// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
	// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
	Labels map[string]string `pulumi:"labels"`
	// The location for the resource
	Location string `pulumi:"location"`
	// Optional. Settings to manage lake and Dataproc Metastore service instance association.
	Metastore *LakeMetastore `pulumi:"metastore"`
	// The name of the lake.
	//
	// ***
	Name *string `pulumi:"name"`
	// The project for the resource
	Project *string `pulumi:"project"`
}

// The set of arguments for constructing a Lake resource.
type LakeArgs struct {
	// Optional. Description of the lake.
	Description pulumi.StringPtrInput
	// Optional. User friendly display name.
	DisplayName pulumi.StringPtrInput
	// Optional. User-defined labels for the lake.
	//
	// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
	// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
	Labels pulumi.StringMapInput
	// The location for the resource
	Location pulumi.StringInput
	// Optional. Settings to manage lake and Dataproc Metastore service instance association.
	Metastore LakeMetastorePtrInput
	// The name of the lake.
	//
	// ***
	Name pulumi.StringPtrInput
	// The project for the resource
	Project pulumi.StringPtrInput
}

func (LakeArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*lakeArgs)(nil)).Elem()
}

type LakeInput interface {
	pulumi.Input

	ToLakeOutput() LakeOutput
	ToLakeOutputWithContext(ctx context.Context) LakeOutput
}

func (*Lake) ElementType() reflect.Type {
	return reflect.TypeOf((**Lake)(nil)).Elem()
}

func (i *Lake) ToLakeOutput() LakeOutput {
	return i.ToLakeOutputWithContext(context.Background())
}

func (i *Lake) ToLakeOutputWithContext(ctx context.Context) LakeOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LakeOutput)
}

// LakeArrayInput is an input type that accepts LakeArray and LakeArrayOutput values.
// You can construct a concrete instance of `LakeArrayInput` via:
//
//	LakeArray{ LakeArgs{...} }
type LakeArrayInput interface {
	pulumi.Input

	ToLakeArrayOutput() LakeArrayOutput
	ToLakeArrayOutputWithContext(context.Context) LakeArrayOutput
}

type LakeArray []LakeInput

func (LakeArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Lake)(nil)).Elem()
}

func (i LakeArray) ToLakeArrayOutput() LakeArrayOutput {
	return i.ToLakeArrayOutputWithContext(context.Background())
}

func (i LakeArray) ToLakeArrayOutputWithContext(ctx context.Context) LakeArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LakeArrayOutput)
}

// LakeMapInput is an input type that accepts LakeMap and LakeMapOutput values.
// You can construct a concrete instance of `LakeMapInput` via:
//
//	LakeMap{ "key": LakeArgs{...} }
type LakeMapInput interface {
	pulumi.Input

	ToLakeMapOutput() LakeMapOutput
	ToLakeMapOutputWithContext(context.Context) LakeMapOutput
}

type LakeMap map[string]LakeInput

func (LakeMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Lake)(nil)).Elem()
}

func (i LakeMap) ToLakeMapOutput() LakeMapOutput {
	return i.ToLakeMapOutputWithContext(context.Background())
}

func (i LakeMap) ToLakeMapOutputWithContext(ctx context.Context) LakeMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LakeMapOutput)
}

type LakeOutput struct{ *pulumi.OutputState }

func (LakeOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Lake)(nil)).Elem()
}

func (o LakeOutput) ToLakeOutput() LakeOutput {
	return o
}

func (o LakeOutput) ToLakeOutputWithContext(ctx context.Context) LakeOutput {
	return o
}

// Output only. Aggregated status of the underlying assets of the lake.
func (o LakeOutput) AssetStatuses() LakeAssetStatusArrayOutput {
	return o.ApplyT(func(v *Lake) LakeAssetStatusArrayOutput { return v.AssetStatuses }).(LakeAssetStatusArrayOutput)
}

// Output only. The time when the lake was created.
func (o LakeOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *Lake) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// Optional. Description of the lake.
func (o LakeOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Lake) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Optional. User friendly display name.
func (o LakeOutput) DisplayName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Lake) pulumi.StringPtrOutput { return v.DisplayName }).(pulumi.StringPtrOutput)
}

// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
func (o LakeOutput) EffectiveLabels() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Lake) pulumi.StringMapOutput { return v.EffectiveLabels }).(pulumi.StringMapOutput)
}

// Optional. User-defined labels for the lake.
//
// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
func (o LakeOutput) Labels() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Lake) pulumi.StringMapOutput { return v.Labels }).(pulumi.StringMapOutput)
}

// The location for the resource
func (o LakeOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *Lake) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// Optional. Settings to manage lake and Dataproc Metastore service instance association.
func (o LakeOutput) Metastore() LakeMetastorePtrOutput {
	return o.ApplyT(func(v *Lake) LakeMetastorePtrOutput { return v.Metastore }).(LakeMetastorePtrOutput)
}

// Output only. Metastore status of the lake.
func (o LakeOutput) MetastoreStatuses() LakeMetastoreStatusArrayOutput {
	return o.ApplyT(func(v *Lake) LakeMetastoreStatusArrayOutput { return v.MetastoreStatuses }).(LakeMetastoreStatusArrayOutput)
}

// The name of the lake.
//
// ***
func (o LakeOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Lake) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The project for the resource
func (o LakeOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *Lake) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// The combination of labels configured directly on the resource and default labels configured on the provider.
func (o LakeOutput) PulumiLabels() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Lake) pulumi.StringMapOutput { return v.PulumiLabels }).(pulumi.StringMapOutput)
}

// Output only. Service account associated with this lake. This service account must be authorized to access or operate on resources managed by the lake.
func (o LakeOutput) ServiceAccount() pulumi.StringOutput {
	return o.ApplyT(func(v *Lake) pulumi.StringOutput { return v.ServiceAccount }).(pulumi.StringOutput)
}

// Output only. Current state of the lake. Possible values: STATE_UNSPECIFIED, ACTIVE, CREATING, DELETING, ACTION_REQUIRED
func (o LakeOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v *Lake) pulumi.StringOutput { return v.State }).(pulumi.StringOutput)
}

// Output only. System generated globally unique ID for the lake. This ID will be different if the lake is deleted and re-created with the same name.
func (o LakeOutput) Uid() pulumi.StringOutput {
	return o.ApplyT(func(v *Lake) pulumi.StringOutput { return v.Uid }).(pulumi.StringOutput)
}

// Output only. The time when the lake was last updated.
func (o LakeOutput) UpdateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *Lake) pulumi.StringOutput { return v.UpdateTime }).(pulumi.StringOutput)
}

type LakeArrayOutput struct{ *pulumi.OutputState }

func (LakeArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Lake)(nil)).Elem()
}

func (o LakeArrayOutput) ToLakeArrayOutput() LakeArrayOutput {
	return o
}

func (o LakeArrayOutput) ToLakeArrayOutputWithContext(ctx context.Context) LakeArrayOutput {
	return o
}

func (o LakeArrayOutput) Index(i pulumi.IntInput) LakeOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Lake {
		return vs[0].([]*Lake)[vs[1].(int)]
	}).(LakeOutput)
}

type LakeMapOutput struct{ *pulumi.OutputState }

func (LakeMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Lake)(nil)).Elem()
}

func (o LakeMapOutput) ToLakeMapOutput() LakeMapOutput {
	return o
}

func (o LakeMapOutput) ToLakeMapOutputWithContext(ctx context.Context) LakeMapOutput {
	return o
}

func (o LakeMapOutput) MapIndex(k pulumi.StringInput) LakeOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Lake {
		return vs[0].(map[string]*Lake)[vs[1].(string)]
	}).(LakeOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*LakeInput)(nil)).Elem(), &Lake{})
	pulumi.RegisterInputType(reflect.TypeOf((*LakeArrayInput)(nil)).Elem(), LakeArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*LakeMapInput)(nil)).Elem(), LakeMap{})
	pulumi.RegisterOutputType(LakeOutput{})
	pulumi.RegisterOutputType(LakeArrayOutput{})
	pulumi.RegisterOutputType(LakeMapOutput{})
}
