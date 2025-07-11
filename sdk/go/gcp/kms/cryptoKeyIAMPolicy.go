// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package kms

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Three different resources help you manage your IAM policy for KMS crypto key. Each of these resources serves a different use case:
//
// * `kms.CryptoKeyIAMPolicy`: Authoritative. Sets the IAM policy for the crypto key and replaces any existing policy already attached.
// * `kms.CryptoKeyIAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the crypto key are preserved.
// * `kms.CryptoKeyIAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the crypto key are preserved.
//
// > **Note:** `kms.CryptoKeyIAMPolicy` **cannot** be used in conjunction with `kms.CryptoKeyIAMBinding` and `kms.CryptoKeyIAMMember` or they will fight over what your policy should be.
//
// > **Note:** `kms.CryptoKeyIAMBinding` resources **can be** used in conjunction with `kms.CryptoKeyIAMMember` resources **only if** they do not grant privilege to the same role.
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/kms"
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/organizations"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			keyring, err := kms.NewKeyRing(ctx, "keyring", &kms.KeyRingArgs{
//				Name:     pulumi.String("keyring-example"),
//				Location: pulumi.String("global"),
//			})
//			if err != nil {
//				return err
//			}
//			key, err := kms.NewCryptoKey(ctx, "key", &kms.CryptoKeyArgs{
//				Name:           pulumi.String("crypto-key-example"),
//				KeyRing:        keyring.ID(),
//				RotationPeriod: pulumi.String("7776000s"),
//			})
//			if err != nil {
//				return err
//			}
//			admin, err := organizations.LookupIAMPolicy(ctx, &organizations.LookupIAMPolicyArgs{
//				Bindings: []organizations.GetIAMPolicyBinding{
//					{
//						Role: "roles/cloudkms.cryptoKeyEncrypter",
//						Members: []string{
//							"user:jane@example.com",
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = kms.NewCryptoKeyIAMPolicy(ctx, "crypto_key", &kms.CryptoKeyIAMPolicyArgs{
//				CryptoKeyId: key.ID(),
//				PolicyData:  pulumi.String(admin.PolicyData),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// With IAM Conditions:
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/organizations"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := organizations.LookupIAMPolicy(ctx, &organizations.LookupIAMPolicyArgs{
//				Bindings: []organizations.GetIAMPolicyBinding{
//					{
//						Role: "roles/cloudkms.cryptoKeyEncrypter",
//						Members: []string{
//							"user:jane@example.com",
//						},
//						Condition: {
//							Title:       "expires_after_2019_12_31",
//							Description: pulumi.StringRef("Expiring at midnight of 2019-12-31"),
//							Expression:  "request.time < timestamp(\"2020-01-01T00:00:00Z\")",
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
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
//			_, err := kms.NewCryptoKeyIAMBinding(ctx, "crypto_key", &kms.CryptoKeyIAMBindingArgs{
//				CryptoKeyId: pulumi.Any(key.Id),
//				Role:        pulumi.String("roles/cloudkms.cryptoKeyEncrypter"),
//				Members: pulumi.StringArray{
//					pulumi.String("user:jane@example.com"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// With IAM Conditions:
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
//			_, err := kms.NewCryptoKeyIAMBinding(ctx, "crypto_key", &kms.CryptoKeyIAMBindingArgs{
//				CryptoKeyId: pulumi.Any(key.Id),
//				Role:        pulumi.String("roles/cloudkms.cryptoKeyEncrypter"),
//				Members: pulumi.StringArray{
//					pulumi.String("user:jane@example.com"),
//				},
//				Condition: &kms.CryptoKeyIAMBindingConditionArgs{
//					Title:       pulumi.String("expires_after_2019_12_31"),
//					Description: pulumi.String("Expiring at midnight of 2019-12-31"),
//					Expression:  pulumi.String("request.time < timestamp(\"2020-01-01T00:00:00Z\")"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
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
//			_, err := kms.NewCryptoKeyIAMMember(ctx, "crypto_key", &kms.CryptoKeyIAMMemberArgs{
//				CryptoKeyId: pulumi.Any(key.Id),
//				Role:        pulumi.String("roles/cloudkms.cryptoKeyEncrypter"),
//				Member:      pulumi.String("user:jane@example.com"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// With IAM Conditions:
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
//			_, err := kms.NewCryptoKeyIAMMember(ctx, "crypto_key", &kms.CryptoKeyIAMMemberArgs{
//				CryptoKeyId: pulumi.Any(key.Id),
//				Role:        pulumi.String("roles/cloudkms.cryptoKeyEncrypter"),
//				Member:      pulumi.String("user:jane@example.com"),
//				Condition: &kms.CryptoKeyIAMMemberConditionArgs{
//					Title:       pulumi.String("expires_after_2019_12_31"),
//					Description: pulumi.String("Expiring at midnight of 2019-12-31"),
//					Expression:  pulumi.String("request.time < timestamp(\"2020-01-01T00:00:00Z\")"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// ### Importing IAM policies
//
// IAM policy imports use the identifier of the KMS crypto key only. For example:
//
// * `{{project_id}}/{{location}}/{{key_ring_name}}/{{crypto_key_name}}`
//
// An `import` block (Terraform v1.5.0 and later) can be used to import IAM policies:
//
// tf
//
// import {
//
//	id = "{{project_id}}/{{location}}/{{key_ring_name}}/{{crypto_key_name}}"
//
//	to = google_kms_crypto_key_iam_policy.default
//
// }
//
// The `pulumi import` command can also be used:
//
// ```sh
// $ pulumi import gcp:kms/cryptoKeyIAMPolicy:CryptoKeyIAMPolicy default {{project_id}}/{{location}}/{{key_ring_name}}/{{crypto_key_name}}
// ```
type CryptoKeyIAMPolicy struct {
	pulumi.CustomResourceState

	// The crypto key ID, in the form
	// `{project_id}/{location_name}/{key_ring_name}/{crypto_key_name}` or
	// `{location_name}/{key_ring_name}/{crypto_key_name}`. In the second form,
	// the provider's project setting will be used as a fallback.
	CryptoKeyId pulumi.StringOutput `pulumi:"cryptoKeyId"`
	// (Computed) The etag of the project's IAM policy.
	Etag pulumi.StringOutput `pulumi:"etag"`
	// The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData pulumi.StringOutput `pulumi:"policyData"`
}

// NewCryptoKeyIAMPolicy registers a new resource with the given unique name, arguments, and options.
func NewCryptoKeyIAMPolicy(ctx *pulumi.Context,
	name string, args *CryptoKeyIAMPolicyArgs, opts ...pulumi.ResourceOption) (*CryptoKeyIAMPolicy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.CryptoKeyId == nil {
		return nil, errors.New("invalid value for required argument 'CryptoKeyId'")
	}
	if args.PolicyData == nil {
		return nil, errors.New("invalid value for required argument 'PolicyData'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource CryptoKeyIAMPolicy
	err := ctx.RegisterResource("gcp:kms/cryptoKeyIAMPolicy:CryptoKeyIAMPolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCryptoKeyIAMPolicy gets an existing CryptoKeyIAMPolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCryptoKeyIAMPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CryptoKeyIAMPolicyState, opts ...pulumi.ResourceOption) (*CryptoKeyIAMPolicy, error) {
	var resource CryptoKeyIAMPolicy
	err := ctx.ReadResource("gcp:kms/cryptoKeyIAMPolicy:CryptoKeyIAMPolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CryptoKeyIAMPolicy resources.
type cryptoKeyIAMPolicyState struct {
	// The crypto key ID, in the form
	// `{project_id}/{location_name}/{key_ring_name}/{crypto_key_name}` or
	// `{location_name}/{key_ring_name}/{crypto_key_name}`. In the second form,
	// the provider's project setting will be used as a fallback.
	CryptoKeyId *string `pulumi:"cryptoKeyId"`
	// (Computed) The etag of the project's IAM policy.
	Etag *string `pulumi:"etag"`
	// The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData *string `pulumi:"policyData"`
}

type CryptoKeyIAMPolicyState struct {
	// The crypto key ID, in the form
	// `{project_id}/{location_name}/{key_ring_name}/{crypto_key_name}` or
	// `{location_name}/{key_ring_name}/{crypto_key_name}`. In the second form,
	// the provider's project setting will be used as a fallback.
	CryptoKeyId pulumi.StringPtrInput
	// (Computed) The etag of the project's IAM policy.
	Etag pulumi.StringPtrInput
	// The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData pulumi.StringPtrInput
}

func (CryptoKeyIAMPolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*cryptoKeyIAMPolicyState)(nil)).Elem()
}

type cryptoKeyIAMPolicyArgs struct {
	// The crypto key ID, in the form
	// `{project_id}/{location_name}/{key_ring_name}/{crypto_key_name}` or
	// `{location_name}/{key_ring_name}/{crypto_key_name}`. In the second form,
	// the provider's project setting will be used as a fallback.
	CryptoKeyId string `pulumi:"cryptoKeyId"`
	// The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData string `pulumi:"policyData"`
}

// The set of arguments for constructing a CryptoKeyIAMPolicy resource.
type CryptoKeyIAMPolicyArgs struct {
	// The crypto key ID, in the form
	// `{project_id}/{location_name}/{key_ring_name}/{crypto_key_name}` or
	// `{location_name}/{key_ring_name}/{crypto_key_name}`. In the second form,
	// the provider's project setting will be used as a fallback.
	CryptoKeyId pulumi.StringInput
	// The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData pulumi.StringInput
}

func (CryptoKeyIAMPolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*cryptoKeyIAMPolicyArgs)(nil)).Elem()
}

type CryptoKeyIAMPolicyInput interface {
	pulumi.Input

	ToCryptoKeyIAMPolicyOutput() CryptoKeyIAMPolicyOutput
	ToCryptoKeyIAMPolicyOutputWithContext(ctx context.Context) CryptoKeyIAMPolicyOutput
}

func (*CryptoKeyIAMPolicy) ElementType() reflect.Type {
	return reflect.TypeOf((**CryptoKeyIAMPolicy)(nil)).Elem()
}

func (i *CryptoKeyIAMPolicy) ToCryptoKeyIAMPolicyOutput() CryptoKeyIAMPolicyOutput {
	return i.ToCryptoKeyIAMPolicyOutputWithContext(context.Background())
}

func (i *CryptoKeyIAMPolicy) ToCryptoKeyIAMPolicyOutputWithContext(ctx context.Context) CryptoKeyIAMPolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CryptoKeyIAMPolicyOutput)
}

// CryptoKeyIAMPolicyArrayInput is an input type that accepts CryptoKeyIAMPolicyArray and CryptoKeyIAMPolicyArrayOutput values.
// You can construct a concrete instance of `CryptoKeyIAMPolicyArrayInput` via:
//
//	CryptoKeyIAMPolicyArray{ CryptoKeyIAMPolicyArgs{...} }
type CryptoKeyIAMPolicyArrayInput interface {
	pulumi.Input

	ToCryptoKeyIAMPolicyArrayOutput() CryptoKeyIAMPolicyArrayOutput
	ToCryptoKeyIAMPolicyArrayOutputWithContext(context.Context) CryptoKeyIAMPolicyArrayOutput
}

type CryptoKeyIAMPolicyArray []CryptoKeyIAMPolicyInput

func (CryptoKeyIAMPolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CryptoKeyIAMPolicy)(nil)).Elem()
}

