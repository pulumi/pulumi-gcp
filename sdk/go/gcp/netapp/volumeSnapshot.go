// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package netapp

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// NetApp Volumes helps you manage your data usage with snapshots that can quickly restore lost data.
// Snapshots are point-in-time versions of your volume's content. They are resources of volumes and are
// instant captures of your data that consume space only for modified data. Because data changes over
// time, snapshots usually consume more space as they get older.
// NetApp Volumes volumes use just-in-time copy-on-write so that unmodified files in snapshots don't
// consume any of the volume's capacity.
//
// To get more information about VolumeSnapshot, see:
//
// * [API documentation](https://cloud.google.com/netapp/volumes/docs/reference/rest/v1/projects.locations.volumes.snapshots)
// * How-to Guides
//   - [Documentation](https://cloud.google.com/netapp/volumes/docs/configure-and-use/volume-snapshots/overview)
//
// ## Example Usage
//
// ### Volume Snapshot Create
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/compute"
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/netapp"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_default, err := compute.LookupNetwork(ctx, &compute.LookupNetworkArgs{
//				Name: "test-network",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			defaultStoragePool, err := netapp.NewStoragePool(ctx, "default", &netapp.StoragePoolArgs{
//				Name:         pulumi.String("test-pool"),
//				Location:     pulumi.String("us-west2"),
//				ServiceLevel: pulumi.String("PREMIUM"),
//				CapacityGib:  pulumi.String("2048"),
//				Network:      pulumi.String(_default.Id),
//			})
//			if err != nil {
//				return err
//			}
//			defaultVolume, err := netapp.NewVolume(ctx, "default", &netapp.VolumeArgs{
//				Location:    defaultStoragePool.Location,
//				Name:        pulumi.String("test-volume"),
//				CapacityGib: pulumi.String("100"),
//				ShareName:   pulumi.String("test-volume"),
//				StoragePool: defaultStoragePool.Name,
//				Protocols: pulumi.StringArray{
//					pulumi.String("NFSV3"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = netapp.NewVolumeSnapshot(ctx, "test_snapshot", &netapp.VolumeSnapshotArgs{
//				Location:   defaultVolume.Location,
//				VolumeName: defaultVolume.Name,
//				Name:       pulumi.String("testvolumesnap"),
//			}, pulumi.DependsOn([]pulumi.Resource{
//				defaultVolume,
//			}))
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
// VolumeSnapshot can be imported using any of these accepted formats:
//
// * `projects/{{project}}/locations/{{location}}/volumes/{{volume_name}}/snapshots/{{name}}`
//
// * `{{project}}/{{location}}/{{volume_name}}/{{name}}`
//
// * `{{location}}/{{volume_name}}/{{name}}`
//
// When using the `pulumi import` command, VolumeSnapshot can be imported using one of the formats above. For example:
//
// ```sh
// $ pulumi import gcp:netapp/volumeSnapshot:VolumeSnapshot default projects/{{project}}/locations/{{location}}/volumes/{{volume_name}}/snapshots/{{name}}
// ```
//
// ```sh
// $ pulumi import gcp:netapp/volumeSnapshot:VolumeSnapshot default {{project}}/{{location}}/{{volume_name}}/{{name}}
// ```
//
// ```sh
// $ pulumi import gcp:netapp/volumeSnapshot:VolumeSnapshot default {{location}}/{{volume_name}}/{{name}}
// ```
type VolumeSnapshot struct {
	pulumi.CustomResourceState

	// Description for the snapshot.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
	EffectiveLabels pulumi.StringMapOutput `pulumi:"effectiveLabels"`
	// Labels as key value pairs. Example: `{ "owner": "Bob", "department": "finance", "purpose": "testing" }`.
	//
	// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
	// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
	Labels pulumi.StringMapOutput `pulumi:"labels"`
	// Name of the snapshot location. Snapshots are child resources of volumes and live in the same location.
	Location pulumi.StringOutput `pulumi:"location"`
	// The name of the snapshot.
	Name pulumi.StringOutput `pulumi:"name"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringOutput `pulumi:"project"`
	// The combination of labels configured directly on the resource
	// and default labels configured on the provider.
	PulumiLabels pulumi.StringMapOutput `pulumi:"pulumiLabels"`
	// Storage used to store blocks unique to this snapshot.
	UsedBytes pulumi.IntOutput `pulumi:"usedBytes"`
	// The name of the volume to create the snapshot in.
	VolumeName pulumi.StringOutput `pulumi:"volumeName"`
}

// NewVolumeSnapshot registers a new resource with the given unique name, arguments, and options.
func NewVolumeSnapshot(ctx *pulumi.Context,
	name string, args *VolumeSnapshotArgs, opts ...pulumi.ResourceOption) (*VolumeSnapshot, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Location == nil {
		return nil, errors.New("invalid value for required argument 'Location'")
	}
	if args.VolumeName == nil {
		return nil, errors.New("invalid value for required argument 'VolumeName'")
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"effectiveLabels",
		"pulumiLabels",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource VolumeSnapshot
	err := ctx.RegisterResource("gcp:netapp/volumeSnapshot:VolumeSnapshot", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetVolumeSnapshot gets an existing VolumeSnapshot resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetVolumeSnapshot(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *VolumeSnapshotState, opts ...pulumi.ResourceOption) (*VolumeSnapshot, error) {
	var resource VolumeSnapshot
	err := ctx.ReadResource("gcp:netapp/volumeSnapshot:VolumeSnapshot", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering VolumeSnapshot resources.
type volumeSnapshotState struct {
	// Description for the snapshot.
	Description *string `pulumi:"description"`
	// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
	EffectiveLabels map[string]string `pulumi:"effectiveLabels"`
	// Labels as key value pairs. Example: `{ "owner": "Bob", "department": "finance", "purpose": "testing" }`.
	//
	// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
	// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
	Labels map[string]string `pulumi:"labels"`
	// Name of the snapshot location. Snapshots are child resources of volumes and live in the same location.
	Location *string `pulumi:"location"`
	// The name of the snapshot.
	Name *string `pulumi:"name"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
	// The combination of labels configured directly on the resource
	// and default labels configured on the provider.
	PulumiLabels map[string]string `pulumi:"pulumiLabels"`
	// Storage used to store blocks unique to this snapshot.
	UsedBytes *int `pulumi:"usedBytes"`
	// The name of the volume to create the snapshot in.
	VolumeName *string `pulumi:"volumeName"`
}

