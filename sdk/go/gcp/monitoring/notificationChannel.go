// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package monitoring

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// A NotificationChannel is a medium through which an alert is delivered
// when a policy violation is detected. Examples of channels include email, SMS,
// and third-party messaging applications. Fields containing sensitive information
// like authentication tokens or contact info are only partially populated on retrieval.
//
// Notification Channels are designed to be flexible and are made up of a supported `type`
// and labels to configure that channel. Each `type` has specific labels that need to be
// present for that channel to be correctly configured. The labels that are required to be
// present for one channel `type` are often different than those required for another.
// Due to these loose constraints it's often best to set up a channel through the UI
// and import it to the provider when setting up a brand new channel type to determine which
// labels are required.
//
// A list of supported channels per project the `list` endpoint can be
// accessed programmatically or through the api explorer at  https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.notificationChannelDescriptors/list .
// This provides the channel type and all of the required labels that must be passed.
//
// To get more information about NotificationChannel, see:
//
// * [API documentation](https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.notificationChannels)
// * How-to Guides
//   - [Monitoring API Documentation](https://cloud.google.com/monitoring/api/v3/)
//   - [Notification Options](https://cloud.google.com/monitoring/support/notification-options)
//
// ## Example Usage
//
// ### Notification Channel Basic
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/monitoring"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := monitoring.NewNotificationChannel(ctx, "basic", &monitoring.NotificationChannelArgs{
//				DisplayName: pulumi.String("Test Notification Channel"),
//				Type:        pulumi.String("email"),
//				Labels: pulumi.StringMap{
//					"email_address": pulumi.String("fake_email@blahblah.com"),
//				},
//				ForceDelete: pulumi.Bool(false),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Notification Channel Sensitive
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/monitoring"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := monitoring.NewNotificationChannel(ctx, "default", &monitoring.NotificationChannelArgs{
//				DisplayName: pulumi.String("Test Slack Channel"),
//				Type:        pulumi.String("slack"),
//				Labels: pulumi.StringMap{
//					"channel_name": pulumi.String("#foobar"),
//				},
//				SensitiveLabels: &monitoring.NotificationChannelSensitiveLabelsArgs{
//					AuthToken: pulumi.String("one"),
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
// NotificationChannel can be imported using any of these accepted formats:
//
// * `{{name}}`
//
// When using the `pulumi import` command, NotificationChannel can be imported using one of the formats above. For example:
//
// ```sh
// $ pulumi import gcp:monitoring/notificationChannel:NotificationChannel default {{name}}
// ```
type NotificationChannel struct {
	pulumi.CustomResourceState

	// An optional human-readable description of this notification channel. This description may provide additional details, beyond the display name, for the channel. This may not exceed 1024 Unicode characters.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// An optional human-readable name for this notification channel. It is recommended that you specify a non-empty and unique name in order to make it easier to identify the channels in your project, though this is not enforced. The display name is limited to 512 Unicode characters.
	DisplayName pulumi.StringPtrOutput `pulumi:"displayName"`
	// Whether notifications are forwarded to the described channel. This makes it possible to disable delivery of notifications to a particular channel without removing the channel from all alerting policies that reference the channel. This is a more convenient approach when the change is temporary and you want to receive notifications from the same set of alerting policies on the channel at some point in the future.
	Enabled pulumi.BoolPtrOutput `pulumi:"enabled"`
	// If true, the notification channel will be deleted regardless
	// of its use in alert policies (the policies will be updated
	// to remove the channel). If false, channels that are still
	// referenced by an existing alerting policy will fail to be
	// deleted in a delete operation.
	ForceDelete pulumi.BoolPtrOutput `pulumi:"forceDelete"`
	// Configuration fields that define the channel and its behavior. The
	// permissible and required labels are specified in the
	// NotificationChannelDescriptor corresponding to the type field.
	// Labels with sensitive data are obfuscated by the API and therefore the provider cannot
	// determine if there are upstream changes to these fields. They can also be configured via
	// the sensitiveLabels block, but cannot be configured in both places.
	Labels pulumi.StringMapOutput `pulumi:"labels"`
	// The full REST resource name for this channel. The syntax is:
	// projects/[PROJECT_ID]/notificationChannels/[CHANNEL_ID]
	// The [CHANNEL_ID] is automatically assigned by the server on creation.
	Name pulumi.StringOutput `pulumi:"name"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringOutput `pulumi:"project"`
	// Different notification type behaviors are configured primarily using the the `labels` field on this
	// resource. This block contains the labels which contain secrets or passwords so that they can be marked
	// sensitive and hidden from plan output. The name of the field, eg: password, will be the key
	// in the `labels` map in the api request.
	// Credentials may not be specified in both locations and will cause an error. Changing from one location
	// to a different credential configuration in the config will require an apply to update state.
	// Structure is documented below.
	SensitiveLabels NotificationChannelSensitiveLabelsPtrOutput `pulumi:"sensitiveLabels"`
	// The type of the notification channel. This field matches the value of the NotificationChannelDescriptor.type field. See https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.notificationChannelDescriptors/list to get the list of valid values such as "email", "slack", etc...
	Type pulumi.StringOutput `pulumi:"type"`
	// User-supplied key/value data that does not need to conform to the corresponding NotificationChannelDescriptor's schema, unlike the labels field. This field is intended to be used for organizing and identifying the NotificationChannel objects.The field can contain up to 64 entries. Each key and value is limited to 63 Unicode characters or 128 bytes, whichever is smaller. Labels and values can contain only lowercase letters, numerals, underscores, and dashes. Keys must begin with a letter.
	UserLabels pulumi.StringMapOutput `pulumi:"userLabels"`
	// Indicates whether this channel has been verified or not. On a ListNotificationChannels or GetNotificationChannel operation, this field is expected to be populated.If the value is UNVERIFIED, then it indicates that the channel is non-functioning (it both requires verification and lacks verification); otherwise, it is assumed that the channel works.If the channel is neither VERIFIED nor UNVERIFIED, it implies that the channel is of a type that does not require verification or that this specific channel has been exempted from verification because it was created prior to verification being required for channels of this type.This field cannot be modified using a standard UpdateNotificationChannel operation. To change the value of this field, you must call VerifyNotificationChannel.
	VerificationStatus pulumi.StringOutput `pulumi:"verificationStatus"`
}

// NewNotificationChannel registers a new resource with the given unique name, arguments, and options.
func NewNotificationChannel(ctx *pulumi.Context,
	name string, args *NotificationChannelArgs, opts ...pulumi.ResourceOption) (*NotificationChannel, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource NotificationChannel
	err := ctx.RegisterResource("gcp:monitoring/notificationChannel:NotificationChannel", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetNotificationChannel gets an existing NotificationChannel resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetNotificationChannel(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *NotificationChannelState, opts ...pulumi.ResourceOption) (*NotificationChannel, error) {
	var resource NotificationChannel
	err := ctx.ReadResource("gcp:monitoring/notificationChannel:NotificationChannel", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering NotificationChannel resources.
type notificationChannelState struct {
	// An optional human-readable description of this notification channel. This description may provide additional details, beyond the display name, for the channel. This may not exceed 1024 Unicode characters.
	Description *string `pulumi:"description"`
	// An optional human-readable name for this notification channel. It is recommended that you specify a non-empty and unique name in order to make it easier to identify the channels in your project, though this is not enforced. The display name is limited to 512 Unicode characters.
	DisplayName *string `pulumi:"displayName"`
	// Whether notifications are forwarded to the described channel. This makes it possible to disable delivery of notifications to a particular channel without removing the channel from all alerting policies that reference the channel. This is a more convenient approach when the change is temporary and you want to receive notifications from the same set of alerting policies on the channel at some point in the future.
	Enabled *bool `pulumi:"enabled"`
	// If true, the notification channel will be deleted regardless
	// of its use in alert policies (the policies will be updated
	// to remove the channel). If false, channels that are still
	// referenced by an existing alerting policy will fail to be
	// deleted in a delete operation.
	ForceDelete *bool `pulumi:"forceDelete"`
	// Configuration fields that define the channel and its behavior. The
	// permissible and required labels are specified in the
	// NotificationChannelDescriptor corresponding to the type field.
	// Labels with sensitive data are obfuscated by the API and therefore the provider cannot
	// determine if there are upstream changes to these fields. They can also be configured via
	// the sensitiveLabels block, but cannot be configured in both places.
	Labels map[string]string `pulumi:"labels"`
	// The full REST resource name for this channel. The syntax is:
	// projects/[PROJECT_ID]/notificationChannels/[CHANNEL_ID]
	// The [CHANNEL_ID] is automatically assigned by the server on creation.
	Name *string `pulumi:"name"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
	// Different notification type behaviors are configured primarily using the the `labels` field on this
	// resource. This block contains the labels which contain secrets or passwords so that they can be marked
	// sensitive and hidden from plan output. The name of the field, eg: password, will be the key
	// in the `labels` map in the api request.
	// Credentials may not be specified in both locations and will cause an error. Changing from one location
	// to a different credential configuration in the config will require an apply to update state.
	// Structure is documented below.
	SensitiveLabels *NotificationChannelSensitiveLabels `pulumi:"sensitiveLabels"`
	// The type of the notification channel. This field matches the value of the NotificationChannelDescriptor.type field. See https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.notificationChannelDescriptors/list to get the list of valid values such as "email", "slack", etc...
	Type *string `pulumi:"type"`
	// User-supplied key/value data that does not need to conform to the corresponding NotificationChannelDescriptor's schema, unlike the labels field. This field is intended to be used for organizing and identifying the NotificationChannel objects.The field can contain up to 64 entries. Each key and value is limited to 63 Unicode characters or 128 bytes, whichever is smaller. Labels and values can contain only lowercase letters, numerals, underscores, and dashes. Keys must begin with a letter.
	UserLabels map[string]string `pulumi:"userLabels"`
	// Indicates whether this channel has been verified or not. On a ListNotificationChannels or GetNotificationChannel operation, this field is expected to be populated.If the value is UNVERIFIED, then it indicates that the channel is non-functioning (it both requires verification and lacks verification); otherwise, it is assumed that the channel works.If the channel is neither VERIFIED nor UNVERIFIED, it implies that the channel is of a type that does not require verification or that this specific channel has been exempted from verification because it was created prior to verification being required for channels of this type.This field cannot be modified using a standard UpdateNotificationChannel operation. To change the value of this field, you must call VerifyNotificationChannel.
	VerificationStatus *string `pulumi:"verificationStatus"`
}

