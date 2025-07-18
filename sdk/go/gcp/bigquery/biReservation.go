// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package bigquery

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Represents a BI Reservation.
//
// To get more information about BiReservation, see:
//
// * [API documentation](https://cloud.google.com/bigquery/docs/reference/reservations/rest/v1/BiReservation)
// * How-to Guides
//   - [Introduction to Reservations](https://cloud.google.com/bigquery/docs/reservations-intro)
//
// ## Example Usage
//
// ### Bigquery Reservation Bi Reservation Basic
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/bigquery"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := bigquery.NewBiReservation(ctx, "reservation", &bigquery.BiReservationArgs{
//				Location: pulumi.String("us-west2"),
//				Size:     pulumi.Int(3000000000),
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
// BiReservation can be imported using any of these accepted formats:
//
// * `projects/{{project}}/locations/{{location}}/biReservation`
//
// * `{{project}}/{{location}}`
//
// * `{{location}}`
//
// When using the `pulumi import` command, BiReservation can be imported using one of the formats above. For example:
//
// ```sh
// $ pulumi import gcp:bigquery/biReservation:BiReservation default projects/{{project}}/locations/{{location}}/biReservation
// ```
//
// ```sh
// $ pulumi import gcp:bigquery/biReservation:BiReservation default {{project}}/{{location}}
// ```
//
// ```sh
// $ pulumi import gcp:bigquery/biReservation:BiReservation default {{location}}
// ```
type BiReservation struct {
	pulumi.CustomResourceState

	// LOCATION_DESCRIPTION
	Location pulumi.StringOutput `pulumi:"location"`
	// The resource name of the singleton BI reservation. Reservation names have the form `projects/{projectId}/locations/{locationId}/biReservation`.
	Name pulumi.StringOutput `pulumi:"name"`
	// Preferred tables to use BI capacity for.
	// Structure is documented below.
	PreferredTables BiReservationPreferredTableArrayOutput `pulumi:"preferredTables"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringOutput `pulumi:"project"`
	// Size of a reservation, in bytes.
	Size pulumi.IntPtrOutput `pulumi:"size"`
	// The last update timestamp of a reservation.
	// A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
	UpdateTime pulumi.StringOutput `pulumi:"updateTime"`
}

// NewBiReservation registers a new resource with the given unique name, arguments, and options.
func NewBiReservation(ctx *pulumi.Context,
	name string, args *BiReservationArgs, opts ...pulumi.ResourceOption) (*BiReservation, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Location == nil {
		return nil, errors.New("invalid value for required argument 'Location'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource BiReservation
	err := ctx.RegisterResource("gcp:bigquery/biReservation:BiReservation", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetBiReservation gets an existing BiReservation resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetBiReservation(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *BiReservationState, opts ...pulumi.ResourceOption) (*BiReservation, error) {
	var resource BiReservation
	err := ctx.ReadResource("gcp:bigquery/biReservation:BiReservation", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering BiReservation resources.
type biReservationState struct {
	// LOCATION_DESCRIPTION
	Location *string `pulumi:"location"`
	// The resource name of the singleton BI reservation. Reservation names have the form `projects/{projectId}/locations/{locationId}/biReservation`.
	Name *string `pulumi:"name"`
	// Preferred tables to use BI capacity for.
	// Structure is documented below.
	PreferredTables []BiReservationPreferredTable `pulumi:"preferredTables"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
	// Size of a reservation, in bytes.
	Size *int `pulumi:"size"`
	// The last update timestamp of a reservation.
	// A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
	UpdateTime *string `pulumi:"updateTime"`
}

type BiReservationState struct {
	// LOCATION_DESCRIPTION
	Location pulumi.StringPtrInput
	// The resource name of the singleton BI reservation. Reservation names have the form `projects/{projectId}/locations/{locationId}/biReservation`.
	Name pulumi.StringPtrInput
	// Preferred tables to use BI capacity for.
	// Structure is documented below.
	PreferredTables BiReservationPreferredTableArrayInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
	// Size of a reservation, in bytes.
	Size pulumi.IntPtrInput
	// The last update timestamp of a reservation.
	// A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
	UpdateTime pulumi.StringPtrInput
}

func (BiReservationState) ElementType() reflect.Type {
	return reflect.TypeOf((*biReservationState)(nil)).Elem()
}

