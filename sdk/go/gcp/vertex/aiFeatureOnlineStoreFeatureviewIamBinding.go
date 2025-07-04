// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package vertex

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
// * {{feature_online_store}}/featureViews/{{name}}
//
// * {{feature_online_store}}/{{name}}
//
// * {{name}}
//
// Any variables not passed in the import command will be taken from the provider configuration.
//
// Vertex AI featureonlinestorefeatureview IAM resources can be imported using the resource identifiers, role, and member.
//
// IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
//
// ```sh
// $ pulumi import gcp:vertex/aiFeatureOnlineStoreFeatureviewIamBinding:AiFeatureOnlineStoreFeatureviewIamBinding editor "{{feature_online_store}}/featureViews/{{feature_online_store_featureview}} roles/viewer user:jane@example.com"
// ```
//
// IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
//
// ```sh
// $ pulumi import gcp:vertex/aiFeatureOnlineStoreFeatureviewIamBinding:AiFeatureOnlineStoreFeatureviewIamBinding editor "{{feature_online_store}}/featureViews/{{feature_online_store_featureview}} roles/viewer"
// ```
//
// IAM policy imports use the identifier of the resource in question, e.g.
//
// ```sh
// $ pulumi import gcp:vertex/aiFeatureOnlineStoreFeatureviewIamBinding:AiFeatureOnlineStoreFeatureviewIamBinding editor {{feature_online_store}}/featureViews/{{feature_online_store_featureview}}
// ```
//
// -> **Custom Roles** If you're importing a IAM resource with a custom role, make sure to use the
//
//	full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
type AiFeatureOnlineStoreFeatureviewIamBinding struct {
	pulumi.CustomResourceState

	Condition AiFeatureOnlineStoreFeatureviewIamBindingConditionPtrOutput `pulumi:"condition"`
	// (Computed) The etag of the IAM policy.
	Etag pulumi.StringOutput `pulumi:"etag"`
	// The name of the FeatureOnlineStore to use for the featureview. Used to find the parent resource to bind the IAM policy to
	FeatureOnlineStore pulumi.StringOutput `pulumi:"featureOnlineStore"`
	// Used to find the parent resource to bind the IAM policy to
	FeatureView pulumi.StringOutput `pulumi:"featureView"`
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
	// The region for the resource. It should be the same as the featureonlinestore region. Used to find the parent resource to bind the IAM policy to. If not specified,
	// the value will be parsed from the identifier of the parent resource. If no region is provided in the parent identifier and no
	// region is specified, it is taken from the provider configuration.
	Region pulumi.StringOutput `pulumi:"region"`
	// The role that should be applied. Only one
	// `vertex.AiFeatureOnlineStoreFeatureviewIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringOutput `pulumi:"role"`
}

