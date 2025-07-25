// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package compute

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Represents a reservation resource. A reservation ensures that capacity is
// held in a specific zone even if the reserved VMs are not running.
//
// Reservations apply only to Compute Engine, Cloud Dataproc, and Google
// Kubernetes Engine VM usage.Reservations do not apply to `f1-micro` or
// `g1-small` machine types, preemptible VMs, sole tenant nodes, or other
// services not listed above
// like Cloud SQL and Dataflow.
//
// To get more information about Reservation, see:
//
// * [API documentation](https://cloud.google.com/compute/docs/reference/rest/v1/reservations)
// * How-to Guides
//   - [Reserving zonal resources](https://cloud.google.com/compute/docs/instances/reserving-zonal-resources)
//
// ## Example Usage
//
// ### Reservation Basic
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/compute"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := compute.NewReservation(ctx, "gce_reservation", &compute.ReservationArgs{
//				Name: pulumi.String("gce-reservation"),
//				Zone: pulumi.String("us-central1-a"),
//				SpecificReservation: &compute.ReservationSpecificReservationArgs{
//					Count: pulumi.Int(1),
//					InstanceProperties: &compute.ReservationSpecificReservationInstancePropertiesArgs{
//						MinCpuPlatform: pulumi.String("Intel Cascade Lake"),
//						MachineType:    pulumi.String("n2-standard-2"),
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
// ### Reservation Basic Beta
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/compute"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := compute.NewReservation(ctx, "gce_reservation", &compute.ReservationArgs{
//				Name: pulumi.String("gce-reservation"),
//				Zone: pulumi.String("us-central1-a"),
//				SpecificReservation: &compute.ReservationSpecificReservationArgs{
//					Count: pulumi.Int(1),
//					InstanceProperties: &compute.ReservationSpecificReservationInstancePropertiesArgs{
//						MinCpuPlatform:      pulumi.String("Intel Cascade Lake"),
//						MachineType:         pulumi.String("n2-standard-2"),
//						MaintenanceInterval: pulumi.String("PERIODIC"),
//					},
//				},
//				EnableEmergentMaintenance: pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Reservation Source Instance Template
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/compute"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			myImage, err := compute.LookupImage(ctx, &compute.LookupImageArgs{
//				Family:  pulumi.StringRef("debian-11"),
//				Project: pulumi.StringRef("debian-cloud"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			foobar, err := compute.NewInstanceTemplate(ctx, "foobar", &compute.InstanceTemplateArgs{
//				Name:         pulumi.String("tf-test-instance-template"),
//				MachineType:  pulumi.String("n2-standard-2"),
//				CanIpForward: pulumi.Bool(false),
//				Tags: pulumi.StringArray{
//					pulumi.String("foo"),
//					pulumi.String("bar"),
//				},
//				Disks: compute.InstanceTemplateDiskArray{
//					&compute.InstanceTemplateDiskArgs{
//						SourceImage: pulumi.String(myImage.SelfLink),
//						AutoDelete:  pulumi.Bool(true),
//						Boot:        pulumi.Bool(true),
//					},
//				},
//				NetworkInterfaces: compute.InstanceTemplateNetworkInterfaceArray{
//					&compute.InstanceTemplateNetworkInterfaceArgs{
//						Network: pulumi.String("default"),
//					},
//				},
//				Scheduling: &compute.InstanceTemplateSchedulingArgs{
//					Preemptible:      pulumi.Bool(false),
//					AutomaticRestart: pulumi.Bool(true),
//				},
//				Metadata: pulumi.StringMap{
//					"foo": pulumi.String("bar"),
//				},
//				ServiceAccount: &compute.InstanceTemplateServiceAccountArgs{
//					Scopes: pulumi.StringArray{
//						pulumi.String("userinfo-email"),
//						pulumi.String("compute-ro"),
//						pulumi.String("storage-ro"),
//					},
//				},
//				Labels: pulumi.StringMap{
//					"my_label": pulumi.String("foobar"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = compute.NewReservation(ctx, "gce_reservation_source_instance_template", &compute.ReservationArgs{
//				Name: pulumi.String("gce-reservation-source-instance-template"),
//				Zone: pulumi.String("us-central1-a"),
//				SpecificReservation: &compute.ReservationSpecificReservationArgs{
//					Count:                  pulumi.Int(1),
//					SourceInstanceTemplate: foobar.SelfLink,
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
// ### Reservation Sharing Policy
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/compute"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			myImage, err := compute.LookupImage(ctx, &compute.LookupImageArgs{
//				Family:  pulumi.StringRef("debian-11"),
//				Project: pulumi.StringRef("debian-cloud"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			foobar, err := compute.NewInstanceTemplate(ctx, "foobar", &compute.InstanceTemplateArgs{
//				Name:         pulumi.String("tf-test-instance-template"),
//				MachineType:  pulumi.String("g2-standard-4"),
//				CanIpForward: pulumi.Bool(false),
//				Tags: pulumi.StringArray{
//					pulumi.String("foo"),
//					pulumi.String("bar"),
//				},
//				Disks: compute.InstanceTemplateDiskArray{
//					&compute.InstanceTemplateDiskArgs{
//						SourceImage: pulumi.String(myImage.SelfLink),
//						AutoDelete:  pulumi.Bool(true),
//						Boot:        pulumi.Bool(true),
//					},
//				},
//				NetworkInterfaces: compute.InstanceTemplateNetworkInterfaceArray{
//					&compute.InstanceTemplateNetworkInterfaceArgs{
//						Network: pulumi.String("default"),
//					},
//				},
//				Scheduling: &compute.InstanceTemplateSchedulingArgs{
//					Preemptible:      pulumi.Bool(false),
//					AutomaticRestart: pulumi.Bool(true),
//				},
//				Metadata: pulumi.StringMap{
//					"foo": pulumi.String("bar"),
//				},
//				ServiceAccount: &compute.InstanceTemplateServiceAccountArgs{
//					Scopes: pulumi.StringArray{
//						pulumi.String("userinfo-email"),
//						pulumi.String("compute-ro"),
//						pulumi.String("storage-ro"),
//					},
//				},
//				Labels: pulumi.StringMap{
//					"my_label": pulumi.String("foobar"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = compute.NewReservation(ctx, "gce_reservation_sharing_policy", &compute.ReservationArgs{
//				Name: pulumi.String("gce-reservation-sharing-policy"),
//				Zone: pulumi.String("us-central1-b"),
//				SpecificReservation: &compute.ReservationSpecificReservationArgs{
//					Count:                  pulumi.Int(2),
//					SourceInstanceTemplate: foobar.SelfLink,
//				},
//				ReservationSharingPolicy: &compute.ReservationReservationSharingPolicyArgs{
//					ServiceShareType: pulumi.String("ALLOW_ALL"),
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
// Reservation can be imported using any of these accepted formats:
//
// * `projects/{{project}}/zones/{{zone}}/reservations/{{name}}`
//
// * `{{project}}/{{zone}}/{{name}}`
//
// * `{{zone}}/{{name}}`
//
// * `{{name}}`
//
// When using the `pulumi import` command, Reservation can be imported using one of the formats above. For example:
//
// ```sh
// $ pulumi import gcp:compute/reservation:Reservation default projects/{{project}}/zones/{{zone}}/reservations/{{name}}
// ```
//
// ```sh
// $ pulumi import gcp:compute/reservation:Reservation default {{project}}/{{zone}}/{{name}}
// ```
//
// ```sh
// $ pulumi import gcp:compute/reservation:Reservation default {{zone}}/{{name}}
// ```
//
// ```sh
// $ pulumi import gcp:compute/reservation:Reservation default {{name}}
// ```
type Reservation struct {
	pulumi.CustomResourceState

	// Full or partial URL to a parent commitment. This field displays for
	// reservations that are tied to a commitment.
	Commitment pulumi.StringOutput `pulumi:"commitment"`
	// Creation timestamp in RFC3339 text format.
	CreationTimestamp pulumi.StringOutput `pulumi:"creationTimestamp"`
	// Duration after which the reservation will be auto-deleted by Compute Engine. Cannot be used with delete_at_time.
	// Structure is documented below.
	DeleteAfterDuration ReservationDeleteAfterDurationPtrOutput `pulumi:"deleteAfterDuration"`
	// Absolute time in future when the reservation will be auto-deleted by Compute Engine. Timestamp is represented in RFC3339 text format.
	// Cannot be used with delete_after_duration.
	DeleteAtTime pulumi.StringOutput `pulumi:"deleteAtTime"`
	// An optional description of this resource.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Indicates if this group of VMs have emergent maintenance enabled.
	EnableEmergentMaintenance pulumi.BoolPtrOutput `pulumi:"enableEmergentMaintenance"`
	// Name of the resource. Provided by the client when the resource is
	// created. The name must be 1-63 characters long, and comply with
	// RFC1035. Specifically, the name must be 1-63 characters long and match
	// the regular expression `a-z?` which means the
	// first character must be a lowercase letter, and all following
	// characters must be a dash, lowercase letter, or digit, except the last
	// character, which cannot be a dash.
	Name pulumi.StringOutput `pulumi:"name"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringOutput `pulumi:"project"`
	// Sharing policy for reservations with Google Cloud managed services.
	// Structure is documented below.
	ReservationSharingPolicy ReservationReservationSharingPolicyOutput `pulumi:"reservationSharingPolicy"`
	// The URI of the created resource.
	SelfLink pulumi.StringOutput `pulumi:"selfLink"`
	// The share setting for reservations.
	// Structure is documented below.
	ShareSettings ReservationShareSettingsOutput `pulumi:"shareSettings"`
	// Reservation for instances with specific machine shapes.
	// Structure is documented below.
	SpecificReservation ReservationSpecificReservationOutput `pulumi:"specificReservation"`
	// When set to true, only VMs that target this reservation by name can
	// consume this reservation. Otherwise, it can be consumed by VMs with
	// affinity for any reservation. Defaults to false.
	SpecificReservationRequired pulumi.BoolPtrOutput `pulumi:"specificReservationRequired"`
	// The status of the reservation.
	Status pulumi.StringOutput `pulumi:"status"`
	// The zone where the reservation is made.
	Zone pulumi.StringOutput `pulumi:"zone"`
}

// NewReservation registers a new resource with the given unique name, arguments, and options.
func NewReservation(ctx *pulumi.Context,
	name string, args *ReservationArgs, opts ...pulumi.ResourceOption) (*Reservation, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.SpecificReservation == nil {
		return nil, errors.New("invalid value for required argument 'SpecificReservation'")
	}
	if args.Zone == nil {
		return nil, errors.New("invalid value for required argument 'Zone'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Reservation
	err := ctx.RegisterResource("gcp:compute/reservation:Reservation", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetReservation gets an existing Reservation resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetReservation(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ReservationState, opts ...pulumi.ResourceOption) (*Reservation, error) {
	var resource Reservation
	err := ctx.ReadResource("gcp:compute/reservation:Reservation", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Reservation resources.
type reservationState struct {
	// Full or partial URL to a parent commitment. This field displays for
	// reservations that are tied to a commitment.
	Commitment *string `pulumi:"commitment"`
	// Creation timestamp in RFC3339 text format.
	CreationTimestamp *string `pulumi:"creationTimestamp"`
	// Duration after which the reservation will be auto-deleted by Compute Engine. Cannot be used with delete_at_time.
	// Structure is documented below.
	DeleteAfterDuration *ReservationDeleteAfterDuration `pulumi:"deleteAfterDuration"`
	// Absolute time in future when the reservation will be auto-deleted by Compute Engine. Timestamp is represented in RFC3339 text format.
	// Cannot be used with delete_after_duration.
	DeleteAtTime *string `pulumi:"deleteAtTime"`
	// An optional description of this resource.
	Description *string `pulumi:"description"`
	// Indicates if this group of VMs have emergent maintenance enabled.
	EnableEmergentMaintenance *bool `pulumi:"enableEmergentMaintenance"`
	// Name of the resource. Provided by the client when the resource is
	// created. The name must be 1-63 characters long, and comply with
	// RFC1035. Specifically, the name must be 1-63 characters long and match
	// the regular expression `a-z?` which means the
	// first character must be a lowercase letter, and all following
	// characters must be a dash, lowercase letter, or digit, except the last
	// character, which cannot be a dash.
	Name *string `pulumi:"name"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
	// Sharing policy for reservations with Google Cloud managed services.
	// Structure is documented below.
	ReservationSharingPolicy *ReservationReservationSharingPolicy `pulumi:"reservationSharingPolicy"`
	// The URI of the created resource.
	SelfLink *string `pulumi:"selfLink"`
	// The share setting for reservations.
	// Structure is documented below.
	ShareSettings *ReservationShareSettings `pulumi:"shareSettings"`
	// Reservation for instances with specific machine shapes.
	// Structure is documented below.
	SpecificReservation *ReservationSpecificReservation `pulumi:"specificReservation"`
	// When set to true, only VMs that target this reservation by name can
	// consume this reservation. Otherwise, it can be consumed by VMs with
	// affinity for any reservation. Defaults to false.
	SpecificReservationRequired *bool `pulumi:"specificReservationRequired"`
	// The status of the reservation.
	Status *string `pulumi:"status"`
	// The zone where the reservation is made.
	Zone *string `pulumi:"zone"`
}

