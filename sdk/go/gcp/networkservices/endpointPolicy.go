// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package networkservices

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
// ### Network Services Endpoint Policy Basic
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/networkservices"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := networkservices.NewEndpointPolicy(ctx, "default", &networkservices.EndpointPolicyArgs{
//				Labels: pulumi.StringMap{
//					"foo": pulumi.String("bar"),
//				},
//				Description: pulumi.String("my description"),
//				Type:        pulumi.String("SIDECAR_PROXY"),
//				TrafficPortSelector: &networkservices.EndpointPolicyTrafficPortSelectorArgs{
//					Ports: pulumi.StringArray{
//						pulumi.String("8081"),
//					},
//				},
//				EndpointMatcher: &networkservices.EndpointPolicyEndpointMatcherArgs{
//					MetadataLabelMatcher: &networkservices.EndpointPolicyEndpointMatcherMetadataLabelMatcherArgs{
//						MetadataLabelMatchCriteria: pulumi.String("MATCH_ANY"),
//						MetadataLabels: networkservices.EndpointPolicyEndpointMatcherMetadataLabelMatcherMetadataLabelArray{
//							&networkservices.EndpointPolicyEndpointMatcherMetadataLabelMatcherMetadataLabelArgs{
//								LabelName:  pulumi.String("foo"),
//								LabelValue: pulumi.String("bar"),
//							},
//						},
//					},
//				},
//			}, pulumi.Provider(google_beta))
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Network Services Endpoint Policy Empty Match
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/networkservices"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := networkservices.NewEndpointPolicy(ctx, "default", &networkservices.EndpointPolicyArgs{
//				Labels: pulumi.StringMap{
//					"foo": pulumi.String("bar"),
//				},
//				Description: pulumi.String("my description"),
//				Type:        pulumi.String("SIDECAR_PROXY"),
//				TrafficPortSelector: &networkservices.EndpointPolicyTrafficPortSelectorArgs{
//					Ports: pulumi.StringArray{
//						pulumi.String("8081"),
//					},
//				},
//				EndpointMatcher: &networkservices.EndpointPolicyEndpointMatcherArgs{
//					MetadataLabelMatcher: &networkservices.EndpointPolicyEndpointMatcherMetadataLabelMatcherArgs{
//						MetadataLabelMatchCriteria: pulumi.String("MATCH_ANY"),
//					},
//				},
//			}, pulumi.Provider(google_beta))
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
// # EndpointPolicy can be imported using any of these accepted formats
//
// ```sh
//
//	$ pulumi import gcp:networkservices/endpointPolicy:EndpointPolicy default projects/{{project}}/locations/global/endpointPolicies/{{name}}
//
// ```
//
// ```sh
//
//	$ pulumi import gcp:networkservices/endpointPolicy:EndpointPolicy default {{project}}/{{name}}
//
// ```
//
// ```sh
//
//	$ pulumi import gcp:networkservices/endpointPolicy:EndpointPolicy default {{name}}
//
// ```
type EndpointPolicy struct {
	pulumi.CustomResourceState

	// This field specifies the URL of AuthorizationPolicy resource that applies authorization policies to the inbound traffic at the matched endpoints.
	AuthorizationPolicy pulumi.StringPtrOutput `pulumi:"authorizationPolicy"`
	// A URL referring to a ClientTlsPolicy resource. ClientTlsPolicy can be set to specify the authentication for traffic from the proxy to the actual endpoints.
	ClientTlsPolicy pulumi.StringPtrOutput `pulumi:"clientTlsPolicy"`
	// Time the TcpRoute was created in UTC.
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// A free-text description of the resource. Max length 1024 characters.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Required. A matcher that selects endpoints to which the policies should be applied.
	// Structure is documented below.
	EndpointMatcher EndpointPolicyEndpointMatcherOutput `pulumi:"endpointMatcher"`
	// Set of label tags associated with the TcpRoute resource.
	Labels pulumi.StringMapOutput `pulumi:"labels"`
	// Name of the EndpointPolicy resource.
	Name pulumi.StringOutput `pulumi:"name"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringOutput `pulumi:"project"`
	// A URL referring to ServerTlsPolicy resource. ServerTlsPolicy is used to determine the authentication policy to be applied to terminate the inbound traffic at the identified backends.
	ServerTlsPolicy pulumi.StringPtrOutput `pulumi:"serverTlsPolicy"`
	// Port selector for the (matched) endpoints. If no port selector is provided, the matched config is applied to all ports.
	// Structure is documented below.
	TrafficPortSelector EndpointPolicyTrafficPortSelectorPtrOutput `pulumi:"trafficPortSelector"`
	// The type of endpoint policy. This is primarily used to validate the configuration.
	// Possible values are: `SIDECAR_PROXY`, `GRPC_SERVER`.
	Type pulumi.StringOutput `pulumi:"type"`
	// Time the TcpRoute was updated in UTC.
	UpdateTime pulumi.StringOutput `pulumi:"updateTime"`
}

// NewEndpointPolicy registers a new resource with the given unique name, arguments, and options.
func NewEndpointPolicy(ctx *pulumi.Context,
	name string, args *EndpointPolicyArgs, opts ...pulumi.ResourceOption) (*EndpointPolicy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.EndpointMatcher == nil {
		return nil, errors.New("invalid value for required argument 'EndpointMatcher'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource EndpointPolicy
	err := ctx.RegisterResource("gcp:networkservices/endpointPolicy:EndpointPolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetEndpointPolicy gets an existing EndpointPolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetEndpointPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *EndpointPolicyState, opts ...pulumi.ResourceOption) (*EndpointPolicy, error) {
	var resource EndpointPolicy
	err := ctx.ReadResource("gcp:networkservices/endpointPolicy:EndpointPolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering EndpointPolicy resources.
type endpointPolicyState struct {
	// This field specifies the URL of AuthorizationPolicy resource that applies authorization policies to the inbound traffic at the matched endpoints.
	AuthorizationPolicy *string `pulumi:"authorizationPolicy"`
	// A URL referring to a ClientTlsPolicy resource. ClientTlsPolicy can be set to specify the authentication for traffic from the proxy to the actual endpoints.
	ClientTlsPolicy *string `pulumi:"clientTlsPolicy"`
	// Time the TcpRoute was created in UTC.
	CreateTime *string `pulumi:"createTime"`
	// A free-text description of the resource. Max length 1024 characters.
	Description *string `pulumi:"description"`
	// Required. A matcher that selects endpoints to which the policies should be applied.
	// Structure is documented below.
	EndpointMatcher *EndpointPolicyEndpointMatcher `pulumi:"endpointMatcher"`
	// Set of label tags associated with the TcpRoute resource.
	Labels map[string]string `pulumi:"labels"`
	// Name of the EndpointPolicy resource.
	Name *string `pulumi:"name"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
	// A URL referring to ServerTlsPolicy resource. ServerTlsPolicy is used to determine the authentication policy to be applied to terminate the inbound traffic at the identified backends.
	ServerTlsPolicy *string `pulumi:"serverTlsPolicy"`
	// Port selector for the (matched) endpoints. If no port selector is provided, the matched config is applied to all ports.
	// Structure is documented below.
	TrafficPortSelector *EndpointPolicyTrafficPortSelector `pulumi:"trafficPortSelector"`
	// The type of endpoint policy. This is primarily used to validate the configuration.
	// Possible values are: `SIDECAR_PROXY`, `GRPC_SERVER`.
	Type *string `pulumi:"type"`
	// Time the TcpRoute was updated in UTC.
	UpdateTime *string `pulumi:"updateTime"`
}