// NewAiFeatureOnlineStoreFeatureviewIamBinding registers a new resource with the given unique name, arguments, and options.
func NewAiFeatureOnlineStoreFeatureviewIamBinding(ctx *pulumi.Context,
	name string, args *AiFeatureOnlineStoreFeatureviewIamBindingArgs, opts ...pulumi.ResourceOption) (*AiFeatureOnlineStoreFeatureviewIamBinding, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.FeatureOnlineStore == nil {
		return nil, errors.New("invalid value for required argument 'FeatureOnlineStore'")
	}
	if args.FeatureView == nil {
		return nil, errors.New("invalid value for required argument 'FeatureView'")
	}
	if args.Members == nil {
		return nil, errors.New("invalid value for required argument 'Members'")
	}
	if args.Role == nil {
		return nil, errors.New("invalid value for required argument 'Role'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AiFeatureOnlineStoreFeatureviewIamBinding
	err := ctx.RegisterResource("gcp:vertex/aiFeatureOnlineStoreFeatureviewIamBinding:AiFeatureOnlineStoreFeatureviewIamBinding", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAiFeatureOnlineStoreFeatureviewIamBinding gets an existing AiFeatureOnlineStoreFeatureviewIamBinding resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAiFeatureOnlineStoreFeatureviewIamBinding(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AiFeatureOnlineStoreFeatureviewIamBindingState, opts ...pulumi.ResourceOption) (*AiFeatureOnlineStoreFeatureviewIamBinding, error) {
	var resource AiFeatureOnlineStoreFeatureviewIamBinding
	err := ctx.ReadResource("gcp:vertex/aiFeatureOnlineStoreFeatureviewIamBinding:AiFeatureOnlineStoreFeatureviewIamBinding", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AiFeatureOnlineStoreFeatureviewIamBinding resources.
type aiFeatureOnlineStoreFeatureviewIamBindingState struct {
	Condition *AiFeatureOnlineStoreFeatureviewIamBindingCondition `pulumi:"condition"`
	// (Computed) The etag of the IAM policy.
	Etag *string `pulumi:"etag"`
	// The name of the FeatureOnlineStore to use for the featureview. Used to find the parent resource to bind the IAM policy to
	FeatureOnlineStore *string `pulumi:"featureOnlineStore"`
	// Used to find the parent resource to bind the IAM policy to
	FeatureView *string `pulumi:"featureView"`
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
	// The region for the resource. It should be the same as the featureonlinestore region. Used to find the parent resource to bind the IAM policy to. If not specified,
	// the value will be parsed from the identifier of the parent resource. If no region is provided in the parent identifier and no
	// region is specified, it is taken from the provider configuration.
	Region *string `pulumi:"region"`
	// The role that should be applied. Only one
	// `vertex.AiFeatureOnlineStoreFeatureviewIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role *string `pulumi:"role"`
}

type AiFeatureOnlineStoreFeatureviewIamBindingState struct {
	Condition AiFeatureOnlineStoreFeatureviewIamBindingConditionPtrInput
	// (Computed) The etag of the IAM policy.
	Etag pulumi.StringPtrInput
	// The name of the FeatureOnlineStore to use for the featureview. Used to find the parent resource to bind the IAM policy to
	FeatureOnlineStore pulumi.StringPtrInput
	// Used to find the parent resource to bind the IAM policy to
	FeatureView pulumi.StringPtrInput
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
	// The region for the resource. It should be the same as the featureonlinestore region. Used to find the parent resource to bind the IAM policy to. If not specified,
	// the value will be parsed from the identifier of the parent resource. If no region is provided in the parent identifier and no
	// region is specified, it is taken from the provider configuration.
	Region pulumi.StringPtrInput
	// The role that should be applied. Only one
	// `vertex.AiFeatureOnlineStoreFeatureviewIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringPtrInput
}

func (AiFeatureOnlineStoreFeatureviewIamBindingState) ElementType() reflect.Type {
	return reflect.TypeOf((*aiFeatureOnlineStoreFeatureviewIamBindingState)(nil)).Elem()
}

type aiFeatureOnlineStoreFeatureviewIamBindingArgs struct {
	Condition *AiFeatureOnlineStoreFeatureviewIamBindingCondition `pulumi:"condition"`
	// The name of the FeatureOnlineStore to use for the featureview. Used to find the parent resource to bind the IAM policy to
	FeatureOnlineStore string `pulumi:"featureOnlineStore"`
	// Used to find the parent resource to bind the IAM policy to
	FeatureView string `pulumi:"featureView"`
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
	// The region for the resource. It should be the same as the featureonlinestore region. Used to find the parent resource to bind the IAM policy to. If not specified,
	// the value will be parsed from the identifier of the parent resource. If no region is provided in the parent identifier and no
	// region is specified, it is taken from the provider configuration.
	Region *string `pulumi:"region"`
	// The role that should be applied. Only one
	// `vertex.AiFeatureOnlineStoreFeatureviewIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role string `pulumi:"role"`
}

// The set of arguments for constructing a AiFeatureOnlineStoreFeatureviewIamBinding resource.
type AiFeatureOnlineStoreFeatureviewIamBindingArgs struct {
	Condition AiFeatureOnlineStoreFeatureviewIamBindingConditionPtrInput
	// The name of the FeatureOnlineStore to use for the featureview. Used to find the parent resource to bind the IAM policy to
	FeatureOnlineStore pulumi.StringInput
	// Used to find the parent resource to bind the IAM policy to
	FeatureView pulumi.StringInput
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
	// The region for the resource. It should be the same as the featureonlinestore region. Used to find the parent resource to bind the IAM policy to. If not specified,
	// the value will be parsed from the identifier of the parent resource. If no region is provided in the parent identifier and no
	// region is specified, it is taken from the provider configuration.
	Region pulumi.StringPtrInput
	// The role that should be applied. Only one
	// `vertex.AiFeatureOnlineStoreFeatureviewIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringInput
}

func (AiFeatureOnlineStoreFeatureviewIamBindingArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*aiFeatureOnlineStoreFeatureviewIamBindingArgs)(nil)).Elem()
}

type AiFeatureOnlineStoreFeatureviewIamBindingInput interface {
	pulumi.Input

	ToAiFeatureOnlineStoreFeatureviewIamBindingOutput() AiFeatureOnlineStoreFeatureviewIamBindingOutput
	ToAiFeatureOnlineStoreFeatureviewIamBindingOutputWithContext(ctx context.Context) AiFeatureOnlineStoreFeatureviewIamBindingOutput
}

func (*AiFeatureOnlineStoreFeatureviewIamBinding) ElementType() reflect.Type {
	return reflect.TypeOf((**AiFeatureOnlineStoreFeatureviewIamBinding)(nil)).Elem()
}

func (i *AiFeatureOnlineStoreFeatureviewIamBinding) ToAiFeatureOnlineStoreFeatureviewIamBindingOutput() AiFeatureOnlineStoreFeatureviewIamBindingOutput {
	return i.ToAiFeatureOnlineStoreFeatureviewIamBindingOutputWithContext(context.Background())
}

func (i *AiFeatureOnlineStoreFeatureviewIamBinding) ToAiFeatureOnlineStoreFeatureviewIamBindingOutputWithContext(ctx context.Context) AiFeatureOnlineStoreFeatureviewIamBindingOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AiFeatureOnlineStoreFeatureviewIamBindingOutput)
}

// AiFeatureOnlineStoreFeatureviewIamBindingArrayInput is an input type that accepts AiFeatureOnlineStoreFeatureviewIamBindingArray and AiFeatureOnlineStoreFeatureviewIamBindingArrayOutput values.
// You can construct a concrete instance of `AiFeatureOnlineStoreFeatureviewIamBindingArrayInput` via:
//
//	AiFeatureOnlineStoreFeatureviewIamBindingArray{ AiFeatureOnlineStoreFeatureviewIamBindingArgs{...} }
type AiFeatureOnlineStoreFeatureviewIamBindingArrayInput interface {
	pulumi.Input

	ToAiFeatureOnlineStoreFeatureviewIamBindingArrayOutput() AiFeatureOnlineStoreFeatureviewIamBindingArrayOutput
	ToAiFeatureOnlineStoreFeatureviewIamBindingArrayOutputWithContext(context.Context) AiFeatureOnlineStoreFeatureviewIamBindingArrayOutput
}

type AiFeatureOnlineStoreFeatureviewIamBindingArray []AiFeatureOnlineStoreFeatureviewIamBindingInput

func (AiFeatureOnlineStoreFeatureviewIamBindingArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AiFeatureOnlineStoreFeatureviewIamBinding)(nil)).Elem()
}

