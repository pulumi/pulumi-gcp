// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package pubsub

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Three different resources help you manage your IAM policy for Cloud Pub/Sub Schema. Each of these resources serves a different use case:
//
// * `pubsub.SchemaIamPolicy`: Authoritative. Sets the IAM policy for the schema and replaces any existing policy already attached.
// * `pubsub.SchemaIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the schema are preserved.
// * `pubsub.SchemaIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the schema are preserved.
//
// # A data source can be used to retrieve policy data in advent you do not need creation
//
// * `pubsub.SchemaIamPolicy`: Retrieves the IAM policy for the schema
//
// > **Note:** `pubsub.SchemaIamPolicy` **cannot** be used in conjunction with `pubsub.SchemaIamBinding` and `pubsub.SchemaIamMember` or they will fight over what your policy should be.
//
// > **Note:** `pubsub.SchemaIamBinding` resources **can be** used in conjunction with `pubsub.SchemaIamMember` resources **only if** they do not grant privilege to the same role.
//
// ## pubsub.SchemaIamPolicy
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/organizations"
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/pubsub"
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
//			_, err = pubsub.NewSchemaIamPolicy(ctx, "policy", &pubsub.SchemaIamPolicyArgs{
//				Project:    pulumi.Any(example.Project),
//				Schema:     pulumi.Any(example.Name),
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
// ## pubsub.SchemaIamBinding
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/pubsub"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := pubsub.NewSchemaIamBinding(ctx, "binding", &pubsub.SchemaIamBindingArgs{
//				Project: pulumi.Any(example.Project),
//				Schema:  pulumi.Any(example.Name),
//				Role:    pulumi.String("roles/viewer"),
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
// ## pubsub.SchemaIamMember
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/pubsub"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := pubsub.NewSchemaIamMember(ctx, "member", &pubsub.SchemaIamMemberArgs{
//				Project: pulumi.Any(example.Project),
//				Schema:  pulumi.Any(example.Name),
//				Role:    pulumi.String("roles/viewer"),
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
// ## This resource supports User Project Overrides.
//
// -
//
// # IAM policy for Cloud Pub/Sub Schema
// Three different resources help you manage your IAM policy for Cloud Pub/Sub Schema. Each of these resources serves a different use case:
//
// * `pubsub.SchemaIamPolicy`: Authoritative. Sets the IAM policy for the schema and replaces any existing policy already attached.
// * `pubsub.SchemaIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the schema are preserved.
// * `pubsub.SchemaIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the schema are preserved.
//
// # A data source can be used to retrieve policy data in advent you do not need creation
//
// * `pubsub.SchemaIamPolicy`: Retrieves the IAM policy for the schema
//
// > **Note:** `pubsub.SchemaIamPolicy` **cannot** be used in conjunction with `pubsub.SchemaIamBinding` and `pubsub.SchemaIamMember` or they will fight over what your policy should be.
//
// > **Note:** `pubsub.SchemaIamBinding` resources **can be** used in conjunction with `pubsub.SchemaIamMember` resources **only if** they do not grant privilege to the same role.
//
// ## pubsub.SchemaIamPolicy
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/organizations"
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/pubsub"
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
//			_, err = pubsub.NewSchemaIamPolicy(ctx, "policy", &pubsub.SchemaIamPolicyArgs{
//				Project:    pulumi.Any(example.Project),
//				Schema:     pulumi.Any(example.Name),
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
// ## pubsub.SchemaIamBinding
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/pubsub"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := pubsub.NewSchemaIamBinding(ctx, "binding", &pubsub.SchemaIamBindingArgs{
//				Project: pulumi.Any(example.Project),
//				Schema:  pulumi.Any(example.Name),
//				Role:    pulumi.String("roles/viewer"),
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
// ## pubsub.SchemaIamMember
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/pubsub"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := pubsub.NewSchemaIamMember(ctx, "member", &pubsub.SchemaIamMemberArgs{
//				Project: pulumi.Any(example.Project),
//				Schema:  pulumi.Any(example.Name),
//				Role:    pulumi.String("roles/viewer"),
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
// ## Import
//
// For all import syntaxes, the "resource in question" can take any of the following forms:
//
// * projects/{{project}}/schemas/{{name}}
//
// * {{project}}/{{name}}
//
// * {{name}}
//
// Any variables not passed in the import command will be taken from the provider configuration.
//
// Cloud Pub/Sub schema IAM resources can be imported using the resource identifiers, role, and member.
//
// IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
//
// ```sh
// $ pulumi import gcp:pubsub/schemaIamBinding:SchemaIamBinding editor "projects/{{project}}/schemas/{{schema}} roles/viewer user:jane@example.com"
// ```
//
// IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
//
// ```sh
// $ pulumi import gcp:pubsub/schemaIamBinding:SchemaIamBinding editor "projects/{{project}}/schemas/{{schema}} roles/viewer"
// ```
//
// IAM policy imports use the identifier of the resource in question, e.g.
//
// ```sh
// $ pulumi import gcp:pubsub/schemaIamBinding:SchemaIamBinding editor projects/{{project}}/schemas/{{schema}}
// ```
//
// -> **Custom Roles** If you're importing a IAM resource with a custom role, make sure to use the
//
//	full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
type SchemaIamBinding struct {
	pulumi.CustomResourceState

	Condition SchemaIamBindingConditionPtrOutput `pulumi:"condition"`
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
	Members pulumi.StringArrayOutput `pulumi:"members"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringOutput `pulumi:"project"`
	// The role that should be applied. Only one
	// `pubsub.SchemaIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringOutput `pulumi:"role"`
	// Used to find the parent resource to bind the IAM policy to
	Schema pulumi.StringOutput `pulumi:"schema"`
}

