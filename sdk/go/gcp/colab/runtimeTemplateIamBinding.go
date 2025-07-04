// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package colab

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Three different resources help you manage your IAM policy for Colab Enterprise RuntimeTemplate. Each of these resources serves a different use case:
//
// * `colab.RuntimeTemplateIamPolicy`: Authoritative. Sets the IAM policy for the runtimetemplate and replaces any existing policy already attached.
// * `colab.RuntimeTemplateIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the runtimetemplate are preserved.
// * `colab.RuntimeTemplateIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the runtimetemplate are preserved.
//
// # A data source can be used to retrieve policy data in advent you do not need creation
//
// * `colab.RuntimeTemplateIamPolicy`: Retrieves the IAM policy for the runtimetemplate
//
// > **Note:** `colab.RuntimeTemplateIamPolicy` **cannot** be used in conjunction with `colab.RuntimeTemplateIamBinding` and `colab.RuntimeTemplateIamMember` or they will fight over what your policy should be.
//
// > **Note:** `colab.RuntimeTemplateIamBinding` resources **can be** used in conjunction with `colab.RuntimeTemplateIamMember` resources **only if** they do not grant privilege to the same role.
//
// ## colab.RuntimeTemplateIamPolicy
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/colab"
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
//			_, err = colab.NewRuntimeTemplateIamPolicy(ctx, "policy", &colab.RuntimeTemplateIamPolicyArgs{
//				Project:         pulumi.Any(runtime_template.Project),
//				Location:        pulumi.Any(runtime_template.Location),
//				RuntimeTemplate: pulumi.Any(runtime_template.Name),
//				PolicyData:      pulumi.String(admin.PolicyData),
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
// ## colab.RuntimeTemplateIamBinding
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/colab"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := colab.NewRuntimeTemplateIamBinding(ctx, "binding", &colab.RuntimeTemplateIamBindingArgs{
//				Project:         pulumi.Any(runtime_template.Project),
//				Location:        pulumi.Any(runtime_template.Location),
//				RuntimeTemplate: pulumi.Any(runtime_template.Name),
//				Role:            pulumi.String("roles/viewer"),
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
// ## colab.RuntimeTemplateIamMember
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/colab"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := colab.NewRuntimeTemplateIamMember(ctx, "member", &colab.RuntimeTemplateIamMemberArgs{
//				Project:         pulumi.Any(runtime_template.Project),
//				Location:        pulumi.Any(runtime_template.Location),
//				RuntimeTemplate: pulumi.Any(runtime_template.Name),
//				Role:            pulumi.String("roles/viewer"),
//				Member:          pulumi.String("user:jane@example.com"),
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
// # IAM policy for Colab Enterprise RuntimeTemplate
// Three different resources help you manage your IAM policy for Colab Enterprise RuntimeTemplate. Each of these resources serves a different use case:
//
// * `colab.RuntimeTemplateIamPolicy`: Authoritative. Sets the IAM policy for the runtimetemplate and replaces any existing policy already attached.
// * `colab.RuntimeTemplateIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the runtimetemplate are preserved.
// * `colab.RuntimeTemplateIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the runtimetemplate are preserved.
//
// # A data source can be used to retrieve policy data in advent you do not need creation
//
// * `colab.RuntimeTemplateIamPolicy`: Retrieves the IAM policy for the runtimetemplate
//
// > **Note:** `colab.RuntimeTemplateIamPolicy` **cannot** be used in conjunction with `colab.RuntimeTemplateIamBinding` and `colab.RuntimeTemplateIamMember` or they will fight over what your policy should be.
//
// > **Note:** `colab.RuntimeTemplateIamBinding` resources **can be** used in conjunction with `colab.RuntimeTemplateIamMember` resources **only if** they do not grant privilege to the same role.
//
// ## colab.RuntimeTemplateIamPolicy
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/colab"
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
//			_, err = colab.NewRuntimeTemplateIamPolicy(ctx, "policy", &colab.RuntimeTemplateIamPolicyArgs{
//				Project:         pulumi.Any(runtime_template.Project),
//				Location:        pulumi.Any(runtime_template.Location),
//				RuntimeTemplate: pulumi.Any(runtime_template.Name),
//				PolicyData:      pulumi.String(admin.PolicyData),
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
// ## colab.RuntimeTemplateIamBinding
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/colab"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := colab.NewRuntimeTemplateIamBinding(ctx, "binding", &colab.RuntimeTemplateIamBindingArgs{
//				Project:         pulumi.Any(runtime_template.Project),
//				Location:        pulumi.Any(runtime_template.Location),
//				RuntimeTemplate: pulumi.Any(runtime_template.Name),
//				Role:            pulumi.String("roles/viewer"),
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
// ## colab.RuntimeTemplateIamMember
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/colab"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := colab.NewRuntimeTemplateIamMember(ctx, "member", &colab.RuntimeTemplateIamMemberArgs{
//				Project:         pulumi.Any(runtime_template.Project),
//				Location:        pulumi.Any(runtime_template.Location),
//				RuntimeTemplate: pulumi.Any(runtime_template.Name),
//				Role:            pulumi.String("roles/viewer"),
//				Member:          pulumi.String("user:jane@example.com"),
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
// * projects/{{project}}/locations/{{location}}/notebookRuntimeTemplates/{{runtime_template}}
//
// * {{project}}/{{location}}/{{runtime_template}}
//
// * {{location}}/{{runtime_template}}
//
// * {{runtime_template}}
//
// Any variables not passed in the import command will be taken from the provider configuration.
//
// Colab Enterprise runtimetemplate IAM resources can be imported using the resource identifiers, role, and member.
//
// IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
//
// ```sh
// $ pulumi import gcp:colab/runtimeTemplateIamBinding:RuntimeTemplateIamBinding editor "projects/{{project}}/locations/{{location}}/notebookRuntimeTemplates/{{runtime_template}} roles/viewer user:jane@example.com"
// ```
//
// IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
//
// ```sh
// $ pulumi import gcp:colab/runtimeTemplateIamBinding:RuntimeTemplateIamBinding editor "projects/{{project}}/locations/{{location}}/notebookRuntimeTemplates/{{runtime_template}} roles/viewer"
// ```
//
// IAM policy imports use the identifier of the resource in question, e.g.
//
// ```sh
// $ pulumi import gcp:colab/runtimeTemplateIamBinding:RuntimeTemplateIamBinding editor projects/{{project}}/locations/{{location}}/notebookRuntimeTemplates/{{runtime_template}}
// ```
//
// -> **Custom Roles** If you're importing a IAM resource with a custom role, make sure to use the
//
//	full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
type RuntimeTemplateIamBinding struct {
	pulumi.CustomResourceState

	Condition RuntimeTemplateIamBindingConditionPtrOutput `pulumi:"condition"`
	// (Computed) The etag of the IAM policy.
	Etag pulumi.StringOutput `pulumi:"etag"`
	// The location for the resource: https://cloud.google.com/colab/docs/locations Used to find the parent resource to bind the IAM policy to. If not specified,
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
	// `colab.RuntimeTemplateIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringOutput `pulumi:"role"`
	// Used to find the parent resource to bind the IAM policy to
	RuntimeTemplate pulumi.StringOutput `pulumi:"runtimeTemplate"`
}

