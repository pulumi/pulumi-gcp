// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package gcp

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

var _ = internal.GetEnvOrDefault

type ProviderBatching struct {
	EnableBatching *bool   `pulumi:"enableBatching"`
	SendAfter      *string `pulumi:"sendAfter"`
}

// ProviderBatchingInput is an input type that accepts ProviderBatchingArgs and ProviderBatchingOutput values.
// You can construct a concrete instance of `ProviderBatchingInput` via:
//
//	ProviderBatchingArgs{...}
type ProviderBatchingInput interface {
	pulumi.Input

	ToProviderBatchingOutput() ProviderBatchingOutput
	ToProviderBatchingOutputWithContext(context.Context) ProviderBatchingOutput
}

type ProviderBatchingArgs struct {
	EnableBatching pulumi.BoolPtrInput   `pulumi:"enableBatching"`
	SendAfter      pulumi.StringPtrInput `pulumi:"sendAfter"`
}

func (ProviderBatchingArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*ProviderBatching)(nil)).Elem()
}

func (i ProviderBatchingArgs) ToProviderBatchingOutput() ProviderBatchingOutput {
	return i.ToProviderBatchingOutputWithContext(context.Background())
}

func (i ProviderBatchingArgs) ToProviderBatchingOutputWithContext(ctx context.Context) ProviderBatchingOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProviderBatchingOutput)
}

func (i ProviderBatchingArgs) ToProviderBatchingPtrOutput() ProviderBatchingPtrOutput {
	return i.ToProviderBatchingPtrOutputWithContext(context.Background())
}

func (i ProviderBatchingArgs) ToProviderBatchingPtrOutputWithContext(ctx context.Context) ProviderBatchingPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProviderBatchingOutput).ToProviderBatchingPtrOutputWithContext(ctx)
}

// ProviderBatchingPtrInput is an input type that accepts ProviderBatchingArgs, ProviderBatchingPtr and ProviderBatchingPtrOutput values.
// You can construct a concrete instance of `ProviderBatchingPtrInput` via:
//
//	        ProviderBatchingArgs{...}
//
//	or:
//
//	        nil
type ProviderBatchingPtrInput interface {
	pulumi.Input

	ToProviderBatchingPtrOutput() ProviderBatchingPtrOutput
	ToProviderBatchingPtrOutputWithContext(context.Context) ProviderBatchingPtrOutput
}

type providerBatchingPtrType ProviderBatchingArgs

func ProviderBatchingPtr(v *ProviderBatchingArgs) ProviderBatchingPtrInput {
	return (*providerBatchingPtrType)(v)
}

func (*providerBatchingPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**ProviderBatching)(nil)).Elem()
}

func (i *providerBatchingPtrType) ToProviderBatchingPtrOutput() ProviderBatchingPtrOutput {
	return i.ToProviderBatchingPtrOutputWithContext(context.Background())
}

func (i *providerBatchingPtrType) ToProviderBatchingPtrOutputWithContext(ctx context.Context) ProviderBatchingPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProviderBatchingPtrOutput)
}

type ProviderBatchingOutput struct{ *pulumi.OutputState }

func (ProviderBatchingOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ProviderBatching)(nil)).Elem()
}

func (o ProviderBatchingOutput) ToProviderBatchingOutput() ProviderBatchingOutput {
	return o
}

func (o ProviderBatchingOutput) ToProviderBatchingOutputWithContext(ctx context.Context) ProviderBatchingOutput {
	return o
}

func (o ProviderBatchingOutput) ToProviderBatchingPtrOutput() ProviderBatchingPtrOutput {
	return o.ToProviderBatchingPtrOutputWithContext(context.Background())
}

func (o ProviderBatchingOutput) ToProviderBatchingPtrOutputWithContext(ctx context.Context) ProviderBatchingPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v ProviderBatching) *ProviderBatching {
		return &v
	}).(ProviderBatchingPtrOutput)
}

func (o ProviderBatchingOutput) EnableBatching() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v ProviderBatching) *bool { return v.EnableBatching }).(pulumi.BoolPtrOutput)
}

func (o ProviderBatchingOutput) SendAfter() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ProviderBatching) *string { return v.SendAfter }).(pulumi.StringPtrOutput)
}

type ProviderBatchingPtrOutput struct{ *pulumi.OutputState }

func (ProviderBatchingPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ProviderBatching)(nil)).Elem()
}

