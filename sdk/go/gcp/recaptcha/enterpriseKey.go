// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package recaptcha

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// The RecaptchaEnterprise Key resource
//
// ## Example Usage
// ### Android_key
// A basic test of recaptcha enterprise key that can be used by Android apps
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/recaptcha"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := recaptcha.NewEnterpriseKey(ctx, "primary", &recaptcha.EnterpriseKeyArgs{
// 			AndroidSettings: &recaptcha.EnterpriseKeyAndroidSettingsArgs{
// 				AllowAllPackageNames: pulumi.Bool(true),
// 				AllowedPackageNames:  pulumi.StringArray{},
// 			},
// 			DisplayName: pulumi.String("display-name-one"),
// 			Labels: pulumi.StringMap{
// 				"label-one": pulumi.String("value-one"),
// 			},
// 			Project: pulumi.String("my-project-name"),
// 			TestingOptions: &recaptcha.EnterpriseKeyTestingOptionsArgs{
// 				TestingScore: pulumi.Float64(0.8),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
// ### Ios_key
// A basic test of recaptcha enterprise key that can be used by iOS apps
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/recaptcha"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := recaptcha.NewEnterpriseKey(ctx, "primary", &recaptcha.EnterpriseKeyArgs{
// 			DisplayName: pulumi.String("display-name-one"),
// 			IosSettings: &recaptcha.EnterpriseKeyIosSettingsArgs{
// 				AllowAllBundleIds: pulumi.Bool(true),
// 				AllowedBundleIds:  pulumi.StringArray{},
// 			},
// 			Labels: pulumi.StringMap{
// 				"label-one": pulumi.String("value-one"),
// 			},
// 			Project: pulumi.String("my-project-name"),
// 			TestingOptions: &recaptcha.EnterpriseKeyTestingOptionsArgs{
// 				TestingScore: pulumi.Float64(1),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
// ### Minimal_key
// A minimal test of recaptcha enterprise key
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/recaptcha"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := recaptcha.NewEnterpriseKey(ctx, "primary", &recaptcha.EnterpriseKeyArgs{
// 			DisplayName: pulumi.String("display-name-one"),
// 			Labels:      nil,
// 			Project:     pulumi.String("my-project-name"),
// 			WebSettings: &recaptcha.EnterpriseKeyWebSettingsArgs{
// 				AllowAllDomains: pulumi.Bool(true),
// 				IntegrationType: pulumi.String("SCORE"),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
// ### Web_key
// A basic test of recaptcha enterprise key that can be used by websites
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/recaptcha"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := recaptcha.NewEnterpriseKey(ctx, "primary", &recaptcha.EnterpriseKeyArgs{
// 			DisplayName: pulumi.String("display-name-one"),
// 			Labels: pulumi.StringMap{
// 				"label-one": pulumi.String("value-one"),
// 			},
// 			Project: pulumi.String("my-project-name"),
// 			TestingOptions: &recaptcha.EnterpriseKeyTestingOptionsArgs{
// 				TestingChallenge: pulumi.String("NOCAPTCHA"),
// 				TestingScore:     pulumi.Float64(0.5),
// 			},
// 			WebSettings: &recaptcha.EnterpriseKeyWebSettingsArgs{
// 				AllowAllDomains:             pulumi.Bool(true),
// 				AllowedDomains:              pulumi.StringArray{},
// 				ChallengeSecurityPreference: pulumi.String("USABILITY"),
// 				IntegrationType:             pulumi.String("CHECKBOX"),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
// ### Web_score_key
// A basic test of recaptcha enterprise key with score integration type that can be used by websites
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/recaptcha"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := recaptcha.NewEnterpriseKey(ctx, "primary", &recaptcha.EnterpriseKeyArgs{
// 			DisplayName: pulumi.String("display-name-one"),
// 			Labels: pulumi.StringMap{
// 				"label-one": pulumi.String("value-one"),
// 			},
// 			Project: pulumi.String("my-project-name"),
// 			TestingOptions: &recaptcha.EnterpriseKeyTestingOptionsArgs{
// 				TestingScore: pulumi.Float64(0.5),
// 			},
// 			WebSettings: &recaptcha.EnterpriseKeyWebSettingsArgs{
// 				AllowAllDomains: pulumi.Bool(true),
// 				AllowAmpTraffic: pulumi.Bool(false),
// 				AllowedDomains:  pulumi.StringArray{},
// 				IntegrationType: pulumi.String("SCORE"),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// Key can be imported using any of these accepted formats
//
// ```sh
//  $ pulumi import gcp:recaptcha/enterpriseKey:EnterpriseKey default projects/{{project}}/keys/{{name}}
// ```
//
// ```sh
//  $ pulumi import gcp:recaptcha/enterpriseKey:EnterpriseKey default {{project}}/{{name}}
// ```
//
// ```sh
//  $ pulumi import gcp:recaptcha/enterpriseKey:EnterpriseKey default {{name}}
// ```
type EnterpriseKey struct {
	pulumi.CustomResourceState

	// Settings for keys that can be used by Android apps.
	AndroidSettings EnterpriseKeyAndroidSettingsPtrOutput `pulumi:"androidSettings"`
	// The timestamp corresponding to the creation of this Key.
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// Human-readable display name of this key. Modifiable by user.
	DisplayName pulumi.StringOutput `pulumi:"displayName"`
	// Settings for keys that can be used by iOS apps.
	IosSettings EnterpriseKeyIosSettingsPtrOutput `pulumi:"iosSettings"`
	// See [Creating and managing labels](https://cloud.google.com/recaptcha-enterprise/docs/labels).
	Labels pulumi.StringMapOutput `pulumi:"labels"`
	// The resource name for the Key in the format "projects/{project}/keys/{key}".
	Name pulumi.StringOutput `pulumi:"name"`
	// The project for the resource
	Project pulumi.StringOutput `pulumi:"project"`
	// Options for user acceptance testing.
	TestingOptions EnterpriseKeyTestingOptionsPtrOutput `pulumi:"testingOptions"`
	// Settings for keys that can be used by websites.
	WebSettings EnterpriseKeyWebSettingsPtrOutput `pulumi:"webSettings"`
}

