// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package identityplatform

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Identity Platform configuration for a Cloud project. Identity Platform is an
// end-to-end authentication system for third-party users to access apps
// and services.
//
// This entity is created only once during intialization and cannot be deleted,
// individual Identity Providers may be disabled instead.  This resource may only
// be created in billing-enabled projects.
//
// To get more information about Config, see:
//
// * [API documentation](https://cloud.google.com/identity-platform/docs/reference/rest/v2/Config)
// * How-to Guides
//   - [Official Documentation](https://cloud.google.com/identity-platform/docs)
//
// ## Example Usage
//
// ### Identity Platform Config Basic
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/identityplatform"
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/organizations"
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/projects"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_default, err := organizations.NewProject(ctx, "default", &organizations.ProjectArgs{
//				ProjectId:      pulumi.String("my-project"),
//				Name:           pulumi.String("my-project"),
//				OrgId:          pulumi.String("123456789"),
//				BillingAccount: pulumi.String("000000-0000000-0000000-000000"),
//				DeletionPolicy: pulumi.String("DELETE"),
//				Labels: pulumi.StringMap{
//					"firebase": pulumi.String("enabled"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = projects.NewService(ctx, "identitytoolkit", &projects.ServiceArgs{
//				Project: _default.ProjectId,
//				Service: pulumi.String("identitytoolkit.googleapis.com"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = identityplatform.NewConfig(ctx, "default", &identityplatform.ConfigArgs{
//				Project:                  _default.ProjectId,
//				AutodeleteAnonymousUsers: pulumi.Bool(true),
//				SignIn: &identityplatform.ConfigSignInArgs{
//					AllowDuplicateEmails: pulumi.Bool(true),
//					Anonymous: &identityplatform.ConfigSignInAnonymousArgs{
//						Enabled: pulumi.Bool(true),
//					},
//					Email: &identityplatform.ConfigSignInEmailArgs{
//						Enabled:          pulumi.Bool(true),
//						PasswordRequired: pulumi.Bool(false),
//					},
//					PhoneNumber: &identityplatform.ConfigSignInPhoneNumberArgs{
//						Enabled: pulumi.Bool(true),
//						TestPhoneNumbers: pulumi.StringMap{
//							"+11231231234": pulumi.String("000000"),
//						},
//					},
//				},
//				SmsRegionConfig: &identityplatform.ConfigSmsRegionConfigArgs{
//					AllowlistOnly: &identityplatform.ConfigSmsRegionConfigAllowlistOnlyArgs{
//						AllowedRegions: pulumi.StringArray{
//							pulumi.String("US"),
//							pulumi.String("CA"),
//						},
//					},
//				},
//				BlockingFunctions: &identityplatform.ConfigBlockingFunctionsArgs{
//					Triggers: identityplatform.ConfigBlockingFunctionsTriggerArray{
//						&identityplatform.ConfigBlockingFunctionsTriggerArgs{
//							EventType:   pulumi.String("beforeSignIn"),
//							FunctionUri: pulumi.String("https://us-east1-my-project.cloudfunctions.net/before-sign-in"),
//						},
//					},
//					ForwardInboundCredentials: &identityplatform.ConfigBlockingFunctionsForwardInboundCredentialsArgs{
//						RefreshToken: pulumi.Bool(true),
//						AccessToken:  pulumi.Bool(true),
//						IdToken:      pulumi.Bool(true),
//					},
//				},
//				Quota: &identityplatform.ConfigQuotaArgs{
//					SignUpQuotaConfig: &identityplatform.ConfigQuotaSignUpQuotaConfigArgs{
//						Quota:         pulumi.Int(1000),
//						StartTime:     pulumi.String("2014-10-02T15:01:23Z"),
//						QuotaDuration: pulumi.String("7200s"),
//					},
//				},
//				AuthorizedDomains: pulumi.StringArray{
//					pulumi.String("localhost"),
//					pulumi.String("my-project.firebaseapp.com"),
//					pulumi.String("my-project.web.app"),
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
// Config can be imported using any of these accepted formats:
//
// * `projects/{{project}}/config`
//
// * `projects/{{project}}`
//
// * `{{project}}`
//
// When using the `pulumi import` command, Config can be imported using one of the formats above. For example:
//
// ```sh
// $ pulumi import gcp:identityplatform/config:Config default projects/{{project}}/config
// ```
//
// ```sh
// $ pulumi import gcp:identityplatform/config:Config default projects/{{project}}
// ```
//
// ```sh
// $ pulumi import gcp:identityplatform/config:Config default {{project}}
// ```
type Config struct {
	pulumi.CustomResourceState

	// List of domains authorized for OAuth redirects.
	AuthorizedDomains pulumi.StringArrayOutput `pulumi:"authorizedDomains"`
	// Whether anonymous users will be auto-deleted after a period of 30 days
	AutodeleteAnonymousUsers pulumi.BoolPtrOutput `pulumi:"autodeleteAnonymousUsers"`
	// Configuration related to blocking functions.
	// Structure is documented below.
	BlockingFunctions ConfigBlockingFunctionsPtrOutput `pulumi:"blockingFunctions"`
	// Options related to how clients making requests on behalf of a project should be configured.
	// Structure is documented below.
	Client ConfigClientOutput `pulumi:"client"`
	// Options related to how clients making requests on behalf of a project should be configured.
	// Structure is documented below.
	Mfa ConfigMfaOutput `pulumi:"mfa"`
	// Configuration related to monitoring project activity.
	// Structure is documented below.
	Monitoring ConfigMonitoringOutput `pulumi:"monitoring"`
	// Configuration related to multi-tenant functionality.
	// Structure is documented below.
	MultiTenant ConfigMultiTenantPtrOutput `pulumi:"multiTenant"`
	// The name of the Config resource
	Name pulumi.StringOutput `pulumi:"name"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringOutput `pulumi:"project"`
	// Configuration related to quotas.
	// Structure is documented below.
	Quota ConfigQuotaPtrOutput `pulumi:"quota"`
	// Configuration related to local sign in methods.
	// Structure is documented below.
	SignIn ConfigSignInOutput `pulumi:"signIn"`
	// Configures the regions where users are allowed to send verification SMS for the project or tenant. This is based on the calling code of the destination phone number.
	// Structure is documented below.
	SmsRegionConfig ConfigSmsRegionConfigOutput `pulumi:"smsRegionConfig"`
}

// NewConfig registers a new resource with the given unique name, arguments, and options.
func NewConfig(ctx *pulumi.Context,
	name string, args *ConfigArgs, opts ...pulumi.ResourceOption) (*Config, error) {
	if args == nil {
		args = &ConfigArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Config
	err := ctx.RegisterResource("gcp:identityplatform/config:Config", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetConfig gets an existing Config resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetConfig(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ConfigState, opts ...pulumi.ResourceOption) (*Config, error) {
	var resource Config
	err := ctx.ReadResource("gcp:identityplatform/config:Config", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Config resources.
type configState struct {
	// List of domains authorized for OAuth redirects.
	AuthorizedDomains []string `pulumi:"authorizedDomains"`
	// Whether anonymous users will be auto-deleted after a period of 30 days
	AutodeleteAnonymousUsers *bool `pulumi:"autodeleteAnonymousUsers"`
	// Configuration related to blocking functions.
	// Structure is documented below.
	BlockingFunctions *ConfigBlockingFunctions `pulumi:"blockingFunctions"`
	// Options related to how clients making requests on behalf of a project should be configured.
	// Structure is documented below.
	Client *ConfigClient `pulumi:"client"`
	// Options related to how clients making requests on behalf of a project should be configured.
	// Structure is documented below.
	Mfa *ConfigMfa `pulumi:"mfa"`
	// Configuration related to monitoring project activity.
	// Structure is documented below.
	Monitoring *ConfigMonitoring `pulumi:"monitoring"`
	// Configuration related to multi-tenant functionality.
	// Structure is documented below.
	MultiTenant *ConfigMultiTenant `pulumi:"multiTenant"`
	// The name of the Config resource
	Name *string `pulumi:"name"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
	// Configuration related to quotas.
	// Structure is documented below.
	Quota *ConfigQuota `pulumi:"quota"`
	// Configuration related to local sign in methods.
	// Structure is documented below.
	SignIn *ConfigSignIn `pulumi:"signIn"`
	// Configures the regions where users are allowed to send verification SMS for the project or tenant. This is based on the calling code of the destination phone number.
	// Structure is documented below.
	SmsRegionConfig *ConfigSmsRegionConfig `pulumi:"smsRegionConfig"`
}

