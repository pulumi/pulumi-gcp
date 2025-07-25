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

// You can use the built-in test feature to uncover bugs and prevent regressions. A test execution verifies that agent responses have not changed for end-user inputs defined in the test case.
//
// To get more information about TestCase, see:
//
// * [API documentation](https://cloud.google.com/dialogflow/cx/docs/reference/rest/v3/projects.locations.agents.testCases)
// * How-to Guides
//   - [Official Documentation](https://cloud.google.com/dialogflow/cx/docs)
//
// ## Example Usage
//
// ### Dialogflowcx Test Case Full
//
// ```go
// package main
//
// import (
//
//	"encoding/json"
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
//				AvatarUri:                pulumi.String("https://storage.cloud.google.com/dialogflow-test-host-image/cloud-logo.png"),
//				EnableStackdriverLogging: pulumi.Bool(true),
//				EnableSpellCorrection:    pulumi.Bool(true),
//				SpeechToTextSettings: &diagflow.CxAgentSpeechToTextSettingsArgs{
//					EnableSpeechAdaptation: pulumi.Bool(true),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			intent, err := diagflow.NewCxIntent(ctx, "intent", &diagflow.CxIntentArgs{
//				Parent:      agent.ID(),
//				DisplayName: pulumi.String("MyIntent"),
//				Priority:    pulumi.Int(1),
//				TrainingPhrases: diagflow.CxIntentTrainingPhraseArray{
//					&diagflow.CxIntentTrainingPhraseArgs{
//						Parts: diagflow.CxIntentTrainingPhrasePartArray{
//							&diagflow.CxIntentTrainingPhrasePartArgs{
//								Text: pulumi.String("training phrase"),
//							},
//						},
//						RepeatCount: pulumi.Int(1),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			page, err := diagflow.NewCxPage(ctx, "page", &diagflow.CxPageArgs{
//				Parent:      agent.StartFlow,
//				DisplayName: pulumi.String("MyPage"),
//				TransitionRoutes: diagflow.CxPageTransitionRouteArray{
//					&diagflow.CxPageTransitionRouteArgs{
//						Intent: intent.ID(),
//						TriggerFulfillment: &diagflow.CxPageTransitionRouteTriggerFulfillmentArgs{
//							Messages: diagflow.CxPageTransitionRouteTriggerFulfillmentMessageArray{
//								&diagflow.CxPageTransitionRouteTriggerFulfillmentMessageArgs{
//									Text: &diagflow.CxPageTransitionRouteTriggerFulfillmentMessageTextArgs{
//										Texts: pulumi.StringArray{
//											pulumi.String("Training phrase response"),
//										},
//									},
//								},
//							},
//						},
//					},
//				},
//				EventHandlers: diagflow.CxPageEventHandlerArray{
//					&diagflow.CxPageEventHandlerArgs{
//						Event: pulumi.String("some-event"),
//						TriggerFulfillment: &diagflow.CxPageEventHandlerTriggerFulfillmentArgs{
//							Messages: diagflow.CxPageEventHandlerTriggerFulfillmentMessageArray{
//								&diagflow.CxPageEventHandlerTriggerFulfillmentMessageArgs{
//									Text: &diagflow.CxPageEventHandlerTriggerFulfillmentMessageTextArgs{
//										Texts: pulumi.StringArray{
//											pulumi.String("Handling some event"),
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
//			tmpJSON0, err := json.Marshal(map[string]interface{}{
//				"some_param": "1",
//			})
//			if err != nil {
//				return err
//			}
//			json0 := string(tmpJSON0)
//			tmpJSON1, err := json.Marshal(map[string]interface{}{
//				"some_param": "1",
//			})
//			if err != nil {
//				return err
//			}
//			json1 := string(tmpJSON1)
//			_, err = diagflow.NewCxTestCase(ctx, "basic_test_case", &diagflow.CxTestCaseArgs{
//				Parent:      agent.ID(),
//				DisplayName: pulumi.String("MyTestCase"),
//				Tags: pulumi.StringArray{
//					pulumi.String("#tag1"),
//				},
//				Notes: pulumi.String("demonstrates a simple training phrase response"),
//				TestConfig: &diagflow.CxTestCaseTestConfigArgs{
//					TrackingParameters: pulumi.StringArray{
//						pulumi.String("some_param"),
//					},
//					Page: page.ID(),
//				},
//				TestCaseConversationTurns: diagflow.CxTestCaseTestCaseConversationTurnArray{
//					&diagflow.CxTestCaseTestCaseConversationTurnArgs{
//						UserInput: &diagflow.CxTestCaseTestCaseConversationTurnUserInputArgs{
//							Input: &diagflow.CxTestCaseTestCaseConversationTurnUserInputInputTypeArgs{
//								LanguageCode: pulumi.String("en"),
//								Text: &diagflow.CxTestCaseTestCaseConversationTurnUserInputInputTextArgs{
//									Text: pulumi.String("training phrase"),
//								},
//							},
//							InjectedParameters:      pulumi.String(json0),
//							IsWebhookEnabled:        pulumi.Bool(true),
//							EnableSentimentAnalysis: pulumi.Bool(true),
//						},
//						VirtualAgentOutput: diagflow.CxTestCaseTestCaseConversationTurnVirtualAgentOutputArgs{
//							SessionParameters: pulumi.String(json1),
//							TriggeredIntent: &diagflow.CxTestCaseTestCaseConversationTurnVirtualAgentOutputTriggeredIntentArgs{
//								Name: intent.ID(),
//							},
//							CurrentPage: &diagflow.CxTestCaseTestCaseConversationTurnVirtualAgentOutputCurrentPageArgs{
//								Name: page.ID(),
//							},
//							TextResponses: diagflow.CxTestCaseTestCaseConversationTurnVirtualAgentOutputTextResponseArray{
//								&diagflow.CxTestCaseTestCaseConversationTurnVirtualAgentOutputTextResponseArgs{
//									Texts: pulumi.StringArray{
//										pulumi.String("Training phrase response"),
//									},
//								},
//							},
//						},
//					},
//					&diagflow.CxTestCaseTestCaseConversationTurnArgs{
//						UserInput: &diagflow.CxTestCaseTestCaseConversationTurnUserInputArgs{
//							Input: &diagflow.CxTestCaseTestCaseConversationTurnUserInputInputTypeArgs{
//								Event: &diagflow.CxTestCaseTestCaseConversationTurnUserInputInputEventArgs{
//									Event: pulumi.String("some-event"),
//								},
//							},
//						},
//						VirtualAgentOutput: diagflow.CxTestCaseTestCaseConversationTurnVirtualAgentOutputArgs{
//							CurrentPage: &diagflow.CxTestCaseTestCaseConversationTurnVirtualAgentOutputCurrentPageArgs{
//								Name: page.ID(),
//							},
//							TextResponses: diagflow.CxTestCaseTestCaseConversationTurnVirtualAgentOutputTextResponseArray{
//								&diagflow.CxTestCaseTestCaseConversationTurnVirtualAgentOutputTextResponseArgs{
//									Texts: pulumi.StringArray{
//										pulumi.String("Handling some event"),
//									},
//								},
//							},
//						},
//					},
//					&diagflow.CxTestCaseTestCaseConversationTurnArgs{
//						UserInput: &diagflow.CxTestCaseTestCaseConversationTurnUserInputArgs{
//							Input: &diagflow.CxTestCaseTestCaseConversationTurnUserInputInputTypeArgs{
//								Dtmf: &diagflow.CxTestCaseTestCaseConversationTurnUserInputInputDtmfArgs{
//									Digits:      pulumi.String("12"),
//									FinishDigit: pulumi.String("3"),
//								},
//							},
//						},
//						VirtualAgentOutput: diagflow.CxTestCaseTestCaseConversationTurnVirtualAgentOutputArgs{
//							TextResponses: diagflow.CxTestCaseTestCaseConversationTurnVirtualAgentOutputTextResponseArray{
//								&diagflow.CxTestCaseTestCaseConversationTurnVirtualAgentOutputTextResponseArgs{
//									Texts: pulumi.StringArray{
//										pulumi.String("I didn't get that. Can you say it again?"),
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
//
// ## Import
//
// TestCase can be imported using any of these accepted formats:
//
// * `{{parent}}/testCases/{{name}}`
//
// When using the `pulumi import` command, TestCase can be imported using one of the formats above. For example:
//
// ```sh
// $ pulumi import gcp:diagflow/cxTestCase:CxTestCase default {{parent}}/testCases/{{name}}
// ```
type CxTestCase struct {
	pulumi.CustomResourceState

	// When the test was created. A timestamp in RFC3339 text format.
	CreationTime pulumi.StringOutput `pulumi:"creationTime"`
	// The human-readable name of the test case, unique within the agent. Limit of 200 characters.
	DisplayName pulumi.StringOutput `pulumi:"displayName"`
	// The latest test result.
	// Structure is documented below.
	LastTestResults CxTestCaseLastTestResultArrayOutput `pulumi:"lastTestResults"`
	// The unique identifier of the page.
	// Format: projects/<Project ID>/locations/<Location ID>/agents/<Agent ID>/flows/<Flow ID>/pages/<Page ID>.
	Name pulumi.StringOutput `pulumi:"name"`
	// Additional freeform notes about the test case. Limit of 400 characters.
	Notes pulumi.StringPtrOutput `pulumi:"notes"`
	// The agent to create the test case for.
	// Format: projects/<Project ID>/locations/<Location ID>/agents/<Agent ID>.
	Parent pulumi.StringPtrOutput `pulumi:"parent"`
	// Tags are short descriptions that users may apply to test cases for organizational and filtering purposes.
	// Each tag should start with "#" and has a limit of 30 characters
	Tags pulumi.StringArrayOutput `pulumi:"tags"`
	// The conversation turns uttered when the test case was created, in chronological order. These include the canonical set of agent utterances that should occur when the agent is working properly.
	// Structure is documented below.
	TestCaseConversationTurns CxTestCaseTestCaseConversationTurnArrayOutput `pulumi:"testCaseConversationTurns"`
	// Config for the test case.
	// Structure is documented below.
	TestConfig CxTestCaseTestConfigPtrOutput `pulumi:"testConfig"`
}

