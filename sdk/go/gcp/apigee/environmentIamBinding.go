// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package apigee

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Three different resources help you manage your IAM policy for Apigee Environment. Each of these resources serves a different use case:
//
// * `apigee.EnvironmentIamPolicy`: Authoritative. Sets the IAM policy for the environment and replaces any existing policy already attached.
// * `apigee.EnvironmentIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the environment are preserved.
// * `apigee.EnvironmentIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the environment are preserved.
//
// > **Note:** `apigee.EnvironmentIamPolicy` **cannot** be used in conjunction with `apigee.EnvironmentIamBinding` and `apigee.EnvironmentIamMember` or they will fight over what your policy should be.
//
// > **Note:** `apigee.EnvironmentIamBinding` resources **can be** used in conjunction with `apigee.EnvironmentIamMember` resources **only if** they do not grant privilege to the same role.
//
// ## google\_apigee\_environment\_iam\_policy
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/apigee"
// 	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/organizations"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		admin, err := organizations.LookupIAMPolicy(ctx, &organizations.LookupIAMPolicyArgs{
// 			Bindings: []organizations.GetIAMPolicyBinding{
// 				organizations.GetIAMPolicyBinding{
// 					Role: "roles/viewer",
// 					Members: []string{
// 						"user:jane@example.com",
// 					},
// 				},
// 			},
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		_, err = apigee.NewEnvironmentIamPolicy(ctx, "policy", &apigee.EnvironmentIamPolicyArgs{
// 			OrgId:      pulumi.Any(google_apigee_environment.Apigee_environment.Org_id),
// 			EnvId:      pulumi.Any(google_apigee_environment.Apigee_environment.Name),
// 			PolicyData: pulumi.String(admin.PolicyData),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## google\_apigee\_environment\_iam\_binding
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/apigee"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := apigee.NewEnvironmentIamBinding(ctx, "binding", &apigee.EnvironmentIamBindingArgs{
// 			OrgId: pulumi.Any(google_apigee_environment.Apigee_environment.Org_id),
// 			EnvId: pulumi.Any(google_apigee_environment.Apigee_environment.Name),
// 			Role:  pulumi.String("roles/viewer"),
// 			Members: pulumi.StringArray{
// 				pulumi.String("user:jane@example.com"),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## google\_apigee\_environment\_iam\_member
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/apigee"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := apigee.NewEnvironmentIamMember(ctx, "member", &apigee.EnvironmentIamMemberArgs{
// 			OrgId:  pulumi.Any(google_apigee_environment.Apigee_environment.Org_id),
// 			EnvId:  pulumi.Any(google_apigee_environment.Apigee_environment.Name),
// 			Role:   pulumi.String("roles/viewer"),
// 			Member: pulumi.String("user:jane@example.com"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// For all import syntaxes, the "resource in question" can take any of the following forms* {{org_id}}/environments/{{name}} * {{name}} Any variables not passed in the import command will be taken from the provider configuration. Apigee environment IAM resources can be imported using the resource identifiers, role, and member. IAM member imports use space-delimited identifiersthe resource in question, the role, and the member identity, e.g.
//
// ```sh
//  $ pulumi import gcp:apigee/environmentIamBinding:EnvironmentIamBinding editor "{{org_id}}/environments/{{environment}} roles/viewer user:jane@example.com"
// ```
//
//  IAM binding imports use space-delimited identifiersthe resource in question and the role, e.g.
//
// ```sh
//  $ pulumi import gcp:apigee/environmentIamBinding:EnvironmentIamBinding editor "{{org_id}}/environments/{{environment}} roles/viewer"
// ```
//
//  IAM policy imports use the identifier of the resource in question, e.g.
//
// ```sh
//  $ pulumi import gcp:apigee/environmentIamBinding:EnvironmentIamBinding editor {{org_id}}/environments/{{environment}}
// ```
//
//  -> **Custom Roles**If you're importing a IAM resource with a custom role, make sure to use the
//
// full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
type EnvironmentIamBinding struct {
	pulumi.CustomResourceState

	Condition EnvironmentIamBindingConditionPtrOutput `pulumi:"condition"`
	// Used to find the parent resource to bind the IAM policy to
	EnvId pulumi.StringOutput `pulumi:"envId"`
	// (Computed) The etag of the IAM policy.
	Etag    pulumi.StringOutput      `pulumi:"etag"`
	Members pulumi.StringArrayOutput `pulumi:"members"`
	OrgId   pulumi.StringOutput      `pulumi:"orgId"`
	// The role that should be applied. Only one
	// `apigee.EnvironmentIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringOutput `pulumi:"role"`
}

// NewEnvironmentIamBinding registers a new resource with the given unique name, arguments, and options.
func NewEnvironmentIamBinding(ctx *pulumi.Context,
	name string, args *EnvironmentIamBindingArgs, opts ...pulumi.ResourceOption) (*EnvironmentIamBinding, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.EnvId == nil {
		return nil, errors.New("invalid value for required argument 'EnvId'")
	}
	if args.Members == nil {
		return nil, errors.New("invalid value for required argument 'Members'")
	}
	if args.OrgId == nil {
		return nil, errors.New("invalid value for required argument 'OrgId'")
	}
	if args.Role == nil {
		return nil, errors.New("invalid value for required argument 'Role'")
	}
	var resource EnvironmentIamBinding
	err := ctx.RegisterResource("gcp:apigee/environmentIamBinding:EnvironmentIamBinding", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetEnvironmentIamBinding gets an existing EnvironmentIamBinding resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetEnvironmentIamBinding(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *EnvironmentIamBindingState, opts ...pulumi.ResourceOption) (*EnvironmentIamBinding, error) {
	var resource EnvironmentIamBinding
	err := ctx.ReadResource("gcp:apigee/environmentIamBinding:EnvironmentIamBinding", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering EnvironmentIamBinding resources.
type environmentIamBindingState struct {
	Condition *EnvironmentIamBindingCondition `pulumi:"condition"`
	// Used to find the parent resource to bind the IAM policy to
	EnvId *string `pulumi:"envId"`
	// (Computed) The etag of the IAM policy.
	Etag    *string  `pulumi:"etag"`
	Members []string `pulumi:"members"`
	OrgId   *string  `pulumi:"orgId"`
	// The role that should be applied. Only one
	// `apigee.EnvironmentIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role *string `pulumi:"role"`
}

type EnvironmentIamBindingState struct {
	Condition EnvironmentIamBindingConditionPtrInput
	// Used to find the parent resource to bind the IAM policy to
	EnvId pulumi.StringPtrInput
	// (Computed) The etag of the IAM policy.
	Etag    pulumi.StringPtrInput
	Members pulumi.StringArrayInput
	OrgId   pulumi.StringPtrInput
	// The role that should be applied. Only one
	// `apigee.EnvironmentIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringPtrInput
}

func (EnvironmentIamBindingState) ElementType() reflect.Type {
	return reflect.TypeOf((*environmentIamBindingState)(nil)).Elem()
}

type environmentIamBindingArgs struct {
	Condition *EnvironmentIamBindingCondition `pulumi:"condition"`
	// Used to find the parent resource to bind the IAM policy to
	EnvId   string   `pulumi:"envId"`
	Members []string `pulumi:"members"`
	OrgId   string   `pulumi:"orgId"`
	// The role that should be applied. Only one
	// `apigee.EnvironmentIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role string `pulumi:"role"`
}

// The set of arguments for constructing a EnvironmentIamBinding resource.
type EnvironmentIamBindingArgs struct {
	Condition EnvironmentIamBindingConditionPtrInput
	// Used to find the parent resource to bind the IAM policy to
	EnvId   pulumi.StringInput
	Members pulumi.StringArrayInput
	OrgId   pulumi.StringInput
	// The role that should be applied. Only one
	// `apigee.EnvironmentIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringInput
}

func (EnvironmentIamBindingArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*environmentIamBindingArgs)(nil)).Elem()
}

type EnvironmentIamBindingInput interface {
	pulumi.Input

	ToEnvironmentIamBindingOutput() EnvironmentIamBindingOutput
	ToEnvironmentIamBindingOutputWithContext(ctx context.Context) EnvironmentIamBindingOutput
}

func (*EnvironmentIamBinding) ElementType() reflect.Type {
	return reflect.TypeOf((*EnvironmentIamBinding)(nil))
}

func (i *EnvironmentIamBinding) ToEnvironmentIamBindingOutput() EnvironmentIamBindingOutput {
	return i.ToEnvironmentIamBindingOutputWithContext(context.Background())
}

func (i *EnvironmentIamBinding) ToEnvironmentIamBindingOutputWithContext(ctx context.Context) EnvironmentIamBindingOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EnvironmentIamBindingOutput)
}

func (i *EnvironmentIamBinding) ToEnvironmentIamBindingPtrOutput() EnvironmentIamBindingPtrOutput {
	return i.ToEnvironmentIamBindingPtrOutputWithContext(context.Background())
}

func (i *EnvironmentIamBinding) ToEnvironmentIamBindingPtrOutputWithContext(ctx context.Context) EnvironmentIamBindingPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EnvironmentIamBindingPtrOutput)
}