func (i AiFeatureOnlineStoreFeatureviewIamBindingArray) ToAiFeatureOnlineStoreFeatureviewIamBindingArrayOutput() AiFeatureOnlineStoreFeatureviewIamBindingArrayOutput {
	return i.ToAiFeatureOnlineStoreFeatureviewIamBindingArrayOutputWithContext(context.Background())
}

func (i AiFeatureOnlineStoreFeatureviewIamBindingArray) ToAiFeatureOnlineStoreFeatureviewIamBindingArrayOutputWithContext(ctx context.Context) AiFeatureOnlineStoreFeatureviewIamBindingArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AiFeatureOnlineStoreFeatureviewIamBindingArrayOutput)
}

// AiFeatureOnlineStoreFeatureviewIamBindingMapInput is an input type that accepts AiFeatureOnlineStoreFeatureviewIamBindingMap and AiFeatureOnlineStoreFeatureviewIamBindingMapOutput values.
// You can construct a concrete instance of `AiFeatureOnlineStoreFeatureviewIamBindingMapInput` via:
//
//	AiFeatureOnlineStoreFeatureviewIamBindingMap{ "key": AiFeatureOnlineStoreFeatureviewIamBindingArgs{...} }
type AiFeatureOnlineStoreFeatureviewIamBindingMapInput interface {
	pulumi.Input

	ToAiFeatureOnlineStoreFeatureviewIamBindingMapOutput() AiFeatureOnlineStoreFeatureviewIamBindingMapOutput
	ToAiFeatureOnlineStoreFeatureviewIamBindingMapOutputWithContext(context.Context) AiFeatureOnlineStoreFeatureviewIamBindingMapOutput
}

