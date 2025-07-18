// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package backupdisasterrecovery

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/backupdisasterrecovery"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := backupdisasterrecovery.LookupManagementServer(ctx, &backupdisasterrecovery.LookupManagementServerArgs{
//				Location: "us-central1",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupManagementServer(ctx *pulumi.Context, args *LookupManagementServerArgs, opts ...pulumi.InvokeOption) (*LookupManagementServerResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupManagementServerResult
	err := ctx.Invoke("gcp:backupdisasterrecovery/getManagementServer:getManagementServer", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getManagementServer.
type LookupManagementServerArgs struct {
	Location string `pulumi:"location"`
}

// A collection of values returned by getManagementServer.
type LookupManagementServerResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id             string                             `pulumi:"id"`
	Location       string                             `pulumi:"location"`
	ManagementUris []GetManagementServerManagementUri `pulumi:"managementUris"`
	Name           string                             `pulumi:"name"`
	Networks       []GetManagementServerNetwork       `pulumi:"networks"`
	Oauth2ClientId string                             `pulumi:"oauth2ClientId"`
	Project        string                             `pulumi:"project"`
	Type           string                             `pulumi:"type"`
}

func LookupManagementServerOutput(ctx *pulumi.Context, args LookupManagementServerOutputArgs, opts ...pulumi.InvokeOption) LookupManagementServerResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupManagementServerResultOutput, error) {
			args := v.(LookupManagementServerArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("gcp:backupdisasterrecovery/getManagementServer:getManagementServer", args, LookupManagementServerResultOutput{}, options).(LookupManagementServerResultOutput), nil
		}).(LookupManagementServerResultOutput)
}

// A collection of arguments for invoking getManagementServer.
type LookupManagementServerOutputArgs struct {
	Location pulumi.StringInput `pulumi:"location"`
}

func (LookupManagementServerOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupManagementServerArgs)(nil)).Elem()
}

// A collection of values returned by getManagementServer.
type LookupManagementServerResultOutput struct{ *pulumi.OutputState }

func (LookupManagementServerResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupManagementServerResult)(nil)).Elem()
}

func (o LookupManagementServerResultOutput) ToLookupManagementServerResultOutput() LookupManagementServerResultOutput {
	return o
}

func (o LookupManagementServerResultOutput) ToLookupManagementServerResultOutputWithContext(ctx context.Context) LookupManagementServerResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupManagementServerResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupManagementServerResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupManagementServerResultOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v LookupManagementServerResult) string { return v.Location }).(pulumi.StringOutput)
}

func (o LookupManagementServerResultOutput) ManagementUris() GetManagementServerManagementUriArrayOutput {
	return o.ApplyT(func(v LookupManagementServerResult) []GetManagementServerManagementUri { return v.ManagementUris }).(GetManagementServerManagementUriArrayOutput)
}

func (o LookupManagementServerResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupManagementServerResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupManagementServerResultOutput) Networks() GetManagementServerNetworkArrayOutput {
	return o.ApplyT(func(v LookupManagementServerResult) []GetManagementServerNetwork { return v.Networks }).(GetManagementServerNetworkArrayOutput)
}

func (o LookupManagementServerResultOutput) Oauth2ClientId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupManagementServerResult) string { return v.Oauth2ClientId }).(pulumi.StringOutput)
}

func (o LookupManagementServerResultOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v LookupManagementServerResult) string { return v.Project }).(pulumi.StringOutput)
}

func (o LookupManagementServerResultOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v LookupManagementServerResult) string { return v.Type }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupManagementServerResultOutput{})
}
