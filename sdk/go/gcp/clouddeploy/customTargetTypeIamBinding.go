// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package clouddeploy

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type CustomTargetTypeIamBinding struct {
	pulumi.CustomResourceState

	Condition CustomTargetTypeIamBindingConditionPtrOutput `pulumi:"condition"`
	Etag      pulumi.StringOutput                          `pulumi:"etag"`
	Location  pulumi.StringOutput                          `pulumi:"location"`
	Members   pulumi.StringArrayOutput                     `pulumi:"members"`
	Name      pulumi.StringOutput                          `pulumi:"name"`
	Project   pulumi.StringOutput                          `pulumi:"project"`
	Role      pulumi.StringOutput                          `pulumi:"role"`
}

// NewCustomTargetTypeIamBinding registers a new resource with the given unique name, arguments, and options.
func NewCustomTargetTypeIamBinding(ctx *pulumi.Context,
	name string, args *CustomTargetTypeIamBindingArgs, opts ...pulumi.ResourceOption) (*CustomTargetTypeIamBinding, error) {
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
	var resource CustomTargetTypeIamBinding
	err := ctx.RegisterResource("gcp:clouddeploy/customTargetTypeIamBinding:CustomTargetTypeIamBinding", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCustomTargetTypeIamBinding gets an existing CustomTargetTypeIamBinding resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCustomTargetTypeIamBinding(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CustomTargetTypeIamBindingState, opts ...pulumi.ResourceOption) (*CustomTargetTypeIamBinding, error) {
	var resource CustomTargetTypeIamBinding
	err := ctx.ReadResource("gcp:clouddeploy/customTargetTypeIamBinding:CustomTargetTypeIamBinding", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CustomTargetTypeIamBinding resources.
type customTargetTypeIamBindingState struct {
	Condition *CustomTargetTypeIamBindingCondition `pulumi:"condition"`
	Etag      *string                              `pulumi:"etag"`
	Location  *string                              `pulumi:"location"`
	Members   []string                             `pulumi:"members"`
	Name      *string                              `pulumi:"name"`
	Project   *string                              `pulumi:"project"`
	Role      *string                              `pulumi:"role"`
}

type CustomTargetTypeIamBindingState struct {
	Condition CustomTargetTypeIamBindingConditionPtrInput
	Etag      pulumi.StringPtrInput
	Location  pulumi.StringPtrInput
	Members   pulumi.StringArrayInput
	Name      pulumi.StringPtrInput
	Project   pulumi.StringPtrInput
	Role      pulumi.StringPtrInput
}

func (CustomTargetTypeIamBindingState) ElementType() reflect.Type {
	return reflect.TypeOf((*customTargetTypeIamBindingState)(nil)).Elem()
}

type customTargetTypeIamBindingArgs struct {
	Condition *CustomTargetTypeIamBindingCondition `pulumi:"condition"`
	Location  *string                              `pulumi:"location"`
	Members   []string                             `pulumi:"members"`
	Name      *string                              `pulumi:"name"`
	Project   *string                              `pulumi:"project"`
	Role      string                               `pulumi:"role"`
}

// The set of arguments for constructing a CustomTargetTypeIamBinding resource.
type CustomTargetTypeIamBindingArgs struct {
	Condition CustomTargetTypeIamBindingConditionPtrInput
	Location  pulumi.StringPtrInput
	Members   pulumi.StringArrayInput
	Name      pulumi.StringPtrInput
	Project   pulumi.StringPtrInput
	Role      pulumi.StringInput
}

func (CustomTargetTypeIamBindingArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*customTargetTypeIamBindingArgs)(nil)).Elem()
}

type CustomTargetTypeIamBindingInput interface {
	pulumi.Input

	ToCustomTargetTypeIamBindingOutput() CustomTargetTypeIamBindingOutput
	ToCustomTargetTypeIamBindingOutputWithContext(ctx context.Context) CustomTargetTypeIamBindingOutput
}

func (*CustomTargetTypeIamBinding) ElementType() reflect.Type {
	return reflect.TypeOf((**CustomTargetTypeIamBinding)(nil)).Elem()
}

func (i *CustomTargetTypeIamBinding) ToCustomTargetTypeIamBindingOutput() CustomTargetTypeIamBindingOutput {
	return i.ToCustomTargetTypeIamBindingOutputWithContext(context.Background())
}

func (i *CustomTargetTypeIamBinding) ToCustomTargetTypeIamBindingOutputWithContext(ctx context.Context) CustomTargetTypeIamBindingOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CustomTargetTypeIamBindingOutput)
}

