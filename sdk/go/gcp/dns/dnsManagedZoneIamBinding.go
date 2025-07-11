// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dns

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Three different resources help you manage your IAM policy for Cloud DNS ManagedZone. Each of these resources serves a different use case:
//
// * `dns.DnsManagedZoneIamPolicy`: Authoritative. Sets the IAM policy for the managedzone and replaces any existing policy already attached.
// * `dns.DnsManagedZoneIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the managedzone are preserved.
// * `dns.DnsManagedZoneIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the managedzone are preserved.
//
// # A data source can be used to retrieve policy data in advent you do not need creation
//
// * `dns.DnsManagedZoneIamPolicy`: Retrieves the IAM policy for the managedzone
//
// > **Note:** `dns.DnsManagedZoneIamPolicy` **cannot** be used in conjunction with `dns.DnsManagedZoneIamBinding` and `dns.DnsManagedZoneIamMember` or they will fight over what your policy should be.
//
// > **Note:** `dns.DnsManagedZoneIamBinding` resources **can be** used in conjunction with `dns.DnsManagedZoneIamMember` resources **only if** they do not grant privilege to the same role.
//
// ## dns.DnsManagedZoneIamPolicy
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/dns"
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
//			_, err = dns.NewDnsManagedZoneIamPolicy(ctx, "policy", &dns.DnsManagedZoneIamPolicyArgs{
//				Project:     pulumi.Any(_default.Project),
//				ManagedZone: pulumi.Any(_default.Name),
//				PolicyData:  pulumi.String(admin.PolicyData),
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
// ## dns.DnsManagedZoneIamBinding
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/dns"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := dns.NewDnsManagedZoneIamBinding(ctx, "binding", &dns.DnsManagedZoneIamBindingArgs{
//				Project:     pulumi.Any(_default.Project),
//				ManagedZone: pulumi.Any(_default.Name),
//				Role:        pulumi.String("roles/viewer"),
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
// ## dns.DnsManagedZoneIamMember
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/dns"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := dns.NewDnsManagedZoneIamMember(ctx, "member", &dns.DnsManagedZoneIamMemberArgs{
//				Project:     pulumi.Any(_default.Project),
//				ManagedZone: pulumi.Any(_default.Name),
//				Role:        pulumi.String("roles/viewer"),
//				Member:      pulumi.String("user:jane@example.com"),
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
// # IAM policy for Cloud DNS ManagedZone
// Three different resources help you manage your IAM policy for Cloud DNS ManagedZone. Each of these resources serves a different use case:
//
// * `dns.DnsManagedZoneIamPolicy`: Authoritative. Sets the IAM policy for the managedzone and replaces any existing policy already attached.
// * `dns.DnsManagedZoneIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the managedzone are preserved.
// * `dns.DnsManagedZoneIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the managedzone are preserved.
//
// # A data source can be used to retrieve policy data in advent you do not need creation
//
// * `dns.DnsManagedZoneIamPolicy`: Retrieves the IAM policy for the managedzone
//
// > **Note:** `dns.DnsManagedZoneIamPolicy` **cannot** be used in conjunction with `dns.DnsManagedZoneIamBinding` and `dns.DnsManagedZoneIamMember` or they will fight over what your policy should be.
//
// > **Note:** `dns.DnsManagedZoneIamBinding` resources **can be** used in conjunction with `dns.DnsManagedZoneIamMember` resources **only if** they do not grant privilege to the same role.
//
// ## dns.DnsManagedZoneIamPolicy
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/dns"
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
//			_, err = dns.NewDnsManagedZoneIamPolicy(ctx, "policy", &dns.DnsManagedZoneIamPolicyArgs{
//				Project:     pulumi.Any(_default.Project),
//				ManagedZone: pulumi.Any(_default.Name),
//				PolicyData:  pulumi.String(admin.PolicyData),
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
// ## dns.DnsManagedZoneIamBinding
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/dns"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := dns.NewDnsManagedZoneIamBinding(ctx, "binding", &dns.DnsManagedZoneIamBindingArgs{
//				Project:     pulumi.Any(_default.Project),
//				ManagedZone: pulumi.Any(_default.Name),
//				Role:        pulumi.String("roles/viewer"),
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
// ## dns.DnsManagedZoneIamMember
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/dns"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := dns.NewDnsManagedZoneIamMember(ctx, "member", &dns.DnsManagedZoneIamMemberArgs{
//				Project:     pulumi.Any(_default.Project),
//				ManagedZone: pulumi.Any(_default.Name),
//				Role:        pulumi.String("roles/viewer"),
//				Member:      pulumi.String("user:jane@example.com"),
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
// * projects/{{project}}/managedZones/{{managed_zone}}
//
// * {{project}}/{{managed_zone}}
//
// * {{managed_zone}}
//
// Any variables not passed in the import command will be taken from the provider configuration.
//
// Cloud DNS managedzone IAM resources can be imported using the resource identifiers, role, and member.
//
// IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
//
// ```sh
// $ pulumi import gcp:dns/dnsManagedZoneIamBinding:DnsManagedZoneIamBinding editor "projects/{{project}}/managedZones/{{managed_zone}} roles/viewer user:jane@example.com"
// ```
//
// IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
//
// ```sh
// $ pulumi import gcp:dns/dnsManagedZoneIamBinding:DnsManagedZoneIamBinding editor "projects/{{project}}/managedZones/{{managed_zone}} roles/viewer"
// ```
//
// IAM policy imports use the identifier of the resource in question, e.g.
//
// ```sh
// $ pulumi import gcp:dns/dnsManagedZoneIamBinding:DnsManagedZoneIamBinding editor projects/{{project}}/managedZones/{{managed_zone}}
// ```
//
// -> **Custom Roles** If you're importing a IAM resource with a custom role, make sure to use the
//
//	full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
type DnsManagedZoneIamBinding struct {
	pulumi.CustomResourceState

	Condition DnsManagedZoneIamBindingConditionPtrOutput `pulumi:"condition"`
	// (Computed) The etag of the IAM policy.
	Etag pulumi.StringOutput `pulumi:"etag"`
	// Used to find the parent resource to bind the IAM policy to
	ManagedZone pulumi.StringOutput `pulumi:"managedZone"`
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
	// `dns.DnsManagedZoneIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringOutput `pulumi:"role"`
}

