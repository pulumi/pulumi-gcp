// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package vertex

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
//
// ### Vertex Ai Metadata Store
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/vertex"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := vertex.NewAiMetadataStore(ctx, "store", &vertex.AiMetadataStoreArgs{
//				Name:        pulumi.String("test-store"),
//				Description: pulumi.String("Store to test the terraform module"),
//				Region:      pulumi.String("us-central1"),
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
// MetadataStore can be imported using any of these accepted formats:
//
// * `projects/{{project}}/locations/{{region}}/metadataStores/{{name}}`
//
// * `{{project}}/{{region}}/{{name}}`
//
// * `{{region}}/{{name}}`
//
// * `{{name}}`
//
// When using the `pulumi import` command, MetadataStore can be imported using one of the formats above. For example:
//
// ```sh
// $ pulumi import gcp:vertex/aiMetadataStore:AiMetadataStore default projects/{{project}}/locations/{{region}}/metadataStores/{{name}}
// ```
//
// ```sh
// $ pulumi import gcp:vertex/aiMetadataStore:AiMetadataStore default {{project}}/{{region}}/{{name}}
// ```
//
// ```sh
// $ pulumi import gcp:vertex/aiMetadataStore:AiMetadataStore default {{region}}/{{name}}
// ```
//
// ```sh
// $ pulumi import gcp:vertex/aiMetadataStore:AiMetadataStore default {{name}}
// ```
type AiMetadataStore struct {
	pulumi.CustomResourceState

	// The timestamp of when the MetadataStore was created in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits.
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// Description of the MetadataStore.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Customer-managed encryption key spec for a MetadataStore. If set, this MetadataStore and all sub-resources of this MetadataStore will be secured by this key.
	// Structure is documented below.
	EncryptionSpec AiMetadataStoreEncryptionSpecPtrOutput `pulumi:"encryptionSpec"`
	// The name of the MetadataStore. This value may be up to 60 characters, and valid characters are [a-z0-9_]. The first character cannot be a number.
	Name pulumi.StringOutput `pulumi:"name"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringOutput `pulumi:"project"`
	// The region of the Metadata Store. eg us-central1
	Region pulumi.StringOutput `pulumi:"region"`
	// State information of the MetadataStore.
	// Structure is documented below.
	States AiMetadataStoreStateTypeArrayOutput `pulumi:"states"`
	// The timestamp of when the MetadataStore was last updated in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits.
	UpdateTime pulumi.StringOutput `pulumi:"updateTime"`
}

// NewAiMetadataStore registers a new resource with the given unique name, arguments, and options.
func NewAiMetadataStore(ctx *pulumi.Context,
	name string, args *AiMetadataStoreArgs, opts ...pulumi.ResourceOption) (*AiMetadataStore, error) {
	if args == nil {
		args = &AiMetadataStoreArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AiMetadataStore
	err := ctx.RegisterResource("gcp:vertex/aiMetadataStore:AiMetadataStore", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAiMetadataStore gets an existing AiMetadataStore resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAiMetadataStore(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AiMetadataStoreState, opts ...pulumi.ResourceOption) (*AiMetadataStore, error) {
	var resource AiMetadataStore
	err := ctx.ReadResource("gcp:vertex/aiMetadataStore:AiMetadataStore", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AiMetadataStore resources.
type aiMetadataStoreState struct {
	// The timestamp of when the MetadataStore was created in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits.
	CreateTime *string `pulumi:"createTime"`
	// Description of the MetadataStore.
	Description *string `pulumi:"description"`
	// Customer-managed encryption key spec for a MetadataStore. If set, this MetadataStore and all sub-resources of this MetadataStore will be secured by this key.
	// Structure is documented below.
	EncryptionSpec *AiMetadataStoreEncryptionSpec `pulumi:"encryptionSpec"`
	// The name of the MetadataStore. This value may be up to 60 characters, and valid characters are [a-z0-9_]. The first character cannot be a number.
	Name *string `pulumi:"name"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
	// The region of the Metadata Store. eg us-central1
	Region *string `pulumi:"region"`
	// State information of the MetadataStore.
	// Structure is documented below.
	States []AiMetadataStoreStateType `pulumi:"states"`
	// The timestamp of when the MetadataStore was last updated in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits.
	UpdateTime *string `pulumi:"updateTime"`
}