// NewCxTestCase registers a new resource with the given unique name, arguments, and options.
func NewCxTestCase(ctx *pulumi.Context,
	name string, args *CxTestCaseArgs, opts ...pulumi.ResourceOption) (*CxTestCase, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DisplayName == nil {
		return nil, errors.New("invalid value for required argument 'DisplayName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource CxTestCase
	err := ctx.RegisterResource("gcp:diagflow/cxTestCase:CxTestCase", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCxTestCase gets an existing CxTestCase resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCxTestCase(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CxTestCaseState, opts ...pulumi.ResourceOption) (*CxTestCase, error) {
	var resource CxTestCase
	err := ctx.ReadResource("gcp:diagflow/cxTestCase:CxTestCase", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CxTestCase resources.
type cxTestCaseState struct {
	// When the test was created. A timestamp in RFC3339 text format.
	CreationTime *string `pulumi:"creationTime"`
	// The human-readable name of the test case, unique within the agent. Limit of 200 characters.
	DisplayName *string `pulumi:"displayName"`
	// The latest test result.
	// Structure is documented below.
	LastTestResults []CxTestCaseLastTestResult `pulumi:"lastTestResults"`
	// The unique identifier of the page.
	// Format: projects/<Project ID>/locations/<Location ID>/agents/<Agent ID>/flows/<Flow ID>/pages/<Page ID>.
	Name *string `pulumi:"name"`
	// Additional freeform notes about the test case. Limit of 400 characters.
	Notes *string `pulumi:"notes"`
	// The agent to create the test case for.
	// Format: projects/<Project ID>/locations/<Location ID>/agents/<Agent ID>.
	Parent *string `pulumi:"parent"`
	// Tags are short descriptions that users may apply to test cases for organizational and filtering purposes.
	// Each tag should start with "#" and has a limit of 30 characters
	Tags []string `pulumi:"tags"`
	// The conversation turns uttered when the test case was created, in chronological order. These include the canonical set of agent utterances that should occur when the agent is working properly.
	// Structure is documented below.
	TestCaseConversationTurns []CxTestCaseTestCaseConversationTurn `pulumi:"testCaseConversationTurns"`
	// Config for the test case.
	// Structure is documented below.
	TestConfig *CxTestCaseTestConfig `pulumi:"testConfig"`
}

type CxTestCaseState struct {
	// When the test was created. A timestamp in RFC3339 text format.
	CreationTime pulumi.StringPtrInput
	// The human-readable name of the test case, unique within the agent. Limit of 200 characters.
	DisplayName pulumi.StringPtrInput
	// The latest test result.
	// Structure is documented below.
	LastTestResults CxTestCaseLastTestResultArrayInput
	// The unique identifier of the page.
	// Format: projects/<Project ID>/locations/<Location ID>/agents/<Agent ID>/flows/<Flow ID>/pages/<Page ID>.
	Name pulumi.StringPtrInput
	// Additional freeform notes about the test case. Limit of 400 characters.
	Notes pulumi.StringPtrInput
	// The agent to create the test case for.
	// Format: projects/<Project ID>/locations/<Location ID>/agents/<Agent ID>.
	Parent pulumi.StringPtrInput
	// Tags are short descriptions that users may apply to test cases for organizational and filtering purposes.
	// Each tag should start with "#" and has a limit of 30 characters
	Tags pulumi.StringArrayInput
	// The conversation turns uttered when the test case was created, in chronological order. These include the canonical set of agent utterances that should occur when the agent is working properly.
	// Structure is documented below.
	TestCaseConversationTurns CxTestCaseTestCaseConversationTurnArrayInput
	// Config for the test case.
	// Structure is documented below.
	TestConfig CxTestCaseTestConfigPtrInput
}

func (CxTestCaseState) ElementType() reflect.Type {
	return reflect.TypeOf((*cxTestCaseState)(nil)).Elem()
}

type cxTestCaseArgs struct {
	// The human-readable name of the test case, unique within the agent. Limit of 200 characters.
	DisplayName string `pulumi:"displayName"`
	// Additional freeform notes about the test case. Limit of 400 characters.
	Notes *string `pulumi:"notes"`
	// The agent to create the test case for.
	// Format: projects/<Project ID>/locations/<Location ID>/agents/<Agent ID>.
	Parent *string `pulumi:"parent"`
	// Tags are short descriptions that users may apply to test cases for organizational and filtering purposes.
	// Each tag should start with "#" and has a limit of 30 characters
	Tags []string `pulumi:"tags"`
	// The conversation turns uttered when the test case was created, in chronological order. These include the canonical set of agent utterances that should occur when the agent is working properly.
	// Structure is documented below.
	TestCaseConversationTurns []CxTestCaseTestCaseConversationTurn `pulumi:"testCaseConversationTurns"`
	// Config for the test case.
	// Structure is documented below.
	TestConfig *CxTestCaseTestConfig `pulumi:"testConfig"`
}

// The set of arguments for constructing a CxTestCase resource.
type CxTestCaseArgs struct {
	// The human-readable name of the test case, unique within the agent. Limit of 200 characters.
	DisplayName pulumi.StringInput
	// Additional freeform notes about the test case. Limit of 400 characters.
	Notes pulumi.StringPtrInput
	// The agent to create the test case for.
	// Format: projects/<Project ID>/locations/<Location ID>/agents/<Agent ID>.
	Parent pulumi.StringPtrInput
	// Tags are short descriptions that users may apply to test cases for organizational and filtering purposes.
	// Each tag should start with "#" and has a limit of 30 characters
	Tags pulumi.StringArrayInput
	// The conversation turns uttered when the test case was created, in chronological order. These include the canonical set of agent utterances that should occur when the agent is working properly.
	// Structure is documented below.
	TestCaseConversationTurns CxTestCaseTestCaseConversationTurnArrayInput
	// Config for the test case.
	// Structure is documented below.
	TestConfig CxTestCaseTestConfigPtrInput
}

func (CxTestCaseArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*cxTestCaseArgs)(nil)).Elem()
}

type CxTestCaseInput interface {
	pulumi.Input

	ToCxTestCaseOutput() CxTestCaseOutput
	ToCxTestCaseOutputWithContext(ctx context.Context) CxTestCaseOutput
}

func (*CxTestCase) ElementType() reflect.Type {
	return reflect.TypeOf((**CxTestCase)(nil)).Elem()
}

func (i *CxTestCase) ToCxTestCaseOutput() CxTestCaseOutput {
	return i.ToCxTestCaseOutputWithContext(context.Background())
}

func (i *CxTestCase) ToCxTestCaseOutputWithContext(ctx context.Context) CxTestCaseOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CxTestCaseOutput)
}

// CxTestCaseArrayInput is an input type that accepts CxTestCaseArray and CxTestCaseArrayOutput values.
// You can construct a concrete instance of `CxTestCaseArrayInput` via:
//
//	CxTestCaseArray{ CxTestCaseArgs{...} }
type CxTestCaseArrayInput interface {
	pulumi.Input

	ToCxTestCaseArrayOutput() CxTestCaseArrayOutput
	ToCxTestCaseArrayOutputWithContext(context.Context) CxTestCaseArrayOutput
}

type CxTestCaseArray []CxTestCaseInput

func (CxTestCaseArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CxTestCase)(nil)).Elem()
}

