// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dns

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Get a DNS record set within Google Cloud DNS
// For more information see
// [the official documentation](https://cloud.google.com/dns/docs/records)
// and
// [API](https://cloud.google.com/dns/docs/reference/v1/resourceRecordSets)
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/dns"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			sample, err := dns.LookupManagedZone(ctx, &dns.LookupManagedZoneArgs{
//				Name: "sample-zone",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = dns.LookupRecordSet(ctx, &dns.LookupRecordSetArgs{
//				ManagedZone: sample.Name,
//				Name:        fmt.Sprintf("my-record.%v", sample.DnsName),
//				Type:        "A",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupRecordSet(ctx *pulumi.Context, args *LookupRecordSetArgs, opts ...pulumi.InvokeOption) (*LookupRecordSetResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupRecordSetResult
	err := ctx.Invoke("gcp:dns/getRecordSet:getRecordSet", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getRecordSet.
type LookupRecordSetArgs struct {
	// The Name of the zone.
	ManagedZone string `pulumi:"managedZone"`
	// The DNS name for the resource.
	Name string `pulumi:"name"`
	// The ID of the project for the Google Cloud.
	Project *string `pulumi:"project"`
	// The RRSet type. [See this table for supported types](https://cloud.google.com/dns/docs/records#record_type).
	Type string `pulumi:"type"`
}

// A collection of values returned by getRecordSet.
type LookupRecordSetResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id          string  `pulumi:"id"`
	ManagedZone string  `pulumi:"managedZone"`
	Name        string  `pulumi:"name"`
	Project     *string `pulumi:"project"`
	// The string data for the records in this record set.
	Rrdatas []string `pulumi:"rrdatas"`
	// The time-to-live of this record set (seconds).
	Ttl  int    `pulumi:"ttl"`
	Type string `pulumi:"type"`
}

func LookupRecordSetOutput(ctx *pulumi.Context, args LookupRecordSetOutputArgs, opts ...pulumi.InvokeOption) LookupRecordSetResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupRecordSetResultOutput, error) {
			args := v.(LookupRecordSetArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("gcp:dns/getRecordSet:getRecordSet", args, LookupRecordSetResultOutput{}, options).(LookupRecordSetResultOutput), nil
		}).(LookupRecordSetResultOutput)
}

// A collection of arguments for invoking getRecordSet.
type LookupRecordSetOutputArgs struct {
	// The Name of the zone.
	ManagedZone pulumi.StringInput `pulumi:"managedZone"`
	// The DNS name for the resource.
	Name pulumi.StringInput `pulumi:"name"`
	// The ID of the project for the Google Cloud.
	Project pulumi.StringPtrInput `pulumi:"project"`
	// The RRSet type. [See this table for supported types](https://cloud.google.com/dns/docs/records#record_type).
	Type pulumi.StringInput `pulumi:"type"`
}

func (LookupRecordSetOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupRecordSetArgs)(nil)).Elem()
}

// A collection of values returned by getRecordSet.
type LookupRecordSetResultOutput struct{ *pulumi.OutputState }

func (LookupRecordSetResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupRecordSetResult)(nil)).Elem()
}

func (o LookupRecordSetResultOutput) ToLookupRecordSetResultOutput() LookupRecordSetResultOutput {
	return o
}

func (o LookupRecordSetResultOutput) ToLookupRecordSetResultOutputWithContext(ctx context.Context) LookupRecordSetResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupRecordSetResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRecordSetResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupRecordSetResultOutput) ManagedZone() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRecordSetResult) string { return v.ManagedZone }).(pulumi.StringOutput)
}

func (o LookupRecordSetResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRecordSetResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupRecordSetResultOutput) Project() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupRecordSetResult) *string { return v.Project }).(pulumi.StringPtrOutput)
}

// The string data for the records in this record set.
func (o LookupRecordSetResultOutput) Rrdatas() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupRecordSetResult) []string { return v.Rrdatas }).(pulumi.StringArrayOutput)
}

// The time-to-live of this record set (seconds).
func (o LookupRecordSetResultOutput) Ttl() pulumi.IntOutput {
	return o.ApplyT(func(v LookupRecordSetResult) int { return v.Ttl }).(pulumi.IntOutput)
}

func (o LookupRecordSetResultOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRecordSetResult) string { return v.Type }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupRecordSetResultOutput{})
}
