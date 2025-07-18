// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package filestore

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// A Google Cloud Filestore backup.
//
// To get more information about Backup, see:
//
// * [API documentation](https://cloud.google.com/filestore/docs/reference/rest/v1/projects.locations.instances.backups)
// * How-to Guides
//   - [Creating Backups](https://cloud.google.com/filestore/docs/create-backups)
//   - [Official Documentation](https://cloud.google.com/filestore/docs/backups)
//
// ## Example Usage
//
// ### Filestore Backup Basic
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/filestore"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			instance, err := filestore.NewInstance(ctx, "instance", &filestore.InstanceArgs{
//				Name:     pulumi.String("fs-inst"),
//				Location: pulumi.String("us-central1-b"),
//				Tier:     pulumi.String("BASIC_HDD"),
//				FileShares: &filestore.InstanceFileSharesArgs{
//					CapacityGb: pulumi.Int(1024),
//					Name:       pulumi.String("share1"),
//				},
//				Networks: filestore.InstanceNetworkArray{
//					&filestore.InstanceNetworkArgs{
//						Network: pulumi.String("default"),
//						Modes: pulumi.StringArray{
//							pulumi.String("MODE_IPV4"),
//						},
//						ConnectMode: pulumi.String("DIRECT_PEERING"),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = filestore.NewBackup(ctx, "backup", &filestore.BackupArgs{
//				Name:            pulumi.String("fs-bkup"),
//				Location:        pulumi.String("us-central1"),
//				Description:     pulumi.String("This is a filestore backup for the test instance"),
//				SourceInstance:  instance.ID(),
//				SourceFileShare: pulumi.String("share1"),
//				Labels: pulumi.StringMap{
//					"files":       pulumi.String("label1"),
//					"other-label": pulumi.String("label2"),
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
// Backup can be imported using any of these accepted formats:
//
// * `projects/{{project}}/locations/{{location}}/backups/{{name}}`
//
// * `{{project}}/{{location}}/{{name}}`
//
// * `{{location}}/{{name}}`
//
// When using the `pulumi import` command, Backup can be imported using one of the formats above. For example:
//
// ```sh
// $ pulumi import gcp:filestore/backup:Backup default projects/{{project}}/locations/{{location}}/backups/{{name}}
// ```
//
// ```sh
// $ pulumi import gcp:filestore/backup:Backup default {{project}}/{{location}}/{{name}}
// ```
//
// ```sh
// $ pulumi import gcp:filestore/backup:Backup default {{location}}/{{name}}
// ```
type Backup struct {
	pulumi.CustomResourceState

	// The amount of bytes needed to allocate a full copy of the snapshot content.
	CapacityGb pulumi.StringOutput `pulumi:"capacityGb"`
	// The time when the snapshot was created in RFC3339 text format.
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// A description of the backup with 2048 characters or less. Requests with longer descriptions will be rejected.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Amount of bytes that will be downloaded if the backup is restored.
	DownloadBytes pulumi.StringOutput `pulumi:"downloadBytes"`
	// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
	EffectiveLabels pulumi.StringMapOutput `pulumi:"effectiveLabels"`
	// KMS key name used for data encryption.
	KmsKeyName pulumi.StringOutput `pulumi:"kmsKeyName"`
	// Resource labels to represent user-provided metadata.
	//
	// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
	// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
	Labels pulumi.StringMapOutput `pulumi:"labels"`
	// The name of the location of the instance. This can be a region for ENTERPRISE tier instances.
	Location pulumi.StringOutput `pulumi:"location"`
	// The resource name of the backup. The name must be unique within the specified instance.
	// The name must be 1-63 characters long, and comply with
	// RFC1035. Specifically, the name must be 1-63 characters long and match
	// the regular expression `a-z?` which means the
	// first character must be a lowercase letter, and all following
	// characters must be a dash, lowercase letter, or digit, except the last
	// character, which cannot be a dash.
	Name pulumi.StringOutput `pulumi:"name"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringOutput `pulumi:"project"`
	// The combination of labels configured directly on the resource
	// and default labels configured on the provider.
	PulumiLabels pulumi.StringMapOutput `pulumi:"pulumiLabels"`
	// Name of the file share in the source Cloud Filestore instance that the backup is created from.
	SourceFileShare pulumi.StringOutput `pulumi:"sourceFileShare"`
	// The resource name of the source Cloud Filestore instance, in the format projects/{projectId}/locations/{locationId}/instances/{instanceId}, used to create this backup.
	SourceInstance pulumi.StringOutput `pulumi:"sourceInstance"`
	// The service tier of the source Cloud Filestore instance that this backup is created from.
	SourceInstanceTier pulumi.StringOutput `pulumi:"sourceInstanceTier"`
	// The backup state.
	State pulumi.StringOutput `pulumi:"state"`
	// The size of the storage used by the backup. As backups share storage, this number is expected to change with backup creation/deletion.
	StorageBytes pulumi.StringOutput `pulumi:"storageBytes"`
	// A map of resource manager tags.
	// Resource manager tag keys and values have the same definition as resource manager tags.
	// Keys must be in the format tagKeys/{tag_key_id}, and values are in the format tagValues/{tag_value_id}.
	// The field is ignored (both PUT & PATCH) when empty.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
}

// NewBackup registers a new resource with the given unique name, arguments, and options.
func NewBackup(ctx *pulumi.Context,
	name string, args *BackupArgs, opts ...pulumi.ResourceOption) (*Backup, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Location == nil {
		return nil, errors.New("invalid value for required argument 'Location'")
	}
	if args.SourceFileShare == nil {
		return nil, errors.New("invalid value for required argument 'SourceFileShare'")
	}
	if args.SourceInstance == nil {
		return nil, errors.New("invalid value for required argument 'SourceInstance'")
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"effectiveLabels",
		"pulumiLabels",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Backup
	err := ctx.RegisterResource("gcp:filestore/backup:Backup", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetBackup gets an existing Backup resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetBackup(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *BackupState, opts ...pulumi.ResourceOption) (*Backup, error) {
	var resource Backup
	err := ctx.ReadResource("gcp:filestore/backup:Backup", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Backup resources.
type backupState struct {
	// The amount of bytes needed to allocate a full copy of the snapshot content.
	CapacityGb *string `pulumi:"capacityGb"`
	// The time when the snapshot was created in RFC3339 text format.
	CreateTime *string `pulumi:"createTime"`
	// A description of the backup with 2048 characters or less. Requests with longer descriptions will be rejected.
	Description *string `pulumi:"description"`
	// Amount of bytes that will be downloaded if the backup is restored.
	DownloadBytes *string `pulumi:"downloadBytes"`
	// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
	EffectiveLabels map[string]string `pulumi:"effectiveLabels"`
	// KMS key name used for data encryption.
	KmsKeyName *string `pulumi:"kmsKeyName"`
	// Resource labels to represent user-provided metadata.
	//
	// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
	// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
	Labels map[string]string `pulumi:"labels"`
	// The name of the location of the instance. This can be a region for ENTERPRISE tier instances.
	Location *string `pulumi:"location"`
	// The resource name of the backup. The name must be unique within the specified instance.
	// The name must be 1-63 characters long, and comply with
	// RFC1035. Specifically, the name must be 1-63 characters long and match
	// the regular expression `a-z?` which means the
	// first character must be a lowercase letter, and all following
	// characters must be a dash, lowercase letter, or digit, except the last
	// character, which cannot be a dash.
	Name *string `pulumi:"name"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
	// The combination of labels configured directly on the resource
	// and default labels configured on the provider.
	PulumiLabels map[string]string `pulumi:"pulumiLabels"`
	// Name of the file share in the source Cloud Filestore instance that the backup is created from.
	SourceFileShare *string `pulumi:"sourceFileShare"`
	// The resource name of the source Cloud Filestore instance, in the format projects/{projectId}/locations/{locationId}/instances/{instanceId}, used to create this backup.
	SourceInstance *string `pulumi:"sourceInstance"`
	// The service tier of the source Cloud Filestore instance that this backup is created from.
	SourceInstanceTier *string `pulumi:"sourceInstanceTier"`
	// The backup state.
	State *string `pulumi:"state"`
	// The size of the storage used by the backup. As backups share storage, this number is expected to change with backup creation/deletion.
	StorageBytes *string `pulumi:"storageBytes"`
	// A map of resource manager tags.
	// Resource manager tag keys and values have the same definition as resource manager tags.
	// Keys must be in the format tagKeys/{tag_key_id}, and values are in the format tagValues/{tag_value_id}.
	// The field is ignored (both PUT & PATCH) when empty.
	Tags map[string]string `pulumi:"tags"`
}

