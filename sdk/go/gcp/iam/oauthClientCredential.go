// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package iam

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Represents an OAuth Client Credential. Used to authenticate an OAuth Client
// while accessing Google Cloud resources on behalf of a Workforce Identity Federation user
// by using OAuth 2.0 Protocol.
//
// To get more information about OauthClientCredential, see:
//
// * [API documentation](https://cloud.google.com/iam/docs/reference/rest/v1/projects.locations.oauthClients.credentials)
// * How-to Guides
//   - [Managing OAuth clients](https://cloud.google.com/iam/docs/workforce-manage-oauth-app#manage-clients)
//
// ## Example Usage
//
// ### Iam Oauth Client Credential Full
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/iam"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			oauthClient, err := iam.NewOauthClient(ctx, "oauth_client", &iam.OauthClientArgs{
//				OauthClientId: pulumi.String("example-client-id"),
//				Location:      pulumi.String("global"),
//				AllowedGrantTypes: pulumi.StringArray{
//					pulumi.String("AUTHORIZATION_CODE_GRANT"),
//				},
//				AllowedRedirectUris: pulumi.StringArray{
//					pulumi.String("https://www.example.com"),
//				},
//				AllowedScopes: pulumi.StringArray{
//					pulumi.String("https://www.googleapis.com/auth/cloud-platform"),
//				},
//				ClientType: pulumi.String("CONFIDENTIAL_CLIENT"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = iam.NewOauthClientCredential(ctx, "example", &iam.OauthClientCredentialArgs{
//				Oauthclient:             oauthClient.OauthClientId,
//				Location:                oauthClient.Location,
//				OauthClientCredentialId: pulumi.String("cred-id"),
//				Disabled:                pulumi.Bool(true),
//				DisplayName:             pulumi.String("Display Name of credential"),
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
// OauthClientCredential can be imported using any of these accepted formats:
//
// * `projects/{{project}}/locations/{{location}}/oauthClients/{{oauthclient}}/credentials/{{oauth_client_credential_id}}`
//
// * `{{project}}/{{location}}/{{oauthclient}}/{{oauth_client_credential_id}}`
//
// * `{{location}}/{{oauthclient}}/{{oauth_client_credential_id}}`
//
// When using the `pulumi import` command, OauthClientCredential can be imported using one of the formats above. For example:
//
// ```sh
// $ pulumi import gcp:iam/oauthClientCredential:OauthClientCredential default projects/{{project}}/locations/{{location}}/oauthClients/{{oauthclient}}/credentials/{{oauth_client_credential_id}}
// ```
//
// ```sh
// $ pulumi import gcp:iam/oauthClientCredential:OauthClientCredential default {{project}}/{{location}}/{{oauthclient}}/{{oauth_client_credential_id}}
// ```
//
// ```sh
// $ pulumi import gcp:iam/oauthClientCredential:OauthClientCredential default {{location}}/{{oauthclient}}/{{oauth_client_credential_id}}
// ```
type OauthClientCredential struct {
	pulumi.CustomResourceState

	// The system-generated OAuth client secret.
	// The client secret must be stored securely. If the client secret is
	// leaked, you must delete and re-create the client credential. To learn
	// more, see [OAuth client and credential security risks and
	// mitigations](https://cloud.google.com/iam/docs/workforce-oauth-app#security)
	// **Note**: This property is sensitive and will not be displayed in the plan.
	ClientSecret pulumi.StringOutput `pulumi:"clientSecret"`
	// Whether the OauthClientCredential is disabled. You cannot use a
	// disabled OauthClientCredential.
	Disabled pulumi.BoolPtrOutput `pulumi:"disabled"`
	// A user-specified display name of the OauthClientCredential.
	// Cannot exceed 32 characters.
	DisplayName pulumi.StringPtrOutput `pulumi:"displayName"`
	// Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122.
	Location pulumi.StringOutput `pulumi:"location"`
	// Immutable. Identifier. The resource name of the OauthClientCredential.
	// Format:
	// `projects/{project}/locations/{location}/oauthClients/{oauth_client}/credentials/{credential}`
	Name pulumi.StringOutput `pulumi:"name"`
	// Required. The ID to use for the OauthClientCredential, which becomes the
	// final component of the resource name. This value should be 4-32 characters,
	// and may contain the characters [a-z0-9-]. The prefix `gcp-` is
	// reserved for use by Google, and may not be specified.
	OauthClientCredentialId pulumi.StringOutput `pulumi:"oauthClientCredentialId"`
	// Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122.
	Oauthclient pulumi.StringOutput `pulumi:"oauthclient"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringOutput `pulumi:"project"`
}

// NewOauthClientCredential registers a new resource with the given unique name, arguments, and options.
func NewOauthClientCredential(ctx *pulumi.Context,
	name string, args *OauthClientCredentialArgs, opts ...pulumi.ResourceOption) (*OauthClientCredential, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Location == nil {
		return nil, errors.New("invalid value for required argument 'Location'")
	}
	if args.OauthClientCredentialId == nil {
		return nil, errors.New("invalid value for required argument 'OauthClientCredentialId'")
	}
	if args.Oauthclient == nil {
		return nil, errors.New("invalid value for required argument 'Oauthclient'")
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"clientSecret",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource OauthClientCredential
	err := ctx.RegisterResource("gcp:iam/oauthClientCredential:OauthClientCredential", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetOauthClientCredential gets an existing OauthClientCredential resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetOauthClientCredential(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *OauthClientCredentialState, opts ...pulumi.ResourceOption) (*OauthClientCredential, error) {
	var resource OauthClientCredential
	err := ctx.ReadResource("gcp:iam/oauthClientCredential:OauthClientCredential", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering OauthClientCredential resources.
type oauthClientCredentialState struct {
	// The system-generated OAuth client secret.
	// The client secret must be stored securely. If the client secret is
	// leaked, you must delete and re-create the client credential. To learn
	// more, see [OAuth client and credential security risks and
	// mitigations](https://cloud.google.com/iam/docs/workforce-oauth-app#security)
	// **Note**: This property is sensitive and will not be displayed in the plan.
	ClientSecret *string `pulumi:"clientSecret"`
	// Whether the OauthClientCredential is disabled. You cannot use a
	// disabled OauthClientCredential.
	Disabled *bool `pulumi:"disabled"`
	// A user-specified display name of the OauthClientCredential.
	// Cannot exceed 32 characters.
	DisplayName *string `pulumi:"displayName"`
	// Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122.
	Location *string `pulumi:"location"`
	// Immutable. Identifier. The resource name of the OauthClientCredential.
	// Format:
	// `projects/{project}/locations/{location}/oauthClients/{oauth_client}/credentials/{credential}`
	Name *string `pulumi:"name"`
	// Required. The ID to use for the OauthClientCredential, which becomes the
	// final component of the resource name. This value should be 4-32 characters,
	// and may contain the characters [a-z0-9-]. The prefix `gcp-` is
	// reserved for use by Google, and may not be specified.
	OauthClientCredentialId *string `pulumi:"oauthClientCredentialId"`
	// Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122.
	Oauthclient *string `pulumi:"oauthclient"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
}

