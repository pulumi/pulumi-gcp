// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package organizations

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Allows management of Organization Policies for a Google Cloud Organization.
//
// > **Warning:** This resource has been superseded by `orgpolicy.Policy`. `orgpolicy.Policy` uses Organization Policy API V2 instead of Cloud Resource Manager API V1 and it supports additional features such as tags and conditions.
//
// To get more information about Organization Policies, see:
//
// * [API documentation](https://cloud.google.com/resource-manager/reference/rest/v1/organizations/setOrgPolicy)
// * How-to Guides
//   - [Introduction to the Organization Policy Service](https://cloud.google.com/resource-manager/docs/organization-policy/overview)
//
// ## Example Usage
//
// To set policy with a [boolean constraint](https://cloud.google.com/resource-manager/docs/organization-policy/quickstart-boolean-constraints):
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/organizations"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := organizations.NewPolicy(ctx, "serial_port_policy", &organizations.PolicyArgs{
//				OrgId:      pulumi.String("123456789"),
//				Constraint: pulumi.String("compute.disableSerialPortAccess"),
//				BooleanPolicy: &organizations.PolicyBooleanPolicyArgs{
//					Enforced: pulumi.Bool(true),
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
// To set a policy with a [list constraint](https://cloud.google.com/resource-manager/docs/organization-policy/quickstart-list-constraints):
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/organizations"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := organizations.NewPolicy(ctx, "services_policy", &organizations.PolicyArgs{
//				OrgId:      pulumi.String("123456789"),
//				Constraint: pulumi.String("serviceuser.services"),
//				ListPolicy: &organizations.PolicyListPolicyArgs{
//					Allow: &organizations.PolicyListPolicyAllowArgs{
//						All: pulumi.Bool(true),
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
// Or to deny some services, use the following instead:
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/organizations"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := organizations.NewPolicy(ctx, "services_policy", &organizations.PolicyArgs{
//				OrgId:      pulumi.String("123456789"),
//				Constraint: pulumi.String("serviceuser.services"),
//				ListPolicy: &organizations.PolicyListPolicyArgs{
//					SuggestedValue: pulumi.String("compute.googleapis.com"),
//					Deny: &organizations.PolicyListPolicyDenyArgs{
//						Values: pulumi.StringArray{
//							pulumi.String("cloudresourcemanager.googleapis.com"),
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
// To restore the default organization policy, use the following instead:
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/organizations"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := organizations.NewPolicy(ctx, "services_policy", &organizations.PolicyArgs{
//				OrgId:      pulumi.String("123456789"),
//				Constraint: pulumi.String("serviceuser.services"),
//				RestorePolicy: &organizations.PolicyRestorePolicyArgs{
//					Default: pulumi.Bool(true),
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
// Organization Policies can be imported using the `org_id` and the `constraint`, e.g.
//
// * `{{org_id}}/constraints/{{constraint}}`
//
// When using the `pulumi import` command, Organization Policies can be imported using one of the formats above. For example:
//
// ```sh
// $ pulumi import gcp:organizations/policy:Policy default {{org_id}}/constraints/{{constraint}}
// ```
//
// It is all right if the constraint contains a slash, as in the example above.
type Policy struct {
	pulumi.CustomResourceState

	// A boolean policy is a constraint that is either enforced or not. Structure is documented
	// below.
	BooleanPolicy PolicyBooleanPolicyPtrOutput `pulumi:"booleanPolicy"`
	// The name of the Constraint the Policy is configuring, for example, `serviceuser.services`. Check out the [complete list of available constraints](https://cloud.google.com/resource-manager/docs/organization-policy/understanding-constraints#available_constraints).
	//
	// ***
	Constraint pulumi.StringOutput `pulumi:"constraint"`
	// (Computed) The etag of the organization policy. `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates of a policy from overwriting each other.
	Etag pulumi.StringOutput `pulumi:"etag"`
	// A policy that can define specific values that are allowed or denied for the given constraint. It can also be used to allow or deny all values. Structure is documented below.
	ListPolicy PolicyListPolicyPtrOutput `pulumi:"listPolicy"`
	// The numeric ID of the organization to set the policy for.
	OrgId pulumi.StringOutput `pulumi:"orgId"`
	// A restore policy is a constraint to restore the default policy. Structure is documented below.
	//
	// > **Note:** If none of [`booleanPolicy`, `listPolicy`, `restorePolicy`] are defined the policy for a given constraint will
	// effectively be unset. This is represented in the UI as the constraint being 'Inherited'.
	//
	// ***
	RestorePolicy PolicyRestorePolicyPtrOutput `pulumi:"restorePolicy"`
	// (Computed) The timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds, representing when the variable was last updated. Example: "2016-10-09T12:33:37.578138407Z".
	UpdateTime pulumi.StringOutput `pulumi:"updateTime"`
	// Version of the Policy. Default version is 0.
	Version pulumi.IntOutput `pulumi:"version"`
}

