// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package diagflow

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// You can create multiple versions of your agent flows and deploy them to separate serving environments.
// When you edit a flow, you are editing a draft flow. At any point, you can save a draft flow as a flow version. A flow version is an immutable snapshot of your flow data and associated agent data like intents, entities, webhooks, pages, route groups, etc.
//
// To get more information about Version, see:
//
// * [API documentation](https://cloud.google.com/dialogflow/cx/docs/reference/rest/v3/projects.locations.agents.flows.versions)
// * How-to Guides
//   - [Official Documentation](https://cloud.google.com/dialogflow/cx/docs)
//
// ## Example Usage
//
// ### Dialogflowcx Version Full
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/diagflow"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			agent, err := diagflow.NewCxAgent(ctx, "agent", &diagflow.CxAgentArgs{
//				DisplayName:         pulumi.String("dialogflowcx-agent"),
//				Location:            pulumi.String("global"),
//				DefaultLanguageCode: pulumi.String("en"),
//				SupportedLanguageCodes: pulumi.StringArray{
//					pulumi.String("fr"),
//					pulumi.String("de"),
//					pulumi.String("es"),
//				},
//				TimeZone:                 pulumi.String("America/New_York"),
//				Description:              pulumi.String("Example description."),
//				AvatarUri:                pulumi.String("https://cloud.google.com/_static/images/cloud/icons/favicons/onecloud/super_cloud.png"),
//				EnableStackdriverLogging: pulumi.Bool(true),
//				EnableSpellCorrection:    pulumi.Bool(true),
//				SpeechToTextSettings: &diagflow.CxAgentSpeechToTextSettingsArgs{
//					EnableSpeechAdaptation: pulumi.Bool(true),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = diagflow.NewCxVersion(ctx, "version_1", &diagflow.CxVersionArgs{
//				Parent:      agent.StartFlow,
//				DisplayName: pulumi.String("1.0.0"),
//				Description: pulumi.String("version 1.0.0"),
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
// Version can be imported using any of these accepted formats:
//
// * `{{parent}}/versions/{{name}}`
//
// * `{{parent}}/{{name}}`
//
// When using the `pulumi import` command, Version can be imported using one of the formats above. For example:
//
// ```sh
// $ pulumi import gcp:diagflow/cxVersion:CxVersion default {{parent}}/versions/{{name}}
// ```
//
// ```sh
// $ pulumi import gcp:diagflow/cxVersion:CxVersion default {{parent}}/{{name}}
// ```
type CxVersion struct {
	pulumi.CustomResourceState

	// A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// The description of the version. The maximum length is 500 characters. If exceeded, the request is rejected.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The human-readable name of the version. Limit of 64 characters.
	DisplayName pulumi.StringOutput `pulumi:"displayName"`
	// Format: projects//locations//agents//flows//versions/. Version ID is a self-increasing number generated by Dialogflow upon version creation.
	Name pulumi.StringOutput `pulumi:"name"`
	// The NLU settings of the flow at version creation.
	// Structure is documented below.
	NluSettings CxVersionNluSettingArrayOutput `pulumi:"nluSettings"`
	// The Flow to create an Version for.
	// Format: projects/<Project ID>/locations/<Location ID>/agents/<Agent ID>/flows/<Flow ID>.
	Parent pulumi.StringPtrOutput `pulumi:"parent"`
	// The state of this version.
	// * RUNNING: Version is not ready to serve (e.g. training is running).
	// * SUCCEEDED: Training has succeeded and this version is ready to serve.
	// * FAILED: Version training failed.
	State pulumi.StringOutput `pulumi:"state"`
}

