// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package edgecontainer

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// "A set of Kubernetes nodes in a cluster with common configuration and specification."
//
// To get more information about NodePool, see:
//
// * [API documentation](https://cloud.google.com/distributed-cloud/edge/latest/docs/reference/container/rest/v1/projects.locations.clusters.nodePools)
// * How-to Guides
//   - [Google Distributed Cloud Edge](https://cloud.google.com/distributed-cloud/edge/latest/docs)
//
// ## Example Usage
//
// ### Edgecontainer Node Pool
//
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/edgecontainer"
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/organizations"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			project, err := organizations.LookupProject(ctx, &organizations.LookupProjectArgs{}, nil)
//			if err != nil {
//				return err
//			}
//			cluster, err := edgecontainer.NewCluster(ctx, "cluster", &edgecontainer.ClusterArgs{
//				Name:     pulumi.String("default"),
//				Location: pulumi.String("us-central1"),
//				Authorization: &edgecontainer.ClusterAuthorizationArgs{
//					AdminUsers: &edgecontainer.ClusterAuthorizationAdminUsersArgs{
//						Username: pulumi.String("admin@hashicorptest.com"),
//					},
//				},
//				Networking: &edgecontainer.ClusterNetworkingArgs{
//					ClusterIpv4CidrBlocks: pulumi.StringArray{
//						pulumi.String("10.0.0.0/16"),
//					},
//					ServicesIpv4CidrBlocks: pulumi.StringArray{
//						pulumi.String("10.1.0.0/16"),
//					},
//				},
//				Fleet: &edgecontainer.ClusterFleetArgs{
//					Project: pulumi.Sprintf("projects/%v", project.Number),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = edgecontainer.NewNodePool(ctx, "default", &edgecontainer.NodePoolArgs{
//				Name:         pulumi.String("nodepool-1"),
//				Cluster:      cluster.Name,
//				Location:     pulumi.String("us-central1"),
//				NodeLocation: pulumi.String("us-central1-edge-example-edgesite"),
//				NodeCount:    pulumi.Int(3),
//				Labels: pulumi.StringMap{
//					"my_key":    pulumi.String("my_val"),
//					"other_key": pulumi.String("other_val"),
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
// ### Edgecontainer Node Pool With Cmek
//
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/edgecontainer"
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/kms"
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/organizations"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			project, err := organizations.LookupProject(ctx, &organizations.LookupProjectArgs{}, nil)
//			if err != nil {
//				return err
//			}
//			cluster, err := edgecontainer.NewCluster(ctx, "cluster", &edgecontainer.ClusterArgs{
//				Name:     pulumi.String("default"),
//				Location: pulumi.String("us-central1"),
//				Authorization: &edgecontainer.ClusterAuthorizationArgs{
//					AdminUsers: &edgecontainer.ClusterAuthorizationAdminUsersArgs{
//						Username: pulumi.String("admin@hashicorptest.com"),
//					},
//				},
//				Networking: &edgecontainer.ClusterNetworkingArgs{
//					ClusterIpv4CidrBlocks: pulumi.StringArray{
//						pulumi.String("10.0.0.0/16"),
//					},
//					ServicesIpv4CidrBlocks: pulumi.StringArray{
//						pulumi.String("10.1.0.0/16"),
//					},
//				},
//				Fleet: &edgecontainer.ClusterFleetArgs{
//					Project: pulumi.Sprintf("projects/%v", project.Number),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			keyRing, err := kms.NewKeyRing(ctx, "key_ring", &kms.KeyRingArgs{
//				Name:     pulumi.String("keyring"),
//				Location: pulumi.String("us-central1"),
//			})
//			if err != nil {
//				return err
//			}
//			cryptoKeyCryptoKey, err := kms.NewCryptoKey(ctx, "crypto_key", &kms.CryptoKeyArgs{
//				Name:    pulumi.String("key"),
//				KeyRing: keyRing.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			cryptoKey, err := kms.NewCryptoKeyIAMMember(ctx, "crypto_key", &kms.CryptoKeyIAMMemberArgs{
//				CryptoKeyId: cryptoKeyCryptoKey.ID(),
//				Role:        pulumi.String("roles/cloudkms.cryptoKeyEncrypterDecrypter"),
//				Member:      pulumi.Sprintf("serviceAccount:service-%v@gcp-sa-edgecontainer.iam.gserviceaccount.com", project.Number),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = edgecontainer.NewNodePool(ctx, "default", &edgecontainer.NodePoolArgs{
//				Name:         pulumi.String("nodepool-1"),
//				Cluster:      cluster.Name,
//				Location:     pulumi.String("us-central1"),
//				NodeLocation: pulumi.String("us-central1-edge-example-edgesite"),
//				NodeCount:    pulumi.Int(3),
//				LocalDiskEncryption: &edgecontainer.NodePoolLocalDiskEncryptionArgs{
//					KmsKey: cryptoKeyCryptoKey.ID(),
//				},
//			}, pulumi.DependsOn([]pulumi.Resource{
//				cryptoKey,
//			}))
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Edgecontainer Local Control Plane Node Pool
//
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/edgecontainer"
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/organizations"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			project, err := organizations.LookupProject(ctx, &organizations.LookupProjectArgs{}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = edgecontainer.NewCluster(ctx, "default", &edgecontainer.ClusterArgs{
//				Name:     pulumi.String("default"),
//				Location: pulumi.String("us-central1"),
//				Authorization: &edgecontainer.ClusterAuthorizationArgs{
//					AdminUsers: &edgecontainer.ClusterAuthorizationAdminUsersArgs{
//						Username: pulumi.String("admin@hashicorptest.com"),
//					},
//				},
//				Networking: &edgecontainer.ClusterNetworkingArgs{
//					ClusterIpv4CidrBlocks: pulumi.StringArray{
//						pulumi.String("10.0.0.0/16"),
//					},
//					ServicesIpv4CidrBlocks: pulumi.StringArray{
//						pulumi.String("10.1.0.0/16"),
//					},
//				},
//				Fleet: &edgecontainer.ClusterFleetArgs{
//					Project: pulumi.Sprintf("projects/%v", project.Number),
//				},
//				ExternalLoadBalancerIpv4AddressPools: pulumi.StringArray{
//					pulumi.String("10.100.0.0-10.100.0.10"),
//				},
//				ControlPlane: &edgecontainer.ClusterControlPlaneArgs{
//					Local: &edgecontainer.ClusterControlPlaneLocalArgs{
//						NodeLocation:           pulumi.String("us-central1-edge-example-edgesite"),
//						NodeCount:              pulumi.Int(1),
//						MachineFilter:          pulumi.String("machine-name"),
//						SharedDeploymentPolicy: pulumi.String("ALLOWED"),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = edgecontainer.NewNodePool(ctx, "default", &edgecontainer.NodePoolArgs{
//				Name:         pulumi.String("nodepool-1"),
//				Cluster:      pulumi.Any(cluster.Name),
//				Location:     pulumi.String("us-central1"),
//				NodeLocation: pulumi.String("us-central1-edge-example-edgesite"),
//				NodeCount:    pulumi.Int(3),
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
// NodePool can be imported using any of these accepted formats:
//
// * `projects/{{project}}/locations/{{location}}/clusters/{{cluster}}/nodePools/{{name}}`
//
// * `{{project}}/{{location}}/{{cluster}}/{{name}}`
//
// * `{{location}}/{{cluster}}/{{name}}`
//
// When using the `pulumi import` command, NodePool can be imported using one of the formats above. For example:
//
// ```sh
// $ pulumi import gcp:edgecontainer/nodePool:NodePool default projects/{{project}}/locations/{{location}}/clusters/{{cluster}}/nodePools/{{name}}
// ```
//
// ```sh
// $ pulumi import gcp:edgecontainer/nodePool:NodePool default {{project}}/{{location}}/{{cluster}}/{{name}}
// ```
//
// ```sh
// $ pulumi import gcp:edgecontainer/nodePool:NodePool default {{location}}/{{cluster}}/{{name}}
// ```
type NodePool struct {
	pulumi.CustomResourceState

	// The name of the target Distributed Cloud Edge Cluster.
	Cluster pulumi.StringOutput `pulumi:"cluster"`
	// The time when the node pool was created.
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
	EffectiveLabels pulumi.StringMapOutput `pulumi:"effectiveLabels"`
	// Labels associated with this resource.
	// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
	// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
	Labels pulumi.StringMapOutput `pulumi:"labels"`
	// Local disk encryption options. This field is only used when enabling CMEK support.
	// Structure is documented below.
	LocalDiskEncryption NodePoolLocalDiskEncryptionPtrOutput `pulumi:"localDiskEncryption"`
	// The location of the resource.
	Location pulumi.StringOutput `pulumi:"location"`
	// Only machines matching this filter will be allowed to join the node pool.
	// The filtering language accepts strings like "name=<name>", and is
	// documented in more detail in [AIP-160](https://google.aip.dev/160).
	MachineFilter pulumi.StringOutput `pulumi:"machineFilter"`
	// The resource name of the node pool.
	Name pulumi.StringOutput `pulumi:"name"`
	// Configuration for each node in the NodePool
	// Structure is documented below.
	NodeConfig NodePoolNodeConfigOutput `pulumi:"nodeConfig"`
	// The number of nodes in the pool.
	NodeCount pulumi.IntOutput `pulumi:"nodeCount"`
	// Name of the Google Distributed Cloud Edge zone where this node pool will be created. For example: `us-central1-edge-customer-a`.
	NodeLocation pulumi.StringOutput `pulumi:"nodeLocation"`
	// The lowest release version among all worker nodes.
	NodeVersion pulumi.StringOutput `pulumi:"nodeVersion"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringOutput `pulumi:"project"`
	// The combination of labels configured directly on the resource
	// and default labels configured on the provider.
	PulumiLabels pulumi.StringMapOutput `pulumi:"pulumiLabels"`
	// The time when the node pool was last updated.
	UpdateTime pulumi.StringOutput `pulumi:"updateTime"`
}

// NewNodePool registers a new resource with the given unique name, arguments, and options.
func NewNodePool(ctx *pulumi.Context,
	name string, args *NodePoolArgs, opts ...pulumi.ResourceOption) (*NodePool, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Cluster == nil {
		return nil, errors.New("invalid value for required argument 'Cluster'")
	}
	if args.Location == nil {
		return nil, errors.New("invalid value for required argument 'Location'")
	}
	if args.NodeCount == nil {
		return nil, errors.New("invalid value for required argument 'NodeCount'")
	}
	if args.NodeLocation == nil {
		return nil, errors.New("invalid value for required argument 'NodeLocation'")
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"effectiveLabels",
		"pulumiLabels",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource NodePool
	err := ctx.RegisterResource("gcp:edgecontainer/nodePool:NodePool", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetNodePool gets an existing NodePool resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetNodePool(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *NodePoolState, opts ...pulumi.ResourceOption) (*NodePool, error) {
	var resource NodePool
	err := ctx.ReadResource("gcp:edgecontainer/nodePool:NodePool", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering NodePool resources.
type nodePoolState struct {
	// The name of the target Distributed Cloud Edge Cluster.
	Cluster *string `pulumi:"cluster"`
	// The time when the node pool was created.
	CreateTime *string `pulumi:"createTime"`
	// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
	EffectiveLabels map[string]string `pulumi:"effectiveLabels"`
	// Labels associated with this resource.
	// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
	// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
	Labels map[string]string `pulumi:"labels"`
	// Local disk encryption options. This field is only used when enabling CMEK support.
	// Structure is documented below.
	LocalDiskEncryption *NodePoolLocalDiskEncryption `pulumi:"localDiskEncryption"`
	// The location of the resource.
	Location *string `pulumi:"location"`
	// Only machines matching this filter will be allowed to join the node pool.
	// The filtering language accepts strings like "name=<name>", and is
	// documented in more detail in [AIP-160](https://google.aip.dev/160).
	MachineFilter *string `pulumi:"machineFilter"`
	// The resource name of the node pool.
	Name *string `pulumi:"name"`
	// Configuration for each node in the NodePool
	// Structure is documented below.
	NodeConfig *NodePoolNodeConfig `pulumi:"nodeConfig"`
	// The number of nodes in the pool.
	NodeCount *int `pulumi:"nodeCount"`
	// Name of the Google Distributed Cloud Edge zone where this node pool will be created. For example: `us-central1-edge-customer-a`.
	NodeLocation *string `pulumi:"nodeLocation"`
	// The lowest release version among all worker nodes.
	NodeVersion *string `pulumi:"nodeVersion"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
	// The combination of labels configured directly on the resource
	// and default labels configured on the provider.
	PulumiLabels map[string]string `pulumi:"pulumiLabels"`
	// The time when the node pool was last updated.
	UpdateTime *string `pulumi:"updateTime"`
}