type biReservationArgs struct {
	// LOCATION_DESCRIPTION
	Location string `pulumi:"location"`
	// Preferred tables to use BI capacity for.
	// Structure is documented below.
	PreferredTables []BiReservationPreferredTable `pulumi:"preferredTables"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
	// Size of a reservation, in bytes.
	Size *int `pulumi:"size"`
}

// The set of arguments for constructing a BiReservation resource.
type BiReservationArgs struct {
	// LOCATION_DESCRIPTION
	Location pulumi.StringInput
	// Preferred tables to use BI capacity for.
	// Structure is documented below.
	PreferredTables BiReservationPreferredTableArrayInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
	// Size of a reservation, in bytes.
	Size pulumi.IntPtrInput
}

func (BiReservationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*biReservationArgs)(nil)).Elem()
}

type BiReservationInput interface {
	pulumi.Input

	ToBiReservationOutput() BiReservationOutput
	ToBiReservationOutputWithContext(ctx context.Context) BiReservationOutput
}

func (*BiReservation) ElementType() reflect.Type {
	return reflect.TypeOf((**BiReservation)(nil)).Elem()
}

func (i *BiReservation) ToBiReservationOutput() BiReservationOutput {
	return i.ToBiReservationOutputWithContext(context.Background())
}

func (i *BiReservation) ToBiReservationOutputWithContext(ctx context.Context) BiReservationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BiReservationOutput)
}

// BiReservationArrayInput is an input type that accepts BiReservationArray and BiReservationArrayOutput values.
// You can construct a concrete instance of `BiReservationArrayInput` via:
//
//	BiReservationArray{ BiReservationArgs{...} }
type BiReservationArrayInput interface {
	pulumi.Input

	ToBiReservationArrayOutput() BiReservationArrayOutput
	ToBiReservationArrayOutputWithContext(context.Context) BiReservationArrayOutput
}

type BiReservationArray []BiReservationInput

func (BiReservationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*BiReservation)(nil)).Elem()
}

func (i BiReservationArray) ToBiReservationArrayOutput() BiReservationArrayOutput {
	return i.ToBiReservationArrayOutputWithContext(context.Background())
}

func (i BiReservationArray) ToBiReservationArrayOutputWithContext(ctx context.Context) BiReservationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BiReservationArrayOutput)
}

// BiReservationMapInput is an input type that accepts BiReservationMap and BiReservationMapOutput values.
// You can construct a concrete instance of `BiReservationMapInput` via:
//
//	BiReservationMap{ "key": BiReservationArgs{...} }
type BiReservationMapInput interface {
	pulumi.Input

	ToBiReservationMapOutput() BiReservationMapOutput
	ToBiReservationMapOutputWithContext(context.Context) BiReservationMapOutput
}

type BiReservationMap map[string]BiReservationInput

func (BiReservationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*BiReservation)(nil)).Elem()
}

func (i BiReservationMap) ToBiReservationMapOutput() BiReservationMapOutput {
	return i.ToBiReservationMapOutputWithContext(context.Background())
}

func (i BiReservationMap) ToBiReservationMapOutputWithContext(ctx context.Context) BiReservationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BiReservationMapOutput)
}

type BiReservationOutput struct{ *pulumi.OutputState }

func (BiReservationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**BiReservation)(nil)).Elem()
}

func (o BiReservationOutput) ToBiReservationOutput() BiReservationOutput {
	return o
}

func (o BiReservationOutput) ToBiReservationOutputWithContext(ctx context.Context) BiReservationOutput {
	return o
}

// LOCATION_DESCRIPTION
func (o BiReservationOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *BiReservation) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// The resource name of the singleton BI reservation. Reservation names have the form `projects/{projectId}/locations/{locationId}/biReservation`.
func (o BiReservationOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *BiReservation) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Preferred tables to use BI capacity for.
// Structure is documented below.
func (o BiReservationOutput) PreferredTables() BiReservationPreferredTableArrayOutput {
	return o.ApplyT(func(v *BiReservation) BiReservationPreferredTableArrayOutput { return v.PreferredTables }).(BiReservationPreferredTableArrayOutput)
}

// The ID of the project in which the resource belongs.
// If it is not provided, the provider project is used.
func (o BiReservationOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *BiReservation) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// Size of a reservation, in bytes.
func (o BiReservationOutput) Size() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *BiReservation) pulumi.IntPtrOutput { return v.Size }).(pulumi.IntPtrOutput)
}

// The last update timestamp of a reservation.
// A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
func (o BiReservationOutput) UpdateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *BiReservation) pulumi.StringOutput { return v.UpdateTime }).(pulumi.StringOutput)
}

type BiReservationArrayOutput struct{ *pulumi.OutputState }

func (BiReservationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*BiReservation)(nil)).Elem()
}

func (o BiReservationArrayOutput) ToBiReservationArrayOutput() BiReservationArrayOutput {
	return o
}

func (o BiReservationArrayOutput) ToBiReservationArrayOutputWithContext(ctx context.Context) BiReservationArrayOutput {
	return o
}

func (o BiReservationArrayOutput) Index(i pulumi.IntInput) BiReservationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *BiReservation {
		return vs[0].([]*BiReservation)[vs[1].(int)]
	}).(BiReservationOutput)
}

type BiReservationMapOutput struct{ *pulumi.OutputState }

func (BiReservationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*BiReservation)(nil)).Elem()
}

func (o BiReservationMapOutput) ToBiReservationMapOutput() BiReservationMapOutput {
	return o
}

func (o BiReservationMapOutput) ToBiReservationMapOutputWithContext(ctx context.Context) BiReservationMapOutput {
	return o
}

func (o BiReservationMapOutput) MapIndex(k pulumi.StringInput) BiReservationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *BiReservation {
		return vs[0].(map[string]*BiReservation)[vs[1].(string)]
	}).(BiReservationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*BiReservationInput)(nil)).Elem(), &BiReservation{})
	pulumi.RegisterInputType(reflect.TypeOf((*BiReservationArrayInput)(nil)).Elem(), BiReservationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*BiReservationMapInput)(nil)).Elem(), BiReservationMap{})
	pulumi.RegisterOutputType(BiReservationOutput{})
	pulumi.RegisterOutputType(BiReservationArrayOutput{})
	pulumi.RegisterOutputType(BiReservationMapOutput{})
}
