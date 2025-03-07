// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package networksecurity

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
//
// ### Network Security Intercept Endpoint Group Association Basic
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/compute"
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/networksecurity"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			producerNetwork, err := compute.NewNetwork(ctx, "producer_network", &compute.NetworkArgs{
//				Name:                  pulumi.String("example-prod-network"),
//				AutoCreateSubnetworks: pulumi.Bool(false),
//			})
//			if err != nil {
//				return err
//			}
//			consumerNetwork, err := compute.NewNetwork(ctx, "consumer_network", &compute.NetworkArgs{
//				Name:                  pulumi.String("example-cons-network"),
//				AutoCreateSubnetworks: pulumi.Bool(false),
//			})
//			if err != nil {
//				return err
//			}
//			deploymentGroup, err := networksecurity.NewInterceptDeploymentGroup(ctx, "deployment_group", &networksecurity.InterceptDeploymentGroupArgs{
//				InterceptDeploymentGroupId: pulumi.String("example-dg"),
//				Location:                   pulumi.String("global"),
//				Network:                    producerNetwork.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			endpointGroup, err := networksecurity.NewInterceptEndpointGroup(ctx, "endpoint_group", &networksecurity.InterceptEndpointGroupArgs{
//				InterceptEndpointGroupId: pulumi.String("example-eg"),
//				Location:                 pulumi.String("global"),
//				InterceptDeploymentGroup: deploymentGroup.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = networksecurity.NewInterceptEndpointGroupAssociation(ctx, "default", &networksecurity.InterceptEndpointGroupAssociationArgs{
//				InterceptEndpointGroupAssociationId: pulumi.String("example-ega"),
//				Location:                            pulumi.String("global"),
//				Network:                             consumerNetwork.ID(),
//				InterceptEndpointGroup:              endpointGroup.ID(),
//				Labels: pulumi.StringMap{
//					"foo": pulumi.String("bar"),
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
// InterceptEndpointGroupAssociation can be imported using any of these accepted formats:
//
// * `projects/{{project}}/locations/{{location}}/interceptEndpointGroupAssociations/{{intercept_endpoint_group_association_id}}`
//
// * `{{project}}/{{location}}/{{intercept_endpoint_group_association_id}}`
//
// * `{{location}}/{{intercept_endpoint_group_association_id}}`
//
// When using the `pulumi import` command, InterceptEndpointGroupAssociation can be imported using one of the formats above. For example:
//
// ```sh
// $ pulumi import gcp:networksecurity/interceptEndpointGroupAssociation:InterceptEndpointGroupAssociation default projects/{{project}}/locations/{{location}}/interceptEndpointGroupAssociations/{{intercept_endpoint_group_association_id}}
// ```
//
// ```sh
// $ pulumi import gcp:networksecurity/interceptEndpointGroupAssociation:InterceptEndpointGroupAssociation default {{project}}/{{location}}/{{intercept_endpoint_group_association_id}}
// ```
//
// ```sh
// $ pulumi import gcp:networksecurity/interceptEndpointGroupAssociation:InterceptEndpointGroupAssociation default {{location}}/{{intercept_endpoint_group_association_id}}
// ```
type InterceptEndpointGroupAssociation struct {
	pulumi.CustomResourceState

	// Create time stamp.
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
	EffectiveLabels pulumi.StringMapOutput `pulumi:"effectiveLabels"`
	// Immutable. The Intercept Endpoint Group that this resource is connected to. Format
	// is:
	// `projects/{project}/locations/global/interceptEndpointGroups/{interceptEndpointGroup}`.
	InterceptEndpointGroup pulumi.StringOutput `pulumi:"interceptEndpointGroup"`
	// ID of the Intercept Endpoint Group Association.
	InterceptEndpointGroupAssociationId pulumi.StringPtrOutput `pulumi:"interceptEndpointGroupAssociationId"`
	// Optional. Labels as key value pairs.
	// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
	// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
	Labels pulumi.StringMapOutput `pulumi:"labels"`
	// The location of the Intercept Endpoint Group Association, currently restricted to `global`.
	//
	// ***
	Location pulumi.StringOutput `pulumi:"location"`
	// The list of locations that are currently supported by the associated Intercept Deployment Group and their state.
	// Structure is documented below.
	LocationsDetails InterceptEndpointGroupAssociationLocationsDetailArrayOutput `pulumi:"locationsDetails"`
	// Identifier. The name of the Intercept Endpoint Group Association.
	Name pulumi.StringOutput `pulumi:"name"`
	// Immutable. The VPC network associated. Format:
	// `projects/{project}/global/networks/{network}`.
	Network pulumi.StringOutput `pulumi:"network"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringOutput `pulumi:"project"`
	// The combination of labels configured directly on the resource
	// and default labels configured on the provider.
	PulumiLabels pulumi.StringMapOutput `pulumi:"pulumiLabels"`
	// Whether reconciling is in progress.
	Reconciling pulumi.BoolOutput `pulumi:"reconciling"`
	// (Output)
	// The association state in this location.
	// Possible values:
	// STATE_UNSPECIFIED
	// ACTIVE
	// OUT_OF_SYNC
	State pulumi.StringOutput `pulumi:"state"`
	// Update time stamp.
	UpdateTime pulumi.StringOutput `pulumi:"updateTime"`
}

// NewInterceptEndpointGroupAssociation registers a new resource with the given unique name, arguments, and options.
func NewInterceptEndpointGroupAssociation(ctx *pulumi.Context,
	name string, args *InterceptEndpointGroupAssociationArgs, opts ...pulumi.ResourceOption) (*InterceptEndpointGroupAssociation, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.InterceptEndpointGroup == nil {
		return nil, errors.New("invalid value for required argument 'InterceptEndpointGroup'")
	}
	if args.Location == nil {
		return nil, errors.New("invalid value for required argument 'Location'")
	}
	if args.Network == nil {
		return nil, errors.New("invalid value for required argument 'Network'")
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"effectiveLabels",
		"pulumiLabels",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource InterceptEndpointGroupAssociation
	err := ctx.RegisterResource("gcp:networksecurity/interceptEndpointGroupAssociation:InterceptEndpointGroupAssociation", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetInterceptEndpointGroupAssociation gets an existing InterceptEndpointGroupAssociation resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetInterceptEndpointGroupAssociation(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *InterceptEndpointGroupAssociationState, opts ...pulumi.ResourceOption) (*InterceptEndpointGroupAssociation, error) {
	var resource InterceptEndpointGroupAssociation
	err := ctx.ReadResource("gcp:networksecurity/interceptEndpointGroupAssociation:InterceptEndpointGroupAssociation", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering InterceptEndpointGroupAssociation resources.
type interceptEndpointGroupAssociationState struct {
	// Create time stamp.
	CreateTime *string `pulumi:"createTime"`
	// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
	EffectiveLabels map[string]string `pulumi:"effectiveLabels"`
	// Immutable. The Intercept Endpoint Group that this resource is connected to. Format
	// is:
	// `projects/{project}/locations/global/interceptEndpointGroups/{interceptEndpointGroup}`.
	InterceptEndpointGroup *string `pulumi:"interceptEndpointGroup"`
	// ID of the Intercept Endpoint Group Association.
	InterceptEndpointGroupAssociationId *string `pulumi:"interceptEndpointGroupAssociationId"`
	// Optional. Labels as key value pairs.
	// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
	// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
	Labels map[string]string `pulumi:"labels"`
	// The location of the Intercept Endpoint Group Association, currently restricted to `global`.
	//
	// ***
	Location *string `pulumi:"location"`
	// The list of locations that are currently supported by the associated Intercept Deployment Group and their state.
	// Structure is documented below.
	LocationsDetails []InterceptEndpointGroupAssociationLocationsDetail `pulumi:"locationsDetails"`
	// Identifier. The name of the Intercept Endpoint Group Association.
	Name *string `pulumi:"name"`
	// Immutable. The VPC network associated. Format:
	// `projects/{project}/global/networks/{network}`.
	Network *string `pulumi:"network"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
	// The combination of labels configured directly on the resource
	// and default labels configured on the provider.
	PulumiLabels map[string]string `pulumi:"pulumiLabels"`
	// Whether reconciling is in progress.
	Reconciling *bool `pulumi:"reconciling"`
	// (Output)
	// The association state in this location.
	// Possible values:
	// STATE_UNSPECIFIED
	// ACTIVE
	// OUT_OF_SYNC
	State *string `pulumi:"state"`
	// Update time stamp.
	UpdateTime *string `pulumi:"updateTime"`
}

