// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package secretmanager

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to get information about a Secret Manager Regional Secret
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/secretmanager"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := secretmanager.LookupRegionalSecret(ctx, &secretmanager.LookupRegionalSecretArgs{
//				SecretId: "secretname",
//				Location: "us-central1",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupRegionalSecret(ctx *pulumi.Context, args *LookupRegionalSecretArgs, opts ...pulumi.InvokeOption) (*LookupRegionalSecretResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupRegionalSecretResult
	err := ctx.Invoke("gcp:secretmanager/getRegionalSecret:getRegionalSecret", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getRegionalSecret.
type LookupRegionalSecretArgs struct {
	// The location of the regional secret. eg us-central1
	Location string `pulumi:"location"`
	// The ID of the project in which the resource belongs.
	Project *string `pulumi:"project"`
	// The name of the regional secret.
	SecretId string `pulumi:"secretId"`
}

// A collection of values returned by getRegionalSecret.
type LookupRegionalSecretResult struct {
	Annotations                map[string]string                            `pulumi:"annotations"`
	CreateTime                 string                                       `pulumi:"createTime"`
	CustomerManagedEncryptions []GetRegionalSecretCustomerManagedEncryption `pulumi:"customerManagedEncryptions"`
	DeletionProtection         bool                                         `pulumi:"deletionProtection"`
	EffectiveAnnotations       map[string]string                            `pulumi:"effectiveAnnotations"`
	EffectiveLabels            map[string]string                            `pulumi:"effectiveLabels"`
	ExpireTime                 string                                       `pulumi:"expireTime"`
	// The provider-assigned unique ID for this managed resource.
	Id                string                      `pulumi:"id"`
	Labels            map[string]string           `pulumi:"labels"`
	Location          string                      `pulumi:"location"`
	Name              string                      `pulumi:"name"`
	Project           *string                     `pulumi:"project"`
	PulumiLabels      map[string]string           `pulumi:"pulumiLabels"`
	Rotations         []GetRegionalSecretRotation `pulumi:"rotations"`
	SecretId          string                      `pulumi:"secretId"`
	Topics            []GetRegionalSecretTopic    `pulumi:"topics"`
	Ttl               string                      `pulumi:"ttl"`
	VersionAliases    map[string]string           `pulumi:"versionAliases"`
	VersionDestroyTtl string                      `pulumi:"versionDestroyTtl"`
}

func LookupRegionalSecretOutput(ctx *pulumi.Context, args LookupRegionalSecretOutputArgs, opts ...pulumi.InvokeOption) LookupRegionalSecretResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupRegionalSecretResultOutput, error) {
			args := v.(LookupRegionalSecretArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("gcp:secretmanager/getRegionalSecret:getRegionalSecret", args, LookupRegionalSecretResultOutput{}, options).(LookupRegionalSecretResultOutput), nil
		}).(LookupRegionalSecretResultOutput)
}

// A collection of arguments for invoking getRegionalSecret.
type LookupRegionalSecretOutputArgs struct {
	// The location of the regional secret. eg us-central1
	Location pulumi.StringInput `pulumi:"location"`
	// The ID of the project in which the resource belongs.
	Project pulumi.StringPtrInput `pulumi:"project"`
	// The name of the regional secret.
	SecretId pulumi.StringInput `pulumi:"secretId"`
}

func (LookupRegionalSecretOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupRegionalSecretArgs)(nil)).Elem()
}

// A collection of values returned by getRegionalSecret.
type LookupRegionalSecretResultOutput struct{ *pulumi.OutputState }

func (LookupRegionalSecretResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupRegionalSecretResult)(nil)).Elem()
}

func (o LookupRegionalSecretResultOutput) ToLookupRegionalSecretResultOutput() LookupRegionalSecretResultOutput {
	return o
}

func (o LookupRegionalSecretResultOutput) ToLookupRegionalSecretResultOutputWithContext(ctx context.Context) LookupRegionalSecretResultOutput {
	return o
}

func (o LookupRegionalSecretResultOutput) Annotations() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupRegionalSecretResult) map[string]string { return v.Annotations }).(pulumi.StringMapOutput)
}

func (o LookupRegionalSecretResultOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRegionalSecretResult) string { return v.CreateTime }).(pulumi.StringOutput)
}

func (o LookupRegionalSecretResultOutput) CustomerManagedEncryptions() GetRegionalSecretCustomerManagedEncryptionArrayOutput {
	return o.ApplyT(func(v LookupRegionalSecretResult) []GetRegionalSecretCustomerManagedEncryption {
		return v.CustomerManagedEncryptions
	}).(GetRegionalSecretCustomerManagedEncryptionArrayOutput)
}

func (o LookupRegionalSecretResultOutput) DeletionProtection() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupRegionalSecretResult) bool { return v.DeletionProtection }).(pulumi.BoolOutput)
}

func (o LookupRegionalSecretResultOutput) EffectiveAnnotations() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupRegionalSecretResult) map[string]string { return v.EffectiveAnnotations }).(pulumi.StringMapOutput)
}

func (o LookupRegionalSecretResultOutput) EffectiveLabels() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupRegionalSecretResult) map[string]string { return v.EffectiveLabels }).(pulumi.StringMapOutput)
}

func (o LookupRegionalSecretResultOutput) ExpireTime() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRegionalSecretResult) string { return v.ExpireTime }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupRegionalSecretResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRegionalSecretResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupRegionalSecretResultOutput) Labels() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupRegionalSecretResult) map[string]string { return v.Labels }).(pulumi.StringMapOutput)
}

func (o LookupRegionalSecretResultOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRegionalSecretResult) string { return v.Location }).(pulumi.StringOutput)
}

func (o LookupRegionalSecretResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRegionalSecretResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupRegionalSecretResultOutput) Project() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupRegionalSecretResult) *string { return v.Project }).(pulumi.StringPtrOutput)
}

func (o LookupRegionalSecretResultOutput) PulumiLabels() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupRegionalSecretResult) map[string]string { return v.PulumiLabels }).(pulumi.StringMapOutput)
}

func (o LookupRegionalSecretResultOutput) Rotations() GetRegionalSecretRotationArrayOutput {
	return o.ApplyT(func(v LookupRegionalSecretResult) []GetRegionalSecretRotation { return v.Rotations }).(GetRegionalSecretRotationArrayOutput)
}

func (o LookupRegionalSecretResultOutput) SecretId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRegionalSecretResult) string { return v.SecretId }).(pulumi.StringOutput)
}

func (o LookupRegionalSecretResultOutput) Topics() GetRegionalSecretTopicArrayOutput {
	return o.ApplyT(func(v LookupRegionalSecretResult) []GetRegionalSecretTopic { return v.Topics }).(GetRegionalSecretTopicArrayOutput)
}

func (o LookupRegionalSecretResultOutput) Ttl() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRegionalSecretResult) string { return v.Ttl }).(pulumi.StringOutput)
}

func (o LookupRegionalSecretResultOutput) VersionAliases() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupRegionalSecretResult) map[string]string { return v.VersionAliases }).(pulumi.StringMapOutput)
}

func (o LookupRegionalSecretResultOutput) VersionDestroyTtl() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRegionalSecretResult) string { return v.VersionDestroyTtl }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupRegionalSecretResultOutput{})
}
