// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package compute

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// The Compute NetworkFirewallPolicyAssociation resource
//
// ## Example Usage
// ### Regional
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/compute"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			basicRegionalNetworkFirewallPolicy, err := compute.NewRegionNetworkFirewallPolicy(ctx, "basicRegionalNetworkFirewallPolicy", &compute.RegionNetworkFirewallPolicyArgs{
//				Project:     pulumi.String("my-project-name"),
//				Description: pulumi.String("Sample global network firewall policy"),
//				Region:      pulumi.String("us-west1"),
//			})
//			if err != nil {
//				return err
//			}
//			basicNetwork, err := compute.NewNetwork(ctx, "basicNetwork", nil)
//			if err != nil {
//				return err
//			}
//			_, err = compute.NewRegionNetworkFirewallPolicyAssociation(ctx, "primary", &compute.RegionNetworkFirewallPolicyAssociationArgs{
//				AttachmentTarget: basicNetwork.ID(),
//				FirewallPolicy:   basicRegionalNetworkFirewallPolicy.Name,
//				Project:          pulumi.String("my-project-name"),
//				Region:           pulumi.String("us-west1"),
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
// # NetworkFirewallPolicyAssociation can be imported using any of these accepted formats
//
// ```sh
//
//	$ pulumi import gcp:compute/regionNetworkFirewallPolicyAssociation:RegionNetworkFirewallPolicyAssociation default projects/{{project}}/regions/{{region}}/firewallPolicies/{{firewall_policy}}/associations/{{name}}
//
// ```
//
// ```sh
//
//	$ pulumi import gcp:compute/regionNetworkFirewallPolicyAssociation:RegionNetworkFirewallPolicyAssociation default {{project}}/{{region}}/{{firewall_policy}}/{{name}}
//
// ```
type RegionNetworkFirewallPolicyAssociation struct {
	pulumi.CustomResourceState

	// The target that the firewall policy is attached to.
	AttachmentTarget pulumi.StringOutput `pulumi:"attachmentTarget"`
	// The firewall policy ID of the association.
	FirewallPolicy pulumi.StringOutput `pulumi:"firewallPolicy"`
	// The name for an association.
	Name pulumi.StringOutput `pulumi:"name"`
	// The project for the resource
	Project pulumi.StringOutput `pulumi:"project"`
	// The location of this resource.
	Region pulumi.StringOutput `pulumi:"region"`
	// The short name of the firewall policy of the association.
	ShortName pulumi.StringOutput `pulumi:"shortName"`
}

