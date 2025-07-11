// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package securitycenter

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Three different resources help you manage your IAM policy for Security Command Center (SCC) v2 API OrganizationSource. Each of these resources serves a different use case:
//
// * `securitycenter.V2OrganizationSourceIamPolicy`: Authoritative. Sets the IAM policy for the organizationsource and replaces any existing policy already attached.
// * `securitycenter.V2OrganizationSourceIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the organizationsource are preserved.
// * `securitycenter.V2OrganizationSourceIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the organizationsource are preserved.
//
// # A data source can be used to retrieve policy data in advent you do not need creation
//
// * `securitycenter.V2OrganizationSourceIamPolicy`: Retrieves the IAM policy for the organizationsource
//
// > **Note:** `securitycenter.V2OrganizationSourceIamPolicy` **cannot** be used in conjunction with `securitycenter.V2OrganizationSourceIamBinding` and `securitycenter.V2OrganizationSourceIamMember` or they will fight over what your policy should be.
//
// > **Note:** `securitycenter.V2OrganizationSourceIamBinding` resources **can be** used in conjunction with `securitycenter.V2OrganizationSourceIamMember` resources **only if** they do not grant privilege to the same role.
//
// ## securitycenter.V2OrganizationSourceIamPolicy
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/organizations"
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/securitycenter"
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
//			_, err = securitycenter.NewV2OrganizationSourceIamPolicy(ctx, "policy", &securitycenter.V2OrganizationSourceIamPolicyArgs{
//				Source:     pulumi.Any(customSource.Name),
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
// ## securitycenter.V2OrganizationSourceIamBinding
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/securitycenter"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := securitycenter.NewV2OrganizationSourceIamBinding(ctx, "binding", &securitycenter.V2OrganizationSourceIamBindingArgs{
//				Source: pulumi.Any(customSource.Name),
//				Role:   pulumi.String("roles/viewer"),
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
// ## securitycenter.V2OrganizationSourceIamMember
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/securitycenter"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := securitycenter.NewV2OrganizationSourceIamMember(ctx, "member", &securitycenter.V2OrganizationSourceIamMemberArgs{
//				Source: pulumi.Any(customSource.Name),
//				Role:   pulumi.String("roles/viewer"),
//				Member: pulumi.String("user:jane@example.com"),
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
// ## > **Custom Roles** If you're importing a IAM resource with a custom role, make sure to use the
//
// full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
// ---
//
// # IAM policy for Security Command Center (SCC) v2 API OrganizationSource
// Three different resources help you manage your IAM policy for Security Command Center (SCC) v2 API OrganizationSource. Each of these resources serves a different use case:
//
// * `securitycenter.V2OrganizationSourceIamPolicy`: Authoritative. Sets the IAM policy for the organizationsource and replaces any existing policy already attached.
// * `securitycenter.V2OrganizationSourceIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the organizationsource are preserved.
// * `securitycenter.V2OrganizationSourceIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the organizationsource are preserved.
//
// # A data source can be used to retrieve policy data in advent you do not need creation
//
// * `securitycenter.V2OrganizationSourceIamPolicy`: Retrieves the IAM policy for the organizationsource
//
// > **Note:** `securitycenter.V2OrganizationSourceIamPolicy` **cannot** be used in conjunction with `securitycenter.V2OrganizationSourceIamBinding` and `securitycenter.V2OrganizationSourceIamMember` or they will fight over what your policy should be.
//
// > **Note:** `securitycenter.V2OrganizationSourceIamBinding` resources **can be** used in conjunction with `securitycenter.V2OrganizationSourceIamMember` resources **only if** they do not grant privilege to the same role.
//
// ## securitycenter.V2OrganizationSourceIamPolicy
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/organizations"
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/securitycenter"
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
//			_, err = securitycenter.NewV2OrganizationSourceIamPolicy(ctx, "policy", &securitycenter.V2OrganizationSourceIamPolicyArgs{
//				Source:     pulumi.Any(customSource.Name),
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
// ## securitycenter.V2OrganizationSourceIamBinding
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/securitycenter"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := securitycenter.NewV2OrganizationSourceIamBinding(ctx, "binding", &securitycenter.V2OrganizationSourceIamBindingArgs{
//				Source: pulumi.Any(customSource.Name),
//				Role:   pulumi.String("roles/viewer"),
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
// ## securitycenter.V2OrganizationSourceIamMember
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/securitycenter"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := securitycenter.NewV2OrganizationSourceIamMember(ctx, "member", &securitycenter.V2OrganizationSourceIamMemberArgs{
//				Source: pulumi.Any(customSource.Name),
//				Role:   pulumi.String("roles/viewer"),
//				Member: pulumi.String("user:jane@example.com"),
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
// * organizations/{{organization}}/sources/{{source}}
//
// * {{organization}}/{{source}}
//
// * {{source}}
//
// Any variables not passed in the import command will be taken from the provider configuration.
//
// Security Command Center (SCC) v2 API organizationsource IAM resources can be imported using the resource identifiers, role, and member.
//
// IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
//
// ```sh
// $ pulumi import gcp:securitycenter/v2OrganizationSourceIamMember:V2OrganizationSourceIamMember editor "organizations/{{organization}}/sources/{{source}} roles/viewer user:jane@example.com"
// ```
//
// IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
//
// ```sh
// $ pulumi import gcp:securitycenter/v2OrganizationSourceIamMember:V2OrganizationSourceIamMember editor "organizations/{{organization}}/sources/{{source}} roles/viewer"
// ```
//
// IAM policy imports use the identifier of the resource in question, e.g.
//
// ```sh
// $ pulumi import gcp:securitycenter/v2OrganizationSourceIamMember:V2OrganizationSourceIamMember editor organizations/{{organization}}/sources/{{source}}
// ```
//
// -> **Custom Roles** If you're importing a IAM resource with a custom role, make sure to use the
//
//	full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
type V2OrganizationSourceIamMember struct {
	pulumi.CustomResourceState

	Condition V2OrganizationSourceIamMemberConditionPtrOutput `pulumi:"condition"`
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
	Member       pulumi.StringOutput `pulumi:"member"`
	Organization pulumi.StringOutput `pulumi:"organization"`
	// The role that should be applied. Only one
	// `securitycenter.V2OrganizationSourceIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringOutput `pulumi:"role"`
	// Used to find the parent resource to bind the IAM policy to
	Source pulumi.StringOutput `pulumi:"source"`
}