type AiFeatureOnlineStoreFeatureviewIamBindingMap map[string]AiFeatureOnlineStoreFeatureviewIamBindingInput

func (AiFeatureOnlineStoreFeatureviewIamBindingMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AiFeatureOnlineStoreFeatureviewIamBinding)(nil)).Elem()
}

func (i AiFeatureOnlineStoreFeatureviewIamBindingMap) ToAiFeatureOnlineStoreFeatureviewIamBindingMapOutput() AiFeatureOnlineStoreFeatureviewIamBindingMapOutput {
	return i.ToAiFeatureOnlineStoreFeatureviewIamBindingMapOutputWithContext(context.Background())
}

func (i AiFeatureOnlineStoreFeatureviewIamBindingMap) ToAiFeatureOnlineStoreFeatureviewIamBindingMapOutputWithContext(ctx context.Context) AiFeatureOnlineStoreFeatureviewIamBindingMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AiFeatureOnlineStoreFeatureviewIamBindingMapOutput)
}

type AiFeatureOnlineStoreFeatureviewIamBindingOutput struct{ *pulumi.OutputState }

func (AiFeatureOnlineStoreFeatureviewIamBindingOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AiFeatureOnlineStoreFeatureviewIamBinding)(nil)).Elem()
}

func (o AiFeatureOnlineStoreFeatureviewIamBindingOutput) ToAiFeatureOnlineStoreFeatureviewIamBindingOutput() AiFeatureOnlineStoreFeatureviewIamBindingOutput {
	return o
}

func (o AiFeatureOnlineStoreFeatureviewIamBindingOutput) ToAiFeatureOnlineStoreFeatureviewIamBindingOutputWithContext(ctx context.Context) AiFeatureOnlineStoreFeatureviewIamBindingOutput {
	return o
}

func (o AiFeatureOnlineStoreFeatureviewIamBindingOutput) Condition() AiFeatureOnlineStoreFeatureviewIamBindingConditionPtrOutput {
	return o.ApplyT(func(v *AiFeatureOnlineStoreFeatureviewIamBinding) AiFeatureOnlineStoreFeatureviewIamBindingConditionPtrOutput {
		return v.Condition
	}).(AiFeatureOnlineStoreFeatureviewIamBindingConditionPtrOutput)
}

// (Computed) The etag of the IAM policy.
func (o AiFeatureOnlineStoreFeatureviewIamBindingOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v *AiFeatureOnlineStoreFeatureviewIamBinding) pulumi.StringOutput { return v.Etag }).(pulumi.StringOutput)
}

// The name of the FeatureOnlineStore to use for the featureview. Used to find the parent resource to bind the IAM policy to
func (o AiFeatureOnlineStoreFeatureviewIamBindingOutput) FeatureOnlineStore() pulumi.StringOutput {
	return o.ApplyT(func(v *AiFeatureOnlineStoreFeatureviewIamBinding) pulumi.StringOutput { return v.FeatureOnlineStore }).(pulumi.StringOutput)
}

// Used to find the parent resource to bind the IAM policy to
func (o AiFeatureOnlineStoreFeatureviewIamBindingOutput) FeatureView() pulumi.StringOutput {
	return o.ApplyT(func(v *AiFeatureOnlineStoreFeatureviewIamBinding) pulumi.StringOutput { return v.FeatureView }).(pulumi.StringOutput)
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
func (o AiFeatureOnlineStoreFeatureviewIamBindingOutput) Members() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *AiFeatureOnlineStoreFeatureviewIamBinding) pulumi.StringArrayOutput { return v.Members }).(pulumi.StringArrayOutput)
}

// The ID of the project in which the resource belongs.
// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
func (o AiFeatureOnlineStoreFeatureviewIamBindingOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *AiFeatureOnlineStoreFeatureviewIamBinding) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// The region for the resource. It should be the same as the featureonlinestore region. Used to find the parent resource to bind the IAM policy to. If not specified,
// the value will be parsed from the identifier of the parent resource. If no region is provided in the parent identifier and no
// region is specified, it is taken from the provider configuration.
func (o AiFeatureOnlineStoreFeatureviewIamBindingOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v *AiFeatureOnlineStoreFeatureviewIamBinding) pulumi.StringOutput { return v.Region }).(pulumi.StringOutput)
}

