// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package networksecurity

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ClientTlsPolicy is a resource that specifies how a client should authenticate connections to backends of a service. This resource itself does not affect configuration unless it is attached to a backend service resource.
//
// To get more information about ClientTlsPolicy, see:
//
// * [API documentation](https://cloud.google.com/traffic-director/docs/reference/network-security/rest/v1beta1/projects.locations.clientTlsPolicies)
// * How-to Guides
//   - [Service Security](https://cloud.google.com/traffic-director/docs/security-use-cases)
//
// ## Example Usage
//
// ### Network Security Client Tls Policy Basic
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/networksecurity"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := networksecurity.NewClientTlsPolicy(ctx, "default", &networksecurity.ClientTlsPolicyArgs{
//				Name: pulumi.String("my-client-tls-policy"),
//				Labels: pulumi.StringMap{
//					"foo": pulumi.String("bar"),
//				},
//				Description: pulumi.String("my description"),
//				Sni:         pulumi.String("secure.example.com"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Network Security Client Tls Policy Advanced
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/networksecurity"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := networksecurity.NewClientTlsPolicy(ctx, "default", &networksecurity.ClientTlsPolicyArgs{
//				Name: pulumi.String("my-client-tls-policy"),
//				Labels: pulumi.StringMap{
//					"foo": pulumi.String("bar"),
//				},
//				Description: pulumi.String("my description"),
//				ClientCertificate: &networksecurity.ClientTlsPolicyClientCertificateArgs{
//					CertificateProviderInstance: &networksecurity.ClientTlsPolicyClientCertificateCertificateProviderInstanceArgs{
//						PluginInstance: pulumi.String("google_cloud_private_spiffe"),
//					},
//				},
//				ServerValidationCas: networksecurity.ClientTlsPolicyServerValidationCaArray{
//					&networksecurity.ClientTlsPolicyServerValidationCaArgs{
//						GrpcEndpoint: &networksecurity.ClientTlsPolicyServerValidationCaGrpcEndpointArgs{
//							TargetUri: pulumi.String("unix:mypath"),
//						},
//					},
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
// ClientTlsPolicy can be imported using any of these accepted formats:
//
// * `projects/{{project}}/locations/{{location}}/clientTlsPolicies/{{name}}`
//
// * `{{project}}/{{location}}/{{name}}`
//
// * `{{location}}/{{name}}`
//
// When using the `pulumi import` command, ClientTlsPolicy can be imported using one of the formats above. For example:
//
// ```sh
// $ pulumi import gcp:networksecurity/clientTlsPolicy:ClientTlsPolicy default projects/{{project}}/locations/{{location}}/clientTlsPolicies/{{name}}
// ```
//
// ```sh
// $ pulumi import gcp:networksecurity/clientTlsPolicy:ClientTlsPolicy default {{project}}/{{location}}/{{name}}
// ```
//
// ```sh
// $ pulumi import gcp:networksecurity/clientTlsPolicy:ClientTlsPolicy default {{location}}/{{name}}
// ```
type ClientTlsPolicy struct {
	pulumi.CustomResourceState

	// Defines a mechanism to provision client identity (public and private keys) for peer to peer authentication. The presence of this dictates mTLS.
	// Structure is documented below.
	ClientCertificate ClientTlsPolicyClientCertificatePtrOutput `pulumi:"clientCertificate"`
	// Time the ClientTlsPolicy was created in UTC.
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// A free-text description of the resource. Max length 1024 characters.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
	EffectiveLabels pulumi.StringMapOutput `pulumi:"effectiveLabels"`
	// Set of label tags associated with the ClientTlsPolicy resource.
	// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
	// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
	Labels pulumi.StringMapOutput `pulumi:"labels"`
	// The location of the client tls policy.
	// The default value is `global`.
	Location pulumi.StringPtrOutput `pulumi:"location"`
	// Name of the ClientTlsPolicy resource.
	Name pulumi.StringOutput `pulumi:"name"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringOutput `pulumi:"project"`
	// The combination of labels configured directly on the resource
	// and default labels configured on the provider.
	PulumiLabels pulumi.StringMapOutput `pulumi:"pulumiLabels"`
	// Defines the mechanism to obtain the Certificate Authority certificate to validate the server certificate. If empty, client does not validate the server certificate.
	// Structure is documented below.
	ServerValidationCas ClientTlsPolicyServerValidationCaArrayOutput `pulumi:"serverValidationCas"`
	// Server Name Indication string to present to the server during TLS handshake. E.g: "secure.example.com".
	Sni pulumi.StringPtrOutput `pulumi:"sni"`
	// Time the ClientTlsPolicy was updated in UTC.
	UpdateTime pulumi.StringOutput `pulumi:"updateTime"`
}

// NewClientTlsPolicy registers a new resource with the given unique name, arguments, and options.
func NewClientTlsPolicy(ctx *pulumi.Context,
	name string, args *ClientTlsPolicyArgs, opts ...pulumi.ResourceOption) (*ClientTlsPolicy, error) {
	if args == nil {
		args = &ClientTlsPolicyArgs{}
	}

	secrets := pulumi.AdditionalSecretOutputs([]string{
		"effectiveLabels",
		"pulumiLabels",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ClientTlsPolicy
	err := ctx.RegisterResource("gcp:networksecurity/clientTlsPolicy:ClientTlsPolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetClientTlsPolicy gets an existing ClientTlsPolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetClientTlsPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ClientTlsPolicyState, opts ...pulumi.ResourceOption) (*ClientTlsPolicy, error) {
	var resource ClientTlsPolicy
	err := ctx.ReadResource("gcp:networksecurity/clientTlsPolicy:ClientTlsPolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ClientTlsPolicy resources.
type clientTlsPolicyState struct {
	// Defines a mechanism to provision client identity (public and private keys) for peer to peer authentication. The presence of this dictates mTLS.
	// Structure is documented below.
	ClientCertificate *ClientTlsPolicyClientCertificate `pulumi:"clientCertificate"`
	// Time the ClientTlsPolicy was created in UTC.
	CreateTime *string `pulumi:"createTime"`
	// A free-text description of the resource. Max length 1024 characters.
	Description *string `pulumi:"description"`
	// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
	EffectiveLabels map[string]string `pulumi:"effectiveLabels"`
	// Set of label tags associated with the ClientTlsPolicy resource.
	// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
	// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
	Labels map[string]string `pulumi:"labels"`
	// The location of the client tls policy.
	// The default value is `global`.
	Location *string `pulumi:"location"`
	// Name of the ClientTlsPolicy resource.
	Name *string `pulumi:"name"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
	// The combination of labels configured directly on the resource
	// and default labels configured on the provider.
	PulumiLabels map[string]string `pulumi:"pulumiLabels"`
	// Defines the mechanism to obtain the Certificate Authority certificate to validate the server certificate. If empty, client does not validate the server certificate.
	// Structure is documented below.
	ServerValidationCas []ClientTlsPolicyServerValidationCa `pulumi:"serverValidationCas"`
	// Server Name Indication string to present to the server during TLS handshake. E.g: "secure.example.com".
	Sni *string `pulumi:"sni"`
	// Time the ClientTlsPolicy was updated in UTC.
	UpdateTime *string `pulumi:"updateTime"`
}

