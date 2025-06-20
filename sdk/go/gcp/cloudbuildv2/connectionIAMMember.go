// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudbuildv2

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Three different resources help you manage your IAM policy for Cloud Build v2 Connection. Each of these resources serves a different use case:
//
// * `cloudbuildv2.ConnectionIAMPolicy`: Authoritative. Sets the IAM policy for the connection and replaces any existing policy already attached.
// * `cloudbuildv2.ConnectionIAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the connection are preserved.
// * `cloudbuildv2.ConnectionIAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the connection are preserved.
//
// # A data source can be used to retrieve policy data in advent you do not need creation
//
// * `cloudbuildv2.ConnectionIAMPolicy`: Retrieves the IAM policy for the connection
//
// > **Note:** `cloudbuildv2.ConnectionIAMPolicy` **cannot** be used in conjunction with `cloudbuildv2.ConnectionIAMBinding` and `cloudbuildv2.ConnectionIAMMember` or they will fight over what your policy should be.
//
// > **Note:** `cloudbuildv2.ConnectionIAMBinding` resources **can be** used in conjunction with `cloudbuildv2.ConnectionIAMMember` resources **only if** they do not grant privilege to the same role.
//
// ## cloudbuildv2.ConnectionIAMPolicy
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/cloudbuildv2"
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
//						Role: "roles/cloudbuild.connectionViewer",
//						Members: []string{
//							"user:jane@example.com",
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = cloudbuildv2.NewConnectionIAMPolicy(ctx, "policy", &cloudbuildv2.ConnectionIAMPolicyArgs{
//				Project:    pulumi.Any(my_connection.Project),
//				Location:   pulumi.Any(my_connection.Location),
//				Name:       pulumi.Any(my_connection.Name),
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
// ## cloudbuildv2.ConnectionIAMBinding
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/cloudbuildv2"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := cloudbuildv2.NewConnectionIAMBinding(ctx, "binding", &cloudbuildv2.ConnectionIAMBindingArgs{
//				Project:  pulumi.Any(my_connection.Project),
//				Location: pulumi.Any(my_connection.Location),
//				Name:     pulumi.Any(my_connection.Name),
//				Role:     pulumi.String("roles/cloudbuild.connectionViewer"),
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
// ## cloudbuildv2.ConnectionIAMMember
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/cloudbuildv2"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := cloudbuildv2.NewConnectionIAMMember(ctx, "member", &cloudbuildv2.ConnectionIAMMemberArgs{
//				Project:  pulumi.Any(my_connection.Project),
//				Location: pulumi.Any(my_connection.Location),
//				Name:     pulumi.Any(my_connection.Name),
//				Role:     pulumi.String("roles/cloudbuild.connectionViewer"),
//				Member:   pulumi.String("user:jane@example.com"),
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
// # IAM policy for Cloud Build v2 Connection
// Three different resources help you manage your IAM policy for Cloud Build v2 Connection. Each of these resources serves a different use case:
//
// * `cloudbuildv2.ConnectionIAMPolicy`: Authoritative. Sets the IAM policy for the connection and replaces any existing policy already attached.
// * `cloudbuildv2.ConnectionIAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the connection are preserved.
// * `cloudbuildv2.ConnectionIAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the connection are preserved.
//
// # A data source can be used to retrieve policy data in advent you do not need creation
//
// * `cloudbuildv2.ConnectionIAMPolicy`: Retrieves the IAM policy for the connection
//
// > **Note:** `cloudbuildv2.ConnectionIAMPolicy` **cannot** be used in conjunction with `cloudbuildv2.ConnectionIAMBinding` and `cloudbuildv2.ConnectionIAMMember` or they will fight over what your policy should be.
//
// > **Note:** `cloudbuildv2.ConnectionIAMBinding` resources **can be** used in conjunction with `cloudbuildv2.ConnectionIAMMember` resources **only if** they do not grant privilege to the same role.
//
// ## cloudbuildv2.ConnectionIAMPolicy
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/cloudbuildv2"
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
//						Role: "roles/cloudbuild.connectionViewer",
//						Members: []string{
//							"user:jane@example.com",
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = cloudbuildv2.NewConnectionIAMPolicy(ctx, "policy", &cloudbuildv2.ConnectionIAMPolicyArgs{
//				Project:    pulumi.Any(my_connection.Project),
//				Location:   pulumi.Any(my_connection.Location),
//				Name:       pulumi.Any(my_connection.Name),
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
// ## cloudbuildv2.ConnectionIAMBinding
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/cloudbuildv2"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := cloudbuildv2.NewConnectionIAMBinding(ctx, "binding", &cloudbuildv2.ConnectionIAMBindingArgs{
//				Project:  pulumi.Any(my_connection.Project),
//				Location: pulumi.Any(my_connection.Location),
//				Name:     pulumi.Any(my_connection.Name),
//				Role:     pulumi.String("roles/cloudbuild.connectionViewer"),
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
// ## cloudbuildv2.ConnectionIAMMember
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/cloudbuildv2"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := cloudbuildv2.NewConnectionIAMMember(ctx, "member", &cloudbuildv2.ConnectionIAMMemberArgs{
//				Project:  pulumi.Any(my_connection.Project),
//				Location: pulumi.Any(my_connection.Location),
//				Name:     pulumi.Any(my_connection.Name),
//				Role:     pulumi.String("roles/cloudbuild.connectionViewer"),
//				Member:   pulumi.String("user:jane@example.com"),
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
// * projects/{{project}}/locations/{{location}}/connections/{{name}}
//
// * {{project}}/{{location}}/{{name}}
//
// * {{location}}/{{name}}
//
// * {{name}}
//
// Any variables not passed in the import command will be taken from the provider configuration.
//
// Cloud Build v2 connection IAM resources can be imported using the resource identifiers, role, and member.
//
// IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
//
// ```sh
// $ pulumi import gcp:cloudbuildv2/connectionIAMMember:ConnectionIAMMember editor "projects/{{project}}/locations/{{location}}/connections/{{connection}} roles/cloudbuild.connectionViewer user:jane@example.com"
// ```
//
// IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
//
// ```sh
// $ pulumi import gcp:cloudbuildv2/connectionIAMMember:ConnectionIAMMember editor "projects/{{project}}/locations/{{location}}/connections/{{connection}} roles/cloudbuild.connectionViewer"
// ```
//
// IAM policy imports use the identifier of the resource in question, e.g.
//
// ```sh
// $ pulumi import gcp:cloudbuildv2/connectionIAMMember:ConnectionIAMMember editor projects/{{project}}/locations/{{location}}/connections/{{connection}}
// ```
//
// -> **Custom Roles** If you're importing a IAM resource with a custom role, make sure to use the
//
//	full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
type ConnectionIAMMember struct {
	pulumi.CustomResourceState

	Condition ConnectionIAMMemberConditionPtrOutput `pulumi:"condition"`
	// (Computed) The etag of the IAM policy.
	Etag pulumi.StringOutput `pulumi:"etag"`
	// The location for the resource Used to find the parent resource to bind the IAM policy to. If not specified,
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
	Name pulumi.StringOutput `pulumi:"name"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringOutput `pulumi:"project"`
	// The role that should be applied. Only one
	// `cloudbuildv2.ConnectionIAMBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringOutput `pulumi:"role"`
}

// NewConnectionIAMMember registers a new resource with the given unique name, arguments, and options.
func NewConnectionIAMMember(ctx *pulumi.Context,
	name string, args *ConnectionIAMMemberArgs, opts ...pulumi.ResourceOption) (*ConnectionIAMMember, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Member == nil {
		return nil, errors.New("invalid value for required argument 'Member'")
	}
	if args.Role == nil {
		return nil, errors.New("invalid value for required argument 'Role'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ConnectionIAMMember
	err := ctx.RegisterResource("gcp:cloudbuildv2/connectionIAMMember:ConnectionIAMMember", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetConnectionIAMMember gets an existing ConnectionIAMMember resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetConnectionIAMMember(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ConnectionIAMMemberState, opts ...pulumi.ResourceOption) (*ConnectionIAMMember, error) {
	var resource ConnectionIAMMember
	err := ctx.ReadResource("gcp:cloudbuildv2/connectionIAMMember:ConnectionIAMMember", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ConnectionIAMMember resources.
type connectionIAMMemberState struct {
	Condition *ConnectionIAMMemberCondition `pulumi:"condition"`
	// (Computed) The etag of the IAM policy.
	Etag *string `pulumi:"etag"`
	// The location for the resource Used to find the parent resource to bind the IAM policy to. If not specified,
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
	Name *string `pulumi:"name"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project *string `pulumi:"project"`
	// The role that should be applied. Only one
	// `cloudbuildv2.ConnectionIAMBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role *string `pulumi:"role"`
}

type ConnectionIAMMemberState struct {
	Condition ConnectionIAMMemberConditionPtrInput
	// (Computed) The etag of the IAM policy.
	Etag pulumi.StringPtrInput
	// The location for the resource Used to find the parent resource to bind the IAM policy to. If not specified,
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
	Name pulumi.StringPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringPtrInput
	// The role that should be applied. Only one
	// `cloudbuildv2.ConnectionIAMBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringPtrInput
}

func (ConnectionIAMMemberState) ElementType() reflect.Type {
	return reflect.TypeOf((*connectionIAMMemberState)(nil)).Elem()
}

type connectionIAMMemberArgs struct {
	Condition *ConnectionIAMMemberCondition `pulumi:"condition"`
	// The location for the resource Used to find the parent resource to bind the IAM policy to. If not specified,
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
	Name *string `pulumi:"name"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project *string `pulumi:"project"`
	// The role that should be applied. Only one
	// `cloudbuildv2.ConnectionIAMBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role string `pulumi:"role"`
}

// The set of arguments for constructing a ConnectionIAMMember resource.
type ConnectionIAMMemberArgs struct {
	Condition ConnectionIAMMemberConditionPtrInput
	// The location for the resource Used to find the parent resource to bind the IAM policy to. If not specified,
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
	Name pulumi.StringPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringPtrInput
	// The role that should be applied. Only one
	// `cloudbuildv2.ConnectionIAMBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringInput
}

func (ConnectionIAMMemberArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*connectionIAMMemberArgs)(nil)).Elem()
}

type ConnectionIAMMemberInput interface {
	pulumi.Input

	ToConnectionIAMMemberOutput() ConnectionIAMMemberOutput
	ToConnectionIAMMemberOutputWithContext(ctx context.Context) ConnectionIAMMemberOutput
}

func (*ConnectionIAMMember) ElementType() reflect.Type {
	return reflect.TypeOf((**ConnectionIAMMember)(nil)).Elem()
}

func (i *ConnectionIAMMember) ToConnectionIAMMemberOutput() ConnectionIAMMemberOutput {
	return i.ToConnectionIAMMemberOutputWithContext(context.Background())
}

func (i *ConnectionIAMMember) ToConnectionIAMMemberOutputWithContext(ctx context.Context) ConnectionIAMMemberOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConnectionIAMMemberOutput)
}

// ConnectionIAMMemberArrayInput is an input type that accepts ConnectionIAMMemberArray and ConnectionIAMMemberArrayOutput values.
// You can construct a concrete instance of `ConnectionIAMMemberArrayInput` via:
//
//	ConnectionIAMMemberArray{ ConnectionIAMMemberArgs{...} }
type ConnectionIAMMemberArrayInput interface {
	pulumi.Input

	ToConnectionIAMMemberArrayOutput() ConnectionIAMMemberArrayOutput
	ToConnectionIAMMemberArrayOutputWithContext(context.Context) ConnectionIAMMemberArrayOutput
}

type ConnectionIAMMemberArray []ConnectionIAMMemberInput

func (ConnectionIAMMemberArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ConnectionIAMMember)(nil)).Elem()
}

func (i ConnectionIAMMemberArray) ToConnectionIAMMemberArrayOutput() ConnectionIAMMemberArrayOutput {
	return i.ToConnectionIAMMemberArrayOutputWithContext(context.Background())
}

func (i ConnectionIAMMemberArray) ToConnectionIAMMemberArrayOutputWithContext(ctx context.Context) ConnectionIAMMemberArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConnectionIAMMemberArrayOutput)
}

// ConnectionIAMMemberMapInput is an input type that accepts ConnectionIAMMemberMap and ConnectionIAMMemberMapOutput values.
// You can construct a concrete instance of `ConnectionIAMMemberMapInput` via:
//
//	ConnectionIAMMemberMap{ "key": ConnectionIAMMemberArgs{...} }
type ConnectionIAMMemberMapInput interface {
	pulumi.Input

	ToConnectionIAMMemberMapOutput() ConnectionIAMMemberMapOutput
	ToConnectionIAMMemberMapOutputWithContext(context.Context) ConnectionIAMMemberMapOutput
}

type ConnectionIAMMemberMap map[string]ConnectionIAMMemberInput

func (ConnectionIAMMemberMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ConnectionIAMMember)(nil)).Elem()
}