// NewRuntimeTemplateIamBinding registers a new resource with the given unique name, arguments, and options.
func NewRuntimeTemplateIamBinding(ctx *pulumi.Context,
	name string, args *RuntimeTemplateIamBindingArgs, opts ...pulumi.ResourceOption) (*RuntimeTemplateIamBinding, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Members == nil {
		return nil, errors.New("invalid value for required argument 'Members'")
	}
	if args.Role == nil {
		return nil, errors.New("invalid value for required argument 'Role'")
	}
	if args.RuntimeTemplate == nil {
		return nil, errors.New("invalid value for required argument 'RuntimeTemplate'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource RuntimeTemplateIamBinding
	err := ctx.RegisterResource("gcp:colab/runtimeTemplateIamBinding:RuntimeTemplateIamBinding", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRuntimeTemplateIamBinding gets an existing RuntimeTemplateIamBinding resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRuntimeTemplateIamBinding(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RuntimeTemplateIamBindingState, opts ...pulumi.ResourceOption) (*RuntimeTemplateIamBinding, error) {
	var resource RuntimeTemplateIamBinding
	err := ctx.ReadResource("gcp:colab/runtimeTemplateIamBinding:RuntimeTemplateIamBinding", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering RuntimeTemplateIamBinding resources.
type runtimeTemplateIamBindingState struct {
	Condition *RuntimeTemplateIamBindingCondition `pulumi:"condition"`
	// (Computed) The etag of the IAM policy.
	Etag *string `pulumi:"etag"`
	// The location for the resource: https://cloud.google.com/colab/docs/locations Used to find the parent resource to bind the IAM policy to. If not specified,
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
	// `colab.RuntimeTemplateIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role *string `pulumi:"role"`
	// Used to find the parent resource to bind the IAM policy to
	RuntimeTemplate *string `pulumi:"runtimeTemplate"`
}

type RuntimeTemplateIamBindingState struct {
	Condition RuntimeTemplateIamBindingConditionPtrInput
	// (Computed) The etag of the IAM policy.
	Etag pulumi.StringPtrInput
	// The location for the resource: https://cloud.google.com/colab/docs/locations Used to find the parent resource to bind the IAM policy to. If not specified,
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
	// `colab.RuntimeTemplateIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringPtrInput
	// Used to find the parent resource to bind the IAM policy to
	RuntimeTemplate pulumi.StringPtrInput
}

func (RuntimeTemplateIamBindingState) ElementType() reflect.Type {
	return reflect.TypeOf((*runtimeTemplateIamBindingState)(nil)).Elem()
}

type runtimeTemplateIamBindingArgs struct {
	Condition *RuntimeTemplateIamBindingCondition `pulumi:"condition"`
	// The location for the resource: https://cloud.google.com/colab/docs/locations Used to find the parent resource to bind the IAM policy to. If not specified,
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
	// `colab.RuntimeTemplateIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role string `pulumi:"role"`
	// Used to find the parent resource to bind the IAM policy to
	RuntimeTemplate string `pulumi:"runtimeTemplate"`
}

// The set of arguments for constructing a RuntimeTemplateIamBinding resource.
type RuntimeTemplateIamBindingArgs struct {
	Condition RuntimeTemplateIamBindingConditionPtrInput
	// The location for the resource: https://cloud.google.com/colab/docs/locations Used to find the parent resource to bind the IAM policy to. If not specified,
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
	// `colab.RuntimeTemplateIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringInput
	// Used to find the parent resource to bind the IAM policy to
	RuntimeTemplate pulumi.StringInput
}

func (RuntimeTemplateIamBindingArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*runtimeTemplateIamBindingArgs)(nil)).Elem()
}

type RuntimeTemplateIamBindingInput interface {
	pulumi.Input

	ToRuntimeTemplateIamBindingOutput() RuntimeTemplateIamBindingOutput
	ToRuntimeTemplateIamBindingOutputWithContext(ctx context.Context) RuntimeTemplateIamBindingOutput
}

func (*RuntimeTemplateIamBinding) ElementType() reflect.Type {
	return reflect.TypeOf((**RuntimeTemplateIamBinding)(nil)).Elem()
}

func (i *RuntimeTemplateIamBinding) ToRuntimeTemplateIamBindingOutput() RuntimeTemplateIamBindingOutput {
	return i.ToRuntimeTemplateIamBindingOutputWithContext(context.Background())
}

func (i *RuntimeTemplateIamBinding) ToRuntimeTemplateIamBindingOutputWithContext(ctx context.Context) RuntimeTemplateIamBindingOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RuntimeTemplateIamBindingOutput)
}

// RuntimeTemplateIamBindingArrayInput is an input type that accepts RuntimeTemplateIamBindingArray and RuntimeTemplateIamBindingArrayOutput values.
// You can construct a concrete instance of `RuntimeTemplateIamBindingArrayInput` via:
//
//	RuntimeTemplateIamBindingArray{ RuntimeTemplateIamBindingArgs{...} }
type RuntimeTemplateIamBindingArrayInput interface {
	pulumi.Input

	ToRuntimeTemplateIamBindingArrayOutput() RuntimeTemplateIamBindingArrayOutput
	ToRuntimeTemplateIamBindingArrayOutputWithContext(context.Context) RuntimeTemplateIamBindingArrayOutput
}

type RuntimeTemplateIamBindingArray []RuntimeTemplateIamBindingInput

func (RuntimeTemplateIamBindingArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RuntimeTemplateIamBinding)(nil)).Elem()
}