// NewEnterpriseKey registers a new resource with the given unique name, arguments, and options.
func NewEnterpriseKey(ctx *pulumi.Context,
	name string, args *EnterpriseKeyArgs, opts ...pulumi.ResourceOption) (*EnterpriseKey, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DisplayName == nil {
		return nil, errors.New("invalid value for required argument 'DisplayName'")
	}
	var resource EnterpriseKey
	err := ctx.RegisterResource("gcp:recaptcha/enterpriseKey:EnterpriseKey", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetEnterpriseKey gets an existing EnterpriseKey resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetEnterpriseKey(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *EnterpriseKeyState, opts ...pulumi.ResourceOption) (*EnterpriseKey, error) {
	var resource EnterpriseKey
	err := ctx.ReadResource("gcp:recaptcha/enterpriseKey:EnterpriseKey", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering EnterpriseKey resources.
type enterpriseKeyState struct {
	// Settings for keys that can be used by Android apps.
	AndroidSettings *EnterpriseKeyAndroidSettings `pulumi:"androidSettings"`
	// The timestamp corresponding to the creation of this Key.
	CreateTime *string `pulumi:"createTime"`
	// Human-readable display name of this key. Modifiable by user.
	DisplayName *string `pulumi:"displayName"`
	// Settings for keys that can be used by iOS apps.
	IosSettings *EnterpriseKeyIosSettings `pulumi:"iosSettings"`
	// See [Creating and managing labels](https://cloud.google.com/recaptcha-enterprise/docs/labels).
	Labels map[string]string `pulumi:"labels"`
	// The resource name for the Key in the format "projects/{project}/keys/{key}".
	Name *string `pulumi:"name"`
	// The project for the resource
	Project *string `pulumi:"project"`
	// Options for user acceptance testing.
	TestingOptions *EnterpriseKeyTestingOptions `pulumi:"testingOptions"`
	// Settings for keys that can be used by websites.
	WebSettings *EnterpriseKeyWebSettings `pulumi:"webSettings"`
}

type EnterpriseKeyState struct {
	// Settings for keys that can be used by Android apps.
	AndroidSettings EnterpriseKeyAndroidSettingsPtrInput
	// The timestamp corresponding to the creation of this Key.
	CreateTime pulumi.StringPtrInput
	// Human-readable display name of this key. Modifiable by user.
	DisplayName pulumi.StringPtrInput
	// Settings for keys that can be used by iOS apps.
	IosSettings EnterpriseKeyIosSettingsPtrInput
	// See [Creating and managing labels](https://cloud.google.com/recaptcha-enterprise/docs/labels).
	Labels pulumi.StringMapInput
	// The resource name for the Key in the format "projects/{project}/keys/{key}".
	Name pulumi.StringPtrInput
	// The project for the resource
	Project pulumi.StringPtrInput
	// Options for user acceptance testing.
	TestingOptions EnterpriseKeyTestingOptionsPtrInput
	// Settings for keys that can be used by websites.
	WebSettings EnterpriseKeyWebSettingsPtrInput
}

func (EnterpriseKeyState) ElementType() reflect.Type {
	return reflect.TypeOf((*enterpriseKeyState)(nil)).Elem()
}

type enterpriseKeyArgs struct {
	// Settings for keys that can be used by Android apps.
	AndroidSettings *EnterpriseKeyAndroidSettings `pulumi:"androidSettings"`
	// Human-readable display name of this key. Modifiable by user.
	DisplayName string `pulumi:"displayName"`
	// Settings for keys that can be used by iOS apps.
	IosSettings *EnterpriseKeyIosSettings `pulumi:"iosSettings"`
	// See [Creating and managing labels](https://cloud.google.com/recaptcha-enterprise/docs/labels).
	Labels map[string]string `pulumi:"labels"`
	// The project for the resource
	Project *string `pulumi:"project"`
	// Options for user acceptance testing.
	TestingOptions *EnterpriseKeyTestingOptions `pulumi:"testingOptions"`
	// Settings for keys that can be used by websites.
	WebSettings *EnterpriseKeyWebSettings `pulumi:"webSettings"`
}

// The set of arguments for constructing a EnterpriseKey resource.
type EnterpriseKeyArgs struct {
	// Settings for keys that can be used by Android apps.
	AndroidSettings EnterpriseKeyAndroidSettingsPtrInput
	// Human-readable display name of this key. Modifiable by user.
	DisplayName pulumi.StringInput
	// Settings for keys that can be used by iOS apps.
	IosSettings EnterpriseKeyIosSettingsPtrInput
	// See [Creating and managing labels](https://cloud.google.com/recaptcha-enterprise/docs/labels).
	Labels pulumi.StringMapInput
	// The project for the resource
	Project pulumi.StringPtrInput
	// Options for user acceptance testing.
	TestingOptions EnterpriseKeyTestingOptionsPtrInput
	// Settings for keys that can be used by websites.
	WebSettings EnterpriseKeyWebSettingsPtrInput
}

func (EnterpriseKeyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*enterpriseKeyArgs)(nil)).Elem()
}

type EnterpriseKeyInput interface {
	pulumi.Input

	ToEnterpriseKeyOutput() EnterpriseKeyOutput
	ToEnterpriseKeyOutputWithContext(ctx context.Context) EnterpriseKeyOutput
}

func (*EnterpriseKey) ElementType() reflect.Type {
	return reflect.TypeOf((**EnterpriseKey)(nil)).Elem()
}

func (i *EnterpriseKey) ToEnterpriseKeyOutput() EnterpriseKeyOutput {
	return i.ToEnterpriseKeyOutputWithContext(context.Background())
}

func (i *EnterpriseKey) ToEnterpriseKeyOutputWithContext(ctx context.Context) EnterpriseKeyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EnterpriseKeyOutput)
}

