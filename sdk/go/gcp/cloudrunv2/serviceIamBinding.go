// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudrunv2

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Three different resources help you manage your IAM policy for Cloud Run (v2 API) Service. Each of these resources serves a different use case:
//
// * `cloudrunv2.ServiceIamPolicy`: Authoritative. Sets the IAM policy for the service and replaces any existing policy already attached.
// * `cloudrunv2.ServiceIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the service are preserved.
// * `cloudrunv2.ServiceIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the service are preserved.
//
// # A data source can be used to retrieve policy data in advent you do not need creation
//
// * `cloudrunv2.ServiceIamPolicy`: Retrieves the IAM policy for the service
//
// > **Note:** `cloudrunv2.ServiceIamPolicy` **cannot** be used in conjunction with `cloudrunv2.ServiceIamBinding` and `cloudrunv2.ServiceIamMember` or they will fight over what your policy should be.
//
// > **Note:** `cloudrunv2.ServiceIamBinding` resources **can be** used in conjunction with `cloudrunv2.ServiceIamMember` resources **only if** they do not grant privilege to the same role.
//
// ## cloudrunv2.ServiceIamPolicy
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/cloudrunv2"
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
//			_, err = cloudrunv2.NewServiceIamPolicy(ctx, "policy", &cloudrunv2.ServiceIamPolicyArgs{
//				Project:    pulumi.Any(_default.Project),
//				Location:   pulumi.Any(_default.Location),
//				Name:       pulumi.Any(_default.Name),
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
// ## cloudrunv2.ServiceIamBinding
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/cloudrunv2"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := cloudrunv2.NewServiceIamBinding(ctx, "binding", &cloudrunv2.ServiceIamBindingArgs{
//				Project:  pulumi.Any(_default.Project),
//				Location: pulumi.Any(_default.Location),
//				Name:     pulumi.Any(_default.Name),
//				Role:     pulumi.String("roles/viewer"),
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
// ## cloudrunv2.ServiceIamMember
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/cloudrunv2"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := cloudrunv2.NewServiceIamMember(ctx, "member", &cloudrunv2.ServiceIamMemberArgs{
//				Project:  pulumi.Any(_default.Project),
//				Location: pulumi.Any(_default.Location),
//				Name:     pulumi.Any(_default.Name),
//				Role:     pulumi.String("roles/viewer"),
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
// # IAM policy for Cloud Run (v2 API) Service
// Three different resources help you manage your IAM policy for Cloud Run (v2 API) Service. Each of these resources serves a different use case:
//
// * `cloudrunv2.ServiceIamPolicy`: Authoritative. Sets the IAM policy for the service and replaces any existing policy already attached.
// * `cloudrunv2.ServiceIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the service are preserved.
// * `cloudrunv2.ServiceIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the service are preserved.
//
// # A data source can be used to retrieve policy data in advent you do not need creation
//
// * `cloudrunv2.ServiceIamPolicy`: Retrieves the IAM policy for the service
//
// > **Note:** `cloudrunv2.ServiceIamPolicy` **cannot** be used in conjunction with `cloudrunv2.ServiceIamBinding` and `cloudrunv2.ServiceIamMember` or they will fight over what your policy should be.
//
// > **Note:** `cloudrunv2.ServiceIamBinding` resources **can be** used in conjunction with `cloudrunv2.ServiceIamMember` resources **only if** they do not grant privilege to the same role.
//
// ## cloudrunv2.ServiceIamPolicy
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/cloudrunv2"
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
//			_, err = cloudrunv2.NewServiceIamPolicy(ctx, "policy", &cloudrunv2.ServiceIamPolicyArgs{
//				Project:    pulumi.Any(_default.Project),
//				Location:   pulumi.Any(_default.Location),
//				Name:       pulumi.Any(_default.Name),
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
// ## cloudrunv2.ServiceIamBinding
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/cloudrunv2"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := cloudrunv2.NewServiceIamBinding(ctx, "binding", &cloudrunv2.ServiceIamBindingArgs{
//				Project:  pulumi.Any(_default.Project),
//				Location: pulumi.Any(_default.Location),
//				Name:     pulumi.Any(_default.Name),
//				Role:     pulumi.String("roles/viewer"),
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
// ## cloudrunv2.ServiceIamMember
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/cloudrunv2"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := cloudrunv2.NewServiceIamMember(ctx, "member", &cloudrunv2.ServiceIamMemberArgs{
//				Project:  pulumi.Any(_default.Project),
//				Location: pulumi.Any(_default.Location),
//				Name:     pulumi.Any(_default.Name),
//				Role:     pulumi.String("roles/viewer"),
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
// * projects/{{project}}/locations/{{location}}/services/{{name}}
//
// * {{project}}/{{location}}/{{name}}
//
// * {{location}}/{{name}}
//
// * {{name}}
//
// Any variables not passed in the import command will be taken from the provider configuration.
//
// Cloud Run (v2 API) service IAM resources can be imported using the resource identifiers, role, and member.
//
// IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
//
// ```sh
// $ pulumi import gcp:cloudrunv2/serviceIamBinding:ServiceIamBinding editor "projects/{{project}}/locations/{{location}}/services/{{service}} roles/viewer user:jane@example.com"
// ```
//
// IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
//
// ```sh
// $ pulumi import gcp:cloudrunv2/serviceIamBinding:ServiceIamBinding editor "projects/{{project}}/locations/{{location}}/services/{{service}} roles/viewer"
// ```
//
// IAM policy imports use the identifier of the resource in question, e.g.
//
// ```sh
// $ pulumi import gcp:cloudrunv2/serviceIamBinding:ServiceIamBinding editor projects/{{project}}/locations/{{location}}/services/{{service}}
// ```
//
// -> **Custom Roles** If you're importing a IAM resource with a custom role, make sure to use the
//
//	full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
type ServiceIamBinding struct {
	pulumi.CustomResourceState

	Condition ServiceIamBindingConditionPtrOutput `pulumi:"condition"`
	// (Computed) The etag of the IAM policy.
	Etag pulumi.StringOutput `pulumi:"etag"`
	// The location of the cloud run service Used to find the parent resource to bind the IAM policy to. If not specified,
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
	// Used to find the parent resource to bind the IAM policy to
	Name pulumi.StringOutput `pulumi:"name"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringOutput `pulumi:"project"`
	// The role that should be applied. Only one
	// `cloudrunv2.ServiceIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringOutput `pulumi:"role"`
}