type EnvironmentIamBindingPtrInput interface {
	pulumi.Input

	ToEnvironmentIamBindingPtrOutput() EnvironmentIamBindingPtrOutput
	ToEnvironmentIamBindingPtrOutputWithContext(ctx context.Context) EnvironmentIamBindingPtrOutput
}

type environmentIamBindingPtrType EnvironmentIamBindingArgs

func (*environmentIamBindingPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**EnvironmentIamBinding)(nil))
}

func (i *environmentIamBindingPtrType) ToEnvironmentIamBindingPtrOutput() EnvironmentIamBindingPtrOutput {
	return i.ToEnvironmentIamBindingPtrOutputWithContext(context.Background())
}

func (i *environmentIamBindingPtrType) ToEnvironmentIamBindingPtrOutputWithContext(ctx context.Context) EnvironmentIamBindingPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EnvironmentIamBindingPtrOutput)
}

// EnvironmentIamBindingArrayInput is an input type that accepts EnvironmentIamBindingArray and EnvironmentIamBindingArrayOutput values.
// You can construct a concrete instance of `EnvironmentIamBindingArrayInput` via:
//
//          EnvironmentIamBindingArray{ EnvironmentIamBindingArgs{...} }
type EnvironmentIamBindingArrayInput interface {
	pulumi.Input

	ToEnvironmentIamBindingArrayOutput() EnvironmentIamBindingArrayOutput
	ToEnvironmentIamBindingArrayOutputWithContext(context.Context) EnvironmentIamBindingArrayOutput
}