type InterceptEndpointGroupAssociationState struct {
	// Create time stamp.
	CreateTime pulumi.StringPtrInput
	// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
	EffectiveLabels pulumi.StringMapInput
	// Immutable. The Intercept Endpoint Group that this resource is connected to. Format
	// is:
	// `projects/{project}/locations/global/interceptEndpointGroups/{interceptEndpointGroup}`.
	InterceptEndpointGroup pulumi.StringPtrInput
	// ID of the Intercept Endpoint Group Association.
	InterceptEndpointGroupAssociationId pulumi.StringPtrInput
	// Optional. Labels as key value pairs.
	// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
	// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
	Labels pulumi.StringMapInput
	// The location of the Intercept Endpoint Group Association, currently restricted to `global`.
	//
	// ***
	Location pulumi.StringPtrInput
	// The list of locations that are currently supported by the associated Intercept Deployment Group and their state.
	// Structure is documented below.
	LocationsDetails InterceptEndpointGroupAssociationLocationsDetailArrayInput
	// Identifier. The name of the Intercept Endpoint Group Association.
	Name pulumi.StringPtrInput
	// Immutable. The VPC network associated. Format:
	// `projects/{project}/global/networks/{network}`.
	Network pulumi.StringPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
	// The combination of labels configured directly on the resource
	// and default labels configured on the provider.
	PulumiLabels pulumi.StringMapInput
	// Whether reconciling is in progress.
	Reconciling pulumi.BoolPtrInput
	// (Output)
	// The association state in this location.
	// Possible values:
	// STATE_UNSPECIFIED
	// ACTIVE
	// OUT_OF_SYNC
	State pulumi.StringPtrInput
	// Update time stamp.
	UpdateTime pulumi.StringPtrInput
}

