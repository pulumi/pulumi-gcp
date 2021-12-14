// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package apigee

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type EnvironmentIamBindingCondition struct {
	Description *string `pulumi:"description"`
	Expression  string  `pulumi:"expression"`
	Title       string  `pulumi:"title"`
}

// EnvironmentIamBindingConditionInput is an input type that accepts EnvironmentIamBindingConditionArgs and EnvironmentIamBindingConditionOutput values.
// You can construct a concrete instance of `EnvironmentIamBindingConditionInput` via:
//
//          EnvironmentIamBindingConditionArgs{...}
type EnvironmentIamBindingConditionInput interface {
	pulumi.Input

	ToEnvironmentIamBindingConditionOutput() EnvironmentIamBindingConditionOutput
	ToEnvironmentIamBindingConditionOutputWithContext(context.Context) EnvironmentIamBindingConditionOutput
}

type EnvironmentIamBindingConditionArgs struct {
	Description pulumi.StringPtrInput `pulumi:"description"`
	Expression  pulumi.StringInput    `pulumi:"expression"`
	Title       pulumi.StringInput    `pulumi:"title"`
}

func (EnvironmentIamBindingConditionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*EnvironmentIamBindingCondition)(nil)).Elem()
}

func (i EnvironmentIamBindingConditionArgs) ToEnvironmentIamBindingConditionOutput() EnvironmentIamBindingConditionOutput {
	return i.ToEnvironmentIamBindingConditionOutputWithContext(context.Background())
}

func (i EnvironmentIamBindingConditionArgs) ToEnvironmentIamBindingConditionOutputWithContext(ctx context.Context) EnvironmentIamBindingConditionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EnvironmentIamBindingConditionOutput)
}

func (i EnvironmentIamBindingConditionArgs) ToEnvironmentIamBindingConditionPtrOutput() EnvironmentIamBindingConditionPtrOutput {
	return i.ToEnvironmentIamBindingConditionPtrOutputWithContext(context.Background())
}

func (i EnvironmentIamBindingConditionArgs) ToEnvironmentIamBindingConditionPtrOutputWithContext(ctx context.Context) EnvironmentIamBindingConditionPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EnvironmentIamBindingConditionOutput).ToEnvironmentIamBindingConditionPtrOutputWithContext(ctx)
}

// EnvironmentIamBindingConditionPtrInput is an input type that accepts EnvironmentIamBindingConditionArgs, EnvironmentIamBindingConditionPtr and EnvironmentIamBindingConditionPtrOutput values.
// You can construct a concrete instance of `EnvironmentIamBindingConditionPtrInput` via:
//
//          EnvironmentIamBindingConditionArgs{...}
//
//  or:
//
//          nil
type EnvironmentIamBindingConditionPtrInput interface {
	pulumi.Input

	ToEnvironmentIamBindingConditionPtrOutput() EnvironmentIamBindingConditionPtrOutput
	ToEnvironmentIamBindingConditionPtrOutputWithContext(context.Context) EnvironmentIamBindingConditionPtrOutput
}

type environmentIamBindingConditionPtrType EnvironmentIamBindingConditionArgs

func EnvironmentIamBindingConditionPtr(v *EnvironmentIamBindingConditionArgs) EnvironmentIamBindingConditionPtrInput {
	return (*environmentIamBindingConditionPtrType)(v)
}

func (*environmentIamBindingConditionPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**EnvironmentIamBindingCondition)(nil)).Elem()
}

func (i *environmentIamBindingConditionPtrType) ToEnvironmentIamBindingConditionPtrOutput() EnvironmentIamBindingConditionPtrOutput {
	return i.ToEnvironmentIamBindingConditionPtrOutputWithContext(context.Background())
}

func (i *environmentIamBindingConditionPtrType) ToEnvironmentIamBindingConditionPtrOutputWithContext(ctx context.Context) EnvironmentIamBindingConditionPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EnvironmentIamBindingConditionPtrOutput)
}