type OauthClientCredentialState struct {
	// The system-generated OAuth client secret.
	// The client secret must be stored securely. If the client secret is
	// leaked, you must delete and re-create the client credential. To learn
	// more, see [OAuth client and credential security risks and
	// mitigations](https://cloud.google.com/iam/docs/workforce-oauth-app#security)
	// **Note**: This property is sensitive and will not be displayed in the plan.
	ClientSecret pulumi.StringPtrInput
	// Whether the OauthClientCredential is disabled. You cannot use a
	// disabled OauthClientCredential.
	Disabled pulumi.BoolPtrInput
	// A user-specified display name of the OauthClientCredential.
	// Cannot exceed 32 characters.
	DisplayName pulumi.StringPtrInput
	// Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122.
	Location pulumi.StringPtrInput
	// Immutable. Identifier. The resource name of the OauthClientCredential.
	// Format:
	// `projects/{project}/locations/{location}/oauthClients/{oauth_client}/credentials/{credential}`
	Name pulumi.StringPtrInput
	// Required. The ID to use for the OauthClientCredential, which becomes the
	// final component of the resource name. This value should be 4-32 characters,
	// and may contain the characters [a-z0-9-]. The prefix `gcp-` is
	// reserved for use by Google, and may not be specified.
	OauthClientCredentialId pulumi.StringPtrInput
	// Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122.
	Oauthclient pulumi.StringPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
}

func (OauthClientCredentialState) ElementType() reflect.Type {
	return reflect.TypeOf((*oauthClientCredentialState)(nil)).Elem()
}