func (i ConnectionIAMMemberMap) ToConnectionIAMMemberMapOutput() ConnectionIAMMemberMapOutput {
	return i.ToConnectionIAMMemberMapOutputWithContext(context.Background())
}

func (i ConnectionIAMMemberMap) ToConnectionIAMMemberMapOutputWithContext(ctx context.Context) ConnectionIAMMemberMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConnectionIAMMemberMapOutput)
}

type ConnectionIAMMemberOutput struct{ *pulumi.OutputState }

func (ConnectionIAMMemberOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ConnectionIAMMember)(nil)).Elem()
}

func (o ConnectionIAMMemberOutput) ToConnectionIAMMemberOutput() ConnectionIAMMemberOutput {
	return o
}

func (o ConnectionIAMMemberOutput) ToConnectionIAMMemberOutputWithContext(ctx context.Context) ConnectionIAMMemberOutput {
	return o
}

func (o ConnectionIAMMemberOutput) Condition() ConnectionIAMMemberConditionPtrOutput {
	return o.ApplyT(func(v *ConnectionIAMMember) ConnectionIAMMemberConditionPtrOutput { return v.Condition }).(ConnectionIAMMemberConditionPtrOutput)
}

// (Computed) The etag of the IAM policy.
func (o ConnectionIAMMemberOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v *ConnectionIAMMember) pulumi.StringOutput { return v.Etag }).(pulumi.StringOutput)
}