// NewPolicy registers a new resource with the given unique name, arguments, and options.
func NewPolicy(ctx *pulumi.Context,
	name string, args *PolicyArgs, opts ...pulumi.ResourceOption) (*Policy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Constraint == nil {
		return nil, errors.New("invalid value for required argument 'Constraint'")
	}
	if args.OrgId == nil {
		return nil, errors.New("invalid value for required argument 'OrgId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Policy
	err := ctx.RegisterResource("gcp:organizations/policy:Policy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPolicy gets an existing Policy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PolicyState, opts ...pulumi.ResourceOption) (*Policy, error) {
	var resource Policy
	err := ctx.ReadResource("gcp:organizations/policy:Policy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Policy resources.
type policyState struct {
	// A boolean policy is a constraint that is either enforced or not. Structure is documented
	// below.
	BooleanPolicy *PolicyBooleanPolicy `pulumi:"booleanPolicy"`
	// The name of the Constraint the Policy is configuring, for example, `serviceuser.services`. Check out the [complete list of available constraints](https://cloud.google.com/resource-manager/docs/organization-policy/understanding-constraints#available_constraints).
	//
	// ***
	Constraint *string `pulumi:"constraint"`
	// (Computed) The etag of the organization policy. `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates of a policy from overwriting each other.
	Etag *string `pulumi:"etag"`
	// A policy that can define specific values that are allowed or denied for the given constraint. It can also be used to allow or deny all values. Structure is documented below.
	ListPolicy *PolicyListPolicy `pulumi:"listPolicy"`
	// The numeric ID of the organization to set the policy for.
	OrgId *string `pulumi:"orgId"`
	// A restore policy is a constraint to restore the default policy. Structure is documented below.
	//
	// > **Note:** If none of [`booleanPolicy`, `listPolicy`, `restorePolicy`] are defined the policy for a given constraint will
	// effectively be unset. This is represented in the UI as the constraint being 'Inherited'.
	//
	// ***
	RestorePolicy *PolicyRestorePolicy `pulumi:"restorePolicy"`
	// (Computed) The timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds, representing when the variable was last updated. Example: "2016-10-09T12:33:37.578138407Z".
	UpdateTime *string `pulumi:"updateTime"`
	// Version of the Policy. Default version is 0.
	Version *int `pulumi:"version"`
}

type PolicyState struct {
	// A boolean policy is a constraint that is either enforced or not. Structure is documented
	// below.
	BooleanPolicy PolicyBooleanPolicyPtrInput
	// The name of the Constraint the Policy is configuring, for example, `serviceuser.services`. Check out the [complete list of available constraints](https://cloud.google.com/resource-manager/docs/organization-policy/understanding-constraints#available_constraints).
	//
	// ***
	Constraint pulumi.StringPtrInput
	// (Computed) The etag of the organization policy. `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates of a policy from overwriting each other.
	Etag pulumi.StringPtrInput
	// A policy that can define specific values that are allowed or denied for the given constraint. It can also be used to allow or deny all values. Structure is documented below.
	ListPolicy PolicyListPolicyPtrInput
	// The numeric ID of the organization to set the policy for.
	OrgId pulumi.StringPtrInput
	// A restore policy is a constraint to restore the default policy. Structure is documented below.
	//
	// > **Note:** If none of [`booleanPolicy`, `listPolicy`, `restorePolicy`] are defined the policy for a given constraint will
	// effectively be unset. This is represented in the UI as the constraint being 'Inherited'.
	//
	// ***
	RestorePolicy PolicyRestorePolicyPtrInput
	// (Computed) The timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds, representing when the variable was last updated. Example: "2016-10-09T12:33:37.578138407Z".
	UpdateTime pulumi.StringPtrInput
	// Version of the Policy. Default version is 0.
	Version pulumi.IntPtrInput
}

func (PolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*policyState)(nil)).Elem()
}

type policyArgs struct {
	// A boolean policy is a constraint that is either enforced or not. Structure is documented
	// below.
	BooleanPolicy *PolicyBooleanPolicy `pulumi:"booleanPolicy"`
	// The name of the Constraint the Policy is configuring, for example, `serviceuser.services`. Check out the [complete list of available constraints](https://cloud.google.com/resource-manager/docs/organization-policy/understanding-constraints#available_constraints).
	//
	// ***
	Constraint string `pulumi:"constraint"`
	// A policy that can define specific values that are allowed or denied for the given constraint. It can also be used to allow or deny all values. Structure is documented below.
	ListPolicy *PolicyListPolicy `pulumi:"listPolicy"`
	// The numeric ID of the organization to set the policy for.
	OrgId string `pulumi:"orgId"`
	// A restore policy is a constraint to restore the default policy. Structure is documented below.
	//
	// > **Note:** If none of [`booleanPolicy`, `listPolicy`, `restorePolicy`] are defined the policy for a given constraint will
	// effectively be unset. This is represented in the UI as the constraint being 'Inherited'.
	//
	// ***
	RestorePolicy *PolicyRestorePolicy `pulumi:"restorePolicy"`
	// Version of the Policy. Default version is 0.
	Version *int `pulumi:"version"`
}

// The set of arguments for constructing a Policy resource.
type PolicyArgs struct {
	// A boolean policy is a constraint that is either enforced or not. Structure is documented
	// below.
	BooleanPolicy PolicyBooleanPolicyPtrInput
	// The name of the Constraint the Policy is configuring, for example, `serviceuser.services`. Check out the [complete list of available constraints](https://cloud.google.com/resource-manager/docs/organization-policy/understanding-constraints#available_constraints).
	//
	// ***
	Constraint pulumi.StringInput
	// A policy that can define specific values that are allowed or denied for the given constraint. It can also be used to allow or deny all values. Structure is documented below.
	ListPolicy PolicyListPolicyPtrInput
	// The numeric ID of the organization to set the policy for.
	OrgId pulumi.StringInput
	// A restore policy is a constraint to restore the default policy. Structure is documented below.
	//
	// > **Note:** If none of [`booleanPolicy`, `listPolicy`, `restorePolicy`] are defined the policy for a given constraint will
	// effectively be unset. This is represented in the UI as the constraint being 'Inherited'.
	//
	// ***
	RestorePolicy PolicyRestorePolicyPtrInput
	// Version of the Policy. Default version is 0.
	Version pulumi.IntPtrInput
}

func (PolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*policyArgs)(nil)).Elem()
}

type PolicyInput interface {
	pulumi.Input

	ToPolicyOutput() PolicyOutput
	ToPolicyOutputWithContext(ctx context.Context) PolicyOutput
}

func (*Policy) ElementType() reflect.Type {
	return reflect.TypeOf((**Policy)(nil)).Elem()
}

func (i *Policy) ToPolicyOutput() PolicyOutput {
	return i.ToPolicyOutputWithContext(context.Background())
}

func (i *Policy) ToPolicyOutputWithContext(ctx context.Context) PolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PolicyOutput)
}

