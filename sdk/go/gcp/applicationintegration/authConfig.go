// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package applicationintegration

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// The AuthConfig resource use to hold channels and connection config data.
//
// To get more information about AuthConfig, see:
//
// * [API documentation](https://cloud.google.com/application-integration/docs/reference/rest/v1/projects.locations.authConfigs)
// * How-to Guides
//   - [Manage authentication profiles](https://cloud.google.com/application-integration/docs/configure-authentication-profiles)
//   - [Official Documentation](https://cloud.google.com/application-integration/docs/overview)
//
// ## Example Usage
//
// ### Integrations Auth Config Basic
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/applicationintegration"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			client, err := applicationintegration.NewClient(ctx, "client", &applicationintegration.ClientArgs{
//				Location: pulumi.String("us-west1"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = applicationintegration.NewAuthConfig(ctx, "basic_example", &applicationintegration.AuthConfigArgs{
//				Location:    pulumi.String("us-west1"),
//				DisplayName: pulumi.String("test-authconfig"),
//				Description: pulumi.String("Test auth config created via terraform"),
//				DecryptedCredential: &applicationintegration.AuthConfigDecryptedCredentialArgs{
//					CredentialType: pulumi.String("USERNAME_AND_PASSWORD"),
//					UsernameAndPassword: &applicationintegration.AuthConfigDecryptedCredentialUsernameAndPasswordArgs{
//						Username: pulumi.String("test-username"),
//						Password: pulumi.String("test-password"),
//					},
//				},
//			}, pulumi.DependsOn([]pulumi.Resource{
//				client,
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
// AuthConfig can be imported using any of these accepted formats:
//
// * `{{project}}/{{name}}`
//
// * `{{project}} {{name}}`
//
// * `{{name}}`
//
// When using the `pulumi import` command, AuthConfig can be imported using one of the formats above. For example:
//
// ```sh
// $ pulumi import gcp:applicationintegration/authConfig:AuthConfig default {{project}}/{{name}}
// ```
//
// ```sh
// $ pulumi import gcp:applicationintegration/authConfig:AuthConfig default "{{project}} {{name}}"
// ```
//
// ```sh
// $ pulumi import gcp:applicationintegration/authConfig:AuthConfig default {{name}}
// ```
type AuthConfig struct {
	pulumi.CustomResourceState

	// Certificate id for client certificate.
	CertificateId pulumi.StringOutput `pulumi:"certificateId"`
	// Raw client certificate
	// Structure is documented below.
	ClientCertificate AuthConfigClientCertificatePtrOutput `pulumi:"clientCertificate"`
	// The timestamp when the auth config is created.
	// A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// The creator's email address. Generated based on the End User Credentials/LOAS role of the user making the call.
	CreatorEmail pulumi.StringOutput `pulumi:"creatorEmail"`
	// Credential type of the encrypted credential.
	CredentialType pulumi.StringOutput `pulumi:"credentialType"`
	// Raw auth credentials.
	// Structure is documented below.
	DecryptedCredential AuthConfigDecryptedCredentialPtrOutput `pulumi:"decryptedCredential"`
	// A description of the auth config.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The name of the auth config.
	DisplayName pulumi.StringOutput `pulumi:"displayName"`
	// Auth credential encrypted by Cloud KMS. Can be decrypted as Credential with proper KMS key.
	// A base64-encoded string.
	EncryptedCredential pulumi.StringOutput `pulumi:"encryptedCredential"`
	// User can define the time to receive notification after which the auth config becomes invalid. Support up to 30 days. Support granularity in hours.
	// A duration in seconds with up to nine fractional digits, ending with 's'. Example: "3.5s".
	ExpiryNotificationDurations pulumi.StringArrayOutput `pulumi:"expiryNotificationDurations"`
	// The last modifier's email address. Generated based on the End User Credentials/LOAS role of the user making the call.
	LastModifierEmail pulumi.StringOutput `pulumi:"lastModifierEmail"`
	// Location in which client needs to be provisioned.
	Location pulumi.StringOutput `pulumi:"location"`
	// Resource name of the auth config.
	Name pulumi.StringOutput `pulumi:"name"`
	// User provided expiry time to override. For the example of Salesforce, username/password credentials can be valid for 6 months depending on the instance settings.
	// A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
	OverrideValidTime pulumi.StringPtrOutput `pulumi:"overrideValidTime"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringOutput `pulumi:"project"`
	// The reason / details of the current status.
	Reason pulumi.StringOutput `pulumi:"reason"`
	// The status of the auth config.
	State pulumi.StringOutput `pulumi:"state"`
	// The timestamp when the auth config is modified.
	// A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
	UpdateTime pulumi.StringOutput `pulumi:"updateTime"`
	// The time until the auth config is valid. Empty or max value is considered the auth config won't expire.
	// A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
	ValidTime pulumi.StringOutput `pulumi:"validTime"`
	// The visibility of the auth config.
	// Possible values are: `PRIVATE`, `CLIENT_VISIBLE`.
	Visibility pulumi.StringPtrOutput `pulumi:"visibility"`
}

// NewAuthConfig registers a new resource with the given unique name, arguments, and options.
func NewAuthConfig(ctx *pulumi.Context,
	name string, args *AuthConfigArgs, opts ...pulumi.ResourceOption) (*AuthConfig, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DisplayName == nil {
		return nil, errors.New("invalid value for required argument 'DisplayName'")
	}
	if args.Location == nil {
		return nil, errors.New("invalid value for required argument 'Location'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AuthConfig
	err := ctx.RegisterResource("gcp:applicationintegration/authConfig:AuthConfig", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAuthConfig gets an existing AuthConfig resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAuthConfig(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AuthConfigState, opts ...pulumi.ResourceOption) (*AuthConfig, error) {
	var resource AuthConfig
	err := ctx.ReadResource("gcp:applicationintegration/authConfig:AuthConfig", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AuthConfig resources.
type authConfigState struct {
	// Certificate id for client certificate.
	CertificateId *string `pulumi:"certificateId"`
	// Raw client certificate
	// Structure is documented below.
	ClientCertificate *AuthConfigClientCertificate `pulumi:"clientCertificate"`
	// The timestamp when the auth config is created.
	// A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
	CreateTime *string `pulumi:"createTime"`
	// The creator's email address. Generated based on the End User Credentials/LOAS role of the user making the call.
	CreatorEmail *string `pulumi:"creatorEmail"`
	// Credential type of the encrypted credential.
	CredentialType *string `pulumi:"credentialType"`
	// Raw auth credentials.
	// Structure is documented below.
	DecryptedCredential *AuthConfigDecryptedCredential `pulumi:"decryptedCredential"`
	// A description of the auth config.
	Description *string `pulumi:"description"`
	// The name of the auth config.
	DisplayName *string `pulumi:"displayName"`
	// Auth credential encrypted by Cloud KMS. Can be decrypted as Credential with proper KMS key.
	// A base64-encoded string.
	EncryptedCredential *string `pulumi:"encryptedCredential"`
	// User can define the time to receive notification after which the auth config becomes invalid. Support up to 30 days. Support granularity in hours.
	// A duration in seconds with up to nine fractional digits, ending with 's'. Example: "3.5s".
	ExpiryNotificationDurations []string `pulumi:"expiryNotificationDurations"`
	// The last modifier's email address. Generated based on the End User Credentials/LOAS role of the user making the call.
	LastModifierEmail *string `pulumi:"lastModifierEmail"`
	// Location in which client needs to be provisioned.
	Location *string `pulumi:"location"`
	// Resource name of the auth config.
	Name *string `pulumi:"name"`
	// User provided expiry time to override. For the example of Salesforce, username/password credentials can be valid for 6 months depending on the instance settings.
	// A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
	OverrideValidTime *string `pulumi:"overrideValidTime"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
	// The reason / details of the current status.
	Reason *string `pulumi:"reason"`
	// The status of the auth config.
	State *string `pulumi:"state"`
	// The timestamp when the auth config is modified.
	// A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
	UpdateTime *string `pulumi:"updateTime"`
	// The time until the auth config is valid. Empty or max value is considered the auth config won't expire.
	// A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
	ValidTime *string `pulumi:"validTime"`
	// The visibility of the auth config.
	// Possible values are: `PRIVATE`, `CLIENT_VISIBLE`.
	Visibility *string `pulumi:"visibility"`
}

