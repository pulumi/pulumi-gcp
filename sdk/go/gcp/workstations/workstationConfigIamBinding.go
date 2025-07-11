// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package workstations

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Import
//
// For all import syntaxes, the "resource in question" can take any of the following forms:
//
// * projects/{{project}}/locations/{{location}}/workstationClusters/{{workstation_cluster_id}}/workstationConfigs/{{workstation_config_id}}
//
// * {{project}}/{{location}}/{{workstation_cluster_id}}/{{workstation_config_id}}
//
// * {{location}}/{{workstation_cluster_id}}/{{workstation_config_id}}
//
// * {{workstation_config_id}}
//
// Any variables not passed in the import command will be taken from the provider configuration.
//
// Cloud Workstations workstationconfig IAM resources can be imported using the resource identifiers, role, and member.
//
// IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
//
// ```sh
// $ pulumi import gcp:workstations/workstationConfigIamBinding:WorkstationConfigIamBinding editor "projects/{{project}}/locations/{{location}}/workstationClusters/{{workstation_cluster_id}}/workstationConfigs/{{workstation_config_id}} roles/viewer user:jane@example.com"
// ```
//
// IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
//
// ```sh
// $ pulumi import gcp:workstations/workstationConfigIamBinding:WorkstationConfigIamBinding editor "projects/{{project}}/locations/{{location}}/workstationClusters/{{workstation_cluster_id}}/workstationConfigs/{{workstation_config_id}} roles/viewer"
// ```
//
// IAM policy imports use the identifier of the resource in question, e.g.
//
// ```sh
// $ pulumi import gcp:workstations/workstationConfigIamBinding:WorkstationConfigIamBinding editor projects/{{project}}/locations/{{location}}/workstationClusters/{{workstation_cluster_id}}/workstationConfigs/{{workstation_config_id}}
// ```
//
// -> **Custom Roles** If you're importing a IAM resource with a custom role, make sure to use the
//
//	full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
type WorkstationConfigIamBinding struct {
	pulumi.CustomResourceState

	Condition WorkstationConfigIamBindingConditionPtrOutput `pulumi:"condition"`
	// (Computed) The etag of the IAM policy.
	Etag pulumi.StringOutput `pulumi:"etag"`
	// The location where the workstation cluster config should reside.
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
	// `workstations.WorkstationConfigIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringOutput `pulumi:"role"`
	// The ID of the parent workstation cluster.
	// Used to find the parent resource to bind the IAM policy to
	WorkstationClusterId pulumi.StringOutput `pulumi:"workstationClusterId"`
	// Used to find the parent resource to bind the IAM policy to
	WorkstationConfigId pulumi.StringOutput `pulumi:"workstationConfigId"`
}