func (InterceptEndpointGroupAssociationState) ElementType() reflect.Type {
	return reflect.TypeOf((*interceptEndpointGroupAssociationState)(nil)).Elem()
}

type interceptEndpointGroupAssociationArgs struct {
	// Immutable. The Intercept Endpoint Group that this resource is connected to. Format
	// is:
	// `projects/{project}/locations/global/interceptEndpointGroups/{interceptEndpointGroup}`.
	InterceptEndpointGroup string `pulumi:"interceptEndpointGroup"`
	// ID of the Intercept Endpoint Group Association.
	InterceptEndpointGroupAssociationId *string `pulumi:"interceptEndpointGroupAssociationId"`
	// Optional. Labels as key value pairs.
	// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
	// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
	Labels map[string]string `pulumi:"labels"`
	// The location of the Intercept Endpoint Group Association, currently restricted to `global`.
	//
	// ***
	Location string `pulumi:"location"`
	// Immutable. The VPC network associated. Format:
	// `projects/{project}/global/networks/{network}`.
	Network string `pulumi:"network"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
}

// The set of arguments for constructing a InterceptEndpointGroupAssociation resource.
type InterceptEndpointGroupAssociationArgs struct {
	// Immutable. The Intercept Endpoint Group that this resource is connected to. Format
	// is:
	// `projects/{project}/locations/global/interceptEndpointGroups/{interceptEndpointGroup}`.
	InterceptEndpointGroup pulumi.StringInput
	// ID of the Intercept Endpoint Group Association.
	InterceptEndpointGroupAssociationId pulumi.StringPtrInput
	// Optional. Labels as key value pairs.
	// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
	// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
	Labels pulumi.StringMapInput
	// The location of the Intercept Endpoint Group Association, currently restricted to `global`.
	//
	// ***
	Location pulumi.StringInput
	// Immutable. The VPC network associated. Format:
	// `projects/{project}/global/networks/{network}`.
	Network pulumi.StringInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
}

func (InterceptEndpointGroupAssociationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*interceptEndpointGroupAssociationArgs)(nil)).Elem()
}

type InterceptEndpointGroupAssociationInput interface {
	pulumi.Input

	ToInterceptEndpointGroupAssociationOutput() InterceptEndpointGroupAssociationOutput
	ToInterceptEndpointGroupAssociationOutputWithContext(ctx context.Context) InterceptEndpointGroupAssociationOutput
}

func (*InterceptEndpointGroupAssociation) ElementType() reflect.Type {
	return reflect.TypeOf((**InterceptEndpointGroupAssociation)(nil)).Elem()
}

func (i *InterceptEndpointGroupAssociation) ToInterceptEndpointGroupAssociationOutput() InterceptEndpointGroupAssociationOutput {
	return i.ToInterceptEndpointGroupAssociationOutputWithContext(context.Background())
}

func (i *InterceptEndpointGroupAssociation) ToInterceptEndpointGroupAssociationOutputWithContext(ctx context.Context) InterceptEndpointGroupAssociationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InterceptEndpointGroupAssociationOutput)
}

// InterceptEndpointGroupAssociationArrayInput is an input type that accepts InterceptEndpointGroupAssociationArray and InterceptEndpointGroupAssociationArrayOutput values.
// You can construct a concrete instance of `InterceptEndpointGroupAssociationArrayInput` via:
//
//	InterceptEndpointGroupAssociationArray{ InterceptEndpointGroupAssociationArgs{...} }
type InterceptEndpointGroupAssociationArrayInput interface {
	pulumi.Input

	ToInterceptEndpointGroupAssociationArrayOutput() InterceptEndpointGroupAssociationArrayOutput
	ToInterceptEndpointGroupAssociationArrayOutputWithContext(context.Context) InterceptEndpointGroupAssociationArrayOutput
}

type InterceptEndpointGroupAssociationArray []InterceptEndpointGroupAssociationInput

func (InterceptEndpointGroupAssociationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*InterceptEndpointGroupAssociation)(nil)).Elem()
}

func (i InterceptEndpointGroupAssociationArray) ToInterceptEndpointGroupAssociationArrayOutput() InterceptEndpointGroupAssociationArrayOutput {
	return i.ToInterceptEndpointGroupAssociationArrayOutputWithContext(context.Background())
}

func (i InterceptEndpointGroupAssociationArray) ToInterceptEndpointGroupAssociationArrayOutputWithContext(ctx context.Context) InterceptEndpointGroupAssociationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InterceptEndpointGroupAssociationArrayOutput)
}

// InterceptEndpointGroupAssociationMapInput is an input type that accepts InterceptEndpointGroupAssociationMap and InterceptEndpointGroupAssociationMapOutput values.
// You can construct a concrete instance of `InterceptEndpointGroupAssociationMapInput` via:
//
//	InterceptEndpointGroupAssociationMap{ "key": InterceptEndpointGroupAssociationArgs{...} }
type InterceptEndpointGroupAssociationMapInput interface {
	pulumi.Input

	ToInterceptEndpointGroupAssociationMapOutput() InterceptEndpointGroupAssociationMapOutput
	ToInterceptEndpointGroupAssociationMapOutputWithContext(context.Context) InterceptEndpointGroupAssociationMapOutput
}

type InterceptEndpointGroupAssociationMap map[string]InterceptEndpointGroupAssociationInput

func (InterceptEndpointGroupAssociationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*InterceptEndpointGroupAssociation)(nil)).Elem()
}

func (i InterceptEndpointGroupAssociationMap) ToInterceptEndpointGroupAssociationMapOutput() InterceptEndpointGroupAssociationMapOutput {
	return i.ToInterceptEndpointGroupAssociationMapOutputWithContext(context.Background())
}

func (i InterceptEndpointGroupAssociationMap) ToInterceptEndpointGroupAssociationMapOutputWithContext(ctx context.Context) InterceptEndpointGroupAssociationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InterceptEndpointGroupAssociationMapOutput)
}

type InterceptEndpointGroupAssociationOutput struct{ *pulumi.OutputState }

func (InterceptEndpointGroupAssociationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**InterceptEndpointGroupAssociation)(nil)).Elem()
}

func (o InterceptEndpointGroupAssociationOutput) ToInterceptEndpointGroupAssociationOutput() InterceptEndpointGroupAssociationOutput {
	return o
}

func (o InterceptEndpointGroupAssociationOutput) ToInterceptEndpointGroupAssociationOutputWithContext(ctx context.Context) InterceptEndpointGroupAssociationOutput {
	return o
}

// Create time stamp.
func (o InterceptEndpointGroupAssociationOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *InterceptEndpointGroupAssociation) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
func (o InterceptEndpointGroupAssociationOutput) EffectiveLabels() pulumi.StringMapOutput {
	return o.ApplyT(func(v *InterceptEndpointGroupAssociation) pulumi.StringMapOutput { return v.EffectiveLabels }).(pulumi.StringMapOutput)
}

// Immutable. The Intercept Endpoint Group that this resource is connected to. Format
// is:
// `projects/{project}/locations/global/interceptEndpointGroups/{interceptEndpointGroup}`.
func (o InterceptEndpointGroupAssociationOutput) InterceptEndpointGroup() pulumi.StringOutput {
	return o.ApplyT(func(v *InterceptEndpointGroupAssociation) pulumi.StringOutput { return v.InterceptEndpointGroup }).(pulumi.StringOutput)
}

// ID of the Intercept Endpoint Group Association.
func (o InterceptEndpointGroupAssociationOutput) InterceptEndpointGroupAssociationId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *InterceptEndpointGroupAssociation) pulumi.StringPtrOutput {
		return v.InterceptEndpointGroupAssociationId
	}).(pulumi.StringPtrOutput)
}

// Optional. Labels as key value pairs.
// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
func (o InterceptEndpointGroupAssociationOutput) Labels() pulumi.StringMapOutput {
	return o.ApplyT(func(v *InterceptEndpointGroupAssociation) pulumi.StringMapOutput { return v.Labels }).(pulumi.StringMapOutput)
}

// The location of the Intercept Endpoint Group Association, currently restricted to `global`.
//
// ***
func (o InterceptEndpointGroupAssociationOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *InterceptEndpointGroupAssociation) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// The list of locations that are currently supported by the associated Intercept Deployment Group and their state.
// Structure is documented below.
func (o InterceptEndpointGroupAssociationOutput) LocationsDetails() InterceptEndpointGroupAssociationLocationsDetailArrayOutput {
	return o.ApplyT(func(v *InterceptEndpointGroupAssociation) InterceptEndpointGroupAssociationLocationsDetailArrayOutput {
		return v.LocationsDetails
	}).(InterceptEndpointGroupAssociationLocationsDetailArrayOutput)
}

// Identifier. The name of the Intercept Endpoint Group Association.
func (o InterceptEndpointGroupAssociationOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *InterceptEndpointGroupAssociation) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Immutable. The VPC network associated. Format:
// `projects/{project}/global/networks/{network}`.
func (o InterceptEndpointGroupAssociationOutput) Network() pulumi.StringOutput {
	return o.ApplyT(func(v *InterceptEndpointGroupAssociation) pulumi.StringOutput { return v.Network }).(pulumi.StringOutput)
}

// The ID of the project in which the resource belongs.
// If it is not provided, the provider project is used.
func (o InterceptEndpointGroupAssociationOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *InterceptEndpointGroupAssociation) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// The combination of labels configured directly on the resource
// and default labels configured on the provider.
func (o InterceptEndpointGroupAssociationOutput) PulumiLabels() pulumi.StringMapOutput {
	return o.ApplyT(func(v *InterceptEndpointGroupAssociation) pulumi.StringMapOutput { return v.PulumiLabels }).(pulumi.StringMapOutput)
}

// Whether reconciling is in progress.
func (o InterceptEndpointGroupAssociationOutput) Reconciling() pulumi.BoolOutput {
	return o.ApplyT(func(v *InterceptEndpointGroupAssociation) pulumi.BoolOutput { return v.Reconciling }).(pulumi.BoolOutput)
}

// (Output)
// The association state in this location.
// Possible values:
// STATE_UNSPECIFIED
// ACTIVE
// OUT_OF_SYNC
func (o InterceptEndpointGroupAssociationOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v *InterceptEndpointGroupAssociation) pulumi.StringOutput { return v.State }).(pulumi.StringOutput)
}

// Update time stamp.
func (o InterceptEndpointGroupAssociationOutput) UpdateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *InterceptEndpointGroupAssociation) pulumi.StringOutput { return v.UpdateTime }).(pulumi.StringOutput)
}

type InterceptEndpointGroupAssociationArrayOutput struct{ *pulumi.OutputState }

func (InterceptEndpointGroupAssociationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*InterceptEndpointGroupAssociation)(nil)).Elem()
}

func (o InterceptEndpointGroupAssociationArrayOutput) ToInterceptEndpointGroupAssociationArrayOutput() InterceptEndpointGroupAssociationArrayOutput {
	return o
}

func (o InterceptEndpointGroupAssociationArrayOutput) ToInterceptEndpointGroupAssociationArrayOutputWithContext(ctx context.Context) InterceptEndpointGroupAssociationArrayOutput {
	return o
}

func (o InterceptEndpointGroupAssociationArrayOutput) Index(i pulumi.IntInput) InterceptEndpointGroupAssociationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *InterceptEndpointGroupAssociation {
		return vs[0].([]*InterceptEndpointGroupAssociation)[vs[1].(int)]
	}).(InterceptEndpointGroupAssociationOutput)
}

type InterceptEndpointGroupAssociationMapOutput struct{ *pulumi.OutputState }

func (InterceptEndpointGroupAssociationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*InterceptEndpointGroupAssociation)(nil)).Elem()
}

func (o InterceptEndpointGroupAssociationMapOutput) ToInterceptEndpointGroupAssociationMapOutput() InterceptEndpointGroupAssociationMapOutput {
	return o
}

func (o InterceptEndpointGroupAssociationMapOutput) ToInterceptEndpointGroupAssociationMapOutputWithContext(ctx context.Context) InterceptEndpointGroupAssociationMapOutput {
	return o
}

func (o InterceptEndpointGroupAssociationMapOutput) MapIndex(k pulumi.StringInput) InterceptEndpointGroupAssociationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *InterceptEndpointGroupAssociation {
		return vs[0].(map[string]*InterceptEndpointGroupAssociation)[vs[1].(string)]
	}).(InterceptEndpointGroupAssociationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*InterceptEndpointGroupAssociationInput)(nil)).Elem(), &InterceptEndpointGroupAssociation{})
	pulumi.RegisterInputType(reflect.TypeOf((*InterceptEndpointGroupAssociationArrayInput)(nil)).Elem(), InterceptEndpointGroupAssociationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*InterceptEndpointGroupAssociationMapInput)(nil)).Elem(), InterceptEndpointGroupAssociationMap{})
	pulumi.RegisterOutputType(InterceptEndpointGroupAssociationOutput{})
	pulumi.RegisterOutputType(InterceptEndpointGroupAssociationArrayOutput{})
	pulumi.RegisterOutputType(InterceptEndpointGroupAssociationMapOutput{})
}