type ReservationState struct {
	// Full or partial URL to a parent commitment. This field displays for
	// reservations that are tied to a commitment.
	Commitment pulumi.StringPtrInput
	// Creation timestamp in RFC3339 text format.
	CreationTimestamp pulumi.StringPtrInput
	// Duration after which the reservation will be auto-deleted by Compute Engine. Cannot be used with delete_at_time.
	// Structure is documented below.
	DeleteAfterDuration ReservationDeleteAfterDurationPtrInput
	// Absolute time in future when the reservation will be auto-deleted by Compute Engine. Timestamp is represented in RFC3339 text format.
	// Cannot be used with delete_after_duration.
	DeleteAtTime pulumi.StringPtrInput
	// An optional description of this resource.
	Description pulumi.StringPtrInput
	// Indicates if this group of VMs have emergent maintenance enabled.
	EnableEmergentMaintenance pulumi.BoolPtrInput
	// Name of the resource. Provided by the client when the resource is
	// created. The name must be 1-63 characters long, and comply with
	// RFC1035. Specifically, the name must be 1-63 characters long and match
	// the regular expression `a-z?` which means the
	// first character must be a lowercase letter, and all following
	// characters must be a dash, lowercase letter, or digit, except the last
	// character, which cannot be a dash.
	Name pulumi.StringPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
	// Sharing policy for reservations with Google Cloud managed services.
	// Structure is documented below.
	ReservationSharingPolicy ReservationReservationSharingPolicyPtrInput
	// The URI of the created resource.
	SelfLink pulumi.StringPtrInput
	// The share setting for reservations.
	// Structure is documented below.
	ShareSettings ReservationShareSettingsPtrInput
	// Reservation for instances with specific machine shapes.
	// Structure is documented below.
	SpecificReservation ReservationSpecificReservationPtrInput
	// When set to true, only VMs that target this reservation by name can
	// consume this reservation. Otherwise, it can be consumed by VMs with
	// affinity for any reservation. Defaults to false.
	SpecificReservationRequired pulumi.BoolPtrInput
	// The status of the reservation.
	Status pulumi.StringPtrInput
	// The zone where the reservation is made.
	Zone pulumi.StringPtrInput
}