// CustomTargetTypeIamBindingArrayInput is an input type that accepts CustomTargetTypeIamBindingArray and CustomTargetTypeIamBindingArrayOutput values.
// You can construct a concrete instance of `CustomTargetTypeIamBindingArrayInput` via:
//
//	CustomTargetTypeIamBindingArray{ CustomTargetTypeIamBindingArgs{...} }
type CustomTargetTypeIamBindingArrayInput interface {
	pulumi.Input

	ToCustomTargetTypeIamBindingArrayOutput() CustomTargetTypeIamBindingArrayOutput
	ToCustomTargetTypeIamBindingArrayOutputWithContext(context.Context) CustomTargetTypeIamBindingArrayOutput
}

type CustomTargetTypeIamBindingArray []CustomTargetTypeIamBindingInput

func (CustomTargetTypeIamBindingArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CustomTargetTypeIamBinding)(nil)).Elem()
}

func (i CustomTargetTypeIamBindingArray) ToCustomTargetTypeIamBindingArrayOutput() CustomTargetTypeIamBindingArrayOutput {
	return i.ToCustomTargetTypeIamBindingArrayOutputWithContext(context.Background())
}

func (i CustomTargetTypeIamBindingArray) ToCustomTargetTypeIamBindingArrayOutputWithContext(ctx context.Context) CustomTargetTypeIamBindingArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CustomTargetTypeIamBindingArrayOutput)
}

// CustomTargetTypeIamBindingMapInput is an input type that accepts CustomTargetTypeIamBindingMap and CustomTargetTypeIamBindingMapOutput values.
// You can construct a concrete instance of `CustomTargetTypeIamBindingMapInput` via:
//
//	CustomTargetTypeIamBindingMap{ "key": CustomTargetTypeIamBindingArgs{...} }
type CustomTargetTypeIamBindingMapInput interface {
	pulumi.Input

	ToCustomTargetTypeIamBindingMapOutput() CustomTargetTypeIamBindingMapOutput
	ToCustomTargetTypeIamBindingMapOutputWithContext(context.Context) CustomTargetTypeIamBindingMapOutput
}

type CustomTargetTypeIamBindingMap map[string]CustomTargetTypeIamBindingInput

func (CustomTargetTypeIamBindingMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CustomTargetTypeIamBinding)(nil)).Elem()
}

func (i CustomTargetTypeIamBindingMap) ToCustomTargetTypeIamBindingMapOutput() CustomTargetTypeIamBindingMapOutput {
	return i.ToCustomTargetTypeIamBindingMapOutputWithContext(context.Background())
}

func (i CustomTargetTypeIamBindingMap) ToCustomTargetTypeIamBindingMapOutputWithContext(ctx context.Context) CustomTargetTypeIamBindingMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CustomTargetTypeIamBindingMapOutput)
}

type CustomTargetTypeIamBindingOutput struct{ *pulumi.OutputState }

func (CustomTargetTypeIamBindingOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CustomTargetTypeIamBinding)(nil)).Elem()
}

func (o CustomTargetTypeIamBindingOutput) ToCustomTargetTypeIamBindingOutput() CustomTargetTypeIamBindingOutput {
	return o
}

func (o CustomTargetTypeIamBindingOutput) ToCustomTargetTypeIamBindingOutputWithContext(ctx context.Context) CustomTargetTypeIamBindingOutput {
	return o
}

