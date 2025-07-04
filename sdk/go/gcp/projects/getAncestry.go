// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package projects

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Retrieve the ancestors for a project.
// See the [REST API](https://cloud.google.com/resource-manager/reference/rest/v1/projects/getAncestry) for more details.
func GetAncestry(ctx *pulumi.Context, args *GetAncestryArgs, opts ...pulumi.InvokeOption) (*GetAncestryResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetAncestryResult
	err := ctx.Invoke("gcp:projects/getAncestry:getAncestry", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAncestry.
type GetAncestryArgs struct {
	// The ID of the project. If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
}

// A collection of values returned by getAncestry.
type GetAncestryResult struct {
	// A list of the project's ancestors. Structure is defined below.
	Ancestors []GetAncestryAncestor `pulumi:"ancestors"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The optional user-assigned display name of the project.
	OrgId string `pulumi:"orgId"`
	// The parent's id.
	ParentId string `pulumi:"parentId"`
	// One of `"folder"` or `"organization"`.
	ParentType string  `pulumi:"parentType"`
	Project    *string `pulumi:"project"`
}

func GetAncestryOutput(ctx *pulumi.Context, args GetAncestryOutputArgs, opts ...pulumi.InvokeOption) GetAncestryResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetAncestryResultOutput, error) {
			args := v.(GetAncestryArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("gcp:projects/getAncestry:getAncestry", args, GetAncestryResultOutput{}, options).(GetAncestryResultOutput), nil
		}).(GetAncestryResultOutput)
}

// A collection of arguments for invoking getAncestry.
type GetAncestryOutputArgs struct {
	// The ID of the project. If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput `pulumi:"project"`
}

func (GetAncestryOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAncestryArgs)(nil)).Elem()
}

// A collection of values returned by getAncestry.
type GetAncestryResultOutput struct{ *pulumi.OutputState }

func (GetAncestryResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAncestryResult)(nil)).Elem()
}

func (o GetAncestryResultOutput) ToGetAncestryResultOutput() GetAncestryResultOutput {
	return o
}

func (o GetAncestryResultOutput) ToGetAncestryResultOutputWithContext(ctx context.Context) GetAncestryResultOutput {
	return o
}

// A list of the project's ancestors. Structure is defined below.
func (o GetAncestryResultOutput) Ancestors() GetAncestryAncestorArrayOutput {
	return o.ApplyT(func(v GetAncestryResult) []GetAncestryAncestor { return v.Ancestors }).(GetAncestryAncestorArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetAncestryResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetAncestryResult) string { return v.Id }).(pulumi.StringOutput)
}

// The optional user-assigned display name of the project.
func (o GetAncestryResultOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v GetAncestryResult) string { return v.OrgId }).(pulumi.StringOutput)
}

// The parent's id.
func (o GetAncestryResultOutput) ParentId() pulumi.StringOutput {
	return o.ApplyT(func(v GetAncestryResult) string { return v.ParentId }).(pulumi.StringOutput)
}

// One of `"folder"` or `"organization"`.
func (o GetAncestryResultOutput) ParentType() pulumi.StringOutput {
	return o.ApplyT(func(v GetAncestryResult) string { return v.ParentType }).(pulumi.StringOutput)
}

func (o GetAncestryResultOutput) Project() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAncestryResult) *string { return v.Project }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetAncestryResultOutput{})
}
