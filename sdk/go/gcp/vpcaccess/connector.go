// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package vpcaccess

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Serverless VPC Access connector resource.
//
// To get more information about Connector, see:
//
// * [API documentation](https://cloud.google.com/vpc/docs/reference/vpcaccess/rest/v1/projects.locations.connectors)
// * How-to Guides
//   - [Configuring Serverless VPC Access](https://cloud.google.com/vpc/docs/configure-serverless-vpc-access)
//
// ## Example Usage
//
// ### Vpc Access Connector
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/vpcaccess"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := vpcaccess.NewConnector(ctx, "connector", &vpcaccess.ConnectorArgs{
//				Name:         pulumi.String("vpc-con"),
//				IpCidrRange:  pulumi.String("10.8.0.0/28"),
//				Network:      pulumi.String("default"),
//				MinInstances: pulumi.Int(2),
//				MaxInstances: pulumi.Int(3),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Vpc Access Connector Shared Vpc
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/compute"
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/vpcaccess"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			customTest, err := compute.NewSubnetwork(ctx, "custom_test", &compute.SubnetworkArgs{
//				Name:        pulumi.String("vpc-con"),
//				IpCidrRange: pulumi.String("10.2.0.0/28"),
//				Region:      pulumi.String("us-central1"),
//				Network:     pulumi.String("default"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = vpcaccess.NewConnector(ctx, "connector", &vpcaccess.ConnectorArgs{
//				Name: pulumi.String("vpc-con"),
//				Subnet: &vpcaccess.ConnectorSubnetArgs{
//					Name: customTest.Name,
//				},
//				MachineType:  pulumi.String("e2-standard-4"),
//				MinInstances: pulumi.Int(2),
//				MaxInstances: pulumi.Int(3),
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
// Connector can be imported using any of these accepted formats:
//
// * `projects/{{project}}/locations/{{region}}/connectors/{{name}}`
//
// * `{{project}}/{{region}}/{{name}}`
//
// * `{{region}}/{{name}}`
//
// * `{{name}}`
//
// When using the `pulumi import` command, Connector can be imported using one of the formats above. For example:
//
// ```sh
// $ pulumi import gcp:vpcaccess/connector:Connector default projects/{{project}}/locations/{{region}}/connectors/{{name}}
// ```
//
// ```sh
// $ pulumi import gcp:vpcaccess/connector:Connector default {{project}}/{{region}}/{{name}}
// ```
//
// ```sh
// $ pulumi import gcp:vpcaccess/connector:Connector default {{region}}/{{name}}
// ```
//
// ```sh
// $ pulumi import gcp:vpcaccess/connector:Connector default {{name}}
// ```
type Connector struct {
	pulumi.CustomResourceState

	// List of projects using the connector.
	ConnectedProjects pulumi.StringArrayOutput `pulumi:"connectedProjects"`
	// The range of internal addresses that follows RFC 4632 notation. Example: `10.132.0.0/28`.
	IpCidrRange pulumi.StringPtrOutput `pulumi:"ipCidrRange"`
	// Machine type of VM Instance underlying connector. Default is e2-micro
	MachineType pulumi.StringPtrOutput `pulumi:"machineType"`
	// Maximum value of instances in autoscaling group underlying the connector. Value must be between 3 and 10, inclusive. Must be
	// higher than the value specified by min_instances. Required alongside `minInstances` if not using `minThroughput`/`maxThroughput`.
	MaxInstances pulumi.IntOutput `pulumi:"maxInstances"`
	// Maximum throughput of the connector in Mbps, must be greater than `minThroughput`. Default is 300. Refers to the expected throughput
	// when using an e2-micro machine type. Value must be a multiple of 100 from 300 through 1000. Must be higher than the value specified by
	// min_throughput. Only one of `maxThroughput` and `maxInstances` can be specified. The use of maxThroughput is discouraged in favor of max_instances.
	MaxThroughput pulumi.IntOutput `pulumi:"maxThroughput"`
	// Minimum value of instances in autoscaling group underlying the connector. Value must be between 2 and 9, inclusive. Must be
	// lower than the value specified by max_instances. Required alongside `maxInstances` if not using `minThroughput`/`maxThroughput`.
	MinInstances pulumi.IntOutput `pulumi:"minInstances"`
	// Minimum throughput of the connector in Mbps. Default and min is 200. Refers to the expected throughput when using an e2-micro machine type.
	// Value must be a multiple of 100 from 200 through 900. Must be lower than the value specified by max_throughput.
	// Only one of `minThroughput` and `minInstances` can be specified. The use of minThroughput is discouraged in favor of min_instances.
	MinThroughput pulumi.IntOutput `pulumi:"minThroughput"`
	// The name of the resource (Max 25 characters).
	Name pulumi.StringOutput `pulumi:"name"`
	// Name or selfLink of the VPC network. Required if `ipCidrRange` is set.
	Network pulumi.StringOutput `pulumi:"network"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringOutput `pulumi:"project"`
	// Region where the VPC Access connector resides. If it is not provided, the provider region is used.
	Region pulumi.StringOutput `pulumi:"region"`
	// The fully qualified name of this VPC connector
	SelfLink pulumi.StringOutput `pulumi:"selfLink"`
	// State of the VPC access connector.
	State pulumi.StringOutput `pulumi:"state"`
	// The subnet in which to house the connector
	// Structure is documented below.
	Subnet ConnectorSubnetPtrOutput `pulumi:"subnet"`
}

// NewConnector registers a new resource with the given unique name, arguments, and options.
func NewConnector(ctx *pulumi.Context,
	name string, args *ConnectorArgs, opts ...pulumi.ResourceOption) (*Connector, error) {
	if args == nil {
		args = &ConnectorArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Connector
	err := ctx.RegisterResource("gcp:vpcaccess/connector:Connector", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetConnector gets an existing Connector resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetConnector(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ConnectorState, opts ...pulumi.ResourceOption) (*Connector, error) {
	var resource Connector
	err := ctx.ReadResource("gcp:vpcaccess/connector:Connector", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Connector resources.
type connectorState struct {
	// List of projects using the connector.
	ConnectedProjects []string `pulumi:"connectedProjects"`
	// The range of internal addresses that follows RFC 4632 notation. Example: `10.132.0.0/28`.
	IpCidrRange *string `pulumi:"ipCidrRange"`
	// Machine type of VM Instance underlying connector. Default is e2-micro
	MachineType *string `pulumi:"machineType"`
	// Maximum value of instances in autoscaling group underlying the connector. Value must be between 3 and 10, inclusive. Must be
	// higher than the value specified by min_instances. Required alongside `minInstances` if not using `minThroughput`/`maxThroughput`.
	MaxInstances *int `pulumi:"maxInstances"`
	// Maximum throughput of the connector in Mbps, must be greater than `minThroughput`. Default is 300. Refers to the expected throughput
	// when using an e2-micro machine type. Value must be a multiple of 100 from 300 through 1000. Must be higher than the value specified by
	// min_throughput. Only one of `maxThroughput` and `maxInstances` can be specified. The use of maxThroughput is discouraged in favor of max_instances.
	MaxThroughput *int `pulumi:"maxThroughput"`
	// Minimum value of instances in autoscaling group underlying the connector. Value must be between 2 and 9, inclusive. Must be
	// lower than the value specified by max_instances. Required alongside `maxInstances` if not using `minThroughput`/`maxThroughput`.
	MinInstances *int `pulumi:"minInstances"`
	// Minimum throughput of the connector in Mbps. Default and min is 200. Refers to the expected throughput when using an e2-micro machine type.
	// Value must be a multiple of 100 from 200 through 900. Must be lower than the value specified by max_throughput.
	// Only one of `minThroughput` and `minInstances` can be specified. The use of minThroughput is discouraged in favor of min_instances.
	MinThroughput *int `pulumi:"minThroughput"`
	// The name of the resource (Max 25 characters).
	Name *string `pulumi:"name"`
	// Name or selfLink of the VPC network. Required if `ipCidrRange` is set.
	Network *string `pulumi:"network"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
	// Region where the VPC Access connector resides. If it is not provided, the provider region is used.
	Region *string `pulumi:"region"`
	// The fully qualified name of this VPC connector
	SelfLink *string `pulumi:"selfLink"`
	// State of the VPC access connector.
	State *string `pulumi:"state"`
	// The subnet in which to house the connector
	// Structure is documented below.
	Subnet *ConnectorSubnet `pulumi:"subnet"`
}

