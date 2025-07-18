// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package tpu

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Get runtime versions available for a project. For more information see the [official documentation](https://cloud.google.com/tpu/docs/) and [API](https://cloud.google.com/tpu/docs/reference/rest/v2/projects.locations.runtimeVersions).
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/tpu"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := tpu.GetV2RuntimeVersions(ctx, &tpu.GetV2RuntimeVersionsArgs{}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ### Configure Basic TPU VM With Available Version
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/tpu"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			available, err := tpu.GetV2RuntimeVersions(ctx, &tpu.GetV2RuntimeVersionsArgs{}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = tpu.NewV2Vm(ctx, "tpu", &tpu.V2VmArgs{
//				Name:           pulumi.String("test-tpu"),
//				Zone:           pulumi.String("us-central1-b"),
//				RuntimeVersion: pulumi.String(available.Versions[0]),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetV2RuntimeVersions(ctx *pulumi.Context, args *GetV2RuntimeVersionsArgs, opts ...pulumi.InvokeOption) (*GetV2RuntimeVersionsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetV2RuntimeVersionsResult
	err := ctx.Invoke("gcp:tpu/getV2RuntimeVersions:getV2RuntimeVersions", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getV2RuntimeVersions.
type GetV2RuntimeVersionsArgs struct {
	// The project to list versions for. If it
	// is not provided, the provider project is used.
	Project *string `pulumi:"project"`
	// The zone to list versions for. If it
	// is not provided, the provider zone is used.
	Zone *string `pulumi:"zone"`
}

// A collection of values returned by getV2RuntimeVersions.
type GetV2RuntimeVersionsResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id      string `pulumi:"id"`
	Project string `pulumi:"project"`
	// The list of runtime versions available for the given project and zone.
	Versions []string `pulumi:"versions"`
	Zone     string   `pulumi:"zone"`
}

func GetV2RuntimeVersionsOutput(ctx *pulumi.Context, args GetV2RuntimeVersionsOutputArgs, opts ...pulumi.InvokeOption) GetV2RuntimeVersionsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetV2RuntimeVersionsResultOutput, error) {
			args := v.(GetV2RuntimeVersionsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("gcp:tpu/getV2RuntimeVersions:getV2RuntimeVersions", args, GetV2RuntimeVersionsResultOutput{}, options).(GetV2RuntimeVersionsResultOutput), nil
		}).(GetV2RuntimeVersionsResultOutput)
}

// A collection of arguments for invoking getV2RuntimeVersions.
type GetV2RuntimeVersionsOutputArgs struct {
	// The project to list versions for. If it
	// is not provided, the provider project is used.
	Project pulumi.StringPtrInput `pulumi:"project"`
	// The zone to list versions for. If it
	// is not provided, the provider zone is used.
	Zone pulumi.StringPtrInput `pulumi:"zone"`
}

func (GetV2RuntimeVersionsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetV2RuntimeVersionsArgs)(nil)).Elem()
}

// A collection of values returned by getV2RuntimeVersions.
type GetV2RuntimeVersionsResultOutput struct{ *pulumi.OutputState }

func (GetV2RuntimeVersionsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetV2RuntimeVersionsResult)(nil)).Elem()
}

func (o GetV2RuntimeVersionsResultOutput) ToGetV2RuntimeVersionsResultOutput() GetV2RuntimeVersionsResultOutput {
	return o
}

func (o GetV2RuntimeVersionsResultOutput) ToGetV2RuntimeVersionsResultOutputWithContext(ctx context.Context) GetV2RuntimeVersionsResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetV2RuntimeVersionsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetV2RuntimeVersionsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetV2RuntimeVersionsResultOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v GetV2RuntimeVersionsResult) string { return v.Project }).(pulumi.StringOutput)
}

// The list of runtime versions available for the given project and zone.
func (o GetV2RuntimeVersionsResultOutput) Versions() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetV2RuntimeVersionsResult) []string { return v.Versions }).(pulumi.StringArrayOutput)
}

func (o GetV2RuntimeVersionsResultOutput) Zone() pulumi.StringOutput {
	return o.ApplyT(func(v GetV2RuntimeVersionsResult) string { return v.Zone }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetV2RuntimeVersionsResultOutput{})
}
