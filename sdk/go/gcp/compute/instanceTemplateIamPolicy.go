// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package compute

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Three different resources help you manage your IAM policy for Compute Engine InstanceTemplate. Each of these resources serves a different use case:
//
// * `compute.InstanceTemplateIamPolicy`: Authoritative. Sets the IAM policy for the instancetemplate and replaces any existing policy already attached.
// * `compute.InstanceTemplateIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the instancetemplate are preserved.
// * `compute.InstanceTemplateIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the instancetemplate are preserved.
//
// # A data source can be used to retrieve policy data in advent you do not need creation
//
// * `compute.InstanceTemplateIamPolicy`: Retrieves the IAM policy for the instancetemplate
//
// > **Note:** `compute.InstanceTemplateIamPolicy` **cannot** be used in conjunction with `compute.InstanceTemplateIamBinding` and `compute.InstanceTemplateIamMember` or they will fight over what your policy should be.
//
// > **Note:** `compute.InstanceTemplateIamBinding` resources **can be** used in conjunction with `compute.InstanceTemplateIamMember` resources **only if** they do not grant privilege to the same role.
//
// > **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
//
// ## compute.InstanceTemplateIamPolicy
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/compute"
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/organizations"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			admin, err := organizations.LookupIAMPolicy(ctx, &organizations.LookupIAMPolicyArgs{
//				Bindings: []organizations.GetIAMPolicyBinding{
//					{
//						Role: "roles/compute.instanceAdmin",
//						Members: []string{
//							"user:jane@example.com",
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = compute.NewInstanceTemplateIamPolicy(ctx, "policy", &compute.InstanceTemplateIamPolicyArgs{
//				Project:    pulumi.Any(_default.Project),
//				Name:       pulumi.Any(_default.Name),
//				PolicyData: pulumi.String(admin.PolicyData),
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
// With IAM Conditions:
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/compute"
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/organizations"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			admin, err := organizations.LookupIAMPolicy(ctx, &organizations.LookupIAMPolicyArgs{
//				Bindings: []organizations.GetIAMPolicyBinding{
//					{
//						Role: "roles/compute.instanceAdmin",
//						Members: []string{
//							"user:jane@example.com",
//						},
//						Condition: {
//							Title:       "expires_after_2019_12_31",
//							Description: pulumi.StringRef("Expiring at midnight of 2019-12-31"),
//							Expression:  "request.time < timestamp(\"2020-01-01T00:00:00Z\")",
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = compute.NewInstanceTemplateIamPolicy(ctx, "policy", &compute.InstanceTemplateIamPolicyArgs{
//				Project:    pulumi.Any(_default.Project),
//				Name:       pulumi.Any(_default.Name),
//				PolicyData: pulumi.String(admin.PolicyData),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ## compute.InstanceTemplateIamBinding
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/compute"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := compute.NewInstanceTemplateIamBinding(ctx, "binding", &compute.InstanceTemplateIamBindingArgs{
//				Project: pulumi.Any(_default.Project),
//				Name:    pulumi.Any(_default.Name),
//				Role:    pulumi.String("roles/compute.instanceAdmin"),
//				Members: pulumi.StringArray{
//					pulumi.String("user:jane@example.com"),
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
// With IAM Conditions:
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/compute"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := compute.NewInstanceTemplateIamBinding(ctx, "binding", &compute.InstanceTemplateIamBindingArgs{
//				Project: pulumi.Any(_default.Project),
//				Name:    pulumi.Any(_default.Name),
//				Role:    pulumi.String("roles/compute.instanceAdmin"),
//				Members: pulumi.StringArray{
//					pulumi.String("user:jane@example.com"),
//				},
//				Condition: &compute.InstanceTemplateIamBindingConditionArgs{
//					Title:       pulumi.String("expires_after_2019_12_31"),
//					Description: pulumi.String("Expiring at midnight of 2019-12-31"),
//					Expression:  pulumi.String("request.time < timestamp(\"2020-01-01T00:00:00Z\")"),
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
// ## compute.InstanceTemplateIamMember
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/compute"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := compute.NewInstanceTemplateIamMember(ctx, "member", &compute.InstanceTemplateIamMemberArgs{
//				Project: pulumi.Any(_default.Project),
//				Name:    pulumi.Any(_default.Name),
//				Role:    pulumi.String("roles/compute.instanceAdmin"),
//				Member:  pulumi.String("user:jane@example.com"),
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
// With IAM Conditions:
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/compute"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := compute.NewInstanceTemplateIamMember(ctx, "member", &compute.InstanceTemplateIamMemberArgs{
//				Project: pulumi.Any(_default.Project),
//				Name:    pulumi.Any(_default.Name),
//				Role:    pulumi.String("roles/compute.instanceAdmin"),
//				Member:  pulumi.String("user:jane@example.com"),
//				Condition: &compute.InstanceTemplateIamMemberConditionArgs{
//					Title:       pulumi.String("expires_after_2019_12_31"),
//					Description: pulumi.String("Expiring at midnight of 2019-12-31"),
//					Expression:  pulumi.String("request.time < timestamp(\"2020-01-01T00:00:00Z\")"),
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
// ## This resource supports User Project Overrides.
//
// -
//
// # IAM policy for Compute Engine InstanceTemplate
// Three different resources help you manage your IAM policy for Compute Engine InstanceTemplate. Each of these resources serves a different use case:
//
// * `compute.InstanceTemplateIamPolicy`: Authoritative. Sets the IAM policy for the instancetemplate and replaces any existing policy already attached.
// * `compute.InstanceTemplateIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the instancetemplate are preserved.
// * `compute.InstanceTemplateIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the instancetemplate are preserved.
//
// # A data source can be used to retrieve policy data in advent you do not need creation
//
// * `compute.InstanceTemplateIamPolicy`: Retrieves the IAM policy for the instancetemplate
//
// > **Note:** `compute.InstanceTemplateIamPolicy` **cannot** be used in conjunction with `compute.InstanceTemplateIamBinding` and `compute.InstanceTemplateIamMember` or they will fight over what your policy should be.
//
// > **Note:** `compute.InstanceTemplateIamBinding` resources **can be** used in conjunction with `compute.InstanceTemplateIamMember` resources **only if** they do not grant privilege to the same role.
//
// > **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
//
// ## compute.InstanceTemplateIamPolicy
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/compute"
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/organizations"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			admin, err := organizations.LookupIAMPolicy(ctx, &organizations.LookupIAMPolicyArgs{
//				Bindings: []organizations.GetIAMPolicyBinding{
//					{
//						Role: "roles/compute.instanceAdmin",
//						Members: []string{
//							"user:jane@example.com",
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = compute.NewInstanceTemplateIamPolicy(ctx, "policy", &compute.InstanceTemplateIamPolicyArgs{
//				Project:    pulumi.Any(_default.Project),
//				Name:       pulumi.Any(_default.Name),
//				PolicyData: pulumi.String(admin.PolicyData),
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
// With IAM Conditions:
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/compute"
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/organizations"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			admin, err := organizations.LookupIAMPolicy(ctx, &organizations.LookupIAMPolicyArgs{
//				Bindings: []organizations.GetIAMPolicyBinding{
//					{
//						Role: "roles/compute.instanceAdmin",
//						Members: []string{
//							"user:jane@example.com",
//						},
//						Condition: {
//							Title:       "expires_after_2019_12_31",
//							Description: pulumi.StringRef("Expiring at midnight of 2019-12-31"),
//							Expression:  "request.time < timestamp(\"2020-01-01T00:00:00Z\")",
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = compute.NewInstanceTemplateIamPolicy(ctx, "policy", &compute.InstanceTemplateIamPolicyArgs{
//				Project:    pulumi.Any(_default.Project),
//				Name:       pulumi.Any(_default.Name),
//				PolicyData: pulumi.String(admin.PolicyData),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ## compute.InstanceTemplateIamBinding
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/compute"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := compute.NewInstanceTemplateIamBinding(ctx, "binding", &compute.InstanceTemplateIamBindingArgs{
//				Project: pulumi.Any(_default.Project),
//				Name:    pulumi.Any(_default.Name),
//				Role:    pulumi.String("roles/compute.instanceAdmin"),
//				Members: pulumi.StringArray{
//					pulumi.String("user:jane@example.com"),
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
// With IAM Conditions:
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/compute"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := compute.NewInstanceTemplateIamBinding(ctx, "binding", &compute.InstanceTemplateIamBindingArgs{
//				Project: pulumi.Any(_default.Project),
//				Name:    pulumi.Any(_default.Name),
//				Role:    pulumi.String("roles/compute.instanceAdmin"),
//				Members: pulumi.StringArray{
//					pulumi.String("user:jane@example.com"),
//				},
//				Condition: &compute.InstanceTemplateIamBindingConditionArgs{
//					Title:       pulumi.String("expires_after_2019_12_31"),
//					Description: pulumi.String("Expiring at midnight of 2019-12-31"),
//					Expression:  pulumi.String("request.time < timestamp(\"2020-01-01T00:00:00Z\")"),
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
// ## compute.InstanceTemplateIamMember
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/compute"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := compute.NewInstanceTemplateIamMember(ctx, "member", &compute.InstanceTemplateIamMemberArgs{
//				Project: pulumi.Any(_default.Project),
//				Name:    pulumi.Any(_default.Name),
//				Role:    pulumi.String("roles/compute.instanceAdmin"),
//				Member:  pulumi.String("user:jane@example.com"),
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
// With IAM Conditions:
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/compute"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := compute.NewInstanceTemplateIamMember(ctx, "member", &compute.InstanceTemplateIamMemberArgs{
//				Project: pulumi.Any(_default.Project),
//				Name:    pulumi.Any(_default.Name),
//				Role:    pulumi.String("roles/compute.instanceAdmin"),
//				Member:  pulumi.String("user:jane@example.com"),
//				Condition: &compute.InstanceTemplateIamMemberConditionArgs{
//					Title:       pulumi.String("expires_after_2019_12_31"),
//					Description: pulumi.String("Expiring at midnight of 2019-12-31"),
//					Expression:  pulumi.String("request.time < timestamp(\"2020-01-01T00:00:00Z\")"),
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
// For all import syntaxes, the "resource in question" can take any of the following forms:
//
// * projects/{{project}}/global/instanceTemplates/{{name}}
//
// * {{project}}/{{name}}
//
// * {{name}}
//
// Any variables not passed in the import command will be taken from the provider configuration.
//
// Compute Engine instancetemplate IAM resources can be imported using the resource identifiers, role, and member.
//
// IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
//
// ```sh
// $ pulumi import gcp:compute/instanceTemplateIamPolicy:InstanceTemplateIamPolicy editor "projects/{{project}}/global/instanceTemplates/{{instance_template}} roles/compute.instanceAdmin user:jane@example.com"
// ```
//
// IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
//
// ```sh
// $ pulumi import gcp:compute/instanceTemplateIamPolicy:InstanceTemplateIamPolicy editor "projects/{{project}}/global/instanceTemplates/{{instance_template}} roles/compute.instanceAdmin"
// ```
//
// IAM policy imports use the identifier of the resource in question, e.g.
//
// ```sh
// $ pulumi import gcp:compute/instanceTemplateIamPolicy:InstanceTemplateIamPolicy editor projects/{{project}}/global/instanceTemplates/{{instance_template}}
// ```
//
// -> **Custom Roles** If you're importing a IAM resource with a custom role, make sure to use the
//
//	full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
type InstanceTemplateIamPolicy struct {
	pulumi.CustomResourceState

	// (Computed) The etag of the IAM policy.
	Etag pulumi.StringOutput `pulumi:"etag"`
	// Used to find the parent resource to bind the IAM policy to
	Name pulumi.StringOutput `pulumi:"name"`
	// The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData pulumi.StringOutput `pulumi:"policyData"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringOutput `pulumi:"project"`
}

// NewInstanceTemplateIamPolicy registers a new resource with the given unique name, arguments, and options.
func NewInstanceTemplateIamPolicy(ctx *pulumi.Context,
	name string, args *InstanceTemplateIamPolicyArgs, opts ...pulumi.ResourceOption) (*InstanceTemplateIamPolicy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.PolicyData == nil {
		return nil, errors.New("invalid value for required argument 'PolicyData'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource InstanceTemplateIamPolicy
	err := ctx.RegisterResource("gcp:compute/instanceTemplateIamPolicy:InstanceTemplateIamPolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetInstanceTemplateIamPolicy gets an existing InstanceTemplateIamPolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetInstanceTemplateIamPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *InstanceTemplateIamPolicyState, opts ...pulumi.ResourceOption) (*InstanceTemplateIamPolicy, error) {
	var resource InstanceTemplateIamPolicy
	err := ctx.ReadResource("gcp:compute/instanceTemplateIamPolicy:InstanceTemplateIamPolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering InstanceTemplateIamPolicy resources.
type instanceTemplateIamPolicyState struct {
	// (Computed) The etag of the IAM policy.
	Etag *string `pulumi:"etag"`
	// Used to find the parent resource to bind the IAM policy to
	Name *string `pulumi:"name"`
	// The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData *string `pulumi:"policyData"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project *string `pulumi:"project"`
}

type InstanceTemplateIamPolicyState struct {
	// (Computed) The etag of the IAM policy.
	Etag pulumi.StringPtrInput
	// Used to find the parent resource to bind the IAM policy to
	Name pulumi.StringPtrInput
	// The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData pulumi.StringPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringPtrInput
}

func (InstanceTemplateIamPolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*instanceTemplateIamPolicyState)(nil)).Elem()
}

type instanceTemplateIamPolicyArgs struct {
	// Used to find the parent resource to bind the IAM policy to
	Name *string `pulumi:"name"`
	// The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData string `pulumi:"policyData"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project *string `pulumi:"project"`
}

// The set of arguments for constructing a InstanceTemplateIamPolicy resource.
type InstanceTemplateIamPolicyArgs struct {
	// Used to find the parent resource to bind the IAM policy to
	Name pulumi.StringPtrInput
	// The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData pulumi.StringInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringPtrInput
}

func (InstanceTemplateIamPolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*instanceTemplateIamPolicyArgs)(nil)).Elem()
}

type InstanceTemplateIamPolicyInput interface {
	pulumi.Input

	ToInstanceTemplateIamPolicyOutput() InstanceTemplateIamPolicyOutput
	ToInstanceTemplateIamPolicyOutputWithContext(ctx context.Context) InstanceTemplateIamPolicyOutput
}

func (*InstanceTemplateIamPolicy) ElementType() reflect.Type {
	return reflect.TypeOf((**InstanceTemplateIamPolicy)(nil)).Elem()
}

func (i *InstanceTemplateIamPolicy) ToInstanceTemplateIamPolicyOutput() InstanceTemplateIamPolicyOutput {
	return i.ToInstanceTemplateIamPolicyOutputWithContext(context.Background())
}

func (i *InstanceTemplateIamPolicy) ToInstanceTemplateIamPolicyOutputWithContext(ctx context.Context) InstanceTemplateIamPolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstanceTemplateIamPolicyOutput)
}

// InstanceTemplateIamPolicyArrayInput is an input type that accepts InstanceTemplateIamPolicyArray and InstanceTemplateIamPolicyArrayOutput values.
// You can construct a concrete instance of `InstanceTemplateIamPolicyArrayInput` via:
//
//	InstanceTemplateIamPolicyArray{ InstanceTemplateIamPolicyArgs{...} }
type InstanceTemplateIamPolicyArrayInput interface {
	pulumi.Input

	ToInstanceTemplateIamPolicyArrayOutput() InstanceTemplateIamPolicyArrayOutput
	ToInstanceTemplateIamPolicyArrayOutputWithContext(context.Context) InstanceTemplateIamPolicyArrayOutput
}

type InstanceTemplateIamPolicyArray []InstanceTemplateIamPolicyInput

func (InstanceTemplateIamPolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*InstanceTemplateIamPolicy)(nil)).Elem()
}

func (i InstanceTemplateIamPolicyArray) ToInstanceTemplateIamPolicyArrayOutput() InstanceTemplateIamPolicyArrayOutput {
	return i.ToInstanceTemplateIamPolicyArrayOutputWithContext(context.Background())
}

func (i InstanceTemplateIamPolicyArray) ToInstanceTemplateIamPolicyArrayOutputWithContext(ctx context.Context) InstanceTemplateIamPolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstanceTemplateIamPolicyArrayOutput)
}

// InstanceTemplateIamPolicyMapInput is an input type that accepts InstanceTemplateIamPolicyMap and InstanceTemplateIamPolicyMapOutput values.
// You can construct a concrete instance of `InstanceTemplateIamPolicyMapInput` via:
//
//	InstanceTemplateIamPolicyMap{ "key": InstanceTemplateIamPolicyArgs{...} }
type InstanceTemplateIamPolicyMapInput interface {
	pulumi.Input

	ToInstanceTemplateIamPolicyMapOutput() InstanceTemplateIamPolicyMapOutput
	ToInstanceTemplateIamPolicyMapOutputWithContext(context.Context) InstanceTemplateIamPolicyMapOutput
}

type InstanceTemplateIamPolicyMap map[string]InstanceTemplateIamPolicyInput

func (InstanceTemplateIamPolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*InstanceTemplateIamPolicy)(nil)).Elem()
}

func (i InstanceTemplateIamPolicyMap) ToInstanceTemplateIamPolicyMapOutput() InstanceTemplateIamPolicyMapOutput {
	return i.ToInstanceTemplateIamPolicyMapOutputWithContext(context.Background())
}

func (i InstanceTemplateIamPolicyMap) ToInstanceTemplateIamPolicyMapOutputWithContext(ctx context.Context) InstanceTemplateIamPolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstanceTemplateIamPolicyMapOutput)
}

