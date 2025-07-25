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

// Mute Findings is a volume management feature in Security Command Center
// that lets you manually or programmatically hide irrelevant findings,
// and create filters to automatically silence existing and future
// findings based on criteria you specify.
//
// To get more information about FolderMuteConfig, see:
//
// * [API documentation](https://cloud.google.com/security-command-center/docs/reference/rest/v2/folders.muteConfigs)
//
// ## Example Usage
//
// ### Scc V2 Folder Mute Config Basic
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/organizations"
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/securitycenter"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			folder, err := organizations.NewFolder(ctx, "folder", &organizations.FolderArgs{
//				Parent:      pulumi.String("organizations/123456789"),
//				DisplayName: pulumi.String("folder-name"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = securitycenter.NewV2FolderMuteConfig(ctx, "default", &securitycenter.V2FolderMuteConfigArgs{
//				MuteConfigId: pulumi.String("my-config"),
//				Folder:       folder.FolderId,
//				Location:     pulumi.String("global"),
//				Description:  pulumi.String("My custom Cloud Security Command Center Finding Folder mute Configuration"),
//				Filter:       pulumi.String("severity = \"HIGH\""),
//				Type:         pulumi.String("STATIC"),
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
// FolderMuteConfig can be imported using any of these accepted formats:
//
// * `folders/{{folder}}/locations/{{location}}/muteConfigs/{{mute_config_id}}`
//
// * `{{folder}}/{{location}}/{{mute_config_id}}`
//
// When using the `pulumi import` command, FolderMuteConfig can be imported using one of the formats above. For example:
//
// ```sh
// $ pulumi import gcp:securitycenter/v2FolderMuteConfig:V2FolderMuteConfig default folders/{{folder}}/locations/{{location}}/muteConfigs/{{mute_config_id}}
// ```
//
// ```sh
// $ pulumi import gcp:securitycenter/v2FolderMuteConfig:V2FolderMuteConfig default {{folder}}/{{location}}/{{mute_config_id}}
// ```
type V2FolderMuteConfig struct {
	pulumi.CustomResourceState

	// The time at which the mute config was created. This field is set by
	// the server and will be ignored if provided on config creation.
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// A description of the mute config.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// An expression that defines the filter to apply across create/update
	// events of findings. While creating a filter string, be mindful of
	// the scope in which the mute configuration is being created. E.g.,
	// If a filter contains project = X but is created under the
	// project = Y scope, it might not match any findings.
	Filter pulumi.StringOutput `pulumi:"filter"`
	// The folder whose Cloud Security Command Center the Mute
	// Config lives in.
	Folder pulumi.StringOutput `pulumi:"folder"`
	// location Id is provided by folder. If not provided, Use global as default.
	Location pulumi.StringPtrOutput `pulumi:"location"`
	// Email address of the user who last edited the mute config. This
	// field is set by the server and will be ignored if provided on
	// config creation or update.
	MostRecentEditor pulumi.StringOutput `pulumi:"mostRecentEditor"`
	// Unique identifier provided by the client within the parent scope.
	MuteConfigId pulumi.StringOutput `pulumi:"muteConfigId"`
	// Name of the mute config. Its format is
	// organizations/{organization}/locations/global/muteConfigs/{configId},
	// folders/{folder}/locations/global/muteConfigs/{configId},
	// or projects/{project}/locations/global/muteConfigs/{configId}
	Name pulumi.StringOutput `pulumi:"name"`
	// The type of the mute config.
	Type pulumi.StringOutput `pulumi:"type"`
	// Output only. The most recent time at which the mute config was
	// updated. This field is set by the server and will be ignored if
	// provided on config creation or update.
	UpdateTime pulumi.StringOutput `pulumi:"updateTime"`
}