// The location for the resource Used to find the parent resource to bind the IAM policy to. If not specified,
// the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
// location is specified, it is taken from the provider configuration.
func (o ConnectionIAMMemberOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *ConnectionIAMMember) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
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
func (o ConnectionIAMMemberOutput) Member() pulumi.StringOutput {
	return o.ApplyT(func(v *ConnectionIAMMember) pulumi.StringOutput { return v.Member }).(pulumi.StringOutput)
}

// Used to find the parent resource to bind the IAM policy to
func (o ConnectionIAMMemberOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ConnectionIAMMember) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The ID of the project in which the resource belongs.
// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
func (o ConnectionIAMMemberOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *ConnectionIAMMember) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// The role that should be applied. Only one
// `cloudbuildv2.ConnectionIAMBinding` can be used per role. Note that custom roles must be of the format
// `[projects|organizations]/{parent-name}/roles/{role-name}`.
func (o ConnectionIAMMemberOutput) Role() pulumi.StringOutput {
	return o.ApplyT(func(v *ConnectionIAMMember) pulumi.StringOutput { return v.Role }).(pulumi.StringOutput)
}

type ConnectionIAMMemberArrayOutput struct{ *pulumi.OutputState }

func (ConnectionIAMMemberArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ConnectionIAMMember)(nil)).Elem()
}

