// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudrunv2

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-gcp/sdk/v7/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Get information about a Google Cloud Run v2 Service. For more information see
// the [official documentation](https://cloud.google.com/run/docs/)
// and [API](https://cloud.google.com/run/docs/apis).
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v7/go/gcp/cloudrunv2"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := cloudrunv2.LookupService(ctx, &cloudrunv2.LookupServiceArgs{
//				Location: pulumi.StringRef("us-central1"),
//				Name:     "my-service",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupService(ctx *pulumi.Context, args *LookupServiceArgs, opts ...pulumi.InvokeOption) (*LookupServiceResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupServiceResult
	err := ctx.Invoke("gcp:cloudrunv2/getService:getService", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getService.
type LookupServiceArgs struct {
	// The location of the instance. eg us-central1
	//
	// ***
	Location *string `pulumi:"location"`
	// The name of the Cloud Run v2 Service.
	Name string `pulumi:"name"`
	// The project in which the resource belongs. If it
	// is not provided, the provider project is used.
	Project *string `pulumi:"project"`
}

// A collection of values returned by getService.
type LookupServiceResult struct {
	Annotations          map[string]string               `pulumi:"annotations"`
	BinaryAuthorizations []GetServiceBinaryAuthorization `pulumi:"binaryAuthorizations"`
	Client               string                          `pulumi:"client"`
	ClientVersion        string                          `pulumi:"clientVersion"`
	Conditions           []GetServiceCondition           `pulumi:"conditions"`
	CreateTime           string                          `pulumi:"createTime"`
	Creator              string                          `pulumi:"creator"`
	CustomAudiences      []string                        `pulumi:"customAudiences"`
	DeleteTime           string                          `pulumi:"deleteTime"`
	Description          string                          `pulumi:"description"`
	EffectiveAnnotations map[string]string               `pulumi:"effectiveAnnotations"`
	EffectiveLabels      map[string]string               `pulumi:"effectiveLabels"`
	Etag                 string                          `pulumi:"etag"`
	ExpireTime           string                          `pulumi:"expireTime"`
	Generation           string                          `pulumi:"generation"`
	// The provider-assigned unique ID for this managed resource.
	Id                    string                        `pulumi:"id"`
	Ingress               string                        `pulumi:"ingress"`
	Labels                map[string]string             `pulumi:"labels"`
	LastModifier          string                        `pulumi:"lastModifier"`
	LatestCreatedRevision string                        `pulumi:"latestCreatedRevision"`
	LatestReadyRevision   string                        `pulumi:"latestReadyRevision"`
	LaunchStage           string                        `pulumi:"launchStage"`
	Location              *string                       `pulumi:"location"`
	Name                  string                        `pulumi:"name"`
	ObservedGeneration    string                        `pulumi:"observedGeneration"`
	Project               *string                       `pulumi:"project"`
	PulumiLabels          map[string]string             `pulumi:"pulumiLabels"`
	Reconciling           bool                          `pulumi:"reconciling"`
	Templates             []GetServiceTemplate          `pulumi:"templates"`
	TerminalConditions    []GetServiceTerminalCondition `pulumi:"terminalConditions"`
	TrafficStatuses       []GetServiceTrafficStatus     `pulumi:"trafficStatuses"`
	Traffics              []GetServiceTraffic           `pulumi:"traffics"`
	Uid                   string                        `pulumi:"uid"`
	UpdateTime            string                        `pulumi:"updateTime"`
	Uri                   string                        `pulumi:"uri"`
}

func LookupServiceOutput(ctx *pulumi.Context, args LookupServiceOutputArgs, opts ...pulumi.InvokeOption) LookupServiceResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupServiceResult, error) {
			args := v.(LookupServiceArgs)
			r, err := LookupService(ctx, &args, opts...)
			var s LookupServiceResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupServiceResultOutput)
}

// A collection of arguments for invoking getService.
type LookupServiceOutputArgs struct {
	// The location of the instance. eg us-central1
	//
	// ***
	Location pulumi.StringPtrInput `pulumi:"location"`
	// The name of the Cloud Run v2 Service.
	Name pulumi.StringInput `pulumi:"name"`
	// The project in which the resource belongs. If it
	// is not provided, the provider project is used.
	Project pulumi.StringPtrInput `pulumi:"project"`
}

func (LookupServiceOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupServiceArgs)(nil)).Elem()
}

// A collection of values returned by getService.
type LookupServiceResultOutput struct{ *pulumi.OutputState }

func (LookupServiceResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupServiceResult)(nil)).Elem()
}

func (o LookupServiceResultOutput) ToLookupServiceResultOutput() LookupServiceResultOutput {
	return o
}

func (o LookupServiceResultOutput) ToLookupServiceResultOutputWithContext(ctx context.Context) LookupServiceResultOutput {
	return o
}

func (o LookupServiceResultOutput) Annotations() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupServiceResult) map[string]string { return v.Annotations }).(pulumi.StringMapOutput)
}

