// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package gemini

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Three different resources help you manage your IAM policy for Gemini for Google Cloud RepositoryGroup. Each of these resources serves a different use case:
//
// * `gemini.RepositoryGroupIamPolicy`: Authoritative. Sets the IAM policy for the repositorygroup and replaces any existing policy already attached.
// * `gemini.RepositoryGroupIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the repositorygroup are preserved.
// * `gemini.RepositoryGroupIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the repositorygroup are preserved.
//
// # A data source can be used to retrieve policy data in advent you do not need creation
//
// * `gemini.RepositoryGroupIamPolicy`: Retrieves the IAM policy for the repositorygroup
//
// > **Note:** `gemini.RepositoryGroupIamPolicy` **cannot** be used in conjunction with `gemini.RepositoryGroupIamBinding` and `gemini.RepositoryGroupIamMember` or they will fight over what your policy should be.
//
// > **Note:** `gemini.RepositoryGroupIamBinding` resources **can be** used in conjunction with `gemini.RepositoryGroupIamMember` resources **only if** they do not grant privilege to the same role.
//
// ## gemini.RepositoryGroupIamPolicy
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/gemini"
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
//						Role: "roles/cloudaicompanion.repositoryGroupsUser",
//						Members: []string{
//							"user:jane@example.com",
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = gemini.NewRepositoryGroupIamPolicy(ctx, "policy", &gemini.RepositoryGroupIamPolicyArgs{
//				Project:             pulumi.Any(example.Project),
//				Location:            pulumi.Any(example.Location),
//				CodeRepositoryIndex: pulumi.Any(example.CodeRepositoryIndex),
//				RepositoryGroupId:   pulumi.Any(example.RepositoryGroupId),
//				PolicyData:          pulumi.String(admin.PolicyData),
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
// ## gemini.RepositoryGroupIamBinding
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/gemini"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := gemini.NewRepositoryGroupIamBinding(ctx, "binding", &gemini.RepositoryGroupIamBindingArgs{
//				Project:             pulumi.Any(example.Project),
//				Location:            pulumi.Any(example.Location),
//				CodeRepositoryIndex: pulumi.Any(example.CodeRepositoryIndex),
//				RepositoryGroupId:   pulumi.Any(example.RepositoryGroupId),
//				Role:                pulumi.String("roles/cloudaicompanion.repositoryGroupsUser"),
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
// ## gemini.RepositoryGroupIamMember
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/gemini"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := gemini.NewRepositoryGroupIamMember(ctx, "member", &gemini.RepositoryGroupIamMemberArgs{
//				Project:             pulumi.Any(example.Project),
//				Location:            pulumi.Any(example.Location),
//				CodeRepositoryIndex: pulumi.Any(example.CodeRepositoryIndex),
//				RepositoryGroupId:   pulumi.Any(example.RepositoryGroupId),
//				Role:                pulumi.String("roles/cloudaicompanion.repositoryGroupsUser"),
//				Member:              pulumi.String("user:jane@example.com"),
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
// # IAM policy for Gemini for Google Cloud RepositoryGroup
// Three different resources help you manage your IAM policy for Gemini for Google Cloud RepositoryGroup. Each of these resources serves a different use case:
//
// * `gemini.RepositoryGroupIamPolicy`: Authoritative. Sets the IAM policy for the repositorygroup and replaces any existing policy already attached.
// * `gemini.RepositoryGroupIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the repositorygroup are preserved.
// * `gemini.RepositoryGroupIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the repositorygroup are preserved.
//
// # A data source can be used to retrieve policy data in advent you do not need creation
//
// * `gemini.RepositoryGroupIamPolicy`: Retrieves the IAM policy for the repositorygroup
//
// > **Note:** `gemini.RepositoryGroupIamPolicy` **cannot** be used in conjunction with `gemini.RepositoryGroupIamBinding` and `gemini.RepositoryGroupIamMember` or they will fight over what your policy should be.
//
// > **Note:** `gemini.RepositoryGroupIamBinding` resources **can be** used in conjunction with `gemini.RepositoryGroupIamMember` resources **only if** they do not grant privilege to the same role.
//
// ## gemini.RepositoryGroupIamPolicy
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/gemini"
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
//						Role: "roles/cloudaicompanion.repositoryGroupsUser",
//						Members: []string{
//							"user:jane@example.com",
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = gemini.NewRepositoryGroupIamPolicy(ctx, "policy", &gemini.RepositoryGroupIamPolicyArgs{
//				Project:             pulumi.Any(example.Project),
//				Location:            pulumi.Any(example.Location),
//				CodeRepositoryIndex: pulumi.Any(example.CodeRepositoryIndex),
//				RepositoryGroupId:   pulumi.Any(example.RepositoryGroupId),
//				PolicyData:          pulumi.String(admin.PolicyData),
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
// ## gemini.RepositoryGroupIamBinding
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/gemini"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := gemini.NewRepositoryGroupIamBinding(ctx, "binding", &gemini.RepositoryGroupIamBindingArgs{
//				Project:             pulumi.Any(example.Project),
//				Location:            pulumi.Any(example.Location),
//				CodeRepositoryIndex: pulumi.Any(example.CodeRepositoryIndex),
//				RepositoryGroupId:   pulumi.Any(example.RepositoryGroupId),
//				Role:                pulumi.String("roles/cloudaicompanion.repositoryGroupsUser"),
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
// ## gemini.RepositoryGroupIamMember
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/gemini"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := gemini.NewRepositoryGroupIamMember(ctx, "member", &gemini.RepositoryGroupIamMemberArgs{
//				Project:             pulumi.Any(example.Project),
//				Location:            pulumi.Any(example.Location),
//				CodeRepositoryIndex: pulumi.Any(example.CodeRepositoryIndex),
//				RepositoryGroupId:   pulumi.Any(example.RepositoryGroupId),
//				Role:                pulumi.String("roles/cloudaicompanion.repositoryGroupsUser"),
//				Member:              pulumi.String("user:jane@example.com"),
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
// * projects/{{project}}/locations/{{location}}/codeRepositoryIndexes/{{code_repository_index}}/repositoryGroups/{{repository_group_id}}
//
// * {{project}}/{{location}}/{{code_repository_index}}/{{repository_group_id}}
//
// * {{location}}/{{code_repository_index}}/{{repository_group_id}}
//
// * {{repository_group_id}}
//
// Any variables not passed in the import command will be taken from the provider configuration.
//
// Gemini for Google Cloud repositorygroup IAM resources can be imported using the resource identifiers, role, and member.
//
// IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
//
// ```sh
// $ pulumi import gcp:gemini/repositoryGroupIamBinding:RepositoryGroupIamBinding editor "projects/{{project}}/locations/{{location}}/codeRepositoryIndexes/{{code_repository_index}}/repositoryGroups/{{repository_group_id}} roles/cloudaicompanion.repositoryGroupsUser user:jane@example.com"
// ```
//
// IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
//
// ```sh
// $ pulumi import gcp:gemini/repositoryGroupIamBinding:RepositoryGroupIamBinding editor "projects/{{project}}/locations/{{location}}/codeRepositoryIndexes/{{code_repository_index}}/repositoryGroups/{{repository_group_id}} roles/cloudaicompanion.repositoryGroupsUser"
// ```
//
// IAM policy imports use the identifier of the resource in question, e.g.
//
// ```sh
// $ pulumi import gcp:gemini/repositoryGroupIamBinding:RepositoryGroupIamBinding editor projects/{{project}}/locations/{{location}}/codeRepositoryIndexes/{{code_repository_index}}/repositoryGroups/{{repository_group_id}}
// ```
//
// -> **Custom Roles** If you're importing a IAM resource with a custom role, make sure to use the
//
//	full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
type RepositoryGroupIamBinding struct {
	pulumi.CustomResourceState

	// Required. Id of the Code Repository Index. Used to find the parent resource to bind the IAM policy to
	CodeRepositoryIndex pulumi.StringOutput                         `pulumi:"codeRepositoryIndex"`
	Condition           RepositoryGroupIamBindingConditionPtrOutput `pulumi:"condition"`
	// (Computed) The etag of the IAM policy.
	Etag pulumi.StringOutput `pulumi:"etag"`
	// The location of the Code Repository Index, for example `us-central1`. Used to find the parent resource to bind the IAM policy to. If not specified,
	// the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
	// location is specified, it is taken from the provider configuration.
	Location pulumi.StringOutput `pulumi:"location"`
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
	// Used to find the parent resource to bind the IAM policy to
	RepositoryGroupId pulumi.StringOutput `pulumi:"repositoryGroupId"`
	// The role that should be applied. Only one
	// `gemini.RepositoryGroupIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringOutput `pulumi:"role"`
}

// NewRepositoryGroupIamBinding registers a new resource with the given unique name, arguments, and options.
func NewRepositoryGroupIamBinding(ctx *pulumi.Context,
	name string, args *RepositoryGroupIamBindingArgs, opts ...pulumi.ResourceOption) (*RepositoryGroupIamBinding, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.CodeRepositoryIndex == nil {
		return nil, errors.New("invalid value for required argument 'CodeRepositoryIndex'")
	}
	if args.Members == nil {
		return nil, errors.New("invalid value for required argument 'Members'")
	}
	if args.RepositoryGroupId == nil {
		return nil, errors.New("invalid value for required argument 'RepositoryGroupId'")
	}
	if args.Role == nil {
		return nil, errors.New("invalid value for required argument 'Role'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource RepositoryGroupIamBinding
	err := ctx.RegisterResource("gcp:gemini/repositoryGroupIamBinding:RepositoryGroupIamBinding", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRepositoryGroupIamBinding gets an existing RepositoryGroupIamBinding resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRepositoryGroupIamBinding(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RepositoryGroupIamBindingState, opts ...pulumi.ResourceOption) (*RepositoryGroupIamBinding, error) {
	var resource RepositoryGroupIamBinding
	err := ctx.ReadResource("gcp:gemini/repositoryGroupIamBinding:RepositoryGroupIamBinding", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering RepositoryGroupIamBinding resources.
type repositoryGroupIamBindingState struct {
	// Required. Id of the Code Repository Index. Used to find the parent resource to bind the IAM policy to
	CodeRepositoryIndex *string                             `pulumi:"codeRepositoryIndex"`
	Condition           *RepositoryGroupIamBindingCondition `pulumi:"condition"`
	// (Computed) The etag of the IAM policy.
	Etag *string `pulumi:"etag"`
	// The location of the Code Repository Index, for example `us-central1`. Used to find the parent resource to bind the IAM policy to. If not specified,
	// the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
	// location is specified, it is taken from the provider configuration.
	Location *string `pulumi:"location"`
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
	// Used to find the parent resource to bind the IAM policy to
	RepositoryGroupId *string `pulumi:"repositoryGroupId"`
	// The role that should be applied. Only one
	// `gemini.RepositoryGroupIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role *string `pulumi:"role"`
}

type RepositoryGroupIamBindingState struct {
	// Required. Id of the Code Repository Index. Used to find the parent resource to bind the IAM policy to
	CodeRepositoryIndex pulumi.StringPtrInput
	Condition           RepositoryGroupIamBindingConditionPtrInput
	// (Computed) The etag of the IAM policy.
	Etag pulumi.StringPtrInput
	// The location of the Code Repository Index, for example `us-central1`. Used to find the parent resource to bind the IAM policy to. If not specified,
	// the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
	// location is specified, it is taken from the provider configuration.
	Location pulumi.StringPtrInput
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
	// Used to find the parent resource to bind the IAM policy to
	RepositoryGroupId pulumi.StringPtrInput
	// The role that should be applied. Only one
	// `gemini.RepositoryGroupIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringPtrInput
}

func (RepositoryGroupIamBindingState) ElementType() reflect.Type {
	return reflect.TypeOf((*repositoryGroupIamBindingState)(nil)).Elem()
}

type repositoryGroupIamBindingArgs struct {
	// Required. Id of the Code Repository Index. Used to find the parent resource to bind the IAM policy to
	CodeRepositoryIndex string                              `pulumi:"codeRepositoryIndex"`
	Condition           *RepositoryGroupIamBindingCondition `pulumi:"condition"`
	// The location of the Code Repository Index, for example `us-central1`. Used to find the parent resource to bind the IAM policy to. If not specified,
	// the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
	// location is specified, it is taken from the provider configuration.
	Location *string `pulumi:"location"`
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
	// Used to find the parent resource to bind the IAM policy to
	RepositoryGroupId string `pulumi:"repositoryGroupId"`
	// The role that should be applied. Only one
	// `gemini.RepositoryGroupIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role string `pulumi:"role"`
}

// The set of arguments for constructing a RepositoryGroupIamBinding resource.
type RepositoryGroupIamBindingArgs struct {
	// Required. Id of the Code Repository Index. Used to find the parent resource to bind the IAM policy to
	CodeRepositoryIndex pulumi.StringInput
	Condition           RepositoryGroupIamBindingConditionPtrInput
	// The location of the Code Repository Index, for example `us-central1`. Used to find the parent resource to bind the IAM policy to. If not specified,
	// the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
	// location is specified, it is taken from the provider configuration.
	Location pulumi.StringPtrInput
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
	// Used to find the parent resource to bind the IAM policy to
	RepositoryGroupId pulumi.StringInput
	// The role that should be applied. Only one
	// `gemini.RepositoryGroupIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringInput
}

func (RepositoryGroupIamBindingArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*repositoryGroupIamBindingArgs)(nil)).Elem()
}

type RepositoryGroupIamBindingInput interface {
	pulumi.Input

	ToRepositoryGroupIamBindingOutput() RepositoryGroupIamBindingOutput
	ToRepositoryGroupIamBindingOutputWithContext(ctx context.Context) RepositoryGroupIamBindingOutput
}

func (*RepositoryGroupIamBinding) ElementType() reflect.Type {
	return reflect.TypeOf((**RepositoryGroupIamBinding)(nil)).Elem()
}

func (i *RepositoryGroupIamBinding) ToRepositoryGroupIamBindingOutput() RepositoryGroupIamBindingOutput {
	return i.ToRepositoryGroupIamBindingOutputWithContext(context.Background())
}

func (i *RepositoryGroupIamBinding) ToRepositoryGroupIamBindingOutputWithContext(ctx context.Context) RepositoryGroupIamBindingOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RepositoryGroupIamBindingOutput)
}

// RepositoryGroupIamBindingArrayInput is an input type that accepts RepositoryGroupIamBindingArray and RepositoryGroupIamBindingArrayOutput values.
// You can construct a concrete instance of `RepositoryGroupIamBindingArrayInput` via:
//
//	RepositoryGroupIamBindingArray{ RepositoryGroupIamBindingArgs{...} }
type RepositoryGroupIamBindingArrayInput interface {
	pulumi.Input

	ToRepositoryGroupIamBindingArrayOutput() RepositoryGroupIamBindingArrayOutput
	ToRepositoryGroupIamBindingArrayOutputWithContext(context.Context) RepositoryGroupIamBindingArrayOutput
}

type RepositoryGroupIamBindingArray []RepositoryGroupIamBindingInput

func (RepositoryGroupIamBindingArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RepositoryGroupIamBinding)(nil)).Elem()
}

func (i RepositoryGroupIamBindingArray) ToRepositoryGroupIamBindingArrayOutput() RepositoryGroupIamBindingArrayOutput {
	return i.ToRepositoryGroupIamBindingArrayOutputWithContext(context.Background())
}

func (i RepositoryGroupIamBindingArray) ToRepositoryGroupIamBindingArrayOutputWithContext(ctx context.Context) RepositoryGroupIamBindingArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RepositoryGroupIamBindingArrayOutput)
}

// RepositoryGroupIamBindingMapInput is an input type that accepts RepositoryGroupIamBindingMap and RepositoryGroupIamBindingMapOutput values.
// You can construct a concrete instance of `RepositoryGroupIamBindingMapInput` via:
//
//	RepositoryGroupIamBindingMap{ "key": RepositoryGroupIamBindingArgs{...} }
type RepositoryGroupIamBindingMapInput interface {
	pulumi.Input

	ToRepositoryGroupIamBindingMapOutput() RepositoryGroupIamBindingMapOutput
	ToRepositoryGroupIamBindingMapOutputWithContext(context.Context) RepositoryGroupIamBindingMapOutput
}

type RepositoryGroupIamBindingMap map[string]RepositoryGroupIamBindingInput

func (RepositoryGroupIamBindingMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RepositoryGroupIamBinding)(nil)).Elem()
}