func (i CxTestCaseArray) ToCxTestCaseArrayOutput() CxTestCaseArrayOutput {
	return i.ToCxTestCaseArrayOutputWithContext(context.Background())
}

func (i CxTestCaseArray) ToCxTestCaseArrayOutputWithContext(ctx context.Context) CxTestCaseArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CxTestCaseArrayOutput)
}

// CxTestCaseMapInput is an input type that accepts CxTestCaseMap and CxTestCaseMapOutput values.
// You can construct a concrete instance of `CxTestCaseMapInput` via:
//
//	CxTestCaseMap{ "key": CxTestCaseArgs{...} }
type CxTestCaseMapInput interface {
	pulumi.Input

	ToCxTestCaseMapOutput() CxTestCaseMapOutput
	ToCxTestCaseMapOutputWithContext(context.Context) CxTestCaseMapOutput
}

type CxTestCaseMap map[string]CxTestCaseInput

func (CxTestCaseMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CxTestCase)(nil)).Elem()
}

func (i CxTestCaseMap) ToCxTestCaseMapOutput() CxTestCaseMapOutput {
	return i.ToCxTestCaseMapOutputWithContext(context.Background())
}

func (i CxTestCaseMap) ToCxTestCaseMapOutputWithContext(ctx context.Context) CxTestCaseMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CxTestCaseMapOutput)
}