type NodePoolState struct {
	// The name of the target Distributed Cloud Edge Cluster.
	Cluster pulumi.StringPtrInput
	// The time when the node pool was created.
	CreateTime pulumi.StringPtrInput
	// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
	EffectiveLabels pulumi.StringMapInput
	// Labels associated with this resource.
	// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
	// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
	Labels pulumi.StringMapInput
	// Local disk encryption options. This field is only used when enabling CMEK support.
	// Structure is documented below.
	LocalDiskEncryption NodePoolLocalDiskEncryptionPtrInput
	// The location of the resource.
	Location pulumi.StringPtrInput
	// Only machines matching this filter will be allowed to join the node pool.
	// The filtering language accepts strings like "name=<name>", and is
	// documented in more detail in [AIP-160](https://google.aip.dev/160).
	MachineFilter pulumi.StringPtrInput
	// The resource name of the node pool.
	Name pulumi.StringPtrInput
	// Configuration for each node in the NodePool
	// Structure is documented below.
	NodeConfig NodePoolNodeConfigPtrInput
	// The number of nodes in the pool.
	NodeCount pulumi.IntPtrInput
	// Name of the Google Distributed Cloud Edge zone where this node pool will be created. For example: `us-central1-edge-customer-a`.
	NodeLocation pulumi.StringPtrInput
	// The lowest release version among all worker nodes.
	NodeVersion pulumi.StringPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
	// The combination of labels configured directly on the resource
	// and default labels configured on the provider.
	PulumiLabels pulumi.StringMapInput
	// The time when the node pool was last updated.
	UpdateTime pulumi.StringPtrInput
}

