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
// $ pulumi import gcp:securitycenter/v2OrganizationSourceIamBinding:V2OrganizationSourceIamBinding editor "organizations/{{organization}}/sources/{{source}} roles/viewer user:jane@example.com"
// ```
//
// IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
//
// ```sh
// $ pulumi import gcp:securitycenter/v2OrganizationSourceIamBinding:V2OrganizationSourceIamBinding editor "organizations/{{organization}}/sources/{{source}} roles/viewer"
// ```
//
// IAM policy imports use the identifier of the resource in question, e.g.
//
// ```sh
// $ pulumi import gcp:securitycenter/v2OrganizationSourceIamBinding:V2OrganizationSourceIamBinding editor organizations/{{organization}}/sources/{{source}}
// ```
//
// -> **Custom Roles** If you're importing a IAM resource with a custom role, make sure to use the
//
//	full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
type V2OrganizationSourceIamBinding struct {
	pulumi.CustomResourceState

	Condition V2OrganizationSourceIamBindingConditionPtrOutput `pulumi:"condition"`
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
	Members      pulumi.StringArrayOutput `pulumi:"members"`
	Organization pulumi.StringOutput      `pulumi:"organization"`
	// The role that should be applied. Only one
	// `securitycenter.V2OrganizationSourceIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringOutput `pulumi:"role"`
	// Used to find the parent resource to bind the IAM policy to
	Source pulumi.StringOutput `pulumi:"source"`
}

// NewV2OrganizationSourceIamBinding registers a new resource with the given unique name, arguments, and options.
func NewV2OrganizationSourceIamBinding(ctx *pulumi.Context,
	name string, args *V2OrganizationSourceIamBindingArgs, opts ...pulumi.ResourceOption) (*V2OrganizationSourceIamBinding, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Members == nil {
		return nil, errors.New("invalid value for required argument 'Members'")
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
	var resource V2OrganizationSourceIamBinding
	err := ctx.RegisterResource("gcp:securitycenter/v2OrganizationSourceIamBinding:V2OrganizationSourceIamBinding", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetV2OrganizationSourceIamBinding gets an existing V2OrganizationSourceIamBinding resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetV2OrganizationSourceIamBinding(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *V2OrganizationSourceIamBindingState, opts ...pulumi.ResourceOption) (*V2OrganizationSourceIamBinding, error) {
	var resource V2OrganizationSourceIamBinding
	err := ctx.ReadResource("gcp:securitycenter/v2OrganizationSourceIamBinding:V2OrganizationSourceIamBinding", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering V2OrganizationSourceIamBinding resources.
type v2organizationSourceIamBindingState struct {
	Condition *V2OrganizationSourceIamBindingCondition `pulumi:"condition"`
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
	Members      []string `pulumi:"members"`
	Organization *string  `pulumi:"organization"`
	// The role that should be applied. Only one
	// `securitycenter.V2OrganizationSourceIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role *string `pulumi:"role"`
	// Used to find the parent resource to bind the IAM policy to
	Source *string `pulumi:"source"`
}

type V2OrganizationSourceIamBindingState struct {
	Condition V2OrganizationSourceIamBindingConditionPtrInput
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
	Members      pulumi.StringArrayInput
	Organization pulumi.StringPtrInput
	// The role that should be applied. Only one
	// `securitycenter.V2OrganizationSourceIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringPtrInput
	// Used to find the parent resource to bind the IAM policy to
	Source pulumi.StringPtrInput
}

func (V2OrganizationSourceIamBindingState) ElementType() reflect.Type {
	return reflect.TypeOf((*v2organizationSourceIamBindingState)(nil)).Elem()
}

type v2organizationSourceIamBindingArgs struct {
	Condition *V2OrganizationSourceIamBindingCondition `pulumi:"condition"`
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
	Members      []string `pulumi:"members"`
	Organization string   `pulumi:"organization"`
	// The role that should be applied. Only one
	// `securitycenter.V2OrganizationSourceIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role string `pulumi:"role"`
	// Used to find the parent resource to bind the IAM policy to
	Source string `pulumi:"source"`
}

// The set of arguments for constructing a V2OrganizationSourceIamBinding resource.
type V2OrganizationSourceIamBindingArgs struct {
	Condition V2OrganizationSourceIamBindingConditionPtrInput
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
	Members      pulumi.StringArrayInput
	Organization pulumi.StringInput
	// The role that should be applied. Only one
	// `securitycenter.V2OrganizationSourceIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringInput
	// Used to find the parent resource to bind the IAM policy to
	Source pulumi.StringInput
}

func (V2OrganizationSourceIamBindingArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*v2organizationSourceIamBindingArgs)(nil)).Elem()
}

type V2OrganizationSourceIamBindingInput interface {
	pulumi.Input

	ToV2OrganizationSourceIamBindingOutput() V2OrganizationSourceIamBindingOutput
	ToV2OrganizationSourceIamBindingOutputWithContext(ctx context.Context) V2OrganizationSourceIamBindingOutput
}

func (*V2OrganizationSourceIamBinding) ElementType() reflect.Type {
	return reflect.TypeOf((**V2OrganizationSourceIamBinding)(nil)).Elem()
}

func (i *V2OrganizationSourceIamBinding) ToV2OrganizationSourceIamBindingOutput() V2OrganizationSourceIamBindingOutput {
	return i.ToV2OrganizationSourceIamBindingOutputWithContext(context.Background())
}

func (i *V2OrganizationSourceIamBinding) ToV2OrganizationSourceIamBindingOutputWithContext(ctx context.Context) V2OrganizationSourceIamBindingOutput {
	return pulumi.ToOutputWithContext(ctx, i).(V2OrganizationSourceIamBindingOutput)
}

// V2OrganizationSourceIamBindingArrayInput is an input type that accepts V2OrganizationSourceIamBindingArray and V2OrganizationSourceIamBindingArrayOutput values.
// You can construct a concrete instance of `V2OrganizationSourceIamBindingArrayInput` via:
//
//	V2OrganizationSourceIamBindingArray{ V2OrganizationSourceIamBindingArgs{...} }
type V2OrganizationSourceIamBindingArrayInput interface {
	pulumi.Input

	ToV2OrganizationSourceIamBindingArrayOutput() V2OrganizationSourceIamBindingArrayOutput
	ToV2OrganizationSourceIamBindingArrayOutputWithContext(context.Context) V2OrganizationSourceIamBindingArrayOutput
}

type V2OrganizationSourceIamBindingArray []V2OrganizationSourceIamBindingInput

func (V2OrganizationSourceIamBindingArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*V2OrganizationSourceIamBinding)(nil)).Elem()
}

func (i V2OrganizationSourceIamBindingArray) ToV2OrganizationSourceIamBindingArrayOutput() V2OrganizationSourceIamBindingArrayOutput {
	return i.ToV2OrganizationSourceIamBindingArrayOutputWithContext(context.Background())
}

func (i V2OrganizationSourceIamBindingArray) ToV2OrganizationSourceIamBindingArrayOutputWithContext(ctx context.Context) V2OrganizationSourceIamBindingArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(V2OrganizationSourceIamBindingArrayOutput)
}

