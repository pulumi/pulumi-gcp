// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package sourcerepo

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Three different resources help you manage your IAM policy for Cloud Source Repositories Repository. Each of these resources serves a different use case:
//
// * `sourcerepo.RepositoryIamPolicy`: Authoritative. Sets the IAM policy for the repository and replaces any existing policy already attached.
// * `sourcerepo.RepositoryIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the repository are preserved.
// * `sourcerepo.RepositoryIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the repository are preserved.
//
// # A data source can be used to retrieve policy data in advent you do not need creation
//
// * `sourcerepo.RepositoryIamPolicy`: Retrieves the IAM policy for the repository
//
// > **Note:** `sourcerepo.RepositoryIamPolicy` **cannot** be used in conjunction with `sourcerepo.RepositoryIamBinding` and `sourcerepo.RepositoryIamMember` or they will fight over what your policy should be.
//
// > **Note:** `sourcerepo.RepositoryIamBinding` resources **can be** used in conjunction with `sourcerepo.RepositoryIamMember` resources **only if** they do not grant privilege to the same role.
//
// ## sourcerepo.RepositoryIamPolicy
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/organizations"
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/sourcerepo"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			admin, err := organizations.LookupIAMPolicy(ctx, &organizations.LookupIAMPolicyArgs{
//				Bindings: []organizations.GetIAMPolicyBinding{
//					{
//						Role: "roles/viewer",
//						Members: []string{
//							"user:jane@example.com",
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = sourcerepo.NewRepositoryIamPolicy(ctx, "policy", &sourcerepo.RepositoryIamPolicyArgs{
//				Project:    pulumi.Any(my_repo.Project),
//				Repository: pulumi.Any(my_repo.Name),
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
// ## sourcerepo.RepositoryIamBinding
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/sourcerepo"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := sourcerepo.NewRepositoryIamBinding(ctx, "binding", &sourcerepo.RepositoryIamBindingArgs{
//				Project:    pulumi.Any(my_repo.Project),
//				Repository: pulumi.Any(my_repo.Name),
//				Role:       pulumi.String("roles/viewer"),
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
// ## sourcerepo.RepositoryIamMember
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/sourcerepo"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := sourcerepo.NewRepositoryIamMember(ctx, "member", &sourcerepo.RepositoryIamMemberArgs{
//				Project:    pulumi.Any(my_repo.Project),
//				Repository: pulumi.Any(my_repo.Name),
//				Role:       pulumi.String("roles/viewer"),
//				Member:     pulumi.String("user:jane@example.com"),
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
// # IAM policy for Cloud Source Repositories Repository
// Three different resources help you manage your IAM policy for Cloud Source Repositories Repository. Each of these resources serves a different use case:
//
// * `sourcerepo.RepositoryIamPolicy`: Authoritative. Sets the IAM policy for the repository and replaces any existing policy already attached.
// * `sourcerepo.RepositoryIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the repository are preserved.
// * `sourcerepo.RepositoryIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the repository are preserved.
//
// # A data source can be used to retrieve policy data in advent you do not need creation
//
// * `sourcerepo.RepositoryIamPolicy`: Retrieves the IAM policy for the repository
//
// > **Note:** `sourcerepo.RepositoryIamPolicy` **cannot** be used in conjunction with `sourcerepo.RepositoryIamBinding` and `sourcerepo.RepositoryIamMember` or they will fight over what your policy should be.
//
// > **Note:** `sourcerepo.RepositoryIamBinding` resources **can be** used in conjunction with `sourcerepo.RepositoryIamMember` resources **only if** they do not grant privilege to the same role.
//
// ## sourcerepo.RepositoryIamPolicy
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/organizations"
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/sourcerepo"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			admin, err := organizations.LookupIAMPolicy(ctx, &organizations.LookupIAMPolicyArgs{
//				Bindings: []organizations.GetIAMPolicyBinding{
//					{
//						Role: "roles/viewer",
//						Members: []string{
//							"user:jane@example.com",
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = sourcerepo.NewRepositoryIamPolicy(ctx, "policy", &sourcerepo.RepositoryIamPolicyArgs{
//				Project:    pulumi.Any(my_repo.Project),
//				Repository: pulumi.Any(my_repo.Name),
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
// ## sourcerepo.RepositoryIamBinding
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/sourcerepo"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := sourcerepo.NewRepositoryIamBinding(ctx, "binding", &sourcerepo.RepositoryIamBindingArgs{
//				Project:    pulumi.Any(my_repo.Project),
//				Repository: pulumi.Any(my_repo.Name),
//				Role:       pulumi.String("roles/viewer"),
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
// ## sourcerepo.RepositoryIamMember
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/sourcerepo"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := sourcerepo.NewRepositoryIamMember(ctx, "member", &sourcerepo.RepositoryIamMemberArgs{
//				Project:    pulumi.Any(my_repo.Project),
//				Repository: pulumi.Any(my_repo.Name),
//				Role:       pulumi.String("roles/viewer"),
//				Member:     pulumi.String("user:jane@example.com"),
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
// * projects/{{project}}/repos/{{name}}
//
// * {{name}}
//
// Any variables not passed in the import command will be taken from the provider configuration.
//
// Cloud Source Repositories repository IAM resources can be imported using the resource identifiers, role, and member.
//
// IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
//
// ```sh
// $ pulumi import gcp:sourcerepo/repositoryIamMember:RepositoryIamMember editor "projects/{{project}}/repos/{{repository}} roles/viewer user:jane@example.com"
// ```
//
// IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
//
// ```sh
// $ pulumi import gcp:sourcerepo/repositoryIamMember:RepositoryIamMember editor "projects/{{project}}/repos/{{repository}} roles/viewer"
// ```
//
// IAM policy imports use the identifier of the resource in question, e.g.
//
// ```sh
// $ pulumi import gcp:sourcerepo/repositoryIamMember:RepositoryIamMember editor projects/{{project}}/repos/{{repository}}
// ```
//
// -> **Custom Roles** If you're importing a IAM resource with a custom role, make sure to use the
//
//	full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
type RepositoryIamMember struct {
	pulumi.CustomResourceState

	Condition RepositoryIamMemberConditionPtrOutput `pulumi:"condition"`
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
	// Used to find the parent resource to bind the IAM policy to
	Repository pulumi.StringOutput `pulumi:"repository"`
	// The role that should be applied. Only one
	// `sourcerepo.RepositoryIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringOutput `pulumi:"role"`
}

// NewRepositoryIamMember registers a new resource with the given unique name, arguments, and options.
func NewRepositoryIamMember(ctx *pulumi.Context,
	name string, args *RepositoryIamMemberArgs, opts ...pulumi.ResourceOption) (*RepositoryIamMember, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Member == nil {
		return nil, errors.New("invalid value for required argument 'Member'")
	}
	if args.Repository == nil {
		return nil, errors.New("invalid value for required argument 'Repository'")
	}
	if args.Role == nil {
		return nil, errors.New("invalid value for required argument 'Role'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource RepositoryIamMember
	err := ctx.RegisterResource("gcp:sourcerepo/repositoryIamMember:RepositoryIamMember", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRepositoryIamMember gets an existing RepositoryIamMember resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRepositoryIamMember(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RepositoryIamMemberState, opts ...pulumi.ResourceOption) (*RepositoryIamMember, error) {
	var resource RepositoryIamMember
	err := ctx.ReadResource("gcp:sourcerepo/repositoryIamMember:RepositoryIamMember", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering RepositoryIamMember resources.
type repositoryIamMemberState struct {
	Condition *RepositoryIamMemberCondition `pulumi:"condition"`
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
	// Used to find the parent resource to bind the IAM policy to
	Repository *string `pulumi:"repository"`
	// The role that should be applied. Only one
	// `sourcerepo.RepositoryIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role *string `pulumi:"role"`
}

type RepositoryIamMemberState struct {
	Condition RepositoryIamMemberConditionPtrInput
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
	// Used to find the parent resource to bind the IAM policy to
	Repository pulumi.StringPtrInput
	// The role that should be applied. Only one
	// `sourcerepo.RepositoryIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringPtrInput
}

func (RepositoryIamMemberState) ElementType() reflect.Type {
	return reflect.TypeOf((*repositoryIamMemberState)(nil)).Elem()
}

type repositoryIamMemberArgs struct {
	Condition *RepositoryIamMemberCondition `pulumi:"condition"`
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
	// Used to find the parent resource to bind the IAM policy to
	Repository string `pulumi:"repository"`
	// The role that should be applied. Only one
	// `sourcerepo.RepositoryIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role string `pulumi:"role"`
}

// The set of arguments for constructing a RepositoryIamMember resource.
type RepositoryIamMemberArgs struct {
	Condition RepositoryIamMemberConditionPtrInput
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
	// Used to find the parent resource to bind the IAM policy to
	Repository pulumi.StringInput
	// The role that should be applied. Only one
	// `sourcerepo.RepositoryIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringInput
}

func (RepositoryIamMemberArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*repositoryIamMemberArgs)(nil)).Elem()
}

type RepositoryIamMemberInput interface {
	pulumi.Input

	ToRepositoryIamMemberOutput() RepositoryIamMemberOutput
	ToRepositoryIamMemberOutputWithContext(ctx context.Context) RepositoryIamMemberOutput
}

func (*RepositoryIamMember) ElementType() reflect.Type {
	return reflect.TypeOf((**RepositoryIamMember)(nil)).Elem()
}

func (i *RepositoryIamMember) ToRepositoryIamMemberOutput() RepositoryIamMemberOutput {
	return i.ToRepositoryIamMemberOutputWithContext(context.Background())
}

func (i *RepositoryIamMember) ToRepositoryIamMemberOutputWithContext(ctx context.Context) RepositoryIamMemberOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RepositoryIamMemberOutput)
}

// RepositoryIamMemberArrayInput is an input type that accepts RepositoryIamMemberArray and RepositoryIamMemberArrayOutput values.
// You can construct a concrete instance of `RepositoryIamMemberArrayInput` via:
//
//	RepositoryIamMemberArray{ RepositoryIamMemberArgs{...} }
type RepositoryIamMemberArrayInput interface {
	pulumi.Input

	ToRepositoryIamMemberArrayOutput() RepositoryIamMemberArrayOutput
	ToRepositoryIamMemberArrayOutputWithContext(context.Context) RepositoryIamMemberArrayOutput
}

type RepositoryIamMemberArray []RepositoryIamMemberInput

func (RepositoryIamMemberArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RepositoryIamMember)(nil)).Elem()
}

func (i RepositoryIamMemberArray) ToRepositoryIamMemberArrayOutput() RepositoryIamMemberArrayOutput {
	return i.ToRepositoryIamMemberArrayOutputWithContext(context.Background())
}

func (i RepositoryIamMemberArray) ToRepositoryIamMemberArrayOutputWithContext(ctx context.Context) RepositoryIamMemberArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RepositoryIamMemberArrayOutput)
}

// RepositoryIamMemberMapInput is an input type that accepts RepositoryIamMemberMap and RepositoryIamMemberMapOutput values.
// You can construct a concrete instance of `RepositoryIamMemberMapInput` via:
//
//	RepositoryIamMemberMap{ "key": RepositoryIamMemberArgs{...} }
type RepositoryIamMemberMapInput interface {
	pulumi.Input

	ToRepositoryIamMemberMapOutput() RepositoryIamMemberMapOutput
	ToRepositoryIamMemberMapOutputWithContext(context.Context) RepositoryIamMemberMapOutput
}

type RepositoryIamMemberMap map[string]RepositoryIamMemberInput

func (RepositoryIamMemberMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RepositoryIamMember)(nil)).Elem()
}