func (i RuntimeTemplateIamBindingArray) ToRuntimeTemplateIamBindingArrayOutput() RuntimeTemplateIamBindingArrayOutput {
	return i.ToRuntimeTemplateIamBindingArrayOutputWithContext(context.Background())
}

func (i RuntimeTemplateIamBindingArray) ToRuntimeTemplateIamBindingArrayOutputWithContext(ctx context.Context) RuntimeTemplateIamBindingArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RuntimeTemplateIamBindingArrayOutput)
}

// RuntimeTemplateIamBindingMapInput is an input type that accepts RuntimeTemplateIamBindingMap and RuntimeTemplateIamBindingMapOutput values.
// You can construct a concrete instance of `RuntimeTemplateIamBindingMapInput` via:
//
//	RuntimeTemplateIamBindingMap{ "key": RuntimeTemplateIamBindingArgs{...} }
type RuntimeTemplateIamBindingMapInput interface {
	pulumi.Input

	ToRuntimeTemplateIamBindingMapOutput() RuntimeTemplateIamBindingMapOutput
	ToRuntimeTemplateIamBindingMapOutputWithContext(context.Context) RuntimeTemplateIamBindingMapOutput
}

type RuntimeTemplateIamBindingMap map[string]RuntimeTemplateIamBindingInput

func (RuntimeTemplateIamBindingMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RuntimeTemplateIamBinding)(nil)).Elem()
}

func (i RuntimeTemplateIamBindingMap) ToRuntimeTemplateIamBindingMapOutput() RuntimeTemplateIamBindingMapOutput {
	return i.ToRuntimeTemplateIamBindingMapOutputWithContext(context.Background())
}

func (i RuntimeTemplateIamBindingMap) ToRuntimeTemplateIamBindingMapOutputWithContext(ctx context.Context) RuntimeTemplateIamBindingMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RuntimeTemplateIamBindingMapOutput)
}

type RuntimeTemplateIamBindingOutput struct{ *pulumi.OutputState }

func (RuntimeTemplateIamBindingOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**RuntimeTemplateIamBinding)(nil)).Elem()
}

func (o RuntimeTemplateIamBindingOutput) ToRuntimeTemplateIamBindingOutput() RuntimeTemplateIamBindingOutput {
	return o
}

func (o RuntimeTemplateIamBindingOutput) ToRuntimeTemplateIamBindingOutputWithContext(ctx context.Context) RuntimeTemplateIamBindingOutput {
	return o
}

func (o RuntimeTemplateIamBindingOutput) Condition() RuntimeTemplateIamBindingConditionPtrOutput {
	return o.ApplyT(func(v *RuntimeTemplateIamBinding) RuntimeTemplateIamBindingConditionPtrOutput { return v.Condition }).(RuntimeTemplateIamBindingConditionPtrOutput)
}

// (Computed) The etag of the IAM policy.
func (o RuntimeTemplateIamBindingOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v *RuntimeTemplateIamBinding) pulumi.StringOutput { return v.Etag }).(pulumi.StringOutput)
}