// NewV2OrganizationSourceIamMember registers a new resource with the given unique name, arguments, and options.
func NewV2OrganizationSourceIamMember(ctx *pulumi.Context,
	name string, args *V2OrganizationSourceIamMemberArgs, opts ...pulumi.ResourceOption) (*V2OrganizationSourceIamMember, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Member == nil {
		return nil, errors.New("invalid value for required argument 'Member'")
	}
	if args.Organization == nil {
		return nil, errors.New("invalid value for required argument 'Organization'")
	}
	if args.Role == nil {
		return nil, errors.New("invalid value for required argument 'Role'")
	}
	if args.Source == nil {
		return nil, errors.New("invalid value for required argument 'Source'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource V2OrganizationSourceIamMember
	err := ctx.RegisterResource("gcp:securitycenter/v2OrganizationSourceIamMember:V2OrganizationSourceIamMember", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetV2OrganizationSourceIamMember gets an existing V2OrganizationSourceIamMember resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetV2OrganizationSourceIamMember(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *V2OrganizationSourceIamMemberState, opts ...pulumi.ResourceOption) (*V2OrganizationSourceIamMember, error) {
	var resource V2OrganizationSourceIamMember
	err := ctx.ReadResource("gcp:securitycenter/v2OrganizationSourceIamMember:V2OrganizationSourceIamMember", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering V2OrganizationSourceIamMember resources.
type v2organizationSourceIamMemberState struct {
	Condition *V2OrganizationSourceIamMemberCondition `pulumi:"condition"`
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
	Member       *string `pulumi:"member"`
	Organization *string `pulumi:"organization"`
	// The role that should be applied. Only one
	// `securitycenter.V2OrganizationSourceIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role *string `pulumi:"role"`
	// Used to find the parent resource to bind the IAM policy to
	Source *string `pulumi:"source"`
}

type V2OrganizationSourceIamMemberState struct {
	Condition V2OrganizationSourceIamMemberConditionPtrInput
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
	Member       pulumi.StringPtrInput
	Organization pulumi.StringPtrInput
	// The role that should be applied. Only one
	// `securitycenter.V2OrganizationSourceIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringPtrInput
	// Used to find the parent resource to bind the IAM policy to
	Source pulumi.StringPtrInput
}

func (V2OrganizationSourceIamMemberState) ElementType() reflect.Type {
	return reflect.TypeOf((*v2organizationSourceIamMemberState)(nil)).Elem()
}

type v2organizationSourceIamMemberArgs struct {
	Condition *V2OrganizationSourceIamMemberCondition `pulumi:"condition"`
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
	Member       string `pulumi:"member"`
	Organization string `pulumi:"organization"`
	// The role that should be applied. Only one
	// `securitycenter.V2OrganizationSourceIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role string `pulumi:"role"`
	// Used to find the parent resource to bind the IAM policy to
	Source string `pulumi:"source"`
}

// The set of arguments for constructing a V2OrganizationSourceIamMember resource.
type V2OrganizationSourceIamMemberArgs struct {
	Condition V2OrganizationSourceIamMemberConditionPtrInput
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
	Member       pulumi.StringInput
	Organization pulumi.StringInput
	// The role that should be applied. Only one
	// `securitycenter.V2OrganizationSourceIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringInput
	// Used to find the parent resource to bind the IAM policy to
	Source pulumi.StringInput
}

func (V2OrganizationSourceIamMemberArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*v2organizationSourceIamMemberArgs)(nil)).Elem()
}

type V2OrganizationSourceIamMemberInput interface {
	pulumi.Input

	ToV2OrganizationSourceIamMemberOutput() V2OrganizationSourceIamMemberOutput
	ToV2OrganizationSourceIamMemberOutputWithContext(ctx context.Context) V2OrganizationSourceIamMemberOutput
}

func (*V2OrganizationSourceIamMember) ElementType() reflect.Type {
	return reflect.TypeOf((**V2OrganizationSourceIamMember)(nil)).Elem()
}

func (i *V2OrganizationSourceIamMember) ToV2OrganizationSourceIamMemberOutput() V2OrganizationSourceIamMemberOutput {
	return i.ToV2OrganizationSourceIamMemberOutputWithContext(context.Background())
}

func (i *V2OrganizationSourceIamMember) ToV2OrganizationSourceIamMemberOutputWithContext(ctx context.Context) V2OrganizationSourceIamMemberOutput {
	return pulumi.ToOutputWithContext(ctx, i).(V2OrganizationSourceIamMemberOutput)
}

// V2OrganizationSourceIamMemberArrayInput is an input type that accepts V2OrganizationSourceIamMemberArray and V2OrganizationSourceIamMemberArrayOutput values.
// You can construct a concrete instance of `V2OrganizationSourceIamMemberArrayInput` via:
//
//	V2OrganizationSourceIamMemberArray{ V2OrganizationSourceIamMemberArgs{...} }
type V2OrganizationSourceIamMemberArrayInput interface {
	pulumi.Input

	ToV2OrganizationSourceIamMemberArrayOutput() V2OrganizationSourceIamMemberArrayOutput
	ToV2OrganizationSourceIamMemberArrayOutputWithContext(context.Context) V2OrganizationSourceIamMemberArrayOutput
}

type V2OrganizationSourceIamMemberArray []V2OrganizationSourceIamMemberInput

func (V2OrganizationSourceIamMemberArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*V2OrganizationSourceIamMember)(nil)).Elem()
}

func (i V2OrganizationSourceIamMemberArray) ToV2OrganizationSourceIamMemberArrayOutput() V2OrganizationSourceIamMemberArrayOutput {
	return i.ToV2OrganizationSourceIamMemberArrayOutputWithContext(context.Background())
}

func (i V2OrganizationSourceIamMemberArray) ToV2OrganizationSourceIamMemberArrayOutputWithContext(ctx context.Context) V2OrganizationSourceIamMemberArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(V2OrganizationSourceIamMemberArrayOutput)
}

// V2OrganizationSourceIamMemberMapInput is an input type that accepts V2OrganizationSourceIamMemberMap and V2OrganizationSourceIamMemberMapOutput values.
// You can construct a concrete instance of `V2OrganizationSourceIamMemberMapInput` via:
//
//	V2OrganizationSourceIamMemberMap{ "key": V2OrganizationSourceIamMemberArgs{...} }
type V2OrganizationSourceIamMemberMapInput interface {
	pulumi.Input

	ToV2OrganizationSourceIamMemberMapOutput() V2OrganizationSourceIamMemberMapOutput
	ToV2OrganizationSourceIamMemberMapOutputWithContext(context.Context) V2OrganizationSourceIamMemberMapOutput
}

type V2OrganizationSourceIamMemberMap map[string]V2OrganizationSourceIamMemberInput

func (V2OrganizationSourceIamMemberMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*V2OrganizationSourceIamMember)(nil)).Elem()
}

