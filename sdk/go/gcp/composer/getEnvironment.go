// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package composer

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides access to Cloud Composer environment configuration in a region for a given project.
//
// To get more information about Composer Environment, see:
//
// * [API documentation](https://cloud.google.com/composer/docs/reference/rest/v1/projects.locations.environments)
// * How-to Guides
//   - [Official Documentation](https://cloud.google.com/composer/docs/concepts/overview)
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/composer"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := composer.NewEnvironment(ctx, "composer_env", &composer.EnvironmentArgs{
//				Name: pulumi.String("composer-environment"),
//			})
//			if err != nil {
//				return err
//			}
//			composerEnv, err := composer.LookupEnvironment(ctx, &composer.LookupEnvironmentArgs{
//				Name: test.Name,
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("debug", composerEnv.Configs)
//			return nil
//		})
//	}
//
// ```
func LookupEnvironment(ctx *pulumi.Context, args *LookupEnvironmentArgs, opts ...pulumi.InvokeOption) (*LookupEnvironmentResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupEnvironmentResult
	err := ctx.Invoke("gcp:composer/getEnvironment:getEnvironment", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getEnvironment.
type LookupEnvironmentArgs struct {
	// Name of the environment.
	Name string `pulumi:"name"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
	// The location or Compute Engine region of the environment.
	Region *string `pulumi:"region"`
}

// A collection of values returned by getEnvironment.
type LookupEnvironmentResult struct {
	// Configuration parameters for the environment.
	Configs         []GetEnvironmentConfig `pulumi:"configs"`
	EffectiveLabels map[string]string      `pulumi:"effectiveLabels"`
	// The provider-assigned unique ID for this managed resource.
	Id             string                        `pulumi:"id"`
	Labels         map[string]string             `pulumi:"labels"`
	Name           string                        `pulumi:"name"`
	Project        *string                       `pulumi:"project"`
	PulumiLabels   map[string]string             `pulumi:"pulumiLabels"`
	Region         *string                       `pulumi:"region"`
	StorageConfigs []GetEnvironmentStorageConfig `pulumi:"storageConfigs"`
}

func LookupEnvironmentOutput(ctx *pulumi.Context, args LookupEnvironmentOutputArgs, opts ...pulumi.InvokeOption) LookupEnvironmentResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupEnvironmentResultOutput, error) {
			args := v.(LookupEnvironmentArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("gcp:composer/getEnvironment:getEnvironment", args, LookupEnvironmentResultOutput{}, options).(LookupEnvironmentResultOutput), nil
		}).(LookupEnvironmentResultOutput)
}

// A collection of arguments for invoking getEnvironment.
type LookupEnvironmentOutputArgs struct {
	// Name of the environment.
	Name pulumi.StringInput `pulumi:"name"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput `pulumi:"project"`
	// The location or Compute Engine region of the environment.
	Region pulumi.StringPtrInput `pulumi:"region"`
}

func (LookupEnvironmentOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupEnvironmentArgs)(nil)).Elem()
}

// A collection of values returned by getEnvironment.
type LookupEnvironmentResultOutput struct{ *pulumi.OutputState }

func (LookupEnvironmentResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupEnvironmentResult)(nil)).Elem()
}

func (o LookupEnvironmentResultOutput) ToLookupEnvironmentResultOutput() LookupEnvironmentResultOutput {
	return o
}

func (o LookupEnvironmentResultOutput) ToLookupEnvironmentResultOutputWithContext(ctx context.Context) LookupEnvironmentResultOutput {
	return o
}

// Configuration parameters for the environment.
func (o LookupEnvironmentResultOutput) Configs() GetEnvironmentConfigArrayOutput {
	return o.ApplyT(func(v LookupEnvironmentResult) []GetEnvironmentConfig { return v.Configs }).(GetEnvironmentConfigArrayOutput)
}

func (o LookupEnvironmentResultOutput) EffectiveLabels() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupEnvironmentResult) map[string]string { return v.EffectiveLabels }).(pulumi.StringMapOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupEnvironmentResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEnvironmentResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupEnvironmentResultOutput) Labels() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupEnvironmentResult) map[string]string { return v.Labels }).(pulumi.StringMapOutput)
}

func (o LookupEnvironmentResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEnvironmentResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupEnvironmentResultOutput) Project() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupEnvironmentResult) *string { return v.Project }).(pulumi.StringPtrOutput)
}

func (o LookupEnvironmentResultOutput) PulumiLabels() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupEnvironmentResult) map[string]string { return v.PulumiLabels }).(pulumi.StringMapOutput)
}

func (o LookupEnvironmentResultOutput) Region() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupEnvironmentResult) *string { return v.Region }).(pulumi.StringPtrOutput)
}

func (o LookupEnvironmentResultOutput) StorageConfigs() GetEnvironmentStorageConfigArrayOutput {
	return o.ApplyT(func(v LookupEnvironmentResult) []GetEnvironmentStorageConfig { return v.StorageConfigs }).(GetEnvironmentStorageConfigArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupEnvironmentResultOutput{})
}
