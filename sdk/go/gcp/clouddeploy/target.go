// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package clouddeploy

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// The Cloud Deploy `Target` resource
//
// ## Example Usage
// ### Target
// Creates a basic Cloud Deploy target
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/clouddeploy"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := clouddeploy.NewTarget(ctx, "primary", &clouddeploy.TargetArgs{
// 			Annotations: pulumi.StringMap{
// 				"my_first_annotation":  pulumi.String("example-annotation-1"),
// 				"my_second_annotation": pulumi.String("example-annotation-2"),
// 			},
// 			Description: pulumi.String("basic description"),
// 			Gke: &clouddeploy.TargetGkeArgs{
// 				Cluster: pulumi.String("projects/my-project-name/locations/us-west1/clusters/example-cluster-name"),
// 			},
// 			Labels: pulumi.StringMap{
// 				"my_first_label":  pulumi.String("example-label-1"),
// 				"my_second_label": pulumi.String("example-label-2"),
// 			},
// 			Location:        pulumi.String("us-west1"),
// 			Project:         pulumi.String("my-project-name"),
// 			RequireApproval: pulumi.Bool(false),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// Target can be imported using any of these accepted formats
//
// ```sh
//  $ pulumi import gcp:clouddeploy/target:Target default projects/{{project}}/locations/{{location}}/targets/{{name}}
// ```
//
// ```sh
//  $ pulumi import gcp:clouddeploy/target:Target default {{project}}/{{location}}/{{name}}
// ```
//
// ```sh
//  $ pulumi import gcp:clouddeploy/target:Target default {{location}}/{{name}}
// ```
type Target struct {
	pulumi.CustomResourceState

	// Optional. User annotations. These attributes can only be set and used by the user, and not by Google Cloud Deploy. See https://google.aip.dev/128#annotations for more details such as format and size limitations.
	Annotations pulumi.StringMapOutput `pulumi:"annotations"`
	// Information specifying an Anthos Cluster.
	AnthosCluster TargetAnthosClusterPtrOutput `pulumi:"anthosCluster"`
	// Output only. Time at which the `Target` was created.
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// Optional. Description of the `Target`. Max length is 255 characters.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Optional. This checksum is computed by the server based on the value of other fields, and may be sent on update and
	// delete requests to ensure the client has an up-to-date value before proceeding.
	Etag pulumi.StringOutput `pulumi:"etag"`
	// Configurations for all execution that relates to this `Target`. Each `ExecutionEnvironmentUsage` value may only be used in a single configuration; using the same value multiple times is an error. When one or more configurations are specified, they must include the `RENDER` and `DEPLOY` `ExecutionEnvironmentUsage` values. When no configurations are specified, execution will use the default specified in `DefaultPool`.
	ExecutionConfigs TargetExecutionConfigArrayOutput `pulumi:"executionConfigs"`
	// Information specifying a GKE Cluster.
	Gke TargetGkePtrOutput `pulumi:"gke"`
	// Optional. Labels are attributes that can be set and used by both the user and by Google Cloud Deploy. Labels must meet the following constraints: * Keys and values can contain only lowercase letters, numeric characters, underscores, and dashes. * All characters must use UTF-8 encoding, and international characters are allowed. * Keys must start with a lowercase letter or international character. * Each resource is limited to a maximum of 64 labels. Both keys and values are additionally constrained to be <= 128 bytes.
	Labels pulumi.StringMapOutput `pulumi:"labels"`
	// The location for the resource
	Location pulumi.StringOutput `pulumi:"location"`
	// Name of the `Target`. Format is [a-z][a-z0-9\-]{0,62}.
	Name pulumi.StringOutput `pulumi:"name"`
	// The project for the resource
	Project pulumi.StringOutput `pulumi:"project"`
	// Optional. Whether or not the `Target` requires approval.
	RequireApproval pulumi.BoolPtrOutput `pulumi:"requireApproval"`
	// Output only. Resource id of the `Target`.
	TargetId pulumi.StringOutput `pulumi:"targetId"`
	// Output only. Unique identifier of the `Target`.
	Uid pulumi.StringOutput `pulumi:"uid"`
	// Output only. Most recent time at which the `Target` was updated.
	UpdateTime pulumi.StringOutput `pulumi:"updateTime"`
}

