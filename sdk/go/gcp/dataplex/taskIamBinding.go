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

// Three different resources help you manage your IAM policy for Dataplex Task. Each of these resources serves a different use case:
//
// * `dataplex.TaskIamPolicy`: Authoritative. Sets the IAM policy for the task and replaces any existing policy already attached.
// * `dataplex.TaskIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the task are preserved.
// * `dataplex.TaskIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the task are preserved.
//
// # A data source can be used to retrieve policy data in advent you do not need creation
//
// * `dataplex.TaskIamPolicy`: Retrieves the IAM policy for the task
//
// > **Note:** `dataplex.TaskIamPolicy` **cannot** be used in conjunction with `dataplex.TaskIamBinding` and `dataplex.TaskIamMember` or they will fight over what your policy should be.
//
// > **Note:** `dataplex.TaskIamBinding` resources **can be** used in conjunction with `dataplex.TaskIamMember` resources **only if** they do not grant privilege to the same role.
//
// ## dataplex.TaskIamPolicy
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
//			_, err = dataplex.NewTaskIamPolicy(ctx, "policy", &dataplex.TaskIamPolicyArgs{
//				Project:    pulumi.Any(example.Project),
//				Location:   pulumi.Any(example.Location),
//				Lake:       pulumi.Any(example.Lake),
//				TaskId:     pulumi.Any(example.TaskId),
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
// ## dataplex.TaskIamBinding
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
//			_, err := dataplex.NewTaskIamBinding(ctx, "binding", &dataplex.TaskIamBindingArgs{
//				Project:  pulumi.Any(example.Project),
//				Location: pulumi.Any(example.Location),
//				Lake:     pulumi.Any(example.Lake),
//				TaskId:   pulumi.Any(example.TaskId),
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
// ## dataplex.TaskIamMember
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
//			_, err := dataplex.NewTaskIamMember(ctx, "member", &dataplex.TaskIamMemberArgs{
//				Project:  pulumi.Any(example.Project),
//				Location: pulumi.Any(example.Location),
//				Lake:     pulumi.Any(example.Lake),
//				TaskId:   pulumi.Any(example.TaskId),
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
// # IAM policy for Dataplex Task
// Three different resources help you manage your IAM policy for Dataplex Task. Each of these resources serves a different use case:
//
// * `dataplex.TaskIamPolicy`: Authoritative. Sets the IAM policy for the task and replaces any existing policy already attached.
// * `dataplex.TaskIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the task are preserved.
// * `dataplex.TaskIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the task are preserved.
//
// # A data source can be used to retrieve policy data in advent you do not need creation
//
// * `dataplex.TaskIamPolicy`: Retrieves the IAM policy for the task
//
// > **Note:** `dataplex.TaskIamPolicy` **cannot** be used in conjunction with `dataplex.TaskIamBinding` and `dataplex.TaskIamMember` or they will fight over what your policy should be.
//
// > **Note:** `dataplex.TaskIamBinding` resources **can be** used in conjunction with `dataplex.TaskIamMember` resources **only if** they do not grant privilege to the same role.
//
// ## dataplex.TaskIamPolicy
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
//			_, err = dataplex.NewTaskIamPolicy(ctx, "policy", &dataplex.TaskIamPolicyArgs{
//				Project:    pulumi.Any(example.Project),
//				Location:   pulumi.Any(example.Location),
//				Lake:       pulumi.Any(example.Lake),
//				TaskId:     pulumi.Any(example.TaskId),
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
// ## dataplex.TaskIamBinding
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
//			_, err := dataplex.NewTaskIamBinding(ctx, "binding", &dataplex.TaskIamBindingArgs{
//				Project:  pulumi.Any(example.Project),
//				Location: pulumi.Any(example.Location),
//				Lake:     pulumi.Any(example.Lake),
//				TaskId:   pulumi.Any(example.TaskId),
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
// ## dataplex.TaskIamMember
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
//			_, err := dataplex.NewTaskIamMember(ctx, "member", &dataplex.TaskIamMemberArgs{
//				Project:  pulumi.Any(example.Project),
//				Location: pulumi.Any(example.Location),
//				Lake:     pulumi.Any(example.Lake),
//				TaskId:   pulumi.Any(example.TaskId),
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
// * projects/{{project}}/locations/{{location}}/lakes/{{lake}}/tasks/{{task_id}}
//
// * {{project}}/{{location}}/{{lake}}/{{task_id}}
//
// * {{location}}/{{lake}}/{{task_id}}
//
// * {{task_id}}
//
// Any variables not passed in the import command will be taken from the provider configuration.
//
// Dataplex task IAM resources can be imported using the resource identifiers, role, and member.
//
// IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
//
// ```sh
// $ pulumi import gcp:dataplex/taskIamBinding:TaskIamBinding editor "projects/{{project}}/locations/{{location}}/lakes/{{lake}}/tasks/{{task_id}} roles/viewer user:jane@example.com"
// ```
//
// IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
//
// ```sh
// $ pulumi import gcp:dataplex/taskIamBinding:TaskIamBinding editor "projects/{{project}}/locations/{{location}}/lakes/{{lake}}/tasks/{{task_id}} roles/viewer"
// ```
//
// IAM policy imports use the identifier of the resource in question, e.g.
//
// ```sh
// $ pulumi import gcp:dataplex/taskIamBinding:TaskIamBinding editor projects/{{project}}/locations/{{location}}/lakes/{{lake}}/tasks/{{task_id}}
// ```
//
// -> **Custom Roles** If you're importing a IAM resource with a custom role, make sure to use the
//
//	full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
type TaskIamBinding struct {
	pulumi.CustomResourceState

	Condition TaskIamBindingConditionPtrOutput `pulumi:"condition"`
	// (Computed) The etag of the IAM policy.
	Etag pulumi.StringOutput `pulumi:"etag"`
	// The lake in which the task will be created in.
	// Used to find the parent resource to bind the IAM policy to
	Lake pulumi.StringOutput `pulumi:"lake"`
	// The location in which the task will be created in.
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
	Members pulumi.StringArrayOutput `pulumi:"members"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringOutput `pulumi:"project"`
	// The role that should be applied. Only one
	// `dataplex.TaskIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringOutput `pulumi:"role"`
	// Used to find the parent resource to bind the IAM policy to
	TaskId pulumi.StringOutput `pulumi:"taskId"`
}

