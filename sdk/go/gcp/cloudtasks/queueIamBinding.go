// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudtasks

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Three different resources help you manage your IAM policy for Cloud Tasks Queue. Each of these resources serves a different use case:
//
// * `cloudtasks.QueueIamPolicy`: Authoritative. Sets the IAM policy for the queue and replaces any existing policy already attached.
// * `cloudtasks.QueueIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the queue are preserved.
// * `cloudtasks.QueueIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the queue are preserved.
//
// > **Note:** `cloudtasks.QueueIamPolicy` **cannot** be used in conjunction with `cloudtasks.QueueIamBinding` and `cloudtasks.QueueIamMember` or they will fight over what your policy should be.
//
// > **Note:** `cloudtasks.QueueIamBinding` resources **can be** used in conjunction with `cloudtasks.QueueIamMember` resources **only if** they do not grant privilege to the same role.
//
// ## google\_cloud\_tasks\_queue\_iam\_policy
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/cloudtasks"
// 	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/organizations"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		admin, err := organizations.LookupIAMPolicy(ctx, &organizations.LookupIAMPolicyArgs{
// 			Bindings: []organizations.GetIAMPolicyBinding{
// 				organizations.GetIAMPolicyBinding{
// 					Role: "roles/viewer",
// 					Members: []string{
// 						"user:jane@example.com",
// 					},
// 				},
// 			},
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		_, err = cloudtasks.NewQueueIamPolicy(ctx, "policy", &cloudtasks.QueueIamPolicyArgs{
// 			Project:    pulumi.Any(google_cloud_tasks_queue.Default.Project),
// 			Location:   pulumi.Any(google_cloud_tasks_queue.Default.Location),
// 			PolicyData: pulumi.String(admin.PolicyData),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## google\_cloud\_tasks\_queue\_iam\_binding
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/cloudtasks"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := cloudtasks.NewQueueIamBinding(ctx, "binding", &cloudtasks.QueueIamBindingArgs{
// 			Project:  pulumi.Any(google_cloud_tasks_queue.Default.Project),
// 			Location: pulumi.Any(google_cloud_tasks_queue.Default.Location),
// 			Role:     pulumi.String("roles/viewer"),
// 			Members: pulumi.StringArray{
// 				pulumi.String("user:jane@example.com"),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## google\_cloud\_tasks\_queue\_iam\_member
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/cloudtasks"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := cloudtasks.NewQueueIamMember(ctx, "member", &cloudtasks.QueueIamMemberArgs{
// 			Project:  pulumi.Any(google_cloud_tasks_queue.Default.Project),
// 			Location: pulumi.Any(google_cloud_tasks_queue.Default.Location),
// 			Role:     pulumi.String("roles/viewer"),
// 			Member:   pulumi.String("user:jane@example.com"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// For all import syntaxes, the "resource in question" can take any of the following forms* projects/{{project}}/locations/{{location}}/queues/{{name}} * {{project}}/{{location}}/{{name}} * {{location}}/{{name}} * {{name}} Any variables not passed in the import command will be taken from the provider configuration. Cloud Tasks queue IAM resources can be imported using the resource identifiers, role, and member. IAM member imports use space-delimited identifiersthe resource in question, the role, and the member identity, e.g.
//
// ```sh
//  $ pulumi import gcp:cloudtasks/queueIamBinding:QueueIamBinding editor "projects/{{project}}/locations/{{location}}/queues/{{queue}} roles/viewer user:jane@example.com"
// ```
//
//  IAM binding imports use space-delimited identifiersthe resource in question and the role, e.g.
//
// ```sh
//  $ pulumi import gcp:cloudtasks/queueIamBinding:QueueIamBinding editor "projects/{{project}}/locations/{{location}}/queues/{{queue}} roles/viewer"
// ```
//
//  IAM policy imports use the identifier of the resource in question, e.g.
//
// ```sh
//  $ pulumi import gcp:cloudtasks/queueIamBinding:QueueIamBinding editor projects/{{project}}/locations/{{location}}/queues/{{queue}}
// ```
//
//  -> **Custom Roles**If you're importing a IAM resource with a custom role, make sure to use the
//
// full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
type QueueIamBinding struct {
	pulumi.CustomResourceState

	Condition QueueIamBindingConditionPtrOutput `pulumi:"condition"`
	// (Computed) The etag of the IAM policy.
	Etag pulumi.StringOutput `pulumi:"etag"`
	// The location of the queue Used to find the parent resource to bind the IAM policy to
	Location pulumi.StringOutput      `pulumi:"location"`
	Members  pulumi.StringArrayOutput `pulumi:"members"`
	// Used to find the parent resource to bind the IAM policy to
	Name pulumi.StringOutput `pulumi:"name"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringOutput `pulumi:"project"`
	// The role that should be applied. Only one
	// `cloudtasks.QueueIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringOutput `pulumi:"role"`
}

// NewQueueIamBinding registers a new resource with the given unique name, arguments, and options.
func NewQueueIamBinding(ctx *pulumi.Context,
	name string, args *QueueIamBindingArgs, opts ...pulumi.ResourceOption) (*QueueIamBinding, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Members == nil {
		return nil, errors.New("invalid value for required argument 'Members'")
	}
	if args.Role == nil {
		return nil, errors.New("invalid value for required argument 'Role'")
	}
	var resource QueueIamBinding
	err := ctx.RegisterResource("gcp:cloudtasks/queueIamBinding:QueueIamBinding", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetQueueIamBinding gets an existing QueueIamBinding resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetQueueIamBinding(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *QueueIamBindingState, opts ...pulumi.ResourceOption) (*QueueIamBinding, error) {
	var resource QueueIamBinding
	err := ctx.ReadResource("gcp:cloudtasks/queueIamBinding:QueueIamBinding", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering QueueIamBinding resources.
type queueIamBindingState struct {
	Condition *QueueIamBindingCondition `pulumi:"condition"`
	// (Computed) The etag of the IAM policy.
	Etag *string `pulumi:"etag"`
	// The location of the queue Used to find the parent resource to bind the IAM policy to
	Location *string  `pulumi:"location"`
	Members  []string `pulumi:"members"`
	// Used to find the parent resource to bind the IAM policy to
	Name *string `pulumi:"name"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project *string `pulumi:"project"`
	// The role that should be applied. Only one
	// `cloudtasks.QueueIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role *string `pulumi:"role"`
}

type QueueIamBindingState struct {
	Condition QueueIamBindingConditionPtrInput
	// (Computed) The etag of the IAM policy.
	Etag pulumi.StringPtrInput
	// The location of the queue Used to find the parent resource to bind the IAM policy to
	Location pulumi.StringPtrInput
	Members  pulumi.StringArrayInput
	// Used to find the parent resource to bind the IAM policy to
	Name pulumi.StringPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringPtrInput
	// The role that should be applied. Only one
	// `cloudtasks.QueueIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringPtrInput
}

func (QueueIamBindingState) ElementType() reflect.Type {
	return reflect.TypeOf((*queueIamBindingState)(nil)).Elem()
}

type queueIamBindingArgs struct {
	Condition *QueueIamBindingCondition `pulumi:"condition"`
	// The location of the queue Used to find the parent resource to bind the IAM policy to
	Location *string  `pulumi:"location"`
	Members  []string `pulumi:"members"`
	// Used to find the parent resource to bind the IAM policy to
	Name *string `pulumi:"name"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project *string `pulumi:"project"`
	// The role that should be applied. Only one
	// `cloudtasks.QueueIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role string `pulumi:"role"`
}

// The set of arguments for constructing a QueueIamBinding resource.
type QueueIamBindingArgs struct {
	Condition QueueIamBindingConditionPtrInput
	// The location of the queue Used to find the parent resource to bind the IAM policy to
	Location pulumi.StringPtrInput
	Members  pulumi.StringArrayInput
	// Used to find the parent resource to bind the IAM policy to
	Name pulumi.StringPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringPtrInput
	// The role that should be applied. Only one
	// `cloudtasks.QueueIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringInput
}

func (QueueIamBindingArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*queueIamBindingArgs)(nil)).Elem()
}

type QueueIamBindingInput interface {
	pulumi.Input

	ToQueueIamBindingOutput() QueueIamBindingOutput
	ToQueueIamBindingOutputWithContext(ctx context.Context) QueueIamBindingOutput
}

func (*QueueIamBinding) ElementType() reflect.Type {
	return reflect.TypeOf((**QueueIamBinding)(nil)).Elem()
}

func (i *QueueIamBinding) ToQueueIamBindingOutput() QueueIamBindingOutput {
	return i.ToQueueIamBindingOutputWithContext(context.Background())
}

func (i *QueueIamBinding) ToQueueIamBindingOutputWithContext(ctx context.Context) QueueIamBindingOutput {
	return pulumi.ToOutputWithContext(ctx, i).(QueueIamBindingOutput)
}

// QueueIamBindingArrayInput is an input type that accepts QueueIamBindingArray and QueueIamBindingArrayOutput values.
// You can construct a concrete instance of `QueueIamBindingArrayInput` via:
//
//          QueueIamBindingArray{ QueueIamBindingArgs{...} }
type QueueIamBindingArrayInput interface {
	pulumi.Input

	ToQueueIamBindingArrayOutput() QueueIamBindingArrayOutput
	ToQueueIamBindingArrayOutputWithContext(context.Context) QueueIamBindingArrayOutput
}

type QueueIamBindingArray []QueueIamBindingInput

func (QueueIamBindingArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*QueueIamBinding)(nil)).Elem()
}

func (i QueueIamBindingArray) ToQueueIamBindingArrayOutput() QueueIamBindingArrayOutput {
	return i.ToQueueIamBindingArrayOutputWithContext(context.Background())
}

func (i QueueIamBindingArray) ToQueueIamBindingArrayOutputWithContext(ctx context.Context) QueueIamBindingArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(QueueIamBindingArrayOutput)
}

// QueueIamBindingMapInput is an input type that accepts QueueIamBindingMap and QueueIamBindingMapOutput values.
// You can construct a concrete instance of `QueueIamBindingMapInput` via:
//
//          QueueIamBindingMap{ "key": QueueIamBindingArgs{...} }
type QueueIamBindingMapInput interface {
	pulumi.Input

	ToQueueIamBindingMapOutput() QueueIamBindingMapOutput
	ToQueueIamBindingMapOutputWithContext(context.Context) QueueIamBindingMapOutput
}

type QueueIamBindingMap map[string]QueueIamBindingInput

func (QueueIamBindingMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*QueueIamBinding)(nil)).Elem()
}

