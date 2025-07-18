// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package firebase

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
//
// ### Firebase Extentions Instance Resize Image
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/firebase"
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/storage"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			images, err := storage.NewBucket(ctx, "images", &storage.BucketArgs{
//				Project:                  pulumi.String("my-project-name"),
//				Name:                     pulumi.String("bucket-id"),
//				Location:                 pulumi.String("US"),
//				UniformBucketLevelAccess: pulumi.Bool(true),
//				ForceDestroy:             pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = firebase.NewExtensionsInstance(ctx, "resize_image", &firebase.ExtensionsInstanceArgs{
//				Project:    pulumi.String("my-project-name"),
//				InstanceId: pulumi.String("storage-resize-images"),
//				Config: &firebase.ExtensionsInstanceConfigArgs{
//					ExtensionRef:     pulumi.String("firebase/storage-resize-images"),
//					ExtensionVersion: pulumi.String("0.2.2"),
//					Params: pulumi.StringMap{
//						"DELETE_ORIGINAL_FILE": pulumi.String("false"),
//						"MAKE_PUBLIC":          pulumi.String("false"),
//						"IMAGE_TYPE":           pulumi.String("false"),
//						"IS_ANIMATED":          pulumi.String("true"),
//						"FUNCTION_MEMORY":      pulumi.String("1024"),
//						"DO_BACKFILL":          pulumi.String("false"),
//						"IMG_SIZES":            pulumi.String("200x200"),
//						"IMG_BUCKET":           images.Name,
//					},
//					SystemParams: pulumi.StringMap{
//						"firebaseextensions.v1beta.function/location":                   pulumi.String("us-central1"),
//						"firebaseextensions.v1beta.function/maxInstances":               pulumi.String("3000"),
//						"firebaseextensions.v1beta.function/minInstances":               pulumi.String("0"),
//						"firebaseextensions.v1beta.function/vpcConnectorEgressSettings": pulumi.String("VPC_CONNECTOR_EGRESS_SETTINGS_UNSPECIFIED"),
//					},
//					AllowedEventTypes: pulumi.StringArray{
//						pulumi.String("firebase.extensions.storage-resize-images.v1.onCompletion"),
//					},
//					EventarcChannel: pulumi.String("projects/my-project-name/locations/us-central1/channels/firebase"),
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
// Instance can be imported using any of these accepted formats:
//
// * `projects/{{project}}/instances/{{instance_id}}`
//
// * `{{project}}/{{instance_id}}`
//
// * `{{instance_id}}`
//
// When using the `pulumi import` command, Instance can be imported using one of the formats above. For example:
//
// ```sh
// $ pulumi import gcp:firebase/extensionsInstance:ExtensionsInstance default projects/{{project}}/instances/{{instance_id}}
// ```
//
// ```sh
// $ pulumi import gcp:firebase/extensionsInstance:ExtensionsInstance default {{project}}/{{instance_id}}
// ```
//
// ```sh
// $ pulumi import gcp:firebase/extensionsInstance:ExtensionsInstance default {{instance_id}}
// ```
type ExtensionsInstance struct {
	pulumi.CustomResourceState

	// The current Config of the Extension Instance.
	// Structure is documented below.
	Config ExtensionsInstanceConfigOutput `pulumi:"config"`
	// The time at which the Extension Instance was created.
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// If this Instance has `state: ERRORED`, the error messages
	// will be found here.
	// Structure is documented below.
	ErrorStatuses ExtensionsInstanceErrorStatusArrayOutput `pulumi:"errorStatuses"`
	// A weak etag that is computed by the server based on other configuration
	// values and may be sent on update and delete requests to ensure the
	// client has an up-to-date value before proceeding.
	Etag pulumi.StringOutput `pulumi:"etag"`
	// The ID to use for the Extension Instance, which will become the final
	// component of the instance's name.
	InstanceId pulumi.StringOutput `pulumi:"instanceId"`
	// The name of the last operation that acted on this Extension
	// Instance
	LastOperationName pulumi.StringOutput `pulumi:"lastOperationName"`
	// The type of the last operation that acted on the Extension Instance.
	LastOperationType pulumi.StringOutput `pulumi:"lastOperationType"`
	// The fully-qualified resource name of the Extension Instance.
	Name pulumi.StringOutput `pulumi:"name"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringOutput `pulumi:"project"`
	// Data set by the extension instance at runtime.
	// Structure is documented below.
	RuntimeDatas ExtensionsInstanceRuntimeDataArrayOutput `pulumi:"runtimeDatas"`
	// The email of the service account to be used at runtime by compute resources
	// created for the operation of the Extension instance.
	ServiceAccountEmail pulumi.StringOutput `pulumi:"serviceAccountEmail"`
	// The processing state of the extension instance.
	State pulumi.StringOutput `pulumi:"state"`
	// The time at which the Extension Instance was updated.
	UpdateTime pulumi.StringOutput `pulumi:"updateTime"`
}

// NewExtensionsInstance registers a new resource with the given unique name, arguments, and options.
func NewExtensionsInstance(ctx *pulumi.Context,
	name string, args *ExtensionsInstanceArgs, opts ...pulumi.ResourceOption) (*ExtensionsInstance, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Config == nil {
		return nil, errors.New("invalid value for required argument 'Config'")
	}
	if args.InstanceId == nil {
		return nil, errors.New("invalid value for required argument 'InstanceId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ExtensionsInstance
	err := ctx.RegisterResource("gcp:firebase/extensionsInstance:ExtensionsInstance", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetExtensionsInstance gets an existing ExtensionsInstance resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetExtensionsInstance(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ExtensionsInstanceState, opts ...pulumi.ResourceOption) (*ExtensionsInstance, error) {
	var resource ExtensionsInstance
	err := ctx.ReadResource("gcp:firebase/extensionsInstance:ExtensionsInstance", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ExtensionsInstance resources.
type extensionsInstanceState struct {
	// The current Config of the Extension Instance.
	// Structure is documented below.
	Config *ExtensionsInstanceConfig `pulumi:"config"`
	// The time at which the Extension Instance was created.
	CreateTime *string `pulumi:"createTime"`
	// If this Instance has `state: ERRORED`, the error messages
	// will be found here.
	// Structure is documented below.
	ErrorStatuses []ExtensionsInstanceErrorStatus `pulumi:"errorStatuses"`
	// A weak etag that is computed by the server based on other configuration
	// values and may be sent on update and delete requests to ensure the
	// client has an up-to-date value before proceeding.
	Etag *string `pulumi:"etag"`
	// The ID to use for the Extension Instance, which will become the final
	// component of the instance's name.
	InstanceId *string `pulumi:"instanceId"`
	// The name of the last operation that acted on this Extension
	// Instance
	LastOperationName *string `pulumi:"lastOperationName"`
	// The type of the last operation that acted on the Extension Instance.
	LastOperationType *string `pulumi:"lastOperationType"`
	// The fully-qualified resource name of the Extension Instance.
	Name *string `pulumi:"name"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
	// Data set by the extension instance at runtime.
	// Structure is documented below.
	RuntimeDatas []ExtensionsInstanceRuntimeData `pulumi:"runtimeDatas"`
	// The email of the service account to be used at runtime by compute resources
	// created for the operation of the Extension instance.
	ServiceAccountEmail *string `pulumi:"serviceAccountEmail"`
	// The processing state of the extension instance.
	State *string `pulumi:"state"`
	// The time at which the Extension Instance was updated.
	UpdateTime *string `pulumi:"updateTime"`
}

