// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package healthcare

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// The Consent Management API is a tool for tracking user consents and the documentation associated with the consents.
//
// To get more information about ConsentStore, see:
//
// * [API documentation](https://cloud.google.com/healthcare/docs/reference/rest/v1/projects.locations.datasets.consentStores)
// * How-to Guides
//   - [Creating a Consent store](https://cloud.google.com/healthcare/docs/how-tos/consent)
//
// ## Example Usage
//
// ### Healthcare Consent Store Basic
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/healthcare"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			dataset, err := healthcare.NewDataset(ctx, "dataset", &healthcare.DatasetArgs{
//				Location: pulumi.String("us-central1"),
//				Name:     pulumi.String("my-dataset"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = healthcare.NewConsentStore(ctx, "my-consent", &healthcare.ConsentStoreArgs{
//				Dataset: dataset.ID(),
//				Name:    pulumi.String("my-consent-store"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Healthcare Consent Store Full
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/healthcare"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			dataset, err := healthcare.NewDataset(ctx, "dataset", &healthcare.DatasetArgs{
//				Location: pulumi.String("us-central1"),
//				Name:     pulumi.String("my-dataset"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = healthcare.NewConsentStore(ctx, "my-consent", &healthcare.ConsentStoreArgs{
//				Dataset:                     dataset.ID(),
//				Name:                        pulumi.String("my-consent-store"),
//				EnableConsentCreateOnUpdate: pulumi.Bool(true),
//				DefaultConsentTtl:           pulumi.String("90000s"),
//				Labels: pulumi.StringMap{
//					"label1": pulumi.String("labelvalue1"),
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
// ### Healthcare Consent Store Iam
//
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/healthcare"
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/serviceaccount"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			dataset, err := healthcare.NewDataset(ctx, "dataset", &healthcare.DatasetArgs{
//				Location: pulumi.String("us-central1"),
//				Name:     pulumi.String("my-dataset"),
//			})
//			if err != nil {
//				return err
//			}
//			my_consent, err := healthcare.NewConsentStore(ctx, "my-consent", &healthcare.ConsentStoreArgs{
//				Dataset: dataset.ID(),
//				Name:    pulumi.String("my-consent-store"),
//			})
//			if err != nil {
//				return err
//			}
//			test_account, err := serviceaccount.NewAccount(ctx, "test-account", &serviceaccount.AccountArgs{
//				AccountId:   pulumi.String("my-account"),
//				DisplayName: pulumi.String("Test Service Account"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = healthcare.NewConsentStoreIamMember(ctx, "test-iam", &healthcare.ConsentStoreIamMemberArgs{
//				Dataset:        dataset.ID(),
//				ConsentStoreId: my_consent.Name,
//				Role:           pulumi.String("roles/editor"),
//				Member: test_account.Email.ApplyT(func(email string) (string, error) {
//					return fmt.Sprintf("serviceAccount:%v", email), nil
//				}).(pulumi.StringOutput),
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
// ConsentStore can be imported using any of these accepted formats:
//
// * `{{dataset}}/consentStores/{{name}}`
//
// When using the `pulumi import` command, ConsentStore can be imported using one of the formats above. For example:
//
// ```sh
// $ pulumi import gcp:healthcare/consentStore:ConsentStore default {{dataset}}/consentStores/{{name}}
// ```
type ConsentStore struct {
	pulumi.CustomResourceState

	// Identifies the dataset addressed by this request. Must be in the format
	// 'projects/{project}/locations/{location}/datasets/{dataset}'
	Dataset pulumi.StringOutput `pulumi:"dataset"`
	// Default time to live for consents in this store. Must be at least 24 hours. Updating this field will not affect the expiration time of existing consents.
	// A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s".
	DefaultConsentTtl pulumi.StringPtrOutput `pulumi:"defaultConsentTtl"`
	// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
	EffectiveLabels pulumi.StringMapOutput `pulumi:"effectiveLabels"`
	// If true, [consents.patch] [google.cloud.healthcare.v1.consent.UpdateConsent] creates the consent if it does not already exist.
	EnableConsentCreateOnUpdate pulumi.BoolPtrOutput `pulumi:"enableConsentCreateOnUpdate"`
	// User-supplied key-value pairs used to organize Consent stores.
	// Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must
	// conform to the following PCRE regular expression: `[\p{Ll}\p{Lo}][\p{Ll}\p{Lo}\p{N}_-]{0,62}`
	// Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128
	// bytes, and must conform to the following PCRE regular expression: `[\p{Ll}\p{Lo}\p{N}_-]{0,63}`
	// No more than 64 labels can be associated with a given store.
	// An object containing a list of "key": value pairs.
	// Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
	//
	// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
	// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
	Labels pulumi.StringMapOutput `pulumi:"labels"`
	// The name of this ConsentStore, for example:
	// "consent1"
	Name pulumi.StringOutput `pulumi:"name"`
	// The combination of labels configured directly on the resource
	// and default labels configured on the provider.
	PulumiLabels pulumi.StringMapOutput `pulumi:"pulumiLabels"`
}

