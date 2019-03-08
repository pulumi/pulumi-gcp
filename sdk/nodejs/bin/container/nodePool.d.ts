import * as pulumi from "@pulumi/pulumi";
/**
 * Manages a node pool in a Google Kubernetes Engine (GKE) cluster separately from
 * the cluster control plane. For more information see [the official documentation](https://cloud.google.com/container-engine/docs/node-pools)
 * and [the API reference](https://cloud.google.com/container-engine/reference/rest/v1/projects.zones.clusters.nodePools).
 */
export declare class NodePool extends pulumi.CustomResource {
    /**
     * Get an existing NodePool resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: NodePoolState, opts?: pulumi.CustomResourceOptions): NodePool;
    /**
     * Configuration required by cluster autoscaler to adjust
     * the size of the node pool to the current cluster usage. Structure is documented below.
     */
    readonly autoscaling: pulumi.Output<{
        maxNodeCount: number;
        minNodeCount: number;
    } | undefined>;
    /**
     * The cluster to create the node pool for.  Cluster must be present in `zone` provided for zonal clusters.
     */
    readonly cluster: pulumi.Output<string>;
    /**
     * The initial node count for the pool. Changing this will force
     * recreation of the resource.
     */
    readonly initialNodeCount: pulumi.Output<number>;
    readonly instanceGroupUrls: pulumi.Output<string[]>;
    /**
     * Node management configuration, wherein auto-repair and
     * auto-upgrade is configured. Structure is documented below.
     */
    readonly management: pulumi.Output<{
        autoRepair?: boolean;
        autoUpgrade?: boolean;
    }>;
    /**
     * ) The maximum number of pods per node in this node pool.
     * Note that this does not work on node pools which are "route-based" - that is, node
     * pools belonging to clusters that do not have IP Aliasing enabled.
     */
    readonly maxPodsPerNode: pulumi.Output<number>;
    /**
     * The name of the node pool. If left blank, Terraform will
     * auto-generate a unique name.
     */
    readonly name: pulumi.Output<string>;
    readonly namePrefix: pulumi.Output<string>;
    /**
     * The node configuration of the pool. See
     * google_container_cluster for schema.
     */
    readonly nodeConfig: pulumi.Output<{
        diskSizeGb: number;
        diskType: string;
        guestAccelerators: {
            count: number;
            type: string;
        }[];
        imageType: string;
        labels?: {
            [key: string]: string;
        };
        localSsdCount: number;
        machineType: string;
        metadata?: {
            [key: string]: string;
        };
        minCpuPlatform?: string;
        oauthScopes: string[];
        preemptible?: boolean;
        serviceAccount: string;
        tags?: string[];
        taints?: {
            effect: string;
            key: string;
            value: string;
        }[];
        workloadMetadataConfig?: {
            nodeMetadata: string;
        };
    }>;
    /**
     * The number of nodes per instance group. This field can be used to
     * update the number of nodes per instance group but should not be used alongside `autoscaling`.
     */
    readonly nodeCount: pulumi.Output<number>;
    /**
     * The ID of the project in which to create the node pool. If blank,
     * the provider-configured project will be used.
     */
    readonly project: pulumi.Output<string>;
    /**
     * The region in which the cluster resides (for regional clusters).
     */
    readonly region: pulumi.Output<string | undefined>;
    /**
     * The Kubernetes version for the nodes in this pool. Note that if this field
     * and `auto_upgrade` are both specified, they will fight each other for what the node version should
     * be, so setting both is highly discouraged.
     */
    readonly version: pulumi.Output<string>;
    /**
     * The zone in which the cluster resides.
     */
    readonly zone: pulumi.Output<string>;
    /**
     * Create a NodePool resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: NodePoolArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering NodePool resources.
 */
export interface NodePoolState {
    /**
     * Configuration required by cluster autoscaler to adjust
     * the size of the node pool to the current cluster usage. Structure is documented below.
     */
    readonly autoscaling?: pulumi.Input<{
        maxNodeCount: pulumi.Input<number>;
        minNodeCount: pulumi.Input<number>;
    }>;
    /**
     * The cluster to create the node pool for.  Cluster must be present in `zone` provided for zonal clusters.
     */
    readonly cluster?: pulumi.Input<string>;
    /**
     * The initial node count for the pool. Changing this will force
     * recreation of the resource.
     */
    readonly initialNodeCount?: pulumi.Input<number>;
    readonly instanceGroupUrls?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Node management configuration, wherein auto-repair and
     * auto-upgrade is configured. Structure is documented below.
     */
    readonly management?: pulumi.Input<{
        autoRepair?: pulumi.Input<boolean>;
        autoUpgrade?: pulumi.Input<boolean>;
    }>;
    /**
     * ) The maximum number of pods per node in this node pool.
     * Note that this does not work on node pools which are "route-based" - that is, node
     * pools belonging to clusters that do not have IP Aliasing enabled.
     */
    readonly maxPodsPerNode?: pulumi.Input<number>;
    /**
     * The name of the node pool. If left blank, Terraform will
     * auto-generate a unique name.
     */
    readonly name?: pulumi.Input<string>;
    readonly namePrefix?: pulumi.Input<string>;
    /**
     * The node configuration of the pool. See
     * google_container_cluster for schema.
     */
    readonly nodeConfig?: pulumi.Input<{
        diskSizeGb?: pulumi.Input<number>;
        diskType?: pulumi.Input<string>;
        guestAccelerators?: pulumi.Input<pulumi.Input<{
            count: pulumi.Input<number>;
            type: pulumi.Input<string>;
        }>[]>;
        imageType?: pulumi.Input<string>;
        labels?: pulumi.Input<{
            [key: string]: pulumi.Input<string>;
        }>;
        localSsdCount?: pulumi.Input<number>;
        machineType?: pulumi.Input<string>;
        metadata?: pulumi.Input<{
            [key: string]: pulumi.Input<string>;
        }>;
        minCpuPlatform?: pulumi.Input<string>;
        oauthScopes?: pulumi.Input<pulumi.Input<string>[]>;
        preemptible?: pulumi.Input<boolean>;
        serviceAccount?: pulumi.Input<string>;
        tags?: pulumi.Input<pulumi.Input<string>[]>;
        taints?: pulumi.Input<pulumi.Input<{
            effect: pulumi.Input<string>;
            key: pulumi.Input<string>;
            value: pulumi.Input<string>;
        }>[]>;
        workloadMetadataConfig?: pulumi.Input<{
            nodeMetadata: pulumi.Input<string>;
        }>;
    }>;
    /**
     * The number of nodes per instance group. This field can be used to
     * update the number of nodes per instance group but should not be used alongside `autoscaling`.
     */
    readonly nodeCount?: pulumi.Input<number>;
    /**
     * The ID of the project in which to create the node pool. If blank,
     * the provider-configured project will be used.
     */
    readonly project?: pulumi.Input<string>;
    /**
     * The region in which the cluster resides (for regional clusters).
     */
    readonly region?: pulumi.Input<string>;
    /**
     * The Kubernetes version for the nodes in this pool. Note that if this field
     * and `auto_upgrade` are both specified, they will fight each other for what the node version should
     * be, so setting both is highly discouraged.
     */
    readonly version?: pulumi.Input<string>;
    /**
     * The zone in which the cluster resides.
     */
    readonly zone?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a NodePool resource.
 */
export interface NodePoolArgs {
    /**
     * Configuration required by cluster autoscaler to adjust
     * the size of the node pool to the current cluster usage. Structure is documented below.
     */
    readonly autoscaling?: pulumi.Input<{
        maxNodeCount: pulumi.Input<number>;
        minNodeCount: pulumi.Input<number>;
    }>;
    /**
     * The cluster to create the node pool for.  Cluster must be present in `zone` provided for zonal clusters.
     */
    readonly cluster: pulumi.Input<string>;
    /**
     * The initial node count for the pool. Changing this will force
     * recreation of the resource.
     */
    readonly initialNodeCount?: pulumi.Input<number>;
    /**
     * Node management configuration, wherein auto-repair and
     * auto-upgrade is configured. Structure is documented below.
     */
    readonly management?: pulumi.Input<{
        autoRepair?: pulumi.Input<boolean>;
        autoUpgrade?: pulumi.Input<boolean>;
    }>;
    /**
     * ) The maximum number of pods per node in this node pool.
     * Note that this does not work on node pools which are "route-based" - that is, node
     * pools belonging to clusters that do not have IP Aliasing enabled.
     */
    readonly maxPodsPerNode?: pulumi.Input<number>;
    /**
     * The name of the node pool. If left blank, Terraform will
     * auto-generate a unique name.
     */
    readonly name?: pulumi.Input<string>;
    readonly namePrefix?: pulumi.Input<string>;
    /**
     * The node configuration of the pool. See
     * google_container_cluster for schema.
     */
    readonly nodeConfig?: pulumi.Input<{
        diskSizeGb?: pulumi.Input<number>;
        diskType?: pulumi.Input<string>;
        guestAccelerators?: pulumi.Input<pulumi.Input<{
            count: pulumi.Input<number>;
            type: pulumi.Input<string>;
        }>[]>;
        imageType?: pulumi.Input<string>;
        labels?: pulumi.Input<{
            [key: string]: pulumi.Input<string>;
        }>;
        localSsdCount?: pulumi.Input<number>;
        machineType?: pulumi.Input<string>;
        metadata?: pulumi.Input<{
            [key: string]: pulumi.Input<string>;
        }>;
        minCpuPlatform?: pulumi.Input<string>;
        oauthScopes?: pulumi.Input<pulumi.Input<string>[]>;
        preemptible?: pulumi.Input<boolean>;
        serviceAccount?: pulumi.Input<string>;
        tags?: pulumi.Input<pulumi.Input<string>[]>;
        taints?: pulumi.Input<pulumi.Input<{
            effect: pulumi.Input<string>;
            key: pulumi.Input<string>;
            value: pulumi.Input<string>;
        }>[]>;
        workloadMetadataConfig?: pulumi.Input<{
            nodeMetadata: pulumi.Input<string>;
        }>;
    }>;
    /**
     * The number of nodes per instance group. This field can be used to
     * update the number of nodes per instance group but should not be used alongside `autoscaling`.
     */
    readonly nodeCount?: pulumi.Input<number>;
    /**
     * The ID of the project in which to create the node pool. If blank,
     * the provider-configured project will be used.
     */
    readonly project?: pulumi.Input<string>;
    /**
     * The region in which the cluster resides (for regional clusters).
     */
    readonly region?: pulumi.Input<string>;
    /**
     * The Kubernetes version for the nodes in this pool. Note that if this field
     * and `auto_upgrade` are both specified, they will fight each other for what the node version should
     * be, so setting both is highly discouraged.
     */
    readonly version?: pulumi.Input<string>;
    /**
     * The zone in which the cluster resides.
     */
    readonly zone?: pulumi.Input<string>;
}
