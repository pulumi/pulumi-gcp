// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudbuild

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// BitbucketServerConfig represents the configuration for a Bitbucket Server.
//
// To get more information about BitbucketServerConfig, see:
//
// * [API documentation](https://cloud.google.com/build/docs/api/reference/rest/v1/projects.locations.bitbucketServerConfigs)
// * How-to Guides
//   - [Connect to a Bitbucket Server host](https://cloud.google.com/build/docs/automating-builds/bitbucket/connect-host-bitbucket-server)
//
// ## Example Usage
// ### Cloudbuild Bitbucket Server Config
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/cloudbuild"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := cloudbuild.NewBitbucketServerConfig(ctx, "bbs-config", &cloudbuild.BitbucketServerConfigArgs{
//				ApiKey:   pulumi.String("<api-key>"),
//				ConfigId: pulumi.String("mybbsconfig"),
//				HostUri:  pulumi.String("https://bbs.com"),
//				Location: pulumi.String("us-central1"),
//				Secrets: &cloudbuild.BitbucketServerConfigSecretsArgs{
//					AdminAccessTokenVersionName: pulumi.String("projects/myProject/secrets/mybbspat/versions/1"),
//					ReadAccessTokenVersionName:  pulumi.String("projects/myProject/secrets/mybbspat/versions/1"),
//					WebhookSecretVersionName:    pulumi.String("projects/myProject/secrets/mybbspat/versions/1"),
//				},
//				Username: pulumi.String("test"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Cloudbuild Bitbucket Server Config Repositories
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/cloudbuild"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := cloudbuild.NewBitbucketServerConfig(ctx, "bbs-config-with-repos", &cloudbuild.BitbucketServerConfigArgs{
//				ApiKey:   pulumi.String("<api-key>"),
//				ConfigId: pulumi.String("mybbsconfig"),
//				ConnectedRepositories: cloudbuild.BitbucketServerConfigConnectedRepositoryArray{
//					&cloudbuild.BitbucketServerConfigConnectedRepositoryArgs{
//						ProjectKey: pulumi.String("DEV"),
//						RepoSlug:   pulumi.String("repo1"),
//					},
//					&cloudbuild.BitbucketServerConfigConnectedRepositoryArgs{
//						ProjectKey: pulumi.String("PROD"),
//						RepoSlug:   pulumi.String("repo1"),
//					},
//				},
//				HostUri:  pulumi.String("https://bbs.com"),
//				Location: pulumi.String("us-central1"),
//				Secrets: &cloudbuild.BitbucketServerConfigSecretsArgs{
//					AdminAccessTokenVersionName: pulumi.String("projects/myProject/secrets/mybbspat/versions/1"),
//					ReadAccessTokenVersionName:  pulumi.String("projects/myProject/secrets/mybbspat/versions/1"),
//					WebhookSecretVersionName:    pulumi.String("projects/myProject/secrets/mybbspat/versions/1"),
//				},
//				Username: pulumi.String("test"),
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
// # BitbucketServerConfig can be imported using any of these accepted formats
//
// ```sh
//
//	$ pulumi import gcp:cloudbuild/bitbucketServerConfig:BitbucketServerConfig default projects/{{project}}/locations/{{location}}/bitbucketServerConfigs/{{config_id}}
//
// ```
//
// ```sh
//
//	$ pulumi import gcp:cloudbuild/bitbucketServerConfig:BitbucketServerConfig default {{project}}/{{location}}/{{config_id}}
//
// ```
//
// ```sh
//
//	$ pulumi import gcp:cloudbuild/bitbucketServerConfig:BitbucketServerConfig default {{location}}/{{config_id}}
//
// ```
type BitbucketServerConfig struct {
	pulumi.CustomResourceState

	// Immutable. API Key that will be attached to webhook. Once this field has been set, it cannot be changed.
	// Changing this field will result in deleting/ recreating the resource.
	ApiKey pulumi.StringOutput `pulumi:"apiKey"`
	// The ID to use for the BitbucketServerConfig, which will become the final component of the BitbucketServerConfig's resource name.
	ConfigId pulumi.StringOutput `pulumi:"configId"`
	// Connected Bitbucket Server repositories for this config.
	// Structure is documented below.
	ConnectedRepositories BitbucketServerConfigConnectedRepositoryArrayOutput `pulumi:"connectedRepositories"`
	// Immutable. The URI of the Bitbucket Server host. Once this field has been set, it cannot be changed.
	// If you need to change it, please create another BitbucketServerConfig.
	HostUri pulumi.StringOutput `pulumi:"hostUri"`
	// The location of this bitbucket server config.
	Location pulumi.StringOutput `pulumi:"location"`
	// The resource name for the config.
	Name pulumi.StringOutput `pulumi:"name"`
	// The network to be used when reaching out to the Bitbucket Server instance. The VPC network must be enabled for private service connection.
	// This should be set if the Bitbucket Server instance is hosted on-premises and not reachable by public internet. If this field is left empty,
	// no network peering will occur and calls to the Bitbucket Server instance will be made over the public internet. Must be in the format
	// projects/{project}/global/networks/{network}, where {project} is a project number or id and {network} is the name of a VPC network in the project.
	PeeredNetwork pulumi.StringPtrOutput `pulumi:"peeredNetwork"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringOutput `pulumi:"project"`
	// Secret Manager secrets needed by the config.
	// Structure is documented below.
	Secrets BitbucketServerConfigSecretsOutput `pulumi:"secrets"`
	// SSL certificate to use for requests to Bitbucket Server. The format should be PEM format but the extension can be one of .pem, .cer, or .crt.
	SslCa pulumi.StringPtrOutput `pulumi:"sslCa"`
	// Username of the account Cloud Build will use on Bitbucket Server.
	Username pulumi.StringOutput `pulumi:"username"`
	// Output only. UUID included in webhook requests. The UUID is used to look up the corresponding config.
	WebhookKey pulumi.StringOutput `pulumi:"webhookKey"`
}

// NewBitbucketServerConfig registers a new resource with the given unique name, arguments, and options.
func NewBitbucketServerConfig(ctx *pulumi.Context,
	name string, args *BitbucketServerConfigArgs, opts ...pulumi.ResourceOption) (*BitbucketServerConfig, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ApiKey == nil {
		return nil, errors.New("invalid value for required argument 'ApiKey'")
	}
	if args.ConfigId == nil {
		return nil, errors.New("invalid value for required argument 'ConfigId'")
	}
	if args.HostUri == nil {
		return nil, errors.New("invalid value for required argument 'HostUri'")
	}
	if args.Location == nil {
		return nil, errors.New("invalid value for required argument 'Location'")
	}
	if args.Secrets == nil {
		return nil, errors.New("invalid value for required argument 'Secrets'")
	}
	if args.Username == nil {
		return nil, errors.New("invalid value for required argument 'Username'")
	}
	var resource BitbucketServerConfig
	err := ctx.RegisterResource("gcp:cloudbuild/bitbucketServerConfig:BitbucketServerConfig", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetBitbucketServerConfig gets an existing BitbucketServerConfig resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetBitbucketServerConfig(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *BitbucketServerConfigState, opts ...pulumi.ResourceOption) (*BitbucketServerConfig, error) {
	var resource BitbucketServerConfig
	err := ctx.ReadResource("gcp:cloudbuild/bitbucketServerConfig:BitbucketServerConfig", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering BitbucketServerConfig resources.
type bitbucketServerConfigState struct {
	// Immutable. API Key that will be attached to webhook. Once this field has been set, it cannot be changed.
	// Changing this field will result in deleting/ recreating the resource.
	ApiKey *string `pulumi:"apiKey"`
	// The ID to use for the BitbucketServerConfig, which will become the final component of the BitbucketServerConfig's resource name.
	ConfigId *string `pulumi:"configId"`
	// Connected Bitbucket Server repositories for this config.
	// Structure is documented below.
	ConnectedRepositories []BitbucketServerConfigConnectedRepository `pulumi:"connectedRepositories"`
	// Immutable. The URI of the Bitbucket Server host. Once this field has been set, it cannot be changed.
	// If you need to change it, please create another BitbucketServerConfig.
	HostUri *string `pulumi:"hostUri"`
	// The location of this bitbucket server config.
	Location *string `pulumi:"location"`
	// The resource name for the config.
	Name *string `pulumi:"name"`
	// The network to be used when reaching out to the Bitbucket Server instance. The VPC network must be enabled for private service connection.
	// This should be set if the Bitbucket Server instance is hosted on-premises and not reachable by public internet. If this field is left empty,
	// no network peering will occur and calls to the Bitbucket Server instance will be made over the public internet. Must be in the format
	// projects/{project}/global/networks/{network}, where {project} is a project number or id and {network} is the name of a VPC network in the project.
	PeeredNetwork *string `pulumi:"peeredNetwork"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
	// Secret Manager secrets needed by the config.
	// Structure is documented below.
	Secrets *BitbucketServerConfigSecrets `pulumi:"secrets"`
	// SSL certificate to use for requests to Bitbucket Server. The format should be PEM format but the extension can be one of .pem, .cer, or .crt.
	SslCa *string `pulumi:"sslCa"`
	// Username of the account Cloud Build will use on Bitbucket Server.
	Username *string `pulumi:"username"`
	// Output only. UUID included in webhook requests. The UUID is used to look up the corresponding config.
	WebhookKey *string `pulumi:"webhookKey"`
}