type ClientTlsPolicyState struct {
	// Defines a mechanism to provision client identity (public and private keys) for peer to peer authentication. The presence of this dictates mTLS.
	// Structure is documented below.
	ClientCertificate ClientTlsPolicyClientCertificatePtrInput
	// Time the ClientTlsPolicy was created in UTC.
	CreateTime pulumi.StringPtrInput
	// A free-text description of the resource. Max length 1024 characters.
	Description pulumi.StringPtrInput
	// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
	EffectiveLabels pulumi.StringMapInput
	// Set of label tags associated with the ClientTlsPolicy resource.
	// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
	// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
	Labels pulumi.StringMapInput
	// The location of the client tls policy.
	// The default value is `global`.
	Location pulumi.StringPtrInput
	// Name of the ClientTlsPolicy resource.
	Name pulumi.StringPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
	// The combination of labels configured directly on the resource
	// and default labels configured on the provider.
	PulumiLabels pulumi.StringMapInput
	// Defines the mechanism to obtain the Certificate Authority certificate to validate the server certificate. If empty, client does not validate the server certificate.
	// Structure is documented below.
	ServerValidationCas ClientTlsPolicyServerValidationCaArrayInput
	// Server Name Indication string to present to the server during TLS handshake. E.g: "secure.example.com".
	Sni pulumi.StringPtrInput
	// Time the ClientTlsPolicy was updated in UTC.
	UpdateTime pulumi.StringPtrInput
}

