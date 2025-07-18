// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package networksecurity

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// The GatewaySecurityPolicyRule resource is in a nested collection within a GatewaySecurityPolicy and represents
// a traffic matching condition and associated action to perform.
//
// To get more information about GatewaySecurityPolicyRule, see:
//
// * [API documentation](https://cloud.google.com/secure-web-proxy/docs/reference/network-security/rest/v1/projects.locations.gatewaySecurityPolicies.rules)
//
// ## Example Usage
//
// ### Network Security Gateway Security Policy Rules Basic
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
//			_default, err := networksecurity.NewGatewaySecurityPolicy(ctx, "default", &networksecurity.GatewaySecurityPolicyArgs{
//				Name:        pulumi.String("my-gateway-security-policy"),
//				Location:    pulumi.String("us-central1"),
//				Description: pulumi.String("gateway security policy created to be used as reference by the rule."),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = networksecurity.NewGatewaySecurityPolicyRule(ctx, "default", &networksecurity.GatewaySecurityPolicyRuleArgs{
//				Name:                  pulumi.String("my-gateway-security-policy-rule"),
//				Location:              pulumi.String("us-central1"),
//				GatewaySecurityPolicy: _default.Name,
//				Enabled:               pulumi.Bool(true),
//				Description:           pulumi.String("my description"),
//				Priority:              pulumi.Int(0),
//				SessionMatcher:        pulumi.String("host() == 'example.com'"),
//				BasicProfile:          pulumi.String("ALLOW"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Network Security Gateway Security Policy Rules Advanced
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
//			_default, err := networksecurity.NewGatewaySecurityPolicy(ctx, "default", &networksecurity.GatewaySecurityPolicyArgs{
//				Name:        pulumi.String("my-gateway-security-policy"),
//				Location:    pulumi.String("us-central1"),
//				Description: pulumi.String("gateway security policy created to be used as reference by the rule."),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = networksecurity.NewGatewaySecurityPolicyRule(ctx, "default", &networksecurity.GatewaySecurityPolicyRuleArgs{
//				Name:                  pulumi.String("my-gateway-security-policy-rule"),
//				Location:              pulumi.String("us-central1"),
//				GatewaySecurityPolicy: _default.Name,
//				Enabled:               pulumi.Bool(true),
//				Description:           pulumi.String("my description"),
//				Priority:              pulumi.Int(0),
//				SessionMatcher:        pulumi.String("host() == 'example.com'"),
//				ApplicationMatcher:    pulumi.String("request.method == 'POST'"),
//				TlsInspectionEnabled:  pulumi.Bool(false),
//				BasicProfile:          pulumi.String("ALLOW"),
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
// GatewaySecurityPolicyRule can be imported using any of these accepted formats:
//
// * `projects/{{project}}/locations/{{location}}/gatewaySecurityPolicies/{{gateway_security_policy}}/rules/{{name}}`
//
// * `{{project}}/{{location}}/{{gateway_security_policy}}/{{name}}`
//
// * `{{location}}/{{gateway_security_policy}}/{{name}}`
//
// When using the `pulumi import` command, GatewaySecurityPolicyRule can be imported using one of the formats above. For example:
//
// ```sh
// $ pulumi import gcp:networksecurity/gatewaySecurityPolicyRule:GatewaySecurityPolicyRule default projects/{{project}}/locations/{{location}}/gatewaySecurityPolicies/{{gateway_security_policy}}/rules/{{name}}
// ```
//
// ```sh
// $ pulumi import gcp:networksecurity/gatewaySecurityPolicyRule:GatewaySecurityPolicyRule default {{project}}/{{location}}/{{gateway_security_policy}}/{{name}}
// ```
//
// ```sh
// $ pulumi import gcp:networksecurity/gatewaySecurityPolicyRule:GatewaySecurityPolicyRule default {{location}}/{{gateway_security_policy}}/{{name}}
// ```
type GatewaySecurityPolicyRule struct {
	pulumi.CustomResourceState

	// CEL expression for matching on L7/application level criteria.
	ApplicationMatcher pulumi.StringPtrOutput `pulumi:"applicationMatcher"`
	// Profile which tells what the primitive action should be. Possible values are: * ALLOW * DENY.
	// Possible values are: `BASIC_PROFILE_UNSPECIFIED`, `ALLOW`, `DENY`.
	BasicProfile pulumi.StringOutput `pulumi:"basicProfile"`
	// The timestamp when the resource was created.
	// A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits.
	// Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z"
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// Free-text description of the resource.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Whether the rule is enforced.
	Enabled pulumi.BoolOutput `pulumi:"enabled"`
	// The name of the gatewat security policy this rule belongs to.
	GatewaySecurityPolicy pulumi.StringOutput `pulumi:"gatewaySecurityPolicy"`
	// The location of the gateway security policy.
	Location pulumi.StringOutput `pulumi:"location"`
	// Name of the resource. ame is the full resource name so projects/{project}/locations/{location}/gatewaySecurityPolicies/{gateway_security_policy}/rules/{rule}
	// rule should match the pattern: (^a-z?$).
	Name pulumi.StringOutput `pulumi:"name"`
	// Priority of the rule. Lower number corresponds to higher precedence.
	Priority pulumi.IntOutput `pulumi:"priority"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringOutput `pulumi:"project"`
	// Server-defined URL of this resource.
	SelfLink pulumi.StringOutput `pulumi:"selfLink"`
	// CEL expression for matching on session criteria.
	SessionMatcher pulumi.StringOutput `pulumi:"sessionMatcher"`
	// Flag to enable TLS inspection of traffic matching on. Can only be true if the
	// parent GatewaySecurityPolicy references a TLSInspectionConfig.
	TlsInspectionEnabled pulumi.BoolPtrOutput `pulumi:"tlsInspectionEnabled"`
	// The timestamp when the resource was updated.
	// A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits.
	// Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
	UpdateTime pulumi.StringOutput `pulumi:"updateTime"`
}

// NewGatewaySecurityPolicyRule registers a new resource with the given unique name, arguments, and options.
func NewGatewaySecurityPolicyRule(ctx *pulumi.Context,
	name string, args *GatewaySecurityPolicyRuleArgs, opts ...pulumi.ResourceOption) (*GatewaySecurityPolicyRule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.BasicProfile == nil {
		return nil, errors.New("invalid value for required argument 'BasicProfile'")
	}
	if args.Enabled == nil {
		return nil, errors.New("invalid value for required argument 'Enabled'")
	}
	if args.GatewaySecurityPolicy == nil {
		return nil, errors.New("invalid value for required argument 'GatewaySecurityPolicy'")
	}
	if args.Location == nil {
		return nil, errors.New("invalid value for required argument 'Location'")
	}
	if args.Priority == nil {
		return nil, errors.New("invalid value for required argument 'Priority'")
	}
	if args.SessionMatcher == nil {
		return nil, errors.New("invalid value for required argument 'SessionMatcher'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource GatewaySecurityPolicyRule
	err := ctx.RegisterResource("gcp:networksecurity/gatewaySecurityPolicyRule:GatewaySecurityPolicyRule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetGatewaySecurityPolicyRule gets an existing GatewaySecurityPolicyRule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetGatewaySecurityPolicyRule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *GatewaySecurityPolicyRuleState, opts ...pulumi.ResourceOption) (*GatewaySecurityPolicyRule, error) {
	var resource GatewaySecurityPolicyRule
	err := ctx.ReadResource("gcp:networksecurity/gatewaySecurityPolicyRule:GatewaySecurityPolicyRule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering GatewaySecurityPolicyRule resources.
type gatewaySecurityPolicyRuleState struct {
	// CEL expression for matching on L7/application level criteria.
	ApplicationMatcher *string `pulumi:"applicationMatcher"`
	// Profile which tells what the primitive action should be. Possible values are: * ALLOW * DENY.
	// Possible values are: `BASIC_PROFILE_UNSPECIFIED`, `ALLOW`, `DENY`.
	BasicProfile *string `pulumi:"basicProfile"`
	// The timestamp when the resource was created.
	// A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits.
	// Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z"
	CreateTime *string `pulumi:"createTime"`
	// Free-text description of the resource.
	Description *string `pulumi:"description"`
	// Whether the rule is enforced.
	Enabled *bool `pulumi:"enabled"`
	// The name of the gatewat security policy this rule belongs to.
	GatewaySecurityPolicy *string `pulumi:"gatewaySecurityPolicy"`
	// The location of the gateway security policy.
	Location *string `pulumi:"location"`
	// Name of the resource. ame is the full resource name so projects/{project}/locations/{location}/gatewaySecurityPolicies/{gateway_security_policy}/rules/{rule}
	// rule should match the pattern: (^a-z?$).
	Name *string `pulumi:"name"`
	// Priority of the rule. Lower number corresponds to higher precedence.
	Priority *int `pulumi:"priority"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
	// Server-defined URL of this resource.
	SelfLink *string `pulumi:"selfLink"`
	// CEL expression for matching on session criteria.
	SessionMatcher *string `pulumi:"sessionMatcher"`
	// Flag to enable TLS inspection of traffic matching on. Can only be true if the
	// parent GatewaySecurityPolicy references a TLSInspectionConfig.
	TlsInspectionEnabled *bool `pulumi:"tlsInspectionEnabled"`
	// The timestamp when the resource was updated.
	// A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits.
	// Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
	UpdateTime *string `pulumi:"updateTime"`
}