// NewTarget registers a new resource with the given unique name, arguments, and options.
func NewTarget(ctx *pulumi.Context,
	name string, args *TargetArgs, opts ...pulumi.ResourceOption) (*Target, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Location == nil {
		return nil, errors.New("invalid value for required argument 'Location'")
	}
	var resource Target
	err := ctx.RegisterResource("gcp:clouddeploy/target:Target", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTarget gets an existing Target resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTarget(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TargetState, opts ...pulumi.ResourceOption) (*Target, error) {
	var resource Target
	err := ctx.ReadResource("gcp:clouddeploy/target:Target", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Target resources.
type targetState struct {
	// Optional. User annotations. These attributes can only be set and used by the user, and not by Google Cloud Deploy. See https://google.aip.dev/128#annotations for more details such as format and size limitations.
	Annotations map[string]string `pulumi:"annotations"`
	// Information specifying an Anthos Cluster.
	AnthosCluster *TargetAnthosCluster `pulumi:"anthosCluster"`
	// Output only. Time at which the `Target` was created.
	CreateTime *string `pulumi:"createTime"`
	// Optional. Description of the `Target`. Max length is 255 characters.
	Description *string `pulumi:"description"`
	// Optional. This checksum is computed by the server based on the value of other fields, and may be sent on update and
	// delete requests to ensure the client has an up-to-date value before proceeding.
	Etag *string `pulumi:"etag"`
	// Configurations for all execution that relates to this `Target`. Each `ExecutionEnvironmentUsage` value may only be used in a single configuration; using the same value multiple times is an error. When one or more configurations are specified, they must include the `RENDER` and `DEPLOY` `ExecutionEnvironmentUsage` values. When no configurations are specified, execution will use the default specified in `DefaultPool`.
	ExecutionConfigs []TargetExecutionConfig `pulumi:"executionConfigs"`
	// Information specifying a GKE Cluster.
	Gke *TargetGke `pulumi:"gke"`
	// Optional. Labels are attributes that can be set and used by both the user and by Google Cloud Deploy. Labels must meet the following constraints: * Keys and values can contain only lowercase letters, numeric characters, underscores, and dashes. * All characters must use UTF-8 encoding, and international characters are allowed. * Keys must start with a lowercase letter or international character. * Each resource is limited to a maximum of 64 labels. Both keys and values are additionally constrained to be <= 128 bytes.
	Labels map[string]string `pulumi:"labels"`
	// The location for the resource
	Location *string `pulumi:"location"`
	// Name of the `Target`. Format is [a-z][a-z0-9\-]{0,62}.
	Name *string `pulumi:"name"`
	// The project for the resource
	Project *string `pulumi:"project"`
	// Optional. Whether or not the `Target` requires approval.
	RequireApproval *bool `pulumi:"requireApproval"`
	// Output only. Resource id of the `Target`.
	TargetId *string `pulumi:"targetId"`
	// Output only. Unique identifier of the `Target`.
	Uid *string `pulumi:"uid"`
	// Output only. Most recent time at which the `Target` was updated.
	UpdateTime *string `pulumi:"updateTime"`
}

type TargetState struct {
	// Optional. User annotations. These attributes can only be set and used by the user, and not by Google Cloud Deploy. See https://google.aip.dev/128#annotations for more details such as format and size limitations.
	Annotations pulumi.StringMapInput
	// Information specifying an Anthos Cluster.
	AnthosCluster TargetAnthosClusterPtrInput
	// Output only. Time at which the `Target` was created.
	CreateTime pulumi.StringPtrInput
	// Optional. Description of the `Target`. Max length is 255 characters.
	Description pulumi.StringPtrInput
	// Optional. This checksum is computed by the server based on the value of other fields, and may be sent on update and
	// delete requests to ensure the client has an up-to-date value before proceeding.
	Etag pulumi.StringPtrInput
	// Configurations for all execution that relates to this `Target`. Each `ExecutionEnvironmentUsage` value may only be used in a single configuration; using the same value multiple times is an error. When one or more configurations are specified, they must include the `RENDER` and `DEPLOY` `ExecutionEnvironmentUsage` values. When no configurations are specified, execution will use the default specified in `DefaultPool`.
	ExecutionConfigs TargetExecutionConfigArrayInput
	// Information specifying a GKE Cluster.
	Gke TargetGkePtrInput
	// Optional. Labels are attributes that can be set and used by both the user and by Google Cloud Deploy. Labels must meet the following constraints: * Keys and values can contain only lowercase letters, numeric characters, underscores, and dashes. * All characters must use UTF-8 encoding, and international characters are allowed. * Keys must start with a lowercase letter or international character. * Each resource is limited to a maximum of 64 labels. Both keys and values are additionally constrained to be <= 128 bytes.
	Labels pulumi.StringMapInput
	// The location for the resource
	Location pulumi.StringPtrInput
	// Name of the `Target`. Format is [a-z][a-z0-9\-]{0,62}.
	Name pulumi.StringPtrInput
	// The project for the resource
	Project pulumi.StringPtrInput
	// Optional. Whether or not the `Target` requires approval.
	RequireApproval pulumi.BoolPtrInput
	// Output only. Resource id of the `Target`.
	TargetId pulumi.StringPtrInput
	// Output only. Unique identifier of the `Target`.
	Uid pulumi.StringPtrInput
	// Output only. Most recent time at which the `Target` was updated.
	UpdateTime pulumi.StringPtrInput
}

func (TargetState) ElementType() reflect.Type {
	return reflect.TypeOf((*targetState)(nil)).Elem()
}

type targetArgs struct {
	// Optional. User annotations. These attributes can only be set and used by the user, and not by Google Cloud Deploy. See https://google.aip.dev/128#annotations for more details such as format and size limitations.
	Annotations map[string]string `pulumi:"annotations"`
	// Information specifying an Anthos Cluster.
	AnthosCluster *TargetAnthosCluster `pulumi:"anthosCluster"`
	// Optional. Description of the `Target`. Max length is 255 characters.
	Description *string `pulumi:"description"`
	// Configurations for all execution that relates to this `Target`. Each `ExecutionEnvironmentUsage` value may only be used in a single configuration; using the same value multiple times is an error. When one or more configurations are specified, they must include the `RENDER` and `DEPLOY` `ExecutionEnvironmentUsage` values. When no configurations are specified, execution will use the default specified in `DefaultPool`.
	ExecutionConfigs []TargetExecutionConfig `pulumi:"executionConfigs"`
	// Information specifying a GKE Cluster.
	Gke *TargetGke `pulumi:"gke"`
	// Optional. Labels are attributes that can be set and used by both the user and by Google Cloud Deploy. Labels must meet the following constraints: * Keys and values can contain only lowercase letters, numeric characters, underscores, and dashes. * All characters must use UTF-8 encoding, and international characters are allowed. * Keys must start with a lowercase letter or international character. * Each resource is limited to a maximum of 64 labels. Both keys and values are additionally constrained to be <= 128 bytes.
	Labels map[string]string `pulumi:"labels"`
	// The location for the resource
	Location string `pulumi:"location"`
	// Name of the `Target`. Format is [a-z][a-z0-9\-]{0,62}.
	Name *string `pulumi:"name"`
	// The project for the resource
	Project *string `pulumi:"project"`
	// Optional. Whether or not the `Target` requires approval.
	RequireApproval *bool `pulumi:"requireApproval"`
}

// The set of arguments for constructing a Target resource.
type TargetArgs struct {
	// Optional. User annotations. These attributes can only be set and used by the user, and not by Google Cloud Deploy. See https://google.aip.dev/128#annotations for more details such as format and size limitations.
	Annotations pulumi.StringMapInput
	// Information specifying an Anthos Cluster.
	AnthosCluster TargetAnthosClusterPtrInput
	// Optional. Description of the `Target`. Max length is 255 characters.
	Description pulumi.StringPtrInput
	// Configurations for all execution that relates to this `Target`. Each `ExecutionEnvironmentUsage` value may only be used in a single configuration; using the same value multiple times is an error. When one or more configurations are specified, they must include the `RENDER` and `DEPLOY` `ExecutionEnvironmentUsage` values. When no configurations are specified, execution will use the default specified in `DefaultPool`.
	ExecutionConfigs TargetExecutionConfigArrayInput
	// Information specifying a GKE Cluster.
	Gke TargetGkePtrInput
	// Optional. Labels are attributes that can be set and used by both the user and by Google Cloud Deploy. Labels must meet the following constraints: * Keys and values can contain only lowercase letters, numeric characters, underscores, and dashes. * All characters must use UTF-8 encoding, and international characters are allowed. * Keys must start with a lowercase letter or international character. * Each resource is limited to a maximum of 64 labels. Both keys and values are additionally constrained to be <= 128 bytes.
	Labels pulumi.StringMapInput
	// The location for the resource
	Location pulumi.StringInput
	// Name of the `Target`. Format is [a-z][a-z0-9\-]{0,62}.
	Name pulumi.StringPtrInput
	// The project for the resource
	Project pulumi.StringPtrInput
	// Optional. Whether or not the `Target` requires approval.
	RequireApproval pulumi.BoolPtrInput
}

func (TargetArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*targetArgs)(nil)).Elem()
}

type TargetInput interface {
	pulumi.Input

	ToTargetOutput() TargetOutput
	ToTargetOutputWithContext(ctx context.Context) TargetOutput
}

func (*Target) ElementType() reflect.Type {
	return reflect.TypeOf((**Target)(nil)).Elem()
}

func (i *Target) ToTargetOutput() TargetOutput {
	return i.ToTargetOutputWithContext(context.Background())
}

func (i *Target) ToTargetOutputWithContext(ctx context.Context) TargetOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TargetOutput)
}