// NewTaskIamBinding registers a new resource with the given unique name, arguments, and options.
func NewTaskIamBinding(ctx *pulumi.Context,
	name string, args *TaskIamBindingArgs, opts ...pulumi.ResourceOption) (*TaskIamBinding, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Lake == nil {
		return nil, errors.New("invalid value for required argument 'Lake'")
	}
	if args.Members == nil {
		return nil, errors.New("invalid value for required argument 'Members'")
	}
	if args.Role == nil {
		return nil, errors.New("invalid value for required argument 'Role'")
	}
	if args.TaskId == nil {
		return nil, errors.New("invalid value for required argument 'TaskId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource TaskIamBinding
	err := ctx.RegisterResource("gcp:dataplex/taskIamBinding:TaskIamBinding", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTaskIamBinding gets an existing TaskIamBinding resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTaskIamBinding(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TaskIamBindingState, opts ...pulumi.ResourceOption) (*TaskIamBinding, error) {
	var resource TaskIamBinding
	err := ctx.ReadResource("gcp:dataplex/taskIamBinding:TaskIamBinding", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering TaskIamBinding resources.
type taskIamBindingState struct {
	Condition *TaskIamBindingCondition `pulumi:"condition"`
	// (Computed) The etag of the IAM policy.
	Etag *string `pulumi:"etag"`
	// The lake in which the task will be created in.
	// Used to find the parent resource to bind the IAM policy to
	Lake *string `pulumi:"lake"`
	// The location in which the task will be created in.
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
	Members []string `pulumi:"members"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project *string `pulumi:"project"`
	// The role that should be applied. Only one
	// `dataplex.TaskIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role *string `pulumi:"role"`
	// Used to find the parent resource to bind the IAM policy to
	TaskId *string `pulumi:"taskId"`
}

type TaskIamBindingState struct {
	Condition TaskIamBindingConditionPtrInput
	// (Computed) The etag of the IAM policy.
	Etag pulumi.StringPtrInput
	// The lake in which the task will be created in.
	// Used to find the parent resource to bind the IAM policy to
	Lake pulumi.StringPtrInput
	// The location in which the task will be created in.
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
	Members pulumi.StringArrayInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringPtrInput
	// The role that should be applied. Only one
	// `dataplex.TaskIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringPtrInput
	// Used to find the parent resource to bind the IAM policy to
	TaskId pulumi.StringPtrInput
}

func (TaskIamBindingState) ElementType() reflect.Type {
	return reflect.TypeOf((*taskIamBindingState)(nil)).Elem()
}

type taskIamBindingArgs struct {
	Condition *TaskIamBindingCondition `pulumi:"condition"`
	// The lake in which the task will be created in.
	// Used to find the parent resource to bind the IAM policy to
	Lake string `pulumi:"lake"`
	// The location in which the task will be created in.
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
	Members []string `pulumi:"members"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project *string `pulumi:"project"`
	// The role that should be applied. Only one
	// `dataplex.TaskIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role string `pulumi:"role"`
	// Used to find the parent resource to bind the IAM policy to
	TaskId string `pulumi:"taskId"`
}

// The set of arguments for constructing a TaskIamBinding resource.
type TaskIamBindingArgs struct {
	Condition TaskIamBindingConditionPtrInput
	// The lake in which the task will be created in.
	// Used to find the parent resource to bind the IAM policy to
	Lake pulumi.StringInput
	// The location in which the task will be created in.
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
	Members pulumi.StringArrayInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringPtrInput
	// The role that should be applied. Only one
	// `dataplex.TaskIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringInput
	// Used to find the parent resource to bind the IAM policy to
	TaskId pulumi.StringInput
}

func (TaskIamBindingArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*taskIamBindingArgs)(nil)).Elem()
}

type TaskIamBindingInput interface {
	pulumi.Input

	ToTaskIamBindingOutput() TaskIamBindingOutput
	ToTaskIamBindingOutputWithContext(ctx context.Context) TaskIamBindingOutput
}

func (*TaskIamBinding) ElementType() reflect.Type {
	return reflect.TypeOf((**TaskIamBinding)(nil)).Elem()
}

func (i *TaskIamBinding) ToTaskIamBindingOutput() TaskIamBindingOutput {
	return i.ToTaskIamBindingOutputWithContext(context.Background())
}

func (i *TaskIamBinding) ToTaskIamBindingOutputWithContext(ctx context.Context) TaskIamBindingOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TaskIamBindingOutput)
}

// TaskIamBindingArrayInput is an input type that accepts TaskIamBindingArray and TaskIamBindingArrayOutput values.
// You can construct a concrete instance of `TaskIamBindingArrayInput` via:
//
//	TaskIamBindingArray{ TaskIamBindingArgs{...} }
type TaskIamBindingArrayInput interface {
	pulumi.Input

	ToTaskIamBindingArrayOutput() TaskIamBindingArrayOutput
	ToTaskIamBindingArrayOutputWithContext(context.Context) TaskIamBindingArrayOutput
}

type TaskIamBindingArray []TaskIamBindingInput

func (TaskIamBindingArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TaskIamBinding)(nil)).Elem()
}

