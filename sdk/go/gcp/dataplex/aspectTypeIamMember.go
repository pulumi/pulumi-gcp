// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dataplex

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Three different resources help you manage your IAM policy for Dataplex AspectType. Each of these resources serves a different use case:
//
// * `dataplex.AspectTypeIamPolicy`: Authoritative. Sets the IAM policy for the aspecttype and replaces any existing policy already attached.
// * `dataplex.AspectTypeIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the aspecttype are preserved.
// * `dataplex.AspectTypeIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the aspecttype are preserved.
//
// # A data source can be used to retrieve policy data in advent you do not need creation
//
// * `dataplex.AspectTypeIamPolicy`: Retrieves the IAM policy for the aspecttype
//
// > **Note:** `dataplex.AspectTypeIamPolicy` **cannot** be used in conjunction with `dataplex.AspectTypeIamBinding` and `dataplex.AspectTypeIamMember` or they will fight over what your policy should be.
//
// > **Note:** `dataplex.AspectTypeIamBinding` resources **can be** used in conjunction with `dataplex.AspectTypeIamMember` resources **only if** they do not grant privilege to the same role.
//
// ## dataplex.AspectTypeIamPolicy
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/dataplex"
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
//			_, err = dataplex.NewAspectTypeIamPolicy(ctx, "policy", &dataplex.AspectTypeIamPolicyArgs{
//				Project:      pulumi.Any(testAspectTypeBasic.Project),
//				Location:     pulumi.Any(testAspectTypeBasic.Location),
//				AspectTypeId: pulumi.Any(testAspectTypeBasic.AspectTypeId),
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
// ## dataplex.AspectTypeIamBinding
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/dataplex"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := dataplex.NewAspectTypeIamBinding(ctx, "binding", &dataplex.AspectTypeIamBindingArgs{
//				Project:      pulumi.Any(testAspectTypeBasic.Project),
//				Location:     pulumi.Any(testAspectTypeBasic.Location),
//				AspectTypeId: pulumi.Any(testAspectTypeBasic.AspectTypeId),
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
// ## dataplex.AspectTypeIamMember
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/dataplex"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := dataplex.NewAspectTypeIamMember(ctx, "member", &dataplex.AspectTypeIamMemberArgs{
//				Project:      pulumi.Any(testAspectTypeBasic.Project),
//				Location:     pulumi.Any(testAspectTypeBasic.Location),
//				AspectTypeId: pulumi.Any(testAspectTypeBasic.AspectTypeId),
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
// # IAM policy for Dataplex AspectType
// Three different resources help you manage your IAM policy for Dataplex AspectType. Each of these resources serves a different use case:
//
// * `dataplex.AspectTypeIamPolicy`: Authoritative. Sets the IAM policy for the aspecttype and replaces any existing policy already attached.
// * `dataplex.AspectTypeIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the aspecttype are preserved.
// * `dataplex.AspectTypeIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the aspecttype are preserved.
//
// # A data source can be used to retrieve policy data in advent you do not need creation
//
// * `dataplex.AspectTypeIamPolicy`: Retrieves the IAM policy for the aspecttype
//
// > **Note:** `dataplex.AspectTypeIamPolicy` **cannot** be used in conjunction with `dataplex.AspectTypeIamBinding` and `dataplex.AspectTypeIamMember` or they will fight over what your policy should be.
//
// > **Note:** `dataplex.AspectTypeIamBinding` resources **can be** used in conjunction with `dataplex.AspectTypeIamMember` resources **only if** they do not grant privilege to the same role.
//
// ## dataplex.AspectTypeIamPolicy
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/dataplex"
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
//			_, err = dataplex.NewAspectTypeIamPolicy(ctx, "policy", &dataplex.AspectTypeIamPolicyArgs{
//				Project:      pulumi.Any(testAspectTypeBasic.Project),
//				Location:     pulumi.Any(testAspectTypeBasic.Location),
//				AspectTypeId: pulumi.Any(testAspectTypeBasic.AspectTypeId),
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
// ## dataplex.AspectTypeIamBinding
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/dataplex"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := dataplex.NewAspectTypeIamBinding(ctx, "binding", &dataplex.AspectTypeIamBindingArgs{
//				Project:      pulumi.Any(testAspectTypeBasic.Project),
//				Location:     pulumi.Any(testAspectTypeBasic.Location),
//				AspectTypeId: pulumi.Any(testAspectTypeBasic.AspectTypeId),
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
// ## dataplex.AspectTypeIamMember
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/dataplex"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := dataplex.NewAspectTypeIamMember(ctx, "member", &dataplex.AspectTypeIamMemberArgs{
//				Project:      pulumi.Any(testAspectTypeBasic.Project),
//				Location:     pulumi.Any(testAspectTypeBasic.Location),
//				AspectTypeId: pulumi.Any(testAspectTypeBasic.AspectTypeId),
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
// * projects/{{project}}/locations/{{location}}/aspectTypes/{{aspect_type_id}}
//
// * {{project}}/{{location}}/{{aspect_type_id}}
//
// * {{location}}/{{aspect_type_id}}
//
// * {{aspect_type_id}}
//
// Any variables not passed in the import command will be taken from the provider configuration.
//
// Dataplex aspecttype IAM resources can be imported using the resource identifiers, role, and member.
//
// IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
//
// ```sh
// $ pulumi import gcp:dataplex/aspectTypeIamMember:AspectTypeIamMember editor "projects/{{project}}/locations/{{location}}/aspectTypes/{{aspect_type_id}} roles/viewer user:jane@example.com"
// ```
//
// IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
//
// ```sh
// $ pulumi import gcp:dataplex/aspectTypeIamMember:AspectTypeIamMember editor "projects/{{project}}/locations/{{location}}/aspectTypes/{{aspect_type_id}} roles/viewer"
// ```
//
// IAM policy imports use the identifier of the resource in question, e.g.
//
// ```sh
// $ pulumi import gcp:dataplex/aspectTypeIamMember:AspectTypeIamMember editor projects/{{project}}/locations/{{location}}/aspectTypes/{{aspect_type_id}}
// ```
//
// -> **Custom Roles** If you're importing a IAM resource with a custom role, make sure to use the
//
//	full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
type AspectTypeIamMember struct {
	pulumi.CustomResourceState

	// Used to find the parent resource to bind the IAM policy to
	AspectTypeId pulumi.StringOutput                   `pulumi:"aspectTypeId"`
	Condition    AspectTypeIamMemberConditionPtrOutput `pulumi:"condition"`
	// (Computed) The etag of the IAM policy.
	Etag pulumi.StringOutput `pulumi:"etag"`
	// The location where aspect type will be created in.
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
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringOutput `pulumi:"project"`
	// The role that should be applied. Only one
	// `dataplex.AspectTypeIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringOutput `pulumi:"role"`
}