// PolicyArrayInput is an input type that accepts PolicyArray and PolicyArrayOutput values.
// You can construct a concrete instance of `PolicyArrayInput` via:
//
//	PolicyArray{ PolicyArgs{...} }
type PolicyArrayInput interface {
	pulumi.Input

	ToPolicyArrayOutput() PolicyArrayOutput
	ToPolicyArrayOutputWithContext(context.Context) PolicyArrayOutput
}

type PolicyArray []PolicyInput

func (PolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Policy)(nil)).Elem()
}

func (i PolicyArray) ToPolicyArrayOutput() PolicyArrayOutput {
	return i.ToPolicyArrayOutputWithContext(context.Background())
}

func (i PolicyArray) ToPolicyArrayOutputWithContext(ctx context.Context) PolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PolicyArrayOutput)
}

// PolicyMapInput is an input type that accepts PolicyMap and PolicyMapOutput values.
// You can construct a concrete instance of `PolicyMapInput` via:
//
//	PolicyMap{ "key": PolicyArgs{...} }
type PolicyMapInput interface {
	pulumi.Input

	ToPolicyMapOutput() PolicyMapOutput
	ToPolicyMapOutputWithContext(context.Context) PolicyMapOutput
}

type PolicyMap map[string]PolicyInput

func (PolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Policy)(nil)).Elem()
}

func (i PolicyMap) ToPolicyMapOutput() PolicyMapOutput {
	return i.ToPolicyMapOutputWithContext(context.Background())
}

func (i PolicyMap) ToPolicyMapOutputWithContext(ctx context.Context) PolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PolicyMapOutput)
}

