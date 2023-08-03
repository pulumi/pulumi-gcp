// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 * ### Gkeonprem Bare Metal Node Pool Basic
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const default_basic = new gcp.gkeonprem.BareMetalCluster("default-basic", {
 *     location: "us-west1",
 *     adminClusterMembership: "projects/870316890899/locations/global/memberships/gkeonprem-terraform-test",
 *     bareMetalVersion: "1.12.3",
 *     networkConfig: {
 *         islandModeCidr: {
 *             serviceAddressCidrBlocks: ["172.26.0.0/16"],
 *             podAddressCidrBlocks: ["10.240.0.0/13"],
 *         },
 *     },
 *     controlPlane: {
 *         controlPlaneNodePoolConfig: {
 *             nodePoolConfig: {
 *                 labels: {},
 *                 operatingSystem: "LINUX",
 *                 nodeConfigs: [{
 *                     labels: {},
 *                     nodeIp: "10.200.0.9",
 *                 }],
 *             },
 *         },
 *     },
 *     loadBalancer: {
 *         portConfig: {
 *             controlPlaneLoadBalancerPort: 443,
 *         },
 *         vipConfig: {
 *             controlPlaneVip: "10.200.0.13",
 *             ingressVip: "10.200.0.14",
 *         },
 *         metalLbConfig: {
 *             addressPools: [{
 *                 pool: "pool1",
 *                 addresses: [
 *                     "10.200.0.14/32",
 *                     "10.200.0.15/32",
 *                     "10.200.0.16/32",
 *                     "10.200.0.17/32",
 *                     "10.200.0.18/32",
 *                     "fd00:1::f/128",
 *                     "fd00:1::10/128",
 *                     "fd00:1::11/128",
 *                     "fd00:1::12/128",
 *                 ],
 *             }],
 *         },
 *     },
 *     storage: {
 *         lvpShareConfig: {
 *             lvpConfig: {
 *                 path: "/mnt/localpv-share",
 *                 storageClass: "local-shared",
 *             },
 *             sharedPathPvCount: 5,
 *         },
 *         lvpNodeMountsConfig: {
 *             path: "/mnt/localpv-disk",
 *             storageClass: "local-disks",
 *         },
 *     },
 *     securityConfig: {
 *         authorization: {
 *             adminUsers: [{
 *                 username: "admin@hashicorptest.com",
 *             }],
 *         },
 *     },
 * }, {
 *     provider: google_beta,
 * });
 * const nodepool_basic = new gcp.gkeonprem.BareMetalNodePool("nodepool-basic", {
 *     bareMetalCluster: default_basic.name,
 *     location: "us-west1",
 *     nodePoolConfig: {
 *         operatingSystem: "LINUX",
 *         nodeConfigs: [{
 *             nodeIp: "10.200.0.11",
 *         }],
 *     },
 * }, {
 *     provider: google_beta,
 * });
 * ```
 * ### Gkeonprem Bare Metal Node Pool Full
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const default_full = new gcp.gkeonprem.BareMetalCluster("default-full", {
 *     location: "us-west1",
 *     adminClusterMembership: "projects/870316890899/locations/global/memberships/gkeonprem-terraform-test",
 *     bareMetalVersion: "1.12.3",
 *     networkConfig: {
 *         islandModeCidr: {
 *             serviceAddressCidrBlocks: ["172.26.0.0/16"],
 *             podAddressCidrBlocks: ["10.240.0.0/13"],
 *         },
 *     },
 *     controlPlane: {
 *         controlPlaneNodePoolConfig: {
 *             nodePoolConfig: {
 *                 labels: {},
 *                 operatingSystem: "LINUX",
 *                 nodeConfigs: [{
 *                     labels: {},
 *                     nodeIp: "10.200.0.9",
 *                 }],
 *             },
 *         },
 *     },
 *     loadBalancer: {
 *         portConfig: {
 *             controlPlaneLoadBalancerPort: 443,
 *         },
 *         vipConfig: {
 *             controlPlaneVip: "10.200.0.13",
 *             ingressVip: "10.200.0.14",
 *         },
 *         metalLbConfig: {
 *             addressPools: [{
 *                 pool: "pool1",
 *                 addresses: [
 *                     "10.200.0.14/32",
 *                     "10.200.0.15/32",
 *                     "10.200.0.16/32",
 *                     "10.200.0.17/32",
 *                     "10.200.0.18/32",
 *                     "fd00:1::f/128",
 *                     "fd00:1::10/128",
 *                     "fd00:1::11/128",
 *                     "fd00:1::12/128",
 *                 ],
 *             }],
 *         },
 *     },
 *     storage: {
 *         lvpShareConfig: {
 *             lvpConfig: {
 *                 path: "/mnt/localpv-share",
 *                 storageClass: "local-shared",
 *             },
 *             sharedPathPvCount: 5,
 *         },
 *         lvpNodeMountsConfig: {
 *             path: "/mnt/localpv-disk",
 *             storageClass: "local-disks",
 *         },
 *     },
 *     securityConfig: {
 *         authorization: {
 *             adminUsers: [{
 *                 username: "admin@hashicorptest.com",
 *             }],
 *         },
 *     },
 * }, {
 *     provider: google_beta,
 * });
 * const nodepool_full = new gcp.gkeonprem.BareMetalNodePool("nodepool-full", {
 *     displayName: "test-name",
 *     bareMetalCluster: default_full.name,
 *     location: "us-west1",
 *     annotations: {},
 *     nodePoolConfig: {
 *         operatingSystem: "LINUX",
 *         labels: {},
 *         nodeConfigs: [{
 *             nodeIp: "10.200.0.11",
 *             labels: {},
 *         }],
 *         taints: [{
 *             key: "test-key",
 *             value: "test-value",
 *             effect: "NO_EXECUTE",
 *         }],
 *     },
 * }, {
 *     provider: google_beta,
 * });
 * ```
 *
 * ## Import
 *
 * BareMetalNodePool can be imported using any of these accepted formats
 *
 * ```sh
 *  $ pulumi import gcp:gkeonprem/bareMetalNodePool:BareMetalNodePool default projects/{{project}}/locations/{{location}}/bareMetalClusters/{{bare_metal_cluster}}/bareMetalNodePools/{{name}}
 * ```
 *
 * ```sh
 *  $ pulumi import gcp:gkeonprem/bareMetalNodePool:BareMetalNodePool default {{project}}/{{location}}/{{bare_metal_cluster}}/{{name}}
 * ```
 *
 * ```sh
 *  $ pulumi import gcp:gkeonprem/bareMetalNodePool:BareMetalNodePool default {{location}}/{{bare_metal_cluster}}/{{name}}
 * ```
 */
