// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dataloss

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Allows creation of templates to de-identify content.
//
// To get more information about DeidentifyTemplate, see:
//
// * [API documentation](https://cloud.google.com/dlp/docs/reference/rest/v2/projects.deidentifyTemplates)
// * How-to Guides
//   - [Official Documentation](https://cloud.google.com/dlp/docs/concepts-templates)
//
// ## Example Usage
//
// ### Dlp Deidentify Template Basic
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/dataloss"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := dataloss.NewPreventionDeidentifyTemplate(ctx, "basic", &dataloss.PreventionDeidentifyTemplateArgs{
//				Parent:      pulumi.String("projects/my-project-name"),
//				Description: pulumi.String("Description"),
//				DisplayName: pulumi.String("Displayname"),
//				DeidentifyConfig: &dataloss.PreventionDeidentifyTemplateDeidentifyConfigArgs{
//					InfoTypeTransformations: &dataloss.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsArgs{
//						Transformations: dataloss.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationArray{
//							&dataloss.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationArgs{
//								InfoTypes: dataloss.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationInfoTypeArray{
//									&dataloss.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationInfoTypeArgs{
//										Name: pulumi.String("FIRST_NAME"),
//									},
//								},
//								PrimitiveTransformation: &dataloss.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationArgs{
//									ReplaceWithInfoTypeConfig: pulumi.Bool(true),
//								},
//							},
//							&dataloss.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationArgs{
//								InfoTypes: dataloss.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationInfoTypeArray{
//									&dataloss.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationInfoTypeArgs{
//										Name: pulumi.String("PHONE_NUMBER"),
//									},
//									&dataloss.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationInfoTypeArgs{
//										Name: pulumi.String("AGE"),
//									},
//								},
//								PrimitiveTransformation: &dataloss.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationArgs{
//									ReplaceConfig: &dataloss.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigArgs{
//										NewValue: &dataloss.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueArgs{
//											IntegerValue: pulumi.Int(9),
//										},
//									},
//								},
//							},
//							&dataloss.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationArgs{
//								InfoTypes: dataloss.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationInfoTypeArray{
//									&dataloss.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationInfoTypeArgs{
//										Name: pulumi.String("EMAIL_ADDRESS"),
//									},
//									&dataloss.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationInfoTypeArgs{
//										Name: pulumi.String("LAST_NAME"),
//									},
//								},
//								PrimitiveTransformation: &dataloss.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationArgs{
//									CharacterMaskConfig: &dataloss.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigArgs{
//										MaskingCharacter: pulumi.String("X"),
//										NumberToMask:     pulumi.Int(4),
//										ReverseOrder:     pulumi.Bool(true),
//										CharactersToIgnores: dataloss.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnoreArray{
//											&dataloss.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnoreArgs{
//												CommonCharactersToIgnore: pulumi.String("PUNCTUATION"),
//											},
//										},
//									},
//								},
//							},
//							&dataloss.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationArgs{
//								InfoTypes: dataloss.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationInfoTypeArray{
//									&dataloss.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationInfoTypeArgs{
//										Name: pulumi.String("DATE_OF_BIRTH"),
//									},
//								},
//								PrimitiveTransformation: &dataloss.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationArgs{
//									ReplaceConfig: &dataloss.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigArgs{
//										NewValue: &dataloss.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueArgs{
//											DateValue: &dataloss.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueDateValueArgs{
//												Year:  pulumi.Int(2020),
//												Month: pulumi.Int(1),
//												Day:   pulumi.Int(1),
//											},
//										},
//									},
//								},
//							},
//							&dataloss.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationArgs{
//								InfoTypes: dataloss.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationInfoTypeArray{
//									&dataloss.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationInfoTypeArgs{
//										Name: pulumi.String("CREDIT_CARD_NUMBER"),
//									},
//								},
//								PrimitiveTransformation: &dataloss.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationArgs{
//									CryptoDeterministicConfig: &dataloss.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigArgs{
//										Context: &dataloss.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigContextArgs{
//											Name: pulumi.String("sometweak"),
//										},
//										CryptoKey: &dataloss.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyArgs{
//											Transient: &dataloss.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyTransientArgs{
//												Name: pulumi.String("beep"),
//											},
//										},
//										SurrogateInfoType: &dataloss.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigSurrogateInfoTypeArgs{
//											Name: pulumi.String("abc"),
//										},
//									},
//								},
//							},
//						},
//					},
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
// ### Dlp Deidentify Template Image Transformations
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/dataloss"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := dataloss.NewPreventionDeidentifyTemplate(ctx, "basic", &dataloss.PreventionDeidentifyTemplateArgs{
//				Parent:      pulumi.String("projects/my-project-name"),
//				Description: pulumi.String("Description"),
//				DisplayName: pulumi.String("Displayname"),
//				DeidentifyConfig: &dataloss.PreventionDeidentifyTemplateDeidentifyConfigArgs{
//					ImageTransformations: &dataloss.PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsArgs{
//						Transforms: dataloss.PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsTransformArray{
//							&dataloss.PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsTransformArgs{
//								RedactionColor: &dataloss.PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsTransformRedactionColorArgs{
//									Red:   pulumi.Float64(0.5),
//									Blue:  pulumi.Float64(1),
//									Green: pulumi.Float64(0.2),
//								},
//								SelectedInfoTypes: &dataloss.PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsTransformSelectedInfoTypesArgs{
//									InfoTypes: dataloss.PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsTransformSelectedInfoTypesInfoTypeArray{
//										&dataloss.PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsTransformSelectedInfoTypesInfoTypeArgs{
//											Name:    pulumi.String("COLOR_INFO"),
//											Version: pulumi.String("latest"),
//										},
//									},
//								},
//							},
//							&dataloss.PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsTransformArgs{
//								AllInfoTypes: &dataloss.PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsTransformAllInfoTypesArgs{},
//							},
//							&dataloss.PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsTransformArgs{
//								AllText: &dataloss.PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsTransformAllTextArgs{},
//							},
//						},
//					},
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
// DeidentifyTemplate can be imported using any of these accepted formats:
//
// * `{{parent}}/deidentifyTemplates/{{name}}`
//
// * `{{parent}}/{{name}}`
//
// When using the `pulumi import` command, DeidentifyTemplate can be imported using one of the formats above. For example:
//
// ```sh
// $ pulumi import gcp:dataloss/preventionDeidentifyTemplate:PreventionDeidentifyTemplate default {{parent}}/deidentifyTemplates/{{name}}
// ```
//
// ```sh
// $ pulumi import gcp:dataloss/preventionDeidentifyTemplate:PreventionDeidentifyTemplate default {{parent}}/{{name}}
// ```
type PreventionDeidentifyTemplate struct {
	pulumi.CustomResourceState

	// The creation timestamp of an deidentifyTemplate. Set by the server.
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// Configuration of the deidentify template
	// Structure is documented below.
	DeidentifyConfig PreventionDeidentifyTemplateDeidentifyConfigOutput `pulumi:"deidentifyConfig"`
	// A description of the template.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// User set display name of the template.
	DisplayName pulumi.StringPtrOutput `pulumi:"displayName"`
	// The resource name of the template. Set by the server.
	Name pulumi.StringOutput `pulumi:"name"`
	// The parent of the template in any of the following formats:
	// * `projects/{{project}}`
	// * `projects/{{project}}/locations/{{location}}`
	// * `organizations/{{organization_id}}`
	// * `organizations/{{organization_id}}/locations/{{location}}`
	Parent pulumi.StringOutput `pulumi:"parent"`
	// The template id can contain uppercase and lowercase letters, numbers, and hyphens;
	// that is, it must match the regular expression: [a-zA-Z\d-_]+. The maximum length is
	// 100 characters. Can be empty to allow the system to generate one.
	TemplateId pulumi.StringOutput `pulumi:"templateId"`
	// The last update timestamp of an deidentifyTemplate. Set by the server.
	UpdateTime pulumi.StringOutput `pulumi:"updateTime"`
}

