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

// A Cloud Security Command Center (Cloud SCC) notification configs. A
// notification config is a Cloud SCC resource that contains the
// configuration to send notifications for create/update events of
// findings, assets and etc.
// > **Note:** In order to use Cloud SCC resources, your organization must be enrolled
// in [SCC Standard/Premium](https://cloud.google.com/security-command-center/docs/quickstart-security-command-center).
// Without doing so, you may run into errors during resource creation.
//
// To get more information about NotificationConfig, see:
//
// * [API documentation](https://cloud.google.com/security-command-center/docs/reference/rest/v1/organizations.notificationConfigs)
// * How-to Guides
//   - [Official Documentation](https://cloud.google.com/security-command-center/docs)
//
// ## Example Usage
//
// ### Scc Notification Config Basic
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/pubsub"
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/securitycenter"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			sccNotification, err := pubsub.NewTopic(ctx, "scc_notification", &pubsub.TopicArgs{
//				Name: pulumi.String("my-topic"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = securitycenter.NewNotificationConfig(ctx, "custom_notification_config", &securitycenter.NotificationConfigArgs{
//				ConfigId:     pulumi.String("my-config"),
//				Organization: pulumi.String("123456789"),
//				Description:  pulumi.String("My custom Cloud Security Command Center Finding Notification Configuration"),
//				PubsubTopic:  sccNotification.ID(),
//				StreamingConfig: &securitycenter.NotificationConfigStreamingConfigArgs{
//					Filter: pulumi.String("category = \"OPEN_FIREWALL\" AND state = \"ACTIVE\""),
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
// NotificationConfig can be imported using any of these accepted formats:
//
// * `{{name}}`
//
// When using the `pulumi import` command, NotificationConfig can be imported using one of the formats above. For example:
//
// ```sh
// $ pulumi import gcp:securitycenter/notificationConfig:NotificationConfig default {{name}}
// ```
type NotificationConfig struct {
	pulumi.CustomResourceState

	// This must be unique within the organization.
	ConfigId pulumi.StringOutput `pulumi:"configId"`
	// The description of the notification config (max of 1024 characters).
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The resource name of this notification config, in the format
	// `organizations/{{organization}}/notificationConfigs/{{config_id}}`.
	Name pulumi.StringOutput `pulumi:"name"`
	// The organization whose Cloud Security Command Center the Notification
	// Config lives in.
	Organization pulumi.StringOutput `pulumi:"organization"`
	// The Pub/Sub topic to send notifications to. Its format is
	// "projects/[projectId]/topics/[topic]".
	PubsubTopic pulumi.StringOutput `pulumi:"pubsubTopic"`
	// The service account that needs "pubsub.topics.publish" permission to
	// publish to the Pub/Sub topic.
	ServiceAccount pulumi.StringOutput `pulumi:"serviceAccount"`
	// The config for triggering streaming-based notifications.
	// Structure is documented below.
	StreamingConfig NotificationConfigStreamingConfigOutput `pulumi:"streamingConfig"`
}

