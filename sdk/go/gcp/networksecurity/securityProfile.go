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

// A security profile defines the behavior associated to a profile type.
//
// To get more information about SecurityProfile, see:
//
// * [API documentation](https://cloud.google.com/firewall/docs/reference/network-security/rest/v1/organizations.locations.securityProfiles)
// * How-to Guides
//   - [Create and manage security profiles](https://cloud.google.com/firewall/docs/configure-security-profiles)
//
// ## Example Usage
//
// ### Network Security Security Profile Basic
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
//			_, err := networksecurity.NewSecurityProfile(ctx, "default", &networksecurity.SecurityProfileArgs{
//				Name:        pulumi.String("my-security-profile"),
//				Parent:      pulumi.String("organizations/123456789"),
//				Description: pulumi.String("my description"),
//				Type:        pulumi.String("THREAT_PREVENTION"),
//				Labels: pulumi.StringMap{
//					"foo": pulumi.String("bar"),
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
// ### Network Security Security Profile Overrides
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
//			_, err := networksecurity.NewSecurityProfile(ctx, "default", &networksecurity.SecurityProfileArgs{
//				Name:        pulumi.String("my-security-profile"),
//				Parent:      pulumi.String("organizations/123456789"),
//				Description: pulumi.String("my description"),
//				Type:        pulumi.String("THREAT_PREVENTION"),
//				ThreatPreventionProfile: &networksecurity.SecurityProfileThreatPreventionProfileArgs{
//					SeverityOverrides: networksecurity.SecurityProfileThreatPreventionProfileSeverityOverrideArray{
//						&networksecurity.SecurityProfileThreatPreventionProfileSeverityOverrideArgs{
//							Action:   pulumi.String("ALLOW"),
//							Severity: pulumi.String("INFORMATIONAL"),
//						},
//						&networksecurity.SecurityProfileThreatPreventionProfileSeverityOverrideArgs{
//							Action:   pulumi.String("DENY"),
//							Severity: pulumi.String("HIGH"),
//						},
//					},
//					ThreatOverrides: networksecurity.SecurityProfileThreatPreventionProfileThreatOverrideArray{
//						&networksecurity.SecurityProfileThreatPreventionProfileThreatOverrideArgs{
//							Action:   pulumi.String("ALLOW"),
//							ThreatId: pulumi.String("280647"),
//						},
//					},
//					AntivirusOverrides: networksecurity.SecurityProfileThreatPreventionProfileAntivirusOverrideArray{
//						&networksecurity.SecurityProfileThreatPreventionProfileAntivirusOverrideArgs{
//							Protocol: pulumi.String("SMTP"),
//							Action:   pulumi.String("ALLOW"),
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
// ### Network Security Security Profile Mirroring
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/compute"
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/networksecurity"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_default, err := compute.NewNetwork(ctx, "default", &compute.NetworkArgs{
//				Name:                  pulumi.String("my-network"),
//				AutoCreateSubnetworks: pulumi.Bool(false),
//			})
//			if err != nil {
//				return err
//			}
//			defaultMirroringDeploymentGroup, err := networksecurity.NewMirroringDeploymentGroup(ctx, "default", &networksecurity.MirroringDeploymentGroupArgs{
//				MirroringDeploymentGroupId: pulumi.String("my-dg"),
//				Location:                   pulumi.String("global"),
//				Network:                    _default.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			defaultMirroringEndpointGroup, err := networksecurity.NewMirroringEndpointGroup(ctx, "default", &networksecurity.MirroringEndpointGroupArgs{
//				MirroringEndpointGroupId: pulumi.String("my-eg"),
//				Location:                 pulumi.String("global"),
//				MirroringDeploymentGroup: defaultMirroringDeploymentGroup.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = networksecurity.NewSecurityProfile(ctx, "default", &networksecurity.SecurityProfileArgs{
//				Name:        pulumi.String("my-security-profile"),
//				Parent:      pulumi.String("organizations/123456789"),
//				Description: pulumi.String("my description"),
//				Type:        pulumi.String("CUSTOM_MIRRORING"),
//				CustomMirroringProfile: &networksecurity.SecurityProfileCustomMirroringProfileArgs{
//					MirroringEndpointGroup: defaultMirroringEndpointGroup.ID(),
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
// ### Network Security Security Profile Intercept
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/compute"
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/networksecurity"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_default, err := compute.NewNetwork(ctx, "default", &compute.NetworkArgs{
//				Name:                  pulumi.String("my-network"),
//				AutoCreateSubnetworks: pulumi.Bool(false),
//			})
//			if err != nil {
//				return err
//			}
//			defaultInterceptDeploymentGroup, err := networksecurity.NewInterceptDeploymentGroup(ctx, "default", &networksecurity.InterceptDeploymentGroupArgs{
//				InterceptDeploymentGroupId: pulumi.String("my-dg"),
//				Location:                   pulumi.String("global"),
//				Network:                    _default.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			defaultInterceptEndpointGroup, err := networksecurity.NewInterceptEndpointGroup(ctx, "default", &networksecurity.InterceptEndpointGroupArgs{
//				InterceptEndpointGroupId: pulumi.String("my-eg"),
//				Location:                 pulumi.String("global"),
//				InterceptDeploymentGroup: defaultInterceptDeploymentGroup.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = networksecurity.NewSecurityProfile(ctx, "default", &networksecurity.SecurityProfileArgs{
//				Name:        pulumi.String("my-security-profile"),
//				Parent:      pulumi.String("organizations/123456789"),
//				Description: pulumi.String("my description"),
//				Type:        pulumi.String("CUSTOM_INTERCEPT"),
//				CustomInterceptProfile: &networksecurity.SecurityProfileCustomInterceptProfileArgs{
//					InterceptEndpointGroup: defaultInterceptEndpointGroup.ID(),
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
// SecurityProfile can be imported using any of these accepted formats:
//
// * `{{parent}}/locations/{{location}}/securityProfiles/{{name}}`
//
// When using the `pulumi import` command, SecurityProfile can be imported using one of the formats above. For example:
//
// ```sh
// $ pulumi import gcp:networksecurity/securityProfile:SecurityProfile default {{parent}}/locations/{{location}}/securityProfiles/{{name}}
// ```
type SecurityProfile struct {
	pulumi.CustomResourceState

	// Time the security profile was created in UTC.
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// The configuration for defining the Intercept Endpoint Group used to
	// intercept traffic to third-party firewall appliances.
	// Structure is documented below.
	CustomInterceptProfile SecurityProfileCustomInterceptProfilePtrOutput `pulumi:"customInterceptProfile"`
	// The configuration for defining the Mirroring Endpoint Group used to
	// mirror traffic to third-party collectors.
	// Structure is documented below.
	CustomMirroringProfile SecurityProfileCustomMirroringProfilePtrOutput `pulumi:"customMirroringProfile"`
	// An optional description of the security profile. The Max length is 512 characters.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
	EffectiveLabels pulumi.StringMapOutput `pulumi:"effectiveLabels"`
	// This checksum is computed by the server based on the value of other fields,
	// and may be sent on update and delete requests to ensure the client has an up-to-date
	// value before proceeding.
	Etag pulumi.StringOutput `pulumi:"etag"`
	// A map of key/value label pairs to assign to the resource.
	//
	// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
	// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
	Labels pulumi.StringMapOutput `pulumi:"labels"`
	// The location of the security profile.
	// The default value is `global`.
	Location pulumi.StringPtrOutput `pulumi:"location"`
	// The name of the security profile resource.
	Name pulumi.StringOutput `pulumi:"name"`
	// The name of the parent this security profile belongs to.
	// Format: organizations/{organization_id}.
	Parent pulumi.StringPtrOutput `pulumi:"parent"`
	// The combination of labels configured directly on the resource
	// and default labels configured on the provider.
	PulumiLabels pulumi.StringMapOutput `pulumi:"pulumiLabels"`
	// Server-defined URL of this resource.
	SelfLink pulumi.StringOutput `pulumi:"selfLink"`
	// The threat prevention configuration for the security profile.
	// Structure is documented below.
	ThreatPreventionProfile SecurityProfileThreatPreventionProfilePtrOutput `pulumi:"threatPreventionProfile"`
	// The type of security profile.
	// Possible values are: `THREAT_PREVENTION`, `CUSTOM_MIRRORING`, `CUSTOM_INTERCEPT`.
	Type pulumi.StringOutput `pulumi:"type"`
	// Time the security profile was updated in UTC.
	UpdateTime pulumi.StringOutput `pulumi:"updateTime"`
}