func (i RepositoryIamMemberMap) ToRepositoryIamMemberMapOutput() RepositoryIamMemberMapOutput {
	return i.ToRepositoryIamMemberMapOutputWithContext(context.Background())
}

func (i RepositoryIamMemberMap) ToRepositoryIamMemberMapOutputWithContext(ctx context.Context) RepositoryIamMemberMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RepositoryIamMemberMapOutput)
}

type RepositoryIamMemberOutput struct{ *pulumi.OutputState }

func (RepositoryIamMemberOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**RepositoryIamMember)(nil)).Elem()
}

func (o RepositoryIamMemberOutput) ToRepositoryIamMemberOutput() RepositoryIamMemberOutput {
	return o
}

func (o RepositoryIamMemberOutput) ToRepositoryIamMemberOutputWithContext(ctx context.Context) RepositoryIamMemberOutput {
	return o
}

func (o RepositoryIamMemberOutput) Condition() RepositoryIamMemberConditionPtrOutput {
	return o.ApplyT(func(v *RepositoryIamMember) RepositoryIamMemberConditionPtrOutput { return v.Condition }).(RepositoryIamMemberConditionPtrOutput)
}

// (Computed) The etag of the IAM policy.
func (o RepositoryIamMemberOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v *RepositoryIamMember) pulumi.StringOutput { return v.Etag }).(pulumi.StringOutput)
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
func (o RepositoryIamMemberOutput) Member() pulumi.StringOutput {
	return o.ApplyT(func(v *RepositoryIamMember) pulumi.StringOutput { return v.Member }).(pulumi.StringOutput)
}