type InstanceTemplateIamPolicyOutput struct{ *pulumi.OutputState }

func (InstanceTemplateIamPolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**InstanceTemplateIamPolicy)(nil)).Elem()
}

func (o InstanceTemplateIamPolicyOutput) ToInstanceTemplateIamPolicyOutput() InstanceTemplateIamPolicyOutput {
	return o
}

func (o InstanceTemplateIamPolicyOutput) ToInstanceTemplateIamPolicyOutputWithContext(ctx context.Context) InstanceTemplateIamPolicyOutput {
	return o
}

// (Computed) The etag of the IAM policy.
func (o InstanceTemplateIamPolicyOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v *InstanceTemplateIamPolicy) pulumi.StringOutput { return v.Etag }).(pulumi.StringOutput)
}

// Used to find the parent resource to bind the IAM policy to
func (o InstanceTemplateIamPolicyOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *InstanceTemplateIamPolicy) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The policy data generated by
// a `organizations.getIAMPolicy` data source.
func (o InstanceTemplateIamPolicyOutput) PolicyData() pulumi.StringOutput {
	return o.ApplyT(func(v *InstanceTemplateIamPolicy) pulumi.StringOutput { return v.PolicyData }).(pulumi.StringOutput)
}

// The ID of the project in which the resource belongs.
// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
func (o InstanceTemplateIamPolicyOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *InstanceTemplateIamPolicy) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