type EnvironmentIamBindingArray []EnvironmentIamBindingInput

func (EnvironmentIamBindingArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EnvironmentIamBinding)(nil)).Elem()
}

func (i EnvironmentIamBindingArray) ToEnvironmentIamBindingArrayOutput() EnvironmentIamBindingArrayOutput {
	return i.ToEnvironmentIamBindingArrayOutputWithContext(context.Background())
}

func (i EnvironmentIamBindingArray) ToEnvironmentIamBindingArrayOutputWithContext(ctx context.Context) EnvironmentIamBindingArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EnvironmentIamBindingArrayOutput)
}

// EnvironmentIamBindingMapInput is an input type that accepts EnvironmentIamBindingMap and EnvironmentIamBindingMapOutput values.
// You can construct a concrete instance of `EnvironmentIamBindingMapInput` via:
//
//          EnvironmentIamBindingMap{ "key": EnvironmentIamBindingArgs{...} }
type EnvironmentIamBindingMapInput interface {
	pulumi.Input

	ToEnvironmentIamBindingMapOutput() EnvironmentIamBindingMapOutput
	ToEnvironmentIamBindingMapOutputWithContext(context.Context) EnvironmentIamBindingMapOutput
}

type EnvironmentIamBindingMap map[string]EnvironmentIamBindingInput

func (EnvironmentIamBindingMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EnvironmentIamBinding)(nil)).Elem()
}

func (i EnvironmentIamBindingMap) ToEnvironmentIamBindingMapOutput() EnvironmentIamBindingMapOutput {
	return i.ToEnvironmentIamBindingMapOutputWithContext(context.Background())
}

func (i EnvironmentIamBindingMap) ToEnvironmentIamBindingMapOutputWithContext(ctx context.Context) EnvironmentIamBindingMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EnvironmentIamBindingMapOutput)
}

type EnvironmentIamBindingOutput struct{ *pulumi.OutputState }

func (EnvironmentIamBindingOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*EnvironmentIamBinding)(nil))
}

