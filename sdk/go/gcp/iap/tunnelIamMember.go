// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package iap

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Three different resources help you manage your IAM policy for Identity-Aware Proxy Tunnel. Each of these resources serves a different use case:
//
// * `iap.TunnelIamPolicy`: Authoritative. Sets the IAM policy for the tunnel and replaces any existing policy already attached.
// * `iap.TunnelIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the tunnel are preserved.
// * `iap.TunnelIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the tunnel are preserved.
//
// # A data source can be used to retrieve policy data in advent you do not need creation
//
// * `iap.TunnelIamPolicy`: Retrieves the IAM policy for the tunnel
//
// > **Note:** `iap.TunnelIamPolicy` **cannot** be used in conjunction with `iap.TunnelIamBinding` and `iap.TunnelIamMember` or they will fight over what your policy should be.
//
// > **Note:** `iap.TunnelIamBinding` resources **can be** used in conjunction with `iap.TunnelIamMember` resources **only if** they do not grant privilege to the same role.
//
// > **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
//
// ## iap.TunnelIamPolicy
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/iap"
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
//						Role: "roles/iap.tunnelResourceAccessor",
//						Members: []string{
//							"user:jane@example.com",
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = iap.NewTunnelIamPolicy(ctx, "policy", &iap.TunnelIamPolicyArgs{
//				Project:    pulumi.Any(projectService.Project),
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
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/iap"
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
//						Role: "roles/iap.tunnelResourceAccessor",
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
//			_, err = iap.NewTunnelIamPolicy(ctx, "policy", &iap.TunnelIamPolicyArgs{
//				Project:    pulumi.Any(projectService.Project),
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
// ## iap.TunnelIamBinding
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/iap"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := iap.NewTunnelIamBinding(ctx, "binding", &iap.TunnelIamBindingArgs{
//				Project: pulumi.Any(projectService.Project),
//				Role:    pulumi.String("roles/iap.tunnelResourceAccessor"),
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
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/iap"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := iap.NewTunnelIamBinding(ctx, "binding", &iap.TunnelIamBindingArgs{
//				Project: pulumi.Any(projectService.Project),
//				Role:    pulumi.String("roles/iap.tunnelResourceAccessor"),
//				Members: pulumi.StringArray{
//					pulumi.String("user:jane@example.com"),
//				},
//				Condition: &iap.TunnelIamBindingConditionArgs{
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
// ## iap.TunnelIamMember
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/iap"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := iap.NewTunnelIamMember(ctx, "member", &iap.TunnelIamMemberArgs{
//				Project: pulumi.Any(projectService.Project),
//				Role:    pulumi.String("roles/iap.tunnelResourceAccessor"),
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
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/iap"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := iap.NewTunnelIamMember(ctx, "member", &iap.TunnelIamMemberArgs{
//				Project: pulumi.Any(projectService.Project),
//				Role:    pulumi.String("roles/iap.tunnelResourceAccessor"),
//				Member:  pulumi.String("user:jane@example.com"),
//				Condition: &iap.TunnelIamMemberConditionArgs{
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
// # IAM policy for Identity-Aware Proxy Tunnel
// Three different resources help you manage your IAM policy for Identity-Aware Proxy Tunnel. Each of these resources serves a different use case:
//
// * `iap.TunnelIamPolicy`: Authoritative. Sets the IAM policy for the tunnel and replaces any existing policy already attached.
// * `iap.TunnelIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the tunnel are preserved.
// * `iap.TunnelIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the tunnel are preserved.
//
// # A data source can be used to retrieve policy data in advent you do not need creation
//
// * `iap.TunnelIamPolicy`: Retrieves the IAM policy for the tunnel
//
// > **Note:** `iap.TunnelIamPolicy` **cannot** be used in conjunction with `iap.TunnelIamBinding` and `iap.TunnelIamMember` or they will fight over what your policy should be.
//
// > **Note:** `iap.TunnelIamBinding` resources **can be** used in conjunction with `iap.TunnelIamMember` resources **only if** they do not grant privilege to the same role.
//
// > **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
//
// ## iap.TunnelIamPolicy
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/iap"
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
//						Role: "roles/iap.tunnelResourceAccessor",
//						Members: []string{
//							"user:jane@example.com",
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = iap.NewTunnelIamPolicy(ctx, "policy", &iap.TunnelIamPolicyArgs{
//				Project:    pulumi.Any(projectService.Project),
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
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/iap"
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
//						Role: "roles/iap.tunnelResourceAccessor",
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
//			_, err = iap.NewTunnelIamPolicy(ctx, "policy", &iap.TunnelIamPolicyArgs{
//				Project:    pulumi.Any(projectService.Project),
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
// ## iap.TunnelIamBinding
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/iap"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := iap.NewTunnelIamBinding(ctx, "binding", &iap.TunnelIamBindingArgs{
//				Project: pulumi.Any(projectService.Project),
//				Role:    pulumi.String("roles/iap.tunnelResourceAccessor"),
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
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/iap"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := iap.NewTunnelIamBinding(ctx, "binding", &iap.TunnelIamBindingArgs{
//				Project: pulumi.Any(projectService.Project),
//				Role:    pulumi.String("roles/iap.tunnelResourceAccessor"),
//				Members: pulumi.StringArray{
//					pulumi.String("user:jane@example.com"),
//				},
//				Condition: &iap.TunnelIamBindingConditionArgs{
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
// ## iap.TunnelIamMember
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/iap"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := iap.NewTunnelIamMember(ctx, "member", &iap.TunnelIamMemberArgs{
//				Project: pulumi.Any(projectService.Project),
//				Role:    pulumi.String("roles/iap.tunnelResourceAccessor"),
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
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/iap"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := iap.NewTunnelIamMember(ctx, "member", &iap.TunnelIamMemberArgs{
//				Project: pulumi.Any(projectService.Project),
//				Role:    pulumi.String("roles/iap.tunnelResourceAccessor"),
//				Member:  pulumi.String("user:jane@example.com"),
//				Condition: &iap.TunnelIamMemberConditionArgs{
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
// * projects/{{project}}/iap_tunnel
//
// * {{project}}
//
// Any variables not passed in the import command will be taken from the provider configuration.
//
// Identity-Aware Proxy tunnel IAM resources can be imported using the resource identifiers, role, and member.
//
// IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
//
// ```sh
// $ pulumi import gcp:iap/tunnelIamMember:TunnelIamMember editor "projects/{{project}}/iap_tunnel roles/iap.tunnelResourceAccessor user:jane@example.com"
// ```
//
// IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
//
// ```sh
// $ pulumi import gcp:iap/tunnelIamMember:TunnelIamMember editor "projects/{{project}}/iap_tunnel roles/iap.tunnelResourceAccessor"
// ```
//
// IAM policy imports use the identifier of the resource in question, e.g.
//
// ```sh
// $ pulumi import gcp:iap/tunnelIamMember:TunnelIamMember editor projects/{{project}}/iap_tunnel
// ```
//
// -> **Custom Roles** If you're importing a IAM resource with a custom role, make sure to use the
//
//	full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
type TunnelIamMember struct {
	pulumi.CustomResourceState

	// An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
	// Structure is documented below.
	Condition TunnelIamMemberConditionPtrOutput `pulumi:"condition"`
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
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringOutput `pulumi:"project"`
	// The role that should be applied. Only one
	// `iap.TunnelIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringOutput `pulumi:"role"`
}

// NewTunnelIamMember registers a new resource with the given unique name, arguments, and options.
func NewTunnelIamMember(ctx *pulumi.Context,
	name string, args *TunnelIamMemberArgs, opts ...pulumi.ResourceOption) (*TunnelIamMember, error) {
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
	var resource TunnelIamMember
	err := ctx.RegisterResource("gcp:iap/tunnelIamMember:TunnelIamMember", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTunnelIamMember gets an existing TunnelIamMember resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTunnelIamMember(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TunnelIamMemberState, opts ...pulumi.ResourceOption) (*TunnelIamMember, error) {
	var resource TunnelIamMember
	err := ctx.ReadResource("gcp:iap/tunnelIamMember:TunnelIamMember", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering TunnelIamMember resources.
type tunnelIamMemberState struct {
	// An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
	// Structure is documented below.
	Condition *TunnelIamMemberCondition `pulumi:"condition"`
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
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project *string `pulumi:"project"`
	// The role that should be applied. Only one
	// `iap.TunnelIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role *string `pulumi:"role"`
}

type TunnelIamMemberState struct {
	// An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
	// Structure is documented below.
	Condition TunnelIamMemberConditionPtrInput
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
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringPtrInput
	// The role that should be applied. Only one
	// `iap.TunnelIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringPtrInput
}

func (TunnelIamMemberState) ElementType() reflect.Type {
	return reflect.TypeOf((*tunnelIamMemberState)(nil)).Elem()
}

type tunnelIamMemberArgs struct {
	// An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
	// Structure is documented below.
	Condition *TunnelIamMemberCondition `pulumi:"condition"`
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
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project *string `pulumi:"project"`
	// The role that should be applied. Only one
	// `iap.TunnelIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role string `pulumi:"role"`
}

// The set of arguments for constructing a TunnelIamMember resource.
type TunnelIamMemberArgs struct {
	// An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
	// Structure is documented below.
	Condition TunnelIamMemberConditionPtrInput
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
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringPtrInput
	// The role that should be applied. Only one
	// `iap.TunnelIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringInput
}

func (TunnelIamMemberArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*tunnelIamMemberArgs)(nil)).Elem()
}

type TunnelIamMemberInput interface {
	pulumi.Input

	ToTunnelIamMemberOutput() TunnelIamMemberOutput
	ToTunnelIamMemberOutputWithContext(ctx context.Context) TunnelIamMemberOutput
}

func (*TunnelIamMember) ElementType() reflect.Type {
	return reflect.TypeOf((**TunnelIamMember)(nil)).Elem()
}

func (i *TunnelIamMember) ToTunnelIamMemberOutput() TunnelIamMemberOutput {
	return i.ToTunnelIamMemberOutputWithContext(context.Background())
}

func (i *TunnelIamMember) ToTunnelIamMemberOutputWithContext(ctx context.Context) TunnelIamMemberOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TunnelIamMemberOutput)
}

// TunnelIamMemberArrayInput is an input type that accepts TunnelIamMemberArray and TunnelIamMemberArrayOutput values.
// You can construct a concrete instance of `TunnelIamMemberArrayInput` via:
//
//	TunnelIamMemberArray{ TunnelIamMemberArgs{...} }
type TunnelIamMemberArrayInput interface {
	pulumi.Input

	ToTunnelIamMemberArrayOutput() TunnelIamMemberArrayOutput
	ToTunnelIamMemberArrayOutputWithContext(context.Context) TunnelIamMemberArrayOutput
}

type TunnelIamMemberArray []TunnelIamMemberInput

func (TunnelIamMemberArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TunnelIamMember)(nil)).Elem()
}

func (i TunnelIamMemberArray) ToTunnelIamMemberArrayOutput() TunnelIamMemberArrayOutput {
	return i.ToTunnelIamMemberArrayOutputWithContext(context.Background())
}

func (i TunnelIamMemberArray) ToTunnelIamMemberArrayOutputWithContext(ctx context.Context) TunnelIamMemberArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TunnelIamMemberArrayOutput)
}