// NewSecurityProfile registers a new resource with the given unique name, arguments, and options.
func NewSecurityProfile(ctx *pulumi.Context,
	name string, args *SecurityProfileArgs, opts ...pulumi.ResourceOption) (*SecurityProfile, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"effectiveLabels",
		"pulumiLabels",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SecurityProfile
	err := ctx.RegisterResource("gcp:networksecurity/securityProfile:SecurityProfile", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSecurityProfile gets an existing SecurityProfile resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSecurityProfile(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SecurityProfileState, opts ...pulumi.ResourceOption) (*SecurityProfile, error) {
	var resource SecurityProfile
	err := ctx.ReadResource("gcp:networksecurity/securityProfile:SecurityProfile", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SecurityProfile resources.
type securityProfileState struct {
	// Time the security profile was created in UTC.
	CreateTime *string `pulumi:"createTime"`
	// The configuration for defining the Intercept Endpoint Group used to
	// intercept traffic to third-party firewall appliances.
	// Structure is documented below.
	CustomInterceptProfile *SecurityProfileCustomInterceptProfile `pulumi:"customInterceptProfile"`
	// The configuration for defining the Mirroring Endpoint Group used to
	// mirror traffic to third-party collectors.
	// Structure is documented below.
	CustomMirroringProfile *SecurityProfileCustomMirroringProfile `pulumi:"customMirroringProfile"`
	// An optional description of the security profile. The Max length is 512 characters.
	Description *string `pulumi:"description"`
	// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
	EffectiveLabels map[string]string `pulumi:"effectiveLabels"`
	// This checksum is computed by the server based on the value of other fields,
	// and may be sent on update and delete requests to ensure the client has an up-to-date
	// value before proceeding.
	Etag *string `pulumi:"etag"`
	// A map of key/value label pairs to assign to the resource.
	//
	// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
	// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
	Labels map[string]string `pulumi:"labels"`
	// The location of the security profile.
	// The default value is `global`.
	Location *string `pulumi:"location"`
	// The name of the security profile resource.
	Name *string `pulumi:"name"`
	// The name of the parent this security profile belongs to.
	// Format: organizations/{organization_id}.
	Parent *string `pulumi:"parent"`
	// The combination of labels configured directly on the resource
	// and default labels configured on the provider.
	PulumiLabels map[string]string `pulumi:"pulumiLabels"`
	// Server-defined URL of this resource.
	SelfLink *string `pulumi:"selfLink"`
	// The threat prevention configuration for the security profile.
	// Structure is documented below.
	ThreatPreventionProfile *SecurityProfileThreatPreventionProfile `pulumi:"threatPreventionProfile"`
	// The type of security profile.
	// Possible values are: `THREAT_PREVENTION`, `CUSTOM_MIRRORING`, `CUSTOM_INTERCEPT`.
	Type *string `pulumi:"type"`
	// Time the security profile was updated in UTC.
	UpdateTime *string `pulumi:"updateTime"`
}

type SecurityProfileState struct {
	// Time the security profile was created in UTC.
	CreateTime pulumi.StringPtrInput
	// The configuration for defining the Intercept Endpoint Group used to
	// intercept traffic to third-party firewall appliances.
	// Structure is documented below.
	CustomInterceptProfile SecurityProfileCustomInterceptProfilePtrInput
	// The configuration for defining the Mirroring Endpoint Group used to
	// mirror traffic to third-party collectors.
	// Structure is documented below.
	CustomMirroringProfile SecurityProfileCustomMirroringProfilePtrInput
	// An optional description of the security profile. The Max length is 512 characters.
	Description pulumi.StringPtrInput
	// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
	EffectiveLabels pulumi.StringMapInput
	// This checksum is computed by the server based on the value of other fields,
	// and may be sent on update and delete requests to ensure the client has an up-to-date
	// value before proceeding.
	Etag pulumi.StringPtrInput
	// A map of key/value label pairs to assign to the resource.
	//
	// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
	// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
	Labels pulumi.StringMapInput
	// The location of the security profile.
	// The default value is `global`.
	Location pulumi.StringPtrInput
	// The name of the security profile resource.
	Name pulumi.StringPtrInput
	// The name of the parent this security profile belongs to.
	// Format: organizations/{organization_id}.
	Parent pulumi.StringPtrInput
	// The combination of labels configured directly on the resource
	// and default labels configured on the provider.
	PulumiLabels pulumi.StringMapInput
	// Server-defined URL of this resource.
	SelfLink pulumi.StringPtrInput
	// The threat prevention configuration for the security profile.
	// Structure is documented below.
	ThreatPreventionProfile SecurityProfileThreatPreventionProfilePtrInput
	// The type of security profile.
	// Possible values are: `THREAT_PREVENTION`, `CUSTOM_MIRRORING`, `CUSTOM_INTERCEPT`.
	Type pulumi.StringPtrInput
	// Time the security profile was updated in UTC.
	UpdateTime pulumi.StringPtrInput
}

func (SecurityProfileState) ElementType() reflect.Type {
	return reflect.TypeOf((*securityProfileState)(nil)).Elem()
}

type securityProfileArgs struct {
	// The configuration for defining the Intercept Endpoint Group used to
	// intercept traffic to third-party firewall appliances.
	// Structure is documented below.
	CustomInterceptProfile *SecurityProfileCustomInterceptProfile `pulumi:"customInterceptProfile"`
	// The configuration for defining the Mirroring Endpoint Group used to
	// mirror traffic to third-party collectors.
	// Structure is documented below.
	CustomMirroringProfile *SecurityProfileCustomMirroringProfile `pulumi:"customMirroringProfile"`
	// An optional description of the security profile. The Max length is 512 characters.
	Description *string `pulumi:"description"`
	// A map of key/value label pairs to assign to the resource.
	//
	// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
	// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
	Labels map[string]string `pulumi:"labels"`
	// The location of the security profile.
	// The default value is `global`.
	Location *string `pulumi:"location"`
	// The name of the security profile resource.
	Name *string `pulumi:"name"`
	// The name of the parent this security profile belongs to.
	// Format: organizations/{organization_id}.
	Parent *string `pulumi:"parent"`
	// The threat prevention configuration for the security profile.
	// Structure is documented below.
	ThreatPreventionProfile *SecurityProfileThreatPreventionProfile `pulumi:"threatPreventionProfile"`
	// The type of security profile.
	// Possible values are: `THREAT_PREVENTION`, `CUSTOM_MIRRORING`, `CUSTOM_INTERCEPT`.
	Type string `pulumi:"type"`
}

// The set of arguments for constructing a SecurityProfile resource.
type SecurityProfileArgs struct {
	// The configuration for defining the Intercept Endpoint Group used to
	// intercept traffic to third-party firewall appliances.
	// Structure is documented below.
	CustomInterceptProfile SecurityProfileCustomInterceptProfilePtrInput
	// The configuration for defining the Mirroring Endpoint Group used to
	// mirror traffic to third-party collectors.
	// Structure is documented below.
	CustomMirroringProfile SecurityProfileCustomMirroringProfilePtrInput
	// An optional description of the security profile. The Max length is 512 characters.
	Description pulumi.StringPtrInput
	// A map of key/value label pairs to assign to the resource.
	//
	// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
	// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
	Labels pulumi.StringMapInput
	// The location of the security profile.
	// The default value is `global`.
	Location pulumi.StringPtrInput
	// The name of the security profile resource.
	Name pulumi.StringPtrInput
	// The name of the parent this security profile belongs to.
	// Format: organizations/{organization_id}.
	Parent pulumi.StringPtrInput
	// The threat prevention configuration for the security profile.
	// Structure is documented below.
	ThreatPreventionProfile SecurityProfileThreatPreventionProfilePtrInput
	// The type of security profile.
	// Possible values are: `THREAT_PREVENTION`, `CUSTOM_MIRRORING`, `CUSTOM_INTERCEPT`.
	Type pulumi.StringInput
}

func (SecurityProfileArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*securityProfileArgs)(nil)).Elem()
}

type SecurityProfileInput interface {
	pulumi.Input

	ToSecurityProfileOutput() SecurityProfileOutput
	ToSecurityProfileOutputWithContext(ctx context.Context) SecurityProfileOutput
}

func (*SecurityProfile) ElementType() reflect.Type {
	return reflect.TypeOf((**SecurityProfile)(nil)).Elem()
}

func (i *SecurityProfile) ToSecurityProfileOutput() SecurityProfileOutput {
	return i.ToSecurityProfileOutputWithContext(context.Background())
}

func (i *SecurityProfile) ToSecurityProfileOutputWithContext(ctx context.Context) SecurityProfileOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SecurityProfileOutput)
}