export class BareMetalNodePool extends pulumi.CustomResource {
    /**
     * Get an existing BareMetalNodePool resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: BareMetalNodePoolState, opts?: pulumi.CustomResourceOptions): BareMetalNodePool {
        return new BareMetalNodePool(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:gkeonprem/bareMetalNodePool:BareMetalNodePool';

    /**
     * Returns true if the given object is an instance of BareMetalNodePool.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is BareMetalNodePool {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === BareMetalNodePool.__pulumiType;
    }

    /**
     * Annotations on the Bare Metal Node Pool.
     * This field has the same restrictions as Kubernetes annotations.
     * The total size of all keys and values combined is limited to 256k.
     * Key can have 2 segments: prefix (optional) and name (required),
     * separated by a slash (/).
     * Prefix must be a DNS subdomain.
     * Name must be 63 characters or less, begin and end with alphanumerics,
     * with dashes (-), underscores (_), dots (.), and alphanumerics between.
     */
    public readonly annotations!: pulumi.Output<{[key: string]: string}>;
    /**
     * The cluster this node pool belongs to.
     */
    public readonly bareMetalCluster!: pulumi.Output<string>;
    /**
     * The time the cluster was created, in RFC3339 text format.
     */
    public /*out*/ readonly createTime!: pulumi.Output<string>;
    /**
     * The time the cluster was deleted, in RFC3339 text format.
     */
    public /*out*/ readonly deleteTime!: pulumi.Output<string>;
    /**
     * The display name for the Bare Metal Node Pool.
     */
    public readonly displayName!: pulumi.Output<string | undefined>;
    /**
     * This checksum is computed by the server based on the value of other
     * fields, and may be sent on update and delete requests to ensure the
     * client has an up-to-date value before proceeding.
     * Allows clients to perform consistent read-modify-writes
     * through optimistic concurrency control.
     */
    public /*out*/ readonly etag!: pulumi.Output<string>;
    /**
     * The location of the resource.
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * The bare metal node pool name.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Node pool configuration.
     * Structure is documented below.
     */
    public readonly nodePoolConfig!: pulumi.Output<outputs.gkeonprem.BareMetalNodePoolNodePoolConfig>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    public readonly project!: pulumi.Output<string>;
    /**
     * If set, there are currently changes in flight to the Bare Metal User Cluster.
     */
    public /*out*/ readonly reconciling!: pulumi.Output<boolean>;
    /**
     * (Output)
     * The lifecycle state of the condition.
     */
    public /*out*/ readonly state!: pulumi.Output<string>;
    /**
     * Specifies detailed node pool status.
     * Structure is documented below.
     */
    public /*out*/ readonly statuses!: pulumi.Output<outputs.gkeonprem.BareMetalNodePoolStatus[]>;
    /**
     * The unique identifier of the Bare Metal Node Pool.
     */
    public /*out*/ readonly uid!: pulumi.Output<string>;
    /**
     * The time the cluster was last updated, in RFC3339 text format.
     */
    public /*out*/ readonly updateTime!: pulumi.Output<string>;

