// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package logging

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Default resource settings control whether CMEK is required for new log buckets. These settings also determine the storage location for the _Default and _Required log buckets, and whether the _Default sink is enabled or disabled.
//
// To get more information about OrganizationSettings, see:
//
// * [API documentation](https://cloud.google.com/logging/docs/reference/v2/rest/v2/TopLevel/getSettings)
// * How-to Guides
//   - [Configure default settings for organizations and folders](https://cloud.google.com/logging/docs/default-settings)
//
// ## Example Usage
//
// ### Logging Organization Settings All
//
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/kms"
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/logging"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			settings, err := logging.LookupOrganizationSettings(ctx, &logging.LookupOrganizationSettingsArgs{
//				Organization: "123456789",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			iam, err := kms.NewCryptoKeyIAMMember(ctx, "iam", &kms.CryptoKeyIAMMemberArgs{
//				CryptoKeyId: pulumi.String("kms-key"),
//				Role:        pulumi.String("roles/cloudkms.cryptoKeyEncrypterDecrypter"),
//				Member:      pulumi.Sprintf("serviceAccount:%v", settings.KmsServiceAccountId),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = logging.NewOrganizationSettings(ctx, "example", &logging.OrganizationSettingsArgs{
//				DisableDefaultSink: pulumi.Bool(true),
//				KmsKeyName:         pulumi.String("kms-key"),
//				Organization:       pulumi.String("123456789"),
//				StorageLocation:    pulumi.String("us-central1"),
//			}, pulumi.DependsOn([]pulumi.Resource{
//				iam,
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
// OrganizationSettings can be imported using any of these accepted formats:
//
// * `organizations/{{organization}}/settings`
//
// * `{{organization}}`
//
// When using the `pulumi import` command, OrganizationSettings can be imported using one of the formats above. For example:
//
// ```sh
// $ pulumi import gcp:logging/organizationSettings:OrganizationSettings default organizations/{{organization}}/settings
// ```
//
// ```sh
// $ pulumi import gcp:logging/organizationSettings:OrganizationSettings default {{organization}}
// ```
type OrganizationSettings struct {
	pulumi.CustomResourceState

	// If set to true, the _Default sink in newly created projects and folders will created in a disabled state. This can be used to automatically disable log storage if there is already an aggregated sink configured in the hierarchy. The _Default sink can be re-enabled manually if needed.
	DisableDefaultSink pulumi.BoolOutput `pulumi:"disableDefaultSink"`
	// The resource name for the configured Cloud KMS key.
	KmsKeyName pulumi.StringOutput `pulumi:"kmsKeyName"`
	// The service account that will be used by the Log Router to access your Cloud KMS key.
	KmsServiceAccountId pulumi.StringOutput `pulumi:"kmsServiceAccountId"`
	// The service account for the given container. Sinks use this service account as their writerIdentity if no custom service account is provided.
	LoggingServiceAccountId pulumi.StringOutput `pulumi:"loggingServiceAccountId"`
	// The resource name of the settings.
	Name pulumi.StringOutput `pulumi:"name"`
	// The organization for which to retrieve or configure settings.
	Organization pulumi.StringOutput `pulumi:"organization"`
	// The storage location that Cloud Logging will use to create new resources when a location is needed but not explicitly provided.
	StorageLocation pulumi.StringOutput `pulumi:"storageLocation"`
}

