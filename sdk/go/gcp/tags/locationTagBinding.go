// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package tags

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// A TagBinding represents a connection between a TagValue and a Regional cloud resource (currently project, folder, or organization). Once a TagBinding is created, the TagValue is applied to all the descendants of the cloud resource.
//
// To get more information about TagBinding, see:
//
// * [API documentation](https://cloud.google.com/resource-manager/reference/rest/v3/tagBindings)
// * How-to Guides
//   - [Official Documentation](https://cloud.google.com/resource-manager/docs/tags/tags-creating-and-managing)
//
// ## Example Usage
// ### Location Tag Binding Basic
//
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/organizations"
//	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/tags"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			project, err := organizations.NewProject(ctx, "project", &organizations.ProjectArgs{
//				OrgId:     pulumi.String("123456789"),
//				ProjectId: pulumi.String("project_id"),
//			})
//			if err != nil {
//				return err
//			}
//			key, err := tags.NewTagKey(ctx, "key", &tags.TagKeyArgs{
//				Description: pulumi.String("For keyname resources."),
//				Parent:      pulumi.String("organizations/123456789"),
//				ShortName:   pulumi.String("keyname"),
//			})
//			if err != nil {
//				return err
//			}
//			value, err := tags.NewTagValue(ctx, "value", &tags.TagValueArgs{
//				Description: pulumi.String("For valuename resources."),
//				Parent: key.Name.ApplyT(func(name string) (string, error) {
//					return fmt.Sprintf("tagKeys/%v", name), nil
//				}).(pulumi.StringOutput),
//				ShortName: pulumi.String("valuename"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = tags.NewLocationTagBinding(ctx, "binding", &tags.LocationTagBindingArgs{
//				Location: pulumi.String("us-central1"),
//				Parent: project.Number.ApplyT(func(number string) (string, error) {
//					return fmt.Sprintf("//run.googleapis.com/projects/%v/locations/%v/services/%v", number, google_cloud_run_service.Default.Location, google_cloud_run_service.Default.Name), nil
//				}).(pulumi.StringOutput),
//				TagValue: value.Name.ApplyT(func(name string) (string, error) {
//					return fmt.Sprintf("tagValues/%v", name), nil
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
// # TagBinding can be imported using any of these accepted formats
//
// ```sh
//
//	$ pulumi import gcp:tags/locationTagBinding:LocationTagBinding default {{location}}/{{name}}
//
// ```
type LocationTagBinding struct {
	pulumi.CustomResourceState

	// Location of the resource.
	Location pulumi.StringPtrOutput `pulumi:"location"`
	// The generated id for the TagBinding. This is a string of the form: `tagBindings/{parent}/{tag-value-name}`
	Name pulumi.StringOutput `pulumi:"name"`
	// The full resource name of the resource the TagValue is bound to. E.g. //cloudresourcemanager.googleapis.com/projects/123
	Parent pulumi.StringOutput `pulumi:"parent"`
	// The TagValue of the TagBinding. Must be of the form tagValues/456.
	TagValue pulumi.StringOutput `pulumi:"tagValue"`
}

