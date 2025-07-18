// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package orgpolicy

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Custom constraints are created by administrators to provide more granular and customizable control over the specific fields that are restricted by your organization policies.
//
// To get more information about CustomConstraint, see:
//
// * [API documentation](https://cloud.google.com/resource-manager/docs/reference/orgpolicy/rest/v2/organizations.constraints)
// * How-to Guides
//   - [Official Documentation](https://cloud.google.com/resource-manager/docs/organization-policy/creating-managing-custom-constraints)
//   - [Supported Services](https://cloud.google.com/resource-manager/docs/organization-policy/custom-constraint-supported-services)
//
// ## Example Usage
//
// ### Org Policy Custom Constraint Basic
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/orgpolicy"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := orgpolicy.NewCustomConstraint(ctx, "constraint", &orgpolicy.CustomConstraintArgs{
//				Name:       pulumi.String("custom.disableGkeAutoUpgrade"),
//				Parent:     pulumi.String("organizations/123456789"),
//				ActionType: pulumi.String("ALLOW"),
//				Condition:  pulumi.String("resource.management.autoUpgrade == false"),
//				MethodTypes: pulumi.StringArray{
//					pulumi.String("CREATE"),
//					pulumi.String("UPDATE"),
//				},
//				ResourceTypes: pulumi.StringArray{
//					pulumi.String("container.googleapis.com/NodePool"),
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
// ### Org Policy Custom Constraint Full
//
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/orgpolicy"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			constraint, err := orgpolicy.NewCustomConstraint(ctx, "constraint", &orgpolicy.CustomConstraintArgs{
//				Name:        pulumi.String("custom.disableGkeAutoUpgrade"),
//				Parent:      pulumi.String("organizations/123456789"),
//				DisplayName: pulumi.String("Disable GKE auto upgrade"),
//				Description: pulumi.String("Only allow GKE NodePool resource to be created or updated if AutoUpgrade is not enabled where this custom constraint is enforced."),
//				ActionType:  pulumi.String("ALLOW"),
//				Condition:   pulumi.String("resource.management.autoUpgrade == false"),
//				MethodTypes: pulumi.StringArray{
//					pulumi.String("CREATE"),
//					pulumi.String("UPDATE"),
//				},
//				ResourceTypes: pulumi.StringArray{
//					pulumi.String("container.googleapis.com/NodePool"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = orgpolicy.NewPolicy(ctx, "bool", &orgpolicy.PolicyArgs{
//				Name: constraint.Name.ApplyT(func(name string) (string, error) {
//					return fmt.Sprintf("organizations/123456789/policies/%v", name), nil
//				}).(pulumi.StringOutput),
//				Parent: pulumi.String("organizations/123456789"),
//				Spec: &orgpolicy.PolicySpecArgs{
//					Rules: orgpolicy.PolicySpecRuleArray{
//						&orgpolicy.PolicySpecRuleArgs{
//							Enforce: pulumi.String("TRUE"),
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
// CustomConstraint can be imported using any of these accepted formats:
//
// * `{{parent}}/customConstraints/{{name}}`
//
// When using the `pulumi import` command, CustomConstraint can be imported using one of the formats above. For example:
//
// ```sh
// $ pulumi import gcp:orgpolicy/customConstraint:CustomConstraint default {{parent}}/customConstraints/{{name}}
// ```
type CustomConstraint struct {
	pulumi.CustomResourceState

	// The action to take if the condition is met.
	// Possible values are: `ALLOW`, `DENY`.
	ActionType pulumi.StringOutput `pulumi:"actionType"`
	// A CEL condition that refers to a supported service resource, for example `resource.management.autoUpgrade == false`. For details about CEL usage, see [Common Expression Language](https://cloud.google.com/resource-manager/docs/organization-policy/creating-managing-custom-constraints#common_expression_language).
	Condition pulumi.StringOutput `pulumi:"condition"`
	// A human-friendly description of the constraint to display as an error message when the policy is violated.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// A human-friendly name for the constraint.
	DisplayName pulumi.StringPtrOutput `pulumi:"displayName"`
	// A list of RESTful methods for which to enforce the constraint. Can be `CREATE`, `UPDATE`, or both. Not all Google Cloud services support both methods. To see supported methods for each service, find the service in [Supported services](https://cloud.google.com/resource-manager/docs/organization-policy/custom-constraint-supported-services).
	MethodTypes pulumi.StringArrayOutput `pulumi:"methodTypes"`
	// Immutable. The name of the custom constraint. This is unique within the organization.
	Name pulumi.StringOutput `pulumi:"name"`
	// The parent of the resource, an organization. Format should be `organizations/{organization_id}`.
	Parent pulumi.StringOutput `pulumi:"parent"`
	// Immutable. The fully qualified name of the Google Cloud REST resource containing the object and field you want to restrict. For example, `container.googleapis.com/NodePool`.
	ResourceTypes pulumi.StringArrayOutput `pulumi:"resourceTypes"`
	// Output only. The timestamp representing when the constraint was last updated.
	UpdateTime pulumi.StringOutput `pulumi:"updateTime"`
}

