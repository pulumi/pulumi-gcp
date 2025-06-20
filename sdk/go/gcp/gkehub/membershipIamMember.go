// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package gkehub

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Three different resources help you manage your IAM policy for GKEHub Membership. Each of these resources serves a different use case:
//
// * `gkehub.MembershipIamPolicy`: Authoritative. Sets the IAM policy for the membership and replaces any existing policy already attached.
// * `gkehub.MembershipIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the membership are preserved.
// * `gkehub.MembershipIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the membership are preserved.
//
// # A data source can be used to retrieve policy data in advent you do not need creation
//
// * `gkehub.MembershipIamPolicy`: Retrieves the IAM policy for the membership
//
// > **Note:** `gkehub.MembershipIamPolicy` **cannot** be used in conjunction with `gkehub.MembershipIamBinding` and `gkehub.MembershipIamMember` or they will fight over what your policy should be.
//
// > **Note:** `gkehub.MembershipIamBinding` resources **can be** used in conjunction with `gkehub.MembershipIamMember` resources **only if** they do not grant privilege to the same role.
//
// ## gkehub.MembershipIamPolicy
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/gkehub"
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
//			_, err = gkehub.NewMembershipIamPolicy(ctx, "policy", &gkehub.MembershipIamPolicyArgs{
//				Project:      pulumi.Any(membership.Project),
//				Location:     pulumi.Any(membership.Location),
//				MembershipId: pulumi.Any(membership.MembershipId),
//				PolicyData:   pulumi.String(admin.PolicyData),
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
// ## gkehub.MembershipIamBinding
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/gkehub"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := gkehub.NewMembershipIamBinding(ctx, "binding", &gkehub.MembershipIamBindingArgs{
//				Project:      pulumi.Any(membership.Project),
//				Location:     pulumi.Any(membership.Location),
//				MembershipId: pulumi.Any(membership.MembershipId),
//				Role:         pulumi.String("roles/viewer"),
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
// ## gkehub.MembershipIamMember
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/gkehub"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := gkehub.NewMembershipIamMember(ctx, "member", &gkehub.MembershipIamMemberArgs{
//				Project:      pulumi.Any(membership.Project),
//				Location:     pulumi.Any(membership.Location),
//				MembershipId: pulumi.Any(membership.MembershipId),
//				Role:         pulumi.String("roles/viewer"),
//				Member:       pulumi.String("user:jane@example.com"),
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
// # IAM policy for GKEHub Membership
// Three different resources help you manage your IAM policy for GKEHub Membership. Each of these resources serves a different use case:
//
// * `gkehub.MembershipIamPolicy`: Authoritative. Sets the IAM policy for the membership and replaces any existing policy already attached.
// * `gkehub.MembershipIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the membership are preserved.
// * `gkehub.MembershipIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the membership are preserved.
//
// # A data source can be used to retrieve policy data in advent you do not need creation
//
// * `gkehub.MembershipIamPolicy`: Retrieves the IAM policy for the membership
//
// > **Note:** `gkehub.MembershipIamPolicy` **cannot** be used in conjunction with `gkehub.MembershipIamBinding` and `gkehub.MembershipIamMember` or they will fight over what your policy should be.
//
// > **Note:** `gkehub.MembershipIamBinding` resources **can be** used in conjunction with `gkehub.MembershipIamMember` resources **only if** they do not grant privilege to the same role.
//
// ## gkehub.MembershipIamPolicy
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/gkehub"
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
//			_, err = gkehub.NewMembershipIamPolicy(ctx, "policy", &gkehub.MembershipIamPolicyArgs{
//				Project:      pulumi.Any(membership.Project),
//				Location:     pulumi.Any(membership.Location),
//				MembershipId: pulumi.Any(membership.MembershipId),
//				PolicyData:   pulumi.String(admin.PolicyData),
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
// ## gkehub.MembershipIamBinding
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/gkehub"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := gkehub.NewMembershipIamBinding(ctx, "binding", &gkehub.MembershipIamBindingArgs{
//				Project:      pulumi.Any(membership.Project),
//				Location:     pulumi.Any(membership.Location),
//				MembershipId: pulumi.Any(membership.MembershipId),
//				Role:         pulumi.String("roles/viewer"),
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
// ## gkehub.MembershipIamMember
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/gkehub"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := gkehub.NewMembershipIamMember(ctx, "member", &gkehub.MembershipIamMemberArgs{
//				Project:      pulumi.Any(membership.Project),
//				Location:     pulumi.Any(membership.Location),
//				MembershipId: pulumi.Any(membership.MembershipId),
//				Role:         pulumi.String("roles/viewer"),
//				Member:       pulumi.String("user:jane@example.com"),
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
// * projects/{{project}}/locations/{{location}}/memberships/{{membership_id}}
//
// * {{project}}/{{location}}/{{membership_id}}
//
// * {{location}}/{{membership_id}}
//
// * {{membership_id}}
//
// Any variables not passed in the import command will be taken from the provider configuration.
//
// GKEHub membership IAM resources can be imported using the resource identifiers, role, and member.
//
// IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
//
// ```sh
// $ pulumi import gcp:gkehub/membershipIamMember:MembershipIamMember editor "projects/{{project}}/locations/{{location}}/memberships/{{membership_id}} roles/viewer user:jane@example.com"
// ```
//
// IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
//
// ```sh
// $ pulumi import gcp:gkehub/membershipIamMember:MembershipIamMember editor "projects/{{project}}/locations/{{location}}/memberships/{{membership_id}} roles/viewer"
// ```
//
// IAM policy imports use the identifier of the resource in question, e.g.
//
// ```sh
// $ pulumi import gcp:gkehub/membershipIamMember:MembershipIamMember editor projects/{{project}}/locations/{{location}}/memberships/{{membership_id}}
// ```
//
// -> **Custom Roles** If you're importing a IAM resource with a custom role, make sure to use the
//
//	full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
type MembershipIamMember struct {
	pulumi.CustomResourceState

	Condition MembershipIamMemberConditionPtrOutput `pulumi:"condition"`
	// (Computed) The etag of the IAM policy.
	Etag pulumi.StringOutput `pulumi:"etag"`
	// Location of the membership.
	// The default value is `global`.
	// Used to find the parent resource to bind the IAM policy to. If not specified,
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
	Member pulumi.StringOutput `pulumi:"member"`
	// Used to find the parent resource to bind the IAM policy to
	MembershipId pulumi.StringOutput `pulumi:"membershipId"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringOutput `pulumi:"project"`
	// The role that should be applied. Only one
	// `gkehub.MembershipIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringOutput `pulumi:"role"`
}