// V2OrganizationSourceIamBindingMapInput is an input type that accepts V2OrganizationSourceIamBindingMap and V2OrganizationSourceIamBindingMapOutput values.
// You can construct a concrete instance of `V2OrganizationSourceIamBindingMapInput` via:
//
//	V2OrganizationSourceIamBindingMap{ "key": V2OrganizationSourceIamBindingArgs{...} }
type V2OrganizationSourceIamBindingMapInput interface {
	pulumi.Input

	ToV2OrganizationSourceIamBindingMapOutput() V2OrganizationSourceIamBindingMapOutput
	ToV2OrganizationSourceIamBindingMapOutputWithContext(context.Context) V2OrganizationSourceIamBindingMapOutput
}

type V2OrganizationSourceIamBindingMap map[string]V2OrganizationSourceIamBindingInput

func (V2OrganizationSourceIamBindingMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*V2OrganizationSourceIamBinding)(nil)).Elem()
}

func (i V2OrganizationSourceIamBindingMap) ToV2OrganizationSourceIamBindingMapOutput() V2OrganizationSourceIamBindingMapOutput {
	return i.ToV2OrganizationSourceIamBindingMapOutputWithContext(context.Background())
}

func (i V2OrganizationSourceIamBindingMap) ToV2OrganizationSourceIamBindingMapOutputWithContext(ctx context.Context) V2OrganizationSourceIamBindingMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(V2OrganizationSourceIamBindingMapOutput)
}

type V2OrganizationSourceIamBindingOutput struct{ *pulumi.OutputState }

func (V2OrganizationSourceIamBindingOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**V2OrganizationSourceIamBinding)(nil)).Elem()
}

func (o V2OrganizationSourceIamBindingOutput) ToV2OrganizationSourceIamBindingOutput() V2OrganizationSourceIamBindingOutput {
	return o
}

func (o V2OrganizationSourceIamBindingOutput) ToV2OrganizationSourceIamBindingOutputWithContext(ctx context.Context) V2OrganizationSourceIamBindingOutput {
	return o
}