// NewCustomConstraint registers a new resource with the given unique name, arguments, and options.
func NewCustomConstraint(ctx *pulumi.Context,
	name string, args *CustomConstraintArgs, opts ...pulumi.ResourceOption) (*CustomConstraint, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ActionType == nil {
		return nil, errors.New("invalid value for required argument 'ActionType'")
	}
	if args.Condition == nil {
		return nil, errors.New("invalid value for required argument 'Condition'")
	}
	if args.MethodTypes == nil {
		return nil, errors.New("invalid value for required argument 'MethodTypes'")
	}
	if args.Parent == nil {
		return nil, errors.New("invalid value for required argument 'Parent'")
	}
	if args.ResourceTypes == nil {
		return nil, errors.New("invalid value for required argument 'ResourceTypes'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource CustomConstraint
	err := ctx.RegisterResource("gcp:orgpolicy/customConstraint:CustomConstraint", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCustomConstraint gets an existing CustomConstraint resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCustomConstraint(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CustomConstraintState, opts ...pulumi.ResourceOption) (*CustomConstraint, error) {
	var resource CustomConstraint
	err := ctx.ReadResource("gcp:orgpolicy/customConstraint:CustomConstraint", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CustomConstraint resources.
type customConstraintState struct {
	// The action to take if the condition is met.
	// Possible values are: `ALLOW`, `DENY`.
	ActionType *string `pulumi:"actionType"`
	// A CEL condition that refers to a supported service resource, for example `resource.management.autoUpgrade == false`. For details about CEL usage, see [Common Expression Language](https://cloud.google.com/resource-manager/docs/organization-policy/creating-managing-custom-constraints#common_expression_language).
	Condition *string `pulumi:"condition"`
	// A human-friendly description of the constraint to display as an error message when the policy is violated.
	Description *string `pulumi:"description"`
	// A human-friendly name for the constraint.
	DisplayName *string `pulumi:"displayName"`
	// A list of RESTful methods for which to enforce the constraint. Can be `CREATE`, `UPDATE`, or both. Not all Google Cloud services support both methods. To see supported methods for each service, find the service in [Supported services](https://cloud.google.com/resource-manager/docs/organization-policy/custom-constraint-supported-services).
	MethodTypes []string `pulumi:"methodTypes"`
	// Immutable. The name of the custom constraint. This is unique within the organization.
	Name *string `pulumi:"name"`
	// The parent of the resource, an organization. Format should be `organizations/{organization_id}`.
	Parent *string `pulumi:"parent"`
	// Immutable. The fully qualified name of the Google Cloud REST resource containing the object and field you want to restrict. For example, `container.googleapis.com/NodePool`.
	ResourceTypes []string `pulumi:"resourceTypes"`
	// Output only. The timestamp representing when the constraint was last updated.
	UpdateTime *string `pulumi:"updateTime"`
}

type CustomConstraintState struct {
	// The action to take if the condition is met.
	// Possible values are: `ALLOW`, `DENY`.
	ActionType pulumi.StringPtrInput
	// A CEL condition that refers to a supported service resource, for example `resource.management.autoUpgrade == false`. For details about CEL usage, see [Common Expression Language](https://cloud.google.com/resource-manager/docs/organization-policy/creating-managing-custom-constraints#common_expression_language).
	Condition pulumi.StringPtrInput
	// A human-friendly description of the constraint to display as an error message when the policy is violated.
	Description pulumi.StringPtrInput
	// A human-friendly name for the constraint.
	DisplayName pulumi.StringPtrInput
	// A list of RESTful methods for which to enforce the constraint. Can be `CREATE`, `UPDATE`, or both. Not all Google Cloud services support both methods. To see supported methods for each service, find the service in [Supported services](https://cloud.google.com/resource-manager/docs/organization-policy/custom-constraint-supported-services).
	MethodTypes pulumi.StringArrayInput
	// Immutable. The name of the custom constraint. This is unique within the organization.
	Name pulumi.StringPtrInput
	// The parent of the resource, an organization. Format should be `organizations/{organization_id}`.
	Parent pulumi.StringPtrInput
	// Immutable. The fully qualified name of the Google Cloud REST resource containing the object and field you want to restrict. For example, `container.googleapis.com/NodePool`.
	ResourceTypes pulumi.StringArrayInput
	// Output only. The timestamp representing when the constraint was last updated.
	UpdateTime pulumi.StringPtrInput
}

func (CustomConstraintState) ElementType() reflect.Type {
	return reflect.TypeOf((*customConstraintState)(nil)).Elem()
}

type customConstraintArgs struct {
	// The action to take if the condition is met.
	// Possible values are: `ALLOW`, `DENY`.
	ActionType string `pulumi:"actionType"`
	// A CEL condition that refers to a supported service resource, for example `resource.management.autoUpgrade == false`. For details about CEL usage, see [Common Expression Language](https://cloud.google.com/resource-manager/docs/organization-policy/creating-managing-custom-constraints#common_expression_language).
	Condition string `pulumi:"condition"`
	// A human-friendly description of the constraint to display as an error message when the policy is violated.
	Description *string `pulumi:"description"`
	// A human-friendly name for the constraint.
	DisplayName *string `pulumi:"displayName"`
	// A list of RESTful methods for which to enforce the constraint. Can be `CREATE`, `UPDATE`, or both. Not all Google Cloud services support both methods. To see supported methods for each service, find the service in [Supported services](https://cloud.google.com/resource-manager/docs/organization-policy/custom-constraint-supported-services).
	MethodTypes []string `pulumi:"methodTypes"`
	// Immutable. The name of the custom constraint. This is unique within the organization.
	Name *string `pulumi:"name"`
	// The parent of the resource, an organization. Format should be `organizations/{organization_id}`.
	Parent string `pulumi:"parent"`
	// Immutable. The fully qualified name of the Google Cloud REST resource containing the object and field you want to restrict. For example, `container.googleapis.com/NodePool`.
	ResourceTypes []string `pulumi:"resourceTypes"`
}

// The set of arguments for constructing a CustomConstraint resource.
type CustomConstraintArgs struct {
	// The action to take if the condition is met.
	// Possible values are: `ALLOW`, `DENY`.
	ActionType pulumi.StringInput
	// A CEL condition that refers to a supported service resource, for example `resource.management.autoUpgrade == false`. For details about CEL usage, see [Common Expression Language](https://cloud.google.com/resource-manager/docs/organization-policy/creating-managing-custom-constraints#common_expression_language).
	Condition pulumi.StringInput
	// A human-friendly description of the constraint to display as an error message when the policy is violated.
	Description pulumi.StringPtrInput
	// A human-friendly name for the constraint.
	DisplayName pulumi.StringPtrInput
	// A list of RESTful methods for which to enforce the constraint. Can be `CREATE`, `UPDATE`, or both. Not all Google Cloud services support both methods. To see supported methods for each service, find the service in [Supported services](https://cloud.google.com/resource-manager/docs/organization-policy/custom-constraint-supported-services).
	MethodTypes pulumi.StringArrayInput
	// Immutable. The name of the custom constraint. This is unique within the organization.
	Name pulumi.StringPtrInput
	// The parent of the resource, an organization. Format should be `organizations/{organization_id}`.
	Parent pulumi.StringInput
	// Immutable. The fully qualified name of the Google Cloud REST resource containing the object and field you want to restrict. For example, `container.googleapis.com/NodePool`.
	ResourceTypes pulumi.StringArrayInput
}

func (CustomConstraintArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*customConstraintArgs)(nil)).Elem()
}

type CustomConstraintInput interface {
	pulumi.Input

	ToCustomConstraintOutput() CustomConstraintOutput
	ToCustomConstraintOutputWithContext(ctx context.Context) CustomConstraintOutput
}

func (*CustomConstraint) ElementType() reflect.Type {
	return reflect.TypeOf((**CustomConstraint)(nil)).Elem()
}

func (i *CustomConstraint) ToCustomConstraintOutput() CustomConstraintOutput {
	return i.ToCustomConstraintOutputWithContext(context.Background())
}

func (i *CustomConstraint) ToCustomConstraintOutputWithContext(ctx context.Context) CustomConstraintOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CustomConstraintOutput)
}

// CustomConstraintArrayInput is an input type that accepts CustomConstraintArray and CustomConstraintArrayOutput values.
// You can construct a concrete instance of `CustomConstraintArrayInput` via:
//
//	CustomConstraintArray{ CustomConstraintArgs{...} }
type CustomConstraintArrayInput interface {
	pulumi.Input

	ToCustomConstraintArrayOutput() CustomConstraintArrayOutput
	ToCustomConstraintArrayOutputWithContext(context.Context) CustomConstraintArrayOutput
}

type CustomConstraintArray []CustomConstraintInput

func (CustomConstraintArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CustomConstraint)(nil)).Elem()
}