// TargetArrayInput is an input type that accepts TargetArray and TargetArrayOutput values.
// You can construct a concrete instance of `TargetArrayInput` via:
//
//          TargetArray{ TargetArgs{...} }
type TargetArrayInput interface {
	pulumi.Input

	ToTargetArrayOutput() TargetArrayOutput
	ToTargetArrayOutputWithContext(context.Context) TargetArrayOutput
}

type TargetArray []TargetInput

func (TargetArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Target)(nil)).Elem()
}

func (i TargetArray) ToTargetArrayOutput() TargetArrayOutput {
	return i.ToTargetArrayOutputWithContext(context.Background())
}

func (i TargetArray) ToTargetArrayOutputWithContext(ctx context.Context) TargetArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TargetArrayOutput)
}

// TargetMapInput is an input type that accepts TargetMap and TargetMapOutput values.
// You can construct a concrete instance of `TargetMapInput` via:
//
//          TargetMap{ "key": TargetArgs{...} }
type TargetMapInput interface {
	pulumi.Input

	ToTargetMapOutput() TargetMapOutput
	ToTargetMapOutputWithContext(context.Context) TargetMapOutput
}

type TargetMap map[string]TargetInput

func (TargetMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Target)(nil)).Elem()
}

func (i TargetMap) ToTargetMapOutput() TargetMapOutput {
	return i.ToTargetMapOutputWithContext(context.Background())
}

