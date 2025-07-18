// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package compute

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides available node types for Compute Engine sole-tenant nodes in a zone
// for a given project. For more information, see [the official documentation](https://cloud.google.com/compute/docs/nodes/#types) and [API](https://cloud.google.com/compute/docs/reference/rest/v1/nodeTypes).
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/compute"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := compute.GetNodeTypes(ctx, &compute.GetNodeTypesArgs{
//				Zone: pulumi.StringRef("us-central1-b"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = compute.NewNodeTemplate(ctx, "tmpl", &compute.NodeTemplateArgs{
//				Name:     pulumi.String("test-tmpl"),
//				Region:   pulumi.String("us-central1"),
//				NodeType: pulumi.Any(types.Names[0]),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetNodeTypes(ctx *pulumi.Context, args *GetNodeTypesArgs, opts ...pulumi.InvokeOption) (*GetNodeTypesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetNodeTypesResult
	err := ctx.Invoke("gcp:compute/getNodeTypes:getNodeTypes", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getNodeTypes.
type GetNodeTypesArgs struct {
	// ID of the project to list available node types for.
	// Should match the project the nodes of this type will be deployed to.
	// Defaults to the project that the provider is authenticated with.
	Project *string `pulumi:"project"`
	// The zone to list node types for. Should be in zone of intended node groups and region of referencing node template. If `zone` is not specified, the provider-level zone must be set and is used
	// instead.
	Zone *string `pulumi:"zone"`
}

// A collection of values returned by getNodeTypes.
type GetNodeTypesResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of node types available in the given zone and project.
	Names   []string `pulumi:"names"`
	Project string   `pulumi:"project"`
	Zone    string   `pulumi:"zone"`
}

func GetNodeTypesOutput(ctx *pulumi.Context, args GetNodeTypesOutputArgs, opts ...pulumi.InvokeOption) GetNodeTypesResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetNodeTypesResultOutput, error) {
			args := v.(GetNodeTypesArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("gcp:compute/getNodeTypes:getNodeTypes", args, GetNodeTypesResultOutput{}, options).(GetNodeTypesResultOutput), nil
		}).(GetNodeTypesResultOutput)
}

// A collection of arguments for invoking getNodeTypes.
type GetNodeTypesOutputArgs struct {
	// ID of the project to list available node types for.
	// Should match the project the nodes of this type will be deployed to.
	// Defaults to the project that the provider is authenticated with.
	Project pulumi.StringPtrInput `pulumi:"project"`
	// The zone to list node types for. Should be in zone of intended node groups and region of referencing node template. If `zone` is not specified, the provider-level zone must be set and is used
	// instead.
	Zone pulumi.StringPtrInput `pulumi:"zone"`
}

func (GetNodeTypesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetNodeTypesArgs)(nil)).Elem()
}

// A collection of values returned by getNodeTypes.
type GetNodeTypesResultOutput struct{ *pulumi.OutputState }

func (GetNodeTypesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetNodeTypesResult)(nil)).Elem()
}

func (o GetNodeTypesResultOutput) ToGetNodeTypesResultOutput() GetNodeTypesResultOutput {
	return o
}

func (o GetNodeTypesResultOutput) ToGetNodeTypesResultOutputWithContext(ctx context.Context) GetNodeTypesResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetNodeTypesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetNodeTypesResult) string { return v.Id }).(pulumi.StringOutput)
}

// A list of node types available in the given zone and project.
func (o GetNodeTypesResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetNodeTypesResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetNodeTypesResultOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v GetNodeTypesResult) string { return v.Project }).(pulumi.StringOutput)
}

func (o GetNodeTypesResultOutput) Zone() pulumi.StringOutput {
	return o.ApplyT(func(v GetNodeTypesResult) string { return v.Zone }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetNodeTypesResultOutput{})
}