type NotificationChannelState struct {
	// An optional human-readable description of this notification channel. This description may provide additional details, beyond the display name, for the channel. This may not exceed 1024 Unicode characters.
	Description pulumi.StringPtrInput
	// An optional human-readable name for this notification channel. It is recommended that you specify a non-empty and unique name in order to make it easier to identify the channels in your project, though this is not enforced. The display name is limited to 512 Unicode characters.
	DisplayName pulumi.StringPtrInput
	// Whether notifications are forwarded to the described channel. This makes it possible to disable delivery of notifications to a particular channel without removing the channel from all alerting policies that reference the channel. This is a more convenient approach when the change is temporary and you want to receive notifications from the same set of alerting policies on the channel at some point in the future.
	Enabled pulumi.BoolPtrInput
	// If true, the notification channel will be deleted regardless
	// of its use in alert policies (the policies will be updated
	// to remove the channel). If false, channels that are still
	// referenced by an existing alerting policy will fail to be
	// deleted in a delete operation.
	ForceDelete pulumi.BoolPtrInput
	// Configuration fields that define the channel and its behavior. The
	// permissible and required labels are specified in the
	// NotificationChannelDescriptor corresponding to the type field.
	// Labels with sensitive data are obfuscated by the API and therefore the provider cannot
	// determine if there are upstream changes to these fields. They can also be configured via
	// the sensitiveLabels block, but cannot be configured in both places.
	Labels pulumi.StringMapInput
	// The full REST resource name for this channel. The syntax is:
	// projects/[PROJECT_ID]/notificationChannels/[CHANNEL_ID]
	// The [CHANNEL_ID] is automatically assigned by the server on creation.
	Name pulumi.StringPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
	// Different notification type behaviors are configured primarily using the the `labels` field on this
	// resource. This block contains the labels which contain secrets or passwords so that they can be marked
	// sensitive and hidden from plan output. The name of the field, eg: password, will be the key
	// in the `labels` map in the api request.
	// Credentials may not be specified in both locations and will cause an error. Changing from one location
	// to a different credential configuration in the config will require an apply to update state.
	// Structure is documented below.
	SensitiveLabels NotificationChannelSensitiveLabelsPtrInput
	// The type of the notification channel. This field matches the value of the NotificationChannelDescriptor.type field. See https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.notificationChannelDescriptors/list to get the list of valid values such as "email", "slack", etc...
	Type pulumi.StringPtrInput
	// User-supplied key/value data that does not need to conform to the corresponding NotificationChannelDescriptor's schema, unlike the labels field. This field is intended to be used for organizing and identifying the NotificationChannel objects.The field can contain up to 64 entries. Each key and value is limited to 63 Unicode characters or 128 bytes, whichever is smaller. Labels and values can contain only lowercase letters, numerals, underscores, and dashes. Keys must begin with a letter.
	UserLabels pulumi.StringMapInput
	// Indicates whether this channel has been verified or not. On a ListNotificationChannels or GetNotificationChannel operation, this field is expected to be populated.If the value is UNVERIFIED, then it indicates that the channel is non-functioning (it both requires verification and lacks verification); otherwise, it is assumed that the channel works.If the channel is neither VERIFIED nor UNVERIFIED, it implies that the channel is of a type that does not require verification or that this specific channel has been exempted from verification because it was created prior to verification being required for channels of this type.This field cannot be modified using a standard UpdateNotificationChannel operation. To change the value of this field, you must call VerifyNotificationChannel.
	VerificationStatus pulumi.StringPtrInput
}