// TunnelIamMemberMapInput is an input type that accepts TunnelIamMemberMap and TunnelIamMemberMapOutput values.
// You can construct a concrete instance of `TunnelIamMemberMapInput` via:
//
//	TunnelIamMemberMap{ "key": TunnelIamMemberArgs{...} }
type TunnelIamMemberMapInput interface {
	pulumi.Input

	ToTunnelIamMemberMapOutput() TunnelIamMemberMapOutput
	ToTunnelIamMemberMapOutputWithContext(context.Context) TunnelIamMemberMapOutput
}

type TunnelIamMemberMap map[string]TunnelIamMemberInput

func (TunnelIamMemberMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TunnelIamMember)(nil)).Elem()
}

func (i TunnelIamMemberMap) ToTunnelIamMemberMapOutput() TunnelIamMemberMapOutput {
	return i.ToTunnelIamMemberMapOutputWithContext(context.Background())
}

func (i TunnelIamMemberMap) ToTunnelIamMemberMapOutputWithContext(ctx context.Context) TunnelIamMemberMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TunnelIamMemberMapOutput)
}

type TunnelIamMemberOutput struct{ *pulumi.OutputState }

func (TunnelIamMemberOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**TunnelIamMember)(nil)).Elem()
}

func (o TunnelIamMemberOutput) ToTunnelIamMemberOutput() TunnelIamMemberOutput {
	return o
}