func (ReservationState) ElementType() reflect.Type {
	return reflect.TypeOf((*reservationState)(nil)).Elem()
}

type reservationArgs struct {
	// Duration after which the reservation will be auto-deleted by Compute Engine. Cannot be used with delete_at_time.
	// Structure is documented below.
	DeleteAfterDuration *ReservationDeleteAfterDuration `pulumi:"deleteAfterDuration"`
	// Absolute time in future when the reservation will be auto-deleted by Compute Engine. Timestamp is represented in RFC3339 text format.
	// Cannot be used with delete_after_duration.
	DeleteAtTime *string `pulumi:"deleteAtTime"`
	// An optional description of this resource.
	Description *string `pulumi:"description"`
	// Indicates if this group of VMs have emergent maintenance enabled.
	EnableEmergentMaintenance *bool `pulumi:"enableEmergentMaintenance"`
	// Name of the resource. Provided by the client when the resource is
	// created. The name must be 1-63 characters long, and comply with
	// RFC1035. Specifically, the name must be 1-63 characters long and match
	// the regular expression `a-z?` which means the
	// first character must be a lowercase letter, and all following
	// characters must be a dash, lowercase letter, or digit, except the last
	// character, which cannot be a dash.
	Name *string `pulumi:"name"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
	// Sharing policy for reservations with Google Cloud managed services.
	// Structure is documented below.
	ReservationSharingPolicy *ReservationReservationSharingPolicy `pulumi:"reservationSharingPolicy"`
	// The share setting for reservations.
	// Structure is documented below.
	ShareSettings *ReservationShareSettings `pulumi:"shareSettings"`
	// Reservation for instances with specific machine shapes.
	// Structure is documented below.
	SpecificReservation ReservationSpecificReservation `pulumi:"specificReservation"`
	// When set to true, only VMs that target this reservation by name can
	// consume this reservation. Otherwise, it can be consumed by VMs with
	// affinity for any reservation. Defaults to false.
	SpecificReservationRequired *bool `pulumi:"specificReservationRequired"`
	// The zone where the reservation is made.
	Zone string `pulumi:"zone"`
}

// The set of arguments for constructing a Reservation resource.
type ReservationArgs struct {
	// Duration after which the reservation will be auto-deleted by Compute Engine. Cannot be used with delete_at_time.
	// Structure is documented below.
	DeleteAfterDuration ReservationDeleteAfterDurationPtrInput
	// Absolute time in future when the reservation will be auto-deleted by Compute Engine. Timestamp is represented in RFC3339 text format.
	// Cannot be used with delete_after_duration.
	DeleteAtTime pulumi.StringPtrInput
	// An optional description of this resource.
	Description pulumi.StringPtrInput
	// Indicates if this group of VMs have emergent maintenance enabled.
	EnableEmergentMaintenance pulumi.BoolPtrInput
	// Name of the resource. Provided by the client when the resource is
	// created. The name must be 1-63 characters long, and comply with
	// RFC1035. Specifically, the name must be 1-63 characters long and match
	// the regular expression `a-z?` which means the
	// first character must be a lowercase letter, and all following
	// characters must be a dash, lowercase letter, or digit, except the last
	// character, which cannot be a dash.
	Name pulumi.StringPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
	// Sharing policy for reservations with Google Cloud managed services.
	// Structure is documented below.
	ReservationSharingPolicy ReservationReservationSharingPolicyPtrInput
	// The share setting for reservations.
	// Structure is documented below.
	ShareSettings ReservationShareSettingsPtrInput
	// Reservation for instances with specific machine shapes.
	// Structure is documented below.
	SpecificReservation ReservationSpecificReservationInput
	// When set to true, only VMs that target this reservation by name can
	// consume this reservation. Otherwise, it can be consumed by VMs with
	// affinity for any reservation. Defaults to false.
	SpecificReservationRequired pulumi.BoolPtrInput
	// The zone where the reservation is made.
	Zone pulumi.StringInput
}

func (ReservationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*reservationArgs)(nil)).Elem()
}

type ReservationInput interface {
	pulumi.Input

	ToReservationOutput() ReservationOutput
	ToReservationOutputWithContext(ctx context.Context) ReservationOutput
}

func (*Reservation) ElementType() reflect.Type {
	return reflect.TypeOf((**Reservation)(nil)).Elem()
}

func (i *Reservation) ToReservationOutput() ReservationOutput {
	return i.ToReservationOutputWithContext(context.Background())
}

func (i *Reservation) ToReservationOutputWithContext(ctx context.Context) ReservationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ReservationOutput)
}

// ReservationArrayInput is an input type that accepts ReservationArray and ReservationArrayOutput values.
// You can construct a concrete instance of `ReservationArrayInput` via:
//
//	ReservationArray{ ReservationArgs{...} }
type ReservationArrayInput interface {
	pulumi.Input

	ToReservationArrayOutput() ReservationArrayOutput
	ToReservationArrayOutputWithContext(context.Context) ReservationArrayOutput
}

type ReservationArray []ReservationInput

func (ReservationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Reservation)(nil)).Elem()
}

func (i ReservationArray) ToReservationArrayOutput() ReservationArrayOutput {
	return i.ToReservationArrayOutputWithContext(context.Background())
}

func (i ReservationArray) ToReservationArrayOutputWithContext(ctx context.Context) ReservationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ReservationArrayOutput)
}

// ReservationMapInput is an input type that accepts ReservationMap and ReservationMapOutput values.
// You can construct a concrete instance of `ReservationMapInput` via:
//
//	ReservationMap{ "key": ReservationArgs{...} }
type ReservationMapInput interface {
	pulumi.Input

	ToReservationMapOutput() ReservationMapOutput
	ToReservationMapOutputWithContext(context.Context) ReservationMapOutput
}

type ReservationMap map[string]ReservationInput

func (ReservationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Reservation)(nil)).Elem()
}

func (i ReservationMap) ToReservationMapOutput() ReservationMapOutput {
	return i.ToReservationMapOutputWithContext(context.Background())
}

func (i ReservationMap) ToReservationMapOutputWithContext(ctx context.Context) ReservationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ReservationMapOutput)
}

type ReservationOutput struct{ *pulumi.OutputState }

func (ReservationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Reservation)(nil)).Elem()
}

func (o ReservationOutput) ToReservationOutput() ReservationOutput {
	return o
}

func (o ReservationOutput) ToReservationOutputWithContext(ctx context.Context) ReservationOutput {
	return o
}

// Full or partial URL to a parent commitment. This field displays for
// reservations that are tied to a commitment.
func (o ReservationOutput) Commitment() pulumi.StringOutput {
	return o.ApplyT(func(v *Reservation) pulumi.StringOutput { return v.Commitment }).(pulumi.StringOutput)
}

// Creation timestamp in RFC3339 text format.
func (o ReservationOutput) CreationTimestamp() pulumi.StringOutput {
	return o.ApplyT(func(v *Reservation) pulumi.StringOutput { return v.CreationTimestamp }).(pulumi.StringOutput)
}

// Duration after which the reservation will be auto-deleted by Compute Engine. Cannot be used with delete_at_time.
// Structure is documented below.
func (o ReservationOutput) DeleteAfterDuration() ReservationDeleteAfterDurationPtrOutput {
	return o.ApplyT(func(v *Reservation) ReservationDeleteAfterDurationPtrOutput { return v.DeleteAfterDuration }).(ReservationDeleteAfterDurationPtrOutput)
}

// Absolute time in future when the reservation will be auto-deleted by Compute Engine. Timestamp is represented in RFC3339 text format.
// Cannot be used with delete_after_duration.
func (o ReservationOutput) DeleteAtTime() pulumi.StringOutput {
	return o.ApplyT(func(v *Reservation) pulumi.StringOutput { return v.DeleteAtTime }).(pulumi.StringOutput)
}

// An optional description of this resource.
func (o ReservationOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Reservation) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Indicates if this group of VMs have emergent maintenance enabled.
func (o ReservationOutput) EnableEmergentMaintenance() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Reservation) pulumi.BoolPtrOutput { return v.EnableEmergentMaintenance }).(pulumi.BoolPtrOutput)
}

// Name of the resource. Provided by the client when the resource is
// created. The name must be 1-63 characters long, and comply with
// RFC1035. Specifically, the name must be 1-63 characters long and match
// the regular expression `a-z?` which means the
// first character must be a lowercase letter, and all following
// characters must be a dash, lowercase letter, or digit, except the last
// character, which cannot be a dash.
func (o ReservationOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Reservation) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The ID of the project in which the resource belongs.
// If it is not provided, the provider project is used.
func (o ReservationOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *Reservation) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// Sharing policy for reservations with Google Cloud managed services.
// Structure is documented below.
func (o ReservationOutput) ReservationSharingPolicy() ReservationReservationSharingPolicyOutput {
	return o.ApplyT(func(v *Reservation) ReservationReservationSharingPolicyOutput { return v.ReservationSharingPolicy }).(ReservationReservationSharingPolicyOutput)
}

// The URI of the created resource.
func (o ReservationOutput) SelfLink() pulumi.StringOutput {
	return o.ApplyT(func(v *Reservation) pulumi.StringOutput { return v.SelfLink }).(pulumi.StringOutput)
}

// The share setting for reservations.
// Structure is documented below.
func (o ReservationOutput) ShareSettings() ReservationShareSettingsOutput {
	return o.ApplyT(func(v *Reservation) ReservationShareSettingsOutput { return v.ShareSettings }).(ReservationShareSettingsOutput)
}

// Reservation for instances with specific machine shapes.
// Structure is documented below.
func (o ReservationOutput) SpecificReservation() ReservationSpecificReservationOutput {
	return o.ApplyT(func(v *Reservation) ReservationSpecificReservationOutput { return v.SpecificReservation }).(ReservationSpecificReservationOutput)
}

// When set to true, only VMs that target this reservation by name can
// consume this reservation. Otherwise, it can be consumed by VMs with
// affinity for any reservation. Defaults to false.
func (o ReservationOutput) SpecificReservationRequired() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Reservation) pulumi.BoolPtrOutput { return v.SpecificReservationRequired }).(pulumi.BoolPtrOutput)
}

// The status of the reservation.
func (o ReservationOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *Reservation) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// The zone where the reservation is made.
func (o ReservationOutput) Zone() pulumi.StringOutput {
	return o.ApplyT(func(v *Reservation) pulumi.StringOutput { return v.Zone }).(pulumi.StringOutput)
}

type ReservationArrayOutput struct{ *pulumi.OutputState }

func (ReservationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Reservation)(nil)).Elem()
}

func (o ReservationArrayOutput) ToReservationArrayOutput() ReservationArrayOutput {
	return o
}

func (o ReservationArrayOutput) ToReservationArrayOutputWithContext(ctx context.Context) ReservationArrayOutput {
	return o
}

func (o ReservationArrayOutput) Index(i pulumi.IntInput) ReservationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Reservation {
		return vs[0].([]*Reservation)[vs[1].(int)]
	}).(ReservationOutput)
}

type ReservationMapOutput struct{ *pulumi.OutputState }

func (ReservationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Reservation)(nil)).Elem()
}

func (o ReservationMapOutput) ToReservationMapOutput() ReservationMapOutput {
	return o
}

func (o ReservationMapOutput) ToReservationMapOutputWithContext(ctx context.Context) ReservationMapOutput {
	return o
}

func (o ReservationMapOutput) MapIndex(k pulumi.StringInput) ReservationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Reservation {
		return vs[0].(map[string]*Reservation)[vs[1].(string)]
	}).(ReservationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ReservationInput)(nil)).Elem(), &Reservation{})
	pulumi.RegisterInputType(reflect.TypeOf((*ReservationArrayInput)(nil)).Elem(), ReservationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ReservationMapInput)(nil)).Elem(), ReservationMap{})
	pulumi.RegisterOutputType(ReservationOutput{})
	pulumi.RegisterOutputType(ReservationArrayOutput{})
	pulumi.RegisterOutputType(ReservationMapOutput{})
}