type ExtensionsInstanceState struct {
	// The current Config of the Extension Instance.
	// Structure is documented below.
	Config ExtensionsInstanceConfigPtrInput
	// The time at which the Extension Instance was created.
	CreateTime pulumi.StringPtrInput
	// If this Instance has `state: ERRORED`, the error messages
	// will be found here.
	// Structure is documented below.
	ErrorStatuses ExtensionsInstanceErrorStatusArrayInput
	// A weak etag that is computed by the server based on other configuration
	// values and may be sent on update and delete requests to ensure the
	// client has an up-to-date value before proceeding.
	Etag pulumi.StringPtrInput
	// The ID to use for the Extension Instance, which will become the final
	// component of the instance's name.
	InstanceId pulumi.StringPtrInput
	// The name of the last operation that acted on this Extension
	// Instance
	LastOperationName pulumi.StringPtrInput
	// The type of the last operation that acted on the Extension Instance.
	LastOperationType pulumi.StringPtrInput
	// The fully-qualified resource name of the Extension Instance.
	Name pulumi.StringPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
	// Data set by the extension instance at runtime.
	// Structure is documented below.
	RuntimeDatas ExtensionsInstanceRuntimeDataArrayInput
	// The email of the service account to be used at runtime by compute resources
	// created for the operation of the Extension instance.
	ServiceAccountEmail pulumi.StringPtrInput
	// The processing state of the extension instance.
	State pulumi.StringPtrInput
	// The time at which the Extension Instance was updated.
	UpdateTime pulumi.StringPtrInput
}

func (ExtensionsInstanceState) ElementType() reflect.Type {
	return reflect.TypeOf((*extensionsInstanceState)(nil)).Elem()
}