// NewCxVersion registers a new resource with the given unique name, arguments, and options.
func NewCxVersion(ctx *pulumi.Context,
	name string, args *CxVersionArgs, opts ...pulumi.ResourceOption) (*CxVersion, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DisplayName == nil {
		return nil, errors.New("invalid value for required argument 'DisplayName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource CxVersion
	err := ctx.RegisterResource("gcp:diagflow/cxVersion:CxVersion", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCxVersion gets an existing CxVersion resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCxVersion(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CxVersionState, opts ...pulumi.ResourceOption) (*CxVersion, error) {
	var resource CxVersion
	err := ctx.ReadResource("gcp:diagflow/cxVersion:CxVersion", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CxVersion resources.
type cxVersionState struct {
	// A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
	CreateTime *string `pulumi:"createTime"`
	// The description of the version. The maximum length is 500 characters. If exceeded, the request is rejected.
	Description *string `pulumi:"description"`
	// The human-readable name of the version. Limit of 64 characters.
	DisplayName *string `pulumi:"displayName"`
	// Format: projects//locations//agents//flows//versions/. Version ID is a self-increasing number generated by Dialogflow upon version creation.
	Name *string `pulumi:"name"`
	// The NLU settings of the flow at version creation.
	// Structure is documented below.
	NluSettings []CxVersionNluSetting `pulumi:"nluSettings"`
	// The Flow to create an Version for.
	// Format: projects/<Project ID>/locations/<Location ID>/agents/<Agent ID>/flows/<Flow ID>.
	Parent *string `pulumi:"parent"`
	// The state of this version.
	// * RUNNING: Version is not ready to serve (e.g. training is running).
	// * SUCCEEDED: Training has succeeded and this version is ready to serve.
	// * FAILED: Version training failed.
	State *string `pulumi:"state"`
}

type CxVersionState struct {
	// A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
	CreateTime pulumi.StringPtrInput
	// The description of the version. The maximum length is 500 characters. If exceeded, the request is rejected.
	Description pulumi.StringPtrInput
	// The human-readable name of the version. Limit of 64 characters.
	DisplayName pulumi.StringPtrInput
	// Format: projects//locations//agents//flows//versions/. Version ID is a self-increasing number generated by Dialogflow upon version creation.
	Name pulumi.StringPtrInput
	// The NLU settings of the flow at version creation.
	// Structure is documented below.
	NluSettings CxVersionNluSettingArrayInput
	// The Flow to create an Version for.
	// Format: projects/<Project ID>/locations/<Location ID>/agents/<Agent ID>/flows/<Flow ID>.
	Parent pulumi.StringPtrInput
	// The state of this version.
	// * RUNNING: Version is not ready to serve (e.g. training is running).
	// * SUCCEEDED: Training has succeeded and this version is ready to serve.
	// * FAILED: Version training failed.
	State pulumi.StringPtrInput
}

func (CxVersionState) ElementType() reflect.Type {
	return reflect.TypeOf((*cxVersionState)(nil)).Elem()
}

type cxVersionArgs struct {
	// The description of the version. The maximum length is 500 characters. If exceeded, the request is rejected.
	Description *string `pulumi:"description"`
	// The human-readable name of the version. Limit of 64 characters.
	DisplayName string `pulumi:"displayName"`
	// The Flow to create an Version for.
	// Format: projects/<Project ID>/locations/<Location ID>/agents/<Agent ID>/flows/<Flow ID>.
	Parent *string `pulumi:"parent"`
}

// The set of arguments for constructing a CxVersion resource.
type CxVersionArgs struct {
	// The description of the version. The maximum length is 500 characters. If exceeded, the request is rejected.
	Description pulumi.StringPtrInput
	// The human-readable name of the version. Limit of 64 characters.
	DisplayName pulumi.StringInput
	// The Flow to create an Version for.
	// Format: projects/<Project ID>/locations/<Location ID>/agents/<Agent ID>/flows/<Flow ID>.
	Parent pulumi.StringPtrInput
}

func (CxVersionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*cxVersionArgs)(nil)).Elem()
}

type CxVersionInput interface {
	pulumi.Input

	ToCxVersionOutput() CxVersionOutput
	ToCxVersionOutputWithContext(ctx context.Context) CxVersionOutput
}

func (*CxVersion) ElementType() reflect.Type {
	return reflect.TypeOf((**CxVersion)(nil)).Elem()
}

func (i *CxVersion) ToCxVersionOutput() CxVersionOutput {
	return i.ToCxVersionOutputWithContext(context.Background())
}

func (i *CxVersion) ToCxVersionOutputWithContext(ctx context.Context) CxVersionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CxVersionOutput)
}

// CxVersionArrayInput is an input type that accepts CxVersionArray and CxVersionArrayOutput values.
// You can construct a concrete instance of `CxVersionArrayInput` via:
//
//	CxVersionArray{ CxVersionArgs{...} }
type CxVersionArrayInput interface {
	pulumi.Input

	ToCxVersionArrayOutput() CxVersionArrayOutput
	ToCxVersionArrayOutputWithContext(context.Context) CxVersionArrayOutput
}

type CxVersionArray []CxVersionInput

func (CxVersionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CxVersion)(nil)).Elem()
}

func (i CxVersionArray) ToCxVersionArrayOutput() CxVersionArrayOutput {
	return i.ToCxVersionArrayOutputWithContext(context.Background())
}