// NewRegionNetworkFirewallPolicyAssociation registers a new resource with the given unique name, arguments, and options.
func NewRegionNetworkFirewallPolicyAssociation(ctx *pulumi.Context,
	name string, args *RegionNetworkFirewallPolicyAssociationArgs, opts ...pulumi.ResourceOption) (*RegionNetworkFirewallPolicyAssociation, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AttachmentTarget == nil {
		return nil, errors.New("invalid value for required argument 'AttachmentTarget'")
	}
	if args.FirewallPolicy == nil {
		return nil, errors.New("invalid value for required argument 'FirewallPolicy'")
	}
	var resource RegionNetworkFirewallPolicyAssociation
	err := ctx.RegisterResource("gcp:compute/regionNetworkFirewallPolicyAssociation:RegionNetworkFirewallPolicyAssociation", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRegionNetworkFirewallPolicyAssociation gets an existing RegionNetworkFirewallPolicyAssociation resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRegionNetworkFirewallPolicyAssociation(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RegionNetworkFirewallPolicyAssociationState, opts ...pulumi.ResourceOption) (*RegionNetworkFirewallPolicyAssociation, error) {
	var resource RegionNetworkFirewallPolicyAssociation
	err := ctx.ReadResource("gcp:compute/regionNetworkFirewallPolicyAssociation:RegionNetworkFirewallPolicyAssociation", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering RegionNetworkFirewallPolicyAssociation resources.
type regionNetworkFirewallPolicyAssociationState struct {
	// The target that the firewall policy is attached to.
	AttachmentTarget *string `pulumi:"attachmentTarget"`
	// The firewall policy ID of the association.
	FirewallPolicy *string `pulumi:"firewallPolicy"`
	// The name for an association.
	Name *string `pulumi:"name"`
	// The project for the resource
	Project *string `pulumi:"project"`
	// The location of this resource.
	Region *string `pulumi:"region"`
	// The short name of the firewall policy of the association.
	ShortName *string `pulumi:"shortName"`
}

type RegionNetworkFirewallPolicyAssociationState struct {
	// The target that the firewall policy is attached to.
	AttachmentTarget pulumi.StringPtrInput
	// The firewall policy ID of the association.
	FirewallPolicy pulumi.StringPtrInput
	// The name for an association.
	Name pulumi.StringPtrInput
	// The project for the resource
	Project pulumi.StringPtrInput
	// The location of this resource.
	Region pulumi.StringPtrInput
	// The short name of the firewall policy of the association.
	ShortName pulumi.StringPtrInput
}

func (RegionNetworkFirewallPolicyAssociationState) ElementType() reflect.Type {
	return reflect.TypeOf((*regionNetworkFirewallPolicyAssociationState)(nil)).Elem()
}

type regionNetworkFirewallPolicyAssociationArgs struct {
	// The target that the firewall policy is attached to.
	AttachmentTarget string `pulumi:"attachmentTarget"`
	// The firewall policy ID of the association.
	FirewallPolicy string `pulumi:"firewallPolicy"`
	// The name for an association.
	Name *string `pulumi:"name"`
	// The project for the resource
	Project *string `pulumi:"project"`
	// The location of this resource.
	Region *string `pulumi:"region"`
}

// The set of arguments for constructing a RegionNetworkFirewallPolicyAssociation resource.
type RegionNetworkFirewallPolicyAssociationArgs struct {
	// The target that the firewall policy is attached to.
	AttachmentTarget pulumi.StringInput
	// The firewall policy ID of the association.
	FirewallPolicy pulumi.StringInput
	// The name for an association.
	Name pulumi.StringPtrInput
	// The project for the resource
	Project pulumi.StringPtrInput
	// The location of this resource.
	Region pulumi.StringPtrInput
}

func (RegionNetworkFirewallPolicyAssociationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*regionNetworkFirewallPolicyAssociationArgs)(nil)).Elem()
}

type RegionNetworkFirewallPolicyAssociationInput interface {
	pulumi.Input

	ToRegionNetworkFirewallPolicyAssociationOutput() RegionNetworkFirewallPolicyAssociationOutput
	ToRegionNetworkFirewallPolicyAssociationOutputWithContext(ctx context.Context) RegionNetworkFirewallPolicyAssociationOutput
}

func (*RegionNetworkFirewallPolicyAssociation) ElementType() reflect.Type {
	return reflect.TypeOf((**RegionNetworkFirewallPolicyAssociation)(nil)).Elem()
}

func (i *RegionNetworkFirewallPolicyAssociation) ToRegionNetworkFirewallPolicyAssociationOutput() RegionNetworkFirewallPolicyAssociationOutput {
	return i.ToRegionNetworkFirewallPolicyAssociationOutputWithContext(context.Background())
}

func (i *RegionNetworkFirewallPolicyAssociation) ToRegionNetworkFirewallPolicyAssociationOutputWithContext(ctx context.Context) RegionNetworkFirewallPolicyAssociationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RegionNetworkFirewallPolicyAssociationOutput)
}

// RegionNetworkFirewallPolicyAssociationArrayInput is an input type that accepts RegionNetworkFirewallPolicyAssociationArray and RegionNetworkFirewallPolicyAssociationArrayOutput values.
// You can construct a concrete instance of `RegionNetworkFirewallPolicyAssociationArrayInput` via:
//
//	RegionNetworkFirewallPolicyAssociationArray{ RegionNetworkFirewallPolicyAssociationArgs{...} }
type RegionNetworkFirewallPolicyAssociationArrayInput interface {
	pulumi.Input

	ToRegionNetworkFirewallPolicyAssociationArrayOutput() RegionNetworkFirewallPolicyAssociationArrayOutput
	ToRegionNetworkFirewallPolicyAssociationArrayOutputWithContext(context.Context) RegionNetworkFirewallPolicyAssociationArrayOutput
}

