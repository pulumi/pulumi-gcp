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

// Three different resources help you manage your IAM policy for Compute Engine Image. Each of these resources serves a different use case:
//
// * `compute.ImageIamPolicy`: Authoritative. Sets the IAM policy for the image and replaces any existing policy already attached.
// * `compute.ImageIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the image are preserved.
// * `compute.ImageIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the image are preserved.
//
// # A data source can be used to retrieve policy data in advent you do not need creation
//
// * `compute.ImageIamPolicy`: Retrieves the IAM policy for the image
//
// > **Note:** `compute.ImageIamPolicy` **cannot** be used in conjunction with `compute.ImageIamBinding` and `compute.ImageIamMember` or they will fight over what your policy should be.
//
// > **Note:** `compute.ImageIamBinding` resources **can be** used in conjunction with `compute.ImageIamMember` resources **only if** they do not grant privilege to the same role.
//
// > **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
//
// ## compute.ImageIamPolicy
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
//						Role: "roles/compute.imageUser",
//						Members: []string{
//							"user:jane@example.com",
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = compute.NewImageIamPolicy(ctx, "policy", &compute.ImageIamPolicyArgs{
//				Project:    pulumi.Any(example.Project),
//				Image:      pulumi.Any(example.Name),
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
//						Role: "roles/compute.imageUser",
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
//			_, err = compute.NewImageIamPolicy(ctx, "policy", &compute.ImageIamPolicyArgs{
//				Project:    pulumi.Any(example.Project),
//				Image:      pulumi.Any(example.Name),
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
// ## compute.ImageIamBinding
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
//			_, err := compute.NewImageIamBinding(ctx, "binding", &compute.ImageIamBindingArgs{
//				Project: pulumi.Any(example.Project),
//				Image:   pulumi.Any(example.Name),
//				Role:    pulumi.String("roles/compute.imageUser"),
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
//			_, err := compute.NewImageIamBinding(ctx, "binding", &compute.ImageIamBindingArgs{
//				Project: pulumi.Any(example.Project),
//				Image:   pulumi.Any(example.Name),
//				Role:    pulumi.String("roles/compute.imageUser"),
//				Members: pulumi.StringArray{
//					pulumi.String("user:jane@example.com"),
//				},
//				Condition: &compute.ImageIamBindingConditionArgs{
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
// ## compute.ImageIamMember
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
//			_, err := compute.NewImageIamMember(ctx, "member", &compute.ImageIamMemberArgs{
//				Project: pulumi.Any(example.Project),
//				Image:   pulumi.Any(example.Name),
//				Role:    pulumi.String("roles/compute.imageUser"),
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
//			_, err := compute.NewImageIamMember(ctx, "member", &compute.ImageIamMemberArgs{
//				Project: pulumi.Any(example.Project),
//				Image:   pulumi.Any(example.Name),
//				Role:    pulumi.String("roles/compute.imageUser"),
//				Member:  pulumi.String("user:jane@example.com"),
//				Condition: &compute.ImageIamMemberConditionArgs{
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
// # IAM policy for Compute Engine Image
// Three different resources help you manage your IAM policy for Compute Engine Image. Each of these resources serves a different use case:
//
// * `compute.ImageIamPolicy`: Authoritative. Sets the IAM policy for the image and replaces any existing policy already attached.
// * `compute.ImageIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the image are preserved.
// * `compute.ImageIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the image are preserved.
//
// # A data source can be used to retrieve policy data in advent you do not need creation
//
// * `compute.ImageIamPolicy`: Retrieves the IAM policy for the image
//
// > **Note:** `compute.ImageIamPolicy` **cannot** be used in conjunction with `compute.ImageIamBinding` and `compute.ImageIamMember` or they will fight over what your policy should be.
//
// > **Note:** `compute.ImageIamBinding` resources **can be** used in conjunction with `compute.ImageIamMember` resources **only if** they do not grant privilege to the same role.
//
// > **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
//
// ## compute.ImageIamPolicy
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
//						Role: "roles/compute.imageUser",
//						Members: []string{
//							"user:jane@example.com",
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = compute.NewImageIamPolicy(ctx, "policy", &compute.ImageIamPolicyArgs{
//				Project:    pulumi.Any(example.Project),
//				Image:      pulumi.Any(example.Name),
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
//						Role: "roles/compute.imageUser",
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
//			_, err = compute.NewImageIamPolicy(ctx, "policy", &compute.ImageIamPolicyArgs{
//				Project:    pulumi.Any(example.Project),
//				Image:      pulumi.Any(example.Name),
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
// ## compute.ImageIamBinding
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
//			_, err := compute.NewImageIamBinding(ctx, "binding", &compute.ImageIamBindingArgs{
//				Project: pulumi.Any(example.Project),
//				Image:   pulumi.Any(example.Name),
//				Role:    pulumi.String("roles/compute.imageUser"),
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
//			_, err := compute.NewImageIamBinding(ctx, "binding", &compute.ImageIamBindingArgs{
//				Project: pulumi.Any(example.Project),
//				Image:   pulumi.Any(example.Name),
//				Role:    pulumi.String("roles/compute.imageUser"),
//				Members: pulumi.StringArray{
//					pulumi.String("user:jane@example.com"),
//				},
//				Condition: &compute.ImageIamBindingConditionArgs{
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
// ## compute.ImageIamMember
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
//			_, err := compute.NewImageIamMember(ctx, "member", &compute.ImageIamMemberArgs{
//				Project: pulumi.Any(example.Project),
//				Image:   pulumi.Any(example.Name),
//				Role:    pulumi.String("roles/compute.imageUser"),
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
//			_, err := compute.NewImageIamMember(ctx, "member", &compute.ImageIamMemberArgs{
//				Project: pulumi.Any(example.Project),
//				Image:   pulumi.Any(example.Name),
//				Role:    pulumi.String("roles/compute.imageUser"),
//				Member:  pulumi.String("user:jane@example.com"),
//				Condition: &compute.ImageIamMemberConditionArgs{
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
// * projects/{{project}}/global/images/{{name}}
//
// * {{project}}/{{name}}
//
// * {{name}}
//
// Any variables not passed in the import command will be taken from the provider configuration.
//
// Compute Engine image IAM resources can be imported using the resource identifiers, role, and member.
//
// IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
//
// ```sh
// $ pulumi import gcp:compute/imageIamBinding:ImageIamBinding editor "projects/{{project}}/global/images/{{image}} roles/compute.imageUser user:jane@example.com"
// ```
//
// IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
//
// ```sh
// $ pulumi import gcp:compute/imageIamBinding:ImageIamBinding editor "projects/{{project}}/global/images/{{image}} roles/compute.imageUser"
// ```
//
// IAM policy imports use the identifier of the resource in question, e.g.
//
// ```sh
// $ pulumi import gcp:compute/imageIamBinding:ImageIamBinding editor projects/{{project}}/global/images/{{image}}
// ```
//
// -> **Custom Roles** If you're importing a IAM resource with a custom role, make sure to use the
//
//	full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
type ImageIamBinding struct {
	pulumi.CustomResourceState

	// An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
	// Structure is documented below.
	Condition ImageIamBindingConditionPtrOutput `pulumi:"condition"`
	// (Computed) The etag of the IAM policy.
	Etag pulumi.StringOutput `pulumi:"etag"`
	// Used to find the parent resource to bind the IAM policy to
	Image pulumi.StringOutput `pulumi:"image"`
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
	Members pulumi.StringArrayOutput `pulumi:"members"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringOutput `pulumi:"project"`
	// The role that should be applied. Only one
	// `compute.ImageIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringOutput `pulumi:"role"`
}

// NewImageIamBinding registers a new resource with the given unique name, arguments, and options.
func NewImageIamBinding(ctx *pulumi.Context,
	name string, args *ImageIamBindingArgs, opts ...pulumi.ResourceOption) (*ImageIamBinding, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Image == nil {
		return nil, errors.New("invalid value for required argument 'Image'")
	}
	if args.Members == nil {
		return nil, errors.New("invalid value for required argument 'Members'")
	}
	if args.Role == nil {
		return nil, errors.New("invalid value for required argument 'Role'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ImageIamBinding
	err := ctx.RegisterResource("gcp:compute/imageIamBinding:ImageIamBinding", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetImageIamBinding gets an existing ImageIamBinding resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetImageIamBinding(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ImageIamBindingState, opts ...pulumi.ResourceOption) (*ImageIamBinding, error) {
	var resource ImageIamBinding
	err := ctx.ReadResource("gcp:compute/imageIamBinding:ImageIamBinding", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ImageIamBinding resources.
type imageIamBindingState struct {
	// An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
	// Structure is documented below.
	Condition *ImageIamBindingCondition `pulumi:"condition"`
	// (Computed) The etag of the IAM policy.
	Etag *string `pulumi:"etag"`
	// Used to find the parent resource to bind the IAM policy to
	Image *string `pulumi:"image"`
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
	Members []string `pulumi:"members"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project *string `pulumi:"project"`
	// The role that should be applied. Only one
	// `compute.ImageIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role *string `pulumi:"role"`
}

type ImageIamBindingState struct {
	// An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
	// Structure is documented below.
	Condition ImageIamBindingConditionPtrInput
	// (Computed) The etag of the IAM policy.
	Etag pulumi.StringPtrInput
	// Used to find the parent resource to bind the IAM policy to
	Image pulumi.StringPtrInput
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
	Members pulumi.StringArrayInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringPtrInput
	// The role that should be applied. Only one
	// `compute.ImageIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringPtrInput
}

func (ImageIamBindingState) ElementType() reflect.Type {
	return reflect.TypeOf((*imageIamBindingState)(nil)).Elem()
}

type imageIamBindingArgs struct {
	// An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
	// Structure is documented below.
	Condition *ImageIamBindingCondition `pulumi:"condition"`
	// Used to find the parent resource to bind the IAM policy to
	Image string `pulumi:"image"`
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
	Members []string `pulumi:"members"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project *string `pulumi:"project"`
	// The role that should be applied. Only one
	// `compute.ImageIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role string `pulumi:"role"`
}

// The set of arguments for constructing a ImageIamBinding resource.
type ImageIamBindingArgs struct {
	// An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
	// Structure is documented below.
	Condition ImageIamBindingConditionPtrInput
	// Used to find the parent resource to bind the IAM policy to
	Image pulumi.StringInput
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
	Members pulumi.StringArrayInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringPtrInput
	// The role that should be applied. Only one
	// `compute.ImageIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringInput
}

func (ImageIamBindingArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*imageIamBindingArgs)(nil)).Elem()
}

type ImageIamBindingInput interface {
	pulumi.Input

	ToImageIamBindingOutput() ImageIamBindingOutput
	ToImageIamBindingOutputWithContext(ctx context.Context) ImageIamBindingOutput
}

func (*ImageIamBinding) ElementType() reflect.Type {
	return reflect.TypeOf((**ImageIamBinding)(nil)).Elem()
}

func (i *ImageIamBinding) ToImageIamBindingOutput() ImageIamBindingOutput {
	return i.ToImageIamBindingOutputWithContext(context.Background())
}

func (i *ImageIamBinding) ToImageIamBindingOutputWithContext(ctx context.Context) ImageIamBindingOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ImageIamBindingOutput)
}

// ImageIamBindingArrayInput is an input type that accepts ImageIamBindingArray and ImageIamBindingArrayOutput values.
// You can construct a concrete instance of `ImageIamBindingArrayInput` via:
//
//	ImageIamBindingArray{ ImageIamBindingArgs{...} }
type ImageIamBindingArrayInput interface {
	pulumi.Input

	ToImageIamBindingArrayOutput() ImageIamBindingArrayOutput
	ToImageIamBindingArrayOutputWithContext(context.Context) ImageIamBindingArrayOutput
}

type ImageIamBindingArray []ImageIamBindingInput

func (ImageIamBindingArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ImageIamBinding)(nil)).Elem()
}

func (i ImageIamBindingArray) ToImageIamBindingArrayOutput() ImageIamBindingArrayOutput {
	return i.ToImageIamBindingArrayOutputWithContext(context.Background())
}

func (i ImageIamBindingArray) ToImageIamBindingArrayOutputWithContext(ctx context.Context) ImageIamBindingArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ImageIamBindingArrayOutput)
}

// ImageIamBindingMapInput is an input type that accepts ImageIamBindingMap and ImageIamBindingMapOutput values.
// You can construct a concrete instance of `ImageIamBindingMapInput` via:
//
//	ImageIamBindingMap{ "key": ImageIamBindingArgs{...} }
type ImageIamBindingMapInput interface {
	pulumi.Input

	ToImageIamBindingMapOutput() ImageIamBindingMapOutput
	ToImageIamBindingMapOutputWithContext(context.Context) ImageIamBindingMapOutput
}

type ImageIamBindingMap map[string]ImageIamBindingInput

func (ImageIamBindingMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ImageIamBinding)(nil)).Elem()
}

