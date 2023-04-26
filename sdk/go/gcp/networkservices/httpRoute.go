// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package networkservices

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
// ### Network Services Http Route Basic
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
//			_, err := networkservices.NewHttpRoute(ctx, "default", &networkservices.HttpRouteArgs{
//				Labels: pulumi.StringMap{
//					"foo": pulumi.String("bar"),
//				},
//				Description: pulumi.String("my description"),
//				Hostnames: pulumi.StringArray{
//					pulumi.String("example"),
//				},
//				Rules: networkservices.HttpRouteRuleArray{
//					&networkservices.HttpRouteRuleArgs{
//						Matches: networkservices.HttpRouteRuleMatchArray{
//							&networkservices.HttpRouteRuleMatchArgs{
//								QueryParameters: networkservices.HttpRouteRuleMatchQueryParameterArray{
//									&networkservices.HttpRouteRuleMatchQueryParameterArgs{
//										QueryParameter: pulumi.String("key"),
//										ExactMatch:     pulumi.String("value"),
//									},
//								},
//								FullPathMatch: pulumi.String("example"),
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
// ### Network Services Http Route Matches And Actions
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
//			_, err := networkservices.NewHttpRoute(ctx, "default", &networkservices.HttpRouteArgs{
//				Labels: pulumi.StringMap{
//					"foo": pulumi.String("bar"),
//				},
//				Description: pulumi.String("my description"),
//				Hostnames: pulumi.StringArray{
//					pulumi.String("example"),
//				},
//				Rules: networkservices.HttpRouteRuleArray{
//					&networkservices.HttpRouteRuleArgs{
//						Matches: networkservices.HttpRouteRuleMatchArray{
//							&networkservices.HttpRouteRuleMatchArgs{
//								Headers: networkservices.HttpRouteRuleMatchHeaderArray{
//									&networkservices.HttpRouteRuleMatchHeaderArgs{
//										Header:      pulumi.String("header"),
//										InvertMatch: pulumi.Bool(false),
//										RegexMatch:  pulumi.String("header-value"),
//									},
//								},
//								QueryParameters: networkservices.HttpRouteRuleMatchQueryParameterArray{
//									&networkservices.HttpRouteRuleMatchQueryParameterArgs{
//										QueryParameter: pulumi.String("key"),
//										ExactMatch:     pulumi.String("value"),
//									},
//								},
//								PrefixMatch: pulumi.String("example"),
//								IgnoreCase:  pulumi.Bool(false),
//							},
//							&networkservices.HttpRouteRuleMatchArgs{
//								Headers: networkservices.HttpRouteRuleMatchHeaderArray{
//									&networkservices.HttpRouteRuleMatchHeaderArgs{
//										Header:       pulumi.String("header"),
//										InvertMatch:  pulumi.Bool(false),
//										PresentMatch: pulumi.Bool(true),
//									},
//								},
//								QueryParameters: networkservices.HttpRouteRuleMatchQueryParameterArray{
//									&networkservices.HttpRouteRuleMatchQueryParameterArgs{
//										QueryParameter: pulumi.String("key"),
//										RegexMatch:     pulumi.String("value"),
//									},
//								},
//								RegexMatch: pulumi.String("example"),
//								IgnoreCase: pulumi.Bool(false),
//							},
//							&networkservices.HttpRouteRuleMatchArgs{
//								Headers: networkservices.HttpRouteRuleMatchHeaderArray{
//									&networkservices.HttpRouteRuleMatchHeaderArgs{
//										Header:       pulumi.String("header"),
//										InvertMatch:  pulumi.Bool(false),
//										PresentMatch: pulumi.Bool(true),
//									},
//								},
//								QueryParameters: networkservices.HttpRouteRuleMatchQueryParameterArray{
//									&networkservices.HttpRouteRuleMatchQueryParameterArgs{
//										QueryParameter: pulumi.String("key"),
//										PresentMatch:   pulumi.Bool(true),
//									},
//								},
//								FullPathMatch: pulumi.String("example"),
//								IgnoreCase:    pulumi.Bool(false),
//							},
//						},
//						Action: &networkservices.HttpRouteRuleActionArgs{
//							Redirect: &networkservices.HttpRouteRuleActionRedirectArgs{
//								HostRedirect:  pulumi.String("new-host"),
//								PathRedirect:  pulumi.String("new-path"),
//								PrefixRewrite: pulumi.String("new-prefix"),
//								HttpsRedirect: pulumi.Bool(true),
//								StripQuery:    pulumi.Bool(true),
//								PortRedirect:  pulumi.Int(8081),
//							},
//							UrlRewrite: &networkservices.HttpRouteRuleActionUrlRewriteArgs{
//								PathPrefixRewrite: pulumi.String("new-prefix"),
//								HostRewrite:       pulumi.String("new-host"),
//							},
//							RetryPolicy: &networkservices.HttpRouteRuleActionRetryPolicyArgs{
//								RetryConditions: pulumi.StringArray{
//									pulumi.String("server_error"),
//								},
//								NumRetries:    pulumi.Int(1),
//								PerTryTimeout: pulumi.String("1s"),
//							},
//							RequestMirrorPolicy: &networkservices.HttpRouteRuleActionRequestMirrorPolicyArgs{
//								Destination: &networkservices.HttpRouteRuleActionRequestMirrorPolicyDestinationArgs{
//									ServiceName: pulumi.String("new"),
//									Weight:      pulumi.Int(1),
//								},
//							},
//							CorsPolicy: &networkservices.HttpRouteRuleActionCorsPolicyArgs{
//								AllowOrigins: pulumi.StringArray{
//									pulumi.String("example"),
//								},
//								AllowMethods: pulumi.StringArray{
//									pulumi.String("GET"),
//									pulumi.String("PUT"),
//								},
//								AllowHeaders: pulumi.StringArray{
//									pulumi.String("version"),
//									pulumi.String("type"),
//								},
//								ExposeHeaders: pulumi.StringArray{
//									pulumi.String("version"),
//									pulumi.String("type"),
//								},
//								MaxAge:           pulumi.String("1s"),
//								AllowCredentials: pulumi.Bool(true),
//								Disabled:         pulumi.Bool(false),
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
// ### Network Services Http Route Actions
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
//			_, err := networkservices.NewHttpRoute(ctx, "default", &networkservices.HttpRouteArgs{
//				Labels: pulumi.StringMap{
//					"foo": pulumi.String("bar"),
//				},
//				Description: pulumi.String("my description"),
//				Hostnames: pulumi.StringArray{
//					pulumi.String("example"),
//				},
//				Rules: networkservices.HttpRouteRuleArray{
//					&networkservices.HttpRouteRuleArgs{
//						Action: &networkservices.HttpRouteRuleActionArgs{
//							FaultInjectionPolicy: &networkservices.HttpRouteRuleActionFaultInjectionPolicyArgs{
//								Delay: &networkservices.HttpRouteRuleActionFaultInjectionPolicyDelayArgs{
//									FixedDelay: pulumi.String("1s"),
//									Percentage: pulumi.Int(1),
//								},
//								Abort: &networkservices.HttpRouteRuleActionFaultInjectionPolicyAbortArgs{
//									HttpStatus: pulumi.Int(500),
//									Percentage: pulumi.Int(1),
//								},
//							},
//							UrlRewrite: &networkservices.HttpRouteRuleActionUrlRewriteArgs{
//								PathPrefixRewrite: pulumi.String("new-prefix"),
//								HostRewrite:       pulumi.String("new-host"),
//							},
//							RetryPolicy: &networkservices.HttpRouteRuleActionRetryPolicyArgs{
//								RetryConditions: pulumi.StringArray{
//									pulumi.String("server_error"),
//								},
//								NumRetries:    pulumi.Int(1),
//								PerTryTimeout: pulumi.String("1s"),
//							},
//							RequestMirrorPolicy: &networkservices.HttpRouteRuleActionRequestMirrorPolicyArgs{
//								Destination: &networkservices.HttpRouteRuleActionRequestMirrorPolicyDestinationArgs{
//									ServiceName: pulumi.String("new"),
//									Weight:      pulumi.Int(1),
//								},
//							},
//							CorsPolicy: &networkservices.HttpRouteRuleActionCorsPolicyArgs{
//								AllowOrigins: pulumi.StringArray{
//									pulumi.String("example"),
//								},
//								AllowMethods: pulumi.StringArray{
//									pulumi.String("GET"),
//									pulumi.String("PUT"),
//								},
//								AllowHeaders: pulumi.StringArray{
//									pulumi.String("version"),
//									pulumi.String("type"),
//								},
//								ExposeHeaders: pulumi.StringArray{
//									pulumi.String("version"),
//									pulumi.String("type"),
//								},
//								MaxAge:           pulumi.String("1s"),
//								AllowCredentials: pulumi.Bool(true),
//								Disabled:         pulumi.Bool(false),
//							},
//							RequestHeaderModifier: &networkservices.HttpRouteRuleActionRequestHeaderModifierArgs{
//								Set: pulumi.StringMap{
//									"version": pulumi.String("1"),
//									"type":    pulumi.String("json"),
//								},
//								Add: pulumi.StringMap{
//									"minor-version": pulumi.String("1"),
//								},
//								Removes: pulumi.StringArray{
//									pulumi.String("arg"),
//								},
//							},
//							ResponseHeaderModifier: &networkservices.HttpRouteRuleActionResponseHeaderModifierArgs{
//								Set: pulumi.StringMap{
//									"version": pulumi.String("1"),
//									"type":    pulumi.String("json"),
//								},
//								Add: pulumi.StringMap{
//									"minor-version": pulumi.String("1"),
//								},
//								Removes: pulumi.StringArray{
//									pulumi.String("removearg"),
//								},
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
// ### Network Services Http Route Mesh Basic
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
//			defaultMesh, err := networkservices.NewMesh(ctx, "defaultMesh", &networkservices.MeshArgs{
//				Labels: pulumi.StringMap{
//					"foo": pulumi.String("bar"),
//				},
//				Description: pulumi.String("my description"),
//			}, pulumi.Provider(google_beta))
//			if err != nil {
//				return err
//			}
//			_, err = networkservices.NewHttpRoute(ctx, "defaultHttpRoute", &networkservices.HttpRouteArgs{
//				Labels: pulumi.StringMap{
//					"foo": pulumi.String("bar"),
//				},
//				Description: pulumi.String("my description"),
//				Hostnames: pulumi.StringArray{
//					pulumi.String("example"),
//				},
//				Meshes: pulumi.StringArray{
//					defaultMesh.ID(),
//				},
//				Rules: networkservices.HttpRouteRuleArray{
//					&networkservices.HttpRouteRuleArgs{
//						Matches: networkservices.HttpRouteRuleMatchArray{
//							&networkservices.HttpRouteRuleMatchArgs{
//								QueryParameters: networkservices.HttpRouteRuleMatchQueryParameterArray{
//									&networkservices.HttpRouteRuleMatchQueryParameterArgs{
//										QueryParameter: pulumi.String("key"),
//										ExactMatch:     pulumi.String("value"),
//									},
//								},
//								FullPathMatch: pulumi.String("example"),
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
//
// ## Import
//
// # HttpRoute can be imported using any of these accepted formats
//
// ```sh
//
//	$ pulumi import gcp:networkservices/httpRoute:HttpRoute default projects/{{project}}/locations/global/httpRoutes/{{name}}
//
// ```
//
// ```sh
//
//	$ pulumi import gcp:networkservices/httpRoute:HttpRoute default {{project}}/{{name}}
//
// ```
//
// ```sh
//
//	$ pulumi import gcp:networkservices/httpRoute:HttpRoute default {{name}}
//
// ```
type HttpRoute struct {
	pulumi.CustomResourceState

	// Time the HttpRoute was created in UTC.
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// A free-text description of the resource. Max length 1024 characters.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Gateways defines a list of gateways this HttpRoute is attached to, as one of the routing rules to route the requests served by the gateway.
	// Each gateway reference should match the pattern: projects/*/locations/global/gateways/<gateway_name>
	Gateways pulumi.StringArrayOutput `pulumi:"gateways"`
	// Set of hosts that should match against the HTTP host header to select a HttpRoute to process the request.
	Hostnames pulumi.StringArrayOutput `pulumi:"hostnames"`
	// Set of label tags associated with the HttpRoute resource.
	Labels pulumi.StringMapOutput `pulumi:"labels"`
	// Meshes defines a list of meshes this HttpRoute is attached to, as one of the routing rules to route the requests served by the mesh.
	// Each mesh reference should match the pattern: projects/*/locations/global/meshes/<mesh_name>.
	// The attached Mesh should be of a type SIDECAR.
	Meshes pulumi.StringArrayOutput `pulumi:"meshes"`
	// Name of the HttpRoute resource.
	Name pulumi.StringOutput `pulumi:"name"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringOutput `pulumi:"project"`
	// Rules that define how traffic is routed and handled.
	// Structure is documented below.
	Rules HttpRouteRuleArrayOutput `pulumi:"rules"`
	// Server-defined URL of this resource.
	SelfLink pulumi.StringOutput `pulumi:"selfLink"`
	// Time the HttpRoute was updated in UTC.
	UpdateTime pulumi.StringOutput `pulumi:"updateTime"`
}

// NewHttpRoute registers a new resource with the given unique name, arguments, and options.
func NewHttpRoute(ctx *pulumi.Context,
	name string, args *HttpRouteArgs, opts ...pulumi.ResourceOption) (*HttpRoute, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Hostnames == nil {
		return nil, errors.New("invalid value for required argument 'Hostnames'")
	}
	if args.Rules == nil {
		return nil, errors.New("invalid value for required argument 'Rules'")
	}
	var resource HttpRoute
	err := ctx.RegisterResource("gcp:networkservices/httpRoute:HttpRoute", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetHttpRoute gets an existing HttpRoute resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetHttpRoute(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *HttpRouteState, opts ...pulumi.ResourceOption) (*HttpRoute, error) {
	var resource HttpRoute
	err := ctx.ReadResource("gcp:networkservices/httpRoute:HttpRoute", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering HttpRoute resources.
type httpRouteState struct {
	// Time the HttpRoute was created in UTC.
	CreateTime *string `pulumi:"createTime"`
	// A free-text description of the resource. Max length 1024 characters.
	Description *string `pulumi:"description"`
	// Gateways defines a list of gateways this HttpRoute is attached to, as one of the routing rules to route the requests served by the gateway.
	// Each gateway reference should match the pattern: projects/*/locations/global/gateways/<gateway_name>
	Gateways []string `pulumi:"gateways"`
	// Set of hosts that should match against the HTTP host header to select a HttpRoute to process the request.
	Hostnames []string `pulumi:"hostnames"`
	// Set of label tags associated with the HttpRoute resource.
	Labels map[string]string `pulumi:"labels"`
	// Meshes defines a list of meshes this HttpRoute is attached to, as one of the routing rules to route the requests served by the mesh.
	// Each mesh reference should match the pattern: projects/*/locations/global/meshes/<mesh_name>.
	// The attached Mesh should be of a type SIDECAR.
	Meshes []string `pulumi:"meshes"`
	// Name of the HttpRoute resource.
	Name *string `pulumi:"name"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
	// Rules that define how traffic is routed and handled.
	// Structure is documented below.
	Rules []HttpRouteRule `pulumi:"rules"`
	// Server-defined URL of this resource.
	SelfLink *string `pulumi:"selfLink"`
	// Time the HttpRoute was updated in UTC.
	UpdateTime *string `pulumi:"updateTime"`
}