func (i CxVersionArray) ToCxVersionArrayOutputWithContext(ctx context.Context) CxVersionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CxVersionArrayOutput)
}

// CxVersionMapInput is an input type that accepts CxVersionMap and CxVersionMapOutput values.
// You can construct a concrete instance of `CxVersionMapInput` via:
//
//	CxVersionMap{ "key": CxVersionArgs{...} }
type CxVersionMapInput interface {
	pulumi.Input

	ToCxVersionMapOutput() CxVersionMapOutput
	ToCxVersionMapOutputWithContext(context.Context) CxVersionMapOutput
}

type CxVersionMap map[string]CxVersionInput

func (CxVersionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CxVersion)(nil)).Elem()
}

func (i CxVersionMap) ToCxVersionMapOutput() CxVersionMapOutput {
	return i.ToCxVersionMapOutputWithContext(context.Background())
}

func (i CxVersionMap) ToCxVersionMapOutputWithContext(ctx context.Context) CxVersionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CxVersionMapOutput)
}

type CxVersionOutput struct{ *pulumi.OutputState }

func (CxVersionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CxVersion)(nil)).Elem()
}

func (o CxVersionOutput) ToCxVersionOutput() CxVersionOutput {
	return o
}

func (o CxVersionOutput) ToCxVersionOutputWithContext(ctx context.Context) CxVersionOutput {
	return o
}

// A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
func (o CxVersionOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *CxVersion) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// The description of the version. The maximum length is 500 characters. If exceeded, the request is rejected.
func (o CxVersionOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CxVersion) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The human-readable name of the version. Limit of 64 characters.
func (o CxVersionOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v *CxVersion) pulumi.StringOutput { return v.DisplayName }).(pulumi.StringOutput)
}

// Format: projects//locations//agents//flows//versions/. Version ID is a self-increasing number generated by Dialogflow upon version creation.
func (o CxVersionOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *CxVersion) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The NLU settings of the flow at version creation.
// Structure is documented below.
func (o CxVersionOutput) NluSettings() CxVersionNluSettingArrayOutput {
	return o.ApplyT(func(v *CxVersion) CxVersionNluSettingArrayOutput { return v.NluSettings }).(CxVersionNluSettingArrayOutput)
}

// The Flow to create an Version for.
// Format: projects/<Project ID>/locations/<Location ID>/agents/<Agent ID>/flows/<Flow ID>.
func (o CxVersionOutput) Parent() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CxVersion) pulumi.StringPtrOutput { return v.Parent }).(pulumi.StringPtrOutput)
}

// The state of this version.
// * RUNNING: Version is not ready to serve (e.g. training is running).
// * SUCCEEDED: Training has succeeded and this version is ready to serve.
// * FAILED: Version training failed.
func (o CxVersionOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v *CxVersion) pulumi.StringOutput { return v.State }).(pulumi.StringOutput)
}

type CxVersionArrayOutput struct{ *pulumi.OutputState }

func (CxVersionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CxVersion)(nil)).Elem()
}

func (o CxVersionArrayOutput) ToCxVersionArrayOutput() CxVersionArrayOutput {
	return o
}

func (o CxVersionArrayOutput) ToCxVersionArrayOutputWithContext(ctx context.Context) CxVersionArrayOutput {
	return o
}

func (o CxVersionArrayOutput) Index(i pulumi.IntInput) CxVersionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *CxVersion {
		return vs[0].([]*CxVersion)[vs[1].(int)]
	}).(CxVersionOutput)
}

type CxVersionMapOutput struct{ *pulumi.OutputState }

func (CxVersionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CxVersion)(nil)).Elem()
}

func (o CxVersionMapOutput) ToCxVersionMapOutput() CxVersionMapOutput {
	return o
}

func (o CxVersionMapOutput) ToCxVersionMapOutputWithContext(ctx context.Context) CxVersionMapOutput {
	return o
}

func (o CxVersionMapOutput) MapIndex(k pulumi.StringInput) CxVersionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *CxVersion {
		return vs[0].(map[string]*CxVersion)[vs[1].(string)]
	}).(CxVersionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CxVersionInput)(nil)).Elem(), &CxVersion{})
	pulumi.RegisterInputType(reflect.TypeOf((*CxVersionArrayInput)(nil)).Elem(), CxVersionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CxVersionMapInput)(nil)).Elem(), CxVersionMap{})
	pulumi.RegisterOutputType(CxVersionOutput{})
	pulumi.RegisterOutputType(CxVersionArrayOutput{})
	pulumi.RegisterOutputType(CxVersionMapOutput{})
}