// SecurityProfileArrayInput is an input type that accepts SecurityProfileArray and SecurityProfileArrayOutput values.
// You can construct a concrete instance of `SecurityProfileArrayInput` via:
//
//	SecurityProfileArray{ SecurityProfileArgs{...} }
type SecurityProfileArrayInput interface {
	pulumi.Input

	ToSecurityProfileArrayOutput() SecurityProfileArrayOutput
	ToSecurityProfileArrayOutputWithContext(context.Context) SecurityProfileArrayOutput
}

type SecurityProfileArray []SecurityProfileInput

func (SecurityProfileArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SecurityProfile)(nil)).Elem()
}

func (i SecurityProfileArray) ToSecurityProfileArrayOutput() SecurityProfileArrayOutput {
	return i.ToSecurityProfileArrayOutputWithContext(context.Background())
}

func (i SecurityProfileArray) ToSecurityProfileArrayOutputWithContext(ctx context.Context) SecurityProfileArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SecurityProfileArrayOutput)
}

// SecurityProfileMapInput is an input type that accepts SecurityProfileMap and SecurityProfileMapOutput values.
// You can construct a concrete instance of `SecurityProfileMapInput` via:
//
//	SecurityProfileMap{ "key": SecurityProfileArgs{...} }
type SecurityProfileMapInput interface {
	pulumi.Input

	ToSecurityProfileMapOutput() SecurityProfileMapOutput
	ToSecurityProfileMapOutputWithContext(context.Context) SecurityProfileMapOutput
}