type BitbucketServerConfigState struct {
	// Immutable. API Key that will be attached to webhook. Once this field has been set, it cannot be changed.
	// Changing this field will result in deleting/ recreating the resource.
	ApiKey pulumi.StringPtrInput
	// The ID to use for the BitbucketServerConfig, which will become the final component of the BitbucketServerConfig's resource name.
	ConfigId pulumi.StringPtrInput
	// Connected Bitbucket Server repositories for this config.
	// Structure is documented below.
	ConnectedRepositories BitbucketServerConfigConnectedRepositoryArrayInput
	// Immutable. The URI of the Bitbucket Server host. Once this field has been set, it cannot be changed.
	// If you need to change it, please create another BitbucketServerConfig.
	HostUri pulumi.StringPtrInput
	// The location of this bitbucket server config.
	Location pulumi.StringPtrInput
	// The resource name for the config.
	Name pulumi.StringPtrInput
	// The network to be used when reaching out to the Bitbucket Server instance. The VPC network must be enabled for private service connection.
	// This should be set if the Bitbucket Server instance is hosted on-premises and not reachable by public internet. If this field is left empty,
	// no network peering will occur and calls to the Bitbucket Server instance will be made over the public internet. Must be in the format
	// projects/{project}/global/networks/{network}, where {project} is a project number or id and {network} is the name of a VPC network in the project.
	PeeredNetwork pulumi.StringPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
	// Secret Manager secrets needed by the config.
	// Structure is documented below.
	Secrets BitbucketServerConfigSecretsPtrInput
	// SSL certificate to use for requests to Bitbucket Server. The format should be PEM format but the extension can be one of .pem, .cer, or .crt.
	SslCa pulumi.StringPtrInput
	// Username of the account Cloud Build will use on Bitbucket Server.
	Username pulumi.StringPtrInput
	// Output only. UUID included in webhook requests. The UUID is used to look up the corresponding config.
	WebhookKey pulumi.StringPtrInput
}