type HttpRouteState struct {
	// Time the HttpRoute was created in UTC.
	CreateTime pulumi.StringPtrInput
	// A free-text description of the resource. Max length 1024 characters.
	Description pulumi.StringPtrInput
	// Gateways defines a list of gateways this HttpRoute is attached to, as one of the routing rules to route the requests served by the gateway.
	// Each gateway reference should match the pattern: projects/*/locations/global/gateways/<gateway_name>
	Gateways pulumi.StringArrayInput
	// Set of hosts that should match against the HTTP host header to select a HttpRoute to process the request.
	Hostnames pulumi.StringArrayInput
	// Set of label tags associated with the HttpRoute resource.
	Labels pulumi.StringMapInput
	// Meshes defines a list of meshes this HttpRoute is attached to, as one of the routing rules to route the requests served by the mesh.
	// Each mesh reference should match the pattern: projects/*/locations/global/meshes/<mesh_name>.
	// The attached Mesh should be of a type SIDECAR.
	Meshes pulumi.StringArrayInput
	// Name of the HttpRoute resource.
	Name pulumi.StringPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
	// Rules that define how traffic is routed and handled.
	// Structure is documented below.
	Rules HttpRouteRuleArrayInput
	// Server-defined URL of this resource.
	SelfLink pulumi.StringPtrInput
	// Time the HttpRoute was updated in UTC.
	UpdateTime pulumi.StringPtrInput
}