type SecurityProfileMap map[string]SecurityProfileInput

func (SecurityProfileMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SecurityProfile)(nil)).Elem()
}

func (i SecurityProfileMap) ToSecurityProfileMapOutput() SecurityProfileMapOutput {
	return i.ToSecurityProfileMapOutputWithContext(context.Background())
}

func (i SecurityProfileMap) ToSecurityProfileMapOutputWithContext(ctx context.Context) SecurityProfileMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SecurityProfileMapOutput)
}

type SecurityProfileOutput struct{ *pulumi.OutputState }

func (SecurityProfileOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SecurityProfile)(nil)).Elem()
}

func (o SecurityProfileOutput) ToSecurityProfileOutput() SecurityProfileOutput {
	return o
}

func (o SecurityProfileOutput) ToSecurityProfileOutputWithContext(ctx context.Context) SecurityProfileOutput {
	return o
}

// Time the security profile was created in UTC.
func (o SecurityProfileOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *SecurityProfile) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// The configuration for defining the Intercept Endpoint Group used to
// intercept traffic to third-party firewall appliances.
// Structure is documented below.
func (o SecurityProfileOutput) CustomInterceptProfile() SecurityProfileCustomInterceptProfilePtrOutput {
	return o.ApplyT(func(v *SecurityProfile) SecurityProfileCustomInterceptProfilePtrOutput {
		return v.CustomInterceptProfile
	}).(SecurityProfileCustomInterceptProfilePtrOutput)
}

