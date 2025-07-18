// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package tags

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// A TagBinding represents a connection between a TagValue and a cloud resource (currently project, folder, or organization). Once a TagBinding is created, the TagValue is applied to all the descendants of the cloud resource.
//
// To get more information about TagBinding, see:
//
// * [API documentation](https://cloud.google.com/resource-manager/reference/rest/v3/tagBindings)
// * How-to Guides
//   - [Official Documentation](https://cloud.google.com/resource-manager/docs/tags/tags-creating-and-managing)
//
// ## Example Usage
//
// ### Tag Binding Basic
//
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/organizations"
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/tags"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			project, err := organizations.NewProject(ctx, "project", &organizations.ProjectArgs{
//				ProjectId:      pulumi.String("project_id"),
//				Name:           pulumi.String("project_id"),
//				OrgId:          pulumi.String("123456789"),
//				DeletionPolicy: pulumi.String("DELETE"),
//			})
//			if err != nil {
//				return err
//			}
//			key, err := tags.NewTagKey(ctx, "key", &tags.TagKeyArgs{
//				Parent:      pulumi.String("organizations/123456789"),
//				ShortName:   pulumi.String("keyname"),
//				Description: pulumi.String("For keyname resources."),
//			})
//			if err != nil {
//				return err
//			}
//			value, err := tags.NewTagValue(ctx, "value", &tags.TagValueArgs{
//				Parent:      key.ID(),
//				ShortName:   pulumi.String("valuename"),
//				Description: pulumi.String("For valuename resources."),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = tags.NewTagBinding(ctx, "binding", &tags.TagBindingArgs{
//				Parent: project.Number.ApplyT(func(number string) (string, error) {
//					return fmt.Sprintf("//cloudresourcemanager.googleapis.com/projects/%v", number), nil
//				}).(pulumi.StringOutput),
//				TagValue: value.ID(),
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
// TagBinding can be imported using any of these accepted formats:
//
// * `tagBindings/{{name}}`
//
// * `{{name}}`
//
// When using the `pulumi import` command, TagBinding can be imported using one of the formats above. For example:
//
// ```sh
// $ pulumi import gcp:tags/tagBinding:TagBinding default tagBindings/{{name}}
// ```
//
// ```sh
// $ pulumi import gcp:tags/tagBinding:TagBinding default {{name}}
// ```
type TagBinding struct {
	pulumi.CustomResourceState

	// The generated id for the TagBinding. This is a string of the form: `tagBindings/{full-resource-name}/{tag-value-name}`
	Name pulumi.StringOutput `pulumi:"name"`
	// The full resource name of the resource the TagValue is bound to. E.g. //cloudresourcemanager.googleapis.com/projects/123
	Parent pulumi.StringOutput `pulumi:"parent"`
	// The TagValue of the TagBinding. Must be of the form tagValues/456.
	TagValue pulumi.StringOutput `pulumi:"tagValue"`
}

// NewTagBinding registers a new resource with the given unique name, arguments, and options.
func NewTagBinding(ctx *pulumi.Context,
	name string, args *TagBindingArgs, opts ...pulumi.ResourceOption) (*TagBinding, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Parent == nil {
		return nil, errors.New("invalid value for required argument 'Parent'")
	}
	if args.TagValue == nil {
		return nil, errors.New("invalid value for required argument 'TagValue'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource TagBinding
	err := ctx.RegisterResource("gcp:tags/tagBinding:TagBinding", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTagBinding gets an existing TagBinding resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTagBinding(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TagBindingState, opts ...pulumi.ResourceOption) (*TagBinding, error) {
	var resource TagBinding
	err := ctx.ReadResource("gcp:tags/tagBinding:TagBinding", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering TagBinding resources.
type tagBindingState struct {
	// The generated id for the TagBinding. This is a string of the form: `tagBindings/{full-resource-name}/{tag-value-name}`
	Name *string `pulumi:"name"`
	// The full resource name of the resource the TagValue is bound to. E.g. //cloudresourcemanager.googleapis.com/projects/123
	Parent *string `pulumi:"parent"`
	// The TagValue of the TagBinding. Must be of the form tagValues/456.
	TagValue *string `pulumi:"tagValue"`
}

type TagBindingState struct {
	// The generated id for the TagBinding. This is a string of the form: `tagBindings/{full-resource-name}/{tag-value-name}`
	Name pulumi.StringPtrInput
	// The full resource name of the resource the TagValue is bound to. E.g. //cloudresourcemanager.googleapis.com/projects/123
	Parent pulumi.StringPtrInput
	// The TagValue of the TagBinding. Must be of the form tagValues/456.
	TagValue pulumi.StringPtrInput
}

func (TagBindingState) ElementType() reflect.Type {
	return reflect.TypeOf((*tagBindingState)(nil)).Elem()
}

type tagBindingArgs struct {
	// The full resource name of the resource the TagValue is bound to. E.g. //cloudresourcemanager.googleapis.com/projects/123
	Parent string `pulumi:"parent"`
	// The TagValue of the TagBinding. Must be of the form tagValues/456.
	TagValue string `pulumi:"tagValue"`
}

// The set of arguments for constructing a TagBinding resource.
type TagBindingArgs struct {
	// The full resource name of the resource the TagValue is bound to. E.g. //cloudresourcemanager.googleapis.com/projects/123
	Parent pulumi.StringInput
	// The TagValue of the TagBinding. Must be of the form tagValues/456.
	TagValue pulumi.StringInput
}

func (TagBindingArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*tagBindingArgs)(nil)).Elem()
}

type TagBindingInput interface {
	pulumi.Input

	ToTagBindingOutput() TagBindingOutput
	ToTagBindingOutputWithContext(ctx context.Context) TagBindingOutput
}

func (*TagBinding) ElementType() reflect.Type {
	return reflect.TypeOf((**TagBinding)(nil)).Elem()
}

func (i *TagBinding) ToTagBindingOutput() TagBindingOutput {
	return i.ToTagBindingOutputWithContext(context.Background())
}

func (i *TagBinding) ToTagBindingOutputWithContext(ctx context.Context) TagBindingOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TagBindingOutput)
}

// TagBindingArrayInput is an input type that accepts TagBindingArray and TagBindingArrayOutput values.
// You can construct a concrete instance of `TagBindingArrayInput` via:
//
//	TagBindingArray{ TagBindingArgs{...} }
type TagBindingArrayInput interface {
	pulumi.Input

	ToTagBindingArrayOutput() TagBindingArrayOutput
	ToTagBindingArrayOutputWithContext(context.Context) TagBindingArrayOutput
}

type TagBindingArray []TagBindingInput

func (TagBindingArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TagBinding)(nil)).Elem()
}

