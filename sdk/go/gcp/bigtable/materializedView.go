// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package bigtable

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// A materialized view object that can be referenced in SQL queries.
//
// To get more information about MaterializedView, see:
//
// * [API documentation](https://cloud.google.com/bigtable/docs/reference/admin/rest/v2/projects.instances.materializedViews)
//
// ## Example Usage
//
// ### Bigtable Materialized View
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/bigtable"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			instance, err := bigtable.NewInstance(ctx, "instance", &bigtable.InstanceArgs{
//				Name: pulumi.String("bt-instance"),
//				Clusters: bigtable.InstanceClusterArray{
//					&bigtable.InstanceClusterArgs{
//						ClusterId:   pulumi.String("cluster-1"),
//						Zone:        pulumi.String("us-east1-b"),
//						NumNodes:    pulumi.Int(3),
//						StorageType: pulumi.String("HDD"),
//					},
//				},
//				DeletionProtection: pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			table, err := bigtable.NewTable(ctx, "table", &bigtable.TableArgs{
//				Name:         pulumi.String("bt-table"),
//				InstanceName: instance.Name,
//				ColumnFamilies: bigtable.TableColumnFamilyArray{
//					&bigtable.TableColumnFamilyArgs{
//						Family: pulumi.String("CF"),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = bigtable.NewMaterializedView(ctx, "materialized_view", &bigtable.MaterializedViewArgs{
//				MaterializedViewId: pulumi.String("bt-materialized-view"),
//				Instance:           instance.Name,
//				DeletionProtection: pulumi.Bool(false),
//				Query:              pulumi.String("SELECT _key, COUNT(CF['col1']) as Count\nFROM ` + \"`bt-table`\" + `\nGROUP BY _key\n"),
//			}, pulumi.DependsOn([]pulumi.Resource{
//				table,
//			}))
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
// MaterializedView can be imported using any of these accepted formats:
//
// * `projects/{{project}}/instances/{{instance}}/materializedViews/{{materialized_view_id}}`
//
// * `{{project}}/{{instance}}/{{materialized_view_id}}`
//
// * `{{instance}}/{{materialized_view_id}}`
//
// When using the `pulumi import` command, MaterializedView can be imported using one of the formats above. For example:
//
// ```sh
// $ pulumi import gcp:bigtable/materializedView:MaterializedView default projects/{{project}}/instances/{{instance}}/materializedViews/{{materialized_view_id}}
// ```
//
// ```sh
// $ pulumi import gcp:bigtable/materializedView:MaterializedView default {{project}}/{{instance}}/{{materialized_view_id}}
// ```
//
// ```sh
// $ pulumi import gcp:bigtable/materializedView:MaterializedView default {{instance}}/{{materialized_view_id}}
// ```
type MaterializedView struct {
	pulumi.CustomResourceState

	// Set to true to make the MaterializedView protected against deletion.
	DeletionProtection pulumi.BoolPtrOutput `pulumi:"deletionProtection"`
	// The name of the instance to create the materialized view within.
	Instance pulumi.StringPtrOutput `pulumi:"instance"`
	// The unique name of the materialized view in the form `[_a-zA-Z0-9][-_.a-zA-Z0-9]*`.
	MaterializedViewId pulumi.StringOutput `pulumi:"materializedViewId"`
	// The unique name of the requested materialized view. Values are of the form `projects/<project>/instances/<instance>/materializedViews/<materializedViewId>`.
	Name pulumi.StringOutput `pulumi:"name"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringOutput `pulumi:"project"`
	// The materialized view's select query.
	Query pulumi.StringOutput `pulumi:"query"`
}

// NewMaterializedView registers a new resource with the given unique name, arguments, and options.
func NewMaterializedView(ctx *pulumi.Context,
	name string, args *MaterializedViewArgs, opts ...pulumi.ResourceOption) (*MaterializedView, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.MaterializedViewId == nil {
		return nil, errors.New("invalid value for required argument 'MaterializedViewId'")
	}
	if args.Query == nil {
		return nil, errors.New("invalid value for required argument 'Query'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource MaterializedView
	err := ctx.RegisterResource("gcp:bigtable/materializedView:MaterializedView", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetMaterializedView gets an existing MaterializedView resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetMaterializedView(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *MaterializedViewState, opts ...pulumi.ResourceOption) (*MaterializedView, error) {
	var resource MaterializedView
	err := ctx.ReadResource("gcp:bigtable/materializedView:MaterializedView", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering MaterializedView resources.
type materializedViewState struct {
	// Set to true to make the MaterializedView protected against deletion.
	DeletionProtection *bool `pulumi:"deletionProtection"`
	// The name of the instance to create the materialized view within.
	Instance *string `pulumi:"instance"`
	// The unique name of the materialized view in the form `[_a-zA-Z0-9][-_.a-zA-Z0-9]*`.
	MaterializedViewId *string `pulumi:"materializedViewId"`
	// The unique name of the requested materialized view. Values are of the form `projects/<project>/instances/<instance>/materializedViews/<materializedViewId>`.
	Name *string `pulumi:"name"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
	// The materialized view's select query.
	Query *string `pulumi:"query"`
}

