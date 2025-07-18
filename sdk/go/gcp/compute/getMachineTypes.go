// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package compute

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides access to available Google Compute machine types in a zone for a given project.
// See more about [machine type availability](https://cloud.google.com/compute/docs/regions-zones#available) in the upstream docs.
//
// To get more information about machine types, see:
//
// * [API Documentation](https://cloud.google.com/compute/docs/reference/rest/v1/machineTypes/list)
// * [Comparison Guide](https://cloud.google.com/compute/docs/machine-resource)
//
// ## Example Usage
func GetMachineTypes(ctx *pulumi.Context, args *GetMachineTypesArgs, opts ...pulumi.InvokeOption) (*GetMachineTypesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetMachineTypesResult
	err := ctx.Invoke("gcp:compute/getMachineTypes:getMachineTypes", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getMachineTypes.
type GetMachineTypesArgs struct {
	// A filter expression that filters machine types listed in the response.
	Filter *string `pulumi:"filter"`
	// Project from which to list available zones. Defaults to project declared in the provider.
	Project *string `pulumi:"project"`
	// Zone from which to list machine types.
	Zone *string `pulumi:"zone"`
}

// A collection of values returned by getMachineTypes.
type GetMachineTypesResult struct {
	Filter *string `pulumi:"filter"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The list of machine types matching the provided filter. Structure is documented below.
	MachineTypes []GetMachineTypesMachineType `pulumi:"machineTypes"`
	Project      string                       `pulumi:"project"`
	Zone         string                       `pulumi:"zone"`
}

func GetMachineTypesOutput(ctx *pulumi.Context, args GetMachineTypesOutputArgs, opts ...pulumi.InvokeOption) GetMachineTypesResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetMachineTypesResultOutput, error) {
			args := v.(GetMachineTypesArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("gcp:compute/getMachineTypes:getMachineTypes", args, GetMachineTypesResultOutput{}, options).(GetMachineTypesResultOutput), nil
		}).(GetMachineTypesResultOutput)
}

// A collection of arguments for invoking getMachineTypes.
type GetMachineTypesOutputArgs struct {
	// A filter expression that filters machine types listed in the response.
	Filter pulumi.StringPtrInput `pulumi:"filter"`
	// Project from which to list available zones. Defaults to project declared in the provider.
	Project pulumi.StringPtrInput `pulumi:"project"`
	// Zone from which to list machine types.
	Zone pulumi.StringPtrInput `pulumi:"zone"`
}

func (GetMachineTypesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetMachineTypesArgs)(nil)).Elem()
}

// A collection of values returned by getMachineTypes.
type GetMachineTypesResultOutput struct{ *pulumi.OutputState }

func (GetMachineTypesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetMachineTypesResult)(nil)).Elem()
}

func (o GetMachineTypesResultOutput) ToGetMachineTypesResultOutput() GetMachineTypesResultOutput {
	return o
}

func (o GetMachineTypesResultOutput) ToGetMachineTypesResultOutputWithContext(ctx context.Context) GetMachineTypesResultOutput {
	return o
}

func (o GetMachineTypesResultOutput) Filter() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetMachineTypesResult) *string { return v.Filter }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetMachineTypesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetMachineTypesResult) string { return v.Id }).(pulumi.StringOutput)
}

// The list of machine types matching the provided filter. Structure is documented below.
func (o GetMachineTypesResultOutput) MachineTypes() GetMachineTypesMachineTypeArrayOutput {
	return o.ApplyT(func(v GetMachineTypesResult) []GetMachineTypesMachineType { return v.MachineTypes }).(GetMachineTypesMachineTypeArrayOutput)
}

func (o GetMachineTypesResultOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v GetMachineTypesResult) string { return v.Project }).(pulumi.StringOutput)
}

func (o GetMachineTypesResultOutput) Zone() pulumi.StringOutput {
	return o.ApplyT(func(v GetMachineTypesResult) string { return v.Zone }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetMachineTypesResultOutput{})
}
