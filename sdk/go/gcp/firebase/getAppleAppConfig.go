// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package firebase

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func GetAppleAppConfig(ctx *pulumi.Context, args *GetAppleAppConfigArgs, opts ...pulumi.InvokeOption) (*GetAppleAppConfigResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetAppleAppConfigResult
	err := ctx.Invoke("gcp:firebase/getAppleAppConfig:getAppleAppConfig", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAppleAppConfig.
type GetAppleAppConfigArgs struct {
	// The id of the Firebase iOS App.
	//
	// ***
	AppId string `pulumi:"appId"`
	// The ID of the project in which the resource belongs. If it
	// is not provided, the provider project is used.
	Project *string `pulumi:"project"`
}

// A collection of values returned by getAppleAppConfig.
type GetAppleAppConfigResult struct {
	AppId string `pulumi:"appId"`
	// The content of the XML configuration file as a base64-encoded string.
	ConfigFileContents string `pulumi:"configFileContents"`
	// The filename that the configuration artifact for the IosApp is typically saved as.
	ConfigFilename string  `pulumi:"configFilename"`
	Id             string  `pulumi:"id"`
	Project        *string `pulumi:"project"`
}

func GetAppleAppConfigOutput(ctx *pulumi.Context, args GetAppleAppConfigOutputArgs, opts ...pulumi.InvokeOption) GetAppleAppConfigResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetAppleAppConfigResultOutput, error) {
			args := v.(GetAppleAppConfigArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("gcp:firebase/getAppleAppConfig:getAppleAppConfig", args, GetAppleAppConfigResultOutput{}, options).(GetAppleAppConfigResultOutput), nil
		}).(GetAppleAppConfigResultOutput)
}

// A collection of arguments for invoking getAppleAppConfig.
type GetAppleAppConfigOutputArgs struct {
	// The id of the Firebase iOS App.
	//
	// ***
	AppId pulumi.StringInput `pulumi:"appId"`
	// The ID of the project in which the resource belongs. If it
	// is not provided, the provider project is used.
	Project pulumi.StringPtrInput `pulumi:"project"`
}

func (GetAppleAppConfigOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAppleAppConfigArgs)(nil)).Elem()
}

// A collection of values returned by getAppleAppConfig.
type GetAppleAppConfigResultOutput struct{ *pulumi.OutputState }

func (GetAppleAppConfigResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAppleAppConfigResult)(nil)).Elem()
}

func (o GetAppleAppConfigResultOutput) ToGetAppleAppConfigResultOutput() GetAppleAppConfigResultOutput {
	return o
}

func (o GetAppleAppConfigResultOutput) ToGetAppleAppConfigResultOutputWithContext(ctx context.Context) GetAppleAppConfigResultOutput {
	return o
}

func (o GetAppleAppConfigResultOutput) AppId() pulumi.StringOutput {
	return o.ApplyT(func(v GetAppleAppConfigResult) string { return v.AppId }).(pulumi.StringOutput)
}

// The content of the XML configuration file as a base64-encoded string.
func (o GetAppleAppConfigResultOutput) ConfigFileContents() pulumi.StringOutput {
	return o.ApplyT(func(v GetAppleAppConfigResult) string { return v.ConfigFileContents }).(pulumi.StringOutput)
}

// The filename that the configuration artifact for the IosApp is typically saved as.
func (o GetAppleAppConfigResultOutput) ConfigFilename() pulumi.StringOutput {
	return o.ApplyT(func(v GetAppleAppConfigResult) string { return v.ConfigFilename }).(pulumi.StringOutput)
}

func (o GetAppleAppConfigResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetAppleAppConfigResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetAppleAppConfigResultOutput) Project() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAppleAppConfigResult) *string { return v.Project }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetAppleAppConfigResultOutput{})
}
