// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package beyondcorp

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type AppConnectorPrincipalInfo struct {
	// ServiceAccount represents a GCP service account.
	// Structure is documented below.
	ServiceAccount AppConnectorPrincipalInfoServiceAccount `pulumi:"serviceAccount"`
}

// AppConnectorPrincipalInfoInput is an input type that accepts AppConnectorPrincipalInfoArgs and AppConnectorPrincipalInfoOutput values.
// You can construct a concrete instance of `AppConnectorPrincipalInfoInput` via:
//
//	AppConnectorPrincipalInfoArgs{...}
type AppConnectorPrincipalInfoInput interface {
	pulumi.Input

	ToAppConnectorPrincipalInfoOutput() AppConnectorPrincipalInfoOutput
	ToAppConnectorPrincipalInfoOutputWithContext(context.Context) AppConnectorPrincipalInfoOutput
}

type AppConnectorPrincipalInfoArgs struct {
	// ServiceAccount represents a GCP service account.
	// Structure is documented below.
	ServiceAccount AppConnectorPrincipalInfoServiceAccountInput `pulumi:"serviceAccount"`
}

func (AppConnectorPrincipalInfoArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*AppConnectorPrincipalInfo)(nil)).Elem()
}

func (i AppConnectorPrincipalInfoArgs) ToAppConnectorPrincipalInfoOutput() AppConnectorPrincipalInfoOutput {
	return i.ToAppConnectorPrincipalInfoOutputWithContext(context.Background())
}

func (i AppConnectorPrincipalInfoArgs) ToAppConnectorPrincipalInfoOutputWithContext(ctx context.Context) AppConnectorPrincipalInfoOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppConnectorPrincipalInfoOutput)
}

func (i AppConnectorPrincipalInfoArgs) ToAppConnectorPrincipalInfoPtrOutput() AppConnectorPrincipalInfoPtrOutput {
	return i.ToAppConnectorPrincipalInfoPtrOutputWithContext(context.Background())
}

func (i AppConnectorPrincipalInfoArgs) ToAppConnectorPrincipalInfoPtrOutputWithContext(ctx context.Context) AppConnectorPrincipalInfoPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppConnectorPrincipalInfoOutput).ToAppConnectorPrincipalInfoPtrOutputWithContext(ctx)
}

// AppConnectorPrincipalInfoPtrInput is an input type that accepts AppConnectorPrincipalInfoArgs, AppConnectorPrincipalInfoPtr and AppConnectorPrincipalInfoPtrOutput values.
// You can construct a concrete instance of `AppConnectorPrincipalInfoPtrInput` via:
//
//	        AppConnectorPrincipalInfoArgs{...}
//
//	or:
//
//	        nil
type AppConnectorPrincipalInfoPtrInput interface {
	pulumi.Input

	ToAppConnectorPrincipalInfoPtrOutput() AppConnectorPrincipalInfoPtrOutput
	ToAppConnectorPrincipalInfoPtrOutputWithContext(context.Context) AppConnectorPrincipalInfoPtrOutput
}

type appConnectorPrincipalInfoPtrType AppConnectorPrincipalInfoArgs

func AppConnectorPrincipalInfoPtr(v *AppConnectorPrincipalInfoArgs) AppConnectorPrincipalInfoPtrInput {
	return (*appConnectorPrincipalInfoPtrType)(v)
}

func (*appConnectorPrincipalInfoPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**AppConnectorPrincipalInfo)(nil)).Elem()
}

func (i *appConnectorPrincipalInfoPtrType) ToAppConnectorPrincipalInfoPtrOutput() AppConnectorPrincipalInfoPtrOutput {
	return i.ToAppConnectorPrincipalInfoPtrOutputWithContext(context.Background())
}

func (i *appConnectorPrincipalInfoPtrType) ToAppConnectorPrincipalInfoPtrOutputWithContext(ctx context.Context) AppConnectorPrincipalInfoPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppConnectorPrincipalInfoPtrOutput)
}

type AppConnectorPrincipalInfoOutput struct{ *pulumi.OutputState }

func (AppConnectorPrincipalInfoOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*AppConnectorPrincipalInfo)(nil)).Elem()
}

func (o AppConnectorPrincipalInfoOutput) ToAppConnectorPrincipalInfoOutput() AppConnectorPrincipalInfoOutput {
	return o
}