func (i RepositoryGroupIamBindingMap) ToRepositoryGroupIamBindingMapOutput() RepositoryGroupIamBindingMapOutput {
	return i.ToRepositoryGroupIamBindingMapOutputWithContext(context.Background())
}

func (i RepositoryGroupIamBindingMap) ToRepositoryGroupIamBindingMapOutputWithContext(ctx context.Context) RepositoryGroupIamBindingMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RepositoryGroupIamBindingMapOutput)
}

type RepositoryGroupIamBindingOutput struct{ *pulumi.OutputState }

func (RepositoryGroupIamBindingOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**RepositoryGroupIamBinding)(nil)).Elem()
}

func (o RepositoryGroupIamBindingOutput) ToRepositoryGroupIamBindingOutput() RepositoryGroupIamBindingOutput {
	return o
}

func (o RepositoryGroupIamBindingOutput) ToRepositoryGroupIamBindingOutputWithContext(ctx context.Context) RepositoryGroupIamBindingOutput {
	return o
}

// Required. Id of the Code Repository Index. Used to find the parent resource to bind the IAM policy to
func (o RepositoryGroupIamBindingOutput) CodeRepositoryIndex() pulumi.StringOutput {
	return o.ApplyT(func(v *RepositoryGroupIamBinding) pulumi.StringOutput { return v.CodeRepositoryIndex }).(pulumi.StringOutput)
}