func (o TunnelIamMemberOutput) ToTunnelIamMemberOutputWithContext(ctx context.Context) TunnelIamMemberOutput {
	return o
}

// An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
// Structure is documented below.
func (o TunnelIamMemberOutput) Condition() TunnelIamMemberConditionPtrOutput {
	return o.ApplyT(func(v *TunnelIamMember) TunnelIamMemberConditionPtrOutput { return v.Condition }).(TunnelIamMemberConditionPtrOutput)
}

// (Computed) The etag of the IAM policy.
func (o TunnelIamMemberOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v *TunnelIamMember) pulumi.StringOutput { return v.Etag }).(pulumi.StringOutput)
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
func (o TunnelIamMemberOutput) Member() pulumi.StringOutput {
	return o.ApplyT(func(v *TunnelIamMember) pulumi.StringOutput { return v.Member }).(pulumi.StringOutput)
}

// The ID of the project in which the resource belongs.
// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
func (o TunnelIamMemberOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *TunnelIamMember) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// The role that should be applied. Only one
// `iap.TunnelIamBinding` can be used per role. Note that custom roles must be of the format
// `[projects|organizations]/{parent-name}/roles/{role-name}`.
func (o TunnelIamMemberOutput) Role() pulumi.StringOutput {
	return o.ApplyT(func(v *TunnelIamMember) pulumi.StringOutput { return v.Role }).(pulumi.StringOutput)
}