// NewServiceIamBinding registers a new resource with the given unique name, arguments, and options.
func NewServiceIamBinding(ctx *pulumi.Context,
	name string, args *ServiceIamBindingArgs, opts ...pulumi.ResourceOption) (*ServiceIamBinding, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Members == nil {
		return nil, errors.New("invalid value for required argument 'Members'")
	}
	if args.Role == nil {
		return nil, errors.New("invalid value for required argument 'Role'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ServiceIamBinding
	err := ctx.RegisterResource("gcp:cloudrunv2/serviceIamBinding:ServiceIamBinding", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetServiceIamBinding gets an existing ServiceIamBinding resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetServiceIamBinding(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ServiceIamBindingState, opts ...pulumi.ResourceOption) (*ServiceIamBinding, error) {
	var resource ServiceIamBinding
	err := ctx.ReadResource("gcp:cloudrunv2/serviceIamBinding:ServiceIamBinding", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ServiceIamBinding resources.
type serviceIamBindingState struct {
	Condition *ServiceIamBindingCondition `pulumi:"condition"`
	// (Computed) The etag of the IAM policy.
	Etag *string `pulumi:"etag"`
	// The location of the cloud run service Used to find the parent resource to bind the IAM policy to. If not specified,
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
	// Used to find the parent resource to bind the IAM policy to
	Name *string `pulumi:"name"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project *string `pulumi:"project"`
	// The role that should be applied. Only one
	// `cloudrunv2.ServiceIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role *string `pulumi:"role"`
}

type ServiceIamBindingState struct {
	Condition ServiceIamBindingConditionPtrInput
	// (Computed) The etag of the IAM policy.
	Etag pulumi.StringPtrInput
	// The location of the cloud run service Used to find the parent resource to bind the IAM policy to. If not specified,
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
	// Used to find the parent resource to bind the IAM policy to
	Name pulumi.StringPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringPtrInput
	// The role that should be applied. Only one
	// `cloudrunv2.ServiceIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringPtrInput
}

func (ServiceIamBindingState) ElementType() reflect.Type {
	return reflect.TypeOf((*serviceIamBindingState)(nil)).Elem()
}

type serviceIamBindingArgs struct {
	Condition *ServiceIamBindingCondition `pulumi:"condition"`
	// The location of the cloud run service Used to find the parent resource to bind the IAM policy to. If not specified,
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
	// Used to find the parent resource to bind the IAM policy to
	Name *string `pulumi:"name"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project *string `pulumi:"project"`
	// The role that should be applied. Only one
	// `cloudrunv2.ServiceIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role string `pulumi:"role"`
}

// The set of arguments for constructing a ServiceIamBinding resource.
type ServiceIamBindingArgs struct {
	Condition ServiceIamBindingConditionPtrInput
	// The location of the cloud run service Used to find the parent resource to bind the IAM policy to. If not specified,
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
	// Used to find the parent resource to bind the IAM policy to
	Name pulumi.StringPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringPtrInput
	// The role that should be applied. Only one
	// `cloudrunv2.ServiceIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringInput
}

func (ServiceIamBindingArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*serviceIamBindingArgs)(nil)).Elem()
}

type ServiceIamBindingInput interface {
	pulumi.Input

	ToServiceIamBindingOutput() ServiceIamBindingOutput
	ToServiceIamBindingOutputWithContext(ctx context.Context) ServiceIamBindingOutput
}

func (*ServiceIamBinding) ElementType() reflect.Type {
	return reflect.TypeOf((**ServiceIamBinding)(nil)).Elem()
}

func (i *ServiceIamBinding) ToServiceIamBindingOutput() ServiceIamBindingOutput {
	return i.ToServiceIamBindingOutputWithContext(context.Background())
}

func (i *ServiceIamBinding) ToServiceIamBindingOutputWithContext(ctx context.Context) ServiceIamBindingOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceIamBindingOutput)
}

// ServiceIamBindingArrayInput is an input type that accepts ServiceIamBindingArray and ServiceIamBindingArrayOutput values.
// You can construct a concrete instance of `ServiceIamBindingArrayInput` via:
//
//	ServiceIamBindingArray{ ServiceIamBindingArgs{...} }
type ServiceIamBindingArrayInput interface {
	pulumi.Input

	ToServiceIamBindingArrayOutput() ServiceIamBindingArrayOutput
	ToServiceIamBindingArrayOutputWithContext(context.Context) ServiceIamBindingArrayOutput
}

type ServiceIamBindingArray []ServiceIamBindingInput

func (ServiceIamBindingArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ServiceIamBinding)(nil)).Elem()
}