// NewWorkstationConfigIamBinding registers a new resource with the given unique name, arguments, and options.
func NewWorkstationConfigIamBinding(ctx *pulumi.Context,
	name string, args *WorkstationConfigIamBindingArgs, opts ...pulumi.ResourceOption) (*WorkstationConfigIamBinding, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Members == nil {
		return nil, errors.New("invalid value for required argument 'Members'")
	}
	if args.Role == nil {
		return nil, errors.New("invalid value for required argument 'Role'")
	}
	if args.WorkstationClusterId == nil {
		return nil, errors.New("invalid value for required argument 'WorkstationClusterId'")
	}
	if args.WorkstationConfigId == nil {
		return nil, errors.New("invalid value for required argument 'WorkstationConfigId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource WorkstationConfigIamBinding
	err := ctx.RegisterResource("gcp:workstations/workstationConfigIamBinding:WorkstationConfigIamBinding", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetWorkstationConfigIamBinding gets an existing WorkstationConfigIamBinding resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetWorkstationConfigIamBinding(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *WorkstationConfigIamBindingState, opts ...pulumi.ResourceOption) (*WorkstationConfigIamBinding, error) {
	var resource WorkstationConfigIamBinding
	err := ctx.ReadResource("gcp:workstations/workstationConfigIamBinding:WorkstationConfigIamBinding", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering WorkstationConfigIamBinding resources.
type workstationConfigIamBindingState struct {
	Condition *WorkstationConfigIamBindingCondition `pulumi:"condition"`
	// (Computed) The etag of the IAM policy.
	Etag *string `pulumi:"etag"`
	// The location where the workstation cluster config should reside.
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
	// `workstations.WorkstationConfigIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role *string `pulumi:"role"`
	// The ID of the parent workstation cluster.
	// Used to find the parent resource to bind the IAM policy to
	WorkstationClusterId *string `pulumi:"workstationClusterId"`
	// Used to find the parent resource to bind the IAM policy to
	WorkstationConfigId *string `pulumi:"workstationConfigId"`
}

type WorkstationConfigIamBindingState struct {
	Condition WorkstationConfigIamBindingConditionPtrInput
	// (Computed) The etag of the IAM policy.
	Etag pulumi.StringPtrInput
	// The location where the workstation cluster config should reside.
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
	// `workstations.WorkstationConfigIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringPtrInput
	// The ID of the parent workstation cluster.
	// Used to find the parent resource to bind the IAM policy to
	WorkstationClusterId pulumi.StringPtrInput
	// Used to find the parent resource to bind the IAM policy to
	WorkstationConfigId pulumi.StringPtrInput
}

func (WorkstationConfigIamBindingState) ElementType() reflect.Type {
	return reflect.TypeOf((*workstationConfigIamBindingState)(nil)).Elem()
}

type workstationConfigIamBindingArgs struct {
	Condition *WorkstationConfigIamBindingCondition `pulumi:"condition"`
	// The location where the workstation cluster config should reside.
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
	// `workstations.WorkstationConfigIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role string `pulumi:"role"`
	// The ID of the parent workstation cluster.
	// Used to find the parent resource to bind the IAM policy to
	WorkstationClusterId string `pulumi:"workstationClusterId"`
	// Used to find the parent resource to bind the IAM policy to
	WorkstationConfigId string `pulumi:"workstationConfigId"`
}

// The set of arguments for constructing a WorkstationConfigIamBinding resource.
type WorkstationConfigIamBindingArgs struct {
	Condition WorkstationConfigIamBindingConditionPtrInput
	// The location where the workstation cluster config should reside.
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
	// `workstations.WorkstationConfigIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringInput
	// The ID of the parent workstation cluster.
	// Used to find the parent resource to bind the IAM policy to
	WorkstationClusterId pulumi.StringInput
	// Used to find the parent resource to bind the IAM policy to
	WorkstationConfigId pulumi.StringInput
}

func (WorkstationConfigIamBindingArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*workstationConfigIamBindingArgs)(nil)).Elem()
}

type WorkstationConfigIamBindingInput interface {
	pulumi.Input

	ToWorkstationConfigIamBindingOutput() WorkstationConfigIamBindingOutput
	ToWorkstationConfigIamBindingOutputWithContext(ctx context.Context) WorkstationConfigIamBindingOutput
}

func (*WorkstationConfigIamBinding) ElementType() reflect.Type {
	return reflect.TypeOf((**WorkstationConfigIamBinding)(nil)).Elem()
}

func (i *WorkstationConfigIamBinding) ToWorkstationConfigIamBindingOutput() WorkstationConfigIamBindingOutput {
	return i.ToWorkstationConfigIamBindingOutputWithContext(context.Background())
}

func (i *WorkstationConfigIamBinding) ToWorkstationConfigIamBindingOutputWithContext(ctx context.Context) WorkstationConfigIamBindingOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkstationConfigIamBindingOutput)
}

// WorkstationConfigIamBindingArrayInput is an input type that accepts WorkstationConfigIamBindingArray and WorkstationConfigIamBindingArrayOutput values.
// You can construct a concrete instance of `WorkstationConfigIamBindingArrayInput` via:
//
//	WorkstationConfigIamBindingArray{ WorkstationConfigIamBindingArgs{...} }
type WorkstationConfigIamBindingArrayInput interface {
	pulumi.Input

	ToWorkstationConfigIamBindingArrayOutput() WorkstationConfigIamBindingArrayOutput
	ToWorkstationConfigIamBindingArrayOutputWithContext(context.Context) WorkstationConfigIamBindingArrayOutput
}

type WorkstationConfigIamBindingArray []WorkstationConfigIamBindingInput

func (WorkstationConfigIamBindingArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WorkstationConfigIamBinding)(nil)).Elem()
}