func (i TaskIamBindingArray) ToTaskIamBindingArrayOutput() TaskIamBindingArrayOutput {
	return i.ToTaskIamBindingArrayOutputWithContext(context.Background())
}

func (i TaskIamBindingArray) ToTaskIamBindingArrayOutputWithContext(ctx context.Context) TaskIamBindingArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TaskIamBindingArrayOutput)
}

// TaskIamBindingMapInput is an input type that accepts TaskIamBindingMap and TaskIamBindingMapOutput values.
// You can construct a concrete instance of `TaskIamBindingMapInput` via:
//
//	TaskIamBindingMap{ "key": TaskIamBindingArgs{...} }
type TaskIamBindingMapInput interface {
	pulumi.Input

	ToTaskIamBindingMapOutput() TaskIamBindingMapOutput
	ToTaskIamBindingMapOutputWithContext(context.Context) TaskIamBindingMapOutput
}

type TaskIamBindingMap map[string]TaskIamBindingInput

func (TaskIamBindingMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TaskIamBinding)(nil)).Elem()
}

func (i TaskIamBindingMap) ToTaskIamBindingMapOutput() TaskIamBindingMapOutput {
	return i.ToTaskIamBindingMapOutputWithContext(context.Background())
}

func (i TaskIamBindingMap) ToTaskIamBindingMapOutputWithContext(ctx context.Context) TaskIamBindingMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TaskIamBindingMapOutput)
}

type TaskIamBindingOutput struct{ *pulumi.OutputState }