// NewConsentStore registers a new resource with the given unique name, arguments, and options.
func NewConsentStore(ctx *pulumi.Context,
	name string, args *ConsentStoreArgs, opts ...pulumi.ResourceOption) (*ConsentStore, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Dataset == nil {
		return nil, errors.New("invalid value for required argument 'Dataset'")
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"effectiveLabels",
		"pulumiLabels",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ConsentStore
	err := ctx.RegisterResource("gcp:healthcare/consentStore:ConsentStore", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetConsentStore gets an existing ConsentStore resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetConsentStore(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ConsentStoreState, opts ...pulumi.ResourceOption) (*ConsentStore, error) {
	var resource ConsentStore
	err := ctx.ReadResource("gcp:healthcare/consentStore:ConsentStore", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ConsentStore resources.
type consentStoreState struct {
	// Identifies the dataset addressed by this request. Must be in the format
	// 'projects/{project}/locations/{location}/datasets/{dataset}'
	Dataset *string `pulumi:"dataset"`
	// Default time to live for consents in this store. Must be at least 24 hours. Updating this field will not affect the expiration time of existing consents.
	// A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s".
	DefaultConsentTtl *string `pulumi:"defaultConsentTtl"`
	// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
	EffectiveLabels map[string]string `pulumi:"effectiveLabels"`
	// If true, [consents.patch] [google.cloud.healthcare.v1.consent.UpdateConsent] creates the consent if it does not already exist.
	EnableConsentCreateOnUpdate *bool `pulumi:"enableConsentCreateOnUpdate"`
	// User-supplied key-value pairs used to organize Consent stores.
	// Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must
	// conform to the following PCRE regular expression: `[\p{Ll}\p{Lo}][\p{Ll}\p{Lo}\p{N}_-]{0,62}`
	// Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128
	// bytes, and must conform to the following PCRE regular expression: `[\p{Ll}\p{Lo}\p{N}_-]{0,63}`
	// No more than 64 labels can be associated with a given store.
	// An object containing a list of "key": value pairs.
	// Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
	//
	// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
	// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
	Labels map[string]string `pulumi:"labels"`
	// The name of this ConsentStore, for example:
	// "consent1"
	Name *string `pulumi:"name"`
	// The combination of labels configured directly on the resource
	// and default labels configured on the provider.
	PulumiLabels map[string]string `pulumi:"pulumiLabels"`
}

type ConsentStoreState struct {
	// Identifies the dataset addressed by this request. Must be in the format
	// 'projects/{project}/locations/{location}/datasets/{dataset}'
	Dataset pulumi.StringPtrInput
	// Default time to live for consents in this store. Must be at least 24 hours. Updating this field will not affect the expiration time of existing consents.
	// A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s".
	DefaultConsentTtl pulumi.StringPtrInput
	// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
	EffectiveLabels pulumi.StringMapInput
	// If true, [consents.patch] [google.cloud.healthcare.v1.consent.UpdateConsent] creates the consent if it does not already exist.
	EnableConsentCreateOnUpdate pulumi.BoolPtrInput
	// User-supplied key-value pairs used to organize Consent stores.
	// Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must
	// conform to the following PCRE regular expression: `[\p{Ll}\p{Lo}][\p{Ll}\p{Lo}\p{N}_-]{0,62}`
	// Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128
	// bytes, and must conform to the following PCRE regular expression: `[\p{Ll}\p{Lo}\p{N}_-]{0,63}`
	// No more than 64 labels can be associated with a given store.
	// An object containing a list of "key": value pairs.
	// Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
	//
	// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
	// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
	Labels pulumi.StringMapInput
	// The name of this ConsentStore, for example:
	// "consent1"
	Name pulumi.StringPtrInput
	// The combination of labels configured directly on the resource
	// and default labels configured on the provider.
	PulumiLabels pulumi.StringMapInput
}

func (ConsentStoreState) ElementType() reflect.Type {
	return reflect.TypeOf((*consentStoreState)(nil)).Elem()
}

type consentStoreArgs struct {
	// Identifies the dataset addressed by this request. Must be in the format
	// 'projects/{project}/locations/{location}/datasets/{dataset}'
	Dataset string `pulumi:"dataset"`
	// Default time to live for consents in this store. Must be at least 24 hours. Updating this field will not affect the expiration time of existing consents.
	// A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s".
	DefaultConsentTtl *string `pulumi:"defaultConsentTtl"`
	// If true, [consents.patch] [google.cloud.healthcare.v1.consent.UpdateConsent] creates the consent if it does not already exist.
	EnableConsentCreateOnUpdate *bool `pulumi:"enableConsentCreateOnUpdate"`
	// User-supplied key-value pairs used to organize Consent stores.
	// Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must
	// conform to the following PCRE regular expression: `[\p{Ll}\p{Lo}][\p{Ll}\p{Lo}\p{N}_-]{0,62}`
	// Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128
	// bytes, and must conform to the following PCRE regular expression: `[\p{Ll}\p{Lo}\p{N}_-]{0,63}`
	// No more than 64 labels can be associated with a given store.
	// An object containing a list of "key": value pairs.
	// Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
	//
	// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
	// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
	Labels map[string]string `pulumi:"labels"`
	// The name of this ConsentStore, for example:
	// "consent1"
	Name *string `pulumi:"name"`
}

// The set of arguments for constructing a ConsentStore resource.
type ConsentStoreArgs struct {
	// Identifies the dataset addressed by this request. Must be in the format
	// 'projects/{project}/locations/{location}/datasets/{dataset}'
	Dataset pulumi.StringInput
	// Default time to live for consents in this store. Must be at least 24 hours. Updating this field will not affect the expiration time of existing consents.
	// A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s".
	DefaultConsentTtl pulumi.StringPtrInput
	// If true, [consents.patch] [google.cloud.healthcare.v1.consent.UpdateConsent] creates the consent if it does not already exist.
	EnableConsentCreateOnUpdate pulumi.BoolPtrInput
	// User-supplied key-value pairs used to organize Consent stores.
	// Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must
	// conform to the following PCRE regular expression: `[\p{Ll}\p{Lo}][\p{Ll}\p{Lo}\p{N}_-]{0,62}`
	// Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128
	// bytes, and must conform to the following PCRE regular expression: `[\p{Ll}\p{Lo}\p{N}_-]{0,63}`
	// No more than 64 labels can be associated with a given store.
	// An object containing a list of "key": value pairs.
	// Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
	//
	// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
	// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
	Labels pulumi.StringMapInput
	// The name of this ConsentStore, for example:
	// "consent1"
	Name pulumi.StringPtrInput
}

func (ConsentStoreArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*consentStoreArgs)(nil)).Elem()
}

type ConsentStoreInput interface {
	pulumi.Input

	ToConsentStoreOutput() ConsentStoreOutput
	ToConsentStoreOutputWithContext(ctx context.Context) ConsentStoreOutput
}

func (*ConsentStore) ElementType() reflect.Type {
	return reflect.TypeOf((**ConsentStore)(nil)).Elem()
}

func (i *ConsentStore) ToConsentStoreOutput() ConsentStoreOutput {
	return i.ToConsentStoreOutputWithContext(context.Background())
}

func (i *ConsentStore) ToConsentStoreOutputWithContext(ctx context.Context) ConsentStoreOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConsentStoreOutput)
}

// ConsentStoreArrayInput is an input type that accepts ConsentStoreArray and ConsentStoreArrayOutput values.
// You can construct a concrete instance of `ConsentStoreArrayInput` via:
//
//	ConsentStoreArray{ ConsentStoreArgs{...} }
type ConsentStoreArrayInput interface {
	pulumi.Input

	ToConsentStoreArrayOutput() ConsentStoreArrayOutput
	ToConsentStoreArrayOutputWithContext(context.Context) ConsentStoreArrayOutput
}

type ConsentStoreArray []ConsentStoreInput

func (ConsentStoreArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ConsentStore)(nil)).Elem()
}