// NewSchemaIamBinding registers a new resource with the given unique name, arguments, and options.
func NewSchemaIamBinding(ctx *pulumi.Context,
	name string, args *SchemaIamBindingArgs, opts ...pulumi.ResourceOption) (*SchemaIamBinding, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Members == nil {
		return nil, errors.New("invalid value for required argument 'Members'")
	}
	if args.Role == nil {
		return nil, errors.New("invalid value for required argument 'Role'")
	}
	if args.Schema == nil {
		return nil, errors.New("invalid value for required argument 'Schema'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SchemaIamBinding
	err := ctx.RegisterResource("gcp:pubsub/schemaIamBinding:SchemaIamBinding", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSchemaIamBinding gets an existing SchemaIamBinding resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSchemaIamBinding(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SchemaIamBindingState, opts ...pulumi.ResourceOption) (*SchemaIamBinding, error) {
	var resource SchemaIamBinding
	err := ctx.ReadResource("gcp:pubsub/schemaIamBinding:SchemaIamBinding", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SchemaIamBinding resources.
type schemaIamBindingState struct {
	Condition *SchemaIamBindingCondition `pulumi:"condition"`
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
	Members []string `pulumi:"members"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project *string `pulumi:"project"`
	// The role that should be applied. Only one
	// `pubsub.SchemaIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role *string `pulumi:"role"`
	// Used to find the parent resource to bind the IAM policy to
	Schema *string `pulumi:"schema"`
}

type SchemaIamBindingState struct {
	Condition SchemaIamBindingConditionPtrInput
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
	Members pulumi.StringArrayInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringPtrInput
	// The role that should be applied. Only one
	// `pubsub.SchemaIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringPtrInput
	// Used to find the parent resource to bind the IAM policy to
	Schema pulumi.StringPtrInput
}

func (SchemaIamBindingState) ElementType() reflect.Type {
	return reflect.TypeOf((*schemaIamBindingState)(nil)).Elem()
}

type schemaIamBindingArgs struct {
	Condition *SchemaIamBindingCondition `pulumi:"condition"`
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
	// `pubsub.SchemaIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role string `pulumi:"role"`
	// Used to find the parent resource to bind the IAM policy to
	Schema string `pulumi:"schema"`
}

// The set of arguments for constructing a SchemaIamBinding resource.
type SchemaIamBindingArgs struct {
	Condition SchemaIamBindingConditionPtrInput
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
	// `pubsub.SchemaIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringInput
	// Used to find the parent resource to bind the IAM policy to
	Schema pulumi.StringInput
}

func (SchemaIamBindingArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*schemaIamBindingArgs)(nil)).Elem()
}

type SchemaIamBindingInput interface {
	pulumi.Input

	ToSchemaIamBindingOutput() SchemaIamBindingOutput
	ToSchemaIamBindingOutputWithContext(ctx context.Context) SchemaIamBindingOutput
}

func (*SchemaIamBinding) ElementType() reflect.Type {
	return reflect.TypeOf((**SchemaIamBinding)(nil)).Elem()
}

func (i *SchemaIamBinding) ToSchemaIamBindingOutput() SchemaIamBindingOutput {
	return i.ToSchemaIamBindingOutputWithContext(context.Background())
}

func (i *SchemaIamBinding) ToSchemaIamBindingOutputWithContext(ctx context.Context) SchemaIamBindingOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SchemaIamBindingOutput)
}

// SchemaIamBindingArrayInput is an input type that accepts SchemaIamBindingArray and SchemaIamBindingArrayOutput values.
// You can construct a concrete instance of `SchemaIamBindingArrayInput` via:
//
//	SchemaIamBindingArray{ SchemaIamBindingArgs{...} }
type SchemaIamBindingArrayInput interface {
	pulumi.Input

	ToSchemaIamBindingArrayOutput() SchemaIamBindingArrayOutput
	ToSchemaIamBindingArrayOutputWithContext(context.Context) SchemaIamBindingArrayOutput
}

type SchemaIamBindingArray []SchemaIamBindingInput

func (SchemaIamBindingArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SchemaIamBinding)(nil)).Elem()
}

func (i SchemaIamBindingArray) ToSchemaIamBindingArrayOutput() SchemaIamBindingArrayOutput {
	return i.ToSchemaIamBindingArrayOutputWithContext(context.Background())
}

func (i SchemaIamBindingArray) ToSchemaIamBindingArrayOutputWithContext(ctx context.Context) SchemaIamBindingArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SchemaIamBindingArrayOutput)
}