func (o ConnectionIAMMemberArrayOutput) ToConnectionIAMMemberArrayOutput() ConnectionIAMMemberArrayOutput {
	return o
}

func (o ConnectionIAMMemberArrayOutput) ToConnectionIAMMemberArrayOutputWithContext(ctx context.Context) ConnectionIAMMemberArrayOutput {
	return o
}

func (o ConnectionIAMMemberArrayOutput) Index(i pulumi.IntInput) ConnectionIAMMemberOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ConnectionIAMMember {
		return vs[0].([]*ConnectionIAMMember)[vs[1].(int)]
	}).(ConnectionIAMMemberOutput)
}

type ConnectionIAMMemberMapOutput struct{ *pulumi.OutputState }

func (ConnectionIAMMemberMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ConnectionIAMMember)(nil)).Elem()
}

func (o ConnectionIAMMemberMapOutput) ToConnectionIAMMemberMapOutput() ConnectionIAMMemberMapOutput {
	return o
}

func (o ConnectionIAMMemberMapOutput) ToConnectionIAMMemberMapOutputWithContext(ctx context.Context) ConnectionIAMMemberMapOutput {
	return o
}

func (o ConnectionIAMMemberMapOutput) MapIndex(k pulumi.StringInput) ConnectionIAMMemberOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ConnectionIAMMember {
		return vs[0].(map[string]*ConnectionIAMMember)[vs[1].(string)]
	}).(ConnectionIAMMemberOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ConnectionIAMMemberInput)(nil)).Elem(), &ConnectionIAMMember{})
	pulumi.RegisterInputType(reflect.TypeOf((*ConnectionIAMMemberArrayInput)(nil)).Elem(), ConnectionIAMMemberArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ConnectionIAMMemberMapInput)(nil)).Elem(), ConnectionIAMMemberMap{})
	pulumi.RegisterOutputType(ConnectionIAMMemberOutput{})
	pulumi.RegisterOutputType(ConnectionIAMMemberArrayOutput{})
	pulumi.RegisterOutputType(ConnectionIAMMemberMapOutput{})
}