// NewAspectTypeIamMember registers a new resource with the given unique name, arguments, and options.
func NewAspectTypeIamMember(ctx *pulumi.Context,
	name string, args *AspectTypeIamMemberArgs, opts ...pulumi.ResourceOption) (*AspectTypeIamMember, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AspectTypeId == nil {
		return nil, errors.New("invalid value for required argument 'AspectTypeId'")
	}
	if args.Member == nil {
		return nil, errors.New("invalid value for required argument 'Member'")
	}
	if args.Role == nil {
		return nil, errors.New("invalid value for required argument 'Role'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AspectTypeIamMember
	err := ctx.RegisterResource("gcp:dataplex/aspectTypeIamMember:AspectTypeIamMember", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAspectTypeIamMember gets an existing AspectTypeIamMember resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAspectTypeIamMember(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AspectTypeIamMemberState, opts ...pulumi.ResourceOption) (*AspectTypeIamMember, error) {
	var resource AspectTypeIamMember
	err := ctx.ReadResource("gcp:dataplex/aspectTypeIamMember:AspectTypeIamMember", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AspectTypeIamMember resources.
type aspectTypeIamMemberState struct {
	// Used to find the parent resource to bind the IAM policy to
	AspectTypeId *string                       `pulumi:"aspectTypeId"`
	Condition    *AspectTypeIamMemberCondition `pulumi:"condition"`
	// (Computed) The etag of the IAM policy.
	Etag *string `pulumi:"etag"`
	// The location where aspect type will be created in.
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
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project *string `pulumi:"project"`
	// The role that should be applied. Only one
	// `dataplex.AspectTypeIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role *string `pulumi:"role"`
}

type AspectTypeIamMemberState struct {
	// Used to find the parent resource to bind the IAM policy to
	AspectTypeId pulumi.StringPtrInput
	Condition    AspectTypeIamMemberConditionPtrInput
	// (Computed) The etag of the IAM policy.
	Etag pulumi.StringPtrInput
	// The location where aspect type will be created in.
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
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringPtrInput
	// The role that should be applied. Only one
	// `dataplex.AspectTypeIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringPtrInput
}

func (AspectTypeIamMemberState) ElementType() reflect.Type {
	return reflect.TypeOf((*aspectTypeIamMemberState)(nil)).Elem()
}

type aspectTypeIamMemberArgs struct {
	// Used to find the parent resource to bind the IAM policy to
	AspectTypeId string                        `pulumi:"aspectTypeId"`
	Condition    *AspectTypeIamMemberCondition `pulumi:"condition"`
	// The location where aspect type will be created in.
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
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project *string `pulumi:"project"`
	// The role that should be applied. Only one
	// `dataplex.AspectTypeIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role string `pulumi:"role"`
}

// The set of arguments for constructing a AspectTypeIamMember resource.
type AspectTypeIamMemberArgs struct {
	// Used to find the parent resource to bind the IAM policy to
	AspectTypeId pulumi.StringInput
	Condition    AspectTypeIamMemberConditionPtrInput
	// The location where aspect type will be created in.
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
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringPtrInput
	// The role that should be applied. Only one
	// `dataplex.AspectTypeIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringInput
}

func (AspectTypeIamMemberArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*aspectTypeIamMemberArgs)(nil)).Elem()
}

type AspectTypeIamMemberInput interface {
	pulumi.Input

	ToAspectTypeIamMemberOutput() AspectTypeIamMemberOutput
	ToAspectTypeIamMemberOutputWithContext(ctx context.Context) AspectTypeIamMemberOutput
}

func (*AspectTypeIamMember) ElementType() reflect.Type {
	return reflect.TypeOf((**AspectTypeIamMember)(nil)).Elem()
}

func (i *AspectTypeIamMember) ToAspectTypeIamMemberOutput() AspectTypeIamMemberOutput {
	return i.ToAspectTypeIamMemberOutputWithContext(context.Background())
}

func (i *AspectTypeIamMember) ToAspectTypeIamMemberOutputWithContext(ctx context.Context) AspectTypeIamMemberOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AspectTypeIamMemberOutput)
}

// AspectTypeIamMemberArrayInput is an input type that accepts AspectTypeIamMemberArray and AspectTypeIamMemberArrayOutput values.
// You can construct a concrete instance of `AspectTypeIamMemberArrayInput` via:
//
//	AspectTypeIamMemberArray{ AspectTypeIamMemberArgs{...} }
type AspectTypeIamMemberArrayInput interface {
	pulumi.Input

	ToAspectTypeIamMemberArrayOutput() AspectTypeIamMemberArrayOutput
	ToAspectTypeIamMemberArrayOutputWithContext(context.Context) AspectTypeIamMemberArrayOutput
}

type AspectTypeIamMemberArray []AspectTypeIamMemberInput

func (AspectTypeIamMemberArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AspectTypeIamMember)(nil)).Elem()
}