type ConfigState struct {
	// List of domains authorized for OAuth redirects.
	AuthorizedDomains pulumi.StringArrayInput
	// Whether anonymous users will be auto-deleted after a period of 30 days
	AutodeleteAnonymousUsers pulumi.BoolPtrInput
	// Configuration related to blocking functions.
	// Structure is documented below.
	BlockingFunctions ConfigBlockingFunctionsPtrInput
	// Options related to how clients making requests on behalf of a project should be configured.
	// Structure is documented below.
	Client ConfigClientPtrInput
	// Options related to how clients making requests on behalf of a project should be configured.
	// Structure is documented below.
	Mfa ConfigMfaPtrInput
	// Configuration related to monitoring project activity.
	// Structure is documented below.
	Monitoring ConfigMonitoringPtrInput
	// Configuration related to multi-tenant functionality.
	// Structure is documented below.
	MultiTenant ConfigMultiTenantPtrInput
	// The name of the Config resource
	Name pulumi.StringPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
	// Configuration related to quotas.
	// Structure is documented below.
	Quota ConfigQuotaPtrInput
	// Configuration related to local sign in methods.
	// Structure is documented below.
	SignIn ConfigSignInPtrInput
	// Configures the regions where users are allowed to send verification SMS for the project or tenant. This is based on the calling code of the destination phone number.
	// Structure is documented below.
	SmsRegionConfig ConfigSmsRegionConfigPtrInput
}