type AuthConfigState struct {
	// Certificate id for client certificate.
	CertificateId pulumi.StringPtrInput
	// Raw client certificate
	// Structure is documented below.
	ClientCertificate AuthConfigClientCertificatePtrInput
	// The timestamp when the auth config is created.
	// A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
	CreateTime pulumi.StringPtrInput
	// The creator's email address. Generated based on the End User Credentials/LOAS role of the user making the call.
	CreatorEmail pulumi.StringPtrInput
	// Credential type of the encrypted credential.
	CredentialType pulumi.StringPtrInput
	// Raw auth credentials.
	// Structure is documented below.
	DecryptedCredential AuthConfigDecryptedCredentialPtrInput
	// A description of the auth config.
	Description pulumi.StringPtrInput
	// The name of the auth config.
	DisplayName pulumi.StringPtrInput
	// Auth credential encrypted by Cloud KMS. Can be decrypted as Credential with proper KMS key.
	// A base64-encoded string.
	EncryptedCredential pulumi.StringPtrInput
	// User can define the time to receive notification after which the auth config becomes invalid. Support up to 30 days. Support granularity in hours.
	// A duration in seconds with up to nine fractional digits, ending with 's'. Example: "3.5s".
	ExpiryNotificationDurations pulumi.StringArrayInput
	// The last modifier's email address. Generated based on the End User Credentials/LOAS role of the user making the call.
	LastModifierEmail pulumi.StringPtrInput
	// Location in which client needs to be provisioned.
	Location pulumi.StringPtrInput
	// Resource name of the auth config.
	Name pulumi.StringPtrInput
	// User provided expiry time to override. For the example of Salesforce, username/password credentials can be valid for 6 months depending on the instance settings.
	// A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
	OverrideValidTime pulumi.StringPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
	// The reason / details of the current status.
	Reason pulumi.StringPtrInput
	// The status of the auth config.
	State pulumi.StringPtrInput
	// The timestamp when the auth config is modified.
	// A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
	UpdateTime pulumi.StringPtrInput
	// The time until the auth config is valid. Empty or max value is considered the auth config won't expire.
	// A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
	ValidTime pulumi.StringPtrInput
	// The visibility of the auth config.
	// Possible values are: `PRIVATE`, `CLIENT_VISIBLE`.
	Visibility pulumi.StringPtrInput
}