func (i ImageIamBindingMap) ToImageIamBindingMapOutput() ImageIamBindingMapOutput {
	return i.ToImageIamBindingMapOutputWithContext(context.Background())
}

func (i ImageIamBindingMap) ToImageIamBindingMapOutputWithContext(ctx context.Context) ImageIamBindingMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ImageIamBindingMapOutput)
}

type ImageIamBindingOutput struct{ *pulumi.OutputState }

func (ImageIamBindingOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ImageIamBinding)(nil)).Elem()
}

func (o ImageIamBindingOutput) ToImageIamBindingOutput() ImageIamBindingOutput {
	return o
}

func (o ImageIamBindingOutput) ToImageIamBindingOutputWithContext(ctx context.Context) ImageIamBindingOutput {
	return o
}

// An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
// Structure is documented below.
func (o ImageIamBindingOutput) Condition() ImageIamBindingConditionPtrOutput {
	return o.ApplyT(func(v *ImageIamBinding) ImageIamBindingConditionPtrOutput { return v.Condition }).(ImageIamBindingConditionPtrOutput)
}

// (Computed) The etag of the IAM policy.
func (o ImageIamBindingOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v *ImageIamBinding) pulumi.StringOutput { return v.Etag }).(pulumi.StringOutput)
}

// Used to find the parent resource to bind the IAM policy to
func (o ImageIamBindingOutput) Image() pulumi.StringOutput {
	return o.ApplyT(func(v *ImageIamBinding) pulumi.StringOutput { return v.Image }).(pulumi.StringOutput)
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
func (o ImageIamBindingOutput) Members() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ImageIamBinding) pulumi.StringArrayOutput { return v.Members }).(pulumi.StringArrayOutput)
}