func (o EnvironmentIamBindingOutput) ToEnvironmentIamBindingOutput() EnvironmentIamBindingOutput {
	return o
}

func (o EnvironmentIamBindingOutput) ToEnvironmentIamBindingOutputWithContext(ctx context.Context) EnvironmentIamBindingOutput {
	return o
}

func (o EnvironmentIamBindingOutput) ToEnvironmentIamBindingPtrOutput() EnvironmentIamBindingPtrOutput {
	return o.ToEnvironmentIamBindingPtrOutputWithContext(context.Background())
}

func (o EnvironmentIamBindingOutput) ToEnvironmentIamBindingPtrOutputWithContext(ctx context.Context) EnvironmentIamBindingPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v EnvironmentIamBinding) *EnvironmentIamBinding {
		return &v
	}).(EnvironmentIamBindingPtrOutput)
}

type EnvironmentIamBindingPtrOutput struct{ *pulumi.OutputState }

func (EnvironmentIamBindingPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**EnvironmentIamBinding)(nil))
}

func (o EnvironmentIamBindingPtrOutput) ToEnvironmentIamBindingPtrOutput() EnvironmentIamBindingPtrOutput {
	return o
}

func (o EnvironmentIamBindingPtrOutput) ToEnvironmentIamBindingPtrOutputWithContext(ctx context.Context) EnvironmentIamBindingPtrOutput {
	return o
}

func (o EnvironmentIamBindingPtrOutput) Elem() EnvironmentIamBindingOutput {
	return o.ApplyT(func(v *EnvironmentIamBinding) EnvironmentIamBinding {
		if v != nil {
			return *v
		}
		var ret EnvironmentIamBinding
		return ret
	}).(EnvironmentIamBindingOutput)
}

type EnvironmentIamBindingArrayOutput struct{ *pulumi.OutputState }

func (EnvironmentIamBindingArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]EnvironmentIamBinding)(nil))
}

func (o EnvironmentIamBindingArrayOutput) ToEnvironmentIamBindingArrayOutput() EnvironmentIamBindingArrayOutput {
	return o
}

func (o EnvironmentIamBindingArrayOutput) ToEnvironmentIamBindingArrayOutputWithContext(ctx context.Context) EnvironmentIamBindingArrayOutput {
	return o
}

func (o EnvironmentIamBindingArrayOutput) Index(i pulumi.IntInput) EnvironmentIamBindingOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) EnvironmentIamBinding {
		return vs[0].([]EnvironmentIamBinding)[vs[1].(int)]
	}).(EnvironmentIamBindingOutput)
}

type EnvironmentIamBindingMapOutput struct{ *pulumi.OutputState }

func (EnvironmentIamBindingMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]EnvironmentIamBinding)(nil))
}

func (o EnvironmentIamBindingMapOutput) ToEnvironmentIamBindingMapOutput() EnvironmentIamBindingMapOutput {
	return o
}

func (o EnvironmentIamBindingMapOutput) ToEnvironmentIamBindingMapOutputWithContext(ctx context.Context) EnvironmentIamBindingMapOutput {
	return o
}

func (o EnvironmentIamBindingMapOutput) MapIndex(k pulumi.StringInput) EnvironmentIamBindingOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) EnvironmentIamBinding {
		return vs[0].(map[string]EnvironmentIamBinding)[vs[1].(string)]
	}).(EnvironmentIamBindingOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*EnvironmentIamBindingInput)(nil)).Elem(), &EnvironmentIamBinding{})
	pulumi.RegisterInputType(reflect.TypeOf((*EnvironmentIamBindingPtrInput)(nil)).Elem(), &EnvironmentIamBinding{})
	pulumi.RegisterInputType(reflect.TypeOf((*EnvironmentIamBindingArrayInput)(nil)).Elem(), EnvironmentIamBindingArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*EnvironmentIamBindingMapInput)(nil)).Elem(), EnvironmentIamBindingMap{})
	pulumi.RegisterOutputType(EnvironmentIamBindingOutput{})
	pulumi.RegisterOutputType(EnvironmentIamBindingPtrOutput{})
	pulumi.RegisterOutputType(EnvironmentIamBindingArrayOutput{})
	pulumi.RegisterOutputType(EnvironmentIamBindingMapOutput{})
}