type TunnelIamMemberArrayOutput struct{ *pulumi.OutputState }

func (TunnelIamMemberArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TunnelIamMember)(nil)).Elem()
}

func (o TunnelIamMemberArrayOutput) ToTunnelIamMemberArrayOutput() TunnelIamMemberArrayOutput {
	return o
}

func (o TunnelIamMemberArrayOutput) ToTunnelIamMemberArrayOutputWithContext(ctx context.Context) TunnelIamMemberArrayOutput {
	return o
}

func (o TunnelIamMemberArrayOutput) Index(i pulumi.IntInput) TunnelIamMemberOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *TunnelIamMember {
		return vs[0].([]*TunnelIamMember)[vs[1].(int)]
	}).(TunnelIamMemberOutput)
}

type TunnelIamMemberMapOutput struct{ *pulumi.OutputState }

func (TunnelIamMemberMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TunnelIamMember)(nil)).Elem()
}

func (o TunnelIamMemberMapOutput) ToTunnelIamMemberMapOutput() TunnelIamMemberMapOutput {
	return o
}

func (o TunnelIamMemberMapOutput) ToTunnelIamMemberMapOutputWithContext(ctx context.Context) TunnelIamMemberMapOutput {
	return o
}

func (o TunnelIamMemberMapOutput) MapIndex(k pulumi.StringInput) TunnelIamMemberOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *TunnelIamMember {
		return vs[0].(map[string]*TunnelIamMember)[vs[1].(string)]
	}).(TunnelIamMemberOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TunnelIamMemberInput)(nil)).Elem(), &TunnelIamMember{})
	pulumi.RegisterInputType(reflect.TypeOf((*TunnelIamMemberArrayInput)(nil)).Elem(), TunnelIamMemberArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TunnelIamMemberMapInput)(nil)).Elem(), TunnelIamMemberMap{})
	pulumi.RegisterOutputType(TunnelIamMemberOutput{})
	pulumi.RegisterOutputType(TunnelIamMemberArrayOutput{})
	pulumi.RegisterOutputType(TunnelIamMemberMapOutput{})
}