type BackupState struct {
	// The amount of bytes needed to allocate a full copy of the snapshot content.
	CapacityGb pulumi.StringPtrInput
	// The time when the snapshot was created in RFC3339 text format.
	CreateTime pulumi.StringPtrInput
	// A description of the backup with 2048 characters or less. Requests with longer descriptions will be rejected.
	Description pulumi.StringPtrInput
	// Amount of bytes that will be downloaded if the backup is restored.
	DownloadBytes pulumi.StringPtrInput
	// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
	EffectiveLabels pulumi.StringMapInput
	// KMS key name used for data encryption.
	KmsKeyName pulumi.StringPtrInput
	// Resource labels to represent user-provided metadata.
	//
	// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
	// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
	Labels pulumi.StringMapInput
	// The name of the location of the instance. This can be a region for ENTERPRISE tier instances.
	Location pulumi.StringPtrInput
	// The resource name of the backup. The name must be unique within the specified instance.
	// The name must be 1-63 characters long, and comply with
	// RFC1035. Specifically, the name must be 1-63 characters long and match
	// the regular expression `a-z?` which means the
	// first character must be a lowercase letter, and all following
	// characters must be a dash, lowercase letter, or digit, except the last
	// character, which cannot be a dash.
	Name pulumi.StringPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
	// The combination of labels configured directly on the resource
	// and default labels configured on the provider.
	PulumiLabels pulumi.StringMapInput
	// Name of the file share in the source Cloud Filestore instance that the backup is created from.
	SourceFileShare pulumi.StringPtrInput
	// The resource name of the source Cloud Filestore instance, in the format projects/{projectId}/locations/{locationId}/instances/{instanceId}, used to create this backup.
	SourceInstance pulumi.StringPtrInput
	// The service tier of the source Cloud Filestore instance that this backup is created from.
	SourceInstanceTier pulumi.StringPtrInput
	// The backup state.
	State pulumi.StringPtrInput
	// The size of the storage used by the backup. As backups share storage, this number is expected to change with backup creation/deletion.
	StorageBytes pulumi.StringPtrInput
	// A map of resource manager tags.
	// Resource manager tag keys and values have the same definition as resource manager tags.
	// Keys must be in the format tagKeys/{tag_key_id}, and values are in the format tagValues/{tag_value_id}.
	// The field is ignored (both PUT & PATCH) when empty.
	Tags pulumi.StringMapInput
}