// NewDnsManagedZoneIamBinding registers a new resource with the given unique name, arguments, and options.
func NewDnsManagedZoneIamBinding(ctx *pulumi.Context,
	name string, args *DnsManagedZoneIamBindingArgs, opts ...pulumi.ResourceOption) (*DnsManagedZoneIamBinding, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ManagedZone == nil {
		return nil, errors.New("invalid value for required argument 'ManagedZone'")
	}
	if args.Members == nil {
		return nil, errors.New("invalid value for required argument 'Members'")
	}
	if args.Role == nil {
		return nil, errors.New("invalid value for required argument 'Role'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource DnsManagedZoneIamBinding
	err := ctx.RegisterResource("gcp:dns/dnsManagedZoneIamBinding:DnsManagedZoneIamBinding", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDnsManagedZoneIamBinding gets an existing DnsManagedZoneIamBinding resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDnsManagedZoneIamBinding(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DnsManagedZoneIamBindingState, opts ...pulumi.ResourceOption) (*DnsManagedZoneIamBinding, error) {
	var resource DnsManagedZoneIamBinding
	err := ctx.ReadResource("gcp:dns/dnsManagedZoneIamBinding:DnsManagedZoneIamBinding", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DnsManagedZoneIamBinding resources.
type dnsManagedZoneIamBindingState struct {
	Condition *DnsManagedZoneIamBindingCondition `pulumi:"condition"`
	// (Computed) The etag of the IAM policy.
	Etag *string `pulumi:"etag"`
	// Used to find the parent resource to bind the IAM policy to
	ManagedZone *string `pulumi:"managedZone"`
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
	// `dns.DnsManagedZoneIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role *string `pulumi:"role"`
}

type DnsManagedZoneIamBindingState struct {
	Condition DnsManagedZoneIamBindingConditionPtrInput
	// (Computed) The etag of the IAM policy.
	Etag pulumi.StringPtrInput
	// Used to find the parent resource to bind the IAM policy to
	ManagedZone pulumi.StringPtrInput
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
	// `dns.DnsManagedZoneIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringPtrInput
}

func (DnsManagedZoneIamBindingState) ElementType() reflect.Type {
	return reflect.TypeOf((*dnsManagedZoneIamBindingState)(nil)).Elem()
}

type dnsManagedZoneIamBindingArgs struct {
	Condition *DnsManagedZoneIamBindingCondition `pulumi:"condition"`
	// Used to find the parent resource to bind the IAM policy to
	ManagedZone string `pulumi:"managedZone"`
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
	// `dns.DnsManagedZoneIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role string `pulumi:"role"`
}

// The set of arguments for constructing a DnsManagedZoneIamBinding resource.
type DnsManagedZoneIamBindingArgs struct {
	Condition DnsManagedZoneIamBindingConditionPtrInput
	// Used to find the parent resource to bind the IAM policy to
	ManagedZone pulumi.StringInput
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
	// `dns.DnsManagedZoneIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringInput
}

func (DnsManagedZoneIamBindingArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*dnsManagedZoneIamBindingArgs)(nil)).Elem()
}

type DnsManagedZoneIamBindingInput interface {
	pulumi.Input

	ToDnsManagedZoneIamBindingOutput() DnsManagedZoneIamBindingOutput
	ToDnsManagedZoneIamBindingOutputWithContext(ctx context.Context) DnsManagedZoneIamBindingOutput
}

func (*DnsManagedZoneIamBinding) ElementType() reflect.Type {
	return reflect.TypeOf((**DnsManagedZoneIamBinding)(nil)).Elem()
}

func (i *DnsManagedZoneIamBinding) ToDnsManagedZoneIamBindingOutput() DnsManagedZoneIamBindingOutput {
	return i.ToDnsManagedZoneIamBindingOutputWithContext(context.Background())
}

func (i *DnsManagedZoneIamBinding) ToDnsManagedZoneIamBindingOutputWithContext(ctx context.Context) DnsManagedZoneIamBindingOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DnsManagedZoneIamBindingOutput)
}

// DnsManagedZoneIamBindingArrayInput is an input type that accepts DnsManagedZoneIamBindingArray and DnsManagedZoneIamBindingArrayOutput values.
// You can construct a concrete instance of `DnsManagedZoneIamBindingArrayInput` via:
//
//	DnsManagedZoneIamBindingArray{ DnsManagedZoneIamBindingArgs{...} }
type DnsManagedZoneIamBindingArrayInput interface {
	pulumi.Input

	ToDnsManagedZoneIamBindingArrayOutput() DnsManagedZoneIamBindingArrayOutput
	ToDnsManagedZoneIamBindingArrayOutputWithContext(context.Context) DnsManagedZoneIamBindingArrayOutput
}

type DnsManagedZoneIamBindingArray []DnsManagedZoneIamBindingInput

func (DnsManagedZoneIamBindingArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DnsManagedZoneIamBinding)(nil)).Elem()
}

