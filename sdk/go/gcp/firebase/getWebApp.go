// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package firebase

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// A Google Cloud Firebase web application instance
func LookupWebApp(ctx *pulumi.Context, args *LookupWebAppArgs, opts ...pulumi.InvokeOption) (*LookupWebAppResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupWebAppResult
	err := ctx.Invoke("gcp:firebase/getWebApp:getWebApp", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getWebApp.
type LookupWebAppArgs struct {
	// The appIp of name of the Firebase webApp.
	//
	// ***
	AppId string `pulumi:"appId"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
}

// A collection of values returned by getWebApp.
type LookupWebAppResult struct {
	ApiKeyId string `pulumi:"apiKeyId"`
	// Immutable. The globally unique, Firebase-assigned identifier of the App.
	// This identifier should be treated as an opaque token, as the data format is not specified.
	AppId          string   `pulumi:"appId"`
	AppUrls        []string `pulumi:"appUrls"`
	DeletionPolicy string   `pulumi:"deletionPolicy"`
	DisplayName    string   `pulumi:"displayName"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The fully qualified resource name of the App, for example:
	// projects/projectId/webApps/appId
	Name    string  `pulumi:"name"`
	Project *string `pulumi:"project"`
}

func LookupWebAppOutput(ctx *pulumi.Context, args LookupWebAppOutputArgs, opts ...pulumi.InvokeOption) LookupWebAppResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupWebAppResultOutput, error) {
			args := v.(LookupWebAppArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("gcp:firebase/getWebApp:getWebApp", args, LookupWebAppResultOutput{}, options).(LookupWebAppResultOutput), nil
		}).(LookupWebAppResultOutput)
}

// A collection of arguments for invoking getWebApp.
type LookupWebAppOutputArgs struct {
	// The appIp of name of the Firebase webApp.
	//
	// ***
	AppId pulumi.StringInput `pulumi:"appId"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput `pulumi:"project"`
}

func (LookupWebAppOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupWebAppArgs)(nil)).Elem()
}

// A collection of values returned by getWebApp.
type LookupWebAppResultOutput struct{ *pulumi.OutputState }

func (LookupWebAppResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupWebAppResult)(nil)).Elem()
}

func (o LookupWebAppResultOutput) ToLookupWebAppResultOutput() LookupWebAppResultOutput {
	return o
}

func (o LookupWebAppResultOutput) ToLookupWebAppResultOutputWithContext(ctx context.Context) LookupWebAppResultOutput {
	return o
}

func (o LookupWebAppResultOutput) ApiKeyId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWebAppResult) string { return v.ApiKeyId }).(pulumi.StringOutput)
}

// Immutable. The globally unique, Firebase-assigned identifier of the App.
// This identifier should be treated as an opaque token, as the data format is not specified.
func (o LookupWebAppResultOutput) AppId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWebAppResult) string { return v.AppId }).(pulumi.StringOutput)
}

func (o LookupWebAppResultOutput) AppUrls() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupWebAppResult) []string { return v.AppUrls }).(pulumi.StringArrayOutput)
}

func (o LookupWebAppResultOutput) DeletionPolicy() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWebAppResult) string { return v.DeletionPolicy }).(pulumi.StringOutput)
}

func (o LookupWebAppResultOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWebAppResult) string { return v.DisplayName }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupWebAppResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWebAppResult) string { return v.Id }).(pulumi.StringOutput)
}

// The fully qualified resource name of the App, for example:
// projects/projectId/webApps/appId
func (o LookupWebAppResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWebAppResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupWebAppResultOutput) Project() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupWebAppResult) *string { return v.Project }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupWebAppResultOutput{})
}