func (i TagBindingArray) ToTagBindingArrayOutput() TagBindingArrayOutput {
	return i.ToTagBindingArrayOutputWithContext(context.Background())
}

func (i TagBindingArray) ToTagBindingArrayOutputWithContext(ctx context.Context) TagBindingArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TagBindingArrayOutput)
}

// TagBindingMapInput is an input type that accepts TagBindingMap and TagBindingMapOutput values.
// You can construct a concrete instance of `TagBindingMapInput` via:
//
//	TagBindingMap{ "key": TagBindingArgs{...} }
type TagBindingMapInput interface {
	pulumi.Input

	ToTagBindingMapOutput() TagBindingMapOutput
	ToTagBindingMapOutputWithContext(context.Context) TagBindingMapOutput
}

type TagBindingMap map[string]TagBindingInput

func (TagBindingMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TagBinding)(nil)).Elem()
}

func (i TagBindingMap) ToTagBindingMapOutput() TagBindingMapOutput {
	return i.ToTagBindingMapOutputWithContext(context.Background())
}

func (i TagBindingMap) ToTagBindingMapOutputWithContext(ctx context.Context) TagBindingMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TagBindingMapOutput)
}

type TagBindingOutput struct{ *pulumi.OutputState }

func (TagBindingOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**TagBinding)(nil)).Elem()
}

func (o TagBindingOutput) ToTagBindingOutput() TagBindingOutput {
	return o
}

func (o TagBindingOutput) ToTagBindingOutputWithContext(ctx context.Context) TagBindingOutput {
	return o
}

// The generated id for the TagBinding. This is a string of the form: `tagBindings/{full-resource-name}/{tag-value-name}`
func (o TagBindingOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *TagBinding) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The full resource name of the resource the TagValue is bound to. E.g. //cloudresourcemanager.googleapis.com/projects/123
func (o TagBindingOutput) Parent() pulumi.StringOutput {
	return o.ApplyT(func(v *TagBinding) pulumi.StringOutput { return v.Parent }).(pulumi.StringOutput)
}

// The TagValue of the TagBinding. Must be of the form tagValues/456.
func (o TagBindingOutput) TagValue() pulumi.StringOutput {
	return o.ApplyT(func(v *TagBinding) pulumi.StringOutput { return v.TagValue }).(pulumi.StringOutput)
}

type TagBindingArrayOutput struct{ *pulumi.OutputState }

func (TagBindingArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TagBinding)(nil)).Elem()
}

func (o TagBindingArrayOutput) ToTagBindingArrayOutput() TagBindingArrayOutput {
	return o
}

func (o TagBindingArrayOutput) ToTagBindingArrayOutputWithContext(ctx context.Context) TagBindingArrayOutput {
	return o
}

func (o TagBindingArrayOutput) Index(i pulumi.IntInput) TagBindingOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *TagBinding {
		return vs[0].([]*TagBinding)[vs[1].(int)]
	}).(TagBindingOutput)
}

type TagBindingMapOutput struct{ *pulumi.OutputState }

func (TagBindingMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TagBinding)(nil)).Elem()
}

func (o TagBindingMapOutput) ToTagBindingMapOutput() TagBindingMapOutput {
	return o
}

func (o TagBindingMapOutput) ToTagBindingMapOutputWithContext(ctx context.Context) TagBindingMapOutput {
	return o
}

func (o TagBindingMapOutput) MapIndex(k pulumi.StringInput) TagBindingOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *TagBinding {
		return vs[0].(map[string]*TagBinding)[vs[1].(string)]
	}).(TagBindingOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TagBindingInput)(nil)).Elem(), &TagBinding{})
	pulumi.RegisterInputType(reflect.TypeOf((*TagBindingArrayInput)(nil)).Elem(), TagBindingArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TagBindingMapInput)(nil)).Elem(), TagBindingMap{})
	pulumi.RegisterOutputType(TagBindingOutput{})
	pulumi.RegisterOutputType(TagBindingArrayOutput{})
	pulumi.RegisterOutputType(TagBindingMapOutput{})
}