// NewLocationTagBinding registers a new resource with the given unique name, arguments, and options.
func NewLocationTagBinding(ctx *pulumi.Context,
	name string, args *LocationTagBindingArgs, opts ...pulumi.ResourceOption) (*LocationTagBinding, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Parent == nil {
		return nil, errors.New("invalid value for required argument 'Parent'")
	}
	if args.TagValue == nil {
		return nil, errors.New("invalid value for required argument 'TagValue'")
	}
	var resource LocationTagBinding
	err := ctx.RegisterResource("gcp:tags/locationTagBinding:LocationTagBinding", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLocationTagBinding gets an existing LocationTagBinding resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLocationTagBinding(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LocationTagBindingState, opts ...pulumi.ResourceOption) (*LocationTagBinding, error) {
	var resource LocationTagBinding
	err := ctx.ReadResource("gcp:tags/locationTagBinding:LocationTagBinding", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering LocationTagBinding resources.
type locationTagBindingState struct {
	// Location of the resource.
	Location *string `pulumi:"location"`
	// The generated id for the TagBinding. This is a string of the form: `tagBindings/{parent}/{tag-value-name}`
	Name *string `pulumi:"name"`
	// The full resource name of the resource the TagValue is bound to. E.g. //cloudresourcemanager.googleapis.com/projects/123
	Parent *string `pulumi:"parent"`
	// The TagValue of the TagBinding. Must be of the form tagValues/456.
	TagValue *string `pulumi:"tagValue"`
}

type LocationTagBindingState struct {
	// Location of the resource.
	Location pulumi.StringPtrInput
	// The generated id for the TagBinding. This is a string of the form: `tagBindings/{parent}/{tag-value-name}`
	Name pulumi.StringPtrInput
	// The full resource name of the resource the TagValue is bound to. E.g. //cloudresourcemanager.googleapis.com/projects/123
	Parent pulumi.StringPtrInput
	// The TagValue of the TagBinding. Must be of the form tagValues/456.
	TagValue pulumi.StringPtrInput
}

func (LocationTagBindingState) ElementType() reflect.Type {
	return reflect.TypeOf((*locationTagBindingState)(nil)).Elem()
}

type locationTagBindingArgs struct {
	// Location of the resource.
	Location *string `pulumi:"location"`
	// The full resource name of the resource the TagValue is bound to. E.g. //cloudresourcemanager.googleapis.com/projects/123
	Parent string `pulumi:"parent"`
	// The TagValue of the TagBinding. Must be of the form tagValues/456.
	TagValue string `pulumi:"tagValue"`
}

// The set of arguments for constructing a LocationTagBinding resource.
type LocationTagBindingArgs struct {
	// Location of the resource.
	Location pulumi.StringPtrInput
	// The full resource name of the resource the TagValue is bound to. E.g. //cloudresourcemanager.googleapis.com/projects/123
	Parent pulumi.StringInput
	// The TagValue of the TagBinding. Must be of the form tagValues/456.
	TagValue pulumi.StringInput
}

func (LocationTagBindingArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*locationTagBindingArgs)(nil)).Elem()
}

type LocationTagBindingInput interface {
	pulumi.Input

	ToLocationTagBindingOutput() LocationTagBindingOutput
	ToLocationTagBindingOutputWithContext(ctx context.Context) LocationTagBindingOutput
}

func (*LocationTagBinding) ElementType() reflect.Type {
	return reflect.TypeOf((**LocationTagBinding)(nil)).Elem()
}

func (i *LocationTagBinding) ToLocationTagBindingOutput() LocationTagBindingOutput {
	return i.ToLocationTagBindingOutputWithContext(context.Background())
}

func (i *LocationTagBinding) ToLocationTagBindingOutputWithContext(ctx context.Context) LocationTagBindingOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LocationTagBindingOutput)
}

// LocationTagBindingArrayInput is an input type that accepts LocationTagBindingArray and LocationTagBindingArrayOutput values.
// You can construct a concrete instance of `LocationTagBindingArrayInput` via:
//
//	LocationTagBindingArray{ LocationTagBindingArgs{...} }
type LocationTagBindingArrayInput interface {
	pulumi.Input

	ToLocationTagBindingArrayOutput() LocationTagBindingArrayOutput
	ToLocationTagBindingArrayOutputWithContext(context.Context) LocationTagBindingArrayOutput
}

type LocationTagBindingArray []LocationTagBindingInput

func (LocationTagBindingArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LocationTagBinding)(nil)).Elem()
}

func (i LocationTagBindingArray) ToLocationTagBindingArrayOutput() LocationTagBindingArrayOutput {
	return i.ToLocationTagBindingArrayOutputWithContext(context.Background())
}

func (i LocationTagBindingArray) ToLocationTagBindingArrayOutputWithContext(ctx context.Context) LocationTagBindingArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LocationTagBindingArrayOutput)
}

// LocationTagBindingMapInput is an input type that accepts LocationTagBindingMap and LocationTagBindingMapOutput values.
// You can construct a concrete instance of `LocationTagBindingMapInput` via:
//
//	LocationTagBindingMap{ "key": LocationTagBindingArgs{...} }
type LocationTagBindingMapInput interface {
	pulumi.Input

	ToLocationTagBindingMapOutput() LocationTagBindingMapOutput
	ToLocationTagBindingMapOutputWithContext(context.Context) LocationTagBindingMapOutput
}