// NewOrganizationSettings registers a new resource with the given unique name, arguments, and options.
func NewOrganizationSettings(ctx *pulumi.Context,
	name string, args *OrganizationSettingsArgs, opts ...pulumi.ResourceOption) (*OrganizationSettings, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Organization == nil {
		return nil, errors.New("invalid value for required argument 'Organization'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource OrganizationSettings
	err := ctx.RegisterResource("gcp:logging/organizationSettings:OrganizationSettings", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetOrganizationSettings gets an existing OrganizationSettings resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetOrganizationSettings(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *OrganizationSettingsState, opts ...pulumi.ResourceOption) (*OrganizationSettings, error) {
	var resource OrganizationSettings
	err := ctx.ReadResource("gcp:logging/organizationSettings:OrganizationSettings", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering OrganizationSettings resources.
type organizationSettingsState struct {
	// If set to true, the _Default sink in newly created projects and folders will created in a disabled state. This can be used to automatically disable log storage if there is already an aggregated sink configured in the hierarchy. The _Default sink can be re-enabled manually if needed.
	DisableDefaultSink *bool `pulumi:"disableDefaultSink"`
	// The resource name for the configured Cloud KMS key.
	KmsKeyName *string `pulumi:"kmsKeyName"`
	// The service account that will be used by the Log Router to access your Cloud KMS key.
	KmsServiceAccountId *string `pulumi:"kmsServiceAccountId"`
	// The service account for the given container. Sinks use this service account as their writerIdentity if no custom service account is provided.
	LoggingServiceAccountId *string `pulumi:"loggingServiceAccountId"`
	// The resource name of the settings.
	Name *string `pulumi:"name"`
	// The organization for which to retrieve or configure settings.
	Organization *string `pulumi:"organization"`
	// The storage location that Cloud Logging will use to create new resources when a location is needed but not explicitly provided.
	StorageLocation *string `pulumi:"storageLocation"`
}

type OrganizationSettingsState struct {
	// If set to true, the _Default sink in newly created projects and folders will created in a disabled state. This can be used to automatically disable log storage if there is already an aggregated sink configured in the hierarchy. The _Default sink can be re-enabled manually if needed.
	DisableDefaultSink pulumi.BoolPtrInput
	// The resource name for the configured Cloud KMS key.
	KmsKeyName pulumi.StringPtrInput
	// The service account that will be used by the Log Router to access your Cloud KMS key.
	KmsServiceAccountId pulumi.StringPtrInput
	// The service account for the given container. Sinks use this service account as their writerIdentity if no custom service account is provided.
	LoggingServiceAccountId pulumi.StringPtrInput
	// The resource name of the settings.
	Name pulumi.StringPtrInput
	// The organization for which to retrieve or configure settings.
	Organization pulumi.StringPtrInput
	// The storage location that Cloud Logging will use to create new resources when a location is needed but not explicitly provided.
	StorageLocation pulumi.StringPtrInput
}

func (OrganizationSettingsState) ElementType() reflect.Type {
	return reflect.TypeOf((*organizationSettingsState)(nil)).Elem()
}

type organizationSettingsArgs struct {
	// If set to true, the _Default sink in newly created projects and folders will created in a disabled state. This can be used to automatically disable log storage if there is already an aggregated sink configured in the hierarchy. The _Default sink can be re-enabled manually if needed.
	DisableDefaultSink *bool `pulumi:"disableDefaultSink"`
	// The resource name for the configured Cloud KMS key.
	KmsKeyName *string `pulumi:"kmsKeyName"`
	// The organization for which to retrieve or configure settings.
	Organization string `pulumi:"organization"`
	// The storage location that Cloud Logging will use to create new resources when a location is needed but not explicitly provided.
	StorageLocation *string `pulumi:"storageLocation"`
}

// The set of arguments for constructing a OrganizationSettings resource.
type OrganizationSettingsArgs struct {
	// If set to true, the _Default sink in newly created projects and folders will created in a disabled state. This can be used to automatically disable log storage if there is already an aggregated sink configured in the hierarchy. The _Default sink can be re-enabled manually if needed.
	DisableDefaultSink pulumi.BoolPtrInput
	// The resource name for the configured Cloud KMS key.
	KmsKeyName pulumi.StringPtrInput
	// The organization for which to retrieve or configure settings.
	Organization pulumi.StringInput
	// The storage location that Cloud Logging will use to create new resources when a location is needed but not explicitly provided.
	StorageLocation pulumi.StringPtrInput
}

func (OrganizationSettingsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*organizationSettingsArgs)(nil)).Elem()
}

type OrganizationSettingsInput interface {
	pulumi.Input

	ToOrganizationSettingsOutput() OrganizationSettingsOutput
	ToOrganizationSettingsOutputWithContext(ctx context.Context) OrganizationSettingsOutput
}

func (*OrganizationSettings) ElementType() reflect.Type {
	return reflect.TypeOf((**OrganizationSettings)(nil)).Elem()
}

func (i *OrganizationSettings) ToOrganizationSettingsOutput() OrganizationSettingsOutput {
	return i.ToOrganizationSettingsOutputWithContext(context.Background())
}

func (i *OrganizationSettings) ToOrganizationSettingsOutputWithContext(ctx context.Context) OrganizationSettingsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OrganizationSettingsOutput)
}

// OrganizationSettingsArrayInput is an input type that accepts OrganizationSettingsArray and OrganizationSettingsArrayOutput values.
// You can construct a concrete instance of `OrganizationSettingsArrayInput` via:
//
//	OrganizationSettingsArray{ OrganizationSettingsArgs{...} }
type OrganizationSettingsArrayInput interface {
	pulumi.Input

	ToOrganizationSettingsArrayOutput() OrganizationSettingsArrayOutput
	ToOrganizationSettingsArrayOutputWithContext(context.Context) OrganizationSettingsArrayOutput
}

type OrganizationSettingsArray []OrganizationSettingsInput

func (OrganizationSettingsArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OrganizationSettings)(nil)).Elem()
}

func (i OrganizationSettingsArray) ToOrganizationSettingsArrayOutput() OrganizationSettingsArrayOutput {
	return i.ToOrganizationSettingsArrayOutputWithContext(context.Background())
}

func (i OrganizationSettingsArray) ToOrganizationSettingsArrayOutputWithContext(ctx context.Context) OrganizationSettingsArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OrganizationSettingsArrayOutput)
}

// OrganizationSettingsMapInput is an input type that accepts OrganizationSettingsMap and OrganizationSettingsMapOutput values.
// You can construct a concrete instance of `OrganizationSettingsMapInput` via:
//
//	OrganizationSettingsMap{ "key": OrganizationSettingsArgs{...} }
type OrganizationSettingsMapInput interface {
	pulumi.Input

	ToOrganizationSettingsMapOutput() OrganizationSettingsMapOutput
	ToOrganizationSettingsMapOutputWithContext(context.Context) OrganizationSettingsMapOutput
}