// NewMembershipIamMember registers a new resource with the given unique name, arguments, and options.
func NewMembershipIamMember(ctx *pulumi.Context,
	name string, args *MembershipIamMemberArgs, opts ...pulumi.ResourceOption) (*MembershipIamMember, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Member == nil {
		return nil, errors.New("invalid value for required argument 'Member'")
	}
	if args.MembershipId == nil {
		return nil, errors.New("invalid value for required argument 'MembershipId'")
	}
	if args.Role == nil {
		return nil, errors.New("invalid value for required argument 'Role'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource MembershipIamMember
	err := ctx.RegisterResource("gcp:gkehub/membershipIamMember:MembershipIamMember", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetMembershipIamMember gets an existing MembershipIamMember resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetMembershipIamMember(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *MembershipIamMemberState, opts ...pulumi.ResourceOption) (*MembershipIamMember, error) {
	var resource MembershipIamMember
	err := ctx.ReadResource("gcp:gkehub/membershipIamMember:MembershipIamMember", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering MembershipIamMember resources.
type membershipIamMemberState struct {
	Condition *MembershipIamMemberCondition `pulumi:"condition"`
	// (Computed) The etag of the IAM policy.
	Etag *string `pulumi:"etag"`
	// Location of the membership.
	// The default value is `global`.
	// Used to find the parent resource to bind the IAM policy to. If not specified,
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
	Member *string `pulumi:"member"`
	// Used to find the parent resource to bind the IAM policy to
	MembershipId *string `pulumi:"membershipId"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project *string `pulumi:"project"`
	// The role that should be applied. Only one
	// `gkehub.MembershipIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role *string `pulumi:"role"`
}

type MembershipIamMemberState struct {
	Condition MembershipIamMemberConditionPtrInput
	// (Computed) The etag of the IAM policy.
	Etag pulumi.StringPtrInput
	// Location of the membership.
	// The default value is `global`.
	// Used to find the parent resource to bind the IAM policy to. If not specified,
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
	Member pulumi.StringPtrInput
	// Used to find the parent resource to bind the IAM policy to
	MembershipId pulumi.StringPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringPtrInput
	// The role that should be applied. Only one
	// `gkehub.MembershipIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringPtrInput
}

func (MembershipIamMemberState) ElementType() reflect.Type {
	return reflect.TypeOf((*membershipIamMemberState)(nil)).Elem()
}

type membershipIamMemberArgs struct {
	Condition *MembershipIamMemberCondition `pulumi:"condition"`
	// Location of the membership.
	// The default value is `global`.
	// Used to find the parent resource to bind the IAM policy to. If not specified,
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
	Member string `pulumi:"member"`
	// Used to find the parent resource to bind the IAM policy to
	MembershipId string `pulumi:"membershipId"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project *string `pulumi:"project"`
	// The role that should be applied. Only one
	// `gkehub.MembershipIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role string `pulumi:"role"`
}

// The set of arguments for constructing a MembershipIamMember resource.
type MembershipIamMemberArgs struct {
	Condition MembershipIamMemberConditionPtrInput
	// Location of the membership.
	// The default value is `global`.
	// Used to find the parent resource to bind the IAM policy to. If not specified,
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
	Member pulumi.StringInput
	// Used to find the parent resource to bind the IAM policy to
	MembershipId pulumi.StringInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringPtrInput
	// The role that should be applied. Only one
	// `gkehub.MembershipIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringInput
}

func (MembershipIamMemberArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*membershipIamMemberArgs)(nil)).Elem()
}

type MembershipIamMemberInput interface {
	pulumi.Input

	ToMembershipIamMemberOutput() MembershipIamMemberOutput
	ToMembershipIamMemberOutputWithContext(ctx context.Context) MembershipIamMemberOutput
}

func (*MembershipIamMember) ElementType() reflect.Type {
	return reflect.TypeOf((**MembershipIamMember)(nil)).Elem()
}

func (i *MembershipIamMember) ToMembershipIamMemberOutput() MembershipIamMemberOutput {
	return i.ToMembershipIamMemberOutputWithContext(context.Background())
}

func (i *MembershipIamMember) ToMembershipIamMemberOutputWithContext(ctx context.Context) MembershipIamMemberOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MembershipIamMemberOutput)
}

// MembershipIamMemberArrayInput is an input type that accepts MembershipIamMemberArray and MembershipIamMemberArrayOutput values.
// You can construct a concrete instance of `MembershipIamMemberArrayInput` via:
//
//	MembershipIamMemberArray{ MembershipIamMemberArgs{...} }
type MembershipIamMemberArrayInput interface {
	pulumi.Input

	ToMembershipIamMemberArrayOutput() MembershipIamMemberArrayOutput
	ToMembershipIamMemberArrayOutputWithContext(context.Context) MembershipIamMemberArrayOutput
}

type MembershipIamMemberArray []MembershipIamMemberInput

func (MembershipIamMemberArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MembershipIamMember)(nil)).Elem()
}

