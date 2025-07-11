// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package notebooks

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Three different resources help you manage your IAM policy for Cloud AI Notebooks Runtime. Each of these resources serves a different use case:
//
// * `notebooks.RuntimeIamPolicy`: Authoritative. Sets the IAM policy for the runtime and replaces any existing policy already attached.
// * `notebooks.RuntimeIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the runtime are preserved.
// * `notebooks.RuntimeIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the runtime are preserved.
//
// # A data source can be used to retrieve policy data in advent you do not need creation
//
// * `notebooks.RuntimeIamPolicy`: Retrieves the IAM policy for the runtime
//
// > **Note:** `notebooks.RuntimeIamPolicy` **cannot** be used in conjunction with `notebooks.RuntimeIamBinding` and `notebooks.RuntimeIamMember` or they will fight over what your policy should be.
//
// > **Note:** `notebooks.RuntimeIamBinding` resources **can be** used in conjunction with `notebooks.RuntimeIamMember` resources **only if** they do not grant privilege to the same role.
//
// ## notebooks.RuntimeIamPolicy
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/notebooks"
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
//			_, err = notebooks.NewRuntimeIamPolicy(ctx, "policy", &notebooks.RuntimeIamPolicyArgs{
//				Project:     pulumi.Any(runtime.Project),
//				Location:    pulumi.Any(runtime.Location),
//				RuntimeName: pulumi.Any(runtime.Name),
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
// ## notebooks.RuntimeIamBinding
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/notebooks"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := notebooks.NewRuntimeIamBinding(ctx, "binding", &notebooks.RuntimeIamBindingArgs{
//				Project:     pulumi.Any(runtime.Project),
//				Location:    pulumi.Any(runtime.Location),
//				RuntimeName: pulumi.Any(runtime.Name),
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
// ## notebooks.RuntimeIamMember
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/notebooks"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := notebooks.NewRuntimeIamMember(ctx, "member", &notebooks.RuntimeIamMemberArgs{
//				Project:     pulumi.Any(runtime.Project),
//				Location:    pulumi.Any(runtime.Location),
//				RuntimeName: pulumi.Any(runtime.Name),
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
// # IAM policy for Cloud AI Notebooks Runtime
// Three different resources help you manage your IAM policy for Cloud AI Notebooks Runtime. Each of these resources serves a different use case:
//
// * `notebooks.RuntimeIamPolicy`: Authoritative. Sets the IAM policy for the runtime and replaces any existing policy already attached.
// * `notebooks.RuntimeIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the runtime are preserved.
// * `notebooks.RuntimeIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the runtime are preserved.
//
// # A data source can be used to retrieve policy data in advent you do not need creation
//
// * `notebooks.RuntimeIamPolicy`: Retrieves the IAM policy for the runtime
//
// > **Note:** `notebooks.RuntimeIamPolicy` **cannot** be used in conjunction with `notebooks.RuntimeIamBinding` and `notebooks.RuntimeIamMember` or they will fight over what your policy should be.
//
// > **Note:** `notebooks.RuntimeIamBinding` resources **can be** used in conjunction with `notebooks.RuntimeIamMember` resources **only if** they do not grant privilege to the same role.
//
// ## notebooks.RuntimeIamPolicy
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/notebooks"
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
//			_, err = notebooks.NewRuntimeIamPolicy(ctx, "policy", &notebooks.RuntimeIamPolicyArgs{
//				Project:     pulumi.Any(runtime.Project),
//				Location:    pulumi.Any(runtime.Location),
//				RuntimeName: pulumi.Any(runtime.Name),
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
// ## notebooks.RuntimeIamBinding
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/notebooks"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := notebooks.NewRuntimeIamBinding(ctx, "binding", &notebooks.RuntimeIamBindingArgs{
//				Project:     pulumi.Any(runtime.Project),
//				Location:    pulumi.Any(runtime.Location),
//				RuntimeName: pulumi.Any(runtime.Name),
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
// ## notebooks.RuntimeIamMember
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/notebooks"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := notebooks.NewRuntimeIamMember(ctx, "member", &notebooks.RuntimeIamMemberArgs{
//				Project:     pulumi.Any(runtime.Project),
//				Location:    pulumi.Any(runtime.Location),
//				RuntimeName: pulumi.Any(runtime.Name),
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
// * projects/{{project}}/locations/{{location}}/runtimes/{{runtime_name}}
//
// * {{project}}/{{location}}/{{runtime_name}}
//
// * {{location}}/{{runtime_name}}
//
// * {{runtime_name}}
//
// Any variables not passed in the import command will be taken from the provider configuration.
//
// Cloud AI Notebooks runtime IAM resources can be imported using the resource identifiers, role, and member.
//
// IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
//
// ```sh
// $ pulumi import gcp:notebooks/runtimeIamBinding:RuntimeIamBinding editor "projects/{{project}}/locations/{{location}}/runtimes/{{runtime_name}} roles/viewer user:jane@example.com"
// ```
//
// IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
//
// ```sh
// $ pulumi import gcp:notebooks/runtimeIamBinding:RuntimeIamBinding editor "projects/{{project}}/locations/{{location}}/runtimes/{{runtime_name}} roles/viewer"
// ```
//
// IAM policy imports use the identifier of the resource in question, e.g.
//
// ```sh
// $ pulumi import gcp:notebooks/runtimeIamBinding:RuntimeIamBinding editor projects/{{project}}/locations/{{location}}/runtimes/{{runtime_name}}
// ```
//
// -> **Custom Roles** If you're importing a IAM resource with a custom role, make sure to use the
//
//	full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
type RuntimeIamBinding struct {
	pulumi.CustomResourceState

	Condition RuntimeIamBindingConditionPtrOutput `pulumi:"condition"`
	// (Computed) The etag of the IAM policy.
	Etag pulumi.StringOutput `pulumi:"etag"`
	// A reference to the zone where the machine resides. Used to find the parent resource to bind the IAM policy to. If not specified,
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
	// The role that should be applied. Only one
	// `notebooks.RuntimeIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringOutput `pulumi:"role"`
	// Used to find the parent resource to bind the IAM policy to
	RuntimeName pulumi.StringOutput `pulumi:"runtimeName"`
}