type EnvironmentIamBindingConditionOutput struct{ *pulumi.OutputState }

func (EnvironmentIamBindingConditionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*EnvironmentIamBindingCondition)(nil)).Elem()
}

func (o EnvironmentIamBindingConditionOutput) ToEnvironmentIamBindingConditionOutput() EnvironmentIamBindingConditionOutput {
	return o
}

func (o EnvironmentIamBindingConditionOutput) ToEnvironmentIamBindingConditionOutputWithContext(ctx context.Context) EnvironmentIamBindingConditionOutput {
	return o
}

func (o EnvironmentIamBindingConditionOutput) ToEnvironmentIamBindingConditionPtrOutput() EnvironmentIamBindingConditionPtrOutput {
	return o.ToEnvironmentIamBindingConditionPtrOutputWithContext(context.Background())
}

func (o EnvironmentIamBindingConditionOutput) ToEnvironmentIamBindingConditionPtrOutputWithContext(ctx context.Context) EnvironmentIamBindingConditionPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v EnvironmentIamBindingCondition) *EnvironmentIamBindingCondition {
		return &v
	}).(EnvironmentIamBindingConditionPtrOutput)
}

func (o EnvironmentIamBindingConditionOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v EnvironmentIamBindingCondition) *string { return v.Description }).(pulumi.StringPtrOutput)
}

func (o EnvironmentIamBindingConditionOutput) Expression() pulumi.StringOutput {
	return o.ApplyT(func(v EnvironmentIamBindingCondition) string { return v.Expression }).(pulumi.StringOutput)
}

func (o EnvironmentIamBindingConditionOutput) Title() pulumi.StringOutput {
	return o.ApplyT(func(v EnvironmentIamBindingCondition) string { return v.Title }).(pulumi.StringOutput)
}

type EnvironmentIamBindingConditionPtrOutput struct{ *pulumi.OutputState }

func (EnvironmentIamBindingConditionPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**EnvironmentIamBindingCondition)(nil)).Elem()
}

func (o EnvironmentIamBindingConditionPtrOutput) ToEnvironmentIamBindingConditionPtrOutput() EnvironmentIamBindingConditionPtrOutput {
	return o
}

func (o EnvironmentIamBindingConditionPtrOutput) ToEnvironmentIamBindingConditionPtrOutputWithContext(ctx context.Context) EnvironmentIamBindingConditionPtrOutput {
	return o
}

func (o EnvironmentIamBindingConditionPtrOutput) Elem() EnvironmentIamBindingConditionOutput {
	return o.ApplyT(func(v *EnvironmentIamBindingCondition) EnvironmentIamBindingCondition {
		if v != nil {
			return *v
		}
		var ret EnvironmentIamBindingCondition
		return ret
	}).(EnvironmentIamBindingConditionOutput)
}

func (o EnvironmentIamBindingConditionPtrOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EnvironmentIamBindingCondition) *string {
		if v == nil {
			return nil
		}
		return v.Description
	}).(pulumi.StringPtrOutput)
}

func (o EnvironmentIamBindingConditionPtrOutput) Expression() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EnvironmentIamBindingCondition) *string {
		if v == nil {
			return nil
		}
		return &v.Expression
	}).(pulumi.StringPtrOutput)
}

func (o EnvironmentIamBindingConditionPtrOutput) Title() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EnvironmentIamBindingCondition) *string {
		if v == nil {
			return nil
		}
		return &v.Title
	}).(pulumi.StringPtrOutput)
}

type EnvironmentIamMemberCondition struct {
	Description *string `pulumi:"description"`
	Expression  string  `pulumi:"expression"`
	Title       string  `pulumi:"title"`
}

