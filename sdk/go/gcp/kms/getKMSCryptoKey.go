// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package kms

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides access to a Google Cloud Platform KMS CryptoKey. For more information see
// [the official documentation](https://cloud.google.com/kms/docs/object-hierarchy#key)
// and
// [API](https://cloud.google.com/kms/docs/reference/rest/v1/projects.locations.keyRings.cryptoKeys).
//
// A CryptoKey is an interface to key material which can be used to encrypt and decrypt data. A CryptoKey belongs to a
// Google Cloud KMS KeyRing.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/kms"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			myKeyRing, err := kms.GetKMSKeyRing(ctx, &kms.GetKMSKeyRingArgs{
//				Name:     "my-key-ring",
//				Location: "us-central1",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = kms.GetKMSCryptoKey(ctx, &kms.GetKMSCryptoKeyArgs{
//				Name:    "my-crypto-key",
//				KeyRing: myKeyRing.Id,
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetKMSCryptoKey(ctx *pulumi.Context, args *GetKMSCryptoKeyArgs, opts ...pulumi.InvokeOption) (*GetKMSCryptoKeyResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetKMSCryptoKeyResult
	err := ctx.Invoke("gcp:kms/getKMSCryptoKey:getKMSCryptoKey", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getKMSCryptoKey.
type GetKMSCryptoKeyArgs struct {
	// The `id` of the Google Cloud Platform KeyRing to which the key belongs.
	KeyRing string `pulumi:"keyRing"`
	// The CryptoKey's name.
	// A CryptoKey’s name belonging to the specified Google Cloud Platform KeyRing and match the regular expression `[a-zA-Z0-9_-]{1,63}`
	Name string `pulumi:"name"`
}

// A collection of values returned by getKMSCryptoKey.
type GetKMSCryptoKeyResult struct {
	CryptoKeyBackend         string            `pulumi:"cryptoKeyBackend"`
	DestroyScheduledDuration string            `pulumi:"destroyScheduledDuration"`
	EffectiveLabels          map[string]string `pulumi:"effectiveLabels"`
	// The provider-assigned unique ID for this managed resource.
	Id                              string                                         `pulumi:"id"`
	ImportOnly                      bool                                           `pulumi:"importOnly"`
	KeyAccessJustificationsPolicies []GetKMSCryptoKeyKeyAccessJustificationsPolicy `pulumi:"keyAccessJustificationsPolicies"`
	KeyRing                         string                                         `pulumi:"keyRing"`
	Labels                          map[string]string                              `pulumi:"labels"`
	Name                            string                                         `pulumi:"name"`
	Primaries                       []GetKMSCryptoKeyPrimary                       `pulumi:"primaries"`
	PulumiLabels                    map[string]string                              `pulumi:"pulumiLabels"`
	// Defines the cryptographic capabilities of the key.
	Purpose string `pulumi:"purpose"`
	// Every time this period passes, generate a new CryptoKeyVersion and set it as
	// the primary. The first rotation will take place after the specified period. The rotation period has the format
	// of a decimal number with up to 9 fractional digits, followed by the letter s (seconds).
	RotationPeriod             string                           `pulumi:"rotationPeriod"`
	SkipInitialVersionCreation bool                             `pulumi:"skipInitialVersionCreation"`
	VersionTemplates           []GetKMSCryptoKeyVersionTemplate `pulumi:"versionTemplates"`
}

func GetKMSCryptoKeyOutput(ctx *pulumi.Context, args GetKMSCryptoKeyOutputArgs, opts ...pulumi.InvokeOption) GetKMSCryptoKeyResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetKMSCryptoKeyResultOutput, error) {
			args := v.(GetKMSCryptoKeyArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("gcp:kms/getKMSCryptoKey:getKMSCryptoKey", args, GetKMSCryptoKeyResultOutput{}, options).(GetKMSCryptoKeyResultOutput), nil
		}).(GetKMSCryptoKeyResultOutput)
}

// A collection of arguments for invoking getKMSCryptoKey.
type GetKMSCryptoKeyOutputArgs struct {
	// The `id` of the Google Cloud Platform KeyRing to which the key belongs.
	KeyRing pulumi.StringInput `pulumi:"keyRing"`
	// The CryptoKey's name.
	// A CryptoKey’s name belonging to the specified Google Cloud Platform KeyRing and match the regular expression `[a-zA-Z0-9_-]{1,63}`
	Name pulumi.StringInput `pulumi:"name"`
}

func (GetKMSCryptoKeyOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetKMSCryptoKeyArgs)(nil)).Elem()
}

// A collection of values returned by getKMSCryptoKey.
type GetKMSCryptoKeyResultOutput struct{ *pulumi.OutputState }

func (GetKMSCryptoKeyResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetKMSCryptoKeyResult)(nil)).Elem()
}

func (o GetKMSCryptoKeyResultOutput) ToGetKMSCryptoKeyResultOutput() GetKMSCryptoKeyResultOutput {
	return o
}

func (o GetKMSCryptoKeyResultOutput) ToGetKMSCryptoKeyResultOutputWithContext(ctx context.Context) GetKMSCryptoKeyResultOutput {
	return o
}

func (o GetKMSCryptoKeyResultOutput) CryptoKeyBackend() pulumi.StringOutput {
	return o.ApplyT(func(v GetKMSCryptoKeyResult) string { return v.CryptoKeyBackend }).(pulumi.StringOutput)
}

func (o GetKMSCryptoKeyResultOutput) DestroyScheduledDuration() pulumi.StringOutput {
	return o.ApplyT(func(v GetKMSCryptoKeyResult) string { return v.DestroyScheduledDuration }).(pulumi.StringOutput)
}

func (o GetKMSCryptoKeyResultOutput) EffectiveLabels() pulumi.StringMapOutput {
	return o.ApplyT(func(v GetKMSCryptoKeyResult) map[string]string { return v.EffectiveLabels }).(pulumi.StringMapOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetKMSCryptoKeyResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetKMSCryptoKeyResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetKMSCryptoKeyResultOutput) ImportOnly() pulumi.BoolOutput {
	return o.ApplyT(func(v GetKMSCryptoKeyResult) bool { return v.ImportOnly }).(pulumi.BoolOutput)
}

func (o GetKMSCryptoKeyResultOutput) KeyAccessJustificationsPolicies() GetKMSCryptoKeyKeyAccessJustificationsPolicyArrayOutput {
	return o.ApplyT(func(v GetKMSCryptoKeyResult) []GetKMSCryptoKeyKeyAccessJustificationsPolicy {
		return v.KeyAccessJustificationsPolicies
	}).(GetKMSCryptoKeyKeyAccessJustificationsPolicyArrayOutput)
}

func (o GetKMSCryptoKeyResultOutput) KeyRing() pulumi.StringOutput {
	return o.ApplyT(func(v GetKMSCryptoKeyResult) string { return v.KeyRing }).(pulumi.StringOutput)
}

func (o GetKMSCryptoKeyResultOutput) Labels() pulumi.StringMapOutput {
	return o.ApplyT(func(v GetKMSCryptoKeyResult) map[string]string { return v.Labels }).(pulumi.StringMapOutput)
}

func (o GetKMSCryptoKeyResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v GetKMSCryptoKeyResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o GetKMSCryptoKeyResultOutput) Primaries() GetKMSCryptoKeyPrimaryArrayOutput {
	return o.ApplyT(func(v GetKMSCryptoKeyResult) []GetKMSCryptoKeyPrimary { return v.Primaries }).(GetKMSCryptoKeyPrimaryArrayOutput)
}

func (o GetKMSCryptoKeyResultOutput) PulumiLabels() pulumi.StringMapOutput {
	return o.ApplyT(func(v GetKMSCryptoKeyResult) map[string]string { return v.PulumiLabels }).(pulumi.StringMapOutput)
}

// Defines the cryptographic capabilities of the key.
func (o GetKMSCryptoKeyResultOutput) Purpose() pulumi.StringOutput {
	return o.ApplyT(func(v GetKMSCryptoKeyResult) string { return v.Purpose }).(pulumi.StringOutput)
}

// Every time this period passes, generate a new CryptoKeyVersion and set it as
// the primary. The first rotation will take place after the specified period. The rotation period has the format
// of a decimal number with up to 9 fractional digits, followed by the letter s (seconds).
func (o GetKMSCryptoKeyResultOutput) RotationPeriod() pulumi.StringOutput {
	return o.ApplyT(func(v GetKMSCryptoKeyResult) string { return v.RotationPeriod }).(pulumi.StringOutput)
}

func (o GetKMSCryptoKeyResultOutput) SkipInitialVersionCreation() pulumi.BoolOutput {
	return o.ApplyT(func(v GetKMSCryptoKeyResult) bool { return v.SkipInitialVersionCreation }).(pulumi.BoolOutput)
}

func (o GetKMSCryptoKeyResultOutput) VersionTemplates() GetKMSCryptoKeyVersionTemplateArrayOutput {
	return o.ApplyT(func(v GetKMSCryptoKeyResult) []GetKMSCryptoKeyVersionTemplate { return v.VersionTemplates }).(GetKMSCryptoKeyVersionTemplateArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetKMSCryptoKeyResultOutput{})
}