// NewRuntimeIamBinding registers a new resource with the given unique name, arguments, and options.
func NewRuntimeIamBinding(ctx *pulumi.Context,
	name string, args *RuntimeIamBindingArgs, opts ...pulumi.ResourceOption) (*RuntimeIamBinding, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Members == nil {
		return nil, errors.New("invalid value for required argument 'Members'")
	}
	if args.Role == nil {
		return nil, errors.New("invalid value for required argument 'Role'")
	}
	if args.RuntimeName == nil {
		return nil, errors.New("invalid value for required argument 'RuntimeName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource RuntimeIamBinding
	err := ctx.RegisterResource("gcp:notebooks/runtimeIamBinding:RuntimeIamBinding", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRuntimeIamBinding gets an existing RuntimeIamBinding resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRuntimeIamBinding(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RuntimeIamBindingState, opts ...pulumi.ResourceOption) (*RuntimeIamBinding, error) {
	var resource RuntimeIamBinding
	err := ctx.ReadResource("gcp:notebooks/runtimeIamBinding:RuntimeIamBinding", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering RuntimeIamBinding resources.
type runtimeIamBindingState struct {
	Condition *RuntimeIamBindingCondition `pulumi:"condition"`
	// (Computed) The etag of the IAM policy.
	Etag *string `pulumi:"etag"`
	// A reference to the zone where the machine resides. Used to find the parent resource to bind the IAM policy to. If not specified,
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
	// The role that should be applied. Only one
	// `notebooks.RuntimeIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role *string `pulumi:"role"`
	// Used to find the parent resource to bind the IAM policy to
	RuntimeName *string `pulumi:"runtimeName"`
}

type RuntimeIamBindingState struct {
	Condition RuntimeIamBindingConditionPtrInput
	// (Computed) The etag of the IAM policy.
	Etag pulumi.StringPtrInput
	// A reference to the zone where the machine resides. Used to find the parent resource to bind the IAM policy to. If not specified,
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
	// The role that should be applied. Only one
	// `notebooks.RuntimeIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringPtrInput
	// Used to find the parent resource to bind the IAM policy to
	RuntimeName pulumi.StringPtrInput
}

func (RuntimeIamBindingState) ElementType() reflect.Type {
	return reflect.TypeOf((*runtimeIamBindingState)(nil)).Elem()
}

type runtimeIamBindingArgs struct {
	Condition *RuntimeIamBindingCondition `pulumi:"condition"`
	// A reference to the zone where the machine resides. Used to find the parent resource to bind the IAM policy to. If not specified,
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
	// The role that should be applied. Only one
	// `notebooks.RuntimeIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role string `pulumi:"role"`
	// Used to find the parent resource to bind the IAM policy to
	RuntimeName string `pulumi:"runtimeName"`
}

// The set of arguments for constructing a RuntimeIamBinding resource.
type RuntimeIamBindingArgs struct {
	Condition RuntimeIamBindingConditionPtrInput
	// A reference to the zone where the machine resides. Used to find the parent resource to bind the IAM policy to. If not specified,
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
	// The role that should be applied. Only one
	// `notebooks.RuntimeIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringInput
	// Used to find the parent resource to bind the IAM policy to
	RuntimeName pulumi.StringInput
}

func (RuntimeIamBindingArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*runtimeIamBindingArgs)(nil)).Elem()
}

type RuntimeIamBindingInput interface {
	pulumi.Input

	ToRuntimeIamBindingOutput() RuntimeIamBindingOutput
	ToRuntimeIamBindingOutputWithContext(ctx context.Context) RuntimeIamBindingOutput
}

func (*RuntimeIamBinding) ElementType() reflect.Type {
	return reflect.TypeOf((**RuntimeIamBinding)(nil)).Elem()
}

func (i *RuntimeIamBinding) ToRuntimeIamBindingOutput() RuntimeIamBindingOutput {
	return i.ToRuntimeIamBindingOutputWithContext(context.Background())
}

func (i *RuntimeIamBinding) ToRuntimeIamBindingOutputWithContext(ctx context.Context) RuntimeIamBindingOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RuntimeIamBindingOutput)
}

// RuntimeIamBindingArrayInput is an input type that accepts RuntimeIamBindingArray and RuntimeIamBindingArrayOutput values.
// You can construct a concrete instance of `RuntimeIamBindingArrayInput` via:
//
//	RuntimeIamBindingArray{ RuntimeIamBindingArgs{...} }
type RuntimeIamBindingArrayInput interface {
	pulumi.Input

	ToRuntimeIamBindingArrayOutput() RuntimeIamBindingArrayOutput
	ToRuntimeIamBindingArrayOutputWithContext(context.Context) RuntimeIamBindingArrayOutput
}

type RuntimeIamBindingArray []RuntimeIamBindingInput

func (RuntimeIamBindingArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RuntimeIamBinding)(nil)).Elem()
}