type CxTestCaseOutput struct{ *pulumi.OutputState }

func (CxTestCaseOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CxTestCase)(nil)).Elem()
}

func (o CxTestCaseOutput) ToCxTestCaseOutput() CxTestCaseOutput {
	return o
}

func (o CxTestCaseOutput) ToCxTestCaseOutputWithContext(ctx context.Context) CxTestCaseOutput {
	return o
}

// When the test was created. A timestamp in RFC3339 text format.
func (o CxTestCaseOutput) CreationTime() pulumi.StringOutput {
	return o.ApplyT(func(v *CxTestCase) pulumi.StringOutput { return v.CreationTime }).(pulumi.StringOutput)
}

// The human-readable name of the test case, unique within the agent. Limit of 200 characters.
func (o CxTestCaseOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v *CxTestCase) pulumi.StringOutput { return v.DisplayName }).(pulumi.StringOutput)
}

// The latest test result.
// Structure is documented below.
func (o CxTestCaseOutput) LastTestResults() CxTestCaseLastTestResultArrayOutput {
	return o.ApplyT(func(v *CxTestCase) CxTestCaseLastTestResultArrayOutput { return v.LastTestResults }).(CxTestCaseLastTestResultArrayOutput)
}

// The unique identifier of the page.
// Format: projects/<Project ID>/locations/<Location ID>/agents/<Agent ID>/flows/<Flow ID>/pages/<Page ID>.
func (o CxTestCaseOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *CxTestCase) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Additional freeform notes about the test case. Limit of 400 characters.
func (o CxTestCaseOutput) Notes() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CxTestCase) pulumi.StringPtrOutput { return v.Notes }).(pulumi.StringPtrOutput)
}