type ConnectorState struct {
	// List of projects using the connector.
	ConnectedProjects pulumi.StringArrayInput
	// The range of internal addresses that follows RFC 4632 notation. Example: `10.132.0.0/28`.
	IpCidrRange pulumi.StringPtrInput
	// Machine type of VM Instance underlying connector. Default is e2-micro
	MachineType pulumi.StringPtrInput
	// Maximum value of instances in autoscaling group underlying the connector. Value must be between 3 and 10, inclusive. Must be
	// higher than the value specified by min_instances. Required alongside `minInstances` if not using `minThroughput`/`maxThroughput`.
	MaxInstances pulumi.IntPtrInput
	// Maximum throughput of the connector in Mbps, must be greater than `minThroughput`. Default is 300. Refers to the expected throughput
	// when using an e2-micro machine type. Value must be a multiple of 100 from 300 through 1000. Must be higher than the value specified by
	// min_throughput. Only one of `maxThroughput` and `maxInstances` can be specified. The use of maxThroughput is discouraged in favor of max_instances.
	MaxThroughput pulumi.IntPtrInput
	// Minimum value of instances in autoscaling group underlying the connector. Value must be between 2 and 9, inclusive. Must be
	// lower than the value specified by max_instances. Required alongside `maxInstances` if not using `minThroughput`/`maxThroughput`.
	MinInstances pulumi.IntPtrInput
	// Minimum throughput of the connector in Mbps. Default and min is 200. Refers to the expected throughput when using an e2-micro machine type.
	// Value must be a multiple of 100 from 200 through 900. Must be lower than the value specified by max_throughput.
	// Only one of `minThroughput` and `minInstances` can be specified. The use of minThroughput is discouraged in favor of min_instances.
	MinThroughput pulumi.IntPtrInput
	// The name of the resource (Max 25 characters).
	Name pulumi.StringPtrInput
	// Name or selfLink of the VPC network. Required if `ipCidrRange` is set.
	Network pulumi.StringPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
	// Region where the VPC Access connector resides. If it is not provided, the provider region is used.
	Region pulumi.StringPtrInput
	// The fully qualified name of this VPC connector
	SelfLink pulumi.StringPtrInput
	// State of the VPC access connector.
	State pulumi.StringPtrInput
	// The subnet in which to house the connector
	// Structure is documented below.
	Subnet ConnectorSubnetPtrInput
}