func (i RuntimeIamBindingArray) ToRuntimeIamBindingArrayOutput() RuntimeIamBindingArrayOutput {
	return i.ToRuntimeIamBindingArrayOutputWithContext(context.Background())
}

func (i RuntimeIamBindingArray) ToRuntimeIamBindingArrayOutputWithContext(ctx context.Context) RuntimeIamBindingArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RuntimeIamBindingArrayOutput)
}

// RuntimeIamBindingMapInput is an input type that accepts RuntimeIamBindingMap and RuntimeIamBindingMapOutput values.
// You can construct a concrete instance of `RuntimeIamBindingMapInput` via:
//
//	RuntimeIamBindingMap{ "key": RuntimeIamBindingArgs{...} }
type RuntimeIamBindingMapInput interface {
	pulumi.Input

	ToRuntimeIamBindingMapOutput() RuntimeIamBindingMapOutput
	ToRuntimeIamBindingMapOutputWithContext(context.Context) RuntimeIamBindingMapOutput
}

type RuntimeIamBindingMap map[string]RuntimeIamBindingInput

func (RuntimeIamBindingMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RuntimeIamBinding)(nil)).Elem()
}

func (i RuntimeIamBindingMap) ToRuntimeIamBindingMapOutput() RuntimeIamBindingMapOutput {
	return i.ToRuntimeIamBindingMapOutputWithContext(context.Background())
}

func (i RuntimeIamBindingMap) ToRuntimeIamBindingMapOutputWithContext(ctx context.Context) RuntimeIamBindingMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RuntimeIamBindingMapOutput)
}

type RuntimeIamBindingOutput struct{ *pulumi.OutputState }

func (RuntimeIamBindingOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**RuntimeIamBinding)(nil)).Elem()
}

