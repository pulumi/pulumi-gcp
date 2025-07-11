// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package compute

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Get a forwarding rule within GCE from its name.
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
//			_, err := compute.LookupForwardingRule(ctx, &compute.LookupForwardingRuleArgs{
//				Name: "forwarding-rule-us-east1",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupForwardingRule(ctx *pulumi.Context, args *LookupForwardingRuleArgs, opts ...pulumi.InvokeOption) (*LookupForwardingRuleResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupForwardingRuleResult
	err := ctx.Invoke("gcp:compute/getForwardingRule:getForwardingRule", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getForwardingRule.
type LookupForwardingRuleArgs struct {
	// The name of the forwarding rule.
	//
	// ***
	Name string `pulumi:"name"`
	// The project in which the resource belongs. If it
	// is not provided, the provider project is used.
	Project *string `pulumi:"project"`
	// The region in which the resource belongs. If it
	// is not provided, the project region is used.
	Region *string `pulumi:"region"`
}

// A collection of values returned by getForwardingRule.
type LookupForwardingRuleResult struct {
	AllPorts             bool              `pulumi:"allPorts"`
	AllowGlobalAccess    bool              `pulumi:"allowGlobalAccess"`
	AllowPscGlobalAccess bool              `pulumi:"allowPscGlobalAccess"`
	BackendService       string            `pulumi:"backendService"`
	BaseForwardingRule   string            `pulumi:"baseForwardingRule"`
	CreationTimestamp    string            `pulumi:"creationTimestamp"`
	Description          string            `pulumi:"description"`
	EffectiveLabels      map[string]string `pulumi:"effectiveLabels"`
	ForwardingRuleId     int               `pulumi:"forwardingRuleId"`
	// The provider-assigned unique ID for this managed resource.
	Id                            string                                          `pulumi:"id"`
	IpAddress                     string                                          `pulumi:"ipAddress"`
	IpCollection                  string                                          `pulumi:"ipCollection"`
	IpProtocol                    string                                          `pulumi:"ipProtocol"`
	IpVersion                     string                                          `pulumi:"ipVersion"`
	IsMirroringCollector          bool                                            `pulumi:"isMirroringCollector"`
	LabelFingerprint              string                                          `pulumi:"labelFingerprint"`
	Labels                        map[string]string                               `pulumi:"labels"`
	LoadBalancingScheme           string                                          `pulumi:"loadBalancingScheme"`
	Name                          string                                          `pulumi:"name"`
	Network                       string                                          `pulumi:"network"`
	NetworkTier                   string                                          `pulumi:"networkTier"`
	NoAutomateDnsZone             bool                                            `pulumi:"noAutomateDnsZone"`
	PortRange                     string                                          `pulumi:"portRange"`
	Ports                         []string                                        `pulumi:"ports"`
	Project                       *string                                         `pulumi:"project"`
	PscConnectionId               string                                          `pulumi:"pscConnectionId"`
	PscConnectionStatus           string                                          `pulumi:"pscConnectionStatus"`
	PulumiLabels                  map[string]string                               `pulumi:"pulumiLabels"`
	RecreateClosedPsc             bool                                            `pulumi:"recreateClosedPsc"`
	Region                        *string                                         `pulumi:"region"`
	SelfLink                      string                                          `pulumi:"selfLink"`
	ServiceDirectoryRegistrations []GetForwardingRuleServiceDirectoryRegistration `pulumi:"serviceDirectoryRegistrations"`
	ServiceLabel                  string                                          `pulumi:"serviceLabel"`
	ServiceName                   string                                          `pulumi:"serviceName"`
	SourceIpRanges                []string                                        `pulumi:"sourceIpRanges"`
	Subnetwork                    string                                          `pulumi:"subnetwork"`
	Target                        string                                          `pulumi:"target"`
}

func LookupForwardingRuleOutput(ctx *pulumi.Context, args LookupForwardingRuleOutputArgs, opts ...pulumi.InvokeOption) LookupForwardingRuleResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupForwardingRuleResultOutput, error) {
			args := v.(LookupForwardingRuleArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("gcp:compute/getForwardingRule:getForwardingRule", args, LookupForwardingRuleResultOutput{}, options).(LookupForwardingRuleResultOutput), nil
		}).(LookupForwardingRuleResultOutput)
}