// The ID of the project in which the resource belongs.
// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
func (o RepositoryIamMemberOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *RepositoryIamMember) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// Used to find the parent resource to bind the IAM policy to
func (o RepositoryIamMemberOutput) Repository() pulumi.StringOutput {
	return o.ApplyT(func(v *RepositoryIamMember) pulumi.StringOutput { return v.Repository }).(pulumi.StringOutput)
}

// The role that should be applied. Only one
// `sourcerepo.RepositoryIamBinding` can be used per role. Note that custom roles must be of the format
// `[projects|organizations]/{parent-name}/roles/{role-name}`.
func (o RepositoryIamMemberOutput) Role() pulumi.StringOutput {
	return o.ApplyT(func(v *RepositoryIamMember) pulumi.StringOutput { return v.Role }).(pulumi.StringOutput)
}

type RepositoryIamMemberArrayOutput struct{ *pulumi.OutputState }

func (RepositoryIamMemberArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RepositoryIamMember)(nil)).Elem()
}

func (o RepositoryIamMemberArrayOutput) ToRepositoryIamMemberArrayOutput() RepositoryIamMemberArrayOutput {
	return o
}

func (o RepositoryIamMemberArrayOutput) ToRepositoryIamMemberArrayOutputWithContext(ctx context.Context) RepositoryIamMemberArrayOutput {
	return o
}