func (o RepositoryGroupIamBindingOutput) Condition() RepositoryGroupIamBindingConditionPtrOutput {
	return o.ApplyT(func(v *RepositoryGroupIamBinding) RepositoryGroupIamBindingConditionPtrOutput { return v.Condition }).(RepositoryGroupIamBindingConditionPtrOutput)
}

// (Computed) The etag of the IAM policy.
func (o RepositoryGroupIamBindingOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v *RepositoryGroupIamBinding) pulumi.StringOutput { return v.Etag }).(pulumi.StringOutput)
}

// The location of the Code Repository Index, for example `us-central1`. Used to find the parent resource to bind the IAM policy to. If not specified,
// the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
// location is specified, it is taken from the provider configuration.
func (o RepositoryGroupIamBindingOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *RepositoryGroupIamBinding) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
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
func (o RepositoryGroupIamBindingOutput) Members() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *RepositoryGroupIamBinding) pulumi.StringArrayOutput { return v.Members }).(pulumi.StringArrayOutput)
}

// The ID of the project in which the resource belongs.
// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
func (o RepositoryGroupIamBindingOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *RepositoryGroupIamBinding) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// Used to find the parent resource to bind the IAM policy to
func (o RepositoryGroupIamBindingOutput) RepositoryGroupId() pulumi.StringOutput {
	return o.ApplyT(func(v *RepositoryGroupIamBinding) pulumi.StringOutput { return v.RepositoryGroupId }).(pulumi.StringOutput)
}

