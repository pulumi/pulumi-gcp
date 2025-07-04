// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package storage

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to get information about a Project Storage Intelligence config resource.
// See [the official documentation](https://cloud.google.com/storage/docs/storage-intelligence/overview#resource)
// and
// [API](https://cloud.google.com/storage/docs/json_api/v1/intelligenceConfig).
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/storage"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := storage.LookupControlProjectIntelligenceConfig(ctx, &storage.LookupControlProjectIntelligenceConfigArgs{
//				Name: "my-project",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupControlProjectIntelligenceConfig(ctx *pulumi.Context, args *LookupControlProjectIntelligenceConfigArgs, opts ...pulumi.InvokeOption) (*LookupControlProjectIntelligenceConfigResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupControlProjectIntelligenceConfigResult
	err := ctx.Invoke("gcp:storage/getControlProjectIntelligenceConfig:getControlProjectIntelligenceConfig", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getControlProjectIntelligenceConfig.
type LookupControlProjectIntelligenceConfigArgs struct {
	// The name or number of the GCP project.
	Name string `pulumi:"name"`
}

// A collection of values returned by getControlProjectIntelligenceConfig.
type LookupControlProjectIntelligenceConfigResult struct {
	EditionConfig                string                                                           `pulumi:"editionConfig"`
	EffectiveIntelligenceConfigs []GetControlProjectIntelligenceConfigEffectiveIntelligenceConfig `pulumi:"effectiveIntelligenceConfigs"`
	Filters                      []GetControlProjectIntelligenceConfigFilter                      `pulumi:"filters"`
	// The provider-assigned unique ID for this managed resource.
	Id           string                                           `pulumi:"id"`
	Name         string                                           `pulumi:"name"`
	TrialConfigs []GetControlProjectIntelligenceConfigTrialConfig `pulumi:"trialConfigs"`
	UpdateTime   string                                           `pulumi:"updateTime"`
}

func LookupControlProjectIntelligenceConfigOutput(ctx *pulumi.Context, args LookupControlProjectIntelligenceConfigOutputArgs, opts ...pulumi.InvokeOption) LookupControlProjectIntelligenceConfigResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupControlProjectIntelligenceConfigResultOutput, error) {
			args := v.(LookupControlProjectIntelligenceConfigArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("gcp:storage/getControlProjectIntelligenceConfig:getControlProjectIntelligenceConfig", args, LookupControlProjectIntelligenceConfigResultOutput{}, options).(LookupControlProjectIntelligenceConfigResultOutput), nil
		}).(LookupControlProjectIntelligenceConfigResultOutput)
}

// A collection of arguments for invoking getControlProjectIntelligenceConfig.
type LookupControlProjectIntelligenceConfigOutputArgs struct {
	// The name or number of the GCP project.
	Name pulumi.StringInput `pulumi:"name"`
}

func (LookupControlProjectIntelligenceConfigOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupControlProjectIntelligenceConfigArgs)(nil)).Elem()
}

// A collection of values returned by getControlProjectIntelligenceConfig.
type LookupControlProjectIntelligenceConfigResultOutput struct{ *pulumi.OutputState }

func (LookupControlProjectIntelligenceConfigResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupControlProjectIntelligenceConfigResult)(nil)).Elem()
}

func (o LookupControlProjectIntelligenceConfigResultOutput) ToLookupControlProjectIntelligenceConfigResultOutput() LookupControlProjectIntelligenceConfigResultOutput {
	return o
}

func (o LookupControlProjectIntelligenceConfigResultOutput) ToLookupControlProjectIntelligenceConfigResultOutputWithContext(ctx context.Context) LookupControlProjectIntelligenceConfigResultOutput {
	return o
}

func (o LookupControlProjectIntelligenceConfigResultOutput) EditionConfig() pulumi.StringOutput {
	return o.ApplyT(func(v LookupControlProjectIntelligenceConfigResult) string { return v.EditionConfig }).(pulumi.StringOutput)
}

func (o LookupControlProjectIntelligenceConfigResultOutput) EffectiveIntelligenceConfigs() GetControlProjectIntelligenceConfigEffectiveIntelligenceConfigArrayOutput {
	return o.ApplyT(func(v LookupControlProjectIntelligenceConfigResult) []GetControlProjectIntelligenceConfigEffectiveIntelligenceConfig {
		return v.EffectiveIntelligenceConfigs
	}).(GetControlProjectIntelligenceConfigEffectiveIntelligenceConfigArrayOutput)
}

func (o LookupControlProjectIntelligenceConfigResultOutput) Filters() GetControlProjectIntelligenceConfigFilterArrayOutput {
	return o.ApplyT(func(v LookupControlProjectIntelligenceConfigResult) []GetControlProjectIntelligenceConfigFilter {
		return v.Filters
	}).(GetControlProjectIntelligenceConfigFilterArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupControlProjectIntelligenceConfigResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupControlProjectIntelligenceConfigResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupControlProjectIntelligenceConfigResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupControlProjectIntelligenceConfigResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupControlProjectIntelligenceConfigResultOutput) TrialConfigs() GetControlProjectIntelligenceConfigTrialConfigArrayOutput {
	return o.ApplyT(func(v LookupControlProjectIntelligenceConfigResult) []GetControlProjectIntelligenceConfigTrialConfig {
		return v.TrialConfigs
	}).(GetControlProjectIntelligenceConfigTrialConfigArrayOutput)
}

func (o LookupControlProjectIntelligenceConfigResultOutput) UpdateTime() pulumi.StringOutput {
	return o.ApplyT(func(v LookupControlProjectIntelligenceConfigResult) string { return v.UpdateTime }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupControlProjectIntelligenceConfigResultOutput{})
}