// The agent to create the test case for.
// Format: projects/<Project ID>/locations/<Location ID>/agents/<Agent ID>.
func (o CxTestCaseOutput) Parent() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CxTestCase) pulumi.StringPtrOutput { return v.Parent }).(pulumi.StringPtrOutput)
}

// Tags are short descriptions that users may apply to test cases for organizational and filtering purposes.
// Each tag should start with "#" and has a limit of 30 characters
func (o CxTestCaseOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *CxTestCase) pulumi.StringArrayOutput { return v.Tags }).(pulumi.StringArrayOutput)
}

// The conversation turns uttered when the test case was created, in chronological order. These include the canonical set of agent utterances that should occur when the agent is working properly.
// Structure is documented below.
func (o CxTestCaseOutput) TestCaseConversationTurns() CxTestCaseTestCaseConversationTurnArrayOutput {
	return o.ApplyT(func(v *CxTestCase) CxTestCaseTestCaseConversationTurnArrayOutput { return v.TestCaseConversationTurns }).(CxTestCaseTestCaseConversationTurnArrayOutput)
}

// Config for the test case.
// Structure is documented below.
func (o CxTestCaseOutput) TestConfig() CxTestCaseTestConfigPtrOutput {
	return o.ApplyT(func(v *CxTestCase) CxTestCaseTestConfigPtrOutput { return v.TestConfig }).(CxTestCaseTestConfigPtrOutput)
}