type oauthClientCredentialArgs struct {
	// Whether the OauthClientCredential is disabled. You cannot use a
	// disabled OauthClientCredential.
	Disabled *bool `pulumi:"disabled"`
	// A user-specified display name of the OauthClientCredential.
	// Cannot exceed 32 characters.
	DisplayName *string `pulumi:"displayName"`
	// Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122.
	Location string `pulumi:"location"`
	// Required. The ID to use for the OauthClientCredential, which becomes the
	// final component of the resource name. This value should be 4-32 characters,
	// and may contain the characters [a-z0-9-]. The prefix `gcp-` is
	// reserved for use by Google, and may not be specified.
	OauthClientCredentialId string `pulumi:"oauthClientCredentialId"`
	// Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122.
	Oauthclient string `pulumi:"oauthclient"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
}

// The set of arguments for constructing a OauthClientCredential resource.
type OauthClientCredentialArgs struct {
	// Whether the OauthClientCredential is disabled. You cannot use a
	// disabled OauthClientCredential.
	Disabled pulumi.BoolPtrInput
	// A user-specified display name of the OauthClientCredential.
	// Cannot exceed 32 characters.
	DisplayName pulumi.StringPtrInput
	// Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122.
	Location pulumi.StringInput
	// Required. The ID to use for the OauthClientCredential, which becomes the
	// final component of the resource name. This value should be 4-32 characters,
	// and may contain the characters [a-z0-9-]. The prefix `gcp-` is
	// reserved for use by Google, and may not be specified.
	OauthClientCredentialId pulumi.StringInput
	// Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122.
	Oauthclient pulumi.StringInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
}

func (OauthClientCredentialArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*oauthClientCredentialArgs)(nil)).Elem()
}

type OauthClientCredentialInput interface {
	pulumi.Input

	ToOauthClientCredentialOutput() OauthClientCredentialOutput
	ToOauthClientCredentialOutputWithContext(ctx context.Context) OauthClientCredentialOutput
}

func (*OauthClientCredential) ElementType() reflect.Type {
	return reflect.TypeOf((**OauthClientCredential)(nil)).Elem()
}

func (i *OauthClientCredential) ToOauthClientCredentialOutput() OauthClientCredentialOutput {
	return i.ToOauthClientCredentialOutputWithContext(context.Background())
}

func (i *OauthClientCredential) ToOauthClientCredentialOutputWithContext(ctx context.Context) OauthClientCredentialOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OauthClientCredentialOutput)
}

// OauthClientCredentialArrayInput is an input type that accepts OauthClientCredentialArray and OauthClientCredentialArrayOutput values.
// You can construct a concrete instance of `OauthClientCredentialArrayInput` via:
//
//	OauthClientCredentialArray{ OauthClientCredentialArgs{...} }
type OauthClientCredentialArrayInput interface {
	pulumi.Input

	ToOauthClientCredentialArrayOutput() OauthClientCredentialArrayOutput
	ToOauthClientCredentialArrayOutputWithContext(context.Context) OauthClientCredentialArrayOutput
}

type OauthClientCredentialArray []OauthClientCredentialInput

func (OauthClientCredentialArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OauthClientCredential)(nil)).Elem()
}

func (i OauthClientCredentialArray) ToOauthClientCredentialArrayOutput() OauthClientCredentialArrayOutput {
	return i.ToOauthClientCredentialArrayOutputWithContext(context.Background())
}

func (i OauthClientCredentialArray) ToOauthClientCredentialArrayOutputWithContext(ctx context.Context) OauthClientCredentialArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OauthClientCredentialArrayOutput)
}

// OauthClientCredentialMapInput is an input type that accepts OauthClientCredentialMap and OauthClientCredentialMapOutput values.
// You can construct a concrete instance of `OauthClientCredentialMapInput` via:
//
//	OauthClientCredentialMap{ "key": OauthClientCredentialArgs{...} }
type OauthClientCredentialMapInput interface {
	pulumi.Input

	ToOauthClientCredentialMapOutput() OauthClientCredentialMapOutput
	ToOauthClientCredentialMapOutputWithContext(context.Context) OauthClientCredentialMapOutput
}

type OauthClientCredentialMap map[string]OauthClientCredentialInput

func (OauthClientCredentialMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OauthClientCredential)(nil)).Elem()
}

func (i OauthClientCredentialMap) ToOauthClientCredentialMapOutput() OauthClientCredentialMapOutput {
	return i.ToOauthClientCredentialMapOutputWithContext(context.Background())
}

func (i OauthClientCredentialMap) ToOauthClientCredentialMapOutputWithContext(ctx context.Context) OauthClientCredentialMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OauthClientCredentialMapOutput)
}

type OauthClientCredentialOutput struct{ *pulumi.OutputState }

func (OauthClientCredentialOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**OauthClientCredential)(nil)).Elem()
}

func (o OauthClientCredentialOutput) ToOauthClientCredentialOutput() OauthClientCredentialOutput {
	return o
}

func (o OauthClientCredentialOutput) ToOauthClientCredentialOutputWithContext(ctx context.Context) OauthClientCredentialOutput {
	return o
}

// The system-generated OAuth client secret.
// The client secret must be stored securely. If the client secret is
// leaked, you must delete and re-create the client credential. To learn
// more, see [OAuth client and credential security risks and
// mitigations](https://cloud.google.com/iam/docs/workforce-oauth-app#security)
// **Note**: This property is sensitive and will not be displayed in the plan.
func (o OauthClientCredentialOutput) ClientSecret() pulumi.StringOutput {
	return o.ApplyT(func(v *OauthClientCredential) pulumi.StringOutput { return v.ClientSecret }).(pulumi.StringOutput)
}

// Whether the OauthClientCredential is disabled. You cannot use a
// disabled OauthClientCredential.
func (o OauthClientCredentialOutput) Disabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *OauthClientCredential) pulumi.BoolPtrOutput { return v.Disabled }).(pulumi.BoolPtrOutput)
}

// A user-specified display name of the OauthClientCredential.
// Cannot exceed 32 characters.
func (o OauthClientCredentialOutput) DisplayName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *OauthClientCredential) pulumi.StringPtrOutput { return v.DisplayName }).(pulumi.StringPtrOutput)
}

// Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122.
func (o OauthClientCredentialOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *OauthClientCredential) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// Immutable. Identifier. The resource name of the OauthClientCredential.
// Format:
// `projects/{project}/locations/{location}/oauthClients/{oauth_client}/credentials/{credential}`
func (o OauthClientCredentialOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *OauthClientCredential) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Required. The ID to use for the OauthClientCredential, which becomes the
// final component of the resource name. This value should be 4-32 characters,
// and may contain the characters [a-z0-9-]. The prefix `gcp-` is
// reserved for use by Google, and may not be specified.
func (o OauthClientCredentialOutput) OauthClientCredentialId() pulumi.StringOutput {
	return o.ApplyT(func(v *OauthClientCredential) pulumi.StringOutput { return v.OauthClientCredentialId }).(pulumi.StringOutput)
}

// Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122.
func (o OauthClientCredentialOutput) Oauthclient() pulumi.StringOutput {
	return o.ApplyT(func(v *OauthClientCredential) pulumi.StringOutput { return v.Oauthclient }).(pulumi.StringOutput)
}

// The ID of the project in which the resource belongs.
// If it is not provided, the provider project is used.
func (o OauthClientCredentialOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *OauthClientCredential) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

type OauthClientCredentialArrayOutput struct{ *pulumi.OutputState }

func (OauthClientCredentialArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OauthClientCredential)(nil)).Elem()
}

func (o OauthClientCredentialArrayOutput) ToOauthClientCredentialArrayOutput() OauthClientCredentialArrayOutput {
	return o
}

func (o OauthClientCredentialArrayOutput) ToOauthClientCredentialArrayOutputWithContext(ctx context.Context) OauthClientCredentialArrayOutput {
	return o
}

func (o OauthClientCredentialArrayOutput) Index(i pulumi.IntInput) OauthClientCredentialOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *OauthClientCredential {
		return vs[0].([]*OauthClientCredential)[vs[1].(int)]
	}).(OauthClientCredentialOutput)
}

type OauthClientCredentialMapOutput struct{ *pulumi.OutputState }

func (OauthClientCredentialMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OauthClientCredential)(nil)).Elem()
}

func (o OauthClientCredentialMapOutput) ToOauthClientCredentialMapOutput() OauthClientCredentialMapOutput {
	return o
}

func (o OauthClientCredentialMapOutput) ToOauthClientCredentialMapOutputWithContext(ctx context.Context) OauthClientCredentialMapOutput {
	return o
}

func (o OauthClientCredentialMapOutput) MapIndex(k pulumi.StringInput) OauthClientCredentialOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *OauthClientCredential {
		return vs[0].(map[string]*OauthClientCredential)[vs[1].(string)]
	}).(OauthClientCredentialOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*OauthClientCredentialInput)(nil)).Elem(), &OauthClientCredential{})
	pulumi.RegisterInputType(reflect.TypeOf((*OauthClientCredentialArrayInput)(nil)).Elem(), OauthClientCredentialArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*OauthClientCredentialMapInput)(nil)).Elem(), OauthClientCredentialMap{})
	pulumi.RegisterOutputType(OauthClientCredentialOutput{})
	pulumi.RegisterOutputType(OauthClientCredentialArrayOutput{})
	pulumi.RegisterOutputType(OauthClientCredentialMapOutput{})
}
