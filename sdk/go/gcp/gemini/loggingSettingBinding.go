// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package gemini

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// The resource for managing Logging setting bindings for Admin Control.
//
// To get more information about LoggingSettingBinding, see:
// * How-to Guides
//   - [Gemini Cloud Assist overview](https://cloud.google.com/gemini/docs/cloud-assist/overview)
//
// ## Example Usage
//
// ### Gemini Logging Setting Binding Basic
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/gemini"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			basic, err := gemini.NewLoggingSetting(ctx, "basic", &gemini.LoggingSettingArgs{
//				LoggingSettingId: pulumi.String("ls-tf1"),
//				Location:         pulumi.String("global"),
//				Labels: pulumi.StringMap{
//					"my_key": pulumi.String("my_value"),
//				},
//				LogPromptsAndResponses: pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = gemini.NewLoggingSettingBinding(ctx, "example", &gemini.LoggingSettingBindingArgs{
//				LoggingSettingId: basic.LoggingSettingId,
//				SettingBindingId: pulumi.String("ls-tf1b1"),
//				Location:         pulumi.String("global"),
//				Target:           pulumi.String("projects/980109375338"),
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
// LoggingSettingBinding can be imported using any of these accepted formats:
//
// * `projects/{{project}}/locations/{{location}}/loggingSettings/{{logging_setting_id}}/settingBindings/{{setting_binding_id}}`
//
// * `{{project}}/{{location}}/{{logging_setting_id}}/{{setting_binding_id}}`
//
// * `{{location}}/{{logging_setting_id}}/{{setting_binding_id}}`
//
// When using the `pulumi import` command, LoggingSettingBinding can be imported using one of the formats above. For example:
//
// ```sh
// $ pulumi import gcp:gemini/loggingSettingBinding:LoggingSettingBinding default projects/{{project}}/locations/{{location}}/loggingSettings/{{logging_setting_id}}/settingBindings/{{setting_binding_id}}
// ```
//
// ```sh
// $ pulumi import gcp:gemini/loggingSettingBinding:LoggingSettingBinding default {{project}}/{{location}}/{{logging_setting_id}}/{{setting_binding_id}}
// ```
//
// ```sh
// $ pulumi import gcp:gemini/loggingSettingBinding:LoggingSettingBinding default {{location}}/{{logging_setting_id}}/{{setting_binding_id}}
// ```
type LoggingSettingBinding struct {
	pulumi.CustomResourceState

	// Create time stamp.
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
	EffectiveLabels pulumi.StringMapOutput `pulumi:"effectiveLabels"`
	// Labels as key value pairs.
	// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
	// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
	Labels pulumi.StringMapOutput `pulumi:"labels"`
	// Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122.
	Location pulumi.StringPtrOutput `pulumi:"location"`
	// Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122.
	LoggingSettingId pulumi.StringOutput `pulumi:"loggingSettingId"`
	// Identifier. Name of the resource.
	// Format:projects/{project}/locations/{location}/loggingSettings/{setting}/settingBindings/{setting_binding}
	Name pulumi.StringOutput `pulumi:"name"`
	// Product type of the setting binding.
	// Possible values are: `GEMINI_CODE_ASSIST`.
	Product pulumi.StringOutput `pulumi:"product"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringOutput `pulumi:"project"`
	// The combination of labels configured directly on the resource
	// and default labels configured on the provider.
	PulumiLabels pulumi.StringMapOutput `pulumi:"pulumiLabels"`
	// Id of the setting binding.
	SettingBindingId pulumi.StringOutput `pulumi:"settingBindingId"`
	// Target of the binding.
	Target pulumi.StringOutput `pulumi:"target"`
	// Update time stamp.
	UpdateTime pulumi.StringOutput `pulumi:"updateTime"`
}

// NewLoggingSettingBinding registers a new resource with the given unique name, arguments, and options.
func NewLoggingSettingBinding(ctx *pulumi.Context,
	name string, args *LoggingSettingBindingArgs, opts ...pulumi.ResourceOption) (*LoggingSettingBinding, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.LoggingSettingId == nil {
		return nil, errors.New("invalid value for required argument 'LoggingSettingId'")
	}
	if args.SettingBindingId == nil {
		return nil, errors.New("invalid value for required argument 'SettingBindingId'")
	}
	if args.Target == nil {
		return nil, errors.New("invalid value for required argument 'Target'")
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"effectiveLabels",
		"pulumiLabels",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource LoggingSettingBinding
	err := ctx.RegisterResource("gcp:gemini/loggingSettingBinding:LoggingSettingBinding", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLoggingSettingBinding gets an existing LoggingSettingBinding resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLoggingSettingBinding(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LoggingSettingBindingState, opts ...pulumi.ResourceOption) (*LoggingSettingBinding, error) {
	var resource LoggingSettingBinding
	err := ctx.ReadResource("gcp:gemini/loggingSettingBinding:LoggingSettingBinding", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering LoggingSettingBinding resources.
type loggingSettingBindingState struct {
	// Create time stamp.
	CreateTime *string `pulumi:"createTime"`
	// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
	EffectiveLabels map[string]string `pulumi:"effectiveLabels"`
	// Labels as key value pairs.
	// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
	// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
	Labels map[string]string `pulumi:"labels"`
	// Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122.
	Location *string `pulumi:"location"`
	// Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122.
	LoggingSettingId *string `pulumi:"loggingSettingId"`
	// Identifier. Name of the resource.
	// Format:projects/{project}/locations/{location}/loggingSettings/{setting}/settingBindings/{setting_binding}
	Name *string `pulumi:"name"`
	// Product type of the setting binding.
	// Possible values are: `GEMINI_CODE_ASSIST`.
	Product *string `pulumi:"product"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
	// The combination of labels configured directly on the resource
	// and default labels configured on the provider.
	PulumiLabels map[string]string `pulumi:"pulumiLabels"`
	// Id of the setting binding.
	SettingBindingId *string `pulumi:"settingBindingId"`
	// Target of the binding.
	Target *string `pulumi:"target"`
	// Update time stamp.
	UpdateTime *string `pulumi:"updateTime"`
}

