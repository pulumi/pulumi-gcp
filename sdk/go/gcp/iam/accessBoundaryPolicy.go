// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package iam

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Represents a collection of access boundary policies to apply to a given resource.
// **NOTE**: This is a private feature and users should contact GCP support
// if they would like to test it.
//
// ## Example Usage
//
// ## Import
//
// # AccessBoundaryPolicy can be imported using any of these accepted formats
//
// ```sh
//
//	$ pulumi import gcp:iam/accessBoundaryPolicy:AccessBoundaryPolicy default {{parent}}/{{name}}
//
// ```
type AccessBoundaryPolicy struct {
	pulumi.CustomResourceState

	// The display name of the rule.
	DisplayName pulumi.StringPtrOutput `pulumi:"displayName"`
	// The hash of the resource. Used internally during updates.
	Etag pulumi.StringOutput `pulumi:"etag"`
	// The name of the policy.
	Name pulumi.StringOutput `pulumi:"name"`
	// The attachment point is identified by its URL-encoded full resource name.
	Parent pulumi.StringOutput `pulumi:"parent"`
	// Rules to be applied.
	// Structure is documented below.
	Rules AccessBoundaryPolicyRuleArrayOutput `pulumi:"rules"`
}

// NewAccessBoundaryPolicy registers a new resource with the given unique name, arguments, and options.
func NewAccessBoundaryPolicy(ctx *pulumi.Context,
	name string, args *AccessBoundaryPolicyArgs, opts ...pulumi.ResourceOption) (*AccessBoundaryPolicy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Parent == nil {
		return nil, errors.New("invalid value for required argument 'Parent'")
	}
	if args.Rules == nil {
		return nil, errors.New("invalid value for required argument 'Rules'")
	}
	var resource AccessBoundaryPolicy
	err := ctx.RegisterResource("gcp:iam/accessBoundaryPolicy:AccessBoundaryPolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAccessBoundaryPolicy gets an existing AccessBoundaryPolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAccessBoundaryPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AccessBoundaryPolicyState, opts ...pulumi.ResourceOption) (*AccessBoundaryPolicy, error) {
	var resource AccessBoundaryPolicy
	err := ctx.ReadResource("gcp:iam/accessBoundaryPolicy:AccessBoundaryPolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AccessBoundaryPolicy resources.
type accessBoundaryPolicyState struct {
	// The display name of the rule.
	DisplayName *string `pulumi:"displayName"`
	// The hash of the resource. Used internally during updates.
	Etag *string `pulumi:"etag"`
	// The name of the policy.
	Name *string `pulumi:"name"`
	// The attachment point is identified by its URL-encoded full resource name.
	Parent *string `pulumi:"parent"`
	// Rules to be applied.
	// Structure is documented below.
	Rules []AccessBoundaryPolicyRule `pulumi:"rules"`
}

type AccessBoundaryPolicyState struct {
	// The display name of the rule.
	DisplayName pulumi.StringPtrInput
	// The hash of the resource. Used internally during updates.
	Etag pulumi.StringPtrInput
	// The name of the policy.
	Name pulumi.StringPtrInput
	// The attachment point is identified by its URL-encoded full resource name.
	Parent pulumi.StringPtrInput
	// Rules to be applied.
	// Structure is documented below.
	Rules AccessBoundaryPolicyRuleArrayInput
}

func (AccessBoundaryPolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*accessBoundaryPolicyState)(nil)).Elem()
}

type accessBoundaryPolicyArgs struct {
	// The display name of the rule.
	DisplayName *string `pulumi:"displayName"`
	// The name of the policy.
	Name *string `pulumi:"name"`
	// The attachment point is identified by its URL-encoded full resource name.
	Parent string `pulumi:"parent"`
	// Rules to be applied.
	// Structure is documented below.
	Rules []AccessBoundaryPolicyRule `pulumi:"rules"`
}

// The set of arguments for constructing a AccessBoundaryPolicy resource.
type AccessBoundaryPolicyArgs struct {
	// The display name of the rule.
	DisplayName pulumi.StringPtrInput
	// The name of the policy.
	Name pulumi.StringPtrInput
	// The attachment point is identified by its URL-encoded full resource name.
	Parent pulumi.StringInput
	// Rules to be applied.
	// Structure is documented below.
	Rules AccessBoundaryPolicyRuleArrayInput
}

func (AccessBoundaryPolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*accessBoundaryPolicyArgs)(nil)).Elem()
}