func (o LookupServiceResultOutput) BinaryAuthorizations() GetServiceBinaryAuthorizationArrayOutput {
	return o.ApplyT(func(v LookupServiceResult) []GetServiceBinaryAuthorization { return v.BinaryAuthorizations }).(GetServiceBinaryAuthorizationArrayOutput)
}

func (o LookupServiceResultOutput) Client() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceResult) string { return v.Client }).(pulumi.StringOutput)
}

func (o LookupServiceResultOutput) ClientVersion() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceResult) string { return v.ClientVersion }).(pulumi.StringOutput)
}

func (o LookupServiceResultOutput) Conditions() GetServiceConditionArrayOutput {
	return o.ApplyT(func(v LookupServiceResult) []GetServiceCondition { return v.Conditions }).(GetServiceConditionArrayOutput)
}

func (o LookupServiceResultOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceResult) string { return v.CreateTime }).(pulumi.StringOutput)
}

func (o LookupServiceResultOutput) Creator() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceResult) string { return v.Creator }).(pulumi.StringOutput)
}

func (o LookupServiceResultOutput) CustomAudiences() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupServiceResult) []string { return v.CustomAudiences }).(pulumi.StringArrayOutput)
}

func (o LookupServiceResultOutput) DeleteTime() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceResult) string { return v.DeleteTime }).(pulumi.StringOutput)
}

func (o LookupServiceResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceResult) string { return v.Description }).(pulumi.StringOutput)
}

func (o LookupServiceResultOutput) EffectiveAnnotations() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupServiceResult) map[string]string { return v.EffectiveAnnotations }).(pulumi.StringMapOutput)
}

func (o LookupServiceResultOutput) EffectiveLabels() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupServiceResult) map[string]string { return v.EffectiveLabels }).(pulumi.StringMapOutput)
}

func (o LookupServiceResultOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceResult) string { return v.Etag }).(pulumi.StringOutput)
}

func (o LookupServiceResultOutput) ExpireTime() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceResult) string { return v.ExpireTime }).(pulumi.StringOutput)
}

func (o LookupServiceResultOutput) Generation() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceResult) string { return v.Generation }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupServiceResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupServiceResultOutput) Ingress() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceResult) string { return v.Ingress }).(pulumi.StringOutput)
}

func (o LookupServiceResultOutput) Labels() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupServiceResult) map[string]string { return v.Labels }).(pulumi.StringMapOutput)
}

func (o LookupServiceResultOutput) LastModifier() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceResult) string { return v.LastModifier }).(pulumi.StringOutput)
}

func (o LookupServiceResultOutput) LatestCreatedRevision() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceResult) string { return v.LatestCreatedRevision }).(pulumi.StringOutput)
}

func (o LookupServiceResultOutput) LatestReadyRevision() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceResult) string { return v.LatestReadyRevision }).(pulumi.StringOutput)
}

func (o LookupServiceResultOutput) LaunchStage() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceResult) string { return v.LaunchStage }).(pulumi.StringOutput)
}

func (o LookupServiceResultOutput) Location() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupServiceResult) *string { return v.Location }).(pulumi.StringPtrOutput)
}

func (o LookupServiceResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupServiceResultOutput) ObservedGeneration() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceResult) string { return v.ObservedGeneration }).(pulumi.StringOutput)
}

func (o LookupServiceResultOutput) Project() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupServiceResult) *string { return v.Project }).(pulumi.StringPtrOutput)
}

func (o LookupServiceResultOutput) PulumiLabels() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupServiceResult) map[string]string { return v.PulumiLabels }).(pulumi.StringMapOutput)
}

func (o LookupServiceResultOutput) Reconciling() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupServiceResult) bool { return v.Reconciling }).(pulumi.BoolOutput)
}

func (o LookupServiceResultOutput) Templates() GetServiceTemplateArrayOutput {
	return o.ApplyT(func(v LookupServiceResult) []GetServiceTemplate { return v.Templates }).(GetServiceTemplateArrayOutput)
}

func (o LookupServiceResultOutput) TerminalConditions() GetServiceTerminalConditionArrayOutput {
	return o.ApplyT(func(v LookupServiceResult) []GetServiceTerminalCondition { return v.TerminalConditions }).(GetServiceTerminalConditionArrayOutput)
}

func (o LookupServiceResultOutput) TrafficStatuses() GetServiceTrafficStatusArrayOutput {
	return o.ApplyT(func(v LookupServiceResult) []GetServiceTrafficStatus { return v.TrafficStatuses }).(GetServiceTrafficStatusArrayOutput)
}

func (o LookupServiceResultOutput) Traffics() GetServiceTrafficArrayOutput {
	return o.ApplyT(func(v LookupServiceResult) []GetServiceTraffic { return v.Traffics }).(GetServiceTrafficArrayOutput)
}

func (o LookupServiceResultOutput) Uid() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceResult) string { return v.Uid }).(pulumi.StringOutput)
}

func (o LookupServiceResultOutput) UpdateTime() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceResult) string { return v.UpdateTime }).(pulumi.StringOutput)
}

func (o LookupServiceResultOutput) Uri() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceResult) string { return v.Uri }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupServiceResultOutput{})
}