// The role that should be applied. Only one
// `vertex.AiFeatureOnlineStoreFeatureviewIamBinding` can be used per role. Note that custom roles must be of the format
// `[projects|organizations]/{parent-name}/roles/{role-name}`.
func (o AiFeatureOnlineStoreFeatureviewIamBindingOutput) Role() pulumi.StringOutput {
	return o.ApplyT(func(v *AiFeatureOnlineStoreFeatureviewIamBinding) pulumi.StringOutput { return v.Role }).(pulumi.StringOutput)
}

type AiFeatureOnlineStoreFeatureviewIamBindingArrayOutput struct{ *pulumi.OutputState }

func (AiFeatureOnlineStoreFeatureviewIamBindingArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AiFeatureOnlineStoreFeatureviewIamBinding)(nil)).Elem()
}

func (o AiFeatureOnlineStoreFeatureviewIamBindingArrayOutput) ToAiFeatureOnlineStoreFeatureviewIamBindingArrayOutput() AiFeatureOnlineStoreFeatureviewIamBindingArrayOutput {
	return o
}

func (o AiFeatureOnlineStoreFeatureviewIamBindingArrayOutput) ToAiFeatureOnlineStoreFeatureviewIamBindingArrayOutputWithContext(ctx context.Context) AiFeatureOnlineStoreFeatureviewIamBindingArrayOutput {
	return o
}

func (o AiFeatureOnlineStoreFeatureviewIamBindingArrayOutput) Index(i pulumi.IntInput) AiFeatureOnlineStoreFeatureviewIamBindingOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AiFeatureOnlineStoreFeatureviewIamBinding {
		return vs[0].([]*AiFeatureOnlineStoreFeatureviewIamBinding)[vs[1].(int)]
	}).(AiFeatureOnlineStoreFeatureviewIamBindingOutput)
}

type AiFeatureOnlineStoreFeatureviewIamBindingMapOutput struct{ *pulumi.OutputState }

func (AiFeatureOnlineStoreFeatureviewIamBindingMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AiFeatureOnlineStoreFeatureviewIamBinding)(nil)).Elem()
}

func (o AiFeatureOnlineStoreFeatureviewIamBindingMapOutput) ToAiFeatureOnlineStoreFeatureviewIamBindingMapOutput() AiFeatureOnlineStoreFeatureviewIamBindingMapOutput {
	return o
}

func (o AiFeatureOnlineStoreFeatureviewIamBindingMapOutput) ToAiFeatureOnlineStoreFeatureviewIamBindingMapOutputWithContext(ctx context.Context) AiFeatureOnlineStoreFeatureviewIamBindingMapOutput {
	return o
}

func (o AiFeatureOnlineStoreFeatureviewIamBindingMapOutput) MapIndex(k pulumi.StringInput) AiFeatureOnlineStoreFeatureviewIamBindingOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AiFeatureOnlineStoreFeatureviewIamBinding {
		return vs[0].(map[string]*AiFeatureOnlineStoreFeatureviewIamBinding)[vs[1].(string)]
	}).(AiFeatureOnlineStoreFeatureviewIamBindingOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AiFeatureOnlineStoreFeatureviewIamBindingInput)(nil)).Elem(), &AiFeatureOnlineStoreFeatureviewIamBinding{})
	pulumi.RegisterInputType(reflect.TypeOf((*AiFeatureOnlineStoreFeatureviewIamBindingArrayInput)(nil)).Elem(), AiFeatureOnlineStoreFeatureviewIamBindingArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AiFeatureOnlineStoreFeatureviewIamBindingMapInput)(nil)).Elem(), AiFeatureOnlineStoreFeatureviewIamBindingMap{})
	pulumi.RegisterOutputType(AiFeatureOnlineStoreFeatureviewIamBindingOutput{})
	pulumi.RegisterOutputType(AiFeatureOnlineStoreFeatureviewIamBindingArrayOutput{})
	pulumi.RegisterOutputType(AiFeatureOnlineStoreFeatureviewIamBindingMapOutput{})
}