func (i V2OrganizationSourceIamMemberMap) ToV2OrganizationSourceIamMemberMapOutput() V2OrganizationSourceIamMemberMapOutput {
	return i.ToV2OrganizationSourceIamMemberMapOutputWithContext(context.Background())
}

func (i V2OrganizationSourceIamMemberMap) ToV2OrganizationSourceIamMemberMapOutputWithContext(ctx context.Context) V2OrganizationSourceIamMemberMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(V2OrganizationSourceIamMemberMapOutput)
}

type V2OrganizationSourceIamMemberOutput struct{ *pulumi.OutputState }

func (V2OrganizationSourceIamMemberOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**V2OrganizationSourceIamMember)(nil)).Elem()
}

func (o V2OrganizationSourceIamMemberOutput) ToV2OrganizationSourceIamMemberOutput() V2OrganizationSourceIamMemberOutput {
	return o
}

func (o V2OrganizationSourceIamMemberOutput) ToV2OrganizationSourceIamMemberOutputWithContext(ctx context.Context) V2OrganizationSourceIamMemberOutput {
	return o
}

func (o V2OrganizationSourceIamMemberOutput) Condition() V2OrganizationSourceIamMemberConditionPtrOutput {
	return o.ApplyT(func(v *V2OrganizationSourceIamMember) V2OrganizationSourceIamMemberConditionPtrOutput {
		return v.Condition
	}).(V2OrganizationSourceIamMemberConditionPtrOutput)
}

