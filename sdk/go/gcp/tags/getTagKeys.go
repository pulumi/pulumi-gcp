// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package tags

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-gcp/sdk/v7/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Get tag keys by org or project `parent`.
//
// ## Example Usage
func GetTagKeys(ctx *pulumi.Context, args *GetTagKeysArgs, opts ...pulumi.InvokeOption) (*GetTagKeysResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetTagKeysResult
	err := ctx.Invoke("gcp:tags/getTagKeys:getTagKeys", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getTagKeys.
type GetTagKeysArgs struct {
	// The resource name of the parent organization or project. It can be in format `organizations/{org_id}` or `projects/{project_id_or_number}`.
	Parent string `pulumi:"parent"`
}

// A collection of values returned by getTagKeys.
type GetTagKeysResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id   string          `pulumi:"id"`
	Keys []GetTagKeysKey `pulumi:"keys"`
	// The resource name of the TagKey's parent. A TagKey can be parented by an Orgination or a Project.
	Parent string `pulumi:"parent"`
}

func GetTagKeysOutput(ctx *pulumi.Context, args GetTagKeysOutputArgs, opts ...pulumi.InvokeOption) GetTagKeysResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetTagKeysResult, error) {
			args := v.(GetTagKeysArgs)
			r, err := GetTagKeys(ctx, &args, opts...)
			var s GetTagKeysResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetTagKeysResultOutput)
}

// A collection of arguments for invoking getTagKeys.
type GetTagKeysOutputArgs struct {
	// The resource name of the parent organization or project. It can be in format `organizations/{org_id}` or `projects/{project_id_or_number}`.
	Parent pulumi.StringInput `pulumi:"parent"`
}

func (GetTagKeysOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetTagKeysArgs)(nil)).Elem()
}

// A collection of values returned by getTagKeys.
type GetTagKeysResultOutput struct{ *pulumi.OutputState }

func (GetTagKeysResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetTagKeysResult)(nil)).Elem()
}

func (o GetTagKeysResultOutput) ToGetTagKeysResultOutput() GetTagKeysResultOutput {
	return o
}

func (o GetTagKeysResultOutput) ToGetTagKeysResultOutputWithContext(ctx context.Context) GetTagKeysResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetTagKeysResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetTagKeysResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetTagKeysResultOutput) Keys() GetTagKeysKeyArrayOutput {
	return o.ApplyT(func(v GetTagKeysResult) []GetTagKeysKey { return v.Keys }).(GetTagKeysKeyArrayOutput)
}

// The resource name of the TagKey's parent. A TagKey can be parented by an Orgination or a Project.
func (o GetTagKeysResultOutput) Parent() pulumi.StringOutput {
	return o.ApplyT(func(v GetTagKeysResult) string { return v.Parent }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetTagKeysResultOutput{})
}