// A collection of arguments for invoking getForwardingRule.
type LookupForwardingRuleOutputArgs struct {
	// The name of the forwarding rule.
	//
	// ***
	Name pulumi.StringInput `pulumi:"name"`
	// The project in which the resource belongs. If it
	// is not provided, the provider project is used.
	Project pulumi.StringPtrInput `pulumi:"project"`
	// The region in which the resource belongs. If it
	// is not provided, the project region is used.
	Region pulumi.StringPtrInput `pulumi:"region"`
}

func (LookupForwardingRuleOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupForwardingRuleArgs)(nil)).Elem()
}

// A collection of values returned by getForwardingRule.
type LookupForwardingRuleResultOutput struct{ *pulumi.OutputState }

func (LookupForwardingRuleResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupForwardingRuleResult)(nil)).Elem()
}

func (o LookupForwardingRuleResultOutput) ToLookupForwardingRuleResultOutput() LookupForwardingRuleResultOutput {
	return o
}

func (o LookupForwardingRuleResultOutput) ToLookupForwardingRuleResultOutputWithContext(ctx context.Context) LookupForwardingRuleResultOutput {
	return o
}

func (o LookupForwardingRuleResultOutput) AllPorts() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupForwardingRuleResult) bool { return v.AllPorts }).(pulumi.BoolOutput)
}

func (o LookupForwardingRuleResultOutput) AllowGlobalAccess() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupForwardingRuleResult) bool { return v.AllowGlobalAccess }).(pulumi.BoolOutput)
}

func (o LookupForwardingRuleResultOutput) AllowPscGlobalAccess() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupForwardingRuleResult) bool { return v.AllowPscGlobalAccess }).(pulumi.BoolOutput)
}

func (o LookupForwardingRuleResultOutput) BackendService() pulumi.StringOutput {
	return o.ApplyT(func(v LookupForwardingRuleResult) string { return v.BackendService }).(pulumi.StringOutput)
}

func (o LookupForwardingRuleResultOutput) BaseForwardingRule() pulumi.StringOutput {
	return o.ApplyT(func(v LookupForwardingRuleResult) string { return v.BaseForwardingRule }).(pulumi.StringOutput)
}

func (o LookupForwardingRuleResultOutput) CreationTimestamp() pulumi.StringOutput {
	return o.ApplyT(func(v LookupForwardingRuleResult) string { return v.CreationTimestamp }).(pulumi.StringOutput)
}

func (o LookupForwardingRuleResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupForwardingRuleResult) string { return v.Description }).(pulumi.StringOutput)
}

func (o LookupForwardingRuleResultOutput) EffectiveLabels() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupForwardingRuleResult) map[string]string { return v.EffectiveLabels }).(pulumi.StringMapOutput)
}

func (o LookupForwardingRuleResultOutput) ForwardingRuleId() pulumi.IntOutput {
	return o.ApplyT(func(v LookupForwardingRuleResult) int { return v.ForwardingRuleId }).(pulumi.IntOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupForwardingRuleResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupForwardingRuleResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupForwardingRuleResultOutput) IpAddress() pulumi.StringOutput {
	return o.ApplyT(func(v LookupForwardingRuleResult) string { return v.IpAddress }).(pulumi.StringOutput)
}

func (o LookupForwardingRuleResultOutput) IpCollection() pulumi.StringOutput {
	return o.ApplyT(func(v LookupForwardingRuleResult) string { return v.IpCollection }).(pulumi.StringOutput)
}

func (o LookupForwardingRuleResultOutput) IpProtocol() pulumi.StringOutput {
	return o.ApplyT(func(v LookupForwardingRuleResult) string { return v.IpProtocol }).(pulumi.StringOutput)
}

func (o LookupForwardingRuleResultOutput) IpVersion() pulumi.StringOutput {
	return o.ApplyT(func(v LookupForwardingRuleResult) string { return v.IpVersion }).(pulumi.StringOutput)
}

func (o LookupForwardingRuleResultOutput) IsMirroringCollector() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupForwardingRuleResult) bool { return v.IsMirroringCollector }).(pulumi.BoolOutput)
}

func (o LookupForwardingRuleResultOutput) LabelFingerprint() pulumi.StringOutput {
	return o.ApplyT(func(v LookupForwardingRuleResult) string { return v.LabelFingerprint }).(pulumi.StringOutput)
}