// The role that should be applied. Only one
// `gemini.RepositoryGroupIamBinding` can be used per role. Note that custom roles must be of the format
// `[projects|organizations]/{parent-name}/roles/{role-name}`.
func (o RepositoryGroupIamBindingOutput) Role() pulumi.StringOutput {
	return o.ApplyT(func(v *RepositoryGroupIamBinding) pulumi.StringOutput { return v.Role }).(pulumi.StringOutput)
}

type RepositoryGroupIamBindingArrayOutput struct{ *pulumi.OutputState }

func (RepositoryGroupIamBindingArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RepositoryGroupIamBinding)(nil)).Elem()
}

func (o RepositoryGroupIamBindingArrayOutput) ToRepositoryGroupIamBindingArrayOutput() RepositoryGroupIamBindingArrayOutput {
	return o
}

func (o RepositoryGroupIamBindingArrayOutput) ToRepositoryGroupIamBindingArrayOutputWithContext(ctx context.Context) RepositoryGroupIamBindingArrayOutput {
	return o
}

func (o RepositoryGroupIamBindingArrayOutput) Index(i pulumi.IntInput) RepositoryGroupIamBindingOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *RepositoryGroupIamBinding {
		return vs[0].([]*RepositoryGroupIamBinding)[vs[1].(int)]
	}).(RepositoryGroupIamBindingOutput)
}