type LocationTagBindingMap map[string]LocationTagBindingInput

func (LocationTagBindingMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LocationTagBinding)(nil)).Elem()
}

func (i LocationTagBindingMap) ToLocationTagBindingMapOutput() LocationTagBindingMapOutput {
	return i.ToLocationTagBindingMapOutputWithContext(context.Background())
}

func (i LocationTagBindingMap) ToLocationTagBindingMapOutputWithContext(ctx context.Context) LocationTagBindingMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LocationTagBindingMapOutput)
}

type LocationTagBindingOutput struct{ *pulumi.OutputState }

func (LocationTagBindingOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**LocationTagBinding)(nil)).Elem()
}

func (o LocationTagBindingOutput) ToLocationTagBindingOutput() LocationTagBindingOutput {
	return o
}

func (o LocationTagBindingOutput) ToLocationTagBindingOutputWithContext(ctx context.Context) LocationTagBindingOutput {
	return o
}

// Location of the resource.
func (o LocationTagBindingOutput) Location() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *LocationTagBinding) pulumi.StringPtrOutput { return v.Location }).(pulumi.StringPtrOutput)
}

// The generated id for the TagBinding. This is a string of the form: `tagBindings/{parent}/{tag-value-name}`
func (o LocationTagBindingOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *LocationTagBinding) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The full resource name of the resource the TagValue is bound to. E.g. //cloudresourcemanager.googleapis.com/projects/123
func (o LocationTagBindingOutput) Parent() pulumi.StringOutput {
	return o.ApplyT(func(v *LocationTagBinding) pulumi.StringOutput { return v.Parent }).(pulumi.StringOutput)
}

// The TagValue of the TagBinding. Must be of the form tagValues/456.
func (o LocationTagBindingOutput) TagValue() pulumi.StringOutput {
	return o.ApplyT(func(v *LocationTagBinding) pulumi.StringOutput { return v.TagValue }).(pulumi.StringOutput)
}

type LocationTagBindingArrayOutput struct{ *pulumi.OutputState }

func (LocationTagBindingArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LocationTagBinding)(nil)).Elem()
}

func (o LocationTagBindingArrayOutput) ToLocationTagBindingArrayOutput() LocationTagBindingArrayOutput {
	return o
}

func (o LocationTagBindingArrayOutput) ToLocationTagBindingArrayOutputWithContext(ctx context.Context) LocationTagBindingArrayOutput {
	return o
}

func (o LocationTagBindingArrayOutput) Index(i pulumi.IntInput) LocationTagBindingOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *LocationTagBinding {
		return vs[0].([]*LocationTagBinding)[vs[1].(int)]
	}).(LocationTagBindingOutput)
}

type LocationTagBindingMapOutput struct{ *pulumi.OutputState }

func (LocationTagBindingMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LocationTagBinding)(nil)).Elem()
}

func (o LocationTagBindingMapOutput) ToLocationTagBindingMapOutput() LocationTagBindingMapOutput {
	return o
}

func (o LocationTagBindingMapOutput) ToLocationTagBindingMapOutputWithContext(ctx context.Context) LocationTagBindingMapOutput {
	return o
}

func (o LocationTagBindingMapOutput) MapIndex(k pulumi.StringInput) LocationTagBindingOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *LocationTagBinding {
		return vs[0].(map[string]*LocationTagBinding)[vs[1].(string)]
	}).(LocationTagBindingOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*LocationTagBindingInput)(nil)).Elem(), &LocationTagBinding{})
	pulumi.RegisterInputType(reflect.TypeOf((*LocationTagBindingArrayInput)(nil)).Elem(), LocationTagBindingArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*LocationTagBindingMapInput)(nil)).Elem(), LocationTagBindingMap{})
	pulumi.RegisterOutputType(LocationTagBindingOutput{})
	pulumi.RegisterOutputType(LocationTagBindingArrayOutput{})
	pulumi.RegisterOutputType(LocationTagBindingMapOutput{})
}