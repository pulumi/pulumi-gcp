// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package networkservices

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Mesh represents a logical configuration grouping for workload to workload communication within a
// service mesh. Routes that point to mesh dictate how requests are routed within this logical
// mesh boundary.
//
// To get more information about Mesh, see:
//
// * [API documentation](https://cloud.google.com/traffic-director/docs/reference/network-services/rest/v1beta1/projects.locations.meshes)
//
// ## Example Usage
//
// ### Network Services Mesh Basic
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/networkservices"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := networkservices.NewMesh(ctx, "default", &networkservices.MeshArgs{
//				Name: pulumi.String("my-mesh"),
//				Labels: pulumi.StringMap{
//					"foo": pulumi.String("bar"),
//				},
//				Description:      pulumi.String("my description"),
//				InterceptionPort: pulumi.Int(443),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Network Services Mesh No Port
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/networkservices"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := networkservices.NewMesh(ctx, "default", &networkservices.MeshArgs{
//				Name: pulumi.String("my-mesh-noport"),
//				Labels: pulumi.StringMap{
//					"foo": pulumi.String("bar"),
//				},
//				Description: pulumi.String("my description"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Network Services Mesh Location
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/networkservices"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := networkservices.NewMesh(ctx, "default", &networkservices.MeshArgs{
//				Name:     pulumi.String("my-mesh"),
//				Location: pulumi.String("global"),
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
// Mesh can be imported using any of these accepted formats:
//
// * `projects/{{project}}/locations/{{location}}/meshes/{{name}}`
//
// * `{{project}}/{{location}}/{{name}}`
//
// * `{{location}}/{{name}}`
//
// When using the `pulumi import` command, Mesh can be imported using one of the formats above. For example:
//
// ```sh
// $ pulumi import gcp:networkservices/mesh:Mesh default projects/{{project}}/locations/{{location}}/meshes/{{name}}
// ```
//
// ```sh
// $ pulumi import gcp:networkservices/mesh:Mesh default {{project}}/{{location}}/{{name}}
// ```
//
// ```sh
// $ pulumi import gcp:networkservices/mesh:Mesh default {{location}}/{{name}}
// ```
type Mesh struct {
	pulumi.CustomResourceState

	// Time the Mesh was created in UTC.
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// A free-text description of the resource. Max length 1024 characters.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
	EffectiveLabels pulumi.StringMapOutput `pulumi:"effectiveLabels"`
	// Optional. If set to a valid TCP port (1-65535), instructs the SIDECAR proxy to listen on the
	// specified port of localhost (127.0.0.1) address. The SIDECAR proxy will expect all traffic to
	// be redirected to this port regardless of its actual ip:port destination. If unset, a port
	// '15001' is used as the interception port. This will is applicable only for sidecar proxy
	// deployments.
	InterceptionPort pulumi.IntPtrOutput `pulumi:"interceptionPort"`
	// Set of label tags associated with the Mesh resource.
	// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
	// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
	Labels pulumi.StringMapOutput `pulumi:"labels"`
	// Location (region) of the Mesh resource to be created. Only the value 'global' is currently allowed; defaults to 'global' if omitted.
	Location pulumi.StringPtrOutput `pulumi:"location"`
	// Short name of the Mesh resource to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringOutput `pulumi:"project"`
	// The combination of labels configured directly on the resource
	// and default labels configured on the provider.
	PulumiLabels pulumi.StringMapOutput `pulumi:"pulumiLabels"`
	// Server-defined URL of this resource.
	SelfLink pulumi.StringOutput `pulumi:"selfLink"`
	// Time the Mesh was updated in UTC.
	UpdateTime pulumi.StringOutput `pulumi:"updateTime"`
}