type VolumeSnapshotState struct {
	// Description for the snapshot.
	Description pulumi.StringPtrInput
	// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
	EffectiveLabels pulumi.StringMapInput
	// Labels as key value pairs. Example: `{ "owner": "Bob", "department": "finance", "purpose": "testing" }`.
	//
	// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
	// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
	Labels pulumi.StringMapInput
	// Name of the snapshot location. Snapshots are child resources of volumes and live in the same location.
	Location pulumi.StringPtrInput
	// The name of the snapshot.
	Name pulumi.StringPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
	// The combination of labels configured directly on the resource
	// and default labels configured on the provider.
	PulumiLabels pulumi.StringMapInput
	// Storage used to store blocks unique to this snapshot.
	UsedBytes pulumi.IntPtrInput
	// The name of the volume to create the snapshot in.
	VolumeName pulumi.StringPtrInput
}

func (VolumeSnapshotState) ElementType() reflect.Type {
	return reflect.TypeOf((*volumeSnapshotState)(nil)).Elem()
}

type volumeSnapshotArgs struct {
	// Description for the snapshot.
	Description *string `pulumi:"description"`
	// Labels as key value pairs. Example: `{ "owner": "Bob", "department": "finance", "purpose": "testing" }`.
	//
	// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
	// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
	Labels map[string]string `pulumi:"labels"`
	// Name of the snapshot location. Snapshots are child resources of volumes and live in the same location.
	Location string `pulumi:"location"`
	// The name of the snapshot.
	Name *string `pulumi:"name"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
	// The name of the volume to create the snapshot in.
	VolumeName string `pulumi:"volumeName"`
}

// The set of arguments for constructing a VolumeSnapshot resource.
type VolumeSnapshotArgs struct {
	// Description for the snapshot.
	Description pulumi.StringPtrInput
	// Labels as key value pairs. Example: `{ "owner": "Bob", "department": "finance", "purpose": "testing" }`.
	//
	// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
	// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
	Labels pulumi.StringMapInput
	// Name of the snapshot location. Snapshots are child resources of volumes and live in the same location.
	Location pulumi.StringInput
	// The name of the snapshot.
	Name pulumi.StringPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
	// The name of the volume to create the snapshot in.
	VolumeName pulumi.StringInput
}

func (VolumeSnapshotArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*volumeSnapshotArgs)(nil)).Elem()
}

type VolumeSnapshotInput interface {
	pulumi.Input

	ToVolumeSnapshotOutput() VolumeSnapshotOutput
	ToVolumeSnapshotOutputWithContext(ctx context.Context) VolumeSnapshotOutput
}

func (*VolumeSnapshot) ElementType() reflect.Type {
	return reflect.TypeOf((**VolumeSnapshot)(nil)).Elem()
}

func (i *VolumeSnapshot) ToVolumeSnapshotOutput() VolumeSnapshotOutput {
	return i.ToVolumeSnapshotOutputWithContext(context.Background())
}

func (i *VolumeSnapshot) ToVolumeSnapshotOutputWithContext(ctx context.Context) VolumeSnapshotOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VolumeSnapshotOutput)
}

// VolumeSnapshotArrayInput is an input type that accepts VolumeSnapshotArray and VolumeSnapshotArrayOutput values.
// You can construct a concrete instance of `VolumeSnapshotArrayInput` via:
//
//	VolumeSnapshotArray{ VolumeSnapshotArgs{...} }
type VolumeSnapshotArrayInput interface {
	pulumi.Input

	ToVolumeSnapshotArrayOutput() VolumeSnapshotArrayOutput
	ToVolumeSnapshotArrayOutputWithContext(context.Context) VolumeSnapshotArrayOutput
}

type VolumeSnapshotArray []VolumeSnapshotInput

func (VolumeSnapshotArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*VolumeSnapshot)(nil)).Elem()
}

func (i VolumeSnapshotArray) ToVolumeSnapshotArrayOutput() VolumeSnapshotArrayOutput {
	return i.ToVolumeSnapshotArrayOutputWithContext(context.Background())
}

func (i VolumeSnapshotArray) ToVolumeSnapshotArrayOutputWithContext(ctx context.Context) VolumeSnapshotArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VolumeSnapshotArrayOutput)
}

// VolumeSnapshotMapInput is an input type that accepts VolumeSnapshotMap and VolumeSnapshotMapOutput values.
// You can construct a concrete instance of `VolumeSnapshotMapInput` via:
//
//	VolumeSnapshotMap{ "key": VolumeSnapshotArgs{...} }
type VolumeSnapshotMapInput interface {
	pulumi.Input

	ToVolumeSnapshotMapOutput() VolumeSnapshotMapOutput
	ToVolumeSnapshotMapOutputWithContext(context.Context) VolumeSnapshotMapOutput
}

type VolumeSnapshotMap map[string]VolumeSnapshotInput

func (VolumeSnapshotMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*VolumeSnapshot)(nil)).Elem()
}

func (i VolumeSnapshotMap) ToVolumeSnapshotMapOutput() VolumeSnapshotMapOutput {
	return i.ToVolumeSnapshotMapOutputWithContext(context.Background())
}

func (i VolumeSnapshotMap) ToVolumeSnapshotMapOutputWithContext(ctx context.Context) VolumeSnapshotMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VolumeSnapshotMapOutput)
}

type VolumeSnapshotOutput struct{ *pulumi.OutputState }

func (VolumeSnapshotOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**VolumeSnapshot)(nil)).Elem()
}

func (o VolumeSnapshotOutput) ToVolumeSnapshotOutput() VolumeSnapshotOutput {
	return o
}

func (o VolumeSnapshotOutput) ToVolumeSnapshotOutputWithContext(ctx context.Context) VolumeSnapshotOutput {
	return o
}

// Description for the snapshot.
func (o VolumeSnapshotOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *VolumeSnapshot) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
func (o VolumeSnapshotOutput) EffectiveLabels() pulumi.StringMapOutput {
	return o.ApplyT(func(v *VolumeSnapshot) pulumi.StringMapOutput { return v.EffectiveLabels }).(pulumi.StringMapOutput)
}

// Labels as key value pairs. Example: `{ "owner": "Bob", "department": "finance", "purpose": "testing" }`.
//
// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
func (o VolumeSnapshotOutput) Labels() pulumi.StringMapOutput {
	return o.ApplyT(func(v *VolumeSnapshot) pulumi.StringMapOutput { return v.Labels }).(pulumi.StringMapOutput)
}

// Name of the snapshot location. Snapshots are child resources of volumes and live in the same location.
func (o VolumeSnapshotOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *VolumeSnapshot) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// The name of the snapshot.
func (o VolumeSnapshotOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *VolumeSnapshot) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The ID of the project in which the resource belongs.
// If it is not provided, the provider project is used.
func (o VolumeSnapshotOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *VolumeSnapshot) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// The combination of labels configured directly on the resource
// and default labels configured on the provider.
func (o VolumeSnapshotOutput) PulumiLabels() pulumi.StringMapOutput {
	return o.ApplyT(func(v *VolumeSnapshot) pulumi.StringMapOutput { return v.PulumiLabels }).(pulumi.StringMapOutput)
}

// Storage used to store blocks unique to this snapshot.
func (o VolumeSnapshotOutput) UsedBytes() pulumi.IntOutput {
	return o.ApplyT(func(v *VolumeSnapshot) pulumi.IntOutput { return v.UsedBytes }).(pulumi.IntOutput)
}

// The name of the volume to create the snapshot in.
func (o VolumeSnapshotOutput) VolumeName() pulumi.StringOutput {
	return o.ApplyT(func(v *VolumeSnapshot) pulumi.StringOutput { return v.VolumeName }).(pulumi.StringOutput)
}

type VolumeSnapshotArrayOutput struct{ *pulumi.OutputState }

func (VolumeSnapshotArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*VolumeSnapshot)(nil)).Elem()
}

func (o VolumeSnapshotArrayOutput) ToVolumeSnapshotArrayOutput() VolumeSnapshotArrayOutput {
	return o
}

func (o VolumeSnapshotArrayOutput) ToVolumeSnapshotArrayOutputWithContext(ctx context.Context) VolumeSnapshotArrayOutput {
	return o
}

func (o VolumeSnapshotArrayOutput) Index(i pulumi.IntInput) VolumeSnapshotOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *VolumeSnapshot {
		return vs[0].([]*VolumeSnapshot)[vs[1].(int)]
	}).(VolumeSnapshotOutput)
}

type VolumeSnapshotMapOutput struct{ *pulumi.OutputState }

func (VolumeSnapshotMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*VolumeSnapshot)(nil)).Elem()
}

func (o VolumeSnapshotMapOutput) ToVolumeSnapshotMapOutput() VolumeSnapshotMapOutput {
	return o
}

func (o VolumeSnapshotMapOutput) ToVolumeSnapshotMapOutputWithContext(ctx context.Context) VolumeSnapshotMapOutput {
	return o
}

func (o VolumeSnapshotMapOutput) MapIndex(k pulumi.StringInput) VolumeSnapshotOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *VolumeSnapshot {
		return vs[0].(map[string]*VolumeSnapshot)[vs[1].(string)]
	}).(VolumeSnapshotOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*VolumeSnapshotInput)(nil)).Elem(), &VolumeSnapshot{})
	pulumi.RegisterInputType(reflect.TypeOf((*VolumeSnapshotArrayInput)(nil)).Elem(), VolumeSnapshotArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*VolumeSnapshotMapInput)(nil)).Elem(), VolumeSnapshotMap{})
	pulumi.RegisterOutputType(VolumeSnapshotOutput{})
	pulumi.RegisterOutputType(VolumeSnapshotArrayOutput{})
	pulumi.RegisterOutputType(VolumeSnapshotMapOutput{})
}