type AccessBoundaryPolicyInput interface {
	pulumi.Input

	ToAccessBoundaryPolicyOutput() AccessBoundaryPolicyOutput
	ToAccessBoundaryPolicyOutputWithContext(ctx context.Context) AccessBoundaryPolicyOutput
}

func (*AccessBoundaryPolicy) ElementType() reflect.Type {
	return reflect.TypeOf((**AccessBoundaryPolicy)(nil)).Elem()
}

func (i *AccessBoundaryPolicy) ToAccessBoundaryPolicyOutput() AccessBoundaryPolicyOutput {
	return i.ToAccessBoundaryPolicyOutputWithContext(context.Background())
}

func (i *AccessBoundaryPolicy) ToAccessBoundaryPolicyOutputWithContext(ctx context.Context) AccessBoundaryPolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessBoundaryPolicyOutput)
}

// AccessBoundaryPolicyArrayInput is an input type that accepts AccessBoundaryPolicyArray and AccessBoundaryPolicyArrayOutput values.
// You can construct a concrete instance of `AccessBoundaryPolicyArrayInput` via:
//
//	AccessBoundaryPolicyArray{ AccessBoundaryPolicyArgs{...} }
type AccessBoundaryPolicyArrayInput interface {
	pulumi.Input

	ToAccessBoundaryPolicyArrayOutput() AccessBoundaryPolicyArrayOutput
	ToAccessBoundaryPolicyArrayOutputWithContext(context.Context) AccessBoundaryPolicyArrayOutput
}

type AccessBoundaryPolicyArray []AccessBoundaryPolicyInput

func (AccessBoundaryPolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AccessBoundaryPolicy)(nil)).Elem()
}

func (i AccessBoundaryPolicyArray) ToAccessBoundaryPolicyArrayOutput() AccessBoundaryPolicyArrayOutput {
	return i.ToAccessBoundaryPolicyArrayOutputWithContext(context.Background())
}

func (i AccessBoundaryPolicyArray) ToAccessBoundaryPolicyArrayOutputWithContext(ctx context.Context) AccessBoundaryPolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessBoundaryPolicyArrayOutput)
}

// AccessBoundaryPolicyMapInput is an input type that accepts AccessBoundaryPolicyMap and AccessBoundaryPolicyMapOutput values.
// You can construct a concrete instance of `AccessBoundaryPolicyMapInput` via:
//
//	AccessBoundaryPolicyMap{ "key": AccessBoundaryPolicyArgs{...} }
type AccessBoundaryPolicyMapInput interface {
	pulumi.Input

	ToAccessBoundaryPolicyMapOutput() AccessBoundaryPolicyMapOutput
	ToAccessBoundaryPolicyMapOutputWithContext(context.Context) AccessBoundaryPolicyMapOutput
}

type AccessBoundaryPolicyMap map[string]AccessBoundaryPolicyInput

func (AccessBoundaryPolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AccessBoundaryPolicy)(nil)).Elem()
}

func (i AccessBoundaryPolicyMap) ToAccessBoundaryPolicyMapOutput() AccessBoundaryPolicyMapOutput {
	return i.ToAccessBoundaryPolicyMapOutputWithContext(context.Background())
}

func (i AccessBoundaryPolicyMap) ToAccessBoundaryPolicyMapOutputWithContext(ctx context.Context) AccessBoundaryPolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessBoundaryPolicyMapOutput)
}

type AccessBoundaryPolicyOutput struct{ *pulumi.OutputState }