type LoggingSettingBindingState struct {
	// Create time stamp.
	CreateTime pulumi.StringPtrInput
	// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
	EffectiveLabels pulumi.StringMapInput
	// Labels as key value pairs.
	// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
	// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
	Labels pulumi.StringMapInput
	// Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122.
	Location pulumi.StringPtrInput
	// Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122.
	LoggingSettingId pulumi.StringPtrInput
	// Identifier. Name of the resource.
	// Format:projects/{project}/locations/{location}/loggingSettings/{setting}/settingBindings/{setting_binding}
	Name pulumi.StringPtrInput
	// Product type of the setting binding.
	// Possible values are: `GEMINI_CODE_ASSIST`.
	Product pulumi.StringPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
	// The combination of labels configured directly on the resource
	// and default labels configured on the provider.
	PulumiLabels pulumi.StringMapInput
	// Id of the setting binding.
	SettingBindingId pulumi.StringPtrInput
	// Target of the binding.
	Target pulumi.StringPtrInput
	// Update time stamp.
	UpdateTime pulumi.StringPtrInput
}

func (LoggingSettingBindingState) ElementType() reflect.Type {
	return reflect.TypeOf((*loggingSettingBindingState)(nil)).Elem()
}

type loggingSettingBindingArgs struct {
	// Labels as key value pairs.
	// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
	// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
	Labels map[string]string `pulumi:"labels"`
	// Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122.
	Location *string `pulumi:"location"`
	// Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122.
	LoggingSettingId string `pulumi:"loggingSettingId"`
	// Product type of the setting binding.
	// Possible values are: `GEMINI_CODE_ASSIST`.
	Product *string `pulumi:"product"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
	// Id of the setting binding.
	SettingBindingId string `pulumi:"settingBindingId"`
	// Target of the binding.
	Target string `pulumi:"target"`
}

// The set of arguments for constructing a LoggingSettingBinding resource.
type LoggingSettingBindingArgs struct {
	// Labels as key value pairs.
	// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
	// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
	Labels pulumi.StringMapInput
	// Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122.
	Location pulumi.StringPtrInput
	// Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122.
	LoggingSettingId pulumi.StringInput
	// Product type of the setting binding.
	// Possible values are: `GEMINI_CODE_ASSIST`.
	Product pulumi.StringPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
	// Id of the setting binding.
	SettingBindingId pulumi.StringInput
	// Target of the binding.
	Target pulumi.StringInput
}

func (LoggingSettingBindingArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*loggingSettingBindingArgs)(nil)).Elem()
}

type LoggingSettingBindingInput interface {
	pulumi.Input

	ToLoggingSettingBindingOutput() LoggingSettingBindingOutput
	ToLoggingSettingBindingOutputWithContext(ctx context.Context) LoggingSettingBindingOutput
}

func (*LoggingSettingBinding) ElementType() reflect.Type {
	return reflect.TypeOf((**LoggingSettingBinding)(nil)).Elem()
}

func (i *LoggingSettingBinding) ToLoggingSettingBindingOutput() LoggingSettingBindingOutput {
	return i.ToLoggingSettingBindingOutputWithContext(context.Background())
}

func (i *LoggingSettingBinding) ToLoggingSettingBindingOutputWithContext(ctx context.Context) LoggingSettingBindingOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LoggingSettingBindingOutput)
}

// LoggingSettingBindingArrayInput is an input type that accepts LoggingSettingBindingArray and LoggingSettingBindingArrayOutput values.
// You can construct a concrete instance of `LoggingSettingBindingArrayInput` via:
//
//	LoggingSettingBindingArray{ LoggingSettingBindingArgs{...} }
type LoggingSettingBindingArrayInput interface {
	pulumi.Input

	ToLoggingSettingBindingArrayOutput() LoggingSettingBindingArrayOutput
	ToLoggingSettingBindingArrayOutputWithContext(context.Context) LoggingSettingBindingArrayOutput
}

type LoggingSettingBindingArray []LoggingSettingBindingInput

func (LoggingSettingBindingArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LoggingSettingBinding)(nil)).Elem()
}

func (i LoggingSettingBindingArray) ToLoggingSettingBindingArrayOutput() LoggingSettingBindingArrayOutput {
	return i.ToLoggingSettingBindingArrayOutputWithContext(context.Background())
}

func (i LoggingSettingBindingArray) ToLoggingSettingBindingArrayOutputWithContext(ctx context.Context) LoggingSettingBindingArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LoggingSettingBindingArrayOutput)
}

// LoggingSettingBindingMapInput is an input type that accepts LoggingSettingBindingMap and LoggingSettingBindingMapOutput values.
// You can construct a concrete instance of `LoggingSettingBindingMapInput` via:
//
//	LoggingSettingBindingMap{ "key": LoggingSettingBindingArgs{...} }
type LoggingSettingBindingMapInput interface {
	pulumi.Input

	ToLoggingSettingBindingMapOutput() LoggingSettingBindingMapOutput
	ToLoggingSettingBindingMapOutputWithContext(context.Context) LoggingSettingBindingMapOutput
}

type LoggingSettingBindingMap map[string]LoggingSettingBindingInput

func (LoggingSettingBindingMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LoggingSettingBinding)(nil)).Elem()
}

func (i LoggingSettingBindingMap) ToLoggingSettingBindingMapOutput() LoggingSettingBindingMapOutput {
	return i.ToLoggingSettingBindingMapOutputWithContext(context.Background())
}

func (i LoggingSettingBindingMap) ToLoggingSettingBindingMapOutputWithContext(ctx context.Context) LoggingSettingBindingMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LoggingSettingBindingMapOutput)
}

type LoggingSettingBindingOutput struct{ *pulumi.OutputState }

func (LoggingSettingBindingOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**LoggingSettingBinding)(nil)).Elem()
}

func (o LoggingSettingBindingOutput) ToLoggingSettingBindingOutput() LoggingSettingBindingOutput {
	return o
}

func (o LoggingSettingBindingOutput) ToLoggingSettingBindingOutputWithContext(ctx context.Context) LoggingSettingBindingOutput {
	return o
}

// Create time stamp.
func (o LoggingSettingBindingOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *LoggingSettingBinding) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
func (o LoggingSettingBindingOutput) EffectiveLabels() pulumi.StringMapOutput {
	return o.ApplyT(func(v *LoggingSettingBinding) pulumi.StringMapOutput { return v.EffectiveLabels }).(pulumi.StringMapOutput)
}

// Labels as key value pairs.
// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
func (o LoggingSettingBindingOutput) Labels() pulumi.StringMapOutput {
	return o.ApplyT(func(v *LoggingSettingBinding) pulumi.StringMapOutput { return v.Labels }).(pulumi.StringMapOutput)
}

// Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122.
func (o LoggingSettingBindingOutput) Location() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *LoggingSettingBinding) pulumi.StringPtrOutput { return v.Location }).(pulumi.StringPtrOutput)
}

// Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122.
func (o LoggingSettingBindingOutput) LoggingSettingId() pulumi.StringOutput {
	return o.ApplyT(func(v *LoggingSettingBinding) pulumi.StringOutput { return v.LoggingSettingId }).(pulumi.StringOutput)
}

// Identifier. Name of the resource.
// Format:projects/{project}/locations/{location}/loggingSettings/{setting}/settingBindings/{setting_binding}
func (o LoggingSettingBindingOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *LoggingSettingBinding) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Product type of the setting binding.
// Possible values are: `GEMINI_CODE_ASSIST`.
func (o LoggingSettingBindingOutput) Product() pulumi.StringOutput {
	return o.ApplyT(func(v *LoggingSettingBinding) pulumi.StringOutput { return v.Product }).(pulumi.StringOutput)
}

// The ID of the project in which the resource belongs.
// If it is not provided, the provider project is used.
func (o LoggingSettingBindingOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *LoggingSettingBinding) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// The combination of labels configured directly on the resource
// and default labels configured on the provider.
func (o LoggingSettingBindingOutput) PulumiLabels() pulumi.StringMapOutput {
	return o.ApplyT(func(v *LoggingSettingBinding) pulumi.StringMapOutput { return v.PulumiLabels }).(pulumi.StringMapOutput)
}

// Id of the setting binding.
func (o LoggingSettingBindingOutput) SettingBindingId() pulumi.StringOutput {
	return o.ApplyT(func(v *LoggingSettingBinding) pulumi.StringOutput { return v.SettingBindingId }).(pulumi.StringOutput)
}

// Target of the binding.
func (o LoggingSettingBindingOutput) Target() pulumi.StringOutput {
	return o.ApplyT(func(v *LoggingSettingBinding) pulumi.StringOutput { return v.Target }).(pulumi.StringOutput)
}

// Update time stamp.
func (o LoggingSettingBindingOutput) UpdateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *LoggingSettingBinding) pulumi.StringOutput { return v.UpdateTime }).(pulumi.StringOutput)
}

type LoggingSettingBindingArrayOutput struct{ *pulumi.OutputState }

func (LoggingSettingBindingArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LoggingSettingBinding)(nil)).Elem()
}

func (o LoggingSettingBindingArrayOutput) ToLoggingSettingBindingArrayOutput() LoggingSettingBindingArrayOutput {
	return o
}

func (o LoggingSettingBindingArrayOutput) ToLoggingSettingBindingArrayOutputWithContext(ctx context.Context) LoggingSettingBindingArrayOutput {
	return o
}

func (o LoggingSettingBindingArrayOutput) Index(i pulumi.IntInput) LoggingSettingBindingOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *LoggingSettingBinding {
		return vs[0].([]*LoggingSettingBinding)[vs[1].(int)]
	}).(LoggingSettingBindingOutput)
}

type LoggingSettingBindingMapOutput struct{ *pulumi.OutputState }

func (LoggingSettingBindingMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LoggingSettingBinding)(nil)).Elem()
}

func (o LoggingSettingBindingMapOutput) ToLoggingSettingBindingMapOutput() LoggingSettingBindingMapOutput {
	return o
}

func (o LoggingSettingBindingMapOutput) ToLoggingSettingBindingMapOutputWithContext(ctx context.Context) LoggingSettingBindingMapOutput {
	return o
}

func (o LoggingSettingBindingMapOutput) MapIndex(k pulumi.StringInput) LoggingSettingBindingOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *LoggingSettingBinding {
		return vs[0].(map[string]*LoggingSettingBinding)[vs[1].(string)]
	}).(LoggingSettingBindingOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*LoggingSettingBindingInput)(nil)).Elem(), &LoggingSettingBinding{})
	pulumi.RegisterInputType(reflect.TypeOf((*LoggingSettingBindingArrayInput)(nil)).Elem(), LoggingSettingBindingArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*LoggingSettingBindingMapInput)(nil)).Elem(), LoggingSettingBindingMap{})
	pulumi.RegisterOutputType(LoggingSettingBindingOutput{})
	pulumi.RegisterOutputType(LoggingSettingBindingArrayOutput{})
	pulumi.RegisterOutputType(LoggingSettingBindingMapOutput{})
}
