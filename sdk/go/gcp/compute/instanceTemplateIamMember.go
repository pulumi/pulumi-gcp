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
// $ pulumi import gcp:compute/instanceTemplateIamMember:InstanceTemplateIamMember editor "projects/{{project}}/global/instanceTemplates/{{instance_template}} roles/compute.instanceAdmin user:jane@example.com"
// ```
//
// IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
//
// ```sh
// $ pulumi import gcp:compute/instanceTemplateIamMember:InstanceTemplateIamMember editor "projects/{{project}}/global/instanceTemplates/{{instance_template}} roles/compute.instanceAdmin"
// ```
//
// IAM policy imports use the identifier of the resource in question, e.g.
//
// ```sh
// $ pulumi import gcp:compute/instanceTemplateIamMember:InstanceTemplateIamMember editor projects/{{project}}/global/instanceTemplates/{{instance_template}}
// ```
//
// -> **Custom Roles** If you're importing a IAM resource with a custom role, make sure to use the
//
//	full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
type InstanceTemplateIamMember struct {
	pulumi.CustomResourceState

	// An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
	// Structure is documented below.
	Condition InstanceTemplateIamMemberConditionPtrOutput `pulumi:"condition"`
	// (Computed) The etag of the IAM policy.
	Etag pulumi.StringOutput `pulumi:"etag"`
	// Identities that will be granted the privilege in `role`.
	// Each entry can have one of the following values:
	// * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
	// * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
	// * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
	// * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
	// * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
	// * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
	// * **projectOwner:projectid**: Owners of the given project. For example, "projectOwner:my-example-project"
	// * **projectEditor:projectid**: Editors of the given project. For example, "projectEditor:my-example-project"
	// * **projectViewer:projectid**: Viewers of the given project. For example, "projectViewer:my-example-project"
	Member pulumi.StringOutput `pulumi:"member"`
	// Used to find the parent resource to bind the IAM policy to
	Name pulumi.StringOutput `pulumi:"name"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringOutput `pulumi:"project"`
	// The role that should be applied. Only one
	// `compute.InstanceTemplateIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringOutput `pulumi:"role"`
}

