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

// Represents a NodeGroup resource to manage a group of sole-tenant nodes.
//
// To get more information about NodeGroup, see:
//
// * [API documentation](https://cloud.google.com/compute/docs/reference/rest/v1/nodeGroups)
// * How-to Guides
//   - [Sole-Tenant Nodes](https://cloud.google.com/compute/docs/nodes/)
//
// > **Warning:** Due to limitations of the API, this provider cannot update the
// number of nodes in a node group and changes to node group size either
// through provider config or through external changes will cause
// the provider to delete and recreate the node group.
//
// ## Example Usage
//
// ### Node Group Basic
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
//			soletenant_tmpl, err := compute.NewNodeTemplate(ctx, "soletenant-tmpl", &compute.NodeTemplateArgs{
//				Name:     pulumi.String("soletenant-tmpl"),
//				Region:   pulumi.String("us-central1"),
//				NodeType: pulumi.String("n1-node-96-624"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = compute.NewNodeGroup(ctx, "nodes", &compute.NodeGroupArgs{
//				Name:         pulumi.String("soletenant-group"),
//				Zone:         pulumi.String("us-central1-a"),
//				Description:  pulumi.String("example google_compute_node_group for the Google Provider"),
//				InitialSize:  pulumi.Int(1),
//				NodeTemplate: soletenant_tmpl.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Node Group Maintenance Interval
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
//			soletenant_tmpl, err := compute.NewNodeTemplate(ctx, "soletenant-tmpl", &compute.NodeTemplateArgs{
//				Name:     pulumi.String("soletenant-tmpl"),
//				Region:   pulumi.String("us-central1"),
//				NodeType: pulumi.String("c2-node-60-240"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = compute.NewNodeGroup(ctx, "nodes", &compute.NodeGroupArgs{
//				Name:                pulumi.String("soletenant-group"),
//				Zone:                pulumi.String("us-central1-a"),
//				Description:         pulumi.String("example google_compute_node_group for Terraform Google Provider"),
//				InitialSize:         pulumi.Int(1),
//				NodeTemplate:        soletenant_tmpl.ID(),
//				MaintenanceInterval: pulumi.String("RECURRENT"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Node Group Autoscaling Policy
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
//			soletenant_tmpl, err := compute.NewNodeTemplate(ctx, "soletenant-tmpl", &compute.NodeTemplateArgs{
//				Name:     pulumi.String("soletenant-tmpl"),
//				Region:   pulumi.String("us-central1"),
//				NodeType: pulumi.String("n1-node-96-624"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = compute.NewNodeGroup(ctx, "nodes", &compute.NodeGroupArgs{
//				Name:              pulumi.String("soletenant-group"),
//				Zone:              pulumi.String("us-central1-a"),
//				Description:       pulumi.String("example google_compute_node_group for Google Provider"),
//				MaintenancePolicy: pulumi.String("RESTART_IN_PLACE"),
//				MaintenanceWindow: &compute.NodeGroupMaintenanceWindowArgs{
//					StartTime: pulumi.String("08:00"),
//				},
//				InitialSize:  pulumi.Int(1),
//				NodeTemplate: soletenant_tmpl.ID(),
//				AutoscalingPolicy: &compute.NodeGroupAutoscalingPolicyArgs{
//					Mode:     pulumi.String("ONLY_SCALE_OUT"),
//					MinNodes: pulumi.Int(1),
//					MaxNodes: pulumi.Int(10),
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
// ### Node Group Share Settings
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/compute"
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/organizations"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			guestProject, err := organizations.NewProject(ctx, "guest_project", &organizations.ProjectArgs{
//				ProjectId:      pulumi.String("project-id"),
//				Name:           pulumi.String("project-name"),
//				OrgId:          pulumi.String("123456789"),
//				DeletionPolicy: pulumi.String("DELETE"),
//			})
//			if err != nil {
//				return err
//			}
//			soletenant_tmpl, err := compute.NewNodeTemplate(ctx, "soletenant-tmpl", &compute.NodeTemplateArgs{
//				Name:     pulumi.String("soletenant-tmpl"),
//				Region:   pulumi.String("us-central1"),
//				NodeType: pulumi.String("n1-node-96-624"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = compute.NewNodeGroup(ctx, "nodes", &compute.NodeGroupArgs{
//				Name:         pulumi.String("soletenant-group"),
//				Zone:         pulumi.String("us-central1-f"),
//				Description:  pulumi.String("example google_compute_node_group for Terraform Google Provider"),
//				InitialSize:  pulumi.Int(1),
//				NodeTemplate: soletenant_tmpl.ID(),
//				ShareSettings: &compute.NodeGroupShareSettingsArgs{
//					ShareType: pulumi.String("SPECIFIC_PROJECTS"),
//					ProjectMaps: compute.NodeGroupShareSettingsProjectMapArray{
//						&compute.NodeGroupShareSettingsProjectMapArgs{
//							Id:        guestProject.ProjectId,
//							ProjectId: guestProject.ProjectId,
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
// NodeGroup can be imported using any of these accepted formats:
//
// * `projects/{{project}}/zones/{{zone}}/nodeGroups/{{name}}`
//
// * `{{project}}/{{zone}}/{{name}}`
//
// * `{{zone}}/{{name}}`
//
// * `{{name}}`
//
// When using the `pulumi import` command, NodeGroup can be imported using one of the formats above. For example:
//
// ```sh
// $ pulumi import gcp:compute/nodeGroup:NodeGroup default projects/{{project}}/zones/{{zone}}/nodeGroups/{{name}}
// ```
//
// ```sh
// $ pulumi import gcp:compute/nodeGroup:NodeGroup default {{project}}/{{zone}}/{{name}}
// ```
//
// ```sh
// $ pulumi import gcp:compute/nodeGroup:NodeGroup default {{zone}}/{{name}}
// ```
//
// ```sh
// $ pulumi import gcp:compute/nodeGroup:NodeGroup default {{name}}
// ```
type NodeGroup struct {
	pulumi.CustomResourceState

	// If you use sole-tenant nodes for your workloads, you can use the node
	// group autoscaler to automatically manage the sizes of your node groups.
	// One of `initialSize` or `autoscalingPolicy` must be configured on resource creation.
	// Structure is documented below.
	AutoscalingPolicy NodeGroupAutoscalingPolicyOutput `pulumi:"autoscalingPolicy"`
	// Creation timestamp in RFC3339 text format.
	CreationTimestamp pulumi.StringOutput `pulumi:"creationTimestamp"`
	// An optional textual description of the resource.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The initial number of nodes in the node group. One of `initialSize` or `autoscalingPolicy` must be configured on resource creation.
	InitialSize pulumi.IntPtrOutput `pulumi:"initialSize"`
	// Specifies the frequency of planned maintenance events. Set to one of the following:
	// - AS_NEEDED: Hosts are eligible to receive infrastructure and hypervisor updates as they become available.
	// - RECURRENT: Hosts receive planned infrastructure and hypervisor updates on a periodic basis, but not more frequently than every 28 days. This minimizes the number of planned maintenance operations on individual hosts and reduces the frequency of disruptions, both live migrations and terminations, on individual VMs.
	//   Possible values are: `AS_NEEDED`, `RECURRENT`.
	MaintenanceInterval pulumi.StringOutput `pulumi:"maintenanceInterval"`
	// Specifies how to handle instances when a node in the group undergoes maintenance. Set to one of: DEFAULT, RESTART_IN_PLACE, or MIGRATE_WITHIN_NODE_GROUP. The default value is DEFAULT.
	MaintenancePolicy pulumi.StringPtrOutput `pulumi:"maintenancePolicy"`
	// contains properties for the timeframe of maintenance
	// Structure is documented below.
	MaintenanceWindow NodeGroupMaintenanceWindowPtrOutput `pulumi:"maintenanceWindow"`
	// Name of the resource.
	Name pulumi.StringOutput `pulumi:"name"`
	// The URL of the node template to which this node group belongs.
	NodeTemplate pulumi.StringOutput `pulumi:"nodeTemplate"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringOutput `pulumi:"project"`
	// The URI of the created resource.
	SelfLink pulumi.StringOutput `pulumi:"selfLink"`
	// Share settings for the node group.
	// Structure is documented below.
	ShareSettings NodeGroupShareSettingsOutput `pulumi:"shareSettings"`
	// The total number of nodes in the node group.
	Size pulumi.IntOutput `pulumi:"size"`
	// Zone where this node group is located
	Zone pulumi.StringOutput `pulumi:"zone"`
}

// NewNodeGroup registers a new resource with the given unique name, arguments, and options.
func NewNodeGroup(ctx *pulumi.Context,
	name string, args *NodeGroupArgs, opts ...pulumi.ResourceOption) (*NodeGroup, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.NodeTemplate == nil {
		return nil, errors.New("invalid value for required argument 'NodeTemplate'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource NodeGroup
	err := ctx.RegisterResource("gcp:compute/nodeGroup:NodeGroup", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetNodeGroup gets an existing NodeGroup resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetNodeGroup(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *NodeGroupState, opts ...pulumi.ResourceOption) (*NodeGroup, error) {
	var resource NodeGroup
	err := ctx.ReadResource("gcp:compute/nodeGroup:NodeGroup", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering NodeGroup resources.
type nodeGroupState struct {
	// If you use sole-tenant nodes for your workloads, you can use the node
	// group autoscaler to automatically manage the sizes of your node groups.
	// One of `initialSize` or `autoscalingPolicy` must be configured on resource creation.
	// Structure is documented below.
	AutoscalingPolicy *NodeGroupAutoscalingPolicy `pulumi:"autoscalingPolicy"`
	// Creation timestamp in RFC3339 text format.
	CreationTimestamp *string `pulumi:"creationTimestamp"`
	// An optional textual description of the resource.
	Description *string `pulumi:"description"`
	// The initial number of nodes in the node group. One of `initialSize` or `autoscalingPolicy` must be configured on resource creation.
	InitialSize *int `pulumi:"initialSize"`
	// Specifies the frequency of planned maintenance events. Set to one of the following:
	// - AS_NEEDED: Hosts are eligible to receive infrastructure and hypervisor updates as they become available.
	// - RECURRENT: Hosts receive planned infrastructure and hypervisor updates on a periodic basis, but not more frequently than every 28 days. This minimizes the number of planned maintenance operations on individual hosts and reduces the frequency of disruptions, both live migrations and terminations, on individual VMs.
	//   Possible values are: `AS_NEEDED`, `RECURRENT`.
	MaintenanceInterval *string `pulumi:"maintenanceInterval"`
	// Specifies how to handle instances when a node in the group undergoes maintenance. Set to one of: DEFAULT, RESTART_IN_PLACE, or MIGRATE_WITHIN_NODE_GROUP. The default value is DEFAULT.
	MaintenancePolicy *string `pulumi:"maintenancePolicy"`
	// contains properties for the timeframe of maintenance
	// Structure is documented below.
	MaintenanceWindow *NodeGroupMaintenanceWindow `pulumi:"maintenanceWindow"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// The URL of the node template to which this node group belongs.
	NodeTemplate *string `pulumi:"nodeTemplate"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
	// The URI of the created resource.
	SelfLink *string `pulumi:"selfLink"`
	// Share settings for the node group.
	// Structure is documented below.
	ShareSettings *NodeGroupShareSettings `pulumi:"shareSettings"`
	// The total number of nodes in the node group.
	Size *int `pulumi:"size"`
	// Zone where this node group is located
	Zone *string `pulumi:"zone"`
}

type NodeGroupState struct {
	// If you use sole-tenant nodes for your workloads, you can use the node
	// group autoscaler to automatically manage the sizes of your node groups.
	// One of `initialSize` or `autoscalingPolicy` must be configured on resource creation.
	// Structure is documented below.
	AutoscalingPolicy NodeGroupAutoscalingPolicyPtrInput
	// Creation timestamp in RFC3339 text format.
	CreationTimestamp pulumi.StringPtrInput
	// An optional textual description of the resource.
	Description pulumi.StringPtrInput
	// The initial number of nodes in the node group. One of `initialSize` or `autoscalingPolicy` must be configured on resource creation.
	InitialSize pulumi.IntPtrInput
	// Specifies the frequency of planned maintenance events. Set to one of the following:
	// - AS_NEEDED: Hosts are eligible to receive infrastructure and hypervisor updates as they become available.
	// - RECURRENT: Hosts receive planned infrastructure and hypervisor updates on a periodic basis, but not more frequently than every 28 days. This minimizes the number of planned maintenance operations on individual hosts and reduces the frequency of disruptions, both live migrations and terminations, on individual VMs.
	//   Possible values are: `AS_NEEDED`, `RECURRENT`.
	MaintenanceInterval pulumi.StringPtrInput
	// Specifies how to handle instances when a node in the group undergoes maintenance. Set to one of: DEFAULT, RESTART_IN_PLACE, or MIGRATE_WITHIN_NODE_GROUP. The default value is DEFAULT.
	MaintenancePolicy pulumi.StringPtrInput
	// contains properties for the timeframe of maintenance
	// Structure is documented below.
	MaintenanceWindow NodeGroupMaintenanceWindowPtrInput
	// Name of the resource.
	Name pulumi.StringPtrInput
	// The URL of the node template to which this node group belongs.
	NodeTemplate pulumi.StringPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
	// The URI of the created resource.
	SelfLink pulumi.StringPtrInput
	// Share settings for the node group.
	// Structure is documented below.
	ShareSettings NodeGroupShareSettingsPtrInput
	// The total number of nodes in the node group.
	Size pulumi.IntPtrInput
	// Zone where this node group is located
	Zone pulumi.StringPtrInput
}

func (NodeGroupState) ElementType() reflect.Type {
	return reflect.TypeOf((*nodeGroupState)(nil)).Elem()
}

type nodeGroupArgs struct {
	// If you use sole-tenant nodes for your workloads, you can use the node
	// group autoscaler to automatically manage the sizes of your node groups.
	// One of `initialSize` or `autoscalingPolicy` must be configured on resource creation.
	// Structure is documented below.
	AutoscalingPolicy *NodeGroupAutoscalingPolicy `pulumi:"autoscalingPolicy"`
	// An optional textual description of the resource.
	Description *string `pulumi:"description"`
	// The initial number of nodes in the node group. One of `initialSize` or `autoscalingPolicy` must be configured on resource creation.
	InitialSize *int `pulumi:"initialSize"`
	// Specifies the frequency of planned maintenance events. Set to one of the following:
	// - AS_NEEDED: Hosts are eligible to receive infrastructure and hypervisor updates as they become available.
	// - RECURRENT: Hosts receive planned infrastructure and hypervisor updates on a periodic basis, but not more frequently than every 28 days. This minimizes the number of planned maintenance operations on individual hosts and reduces the frequency of disruptions, both live migrations and terminations, on individual VMs.
	//   Possible values are: `AS_NEEDED`, `RECURRENT`.
	MaintenanceInterval *string `pulumi:"maintenanceInterval"`
	// Specifies how to handle instances when a node in the group undergoes maintenance. Set to one of: DEFAULT, RESTART_IN_PLACE, or MIGRATE_WITHIN_NODE_GROUP. The default value is DEFAULT.
	MaintenancePolicy *string `pulumi:"maintenancePolicy"`
	// contains properties for the timeframe of maintenance
	// Structure is documented below.
	MaintenanceWindow *NodeGroupMaintenanceWindow `pulumi:"maintenanceWindow"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// The URL of the node template to which this node group belongs.
	NodeTemplate string `pulumi:"nodeTemplate"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
	// Share settings for the node group.
	// Structure is documented below.
	ShareSettings *NodeGroupShareSettings `pulumi:"shareSettings"`
	// Zone where this node group is located
	Zone *string `pulumi:"zone"`
}

// The set of arguments for constructing a NodeGroup resource.
type NodeGroupArgs struct {
	// If you use sole-tenant nodes for your workloads, you can use the node
	// group autoscaler to automatically manage the sizes of your node groups.
	// One of `initialSize` or `autoscalingPolicy` must be configured on resource creation.
	// Structure is documented below.
	AutoscalingPolicy NodeGroupAutoscalingPolicyPtrInput
	// An optional textual description of the resource.
	Description pulumi.StringPtrInput
	// The initial number of nodes in the node group. One of `initialSize` or `autoscalingPolicy` must be configured on resource creation.
	InitialSize pulumi.IntPtrInput
	// Specifies the frequency of planned maintenance events. Set to one of the following:
	// - AS_NEEDED: Hosts are eligible to receive infrastructure and hypervisor updates as they become available.
	// - RECURRENT: Hosts receive planned infrastructure and hypervisor updates on a periodic basis, but not more frequently than every 28 days. This minimizes the number of planned maintenance operations on individual hosts and reduces the frequency of disruptions, both live migrations and terminations, on individual VMs.
	//   Possible values are: `AS_NEEDED`, `RECURRENT`.
	MaintenanceInterval pulumi.StringPtrInput
	// Specifies how to handle instances when a node in the group undergoes maintenance. Set to one of: DEFAULT, RESTART_IN_PLACE, or MIGRATE_WITHIN_NODE_GROUP. The default value is DEFAULT.
	MaintenancePolicy pulumi.StringPtrInput
	// contains properties for the timeframe of maintenance
	// Structure is documented below.
	MaintenanceWindow NodeGroupMaintenanceWindowPtrInput
	// Name of the resource.
	Name pulumi.StringPtrInput
	// The URL of the node template to which this node group belongs.
	NodeTemplate pulumi.StringInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
	// Share settings for the node group.
	// Structure is documented below.
	ShareSettings NodeGroupShareSettingsPtrInput
	// Zone where this node group is located
	Zone pulumi.StringPtrInput
}

func (NodeGroupArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*nodeGroupArgs)(nil)).Elem()
}

type NodeGroupInput interface {
	pulumi.Input

	ToNodeGroupOutput() NodeGroupOutput
	ToNodeGroupOutputWithContext(ctx context.Context) NodeGroupOutput
}

func (*NodeGroup) ElementType() reflect.Type {
	return reflect.TypeOf((**NodeGroup)(nil)).Elem()
}

func (i *NodeGroup) ToNodeGroupOutput() NodeGroupOutput {
	return i.ToNodeGroupOutputWithContext(context.Background())
}

func (i *NodeGroup) ToNodeGroupOutputWithContext(ctx context.Context) NodeGroupOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NodeGroupOutput)
}

// NodeGroupArrayInput is an input type that accepts NodeGroupArray and NodeGroupArrayOutput values.
// You can construct a concrete instance of `NodeGroupArrayInput` via:
//
//	NodeGroupArray{ NodeGroupArgs{...} }
type NodeGroupArrayInput interface {
	pulumi.Input

	ToNodeGroupArrayOutput() NodeGroupArrayOutput
	ToNodeGroupArrayOutputWithContext(context.Context) NodeGroupArrayOutput
}

type NodeGroupArray []NodeGroupInput

func (NodeGroupArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NodeGroup)(nil)).Elem()
}

func (i NodeGroupArray) ToNodeGroupArrayOutput() NodeGroupArrayOutput {
	return i.ToNodeGroupArrayOutputWithContext(context.Background())
}

func (i NodeGroupArray) ToNodeGroupArrayOutputWithContext(ctx context.Context) NodeGroupArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NodeGroupArrayOutput)
}

// NodeGroupMapInput is an input type that accepts NodeGroupMap and NodeGroupMapOutput values.
// You can construct a concrete instance of `NodeGroupMapInput` via:
//
//	NodeGroupMap{ "key": NodeGroupArgs{...} }
type NodeGroupMapInput interface {
	pulumi.Input

	ToNodeGroupMapOutput() NodeGroupMapOutput
	ToNodeGroupMapOutputWithContext(context.Context) NodeGroupMapOutput
}

type NodeGroupMap map[string]NodeGroupInput

func (NodeGroupMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NodeGroup)(nil)).Elem()
}

func (i NodeGroupMap) ToNodeGroupMapOutput() NodeGroupMapOutput {
	return i.ToNodeGroupMapOutputWithContext(context.Background())
}

func (i NodeGroupMap) ToNodeGroupMapOutputWithContext(ctx context.Context) NodeGroupMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NodeGroupMapOutput)
}

type NodeGroupOutput struct{ *pulumi.OutputState }

func (NodeGroupOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**NodeGroup)(nil)).Elem()
}

func (o NodeGroupOutput) ToNodeGroupOutput() NodeGroupOutput {
	return o
}

func (o NodeGroupOutput) ToNodeGroupOutputWithContext(ctx context.Context) NodeGroupOutput {
	return o
}

// If you use sole-tenant nodes for your workloads, you can use the node
// group autoscaler to automatically manage the sizes of your node groups.
// One of `initialSize` or `autoscalingPolicy` must be configured on resource creation.
// Structure is documented below.
func (o NodeGroupOutput) AutoscalingPolicy() NodeGroupAutoscalingPolicyOutput {
	return o.ApplyT(func(v *NodeGroup) NodeGroupAutoscalingPolicyOutput { return v.AutoscalingPolicy }).(NodeGroupAutoscalingPolicyOutput)
}

// Creation timestamp in RFC3339 text format.
func (o NodeGroupOutput) CreationTimestamp() pulumi.StringOutput {
	return o.ApplyT(func(v *NodeGroup) pulumi.StringOutput { return v.CreationTimestamp }).(pulumi.StringOutput)
}

// An optional textual description of the resource.
func (o NodeGroupOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *NodeGroup) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The initial number of nodes in the node group. One of `initialSize` or `autoscalingPolicy` must be configured on resource creation.
func (o NodeGroupOutput) InitialSize() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *NodeGroup) pulumi.IntPtrOutput { return v.InitialSize }).(pulumi.IntPtrOutput)
}

// Specifies the frequency of planned maintenance events. Set to one of the following:
//   - AS_NEEDED: Hosts are eligible to receive infrastructure and hypervisor updates as they become available.
//   - RECURRENT: Hosts receive planned infrastructure and hypervisor updates on a periodic basis, but not more frequently than every 28 days. This minimizes the number of planned maintenance operations on individual hosts and reduces the frequency of disruptions, both live migrations and terminations, on individual VMs.
//     Possible values are: `AS_NEEDED`, `RECURRENT`.
func (o NodeGroupOutput) MaintenanceInterval() pulumi.StringOutput {
	return o.ApplyT(func(v *NodeGroup) pulumi.StringOutput { return v.MaintenanceInterval }).(pulumi.StringOutput)
}

// Specifies how to handle instances when a node in the group undergoes maintenance. Set to one of: DEFAULT, RESTART_IN_PLACE, or MIGRATE_WITHIN_NODE_GROUP. The default value is DEFAULT.
func (o NodeGroupOutput) MaintenancePolicy() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *NodeGroup) pulumi.StringPtrOutput { return v.MaintenancePolicy }).(pulumi.StringPtrOutput)
}

// contains properties for the timeframe of maintenance
// Structure is documented below.
func (o NodeGroupOutput) MaintenanceWindow() NodeGroupMaintenanceWindowPtrOutput {
	return o.ApplyT(func(v *NodeGroup) NodeGroupMaintenanceWindowPtrOutput { return v.MaintenanceWindow }).(NodeGroupMaintenanceWindowPtrOutput)
}

// Name of the resource.
func (o NodeGroupOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *NodeGroup) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The URL of the node template to which this node group belongs.
func (o NodeGroupOutput) NodeTemplate() pulumi.StringOutput {
	return o.ApplyT(func(v *NodeGroup) pulumi.StringOutput { return v.NodeTemplate }).(pulumi.StringOutput)
}

// The ID of the project in which the resource belongs.
// If it is not provided, the provider project is used.
func (o NodeGroupOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *NodeGroup) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// The URI of the created resource.
func (o NodeGroupOutput) SelfLink() pulumi.StringOutput {
	return o.ApplyT(func(v *NodeGroup) pulumi.StringOutput { return v.SelfLink }).(pulumi.StringOutput)
}

// Share settings for the node group.
// Structure is documented below.
func (o NodeGroupOutput) ShareSettings() NodeGroupShareSettingsOutput {
	return o.ApplyT(func(v *NodeGroup) NodeGroupShareSettingsOutput { return v.ShareSettings }).(NodeGroupShareSettingsOutput)
}

// The total number of nodes in the node group.
func (o NodeGroupOutput) Size() pulumi.IntOutput {
	return o.ApplyT(func(v *NodeGroup) pulumi.IntOutput { return v.Size }).(pulumi.IntOutput)
}

// Zone where this node group is located
func (o NodeGroupOutput) Zone() pulumi.StringOutput {
	return o.ApplyT(func(v *NodeGroup) pulumi.StringOutput { return v.Zone }).(pulumi.StringOutput)
}

type NodeGroupArrayOutput struct{ *pulumi.OutputState }

func (NodeGroupArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NodeGroup)(nil)).Elem()
}

func (o NodeGroupArrayOutput) ToNodeGroupArrayOutput() NodeGroupArrayOutput {
	return o
}

func (o NodeGroupArrayOutput) ToNodeGroupArrayOutputWithContext(ctx context.Context) NodeGroupArrayOutput {
	return o
}

func (o NodeGroupArrayOutput) Index(i pulumi.IntInput) NodeGroupOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *NodeGroup {
		return vs[0].([]*NodeGroup)[vs[1].(int)]
	}).(NodeGroupOutput)
}

type NodeGroupMapOutput struct{ *pulumi.OutputState }

func (NodeGroupMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NodeGroup)(nil)).Elem()
}

func (o NodeGroupMapOutput) ToNodeGroupMapOutput() NodeGroupMapOutput {
	return o
}

func (o NodeGroupMapOutput) ToNodeGroupMapOutputWithContext(ctx context.Context) NodeGroupMapOutput {
	return o
}

func (o NodeGroupMapOutput) MapIndex(k pulumi.StringInput) NodeGroupOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *NodeGroup {
		return vs[0].(map[string]*NodeGroup)[vs[1].(string)]
	}).(NodeGroupOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*NodeGroupInput)(nil)).Elem(), &NodeGroup{})
	pulumi.RegisterInputType(reflect.TypeOf((*NodeGroupArrayInput)(nil)).Elem(), NodeGroupArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*NodeGroupMapInput)(nil)).Elem(), NodeGroupMap{})
	pulumi.RegisterOutputType(NodeGroupOutput{})
	pulumi.RegisterOutputType(NodeGroupArrayOutput{})
	pulumi.RegisterOutputType(NodeGroupMapOutput{})
}