func (o AppConnectorPrincipalInfoOutput) ToAppConnectorPrincipalInfoOutputWithContext(ctx context.Context) AppConnectorPrincipalInfoOutput {
	return o
}

func (o AppConnectorPrincipalInfoOutput) ToAppConnectorPrincipalInfoPtrOutput() AppConnectorPrincipalInfoPtrOutput {
	return o.ToAppConnectorPrincipalInfoPtrOutputWithContext(context.Background())
}

func (o AppConnectorPrincipalInfoOutput) ToAppConnectorPrincipalInfoPtrOutputWithContext(ctx context.Context) AppConnectorPrincipalInfoPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v AppConnectorPrincipalInfo) *AppConnectorPrincipalInfo {
		return &v
	}).(AppConnectorPrincipalInfoPtrOutput)
}

// ServiceAccount represents a GCP service account.
// Structure is documented below.
func (o AppConnectorPrincipalInfoOutput) ServiceAccount() AppConnectorPrincipalInfoServiceAccountOutput {
	return o.ApplyT(func(v AppConnectorPrincipalInfo) AppConnectorPrincipalInfoServiceAccount { return v.ServiceAccount }).(AppConnectorPrincipalInfoServiceAccountOutput)
}

type AppConnectorPrincipalInfoPtrOutput struct{ *pulumi.OutputState }

func (AppConnectorPrincipalInfoPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AppConnectorPrincipalInfo)(nil)).Elem()
}

func (o AppConnectorPrincipalInfoPtrOutput) ToAppConnectorPrincipalInfoPtrOutput() AppConnectorPrincipalInfoPtrOutput {
	return o
}

func (o AppConnectorPrincipalInfoPtrOutput) ToAppConnectorPrincipalInfoPtrOutputWithContext(ctx context.Context) AppConnectorPrincipalInfoPtrOutput {
	return o
}

func (o AppConnectorPrincipalInfoPtrOutput) Elem() AppConnectorPrincipalInfoOutput {
	return o.ApplyT(func(v *AppConnectorPrincipalInfo) AppConnectorPrincipalInfo {
		if v != nil {
			return *v
		}
		var ret AppConnectorPrincipalInfo
		return ret
	}).(AppConnectorPrincipalInfoOutput)
}

// ServiceAccount represents a GCP service account.
// Structure is documented below.
func (o AppConnectorPrincipalInfoPtrOutput) ServiceAccount() AppConnectorPrincipalInfoServiceAccountPtrOutput {
	return o.ApplyT(func(v *AppConnectorPrincipalInfo) *AppConnectorPrincipalInfoServiceAccount {
		if v == nil {
			return nil
		}
		return &v.ServiceAccount
	}).(AppConnectorPrincipalInfoServiceAccountPtrOutput)
}

type AppConnectorPrincipalInfoServiceAccount struct {
	// Email address of the service account.
	Email string `pulumi:"email"`
}

// AppConnectorPrincipalInfoServiceAccountInput is an input type that accepts AppConnectorPrincipalInfoServiceAccountArgs and AppConnectorPrincipalInfoServiceAccountOutput values.
// You can construct a concrete instance of `AppConnectorPrincipalInfoServiceAccountInput` via:
//
//	AppConnectorPrincipalInfoServiceAccountArgs{...}
type AppConnectorPrincipalInfoServiceAccountInput interface {
	pulumi.Input

	ToAppConnectorPrincipalInfoServiceAccountOutput() AppConnectorPrincipalInfoServiceAccountOutput
	ToAppConnectorPrincipalInfoServiceAccountOutputWithContext(context.Context) AppConnectorPrincipalInfoServiceAccountOutput
}

type AppConnectorPrincipalInfoServiceAccountArgs struct {
	// Email address of the service account.
	Email pulumi.StringInput `pulumi:"email"`
}

func (AppConnectorPrincipalInfoServiceAccountArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*AppConnectorPrincipalInfoServiceAccount)(nil)).Elem()
}

func (i AppConnectorPrincipalInfoServiceAccountArgs) ToAppConnectorPrincipalInfoServiceAccountOutput() AppConnectorPrincipalInfoServiceAccountOutput {
	return i.ToAppConnectorPrincipalInfoServiceAccountOutputWithContext(context.Background())
}