// NewPreventionDeidentifyTemplate registers a new resource with the given unique name, arguments, and options.
func NewPreventionDeidentifyTemplate(ctx *pulumi.Context,
	name string, args *PreventionDeidentifyTemplateArgs, opts ...pulumi.ResourceOption) (*PreventionDeidentifyTemplate, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DeidentifyConfig == nil {
		return nil, errors.New("invalid value for required argument 'DeidentifyConfig'")
	}
	if args.Parent == nil {
		return nil, errors.New("invalid value for required argument 'Parent'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource PreventionDeidentifyTemplate
	err := ctx.RegisterResource("gcp:dataloss/preventionDeidentifyTemplate:PreventionDeidentifyTemplate", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPreventionDeidentifyTemplate gets an existing PreventionDeidentifyTemplate resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPreventionDeidentifyTemplate(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PreventionDeidentifyTemplateState, opts ...pulumi.ResourceOption) (*PreventionDeidentifyTemplate, error) {
	var resource PreventionDeidentifyTemplate
	err := ctx.ReadResource("gcp:dataloss/preventionDeidentifyTemplate:PreventionDeidentifyTemplate", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering PreventionDeidentifyTemplate resources.
type preventionDeidentifyTemplateState struct {
	// The creation timestamp of an deidentifyTemplate. Set by the server.
	CreateTime *string `pulumi:"createTime"`
	// Configuration of the deidentify template
	// Structure is documented below.
	DeidentifyConfig *PreventionDeidentifyTemplateDeidentifyConfig `pulumi:"deidentifyConfig"`
	// A description of the template.
	Description *string `pulumi:"description"`
	// User set display name of the template.
	DisplayName *string `pulumi:"displayName"`
	// The resource name of the template. Set by the server.
	Name *string `pulumi:"name"`
	// The parent of the template in any of the following formats:
	// * `projects/{{project}}`
	// * `projects/{{project}}/locations/{{location}}`
	// * `organizations/{{organization_id}}`
	// * `organizations/{{organization_id}}/locations/{{location}}`
	Parent *string `pulumi:"parent"`
	// The template id can contain uppercase and lowercase letters, numbers, and hyphens;
	// that is, it must match the regular expression: [a-zA-Z\d-_]+. The maximum length is
	// 100 characters. Can be empty to allow the system to generate one.
	TemplateId *string `pulumi:"templateId"`
	// The last update timestamp of an deidentifyTemplate. Set by the server.
	UpdateTime *string `pulumi:"updateTime"`
}

type PreventionDeidentifyTemplateState struct {
	// The creation timestamp of an deidentifyTemplate. Set by the server.
	CreateTime pulumi.StringPtrInput
	// Configuration of the deidentify template
	// Structure is documented below.
	DeidentifyConfig PreventionDeidentifyTemplateDeidentifyConfigPtrInput
	// A description of the template.
	Description pulumi.StringPtrInput
	// User set display name of the template.
	DisplayName pulumi.StringPtrInput
	// The resource name of the template. Set by the server.
	Name pulumi.StringPtrInput
	// The parent of the template in any of the following formats:
	// * `projects/{{project}}`
	// * `projects/{{project}}/locations/{{location}}`
	// * `organizations/{{organization_id}}`
	// * `organizations/{{organization_id}}/locations/{{location}}`
	Parent pulumi.StringPtrInput
	// The template id can contain uppercase and lowercase letters, numbers, and hyphens;
	// that is, it must match the regular expression: [a-zA-Z\d-_]+. The maximum length is
	// 100 characters. Can be empty to allow the system to generate one.
	TemplateId pulumi.StringPtrInput
	// The last update timestamp of an deidentifyTemplate. Set by the server.
	UpdateTime pulumi.StringPtrInput
}

func (PreventionDeidentifyTemplateState) ElementType() reflect.Type {
	return reflect.TypeOf((*preventionDeidentifyTemplateState)(nil)).Elem()
}

type preventionDeidentifyTemplateArgs struct {
	// Configuration of the deidentify template
	// Structure is documented below.
	DeidentifyConfig PreventionDeidentifyTemplateDeidentifyConfig `pulumi:"deidentifyConfig"`
	// A description of the template.
	Description *string `pulumi:"description"`
	// User set display name of the template.
	DisplayName *string `pulumi:"displayName"`
	// The parent of the template in any of the following formats:
	// * `projects/{{project}}`
	// * `projects/{{project}}/locations/{{location}}`
	// * `organizations/{{organization_id}}`
	// * `organizations/{{organization_id}}/locations/{{location}}`
	Parent string `pulumi:"parent"`
	// The template id can contain uppercase and lowercase letters, numbers, and hyphens;
	// that is, it must match the regular expression: [a-zA-Z\d-_]+. The maximum length is
	// 100 characters. Can be empty to allow the system to generate one.
	TemplateId *string `pulumi:"templateId"`
}

// The set of arguments for constructing a PreventionDeidentifyTemplate resource.
type PreventionDeidentifyTemplateArgs struct {
	// Configuration of the deidentify template
	// Structure is documented below.
	DeidentifyConfig PreventionDeidentifyTemplateDeidentifyConfigInput
	// A description of the template.
	Description pulumi.StringPtrInput
	// User set display name of the template.
	DisplayName pulumi.StringPtrInput
	// The parent of the template in any of the following formats:
	// * `projects/{{project}}`
	// * `projects/{{project}}/locations/{{location}}`
	// * `organizations/{{organization_id}}`
	// * `organizations/{{organization_id}}/locations/{{location}}`
	Parent pulumi.StringInput
	// The template id can contain uppercase and lowercase letters, numbers, and hyphens;
	// that is, it must match the regular expression: [a-zA-Z\d-_]+. The maximum length is
	// 100 characters. Can be empty to allow the system to generate one.
	TemplateId pulumi.StringPtrInput
}

func (PreventionDeidentifyTemplateArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*preventionDeidentifyTemplateArgs)(nil)).Elem()
}

type PreventionDeidentifyTemplateInput interface {
	pulumi.Input

	ToPreventionDeidentifyTemplateOutput() PreventionDeidentifyTemplateOutput
	ToPreventionDeidentifyTemplateOutputWithContext(ctx context.Context) PreventionDeidentifyTemplateOutput
}

func (*PreventionDeidentifyTemplate) ElementType() reflect.Type {
	return reflect.TypeOf((**PreventionDeidentifyTemplate)(nil)).Elem()
}

func (i *PreventionDeidentifyTemplate) ToPreventionDeidentifyTemplateOutput() PreventionDeidentifyTemplateOutput {
	return i.ToPreventionDeidentifyTemplateOutputWithContext(context.Background())
}

func (i *PreventionDeidentifyTemplate) ToPreventionDeidentifyTemplateOutputWithContext(ctx context.Context) PreventionDeidentifyTemplateOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PreventionDeidentifyTemplateOutput)
}

// PreventionDeidentifyTemplateArrayInput is an input type that accepts PreventionDeidentifyTemplateArray and PreventionDeidentifyTemplateArrayOutput values.
// You can construct a concrete instance of `PreventionDeidentifyTemplateArrayInput` via:
//
//	PreventionDeidentifyTemplateArray{ PreventionDeidentifyTemplateArgs{...} }
type PreventionDeidentifyTemplateArrayInput interface {
	pulumi.Input

	ToPreventionDeidentifyTemplateArrayOutput() PreventionDeidentifyTemplateArrayOutput
	ToPreventionDeidentifyTemplateArrayOutputWithContext(context.Context) PreventionDeidentifyTemplateArrayOutput
}

type PreventionDeidentifyTemplateArray []PreventionDeidentifyTemplateInput

func (PreventionDeidentifyTemplateArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PreventionDeidentifyTemplate)(nil)).Elem()
}