func (i CryptoKeyIAMPolicyArray) ToCryptoKeyIAMPolicyArrayOutput() CryptoKeyIAMPolicyArrayOutput {
	return i.ToCryptoKeyIAMPolicyArrayOutputWithContext(context.Background())
}

func (i CryptoKeyIAMPolicyArray) ToCryptoKeyIAMPolicyArrayOutputWithContext(ctx context.Context) CryptoKeyIAMPolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CryptoKeyIAMPolicyArrayOutput)
}

// CryptoKeyIAMPolicyMapInput is an input type that accepts CryptoKeyIAMPolicyMap and CryptoKeyIAMPolicyMapOutput values.
// You can construct a concrete instance of `CryptoKeyIAMPolicyMapInput` via:
//
//	CryptoKeyIAMPolicyMap{ "key": CryptoKeyIAMPolicyArgs{...} }
type CryptoKeyIAMPolicyMapInput interface {
	pulumi.Input

	ToCryptoKeyIAMPolicyMapOutput() CryptoKeyIAMPolicyMapOutput
	ToCryptoKeyIAMPolicyMapOutputWithContext(context.Context) CryptoKeyIAMPolicyMapOutput
}

type CryptoKeyIAMPolicyMap map[string]CryptoKeyIAMPolicyInput

func (CryptoKeyIAMPolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CryptoKeyIAMPolicy)(nil)).Elem()
}