func (i AspectTypeIamMemberArray) ToAspectTypeIamMemberArrayOutput() AspectTypeIamMemberArrayOutput {
	return i.ToAspectTypeIamMemberArrayOutputWithContext(context.Background())
}

func (i AspectTypeIamMemberArray) ToAspectTypeIamMemberArrayOutputWithContext(ctx context.Context) AspectTypeIamMemberArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AspectTypeIamMemberArrayOutput)
}

// AspectTypeIamMemberMapInput is an input type that accepts AspectTypeIamMemberMap and AspectTypeIamMemberMapOutput values.
// You can construct a concrete instance of `AspectTypeIamMemberMapInput` via:
//
//	AspectTypeIamMemberMap{ "key": AspectTypeIamMemberArgs{...} }
type AspectTypeIamMemberMapInput interface {
	pulumi.Input

	ToAspectTypeIamMemberMapOutput() AspectTypeIamMemberMapOutput
	ToAspectTypeIamMemberMapOutputWithContext(context.Context) AspectTypeIamMemberMapOutput
}

type AspectTypeIamMemberMap map[string]AspectTypeIamMemberInput

func (AspectTypeIamMemberMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AspectTypeIamMember)(nil)).Elem()
}

func (i AspectTypeIamMemberMap) ToAspectTypeIamMemberMapOutput() AspectTypeIamMemberMapOutput {
	return i.ToAspectTypeIamMemberMapOutputWithContext(context.Background())
}

func (i AspectTypeIamMemberMap) ToAspectTypeIamMemberMapOutputWithContext(ctx context.Context) AspectTypeIamMemberMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AspectTypeIamMemberMapOutput)
}

type AspectTypeIamMemberOutput struct{ *pulumi.OutputState }