// EnterpriseKeyArrayInput is an input type that accepts EnterpriseKeyArray and EnterpriseKeyArrayOutput values.
// You can construct a concrete instance of `EnterpriseKeyArrayInput` via:
//
//          EnterpriseKeyArray{ EnterpriseKeyArgs{...} }
type EnterpriseKeyArrayInput interface {
	pulumi.Input

	ToEnterpriseKeyArrayOutput() EnterpriseKeyArrayOutput
	ToEnterpriseKeyArrayOutputWithContext(context.Context) EnterpriseKeyArrayOutput
}

type EnterpriseKeyArray []EnterpriseKeyInput

func (EnterpriseKeyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EnterpriseKey)(nil)).Elem()
}

func (i EnterpriseKeyArray) ToEnterpriseKeyArrayOutput() EnterpriseKeyArrayOutput {
	return i.ToEnterpriseKeyArrayOutputWithContext(context.Background())
}

func (i EnterpriseKeyArray) ToEnterpriseKeyArrayOutputWithContext(ctx context.Context) EnterpriseKeyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EnterpriseKeyArrayOutput)
}

// EnterpriseKeyMapInput is an input type that accepts EnterpriseKeyMap and EnterpriseKeyMapOutput values.
// You can construct a concrete instance of `EnterpriseKeyMapInput` via:
//
//          EnterpriseKeyMap{ "key": EnterpriseKeyArgs{...} }
type EnterpriseKeyMapInput interface {
	pulumi.Input

	ToEnterpriseKeyMapOutput() EnterpriseKeyMapOutput
	ToEnterpriseKeyMapOutputWithContext(context.Context) EnterpriseKeyMapOutput
}