func (o ProviderBatchingPtrOutput) ToProviderBatchingPtrOutput() ProviderBatchingPtrOutput {
	return o
}

func (o ProviderBatchingPtrOutput) ToProviderBatchingPtrOutputWithContext(ctx context.Context) ProviderBatchingPtrOutput {
	return o
}

func (o ProviderBatchingPtrOutput) Elem() ProviderBatchingOutput {
	return o.ApplyT(func(v *ProviderBatching) ProviderBatching {
		if v != nil {
			return *v
		}
		var ret ProviderBatching
		return ret
	}).(ProviderBatchingOutput)
}

func (o ProviderBatchingPtrOutput) EnableBatching() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ProviderBatching) *bool {
		if v == nil {
			return nil
		}
		return v.EnableBatching
	}).(pulumi.BoolPtrOutput)
}

func (o ProviderBatchingPtrOutput) SendAfter() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ProviderBatching) *string {
		if v == nil {
			return nil
		}
		return v.SendAfter
	}).(pulumi.StringPtrOutput)
}

type ProviderExternalCredentials struct {
	Audience            string `pulumi:"audience"`
	IdentityToken       string `pulumi:"identityToken"`
	ServiceAccountEmail string `pulumi:"serviceAccountEmail"`
}

// ProviderExternalCredentialsInput is an input type that accepts ProviderExternalCredentialsArgs and ProviderExternalCredentialsOutput values.
// You can construct a concrete instance of `ProviderExternalCredentialsInput` via:
//
//	ProviderExternalCredentialsArgs{...}
type ProviderExternalCredentialsInput interface {
	pulumi.Input

	ToProviderExternalCredentialsOutput() ProviderExternalCredentialsOutput
	ToProviderExternalCredentialsOutputWithContext(context.Context) ProviderExternalCredentialsOutput
}

type ProviderExternalCredentialsArgs struct {
	Audience            pulumi.StringInput `pulumi:"audience"`
	IdentityToken       pulumi.StringInput `pulumi:"identityToken"`
	ServiceAccountEmail pulumi.StringInput `pulumi:"serviceAccountEmail"`
}

func (ProviderExternalCredentialsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*ProviderExternalCredentials)(nil)).Elem()
}

func (i ProviderExternalCredentialsArgs) ToProviderExternalCredentialsOutput() ProviderExternalCredentialsOutput {
	return i.ToProviderExternalCredentialsOutputWithContext(context.Background())
}

func (i ProviderExternalCredentialsArgs) ToProviderExternalCredentialsOutputWithContext(ctx context.Context) ProviderExternalCredentialsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProviderExternalCredentialsOutput)
}

func (i ProviderExternalCredentialsArgs) ToProviderExternalCredentialsPtrOutput() ProviderExternalCredentialsPtrOutput {
	return i.ToProviderExternalCredentialsPtrOutputWithContext(context.Background())
}

func (i ProviderExternalCredentialsArgs) ToProviderExternalCredentialsPtrOutputWithContext(ctx context.Context) ProviderExternalCredentialsPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProviderExternalCredentialsOutput).ToProviderExternalCredentialsPtrOutputWithContext(ctx)
}

// ProviderExternalCredentialsPtrInput is an input type that accepts ProviderExternalCredentialsArgs, ProviderExternalCredentialsPtr and ProviderExternalCredentialsPtrOutput values.
// You can construct a concrete instance of `ProviderExternalCredentialsPtrInput` via:
//
//	        ProviderExternalCredentialsArgs{...}
//
//	or:
//
//	        nil
type ProviderExternalCredentialsPtrInput interface {
	pulumi.Input

	ToProviderExternalCredentialsPtrOutput() ProviderExternalCredentialsPtrOutput
	ToProviderExternalCredentialsPtrOutputWithContext(context.Context) ProviderExternalCredentialsPtrOutput
}

type providerExternalCredentialsPtrType ProviderExternalCredentialsArgs

func ProviderExternalCredentialsPtr(v *ProviderExternalCredentialsArgs) ProviderExternalCredentialsPtrInput {
	return (*providerExternalCredentialsPtrType)(v)
}

func (*providerExternalCredentialsPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**ProviderExternalCredentials)(nil)).Elem()
}

func (i *providerExternalCredentialsPtrType) ToProviderExternalCredentialsPtrOutput() ProviderExternalCredentialsPtrOutput {
	return i.ToProviderExternalCredentialsPtrOutputWithContext(context.Background())
}

