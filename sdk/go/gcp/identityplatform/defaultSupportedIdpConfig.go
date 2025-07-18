// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package identityplatform

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Configurations options for authenticating with a the standard set of Identity Toolkit-trusted IDPs.
//
// You must enable the
// [Google Identity Platform](https://console.cloud.google.com/marketplace/details/google-cloud-platform/customer-identity) in
// the marketplace prior to using this resource.
//
// ## Example Usage
//
// ### Identity Platform Default Supported Idp Config Basic
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/identityplatform"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := identityplatform.NewDefaultSupportedIdpConfig(ctx, "idp_config", &identityplatform.DefaultSupportedIdpConfigArgs{
//				Enabled:      pulumi.Bool(true),
//				IdpId:        pulumi.String("playgames.google.com"),
//				ClientId:     pulumi.String("client-id"),
//				ClientSecret: pulumi.String("secret"),
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
// DefaultSupportedIdpConfig can be imported using any of these accepted formats:
//
// * `projects/{{project}}/defaultSupportedIdpConfigs/{{idp_id}}`
//
// * `{{project}}/{{idp_id}}`
//
// * `{{idp_id}}`
//
// When using the `pulumi import` command, DefaultSupportedIdpConfig can be imported using one of the formats above. For example:
//
// ```sh
// $ pulumi import gcp:identityplatform/defaultSupportedIdpConfig:DefaultSupportedIdpConfig default projects/{{project}}/defaultSupportedIdpConfigs/{{idp_id}}
// ```
//
// ```sh
// $ pulumi import gcp:identityplatform/defaultSupportedIdpConfig:DefaultSupportedIdpConfig default {{project}}/{{idp_id}}
// ```
//
// ```sh
// $ pulumi import gcp:identityplatform/defaultSupportedIdpConfig:DefaultSupportedIdpConfig default {{idp_id}}
// ```
type DefaultSupportedIdpConfig struct {
	pulumi.CustomResourceState

	// OAuth client ID
	ClientId pulumi.StringOutput `pulumi:"clientId"`
	// OAuth client secret
	ClientSecret pulumi.StringOutput `pulumi:"clientSecret"`
	// If this IDP allows the user to sign in
	Enabled pulumi.BoolPtrOutput `pulumi:"enabled"`
	// ID of the IDP. Possible values include:
	// * `apple.com`
	// * `facebook.com`
	// * `gc.apple.com`
	// * `github.com`
	// * `google.com`
	// * `linkedin.com`
	// * `microsoft.com`
	// * `playgames.google.com`
	// * `twitter.com`
	// * `yahoo.com`
	IdpId pulumi.StringOutput `pulumi:"idpId"`
	// The name of the DefaultSupportedIdpConfig resource
	Name pulumi.StringOutput `pulumi:"name"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringOutput `pulumi:"project"`
}

// NewDefaultSupportedIdpConfig registers a new resource with the given unique name, arguments, and options.
func NewDefaultSupportedIdpConfig(ctx *pulumi.Context,
	name string, args *DefaultSupportedIdpConfigArgs, opts ...pulumi.ResourceOption) (*DefaultSupportedIdpConfig, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ClientId == nil {
		return nil, errors.New("invalid value for required argument 'ClientId'")
	}
	if args.ClientSecret == nil {
		return nil, errors.New("invalid value for required argument 'ClientSecret'")
	}
	if args.IdpId == nil {
		return nil, errors.New("invalid value for required argument 'IdpId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource DefaultSupportedIdpConfig
	err := ctx.RegisterResource("gcp:identityplatform/defaultSupportedIdpConfig:DefaultSupportedIdpConfig", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDefaultSupportedIdpConfig gets an existing DefaultSupportedIdpConfig resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDefaultSupportedIdpConfig(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DefaultSupportedIdpConfigState, opts ...pulumi.ResourceOption) (*DefaultSupportedIdpConfig, error) {
	var resource DefaultSupportedIdpConfig
	err := ctx.ReadResource("gcp:identityplatform/defaultSupportedIdpConfig:DefaultSupportedIdpConfig", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DefaultSupportedIdpConfig resources.
type defaultSupportedIdpConfigState struct {
	// OAuth client ID
	ClientId *string `pulumi:"clientId"`
	// OAuth client secret
	ClientSecret *string `pulumi:"clientSecret"`
	// If this IDP allows the user to sign in
	Enabled *bool `pulumi:"enabled"`
	// ID of the IDP. Possible values include:
	// * `apple.com`
	// * `facebook.com`
	// * `gc.apple.com`
	// * `github.com`
	// * `google.com`
	// * `linkedin.com`
	// * `microsoft.com`
	// * `playgames.google.com`
	// * `twitter.com`
	// * `yahoo.com`
	IdpId *string `pulumi:"idpId"`
	// The name of the DefaultSupportedIdpConfig resource
	Name *string `pulumi:"name"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
}