type AiMetadataStoreState struct {
	// The timestamp of when the MetadataStore was created in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits.
	CreateTime pulumi.StringPtrInput
	// Description of the MetadataStore.
	Description pulumi.StringPtrInput
	// Customer-managed encryption key spec for a MetadataStore. If set, this MetadataStore and all sub-resources of this MetadataStore will be secured by this key.
	// Structure is documented below.
	EncryptionSpec AiMetadataStoreEncryptionSpecPtrInput
	// The name of the MetadataStore. This value may be up to 60 characters, and valid characters are [a-z0-9_]. The first character cannot be a number.
	Name pulumi.StringPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
	// The region of the Metadata Store. eg us-central1
	Region pulumi.StringPtrInput
	// State information of the MetadataStore.
	// Structure is documented below.
	States AiMetadataStoreStateTypeArrayInput
	// The timestamp of when the MetadataStore was last updated in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits.
	UpdateTime pulumi.StringPtrInput
}

func (AiMetadataStoreState) ElementType() reflect.Type {
	return reflect.TypeOf((*aiMetadataStoreState)(nil)).Elem()
}

type aiMetadataStoreArgs struct {
	// Description of the MetadataStore.
	Description *string `pulumi:"description"`
	// Customer-managed encryption key spec for a MetadataStore. If set, this MetadataStore and all sub-resources of this MetadataStore will be secured by this key.
	// Structure is documented below.
	EncryptionSpec *AiMetadataStoreEncryptionSpec `pulumi:"encryptionSpec"`
	// The name of the MetadataStore. This value may be up to 60 characters, and valid characters are [a-z0-9_]. The first character cannot be a number.
	Name *string `pulumi:"name"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
	// The region of the Metadata Store. eg us-central1
	Region *string `pulumi:"region"`
}

// The set of arguments for constructing a AiMetadataStore resource.
type AiMetadataStoreArgs struct {
	// Description of the MetadataStore.
	Description pulumi.StringPtrInput
	// Customer-managed encryption key spec for a MetadataStore. If set, this MetadataStore and all sub-resources of this MetadataStore will be secured by this key.
	// Structure is documented below.
	EncryptionSpec AiMetadataStoreEncryptionSpecPtrInput
	// The name of the MetadataStore. This value may be up to 60 characters, and valid characters are [a-z0-9_]. The first character cannot be a number.
	Name pulumi.StringPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
	// The region of the Metadata Store. eg us-central1
	Region pulumi.StringPtrInput
}

func (AiMetadataStoreArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*aiMetadataStoreArgs)(nil)).Elem()
}

type AiMetadataStoreInput interface {
	pulumi.Input

	ToAiMetadataStoreOutput() AiMetadataStoreOutput
	ToAiMetadataStoreOutputWithContext(ctx context.Context) AiMetadataStoreOutput
}

func (*AiMetadataStore) ElementType() reflect.Type {
	return reflect.TypeOf((**AiMetadataStore)(nil)).Elem()
}

func (i *AiMetadataStore) ToAiMetadataStoreOutput() AiMetadataStoreOutput {
	return i.ToAiMetadataStoreOutputWithContext(context.Background())
}

func (i *AiMetadataStore) ToAiMetadataStoreOutputWithContext(ctx context.Context) AiMetadataStoreOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AiMetadataStoreOutput)
}

// AiMetadataStoreArrayInput is an input type that accepts AiMetadataStoreArray and AiMetadataStoreArrayOutput values.
// You can construct a concrete instance of `AiMetadataStoreArrayInput` via:
//
//	AiMetadataStoreArray{ AiMetadataStoreArgs{...} }
type AiMetadataStoreArrayInput interface {
	pulumi.Input

	ToAiMetadataStoreArrayOutput() AiMetadataStoreArrayOutput
	ToAiMetadataStoreArrayOutputWithContext(context.Context) AiMetadataStoreArrayOutput
}

type AiMetadataStoreArray []AiMetadataStoreInput

func (AiMetadataStoreArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AiMetadataStore)(nil)).Elem()
}

func (i AiMetadataStoreArray) ToAiMetadataStoreArrayOutput() AiMetadataStoreArrayOutput {
	return i.ToAiMetadataStoreArrayOutputWithContext(context.Background())
}

func (i AiMetadataStoreArray) ToAiMetadataStoreArrayOutputWithContext(ctx context.Context) AiMetadataStoreArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AiMetadataStoreArrayOutput)
}

// AiMetadataStoreMapInput is an input type that accepts AiMetadataStoreMap and AiMetadataStoreMapOutput values.
// You can construct a concrete instance of `AiMetadataStoreMapInput` via:
//
//	AiMetadataStoreMap{ "key": AiMetadataStoreArgs{...} }
type AiMetadataStoreMapInput interface {
	pulumi.Input

	ToAiMetadataStoreMapOutput() AiMetadataStoreMapOutput
	ToAiMetadataStoreMapOutputWithContext(context.Context) AiMetadataStoreMapOutput
}

type AiMetadataStoreMap map[string]AiMetadataStoreInput

func (AiMetadataStoreMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AiMetadataStore)(nil)).Elem()
}

func (i AiMetadataStoreMap) ToAiMetadataStoreMapOutput() AiMetadataStoreMapOutput {
	return i.ToAiMetadataStoreMapOutputWithContext(context.Background())
}

func (i AiMetadataStoreMap) ToAiMetadataStoreMapOutputWithContext(ctx context.Context) AiMetadataStoreMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AiMetadataStoreMapOutput)
}

type AiMetadataStoreOutput struct{ *pulumi.OutputState }

func (AiMetadataStoreOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AiMetadataStore)(nil)).Elem()
}

func (o AiMetadataStoreOutput) ToAiMetadataStoreOutput() AiMetadataStoreOutput {
	return o
}

func (o AiMetadataStoreOutput) ToAiMetadataStoreOutputWithContext(ctx context.Context) AiMetadataStoreOutput {
	return o
}

// The timestamp of when the MetadataStore was created in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits.
func (o AiMetadataStoreOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *AiMetadataStore) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// Description of the MetadataStore.
func (o AiMetadataStoreOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AiMetadataStore) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Customer-managed encryption key spec for a MetadataStore. If set, this MetadataStore and all sub-resources of this MetadataStore will be secured by this key.
// Structure is documented below.
func (o AiMetadataStoreOutput) EncryptionSpec() AiMetadataStoreEncryptionSpecPtrOutput {
	return o.ApplyT(func(v *AiMetadataStore) AiMetadataStoreEncryptionSpecPtrOutput { return v.EncryptionSpec }).(AiMetadataStoreEncryptionSpecPtrOutput)
}

// The name of the MetadataStore. This value may be up to 60 characters, and valid characters are [a-z0-9_]. The first character cannot be a number.
func (o AiMetadataStoreOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *AiMetadataStore) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The ID of the project in which the resource belongs.
// If it is not provided, the provider project is used.
func (o AiMetadataStoreOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *AiMetadataStore) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// The region of the Metadata Store. eg us-central1
func (o AiMetadataStoreOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v *AiMetadataStore) pulumi.StringOutput { return v.Region }).(pulumi.StringOutput)
}

// State information of the MetadataStore.
// Structure is documented below.
func (o AiMetadataStoreOutput) States() AiMetadataStoreStateTypeArrayOutput {
	return o.ApplyT(func(v *AiMetadataStore) AiMetadataStoreStateTypeArrayOutput { return v.States }).(AiMetadataStoreStateTypeArrayOutput)
}

// The timestamp of when the MetadataStore was last updated in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits.
func (o AiMetadataStoreOutput) UpdateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *AiMetadataStore) pulumi.StringOutput { return v.UpdateTime }).(pulumi.StringOutput)
}

type AiMetadataStoreArrayOutput struct{ *pulumi.OutputState }

func (AiMetadataStoreArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AiMetadataStore)(nil)).Elem()
}

func (o AiMetadataStoreArrayOutput) ToAiMetadataStoreArrayOutput() AiMetadataStoreArrayOutput {
	return o
}

func (o AiMetadataStoreArrayOutput) ToAiMetadataStoreArrayOutputWithContext(ctx context.Context) AiMetadataStoreArrayOutput {
	return o
}

func (o AiMetadataStoreArrayOutput) Index(i pulumi.IntInput) AiMetadataStoreOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AiMetadataStore {
		return vs[0].([]*AiMetadataStore)[vs[1].(int)]
	}).(AiMetadataStoreOutput)
}

type AiMetadataStoreMapOutput struct{ *pulumi.OutputState }

func (AiMetadataStoreMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AiMetadataStore)(nil)).Elem()
}

func (o AiMetadataStoreMapOutput) ToAiMetadataStoreMapOutput() AiMetadataStoreMapOutput {
	return o
}

func (o AiMetadataStoreMapOutput) ToAiMetadataStoreMapOutputWithContext(ctx context.Context) AiMetadataStoreMapOutput {
	return o
}

func (o AiMetadataStoreMapOutput) MapIndex(k pulumi.StringInput) AiMetadataStoreOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AiMetadataStore {
		return vs[0].(map[string]*AiMetadataStore)[vs[1].(string)]
	}).(AiMetadataStoreOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AiMetadataStoreInput)(nil)).Elem(), &AiMetadataStore{})
	pulumi.RegisterInputType(reflect.TypeOf((*AiMetadataStoreArrayInput)(nil)).Elem(), AiMetadataStoreArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AiMetadataStoreMapInput)(nil)).Elem(), AiMetadataStoreMap{})
	pulumi.RegisterOutputType(AiMetadataStoreOutput{})
	pulumi.RegisterOutputType(AiMetadataStoreArrayOutput{})
	pulumi.RegisterOutputType(AiMetadataStoreMapOutput{})
}