type InstanceTemplateIamPolicyArrayOutput struct{ *pulumi.OutputState }

func (InstanceTemplateIamPolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*InstanceTemplateIamPolicy)(nil)).Elem()
}

func (o InstanceTemplateIamPolicyArrayOutput) ToInstanceTemplateIamPolicyArrayOutput() InstanceTemplateIamPolicyArrayOutput {
	return o
}

func (o InstanceTemplateIamPolicyArrayOutput) ToInstanceTemplateIamPolicyArrayOutputWithContext(ctx context.Context) InstanceTemplateIamPolicyArrayOutput {
	return o
}

func (o InstanceTemplateIamPolicyArrayOutput) Index(i pulumi.IntInput) InstanceTemplateIamPolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *InstanceTemplateIamPolicy {
		return vs[0].([]*InstanceTemplateIamPolicy)[vs[1].(int)]
	}).(InstanceTemplateIamPolicyOutput)
}

type InstanceTemplateIamPolicyMapOutput struct{ *pulumi.OutputState }

func (InstanceTemplateIamPolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*InstanceTemplateIamPolicy)(nil)).Elem()
}

func (o InstanceTemplateIamPolicyMapOutput) ToInstanceTemplateIamPolicyMapOutput() InstanceTemplateIamPolicyMapOutput {
	return o
}

func (o InstanceTemplateIamPolicyMapOutput) ToInstanceTemplateIamPolicyMapOutputWithContext(ctx context.Context) InstanceTemplateIamPolicyMapOutput {
	return o
}

func (o InstanceTemplateIamPolicyMapOutput) MapIndex(k pulumi.StringInput) InstanceTemplateIamPolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *InstanceTemplateIamPolicy {
		return vs[0].(map[string]*InstanceTemplateIamPolicy)[vs[1].(string)]
	}).(InstanceTemplateIamPolicyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*InstanceTemplateIamPolicyInput)(nil)).Elem(), &InstanceTemplateIamPolicy{})
	pulumi.RegisterInputType(reflect.TypeOf((*InstanceTemplateIamPolicyArrayInput)(nil)).Elem(), InstanceTemplateIamPolicyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*InstanceTemplateIamPolicyMapInput)(nil)).Elem(), InstanceTemplateIamPolicyMap{})
	pulumi.RegisterOutputType(InstanceTemplateIamPolicyOutput{})
	pulumi.RegisterOutputType(InstanceTemplateIamPolicyArrayOutput{})
	pulumi.RegisterOutputType(InstanceTemplateIamPolicyMapOutput{})
}