type CxTestCaseArrayOutput struct{ *pulumi.OutputState }

func (CxTestCaseArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CxTestCase)(nil)).Elem()
}

func (o CxTestCaseArrayOutput) ToCxTestCaseArrayOutput() CxTestCaseArrayOutput {
	return o
}

func (o CxTestCaseArrayOutput) ToCxTestCaseArrayOutputWithContext(ctx context.Context) CxTestCaseArrayOutput {
	return o
}

func (o CxTestCaseArrayOutput) Index(i pulumi.IntInput) CxTestCaseOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *CxTestCase {
		return vs[0].([]*CxTestCase)[vs[1].(int)]
	}).(CxTestCaseOutput)
}

type CxTestCaseMapOutput struct{ *pulumi.OutputState }

func (CxTestCaseMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CxTestCase)(nil)).Elem()
}

func (o CxTestCaseMapOutput) ToCxTestCaseMapOutput() CxTestCaseMapOutput {
	return o
}

func (o CxTestCaseMapOutput) ToCxTestCaseMapOutputWithContext(ctx context.Context) CxTestCaseMapOutput {
	return o
}

func (o CxTestCaseMapOutput) MapIndex(k pulumi.StringInput) CxTestCaseOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *CxTestCase {
		return vs[0].(map[string]*CxTestCase)[vs[1].(string)]
	}).(CxTestCaseOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CxTestCaseInput)(nil)).Elem(), &CxTestCase{})
	pulumi.RegisterInputType(reflect.TypeOf((*CxTestCaseArrayInput)(nil)).Elem(), CxTestCaseArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CxTestCaseMapInput)(nil)).Elem(), CxTestCaseMap{})
	pulumi.RegisterOutputType(CxTestCaseOutput{})
	pulumi.RegisterOutputType(CxTestCaseArrayOutput{})
	pulumi.RegisterOutputType(CxTestCaseMapOutput{})
}