// NewNotificationConfig registers a new resource with the given unique name, arguments, and options.
func NewNotificationConfig(ctx *pulumi.Context,
	name string, args *NotificationConfigArgs, opts ...pulumi.ResourceOption) (*NotificationConfig, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ConfigId == nil {
		return nil, errors.New("invalid value for required argument 'ConfigId'")
	}
	if args.Organization == nil {
		return nil, errors.New("invalid value for required argument 'Organization'")
	}
	if args.PubsubTopic == nil {
		return nil, errors.New("invalid value for required argument 'PubsubTopic'")
	}
	if args.StreamingConfig == nil {
		return nil, errors.New("invalid value for required argument 'StreamingConfig'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource NotificationConfig
	err := ctx.RegisterResource("gcp:securitycenter/notificationConfig:NotificationConfig", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetNotificationConfig gets an existing NotificationConfig resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetNotificationConfig(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *NotificationConfigState, opts ...pulumi.ResourceOption) (*NotificationConfig, error) {
	var resource NotificationConfig
	err := ctx.ReadResource("gcp:securitycenter/notificationConfig:NotificationConfig", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering NotificationConfig resources.
type notificationConfigState struct {
	// This must be unique within the organization.
	ConfigId *string `pulumi:"configId"`
	// The description of the notification config (max of 1024 characters).
	Description *string `pulumi:"description"`
	// The resource name of this notification config, in the format
	// `organizations/{{organization}}/notificationConfigs/{{config_id}}`.
	Name *string `pulumi:"name"`
	// The organization whose Cloud Security Command Center the Notification
	// Config lives in.
	Organization *string `pulumi:"organization"`
	// The Pub/Sub topic to send notifications to. Its format is
	// "projects/[projectId]/topics/[topic]".
	PubsubTopic *string `pulumi:"pubsubTopic"`
	// The service account that needs "pubsub.topics.publish" permission to
	// publish to the Pub/Sub topic.
	ServiceAccount *string `pulumi:"serviceAccount"`
	// The config for triggering streaming-based notifications.
	// Structure is documented below.
	StreamingConfig *NotificationConfigStreamingConfig `pulumi:"streamingConfig"`
}

type NotificationConfigState struct {
	// This must be unique within the organization.
	ConfigId pulumi.StringPtrInput
	// The description of the notification config (max of 1024 characters).
	Description pulumi.StringPtrInput
	// The resource name of this notification config, in the format
	// `organizations/{{organization}}/notificationConfigs/{{config_id}}`.
	Name pulumi.StringPtrInput
	// The organization whose Cloud Security Command Center the Notification
	// Config lives in.
	Organization pulumi.StringPtrInput
	// The Pub/Sub topic to send notifications to. Its format is
	// "projects/[projectId]/topics/[topic]".
	PubsubTopic pulumi.StringPtrInput
	// The service account that needs "pubsub.topics.publish" permission to
	// publish to the Pub/Sub topic.
	ServiceAccount pulumi.StringPtrInput
	// The config for triggering streaming-based notifications.
	// Structure is documented below.
	StreamingConfig NotificationConfigStreamingConfigPtrInput
}

func (NotificationConfigState) ElementType() reflect.Type {
	return reflect.TypeOf((*notificationConfigState)(nil)).Elem()
}

type notificationConfigArgs struct {
	// This must be unique within the organization.
	ConfigId string `pulumi:"configId"`
	// The description of the notification config (max of 1024 characters).
	Description *string `pulumi:"description"`
	// The organization whose Cloud Security Command Center the Notification
	// Config lives in.
	Organization string `pulumi:"organization"`
	// The Pub/Sub topic to send notifications to. Its format is
	// "projects/[projectId]/topics/[topic]".
	PubsubTopic string `pulumi:"pubsubTopic"`
	// The config for triggering streaming-based notifications.
	// Structure is documented below.
	StreamingConfig NotificationConfigStreamingConfig `pulumi:"streamingConfig"`
}

// The set of arguments for constructing a NotificationConfig resource.
type NotificationConfigArgs struct {
	// This must be unique within the organization.
	ConfigId pulumi.StringInput
	// The description of the notification config (max of 1024 characters).
	Description pulumi.StringPtrInput
	// The organization whose Cloud Security Command Center the Notification
	// Config lives in.
	Organization pulumi.StringInput
	// The Pub/Sub topic to send notifications to. Its format is
	// "projects/[projectId]/topics/[topic]".
	PubsubTopic pulumi.StringInput
	// The config for triggering streaming-based notifications.
	// Structure is documented below.
	StreamingConfig NotificationConfigStreamingConfigInput
}

func (NotificationConfigArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*notificationConfigArgs)(nil)).Elem()
}

type NotificationConfigInput interface {
	pulumi.Input

	ToNotificationConfigOutput() NotificationConfigOutput
	ToNotificationConfigOutputWithContext(ctx context.Context) NotificationConfigOutput
}

func (*NotificationConfig) ElementType() reflect.Type {
	return reflect.TypeOf((**NotificationConfig)(nil)).Elem()
}

func (i *NotificationConfig) ToNotificationConfigOutput() NotificationConfigOutput {
	return i.ToNotificationConfigOutputWithContext(context.Background())
}

func (i *NotificationConfig) ToNotificationConfigOutputWithContext(ctx context.Context) NotificationConfigOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NotificationConfigOutput)
}

// NotificationConfigArrayInput is an input type that accepts NotificationConfigArray and NotificationConfigArrayOutput values.
// You can construct a concrete instance of `NotificationConfigArrayInput` via:
//
//	NotificationConfigArray{ NotificationConfigArgs{...} }
type NotificationConfigArrayInput interface {
	pulumi.Input

	ToNotificationConfigArrayOutput() NotificationConfigArrayOutput
	ToNotificationConfigArrayOutputWithContext(context.Context) NotificationConfigArrayOutput
}

type NotificationConfigArray []NotificationConfigInput

func (NotificationConfigArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NotificationConfig)(nil)).Elem()
}

func (i NotificationConfigArray) ToNotificationConfigArrayOutput() NotificationConfigArrayOutput {
	return i.ToNotificationConfigArrayOutputWithContext(context.Background())
}

func (i NotificationConfigArray) ToNotificationConfigArrayOutputWithContext(ctx context.Context) NotificationConfigArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NotificationConfigArrayOutput)
}

// NotificationConfigMapInput is an input type that accepts NotificationConfigMap and NotificationConfigMapOutput values.
// You can construct a concrete instance of `NotificationConfigMapInput` via:
//
//	NotificationConfigMap{ "key": NotificationConfigArgs{...} }
type NotificationConfigMapInput interface {
	pulumi.Input

	ToNotificationConfigMapOutput() NotificationConfigMapOutput
	ToNotificationConfigMapOutputWithContext(context.Context) NotificationConfigMapOutput
}