func (i ServiceIamBindingArray) ToServiceIamBindingArrayOutput() ServiceIamBindingArrayOutput {
	return i.ToServiceIamBindingArrayOutputWithContext(context.Background())
}

func (i ServiceIamBindingArray) ToServiceIamBindingArrayOutputWithContext(ctx context.Context) ServiceIamBindingArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceIamBindingArrayOutput)
}

// ServiceIamBindingMapInput is an input type that accepts ServiceIamBindingMap and ServiceIamBindingMapOutput values.
// You can construct a concrete instance of `ServiceIamBindingMapInput` via:
//
//	ServiceIamBindingMap{ "key": ServiceIamBindingArgs{...} }
type ServiceIamBindingMapInput interface {
	pulumi.Input

	ToServiceIamBindingMapOutput() ServiceIamBindingMapOutput
	ToServiceIamBindingMapOutputWithContext(context.Context) ServiceIamBindingMapOutput
}

type ServiceIamBindingMap map[string]ServiceIamBindingInput

func (ServiceIamBindingMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ServiceIamBinding)(nil)).Elem()
}

func (i ServiceIamBindingMap) ToServiceIamBindingMapOutput() ServiceIamBindingMapOutput {
	return i.ToServiceIamBindingMapOutputWithContext(context.Background())
}