// NewMesh registers a new resource with the given unique name, arguments, and options.
func NewMesh(ctx *pulumi.Context,
	name string, args *MeshArgs, opts ...pulumi.ResourceOption) (*Mesh, error) {
	if args == nil {
		args = &MeshArgs{}
	}

	secrets := pulumi.AdditionalSecretOutputs([]string{
		"effectiveLabels",
		"pulumiLabels",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Mesh
	err := ctx.RegisterResource("gcp:networkservices/mesh:Mesh", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetMesh gets an existing Mesh resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetMesh(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *MeshState, opts ...pulumi.ResourceOption) (*Mesh, error) {
	var resource Mesh
	err := ctx.ReadResource("gcp:networkservices/mesh:Mesh", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Mesh resources.
type meshState struct {
	// Time the Mesh was created in UTC.
	CreateTime *string `pulumi:"createTime"`
	// A free-text description of the resource. Max length 1024 characters.
	Description *string `pulumi:"description"`
	// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
	EffectiveLabels map[string]string `pulumi:"effectiveLabels"`
	// Optional. If set to a valid TCP port (1-65535), instructs the SIDECAR proxy to listen on the
	// specified port of localhost (127.0.0.1) address. The SIDECAR proxy will expect all traffic to
	// be redirected to this port regardless of its actual ip:port destination. If unset, a port
	// '15001' is used as the interception port. This will is applicable only for sidecar proxy
	// deployments.
	InterceptionPort *int `pulumi:"interceptionPort"`
	// Set of label tags associated with the Mesh resource.
	// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
	// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
	Labels map[string]string `pulumi:"labels"`
	// Location (region) of the Mesh resource to be created. Only the value 'global' is currently allowed; defaults to 'global' if omitted.
	Location *string `pulumi:"location"`
	// Short name of the Mesh resource to be created.
	Name *string `pulumi:"name"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
	// The combination of labels configured directly on the resource
	// and default labels configured on the provider.
	PulumiLabels map[string]string `pulumi:"pulumiLabels"`
	// Server-defined URL of this resource.
	SelfLink *string `pulumi:"selfLink"`
	// Time the Mesh was updated in UTC.
	UpdateTime *string `pulumi:"updateTime"`
}

type MeshState struct {
	// Time the Mesh was created in UTC.
	CreateTime pulumi.StringPtrInput
	// A free-text description of the resource. Max length 1024 characters.
	Description pulumi.StringPtrInput
	// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
	EffectiveLabels pulumi.StringMapInput
	// Optional. If set to a valid TCP port (1-65535), instructs the SIDECAR proxy to listen on the
	// specified port of localhost (127.0.0.1) address. The SIDECAR proxy will expect all traffic to
	// be redirected to this port regardless of its actual ip:port destination. If unset, a port
	// '15001' is used as the interception port. This will is applicable only for sidecar proxy
	// deployments.
	InterceptionPort pulumi.IntPtrInput
	// Set of label tags associated with the Mesh resource.
	// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
	// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
	Labels pulumi.StringMapInput
	// Location (region) of the Mesh resource to be created. Only the value 'global' is currently allowed; defaults to 'global' if omitted.
	Location pulumi.StringPtrInput
	// Short name of the Mesh resource to be created.
	Name pulumi.StringPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
	// The combination of labels configured directly on the resource
	// and default labels configured on the provider.
	PulumiLabels pulumi.StringMapInput
	// Server-defined URL of this resource.
	SelfLink pulumi.StringPtrInput
	// Time the Mesh was updated in UTC.
	UpdateTime pulumi.StringPtrInput
}

func (MeshState) ElementType() reflect.Type {
	return reflect.TypeOf((*meshState)(nil)).Elem()
}

type meshArgs struct {
	// A free-text description of the resource. Max length 1024 characters.
	Description *string `pulumi:"description"`
	// Optional. If set to a valid TCP port (1-65535), instructs the SIDECAR proxy to listen on the
	// specified port of localhost (127.0.0.1) address. The SIDECAR proxy will expect all traffic to
	// be redirected to this port regardless of its actual ip:port destination. If unset, a port
	// '15001' is used as the interception port. This will is applicable only for sidecar proxy
	// deployments.
	InterceptionPort *int `pulumi:"interceptionPort"`
	// Set of label tags associated with the Mesh resource.
	// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
	// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
	Labels map[string]string `pulumi:"labels"`
	// Location (region) of the Mesh resource to be created. Only the value 'global' is currently allowed; defaults to 'global' if omitted.
	Location *string `pulumi:"location"`
	// Short name of the Mesh resource to be created.
	Name *string `pulumi:"name"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
}

// The set of arguments for constructing a Mesh resource.
type MeshArgs struct {
	// A free-text description of the resource. Max length 1024 characters.
	Description pulumi.StringPtrInput
	// Optional. If set to a valid TCP port (1-65535), instructs the SIDECAR proxy to listen on the
	// specified port of localhost (127.0.0.1) address. The SIDECAR proxy will expect all traffic to
	// be redirected to this port regardless of its actual ip:port destination. If unset, a port
	// '15001' is used as the interception port. This will is applicable only for sidecar proxy
	// deployments.
	InterceptionPort pulumi.IntPtrInput
	// Set of label tags associated with the Mesh resource.
	// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
	// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
	Labels pulumi.StringMapInput
	// Location (region) of the Mesh resource to be created. Only the value 'global' is currently allowed; defaults to 'global' if omitted.
	Location pulumi.StringPtrInput
	// Short name of the Mesh resource to be created.
	Name pulumi.StringPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
}

func (MeshArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*meshArgs)(nil)).Elem()
}

type MeshInput interface {
	pulumi.Input

	ToMeshOutput() MeshOutput
	ToMeshOutputWithContext(ctx context.Context) MeshOutput
}

func (*Mesh) ElementType() reflect.Type {
	return reflect.TypeOf((**Mesh)(nil)).Elem()
}

func (i *Mesh) ToMeshOutput() MeshOutput {
	return i.ToMeshOutputWithContext(context.Background())
}

func (i *Mesh) ToMeshOutputWithContext(ctx context.Context) MeshOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MeshOutput)
}

// MeshArrayInput is an input type that accepts MeshArray and MeshArrayOutput values.
// You can construct a concrete instance of `MeshArrayInput` via:
//
//	MeshArray{ MeshArgs{...} }
type MeshArrayInput interface {
	pulumi.Input

	ToMeshArrayOutput() MeshArrayOutput
	ToMeshArrayOutputWithContext(context.Context) MeshArrayOutput
}

type MeshArray []MeshInput

func (MeshArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Mesh)(nil)).Elem()
}