func (i AppConnectorPrincipalInfoServiceAccountArgs) ToAppConnectorPrincipalInfoServiceAccountOutputWithContext(ctx context.Context) AppConnectorPrincipalInfoServiceAccountOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppConnectorPrincipalInfoServiceAccountOutput)
}

func (i AppConnectorPrincipalInfoServiceAccountArgs) ToAppConnectorPrincipalInfoServiceAccountPtrOutput() AppConnectorPrincipalInfoServiceAccountPtrOutput {
	return i.ToAppConnectorPrincipalInfoServiceAccountPtrOutputWithContext(context.Background())
}

func (i AppConnectorPrincipalInfoServiceAccountArgs) ToAppConnectorPrincipalInfoServiceAccountPtrOutputWithContext(ctx context.Context) AppConnectorPrincipalInfoServiceAccountPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppConnectorPrincipalInfoServiceAccountOutput).ToAppConnectorPrincipalInfoServiceAccountPtrOutputWithContext(ctx)
}

// AppConnectorPrincipalInfoServiceAccountPtrInput is an input type that accepts AppConnectorPrincipalInfoServiceAccountArgs, AppConnectorPrincipalInfoServiceAccountPtr and AppConnectorPrincipalInfoServiceAccountPtrOutput values.
// You can construct a concrete instance of `AppConnectorPrincipalInfoServiceAccountPtrInput` via:
//
//	        AppConnectorPrincipalInfoServiceAccountArgs{...}
//
//	or:
//
//	        nil
type AppConnectorPrincipalInfoServiceAccountPtrInput interface {
	pulumi.Input

	ToAppConnectorPrincipalInfoServiceAccountPtrOutput() AppConnectorPrincipalInfoServiceAccountPtrOutput
	ToAppConnectorPrincipalInfoServiceAccountPtrOutputWithContext(context.Context) AppConnectorPrincipalInfoServiceAccountPtrOutput
}

type appConnectorPrincipalInfoServiceAccountPtrType AppConnectorPrincipalInfoServiceAccountArgs

func AppConnectorPrincipalInfoServiceAccountPtr(v *AppConnectorPrincipalInfoServiceAccountArgs) AppConnectorPrincipalInfoServiceAccountPtrInput {
	return (*appConnectorPrincipalInfoServiceAccountPtrType)(v)
}

func (*appConnectorPrincipalInfoServiceAccountPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**AppConnectorPrincipalInfoServiceAccount)(nil)).Elem()
}

func (i *appConnectorPrincipalInfoServiceAccountPtrType) ToAppConnectorPrincipalInfoServiceAccountPtrOutput() AppConnectorPrincipalInfoServiceAccountPtrOutput {
	return i.ToAppConnectorPrincipalInfoServiceAccountPtrOutputWithContext(context.Background())
}

func (i *appConnectorPrincipalInfoServiceAccountPtrType) ToAppConnectorPrincipalInfoServiceAccountPtrOutputWithContext(ctx context.Context) AppConnectorPrincipalInfoServiceAccountPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppConnectorPrincipalInfoServiceAccountPtrOutput)
}

type AppConnectorPrincipalInfoServiceAccountOutput struct{ *pulumi.OutputState }

func (AppConnectorPrincipalInfoServiceAccountOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*AppConnectorPrincipalInfoServiceAccount)(nil)).Elem()
}

func (o AppConnectorPrincipalInfoServiceAccountOutput) ToAppConnectorPrincipalInfoServiceAccountOutput() AppConnectorPrincipalInfoServiceAccountOutput {
	return o
}

func (o AppConnectorPrincipalInfoServiceAccountOutput) ToAppConnectorPrincipalInfoServiceAccountOutputWithContext(ctx context.Context) AppConnectorPrincipalInfoServiceAccountOutput {
	return o
}

func (o AppConnectorPrincipalInfoServiceAccountOutput) ToAppConnectorPrincipalInfoServiceAccountPtrOutput() AppConnectorPrincipalInfoServiceAccountPtrOutput {
	return o.ToAppConnectorPrincipalInfoServiceAccountPtrOutputWithContext(context.Background())
}