// NewV2FolderMuteConfig registers a new resource with the given unique name, arguments, and options.
func NewV2FolderMuteConfig(ctx *pulumi.Context,
	name string, args *V2FolderMuteConfigArgs, opts ...pulumi.ResourceOption) (*V2FolderMuteConfig, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Filter == nil {
		return nil, errors.New("invalid value for required argument 'Filter'")
	}
	if args.Folder == nil {
		return nil, errors.New("invalid value for required argument 'Folder'")
	}
	if args.MuteConfigId == nil {
		return nil, errors.New("invalid value for required argument 'MuteConfigId'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource V2FolderMuteConfig
	err := ctx.RegisterResource("gcp:securitycenter/v2FolderMuteConfig:V2FolderMuteConfig", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetV2FolderMuteConfig gets an existing V2FolderMuteConfig resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetV2FolderMuteConfig(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *V2FolderMuteConfigState, opts ...pulumi.ResourceOption) (*V2FolderMuteConfig, error) {
	var resource V2FolderMuteConfig
	err := ctx.ReadResource("gcp:securitycenter/v2FolderMuteConfig:V2FolderMuteConfig", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering V2FolderMuteConfig resources.
type v2folderMuteConfigState struct {
	// The time at which the mute config was created. This field is set by
	// the server and will be ignored if provided on config creation.
	CreateTime *string `pulumi:"createTime"`
	// A description of the mute config.
	Description *string `pulumi:"description"`
	// An expression that defines the filter to apply across create/update
	// events of findings. While creating a filter string, be mindful of
	// the scope in which the mute configuration is being created. E.g.,
	// If a filter contains project = X but is created under the
	// project = Y scope, it might not match any findings.
	Filter *string `pulumi:"filter"`
	// The folder whose Cloud Security Command Center the Mute
	// Config lives in.
	Folder *string `pulumi:"folder"`
	// location Id is provided by folder. If not provided, Use global as default.
	Location *string `pulumi:"location"`
	// Email address of the user who last edited the mute config. This
	// field is set by the server and will be ignored if provided on
	// config creation or update.
	MostRecentEditor *string `pulumi:"mostRecentEditor"`
	// Unique identifier provided by the client within the parent scope.
	MuteConfigId *string `pulumi:"muteConfigId"`
	// Name of the mute config. Its format is
	// organizations/{organization}/locations/global/muteConfigs/{configId},
	// folders/{folder}/locations/global/muteConfigs/{configId},
	// or projects/{project}/locations/global/muteConfigs/{configId}
	Name *string `pulumi:"name"`
	// The type of the mute config.
	Type *string `pulumi:"type"`
	// Output only. The most recent time at which the mute config was
	// updated. This field is set by the server and will be ignored if
	// provided on config creation or update.
	UpdateTime *string `pulumi:"updateTime"`
}

type V2FolderMuteConfigState struct {
	// The time at which the mute config was created. This field is set by
	// the server and will be ignored if provided on config creation.
	CreateTime pulumi.StringPtrInput
	// A description of the mute config.
	Description pulumi.StringPtrInput
	// An expression that defines the filter to apply across create/update
	// events of findings. While creating a filter string, be mindful of
	// the scope in which the mute configuration is being created. E.g.,
	// If a filter contains project = X but is created under the
	// project = Y scope, it might not match any findings.
	Filter pulumi.StringPtrInput
	// The folder whose Cloud Security Command Center the Mute
	// Config lives in.
	Folder pulumi.StringPtrInput
	// location Id is provided by folder. If not provided, Use global as default.
	Location pulumi.StringPtrInput
	// Email address of the user who last edited the mute config. This
	// field is set by the server and will be ignored if provided on
	// config creation or update.
	MostRecentEditor pulumi.StringPtrInput
	// Unique identifier provided by the client within the parent scope.
	MuteConfigId pulumi.StringPtrInput
	// Name of the mute config. Its format is
	// organizations/{organization}/locations/global/muteConfigs/{configId},
	// folders/{folder}/locations/global/muteConfigs/{configId},
	// or projects/{project}/locations/global/muteConfigs/{configId}
	Name pulumi.StringPtrInput
	// The type of the mute config.
	Type pulumi.StringPtrInput
	// Output only. The most recent time at which the mute config was
	// updated. This field is set by the server and will be ignored if
	// provided on config creation or update.
	UpdateTime pulumi.StringPtrInput
}

func (V2FolderMuteConfigState) ElementType() reflect.Type {
	return reflect.TypeOf((*v2folderMuteConfigState)(nil)).Elem()
}

type v2folderMuteConfigArgs struct {
	// A description of the mute config.
	Description *string `pulumi:"description"`
	// An expression that defines the filter to apply across create/update
	// events of findings. While creating a filter string, be mindful of
	// the scope in which the mute configuration is being created. E.g.,
	// If a filter contains project = X but is created under the
	// project = Y scope, it might not match any findings.
	Filter string `pulumi:"filter"`
	// The folder whose Cloud Security Command Center the Mute
	// Config lives in.
	Folder string `pulumi:"folder"`
	// location Id is provided by folder. If not provided, Use global as default.
	Location *string `pulumi:"location"`
	// Unique identifier provided by the client within the parent scope.
	MuteConfigId string `pulumi:"muteConfigId"`
	// The type of the mute config.
	Type string `pulumi:"type"`
}

// The set of arguments for constructing a V2FolderMuteConfig resource.
type V2FolderMuteConfigArgs struct {
	// A description of the mute config.
	Description pulumi.StringPtrInput
	// An expression that defines the filter to apply across create/update
	// events of findings. While creating a filter string, be mindful of
	// the scope in which the mute configuration is being created. E.g.,
	// If a filter contains project = X but is created under the
	// project = Y scope, it might not match any findings.
	Filter pulumi.StringInput
	// The folder whose Cloud Security Command Center the Mute
	// Config lives in.
	Folder pulumi.StringInput
	// location Id is provided by folder. If not provided, Use global as default.
	Location pulumi.StringPtrInput
	// Unique identifier provided by the client within the parent scope.
	MuteConfigId pulumi.StringInput
	// The type of the mute config.
	Type pulumi.StringInput
}

func (V2FolderMuteConfigArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*v2folderMuteConfigArgs)(nil)).Elem()
}

type V2FolderMuteConfigInput interface {
	pulumi.Input

	ToV2FolderMuteConfigOutput() V2FolderMuteConfigOutput
	ToV2FolderMuteConfigOutputWithContext(ctx context.Context) V2FolderMuteConfigOutput
}

func (*V2FolderMuteConfig) ElementType() reflect.Type {
	return reflect.TypeOf((**V2FolderMuteConfig)(nil)).Elem()
}

func (i *V2FolderMuteConfig) ToV2FolderMuteConfigOutput() V2FolderMuteConfigOutput {
	return i.ToV2FolderMuteConfigOutputWithContext(context.Background())
}

func (i *V2FolderMuteConfig) ToV2FolderMuteConfigOutputWithContext(ctx context.Context) V2FolderMuteConfigOutput {
	return pulumi.ToOutputWithContext(ctx, i).(V2FolderMuteConfigOutput)
}

// V2FolderMuteConfigArrayInput is an input type that accepts V2FolderMuteConfigArray and V2FolderMuteConfigArrayOutput values.
// You can construct a concrete instance of `V2FolderMuteConfigArrayInput` via:
//
//	V2FolderMuteConfigArray{ V2FolderMuteConfigArgs{...} }
type V2FolderMuteConfigArrayInput interface {
	pulumi.Input

	ToV2FolderMuteConfigArrayOutput() V2FolderMuteConfigArrayOutput
	ToV2FolderMuteConfigArrayOutputWithContext(context.Context) V2FolderMuteConfigArrayOutput
}

type V2FolderMuteConfigArray []V2FolderMuteConfigInput

func (V2FolderMuteConfigArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*V2FolderMuteConfig)(nil)).Elem()
}

func (i V2FolderMuteConfigArray) ToV2FolderMuteConfigArrayOutput() V2FolderMuteConfigArrayOutput {
	return i.ToV2FolderMuteConfigArrayOutputWithContext(context.Background())
}

func (i V2FolderMuteConfigArray) ToV2FolderMuteConfigArrayOutputWithContext(ctx context.Context) V2FolderMuteConfigArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(V2FolderMuteConfigArrayOutput)
}

// V2FolderMuteConfigMapInput is an input type that accepts V2FolderMuteConfigMap and V2FolderMuteConfigMapOutput values.
// You can construct a concrete instance of `V2FolderMuteConfigMapInput` via:
//
//	V2FolderMuteConfigMap{ "key": V2FolderMuteConfigArgs{...} }
type V2FolderMuteConfigMapInput interface {
	pulumi.Input

	ToV2FolderMuteConfigMapOutput() V2FolderMuteConfigMapOutput
	ToV2FolderMuteConfigMapOutputWithContext(context.Context) V2FolderMuteConfigMapOutput
}

type V2FolderMuteConfigMap map[string]V2FolderMuteConfigInput

func (V2FolderMuteConfigMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*V2FolderMuteConfig)(nil)).Elem()
}