func (ClientTlsPolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*clientTlsPolicyState)(nil)).Elem()
}

type clientTlsPolicyArgs struct {
	// Defines a mechanism to provision client identity (public and private keys) for peer to peer authentication. The presence of this dictates mTLS.
	// Structure is documented below.
	ClientCertificate *ClientTlsPolicyClientCertificate `pulumi:"clientCertificate"`
	// A free-text description of the resource. Max length 1024 characters.
	Description *string `pulumi:"description"`
	// Set of label tags associated with the ClientTlsPolicy resource.
	// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
	// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
	Labels map[string]string `pulumi:"labels"`
	// The location of the client tls policy.
	// The default value is `global`.
	Location *string `pulumi:"location"`
	// Name of the ClientTlsPolicy resource.
	Name *string `pulumi:"name"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
	// Defines the mechanism to obtain the Certificate Authority certificate to validate the server certificate. If empty, client does not validate the server certificate.
	// Structure is documented below.
	ServerValidationCas []ClientTlsPolicyServerValidationCa `pulumi:"serverValidationCas"`
	// Server Name Indication string to present to the server during TLS handshake. E.g: "secure.example.com".
	Sni *string `pulumi:"sni"`
}

// The set of arguments for constructing a ClientTlsPolicy resource.
type ClientTlsPolicyArgs struct {
	// Defines a mechanism to provision client identity (public and private keys) for peer to peer authentication. The presence of this dictates mTLS.
	// Structure is documented below.
	ClientCertificate ClientTlsPolicyClientCertificatePtrInput
	// A free-text description of the resource. Max length 1024 characters.
	Description pulumi.StringPtrInput
	// Set of label tags associated with the ClientTlsPolicy resource.
	// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
	// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
	Labels pulumi.StringMapInput
	// The location of the client tls policy.
	// The default value is `global`.
	Location pulumi.StringPtrInput
	// Name of the ClientTlsPolicy resource.
	Name pulumi.StringPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
	// Defines the mechanism to obtain the Certificate Authority certificate to validate the server certificate. If empty, client does not validate the server certificate.
	// Structure is documented below.
	ServerValidationCas ClientTlsPolicyServerValidationCaArrayInput
	// Server Name Indication string to present to the server during TLS handshake. E.g: "secure.example.com".
	Sni pulumi.StringPtrInput
}

func (ClientTlsPolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*clientTlsPolicyArgs)(nil)).Elem()
}

type ClientTlsPolicyInput interface {
	pulumi.Input

	ToClientTlsPolicyOutput() ClientTlsPolicyOutput
	ToClientTlsPolicyOutputWithContext(ctx context.Context) ClientTlsPolicyOutput
}

func (*ClientTlsPolicy) ElementType() reflect.Type {
	return reflect.TypeOf((**ClientTlsPolicy)(nil)).Elem()
}

func (i *ClientTlsPolicy) ToClientTlsPolicyOutput() ClientTlsPolicyOutput {
	return i.ToClientTlsPolicyOutputWithContext(context.Background())
}

func (i *ClientTlsPolicy) ToClientTlsPolicyOutputWithContext(ctx context.Context) ClientTlsPolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClientTlsPolicyOutput)
}

// ClientTlsPolicyArrayInput is an input type that accepts ClientTlsPolicyArray and ClientTlsPolicyArrayOutput values.
// You can construct a concrete instance of `ClientTlsPolicyArrayInput` via:
//
//	ClientTlsPolicyArray{ ClientTlsPolicyArgs{...} }
type ClientTlsPolicyArrayInput interface {
	pulumi.Input

	ToClientTlsPolicyArrayOutput() ClientTlsPolicyArrayOutput
	ToClientTlsPolicyArrayOutputWithContext(context.Context) ClientTlsPolicyArrayOutput
}

type ClientTlsPolicyArray []ClientTlsPolicyInput

func (ClientTlsPolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ClientTlsPolicy)(nil)).Elem()
}

func (i ClientTlsPolicyArray) ToClientTlsPolicyArrayOutput() ClientTlsPolicyArrayOutput {
	return i.ToClientTlsPolicyArrayOutputWithContext(context.Background())
}

func (i ClientTlsPolicyArray) ToClientTlsPolicyArrayOutputWithContext(ctx context.Context) ClientTlsPolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClientTlsPolicyArrayOutput)
}

// ClientTlsPolicyMapInput is an input type that accepts ClientTlsPolicyMap and ClientTlsPolicyMapOutput values.
// You can construct a concrete instance of `ClientTlsPolicyMapInput` via:
//
//	ClientTlsPolicyMap{ "key": ClientTlsPolicyArgs{...} }
type ClientTlsPolicyMapInput interface {
	pulumi.Input

	ToClientTlsPolicyMapOutput() ClientTlsPolicyMapOutput
	ToClientTlsPolicyMapOutputWithContext(context.Context) ClientTlsPolicyMapOutput
}

type ClientTlsPolicyMap map[string]ClientTlsPolicyInput

func (ClientTlsPolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ClientTlsPolicy)(nil)).Elem()
}

func (i ClientTlsPolicyMap) ToClientTlsPolicyMapOutput() ClientTlsPolicyMapOutput {
	return i.ToClientTlsPolicyMapOutputWithContext(context.Background())
}

func (i ClientTlsPolicyMap) ToClientTlsPolicyMapOutputWithContext(ctx context.Context) ClientTlsPolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClientTlsPolicyMapOutput)
}

type ClientTlsPolicyOutput struct{ *pulumi.OutputState }

func (ClientTlsPolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ClientTlsPolicy)(nil)).Elem()
}

func (o ClientTlsPolicyOutput) ToClientTlsPolicyOutput() ClientTlsPolicyOutput {
	return o
}

func (o ClientTlsPolicyOutput) ToClientTlsPolicyOutputWithContext(ctx context.Context) ClientTlsPolicyOutput {
	return o
}

// Defines a mechanism to provision client identity (public and private keys) for peer to peer authentication. The presence of this dictates mTLS.
// Structure is documented below.
func (o ClientTlsPolicyOutput) ClientCertificate() ClientTlsPolicyClientCertificatePtrOutput {
	return o.ApplyT(func(v *ClientTlsPolicy) ClientTlsPolicyClientCertificatePtrOutput { return v.ClientCertificate }).(ClientTlsPolicyClientCertificatePtrOutput)
}

// Time the ClientTlsPolicy was created in UTC.
func (o ClientTlsPolicyOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *ClientTlsPolicy) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// A free-text description of the resource. Max length 1024 characters.
func (o ClientTlsPolicyOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ClientTlsPolicy) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
func (o ClientTlsPolicyOutput) EffectiveLabels() pulumi.StringMapOutput {
	return o.ApplyT(func(v *ClientTlsPolicy) pulumi.StringMapOutput { return v.EffectiveLabels }).(pulumi.StringMapOutput)
}

// Set of label tags associated with the ClientTlsPolicy resource.
// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
func (o ClientTlsPolicyOutput) Labels() pulumi.StringMapOutput {
	return o.ApplyT(func(v *ClientTlsPolicy) pulumi.StringMapOutput { return v.Labels }).(pulumi.StringMapOutput)
}

// The location of the client tls policy.
// The default value is `global`.
func (o ClientTlsPolicyOutput) Location() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ClientTlsPolicy) pulumi.StringPtrOutput { return v.Location }).(pulumi.StringPtrOutput)
}

// Name of the ClientTlsPolicy resource.
func (o ClientTlsPolicyOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ClientTlsPolicy) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The ID of the project in which the resource belongs.
// If it is not provided, the provider project is used.
func (o ClientTlsPolicyOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *ClientTlsPolicy) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// The combination of labels configured directly on the resource
// and default labels configured on the provider.
func (o ClientTlsPolicyOutput) PulumiLabels() pulumi.StringMapOutput {
	return o.ApplyT(func(v *ClientTlsPolicy) pulumi.StringMapOutput { return v.PulumiLabels }).(pulumi.StringMapOutput)
}

// Defines the mechanism to obtain the Certificate Authority certificate to validate the server certificate. If empty, client does not validate the server certificate.
// Structure is documented below.
func (o ClientTlsPolicyOutput) ServerValidationCas() ClientTlsPolicyServerValidationCaArrayOutput {
	return o.ApplyT(func(v *ClientTlsPolicy) ClientTlsPolicyServerValidationCaArrayOutput { return v.ServerValidationCas }).(ClientTlsPolicyServerValidationCaArrayOutput)
}

// Server Name Indication string to present to the server during TLS handshake. E.g: "secure.example.com".
func (o ClientTlsPolicyOutput) Sni() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ClientTlsPolicy) pulumi.StringPtrOutput { return v.Sni }).(pulumi.StringPtrOutput)
}

// Time the ClientTlsPolicy was updated in UTC.
func (o ClientTlsPolicyOutput) UpdateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *ClientTlsPolicy) pulumi.StringOutput { return v.UpdateTime }).(pulumi.StringOutput)
}

type ClientTlsPolicyArrayOutput struct{ *pulumi.OutputState }

func (ClientTlsPolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ClientTlsPolicy)(nil)).Elem()
}

func (o ClientTlsPolicyArrayOutput) ToClientTlsPolicyArrayOutput() ClientTlsPolicyArrayOutput {
	return o
}

func (o ClientTlsPolicyArrayOutput) ToClientTlsPolicyArrayOutputWithContext(ctx context.Context) ClientTlsPolicyArrayOutput {
	return o
}

func (o ClientTlsPolicyArrayOutput) Index(i pulumi.IntInput) ClientTlsPolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ClientTlsPolicy {
		return vs[0].([]*ClientTlsPolicy)[vs[1].(int)]
	}).(ClientTlsPolicyOutput)
}

type ClientTlsPolicyMapOutput struct{ *pulumi.OutputState }

func (ClientTlsPolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ClientTlsPolicy)(nil)).Elem()
}

func (o ClientTlsPolicyMapOutput) ToClientTlsPolicyMapOutput() ClientTlsPolicyMapOutput {
	return o
}

func (o ClientTlsPolicyMapOutput) ToClientTlsPolicyMapOutputWithContext(ctx context.Context) ClientTlsPolicyMapOutput {
	return o
}

func (o ClientTlsPolicyMapOutput) MapIndex(k pulumi.StringInput) ClientTlsPolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ClientTlsPolicy {
		return vs[0].(map[string]*ClientTlsPolicy)[vs[1].(string)]
	}).(ClientTlsPolicyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ClientTlsPolicyInput)(nil)).Elem(), &ClientTlsPolicy{})
	pulumi.RegisterInputType(reflect.TypeOf((*ClientTlsPolicyArrayInput)(nil)).Elem(), ClientTlsPolicyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ClientTlsPolicyMapInput)(nil)).Elem(), ClientTlsPolicyMap{})
	pulumi.RegisterOutputType(ClientTlsPolicyOutput{})
	pulumi.RegisterOutputType(ClientTlsPolicyArrayOutput{})
	pulumi.RegisterOutputType(ClientTlsPolicyMapOutput{})
}