func (o AppConnectorPrincipalInfoServiceAccountOutput) ToAppConnectorPrincipalInfoServiceAccountPtrOutputWithContext(ctx context.Context) AppConnectorPrincipalInfoServiceAccountPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v AppConnectorPrincipalInfoServiceAccount) *AppConnectorPrincipalInfoServiceAccount {
		return &v
	}).(AppConnectorPrincipalInfoServiceAccountPtrOutput)
}

// Email address of the service account.
func (o AppConnectorPrincipalInfoServiceAccountOutput) Email() pulumi.StringOutput {
	return o.ApplyT(func(v AppConnectorPrincipalInfoServiceAccount) string { return v.Email }).(pulumi.StringOutput)
}

type AppConnectorPrincipalInfoServiceAccountPtrOutput struct{ *pulumi.OutputState }

func (AppConnectorPrincipalInfoServiceAccountPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AppConnectorPrincipalInfoServiceAccount)(nil)).Elem()
}

func (o AppConnectorPrincipalInfoServiceAccountPtrOutput) ToAppConnectorPrincipalInfoServiceAccountPtrOutput() AppConnectorPrincipalInfoServiceAccountPtrOutput {
	return o
}

func (o AppConnectorPrincipalInfoServiceAccountPtrOutput) ToAppConnectorPrincipalInfoServiceAccountPtrOutputWithContext(ctx context.Context) AppConnectorPrincipalInfoServiceAccountPtrOutput {
	return o
}

func (o AppConnectorPrincipalInfoServiceAccountPtrOutput) Elem() AppConnectorPrincipalInfoServiceAccountOutput {
	return o.ApplyT(func(v *AppConnectorPrincipalInfoServiceAccount) AppConnectorPrincipalInfoServiceAccount {
		if v != nil {
			return *v
		}
		var ret AppConnectorPrincipalInfoServiceAccount
		return ret
	}).(AppConnectorPrincipalInfoServiceAccountOutput)
}

// Email address of the service account.
func (o AppConnectorPrincipalInfoServiceAccountPtrOutput) Email() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AppConnectorPrincipalInfoServiceAccount) *string {
		if v == nil {
			return nil
		}
		return &v.Email
	}).(pulumi.StringPtrOutput)
}

type AppGatewayAllocatedConnection struct {
	IngressPort *int    `pulumi:"ingressPort"`
	PscUri      *string `pulumi:"pscUri"`
}

// AppGatewayAllocatedConnectionInput is an input type that accepts AppGatewayAllocatedConnectionArgs and AppGatewayAllocatedConnectionOutput values.
// You can construct a concrete instance of `AppGatewayAllocatedConnectionInput` via:
//
//	AppGatewayAllocatedConnectionArgs{...}
type AppGatewayAllocatedConnectionInput interface {
	pulumi.Input

	ToAppGatewayAllocatedConnectionOutput() AppGatewayAllocatedConnectionOutput
	ToAppGatewayAllocatedConnectionOutputWithContext(context.Context) AppGatewayAllocatedConnectionOutput
}

type AppGatewayAllocatedConnectionArgs struct {
	IngressPort pulumi.IntPtrInput    `pulumi:"ingressPort"`
	PscUri      pulumi.StringPtrInput `pulumi:"pscUri"`
}

func (AppGatewayAllocatedConnectionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*AppGatewayAllocatedConnection)(nil)).Elem()
}

func (i AppGatewayAllocatedConnectionArgs) ToAppGatewayAllocatedConnectionOutput() AppGatewayAllocatedConnectionOutput {
	return i.ToAppGatewayAllocatedConnectionOutputWithContext(context.Background())
}

func (i AppGatewayAllocatedConnectionArgs) ToAppGatewayAllocatedConnectionOutputWithContext(ctx context.Context) AppGatewayAllocatedConnectionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppGatewayAllocatedConnectionOutput)
}

// AppGatewayAllocatedConnectionArrayInput is an input type that accepts AppGatewayAllocatedConnectionArray and AppGatewayAllocatedConnectionArrayOutput values.
// You can construct a concrete instance of `AppGatewayAllocatedConnectionArrayInput` via:
//
//	AppGatewayAllocatedConnectionArray{ AppGatewayAllocatedConnectionArgs{...} }
type AppGatewayAllocatedConnectionArrayInput interface {
	pulumi.Input

	ToAppGatewayAllocatedConnectionArrayOutput() AppGatewayAllocatedConnectionArrayOutput
	ToAppGatewayAllocatedConnectionArrayOutputWithContext(context.Context) AppGatewayAllocatedConnectionArrayOutput
}