type RepositoryGroupIamBindingMapOutput struct{ *pulumi.OutputState }

func (RepositoryGroupIamBindingMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RepositoryGroupIamBinding)(nil)).Elem()
}

func (o RepositoryGroupIamBindingMapOutput) ToRepositoryGroupIamBindingMapOutput() RepositoryGroupIamBindingMapOutput {
	return o
}

func (o RepositoryGroupIamBindingMapOutput) ToRepositoryGroupIamBindingMapOutputWithContext(ctx context.Context) RepositoryGroupIamBindingMapOutput {
	return o
}

func (o RepositoryGroupIamBindingMapOutput) MapIndex(k pulumi.StringInput) RepositoryGroupIamBindingOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *RepositoryGroupIamBinding {
		return vs[0].(map[string]*RepositoryGroupIamBinding)[vs[1].(string)]
	}).(RepositoryGroupIamBindingOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RepositoryGroupIamBindingInput)(nil)).Elem(), &RepositoryGroupIamBinding{})
	pulumi.RegisterInputType(reflect.TypeOf((*RepositoryGroupIamBindingArrayInput)(nil)).Elem(), RepositoryGroupIamBindingArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RepositoryGroupIamBindingMapInput)(nil)).Elem(), RepositoryGroupIamBindingMap{})
	pulumi.RegisterOutputType(RepositoryGroupIamBindingOutput{})
	pulumi.RegisterOutputType(RepositoryGroupIamBindingArrayOutput{})
	pulumi.RegisterOutputType(RepositoryGroupIamBindingMapOutput{})
}
