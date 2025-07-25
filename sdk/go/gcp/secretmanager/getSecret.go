// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package secretmanager

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to get information about a Secret Manager Secret
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
//			_, err := secretmanager.LookupSecret(ctx, &secretmanager.LookupSecretArgs{
//				SecretId: "foobar",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupSecret(ctx *pulumi.Context, args *LookupSecretArgs, opts ...pulumi.InvokeOption) (*LookupSecretResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupSecretResult
	err := ctx.Invoke("gcp:secretmanager/getSecret:getSecret", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSecret.
type LookupSecretArgs struct {
	// The ID of the project in which the resource belongs.
	Project *string `pulumi:"project"`
	// The name of the secret.
	SecretId string `pulumi:"secretId"`
}

// A collection of values returned by getSecret.
type LookupSecretResult struct {
	Annotations          map[string]string `pulumi:"annotations"`
	CreateTime           string            `pulumi:"createTime"`
	DeletionProtection   bool              `pulumi:"deletionProtection"`
	EffectiveAnnotations map[string]string `pulumi:"effectiveAnnotations"`
	EffectiveLabels      map[string]string `pulumi:"effectiveLabels"`
	ExpireTime           string            `pulumi:"expireTime"`
	// The provider-assigned unique ID for this managed resource.
	Id                string                 `pulumi:"id"`
	Labels            map[string]string      `pulumi:"labels"`
	Name              string                 `pulumi:"name"`
	Project           *string                `pulumi:"project"`
	PulumiLabels      map[string]string      `pulumi:"pulumiLabels"`
	Replications      []GetSecretReplication `pulumi:"replications"`
	Rotations         []GetSecretRotation    `pulumi:"rotations"`
	SecretId          string                 `pulumi:"secretId"`
	Topics            []GetSecretTopic       `pulumi:"topics"`
	Ttl               string                 `pulumi:"ttl"`
	VersionAliases    map[string]string      `pulumi:"versionAliases"`
	VersionDestroyTtl string                 `pulumi:"versionDestroyTtl"`
}

func LookupSecretOutput(ctx *pulumi.Context, args LookupSecretOutputArgs, opts ...pulumi.InvokeOption) LookupSecretResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupSecretResultOutput, error) {
			args := v.(LookupSecretArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("gcp:secretmanager/getSecret:getSecret", args, LookupSecretResultOutput{}, options).(LookupSecretResultOutput), nil
		}).(LookupSecretResultOutput)
}

// A collection of arguments for invoking getSecret.
type LookupSecretOutputArgs struct {
	// The ID of the project in which the resource belongs.
	Project pulumi.StringPtrInput `pulumi:"project"`
	// The name of the secret.
	SecretId pulumi.StringInput `pulumi:"secretId"`
}

func (LookupSecretOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSecretArgs)(nil)).Elem()
}

// A collection of values returned by getSecret.
type LookupSecretResultOutput struct{ *pulumi.OutputState }

func (LookupSecretResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSecretResult)(nil)).Elem()
}

func (o LookupSecretResultOutput) ToLookupSecretResultOutput() LookupSecretResultOutput {
	return o
}

func (o LookupSecretResultOutput) ToLookupSecretResultOutputWithContext(ctx context.Context) LookupSecretResultOutput {
	return o
}

func (o LookupSecretResultOutput) Annotations() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupSecretResult) map[string]string { return v.Annotations }).(pulumi.StringMapOutput)
}

func (o LookupSecretResultOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSecretResult) string { return v.CreateTime }).(pulumi.StringOutput)
}

func (o LookupSecretResultOutput) DeletionProtection() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupSecretResult) bool { return v.DeletionProtection }).(pulumi.BoolOutput)
}

func (o LookupSecretResultOutput) EffectiveAnnotations() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupSecretResult) map[string]string { return v.EffectiveAnnotations }).(pulumi.StringMapOutput)
}

func (o LookupSecretResultOutput) EffectiveLabels() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupSecretResult) map[string]string { return v.EffectiveLabels }).(pulumi.StringMapOutput)
}

func (o LookupSecretResultOutput) ExpireTime() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSecretResult) string { return v.ExpireTime }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupSecretResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSecretResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupSecretResultOutput) Labels() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupSecretResult) map[string]string { return v.Labels }).(pulumi.StringMapOutput)
}

func (o LookupSecretResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSecretResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupSecretResultOutput) Project() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupSecretResult) *string { return v.Project }).(pulumi.StringPtrOutput)
}

func (o LookupSecretResultOutput) PulumiLabels() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupSecretResult) map[string]string { return v.PulumiLabels }).(pulumi.StringMapOutput)
}

func (o LookupSecretResultOutput) Replications() GetSecretReplicationArrayOutput {
	return o.ApplyT(func(v LookupSecretResult) []GetSecretReplication { return v.Replications }).(GetSecretReplicationArrayOutput)
}

func (o LookupSecretResultOutput) Rotations() GetSecretRotationArrayOutput {
	return o.ApplyT(func(v LookupSecretResult) []GetSecretRotation { return v.Rotations }).(GetSecretRotationArrayOutput)
}

func (o LookupSecretResultOutput) SecretId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSecretResult) string { return v.SecretId }).(pulumi.StringOutput)
}

func (o LookupSecretResultOutput) Topics() GetSecretTopicArrayOutput {
	return o.ApplyT(func(v LookupSecretResult) []GetSecretTopic { return v.Topics }).(GetSecretTopicArrayOutput)
}

func (o LookupSecretResultOutput) Ttl() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSecretResult) string { return v.Ttl }).(pulumi.StringOutput)
}

func (o LookupSecretResultOutput) VersionAliases() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupSecretResult) map[string]string { return v.VersionAliases }).(pulumi.StringMapOutput)
}

func (o LookupSecretResultOutput) VersionDestroyTtl() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSecretResult) string { return v.VersionDestroyTtl }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupSecretResultOutput{})
}