func (i MeshArray) ToMeshArrayOutput() MeshArrayOutput {
	return i.ToMeshArrayOutputWithContext(context.Background())
}

func (i MeshArray) ToMeshArrayOutputWithContext(ctx context.Context) MeshArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MeshArrayOutput)
}

// MeshMapInput is an input type that accepts MeshMap and MeshMapOutput values.
// You can construct a concrete instance of `MeshMapInput` via:
//
//	MeshMap{ "key": MeshArgs{...} }
type MeshMapInput interface {
	pulumi.Input

	ToMeshMapOutput() MeshMapOutput
	ToMeshMapOutputWithContext(context.Context) MeshMapOutput
}

type MeshMap map[string]MeshInput

func (MeshMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Mesh)(nil)).Elem()
}

func (i MeshMap) ToMeshMapOutput() MeshMapOutput {
	return i.ToMeshMapOutputWithContext(context.Background())
}

func (i MeshMap) ToMeshMapOutputWithContext(ctx context.Context) MeshMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MeshMapOutput)
}

type MeshOutput struct{ *pulumi.OutputState }

func (MeshOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Mesh)(nil)).Elem()
}

func (o MeshOutput) ToMeshOutput() MeshOutput {
	return o
}

func (o MeshOutput) ToMeshOutputWithContext(ctx context.Context) MeshOutput {
	return o
}