type AppGatewayAllocatedConnectionArray []AppGatewayAllocatedConnectionInput

func (AppGatewayAllocatedConnectionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]AppGatewayAllocatedConnection)(nil)).Elem()
}

func (i AppGatewayAllocatedConnectionArray) ToAppGatewayAllocatedConnectionArrayOutput() AppGatewayAllocatedConnectionArrayOutput {
	return i.ToAppGatewayAllocatedConnectionArrayOutputWithContext(context.Background())
}

func (i AppGatewayAllocatedConnectionArray) ToAppGatewayAllocatedConnectionArrayOutputWithContext(ctx context.Context) AppGatewayAllocatedConnectionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppGatewayAllocatedConnectionArrayOutput)
}

type AppGatewayAllocatedConnectionOutput struct{ *pulumi.OutputState }

func (AppGatewayAllocatedConnectionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*AppGatewayAllocatedConnection)(nil)).Elem()
}

func (o AppGatewayAllocatedConnectionOutput) ToAppGatewayAllocatedConnectionOutput() AppGatewayAllocatedConnectionOutput {
	return o
}

func (o AppGatewayAllocatedConnectionOutput) ToAppGatewayAllocatedConnectionOutputWithContext(ctx context.Context) AppGatewayAllocatedConnectionOutput {
	return o
}

func (o AppGatewayAllocatedConnectionOutput) IngressPort() pulumi.IntPtrOutput {
	return o.ApplyT(func(v AppGatewayAllocatedConnection) *int { return v.IngressPort }).(pulumi.IntPtrOutput)
}

func (o AppGatewayAllocatedConnectionOutput) PscUri() pulumi.StringPtrOutput {
	return o.ApplyT(func(v AppGatewayAllocatedConnection) *string { return v.PscUri }).(pulumi.StringPtrOutput)
}

type AppGatewayAllocatedConnectionArrayOutput struct{ *pulumi.OutputState }

func (AppGatewayAllocatedConnectionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]AppGatewayAllocatedConnection)(nil)).Elem()
}

func (o AppGatewayAllocatedConnectionArrayOutput) ToAppGatewayAllocatedConnectionArrayOutput() AppGatewayAllocatedConnectionArrayOutput {
	return o
}

func (o AppGatewayAllocatedConnectionArrayOutput) ToAppGatewayAllocatedConnectionArrayOutputWithContext(ctx context.Context) AppGatewayAllocatedConnectionArrayOutput {
	return o
}

func (o AppGatewayAllocatedConnectionArrayOutput) Index(i pulumi.IntInput) AppGatewayAllocatedConnectionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) AppGatewayAllocatedConnection {
		return vs[0].([]AppGatewayAllocatedConnection)[vs[1].(int)]
	}).(AppGatewayAllocatedConnectionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AppConnectorPrincipalInfoInput)(nil)).Elem(), AppConnectorPrincipalInfoArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*AppConnectorPrincipalInfoPtrInput)(nil)).Elem(), AppConnectorPrincipalInfoArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*AppConnectorPrincipalInfoServiceAccountInput)(nil)).Elem(), AppConnectorPrincipalInfoServiceAccountArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*AppConnectorPrincipalInfoServiceAccountPtrInput)(nil)).Elem(), AppConnectorPrincipalInfoServiceAccountArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*AppGatewayAllocatedConnectionInput)(nil)).Elem(), AppGatewayAllocatedConnectionArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*AppGatewayAllocatedConnectionArrayInput)(nil)).Elem(), AppGatewayAllocatedConnectionArray{})
	pulumi.RegisterOutputType(AppConnectorPrincipalInfoOutput{})
	pulumi.RegisterOutputType(AppConnectorPrincipalInfoPtrOutput{})
	pulumi.RegisterOutputType(AppConnectorPrincipalInfoServiceAccountOutput{})
	pulumi.RegisterOutputType(AppConnectorPrincipalInfoServiceAccountPtrOutput{})
	pulumi.RegisterOutputType(AppGatewayAllocatedConnectionOutput{})
	pulumi.RegisterOutputType(AppGatewayAllocatedConnectionArrayOutput{})
}