    /**
     * Create a BareMetalNodePool resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: BareMetalNodePoolArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: BareMetalNodePoolArgs | BareMetalNodePoolState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as BareMetalNodePoolState | undefined;
            resourceInputs["annotations"] = state ? state.annotations : undefined;
            resourceInputs["bareMetalCluster"] = state ? state.bareMetalCluster : undefined;
            resourceInputs["createTime"] = state ? state.createTime : undefined;
            resourceInputs["deleteTime"] = state ? state.deleteTime : undefined;
            resourceInputs["displayName"] = state ? state.displayName : undefined;
            resourceInputs["etag"] = state ? state.etag : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["nodePoolConfig"] = state ? state.nodePoolConfig : undefined;
            resourceInputs["project"] = state ? state.project : undefined;
            resourceInputs["reconciling"] = state ? state.reconciling : undefined;
            resourceInputs["state"] = state ? state.state : undefined;
            resourceInputs["statuses"] = state ? state.statuses : undefined;
            resourceInputs["uid"] = state ? state.uid : undefined;
            resourceInputs["updateTime"] = state ? state.updateTime : undefined;
        } else {
            const args = argsOrState as BareMetalNodePoolArgs | undefined;
            if ((!args || args.bareMetalCluster === undefined) && !opts.urn) {
                throw new Error("Missing required property 'bareMetalCluster'");
            }
            if ((!args || args.location === undefined) && !opts.urn) {
                throw new Error("Missing required property 'location'");
            }
            if ((!args || args.nodePoolConfig === undefined) && !opts.urn) {
                throw new Error("Missing required property 'nodePoolConfig'");
            }
            resourceInputs["annotations"] = args ? args.annotations : undefined;
            resourceInputs["bareMetalCluster"] = args ? args.bareMetalCluster : undefined;
            resourceInputs["displayName"] = args ? args.displayName : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["nodePoolConfig"] = args ? args.nodePoolConfig : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["createTime"] = undefined /*out*/;
            resourceInputs["deleteTime"] = undefined /*out*/;
            resourceInputs["etag"] = undefined /*out*/;
            resourceInputs["reconciling"] = undefined /*out*/;
            resourceInputs["state"] = undefined /*out*/;
            resourceInputs["statuses"] = undefined /*out*/;
            resourceInputs["uid"] = undefined /*out*/;
            resourceInputs["updateTime"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(BareMetalNodePool.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering BareMetalNodePool resources.
 */
export interface BareMetalNodePoolState {
    /**
     * Annotations on the Bare Metal Node Pool.
     * This field has the same restrictions as Kubernetes annotations.
     * The total size of all keys and values combined is limited to 256k.
     * Key can have 2 segments: prefix (optional) and name (required),
     * separated by a slash (/).
     * Prefix must be a DNS subdomain.
     * Name must be 63 characters or less, begin and end with alphanumerics,
     * with dashes (-), underscores (_), dots (.), and alphanumerics between.
     */
    annotations?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The cluster this node pool belongs to.
     */
    bareMetalCluster?: pulumi.Input<string>;
    /**
     * The time the cluster was created, in RFC3339 text format.
     */
    createTime?: pulumi.Input<string>;
    /**
     * The time the cluster was deleted, in RFC3339 text format.
     */
    deleteTime?: pulumi.Input<string>;
    /**
     * The display name for the Bare Metal Node Pool.
     */
    displayName?: pulumi.Input<string>;
    /**
     * This checksum is computed by the server based on the value of other
     * fields, and may be sent on update and delete requests to ensure the
     * client has an up-to-date value before proceeding.
     * Allows clients to perform consistent read-modify-writes
     * through optimistic concurrency control.
     */
    etag?: pulumi.Input<string>;
    /**
     * The location of the resource.
     */
    location?: pulumi.Input<string>;
    /**
     * The bare metal node pool name.
     */
    name?: pulumi.Input<string>;
    /**
     * Node pool configuration.
     * Structure is documented below.
     */
    nodePoolConfig?: pulumi.Input<inputs.gkeonprem.BareMetalNodePoolNodePoolConfig>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * If set, there are currently changes in flight to the Bare Metal User Cluster.
     */
    reconciling?: pulumi.Input<boolean>;
    /**
     * (Output)
     * The lifecycle state of the condition.
     */
    state?: pulumi.Input<string>;
    /**
     * Specifies detailed node pool status.
     * Structure is documented below.
     */
    statuses?: pulumi.Input<pulumi.Input<inputs.gkeonprem.BareMetalNodePoolStatus>[]>;
    /**
     * The unique identifier of the Bare Metal Node Pool.
     */
    uid?: pulumi.Input<string>;
    /**
     * The time the cluster was last updated, in RFC3339 text format.
     */
    updateTime?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a BareMetalNodePool resource.
 */
export interface BareMetalNodePoolArgs {
    /**
     * Annotations on the Bare Metal Node Pool.
     * This field has the same restrictions as Kubernetes annotations.
     * The total size of all keys and values combined is limited to 256k.
     * Key can have 2 segments: prefix (optional) and name (required),
     * separated by a slash (/).
     * Prefix must be a DNS subdomain.
     * Name must be 63 characters or less, begin and end with alphanumerics,
     * with dashes (-), underscores (_), dots (.), and alphanumerics between.
     */
    annotations?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The cluster this node pool belongs to.
     */
    bareMetalCluster: pulumi.Input<string>;
    /**
     * The display name for the Bare Metal Node Pool.
     */
    displayName?: pulumi.Input<string>;
    /**
     * The location of the resource.
     */
    location: pulumi.Input<string>;
    /**
     * The bare metal node pool name.
     */
    name?: pulumi.Input<string>;
    /**
     * Node pool configuration.
     * Structure is documented below.
     */
    nodePoolConfig: pulumi.Input<inputs.gkeonprem.BareMetalNodePoolNodePoolConfig>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
}