func (i TargetMap) ToTargetMapOutputWithContext(ctx context.Context) TargetMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TargetMapOutput)
}

type TargetOutput struct{ *pulumi.OutputState }

func (TargetOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Target)(nil)).Elem()
}

func (o TargetOutput) ToTargetOutput() TargetOutput {
	return o
}

func (o TargetOutput) ToTargetOutputWithContext(ctx context.Context) TargetOutput {
	return o
}

// Optional. User annotations. These attributes can only be set and used by the user, and not by Google Cloud Deploy. See https://google.aip.dev/128#annotations for more details such as format and size limitations.
func (o TargetOutput) Annotations() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Target) pulumi.StringMapOutput { return v.Annotations }).(pulumi.StringMapOutput)
}

// Information specifying an Anthos Cluster.
func (o TargetOutput) AnthosCluster() TargetAnthosClusterPtrOutput {
	return o.ApplyT(func(v *Target) TargetAnthosClusterPtrOutput { return v.AnthosCluster }).(TargetAnthosClusterPtrOutput)
}

// Output only. Time at which the `Target` was created.
func (o TargetOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *Target) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// Optional. Description of the `Target`. Max length is 255 characters.
func (o TargetOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Target) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Optional. This checksum is computed by the server based on the value of other fields, and may be sent on update and
// delete requests to ensure the client has an up-to-date value before proceeding.
func (o TargetOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v *Target) pulumi.StringOutput { return v.Etag }).(pulumi.StringOutput)
}

