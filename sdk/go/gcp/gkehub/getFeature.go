// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package gkehub

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func LookupFeature(ctx *pulumi.Context, args *LookupFeatureArgs, opts ...pulumi.InvokeOption) (*LookupFeatureResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupFeatureResult
	err := ctx.Invoke("gcp:gkehub/getFeature:getFeature", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getFeature.
type LookupFeatureArgs struct {
	Location string  `pulumi:"location"`
	Name     string  `pulumi:"name"`
	Project  *string `pulumi:"project"`
}

// A collection of values returned by getFeature.
type LookupFeatureResult struct {
	CreateTime                string                               `pulumi:"createTime"`
	DeleteTime                string                               `pulumi:"deleteTime"`
	EffectiveLabels           map[string]string                    `pulumi:"effectiveLabels"`
	FleetDefaultMemberConfigs []GetFeatureFleetDefaultMemberConfig `pulumi:"fleetDefaultMemberConfigs"`
	// The provider-assigned unique ID for this managed resource.
	Id             string                    `pulumi:"id"`
	Labels         map[string]string         `pulumi:"labels"`
	Location       string                    `pulumi:"location"`
	Name           string                    `pulumi:"name"`
	Project        *string                   `pulumi:"project"`
	PulumiLabels   map[string]string         `pulumi:"pulumiLabels"`
	ResourceStates []GetFeatureResourceState `pulumi:"resourceStates"`
	Specs          []GetFeatureSpec          `pulumi:"specs"`
	States         []GetFeatureState         `pulumi:"states"`
	UpdateTime     string                    `pulumi:"updateTime"`
}

func LookupFeatureOutput(ctx *pulumi.Context, args LookupFeatureOutputArgs, opts ...pulumi.InvokeOption) LookupFeatureResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupFeatureResultOutput, error) {
			args := v.(LookupFeatureArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("gcp:gkehub/getFeature:getFeature", args, LookupFeatureResultOutput{}, options).(LookupFeatureResultOutput), nil
		}).(LookupFeatureResultOutput)
}

// A collection of arguments for invoking getFeature.
type LookupFeatureOutputArgs struct {
	Location pulumi.StringInput    `pulumi:"location"`
	Name     pulumi.StringInput    `pulumi:"name"`
	Project  pulumi.StringPtrInput `pulumi:"project"`
}

func (LookupFeatureOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupFeatureArgs)(nil)).Elem()
}

// A collection of values returned by getFeature.
type LookupFeatureResultOutput struct{ *pulumi.OutputState }

func (LookupFeatureResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupFeatureResult)(nil)).Elem()
}

func (o LookupFeatureResultOutput) ToLookupFeatureResultOutput() LookupFeatureResultOutput {
	return o
}

func (o LookupFeatureResultOutput) ToLookupFeatureResultOutputWithContext(ctx context.Context) LookupFeatureResultOutput {
	return o
}

func (o LookupFeatureResultOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFeatureResult) string { return v.CreateTime }).(pulumi.StringOutput)
}

func (o LookupFeatureResultOutput) DeleteTime() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFeatureResult) string { return v.DeleteTime }).(pulumi.StringOutput)
}

func (o LookupFeatureResultOutput) EffectiveLabels() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupFeatureResult) map[string]string { return v.EffectiveLabels }).(pulumi.StringMapOutput)
}

func (o LookupFeatureResultOutput) FleetDefaultMemberConfigs() GetFeatureFleetDefaultMemberConfigArrayOutput {
	return o.ApplyT(func(v LookupFeatureResult) []GetFeatureFleetDefaultMemberConfig { return v.FleetDefaultMemberConfigs }).(GetFeatureFleetDefaultMemberConfigArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupFeatureResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFeatureResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupFeatureResultOutput) Labels() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupFeatureResult) map[string]string { return v.Labels }).(pulumi.StringMapOutput)
}

func (o LookupFeatureResultOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFeatureResult) string { return v.Location }).(pulumi.StringOutput)
}

func (o LookupFeatureResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFeatureResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupFeatureResultOutput) Project() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupFeatureResult) *string { return v.Project }).(pulumi.StringPtrOutput)
}

func (o LookupFeatureResultOutput) PulumiLabels() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupFeatureResult) map[string]string { return v.PulumiLabels }).(pulumi.StringMapOutput)
}

func (o LookupFeatureResultOutput) ResourceStates() GetFeatureResourceStateArrayOutput {
	return o.ApplyT(func(v LookupFeatureResult) []GetFeatureResourceState { return v.ResourceStates }).(GetFeatureResourceStateArrayOutput)
}

func (o LookupFeatureResultOutput) Specs() GetFeatureSpecArrayOutput {
	return o.ApplyT(func(v LookupFeatureResult) []GetFeatureSpec { return v.Specs }).(GetFeatureSpecArrayOutput)
}

func (o LookupFeatureResultOutput) States() GetFeatureStateArrayOutput {
	return o.ApplyT(func(v LookupFeatureResult) []GetFeatureState { return v.States }).(GetFeatureStateArrayOutput)
}

func (o LookupFeatureResultOutput) UpdateTime() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFeatureResult) string { return v.UpdateTime }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupFeatureResultOutput{})
}