type extensionsInstanceArgs struct {
	// The current Config of the Extension Instance.
	// Structure is documented below.
	Config ExtensionsInstanceConfig `pulumi:"config"`
	// The ID to use for the Extension Instance, which will become the final
	// component of the instance's name.
	InstanceId string `pulumi:"instanceId"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
}

// The set of arguments for constructing a ExtensionsInstance resource.
type ExtensionsInstanceArgs struct {
	// The current Config of the Extension Instance.
	// Structure is documented below.
	Config ExtensionsInstanceConfigInput
	// The ID to use for the Extension Instance, which will become the final
	// component of the instance's name.
	InstanceId pulumi.StringInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
}

func (ExtensionsInstanceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*extensionsInstanceArgs)(nil)).Elem()
}

type ExtensionsInstanceInput interface {
	pulumi.Input

	ToExtensionsInstanceOutput() ExtensionsInstanceOutput
	ToExtensionsInstanceOutputWithContext(ctx context.Context) ExtensionsInstanceOutput
}

func (*ExtensionsInstance) ElementType() reflect.Type {
	return reflect.TypeOf((**ExtensionsInstance)(nil)).Elem()
}

func (i *ExtensionsInstance) ToExtensionsInstanceOutput() ExtensionsInstanceOutput {
	return i.ToExtensionsInstanceOutputWithContext(context.Background())
}

func (i *ExtensionsInstance) ToExtensionsInstanceOutputWithContext(ctx context.Context) ExtensionsInstanceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ExtensionsInstanceOutput)
}

// ExtensionsInstanceArrayInput is an input type that accepts ExtensionsInstanceArray and ExtensionsInstanceArrayOutput values.
// You can construct a concrete instance of `ExtensionsInstanceArrayInput` via:
//
//	ExtensionsInstanceArray{ ExtensionsInstanceArgs{...} }
type ExtensionsInstanceArrayInput interface {
	pulumi.Input

	ToExtensionsInstanceArrayOutput() ExtensionsInstanceArrayOutput
	ToExtensionsInstanceArrayOutputWithContext(context.Context) ExtensionsInstanceArrayOutput
}

type ExtensionsInstanceArray []ExtensionsInstanceInput

func (ExtensionsInstanceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ExtensionsInstance)(nil)).Elem()
}

func (i ExtensionsInstanceArray) ToExtensionsInstanceArrayOutput() ExtensionsInstanceArrayOutput {
	return i.ToExtensionsInstanceArrayOutputWithContext(context.Background())
}

func (i ExtensionsInstanceArray) ToExtensionsInstanceArrayOutputWithContext(ctx context.Context) ExtensionsInstanceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ExtensionsInstanceArrayOutput)
}

// ExtensionsInstanceMapInput is an input type that accepts ExtensionsInstanceMap and ExtensionsInstanceMapOutput values.
// You can construct a concrete instance of `ExtensionsInstanceMapInput` via:
//
//	ExtensionsInstanceMap{ "key": ExtensionsInstanceArgs{...} }
type ExtensionsInstanceMapInput interface {
	pulumi.Input

	ToExtensionsInstanceMapOutput() ExtensionsInstanceMapOutput
	ToExtensionsInstanceMapOutputWithContext(context.Context) ExtensionsInstanceMapOutput
}

type ExtensionsInstanceMap map[string]ExtensionsInstanceInput

func (ExtensionsInstanceMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ExtensionsInstance)(nil)).Elem()
}

func (i ExtensionsInstanceMap) ToExtensionsInstanceMapOutput() ExtensionsInstanceMapOutput {
	return i.ToExtensionsInstanceMapOutputWithContext(context.Background())
}

func (i ExtensionsInstanceMap) ToExtensionsInstanceMapOutputWithContext(ctx context.Context) ExtensionsInstanceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ExtensionsInstanceMapOutput)
}

type ExtensionsInstanceOutput struct{ *pulumi.OutputState }

func (ExtensionsInstanceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ExtensionsInstance)(nil)).Elem()
}

func (o ExtensionsInstanceOutput) ToExtensionsInstanceOutput() ExtensionsInstanceOutput {
	return o
}

func (o ExtensionsInstanceOutput) ToExtensionsInstanceOutputWithContext(ctx context.Context) ExtensionsInstanceOutput {
	return o
}

// The current Config of the Extension Instance.
// Structure is documented below.
func (o ExtensionsInstanceOutput) Config() ExtensionsInstanceConfigOutput {
	return o.ApplyT(func(v *ExtensionsInstance) ExtensionsInstanceConfigOutput { return v.Config }).(ExtensionsInstanceConfigOutput)
}

// The time at which the Extension Instance was created.
func (o ExtensionsInstanceOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *ExtensionsInstance) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// If this Instance has `state: ERRORED`, the error messages
// will be found here.
// Structure is documented below.
func (o ExtensionsInstanceOutput) ErrorStatuses() ExtensionsInstanceErrorStatusArrayOutput {
	return o.ApplyT(func(v *ExtensionsInstance) ExtensionsInstanceErrorStatusArrayOutput { return v.ErrorStatuses }).(ExtensionsInstanceErrorStatusArrayOutput)
}

// A weak etag that is computed by the server based on other configuration
// values and may be sent on update and delete requests to ensure the
// client has an up-to-date value before proceeding.
func (o ExtensionsInstanceOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v *ExtensionsInstance) pulumi.StringOutput { return v.Etag }).(pulumi.StringOutput)
}

// The ID to use for the Extension Instance, which will become the final
// component of the instance's name.
func (o ExtensionsInstanceOutput) InstanceId() pulumi.StringOutput {
	return o.ApplyT(func(v *ExtensionsInstance) pulumi.StringOutput { return v.InstanceId }).(pulumi.StringOutput)
}

// The name of the last operation that acted on this Extension
// Instance
func (o ExtensionsInstanceOutput) LastOperationName() pulumi.StringOutput {
	return o.ApplyT(func(v *ExtensionsInstance) pulumi.StringOutput { return v.LastOperationName }).(pulumi.StringOutput)
}

// The type of the last operation that acted on the Extension Instance.
func (o ExtensionsInstanceOutput) LastOperationType() pulumi.StringOutput {
	return o.ApplyT(func(v *ExtensionsInstance) pulumi.StringOutput { return v.LastOperationType }).(pulumi.StringOutput)
}

// The fully-qualified resource name of the Extension Instance.
func (o ExtensionsInstanceOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ExtensionsInstance) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The ID of the project in which the resource belongs.
// If it is not provided, the provider project is used.
func (o ExtensionsInstanceOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *ExtensionsInstance) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// Data set by the extension instance at runtime.
// Structure is documented below.
func (o ExtensionsInstanceOutput) RuntimeDatas() ExtensionsInstanceRuntimeDataArrayOutput {
	return o.ApplyT(func(v *ExtensionsInstance) ExtensionsInstanceRuntimeDataArrayOutput { return v.RuntimeDatas }).(ExtensionsInstanceRuntimeDataArrayOutput)
}

// The email of the service account to be used at runtime by compute resources
// created for the operation of the Extension instance.
func (o ExtensionsInstanceOutput) ServiceAccountEmail() pulumi.StringOutput {
	return o.ApplyT(func(v *ExtensionsInstance) pulumi.StringOutput { return v.ServiceAccountEmail }).(pulumi.StringOutput)
}

// The processing state of the extension instance.
func (o ExtensionsInstanceOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v *ExtensionsInstance) pulumi.StringOutput { return v.State }).(pulumi.StringOutput)
}

// The time at which the Extension Instance was updated.
func (o ExtensionsInstanceOutput) UpdateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *ExtensionsInstance) pulumi.StringOutput { return v.UpdateTime }).(pulumi.StringOutput)
}

type ExtensionsInstanceArrayOutput struct{ *pulumi.OutputState }

func (ExtensionsInstanceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ExtensionsInstance)(nil)).Elem()
}

func (o ExtensionsInstanceArrayOutput) ToExtensionsInstanceArrayOutput() ExtensionsInstanceArrayOutput {
	return o
}

func (o ExtensionsInstanceArrayOutput) ToExtensionsInstanceArrayOutputWithContext(ctx context.Context) ExtensionsInstanceArrayOutput {
	return o
}

func (o ExtensionsInstanceArrayOutput) Index(i pulumi.IntInput) ExtensionsInstanceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ExtensionsInstance {
		return vs[0].([]*ExtensionsInstance)[vs[1].(int)]
	}).(ExtensionsInstanceOutput)
}

type ExtensionsInstanceMapOutput struct{ *pulumi.OutputState }

func (ExtensionsInstanceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ExtensionsInstance)(nil)).Elem()
}

func (o ExtensionsInstanceMapOutput) ToExtensionsInstanceMapOutput() ExtensionsInstanceMapOutput {
	return o
}

func (o ExtensionsInstanceMapOutput) ToExtensionsInstanceMapOutputWithContext(ctx context.Context) ExtensionsInstanceMapOutput {
	return o
}

func (o ExtensionsInstanceMapOutput) MapIndex(k pulumi.StringInput) ExtensionsInstanceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ExtensionsInstance {
		return vs[0].(map[string]*ExtensionsInstance)[vs[1].(string)]
	}).(ExtensionsInstanceOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ExtensionsInstanceInput)(nil)).Elem(), &ExtensionsInstance{})
	pulumi.RegisterInputType(reflect.TypeOf((*ExtensionsInstanceArrayInput)(nil)).Elem(), ExtensionsInstanceArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ExtensionsInstanceMapInput)(nil)).Elem(), ExtensionsInstanceMap{})
	pulumi.RegisterOutputType(ExtensionsInstanceOutput{})
	pulumi.RegisterOutputType(ExtensionsInstanceArrayOutput{})
	pulumi.RegisterOutputType(ExtensionsInstanceMapOutput{})
}