type RegionNetworkFirewallPolicyAssociationArray []RegionNetworkFirewallPolicyAssociationInput

func (RegionNetworkFirewallPolicyAssociationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RegionNetworkFirewallPolicyAssociation)(nil)).Elem()
}

func (i RegionNetworkFirewallPolicyAssociationArray) ToRegionNetworkFirewallPolicyAssociationArrayOutput() RegionNetworkFirewallPolicyAssociationArrayOutput {
	return i.ToRegionNetworkFirewallPolicyAssociationArrayOutputWithContext(context.Background())
}

func (i RegionNetworkFirewallPolicyAssociationArray) ToRegionNetworkFirewallPolicyAssociationArrayOutputWithContext(ctx context.Context) RegionNetworkFirewallPolicyAssociationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RegionNetworkFirewallPolicyAssociationArrayOutput)
}

// RegionNetworkFirewallPolicyAssociationMapInput is an input type that accepts RegionNetworkFirewallPolicyAssociationMap and RegionNetworkFirewallPolicyAssociationMapOutput values.
// You can construct a concrete instance of `RegionNetworkFirewallPolicyAssociationMapInput` via:
//
//	RegionNetworkFirewallPolicyAssociationMap{ "key": RegionNetworkFirewallPolicyAssociationArgs{...} }
type RegionNetworkFirewallPolicyAssociationMapInput interface {
	pulumi.Input

	ToRegionNetworkFirewallPolicyAssociationMapOutput() RegionNetworkFirewallPolicyAssociationMapOutput
	ToRegionNetworkFirewallPolicyAssociationMapOutputWithContext(context.Context) RegionNetworkFirewallPolicyAssociationMapOutput
}

type RegionNetworkFirewallPolicyAssociationMap map[string]RegionNetworkFirewallPolicyAssociationInput

func (RegionNetworkFirewallPolicyAssociationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RegionNetworkFirewallPolicyAssociation)(nil)).Elem()
}

func (i RegionNetworkFirewallPolicyAssociationMap) ToRegionNetworkFirewallPolicyAssociationMapOutput() RegionNetworkFirewallPolicyAssociationMapOutput {
	return i.ToRegionNetworkFirewallPolicyAssociationMapOutputWithContext(context.Background())
}

func (i RegionNetworkFirewallPolicyAssociationMap) ToRegionNetworkFirewallPolicyAssociationMapOutputWithContext(ctx context.Context) RegionNetworkFirewallPolicyAssociationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RegionNetworkFirewallPolicyAssociationMapOutput)
}

type RegionNetworkFirewallPolicyAssociationOutput struct{ *pulumi.OutputState }

func (RegionNetworkFirewallPolicyAssociationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**RegionNetworkFirewallPolicyAssociation)(nil)).Elem()
}

func (o RegionNetworkFirewallPolicyAssociationOutput) ToRegionNetworkFirewallPolicyAssociationOutput() RegionNetworkFirewallPolicyAssociationOutput {
	return o
}

func (o RegionNetworkFirewallPolicyAssociationOutput) ToRegionNetworkFirewallPolicyAssociationOutputWithContext(ctx context.Context) RegionNetworkFirewallPolicyAssociationOutput {
	return o
}

// The target that the firewall policy is attached to.
func (o RegionNetworkFirewallPolicyAssociationOutput) AttachmentTarget() pulumi.StringOutput {
	return o.ApplyT(func(v *RegionNetworkFirewallPolicyAssociation) pulumi.StringOutput { return v.AttachmentTarget }).(pulumi.StringOutput)
}