// The location for the resource: https://cloud.google.com/colab/docs/locations Used to find the parent resource to bind the IAM policy to. If not specified,
// the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
// location is specified, it is taken from the provider configuration.
func (o RuntimeTemplateIamBindingOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *RuntimeTemplateIamBinding) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
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
func (o RuntimeTemplateIamBindingOutput) Members() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *RuntimeTemplateIamBinding) pulumi.StringArrayOutput { return v.Members }).(pulumi.StringArrayOutput)
}

// The ID of the project in which the resource belongs.
// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
func (o RuntimeTemplateIamBindingOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *RuntimeTemplateIamBinding) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// The role that should be applied. Only one
// `colab.RuntimeTemplateIamBinding` can be used per role. Note that custom roles must be of the format
// `[projects|organizations]/{parent-name}/roles/{role-name}`.
func (o RuntimeTemplateIamBindingOutput) Role() pulumi.StringOutput {
	return o.ApplyT(func(v *RuntimeTemplateIamBinding) pulumi.StringOutput { return v.Role }).(pulumi.StringOutput)
}

// Used to find the parent resource to bind the IAM policy to
func (o RuntimeTemplateIamBindingOutput) RuntimeTemplate() pulumi.StringOutput {
	return o.ApplyT(func(v *RuntimeTemplateIamBinding) pulumi.StringOutput { return v.RuntimeTemplate }).(pulumi.StringOutput)
}

type RuntimeTemplateIamBindingArrayOutput struct{ *pulumi.OutputState }

func (RuntimeTemplateIamBindingArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RuntimeTemplateIamBinding)(nil)).Elem()
}

func (o RuntimeTemplateIamBindingArrayOutput) ToRuntimeTemplateIamBindingArrayOutput() RuntimeTemplateIamBindingArrayOutput {
	return o
}

func (o RuntimeTemplateIamBindingArrayOutput) ToRuntimeTemplateIamBindingArrayOutputWithContext(ctx context.Context) RuntimeTemplateIamBindingArrayOutput {
	return o
}

func (o RuntimeTemplateIamBindingArrayOutput) Index(i pulumi.IntInput) RuntimeTemplateIamBindingOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *RuntimeTemplateIamBinding {
		return vs[0].([]*RuntimeTemplateIamBinding)[vs[1].(int)]
	}).(RuntimeTemplateIamBindingOutput)
}

type RuntimeTemplateIamBindingMapOutput struct{ *pulumi.OutputState }

func (RuntimeTemplateIamBindingMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RuntimeTemplateIamBinding)(nil)).Elem()
}

func (o RuntimeTemplateIamBindingMapOutput) ToRuntimeTemplateIamBindingMapOutput() RuntimeTemplateIamBindingMapOutput {
	return o
}

func (o RuntimeTemplateIamBindingMapOutput) ToRuntimeTemplateIamBindingMapOutputWithContext(ctx context.Context) RuntimeTemplateIamBindingMapOutput {
	return o
}

func (o RuntimeTemplateIamBindingMapOutput) MapIndex(k pulumi.StringInput) RuntimeTemplateIamBindingOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *RuntimeTemplateIamBinding {
		return vs[0].(map[string]*RuntimeTemplateIamBinding)[vs[1].(string)]
	}).(RuntimeTemplateIamBindingOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RuntimeTemplateIamBindingInput)(nil)).Elem(), &RuntimeTemplateIamBinding{})
	pulumi.RegisterInputType(reflect.TypeOf((*RuntimeTemplateIamBindingArrayInput)(nil)).Elem(), RuntimeTemplateIamBindingArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RuntimeTemplateIamBindingMapInput)(nil)).Elem(), RuntimeTemplateIamBindingMap{})
	pulumi.RegisterOutputType(RuntimeTemplateIamBindingOutput{})
	pulumi.RegisterOutputType(RuntimeTemplateIamBindingArrayOutput{})
	pulumi.RegisterOutputType(RuntimeTemplateIamBindingMapOutput{})
}