// NewInstanceTemplateIamMember registers a new resource with the given unique name, arguments, and options.
func NewInstanceTemplateIamMember(ctx *pulumi.Context,
	name string, args *InstanceTemplateIamMemberArgs, opts ...pulumi.ResourceOption) (*InstanceTemplateIamMember, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Member == nil {
		return nil, errors.New("invalid value for required argument 'Member'")
	}
	if args.Role == nil {
		return nil, errors.New("invalid value for required argument 'Role'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource InstanceTemplateIamMember
	err := ctx.RegisterResource("gcp:compute/instanceTemplateIamMember:InstanceTemplateIamMember", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetInstanceTemplateIamMember gets an existing InstanceTemplateIamMember resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetInstanceTemplateIamMember(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *InstanceTemplateIamMemberState, opts ...pulumi.ResourceOption) (*InstanceTemplateIamMember, error) {
	var resource InstanceTemplateIamMember
	err := ctx.ReadResource("gcp:compute/instanceTemplateIamMember:InstanceTemplateIamMember", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering InstanceTemplateIamMember resources.
type instanceTemplateIamMemberState struct {
	// An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
	// Structure is documented below.
	Condition *InstanceTemplateIamMemberCondition `pulumi:"condition"`
	// (Computed) The etag of the IAM policy.
	Etag *string `pulumi:"etag"`
	// Identities that will be granted the privilege in `role`.
	// Each entry can have one of the following values:
	// * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
	// * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
	// * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
	// * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
	// * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
	// * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
	// * **projectOwner:projectid**: Owners of the given project. For example, "projectOwner:my-example-project"
	// * **projectEditor:projectid**: Editors of the given project. For example, "projectEditor:my-example-project"
	// * **projectViewer:projectid**: Viewers of the given project. For example, "projectViewer:my-example-project"
	Member *string `pulumi:"member"`
	// Used to find the parent resource to bind the IAM policy to
	Name *string `pulumi:"name"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project *string `pulumi:"project"`
	// The role that should be applied. Only one
	// `compute.InstanceTemplateIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role *string `pulumi:"role"`
}

type InstanceTemplateIamMemberState struct {
	// An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
	// Structure is documented below.
	Condition InstanceTemplateIamMemberConditionPtrInput
	// (Computed) The etag of the IAM policy.
	Etag pulumi.StringPtrInput
	// Identities that will be granted the privilege in `role`.
	// Each entry can have one of the following values:
	// * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
	// * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
	// * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
	// * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
	// * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
	// * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
	// * **projectOwner:projectid**: Owners of the given project. For example, "projectOwner:my-example-project"
	// * **projectEditor:projectid**: Editors of the given project. For example, "projectEditor:my-example-project"
	// * **projectViewer:projectid**: Viewers of the given project. For example, "projectViewer:my-example-project"
	Member pulumi.StringPtrInput
	// Used to find the parent resource to bind the IAM policy to
	Name pulumi.StringPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringPtrInput
	// The role that should be applied. Only one
	// `compute.InstanceTemplateIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringPtrInput
}

func (InstanceTemplateIamMemberState) ElementType() reflect.Type {
	return reflect.TypeOf((*instanceTemplateIamMemberState)(nil)).Elem()
}

type instanceTemplateIamMemberArgs struct {
	// An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
	// Structure is documented below.
	Condition *InstanceTemplateIamMemberCondition `pulumi:"condition"`
	// Identities that will be granted the privilege in `role`.
	// Each entry can have one of the following values:
	// * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
	// * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
	// * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
	// * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
	// * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
	// * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
	// * **projectOwner:projectid**: Owners of the given project. For example, "projectOwner:my-example-project"
	// * **projectEditor:projectid**: Editors of the given project. For example, "projectEditor:my-example-project"
	// * **projectViewer:projectid**: Viewers of the given project. For example, "projectViewer:my-example-project"
	Member string `pulumi:"member"`
	// Used to find the parent resource to bind the IAM policy to
	Name *string `pulumi:"name"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project *string `pulumi:"project"`
	// The role that should be applied. Only one
	// `compute.InstanceTemplateIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role string `pulumi:"role"`
}

// The set of arguments for constructing a InstanceTemplateIamMember resource.
type InstanceTemplateIamMemberArgs struct {
	// An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
	// Structure is documented below.
	Condition InstanceTemplateIamMemberConditionPtrInput
	// Identities that will be granted the privilege in `role`.
	// Each entry can have one of the following values:
	// * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
	// * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
	// * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
	// * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
	// * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
	// * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
	// * **projectOwner:projectid**: Owners of the given project. For example, "projectOwner:my-example-project"
	// * **projectEditor:projectid**: Editors of the given project. For example, "projectEditor:my-example-project"
	// * **projectViewer:projectid**: Viewers of the given project. For example, "projectViewer:my-example-project"
	Member pulumi.StringInput
	// Used to find the parent resource to bind the IAM policy to
	Name pulumi.StringPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringPtrInput
	// The role that should be applied. Only one
	// `compute.InstanceTemplateIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringInput
}

func (InstanceTemplateIamMemberArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*instanceTemplateIamMemberArgs)(nil)).Elem()
}

type InstanceTemplateIamMemberInput interface {
	pulumi.Input

	ToInstanceTemplateIamMemberOutput() InstanceTemplateIamMemberOutput
	ToInstanceTemplateIamMemberOutputWithContext(ctx context.Context) InstanceTemplateIamMemberOutput
}

func (*InstanceTemplateIamMember) ElementType() reflect.Type {
	return reflect.TypeOf((**InstanceTemplateIamMember)(nil)).Elem()
}

func (i *InstanceTemplateIamMember) ToInstanceTemplateIamMemberOutput() InstanceTemplateIamMemberOutput {
	return i.ToInstanceTemplateIamMemberOutputWithContext(context.Background())
}

func (i *InstanceTemplateIamMember) ToInstanceTemplateIamMemberOutputWithContext(ctx context.Context) InstanceTemplateIamMemberOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstanceTemplateIamMemberOutput)
}

// InstanceTemplateIamMemberArrayInput is an input type that accepts InstanceTemplateIamMemberArray and InstanceTemplateIamMemberArrayOutput values.
// You can construct a concrete instance of `InstanceTemplateIamMemberArrayInput` via:
//
//	InstanceTemplateIamMemberArray{ InstanceTemplateIamMemberArgs{...} }
type InstanceTemplateIamMemberArrayInput interface {
	pulumi.Input

	ToInstanceTemplateIamMemberArrayOutput() InstanceTemplateIamMemberArrayOutput
	ToInstanceTemplateIamMemberArrayOutputWithContext(context.Context) InstanceTemplateIamMemberArrayOutput
}

type InstanceTemplateIamMemberArray []InstanceTemplateIamMemberInput

func (InstanceTemplateIamMemberArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*InstanceTemplateIamMember)(nil)).Elem()
}