// SchemaIamBindingMapInput is an input type that accepts SchemaIamBindingMap and SchemaIamBindingMapOutput values.
// You can construct a concrete instance of `SchemaIamBindingMapInput` via:
//
//	SchemaIamBindingMap{ "key": SchemaIamBindingArgs{...} }
type SchemaIamBindingMapInput interface {
	pulumi.Input

	ToSchemaIamBindingMapOutput() SchemaIamBindingMapOutput
	ToSchemaIamBindingMapOutputWithContext(context.Context) SchemaIamBindingMapOutput
}

type SchemaIamBindingMap map[string]SchemaIamBindingInput

func (SchemaIamBindingMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SchemaIamBinding)(nil)).Elem()
}

func (i SchemaIamBindingMap) ToSchemaIamBindingMapOutput() SchemaIamBindingMapOutput {
	return i.ToSchemaIamBindingMapOutputWithContext(context.Background())
}

func (i SchemaIamBindingMap) ToSchemaIamBindingMapOutputWithContext(ctx context.Context) SchemaIamBindingMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SchemaIamBindingMapOutput)
}

type SchemaIamBindingOutput struct{ *pulumi.OutputState }

func (SchemaIamBindingOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SchemaIamBinding)(nil)).Elem()
}

func (o SchemaIamBindingOutput) ToSchemaIamBindingOutput() SchemaIamBindingOutput {
	return o
}

func (o SchemaIamBindingOutput) ToSchemaIamBindingOutputWithContext(ctx context.Context) SchemaIamBindingOutput {
	return o
}

func (o SchemaIamBindingOutput) Condition() SchemaIamBindingConditionPtrOutput {
	return o.ApplyT(func(v *SchemaIamBinding) SchemaIamBindingConditionPtrOutput { return v.Condition }).(SchemaIamBindingConditionPtrOutput)
}

// (Computed) The etag of the IAM policy.
func (o SchemaIamBindingOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v *SchemaIamBinding) pulumi.StringOutput { return v.Etag }).(pulumi.StringOutput)
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
func (o SchemaIamBindingOutput) Members() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *SchemaIamBinding) pulumi.StringArrayOutput { return v.Members }).(pulumi.StringArrayOutput)
}

// The ID of the project in which the resource belongs.
// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
func (o SchemaIamBindingOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *SchemaIamBinding) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// The role that should be applied. Only one
// `pubsub.SchemaIamBinding` can be used per role. Note that custom roles must be of the format
// `[projects|organizations]/{parent-name}/roles/{role-name}`.
func (o SchemaIamBindingOutput) Role() pulumi.StringOutput {
	return o.ApplyT(func(v *SchemaIamBinding) pulumi.StringOutput { return v.Role }).(pulumi.StringOutput)
}

// Used to find the parent resource to bind the IAM policy to
func (o SchemaIamBindingOutput) Schema() pulumi.StringOutput {
	return o.ApplyT(func(v *SchemaIamBinding) pulumi.StringOutput { return v.Schema }).(pulumi.StringOutput)
}

type SchemaIamBindingArrayOutput struct{ *pulumi.OutputState }

func (SchemaIamBindingArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SchemaIamBinding)(nil)).Elem()
}

func (o SchemaIamBindingArrayOutput) ToSchemaIamBindingArrayOutput() SchemaIamBindingArrayOutput {
	return o
}

func (o SchemaIamBindingArrayOutput) ToSchemaIamBindingArrayOutputWithContext(ctx context.Context) SchemaIamBindingArrayOutput {
	return o
}

func (o SchemaIamBindingArrayOutput) Index(i pulumi.IntInput) SchemaIamBindingOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SchemaIamBinding {
		return vs[0].([]*SchemaIamBinding)[vs[1].(int)]
	}).(SchemaIamBindingOutput)
}

type SchemaIamBindingMapOutput struct{ *pulumi.OutputState }

func (SchemaIamBindingMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SchemaIamBinding)(nil)).Elem()
}

func (o SchemaIamBindingMapOutput) ToSchemaIamBindingMapOutput() SchemaIamBindingMapOutput {
	return o
}

func (o SchemaIamBindingMapOutput) ToSchemaIamBindingMapOutputWithContext(ctx context.Context) SchemaIamBindingMapOutput {
	return o
}

func (o SchemaIamBindingMapOutput) MapIndex(k pulumi.StringInput) SchemaIamBindingOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SchemaIamBinding {
		return vs[0].(map[string]*SchemaIamBinding)[vs[1].(string)]
	}).(SchemaIamBindingOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SchemaIamBindingInput)(nil)).Elem(), &SchemaIamBinding{})
	pulumi.RegisterInputType(reflect.TypeOf((*SchemaIamBindingArrayInput)(nil)).Elem(), SchemaIamBindingArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SchemaIamBindingMapInput)(nil)).Elem(), SchemaIamBindingMap{})
	pulumi.RegisterOutputType(SchemaIamBindingOutput{})
	pulumi.RegisterOutputType(SchemaIamBindingArrayOutput{})
	pulumi.RegisterOutputType(SchemaIamBindingMapOutput{})
}