func (i ConsentStoreArray) ToConsentStoreArrayOutput() ConsentStoreArrayOutput {
	return i.ToConsentStoreArrayOutputWithContext(context.Background())
}

func (i ConsentStoreArray) ToConsentStoreArrayOutputWithContext(ctx context.Context) ConsentStoreArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConsentStoreArrayOutput)
}

// ConsentStoreMapInput is an input type that accepts ConsentStoreMap and ConsentStoreMapOutput values.
// You can construct a concrete instance of `ConsentStoreMapInput` via:
//
//	ConsentStoreMap{ "key": ConsentStoreArgs{...} }
type ConsentStoreMapInput interface {
	pulumi.Input

	ToConsentStoreMapOutput() ConsentStoreMapOutput
	ToConsentStoreMapOutputWithContext(context.Context) ConsentStoreMapOutput
}

type ConsentStoreMap map[string]ConsentStoreInput

func (ConsentStoreMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ConsentStore)(nil)).Elem()
}

func (i ConsentStoreMap) ToConsentStoreMapOutput() ConsentStoreMapOutput {
	return i.ToConsentStoreMapOutputWithContext(context.Background())
}

func (i ConsentStoreMap) ToConsentStoreMapOutputWithContext(ctx context.Context) ConsentStoreMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConsentStoreMapOutput)
}