func (AuthConfigState) ElementType() reflect.Type {
	return reflect.TypeOf((*authConfigState)(nil)).Elem()
}

type authConfigArgs struct {
	// Raw client certificate
	// Structure is documented below.
	ClientCertificate *AuthConfigClientCertificate `pulumi:"clientCertificate"`
	// Raw auth credentials.
	// Structure is documented below.
	DecryptedCredential *AuthConfigDecryptedCredential `pulumi:"decryptedCredential"`
	// A description of the auth config.
	Description *string `pulumi:"description"`
	// The name of the auth config.
	DisplayName string `pulumi:"displayName"`
	// User can define the time to receive notification after which the auth config becomes invalid. Support up to 30 days. Support granularity in hours.
	// A duration in seconds with up to nine fractional digits, ending with 's'. Example: "3.5s".
	ExpiryNotificationDurations []string `pulumi:"expiryNotificationDurations"`
	// Location in which client needs to be provisioned.
	Location string `pulumi:"location"`
	// User provided expiry time to override. For the example of Salesforce, username/password credentials can be valid for 6 months depending on the instance settings.
	// A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
	OverrideValidTime *string `pulumi:"overrideValidTime"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
	// The visibility of the auth config.
	// Possible values are: `PRIVATE`, `CLIENT_VISIBLE`.
	Visibility *string `pulumi:"visibility"`
}

// The set of arguments for constructing a AuthConfig resource.
type AuthConfigArgs struct {
	// Raw client certificate
	// Structure is documented below.
	ClientCertificate AuthConfigClientCertificatePtrInput
	// Raw auth credentials.
	// Structure is documented below.
	DecryptedCredential AuthConfigDecryptedCredentialPtrInput
	// A description of the auth config.
	Description pulumi.StringPtrInput
	// The name of the auth config.
	DisplayName pulumi.StringInput
	// User can define the time to receive notification after which the auth config becomes invalid. Support up to 30 days. Support granularity in hours.
	// A duration in seconds with up to nine fractional digits, ending with 's'. Example: "3.5s".
	ExpiryNotificationDurations pulumi.StringArrayInput
	// Location in which client needs to be provisioned.
	Location pulumi.StringInput
	// User provided expiry time to override. For the example of Salesforce, username/password credentials can be valid for 6 months depending on the instance settings.
	// A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
	OverrideValidTime pulumi.StringPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
	// The visibility of the auth config.
	// Possible values are: `PRIVATE`, `CLIENT_VISIBLE`.
	Visibility pulumi.StringPtrInput
}

func (AuthConfigArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*authConfigArgs)(nil)).Elem()
}

type AuthConfigInput interface {
	pulumi.Input

	ToAuthConfigOutput() AuthConfigOutput
	ToAuthConfigOutputWithContext(ctx context.Context) AuthConfigOutput
}

func (*AuthConfig) ElementType() reflect.Type {
	return reflect.TypeOf((**AuthConfig)(nil)).Elem()
}

func (i *AuthConfig) ToAuthConfigOutput() AuthConfigOutput {
	return i.ToAuthConfigOutputWithContext(context.Background())
}

func (i *AuthConfig) ToAuthConfigOutputWithContext(ctx context.Context) AuthConfigOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthConfigOutput)
}

// AuthConfigArrayInput is an input type that accepts AuthConfigArray and AuthConfigArrayOutput values.
// You can construct a concrete instance of `AuthConfigArrayInput` via:
//
//	AuthConfigArray{ AuthConfigArgs{...} }
type AuthConfigArrayInput interface {
	pulumi.Input

	ToAuthConfigArrayOutput() AuthConfigArrayOutput
	ToAuthConfigArrayOutputWithContext(context.Context) AuthConfigArrayOutput
}

type AuthConfigArray []AuthConfigInput

func (AuthConfigArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AuthConfig)(nil)).Elem()
}

func (i AuthConfigArray) ToAuthConfigArrayOutput() AuthConfigArrayOutput {
	return i.ToAuthConfigArrayOutputWithContext(context.Background())
}

func (i AuthConfigArray) ToAuthConfigArrayOutputWithContext(ctx context.Context) AuthConfigArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthConfigArrayOutput)
}

// AuthConfigMapInput is an input type that accepts AuthConfigMap and AuthConfigMapOutput values.
// You can construct a concrete instance of `AuthConfigMapInput` via:
//
//	AuthConfigMap{ "key": AuthConfigArgs{...} }
type AuthConfigMapInput interface {
	pulumi.Input

	ToAuthConfigMapOutput() AuthConfigMapOutput
	ToAuthConfigMapOutputWithContext(context.Context) AuthConfigMapOutput
}

type AuthConfigMap map[string]AuthConfigInput

func (AuthConfigMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AuthConfig)(nil)).Elem()
}

func (i AuthConfigMap) ToAuthConfigMapOutput() AuthConfigMapOutput {
	return i.ToAuthConfigMapOutputWithContext(context.Background())
}

func (i AuthConfigMap) ToAuthConfigMapOutputWithContext(ctx context.Context) AuthConfigMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthConfigMapOutput)
}

type AuthConfigOutput struct{ *pulumi.OutputState }

func (AuthConfigOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AuthConfig)(nil)).Elem()
}

func (o AuthConfigOutput) ToAuthConfigOutput() AuthConfigOutput {
	return o
}

func (o AuthConfigOutput) ToAuthConfigOutputWithContext(ctx context.Context) AuthConfigOutput {
	return o
}

// Certificate id for client certificate.
func (o AuthConfigOutput) CertificateId() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfig) pulumi.StringOutput { return v.CertificateId }).(pulumi.StringOutput)
}

// Raw client certificate
// Structure is documented below.
func (o AuthConfigOutput) ClientCertificate() AuthConfigClientCertificatePtrOutput {
	return o.ApplyT(func(v *AuthConfig) AuthConfigClientCertificatePtrOutput { return v.ClientCertificate }).(AuthConfigClientCertificatePtrOutput)
}

// The timestamp when the auth config is created.
// A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
func (o AuthConfigOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfig) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// The creator's email address. Generated based on the End User Credentials/LOAS role of the user making the call.
func (o AuthConfigOutput) CreatorEmail() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfig) pulumi.StringOutput { return v.CreatorEmail }).(pulumi.StringOutput)
}

// Credential type of the encrypted credential.
func (o AuthConfigOutput) CredentialType() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfig) pulumi.StringOutput { return v.CredentialType }).(pulumi.StringOutput)
}

// Raw auth credentials.
// Structure is documented below.
func (o AuthConfigOutput) DecryptedCredential() AuthConfigDecryptedCredentialPtrOutput {
	return o.ApplyT(func(v *AuthConfig) AuthConfigDecryptedCredentialPtrOutput { return v.DecryptedCredential }).(AuthConfigDecryptedCredentialPtrOutput)
}

// A description of the auth config.
func (o AuthConfigOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AuthConfig) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The name of the auth config.
func (o AuthConfigOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfig) pulumi.StringOutput { return v.DisplayName }).(pulumi.StringOutput)
}

// Auth credential encrypted by Cloud KMS. Can be decrypted as Credential with proper KMS key.
// A base64-encoded string.
func (o AuthConfigOutput) EncryptedCredential() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfig) pulumi.StringOutput { return v.EncryptedCredential }).(pulumi.StringOutput)
}

// User can define the time to receive notification after which the auth config becomes invalid. Support up to 30 days. Support granularity in hours.
// A duration in seconds with up to nine fractional digits, ending with 's'. Example: "3.5s".
func (o AuthConfigOutput) ExpiryNotificationDurations() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *AuthConfig) pulumi.StringArrayOutput { return v.ExpiryNotificationDurations }).(pulumi.StringArrayOutput)
}

// The last modifier's email address. Generated based on the End User Credentials/LOAS role of the user making the call.
func (o AuthConfigOutput) LastModifierEmail() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfig) pulumi.StringOutput { return v.LastModifierEmail }).(pulumi.StringOutput)
}

// Location in which client needs to be provisioned.
func (o AuthConfigOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfig) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// Resource name of the auth config.
func (o AuthConfigOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfig) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// User provided expiry time to override. For the example of Salesforce, username/password credentials can be valid for 6 months depending on the instance settings.
// A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
func (o AuthConfigOutput) OverrideValidTime() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AuthConfig) pulumi.StringPtrOutput { return v.OverrideValidTime }).(pulumi.StringPtrOutput)
}

// The ID of the project in which the resource belongs.
// If it is not provided, the provider project is used.
func (o AuthConfigOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfig) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// The reason / details of the current status.
func (o AuthConfigOutput) Reason() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfig) pulumi.StringOutput { return v.Reason }).(pulumi.StringOutput)
}

// The status of the auth config.
func (o AuthConfigOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfig) pulumi.StringOutput { return v.State }).(pulumi.StringOutput)
}

// The timestamp when the auth config is modified.
// A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
func (o AuthConfigOutput) UpdateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfig) pulumi.StringOutput { return v.UpdateTime }).(pulumi.StringOutput)
}

// The time until the auth config is valid. Empty or max value is considered the auth config won't expire.
// A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
func (o AuthConfigOutput) ValidTime() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfig) pulumi.StringOutput { return v.ValidTime }).(pulumi.StringOutput)
}

// The visibility of the auth config.
// Possible values are: `PRIVATE`, `CLIENT_VISIBLE`.
func (o AuthConfigOutput) Visibility() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AuthConfig) pulumi.StringPtrOutput { return v.Visibility }).(pulumi.StringPtrOutput)
}

type AuthConfigArrayOutput struct{ *pulumi.OutputState }

func (AuthConfigArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AuthConfig)(nil)).Elem()
}

func (o AuthConfigArrayOutput) ToAuthConfigArrayOutput() AuthConfigArrayOutput {
	return o
}

func (o AuthConfigArrayOutput) ToAuthConfigArrayOutputWithContext(ctx context.Context) AuthConfigArrayOutput {
	return o
}

func (o AuthConfigArrayOutput) Index(i pulumi.IntInput) AuthConfigOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AuthConfig {
		return vs[0].([]*AuthConfig)[vs[1].(int)]
	}).(AuthConfigOutput)
}

type AuthConfigMapOutput struct{ *pulumi.OutputState }

func (AuthConfigMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AuthConfig)(nil)).Elem()
}

func (o AuthConfigMapOutput) ToAuthConfigMapOutput() AuthConfigMapOutput {
	return o
}

func (o AuthConfigMapOutput) ToAuthConfigMapOutputWithContext(ctx context.Context) AuthConfigMapOutput {
	return o
}

func (o AuthConfigMapOutput) MapIndex(k pulumi.StringInput) AuthConfigOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AuthConfig {
		return vs[0].(map[string]*AuthConfig)[vs[1].(string)]
	}).(AuthConfigOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AuthConfigInput)(nil)).Elem(), &AuthConfig{})
	pulumi.RegisterInputType(reflect.TypeOf((*AuthConfigArrayInput)(nil)).Elem(), AuthConfigArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AuthConfigMapInput)(nil)).Elem(), AuthConfigMap{})
	pulumi.RegisterOutputType(AuthConfigOutput{})
	pulumi.RegisterOutputType(AuthConfigArrayOutput{})
	pulumi.RegisterOutputType(AuthConfigMapOutput{})
}