func (i DnsManagedZoneIamBindingArray) ToDnsManagedZoneIamBindingArrayOutput() DnsManagedZoneIamBindingArrayOutput {
	return i.ToDnsManagedZoneIamBindingArrayOutputWithContext(context.Background())
}

func (i DnsManagedZoneIamBindingArray) ToDnsManagedZoneIamBindingArrayOutputWithContext(ctx context.Context) DnsManagedZoneIamBindingArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DnsManagedZoneIamBindingArrayOutput)
}

// DnsManagedZoneIamBindingMapInput is an input type that accepts DnsManagedZoneIamBindingMap and DnsManagedZoneIamBindingMapOutput values.
// You can construct a concrete instance of `DnsManagedZoneIamBindingMapInput` via:
//
//	DnsManagedZoneIamBindingMap{ "key": DnsManagedZoneIamBindingArgs{...} }
type DnsManagedZoneIamBindingMapInput interface {
	pulumi.Input

	ToDnsManagedZoneIamBindingMapOutput() DnsManagedZoneIamBindingMapOutput
	ToDnsManagedZoneIamBindingMapOutputWithContext(context.Context) DnsManagedZoneIamBindingMapOutput
}

type DnsManagedZoneIamBindingMap map[string]DnsManagedZoneIamBindingInput

func (DnsManagedZoneIamBindingMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DnsManagedZoneIamBinding)(nil)).Elem()
}

func (i DnsManagedZoneIamBindingMap) ToDnsManagedZoneIamBindingMapOutput() DnsManagedZoneIamBindingMapOutput {
	return i.ToDnsManagedZoneIamBindingMapOutputWithContext(context.Background())
}

func (i DnsManagedZoneIamBindingMap) ToDnsManagedZoneIamBindingMapOutputWithContext(ctx context.Context) DnsManagedZoneIamBindingMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DnsManagedZoneIamBindingMapOutput)
}

type DnsManagedZoneIamBindingOutput struct{ *pulumi.OutputState }

func (DnsManagedZoneIamBindingOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DnsManagedZoneIamBinding)(nil)).Elem()
}

func (o DnsManagedZoneIamBindingOutput) ToDnsManagedZoneIamBindingOutput() DnsManagedZoneIamBindingOutput {
	return o
}