func (i InstanceTemplateIamMemberArray) ToInstanceTemplateIamMemberArrayOutput() InstanceTemplateIamMemberArrayOutput {
	return i.ToInstanceTemplateIamMemberArrayOutputWithContext(context.Background())
}

func (i InstanceTemplateIamMemberArray) ToInstanceTemplateIamMemberArrayOutputWithContext(ctx context.Context) InstanceTemplateIamMemberArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstanceTemplateIamMemberArrayOutput)
}

// InstanceTemplateIamMemberMapInput is an input type that accepts InstanceTemplateIamMemberMap and InstanceTemplateIamMemberMapOutput values.
// You can construct a concrete instance of `InstanceTemplateIamMemberMapInput` via:
//
//	InstanceTemplateIamMemberMap{ "key": InstanceTemplateIamMemberArgs{...} }
type InstanceTemplateIamMemberMapInput interface {
	pulumi.Input

	ToInstanceTemplateIamMemberMapOutput() InstanceTemplateIamMemberMapOutput
	ToInstanceTemplateIamMemberMapOutputWithContext(context.Context) InstanceTemplateIamMemberMapOutput
}

type InstanceTemplateIamMemberMap map[string]InstanceTemplateIamMemberInput

func (InstanceTemplateIamMemberMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*InstanceTemplateIamMember)(nil)).Elem()
}

func (i InstanceTemplateIamMemberMap) ToInstanceTemplateIamMemberMapOutput() InstanceTemplateIamMemberMapOutput {
	return i.ToInstanceTemplateIamMemberMapOutputWithContext(context.Background())
}

func (i InstanceTemplateIamMemberMap) ToInstanceTemplateIamMemberMapOutputWithContext(ctx context.Context) InstanceTemplateIamMemberMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstanceTemplateIamMemberMapOutput)
}

type InstanceTemplateIamMemberOutput struct{ *pulumi.OutputState }

func (InstanceTemplateIamMemberOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**InstanceTemplateIamMember)(nil)).Elem()
}

func (o InstanceTemplateIamMemberOutput) ToInstanceTemplateIamMemberOutput() InstanceTemplateIamMemberOutput {
	return o
}

func (o InstanceTemplateIamMemberOutput) ToInstanceTemplateIamMemberOutputWithContext(ctx context.Context) InstanceTemplateIamMemberOutput {
	return o
}

// An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
// Structure is documented below.
func (o InstanceTemplateIamMemberOutput) Condition() InstanceTemplateIamMemberConditionPtrOutput {
	return o.ApplyT(func(v *InstanceTemplateIamMember) InstanceTemplateIamMemberConditionPtrOutput { return v.Condition }).(InstanceTemplateIamMemberConditionPtrOutput)
}