func (i PreventionDeidentifyTemplateArray) ToPreventionDeidentifyTemplateArrayOutput() PreventionDeidentifyTemplateArrayOutput {
	return i.ToPreventionDeidentifyTemplateArrayOutputWithContext(context.Background())
}

func (i PreventionDeidentifyTemplateArray) ToPreventionDeidentifyTemplateArrayOutputWithContext(ctx context.Context) PreventionDeidentifyTemplateArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PreventionDeidentifyTemplateArrayOutput)
}

// PreventionDeidentifyTemplateMapInput is an input type that accepts PreventionDeidentifyTemplateMap and PreventionDeidentifyTemplateMapOutput values.
// You can construct a concrete instance of `PreventionDeidentifyTemplateMapInput` via:
//
//	PreventionDeidentifyTemplateMap{ "key": PreventionDeidentifyTemplateArgs{...} }
type PreventionDeidentifyTemplateMapInput interface {
	pulumi.Input

	ToPreventionDeidentifyTemplateMapOutput() PreventionDeidentifyTemplateMapOutput
	ToPreventionDeidentifyTemplateMapOutputWithContext(context.Context) PreventionDeidentifyTemplateMapOutput
}

type PreventionDeidentifyTemplateMap map[string]PreventionDeidentifyTemplateInput

func (PreventionDeidentifyTemplateMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PreventionDeidentifyTemplate)(nil)).Elem()
}

func (i PreventionDeidentifyTemplateMap) ToPreventionDeidentifyTemplateMapOutput() PreventionDeidentifyTemplateMapOutput {
	return i.ToPreventionDeidentifyTemplateMapOutputWithContext(context.Background())
}

func (i PreventionDeidentifyTemplateMap) ToPreventionDeidentifyTemplateMapOutputWithContext(ctx context.Context) PreventionDeidentifyTemplateMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PreventionDeidentifyTemplateMapOutput)
}

type PreventionDeidentifyTemplateOutput struct{ *pulumi.OutputState }

func (PreventionDeidentifyTemplateOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**PreventionDeidentifyTemplate)(nil)).Elem()
}

func (o PreventionDeidentifyTemplateOutput) ToPreventionDeidentifyTemplateOutput() PreventionDeidentifyTemplateOutput {
	return o
}

func (o PreventionDeidentifyTemplateOutput) ToPreventionDeidentifyTemplateOutputWithContext(ctx context.Context) PreventionDeidentifyTemplateOutput {
	return o
}

// The creation timestamp of an deidentifyTemplate. Set by the server.
func (o PreventionDeidentifyTemplateOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *PreventionDeidentifyTemplate) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// Configuration of the deidentify template
// Structure is documented below.
func (o PreventionDeidentifyTemplateOutput) DeidentifyConfig() PreventionDeidentifyTemplateDeidentifyConfigOutput {
	return o.ApplyT(func(v *PreventionDeidentifyTemplate) PreventionDeidentifyTemplateDeidentifyConfigOutput {
		return v.DeidentifyConfig
	}).(PreventionDeidentifyTemplateDeidentifyConfigOutput)
}