type GatewaySecurityPolicyRuleState struct {
	// CEL expression for matching on L7/application level criteria.
	ApplicationMatcher pulumi.StringPtrInput
	// Profile which tells what the primitive action should be. Possible values are: * ALLOW * DENY.
	// Possible values are: `BASIC_PROFILE_UNSPECIFIED`, `ALLOW`, `DENY`.
	BasicProfile pulumi.StringPtrInput
	// The timestamp when the resource was created.
	// A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits.
	// Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z"
	CreateTime pulumi.StringPtrInput
	// Free-text description of the resource.
	Description pulumi.StringPtrInput
	// Whether the rule is enforced.
	Enabled pulumi.BoolPtrInput
	// The name of the gatewat security policy this rule belongs to.
	GatewaySecurityPolicy pulumi.StringPtrInput
	// The location of the gateway security policy.
	Location pulumi.StringPtrInput
	// Name of the resource. ame is the full resource name so projects/{project}/locations/{location}/gatewaySecurityPolicies/{gateway_security_policy}/rules/{rule}
	// rule should match the pattern: (^a-z?$).
	Name pulumi.StringPtrInput
	// Priority of the rule. Lower number corresponds to higher precedence.
	Priority pulumi.IntPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
	// Server-defined URL of this resource.
	SelfLink pulumi.StringPtrInput
	// CEL expression for matching on session criteria.
	SessionMatcher pulumi.StringPtrInput
	// Flag to enable TLS inspection of traffic matching on. Can only be true if the
	// parent GatewaySecurityPolicy references a TLSInspectionConfig.
	TlsInspectionEnabled pulumi.BoolPtrInput
	// The timestamp when the resource was updated.
	// A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits.
	// Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
	UpdateTime pulumi.StringPtrInput
}

func (GatewaySecurityPolicyRuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*gatewaySecurityPolicyRuleState)(nil)).Elem()
}

type gatewaySecurityPolicyRuleArgs struct {
	// CEL expression for matching on L7/application level criteria.
	ApplicationMatcher *string `pulumi:"applicationMatcher"`
	// Profile which tells what the primitive action should be. Possible values are: * ALLOW * DENY.
	// Possible values are: `BASIC_PROFILE_UNSPECIFIED`, `ALLOW`, `DENY`.
	BasicProfile string `pulumi:"basicProfile"`
	// Free-text description of the resource.
	Description *string `pulumi:"description"`
	// Whether the rule is enforced.
	Enabled bool `pulumi:"enabled"`
	// The name of the gatewat security policy this rule belongs to.
	GatewaySecurityPolicy string `pulumi:"gatewaySecurityPolicy"`
	// The location of the gateway security policy.
	Location string `pulumi:"location"`
	// Name of the resource. ame is the full resource name so projects/{project}/locations/{location}/gatewaySecurityPolicies/{gateway_security_policy}/rules/{rule}
	// rule should match the pattern: (^a-z?$).
	Name *string `pulumi:"name"`
	// Priority of the rule. Lower number corresponds to higher precedence.
	Priority int `pulumi:"priority"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
	// CEL expression for matching on session criteria.
	SessionMatcher string `pulumi:"sessionMatcher"`
	// Flag to enable TLS inspection of traffic matching on. Can only be true if the
	// parent GatewaySecurityPolicy references a TLSInspectionConfig.
	TlsInspectionEnabled *bool `pulumi:"tlsInspectionEnabled"`
}

// The set of arguments for constructing a GatewaySecurityPolicyRule resource.
type GatewaySecurityPolicyRuleArgs struct {
	// CEL expression for matching on L7/application level criteria.
	ApplicationMatcher pulumi.StringPtrInput
	// Profile which tells what the primitive action should be. Possible values are: * ALLOW * DENY.
	// Possible values are: `BASIC_PROFILE_UNSPECIFIED`, `ALLOW`, `DENY`.
	BasicProfile pulumi.StringInput
	// Free-text description of the resource.
	Description pulumi.StringPtrInput
	// Whether the rule is enforced.
	Enabled pulumi.BoolInput
	// The name of the gatewat security policy this rule belongs to.
	GatewaySecurityPolicy pulumi.StringInput
	// The location of the gateway security policy.
	Location pulumi.StringInput
	// Name of the resource. ame is the full resource name so projects/{project}/locations/{location}/gatewaySecurityPolicies/{gateway_security_policy}/rules/{rule}
	// rule should match the pattern: (^a-z?$).
	Name pulumi.StringPtrInput
	// Priority of the rule. Lower number corresponds to higher precedence.
	Priority pulumi.IntInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
	// CEL expression for matching on session criteria.
	SessionMatcher pulumi.StringInput
	// Flag to enable TLS inspection of traffic matching on. Can only be true if the
	// parent GatewaySecurityPolicy references a TLSInspectionConfig.
	TlsInspectionEnabled pulumi.BoolPtrInput
}

func (GatewaySecurityPolicyRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*gatewaySecurityPolicyRuleArgs)(nil)).Elem()
}

type GatewaySecurityPolicyRuleInput interface {
	pulumi.Input

	ToGatewaySecurityPolicyRuleOutput() GatewaySecurityPolicyRuleOutput
	ToGatewaySecurityPolicyRuleOutputWithContext(ctx context.Context) GatewaySecurityPolicyRuleOutput
}

func (*GatewaySecurityPolicyRule) ElementType() reflect.Type {
	return reflect.TypeOf((**GatewaySecurityPolicyRule)(nil)).Elem()
}

func (i *GatewaySecurityPolicyRule) ToGatewaySecurityPolicyRuleOutput() GatewaySecurityPolicyRuleOutput {
	return i.ToGatewaySecurityPolicyRuleOutputWithContext(context.Background())
}

func (i *GatewaySecurityPolicyRule) ToGatewaySecurityPolicyRuleOutputWithContext(ctx context.Context) GatewaySecurityPolicyRuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GatewaySecurityPolicyRuleOutput)
}

// GatewaySecurityPolicyRuleArrayInput is an input type that accepts GatewaySecurityPolicyRuleArray and GatewaySecurityPolicyRuleArrayOutput values.
// You can construct a concrete instance of `GatewaySecurityPolicyRuleArrayInput` via:
//
//	GatewaySecurityPolicyRuleArray{ GatewaySecurityPolicyRuleArgs{...} }
type GatewaySecurityPolicyRuleArrayInput interface {
	pulumi.Input

	ToGatewaySecurityPolicyRuleArrayOutput() GatewaySecurityPolicyRuleArrayOutput
	ToGatewaySecurityPolicyRuleArrayOutputWithContext(context.Context) GatewaySecurityPolicyRuleArrayOutput
}

type GatewaySecurityPolicyRuleArray []GatewaySecurityPolicyRuleInput

func (GatewaySecurityPolicyRuleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GatewaySecurityPolicyRule)(nil)).Elem()
}

func (i GatewaySecurityPolicyRuleArray) ToGatewaySecurityPolicyRuleArrayOutput() GatewaySecurityPolicyRuleArrayOutput {
	return i.ToGatewaySecurityPolicyRuleArrayOutputWithContext(context.Background())
}

func (i GatewaySecurityPolicyRuleArray) ToGatewaySecurityPolicyRuleArrayOutputWithContext(ctx context.Context) GatewaySecurityPolicyRuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GatewaySecurityPolicyRuleArrayOutput)
}

// GatewaySecurityPolicyRuleMapInput is an input type that accepts GatewaySecurityPolicyRuleMap and GatewaySecurityPolicyRuleMapOutput values.
// You can construct a concrete instance of `GatewaySecurityPolicyRuleMapInput` via:
//
//	GatewaySecurityPolicyRuleMap{ "key": GatewaySecurityPolicyRuleArgs{...} }
type GatewaySecurityPolicyRuleMapInput interface {
	pulumi.Input

	ToGatewaySecurityPolicyRuleMapOutput() GatewaySecurityPolicyRuleMapOutput
	ToGatewaySecurityPolicyRuleMapOutputWithContext(context.Context) GatewaySecurityPolicyRuleMapOutput
}

type GatewaySecurityPolicyRuleMap map[string]GatewaySecurityPolicyRuleInput

func (GatewaySecurityPolicyRuleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GatewaySecurityPolicyRule)(nil)).Elem()
}

func (i GatewaySecurityPolicyRuleMap) ToGatewaySecurityPolicyRuleMapOutput() GatewaySecurityPolicyRuleMapOutput {
	return i.ToGatewaySecurityPolicyRuleMapOutputWithContext(context.Background())
}

func (i GatewaySecurityPolicyRuleMap) ToGatewaySecurityPolicyRuleMapOutputWithContext(ctx context.Context) GatewaySecurityPolicyRuleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GatewaySecurityPolicyRuleMapOutput)
}

type GatewaySecurityPolicyRuleOutput struct{ *pulumi.OutputState }

func (GatewaySecurityPolicyRuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**GatewaySecurityPolicyRule)(nil)).Elem()
}

func (o GatewaySecurityPolicyRuleOutput) ToGatewaySecurityPolicyRuleOutput() GatewaySecurityPolicyRuleOutput {
	return o
}

func (o GatewaySecurityPolicyRuleOutput) ToGatewaySecurityPolicyRuleOutputWithContext(ctx context.Context) GatewaySecurityPolicyRuleOutput {
	return o
}

// CEL expression for matching on L7/application level criteria.
func (o GatewaySecurityPolicyRuleOutput) ApplicationMatcher() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GatewaySecurityPolicyRule) pulumi.StringPtrOutput { return v.ApplicationMatcher }).(pulumi.StringPtrOutput)
}

// Profile which tells what the primitive action should be. Possible values are: * ALLOW * DENY.
// Possible values are: `BASIC_PROFILE_UNSPECIFIED`, `ALLOW`, `DENY`.
func (o GatewaySecurityPolicyRuleOutput) BasicProfile() pulumi.StringOutput {
	return o.ApplyT(func(v *GatewaySecurityPolicyRule) pulumi.StringOutput { return v.BasicProfile }).(pulumi.StringOutput)
}

// The timestamp when the resource was created.
// A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits.
// Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z"
func (o GatewaySecurityPolicyRuleOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *GatewaySecurityPolicyRule) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// Free-text description of the resource.
func (o GatewaySecurityPolicyRuleOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GatewaySecurityPolicyRule) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Whether the rule is enforced.
func (o GatewaySecurityPolicyRuleOutput) Enabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *GatewaySecurityPolicyRule) pulumi.BoolOutput { return v.Enabled }).(pulumi.BoolOutput)
}

// The name of the gatewat security policy this rule belongs to.
func (o GatewaySecurityPolicyRuleOutput) GatewaySecurityPolicy() pulumi.StringOutput {
	return o.ApplyT(func(v *GatewaySecurityPolicyRule) pulumi.StringOutput { return v.GatewaySecurityPolicy }).(pulumi.StringOutput)
}

// The location of the gateway security policy.
func (o GatewaySecurityPolicyRuleOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *GatewaySecurityPolicyRule) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// Name of the resource. ame is the full resource name so projects/{project}/locations/{location}/gatewaySecurityPolicies/{gateway_security_policy}/rules/{rule}
// rule should match the pattern: (^a-z?$).
func (o GatewaySecurityPolicyRuleOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *GatewaySecurityPolicyRule) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Priority of the rule. Lower number corresponds to higher precedence.
func (o GatewaySecurityPolicyRuleOutput) Priority() pulumi.IntOutput {
	return o.ApplyT(func(v *GatewaySecurityPolicyRule) pulumi.IntOutput { return v.Priority }).(pulumi.IntOutput)
}

// The ID of the project in which the resource belongs.
// If it is not provided, the provider project is used.
func (o GatewaySecurityPolicyRuleOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *GatewaySecurityPolicyRule) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// Server-defined URL of this resource.
func (o GatewaySecurityPolicyRuleOutput) SelfLink() pulumi.StringOutput {
	return o.ApplyT(func(v *GatewaySecurityPolicyRule) pulumi.StringOutput { return v.SelfLink }).(pulumi.StringOutput)
}

// CEL expression for matching on session criteria.
func (o GatewaySecurityPolicyRuleOutput) SessionMatcher() pulumi.StringOutput {
	return o.ApplyT(func(v *GatewaySecurityPolicyRule) pulumi.StringOutput { return v.SessionMatcher }).(pulumi.StringOutput)
}

// Flag to enable TLS inspection of traffic matching on. Can only be true if the
// parent GatewaySecurityPolicy references a TLSInspectionConfig.
func (o GatewaySecurityPolicyRuleOutput) TlsInspectionEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *GatewaySecurityPolicyRule) pulumi.BoolPtrOutput { return v.TlsInspectionEnabled }).(pulumi.BoolPtrOutput)
}

// The timestamp when the resource was updated.
// A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits.
// Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
func (o GatewaySecurityPolicyRuleOutput) UpdateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *GatewaySecurityPolicyRule) pulumi.StringOutput { return v.UpdateTime }).(pulumi.StringOutput)
}

type GatewaySecurityPolicyRuleArrayOutput struct{ *pulumi.OutputState }

func (GatewaySecurityPolicyRuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GatewaySecurityPolicyRule)(nil)).Elem()
}

func (o GatewaySecurityPolicyRuleArrayOutput) ToGatewaySecurityPolicyRuleArrayOutput() GatewaySecurityPolicyRuleArrayOutput {
	return o
}

func (o GatewaySecurityPolicyRuleArrayOutput) ToGatewaySecurityPolicyRuleArrayOutputWithContext(ctx context.Context) GatewaySecurityPolicyRuleArrayOutput {
	return o
}

func (o GatewaySecurityPolicyRuleArrayOutput) Index(i pulumi.IntInput) GatewaySecurityPolicyRuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *GatewaySecurityPolicyRule {
		return vs[0].([]*GatewaySecurityPolicyRule)[vs[1].(int)]
	}).(GatewaySecurityPolicyRuleOutput)
}

type GatewaySecurityPolicyRuleMapOutput struct{ *pulumi.OutputState }

func (GatewaySecurityPolicyRuleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GatewaySecurityPolicyRule)(nil)).Elem()
}

func (o GatewaySecurityPolicyRuleMapOutput) ToGatewaySecurityPolicyRuleMapOutput() GatewaySecurityPolicyRuleMapOutput {
	return o
}

func (o GatewaySecurityPolicyRuleMapOutput) ToGatewaySecurityPolicyRuleMapOutputWithContext(ctx context.Context) GatewaySecurityPolicyRuleMapOutput {
	return o
}

func (o GatewaySecurityPolicyRuleMapOutput) MapIndex(k pulumi.StringInput) GatewaySecurityPolicyRuleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *GatewaySecurityPolicyRule {
		return vs[0].(map[string]*GatewaySecurityPolicyRule)[vs[1].(string)]
	}).(GatewaySecurityPolicyRuleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*GatewaySecurityPolicyRuleInput)(nil)).Elem(), &GatewaySecurityPolicyRule{})
	pulumi.RegisterInputType(reflect.TypeOf((*GatewaySecurityPolicyRuleArrayInput)(nil)).Elem(), GatewaySecurityPolicyRuleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GatewaySecurityPolicyRuleMapInput)(nil)).Elem(), GatewaySecurityPolicyRuleMap{})
	pulumi.RegisterOutputType(GatewaySecurityPolicyRuleOutput{})
	pulumi.RegisterOutputType(GatewaySecurityPolicyRuleArrayOutput{})
	pulumi.RegisterOutputType(GatewaySecurityPolicyRuleMapOutput{})
}