func (ConnectorState) ElementType() reflect.Type {
	return reflect.TypeOf((*connectorState)(nil)).Elem()
}

type connectorArgs struct {
	// The range of internal addresses that follows RFC 4632 notation. Example: `10.132.0.0/28`.
	IpCidrRange *string `pulumi:"ipCidrRange"`
	// Machine type of VM Instance underlying connector. Default is e2-micro
	MachineType *string `pulumi:"machineType"`
	// Maximum value of instances in autoscaling group underlying the connector. Value must be between 3 and 10, inclusive. Must be
	// higher than the value specified by min_instances. Required alongside `minInstances` if not using `minThroughput`/`maxThroughput`.
	MaxInstances *int `pulumi:"maxInstances"`
	// Maximum throughput of the connector in Mbps, must be greater than `minThroughput`. Default is 300. Refers to the expected throughput
	// when using an e2-micro machine type. Value must be a multiple of 100 from 300 through 1000. Must be higher than the value specified by
	// min_throughput. Only one of `maxThroughput` and `maxInstances` can be specified. The use of maxThroughput is discouraged in favor of max_instances.
	MaxThroughput *int `pulumi:"maxThroughput"`
	// Minimum value of instances in autoscaling group underlying the connector. Value must be between 2 and 9, inclusive. Must be
	// lower than the value specified by max_instances. Required alongside `maxInstances` if not using `minThroughput`/`maxThroughput`.
	MinInstances *int `pulumi:"minInstances"`
	// Minimum throughput of the connector in Mbps. Default and min is 200. Refers to the expected throughput when using an e2-micro machine type.
	// Value must be a multiple of 100 from 200 through 900. Must be lower than the value specified by max_throughput.
	// Only one of `minThroughput` and `minInstances` can be specified. The use of minThroughput is discouraged in favor of min_instances.
	MinThroughput *int `pulumi:"minThroughput"`
	// The name of the resource (Max 25 characters).
	Name *string `pulumi:"name"`
	// Name or selfLink of the VPC network. Required if `ipCidrRange` is set.
	Network *string `pulumi:"network"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
	// Region where the VPC Access connector resides. If it is not provided, the provider region is used.
	Region *string `pulumi:"region"`
	// The subnet in which to house the connector
	// Structure is documented below.
	Subnet *ConnectorSubnet `pulumi:"subnet"`
}

// The set of arguments for constructing a Connector resource.
type ConnectorArgs struct {
	// The range of internal addresses that follows RFC 4632 notation. Example: `10.132.0.0/28`.
	IpCidrRange pulumi.StringPtrInput
	// Machine type of VM Instance underlying connector. Default is e2-micro
	MachineType pulumi.StringPtrInput
	// Maximum value of instances in autoscaling group underlying the connector. Value must be between 3 and 10, inclusive. Must be
	// higher than the value specified by min_instances. Required alongside `minInstances` if not using `minThroughput`/`maxThroughput`.
	MaxInstances pulumi.IntPtrInput
	// Maximum throughput of the connector in Mbps, must be greater than `minThroughput`. Default is 300. Refers to the expected throughput
	// when using an e2-micro machine type. Value must be a multiple of 100 from 300 through 1000. Must be higher than the value specified by
	// min_throughput. Only one of `maxThroughput` and `maxInstances` can be specified. The use of maxThroughput is discouraged in favor of max_instances.
	MaxThroughput pulumi.IntPtrInput
	// Minimum value of instances in autoscaling group underlying the connector. Value must be between 2 and 9, inclusive. Must be
	// lower than the value specified by max_instances. Required alongside `maxInstances` if not using `minThroughput`/`maxThroughput`.
	MinInstances pulumi.IntPtrInput
	// Minimum throughput of the connector in Mbps. Default and min is 200. Refers to the expected throughput when using an e2-micro machine type.
	// Value must be a multiple of 100 from 200 through 900. Must be lower than the value specified by max_throughput.
	// Only one of `minThroughput` and `minInstances` can be specified. The use of minThroughput is discouraged in favor of min_instances.
	MinThroughput pulumi.IntPtrInput
	// The name of the resource (Max 25 characters).
	Name pulumi.StringPtrInput
	// Name or selfLink of the VPC network. Required if `ipCidrRange` is set.
	Network pulumi.StringPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
	// Region where the VPC Access connector resides. If it is not provided, the provider region is used.
	Region pulumi.StringPtrInput
	// The subnet in which to house the connector
	// Structure is documented below.
	Subnet ConnectorSubnetPtrInput
}

func (ConnectorArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*connectorArgs)(nil)).Elem()
}

type ConnectorInput interface {
	pulumi.Input

	ToConnectorOutput() ConnectorOutput
	ToConnectorOutputWithContext(ctx context.Context) ConnectorOutput
}

func (*Connector) ElementType() reflect.Type {
	return reflect.TypeOf((**Connector)(nil)).Elem()
}

func (i *Connector) ToConnectorOutput() ConnectorOutput {
	return i.ToConnectorOutputWithContext(context.Background())
}

func (i *Connector) ToConnectorOutputWithContext(ctx context.Context) ConnectorOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConnectorOutput)
}

// ConnectorArrayInput is an input type that accepts ConnectorArray and ConnectorArrayOutput values.
// You can construct a concrete instance of `ConnectorArrayInput` via:
//
//	ConnectorArray{ ConnectorArgs{...} }
type ConnectorArrayInput interface {
	pulumi.Input

	ToConnectorArrayOutput() ConnectorArrayOutput
	ToConnectorArrayOutputWithContext(context.Context) ConnectorArrayOutput
}

type ConnectorArray []ConnectorInput

func (ConnectorArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Connector)(nil)).Elem()
}

func (i ConnectorArray) ToConnectorArrayOutput() ConnectorArrayOutput {
	return i.ToConnectorArrayOutputWithContext(context.Background())
}

func (i ConnectorArray) ToConnectorArrayOutputWithContext(ctx context.Context) ConnectorArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConnectorArrayOutput)
}

// ConnectorMapInput is an input type that accepts ConnectorMap and ConnectorMapOutput values.
// You can construct a concrete instance of `ConnectorMapInput` via:
//
//	ConnectorMap{ "key": ConnectorArgs{...} }
type ConnectorMapInput interface {
	pulumi.Input

	ToConnectorMapOutput() ConnectorMapOutput
	ToConnectorMapOutputWithContext(context.Context) ConnectorMapOutput
}

type ConnectorMap map[string]ConnectorInput

func (ConnectorMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Connector)(nil)).Elem()
}

func (i ConnectorMap) ToConnectorMapOutput() ConnectorMapOutput {
	return i.ToConnectorMapOutputWithContext(context.Background())
}

func (i ConnectorMap) ToConnectorMapOutputWithContext(ctx context.Context) ConnectorMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConnectorMapOutput)
}

type ConnectorOutput struct{ *pulumi.OutputState }

func (ConnectorOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Connector)(nil)).Elem()
}

func (o ConnectorOutput) ToConnectorOutput() ConnectorOutput {
	return o
}

func (o ConnectorOutput) ToConnectorOutputWithContext(ctx context.Context) ConnectorOutput {
	return o
}

// List of projects using the connector.
func (o ConnectorOutput) ConnectedProjects() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Connector) pulumi.StringArrayOutput { return v.ConnectedProjects }).(pulumi.StringArrayOutput)
}

// The range of internal addresses that follows RFC 4632 notation. Example: `10.132.0.0/28`.
func (o ConnectorOutput) IpCidrRange() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Connector) pulumi.StringPtrOutput { return v.IpCidrRange }).(pulumi.StringPtrOutput)
}

// Machine type of VM Instance underlying connector. Default is e2-micro
func (o ConnectorOutput) MachineType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Connector) pulumi.StringPtrOutput { return v.MachineType }).(pulumi.StringPtrOutput)
}

// Maximum value of instances in autoscaling group underlying the connector. Value must be between 3 and 10, inclusive. Must be
// higher than the value specified by min_instances. Required alongside `minInstances` if not using `minThroughput`/`maxThroughput`.
func (o ConnectorOutput) MaxInstances() pulumi.IntOutput {
	return o.ApplyT(func(v *Connector) pulumi.IntOutput { return v.MaxInstances }).(pulumi.IntOutput)
}

// Maximum throughput of the connector in Mbps, must be greater than `minThroughput`. Default is 300. Refers to the expected throughput
// when using an e2-micro machine type. Value must be a multiple of 100 from 300 through 1000. Must be higher than the value specified by
// min_throughput. Only one of `maxThroughput` and `maxInstances` can be specified. The use of maxThroughput is discouraged in favor of max_instances.
func (o ConnectorOutput) MaxThroughput() pulumi.IntOutput {
	return o.ApplyT(func(v *Connector) pulumi.IntOutput { return v.MaxThroughput }).(pulumi.IntOutput)
}

// Minimum value of instances in autoscaling group underlying the connector. Value must be between 2 and 9, inclusive. Must be
// lower than the value specified by max_instances. Required alongside `maxInstances` if not using `minThroughput`/`maxThroughput`.
func (o ConnectorOutput) MinInstances() pulumi.IntOutput {
	return o.ApplyT(func(v *Connector) pulumi.IntOutput { return v.MinInstances }).(pulumi.IntOutput)
}

// Minimum throughput of the connector in Mbps. Default and min is 200. Refers to the expected throughput when using an e2-micro machine type.
// Value must be a multiple of 100 from 200 through 900. Must be lower than the value specified by max_throughput.
// Only one of `minThroughput` and `minInstances` can be specified. The use of minThroughput is discouraged in favor of min_instances.
func (o ConnectorOutput) MinThroughput() pulumi.IntOutput {
	return o.ApplyT(func(v *Connector) pulumi.IntOutput { return v.MinThroughput }).(pulumi.IntOutput)
}

// The name of the resource (Max 25 characters).
func (o ConnectorOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Connector) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Name or selfLink of the VPC network. Required if `ipCidrRange` is set.
func (o ConnectorOutput) Network() pulumi.StringOutput {
	return o.ApplyT(func(v *Connector) pulumi.StringOutput { return v.Network }).(pulumi.StringOutput)
}

// The ID of the project in which the resource belongs.
// If it is not provided, the provider project is used.
func (o ConnectorOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *Connector) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// Region where the VPC Access connector resides. If it is not provided, the provider region is used.
func (o ConnectorOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v *Connector) pulumi.StringOutput { return v.Region }).(pulumi.StringOutput)
}

// The fully qualified name of this VPC connector
func (o ConnectorOutput) SelfLink() pulumi.StringOutput {
	return o.ApplyT(func(v *Connector) pulumi.StringOutput { return v.SelfLink }).(pulumi.StringOutput)
}

// State of the VPC access connector.
func (o ConnectorOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v *Connector) pulumi.StringOutput { return v.State }).(pulumi.StringOutput)
}

// The subnet in which to house the connector
// Structure is documented below.
func (o ConnectorOutput) Subnet() ConnectorSubnetPtrOutput {
	return o.ApplyT(func(v *Connector) ConnectorSubnetPtrOutput { return v.Subnet }).(ConnectorSubnetPtrOutput)
}

type ConnectorArrayOutput struct{ *pulumi.OutputState }

func (ConnectorArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Connector)(nil)).Elem()
}

func (o ConnectorArrayOutput) ToConnectorArrayOutput() ConnectorArrayOutput {
	return o
}

func (o ConnectorArrayOutput) ToConnectorArrayOutputWithContext(ctx context.Context) ConnectorArrayOutput {
	return o
}

func (o ConnectorArrayOutput) Index(i pulumi.IntInput) ConnectorOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Connector {
		return vs[0].([]*Connector)[vs[1].(int)]
	}).(ConnectorOutput)
}

type ConnectorMapOutput struct{ *pulumi.OutputState }

func (ConnectorMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Connector)(nil)).Elem()
}

func (o ConnectorMapOutput) ToConnectorMapOutput() ConnectorMapOutput {
	return o
}

func (o ConnectorMapOutput) ToConnectorMapOutputWithContext(ctx context.Context) ConnectorMapOutput {
	return o
}

func (o ConnectorMapOutput) MapIndex(k pulumi.StringInput) ConnectorOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Connector {
		return vs[0].(map[string]*Connector)[vs[1].(string)]
	}).(ConnectorOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ConnectorInput)(nil)).Elem(), &Connector{})
	pulumi.RegisterInputType(reflect.TypeOf((*ConnectorArrayInput)(nil)).Elem(), ConnectorArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ConnectorMapInput)(nil)).Elem(), ConnectorMap{})
	pulumi.RegisterOutputType(ConnectorOutput{})
	pulumi.RegisterOutputType(ConnectorArrayOutput{})
	pulumi.RegisterOutputType(ConnectorMapOutput{})
}