// EnvironmentIamMemberConditionInput is an input type that accepts EnvironmentIamMemberConditionArgs and EnvironmentIamMemberConditionOutput values.
// You can construct a concrete instance of `EnvironmentIamMemberConditionInput` via:
//
//          EnvironmentIamMemberConditionArgs{...}
type EnvironmentIamMemberConditionInput interface {
	pulumi.Input

	ToEnvironmentIamMemberConditionOutput() EnvironmentIamMemberConditionOutput
	ToEnvironmentIamMemberConditionOutputWithContext(context.Context) EnvironmentIamMemberConditionOutput
}

type EnvironmentIamMemberConditionArgs struct {
	Description pulumi.StringPtrInput `pulumi:"description"`
	Expression  pulumi.StringInput    `pulumi:"expression"`
	Title       pulumi.StringInput    `pulumi:"title"`
}

func (EnvironmentIamMemberConditionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*EnvironmentIamMemberCondition)(nil)).Elem()
}

func (i EnvironmentIamMemberConditionArgs) ToEnvironmentIamMemberConditionOutput() EnvironmentIamMemberConditionOutput {
	return i.ToEnvironmentIamMemberConditionOutputWithContext(context.Background())
}

func (i EnvironmentIamMemberConditionArgs) ToEnvironmentIamMemberConditionOutputWithContext(ctx context.Context) EnvironmentIamMemberConditionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EnvironmentIamMemberConditionOutput)
}

func (i EnvironmentIamMemberConditionArgs) ToEnvironmentIamMemberConditionPtrOutput() EnvironmentIamMemberConditionPtrOutput {
	return i.ToEnvironmentIamMemberConditionPtrOutputWithContext(context.Background())
}

func (i EnvironmentIamMemberConditionArgs) ToEnvironmentIamMemberConditionPtrOutputWithContext(ctx context.Context) EnvironmentIamMemberConditionPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EnvironmentIamMemberConditionOutput).ToEnvironmentIamMemberConditionPtrOutputWithContext(ctx)
}

// EnvironmentIamMemberConditionPtrInput is an input type that accepts EnvironmentIamMemberConditionArgs, EnvironmentIamMemberConditionPtr and EnvironmentIamMemberConditionPtrOutput values.
// You can construct a concrete instance of `EnvironmentIamMemberConditionPtrInput` via:
//
//          EnvironmentIamMemberConditionArgs{...}
//
//  or:
//
//          nil
type EnvironmentIamMemberConditionPtrInput interface {
	pulumi.Input

	ToEnvironmentIamMemberConditionPtrOutput() EnvironmentIamMemberConditionPtrOutput
	ToEnvironmentIamMemberConditionPtrOutputWithContext(context.Context) EnvironmentIamMemberConditionPtrOutput
}

type environmentIamMemberConditionPtrType EnvironmentIamMemberConditionArgs

func EnvironmentIamMemberConditionPtr(v *EnvironmentIamMemberConditionArgs) EnvironmentIamMemberConditionPtrInput {
	return (*environmentIamMemberConditionPtrType)(v)
}

func (*environmentIamMemberConditionPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**EnvironmentIamMemberCondition)(nil)).Elem()
}

func (i *environmentIamMemberConditionPtrType) ToEnvironmentIamMemberConditionPtrOutput() EnvironmentIamMemberConditionPtrOutput {
	return i.ToEnvironmentIamMemberConditionPtrOutputWithContext(context.Background())
}

func (i *environmentIamMemberConditionPtrType) ToEnvironmentIamMemberConditionPtrOutputWithContext(ctx context.Context) EnvironmentIamMemberConditionPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EnvironmentIamMemberConditionPtrOutput)
}

type EnvironmentIamMemberConditionOutput struct{ *pulumi.OutputState }

func (EnvironmentIamMemberConditionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*EnvironmentIamMemberCondition)(nil)).Elem()
}

func (o EnvironmentIamMemberConditionOutput) ToEnvironmentIamMemberConditionOutput() EnvironmentIamMemberConditionOutput {
	return o
}