func (i ServiceIamBindingMap) ToServiceIamBindingMapOutputWithContext(ctx context.Context) ServiceIamBindingMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceIamBindingMapOutput)
}

type ServiceIamBindingOutput struct{ *pulumi.OutputState }

func (ServiceIamBindingOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ServiceIamBinding)(nil)).Elem()
}

func (o ServiceIamBindingOutput) ToServiceIamBindingOutput() ServiceIamBindingOutput {
	return o
}

func (o ServiceIamBindingOutput) ToServiceIamBindingOutputWithContext(ctx context.Context) ServiceIamBindingOutput {
	return o
}

func (o ServiceIamBindingOutput) Condition() ServiceIamBindingConditionPtrOutput {
	return o.ApplyT(func(v *ServiceIamBinding) ServiceIamBindingConditionPtrOutput { return v.Condition }).(ServiceIamBindingConditionPtrOutput)
}

// (Computed) The etag of the IAM policy.
func (o ServiceIamBindingOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceIamBinding) pulumi.StringOutput { return v.Etag }).(pulumi.StringOutput)
}

// The location of the cloud run service Used to find the parent resource to bind the IAM policy to. If not specified,
// the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
// location is specified, it is taken from the provider configuration.
func (o ServiceIamBindingOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceIamBinding) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
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
func (o ServiceIamBindingOutput) Members() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ServiceIamBinding) pulumi.StringArrayOutput { return v.Members }).(pulumi.StringArrayOutput)
}

// Used to find the parent resource to bind the IAM policy to
func (o ServiceIamBindingOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceIamBinding) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The ID of the project in which the resource belongs.
// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
func (o ServiceIamBindingOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceIamBinding) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// The role that should be applied. Only one
// `cloudrunv2.ServiceIamBinding` can be used per role. Note that custom roles must be of the format
// `[projects|organizations]/{parent-name}/roles/{role-name}`.
func (o ServiceIamBindingOutput) Role() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceIamBinding) pulumi.StringOutput { return v.Role }).(pulumi.StringOutput)
}

type ServiceIamBindingArrayOutput struct{ *pulumi.OutputState }

func (ServiceIamBindingArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ServiceIamBinding)(nil)).Elem()
}

func (o ServiceIamBindingArrayOutput) ToServiceIamBindingArrayOutput() ServiceIamBindingArrayOutput {
	return o
}

func (o ServiceIamBindingArrayOutput) ToServiceIamBindingArrayOutputWithContext(ctx context.Context) ServiceIamBindingArrayOutput {
	return o
}

func (o ServiceIamBindingArrayOutput) Index(i pulumi.IntInput) ServiceIamBindingOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ServiceIamBinding {
		return vs[0].([]*ServiceIamBinding)[vs[1].(int)]
	}).(ServiceIamBindingOutput)
}

type ServiceIamBindingMapOutput struct{ *pulumi.OutputState }

func (ServiceIamBindingMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ServiceIamBinding)(nil)).Elem()
}

func (o ServiceIamBindingMapOutput) ToServiceIamBindingMapOutput() ServiceIamBindingMapOutput {
	return o
}

func (o ServiceIamBindingMapOutput) ToServiceIamBindingMapOutputWithContext(ctx context.Context) ServiceIamBindingMapOutput {
	return o
}

func (o ServiceIamBindingMapOutput) MapIndex(k pulumi.StringInput) ServiceIamBindingOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ServiceIamBinding {
		return vs[0].(map[string]*ServiceIamBinding)[vs[1].(string)]
	}).(ServiceIamBindingOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceIamBindingInput)(nil)).Elem(), &ServiceIamBinding{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceIamBindingArrayInput)(nil)).Elem(), ServiceIamBindingArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceIamBindingMapInput)(nil)).Elem(), ServiceIamBindingMap{})
	pulumi.RegisterOutputType(ServiceIamBindingOutput{})
	pulumi.RegisterOutputType(ServiceIamBindingArrayOutput{})
	pulumi.RegisterOutputType(ServiceIamBindingMapOutput{})
}