func (NotificationChannelState) ElementType() reflect.Type {
	return reflect.TypeOf((*notificationChannelState)(nil)).Elem()
}

type notificationChannelArgs struct {
	// An optional human-readable description of this notification channel. This description may provide additional details, beyond the display name, for the channel. This may not exceed 1024 Unicode characters.
	Description *string `pulumi:"description"`
	// An optional human-readable name for this notification channel. It is recommended that you specify a non-empty and unique name in order to make it easier to identify the channels in your project, though this is not enforced. The display name is limited to 512 Unicode characters.
	DisplayName *string `pulumi:"displayName"`
	// Whether notifications are forwarded to the described channel. This makes it possible to disable delivery of notifications to a particular channel without removing the channel from all alerting policies that reference the channel. This is a more convenient approach when the change is temporary and you want to receive notifications from the same set of alerting policies on the channel at some point in the future.
	Enabled *bool `pulumi:"enabled"`
	// If true, the notification channel will be deleted regardless
	// of its use in alert policies (the policies will be updated
	// to remove the channel). If false, channels that are still
	// referenced by an existing alerting policy will fail to be
	// deleted in a delete operation.
	ForceDelete *bool `pulumi:"forceDelete"`
	// Configuration fields that define the channel and its behavior. The
	// permissible and required labels are specified in the
	// NotificationChannelDescriptor corresponding to the type field.
	// Labels with sensitive data are obfuscated by the API and therefore the provider cannot
	// determine if there are upstream changes to these fields. They can also be configured via
	// the sensitiveLabels block, but cannot be configured in both places.
	Labels map[string]string `pulumi:"labels"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
	// Different notification type behaviors are configured primarily using the the `labels` field on this
	// resource. This block contains the labels which contain secrets or passwords so that they can be marked
	// sensitive and hidden from plan output. The name of the field, eg: password, will be the key
	// in the `labels` map in the api request.
	// Credentials may not be specified in both locations and will cause an error. Changing from one location
	// to a different credential configuration in the config will require an apply to update state.
	// Structure is documented below.
	SensitiveLabels *NotificationChannelSensitiveLabels `pulumi:"sensitiveLabels"`
	// The type of the notification channel. This field matches the value of the NotificationChannelDescriptor.type field. See https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.notificationChannelDescriptors/list to get the list of valid values such as "email", "slack", etc...
	Type string `pulumi:"type"`
	// User-supplied key/value data that does not need to conform to the corresponding NotificationChannelDescriptor's schema, unlike the labels field. This field is intended to be used for organizing and identifying the NotificationChannel objects.The field can contain up to 64 entries. Each key and value is limited to 63 Unicode characters or 128 bytes, whichever is smaller. Labels and values can contain only lowercase letters, numerals, underscores, and dashes. Keys must begin with a letter.
	UserLabels map[string]string `pulumi:"userLabels"`
}

// The set of arguments for constructing a NotificationChannel resource.
type NotificationChannelArgs struct {
	// An optional human-readable description of this notification channel. This description may provide additional details, beyond the display name, for the channel. This may not exceed 1024 Unicode characters.
	Description pulumi.StringPtrInput
	// An optional human-readable name for this notification channel. It is recommended that you specify a non-empty and unique name in order to make it easier to identify the channels in your project, though this is not enforced. The display name is limited to 512 Unicode characters.
	DisplayName pulumi.StringPtrInput
	// Whether notifications are forwarded to the described channel. This makes it possible to disable delivery of notifications to a particular channel without removing the channel from all alerting policies that reference the channel. This is a more convenient approach when the change is temporary and you want to receive notifications from the same set of alerting policies on the channel at some point in the future.
	Enabled pulumi.BoolPtrInput
	// If true, the notification channel will be deleted regardless
	// of its use in alert policies (the policies will be updated
	// to remove the channel). If false, channels that are still
	// referenced by an existing alerting policy will fail to be
	// deleted in a delete operation.
	ForceDelete pulumi.BoolPtrInput
	// Configuration fields that define the channel and its behavior. The
	// permissible and required labels are specified in the
	// NotificationChannelDescriptor corresponding to the type field.
	// Labels with sensitive data are obfuscated by the API and therefore the provider cannot
	// determine if there are upstream changes to these fields. They can also be configured via
	// the sensitiveLabels block, but cannot be configured in both places.
	Labels pulumi.StringMapInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
	// Different notification type behaviors are configured primarily using the the `labels` field on this
	// resource. This block contains the labels which contain secrets or passwords so that they can be marked
	// sensitive and hidden from plan output. The name of the field, eg: password, will be the key
	// in the `labels` map in the api request.
	// Credentials may not be specified in both locations and will cause an error. Changing from one location
	// to a different credential configuration in the config will require an apply to update state.
	// Structure is documented below.
	SensitiveLabels NotificationChannelSensitiveLabelsPtrInput
	// The type of the notification channel. This field matches the value of the NotificationChannelDescriptor.type field. See https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.notificationChannelDescriptors/list to get the list of valid values such as "email", "slack", etc...
	Type pulumi.StringInput
	// User-supplied key/value data that does not need to conform to the corresponding NotificationChannelDescriptor's schema, unlike the labels field. This field is intended to be used for organizing and identifying the NotificationChannel objects.The field can contain up to 64 entries. Each key and value is limited to 63 Unicode characters or 128 bytes, whichever is smaller. Labels and values can contain only lowercase letters, numerals, underscores, and dashes. Keys must begin with a letter.
	UserLabels pulumi.StringMapInput
}

func (NotificationChannelArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*notificationChannelArgs)(nil)).Elem()
}

type NotificationChannelInput interface {
	pulumi.Input

	ToNotificationChannelOutput() NotificationChannelOutput
	ToNotificationChannelOutputWithContext(ctx context.Context) NotificationChannelOutput
}

func (*NotificationChannel) ElementType() reflect.Type {
	return reflect.TypeOf((**NotificationChannel)(nil)).Elem()
}

func (i *NotificationChannel) ToNotificationChannelOutput() NotificationChannelOutput {
	return i.ToNotificationChannelOutputWithContext(context.Background())
}

func (i *NotificationChannel) ToNotificationChannelOutputWithContext(ctx context.Context) NotificationChannelOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NotificationChannelOutput)
}

// NotificationChannelArrayInput is an input type that accepts NotificationChannelArray and NotificationChannelArrayOutput values.
// You can construct a concrete instance of `NotificationChannelArrayInput` via:
//
//	NotificationChannelArray{ NotificationChannelArgs{...} }
type NotificationChannelArrayInput interface {
	pulumi.Input

	ToNotificationChannelArrayOutput() NotificationChannelArrayOutput
	ToNotificationChannelArrayOutputWithContext(context.Context) NotificationChannelArrayOutput
}

type NotificationChannelArray []NotificationChannelInput

func (NotificationChannelArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NotificationChannel)(nil)).Elem()
}

func (i NotificationChannelArray) ToNotificationChannelArrayOutput() NotificationChannelArrayOutput {
	return i.ToNotificationChannelArrayOutputWithContext(context.Background())
}

func (i NotificationChannelArray) ToNotificationChannelArrayOutputWithContext(ctx context.Context) NotificationChannelArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NotificationChannelArrayOutput)
}

// NotificationChannelMapInput is an input type that accepts NotificationChannelMap and NotificationChannelMapOutput values.
// You can construct a concrete instance of `NotificationChannelMapInput` via:
//
//	NotificationChannelMap{ "key": NotificationChannelArgs{...} }
type NotificationChannelMapInput interface {
	pulumi.Input

	ToNotificationChannelMapOutput() NotificationChannelMapOutput
	ToNotificationChannelMapOutputWithContext(context.Context) NotificationChannelMapOutput
}

type NotificationChannelMap map[string]NotificationChannelInput

func (NotificationChannelMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NotificationChannel)(nil)).Elem()
}

func (i NotificationChannelMap) ToNotificationChannelMapOutput() NotificationChannelMapOutput {
	return i.ToNotificationChannelMapOutputWithContext(context.Background())
}

func (i NotificationChannelMap) ToNotificationChannelMapOutputWithContext(ctx context.Context) NotificationChannelMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NotificationChannelMapOutput)
}

type NotificationChannelOutput struct{ *pulumi.OutputState }

func (NotificationChannelOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**NotificationChannel)(nil)).Elem()
}

func (o NotificationChannelOutput) ToNotificationChannelOutput() NotificationChannelOutput {
	return o
}

func (o NotificationChannelOutput) ToNotificationChannelOutputWithContext(ctx context.Context) NotificationChannelOutput {
	return o
}

// An optional human-readable description of this notification channel. This description may provide additional details, beyond the display name, for the channel. This may not exceed 1024 Unicode characters.
func (o NotificationChannelOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *NotificationChannel) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// An optional human-readable name for this notification channel. It is recommended that you specify a non-empty and unique name in order to make it easier to identify the channels in your project, though this is not enforced. The display name is limited to 512 Unicode characters.
func (o NotificationChannelOutput) DisplayName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *NotificationChannel) pulumi.StringPtrOutput { return v.DisplayName }).(pulumi.StringPtrOutput)
}

// Whether notifications are forwarded to the described channel. This makes it possible to disable delivery of notifications to a particular channel without removing the channel from all alerting policies that reference the channel. This is a more convenient approach when the change is temporary and you want to receive notifications from the same set of alerting policies on the channel at some point in the future.
func (o NotificationChannelOutput) Enabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *NotificationChannel) pulumi.BoolPtrOutput { return v.Enabled }).(pulumi.BoolPtrOutput)
}

// If true, the notification channel will be deleted regardless
// of its use in alert policies (the policies will be updated
// to remove the channel). If false, channels that are still
// referenced by an existing alerting policy will fail to be
// deleted in a delete operation.
func (o NotificationChannelOutput) ForceDelete() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *NotificationChannel) pulumi.BoolPtrOutput { return v.ForceDelete }).(pulumi.BoolPtrOutput)
}

// Configuration fields that define the channel and its behavior. The
// permissible and required labels are specified in the
// NotificationChannelDescriptor corresponding to the type field.
// Labels with sensitive data are obfuscated by the API and therefore the provider cannot
// determine if there are upstream changes to these fields. They can also be configured via
// the sensitiveLabels block, but cannot be configured in both places.
func (o NotificationChannelOutput) Labels() pulumi.StringMapOutput {
	return o.ApplyT(func(v *NotificationChannel) pulumi.StringMapOutput { return v.Labels }).(pulumi.StringMapOutput)
}

// The full REST resource name for this channel. The syntax is:
// projects/[PROJECT_ID]/notificationChannels/[CHANNEL_ID]
// The [CHANNEL_ID] is automatically assigned by the server on creation.
func (o NotificationChannelOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *NotificationChannel) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The ID of the project in which the resource belongs.
// If it is not provided, the provider project is used.
func (o NotificationChannelOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *NotificationChannel) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// Different notification type behaviors are configured primarily using the the `labels` field on this
// resource. This block contains the labels which contain secrets or passwords so that they can be marked
// sensitive and hidden from plan output. The name of the field, eg: password, will be the key
// in the `labels` map in the api request.
// Credentials may not be specified in both locations and will cause an error. Changing from one location
// to a different credential configuration in the config will require an apply to update state.
// Structure is documented below.
func (o NotificationChannelOutput) SensitiveLabels() NotificationChannelSensitiveLabelsPtrOutput {
	return o.ApplyT(func(v *NotificationChannel) NotificationChannelSensitiveLabelsPtrOutput { return v.SensitiveLabels }).(NotificationChannelSensitiveLabelsPtrOutput)
}

// The type of the notification channel. This field matches the value of the NotificationChannelDescriptor.type field. See https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.notificationChannelDescriptors/list to get the list of valid values such as "email", "slack", etc...
func (o NotificationChannelOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *NotificationChannel) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

// User-supplied key/value data that does not need to conform to the corresponding NotificationChannelDescriptor's schema, unlike the labels field. This field is intended to be used for organizing and identifying the NotificationChannel objects.The field can contain up to 64 entries. Each key and value is limited to 63 Unicode characters or 128 bytes, whichever is smaller. Labels and values can contain only lowercase letters, numerals, underscores, and dashes. Keys must begin with a letter.
func (o NotificationChannelOutput) UserLabels() pulumi.StringMapOutput {
	return o.ApplyT(func(v *NotificationChannel) pulumi.StringMapOutput { return v.UserLabels }).(pulumi.StringMapOutput)
}

// Indicates whether this channel has been verified or not. On a ListNotificationChannels or GetNotificationChannel operation, this field is expected to be populated.If the value is UNVERIFIED, then it indicates that the channel is non-functioning (it both requires verification and lacks verification); otherwise, it is assumed that the channel works.If the channel is neither VERIFIED nor UNVERIFIED, it implies that the channel is of a type that does not require verification or that this specific channel has been exempted from verification because it was created prior to verification being required for channels of this type.This field cannot be modified using a standard UpdateNotificationChannel operation. To change the value of this field, you must call VerifyNotificationChannel.
func (o NotificationChannelOutput) VerificationStatus() pulumi.StringOutput {
	return o.ApplyT(func(v *NotificationChannel) pulumi.StringOutput { return v.VerificationStatus }).(pulumi.StringOutput)
}

type NotificationChannelArrayOutput struct{ *pulumi.OutputState }

func (NotificationChannelArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NotificationChannel)(nil)).Elem()
}

func (o NotificationChannelArrayOutput) ToNotificationChannelArrayOutput() NotificationChannelArrayOutput {
	return o
}

func (o NotificationChannelArrayOutput) ToNotificationChannelArrayOutputWithContext(ctx context.Context) NotificationChannelArrayOutput {
	return o
}

func (o NotificationChannelArrayOutput) Index(i pulumi.IntInput) NotificationChannelOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *NotificationChannel {
		return vs[0].([]*NotificationChannel)[vs[1].(int)]
	}).(NotificationChannelOutput)
}

type NotificationChannelMapOutput struct{ *pulumi.OutputState }

func (NotificationChannelMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NotificationChannel)(nil)).Elem()
}

func (o NotificationChannelMapOutput) ToNotificationChannelMapOutput() NotificationChannelMapOutput {
	return o
}

func (o NotificationChannelMapOutput) ToNotificationChannelMapOutputWithContext(ctx context.Context) NotificationChannelMapOutput {
	return o
}

func (o NotificationChannelMapOutput) MapIndex(k pulumi.StringInput) NotificationChannelOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *NotificationChannel {
		return vs[0].(map[string]*NotificationChannel)[vs[1].(string)]
	}).(NotificationChannelOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*NotificationChannelInput)(nil)).Elem(), &NotificationChannel{})
	pulumi.RegisterInputType(reflect.TypeOf((*NotificationChannelArrayInput)(nil)).Elem(), NotificationChannelArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*NotificationChannelMapInput)(nil)).Elem(), NotificationChannelMap{})
	pulumi.RegisterOutputType(NotificationChannelOutput{})
	pulumi.RegisterOutputType(NotificationChannelArrayOutput{})
	pulumi.RegisterOutputType(NotificationChannelMapOutput{})
}