func (i CustomConstraintArray) ToCustomConstraintArrayOutput() CustomConstraintArrayOutput {
	return i.ToCustomConstraintArrayOutputWithContext(context.Background())
}

func (i CustomConstraintArray) ToCustomConstraintArrayOutputWithContext(ctx context.Context) CustomConstraintArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CustomConstraintArrayOutput)
}

// CustomConstraintMapInput is an input type that accepts CustomConstraintMap and CustomConstraintMapOutput values.
// You can construct a concrete instance of `CustomConstraintMapInput` via:
//
//	CustomConstraintMap{ "key": CustomConstraintArgs{...} }
type CustomConstraintMapInput interface {
	pulumi.Input

	ToCustomConstraintMapOutput() CustomConstraintMapOutput
	ToCustomConstraintMapOutputWithContext(context.Context) CustomConstraintMapOutput
}

type CustomConstraintMap map[string]CustomConstraintInput

func (CustomConstraintMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CustomConstraint)(nil)).Elem()
}

func (i CustomConstraintMap) ToCustomConstraintMapOutput() CustomConstraintMapOutput {
	return i.ToCustomConstraintMapOutputWithContext(context.Background())
}

func (i CustomConstraintMap) ToCustomConstraintMapOutputWithContext(ctx context.Context) CustomConstraintMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CustomConstraintMapOutput)
}