func (i QueueIamBindingMap) ToQueueIamBindingMapOutput() QueueIamBindingMapOutput {
	return i.ToQueueIamBindingMapOutputWithContext(context.Background())
}

func (i QueueIamBindingMap) ToQueueIamBindingMapOutputWithContext(ctx context.Context) QueueIamBindingMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(QueueIamBindingMapOutput)
}

type QueueIamBindingOutput struct{ *pulumi.OutputState }

func (QueueIamBindingOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**QueueIamBinding)(nil)).Elem()
}

func (o QueueIamBindingOutput) ToQueueIamBindingOutput() QueueIamBindingOutput {
	return o
}

func (o QueueIamBindingOutput) ToQueueIamBindingOutputWithContext(ctx context.Context) QueueIamBindingOutput {
	return o
}

func (o QueueIamBindingOutput) Condition() QueueIamBindingConditionPtrOutput {
	return o.ApplyT(func(v *QueueIamBinding) QueueIamBindingConditionPtrOutput { return v.Condition }).(QueueIamBindingConditionPtrOutput)
}

// (Computed) The etag of the IAM policy.
func (o QueueIamBindingOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v *QueueIamBinding) pulumi.StringOutput { return v.Etag }).(pulumi.StringOutput)
}

// The location of the queue Used to find the parent resource to bind the IAM policy to
func (o QueueIamBindingOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *QueueIamBinding) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