func (ConfigState) ElementType() reflect.Type {
	return reflect.TypeOf((*configState)(nil)).Elem()
}

type configArgs struct {
	// List of domains authorized for OAuth redirects.
	AuthorizedDomains []string `pulumi:"authorizedDomains"`
	// Whether anonymous users will be auto-deleted after a period of 30 days
	AutodeleteAnonymousUsers *bool `pulumi:"autodeleteAnonymousUsers"`
	// Configuration related to blocking functions.
	// Structure is documented below.
	BlockingFunctions *ConfigBlockingFunctions `pulumi:"blockingFunctions"`
	// Options related to how clients making requests on behalf of a project should be configured.
	// Structure is documented below.
	Client *ConfigClient `pulumi:"client"`
	// Options related to how clients making requests on behalf of a project should be configured.
	// Structure is documented below.
	Mfa *ConfigMfa `pulumi:"mfa"`
	// Configuration related to monitoring project activity.
	// Structure is documented below.
	Monitoring *ConfigMonitoring `pulumi:"monitoring"`
	// Configuration related to multi-tenant functionality.
	// Structure is documented below.
	MultiTenant *ConfigMultiTenant `pulumi:"multiTenant"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
	// Configuration related to quotas.
	// Structure is documented below.
	Quota *ConfigQuota `pulumi:"quota"`
	// Configuration related to local sign in methods.
	// Structure is documented below.
	SignIn *ConfigSignIn `pulumi:"signIn"`
	// Configures the regions where users are allowed to send verification SMS for the project or tenant. This is based on the calling code of the destination phone number.
	// Structure is documented below.
	SmsRegionConfig *ConfigSmsRegionConfig `pulumi:"smsRegionConfig"`
}

// The set of arguments for constructing a Config resource.
type ConfigArgs struct {
	// List of domains authorized for OAuth redirects.
	AuthorizedDomains pulumi.StringArrayInput
	// Whether anonymous users will be auto-deleted after a period of 30 days
	AutodeleteAnonymousUsers pulumi.BoolPtrInput
	// Configuration related to blocking functions.
	// Structure is documented below.
	BlockingFunctions ConfigBlockingFunctionsPtrInput
	// Options related to how clients making requests on behalf of a project should be configured.
	// Structure is documented below.
	Client ConfigClientPtrInput
	// Options related to how clients making requests on behalf of a project should be configured.
	// Structure is documented below.
	Mfa ConfigMfaPtrInput
	// Configuration related to monitoring project activity.
	// Structure is documented below.
	Monitoring ConfigMonitoringPtrInput
	// Configuration related to multi-tenant functionality.
	// Structure is documented below.
	MultiTenant ConfigMultiTenantPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
	// Configuration related to quotas.
	// Structure is documented below.
	Quota ConfigQuotaPtrInput
	// Configuration related to local sign in methods.
	// Structure is documented below.
	SignIn ConfigSignInPtrInput
	// Configures the regions where users are allowed to send verification SMS for the project or tenant. This is based on the calling code of the destination phone number.
	// Structure is documented below.
	SmsRegionConfig ConfigSmsRegionConfigPtrInput
}

func (ConfigArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*configArgs)(nil)).Elem()
}

type ConfigInput interface {
	pulumi.Input

	ToConfigOutput() ConfigOutput
	ToConfigOutputWithContext(ctx context.Context) ConfigOutput
}

func (*Config) ElementType() reflect.Type {
	return reflect.TypeOf((**Config)(nil)).Elem()
}

func (i *Config) ToConfigOutput() ConfigOutput {
	return i.ToConfigOutputWithContext(context.Background())
}

func (i *Config) ToConfigOutputWithContext(ctx context.Context) ConfigOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConfigOutput)
}

// ConfigArrayInput is an input type that accepts ConfigArray and ConfigArrayOutput values.
// You can construct a concrete instance of `ConfigArrayInput` via:
//
//	ConfigArray{ ConfigArgs{...} }
type ConfigArrayInput interface {
	pulumi.Input

	ToConfigArrayOutput() ConfigArrayOutput
	ToConfigArrayOutputWithContext(context.Context) ConfigArrayOutput
}

type ConfigArray []ConfigInput

func (ConfigArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Config)(nil)).Elem()
}

func (i ConfigArray) ToConfigArrayOutput() ConfigArrayOutput {
	return i.ToConfigArrayOutputWithContext(context.Background())
}

func (i ConfigArray) ToConfigArrayOutputWithContext(ctx context.Context) ConfigArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConfigArrayOutput)
}

// ConfigMapInput is an input type that accepts ConfigMap and ConfigMapOutput values.
// You can construct a concrete instance of `ConfigMapInput` via:
//
//	ConfigMap{ "key": ConfigArgs{...} }
type ConfigMapInput interface {
	pulumi.Input

	ToConfigMapOutput() ConfigMapOutput
	ToConfigMapOutputWithContext(context.Context) ConfigMapOutput
}

type ConfigMap map[string]ConfigInput

func (ConfigMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Config)(nil)).Elem()
}

func (i ConfigMap) ToConfigMapOutput() ConfigMapOutput {
	return i.ToConfigMapOutputWithContext(context.Background())
}

func (i ConfigMap) ToConfigMapOutputWithContext(ctx context.Context) ConfigMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConfigMapOutput)
}

type ConfigOutput struct{ *pulumi.OutputState }

func (ConfigOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Config)(nil)).Elem()
}

func (o ConfigOutput) ToConfigOutput() ConfigOutput {
	return o
}

func (o ConfigOutput) ToConfigOutputWithContext(ctx context.Context) ConfigOutput {
	return o
}

// List of domains authorized for OAuth redirects.
func (o ConfigOutput) AuthorizedDomains() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Config) pulumi.StringArrayOutput { return v.AuthorizedDomains }).(pulumi.StringArrayOutput)
}

// Whether anonymous users will be auto-deleted after a period of 30 days
func (o ConfigOutput) AutodeleteAnonymousUsers() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Config) pulumi.BoolPtrOutput { return v.AutodeleteAnonymousUsers }).(pulumi.BoolPtrOutput)
}

// Configuration related to blocking functions.
// Structure is documented below.
func (o ConfigOutput) BlockingFunctions() ConfigBlockingFunctionsPtrOutput {
	return o.ApplyT(func(v *Config) ConfigBlockingFunctionsPtrOutput { return v.BlockingFunctions }).(ConfigBlockingFunctionsPtrOutput)
}

// Options related to how clients making requests on behalf of a project should be configured.
// Structure is documented below.
func (o ConfigOutput) Client() ConfigClientOutput {
	return o.ApplyT(func(v *Config) ConfigClientOutput { return v.Client }).(ConfigClientOutput)
}

// Options related to how clients making requests on behalf of a project should be configured.
// Structure is documented below.
func (o ConfigOutput) Mfa() ConfigMfaOutput {
	return o.ApplyT(func(v *Config) ConfigMfaOutput { return v.Mfa }).(ConfigMfaOutput)
}

// Configuration related to monitoring project activity.
// Structure is documented below.
func (o ConfigOutput) Monitoring() ConfigMonitoringOutput {
	return o.ApplyT(func(v *Config) ConfigMonitoringOutput { return v.Monitoring }).(ConfigMonitoringOutput)
}

// Configuration related to multi-tenant functionality.
// Structure is documented below.
func (o ConfigOutput) MultiTenant() ConfigMultiTenantPtrOutput {
	return o.ApplyT(func(v *Config) ConfigMultiTenantPtrOutput { return v.MultiTenant }).(ConfigMultiTenantPtrOutput)
}

// The name of the Config resource
func (o ConfigOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Config) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The ID of the project in which the resource belongs.
// If it is not provided, the provider project is used.
func (o ConfigOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *Config) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// Configuration related to quotas.
// Structure is documented below.
func (o ConfigOutput) Quota() ConfigQuotaPtrOutput {
	return o.ApplyT(func(v *Config) ConfigQuotaPtrOutput { return v.Quota }).(ConfigQuotaPtrOutput)
}

// Configuration related to local sign in methods.
// Structure is documented below.
func (o ConfigOutput) SignIn() ConfigSignInOutput {
	return o.ApplyT(func(v *Config) ConfigSignInOutput { return v.SignIn }).(ConfigSignInOutput)
}

// Configures the regions where users are allowed to send verification SMS for the project or tenant. This is based on the calling code of the destination phone number.
// Structure is documented below.
func (o ConfigOutput) SmsRegionConfig() ConfigSmsRegionConfigOutput {
	return o.ApplyT(func(v *Config) ConfigSmsRegionConfigOutput { return v.SmsRegionConfig }).(ConfigSmsRegionConfigOutput)
}

type ConfigArrayOutput struct{ *pulumi.OutputState }

func (ConfigArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Config)(nil)).Elem()
}

func (o ConfigArrayOutput) ToConfigArrayOutput() ConfigArrayOutput {
	return o
}

func (o ConfigArrayOutput) ToConfigArrayOutputWithContext(ctx context.Context) ConfigArrayOutput {
	return o
}

func (o ConfigArrayOutput) Index(i pulumi.IntInput) ConfigOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Config {
		return vs[0].([]*Config)[vs[1].(int)]
	}).(ConfigOutput)
}

type ConfigMapOutput struct{ *pulumi.OutputState }

func (ConfigMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Config)(nil)).Elem()
}

func (o ConfigMapOutput) ToConfigMapOutput() ConfigMapOutput {
	return o
}

func (o ConfigMapOutput) ToConfigMapOutputWithContext(ctx context.Context) ConfigMapOutput {
	return o
}

func (o ConfigMapOutput) MapIndex(k pulumi.StringInput) ConfigOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Config {
		return vs[0].(map[string]*Config)[vs[1].(string)]
	}).(ConfigOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ConfigInput)(nil)).Elem(), &Config{})
	pulumi.RegisterInputType(reflect.TypeOf((*ConfigArrayInput)(nil)).Elem(), ConfigArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ConfigMapInput)(nil)).Elem(), ConfigMap{})
	pulumi.RegisterOutputType(ConfigOutput{})
	pulumi.RegisterOutputType(ConfigArrayOutput{})
	pulumi.RegisterOutputType(ConfigMapOutput{})
}