type EndpointPolicyState struct {
	// This field specifies the URL of AuthorizationPolicy resource that applies authorization policies to the inbound traffic at the matched endpoints.
	AuthorizationPolicy pulumi.StringPtrInput
	// A URL referring to a ClientTlsPolicy resource. ClientTlsPolicy can be set to specify the authentication for traffic from the proxy to the actual endpoints.
	ClientTlsPolicy pulumi.StringPtrInput
	// Time the TcpRoute was created in UTC.
	CreateTime pulumi.StringPtrInput
	// A free-text description of the resource. Max length 1024 characters.
	Description pulumi.StringPtrInput
	// Required. A matcher that selects endpoints to which the policies should be applied.
	// Structure is documented below.
	EndpointMatcher EndpointPolicyEndpointMatcherPtrInput
	// Set of label tags associated with the TcpRoute resource.
	Labels pulumi.StringMapInput
	// Name of the EndpointPolicy resource.
	Name pulumi.StringPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
	// A URL referring to ServerTlsPolicy resource. ServerTlsPolicy is used to determine the authentication policy to be applied to terminate the inbound traffic at the identified backends.
	ServerTlsPolicy pulumi.StringPtrInput
	// Port selector for the (matched) endpoints. If no port selector is provided, the matched config is applied to all ports.
	// Structure is documented below.
	TrafficPortSelector EndpointPolicyTrafficPortSelectorPtrInput
	// The type of endpoint policy. This is primarily used to validate the configuration.
	// Possible values are: `SIDECAR_PROXY`, `GRPC_SERVER`.
	Type pulumi.StringPtrInput
	// Time the TcpRoute was updated in UTC.
	UpdateTime pulumi.StringPtrInput
}