func (TaskIamBindingOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**TaskIamBinding)(nil)).Elem()
}

func (o TaskIamBindingOutput) ToTaskIamBindingOutput() TaskIamBindingOutput {
	return o
}

func (o TaskIamBindingOutput) ToTaskIamBindingOutputWithContext(ctx context.Context) TaskIamBindingOutput {
	return o
}

func (o TaskIamBindingOutput) Condition() TaskIamBindingConditionPtrOutput {
	return o.ApplyT(func(v *TaskIamBinding) TaskIamBindingConditionPtrOutput { return v.Condition }).(TaskIamBindingConditionPtrOutput)
}

// (Computed) The etag of the IAM policy.
func (o TaskIamBindingOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v *TaskIamBinding) pulumi.StringOutput { return v.Etag }).(pulumi.StringOutput)
}

// The lake in which the task will be created in.
// Used to find the parent resource to bind the IAM policy to
func (o TaskIamBindingOutput) Lake() pulumi.StringOutput {
	return o.ApplyT(func(v *TaskIamBinding) pulumi.StringOutput { return v.Lake }).(pulumi.StringOutput)
}

// The location in which the task will be created in.
// Used to find the parent resource to bind the IAM policy to. If not specified,
// the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
// location is specified, it is taken from the provider configuration.
func (o TaskIamBindingOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *TaskIamBinding) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
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
func (o TaskIamBindingOutput) Members() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *TaskIamBinding) pulumi.StringArrayOutput { return v.Members }).(pulumi.StringArrayOutput)
}

// The ID of the project in which the resource belongs.
// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
func (o TaskIamBindingOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *TaskIamBinding) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// The role that should be applied. Only one
// `dataplex.TaskIamBinding` can be used per role. Note that custom roles must be of the format
// `[projects|organizations]/{parent-name}/roles/{role-name}`.
func (o TaskIamBindingOutput) Role() pulumi.StringOutput {
	return o.ApplyT(func(v *TaskIamBinding) pulumi.StringOutput { return v.Role }).(pulumi.StringOutput)
}

// Used to find the parent resource to bind the IAM policy to
func (o TaskIamBindingOutput) TaskId() pulumi.StringOutput {
	return o.ApplyT(func(v *TaskIamBinding) pulumi.StringOutput { return v.TaskId }).(pulumi.StringOutput)
}

type TaskIamBindingArrayOutput struct{ *pulumi.OutputState }

func (TaskIamBindingArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TaskIamBinding)(nil)).Elem()
}

func (o TaskIamBindingArrayOutput) ToTaskIamBindingArrayOutput() TaskIamBindingArrayOutput {
	return o
}

func (o TaskIamBindingArrayOutput) ToTaskIamBindingArrayOutputWithContext(ctx context.Context) TaskIamBindingArrayOutput {
	return o
}

func (o TaskIamBindingArrayOutput) Index(i pulumi.IntInput) TaskIamBindingOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *TaskIamBinding {
		return vs[0].([]*TaskIamBinding)[vs[1].(int)]
	}).(TaskIamBindingOutput)
}

type TaskIamBindingMapOutput struct{ *pulumi.OutputState }

func (TaskIamBindingMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TaskIamBinding)(nil)).Elem()
}

func (o TaskIamBindingMapOutput) ToTaskIamBindingMapOutput() TaskIamBindingMapOutput {
	return o
}

func (o TaskIamBindingMapOutput) ToTaskIamBindingMapOutputWithContext(ctx context.Context) TaskIamBindingMapOutput {
	return o
}

func (o TaskIamBindingMapOutput) MapIndex(k pulumi.StringInput) TaskIamBindingOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *TaskIamBinding {
		return vs[0].(map[string]*TaskIamBinding)[vs[1].(string)]
	}).(TaskIamBindingOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TaskIamBindingInput)(nil)).Elem(), &TaskIamBinding{})
	pulumi.RegisterInputType(reflect.TypeOf((*TaskIamBindingArrayInput)(nil)).Elem(), TaskIamBindingArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TaskIamBindingMapInput)(nil)).Elem(), TaskIamBindingMap{})
	pulumi.RegisterOutputType(TaskIamBindingOutput{})
	pulumi.RegisterOutputType(TaskIamBindingArrayOutput{})
	pulumi.RegisterOutputType(TaskIamBindingMapOutput{})
}
