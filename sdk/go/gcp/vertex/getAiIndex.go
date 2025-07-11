// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package vertex

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// A representation of a collection of database items organized in a way that allows for approximate nearest neighbor (a.k.a ANN) algorithms search.
func LookupAiIndex(ctx *pulumi.Context, args *LookupAiIndexArgs, opts ...pulumi.InvokeOption) (*LookupAiIndexResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupAiIndexResult
	err := ctx.Invoke("gcp:vertex/getAiIndex:getAiIndex", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAiIndex.
type LookupAiIndexArgs struct {
	// The name of the index.
	Name string `pulumi:"name"`
	// The ID of the project in which the resource belongs.
	Project *string `pulumi:"project"`
	// The region of the index.
	//
	// ***
	Region string `pulumi:"region"`
}

// A collection of values returned by getAiIndex.
type LookupAiIndexResult struct {
	CreateTime      string                    `pulumi:"createTime"`
	DeployedIndexes []GetAiIndexDeployedIndex `pulumi:"deployedIndexes"`
	Description     string                    `pulumi:"description"`
	DisplayName     string                    `pulumi:"displayName"`
	EffectiveLabels map[string]string         `pulumi:"effectiveLabels"`
	Etag            string                    `pulumi:"etag"`
	// The provider-assigned unique ID for this managed resource.
	Id                string                `pulumi:"id"`
	IndexStats        []GetAiIndexIndexStat `pulumi:"indexStats"`
	IndexUpdateMethod string                `pulumi:"indexUpdateMethod"`
	Labels            map[string]string     `pulumi:"labels"`
	MetadataSchemaUri string                `pulumi:"metadataSchemaUri"`
	Metadatas         []GetAiIndexMetadata  `pulumi:"metadatas"`
	Name              string                `pulumi:"name"`
	Project           *string               `pulumi:"project"`
	PulumiLabels      map[string]string     `pulumi:"pulumiLabels"`
	Region            string                `pulumi:"region"`
	UpdateTime        string                `pulumi:"updateTime"`
}

func LookupAiIndexOutput(ctx *pulumi.Context, args LookupAiIndexOutputArgs, opts ...pulumi.InvokeOption) LookupAiIndexResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupAiIndexResultOutput, error) {
			args := v.(LookupAiIndexArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("gcp:vertex/getAiIndex:getAiIndex", args, LookupAiIndexResultOutput{}, options).(LookupAiIndexResultOutput), nil
		}).(LookupAiIndexResultOutput)
}

// A collection of arguments for invoking getAiIndex.
type LookupAiIndexOutputArgs struct {
	// The name of the index.
	Name pulumi.StringInput `pulumi:"name"`
	// The ID of the project in which the resource belongs.
	Project pulumi.StringPtrInput `pulumi:"project"`
	// The region of the index.
	//
	// ***
	Region pulumi.StringInput `pulumi:"region"`
}

func (LookupAiIndexOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAiIndexArgs)(nil)).Elem()
}

// A collection of values returned by getAiIndex.
type LookupAiIndexResultOutput struct{ *pulumi.OutputState }

func (LookupAiIndexResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAiIndexResult)(nil)).Elem()
}

func (o LookupAiIndexResultOutput) ToLookupAiIndexResultOutput() LookupAiIndexResultOutput {
	return o
}

func (o LookupAiIndexResultOutput) ToLookupAiIndexResultOutputWithContext(ctx context.Context) LookupAiIndexResultOutput {
	return o
}

func (o LookupAiIndexResultOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAiIndexResult) string { return v.CreateTime }).(pulumi.StringOutput)
}

func (o LookupAiIndexResultOutput) DeployedIndexes() GetAiIndexDeployedIndexArrayOutput {
	return o.ApplyT(func(v LookupAiIndexResult) []GetAiIndexDeployedIndex { return v.DeployedIndexes }).(GetAiIndexDeployedIndexArrayOutput)
}

func (o LookupAiIndexResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAiIndexResult) string { return v.Description }).(pulumi.StringOutput)
}

func (o LookupAiIndexResultOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAiIndexResult) string { return v.DisplayName }).(pulumi.StringOutput)
}

func (o LookupAiIndexResultOutput) EffectiveLabels() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupAiIndexResult) map[string]string { return v.EffectiveLabels }).(pulumi.StringMapOutput)
}

func (o LookupAiIndexResultOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAiIndexResult) string { return v.Etag }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupAiIndexResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAiIndexResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupAiIndexResultOutput) IndexStats() GetAiIndexIndexStatArrayOutput {
	return o.ApplyT(func(v LookupAiIndexResult) []GetAiIndexIndexStat { return v.IndexStats }).(GetAiIndexIndexStatArrayOutput)
}

func (o LookupAiIndexResultOutput) IndexUpdateMethod() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAiIndexResult) string { return v.IndexUpdateMethod }).(pulumi.StringOutput)
}

func (o LookupAiIndexResultOutput) Labels() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupAiIndexResult) map[string]string { return v.Labels }).(pulumi.StringMapOutput)
}

func (o LookupAiIndexResultOutput) MetadataSchemaUri() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAiIndexResult) string { return v.MetadataSchemaUri }).(pulumi.StringOutput)
}

func (o LookupAiIndexResultOutput) Metadatas() GetAiIndexMetadataArrayOutput {
	return o.ApplyT(func(v LookupAiIndexResult) []GetAiIndexMetadata { return v.Metadatas }).(GetAiIndexMetadataArrayOutput)
}

func (o LookupAiIndexResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAiIndexResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupAiIndexResultOutput) Project() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupAiIndexResult) *string { return v.Project }).(pulumi.StringPtrOutput)
}

func (o LookupAiIndexResultOutput) PulumiLabels() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupAiIndexResult) map[string]string { return v.PulumiLabels }).(pulumi.StringMapOutput)
}

func (o LookupAiIndexResultOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAiIndexResult) string { return v.Region }).(pulumi.StringOutput)
}

func (o LookupAiIndexResultOutput) UpdateTime() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAiIndexResult) string { return v.UpdateTime }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupAiIndexResultOutput{})
}