type MaterializedViewState struct {
	// Set to true to make the MaterializedView protected against deletion.
	DeletionProtection pulumi.BoolPtrInput
	// The name of the instance to create the materialized view within.
	Instance pulumi.StringPtrInput
	// The unique name of the materialized view in the form `[_a-zA-Z0-9][-_.a-zA-Z0-9]*`.
	MaterializedViewId pulumi.StringPtrInput
	// The unique name of the requested materialized view. Values are of the form `projects/<project>/instances/<instance>/materializedViews/<materializedViewId>`.
	Name pulumi.StringPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
	// The materialized view's select query.
	Query pulumi.StringPtrInput
}

func (MaterializedViewState) ElementType() reflect.Type {
	return reflect.TypeOf((*materializedViewState)(nil)).Elem()
}

type materializedViewArgs struct {
	// Set to true to make the MaterializedView protected against deletion.
	DeletionProtection *bool `pulumi:"deletionProtection"`
	// The name of the instance to create the materialized view within.
	Instance *string `pulumi:"instance"`
	// The unique name of the materialized view in the form `[_a-zA-Z0-9][-_.a-zA-Z0-9]*`.
	MaterializedViewId string `pulumi:"materializedViewId"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
	// The materialized view's select query.
	Query string `pulumi:"query"`
}

// The set of arguments for constructing a MaterializedView resource.
type MaterializedViewArgs struct {
	// Set to true to make the MaterializedView protected against deletion.
	DeletionProtection pulumi.BoolPtrInput
	// The name of the instance to create the materialized view within.
	Instance pulumi.StringPtrInput
	// The unique name of the materialized view in the form `[_a-zA-Z0-9][-_.a-zA-Z0-9]*`.
	MaterializedViewId pulumi.StringInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
	// The materialized view's select query.
	Query pulumi.StringInput
}

func (MaterializedViewArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*materializedViewArgs)(nil)).Elem()
}

type MaterializedViewInput interface {
	pulumi.Input

	ToMaterializedViewOutput() MaterializedViewOutput
	ToMaterializedViewOutputWithContext(ctx context.Context) MaterializedViewOutput
}

func (*MaterializedView) ElementType() reflect.Type {
	return reflect.TypeOf((**MaterializedView)(nil)).Elem()
}

func (i *MaterializedView) ToMaterializedViewOutput() MaterializedViewOutput {
	return i.ToMaterializedViewOutputWithContext(context.Background())
}

func (i *MaterializedView) ToMaterializedViewOutputWithContext(ctx context.Context) MaterializedViewOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MaterializedViewOutput)
}

// MaterializedViewArrayInput is an input type that accepts MaterializedViewArray and MaterializedViewArrayOutput values.
// You can construct a concrete instance of `MaterializedViewArrayInput` via:
//
//	MaterializedViewArray{ MaterializedViewArgs{...} }
type MaterializedViewArrayInput interface {
	pulumi.Input

	ToMaterializedViewArrayOutput() MaterializedViewArrayOutput
	ToMaterializedViewArrayOutputWithContext(context.Context) MaterializedViewArrayOutput
}

type MaterializedViewArray []MaterializedViewInput

func (MaterializedViewArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MaterializedView)(nil)).Elem()
}

func (i MaterializedViewArray) ToMaterializedViewArrayOutput() MaterializedViewArrayOutput {
	return i.ToMaterializedViewArrayOutputWithContext(context.Background())
}

func (i MaterializedViewArray) ToMaterializedViewArrayOutputWithContext(ctx context.Context) MaterializedViewArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MaterializedViewArrayOutput)
}

// MaterializedViewMapInput is an input type that accepts MaterializedViewMap and MaterializedViewMapOutput values.
// You can construct a concrete instance of `MaterializedViewMapInput` via:
//
//	MaterializedViewMap{ "key": MaterializedViewArgs{...} }
type MaterializedViewMapInput interface {
	pulumi.Input

	ToMaterializedViewMapOutput() MaterializedViewMapOutput
	ToMaterializedViewMapOutputWithContext(context.Context) MaterializedViewMapOutput
}

type MaterializedViewMap map[string]MaterializedViewInput

func (MaterializedViewMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MaterializedView)(nil)).Elem()
}

func (i MaterializedViewMap) ToMaterializedViewMapOutput() MaterializedViewMapOutput {
	return i.ToMaterializedViewMapOutputWithContext(context.Background())
}

func (i MaterializedViewMap) ToMaterializedViewMapOutputWithContext(ctx context.Context) MaterializedViewMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MaterializedViewMapOutput)
}

type MaterializedViewOutput struct{ *pulumi.OutputState }

func (MaterializedViewOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**MaterializedView)(nil)).Elem()
}

func (o MaterializedViewOutput) ToMaterializedViewOutput() MaterializedViewOutput {
	return o
}

func (o MaterializedViewOutput) ToMaterializedViewOutputWithContext(ctx context.Context) MaterializedViewOutput {
	return o
}

// Set to true to make the MaterializedView protected against deletion.
func (o MaterializedViewOutput) DeletionProtection() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *MaterializedView) pulumi.BoolPtrOutput { return v.DeletionProtection }).(pulumi.BoolPtrOutput)
}

// The name of the instance to create the materialized view within.
func (o MaterializedViewOutput) Instance() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *MaterializedView) pulumi.StringPtrOutput { return v.Instance }).(pulumi.StringPtrOutput)
}

// The unique name of the materialized view in the form `[_a-zA-Z0-9][-_.a-zA-Z0-9]*`.
func (o MaterializedViewOutput) MaterializedViewId() pulumi.StringOutput {
	return o.ApplyT(func(v *MaterializedView) pulumi.StringOutput { return v.MaterializedViewId }).(pulumi.StringOutput)
}

// The unique name of the requested materialized view. Values are of the form `projects/<project>/instances/<instance>/materializedViews/<materializedViewId>`.
func (o MaterializedViewOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *MaterializedView) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The ID of the project in which the resource belongs.
// If it is not provided, the provider project is used.
func (o MaterializedViewOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *MaterializedView) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// The materialized view's select query.
func (o MaterializedViewOutput) Query() pulumi.StringOutput {
	return o.ApplyT(func(v *MaterializedView) pulumi.StringOutput { return v.Query }).(pulumi.StringOutput)
}

type MaterializedViewArrayOutput struct{ *pulumi.OutputState }

func (MaterializedViewArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MaterializedView)(nil)).Elem()
}

func (o MaterializedViewArrayOutput) ToMaterializedViewArrayOutput() MaterializedViewArrayOutput {
	return o
}

func (o MaterializedViewArrayOutput) ToMaterializedViewArrayOutputWithContext(ctx context.Context) MaterializedViewArrayOutput {
	return o
}

func (o MaterializedViewArrayOutput) Index(i pulumi.IntInput) MaterializedViewOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *MaterializedView {
		return vs[0].([]*MaterializedView)[vs[1].(int)]
	}).(MaterializedViewOutput)
}

type MaterializedViewMapOutput struct{ *pulumi.OutputState }

func (MaterializedViewMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MaterializedView)(nil)).Elem()
}

func (o MaterializedViewMapOutput) ToMaterializedViewMapOutput() MaterializedViewMapOutput {
	return o
}

func (o MaterializedViewMapOutput) ToMaterializedViewMapOutputWithContext(ctx context.Context) MaterializedViewMapOutput {
	return o
}

func (o MaterializedViewMapOutput) MapIndex(k pulumi.StringInput) MaterializedViewOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *MaterializedView {
		return vs[0].(map[string]*MaterializedView)[vs[1].(string)]
	}).(MaterializedViewOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*MaterializedViewInput)(nil)).Elem(), &MaterializedView{})
	pulumi.RegisterInputType(reflect.TypeOf((*MaterializedViewArrayInput)(nil)).Elem(), MaterializedViewArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*MaterializedViewMapInput)(nil)).Elem(), MaterializedViewMap{})
	pulumi.RegisterOutputType(MaterializedViewOutput{})
	pulumi.RegisterOutputType(MaterializedViewArrayOutput{})
	pulumi.RegisterOutputType(MaterializedViewMapOutput{})
}