func (o QueueIamBindingOutput) Members() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *QueueIamBinding) pulumi.StringArrayOutput { return v.Members }).(pulumi.StringArrayOutput)
}

// Used to find the parent resource to bind the IAM policy to
func (o QueueIamBindingOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *QueueIamBinding) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The ID of the project in which the resource belongs.
// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
func (o QueueIamBindingOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *QueueIamBinding) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// The role that should be applied. Only one
// `cloudtasks.QueueIamBinding` can be used per role. Note that custom roles must be of the format
// `[projects|organizations]/{parent-name}/roles/{role-name}`.
func (o QueueIamBindingOutput) Role() pulumi.StringOutput {
	return o.ApplyT(func(v *QueueIamBinding) pulumi.StringOutput { return v.Role }).(pulumi.StringOutput)
}

type QueueIamBindingArrayOutput struct{ *pulumi.OutputState }

func (QueueIamBindingArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*QueueIamBinding)(nil)).Elem()
}

func (o QueueIamBindingArrayOutput) ToQueueIamBindingArrayOutput() QueueIamBindingArrayOutput {
	return o
}

func (o QueueIamBindingArrayOutput) ToQueueIamBindingArrayOutputWithContext(ctx context.Context) QueueIamBindingArrayOutput {
	return o
}

func (o QueueIamBindingArrayOutput) Index(i pulumi.IntInput) QueueIamBindingOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *QueueIamBinding {
		return vs[0].([]*QueueIamBinding)[vs[1].(int)]
	}).(QueueIamBindingOutput)
}

type QueueIamBindingMapOutput struct{ *pulumi.OutputState }

func (QueueIamBindingMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*QueueIamBinding)(nil)).Elem()
}

func (o QueueIamBindingMapOutput) ToQueueIamBindingMapOutput() QueueIamBindingMapOutput {
	return o
}

func (o QueueIamBindingMapOutput) ToQueueIamBindingMapOutputWithContext(ctx context.Context) QueueIamBindingMapOutput {
	return o
}

func (o QueueIamBindingMapOutput) MapIndex(k pulumi.StringInput) QueueIamBindingOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *QueueIamBinding {
		return vs[0].(map[string]*QueueIamBinding)[vs[1].(string)]
	}).(QueueIamBindingOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*QueueIamBindingInput)(nil)).Elem(), &QueueIamBinding{})
	pulumi.RegisterInputType(reflect.TypeOf((*QueueIamBindingArrayInput)(nil)).Elem(), QueueIamBindingArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*QueueIamBindingMapInput)(nil)).Elem(), QueueIamBindingMap{})
	pulumi.RegisterOutputType(QueueIamBindingOutput{})
	pulumi.RegisterOutputType(QueueIamBindingArrayOutput{})
	pulumi.RegisterOutputType(QueueIamBindingMapOutput{})
}