func (o CustomTargetTypeIamBindingOutput) Condition() CustomTargetTypeIamBindingConditionPtrOutput {
	return o.ApplyT(func(v *CustomTargetTypeIamBinding) CustomTargetTypeIamBindingConditionPtrOutput { return v.Condition }).(CustomTargetTypeIamBindingConditionPtrOutput)
}

func (o CustomTargetTypeIamBindingOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v *CustomTargetTypeIamBinding) pulumi.StringOutput { return v.Etag }).(pulumi.StringOutput)
}

func (o CustomTargetTypeIamBindingOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *CustomTargetTypeIamBinding) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

func (o CustomTargetTypeIamBindingOutput) Members() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *CustomTargetTypeIamBinding) pulumi.StringArrayOutput { return v.Members }).(pulumi.StringArrayOutput)
}

func (o CustomTargetTypeIamBindingOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *CustomTargetTypeIamBinding) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

func (o CustomTargetTypeIamBindingOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *CustomTargetTypeIamBinding) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

func (o CustomTargetTypeIamBindingOutput) Role() pulumi.StringOutput {
	return o.ApplyT(func(v *CustomTargetTypeIamBinding) pulumi.StringOutput { return v.Role }).(pulumi.StringOutput)
}

type CustomTargetTypeIamBindingArrayOutput struct{ *pulumi.OutputState }

func (CustomTargetTypeIamBindingArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CustomTargetTypeIamBinding)(nil)).Elem()
}

func (o CustomTargetTypeIamBindingArrayOutput) ToCustomTargetTypeIamBindingArrayOutput() CustomTargetTypeIamBindingArrayOutput {
	return o
}

func (o CustomTargetTypeIamBindingArrayOutput) ToCustomTargetTypeIamBindingArrayOutputWithContext(ctx context.Context) CustomTargetTypeIamBindingArrayOutput {
	return o
}

func (o CustomTargetTypeIamBindingArrayOutput) Index(i pulumi.IntInput) CustomTargetTypeIamBindingOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *CustomTargetTypeIamBinding {
		return vs[0].([]*CustomTargetTypeIamBinding)[vs[1].(int)]
	}).(CustomTargetTypeIamBindingOutput)
}

type CustomTargetTypeIamBindingMapOutput struct{ *pulumi.OutputState }

func (CustomTargetTypeIamBindingMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CustomTargetTypeIamBinding)(nil)).Elem()
}

func (o CustomTargetTypeIamBindingMapOutput) ToCustomTargetTypeIamBindingMapOutput() CustomTargetTypeIamBindingMapOutput {
	return o
}

func (o CustomTargetTypeIamBindingMapOutput) ToCustomTargetTypeIamBindingMapOutputWithContext(ctx context.Context) CustomTargetTypeIamBindingMapOutput {
	return o
}

func (o CustomTargetTypeIamBindingMapOutput) MapIndex(k pulumi.StringInput) CustomTargetTypeIamBindingOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *CustomTargetTypeIamBinding {
		return vs[0].(map[string]*CustomTargetTypeIamBinding)[vs[1].(string)]
	}).(CustomTargetTypeIamBindingOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CustomTargetTypeIamBindingInput)(nil)).Elem(), &CustomTargetTypeIamBinding{})
	pulumi.RegisterInputType(reflect.TypeOf((*CustomTargetTypeIamBindingArrayInput)(nil)).Elem(), CustomTargetTypeIamBindingArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CustomTargetTypeIamBindingMapInput)(nil)).Elem(), CustomTargetTypeIamBindingMap{})
	pulumi.RegisterOutputType(CustomTargetTypeIamBindingOutput{})
	pulumi.RegisterOutputType(CustomTargetTypeIamBindingArrayOutput{})
	pulumi.RegisterOutputType(CustomTargetTypeIamBindingMapOutput{})
}