func (HttpRouteState) ElementType() reflect.Type {
	return reflect.TypeOf((*httpRouteState)(nil)).Elem()
}

type httpRouteArgs struct {
	// A free-text description of the resource. Max length 1024 characters.
	Description *string `pulumi:"description"`
	// Gateways defines a list of gateways this HttpRoute is attached to, as one of the routing rules to route the requests served by the gateway.
	// Each gateway reference should match the pattern: projects/*/locations/global/gateways/<gateway_name>
	Gateways []string `pulumi:"gateways"`
	// Set of hosts that should match against the HTTP host header to select a HttpRoute to process the request.
	Hostnames []string `pulumi:"hostnames"`
	// Set of label tags associated with the HttpRoute resource.
	Labels map[string]string `pulumi:"labels"`
	// Meshes defines a list of meshes this HttpRoute is attached to, as one of the routing rules to route the requests served by the mesh.
	// Each mesh reference should match the pattern: projects/*/locations/global/meshes/<mesh_name>.
	// The attached Mesh should be of a type SIDECAR.
	Meshes []string `pulumi:"meshes"`
	// Name of the HttpRoute resource.
	Name *string `pulumi:"name"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
	// Rules that define how traffic is routed and handled.
	// Structure is documented below.
	Rules []HttpRouteRule `pulumi:"rules"`
}

// The set of arguments for constructing a HttpRoute resource.
type HttpRouteArgs struct {
	// A free-text description of the resource. Max length 1024 characters.
	Description pulumi.StringPtrInput
	// Gateways defines a list of gateways this HttpRoute is attached to, as one of the routing rules to route the requests served by the gateway.
	// Each gateway reference should match the pattern: projects/*/locations/global/gateways/<gateway_name>
	Gateways pulumi.StringArrayInput
	// Set of hosts that should match against the HTTP host header to select a HttpRoute to process the request.
	Hostnames pulumi.StringArrayInput
	// Set of label tags associated with the HttpRoute resource.
	Labels pulumi.StringMapInput
	// Meshes defines a list of meshes this HttpRoute is attached to, as one of the routing rules to route the requests served by the mesh.
	// Each mesh reference should match the pattern: projects/*/locations/global/meshes/<mesh_name>.
	// The attached Mesh should be of a type SIDECAR.
	Meshes pulumi.StringArrayInput
	// Name of the HttpRoute resource.
	Name pulumi.StringPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
	// Rules that define how traffic is routed and handled.
	// Structure is documented below.
	Rules HttpRouteRuleArrayInput
}

func (HttpRouteArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*httpRouteArgs)(nil)).Elem()
}

type HttpRouteInput interface {
	pulumi.Input

	ToHttpRouteOutput() HttpRouteOutput
	ToHttpRouteOutputWithContext(ctx context.Context) HttpRouteOutput
}

func (*HttpRoute) ElementType() reflect.Type {
	return reflect.TypeOf((**HttpRoute)(nil)).Elem()
}

func (i *HttpRoute) ToHttpRouteOutput() HttpRouteOutput {
	return i.ToHttpRouteOutputWithContext(context.Background())
}

func (i *HttpRoute) ToHttpRouteOutputWithContext(ctx context.Context) HttpRouteOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HttpRouteOutput)
}

// HttpRouteArrayInput is an input type that accepts HttpRouteArray and HttpRouteArrayOutput values.
// You can construct a concrete instance of `HttpRouteArrayInput` via:
//
//	HttpRouteArray{ HttpRouteArgs{...} }
type HttpRouteArrayInput interface {
	pulumi.Input

	ToHttpRouteArrayOutput() HttpRouteArrayOutput
	ToHttpRouteArrayOutputWithContext(context.Context) HttpRouteArrayOutput
}

type HttpRouteArray []HttpRouteInput

func (HttpRouteArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*HttpRoute)(nil)).Elem()
}

func (i HttpRouteArray) ToHttpRouteArrayOutput() HttpRouteArrayOutput {
	return i.ToHttpRouteArrayOutputWithContext(context.Background())
}

func (i HttpRouteArray) ToHttpRouteArrayOutputWithContext(ctx context.Context) HttpRouteArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HttpRouteArrayOutput)
}

// HttpRouteMapInput is an input type that accepts HttpRouteMap and HttpRouteMapOutput values.
// You can construct a concrete instance of `HttpRouteMapInput` via:
//
//	HttpRouteMap{ "key": HttpRouteArgs{...} }
type HttpRouteMapInput interface {
	pulumi.Input

	ToHttpRouteMapOutput() HttpRouteMapOutput
	ToHttpRouteMapOutputWithContext(context.Context) HttpRouteMapOutput
}

type HttpRouteMap map[string]HttpRouteInput

func (HttpRouteMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*HttpRoute)(nil)).Elem()
}

func (i HttpRouteMap) ToHttpRouteMapOutput() HttpRouteMapOutput {
	return i.ToHttpRouteMapOutputWithContext(context.Background())
}

func (i HttpRouteMap) ToHttpRouteMapOutputWithContext(ctx context.Context) HttpRouteMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HttpRouteMapOutput)
}

type HttpRouteOutput struct{ *pulumi.OutputState }

func (HttpRouteOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**HttpRoute)(nil)).Elem()
}

func (o HttpRouteOutput) ToHttpRouteOutput() HttpRouteOutput {
	return o
}

func (o HttpRouteOutput) ToHttpRouteOutputWithContext(ctx context.Context) HttpRouteOutput {
	return o
}

// Time the HttpRoute was created in UTC.
func (o HttpRouteOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *HttpRoute) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// A free-text description of the resource. Max length 1024 characters.
func (o HttpRouteOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *HttpRoute) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Gateways defines a list of gateways this HttpRoute is attached to, as one of the routing rules to route the requests served by the gateway.
// Each gateway reference should match the pattern: projects/*/locations/global/gateways/<gateway_name>
func (o HttpRouteOutput) Gateways() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *HttpRoute) pulumi.StringArrayOutput { return v.Gateways }).(pulumi.StringArrayOutput)
}

// Set of hosts that should match against the HTTP host header to select a HttpRoute to process the request.
func (o HttpRouteOutput) Hostnames() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *HttpRoute) pulumi.StringArrayOutput { return v.Hostnames }).(pulumi.StringArrayOutput)
}

// Set of label tags associated with the HttpRoute resource.
func (o HttpRouteOutput) Labels() pulumi.StringMapOutput {
	return o.ApplyT(func(v *HttpRoute) pulumi.StringMapOutput { return v.Labels }).(pulumi.StringMapOutput)
}

// Meshes defines a list of meshes this HttpRoute is attached to, as one of the routing rules to route the requests served by the mesh.
// Each mesh reference should match the pattern: projects/*/locations/global/meshes/<mesh_name>.
// The attached Mesh should be of a type SIDECAR.
func (o HttpRouteOutput) Meshes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *HttpRoute) pulumi.StringArrayOutput { return v.Meshes }).(pulumi.StringArrayOutput)
}

// Name of the HttpRoute resource.
func (o HttpRouteOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *HttpRoute) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The ID of the project in which the resource belongs.
// If it is not provided, the provider project is used.
func (o HttpRouteOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *HttpRoute) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// Rules that define how traffic is routed and handled.
// Structure is documented below.
func (o HttpRouteOutput) Rules() HttpRouteRuleArrayOutput {
	return o.ApplyT(func(v *HttpRoute) HttpRouteRuleArrayOutput { return v.Rules }).(HttpRouteRuleArrayOutput)
}

// Server-defined URL of this resource.
func (o HttpRouteOutput) SelfLink() pulumi.StringOutput {
	return o.ApplyT(func(v *HttpRoute) pulumi.StringOutput { return v.SelfLink }).(pulumi.StringOutput)
}

// Time the HttpRoute was updated in UTC.
func (o HttpRouteOutput) UpdateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *HttpRoute) pulumi.StringOutput { return v.UpdateTime }).(pulumi.StringOutput)
}

type HttpRouteArrayOutput struct{ *pulumi.OutputState }

func (HttpRouteArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*HttpRoute)(nil)).Elem()
}

func (o HttpRouteArrayOutput) ToHttpRouteArrayOutput() HttpRouteArrayOutput {
	return o
}

func (o HttpRouteArrayOutput) ToHttpRouteArrayOutputWithContext(ctx context.Context) HttpRouteArrayOutput {
	return o
}

func (o HttpRouteArrayOutput) Index(i pulumi.IntInput) HttpRouteOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *HttpRoute {
		return vs[0].([]*HttpRoute)[vs[1].(int)]
	}).(HttpRouteOutput)
}

type HttpRouteMapOutput struct{ *pulumi.OutputState }

func (HttpRouteMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*HttpRoute)(nil)).Elem()
}

func (o HttpRouteMapOutput) ToHttpRouteMapOutput() HttpRouteMapOutput {
	return o
}

func (o HttpRouteMapOutput) ToHttpRouteMapOutputWithContext(ctx context.Context) HttpRouteMapOutput {
	return o
}

func (o HttpRouteMapOutput) MapIndex(k pulumi.StringInput) HttpRouteOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *HttpRoute {
		return vs[0].(map[string]*HttpRoute)[vs[1].(string)]
	}).(HttpRouteOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*HttpRouteInput)(nil)).Elem(), &HttpRoute{})
	pulumi.RegisterInputType(reflect.TypeOf((*HttpRouteArrayInput)(nil)).Elem(), HttpRouteArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*HttpRouteMapInput)(nil)).Elem(), HttpRouteMap{})
	pulumi.RegisterOutputType(HttpRouteOutput{})
	pulumi.RegisterOutputType(HttpRouteArrayOutput{})
	pulumi.RegisterOutputType(HttpRouteMapOutput{})
}