// (Computed) The etag of the IAM policy.
func (o InstanceTemplateIamMemberOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v *InstanceTemplateIamMember) pulumi.StringOutput { return v.Etag }).(pulumi.StringOutput)
}

// Identities that will be granted the privilege in `role`.
// Each entry can have one of the following values:
// * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
// * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
// * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
// * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
// * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
// * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
// * **projectOwner:projectid**: Owners of the given project. For example, "projectOwner:my-example-project"
// * **projectEditor:projectid**: Editors of the given project. For example, "projectEditor:my-example-project"
// * **projectViewer:projectid**: Viewers of the given project. For example, "projectViewer:my-example-project"
func (o InstanceTemplateIamMemberOutput) Member() pulumi.StringOutput {
	return o.ApplyT(func(v *InstanceTemplateIamMember) pulumi.StringOutput { return v.Member }).(pulumi.StringOutput)
}

// Used to find the parent resource to bind the IAM policy to
func (o InstanceTemplateIamMemberOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *InstanceTemplateIamMember) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The ID of the project in which the resource belongs.
// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
func (o InstanceTemplateIamMemberOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *InstanceTemplateIamMember) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// The role that should be applied. Only one
// `compute.InstanceTemplateIamBinding` can be used per role. Note that custom roles must be of the format
// `[projects|organizations]/{parent-name}/roles/{role-name}`.
func (o InstanceTemplateIamMemberOutput) Role() pulumi.StringOutput {
	return o.ApplyT(func(v *InstanceTemplateIamMember) pulumi.StringOutput { return v.Role }).(pulumi.StringOutput)
}

type InstanceTemplateIamMemberArrayOutput struct{ *pulumi.OutputState }

func (InstanceTemplateIamMemberArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*InstanceTemplateIamMember)(nil)).Elem()
}

func (o InstanceTemplateIamMemberArrayOutput) ToInstanceTemplateIamMemberArrayOutput() InstanceTemplateIamMemberArrayOutput {
	return o
}

func (o InstanceTemplateIamMemberArrayOutput) ToInstanceTemplateIamMemberArrayOutputWithContext(ctx context.Context) InstanceTemplateIamMemberArrayOutput {
	return o
}

func (o InstanceTemplateIamMemberArrayOutput) Index(i pulumi.IntInput) InstanceTemplateIamMemberOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *InstanceTemplateIamMember {
		return vs[0].([]*InstanceTemplateIamMember)[vs[1].(int)]
	}).(InstanceTemplateIamMemberOutput)
}

type InstanceTemplateIamMemberMapOutput struct{ *pulumi.OutputState }

func (InstanceTemplateIamMemberMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*InstanceTemplateIamMember)(nil)).Elem()
}

func (o InstanceTemplateIamMemberMapOutput) ToInstanceTemplateIamMemberMapOutput() InstanceTemplateIamMemberMapOutput {
	return o
}

func (o InstanceTemplateIamMemberMapOutput) ToInstanceTemplateIamMemberMapOutputWithContext(ctx context.Context) InstanceTemplateIamMemberMapOutput {
	return o
}

func (o InstanceTemplateIamMemberMapOutput) MapIndex(k pulumi.StringInput) InstanceTemplateIamMemberOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *InstanceTemplateIamMember {
		return vs[0].(map[string]*InstanceTemplateIamMember)[vs[1].(string)]
	}).(InstanceTemplateIamMemberOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*InstanceTemplateIamMemberInput)(nil)).Elem(), &InstanceTemplateIamMember{})
	pulumi.RegisterInputType(reflect.TypeOf((*InstanceTemplateIamMemberArrayInput)(nil)).Elem(), InstanceTemplateIamMemberArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*InstanceTemplateIamMemberMapInput)(nil)).Elem(), InstanceTemplateIamMemberMap{})
	pulumi.RegisterOutputType(InstanceTemplateIamMemberOutput{})
	pulumi.RegisterOutputType(InstanceTemplateIamMemberArrayOutput{})
	pulumi.RegisterOutputType(InstanceTemplateIamMemberMapOutput{})
}