func (i V2FolderMuteConfigMap) ToV2FolderMuteConfigMapOutput() V2FolderMuteConfigMapOutput {
	return i.ToV2FolderMuteConfigMapOutputWithContext(context.Background())
}

func (i V2FolderMuteConfigMap) ToV2FolderMuteConfigMapOutputWithContext(ctx context.Context) V2FolderMuteConfigMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(V2FolderMuteConfigMapOutput)
}

type V2FolderMuteConfigOutput struct{ *pulumi.OutputState }

func (V2FolderMuteConfigOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**V2FolderMuteConfig)(nil)).Elem()
}

func (o V2FolderMuteConfigOutput) ToV2FolderMuteConfigOutput() V2FolderMuteConfigOutput {
	return o
}

func (o V2FolderMuteConfigOutput) ToV2FolderMuteConfigOutputWithContext(ctx context.Context) V2FolderMuteConfigOutput {
	return o
}

// The time at which the mute config was created. This field is set by
// the server and will be ignored if provided on config creation.
func (o V2FolderMuteConfigOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *V2FolderMuteConfig) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// A description of the mute config.
func (o V2FolderMuteConfigOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *V2FolderMuteConfig) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// An expression that defines the filter to apply across create/update
// events of findings. While creating a filter string, be mindful of
// the scope in which the mute configuration is being created. E.g.,
// If a filter contains project = X but is created under the
// project = Y scope, it might not match any findings.
func (o V2FolderMuteConfigOutput) Filter() pulumi.StringOutput {
	return o.ApplyT(func(v *V2FolderMuteConfig) pulumi.StringOutput { return v.Filter }).(pulumi.StringOutput)
}