func (o DnsManagedZoneIamBindingOutput) ToDnsManagedZoneIamBindingOutputWithContext(ctx context.Context) DnsManagedZoneIamBindingOutput {
	return o
}

func (o DnsManagedZoneIamBindingOutput) Condition() DnsManagedZoneIamBindingConditionPtrOutput {
	return o.ApplyT(func(v *DnsManagedZoneIamBinding) DnsManagedZoneIamBindingConditionPtrOutput { return v.Condition }).(DnsManagedZoneIamBindingConditionPtrOutput)
}

// (Computed) The etag of the IAM policy.
func (o DnsManagedZoneIamBindingOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v *DnsManagedZoneIamBinding) pulumi.StringOutput { return v.Etag }).(pulumi.StringOutput)
}

// Used to find the parent resource to bind the IAM policy to
func (o DnsManagedZoneIamBindingOutput) ManagedZone() pulumi.StringOutput {
	return o.ApplyT(func(v *DnsManagedZoneIamBinding) pulumi.StringOutput { return v.ManagedZone }).(pulumi.StringOutput)
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
func (o DnsManagedZoneIamBindingOutput) Members() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *DnsManagedZoneIamBinding) pulumi.StringArrayOutput { return v.Members }).(pulumi.StringArrayOutput)
}

// The ID of the project in which the resource belongs.
// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
func (o DnsManagedZoneIamBindingOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *DnsManagedZoneIamBinding) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// The role that should be applied. Only one
// `dns.DnsManagedZoneIamBinding` can be used per role. Note that custom roles must be of the format
// `[projects|organizations]/{parent-name}/roles/{role-name}`.
func (o DnsManagedZoneIamBindingOutput) Role() pulumi.StringOutput {
	return o.ApplyT(func(v *DnsManagedZoneIamBinding) pulumi.StringOutput { return v.Role }).(pulumi.StringOutput)
}

type DnsManagedZoneIamBindingArrayOutput struct{ *pulumi.OutputState }

func (DnsManagedZoneIamBindingArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DnsManagedZoneIamBinding)(nil)).Elem()
}

func (o DnsManagedZoneIamBindingArrayOutput) ToDnsManagedZoneIamBindingArrayOutput() DnsManagedZoneIamBindingArrayOutput {
	return o
}

func (o DnsManagedZoneIamBindingArrayOutput) ToDnsManagedZoneIamBindingArrayOutputWithContext(ctx context.Context) DnsManagedZoneIamBindingArrayOutput {
	return o
}

func (o DnsManagedZoneIamBindingArrayOutput) Index(i pulumi.IntInput) DnsManagedZoneIamBindingOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DnsManagedZoneIamBinding {
		return vs[0].([]*DnsManagedZoneIamBinding)[vs[1].(int)]
	}).(DnsManagedZoneIamBindingOutput)
}

type DnsManagedZoneIamBindingMapOutput struct{ *pulumi.OutputState }

func (DnsManagedZoneIamBindingMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DnsManagedZoneIamBinding)(nil)).Elem()
}

func (o DnsManagedZoneIamBindingMapOutput) ToDnsManagedZoneIamBindingMapOutput() DnsManagedZoneIamBindingMapOutput {
	return o
}

func (o DnsManagedZoneIamBindingMapOutput) ToDnsManagedZoneIamBindingMapOutputWithContext(ctx context.Context) DnsManagedZoneIamBindingMapOutput {
	return o
}

func (o DnsManagedZoneIamBindingMapOutput) MapIndex(k pulumi.StringInput) DnsManagedZoneIamBindingOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DnsManagedZoneIamBinding {
		return vs[0].(map[string]*DnsManagedZoneIamBinding)[vs[1].(string)]
	}).(DnsManagedZoneIamBindingOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DnsManagedZoneIamBindingInput)(nil)).Elem(), &DnsManagedZoneIamBinding{})
	pulumi.RegisterInputType(reflect.TypeOf((*DnsManagedZoneIamBindingArrayInput)(nil)).Elem(), DnsManagedZoneIamBindingArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DnsManagedZoneIamBindingMapInput)(nil)).Elem(), DnsManagedZoneIamBindingMap{})
	pulumi.RegisterOutputType(DnsManagedZoneIamBindingOutput{})
	pulumi.RegisterOutputType(DnsManagedZoneIamBindingArrayOutput{})
	pulumi.RegisterOutputType(DnsManagedZoneIamBindingMapOutput{})
}