// A description of the template.
func (o PreventionDeidentifyTemplateOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *PreventionDeidentifyTemplate) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// User set display name of the template.
func (o PreventionDeidentifyTemplateOutput) DisplayName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *PreventionDeidentifyTemplate) pulumi.StringPtrOutput { return v.DisplayName }).(pulumi.StringPtrOutput)
}

// The resource name of the template. Set by the server.
func (o PreventionDeidentifyTemplateOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *PreventionDeidentifyTemplate) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The parent of the template in any of the following formats:
// * `projects/{{project}}`
// * `projects/{{project}}/locations/{{location}}`
// * `organizations/{{organization_id}}`
// * `organizations/{{organization_id}}/locations/{{location}}`
func (o PreventionDeidentifyTemplateOutput) Parent() pulumi.StringOutput {
	return o.ApplyT(func(v *PreventionDeidentifyTemplate) pulumi.StringOutput { return v.Parent }).(pulumi.StringOutput)
}

// The template id can contain uppercase and lowercase letters, numbers, and hyphens;
// that is, it must match the regular expression: [a-zA-Z\d-_]+. The maximum length is
// 100 characters. Can be empty to allow the system to generate one.
func (o PreventionDeidentifyTemplateOutput) TemplateId() pulumi.StringOutput {
	return o.ApplyT(func(v *PreventionDeidentifyTemplate) pulumi.StringOutput { return v.TemplateId }).(pulumi.StringOutput)
}

