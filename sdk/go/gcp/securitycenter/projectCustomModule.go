// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package securitycenter

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Represents an instance of a Security Health Analytics custom module, including
// its full module name, display name, enablement state, and last updated time.
// You can create a custom module at the organization, folder, or project level.
// Custom modules that you create at the organization or folder level are inherited
// by the child folders and projects.
//
// To get more information about ProjectCustomModule, see:
//
// * [API documentation](https://cloud.google.com/security-command-center/docs/reference/rest/v1/projects.securityHealthAnalyticsSettings.customModules)
// * How-to Guides
//   - [Overview of custom modules for Security Health Analytics](https://cloud.google.com/security-command-center/docs/custom-modules-sha-overview)
//
// ## Example Usage
// ### Scc Project Custom Module Basic
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/securitycenter"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := securitycenter.NewProjectCustomModule(ctx, "example", &securitycenter.ProjectCustomModuleArgs{
//				CustomConfig: &securitycenter.ProjectCustomModuleCustomConfigArgs{
//					Description: pulumi.String("The rotation period of the identified cryptokey resource exceeds 30 days."),
//					Predicate: &securitycenter.ProjectCustomModuleCustomConfigPredicateArgs{
//						Expression: pulumi.String("resource.rotationPeriod > duration(\"2592000s\")"),
//					},
//					Recommendation: pulumi.String("Set the rotation period to at most 30 days."),
//					ResourceSelector: &securitycenter.ProjectCustomModuleCustomConfigResourceSelectorArgs{
//						ResourceTypes: pulumi.StringArray{
//							pulumi.String("cloudkms.googleapis.com/CryptoKey"),
//						},
//					},
//					Severity: pulumi.String("MEDIUM"),
//				},
//				DisplayName:     pulumi.String("basic_custom_module"),
//				EnablementState: pulumi.String("ENABLED"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Scc Project Custom Module Full
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/securitycenter"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := securitycenter.NewProjectCustomModule(ctx, "example", &securitycenter.ProjectCustomModuleArgs{
//				CustomConfig: &securitycenter.ProjectCustomModuleCustomConfigArgs{
//					CustomOutput: securitycenter.ProjectCustomModuleCustomConfigCustomOutputArgs{
//						Properties: securitycenter.ProjectCustomModuleCustomConfigCustomOutputPropertyArray{
//							&securitycenter.ProjectCustomModuleCustomConfigCustomOutputPropertyArgs{
//								Name: pulumi.String("duration"),
//								ValueExpression: &securitycenter.ProjectCustomModuleCustomConfigCustomOutputPropertyValueExpressionArgs{
//									Description: pulumi.String("description of the expression"),
//									Expression:  pulumi.String("resource.rotationPeriod"),
//									Location:    pulumi.String("location of the expression"),
//									Title:       pulumi.String("Purpose of the expression"),
//								},
//							},
//						},
//					},
//					Description: pulumi.String("Description of the custom module"),
//					Predicate: &securitycenter.ProjectCustomModuleCustomConfigPredicateArgs{
//						Description: pulumi.String("description of the expression"),
//						Expression:  pulumi.String("resource.rotationPeriod > duration(\"2592000s\")"),
//						Location:    pulumi.String("location of the expression"),
//						Title:       pulumi.String("Purpose of the expression"),
//					},
//					Recommendation: pulumi.String("Steps to resolve violation"),
//					ResourceSelector: &securitycenter.ProjectCustomModuleCustomConfigResourceSelectorArgs{
//						ResourceTypes: pulumi.StringArray{
//							pulumi.String("cloudkms.googleapis.com/CryptoKey"),
//						},
//					},
//					Severity: pulumi.String("LOW"),
//				},
//				DisplayName:     pulumi.String("full_custom_module"),
//				EnablementState: pulumi.String("ENABLED"),
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
// # ProjectCustomModule can be imported using any of these accepted formats
//
// ```sh
//
//	$ pulumi import gcp:securitycenter/projectCustomModule:ProjectCustomModule default projects/{{project}}/securityHealthAnalyticsSettings/customModules/{{name}}
//
// ```
//
// ```sh
//
//	$ pulumi import gcp:securitycenter/projectCustomModule:ProjectCustomModule default {{project}}/{{name}}
//
// ```
//
// ```sh
//
//	$ pulumi import gcp:securitycenter/projectCustomModule:ProjectCustomModule default {{name}}
//
// ```
type ProjectCustomModule struct {
	pulumi.CustomResourceState

	// If empty, indicates that the custom module was created in the organization,folder,
	// or project in which you are viewing the custom module. Otherwise, ancestorModule
	// specifies the organization or folder from which the custom module is inherited.
	AncestorModule pulumi.StringOutput `pulumi:"ancestorModule"`
	// The user specified custom configuration for the module.
	// Structure is documented below.
	CustomConfig ProjectCustomModuleCustomConfigOutput `pulumi:"customConfig"`
	// The display name of the Security Health Analytics custom module. This
	// display name becomes the finding category for all findings that are
	// returned by this custom module. The display name must be between 1 and
	// 128 characters, start with a lowercase letter, and contain alphanumeric
	// characters or underscores only.
	DisplayName pulumi.StringOutput `pulumi:"displayName"`
	// The enablement state of the custom module.
	// Possible values are: `ENABLED`, `DISABLED`.
	EnablementState pulumi.StringOutput `pulumi:"enablementState"`
	// The editor that last updated the custom module.
	LastEditor pulumi.StringOutput `pulumi:"lastEditor"`
	// Name of the property for the custom output.
	Name pulumi.StringOutput `pulumi:"name"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringOutput `pulumi:"project"`
	// The time at which the custom module was last updated.
	// A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and
	// up to nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
	UpdateTime pulumi.StringOutput `pulumi:"updateTime"`
}

// NewProjectCustomModule registers a new resource with the given unique name, arguments, and options.
func NewProjectCustomModule(ctx *pulumi.Context,
	name string, args *ProjectCustomModuleArgs, opts ...pulumi.ResourceOption) (*ProjectCustomModule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.CustomConfig == nil {
		return nil, errors.New("invalid value for required argument 'CustomConfig'")
	}
	if args.DisplayName == nil {
		return nil, errors.New("invalid value for required argument 'DisplayName'")
	}
	if args.EnablementState == nil {
		return nil, errors.New("invalid value for required argument 'EnablementState'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ProjectCustomModule
	err := ctx.RegisterResource("gcp:securitycenter/projectCustomModule:ProjectCustomModule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetProjectCustomModule gets an existing ProjectCustomModule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetProjectCustomModule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ProjectCustomModuleState, opts ...pulumi.ResourceOption) (*ProjectCustomModule, error) {
	var resource ProjectCustomModule
	err := ctx.ReadResource("gcp:securitycenter/projectCustomModule:ProjectCustomModule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ProjectCustomModule resources.
type projectCustomModuleState struct {
	// If empty, indicates that the custom module was created in the organization,folder,
	// or project in which you are viewing the custom module. Otherwise, ancestorModule
	// specifies the organization or folder from which the custom module is inherited.
	AncestorModule *string `pulumi:"ancestorModule"`
	// The user specified custom configuration for the module.
	// Structure is documented below.
	CustomConfig *ProjectCustomModuleCustomConfig `pulumi:"customConfig"`
	// The display name of the Security Health Analytics custom module. This
	// display name becomes the finding category for all findings that are
	// returned by this custom module. The display name must be between 1 and
	// 128 characters, start with a lowercase letter, and contain alphanumeric
	// characters or underscores only.
	DisplayName *string `pulumi:"displayName"`
	// The enablement state of the custom module.
	// Possible values are: `ENABLED`, `DISABLED`.
	EnablementState *string `pulumi:"enablementState"`
	// The editor that last updated the custom module.
	LastEditor *string `pulumi:"lastEditor"`
	// Name of the property for the custom output.
	Name *string `pulumi:"name"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
	// The time at which the custom module was last updated.
	// A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and
	// up to nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
	UpdateTime *string `pulumi:"updateTime"`
}