func (BackupState) ElementType() reflect.Type {
	return reflect.TypeOf((*backupState)(nil)).Elem()
}

type backupArgs struct {
	// A description of the backup with 2048 characters or less. Requests with longer descriptions will be rejected.
	Description *string `pulumi:"description"`
	// Resource labels to represent user-provided metadata.
	//
	// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
	// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
	Labels map[string]string `pulumi:"labels"`
	// The name of the location of the instance. This can be a region for ENTERPRISE tier instances.
	Location string `pulumi:"location"`
	// The resource name of the backup. The name must be unique within the specified instance.
	// The name must be 1-63 characters long, and comply with
	// RFC1035. Specifically, the name must be 1-63 characters long and match
	// the regular expression `a-z?` which means the
	// first character must be a lowercase letter, and all following
	// characters must be a dash, lowercase letter, or digit, except the last
	// character, which cannot be a dash.
	Name *string `pulumi:"name"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
	// Name of the file share in the source Cloud Filestore instance that the backup is created from.
	SourceFileShare string `pulumi:"sourceFileShare"`
	// The resource name of the source Cloud Filestore instance, in the format projects/{projectId}/locations/{locationId}/instances/{instanceId}, used to create this backup.
	SourceInstance string `pulumi:"sourceInstance"`
	// A map of resource manager tags.
	// Resource manager tag keys and values have the same definition as resource manager tags.
	// Keys must be in the format tagKeys/{tag_key_id}, and values are in the format tagValues/{tag_value_id}.
	// The field is ignored (both PUT & PATCH) when empty.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a Backup resource.
type BackupArgs struct {
	// A description of the backup with 2048 characters or less. Requests with longer descriptions will be rejected.
	Description pulumi.StringPtrInput
	// Resource labels to represent user-provided metadata.
	//
	// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
	// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
	Labels pulumi.StringMapInput
	// The name of the location of the instance. This can be a region for ENTERPRISE tier instances.
	Location pulumi.StringInput
	// The resource name of the backup. The name must be unique within the specified instance.
	// The name must be 1-63 characters long, and comply with
	// RFC1035. Specifically, the name must be 1-63 characters long and match
	// the regular expression `a-z?` which means the
	// first character must be a lowercase letter, and all following
	// characters must be a dash, lowercase letter, or digit, except the last
	// character, which cannot be a dash.
	Name pulumi.StringPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
	// Name of the file share in the source Cloud Filestore instance that the backup is created from.
	SourceFileShare pulumi.StringInput
	// The resource name of the source Cloud Filestore instance, in the format projects/{projectId}/locations/{locationId}/instances/{instanceId}, used to create this backup.
	SourceInstance pulumi.StringInput
	// A map of resource manager tags.
	// Resource manager tag keys and values have the same definition as resource manager tags.
	// Keys must be in the format tagKeys/{tag_key_id}, and values are in the format tagValues/{tag_value_id}.
	// The field is ignored (both PUT & PATCH) when empty.
	Tags pulumi.StringMapInput
}

func (BackupArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*backupArgs)(nil)).Elem()
}

type BackupInput interface {
	pulumi.Input

	ToBackupOutput() BackupOutput
	ToBackupOutputWithContext(ctx context.Context) BackupOutput
}

func (*Backup) ElementType() reflect.Type {
	return reflect.TypeOf((**Backup)(nil)).Elem()
}

func (i *Backup) ToBackupOutput() BackupOutput {
	return i.ToBackupOutputWithContext(context.Background())
}

func (i *Backup) ToBackupOutputWithContext(ctx context.Context) BackupOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BackupOutput)
}

// BackupArrayInput is an input type that accepts BackupArray and BackupArrayOutput values.
// You can construct a concrete instance of `BackupArrayInput` via:
//
//	BackupArray{ BackupArgs{...} }
type BackupArrayInput interface {
	pulumi.Input

	ToBackupArrayOutput() BackupArrayOutput
	ToBackupArrayOutputWithContext(context.Context) BackupArrayOutput
}

type BackupArray []BackupInput

func (BackupArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Backup)(nil)).Elem()
}

func (i BackupArray) ToBackupArrayOutput() BackupArrayOutput {
	return i.ToBackupArrayOutputWithContext(context.Background())
}

func (i BackupArray) ToBackupArrayOutputWithContext(ctx context.Context) BackupArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BackupArrayOutput)
}

// BackupMapInput is an input type that accepts BackupMap and BackupMapOutput values.
// You can construct a concrete instance of `BackupMapInput` via:
//
//	BackupMap{ "key": BackupArgs{...} }
type BackupMapInput interface {
	pulumi.Input

	ToBackupMapOutput() BackupMapOutput
	ToBackupMapOutputWithContext(context.Context) BackupMapOutput
}

type BackupMap map[string]BackupInput

func (BackupMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Backup)(nil)).Elem()
}

func (i BackupMap) ToBackupMapOutput() BackupMapOutput {
	return i.ToBackupMapOutputWithContext(context.Background())
}

func (i BackupMap) ToBackupMapOutputWithContext(ctx context.Context) BackupMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BackupMapOutput)
}

type BackupOutput struct{ *pulumi.OutputState }

func (BackupOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Backup)(nil)).Elem()
}

func (o BackupOutput) ToBackupOutput() BackupOutput {
	return o
}

func (o BackupOutput) ToBackupOutputWithContext(ctx context.Context) BackupOutput {
	return o
}

// The amount of bytes needed to allocate a full copy of the snapshot content.
func (o BackupOutput) CapacityGb() pulumi.StringOutput {
	return o.ApplyT(func(v *Backup) pulumi.StringOutput { return v.CapacityGb }).(pulumi.StringOutput)
}

// The time when the snapshot was created in RFC3339 text format.
func (o BackupOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *Backup) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// A description of the backup with 2048 characters or less. Requests with longer descriptions will be rejected.
func (o BackupOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Backup) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Amount of bytes that will be downloaded if the backup is restored.
func (o BackupOutput) DownloadBytes() pulumi.StringOutput {
	return o.ApplyT(func(v *Backup) pulumi.StringOutput { return v.DownloadBytes }).(pulumi.StringOutput)
}

// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
func (o BackupOutput) EffectiveLabels() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Backup) pulumi.StringMapOutput { return v.EffectiveLabels }).(pulumi.StringMapOutput)
}

// KMS key name used for data encryption.
func (o BackupOutput) KmsKeyName() pulumi.StringOutput {
	return o.ApplyT(func(v *Backup) pulumi.StringOutput { return v.KmsKeyName }).(pulumi.StringOutput)
}

// Resource labels to represent user-provided metadata.
//
// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
func (o BackupOutput) Labels() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Backup) pulumi.StringMapOutput { return v.Labels }).(pulumi.StringMapOutput)
}

// The name of the location of the instance. This can be a region for ENTERPRISE tier instances.
func (o BackupOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *Backup) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// The resource name of the backup. The name must be unique within the specified instance.
// The name must be 1-63 characters long, and comply with
// RFC1035. Specifically, the name must be 1-63 characters long and match
// the regular expression `a-z?` which means the
// first character must be a lowercase letter, and all following
// characters must be a dash, lowercase letter, or digit, except the last
// character, which cannot be a dash.
func (o BackupOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Backup) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The ID of the project in which the resource belongs.
// If it is not provided, the provider project is used.
func (o BackupOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *Backup) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// The combination of labels configured directly on the resource
// and default labels configured on the provider.
func (o BackupOutput) PulumiLabels() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Backup) pulumi.StringMapOutput { return v.PulumiLabels }).(pulumi.StringMapOutput)
}

// Name of the file share in the source Cloud Filestore instance that the backup is created from.
func (o BackupOutput) SourceFileShare() pulumi.StringOutput {
	return o.ApplyT(func(v *Backup) pulumi.StringOutput { return v.SourceFileShare }).(pulumi.StringOutput)
}

// The resource name of the source Cloud Filestore instance, in the format projects/{projectId}/locations/{locationId}/instances/{instanceId}, used to create this backup.
func (o BackupOutput) SourceInstance() pulumi.StringOutput {
	return o.ApplyT(func(v *Backup) pulumi.StringOutput { return v.SourceInstance }).(pulumi.StringOutput)
}

// The service tier of the source Cloud Filestore instance that this backup is created from.
func (o BackupOutput) SourceInstanceTier() pulumi.StringOutput {
	return o.ApplyT(func(v *Backup) pulumi.StringOutput { return v.SourceInstanceTier }).(pulumi.StringOutput)
}

// The backup state.
func (o BackupOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v *Backup) pulumi.StringOutput { return v.State }).(pulumi.StringOutput)
}

// The size of the storage used by the backup. As backups share storage, this number is expected to change with backup creation/deletion.
func (o BackupOutput) StorageBytes() pulumi.StringOutput {
	return o.ApplyT(func(v *Backup) pulumi.StringOutput { return v.StorageBytes }).(pulumi.StringOutput)
}

// A map of resource manager tags.
// Resource manager tag keys and values have the same definition as resource manager tags.
// Keys must be in the format tagKeys/{tag_key_id}, and values are in the format tagValues/{tag_value_id}.
// The field is ignored (both PUT & PATCH) when empty.
func (o BackupOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Backup) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

type BackupArrayOutput struct{ *pulumi.OutputState }

func (BackupArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Backup)(nil)).Elem()
}

func (o BackupArrayOutput) ToBackupArrayOutput() BackupArrayOutput {
	return o
}

func (o BackupArrayOutput) ToBackupArrayOutputWithContext(ctx context.Context) BackupArrayOutput {
	return o
}

func (o BackupArrayOutput) Index(i pulumi.IntInput) BackupOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Backup {
		return vs[0].([]*Backup)[vs[1].(int)]
	}).(BackupOutput)
}

type BackupMapOutput struct{ *pulumi.OutputState }

func (BackupMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Backup)(nil)).Elem()
}

func (o BackupMapOutput) ToBackupMapOutput() BackupMapOutput {
	return o
}

func (o BackupMapOutput) ToBackupMapOutputWithContext(ctx context.Context) BackupMapOutput {
	return o
}

func (o BackupMapOutput) MapIndex(k pulumi.StringInput) BackupOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Backup {
		return vs[0].(map[string]*Backup)[vs[1].(string)]
	}).(BackupOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*BackupInput)(nil)).Elem(), &Backup{})
	pulumi.RegisterInputType(reflect.TypeOf((*BackupArrayInput)(nil)).Elem(), BackupArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*BackupMapInput)(nil)).Elem(), BackupMap{})
	pulumi.RegisterOutputType(BackupOutput{})
	pulumi.RegisterOutputType(BackupArrayOutput{})
	pulumi.RegisterOutputType(BackupMapOutput{})
}