func (i MembershipIamMemberArray) ToMembershipIamMemberArrayOutput() MembershipIamMemberArrayOutput {
	return i.ToMembershipIamMemberArrayOutputWithContext(context.Background())
}

func (i MembershipIamMemberArray) ToMembershipIamMemberArrayOutputWithContext(ctx context.Context) MembershipIamMemberArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MembershipIamMemberArrayOutput)
}

// MembershipIamMemberMapInput is an input type that accepts MembershipIamMemberMap and MembershipIamMemberMapOutput values.
// You can construct a concrete instance of `MembershipIamMemberMapInput` via:
//
//	MembershipIamMemberMap{ "key": MembershipIamMemberArgs{...} }
type MembershipIamMemberMapInput interface {
	pulumi.Input

	ToMembershipIamMemberMapOutput() MembershipIamMemberMapOutput
	ToMembershipIamMemberMapOutputWithContext(context.Context) MembershipIamMemberMapOutput
}

type MembershipIamMemberMap map[string]MembershipIamMemberInput

func (MembershipIamMemberMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MembershipIamMember)(nil)).Elem()
}

func (i MembershipIamMemberMap) ToMembershipIamMemberMapOutput() MembershipIamMemberMapOutput {
	return i.ToMembershipIamMemberMapOutputWithContext(context.Background())
}

func (i MembershipIamMemberMap) ToMembershipIamMemberMapOutputWithContext(ctx context.Context) MembershipIamMemberMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MembershipIamMemberMapOutput)
}