func (AccessBoundaryPolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AccessBoundaryPolicy)(nil)).Elem()
}

func (o AccessBoundaryPolicyOutput) ToAccessBoundaryPolicyOutput() AccessBoundaryPolicyOutput {
	return o
}

func (o AccessBoundaryPolicyOutput) ToAccessBoundaryPolicyOutputWithContext(ctx context.Context) AccessBoundaryPolicyOutput {
	return o
}

// The display name of the rule.
func (o AccessBoundaryPolicyOutput) DisplayName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AccessBoundaryPolicy) pulumi.StringPtrOutput { return v.DisplayName }).(pulumi.StringPtrOutput)
}

// The hash of the resource. Used internally during updates.
func (o AccessBoundaryPolicyOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v *AccessBoundaryPolicy) pulumi.StringOutput { return v.Etag }).(pulumi.StringOutput)
}

// The name of the policy.
func (o AccessBoundaryPolicyOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *AccessBoundaryPolicy) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The attachment point is identified by its URL-encoded full resource name.
func (o AccessBoundaryPolicyOutput) Parent() pulumi.StringOutput {
	return o.ApplyT(func(v *AccessBoundaryPolicy) pulumi.StringOutput { return v.Parent }).(pulumi.StringOutput)
}

// Rules to be applied.
// Structure is documented below.
func (o AccessBoundaryPolicyOutput) Rules() AccessBoundaryPolicyRuleArrayOutput {
	return o.ApplyT(func(v *AccessBoundaryPolicy) AccessBoundaryPolicyRuleArrayOutput { return v.Rules }).(AccessBoundaryPolicyRuleArrayOutput)
}

type AccessBoundaryPolicyArrayOutput struct{ *pulumi.OutputState }

func (AccessBoundaryPolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AccessBoundaryPolicy)(nil)).Elem()
}

func (o AccessBoundaryPolicyArrayOutput) ToAccessBoundaryPolicyArrayOutput() AccessBoundaryPolicyArrayOutput {
	return o
}

func (o AccessBoundaryPolicyArrayOutput) ToAccessBoundaryPolicyArrayOutputWithContext(ctx context.Context) AccessBoundaryPolicyArrayOutput {
	return o
}

func (o AccessBoundaryPolicyArrayOutput) Index(i pulumi.IntInput) AccessBoundaryPolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AccessBoundaryPolicy {
		return vs[0].([]*AccessBoundaryPolicy)[vs[1].(int)]
	}).(AccessBoundaryPolicyOutput)
}

type AccessBoundaryPolicyMapOutput struct{ *pulumi.OutputState }

func (AccessBoundaryPolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AccessBoundaryPolicy)(nil)).Elem()
}

func (o AccessBoundaryPolicyMapOutput) ToAccessBoundaryPolicyMapOutput() AccessBoundaryPolicyMapOutput {
	return o
}

func (o AccessBoundaryPolicyMapOutput) ToAccessBoundaryPolicyMapOutputWithContext(ctx context.Context) AccessBoundaryPolicyMapOutput {
	return o
}

func (o AccessBoundaryPolicyMapOutput) MapIndex(k pulumi.StringInput) AccessBoundaryPolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AccessBoundaryPolicy {
		return vs[0].(map[string]*AccessBoundaryPolicy)[vs[1].(string)]
	}).(AccessBoundaryPolicyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AccessBoundaryPolicyInput)(nil)).Elem(), &AccessBoundaryPolicy{})
	pulumi.RegisterInputType(reflect.TypeOf((*AccessBoundaryPolicyArrayInput)(nil)).Elem(), AccessBoundaryPolicyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AccessBoundaryPolicyMapInput)(nil)).Elem(), AccessBoundaryPolicyMap{})
	pulumi.RegisterOutputType(AccessBoundaryPolicyOutput{})
	pulumi.RegisterOutputType(AccessBoundaryPolicyArrayOutput{})
	pulumi.RegisterOutputType(AccessBoundaryPolicyMapOutput{})
}