// The configuration for defining the Mirroring Endpoint Group used to
// mirror traffic to third-party collectors.
// Structure is documented below.
func (o SecurityProfileOutput) CustomMirroringProfile() SecurityProfileCustomMirroringProfilePtrOutput {
	return o.ApplyT(func(v *SecurityProfile) SecurityProfileCustomMirroringProfilePtrOutput {
		return v.CustomMirroringProfile
	}).(SecurityProfileCustomMirroringProfilePtrOutput)
}

// An optional description of the security profile. The Max length is 512 characters.
func (o SecurityProfileOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SecurityProfile) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
func (o SecurityProfileOutput) EffectiveLabels() pulumi.StringMapOutput {
	return o.ApplyT(func(v *SecurityProfile) pulumi.StringMapOutput { return v.EffectiveLabels }).(pulumi.StringMapOutput)
}

// This checksum is computed by the server based on the value of other fields,
// and may be sent on update and delete requests to ensure the client has an up-to-date
// value before proceeding.
func (o SecurityProfileOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v *SecurityProfile) pulumi.StringOutput { return v.Etag }).(pulumi.StringOutput)
}

// A map of key/value label pairs to assign to the resource.
//
// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
func (o SecurityProfileOutput) Labels() pulumi.StringMapOutput {
	return o.ApplyT(func(v *SecurityProfile) pulumi.StringMapOutput { return v.Labels }).(pulumi.StringMapOutput)
}