func (EndpointPolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*endpointPolicyState)(nil)).Elem()
}

type endpointPolicyArgs struct {
	// This field specifies the URL of AuthorizationPolicy resource that applies authorization policies to the inbound traffic at the matched endpoints.
	AuthorizationPolicy *string `pulumi:"authorizationPolicy"`
	// A URL referring to a ClientTlsPolicy resource. ClientTlsPolicy can be set to specify the authentication for traffic from the proxy to the actual endpoints.
	ClientTlsPolicy *string `pulumi:"clientTlsPolicy"`
	// A free-text description of the resource. Max length 1024 characters.
	Description *string `pulumi:"description"`
	// Required. A matcher that selects endpoints to which the policies should be applied.
	// Structure is documented below.
	EndpointMatcher EndpointPolicyEndpointMatcher `pulumi:"endpointMatcher"`
	// Set of label tags associated with the TcpRoute resource.
	Labels map[string]string `pulumi:"labels"`
	// Name of the EndpointPolicy resource.
	Name *string `pulumi:"name"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
	// A URL referring to ServerTlsPolicy resource. ServerTlsPolicy is used to determine the authentication policy to be applied to terminate the inbound traffic at the identified backends.
	ServerTlsPolicy *string `pulumi:"serverTlsPolicy"`
	// Port selector for the (matched) endpoints. If no port selector is provided, the matched config is applied to all ports.
	// Structure is documented below.
	TrafficPortSelector *EndpointPolicyTrafficPortSelector `pulumi:"trafficPortSelector"`
	// The type of endpoint policy. This is primarily used to validate the configuration.
	// Possible values are: `SIDECAR_PROXY`, `GRPC_SERVER`.
	Type string `pulumi:"type"`
}

// The set of arguments for constructing a EndpointPolicy resource.
type EndpointPolicyArgs struct {
	// This field specifies the URL of AuthorizationPolicy resource that applies authorization policies to the inbound traffic at the matched endpoints.
	AuthorizationPolicy pulumi.StringPtrInput
	// A URL referring to a ClientTlsPolicy resource. ClientTlsPolicy can be set to specify the authentication for traffic from the proxy to the actual endpoints.
	ClientTlsPolicy pulumi.StringPtrInput
	// A free-text description of the resource. Max length 1024 characters.
	Description pulumi.StringPtrInput
	// Required. A matcher that selects endpoints to which the policies should be applied.
	// Structure is documented below.
	EndpointMatcher EndpointPolicyEndpointMatcherInput
	// Set of label tags associated with the TcpRoute resource.
	Labels pulumi.StringMapInput
	// Name of the EndpointPolicy resource.
	Name pulumi.StringPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
	// A URL referring to ServerTlsPolicy resource. ServerTlsPolicy is used to determine the authentication policy to be applied to terminate the inbound traffic at the identified backends.
	ServerTlsPolicy pulumi.StringPtrInput
	// Port selector for the (matched) endpoints. If no port selector is provided, the matched config is applied to all ports.
	// Structure is documented below.
	TrafficPortSelector EndpointPolicyTrafficPortSelectorPtrInput
	// The type of endpoint policy. This is primarily used to validate the configuration.
	// Possible values are: `SIDECAR_PROXY`, `GRPC_SERVER`.
	Type pulumi.StringInput
}

func (EndpointPolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*endpointPolicyArgs)(nil)).Elem()
}

type EndpointPolicyInput interface {
	pulumi.Input

	ToEndpointPolicyOutput() EndpointPolicyOutput
	ToEndpointPolicyOutputWithContext(ctx context.Context) EndpointPolicyOutput
}

func (*EndpointPolicy) ElementType() reflect.Type {
	return reflect.TypeOf((**EndpointPolicy)(nil)).Elem()
}

func (i *EndpointPolicy) ToEndpointPolicyOutput() EndpointPolicyOutput {
	return i.ToEndpointPolicyOutputWithContext(context.Background())
}

func (i *EndpointPolicy) ToEndpointPolicyOutputWithContext(ctx context.Context) EndpointPolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EndpointPolicyOutput)
}

// EndpointPolicyArrayInput is an input type that accepts EndpointPolicyArray and EndpointPolicyArrayOutput values.
// You can construct a concrete instance of `EndpointPolicyArrayInput` via:
//
//	EndpointPolicyArray{ EndpointPolicyArgs{...} }
type EndpointPolicyArrayInput interface {
	pulumi.Input

	ToEndpointPolicyArrayOutput() EndpointPolicyArrayOutput
	ToEndpointPolicyArrayOutputWithContext(context.Context) EndpointPolicyArrayOutput
}

type EndpointPolicyArray []EndpointPolicyInput

func (EndpointPolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EndpointPolicy)(nil)).Elem()
}

func (i EndpointPolicyArray) ToEndpointPolicyArrayOutput() EndpointPolicyArrayOutput {
	return i.ToEndpointPolicyArrayOutputWithContext(context.Background())
}

func (i EndpointPolicyArray) ToEndpointPolicyArrayOutputWithContext(ctx context.Context) EndpointPolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EndpointPolicyArrayOutput)
}

// EndpointPolicyMapInput is an input type that accepts EndpointPolicyMap and EndpointPolicyMapOutput values.
// You can construct a concrete instance of `EndpointPolicyMapInput` via:
//
//	EndpointPolicyMap{ "key": EndpointPolicyArgs{...} }
type EndpointPolicyMapInput interface {
	pulumi.Input

	ToEndpointPolicyMapOutput() EndpointPolicyMapOutput
	ToEndpointPolicyMapOutputWithContext(context.Context) EndpointPolicyMapOutput
}

type EndpointPolicyMap map[string]EndpointPolicyInput

func (EndpointPolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EndpointPolicy)(nil)).Elem()
}

func (i EndpointPolicyMap) ToEndpointPolicyMapOutput() EndpointPolicyMapOutput {
	return i.ToEndpointPolicyMapOutputWithContext(context.Background())
}

func (i EndpointPolicyMap) ToEndpointPolicyMapOutputWithContext(ctx context.Context) EndpointPolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EndpointPolicyMapOutput)
}

type EndpointPolicyOutput struct{ *pulumi.OutputState }

func (EndpointPolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**EndpointPolicy)(nil)).Elem()
}

func (o EndpointPolicyOutput) ToEndpointPolicyOutput() EndpointPolicyOutput {
	return o
}

func (o EndpointPolicyOutput) ToEndpointPolicyOutputWithContext(ctx context.Context) EndpointPolicyOutput {
	return o
}

// This field specifies the URL of AuthorizationPolicy resource that applies authorization policies to the inbound traffic at the matched endpoints.
func (o EndpointPolicyOutput) AuthorizationPolicy() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EndpointPolicy) pulumi.StringPtrOutput { return v.AuthorizationPolicy }).(pulumi.StringPtrOutput)
}

// A URL referring to a ClientTlsPolicy resource. ClientTlsPolicy can be set to specify the authentication for traffic from the proxy to the actual endpoints.
func (o EndpointPolicyOutput) ClientTlsPolicy() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EndpointPolicy) pulumi.StringPtrOutput { return v.ClientTlsPolicy }).(pulumi.StringPtrOutput)
}

// Time the TcpRoute was created in UTC.
func (o EndpointPolicyOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *EndpointPolicy) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// A free-text description of the resource. Max length 1024 characters.
func (o EndpointPolicyOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EndpointPolicy) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Required. A matcher that selects endpoints to which the policies should be applied.
// Structure is documented below.
func (o EndpointPolicyOutput) EndpointMatcher() EndpointPolicyEndpointMatcherOutput {
	return o.ApplyT(func(v *EndpointPolicy) EndpointPolicyEndpointMatcherOutput { return v.EndpointMatcher }).(EndpointPolicyEndpointMatcherOutput)
}

// Set of label tags associated with the TcpRoute resource.
func (o EndpointPolicyOutput) Labels() pulumi.StringMapOutput {
	return o.ApplyT(func(v *EndpointPolicy) pulumi.StringMapOutput { return v.Labels }).(pulumi.StringMapOutput)
}

// Name of the EndpointPolicy resource.
func (o EndpointPolicyOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *EndpointPolicy) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The ID of the project in which the resource belongs.
// If it is not provided, the provider project is used.
func (o EndpointPolicyOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *EndpointPolicy) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// A URL referring to ServerTlsPolicy resource. ServerTlsPolicy is used to determine the authentication policy to be applied to terminate the inbound traffic at the identified backends.
func (o EndpointPolicyOutput) ServerTlsPolicy() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EndpointPolicy) pulumi.StringPtrOutput { return v.ServerTlsPolicy }).(pulumi.StringPtrOutput)
}

// Port selector for the (matched) endpoints. If no port selector is provided, the matched config is applied to all ports.
// Structure is documented below.
func (o EndpointPolicyOutput) TrafficPortSelector() EndpointPolicyTrafficPortSelectorPtrOutput {
	return o.ApplyT(func(v *EndpointPolicy) EndpointPolicyTrafficPortSelectorPtrOutput { return v.TrafficPortSelector }).(EndpointPolicyTrafficPortSelectorPtrOutput)
}

// The type of endpoint policy. This is primarily used to validate the configuration.
// Possible values are: `SIDECAR_PROXY`, `GRPC_SERVER`.
func (o EndpointPolicyOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *EndpointPolicy) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

// Time the TcpRoute was updated in UTC.
func (o EndpointPolicyOutput) UpdateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *EndpointPolicy) pulumi.StringOutput { return v.UpdateTime }).(pulumi.StringOutput)
}

type EndpointPolicyArrayOutput struct{ *pulumi.OutputState }

func (EndpointPolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EndpointPolicy)(nil)).Elem()
}

func (o EndpointPolicyArrayOutput) ToEndpointPolicyArrayOutput() EndpointPolicyArrayOutput {
	return o
}

func (o EndpointPolicyArrayOutput) ToEndpointPolicyArrayOutputWithContext(ctx context.Context) EndpointPolicyArrayOutput {
	return o
}

func (o EndpointPolicyArrayOutput) Index(i pulumi.IntInput) EndpointPolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *EndpointPolicy {
		return vs[0].([]*EndpointPolicy)[vs[1].(int)]
	}).(EndpointPolicyOutput)
}

type EndpointPolicyMapOutput struct{ *pulumi.OutputState }

func (EndpointPolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EndpointPolicy)(nil)).Elem()
}

func (o EndpointPolicyMapOutput) ToEndpointPolicyMapOutput() EndpointPolicyMapOutput {
	return o
}

func (o EndpointPolicyMapOutput) ToEndpointPolicyMapOutputWithContext(ctx context.Context) EndpointPolicyMapOutput {
	return o
}

func (o EndpointPolicyMapOutput) MapIndex(k pulumi.StringInput) EndpointPolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *EndpointPolicy {
		return vs[0].(map[string]*EndpointPolicy)[vs[1].(string)]
	}).(EndpointPolicyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*EndpointPolicyInput)(nil)).Elem(), &EndpointPolicy{})
	pulumi.RegisterInputType(reflect.TypeOf((*EndpointPolicyArrayInput)(nil)).Elem(), EndpointPolicyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*EndpointPolicyMapInput)(nil)).Elem(), EndpointPolicyMap{})
	pulumi.RegisterOutputType(EndpointPolicyOutput{})
	pulumi.RegisterOutputType(EndpointPolicyArrayOutput{})
	pulumi.RegisterOutputType(EndpointPolicyMapOutput{})
}