// Time the Mesh was created in UTC.
func (o MeshOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *Mesh) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// A free-text description of the resource. Max length 1024 characters.
func (o MeshOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Mesh) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
func (o MeshOutput) EffectiveLabels() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Mesh) pulumi.StringMapOutput { return v.EffectiveLabels }).(pulumi.StringMapOutput)
}

// Optional. If set to a valid TCP port (1-65535), instructs the SIDECAR proxy to listen on the
// specified port of localhost (127.0.0.1) address. The SIDECAR proxy will expect all traffic to
// be redirected to this port regardless of its actual ip:port destination. If unset, a port
// '15001' is used as the interception port. This will is applicable only for sidecar proxy
// deployments.
func (o MeshOutput) InterceptionPort() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Mesh) pulumi.IntPtrOutput { return v.InterceptionPort }).(pulumi.IntPtrOutput)
}

// Set of label tags associated with the Mesh resource.
// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
func (o MeshOutput) Labels() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Mesh) pulumi.StringMapOutput { return v.Labels }).(pulumi.StringMapOutput)
}

// Location (region) of the Mesh resource to be created. Only the value 'global' is currently allowed; defaults to 'global' if omitted.
func (o MeshOutput) Location() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Mesh) pulumi.StringPtrOutput { return v.Location }).(pulumi.StringPtrOutput)
}

// Short name of the Mesh resource to be created.
func (o MeshOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Mesh) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The ID of the project in which the resource belongs.
// If it is not provided, the provider project is used.
func (o MeshOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *Mesh) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// The combination of labels configured directly on the resource
// and default labels configured on the provider.
func (o MeshOutput) PulumiLabels() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Mesh) pulumi.StringMapOutput { return v.PulumiLabels }).(pulumi.StringMapOutput)
}

// Server-defined URL of this resource.
func (o MeshOutput) SelfLink() pulumi.StringOutput {
	return o.ApplyT(func(v *Mesh) pulumi.StringOutput { return v.SelfLink }).(pulumi.StringOutput)
}

// Time the Mesh was updated in UTC.
func (o MeshOutput) UpdateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *Mesh) pulumi.StringOutput { return v.UpdateTime }).(pulumi.StringOutput)
}

type MeshArrayOutput struct{ *pulumi.OutputState }

func (MeshArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Mesh)(nil)).Elem()
}

func (o MeshArrayOutput) ToMeshArrayOutput() MeshArrayOutput {
	return o
}

func (o MeshArrayOutput) ToMeshArrayOutputWithContext(ctx context.Context) MeshArrayOutput {
	return o
}

func (o MeshArrayOutput) Index(i pulumi.IntInput) MeshOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Mesh {
		return vs[0].([]*Mesh)[vs[1].(int)]
	}).(MeshOutput)
}

type MeshMapOutput struct{ *pulumi.OutputState }

func (MeshMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Mesh)(nil)).Elem()
}

func (o MeshMapOutput) ToMeshMapOutput() MeshMapOutput {
	return o
}

func (o MeshMapOutput) ToMeshMapOutputWithContext(ctx context.Context) MeshMapOutput {
	return o
}

func (o MeshMapOutput) MapIndex(k pulumi.StringInput) MeshOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Mesh {
		return vs[0].(map[string]*Mesh)[vs[1].(string)]
	}).(MeshOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*MeshInput)(nil)).Elem(), &Mesh{})
	pulumi.RegisterInputType(reflect.TypeOf((*MeshArrayInput)(nil)).Elem(), MeshArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*MeshMapInput)(nil)).Elem(), MeshMap{})
	pulumi.RegisterOutputType(MeshOutput{})
	pulumi.RegisterOutputType(MeshArrayOutput{})
	pulumi.RegisterOutputType(MeshMapOutput{})
}