// The location of the security profile.
// The default value is `global`.
func (o SecurityProfileOutput) Location() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SecurityProfile) pulumi.StringPtrOutput { return v.Location }).(pulumi.StringPtrOutput)
}

// The name of the security profile resource.
func (o SecurityProfileOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *SecurityProfile) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The name of the parent this security profile belongs to.
// Format: organizations/{organization_id}.
func (o SecurityProfileOutput) Parent() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SecurityProfile) pulumi.StringPtrOutput { return v.Parent }).(pulumi.StringPtrOutput)
}

// The combination of labels configured directly on the resource
// and default labels configured on the provider.
func (o SecurityProfileOutput) PulumiLabels() pulumi.StringMapOutput {
	return o.ApplyT(func(v *SecurityProfile) pulumi.StringMapOutput { return v.PulumiLabels }).(pulumi.StringMapOutput)
}

// Server-defined URL of this resource.
func (o SecurityProfileOutput) SelfLink() pulumi.StringOutput {
	return o.ApplyT(func(v *SecurityProfile) pulumi.StringOutput { return v.SelfLink }).(pulumi.StringOutput)
}

// The threat prevention configuration for the security profile.
// Structure is documented below.
func (o SecurityProfileOutput) ThreatPreventionProfile() SecurityProfileThreatPreventionProfilePtrOutput {
	return o.ApplyT(func(v *SecurityProfile) SecurityProfileThreatPreventionProfilePtrOutput {
		return v.ThreatPreventionProfile
	}).(SecurityProfileThreatPreventionProfilePtrOutput)
}

// The type of security profile.
// Possible values are: `THREAT_PREVENTION`, `CUSTOM_MIRRORING`, `CUSTOM_INTERCEPT`.
func (o SecurityProfileOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *SecurityProfile) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

// Time the security profile was updated in UTC.
func (o SecurityProfileOutput) UpdateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *SecurityProfile) pulumi.StringOutput { return v.UpdateTime }).(pulumi.StringOutput)
}

type SecurityProfileArrayOutput struct{ *pulumi.OutputState }

func (SecurityProfileArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SecurityProfile)(nil)).Elem()
}

func (o SecurityProfileArrayOutput) ToSecurityProfileArrayOutput() SecurityProfileArrayOutput {
	return o
}

func (o SecurityProfileArrayOutput) ToSecurityProfileArrayOutputWithContext(ctx context.Context) SecurityProfileArrayOutput {
	return o
}

func (o SecurityProfileArrayOutput) Index(i pulumi.IntInput) SecurityProfileOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SecurityProfile {
		return vs[0].([]*SecurityProfile)[vs[1].(int)]
	}).(SecurityProfileOutput)
}

type SecurityProfileMapOutput struct{ *pulumi.OutputState }

func (SecurityProfileMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SecurityProfile)(nil)).Elem()
}

func (o SecurityProfileMapOutput) ToSecurityProfileMapOutput() SecurityProfileMapOutput {
	return o
}

func (o SecurityProfileMapOutput) ToSecurityProfileMapOutputWithContext(ctx context.Context) SecurityProfileMapOutput {
	return o
}

func (o SecurityProfileMapOutput) MapIndex(k pulumi.StringInput) SecurityProfileOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SecurityProfile {
		return vs[0].(map[string]*SecurityProfile)[vs[1].(string)]
	}).(SecurityProfileOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SecurityProfileInput)(nil)).Elem(), &SecurityProfile{})
	pulumi.RegisterInputType(reflect.TypeOf((*SecurityProfileArrayInput)(nil)).Elem(), SecurityProfileArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SecurityProfileMapInput)(nil)).Elem(), SecurityProfileMap{})
	pulumi.RegisterOutputType(SecurityProfileOutput{})
	pulumi.RegisterOutputType(SecurityProfileArrayOutput{})
	pulumi.RegisterOutputType(SecurityProfileMapOutput{})
}