type PolicyOutput struct{ *pulumi.OutputState }

func (PolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Policy)(nil)).Elem()
}

func (o PolicyOutput) ToPolicyOutput() PolicyOutput {
	return o
}

func (o PolicyOutput) ToPolicyOutputWithContext(ctx context.Context) PolicyOutput {
	return o
}

// A boolean policy is a constraint that is either enforced or not. Structure is documented
// below.
func (o PolicyOutput) BooleanPolicy() PolicyBooleanPolicyPtrOutput {
	return o.ApplyT(func(v *Policy) PolicyBooleanPolicyPtrOutput { return v.BooleanPolicy }).(PolicyBooleanPolicyPtrOutput)
}

// The name of the Constraint the Policy is configuring, for example, `serviceuser.services`. Check out the [complete list of available constraints](https://cloud.google.com/resource-manager/docs/organization-policy/understanding-constraints#available_constraints).
//
// ***
func (o PolicyOutput) Constraint() pulumi.StringOutput {
	return o.ApplyT(func(v *Policy) pulumi.StringOutput { return v.Constraint }).(pulumi.StringOutput)
}

// (Computed) The etag of the organization policy. `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates of a policy from overwriting each other.
func (o PolicyOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v *Policy) pulumi.StringOutput { return v.Etag }).(pulumi.StringOutput)
}

// A policy that can define specific values that are allowed or denied for the given constraint. It can also be used to allow or deny all values. Structure is documented below.
func (o PolicyOutput) ListPolicy() PolicyListPolicyPtrOutput {
	return o.ApplyT(func(v *Policy) PolicyListPolicyPtrOutput { return v.ListPolicy }).(PolicyListPolicyPtrOutput)
}

// The numeric ID of the organization to set the policy for.
func (o PolicyOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v *Policy) pulumi.StringOutput { return v.OrgId }).(pulumi.StringOutput)
}

// A restore policy is a constraint to restore the default policy. Structure is documented below.
//
// > **Note:** If none of [`booleanPolicy`, `listPolicy`, `restorePolicy`] are defined the policy for a given constraint will
// effectively be unset. This is represented in the UI as the constraint being 'Inherited'.
//
// ***
func (o PolicyOutput) RestorePolicy() PolicyRestorePolicyPtrOutput {
	return o.ApplyT(func(v *Policy) PolicyRestorePolicyPtrOutput { return v.RestorePolicy }).(PolicyRestorePolicyPtrOutput)
}

// (Computed) The timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds, representing when the variable was last updated. Example: "2016-10-09T12:33:37.578138407Z".
func (o PolicyOutput) UpdateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *Policy) pulumi.StringOutput { return v.UpdateTime }).(pulumi.StringOutput)
}

// Version of the Policy. Default version is 0.
func (o PolicyOutput) Version() pulumi.IntOutput {
	return o.ApplyT(func(v *Policy) pulumi.IntOutput { return v.Version }).(pulumi.IntOutput)
}

type PolicyArrayOutput struct{ *pulumi.OutputState }

func (PolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Policy)(nil)).Elem()
}

func (o PolicyArrayOutput) ToPolicyArrayOutput() PolicyArrayOutput {
	return o
}

func (o PolicyArrayOutput) ToPolicyArrayOutputWithContext(ctx context.Context) PolicyArrayOutput {
	return o
}

func (o PolicyArrayOutput) Index(i pulumi.IntInput) PolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Policy {
		return vs[0].([]*Policy)[vs[1].(int)]
	}).(PolicyOutput)
}

type PolicyMapOutput struct{ *pulumi.OutputState }

func (PolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Policy)(nil)).Elem()
}

func (o PolicyMapOutput) ToPolicyMapOutput() PolicyMapOutput {
	return o
}

func (o PolicyMapOutput) ToPolicyMapOutputWithContext(ctx context.Context) PolicyMapOutput {
	return o
}

func (o PolicyMapOutput) MapIndex(k pulumi.StringInput) PolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Policy {
		return vs[0].(map[string]*Policy)[vs[1].(string)]
	}).(PolicyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PolicyInput)(nil)).Elem(), &Policy{})
	pulumi.RegisterInputType(reflect.TypeOf((*PolicyArrayInput)(nil)).Elem(), PolicyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PolicyMapInput)(nil)).Elem(), PolicyMap{})
	pulumi.RegisterOutputType(PolicyOutput{})
	pulumi.RegisterOutputType(PolicyArrayOutput{})
	pulumi.RegisterOutputType(PolicyMapOutput{})
}