// The firewall policy ID of the association.
func (o RegionNetworkFirewallPolicyAssociationOutput) FirewallPolicy() pulumi.StringOutput {
	return o.ApplyT(func(v *RegionNetworkFirewallPolicyAssociation) pulumi.StringOutput { return v.FirewallPolicy }).(pulumi.StringOutput)
}

// The name for an association.
func (o RegionNetworkFirewallPolicyAssociationOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *RegionNetworkFirewallPolicyAssociation) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The project for the resource
func (o RegionNetworkFirewallPolicyAssociationOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *RegionNetworkFirewallPolicyAssociation) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// The location of this resource.
func (o RegionNetworkFirewallPolicyAssociationOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v *RegionNetworkFirewallPolicyAssociation) pulumi.StringOutput { return v.Region }).(pulumi.StringOutput)
}

// The short name of the firewall policy of the association.
func (o RegionNetworkFirewallPolicyAssociationOutput) ShortName() pulumi.StringOutput {
	return o.ApplyT(func(v *RegionNetworkFirewallPolicyAssociation) pulumi.StringOutput { return v.ShortName }).(pulumi.StringOutput)
}

type RegionNetworkFirewallPolicyAssociationArrayOutput struct{ *pulumi.OutputState }

func (RegionNetworkFirewallPolicyAssociationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RegionNetworkFirewallPolicyAssociation)(nil)).Elem()
}

func (o RegionNetworkFirewallPolicyAssociationArrayOutput) ToRegionNetworkFirewallPolicyAssociationArrayOutput() RegionNetworkFirewallPolicyAssociationArrayOutput {
	return o
}

func (o RegionNetworkFirewallPolicyAssociationArrayOutput) ToRegionNetworkFirewallPolicyAssociationArrayOutputWithContext(ctx context.Context) RegionNetworkFirewallPolicyAssociationArrayOutput {
	return o
}

func (o RegionNetworkFirewallPolicyAssociationArrayOutput) Index(i pulumi.IntInput) RegionNetworkFirewallPolicyAssociationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *RegionNetworkFirewallPolicyAssociation {
		return vs[0].([]*RegionNetworkFirewallPolicyAssociation)[vs[1].(int)]
	}).(RegionNetworkFirewallPolicyAssociationOutput)
}

type RegionNetworkFirewallPolicyAssociationMapOutput struct{ *pulumi.OutputState }

func (RegionNetworkFirewallPolicyAssociationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RegionNetworkFirewallPolicyAssociation)(nil)).Elem()
}

func (o RegionNetworkFirewallPolicyAssociationMapOutput) ToRegionNetworkFirewallPolicyAssociationMapOutput() RegionNetworkFirewallPolicyAssociationMapOutput {
	return o
}

func (o RegionNetworkFirewallPolicyAssociationMapOutput) ToRegionNetworkFirewallPolicyAssociationMapOutputWithContext(ctx context.Context) RegionNetworkFirewallPolicyAssociationMapOutput {
	return o
}

func (o RegionNetworkFirewallPolicyAssociationMapOutput) MapIndex(k pulumi.StringInput) RegionNetworkFirewallPolicyAssociationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *RegionNetworkFirewallPolicyAssociation {
		return vs[0].(map[string]*RegionNetworkFirewallPolicyAssociation)[vs[1].(string)]
	}).(RegionNetworkFirewallPolicyAssociationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RegionNetworkFirewallPolicyAssociationInput)(nil)).Elem(), &RegionNetworkFirewallPolicyAssociation{})
	pulumi.RegisterInputType(reflect.TypeOf((*RegionNetworkFirewallPolicyAssociationArrayInput)(nil)).Elem(), RegionNetworkFirewallPolicyAssociationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RegionNetworkFirewallPolicyAssociationMapInput)(nil)).Elem(), RegionNetworkFirewallPolicyAssociationMap{})
	pulumi.RegisterOutputType(RegionNetworkFirewallPolicyAssociationOutput{})
	pulumi.RegisterOutputType(RegionNetworkFirewallPolicyAssociationArrayOutput{})
	pulumi.RegisterOutputType(RegionNetworkFirewallPolicyAssociationMapOutput{})
}