func (o RepositoryIamMemberArrayOutput) Index(i pulumi.IntInput) RepositoryIamMemberOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *RepositoryIamMember {
		return vs[0].([]*RepositoryIamMember)[vs[1].(int)]
	}).(RepositoryIamMemberOutput)
}

type RepositoryIamMemberMapOutput struct{ *pulumi.OutputState }

func (RepositoryIamMemberMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RepositoryIamMember)(nil)).Elem()
}

func (o RepositoryIamMemberMapOutput) ToRepositoryIamMemberMapOutput() RepositoryIamMemberMapOutput {
	return o
}

func (o RepositoryIamMemberMapOutput) ToRepositoryIamMemberMapOutputWithContext(ctx context.Context) RepositoryIamMemberMapOutput {
	return o
}

func (o RepositoryIamMemberMapOutput) MapIndex(k pulumi.StringInput) RepositoryIamMemberOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *RepositoryIamMember {
		return vs[0].(map[string]*RepositoryIamMember)[vs[1].(string)]
	}).(RepositoryIamMemberOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RepositoryIamMemberInput)(nil)).Elem(), &RepositoryIamMember{})
	pulumi.RegisterInputType(reflect.TypeOf((*RepositoryIamMemberArrayInput)(nil)).Elem(), RepositoryIamMemberArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RepositoryIamMemberMapInput)(nil)).Elem(), RepositoryIamMemberMap{})
	pulumi.RegisterOutputType(RepositoryIamMemberOutput{})
	pulumi.RegisterOutputType(RepositoryIamMemberArrayOutput{})
	pulumi.RegisterOutputType(RepositoryIamMemberMapOutput{})
}