type ProjectCustomModuleState struct {
	// If empty, indicates that the custom module was created in the organization,folder,
	// or project in which you are viewing the custom module. Otherwise, ancestorModule
	// specifies the organization or folder from which the custom module is inherited.
	AncestorModule pulumi.StringPtrInput
	// The user specified custom configuration for the module.
	// Structure is documented below.
	CustomConfig ProjectCustomModuleCustomConfigPtrInput
	// The display name of the Security Health Analytics custom module. This
	// display name becomes the finding category for all findings that are
	// returned by this custom module. The display name must be between 1 and
	// 128 characters, start with a lowercase letter, and contain alphanumeric
	// characters or underscores only.
	DisplayName pulumi.StringPtrInput
	// The enablement state of the custom module.
	// Possible values are: `ENABLED`, `DISABLED`.
	EnablementState pulumi.StringPtrInput
	// The editor that last updated the custom module.
	LastEditor pulumi.StringPtrInput
	// Name of the property for the custom output.
	Name pulumi.StringPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
	// The time at which the custom module was last updated.
	// A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and
	// up to nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
	UpdateTime pulumi.StringPtrInput
}

func (ProjectCustomModuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*projectCustomModuleState)(nil)).Elem()
}

type projectCustomModuleArgs struct {
	// The user specified custom configuration for the module.
	// Structure is documented below.
	CustomConfig ProjectCustomModuleCustomConfig `pulumi:"customConfig"`
	// The display name of the Security Health Analytics custom module. This
	// display name becomes the finding category for all findings that are
	// returned by this custom module. The display name must be between 1 and
	// 128 characters, start with a lowercase letter, and contain alphanumeric
	// characters or underscores only.
	DisplayName string `pulumi:"displayName"`
	// The enablement state of the custom module.
	// Possible values are: `ENABLED`, `DISABLED`.
	EnablementState string `pulumi:"enablementState"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
}

// The set of arguments for constructing a ProjectCustomModule resource.
type ProjectCustomModuleArgs struct {
	// The user specified custom configuration for the module.
	// Structure is documented below.
	CustomConfig ProjectCustomModuleCustomConfigInput
	// The display name of the Security Health Analytics custom module. This
	// display name becomes the finding category for all findings that are
	// returned by this custom module. The display name must be between 1 and
	// 128 characters, start with a lowercase letter, and contain alphanumeric
	// characters or underscores only.
	DisplayName pulumi.StringInput
	// The enablement state of the custom module.
	// Possible values are: `ENABLED`, `DISABLED`.
	EnablementState pulumi.StringInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
}

func (ProjectCustomModuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*projectCustomModuleArgs)(nil)).Elem()
}

type ProjectCustomModuleInput interface {
	pulumi.Input

	ToProjectCustomModuleOutput() ProjectCustomModuleOutput
	ToProjectCustomModuleOutputWithContext(ctx context.Context) ProjectCustomModuleOutput
}

func (*ProjectCustomModule) ElementType() reflect.Type {
	return reflect.TypeOf((**ProjectCustomModule)(nil)).Elem()
}

func (i *ProjectCustomModule) ToProjectCustomModuleOutput() ProjectCustomModuleOutput {
	return i.ToProjectCustomModuleOutputWithContext(context.Background())
}

func (i *ProjectCustomModule) ToProjectCustomModuleOutputWithContext(ctx context.Context) ProjectCustomModuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectCustomModuleOutput)
}

func (i *ProjectCustomModule) ToOutput(ctx context.Context) pulumix.Output[*ProjectCustomModule] {
	return pulumix.Output[*ProjectCustomModule]{
		OutputState: i.ToProjectCustomModuleOutputWithContext(ctx).OutputState,
	}
}

// ProjectCustomModuleArrayInput is an input type that accepts ProjectCustomModuleArray and ProjectCustomModuleArrayOutput values.
// You can construct a concrete instance of `ProjectCustomModuleArrayInput` via:
//
//	ProjectCustomModuleArray{ ProjectCustomModuleArgs{...} }
type ProjectCustomModuleArrayInput interface {
	pulumi.Input

	ToProjectCustomModuleArrayOutput() ProjectCustomModuleArrayOutput
	ToProjectCustomModuleArrayOutputWithContext(context.Context) ProjectCustomModuleArrayOutput
}

type ProjectCustomModuleArray []ProjectCustomModuleInput

func (ProjectCustomModuleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ProjectCustomModule)(nil)).Elem()
}

func (i ProjectCustomModuleArray) ToProjectCustomModuleArrayOutput() ProjectCustomModuleArrayOutput {
	return i.ToProjectCustomModuleArrayOutputWithContext(context.Background())
}

func (i ProjectCustomModuleArray) ToProjectCustomModuleArrayOutputWithContext(ctx context.Context) ProjectCustomModuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectCustomModuleArrayOutput)
}

func (i ProjectCustomModuleArray) ToOutput(ctx context.Context) pulumix.Output[[]*ProjectCustomModule] {
	return pulumix.Output[[]*ProjectCustomModule]{
		OutputState: i.ToProjectCustomModuleArrayOutputWithContext(ctx).OutputState,
	}
}

// ProjectCustomModuleMapInput is an input type that accepts ProjectCustomModuleMap and ProjectCustomModuleMapOutput values.
// You can construct a concrete instance of `ProjectCustomModuleMapInput` via:
//
//	ProjectCustomModuleMap{ "key": ProjectCustomModuleArgs{...} }
type ProjectCustomModuleMapInput interface {
	pulumi.Input

	ToProjectCustomModuleMapOutput() ProjectCustomModuleMapOutput
	ToProjectCustomModuleMapOutputWithContext(context.Context) ProjectCustomModuleMapOutput
}

type ProjectCustomModuleMap map[string]ProjectCustomModuleInput

func (ProjectCustomModuleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ProjectCustomModule)(nil)).Elem()
}

func (i ProjectCustomModuleMap) ToProjectCustomModuleMapOutput() ProjectCustomModuleMapOutput {
	return i.ToProjectCustomModuleMapOutputWithContext(context.Background())
}

func (i ProjectCustomModuleMap) ToProjectCustomModuleMapOutputWithContext(ctx context.Context) ProjectCustomModuleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectCustomModuleMapOutput)
}

func (i ProjectCustomModuleMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*ProjectCustomModule] {
	return pulumix.Output[map[string]*ProjectCustomModule]{
		OutputState: i.ToProjectCustomModuleMapOutputWithContext(ctx).OutputState,
	}
}

type ProjectCustomModuleOutput struct{ *pulumi.OutputState }

func (ProjectCustomModuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ProjectCustomModule)(nil)).Elem()
}

func (o ProjectCustomModuleOutput) ToProjectCustomModuleOutput() ProjectCustomModuleOutput {
	return o
}

func (o ProjectCustomModuleOutput) ToProjectCustomModuleOutputWithContext(ctx context.Context) ProjectCustomModuleOutput {
	return o
}

func (o ProjectCustomModuleOutput) ToOutput(ctx context.Context) pulumix.Output[*ProjectCustomModule] {
	return pulumix.Output[*ProjectCustomModule]{
		OutputState: o.OutputState,
	}
}

// If empty, indicates that the custom module was created in the organization,folder,
// or project in which you are viewing the custom module. Otherwise, ancestorModule
// specifies the organization or folder from which the custom module is inherited.
func (o ProjectCustomModuleOutput) AncestorModule() pulumi.StringOutput {
	return o.ApplyT(func(v *ProjectCustomModule) pulumi.StringOutput { return v.AncestorModule }).(pulumi.StringOutput)
}

// The user specified custom configuration for the module.
// Structure is documented below.
func (o ProjectCustomModuleOutput) CustomConfig() ProjectCustomModuleCustomConfigOutput {
	return o.ApplyT(func(v *ProjectCustomModule) ProjectCustomModuleCustomConfigOutput { return v.CustomConfig }).(ProjectCustomModuleCustomConfigOutput)
}

// The display name of the Security Health Analytics custom module. This
// display name becomes the finding category for all findings that are
// returned by this custom module. The display name must be between 1 and
// 128 characters, start with a lowercase letter, and contain alphanumeric
// characters or underscores only.
func (o ProjectCustomModuleOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v *ProjectCustomModule) pulumi.StringOutput { return v.DisplayName }).(pulumi.StringOutput)
}

// The enablement state of the custom module.
// Possible values are: `ENABLED`, `DISABLED`.
func (o ProjectCustomModuleOutput) EnablementState() pulumi.StringOutput {
	return o.ApplyT(func(v *ProjectCustomModule) pulumi.StringOutput { return v.EnablementState }).(pulumi.StringOutput)
}

// The editor that last updated the custom module.
func (o ProjectCustomModuleOutput) LastEditor() pulumi.StringOutput {
	return o.ApplyT(func(v *ProjectCustomModule) pulumi.StringOutput { return v.LastEditor }).(pulumi.StringOutput)
}

// Name of the property for the custom output.
func (o ProjectCustomModuleOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ProjectCustomModule) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The ID of the project in which the resource belongs.
// If it is not provided, the provider project is used.
func (o ProjectCustomModuleOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *ProjectCustomModule) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// The time at which the custom module was last updated.
// A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and
// up to nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
func (o ProjectCustomModuleOutput) UpdateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *ProjectCustomModule) pulumi.StringOutput { return v.UpdateTime }).(pulumi.StringOutput)
}

type ProjectCustomModuleArrayOutput struct{ *pulumi.OutputState }

func (ProjectCustomModuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ProjectCustomModule)(nil)).Elem()
}

func (o ProjectCustomModuleArrayOutput) ToProjectCustomModuleArrayOutput() ProjectCustomModuleArrayOutput {
	return o
}

func (o ProjectCustomModuleArrayOutput) ToProjectCustomModuleArrayOutputWithContext(ctx context.Context) ProjectCustomModuleArrayOutput {
	return o
}

func (o ProjectCustomModuleArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*ProjectCustomModule] {
	return pulumix.Output[[]*ProjectCustomModule]{
		OutputState: o.OutputState,
	}
}

func (o ProjectCustomModuleArrayOutput) Index(i pulumi.IntInput) ProjectCustomModuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ProjectCustomModule {
		return vs[0].([]*ProjectCustomModule)[vs[1].(int)]
	}).(ProjectCustomModuleOutput)
}

type ProjectCustomModuleMapOutput struct{ *pulumi.OutputState }

func (ProjectCustomModuleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ProjectCustomModule)(nil)).Elem()
}

func (o ProjectCustomModuleMapOutput) ToProjectCustomModuleMapOutput() ProjectCustomModuleMapOutput {
	return o
}

func (o ProjectCustomModuleMapOutput) ToProjectCustomModuleMapOutputWithContext(ctx context.Context) ProjectCustomModuleMapOutput {
	return o
}

func (o ProjectCustomModuleMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*ProjectCustomModule] {
	return pulumix.Output[map[string]*ProjectCustomModule]{
		OutputState: o.OutputState,
	}
}

func (o ProjectCustomModuleMapOutput) MapIndex(k pulumi.StringInput) ProjectCustomModuleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ProjectCustomModule {
		return vs[0].(map[string]*ProjectCustomModule)[vs[1].(string)]
	}).(ProjectCustomModuleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectCustomModuleInput)(nil)).Elem(), &ProjectCustomModule{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectCustomModuleArrayInput)(nil)).Elem(), ProjectCustomModuleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectCustomModuleMapInput)(nil)).Elem(), ProjectCustomModuleMap{})
	pulumi.RegisterOutputType(ProjectCustomModuleOutput{})
	pulumi.RegisterOutputType(ProjectCustomModuleArrayOutput{})
	pulumi.RegisterOutputType(ProjectCustomModuleMapOutput{})
}