// Configurations for all execution that relates to this `Target`. Each `ExecutionEnvironmentUsage` value may only be used in a single configuration; using the same value multiple times is an error. When one or more configurations are specified, they must include the `RENDER` and `DEPLOY` `ExecutionEnvironmentUsage` values. When no configurations are specified, execution will use the default specified in `DefaultPool`.
func (o TargetOutput) ExecutionConfigs() TargetExecutionConfigArrayOutput {
	return o.ApplyT(func(v *Target) TargetExecutionConfigArrayOutput { return v.ExecutionConfigs }).(TargetExecutionConfigArrayOutput)
}

// Information specifying a GKE Cluster.
func (o TargetOutput) Gke() TargetGkePtrOutput {
	return o.ApplyT(func(v *Target) TargetGkePtrOutput { return v.Gke }).(TargetGkePtrOutput)
}

// Optional. Labels are attributes that can be set and used by both the user and by Google Cloud Deploy. Labels must meet the following constraints: * Keys and values can contain only lowercase letters, numeric characters, underscores, and dashes. * All characters must use UTF-8 encoding, and international characters are allowed. * Keys must start with a lowercase letter or international character. * Each resource is limited to a maximum of 64 labels. Both keys and values are additionally constrained to be <= 128 bytes.
func (o TargetOutput) Labels() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Target) pulumi.StringMapOutput { return v.Labels }).(pulumi.StringMapOutput)
}

// The location for the resource
func (o TargetOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *Target) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// Name of the `Target`. Format is [a-z][a-z0-9\-]{0,62}.
func (o TargetOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Target) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The project for the resource
func (o TargetOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *Target) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// Optional. Whether or not the `Target` requires approval.
func (o TargetOutput) RequireApproval() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Target) pulumi.BoolPtrOutput { return v.RequireApproval }).(pulumi.BoolPtrOutput)
}

// Output only. Resource id of the `Target`.
func (o TargetOutput) TargetId() pulumi.StringOutput {
	return o.ApplyT(func(v *Target) pulumi.StringOutput { return v.TargetId }).(pulumi.StringOutput)
}

// Output only. Unique identifier of the `Target`.
func (o TargetOutput) Uid() pulumi.StringOutput {
	return o.ApplyT(func(v *Target) pulumi.StringOutput { return v.Uid }).(pulumi.StringOutput)
}

// Output only. Most recent time at which the `Target` was updated.
func (o TargetOutput) UpdateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *Target) pulumi.StringOutput { return v.UpdateTime }).(pulumi.StringOutput)
}

type TargetArrayOutput struct{ *pulumi.OutputState }

func (TargetArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Target)(nil)).Elem()
}

func (o TargetArrayOutput) ToTargetArrayOutput() TargetArrayOutput {
	return o
}

func (o TargetArrayOutput) ToTargetArrayOutputWithContext(ctx context.Context) TargetArrayOutput {
	return o
}

func (o TargetArrayOutput) Index(i pulumi.IntInput) TargetOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Target {
		return vs[0].([]*Target)[vs[1].(int)]
	}).(TargetOutput)
}

type TargetMapOutput struct{ *pulumi.OutputState }

func (TargetMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Target)(nil)).Elem()
}

func (o TargetMapOutput) ToTargetMapOutput() TargetMapOutput {
	return o
}

func (o TargetMapOutput) ToTargetMapOutputWithContext(ctx context.Context) TargetMapOutput {
	return o
}

func (o TargetMapOutput) MapIndex(k pulumi.StringInput) TargetOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Target {
		return vs[0].(map[string]*Target)[vs[1].(string)]
	}).(TargetOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TargetInput)(nil)).Elem(), &Target{})
	pulumi.RegisterInputType(reflect.TypeOf((*TargetArrayInput)(nil)).Elem(), TargetArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TargetMapInput)(nil)).Elem(), TargetMap{})
	pulumi.RegisterOutputType(TargetOutput{})
	pulumi.RegisterOutputType(TargetArrayOutput{})
	pulumi.RegisterOutputType(TargetMapOutput{})
}