func (i CryptoKeyIAMPolicyMap) ToCryptoKeyIAMPolicyMapOutput() CryptoKeyIAMPolicyMapOutput {
	return i.ToCryptoKeyIAMPolicyMapOutputWithContext(context.Background())
}

func (i CryptoKeyIAMPolicyMap) ToCryptoKeyIAMPolicyMapOutputWithContext(ctx context.Context) CryptoKeyIAMPolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CryptoKeyIAMPolicyMapOutput)
}

type CryptoKeyIAMPolicyOutput struct{ *pulumi.OutputState }

func (CryptoKeyIAMPolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CryptoKeyIAMPolicy)(nil)).Elem()
}

func (o CryptoKeyIAMPolicyOutput) ToCryptoKeyIAMPolicyOutput() CryptoKeyIAMPolicyOutput {
	return o
}

func (o CryptoKeyIAMPolicyOutput) ToCryptoKeyIAMPolicyOutputWithContext(ctx context.Context) CryptoKeyIAMPolicyOutput {
	return o
}

// The crypto key ID, in the form
// `{project_id}/{location_name}/{key_ring_name}/{crypto_key_name}` or
// `{location_name}/{key_ring_name}/{crypto_key_name}`. In the second form,
// the provider's project setting will be used as a fallback.
func (o CryptoKeyIAMPolicyOutput) CryptoKeyId() pulumi.StringOutput {
	return o.ApplyT(func(v *CryptoKeyIAMPolicy) pulumi.StringOutput { return v.CryptoKeyId }).(pulumi.StringOutput)
}