// The ID of the project in which the resource belongs.
// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
func (o ImageIamBindingOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *ImageIamBinding) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// The role that should be applied. Only one
// `compute.ImageIamBinding` can be used per role. Note that custom roles must be of the format
// `[projects|organizations]/{parent-name}/roles/{role-name}`.
func (o ImageIamBindingOutput) Role() pulumi.StringOutput {
	return o.ApplyT(func(v *ImageIamBinding) pulumi.StringOutput { return v.Role }).(pulumi.StringOutput)
}

type ImageIamBindingArrayOutput struct{ *pulumi.OutputState }

func (ImageIamBindingArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ImageIamBinding)(nil)).Elem()
}

func (o ImageIamBindingArrayOutput) ToImageIamBindingArrayOutput() ImageIamBindingArrayOutput {
	return o
}

func (o ImageIamBindingArrayOutput) ToImageIamBindingArrayOutputWithContext(ctx context.Context) ImageIamBindingArrayOutput {
	return o
}

func (o ImageIamBindingArrayOutput) Index(i pulumi.IntInput) ImageIamBindingOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ImageIamBinding {
		return vs[0].([]*ImageIamBinding)[vs[1].(int)]
	}).(ImageIamBindingOutput)
}

type ImageIamBindingMapOutput struct{ *pulumi.OutputState }

func (ImageIamBindingMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ImageIamBinding)(nil)).Elem()
}

func (o ImageIamBindingMapOutput) ToImageIamBindingMapOutput() ImageIamBindingMapOutput {
	return o
}

func (o ImageIamBindingMapOutput) ToImageIamBindingMapOutputWithContext(ctx context.Context) ImageIamBindingMapOutput {
	return o
}

func (o ImageIamBindingMapOutput) MapIndex(k pulumi.StringInput) ImageIamBindingOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ImageIamBinding {
		return vs[0].(map[string]*ImageIamBinding)[vs[1].(string)]
	}).(ImageIamBindingOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ImageIamBindingInput)(nil)).Elem(), &ImageIamBinding{})
	pulumi.RegisterInputType(reflect.TypeOf((*ImageIamBindingArrayInput)(nil)).Elem(), ImageIamBindingArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ImageIamBindingMapInput)(nil)).Elem(), ImageIamBindingMap{})
	pulumi.RegisterOutputType(ImageIamBindingOutput{})
	pulumi.RegisterOutputType(ImageIamBindingArrayOutput{})
	pulumi.RegisterOutputType(ImageIamBindingMapOutput{})
}