func (o RuntimeIamBindingOutput) ToRuntimeIamBindingOutput() RuntimeIamBindingOutput {
	return o
}

func (o RuntimeIamBindingOutput) ToRuntimeIamBindingOutputWithContext(ctx context.Context) RuntimeIamBindingOutput {
	return o
}

func (o RuntimeIamBindingOutput) Condition() RuntimeIamBindingConditionPtrOutput {
	return o.ApplyT(func(v *RuntimeIamBinding) RuntimeIamBindingConditionPtrOutput { return v.Condition }).(RuntimeIamBindingConditionPtrOutput)
}

// (Computed) The etag of the IAM policy.
func (o RuntimeIamBindingOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v *RuntimeIamBinding) pulumi.StringOutput { return v.Etag }).(pulumi.StringOutput)
}

// A reference to the zone where the machine resides. Used to find the parent resource to bind the IAM policy to. If not specified,
// the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
// location is specified, it is taken from the provider configuration.
func (o RuntimeIamBindingOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *RuntimeIamBinding) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
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
func (o RuntimeIamBindingOutput) Members() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *RuntimeIamBinding) pulumi.StringArrayOutput { return v.Members }).(pulumi.StringArrayOutput)
}

// The ID of the project in which the resource belongs.
// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
func (o RuntimeIamBindingOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *RuntimeIamBinding) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// The role that should be applied. Only one
// `notebooks.RuntimeIamBinding` can be used per role. Note that custom roles must be of the format
// `[projects|organizations]/{parent-name}/roles/{role-name}`.
func (o RuntimeIamBindingOutput) Role() pulumi.StringOutput {
	return o.ApplyT(func(v *RuntimeIamBinding) pulumi.StringOutput { return v.Role }).(pulumi.StringOutput)
}

// Used to find the parent resource to bind the IAM policy to
func (o RuntimeIamBindingOutput) RuntimeName() pulumi.StringOutput {
	return o.ApplyT(func(v *RuntimeIamBinding) pulumi.StringOutput { return v.RuntimeName }).(pulumi.StringOutput)
}

type RuntimeIamBindingArrayOutput struct{ *pulumi.OutputState }

func (RuntimeIamBindingArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RuntimeIamBinding)(nil)).Elem()
}

func (o RuntimeIamBindingArrayOutput) ToRuntimeIamBindingArrayOutput() RuntimeIamBindingArrayOutput {
	return o
}

func (o RuntimeIamBindingArrayOutput) ToRuntimeIamBindingArrayOutputWithContext(ctx context.Context) RuntimeIamBindingArrayOutput {
	return o
}

func (o RuntimeIamBindingArrayOutput) Index(i pulumi.IntInput) RuntimeIamBindingOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *RuntimeIamBinding {
		return vs[0].([]*RuntimeIamBinding)[vs[1].(int)]
	}).(RuntimeIamBindingOutput)
}

type RuntimeIamBindingMapOutput struct{ *pulumi.OutputState }

func (RuntimeIamBindingMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RuntimeIamBinding)(nil)).Elem()
}

func (o RuntimeIamBindingMapOutput) ToRuntimeIamBindingMapOutput() RuntimeIamBindingMapOutput {
	return o
}

func (o RuntimeIamBindingMapOutput) ToRuntimeIamBindingMapOutputWithContext(ctx context.Context) RuntimeIamBindingMapOutput {
	return o
}

func (o RuntimeIamBindingMapOutput) MapIndex(k pulumi.StringInput) RuntimeIamBindingOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *RuntimeIamBinding {
		return vs[0].(map[string]*RuntimeIamBinding)[vs[1].(string)]
	}).(RuntimeIamBindingOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RuntimeIamBindingInput)(nil)).Elem(), &RuntimeIamBinding{})
	pulumi.RegisterInputType(reflect.TypeOf((*RuntimeIamBindingArrayInput)(nil)).Elem(), RuntimeIamBindingArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RuntimeIamBindingMapInput)(nil)).Elem(), RuntimeIamBindingMap{})
	pulumi.RegisterOutputType(RuntimeIamBindingOutput{})
	pulumi.RegisterOutputType(RuntimeIamBindingArrayOutput{})
	pulumi.RegisterOutputType(RuntimeIamBindingMapOutput{})
}