func (o V2OrganizationSourceIamBindingOutput) Condition() V2OrganizationSourceIamBindingConditionPtrOutput {
	return o.ApplyT(func(v *V2OrganizationSourceIamBinding) V2OrganizationSourceIamBindingConditionPtrOutput {
		return v.Condition
	}).(V2OrganizationSourceIamBindingConditionPtrOutput)
}

// (Computed) The etag of the IAM policy.
func (o V2OrganizationSourceIamBindingOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v *V2OrganizationSourceIamBinding) pulumi.StringOutput { return v.Etag }).(pulumi.StringOutput)
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
func (o V2OrganizationSourceIamBindingOutput) Members() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *V2OrganizationSourceIamBinding) pulumi.StringArrayOutput { return v.Members }).(pulumi.StringArrayOutput)
}

func (o V2OrganizationSourceIamBindingOutput) Organization() pulumi.StringOutput {
	return o.ApplyT(func(v *V2OrganizationSourceIamBinding) pulumi.StringOutput { return v.Organization }).(pulumi.StringOutput)
}

// The role that should be applied. Only one
// `securitycenter.V2OrganizationSourceIamBinding` can be used per role. Note that custom roles must be of the format
// `[projects|organizations]/{parent-name}/roles/{role-name}`.
func (o V2OrganizationSourceIamBindingOutput) Role() pulumi.StringOutput {
	return o.ApplyT(func(v *V2OrganizationSourceIamBinding) pulumi.StringOutput { return v.Role }).(pulumi.StringOutput)
}

// Used to find the parent resource to bind the IAM policy to
func (o V2OrganizationSourceIamBindingOutput) Source() pulumi.StringOutput {
	return o.ApplyT(func(v *V2OrganizationSourceIamBinding) pulumi.StringOutput { return v.Source }).(pulumi.StringOutput)
}

type V2OrganizationSourceIamBindingArrayOutput struct{ *pulumi.OutputState }

func (V2OrganizationSourceIamBindingArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*V2OrganizationSourceIamBinding)(nil)).Elem()
}

func (o V2OrganizationSourceIamBindingArrayOutput) ToV2OrganizationSourceIamBindingArrayOutput() V2OrganizationSourceIamBindingArrayOutput {
	return o
}

func (o V2OrganizationSourceIamBindingArrayOutput) ToV2OrganizationSourceIamBindingArrayOutputWithContext(ctx context.Context) V2OrganizationSourceIamBindingArrayOutput {
	return o
}

func (o V2OrganizationSourceIamBindingArrayOutput) Index(i pulumi.IntInput) V2OrganizationSourceIamBindingOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *V2OrganizationSourceIamBinding {
		return vs[0].([]*V2OrganizationSourceIamBinding)[vs[1].(int)]
	}).(V2OrganizationSourceIamBindingOutput)
}

type V2OrganizationSourceIamBindingMapOutput struct{ *pulumi.OutputState }

func (V2OrganizationSourceIamBindingMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*V2OrganizationSourceIamBinding)(nil)).Elem()
}

func (o V2OrganizationSourceIamBindingMapOutput) ToV2OrganizationSourceIamBindingMapOutput() V2OrganizationSourceIamBindingMapOutput {
	return o
}

func (o V2OrganizationSourceIamBindingMapOutput) ToV2OrganizationSourceIamBindingMapOutputWithContext(ctx context.Context) V2OrganizationSourceIamBindingMapOutput {
	return o
}

func (o V2OrganizationSourceIamBindingMapOutput) MapIndex(k pulumi.StringInput) V2OrganizationSourceIamBindingOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *V2OrganizationSourceIamBinding {
		return vs[0].(map[string]*V2OrganizationSourceIamBinding)[vs[1].(string)]
	}).(V2OrganizationSourceIamBindingOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*V2OrganizationSourceIamBindingInput)(nil)).Elem(), &V2OrganizationSourceIamBinding{})
	pulumi.RegisterInputType(reflect.TypeOf((*V2OrganizationSourceIamBindingArrayInput)(nil)).Elem(), V2OrganizationSourceIamBindingArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*V2OrganizationSourceIamBindingMapInput)(nil)).Elem(), V2OrganizationSourceIamBindingMap{})
	pulumi.RegisterOutputType(V2OrganizationSourceIamBindingOutput{})
	pulumi.RegisterOutputType(V2OrganizationSourceIamBindingArrayOutput{})
	pulumi.RegisterOutputType(V2OrganizationSourceIamBindingMapOutput{})
}