type ConsentStoreOutput struct{ *pulumi.OutputState }

func (ConsentStoreOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ConsentStore)(nil)).Elem()
}

func (o ConsentStoreOutput) ToConsentStoreOutput() ConsentStoreOutput {
	return o
}

func (o ConsentStoreOutput) ToConsentStoreOutputWithContext(ctx context.Context) ConsentStoreOutput {
	return o
}

// Identifies the dataset addressed by this request. Must be in the format
// 'projects/{project}/locations/{location}/datasets/{dataset}'
func (o ConsentStoreOutput) Dataset() pulumi.StringOutput {
	return o.ApplyT(func(v *ConsentStore) pulumi.StringOutput { return v.Dataset }).(pulumi.StringOutput)
}

// Default time to live for consents in this store. Must be at least 24 hours. Updating this field will not affect the expiration time of existing consents.
// A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s".
func (o ConsentStoreOutput) DefaultConsentTtl() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ConsentStore) pulumi.StringPtrOutput { return v.DefaultConsentTtl }).(pulumi.StringPtrOutput)
}

// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
func (o ConsentStoreOutput) EffectiveLabels() pulumi.StringMapOutput {
	return o.ApplyT(func(v *ConsentStore) pulumi.StringMapOutput { return v.EffectiveLabels }).(pulumi.StringMapOutput)
}

// If true, [consents.patch] [google.cloud.healthcare.v1.consent.UpdateConsent] creates the consent if it does not already exist.
func (o ConsentStoreOutput) EnableConsentCreateOnUpdate() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ConsentStore) pulumi.BoolPtrOutput { return v.EnableConsentCreateOnUpdate }).(pulumi.BoolPtrOutput)
}

// User-supplied key-value pairs used to organize Consent stores.
// Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must
// conform to the following PCRE regular expression: `[\p{Ll}\p{Lo}][\p{Ll}\p{Lo}\p{N}_-]{0,62}`
// Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128
// bytes, and must conform to the following PCRE regular expression: `[\p{Ll}\p{Lo}\p{N}_-]{0,63}`
// No more than 64 labels can be associated with a given store.
// An object containing a list of "key": value pairs.
// Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
//
// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
func (o ConsentStoreOutput) Labels() pulumi.StringMapOutput {
	return o.ApplyT(func(v *ConsentStore) pulumi.StringMapOutput { return v.Labels }).(pulumi.StringMapOutput)
}

// The name of this ConsentStore, for example:
// "consent1"
func (o ConsentStoreOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ConsentStore) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The combination of labels configured directly on the resource
// and default labels configured on the provider.
func (o ConsentStoreOutput) PulumiLabels() pulumi.StringMapOutput {
	return o.ApplyT(func(v *ConsentStore) pulumi.StringMapOutput { return v.PulumiLabels }).(pulumi.StringMapOutput)
}

type ConsentStoreArrayOutput struct{ *pulumi.OutputState }

func (ConsentStoreArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ConsentStore)(nil)).Elem()
}

func (o ConsentStoreArrayOutput) ToConsentStoreArrayOutput() ConsentStoreArrayOutput {
	return o
}

func (o ConsentStoreArrayOutput) ToConsentStoreArrayOutputWithContext(ctx context.Context) ConsentStoreArrayOutput {
	return o
}

func (o ConsentStoreArrayOutput) Index(i pulumi.IntInput) ConsentStoreOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ConsentStore {
		return vs[0].([]*ConsentStore)[vs[1].(int)]
	}).(ConsentStoreOutput)
}

type ConsentStoreMapOutput struct{ *pulumi.OutputState }

func (ConsentStoreMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ConsentStore)(nil)).Elem()
}

func (o ConsentStoreMapOutput) ToConsentStoreMapOutput() ConsentStoreMapOutput {
	return o
}

func (o ConsentStoreMapOutput) ToConsentStoreMapOutputWithContext(ctx context.Context) ConsentStoreMapOutput {
	return o
}

func (o ConsentStoreMapOutput) MapIndex(k pulumi.StringInput) ConsentStoreOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ConsentStore {
		return vs[0].(map[string]*ConsentStore)[vs[1].(string)]
	}).(ConsentStoreOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ConsentStoreInput)(nil)).Elem(), &ConsentStore{})
	pulumi.RegisterInputType(reflect.TypeOf((*ConsentStoreArrayInput)(nil)).Elem(), ConsentStoreArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ConsentStoreMapInput)(nil)).Elem(), ConsentStoreMap{})
	pulumi.RegisterOutputType(ConsentStoreOutput{})
	pulumi.RegisterOutputType(ConsentStoreArrayOutput{})
	pulumi.RegisterOutputType(ConsentStoreMapOutput{})
}