type CustomConstraintOutput struct{ *pulumi.OutputState }

func (CustomConstraintOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CustomConstraint)(nil)).Elem()
}

func (o CustomConstraintOutput) ToCustomConstraintOutput() CustomConstraintOutput {
	return o
}

func (o CustomConstraintOutput) ToCustomConstraintOutputWithContext(ctx context.Context) CustomConstraintOutput {
	return o
}

// The action to take if the condition is met.
// Possible values are: `ALLOW`, `DENY`.
func (o CustomConstraintOutput) ActionType() pulumi.StringOutput {
	return o.ApplyT(func(v *CustomConstraint) pulumi.StringOutput { return v.ActionType }).(pulumi.StringOutput)
}

// A CEL condition that refers to a supported service resource, for example `resource.management.autoUpgrade == false`. For details about CEL usage, see [Common Expression Language](https://cloud.google.com/resource-manager/docs/organization-policy/creating-managing-custom-constraints#common_expression_language).
func (o CustomConstraintOutput) Condition() pulumi.StringOutput {
	return o.ApplyT(func(v *CustomConstraint) pulumi.StringOutput { return v.Condition }).(pulumi.StringOutput)
}

// A human-friendly description of the constraint to display as an error message when the policy is violated.
func (o CustomConstraintOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CustomConstraint) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// A human-friendly name for the constraint.
func (o CustomConstraintOutput) DisplayName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CustomConstraint) pulumi.StringPtrOutput { return v.DisplayName }).(pulumi.StringPtrOutput)
}

