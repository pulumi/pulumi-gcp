// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 * ### Gkeonprem Bare Metal Cluster Basic
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const cluster_basic = new gcp.gkeonprem.BareMetalCluster("cluster-basic", {
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
 *                 avoidBuggyIps: true,
 *                 manualAssign: true,
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
 * ```
 * ### Gkeonprem Bare Metal Cluster Manuallb
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const cluster_manuallb = new gcp.gkeonprem.BareMetalCluster("cluster-manuallb", {
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
 *         manualLbConfig: {
 *             enabled: true,
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
 * ```
 * ### Gkeonprem Bare Metal Cluster Bgplb
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const cluster_bgplb = new gcp.gkeonprem.BareMetalCluster("cluster-bgplb", {
 *     location: "us-west1",
 *     adminClusterMembership: "projects/870316890899/locations/global/memberships/gkeonprem-terraform-test",
 *     bareMetalVersion: "1.12.3",
 *     networkConfig: {
 *         islandModeCidr: {
 *             serviceAddressCidrBlocks: ["172.26.0.0/16"],
 *             podAddressCidrBlocks: ["10.240.0.0/13"],
 *         },
 *         advancedNetworking: true,
 *         multipleNetworkInterfacesConfig: {
 *             enabled: true,
 *         },
 *         srIovConfig: {
 *             enabled: true,
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
 *                 taints: [{
 *                     key: "test-key",
 *                     value: "test-value",
 *                     effect: "NO_EXECUTE",
 *                 }],
 *             },
 *         },
 *         apiServerArgs: [{
 *             argument: "test-argument",
 *             value: "test-value",
 *         }],
 *     },
 *     loadBalancer: {
 *         portConfig: {
 *             controlPlaneLoadBalancerPort: 443,
 *         },
 *         vipConfig: {
 *             controlPlaneVip: "10.200.0.13",
 *             ingressVip: "10.200.0.14",
 *         },
 *         bgpLbConfig: {
 *             asn: 123456,
 *             bgpPeerConfigs: [{
 *                 asn: 123457,
 *                 ipAddress: "10.0.0.1",
 *                 controlPlaneNodes: ["test-node"],
 *             }],
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
 *             loadBalancerNodePoolConfig: {
 *                 nodePoolConfig: {
 *                     labels: {},
 *                     operatingSystem: "LINUX",
 *                     nodeConfigs: [{
 *                         labels: {},
 *                         nodeIp: "10.200.0.9",
 *                     }],
 *                     taints: [{
 *                         key: "test-key",
 *                         value: "test-value",
 *                         effect: "NO_EXECUTE",
 *                     }],
 *                     kubeletConfig: {
 *                         registryPullQps: 10,
 *                         registryBurst: 12,
 *                         serializeImagePullsDisabled: true,
 *                     },
 *                 },
 *             },
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
 *     proxy: {
 *         uri: "http://test-domain/test",
 *         noProxies: ["127.0.0.1"],
 *     },
 *     clusterOperations: {
 *         enableApplicationLogs: true,
 *     },
 *     maintenanceConfig: {
 *         maintenanceAddressCidrBlocks: ["192.168.0.1/20"],
 *     },
 *     nodeConfig: {
 *         maxPodsPerNode: 10,
 *         containerRuntime: "CONTAINERD",
 *     },
 *     nodeAccessConfig: {
 *         loginUser: "test@example.com",
 *     },
 *     osEnvironmentConfig: {
 *         packageRepoExcluded: true,
 *     },
 * }, {
 *     provider: google_beta,
 * });
 * ```
 *
 * ## Import
 *
 * BareMetalCluster can be imported using any of these accepted formats
 *
 * ```sh
 *  $ pulumi import gcp:gkeonprem/bareMetalCluster:BareMetalCluster default projects/{{project}}/locations/{{location}}/bareMetalClusters/{{name}}
 * ```
 *
 * ```sh
 *  $ pulumi import gcp:gkeonprem/bareMetalCluster:BareMetalCluster default {{project}}/{{location}}/{{name}}
 * ```
 *
 * ```sh
 *  $ pulumi import gcp:gkeonprem/bareMetalCluster:BareMetalCluster default {{location}}/{{name}}
 * ```
 */
export class BareMetalCluster extends pulumi.CustomResource {
    /**
     * Get an existing BareMetalCluster resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: BareMetalClusterState, opts?: pulumi.CustomResourceOptions): BareMetalCluster {
        return new BareMetalCluster(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:gkeonprem/bareMetalCluster:BareMetalCluster';

    /**
     * Returns true if the given object is an instance of BareMetalCluster.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is BareMetalCluster {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === BareMetalCluster.__pulumiType;
    }

    /**
     * The Admin Cluster this Bare Metal User Cluster belongs to.
     * This is the full resource name of the Admin Cluster's hub membership.
     */
    public readonly adminClusterMembership!: pulumi.Output<string>;
    /**
     * Annotations on the Bare Metal User Cluster.
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
     * A human readable description of this Bare Metal User Cluster.
     */
    public readonly bareMetalVersion!: pulumi.Output<string>;
    /**
     * Specifies the User Cluster's observability infrastructure.
     * Structure is documented below.
     */
    public readonly clusterOperations!: pulumi.Output<outputs.gkeonprem.BareMetalClusterClusterOperations | undefined>;
    /**
     * Specifies the control plane configuration.
     * Structure is documented below.
     */
    public readonly controlPlane!: pulumi.Output<outputs.gkeonprem.BareMetalClusterControlPlane>;
    /**
     * The time the cluster was created, in RFC3339 text format.
     */
    public /*out*/ readonly createTime!: pulumi.Output<string>;
    /**
     * The time the cluster was deleted, in RFC3339 text format.
     */
    public /*out*/ readonly deleteTime!: pulumi.Output<string>;
    /**
     * A human readable description of this Bare Metal User Cluster.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The IP address name of Bare Metal User Cluster's API server.
     */
    public /*out*/ readonly endpoint!: pulumi.Output<string>;
    /**
     * This checksum is computed by the server based on the value of other
     * fields, and may be sent on update and delete requests to ensure the
     * client has an up-to-date value before proceeding.
     * Allows clients to perform consistent read-modify-writes
     * through optimistic concurrency control.
     */
    public /*out*/ readonly etag!: pulumi.Output<string>;
    /**
     * Fleet related configuration.
     * Fleets are a Google Cloud concept for logically organizing clusters,
     * letting you use and manage multi-cluster capabilities and apply
     * consistent policies across your systems.
     * See [Anthos Fleets](https://cloud.google.com/anthos/multicluster-management/fleets) for
     * more details on Anthos multi-cluster capabilities using Fleets.
     * Structure is documented below.
     */
    public /*out*/ readonly fleets!: pulumi.Output<outputs.gkeonprem.BareMetalClusterFleet[]>;
    /**
     * Specifies the load balancer configuration.
     * Structure is documented below.
     */
    public readonly loadBalancer!: pulumi.Output<outputs.gkeonprem.BareMetalClusterLoadBalancer>;
    /**
     * The object name of the Bare Metal Cluster custom resource on the
     * associated admin cluster. This field is used to support conflicting
     * names when enrolling existing clusters to the API. When used as a part of
     * cluster enrollment, this field will differ from the ID in the resource
     * name. For new clusters, this field will match the user provided cluster ID
     * and be visible in the last component of the resource name. It is not
     * modifiable.
     * All users should use this name to access their cluster using gkectl or
     * kubectl and should expect to see the local name when viewing admin
     * cluster controller logs.
     */
    public /*out*/ readonly localName!: pulumi.Output<string>;
    /**
     * The location of the resource.
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * Specifies the workload node configurations.
     * Structure is documented below.
     */
    public readonly maintenanceConfig!: pulumi.Output<outputs.gkeonprem.BareMetalClusterMaintenanceConfig | undefined>;
    /**
     * The bare metal cluster name.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Network configuration.
     * Structure is documented below.
     */
    public readonly networkConfig!: pulumi.Output<outputs.gkeonprem.BareMetalClusterNetworkConfig>;
    /**
     * Specifies the node access related settings for the bare metal user cluster.
     * Structure is documented below.
     */
    public readonly nodeAccessConfig!: pulumi.Output<outputs.gkeonprem.BareMetalClusterNodeAccessConfig | undefined>;
    /**
     * Specifies the workload node configurations.
     * Structure is documented below.
     */
    public readonly nodeConfig!: pulumi.Output<outputs.gkeonprem.BareMetalClusterNodeConfig | undefined>;
    /**
     * OS environment related configurations.
     * Structure is documented below.
     */
    public readonly osEnvironmentConfig!: pulumi.Output<outputs.gkeonprem.BareMetalClusterOsEnvironmentConfig | undefined>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    public readonly project!: pulumi.Output<string>;
    /**
     * Specifies the cluster proxy configuration.
     * Structure is documented below.
     */
    public readonly proxy!: pulumi.Output<outputs.gkeonprem.BareMetalClusterProxy | undefined>;
    /**
     * If set, there are currently changes in flight to the Bare Metal User Cluster.
     */
    public /*out*/ readonly reconciling!: pulumi.Output<boolean>;
    /**
     * Specifies the security related settings for the Bare Metal User Cluster.
     * Structure is documented below.
     */
    public readonly securityConfig!: pulumi.Output<outputs.gkeonprem.BareMetalClusterSecurityConfig | undefined>;
    /**
     * (Output)
     * The lifecycle state of the condition.
     */
    public /*out*/ readonly state!: pulumi.Output<string>;
    /**
     * (Output)
     * Specifies the detailed validation check status
     * Structure is documented below.
     */
    public /*out*/ readonly statuses!: pulumi.Output<outputs.gkeonprem.BareMetalClusterStatus[]>;
    /**
     * Specifies the cluster storage configuration.
     * Structure is documented below.
     */
    public readonly storage!: pulumi.Output<outputs.gkeonprem.BareMetalClusterStorage>;
    /**
     * The unique identifier of the Bare Metal User Cluster.
     */
    public /*out*/ readonly uid!: pulumi.Output<string>;
    /**
     * The time the cluster was last updated, in RFC3339 text format.
     */
    public /*out*/ readonly updateTime!: pulumi.Output<string>;
    /**
     * Specifies the security related settings for the Bare Metal User Cluster.
     * Structure is documented below.
     */
    public /*out*/ readonly validationChecks!: pulumi.Output<outputs.gkeonprem.BareMetalClusterValidationCheck[]>;

    /**
     * Create a BareMetalCluster resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: BareMetalClusterArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: BareMetalClusterArgs | BareMetalClusterState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as BareMetalClusterState | undefined;
            resourceInputs["adminClusterMembership"] = state ? state.adminClusterMembership : undefined;
            resourceInputs["annotations"] = state ? state.annotations : undefined;
            resourceInputs["bareMetalVersion"] = state ? state.bareMetalVersion : undefined;
            resourceInputs["clusterOperations"] = state ? state.clusterOperations : undefined;
            resourceInputs["controlPlane"] = state ? state.controlPlane : undefined;
            resourceInputs["createTime"] = state ? state.createTime : undefined;
            resourceInputs["deleteTime"] = state ? state.deleteTime : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["endpoint"] = state ? state.endpoint : undefined;
            resourceInputs["etag"] = state ? state.etag : undefined;
            resourceInputs["fleets"] = state ? state.fleets : undefined;
            resourceInputs["loadBalancer"] = state ? state.loadBalancer : undefined;
            resourceInputs["localName"] = state ? state.localName : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["maintenanceConfig"] = state ? state.maintenanceConfig : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["networkConfig"] = state ? state.networkConfig : undefined;
            resourceInputs["nodeAccessConfig"] = state ? state.nodeAccessConfig : undefined;
            resourceInputs["nodeConfig"] = state ? state.nodeConfig : undefined;
            resourceInputs["osEnvironmentConfig"] = state ? state.osEnvironmentConfig : undefined;
            resourceInputs["project"] = state ? state.project : undefined;
            resourceInputs["proxy"] = state ? state.proxy : undefined;
            resourceInputs["reconciling"] = state ? state.reconciling : undefined;
            resourceInputs["securityConfig"] = state ? state.securityConfig : undefined;
            resourceInputs["state"] = state ? state.state : undefined;
            resourceInputs["statuses"] = state ? state.statuses : undefined;
            resourceInputs["storage"] = state ? state.storage : undefined;
            resourceInputs["uid"] = state ? state.uid : undefined;
            resourceInputs["updateTime"] = state ? state.updateTime : undefined;
            resourceInputs["validationChecks"] = state ? state.validationChecks : undefined;
        } else {
            const args = argsOrState as BareMetalClusterArgs | undefined;
            if ((!args || args.adminClusterMembership === undefined) && !opts.urn) {
                throw new Error("Missing required property 'adminClusterMembership'");
            }
            if ((!args || args.bareMetalVersion === undefined) && !opts.urn) {
                throw new Error("Missing required property 'bareMetalVersion'");
            }
            if ((!args || args.controlPlane === undefined) && !opts.urn) {
                throw new Error("Missing required property 'controlPlane'");
            }
            if ((!args || args.loadBalancer === undefined) && !opts.urn) {
                throw new Error("Missing required property 'loadBalancer'");
            }
            if ((!args || args.location === undefined) && !opts.urn) {
                throw new Error("Missing required property 'location'");
            }
            if ((!args || args.networkConfig === undefined) && !opts.urn) {
                throw new Error("Missing required property 'networkConfig'");
            }
            if ((!args || args.storage === undefined) && !opts.urn) {
                throw new Error("Missing required property 'storage'");
            }
            resourceInputs["adminClusterMembership"] = args ? args.adminClusterMembership : undefined;
            resourceInputs["annotations"] = args ? args.annotations : undefined;
            resourceInputs["bareMetalVersion"] = args ? args.bareMetalVersion : undefined;
            resourceInputs["clusterOperations"] = args ? args.clusterOperations : undefined;
            resourceInputs["controlPlane"] = args ? args.controlPlane : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["loadBalancer"] = args ? args.loadBalancer : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["maintenanceConfig"] = args ? args.maintenanceConfig : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["networkConfig"] = args ? args.networkConfig : undefined;
            resourceInputs["nodeAccessConfig"] = args ? args.nodeAccessConfig : undefined;
            resourceInputs["nodeConfig"] = args ? args.nodeConfig : undefined;
            resourceInputs["osEnvironmentConfig"] = args ? args.osEnvironmentConfig : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["proxy"] = args ? args.proxy : undefined;
            resourceInputs["securityConfig"] = args ? args.securityConfig : undefined;
            resourceInputs["storage"] = args ? args.storage : undefined;
            resourceInputs["createTime"] = undefined /*out*/;
            resourceInputs["deleteTime"] = undefined /*out*/;
            resourceInputs["endpoint"] = undefined /*out*/;
            resourceInputs["etag"] = undefined /*out*/;
            resourceInputs["fleets"] = undefined /*out*/;
            resourceInputs["localName"] = undefined /*out*/;
            resourceInputs["reconciling"] = undefined /*out*/;
            resourceInputs["state"] = undefined /*out*/;
            resourceInputs["statuses"] = undefined /*out*/;
            resourceInputs["uid"] = undefined /*out*/;
            resourceInputs["updateTime"] = undefined /*out*/;
            resourceInputs["validationChecks"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(BareMetalCluster.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering BareMetalCluster resources.
 */
export interface BareMetalClusterState {
    /**
     * The Admin Cluster this Bare Metal User Cluster belongs to.
     * This is the full resource name of the Admin Cluster's hub membership.
     */
    adminClusterMembership?: pulumi.Input<string>;
    /**
     * Annotations on the Bare Metal User Cluster.
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
     * A human readable description of this Bare Metal User Cluster.
     */
    bareMetalVersion?: pulumi.Input<string>;
    /**
     * Specifies the User Cluster's observability infrastructure.
     * Structure is documented below.
     */
    clusterOperations?: pulumi.Input<inputs.gkeonprem.BareMetalClusterClusterOperations>;
    /**
     * Specifies the control plane configuration.
     * Structure is documented below.
     */
    controlPlane?: pulumi.Input<inputs.gkeonprem.BareMetalClusterControlPlane>;
    /**
     * The time the cluster was created, in RFC3339 text format.
     */
    createTime?: pulumi.Input<string>;
    /**
     * The time the cluster was deleted, in RFC3339 text format.
     */
    deleteTime?: pulumi.Input<string>;
    /**
     * A human readable description of this Bare Metal User Cluster.
     */
    description?: pulumi.Input<string>;
    /**
     * The IP address name of Bare Metal User Cluster's API server.
     */
    endpoint?: pulumi.Input<string>;
    /**
     * This checksum is computed by the server based on the value of other
     * fields, and may be sent on update and delete requests to ensure the
     * client has an up-to-date value before proceeding.
     * Allows clients to perform consistent read-modify-writes
     * through optimistic concurrency control.
     */
    etag?: pulumi.Input<string>;
    /**
     * Fleet related configuration.
     * Fleets are a Google Cloud concept for logically organizing clusters,
     * letting you use and manage multi-cluster capabilities and apply
     * consistent policies across your systems.
     * See [Anthos Fleets](https://cloud.google.com/anthos/multicluster-management/fleets) for
     * more details on Anthos multi-cluster capabilities using Fleets.
     * Structure is documented below.
     */
    fleets?: pulumi.Input<pulumi.Input<inputs.gkeonprem.BareMetalClusterFleet>[]>;
    /**
     * Specifies the load balancer configuration.
     * Structure is documented below.
     */
    loadBalancer?: pulumi.Input<inputs.gkeonprem.BareMetalClusterLoadBalancer>;
    /**
     * The object name of the Bare Metal Cluster custom resource on the
     * associated admin cluster. This field is used to support conflicting
     * names when enrolling existing clusters to the API. When used as a part of
     * cluster enrollment, this field will differ from the ID in the resource
     * name. For new clusters, this field will match the user provided cluster ID
     * and be visible in the last component of the resource name. It is not
     * modifiable.
     * All users should use this name to access their cluster using gkectl or
     * kubectl and should expect to see the local name when viewing admin
     * cluster controller logs.
     */
    localName?: pulumi.Input<string>;
    /**
     * The location of the resource.
     */
    location?: pulumi.Input<string>;
    /**
     * Specifies the workload node configurations.
     * Structure is documented below.
     */
    maintenanceConfig?: pulumi.Input<inputs.gkeonprem.BareMetalClusterMaintenanceConfig>;
    /**
     * The bare metal cluster name.
     */
    name?: pulumi.Input<string>;
    /**
     * Network configuration.
     * Structure is documented below.
     */
    networkConfig?: pulumi.Input<inputs.gkeonprem.BareMetalClusterNetworkConfig>;
    /**
     * Specifies the node access related settings for the bare metal user cluster.
     * Structure is documented below.
     */
    nodeAccessConfig?: pulumi.Input<inputs.gkeonprem.BareMetalClusterNodeAccessConfig>;
    /**
     * Specifies the workload node configurations.
     * Structure is documented below.
     */
    nodeConfig?: pulumi.Input<inputs.gkeonprem.BareMetalClusterNodeConfig>;
    /**
     * OS environment related configurations.
     * Structure is documented below.
     */
    osEnvironmentConfig?: pulumi.Input<inputs.gkeonprem.BareMetalClusterOsEnvironmentConfig>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * Specifies the cluster proxy configuration.
     * Structure is documented below.
     */
    proxy?: pulumi.Input<inputs.gkeonprem.BareMetalClusterProxy>;
    /**
     * If set, there are currently changes in flight to the Bare Metal User Cluster.
     */
    reconciling?: pulumi.Input<boolean>;
    /**
     * Specifies the security related settings for the Bare Metal User Cluster.
     * Structure is documented below.
     */
    securityConfig?: pulumi.Input<inputs.gkeonprem.BareMetalClusterSecurityConfig>;
    /**
     * (Output)
     * The lifecycle state of the condition.
     */
    state?: pulumi.Input<string>;
    /**
     * (Output)
     * Specifies the detailed validation check status
     * Structure is documented below.
     */
    statuses?: pulumi.Input<pulumi.Input<inputs.gkeonprem.BareMetalClusterStatus>[]>;
    /**
     * Specifies the cluster storage configuration.
     * Structure is documented below.
     */
    storage?: pulumi.Input<inputs.gkeonprem.BareMetalClusterStorage>;
    /**
     * The unique identifier of the Bare Metal User Cluster.
     */
    uid?: pulumi.Input<string>;
    /**
     * The time the cluster was last updated, in RFC3339 text format.
     */
    updateTime?: pulumi.Input<string>;
    /**
     * Specifies the security related settings for the Bare Metal User Cluster.
     * Structure is documented below.
     */
    validationChecks?: pulumi.Input<pulumi.Input<inputs.gkeonprem.BareMetalClusterValidationCheck>[]>;
}

/**
 * The set of arguments for constructing a BareMetalCluster resource.
 */
export interface BareMetalClusterArgs {
    /**
     * The Admin Cluster this Bare Metal User Cluster belongs to.
     * This is the full resource name of the Admin Cluster's hub membership.
     */
    adminClusterMembership: pulumi.Input<string>;
    /**
     * Annotations on the Bare Metal User Cluster.
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
     * A human readable description of this Bare Metal User Cluster.
     */
    bareMetalVersion: pulumi.Input<string>;
    /**
     * Specifies the User Cluster's observability infrastructure.
     * Structure is documented below.
     */
    clusterOperations?: pulumi.Input<inputs.gkeonprem.BareMetalClusterClusterOperations>;
    /**
     * Specifies the control plane configuration.
     * Structure is documented below.
     */
    controlPlane: pulumi.Input<inputs.gkeonprem.BareMetalClusterControlPlane>;
    /**
     * A human readable description of this Bare Metal User Cluster.
     */
    description?: pulumi.Input<string>;
    /**
     * Specifies the load balancer configuration.
     * Structure is documented below.
     */
    loadBalancer: pulumi.Input<inputs.gkeonprem.BareMetalClusterLoadBalancer>;
    /**
     * The location of the resource.
     */
    location: pulumi.Input<string>;
    /**
     * Specifies the workload node configurations.
     * Structure is documented below.
     */
    maintenanceConfig?: pulumi.Input<inputs.gkeonprem.BareMetalClusterMaintenanceConfig>;
    /**
     * The bare metal cluster name.
     */
    name?: pulumi.Input<string>;
    /**
     * Network configuration.
     * Structure is documented below.
     */
    networkConfig: pulumi.Input<inputs.gkeonprem.BareMetalClusterNetworkConfig>;
    /**
     * Specifies the node access related settings for the bare metal user cluster.
     * Structure is documented below.
     */
    nodeAccessConfig?: pulumi.Input<inputs.gkeonprem.BareMetalClusterNodeAccessConfig>;
    /**
     * Specifies the workload node configurations.
     * Structure is documented below.
     */
    nodeConfig?: pulumi.Input<inputs.gkeonprem.BareMetalClusterNodeConfig>;
    /**
     * OS environment related configurations.
     * Structure is documented below.
     */
    osEnvironmentConfig?: pulumi.Input<inputs.gkeonprem.BareMetalClusterOsEnvironmentConfig>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * Specifies the cluster proxy configuration.
     * Structure is documented below.
     */
    proxy?: pulumi.Input<inputs.gkeonprem.BareMetalClusterProxy>;
    /**
     * Specifies the security related settings for the Bare Metal User Cluster.
     * Structure is documented below.
     */
    securityConfig?: pulumi.Input<inputs.gkeonprem.BareMetalClusterSecurityConfig>;
    /**
     * Specifies the cluster storage configuration.
     * Structure is documented below.
     */
    storage: pulumi.Input<inputs.gkeonprem.BareMetalClusterStorage>;
}