func (i WorkstationConfigIamBindingArray) ToWorkstationConfigIamBindingArrayOutput() WorkstationConfigIamBindingArrayOutput {
	return i.ToWorkstationConfigIamBindingArrayOutputWithContext(context.Background())
}

func (i WorkstationConfigIamBindingArray) ToWorkstationConfigIamBindingArrayOutputWithContext(ctx context.Context) WorkstationConfigIamBindingArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkstationConfigIamBindingArrayOutput)
}

// WorkstationConfigIamBindingMapInput is an input type that accepts WorkstationConfigIamBindingMap and WorkstationConfigIamBindingMapOutput values.
// You can construct a concrete instance of `WorkstationConfigIamBindingMapInput` via:
//
//	WorkstationConfigIamBindingMap{ "key": WorkstationConfigIamBindingArgs{...} }
type WorkstationConfigIamBindingMapInput interface {
	pulumi.Input

	ToWorkstationConfigIamBindingMapOutput() WorkstationConfigIamBindingMapOutput
	ToWorkstationConfigIamBindingMapOutputWithContext(context.Context) WorkstationConfigIamBindingMapOutput
}

type WorkstationConfigIamBindingMap map[string]WorkstationConfigIamBindingInput

func (WorkstationConfigIamBindingMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WorkstationConfigIamBinding)(nil)).Elem()
}

func (i WorkstationConfigIamBindingMap) ToWorkstationConfigIamBindingMapOutput() WorkstationConfigIamBindingMapOutput {
	return i.ToWorkstationConfigIamBindingMapOutputWithContext(context.Background())
}

func (i WorkstationConfigIamBindingMap) ToWorkstationConfigIamBindingMapOutputWithContext(ctx context.Context) WorkstationConfigIamBindingMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkstationConfigIamBindingMapOutput)
}

type WorkstationConfigIamBindingOutput struct{ *pulumi.OutputState }

func (WorkstationConfigIamBindingOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**WorkstationConfigIamBinding)(nil)).Elem()
}

func (o WorkstationConfigIamBindingOutput) ToWorkstationConfigIamBindingOutput() WorkstationConfigIamBindingOutput {
	return o
}

func (o WorkstationConfigIamBindingOutput) ToWorkstationConfigIamBindingOutputWithContext(ctx context.Context) WorkstationConfigIamBindingOutput {
	return o
}

func (o WorkstationConfigIamBindingOutput) Condition() WorkstationConfigIamBindingConditionPtrOutput {
	return o.ApplyT(func(v *WorkstationConfigIamBinding) WorkstationConfigIamBindingConditionPtrOutput { return v.Condition }).(WorkstationConfigIamBindingConditionPtrOutput)
}

// (Computed) The etag of the IAM policy.
func (o WorkstationConfigIamBindingOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v *WorkstationConfigIamBinding) pulumi.StringOutput { return v.Etag }).(pulumi.StringOutput)
}

// The location where the workstation cluster config should reside.
// Used to find the parent resource to bind the IAM policy to. If not specified,
// the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
// location is specified, it is taken from the provider configuration.
func (o WorkstationConfigIamBindingOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *WorkstationConfigIamBinding) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
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
func (o WorkstationConfigIamBindingOutput) Members() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *WorkstationConfigIamBinding) pulumi.StringArrayOutput { return v.Members }).(pulumi.StringArrayOutput)
}