// The last update timestamp of an deidentifyTemplate. Set by the server.
func (o PreventionDeidentifyTemplateOutput) UpdateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *PreventionDeidentifyTemplate) pulumi.StringOutput { return v.UpdateTime }).(pulumi.StringOutput)
}

type PreventionDeidentifyTemplateArrayOutput struct{ *pulumi.OutputState }

func (PreventionDeidentifyTemplateArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PreventionDeidentifyTemplate)(nil)).Elem()
}

func (o PreventionDeidentifyTemplateArrayOutput) ToPreventionDeidentifyTemplateArrayOutput() PreventionDeidentifyTemplateArrayOutput {
	return o
}

func (o PreventionDeidentifyTemplateArrayOutput) ToPreventionDeidentifyTemplateArrayOutputWithContext(ctx context.Context) PreventionDeidentifyTemplateArrayOutput {
	return o
}

func (o PreventionDeidentifyTemplateArrayOutput) Index(i pulumi.IntInput) PreventionDeidentifyTemplateOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *PreventionDeidentifyTemplate {
		return vs[0].([]*PreventionDeidentifyTemplate)[vs[1].(int)]
	}).(PreventionDeidentifyTemplateOutput)
}

type PreventionDeidentifyTemplateMapOutput struct{ *pulumi.OutputState }

func (PreventionDeidentifyTemplateMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PreventionDeidentifyTemplate)(nil)).Elem()
}

func (o PreventionDeidentifyTemplateMapOutput) ToPreventionDeidentifyTemplateMapOutput() PreventionDeidentifyTemplateMapOutput {
	return o
}

func (o PreventionDeidentifyTemplateMapOutput) ToPreventionDeidentifyTemplateMapOutputWithContext(ctx context.Context) PreventionDeidentifyTemplateMapOutput {
	return o
}

func (o PreventionDeidentifyTemplateMapOutput) MapIndex(k pulumi.StringInput) PreventionDeidentifyTemplateOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *PreventionDeidentifyTemplate {
		return vs[0].(map[string]*PreventionDeidentifyTemplate)[vs[1].(string)]
	}).(PreventionDeidentifyTemplateOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PreventionDeidentifyTemplateInput)(nil)).Elem(), &PreventionDeidentifyTemplate{})
	pulumi.RegisterInputType(reflect.TypeOf((*PreventionDeidentifyTemplateArrayInput)(nil)).Elem(), PreventionDeidentifyTemplateArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PreventionDeidentifyTemplateMapInput)(nil)).Elem(), PreventionDeidentifyTemplateMap{})
	pulumi.RegisterOutputType(PreventionDeidentifyTemplateOutput{})
	pulumi.RegisterOutputType(PreventionDeidentifyTemplateArrayOutput{})
	pulumi.RegisterOutputType(PreventionDeidentifyTemplateMapOutput{})
}