func (o EnvironmentIamMemberConditionOutput) ToEnvironmentIamMemberConditionOutputWithContext(ctx context.Context) EnvironmentIamMemberConditionOutput {
	return o
}

func (o EnvironmentIamMemberConditionOutput) ToEnvironmentIamMemberConditionPtrOutput() EnvironmentIamMemberConditionPtrOutput {
	return o.ToEnvironmentIamMemberConditionPtrOutputWithContext(context.Background())
}

func (o EnvironmentIamMemberConditionOutput) ToEnvironmentIamMemberConditionPtrOutputWithContext(ctx context.Context) EnvironmentIamMemberConditionPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v EnvironmentIamMemberCondition) *EnvironmentIamMemberCondition {
		return &v
	}).(EnvironmentIamMemberConditionPtrOutput)
}

func (o EnvironmentIamMemberConditionOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v EnvironmentIamMemberCondition) *string { return v.Description }).(pulumi.StringPtrOutput)
}

func (o EnvironmentIamMemberConditionOutput) Expression() pulumi.StringOutput {
	return o.ApplyT(func(v EnvironmentIamMemberCondition) string { return v.Expression }).(pulumi.StringOutput)
}

func (o EnvironmentIamMemberConditionOutput) Title() pulumi.StringOutput {
	return o.ApplyT(func(v EnvironmentIamMemberCondition) string { return v.Title }).(pulumi.StringOutput)
}

type EnvironmentIamMemberConditionPtrOutput struct{ *pulumi.OutputState }

func (EnvironmentIamMemberConditionPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**EnvironmentIamMemberCondition)(nil)).Elem()
}

func (o EnvironmentIamMemberConditionPtrOutput) ToEnvironmentIamMemberConditionPtrOutput() EnvironmentIamMemberConditionPtrOutput {
	return o
}

func (o EnvironmentIamMemberConditionPtrOutput) ToEnvironmentIamMemberConditionPtrOutputWithContext(ctx context.Context) EnvironmentIamMemberConditionPtrOutput {
	return o
}

func (o EnvironmentIamMemberConditionPtrOutput) Elem() EnvironmentIamMemberConditionOutput {
	return o.ApplyT(func(v *EnvironmentIamMemberCondition) EnvironmentIamMemberCondition {
		if v != nil {
			return *v
		}
		var ret EnvironmentIamMemberCondition
		return ret
	}).(EnvironmentIamMemberConditionOutput)
}

func (o EnvironmentIamMemberConditionPtrOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EnvironmentIamMemberCondition) *string {
		if v == nil {
			return nil
		}
		return v.Description
	}).(pulumi.StringPtrOutput)
}

func (o EnvironmentIamMemberConditionPtrOutput) Expression() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EnvironmentIamMemberCondition) *string {
		if v == nil {
			return nil
		}
		return &v.Expression
	}).(pulumi.StringPtrOutput)
}

func (o EnvironmentIamMemberConditionPtrOutput) Title() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EnvironmentIamMemberCondition) *string {
		if v == nil {
			return nil
		}
		return &v.Title
	}).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*EnvironmentIamBindingConditionInput)(nil)).Elem(), EnvironmentIamBindingConditionArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*EnvironmentIamBindingConditionPtrInput)(nil)).Elem(), EnvironmentIamBindingConditionArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*EnvironmentIamMemberConditionInput)(nil)).Elem(), EnvironmentIamMemberConditionArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*EnvironmentIamMemberConditionPtrInput)(nil)).Elem(), EnvironmentIamMemberConditionArgs{})
	pulumi.RegisterOutputType(EnvironmentIamBindingConditionOutput{})
	pulumi.RegisterOutputType(EnvironmentIamBindingConditionPtrOutput{})
	pulumi.RegisterOutputType(EnvironmentIamMemberConditionOutput{})
	pulumi.RegisterOutputType(EnvironmentIamMemberConditionPtrOutput{})
}