func (i *providerExternalCredentialsPtrType) ToProviderExternalCredentialsPtrOutputWithContext(ctx context.Context) ProviderExternalCredentialsPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProviderExternalCredentialsPtrOutput)
}

type ProviderExternalCredentialsOutput struct{ *pulumi.OutputState }

func (ProviderExternalCredentialsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ProviderExternalCredentials)(nil)).Elem()
}

func (o ProviderExternalCredentialsOutput) ToProviderExternalCredentialsOutput() ProviderExternalCredentialsOutput {
	return o
}

func (o ProviderExternalCredentialsOutput) ToProviderExternalCredentialsOutputWithContext(ctx context.Context) ProviderExternalCredentialsOutput {
	return o
}

func (o ProviderExternalCredentialsOutput) ToProviderExternalCredentialsPtrOutput() ProviderExternalCredentialsPtrOutput {
	return o.ToProviderExternalCredentialsPtrOutputWithContext(context.Background())
}

func (o ProviderExternalCredentialsOutput) ToProviderExternalCredentialsPtrOutputWithContext(ctx context.Context) ProviderExternalCredentialsPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v ProviderExternalCredentials) *ProviderExternalCredentials {
		return &v
	}).(ProviderExternalCredentialsPtrOutput)
}

func (o ProviderExternalCredentialsOutput) Audience() pulumi.StringOutput {
	return o.ApplyT(func(v ProviderExternalCredentials) string { return v.Audience }).(pulumi.StringOutput)
}

func (o ProviderExternalCredentialsOutput) IdentityToken() pulumi.StringOutput {
	return o.ApplyT(func(v ProviderExternalCredentials) string { return v.IdentityToken }).(pulumi.StringOutput)
}

func (o ProviderExternalCredentialsOutput) ServiceAccountEmail() pulumi.StringOutput {
	return o.ApplyT(func(v ProviderExternalCredentials) string { return v.ServiceAccountEmail }).(pulumi.StringOutput)
}

type ProviderExternalCredentialsPtrOutput struct{ *pulumi.OutputState }

func (ProviderExternalCredentialsPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ProviderExternalCredentials)(nil)).Elem()
}

func (o ProviderExternalCredentialsPtrOutput) ToProviderExternalCredentialsPtrOutput() ProviderExternalCredentialsPtrOutput {
	return o
}

func (o ProviderExternalCredentialsPtrOutput) ToProviderExternalCredentialsPtrOutputWithContext(ctx context.Context) ProviderExternalCredentialsPtrOutput {
	return o
}

func (o ProviderExternalCredentialsPtrOutput) Elem() ProviderExternalCredentialsOutput {
	return o.ApplyT(func(v *ProviderExternalCredentials) ProviderExternalCredentials {
		if v != nil {
			return *v
		}
		var ret ProviderExternalCredentials
		return ret
	}).(ProviderExternalCredentialsOutput)
}

func (o ProviderExternalCredentialsPtrOutput) Audience() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ProviderExternalCredentials) *string {
		if v == nil {
			return nil
		}
		return &v.Audience
	}).(pulumi.StringPtrOutput)
}

func (o ProviderExternalCredentialsPtrOutput) IdentityToken() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ProviderExternalCredentials) *string {
		if v == nil {
			return nil
		}
		return &v.IdentityToken
	}).(pulumi.StringPtrOutput)
}

func (o ProviderExternalCredentialsPtrOutput) ServiceAccountEmail() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ProviderExternalCredentials) *string {
		if v == nil {
			return nil
		}
		return &v.ServiceAccountEmail
	}).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ProviderBatchingInput)(nil)).Elem(), ProviderBatchingArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProviderBatchingPtrInput)(nil)).Elem(), ProviderBatchingArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProviderExternalCredentialsInput)(nil)).Elem(), ProviderExternalCredentialsArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProviderExternalCredentialsPtrInput)(nil)).Elem(), ProviderExternalCredentialsArgs{})
	pulumi.RegisterOutputType(ProviderBatchingOutput{})
	pulumi.RegisterOutputType(ProviderBatchingPtrOutput{})
	pulumi.RegisterOutputType(ProviderExternalCredentialsOutput{})
	pulumi.RegisterOutputType(ProviderExternalCredentialsPtrOutput{})
}