func (BitbucketServerConfigState) ElementType() reflect.Type {
	return reflect.TypeOf((*bitbucketServerConfigState)(nil)).Elem()
}

type bitbucketServerConfigArgs struct {
	// Immutable. API Key that will be attached to webhook. Once this field has been set, it cannot be changed.
	// Changing this field will result in deleting/ recreating the resource.
	ApiKey string `pulumi:"apiKey"`
	// The ID to use for the BitbucketServerConfig, which will become the final component of the BitbucketServerConfig's resource name.
	ConfigId string `pulumi:"configId"`
	// Connected Bitbucket Server repositories for this config.
	// Structure is documented below.
	ConnectedRepositories []BitbucketServerConfigConnectedRepository `pulumi:"connectedRepositories"`
	// Immutable. The URI of the Bitbucket Server host. Once this field has been set, it cannot be changed.
	// If you need to change it, please create another BitbucketServerConfig.
	HostUri string `pulumi:"hostUri"`
	// The location of this bitbucket server config.
	Location string `pulumi:"location"`
	// The network to be used when reaching out to the Bitbucket Server instance. The VPC network must be enabled for private service connection.
	// This should be set if the Bitbucket Server instance is hosted on-premises and not reachable by public internet. If this field is left empty,
	// no network peering will occur and calls to the Bitbucket Server instance will be made over the public internet. Must be in the format
	// projects/{project}/global/networks/{network}, where {project} is a project number or id and {network} is the name of a VPC network in the project.
	PeeredNetwork *string `pulumi:"peeredNetwork"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
	// Secret Manager secrets needed by the config.
	// Structure is documented below.
	Secrets BitbucketServerConfigSecrets `pulumi:"secrets"`
	// SSL certificate to use for requests to Bitbucket Server. The format should be PEM format but the extension can be one of .pem, .cer, or .crt.
	SslCa *string `pulumi:"sslCa"`
	// Username of the account Cloud Build will use on Bitbucket Server.
	Username string `pulumi:"username"`
}

// The set of arguments for constructing a BitbucketServerConfig resource.
type BitbucketServerConfigArgs struct {
	// Immutable. API Key that will be attached to webhook. Once this field has been set, it cannot be changed.
	// Changing this field will result in deleting/ recreating the resource.
	ApiKey pulumi.StringInput
	// The ID to use for the BitbucketServerConfig, which will become the final component of the BitbucketServerConfig's resource name.
	ConfigId pulumi.StringInput
	// Connected Bitbucket Server repositories for this config.
	// Structure is documented below.
	ConnectedRepositories BitbucketServerConfigConnectedRepositoryArrayInput
	// Immutable. The URI of the Bitbucket Server host. Once this field has been set, it cannot be changed.
	// If you need to change it, please create another BitbucketServerConfig.
	HostUri pulumi.StringInput
	// The location of this bitbucket server config.
	Location pulumi.StringInput
	// The network to be used when reaching out to the Bitbucket Server instance. The VPC network must be enabled for private service connection.
	// This should be set if the Bitbucket Server instance is hosted on-premises and not reachable by public internet. If this field is left empty,
	// no network peering will occur and calls to the Bitbucket Server instance will be made over the public internet. Must be in the format
	// projects/{project}/global/networks/{network}, where {project} is a project number or id and {network} is the name of a VPC network in the project.
	PeeredNetwork pulumi.StringPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
	// Secret Manager secrets needed by the config.
	// Structure is documented below.
	Secrets BitbucketServerConfigSecretsInput
	// SSL certificate to use for requests to Bitbucket Server. The format should be PEM format but the extension can be one of .pem, .cer, or .crt.
	SslCa pulumi.StringPtrInput
	// Username of the account Cloud Build will use on Bitbucket Server.
	Username pulumi.StringInput
}

func (BitbucketServerConfigArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*bitbucketServerConfigArgs)(nil)).Elem()
}

type BitbucketServerConfigInput interface {
	pulumi.Input

	ToBitbucketServerConfigOutput() BitbucketServerConfigOutput
	ToBitbucketServerConfigOutputWithContext(ctx context.Context) BitbucketServerConfigOutput
}

func (*BitbucketServerConfig) ElementType() reflect.Type {
	return reflect.TypeOf((**BitbucketServerConfig)(nil)).Elem()
}

func (i *BitbucketServerConfig) ToBitbucketServerConfigOutput() BitbucketServerConfigOutput {
	return i.ToBitbucketServerConfigOutputWithContext(context.Background())
}

func (i *BitbucketServerConfig) ToBitbucketServerConfigOutputWithContext(ctx context.Context) BitbucketServerConfigOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BitbucketServerConfigOutput)
}

// BitbucketServerConfigArrayInput is an input type that accepts BitbucketServerConfigArray and BitbucketServerConfigArrayOutput values.
// You can construct a concrete instance of `BitbucketServerConfigArrayInput` via:
//
//	BitbucketServerConfigArray{ BitbucketServerConfigArgs{...} }
type BitbucketServerConfigArrayInput interface {
	pulumi.Input

	ToBitbucketServerConfigArrayOutput() BitbucketServerConfigArrayOutput
	ToBitbucketServerConfigArrayOutputWithContext(context.Context) BitbucketServerConfigArrayOutput
}

type BitbucketServerConfigArray []BitbucketServerConfigInput

func (BitbucketServerConfigArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*BitbucketServerConfig)(nil)).Elem()
}

func (i BitbucketServerConfigArray) ToBitbucketServerConfigArrayOutput() BitbucketServerConfigArrayOutput {
	return i.ToBitbucketServerConfigArrayOutputWithContext(context.Background())
}

func (i BitbucketServerConfigArray) ToBitbucketServerConfigArrayOutputWithContext(ctx context.Context) BitbucketServerConfigArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BitbucketServerConfigArrayOutput)
}

// BitbucketServerConfigMapInput is an input type that accepts BitbucketServerConfigMap and BitbucketServerConfigMapOutput values.
// You can construct a concrete instance of `BitbucketServerConfigMapInput` via:
//
//	BitbucketServerConfigMap{ "key": BitbucketServerConfigArgs{...} }
type BitbucketServerConfigMapInput interface {
	pulumi.Input

	ToBitbucketServerConfigMapOutput() BitbucketServerConfigMapOutput
	ToBitbucketServerConfigMapOutputWithContext(context.Context) BitbucketServerConfigMapOutput
}

type BitbucketServerConfigMap map[string]BitbucketServerConfigInput

func (BitbucketServerConfigMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*BitbucketServerConfig)(nil)).Elem()
}

func (i BitbucketServerConfigMap) ToBitbucketServerConfigMapOutput() BitbucketServerConfigMapOutput {
	return i.ToBitbucketServerConfigMapOutputWithContext(context.Background())
}

func (i BitbucketServerConfigMap) ToBitbucketServerConfigMapOutputWithContext(ctx context.Context) BitbucketServerConfigMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BitbucketServerConfigMapOutput)
}

type BitbucketServerConfigOutput struct{ *pulumi.OutputState }

func (BitbucketServerConfigOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**BitbucketServerConfig)(nil)).Elem()
}

func (o BitbucketServerConfigOutput) ToBitbucketServerConfigOutput() BitbucketServerConfigOutput {
	return o
}

func (o BitbucketServerConfigOutput) ToBitbucketServerConfigOutputWithContext(ctx context.Context) BitbucketServerConfigOutput {
	return o
}

// Immutable. API Key that will be attached to webhook. Once this field has been set, it cannot be changed.
// Changing this field will result in deleting/ recreating the resource.
func (o BitbucketServerConfigOutput) ApiKey() pulumi.StringOutput {
	return o.ApplyT(func(v *BitbucketServerConfig) pulumi.StringOutput { return v.ApiKey }).(pulumi.StringOutput)
}

// The ID to use for the BitbucketServerConfig, which will become the final component of the BitbucketServerConfig's resource name.
func (o BitbucketServerConfigOutput) ConfigId() pulumi.StringOutput {
	return o.ApplyT(func(v *BitbucketServerConfig) pulumi.StringOutput { return v.ConfigId }).(pulumi.StringOutput)
}

// Connected Bitbucket Server repositories for this config.
// Structure is documented below.
func (o BitbucketServerConfigOutput) ConnectedRepositories() BitbucketServerConfigConnectedRepositoryArrayOutput {
	return o.ApplyT(func(v *BitbucketServerConfig) BitbucketServerConfigConnectedRepositoryArrayOutput {
		return v.ConnectedRepositories
	}).(BitbucketServerConfigConnectedRepositoryArrayOutput)
}

// Immutable. The URI of the Bitbucket Server host. Once this field has been set, it cannot be changed.
// If you need to change it, please create another BitbucketServerConfig.
func (o BitbucketServerConfigOutput) HostUri() pulumi.StringOutput {
	return o.ApplyT(func(v *BitbucketServerConfig) pulumi.StringOutput { return v.HostUri }).(pulumi.StringOutput)
}

// The location of this bitbucket server config.
func (o BitbucketServerConfigOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *BitbucketServerConfig) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// The resource name for the config.
func (o BitbucketServerConfigOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *BitbucketServerConfig) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The network to be used when reaching out to the Bitbucket Server instance. The VPC network must be enabled for private service connection.
// This should be set if the Bitbucket Server instance is hosted on-premises and not reachable by public internet. If this field is left empty,
// no network peering will occur and calls to the Bitbucket Server instance will be made over the public internet. Must be in the format
// projects/{project}/global/networks/{network}, where {project} is a project number or id and {network} is the name of a VPC network in the project.
func (o BitbucketServerConfigOutput) PeeredNetwork() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *BitbucketServerConfig) pulumi.StringPtrOutput { return v.PeeredNetwork }).(pulumi.StringPtrOutput)
}

// The ID of the project in which the resource belongs.
// If it is not provided, the provider project is used.
func (o BitbucketServerConfigOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *BitbucketServerConfig) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// Secret Manager secrets needed by the config.
// Structure is documented below.
func (o BitbucketServerConfigOutput) Secrets() BitbucketServerConfigSecretsOutput {
	return o.ApplyT(func(v *BitbucketServerConfig) BitbucketServerConfigSecretsOutput { return v.Secrets }).(BitbucketServerConfigSecretsOutput)
}

// SSL certificate to use for requests to Bitbucket Server. The format should be PEM format but the extension can be one of .pem, .cer, or .crt.
func (o BitbucketServerConfigOutput) SslCa() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *BitbucketServerConfig) pulumi.StringPtrOutput { return v.SslCa }).(pulumi.StringPtrOutput)
}

// Username of the account Cloud Build will use on Bitbucket Server.
func (o BitbucketServerConfigOutput) Username() pulumi.StringOutput {
	return o.ApplyT(func(v *BitbucketServerConfig) pulumi.StringOutput { return v.Username }).(pulumi.StringOutput)
}

// Output only. UUID included in webhook requests. The UUID is used to look up the corresponding config.
func (o BitbucketServerConfigOutput) WebhookKey() pulumi.StringOutput {
	return o.ApplyT(func(v *BitbucketServerConfig) pulumi.StringOutput { return v.WebhookKey }).(pulumi.StringOutput)
}

type BitbucketServerConfigArrayOutput struct{ *pulumi.OutputState }

func (BitbucketServerConfigArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*BitbucketServerConfig)(nil)).Elem()
}

func (o BitbucketServerConfigArrayOutput) ToBitbucketServerConfigArrayOutput() BitbucketServerConfigArrayOutput {
	return o
}

func (o BitbucketServerConfigArrayOutput) ToBitbucketServerConfigArrayOutputWithContext(ctx context.Context) BitbucketServerConfigArrayOutput {
	return o
}

func (o BitbucketServerConfigArrayOutput) Index(i pulumi.IntInput) BitbucketServerConfigOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *BitbucketServerConfig {
		return vs[0].([]*BitbucketServerConfig)[vs[1].(int)]
	}).(BitbucketServerConfigOutput)
}

type BitbucketServerConfigMapOutput struct{ *pulumi.OutputState }

func (BitbucketServerConfigMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*BitbucketServerConfig)(nil)).Elem()
}

func (o BitbucketServerConfigMapOutput) ToBitbucketServerConfigMapOutput() BitbucketServerConfigMapOutput {
	return o
}

func (o BitbucketServerConfigMapOutput) ToBitbucketServerConfigMapOutputWithContext(ctx context.Context) BitbucketServerConfigMapOutput {
	return o
}

func (o BitbucketServerConfigMapOutput) MapIndex(k pulumi.StringInput) BitbucketServerConfigOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *BitbucketServerConfig {
		return vs[0].(map[string]*BitbucketServerConfig)[vs[1].(string)]
	}).(BitbucketServerConfigOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*BitbucketServerConfigInput)(nil)).Elem(), &BitbucketServerConfig{})
	pulumi.RegisterInputType(reflect.TypeOf((*BitbucketServerConfigArrayInput)(nil)).Elem(), BitbucketServerConfigArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*BitbucketServerConfigMapInput)(nil)).Elem(), BitbucketServerConfigMap{})
	pulumi.RegisterOutputType(BitbucketServerConfigOutput{})
	pulumi.RegisterOutputType(BitbucketServerConfigArrayOutput{})
	pulumi.RegisterOutputType(BitbucketServerConfigMapOutput{})
}