// The ID of the project in which the resource belongs.
// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
func (o WorkstationConfigIamBindingOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *WorkstationConfigIamBinding) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// The role that should be applied. Only one
// `workstations.WorkstationConfigIamBinding` can be used per role. Note that custom roles must be of the format
// `[projects|organizations]/{parent-name}/roles/{role-name}`.
func (o WorkstationConfigIamBindingOutput) Role() pulumi.StringOutput {
	return o.ApplyT(func(v *WorkstationConfigIamBinding) pulumi.StringOutput { return v.Role }).(pulumi.StringOutput)
}

// The ID of the parent workstation cluster.
// Used to find the parent resource to bind the IAM policy to
func (o WorkstationConfigIamBindingOutput) WorkstationClusterId() pulumi.StringOutput {
	return o.ApplyT(func(v *WorkstationConfigIamBinding) pulumi.StringOutput { return v.WorkstationClusterId }).(pulumi.StringOutput)
}

// Used to find the parent resource to bind the IAM policy to
func (o WorkstationConfigIamBindingOutput) WorkstationConfigId() pulumi.StringOutput {
	return o.ApplyT(func(v *WorkstationConfigIamBinding) pulumi.StringOutput { return v.WorkstationConfigId }).(pulumi.StringOutput)
}

type WorkstationConfigIamBindingArrayOutput struct{ *pulumi.OutputState }

func (WorkstationConfigIamBindingArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WorkstationConfigIamBinding)(nil)).Elem()
}

func (o WorkstationConfigIamBindingArrayOutput) ToWorkstationConfigIamBindingArrayOutput() WorkstationConfigIamBindingArrayOutput {
	return o
}

func (o WorkstationConfigIamBindingArrayOutput) ToWorkstationConfigIamBindingArrayOutputWithContext(ctx context.Context) WorkstationConfigIamBindingArrayOutput {
	return o
}

func (o WorkstationConfigIamBindingArrayOutput) Index(i pulumi.IntInput) WorkstationConfigIamBindingOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *WorkstationConfigIamBinding {
		return vs[0].([]*WorkstationConfigIamBinding)[vs[1].(int)]
	}).(WorkstationConfigIamBindingOutput)
}

type WorkstationConfigIamBindingMapOutput struct{ *pulumi.OutputState }

func (WorkstationConfigIamBindingMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WorkstationConfigIamBinding)(nil)).Elem()
}

func (o WorkstationConfigIamBindingMapOutput) ToWorkstationConfigIamBindingMapOutput() WorkstationConfigIamBindingMapOutput {
	return o
}

func (o WorkstationConfigIamBindingMapOutput) ToWorkstationConfigIamBindingMapOutputWithContext(ctx context.Context) WorkstationConfigIamBindingMapOutput {
	return o
}

func (o WorkstationConfigIamBindingMapOutput) MapIndex(k pulumi.StringInput) WorkstationConfigIamBindingOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *WorkstationConfigIamBinding {
		return vs[0].(map[string]*WorkstationConfigIamBinding)[vs[1].(string)]
	}).(WorkstationConfigIamBindingOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*WorkstationConfigIamBindingInput)(nil)).Elem(), &WorkstationConfigIamBinding{})
	pulumi.RegisterInputType(reflect.TypeOf((*WorkstationConfigIamBindingArrayInput)(nil)).Elem(), WorkstationConfigIamBindingArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*WorkstationConfigIamBindingMapInput)(nil)).Elem(), WorkstationConfigIamBindingMap{})
	pulumi.RegisterOutputType(WorkstationConfigIamBindingOutput{})
	pulumi.RegisterOutputType(WorkstationConfigIamBindingArrayOutput{})
	pulumi.RegisterOutputType(WorkstationConfigIamBindingMapOutput{})
}