func (NodePoolState) ElementType() reflect.Type {
	return reflect.TypeOf((*nodePoolState)(nil)).Elem()
}

type nodePoolArgs struct {
	// The name of the target Distributed Cloud Edge Cluster.
	Cluster string `pulumi:"cluster"`
	// Labels associated with this resource.
	// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
	// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
	Labels map[string]string `pulumi:"labels"`
	// Local disk encryption options. This field is only used when enabling CMEK support.
	// Structure is documented below.
	LocalDiskEncryption *NodePoolLocalDiskEncryption `pulumi:"localDiskEncryption"`
	// The location of the resource.
	Location string `pulumi:"location"`
	// Only machines matching this filter will be allowed to join the node pool.
	// The filtering language accepts strings like "name=<name>", and is
	// documented in more detail in [AIP-160](https://google.aip.dev/160).
	MachineFilter *string `pulumi:"machineFilter"`
	// The resource name of the node pool.
	Name *string `pulumi:"name"`
	// Configuration for each node in the NodePool
	// Structure is documented below.
	NodeConfig *NodePoolNodeConfig `pulumi:"nodeConfig"`
	// The number of nodes in the pool.
	NodeCount int `pulumi:"nodeCount"`
	// Name of the Google Distributed Cloud Edge zone where this node pool will be created. For example: `us-central1-edge-customer-a`.
	NodeLocation string `pulumi:"nodeLocation"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
}

// The set of arguments for constructing a NodePool resource.
type NodePoolArgs struct {
	// The name of the target Distributed Cloud Edge Cluster.
	Cluster pulumi.StringInput
	// Labels associated with this resource.
	// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
	// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
	Labels pulumi.StringMapInput
	// Local disk encryption options. This field is only used when enabling CMEK support.
	// Structure is documented below.
	LocalDiskEncryption NodePoolLocalDiskEncryptionPtrInput
	// The location of the resource.
	Location pulumi.StringInput
	// Only machines matching this filter will be allowed to join the node pool.
	// The filtering language accepts strings like "name=<name>", and is
	// documented in more detail in [AIP-160](https://google.aip.dev/160).
	MachineFilter pulumi.StringPtrInput
	// The resource name of the node pool.
	Name pulumi.StringPtrInput
	// Configuration for each node in the NodePool
	// Structure is documented below.
	NodeConfig NodePoolNodeConfigPtrInput
	// The number of nodes in the pool.
	NodeCount pulumi.IntInput
	// Name of the Google Distributed Cloud Edge zone where this node pool will be created. For example: `us-central1-edge-customer-a`.
	NodeLocation pulumi.StringInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
}

func (NodePoolArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*nodePoolArgs)(nil)).Elem()
}

type NodePoolInput interface {
	pulumi.Input

	ToNodePoolOutput() NodePoolOutput
	ToNodePoolOutputWithContext(ctx context.Context) NodePoolOutput
}

func (*NodePool) ElementType() reflect.Type {
	return reflect.TypeOf((**NodePool)(nil)).Elem()
}

func (i *NodePool) ToNodePoolOutput() NodePoolOutput {
	return i.ToNodePoolOutputWithContext(context.Background())
}

func (i *NodePool) ToNodePoolOutputWithContext(ctx context.Context) NodePoolOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NodePoolOutput)
}

// NodePoolArrayInput is an input type that accepts NodePoolArray and NodePoolArrayOutput values.
// You can construct a concrete instance of `NodePoolArrayInput` via:
//
//	NodePoolArray{ NodePoolArgs{...} }
type NodePoolArrayInput interface {
	pulumi.Input

	ToNodePoolArrayOutput() NodePoolArrayOutput
	ToNodePoolArrayOutputWithContext(context.Context) NodePoolArrayOutput
}

type NodePoolArray []NodePoolInput

func (NodePoolArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NodePool)(nil)).Elem()
}

func (i NodePoolArray) ToNodePoolArrayOutput() NodePoolArrayOutput {
	return i.ToNodePoolArrayOutputWithContext(context.Background())
}

func (i NodePoolArray) ToNodePoolArrayOutputWithContext(ctx context.Context) NodePoolArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NodePoolArrayOutput)
}

// NodePoolMapInput is an input type that accepts NodePoolMap and NodePoolMapOutput values.
// You can construct a concrete instance of `NodePoolMapInput` via:
//
//	NodePoolMap{ "key": NodePoolArgs{...} }
type NodePoolMapInput interface {
	pulumi.Input

	ToNodePoolMapOutput() NodePoolMapOutput
	ToNodePoolMapOutputWithContext(context.Context) NodePoolMapOutput
}

type NodePoolMap map[string]NodePoolInput

func (NodePoolMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NodePool)(nil)).Elem()
}

func (i NodePoolMap) ToNodePoolMapOutput() NodePoolMapOutput {
	return i.ToNodePoolMapOutputWithContext(context.Background())
}

func (i NodePoolMap) ToNodePoolMapOutputWithContext(ctx context.Context) NodePoolMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NodePoolMapOutput)
}

type NodePoolOutput struct{ *pulumi.OutputState }

func (NodePoolOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**NodePool)(nil)).Elem()
}

func (o NodePoolOutput) ToNodePoolOutput() NodePoolOutput {
	return o
}

func (o NodePoolOutput) ToNodePoolOutputWithContext(ctx context.Context) NodePoolOutput {
	return o
}

// The name of the target Distributed Cloud Edge Cluster.
func (o NodePoolOutput) Cluster() pulumi.StringOutput {
	return o.ApplyT(func(v *NodePool) pulumi.StringOutput { return v.Cluster }).(pulumi.StringOutput)
}

// The time when the node pool was created.
func (o NodePoolOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *NodePool) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
func (o NodePoolOutput) EffectiveLabels() pulumi.StringMapOutput {
	return o.ApplyT(func(v *NodePool) pulumi.StringMapOutput { return v.EffectiveLabels }).(pulumi.StringMapOutput)
}

// Labels associated with this resource.
// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
func (o NodePoolOutput) Labels() pulumi.StringMapOutput {
	return o.ApplyT(func(v *NodePool) pulumi.StringMapOutput { return v.Labels }).(pulumi.StringMapOutput)
}

// Local disk encryption options. This field is only used when enabling CMEK support.
// Structure is documented below.
func (o NodePoolOutput) LocalDiskEncryption() NodePoolLocalDiskEncryptionPtrOutput {
	return o.ApplyT(func(v *NodePool) NodePoolLocalDiskEncryptionPtrOutput { return v.LocalDiskEncryption }).(NodePoolLocalDiskEncryptionPtrOutput)
}

// The location of the resource.
func (o NodePoolOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *NodePool) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// Only machines matching this filter will be allowed to join the node pool.
// The filtering language accepts strings like "name=<name>", and is
// documented in more detail in [AIP-160](https://google.aip.dev/160).
func (o NodePoolOutput) MachineFilter() pulumi.StringOutput {
	return o.ApplyT(func(v *NodePool) pulumi.StringOutput { return v.MachineFilter }).(pulumi.StringOutput)
}

// The resource name of the node pool.
func (o NodePoolOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *NodePool) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Configuration for each node in the NodePool
// Structure is documented below.
func (o NodePoolOutput) NodeConfig() NodePoolNodeConfigOutput {
	return o.ApplyT(func(v *NodePool) NodePoolNodeConfigOutput { return v.NodeConfig }).(NodePoolNodeConfigOutput)
}

// The number of nodes in the pool.
func (o NodePoolOutput) NodeCount() pulumi.IntOutput {
	return o.ApplyT(func(v *NodePool) pulumi.IntOutput { return v.NodeCount }).(pulumi.IntOutput)
}

// Name of the Google Distributed Cloud Edge zone where this node pool will be created. For example: `us-central1-edge-customer-a`.
func (o NodePoolOutput) NodeLocation() pulumi.StringOutput {
	return o.ApplyT(func(v *NodePool) pulumi.StringOutput { return v.NodeLocation }).(pulumi.StringOutput)
}

// The lowest release version among all worker nodes.
func (o NodePoolOutput) NodeVersion() pulumi.StringOutput {
	return o.ApplyT(func(v *NodePool) pulumi.StringOutput { return v.NodeVersion }).(pulumi.StringOutput)
}

// The ID of the project in which the resource belongs.
// If it is not provided, the provider project is used.
func (o NodePoolOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *NodePool) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// The combination of labels configured directly on the resource
// and default labels configured on the provider.
func (o NodePoolOutput) PulumiLabels() pulumi.StringMapOutput {
	return o.ApplyT(func(v *NodePool) pulumi.StringMapOutput { return v.PulumiLabels }).(pulumi.StringMapOutput)
}

// The time when the node pool was last updated.
func (o NodePoolOutput) UpdateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *NodePool) pulumi.StringOutput { return v.UpdateTime }).(pulumi.StringOutput)
}

type NodePoolArrayOutput struct{ *pulumi.OutputState }

func (NodePoolArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NodePool)(nil)).Elem()
}

func (o NodePoolArrayOutput) ToNodePoolArrayOutput() NodePoolArrayOutput {
	return o
}

func (o NodePoolArrayOutput) ToNodePoolArrayOutputWithContext(ctx context.Context) NodePoolArrayOutput {
	return o
}

func (o NodePoolArrayOutput) Index(i pulumi.IntInput) NodePoolOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *NodePool {
		return vs[0].([]*NodePool)[vs[1].(int)]
	}).(NodePoolOutput)
}

type NodePoolMapOutput struct{ *pulumi.OutputState }

func (NodePoolMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NodePool)(nil)).Elem()
}

func (o NodePoolMapOutput) ToNodePoolMapOutput() NodePoolMapOutput {
	return o
}

func (o NodePoolMapOutput) ToNodePoolMapOutputWithContext(ctx context.Context) NodePoolMapOutput {
	return o
}

func (o NodePoolMapOutput) MapIndex(k pulumi.StringInput) NodePoolOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *NodePool {
		return vs[0].(map[string]*NodePool)[vs[1].(string)]
	}).(NodePoolOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*NodePoolInput)(nil)).Elem(), &NodePool{})
	pulumi.RegisterInputType(reflect.TypeOf((*NodePoolArrayInput)(nil)).Elem(), NodePoolArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*NodePoolMapInput)(nil)).Elem(), NodePoolMap{})
	pulumi.RegisterOutputType(NodePoolOutput{})
	pulumi.RegisterOutputType(NodePoolArrayOutput{})
	pulumi.RegisterOutputType(NodePoolMapOutput{})
}