func (AspectTypeIamMemberOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AspectTypeIamMember)(nil)).Elem()
}

func (o AspectTypeIamMemberOutput) ToAspectTypeIamMemberOutput() AspectTypeIamMemberOutput {
	return o
}

func (o AspectTypeIamMemberOutput) ToAspectTypeIamMemberOutputWithContext(ctx context.Context) AspectTypeIamMemberOutput {
	return o
}

// Used to find the parent resource to bind the IAM policy to
func (o AspectTypeIamMemberOutput) AspectTypeId() pulumi.StringOutput {
	return o.ApplyT(func(v *AspectTypeIamMember) pulumi.StringOutput { return v.AspectTypeId }).(pulumi.StringOutput)
}

func (o AspectTypeIamMemberOutput) Condition() AspectTypeIamMemberConditionPtrOutput {
	return o.ApplyT(func(v *AspectTypeIamMember) AspectTypeIamMemberConditionPtrOutput { return v.Condition }).(AspectTypeIamMemberConditionPtrOutput)
}

// (Computed) The etag of the IAM policy.
func (o AspectTypeIamMemberOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v *AspectTypeIamMember) pulumi.StringOutput { return v.Etag }).(pulumi.StringOutput)
}

// The location where aspect type will be created in.
// Used to find the parent resource to bind the IAM policy to. If not specified,
// the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
// location is specified, it is taken from the provider configuration.
func (o AspectTypeIamMemberOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *AspectTypeIamMember) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
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
func (o AspectTypeIamMemberOutput) Member() pulumi.StringOutput {
	return o.ApplyT(func(v *AspectTypeIamMember) pulumi.StringOutput { return v.Member }).(pulumi.StringOutput)
}

// The ID of the project in which the resource belongs.
// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
func (o AspectTypeIamMemberOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *AspectTypeIamMember) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// The role that should be applied. Only one
// `dataplex.AspectTypeIamBinding` can be used per role. Note that custom roles must be of the format
// `[projects|organizations]/{parent-name}/roles/{role-name}`.
func (o AspectTypeIamMemberOutput) Role() pulumi.StringOutput {
	return o.ApplyT(func(v *AspectTypeIamMember) pulumi.StringOutput { return v.Role }).(pulumi.StringOutput)
}

type AspectTypeIamMemberArrayOutput struct{ *pulumi.OutputState }

func (AspectTypeIamMemberArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AspectTypeIamMember)(nil)).Elem()
}

func (o AspectTypeIamMemberArrayOutput) ToAspectTypeIamMemberArrayOutput() AspectTypeIamMemberArrayOutput {
	return o
}

func (o AspectTypeIamMemberArrayOutput) ToAspectTypeIamMemberArrayOutputWithContext(ctx context.Context) AspectTypeIamMemberArrayOutput {
	return o
}

func (o AspectTypeIamMemberArrayOutput) Index(i pulumi.IntInput) AspectTypeIamMemberOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AspectTypeIamMember {
		return vs[0].([]*AspectTypeIamMember)[vs[1].(int)]
	}).(AspectTypeIamMemberOutput)
}

type AspectTypeIamMemberMapOutput struct{ *pulumi.OutputState }

func (AspectTypeIamMemberMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AspectTypeIamMember)(nil)).Elem()
}

func (o AspectTypeIamMemberMapOutput) ToAspectTypeIamMemberMapOutput() AspectTypeIamMemberMapOutput {
	return o
}

func (o AspectTypeIamMemberMapOutput) ToAspectTypeIamMemberMapOutputWithContext(ctx context.Context) AspectTypeIamMemberMapOutput {
	return o
}

func (o AspectTypeIamMemberMapOutput) MapIndex(k pulumi.StringInput) AspectTypeIamMemberOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AspectTypeIamMember {
		return vs[0].(map[string]*AspectTypeIamMember)[vs[1].(string)]
	}).(AspectTypeIamMemberOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AspectTypeIamMemberInput)(nil)).Elem(), &AspectTypeIamMember{})
	pulumi.RegisterInputType(reflect.TypeOf((*AspectTypeIamMemberArrayInput)(nil)).Elem(), AspectTypeIamMemberArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AspectTypeIamMemberMapInput)(nil)).Elem(), AspectTypeIamMemberMap{})
	pulumi.RegisterOutputType(AspectTypeIamMemberOutput{})
	pulumi.RegisterOutputType(AspectTypeIamMemberArrayOutput{})
	pulumi.RegisterOutputType(AspectTypeIamMemberMapOutput{})
}