type MembershipIamMemberOutput struct{ *pulumi.OutputState }

func (MembershipIamMemberOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**MembershipIamMember)(nil)).Elem()
}

func (o MembershipIamMemberOutput) ToMembershipIamMemberOutput() MembershipIamMemberOutput {
	return o
}

func (o MembershipIamMemberOutput) ToMembershipIamMemberOutputWithContext(ctx context.Context) MembershipIamMemberOutput {
	return o
}

func (o MembershipIamMemberOutput) Condition() MembershipIamMemberConditionPtrOutput {
	return o.ApplyT(func(v *MembershipIamMember) MembershipIamMemberConditionPtrOutput { return v.Condition }).(MembershipIamMemberConditionPtrOutput)
}

// (Computed) The etag of the IAM policy.
func (o MembershipIamMemberOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v *MembershipIamMember) pulumi.StringOutput { return v.Etag }).(pulumi.StringOutput)
}

// Location of the membership.
// The default value is `global`.
// Used to find the parent resource to bind the IAM policy to. If not specified,
// the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
// location is specified, it is taken from the provider configuration.
func (o MembershipIamMemberOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *MembershipIamMember) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
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
func (o MembershipIamMemberOutput) Member() pulumi.StringOutput {
	return o.ApplyT(func(v *MembershipIamMember) pulumi.StringOutput { return v.Member }).(pulumi.StringOutput)
}

// Used to find the parent resource to bind the IAM policy to
func (o MembershipIamMemberOutput) MembershipId() pulumi.StringOutput {
	return o.ApplyT(func(v *MembershipIamMember) pulumi.StringOutput { return v.MembershipId }).(pulumi.StringOutput)
}

// The ID of the project in which the resource belongs.
// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
func (o MembershipIamMemberOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *MembershipIamMember) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// The role that should be applied. Only one
// `gkehub.MembershipIamBinding` can be used per role. Note that custom roles must be of the format
// `[projects|organizations]/{parent-name}/roles/{role-name}`.
func (o MembershipIamMemberOutput) Role() pulumi.StringOutput {
	return o.ApplyT(func(v *MembershipIamMember) pulumi.StringOutput { return v.Role }).(pulumi.StringOutput)
}

type MembershipIamMemberArrayOutput struct{ *pulumi.OutputState }

func (MembershipIamMemberArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MembershipIamMember)(nil)).Elem()
}

func (o MembershipIamMemberArrayOutput) ToMembershipIamMemberArrayOutput() MembershipIamMemberArrayOutput {
	return o
}

func (o MembershipIamMemberArrayOutput) ToMembershipIamMemberArrayOutputWithContext(ctx context.Context) MembershipIamMemberArrayOutput {
	return o
}

func (o MembershipIamMemberArrayOutput) Index(i pulumi.IntInput) MembershipIamMemberOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *MembershipIamMember {
		return vs[0].([]*MembershipIamMember)[vs[1].(int)]
	}).(MembershipIamMemberOutput)
}

type MembershipIamMemberMapOutput struct{ *pulumi.OutputState }

func (MembershipIamMemberMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MembershipIamMember)(nil)).Elem()
}

func (o MembershipIamMemberMapOutput) ToMembershipIamMemberMapOutput() MembershipIamMemberMapOutput {
	return o
}

func (o MembershipIamMemberMapOutput) ToMembershipIamMemberMapOutputWithContext(ctx context.Context) MembershipIamMemberMapOutput {
	return o
}

func (o MembershipIamMemberMapOutput) MapIndex(k pulumi.StringInput) MembershipIamMemberOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *MembershipIamMember {
		return vs[0].(map[string]*MembershipIamMember)[vs[1].(string)]
	}).(MembershipIamMemberOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*MembershipIamMemberInput)(nil)).Elem(), &MembershipIamMember{})
	pulumi.RegisterInputType(reflect.TypeOf((*MembershipIamMemberArrayInput)(nil)).Elem(), MembershipIamMemberArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*MembershipIamMemberMapInput)(nil)).Elem(), MembershipIamMemberMap{})
	pulumi.RegisterOutputType(MembershipIamMemberOutput{})
	pulumi.RegisterOutputType(MembershipIamMemberArrayOutput{})
	pulumi.RegisterOutputType(MembershipIamMemberMapOutput{})
}