type OrganizationSettingsMap map[string]OrganizationSettingsInput

func (OrganizationSettingsMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OrganizationSettings)(nil)).Elem()
}

func (i OrganizationSettingsMap) ToOrganizationSettingsMapOutput() OrganizationSettingsMapOutput {
	return i.ToOrganizationSettingsMapOutputWithContext(context.Background())
}

func (i OrganizationSettingsMap) ToOrganizationSettingsMapOutputWithContext(ctx context.Context) OrganizationSettingsMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OrganizationSettingsMapOutput)
}

type OrganizationSettingsOutput struct{ *pulumi.OutputState }

func (OrganizationSettingsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**OrganizationSettings)(nil)).Elem()
}

func (o OrganizationSettingsOutput) ToOrganizationSettingsOutput() OrganizationSettingsOutput {
	return o
}

func (o OrganizationSettingsOutput) ToOrganizationSettingsOutputWithContext(ctx context.Context) OrganizationSettingsOutput {
	return o
}

// If set to true, the _Default sink in newly created projects and folders will created in a disabled state. This can be used to automatically disable log storage if there is already an aggregated sink configured in the hierarchy. The _Default sink can be re-enabled manually if needed.
func (o OrganizationSettingsOutput) DisableDefaultSink() pulumi.BoolOutput {
	return o.ApplyT(func(v *OrganizationSettings) pulumi.BoolOutput { return v.DisableDefaultSink }).(pulumi.BoolOutput)
}

// The resource name for the configured Cloud KMS key.
func (o OrganizationSettingsOutput) KmsKeyName() pulumi.StringOutput {
	return o.ApplyT(func(v *OrganizationSettings) pulumi.StringOutput { return v.KmsKeyName }).(pulumi.StringOutput)
}

// The service account that will be used by the Log Router to access your Cloud KMS key.
func (o OrganizationSettingsOutput) KmsServiceAccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *OrganizationSettings) pulumi.StringOutput { return v.KmsServiceAccountId }).(pulumi.StringOutput)
}

// The service account for the given container. Sinks use this service account as their writerIdentity if no custom service account is provided.
func (o OrganizationSettingsOutput) LoggingServiceAccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *OrganizationSettings) pulumi.StringOutput { return v.LoggingServiceAccountId }).(pulumi.StringOutput)
}

// The resource name of the settings.
func (o OrganizationSettingsOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *OrganizationSettings) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The organization for which to retrieve or configure settings.
func (o OrganizationSettingsOutput) Organization() pulumi.StringOutput {
	return o.ApplyT(func(v *OrganizationSettings) pulumi.StringOutput { return v.Organization }).(pulumi.StringOutput)
}

// The storage location that Cloud Logging will use to create new resources when a location is needed but not explicitly provided.
func (o OrganizationSettingsOutput) StorageLocation() pulumi.StringOutput {
	return o.ApplyT(func(v *OrganizationSettings) pulumi.StringOutput { return v.StorageLocation }).(pulumi.StringOutput)
}

type OrganizationSettingsArrayOutput struct{ *pulumi.OutputState }

func (OrganizationSettingsArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OrganizationSettings)(nil)).Elem()
}

func (o OrganizationSettingsArrayOutput) ToOrganizationSettingsArrayOutput() OrganizationSettingsArrayOutput {
	return o
}

func (o OrganizationSettingsArrayOutput) ToOrganizationSettingsArrayOutputWithContext(ctx context.Context) OrganizationSettingsArrayOutput {
	return o
}

func (o OrganizationSettingsArrayOutput) Index(i pulumi.IntInput) OrganizationSettingsOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *OrganizationSettings {
		return vs[0].([]*OrganizationSettings)[vs[1].(int)]
	}).(OrganizationSettingsOutput)
}

type OrganizationSettingsMapOutput struct{ *pulumi.OutputState }

func (OrganizationSettingsMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OrganizationSettings)(nil)).Elem()
}

func (o OrganizationSettingsMapOutput) ToOrganizationSettingsMapOutput() OrganizationSettingsMapOutput {
	return o
}

func (o OrganizationSettingsMapOutput) ToOrganizationSettingsMapOutputWithContext(ctx context.Context) OrganizationSettingsMapOutput {
	return o
}

func (o OrganizationSettingsMapOutput) MapIndex(k pulumi.StringInput) OrganizationSettingsOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *OrganizationSettings {
		return vs[0].(map[string]*OrganizationSettings)[vs[1].(string)]
	}).(OrganizationSettingsOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*OrganizationSettingsInput)(nil)).Elem(), &OrganizationSettings{})
	pulumi.RegisterInputType(reflect.TypeOf((*OrganizationSettingsArrayInput)(nil)).Elem(), OrganizationSettingsArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*OrganizationSettingsMapInput)(nil)).Elem(), OrganizationSettingsMap{})
	pulumi.RegisterOutputType(OrganizationSettingsOutput{})
	pulumi.RegisterOutputType(OrganizationSettingsArrayOutput{})
	pulumi.RegisterOutputType(OrganizationSettingsMapOutput{})
}