// (Computed) The etag of the project's IAM policy.
func (o CryptoKeyIAMPolicyOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v *CryptoKeyIAMPolicy) pulumi.StringOutput { return v.Etag }).(pulumi.StringOutput)
}

// The policy data generated by
// a `organizations.getIAMPolicy` data source.
func (o CryptoKeyIAMPolicyOutput) PolicyData() pulumi.StringOutput {
	return o.ApplyT(func(v *CryptoKeyIAMPolicy) pulumi.StringOutput { return v.PolicyData }).(pulumi.StringOutput)
}

type CryptoKeyIAMPolicyArrayOutput struct{ *pulumi.OutputState }

func (CryptoKeyIAMPolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CryptoKeyIAMPolicy)(nil)).Elem()
}

func (o CryptoKeyIAMPolicyArrayOutput) ToCryptoKeyIAMPolicyArrayOutput() CryptoKeyIAMPolicyArrayOutput {
	return o
}

func (o CryptoKeyIAMPolicyArrayOutput) ToCryptoKeyIAMPolicyArrayOutputWithContext(ctx context.Context) CryptoKeyIAMPolicyArrayOutput {
	return o
}

func (o CryptoKeyIAMPolicyArrayOutput) Index(i pulumi.IntInput) CryptoKeyIAMPolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *CryptoKeyIAMPolicy {
		return vs[0].([]*CryptoKeyIAMPolicy)[vs[1].(int)]
	}).(CryptoKeyIAMPolicyOutput)
}

type CryptoKeyIAMPolicyMapOutput struct{ *pulumi.OutputState }

func (CryptoKeyIAMPolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CryptoKeyIAMPolicy)(nil)).Elem()
}

func (o CryptoKeyIAMPolicyMapOutput) ToCryptoKeyIAMPolicyMapOutput() CryptoKeyIAMPolicyMapOutput {
	return o
}

func (o CryptoKeyIAMPolicyMapOutput) ToCryptoKeyIAMPolicyMapOutputWithContext(ctx context.Context) CryptoKeyIAMPolicyMapOutput {
	return o
}

func (o CryptoKeyIAMPolicyMapOutput) MapIndex(k pulumi.StringInput) CryptoKeyIAMPolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *CryptoKeyIAMPolicy {
		return vs[0].(map[string]*CryptoKeyIAMPolicy)[vs[1].(string)]
	}).(CryptoKeyIAMPolicyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CryptoKeyIAMPolicyInput)(nil)).Elem(), &CryptoKeyIAMPolicy{})
	pulumi.RegisterInputType(reflect.TypeOf((*CryptoKeyIAMPolicyArrayInput)(nil)).Elem(), CryptoKeyIAMPolicyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CryptoKeyIAMPolicyMapInput)(nil)).Elem(), CryptoKeyIAMPolicyMap{})
	pulumi.RegisterOutputType(CryptoKeyIAMPolicyOutput{})
	pulumi.RegisterOutputType(CryptoKeyIAMPolicyArrayOutput{})
	pulumi.RegisterOutputType(CryptoKeyIAMPolicyMapOutput{})
}
