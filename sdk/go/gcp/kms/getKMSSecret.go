// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package kms

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source allows you to use data encrypted with Google Cloud KMS
// within your resource definitions.
//
// For more information see
// [the official documentation](https://cloud.google.com/kms/docs/encrypt-decrypt).
//
// > **NOTE:** Using this data provider will allow you to conceal secret data within your
// resource definitions, but it does not take care of protecting that data in the
// logging output, plan output, or state output.  Please take care to secure your secret
// data outside of resource definitions.
//
// ## Example Usage
//
// First, create a KMS KeyRing and CryptoKey using the resource definitions:
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
//			myKeyRing, err := kms.NewKeyRing(ctx, "my_key_ring", &kms.KeyRingArgs{
//				Project:  pulumi.String("my-project"),
//				Name:     pulumi.String("my-key-ring"),
//				Location: pulumi.String("us-central1"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = kms.NewCryptoKey(ctx, "my_crypto_key", &kms.CryptoKeyArgs{
//				Name:    pulumi.String("my-crypto-key"),
//				KeyRing: myKeyRing.ID(),
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
// Next, use the [Cloud SDK](https://cloud.google.com/sdk/gcloud/reference/kms/encrypt) to encrypt some
// sensitive information:
//
// Finally, reference the encrypted ciphertext in your resource definitions:
//
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/kms"
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/sql"
//	"github.com/pulumi/pulumi-random/sdk/v4/go/random"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			sqlUserPassword, err := kms.GetKMSSecret(ctx, &kms.GetKMSSecretArgs{
//				CryptoKey:  myCryptoKey.Id,
//				Ciphertext: "CiQAqD+xX4SXOSziF4a8JYvq4spfAuWhhYSNul33H85HnVtNQW4SOgDu2UZ46dQCRFl5MF6ekabviN8xq+F+2035ZJ85B+xTYXqNf4mZs0RJitnWWuXlYQh6axnnJYu3kDU=",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			dbNameSuffix, err := random.NewRandomId(ctx, "db_name_suffix", &random.RandomIdArgs{
//				ByteLength: pulumi.Int(4),
//			})
//			if err != nil {
//				return err
//			}
//			main, err := sql.NewDatabaseInstance(ctx, "main", &sql.DatabaseInstanceArgs{
//				Name: dbNameSuffix.Hex.ApplyT(func(hex string) (string, error) {
//					return fmt.Sprintf("main-instance-%v", hex), nil
//				}).(pulumi.StringOutput),
//				DatabaseVersion: pulumi.String("MYSQL_5_7"),
//				Settings: &sql.DatabaseInstanceSettingsArgs{
//					Tier: pulumi.String("db-f1-micro"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = sql.NewUser(ctx, "users", &sql.UserArgs{
//				Name:     pulumi.String("me"),
//				Instance: main.Name,
//				Host:     pulumi.String("me.com"),
//				Password: pulumi.String(sqlUserPassword.Plaintext),
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
// This will result in a Cloud SQL user being created with password `my-secret-password`.
func GetKMSSecret(ctx *pulumi.Context, args *GetKMSSecretArgs, opts ...pulumi.InvokeOption) (*GetKMSSecretResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetKMSSecretResult
	err := ctx.Invoke("gcp:kms/getKMSSecret:getKMSSecret", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getKMSSecret.
type GetKMSSecretArgs struct {
	// The [additional authenticated data](https://cloud.google.com/kms/docs/additional-authenticated-data) used for integrity checks during encryption and decryption.
	AdditionalAuthenticatedData *string `pulumi:"additionalAuthenticatedData"`
	// The ciphertext to be decrypted, encoded in base64
	Ciphertext string `pulumi:"ciphertext"`
	// The id of the CryptoKey that will be used to
	// decrypt the provided ciphertext. This is represented by the format
	// `{projectId}/{location}/{keyRingName}/{cryptoKeyName}`.
	CryptoKey string `pulumi:"cryptoKey"`
}

// A collection of values returned by getKMSSecret.
type GetKMSSecretResult struct {
	AdditionalAuthenticatedData *string `pulumi:"additionalAuthenticatedData"`
	Ciphertext                  string  `pulumi:"ciphertext"`
	CryptoKey                   string  `pulumi:"cryptoKey"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Contains the result of decrypting the provided ciphertext.
	Plaintext string `pulumi:"plaintext"`
}

func GetKMSSecretOutput(ctx *pulumi.Context, args GetKMSSecretOutputArgs, opts ...pulumi.InvokeOption) GetKMSSecretResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetKMSSecretResultOutput, error) {
			args := v.(GetKMSSecretArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("gcp:kms/getKMSSecret:getKMSSecret", args, GetKMSSecretResultOutput{}, options).(GetKMSSecretResultOutput), nil
		}).(GetKMSSecretResultOutput)
}

// A collection of arguments for invoking getKMSSecret.
type GetKMSSecretOutputArgs struct {
	// The [additional authenticated data](https://cloud.google.com/kms/docs/additional-authenticated-data) used for integrity checks during encryption and decryption.
	AdditionalAuthenticatedData pulumi.StringPtrInput `pulumi:"additionalAuthenticatedData"`
	// The ciphertext to be decrypted, encoded in base64
	Ciphertext pulumi.StringInput `pulumi:"ciphertext"`
	// The id of the CryptoKey that will be used to
	// decrypt the provided ciphertext. This is represented by the format
	// `{projectId}/{location}/{keyRingName}/{cryptoKeyName}`.
	CryptoKey pulumi.StringInput `pulumi:"cryptoKey"`
}

func (GetKMSSecretOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetKMSSecretArgs)(nil)).Elem()
}

// A collection of values returned by getKMSSecret.
type GetKMSSecretResultOutput struct{ *pulumi.OutputState }

func (GetKMSSecretResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetKMSSecretResult)(nil)).Elem()
}

func (o GetKMSSecretResultOutput) ToGetKMSSecretResultOutput() GetKMSSecretResultOutput {
	return o
}

func (o GetKMSSecretResultOutput) ToGetKMSSecretResultOutputWithContext(ctx context.Context) GetKMSSecretResultOutput {
	return o
}

func (o GetKMSSecretResultOutput) AdditionalAuthenticatedData() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetKMSSecretResult) *string { return v.AdditionalAuthenticatedData }).(pulumi.StringPtrOutput)
}

func (o GetKMSSecretResultOutput) Ciphertext() pulumi.StringOutput {
	return o.ApplyT(func(v GetKMSSecretResult) string { return v.Ciphertext }).(pulumi.StringOutput)
}

func (o GetKMSSecretResultOutput) CryptoKey() pulumi.StringOutput {
	return o.ApplyT(func(v GetKMSSecretResult) string { return v.CryptoKey }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetKMSSecretResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetKMSSecretResult) string { return v.Id }).(pulumi.StringOutput)
}

// Contains the result of decrypting the provided ciphertext.
func (o GetKMSSecretResultOutput) Plaintext() pulumi.StringOutput {
	return o.ApplyT(func(v GetKMSSecretResult) string { return v.Plaintext }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetKMSSecretResultOutput{})
}