// A list of RESTful methods for which to enforce the constraint. Can be `CREATE`, `UPDATE`, or both. Not all Google Cloud services support both methods. To see supported methods for each service, find the service in [Supported services](https://cloud.google.com/resource-manager/docs/organization-policy/custom-constraint-supported-services).
func (o CustomConstraintOutput) MethodTypes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *CustomConstraint) pulumi.StringArrayOutput { return v.MethodTypes }).(pulumi.StringArrayOutput)
}

// Immutable. The name of the custom constraint. This is unique within the organization.
func (o CustomConstraintOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *CustomConstraint) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The parent of the resource, an organization. Format should be `organizations/{organization_id}`.
func (o CustomConstraintOutput) Parent() pulumi.StringOutput {
	return o.ApplyT(func(v *CustomConstraint) pulumi.StringOutput { return v.Parent }).(pulumi.StringOutput)
}

// Immutable. The fully qualified name of the Google Cloud REST resource containing the object and field you want to restrict. For example, `container.googleapis.com/NodePool`.
func (o CustomConstraintOutput) ResourceTypes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *CustomConstraint) pulumi.StringArrayOutput { return v.ResourceTypes }).(pulumi.StringArrayOutput)
}

// Output only. The timestamp representing when the constraint was last updated.
func (o CustomConstraintOutput) UpdateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *CustomConstraint) pulumi.StringOutput { return v.UpdateTime }).(pulumi.StringOutput)
}

type CustomConstraintArrayOutput struct{ *pulumi.OutputState }

func (CustomConstraintArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CustomConstraint)(nil)).Elem()
}

func (o CustomConstraintArrayOutput) ToCustomConstraintArrayOutput() CustomConstraintArrayOutput {
	return o
}

func (o CustomConstraintArrayOutput) ToCustomConstraintArrayOutputWithContext(ctx context.Context) CustomConstraintArrayOutput {
	return o
}

func (o CustomConstraintArrayOutput) Index(i pulumi.IntInput) CustomConstraintOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *CustomConstraint {
		return vs[0].([]*CustomConstraint)[vs[1].(int)]
	}).(CustomConstraintOutput)
}

type CustomConstraintMapOutput struct{ *pulumi.OutputState }

func (CustomConstraintMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CustomConstraint)(nil)).Elem()
}

func (o CustomConstraintMapOutput) ToCustomConstraintMapOutput() CustomConstraintMapOutput {
	return o
}

func (o CustomConstraintMapOutput) ToCustomConstraintMapOutputWithContext(ctx context.Context) CustomConstraintMapOutput {
	return o
}

func (o CustomConstraintMapOutput) MapIndex(k pulumi.StringInput) CustomConstraintOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *CustomConstraint {
		return vs[0].(map[string]*CustomConstraint)[vs[1].(string)]
	}).(CustomConstraintOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CustomConstraintInput)(nil)).Elem(), &CustomConstraint{})
	pulumi.RegisterInputType(reflect.TypeOf((*CustomConstraintArrayInput)(nil)).Elem(), CustomConstraintArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CustomConstraintMapInput)(nil)).Elem(), CustomConstraintMap{})
	pulumi.RegisterOutputType(CustomConstraintOutput{})
	pulumi.RegisterOutputType(CustomConstraintArrayOutput{})
	pulumi.RegisterOutputType(CustomConstraintMapOutput{})
}