type DefaultSupportedIdpConfigState struct {
	// OAuth client ID
	ClientId pulumi.StringPtrInput
	// OAuth client secret
	ClientSecret pulumi.StringPtrInput
	// If this IDP allows the user to sign in
	Enabled pulumi.BoolPtrInput
	// ID of the IDP. Possible values include:
	// * `apple.com`
	// * `facebook.com`
	// * `gc.apple.com`
	// * `github.com`
	// * `google.com`
	// * `linkedin.com`
	// * `microsoft.com`
	// * `playgames.google.com`
	// * `twitter.com`
	// * `yahoo.com`
	IdpId pulumi.StringPtrInput
	// The name of the DefaultSupportedIdpConfig resource
	Name pulumi.StringPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
}

func (DefaultSupportedIdpConfigState) ElementType() reflect.Type {
	return reflect.TypeOf((*defaultSupportedIdpConfigState)(nil)).Elem()
}

type defaultSupportedIdpConfigArgs struct {
	// OAuth client ID
	ClientId string `pulumi:"clientId"`
	// OAuth client secret
	ClientSecret string `pulumi:"clientSecret"`
	// If this IDP allows the user to sign in
	Enabled *bool `pulumi:"enabled"`
	// ID of the IDP. Possible values include:
	// * `apple.com`
	// * `facebook.com`
	// * `gc.apple.com`
	// * `github.com`
	// * `google.com`
	// * `linkedin.com`
	// * `microsoft.com`
	// * `playgames.google.com`
	// * `twitter.com`
	// * `yahoo.com`
	IdpId string `pulumi:"idpId"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
}

// The set of arguments for constructing a DefaultSupportedIdpConfig resource.
type DefaultSupportedIdpConfigArgs struct {
	// OAuth client ID
	ClientId pulumi.StringInput
	// OAuth client secret
	ClientSecret pulumi.StringInput
	// If this IDP allows the user to sign in
	Enabled pulumi.BoolPtrInput
	// ID of the IDP. Possible values include:
	// * `apple.com`
	// * `facebook.com`
	// * `gc.apple.com`
	// * `github.com`
	// * `google.com`
	// * `linkedin.com`
	// * `microsoft.com`
	// * `playgames.google.com`
	// * `twitter.com`
	// * `yahoo.com`
	IdpId pulumi.StringInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
}

func (DefaultSupportedIdpConfigArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*defaultSupportedIdpConfigArgs)(nil)).Elem()
}

type DefaultSupportedIdpConfigInput interface {
	pulumi.Input

	ToDefaultSupportedIdpConfigOutput() DefaultSupportedIdpConfigOutput
	ToDefaultSupportedIdpConfigOutputWithContext(ctx context.Context) DefaultSupportedIdpConfigOutput
}

func (*DefaultSupportedIdpConfig) ElementType() reflect.Type {
	return reflect.TypeOf((**DefaultSupportedIdpConfig)(nil)).Elem()
}

func (i *DefaultSupportedIdpConfig) ToDefaultSupportedIdpConfigOutput() DefaultSupportedIdpConfigOutput {
	return i.ToDefaultSupportedIdpConfigOutputWithContext(context.Background())
}

func (i *DefaultSupportedIdpConfig) ToDefaultSupportedIdpConfigOutputWithContext(ctx context.Context) DefaultSupportedIdpConfigOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DefaultSupportedIdpConfigOutput)
}

// DefaultSupportedIdpConfigArrayInput is an input type that accepts DefaultSupportedIdpConfigArray and DefaultSupportedIdpConfigArrayOutput values.
// You can construct a concrete instance of `DefaultSupportedIdpConfigArrayInput` via:
//
//	DefaultSupportedIdpConfigArray{ DefaultSupportedIdpConfigArgs{...} }
type DefaultSupportedIdpConfigArrayInput interface {
	pulumi.Input

	ToDefaultSupportedIdpConfigArrayOutput() DefaultSupportedIdpConfigArrayOutput
	ToDefaultSupportedIdpConfigArrayOutputWithContext(context.Context) DefaultSupportedIdpConfigArrayOutput
}

type DefaultSupportedIdpConfigArray []DefaultSupportedIdpConfigInput

func (DefaultSupportedIdpConfigArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DefaultSupportedIdpConfig)(nil)).Elem()
}

func (i DefaultSupportedIdpConfigArray) ToDefaultSupportedIdpConfigArrayOutput() DefaultSupportedIdpConfigArrayOutput {
	return i.ToDefaultSupportedIdpConfigArrayOutputWithContext(context.Background())
}

func (i DefaultSupportedIdpConfigArray) ToDefaultSupportedIdpConfigArrayOutputWithContext(ctx context.Context) DefaultSupportedIdpConfigArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DefaultSupportedIdpConfigArrayOutput)
}

// DefaultSupportedIdpConfigMapInput is an input type that accepts DefaultSupportedIdpConfigMap and DefaultSupportedIdpConfigMapOutput values.
// You can construct a concrete instance of `DefaultSupportedIdpConfigMapInput` via:
//
//	DefaultSupportedIdpConfigMap{ "key": DefaultSupportedIdpConfigArgs{...} }
type DefaultSupportedIdpConfigMapInput interface {
	pulumi.Input

	ToDefaultSupportedIdpConfigMapOutput() DefaultSupportedIdpConfigMapOutput
	ToDefaultSupportedIdpConfigMapOutputWithContext(context.Context) DefaultSupportedIdpConfigMapOutput
}

type DefaultSupportedIdpConfigMap map[string]DefaultSupportedIdpConfigInput

func (DefaultSupportedIdpConfigMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DefaultSupportedIdpConfig)(nil)).Elem()
}

func (i DefaultSupportedIdpConfigMap) ToDefaultSupportedIdpConfigMapOutput() DefaultSupportedIdpConfigMapOutput {
	return i.ToDefaultSupportedIdpConfigMapOutputWithContext(context.Background())
}

func (i DefaultSupportedIdpConfigMap) ToDefaultSupportedIdpConfigMapOutputWithContext(ctx context.Context) DefaultSupportedIdpConfigMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DefaultSupportedIdpConfigMapOutput)
}

type DefaultSupportedIdpConfigOutput struct{ *pulumi.OutputState }

func (DefaultSupportedIdpConfigOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DefaultSupportedIdpConfig)(nil)).Elem()
}

func (o DefaultSupportedIdpConfigOutput) ToDefaultSupportedIdpConfigOutput() DefaultSupportedIdpConfigOutput {
	return o
}

func (o DefaultSupportedIdpConfigOutput) ToDefaultSupportedIdpConfigOutputWithContext(ctx context.Context) DefaultSupportedIdpConfigOutput {
	return o
}

// OAuth client ID
func (o DefaultSupportedIdpConfigOutput) ClientId() pulumi.StringOutput {
	return o.ApplyT(func(v *DefaultSupportedIdpConfig) pulumi.StringOutput { return v.ClientId }).(pulumi.StringOutput)
}

// OAuth client secret
func (o DefaultSupportedIdpConfigOutput) ClientSecret() pulumi.StringOutput {
	return o.ApplyT(func(v *DefaultSupportedIdpConfig) pulumi.StringOutput { return v.ClientSecret }).(pulumi.StringOutput)
}

// If this IDP allows the user to sign in
func (o DefaultSupportedIdpConfigOutput) Enabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *DefaultSupportedIdpConfig) pulumi.BoolPtrOutput { return v.Enabled }).(pulumi.BoolPtrOutput)
}

// ID of the IDP. Possible values include:
// * `apple.com`
// * `facebook.com`
// * `gc.apple.com`
// * `github.com`
// * `google.com`
// * `linkedin.com`
// * `microsoft.com`
// * `playgames.google.com`
// * `twitter.com`
// * `yahoo.com`
func (o DefaultSupportedIdpConfigOutput) IdpId() pulumi.StringOutput {
	return o.ApplyT(func(v *DefaultSupportedIdpConfig) pulumi.StringOutput { return v.IdpId }).(pulumi.StringOutput)
}

// The name of the DefaultSupportedIdpConfig resource
func (o DefaultSupportedIdpConfigOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *DefaultSupportedIdpConfig) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The ID of the project in which the resource belongs.
// If it is not provided, the provider project is used.
func (o DefaultSupportedIdpConfigOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *DefaultSupportedIdpConfig) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

type DefaultSupportedIdpConfigArrayOutput struct{ *pulumi.OutputState }

func (DefaultSupportedIdpConfigArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DefaultSupportedIdpConfig)(nil)).Elem()
}

func (o DefaultSupportedIdpConfigArrayOutput) ToDefaultSupportedIdpConfigArrayOutput() DefaultSupportedIdpConfigArrayOutput {
	return o
}

func (o DefaultSupportedIdpConfigArrayOutput) ToDefaultSupportedIdpConfigArrayOutputWithContext(ctx context.Context) DefaultSupportedIdpConfigArrayOutput {
	return o
}

func (o DefaultSupportedIdpConfigArrayOutput) Index(i pulumi.IntInput) DefaultSupportedIdpConfigOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DefaultSupportedIdpConfig {
		return vs[0].([]*DefaultSupportedIdpConfig)[vs[1].(int)]
	}).(DefaultSupportedIdpConfigOutput)
}

type DefaultSupportedIdpConfigMapOutput struct{ *pulumi.OutputState }

func (DefaultSupportedIdpConfigMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DefaultSupportedIdpConfig)(nil)).Elem()
}

func (o DefaultSupportedIdpConfigMapOutput) ToDefaultSupportedIdpConfigMapOutput() DefaultSupportedIdpConfigMapOutput {
	return o
}

func (o DefaultSupportedIdpConfigMapOutput) ToDefaultSupportedIdpConfigMapOutputWithContext(ctx context.Context) DefaultSupportedIdpConfigMapOutput {
	return o
}

func (o DefaultSupportedIdpConfigMapOutput) MapIndex(k pulumi.StringInput) DefaultSupportedIdpConfigOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DefaultSupportedIdpConfig {
		return vs[0].(map[string]*DefaultSupportedIdpConfig)[vs[1].(string)]
	}).(DefaultSupportedIdpConfigOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DefaultSupportedIdpConfigInput)(nil)).Elem(), &DefaultSupportedIdpConfig{})
	pulumi.RegisterInputType(reflect.TypeOf((*DefaultSupportedIdpConfigArrayInput)(nil)).Elem(), DefaultSupportedIdpConfigArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DefaultSupportedIdpConfigMapInput)(nil)).Elem(), DefaultSupportedIdpConfigMap{})
	pulumi.RegisterOutputType(DefaultSupportedIdpConfigOutput{})
	pulumi.RegisterOutputType(DefaultSupportedIdpConfigArrayOutput{})
	pulumi.RegisterOutputType(DefaultSupportedIdpConfigMapOutput{})
}