type EnterpriseKeyMap map[string]EnterpriseKeyInput

func (EnterpriseKeyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EnterpriseKey)(nil)).Elem()
}

func (i EnterpriseKeyMap) ToEnterpriseKeyMapOutput() EnterpriseKeyMapOutput {
	return i.ToEnterpriseKeyMapOutputWithContext(context.Background())
}

func (i EnterpriseKeyMap) ToEnterpriseKeyMapOutputWithContext(ctx context.Context) EnterpriseKeyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EnterpriseKeyMapOutput)
}

type EnterpriseKeyOutput struct{ *pulumi.OutputState }

func (EnterpriseKeyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**EnterpriseKey)(nil)).Elem()
}

func (o EnterpriseKeyOutput) ToEnterpriseKeyOutput() EnterpriseKeyOutput {
	return o
}

func (o EnterpriseKeyOutput) ToEnterpriseKeyOutputWithContext(ctx context.Context) EnterpriseKeyOutput {
	return o
}

type EnterpriseKeyArrayOutput struct{ *pulumi.OutputState }

func (EnterpriseKeyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EnterpriseKey)(nil)).Elem()
}

func (o EnterpriseKeyArrayOutput) ToEnterpriseKeyArrayOutput() EnterpriseKeyArrayOutput {
	return o
}

func (o EnterpriseKeyArrayOutput) ToEnterpriseKeyArrayOutputWithContext(ctx context.Context) EnterpriseKeyArrayOutput {
	return o
}

func (o EnterpriseKeyArrayOutput) Index(i pulumi.IntInput) EnterpriseKeyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *EnterpriseKey {
		return vs[0].([]*EnterpriseKey)[vs[1].(int)]
	}).(EnterpriseKeyOutput)
}

type EnterpriseKeyMapOutput struct{ *pulumi.OutputState }

func (EnterpriseKeyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EnterpriseKey)(nil)).Elem()
}

func (o EnterpriseKeyMapOutput) ToEnterpriseKeyMapOutput() EnterpriseKeyMapOutput {
	return o
}

func (o EnterpriseKeyMapOutput) ToEnterpriseKeyMapOutputWithContext(ctx context.Context) EnterpriseKeyMapOutput {
	return o
}

func (o EnterpriseKeyMapOutput) MapIndex(k pulumi.StringInput) EnterpriseKeyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *EnterpriseKey {
		return vs[0].(map[string]*EnterpriseKey)[vs[1].(string)]
	}).(EnterpriseKeyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*EnterpriseKeyInput)(nil)).Elem(), &EnterpriseKey{})
	pulumi.RegisterInputType(reflect.TypeOf((*EnterpriseKeyArrayInput)(nil)).Elem(), EnterpriseKeyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*EnterpriseKeyMapInput)(nil)).Elem(), EnterpriseKeyMap{})
	pulumi.RegisterOutputType(EnterpriseKeyOutput{})
	pulumi.RegisterOutputType(EnterpriseKeyArrayOutput{})
	pulumi.RegisterOutputType(EnterpriseKeyMapOutput{})
}