// (Computed) The etag of the IAM policy.
func (o V2OrganizationSourceIamMemberOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v *V2OrganizationSourceIamMember) pulumi.StringOutput { return v.Etag }).(pulumi.StringOutput)
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
func (o V2OrganizationSourceIamMemberOutput) Member() pulumi.StringOutput {
	return o.ApplyT(func(v *V2OrganizationSourceIamMember) pulumi.StringOutput { return v.Member }).(pulumi.StringOutput)
}

func (o V2OrganizationSourceIamMemberOutput) Organization() pulumi.StringOutput {
	return o.ApplyT(func(v *V2OrganizationSourceIamMember) pulumi.StringOutput { return v.Organization }).(pulumi.StringOutput)
}

// The role that should be applied. Only one
// `securitycenter.V2OrganizationSourceIamBinding` can be used per role. Note that custom roles must be of the format
// `[projects|organizations]/{parent-name}/roles/{role-name}`.
func (o V2OrganizationSourceIamMemberOutput) Role() pulumi.StringOutput {
	return o.ApplyT(func(v *V2OrganizationSourceIamMember) pulumi.StringOutput { return v.Role }).(pulumi.StringOutput)
}

// Used to find the parent resource to bind the IAM policy to
func (o V2OrganizationSourceIamMemberOutput) Source() pulumi.StringOutput {
	return o.ApplyT(func(v *V2OrganizationSourceIamMember) pulumi.StringOutput { return v.Source }).(pulumi.StringOutput)
}

type V2OrganizationSourceIamMemberArrayOutput struct{ *pulumi.OutputState }

func (V2OrganizationSourceIamMemberArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*V2OrganizationSourceIamMember)(nil)).Elem()
}

func (o V2OrganizationSourceIamMemberArrayOutput) ToV2OrganizationSourceIamMemberArrayOutput() V2OrganizationSourceIamMemberArrayOutput {
	return o
}

func (o V2OrganizationSourceIamMemberArrayOutput) ToV2OrganizationSourceIamMemberArrayOutputWithContext(ctx context.Context) V2OrganizationSourceIamMemberArrayOutput {
	return o
}

func (o V2OrganizationSourceIamMemberArrayOutput) Index(i pulumi.IntInput) V2OrganizationSourceIamMemberOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *V2OrganizationSourceIamMember {
		return vs[0].([]*V2OrganizationSourceIamMember)[vs[1].(int)]
	}).(V2OrganizationSourceIamMemberOutput)
}

type V2OrganizationSourceIamMemberMapOutput struct{ *pulumi.OutputState }

func (V2OrganizationSourceIamMemberMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*V2OrganizationSourceIamMember)(nil)).Elem()
}

func (o V2OrganizationSourceIamMemberMapOutput) ToV2OrganizationSourceIamMemberMapOutput() V2OrganizationSourceIamMemberMapOutput {
	return o
}

func (o V2OrganizationSourceIamMemberMapOutput) ToV2OrganizationSourceIamMemberMapOutputWithContext(ctx context.Context) V2OrganizationSourceIamMemberMapOutput {
	return o
}

func (o V2OrganizationSourceIamMemberMapOutput) MapIndex(k pulumi.StringInput) V2OrganizationSourceIamMemberOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *V2OrganizationSourceIamMember {
		return vs[0].(map[string]*V2OrganizationSourceIamMember)[vs[1].(string)]
	}).(V2OrganizationSourceIamMemberOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*V2OrganizationSourceIamMemberInput)(nil)).Elem(), &V2OrganizationSourceIamMember{})
	pulumi.RegisterInputType(reflect.TypeOf((*V2OrganizationSourceIamMemberArrayInput)(nil)).Elem(), V2OrganizationSourceIamMemberArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*V2OrganizationSourceIamMemberMapInput)(nil)).Elem(), V2OrganizationSourceIamMemberMap{})
	pulumi.RegisterOutputType(V2OrganizationSourceIamMemberOutput{})
	pulumi.RegisterOutputType(V2OrganizationSourceIamMemberArrayOutput{})
	pulumi.RegisterOutputType(V2OrganizationSourceIamMemberMapOutput{})
}