type NotificationConfigMap map[string]NotificationConfigInput

func (NotificationConfigMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NotificationConfig)(nil)).Elem()
}

func (i NotificationConfigMap) ToNotificationConfigMapOutput() NotificationConfigMapOutput {
	return i.ToNotificationConfigMapOutputWithContext(context.Background())
}

func (i NotificationConfigMap) ToNotificationConfigMapOutputWithContext(ctx context.Context) NotificationConfigMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NotificationConfigMapOutput)
}

type NotificationConfigOutput struct{ *pulumi.OutputState }

func (NotificationConfigOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**NotificationConfig)(nil)).Elem()
}

func (o NotificationConfigOutput) ToNotificationConfigOutput() NotificationConfigOutput {
	return o
}

func (o NotificationConfigOutput) ToNotificationConfigOutputWithContext(ctx context.Context) NotificationConfigOutput {
	return o
}

// This must be unique within the organization.
func (o NotificationConfigOutput) ConfigId() pulumi.StringOutput {
	return o.ApplyT(func(v *NotificationConfig) pulumi.StringOutput { return v.ConfigId }).(pulumi.StringOutput)
}

// The description of the notification config (max of 1024 characters).
func (o NotificationConfigOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *NotificationConfig) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The resource name of this notification config, in the format
// `organizations/{{organization}}/notificationConfigs/{{config_id}}`.
func (o NotificationConfigOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *NotificationConfig) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The organization whose Cloud Security Command Center the Notification
// Config lives in.
func (o NotificationConfigOutput) Organization() pulumi.StringOutput {
	return o.ApplyT(func(v *NotificationConfig) pulumi.StringOutput { return v.Organization }).(pulumi.StringOutput)
}

// The Pub/Sub topic to send notifications to. Its format is
// "projects/[projectId]/topics/[topic]".
func (o NotificationConfigOutput) PubsubTopic() pulumi.StringOutput {
	return o.ApplyT(func(v *NotificationConfig) pulumi.StringOutput { return v.PubsubTopic }).(pulumi.StringOutput)
}

// The service account that needs "pubsub.topics.publish" permission to
// publish to the Pub/Sub topic.
func (o NotificationConfigOutput) ServiceAccount() pulumi.StringOutput {
	return o.ApplyT(func(v *NotificationConfig) pulumi.StringOutput { return v.ServiceAccount }).(pulumi.StringOutput)
}

// The config for triggering streaming-based notifications.
// Structure is documented below.
func (o NotificationConfigOutput) StreamingConfig() NotificationConfigStreamingConfigOutput {
	return o.ApplyT(func(v *NotificationConfig) NotificationConfigStreamingConfigOutput { return v.StreamingConfig }).(NotificationConfigStreamingConfigOutput)
}

type NotificationConfigArrayOutput struct{ *pulumi.OutputState }

func (NotificationConfigArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NotificationConfig)(nil)).Elem()
}

func (o NotificationConfigArrayOutput) ToNotificationConfigArrayOutput() NotificationConfigArrayOutput {
	return o
}

func (o NotificationConfigArrayOutput) ToNotificationConfigArrayOutputWithContext(ctx context.Context) NotificationConfigArrayOutput {
	return o
}

func (o NotificationConfigArrayOutput) Index(i pulumi.IntInput) NotificationConfigOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *NotificationConfig {
		return vs[0].([]*NotificationConfig)[vs[1].(int)]
	}).(NotificationConfigOutput)
}

type NotificationConfigMapOutput struct{ *pulumi.OutputState }

func (NotificationConfigMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NotificationConfig)(nil)).Elem()
}

func (o NotificationConfigMapOutput) ToNotificationConfigMapOutput() NotificationConfigMapOutput {
	return o
}

func (o NotificationConfigMapOutput) ToNotificationConfigMapOutputWithContext(ctx context.Context) NotificationConfigMapOutput {
	return o
}

func (o NotificationConfigMapOutput) MapIndex(k pulumi.StringInput) NotificationConfigOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *NotificationConfig {
		return vs[0].(map[string]*NotificationConfig)[vs[1].(string)]
	}).(NotificationConfigOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*NotificationConfigInput)(nil)).Elem(), &NotificationConfig{})
	pulumi.RegisterInputType(reflect.TypeOf((*NotificationConfigArrayInput)(nil)).Elem(), NotificationConfigArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*NotificationConfigMapInput)(nil)).Elem(), NotificationConfigMap{})
	pulumi.RegisterOutputType(NotificationConfigOutput{})
	pulumi.RegisterOutputType(NotificationConfigArrayOutput{})
	pulumi.RegisterOutputType(NotificationConfigMapOutput{})
}