// The folder whose Cloud Security Command Center the Mute
// Config lives in.
func (o V2FolderMuteConfigOutput) Folder() pulumi.StringOutput {
	return o.ApplyT(func(v *V2FolderMuteConfig) pulumi.StringOutput { return v.Folder }).(pulumi.StringOutput)
}

// location Id is provided by folder. If not provided, Use global as default.
func (o V2FolderMuteConfigOutput) Location() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *V2FolderMuteConfig) pulumi.StringPtrOutput { return v.Location }).(pulumi.StringPtrOutput)
}

// Email address of the user who last edited the mute config. This
// field is set by the server and will be ignored if provided on
// config creation or update.
func (o V2FolderMuteConfigOutput) MostRecentEditor() pulumi.StringOutput {
	return o.ApplyT(func(v *V2FolderMuteConfig) pulumi.StringOutput { return v.MostRecentEditor }).(pulumi.StringOutput)
}

// Unique identifier provided by the client within the parent scope.
func (o V2FolderMuteConfigOutput) MuteConfigId() pulumi.StringOutput {
	return o.ApplyT(func(v *V2FolderMuteConfig) pulumi.StringOutput { return v.MuteConfigId }).(pulumi.StringOutput)
}

// Name of the mute config. Its format is
// organizations/{organization}/locations/global/muteConfigs/{configId},
// folders/{folder}/locations/global/muteConfigs/{configId},
// or projects/{project}/locations/global/muteConfigs/{configId}
func (o V2FolderMuteConfigOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *V2FolderMuteConfig) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The type of the mute config.
func (o V2FolderMuteConfigOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *V2FolderMuteConfig) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

// Output only. The most recent time at which the mute config was
// updated. This field is set by the server and will be ignored if
// provided on config creation or update.
func (o V2FolderMuteConfigOutput) UpdateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *V2FolderMuteConfig) pulumi.StringOutput { return v.UpdateTime }).(pulumi.StringOutput)
}

type V2FolderMuteConfigArrayOutput struct{ *pulumi.OutputState }

func (V2FolderMuteConfigArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*V2FolderMuteConfig)(nil)).Elem()
}

func (o V2FolderMuteConfigArrayOutput) ToV2FolderMuteConfigArrayOutput() V2FolderMuteConfigArrayOutput {
	return o
}

func (o V2FolderMuteConfigArrayOutput) ToV2FolderMuteConfigArrayOutputWithContext(ctx context.Context) V2FolderMuteConfigArrayOutput {
	return o
}

func (o V2FolderMuteConfigArrayOutput) Index(i pulumi.IntInput) V2FolderMuteConfigOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *V2FolderMuteConfig {
		return vs[0].([]*V2FolderMuteConfig)[vs[1].(int)]
	}).(V2FolderMuteConfigOutput)
}

type V2FolderMuteConfigMapOutput struct{ *pulumi.OutputState }

func (V2FolderMuteConfigMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*V2FolderMuteConfig)(nil)).Elem()
}

func (o V2FolderMuteConfigMapOutput) ToV2FolderMuteConfigMapOutput() V2FolderMuteConfigMapOutput {
	return o
}

func (o V2FolderMuteConfigMapOutput) ToV2FolderMuteConfigMapOutputWithContext(ctx context.Context) V2FolderMuteConfigMapOutput {
	return o
}

func (o V2FolderMuteConfigMapOutput) MapIndex(k pulumi.StringInput) V2FolderMuteConfigOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *V2FolderMuteConfig {
		return vs[0].(map[string]*V2FolderMuteConfig)[vs[1].(string)]
	}).(V2FolderMuteConfigOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*V2FolderMuteConfigInput)(nil)).Elem(), &V2FolderMuteConfig{})
	pulumi.RegisterInputType(reflect.TypeOf((*V2FolderMuteConfigArrayInput)(nil)).Elem(), V2FolderMuteConfigArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*V2FolderMuteConfigMapInput)(nil)).Elem(), V2FolderMuteConfigMap{})
	pulumi.RegisterOutputType(V2FolderMuteConfigOutput{})
	pulumi.RegisterOutputType(V2FolderMuteConfigArrayOutput{})
	pulumi.RegisterOutputType(V2FolderMuteConfigMapOutput{})
}