func (o LookupForwardingRuleResultOutput) Labels() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupForwardingRuleResult) map[string]string { return v.Labels }).(pulumi.StringMapOutput)
}

func (o LookupForwardingRuleResultOutput) LoadBalancingScheme() pulumi.StringOutput {
	return o.ApplyT(func(v LookupForwardingRuleResult) string { return v.LoadBalancingScheme }).(pulumi.StringOutput)
}

func (o LookupForwardingRuleResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupForwardingRuleResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupForwardingRuleResultOutput) Network() pulumi.StringOutput {
	return o.ApplyT(func(v LookupForwardingRuleResult) string { return v.Network }).(pulumi.StringOutput)
}

func (o LookupForwardingRuleResultOutput) NetworkTier() pulumi.StringOutput {
	return o.ApplyT(func(v LookupForwardingRuleResult) string { return v.NetworkTier }).(pulumi.StringOutput)
}

func (o LookupForwardingRuleResultOutput) NoAutomateDnsZone() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupForwardingRuleResult) bool { return v.NoAutomateDnsZone }).(pulumi.BoolOutput)
}

func (o LookupForwardingRuleResultOutput) PortRange() pulumi.StringOutput {
	return o.ApplyT(func(v LookupForwardingRuleResult) string { return v.PortRange }).(pulumi.StringOutput)
}

func (o LookupForwardingRuleResultOutput) Ports() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupForwardingRuleResult) []string { return v.Ports }).(pulumi.StringArrayOutput)
}

func (o LookupForwardingRuleResultOutput) Project() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupForwardingRuleResult) *string { return v.Project }).(pulumi.StringPtrOutput)
}

func (o LookupForwardingRuleResultOutput) PscConnectionId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupForwardingRuleResult) string { return v.PscConnectionId }).(pulumi.StringOutput)
}

func (o LookupForwardingRuleResultOutput) PscConnectionStatus() pulumi.StringOutput {
	return o.ApplyT(func(v LookupForwardingRuleResult) string { return v.PscConnectionStatus }).(pulumi.StringOutput)
}

func (o LookupForwardingRuleResultOutput) PulumiLabels() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupForwardingRuleResult) map[string]string { return v.PulumiLabels }).(pulumi.StringMapOutput)
}

func (o LookupForwardingRuleResultOutput) RecreateClosedPsc() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupForwardingRuleResult) bool { return v.RecreateClosedPsc }).(pulumi.BoolOutput)
}

func (o LookupForwardingRuleResultOutput) Region() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupForwardingRuleResult) *string { return v.Region }).(pulumi.StringPtrOutput)
}

func (o LookupForwardingRuleResultOutput) SelfLink() pulumi.StringOutput {
	return o.ApplyT(func(v LookupForwardingRuleResult) string { return v.SelfLink }).(pulumi.StringOutput)
}

func (o LookupForwardingRuleResultOutput) ServiceDirectoryRegistrations() GetForwardingRuleServiceDirectoryRegistrationArrayOutput {
	return o.ApplyT(func(v LookupForwardingRuleResult) []GetForwardingRuleServiceDirectoryRegistration {
		return v.ServiceDirectoryRegistrations
	}).(GetForwardingRuleServiceDirectoryRegistrationArrayOutput)
}

func (o LookupForwardingRuleResultOutput) ServiceLabel() pulumi.StringOutput {
	return o.ApplyT(func(v LookupForwardingRuleResult) string { return v.ServiceLabel }).(pulumi.StringOutput)
}

func (o LookupForwardingRuleResultOutput) ServiceName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupForwardingRuleResult) string { return v.ServiceName }).(pulumi.StringOutput)
}

func (o LookupForwardingRuleResultOutput) SourceIpRanges() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupForwardingRuleResult) []string { return v.SourceIpRanges }).(pulumi.StringArrayOutput)
}

func (o LookupForwardingRuleResultOutput) Subnetwork() pulumi.StringOutput {
	return o.ApplyT(func(v LookupForwardingRuleResult) string { return v.Subnetwork }).(pulumi.StringOutput)
}

func (o LookupForwardingRuleResultOutput) Target() pulumi.StringOutput {
	return o.ApplyT(func(v LookupForwardingRuleResult) string { return v.Target }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupForwardingRuleResultOutput{})
}
