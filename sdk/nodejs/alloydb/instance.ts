// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 * ### Alloydb Instance Basic
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const project = gcp.organizations.getProject({});
 * const defaultNetwork = new gcp.compute.Network("defaultNetwork", {}, {
 *     provider: google_beta,
 * });
 * const defaultCluster = new gcp.alloydb.Cluster("defaultCluster", {
 *     clusterId: "alloydb-cluster",
 *     location: "us-central1",
 *     network: pulumi.all([project, defaultNetwork.name]).apply(([project, name]) => `projects/${project.number}/global/networks/${name}`),
 *     initialUser: {
 *         password: "alloydb-cluster",
 *     },
 * }, {
 *     provider: google_beta,
 * });
 * const privateIpAlloc = new gcp.compute.GlobalAddress("privateIpAlloc", {
 *     addressType: "INTERNAL",
 *     purpose: "VPC_PEERING",
 *     prefixLength: 16,
 *     network: defaultNetwork.id,
 * }, {
 *     provider: google_beta,
 * });
 * const vpcConnection = new gcp.servicenetworking.Connection("vpcConnection", {
 *     network: defaultNetwork.id,
 *     service: "servicenetworking.googleapis.com",
 *     reservedPeeringRanges: [privateIpAlloc.name],
 * }, {
 *     provider: google_beta,
 * });
 * const defaultInstance = new gcp.alloydb.Instance("defaultInstance", {
 *     cluster: defaultCluster.name,
 *     instanceId: "alloydb-instance",
 *     instanceType: "PRIMARY",
 *     machineConfig: {
 *         cpuCount: 2,
 *     },
 * }, {
 *     provider: google_beta,
 *     dependsOn: [vpcConnection],
 * });
 * ```
 *
 * ## Import
 *
 * Instance can be imported using any of these accepted formats
 *
 * ```sh
 *  $ pulumi import gcp:alloydb/instance:Instance default {{cluster}}/instances/{{instance_id}}
 * ```
 *
 * ```sh
 *  $ pulumi import gcp:alloydb/instance:Instance default {{cluster}}/{{instance_id}}
 * ```
 */
export class Instance extends pulumi.CustomResource {
    /**
     * Get an existing Instance resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: InstanceState, opts?: pulumi.CustomResourceOptions): Instance {
        return new Instance(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:alloydb/instance:Instance';

    /**
     * Returns true if the given object is an instance of Instance.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Instance {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Instance.__pulumiType;
    }

    /**
     * Annotations to allow client tools to store small amount of arbitrary data. This is distinct from labels.
     */
    public readonly annotations!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Availability type of an Instance. Defaults to REGIONAL for both primary and read instances. Note that primary and read instances can have different availability types.
     * Possible values are `AVAILABILITY_TYPE_UNSPECIFIED`, `ZONAL`, and `REGIONAL`.
     */
    public readonly availabilityType!: pulumi.Output<string>;
    /**
     * Identifies the alloydb cluster. Must be in the format
     * 'projects/{project}/locations/{location}/clusters/{cluster_id}'
     */
    public readonly cluster!: pulumi.Output<string>;
    /**
     * Time the Instance was created in UTC.
     */
    public /*out*/ readonly createTime!: pulumi.Output<string>;
    /**
     * Database flags. Set at instance level. * They are copied from primary instance on read instance creation. * Read instances can set new or override existing flags that are relevant for reads, e.g. for enabling columnar cache on a read instance. Flags set on read instance may or may not be present on primary.
     */
    public readonly databaseFlags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * User-settable and human-readable display name for the Instance.
     */
    public readonly displayName!: pulumi.Output<string | undefined>;
    /**
     * The Compute Engine zone that the instance should serve from, per https://cloud.google.com/compute/docs/regions-zones This can ONLY be specified for ZONAL instances. If present for a REGIONAL instance, an error will be thrown. If this is absent for a ZONAL instance, instance is created in a random zone with available capacity.
     */
    public readonly gceZone!: pulumi.Output<string | undefined>;
    /**
     * The ID of the alloydb instance.
     */
    public readonly instanceId!: pulumi.Output<string>;
    /**
     * The type of the instance.
     * Possible values are `PRIMARY` and `READ_POOL`.
     */
    public readonly instanceType!: pulumi.Output<string>;
    /**
     * The IP address for the Instance. This is the connection endpoint for an end-user application.
     */
    public /*out*/ readonly ipAddress!: pulumi.Output<string>;
    /**
     * User-defined labels for the alloydb instance.
     */
    public readonly labels!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Configurations for the machines that host the underlying database engine.
     * Structure is documented below.
     */
    public readonly machineConfig!: pulumi.Output<outputs.alloydb.InstanceMachineConfig>;
    /**
     * The name of the instance resource.
     */
    public /*out*/ readonly name!: pulumi.Output<string>;
    /**
     * Read pool specific config.
     * Structure is documented below.
     */
    public readonly readPoolConfig!: pulumi.Output<outputs.alloydb.InstanceReadPoolConfig | undefined>;
    /**
     * Set to true if the current state of Instance does not match the user's intended state, and the service is actively
     * updating the resource to reconcile them. This can happen due to user-triggered updates or system actions like failover
     * or maintenance.
     */
    public /*out*/ readonly reconciling!: pulumi.Output<boolean>;
    /**
     * The current state of the alloydb instance.
     */
    public /*out*/ readonly state!: pulumi.Output<string>;
    /**
     * The system-generated UID of the resource.
     */
    public /*out*/ readonly uid!: pulumi.Output<string>;
    /**
     * Time the Instance was updated in UTC.
     */
    public /*out*/ readonly updateTime!: pulumi.Output<string>;

    /**
     * Create a Instance resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: InstanceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: InstanceArgs | InstanceState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as InstanceState | undefined;
            resourceInputs["annotations"] = state ? state.annotations : undefined;
            resourceInputs["availabilityType"] = state ? state.availabilityType : undefined;
            resourceInputs["cluster"] = state ? state.cluster : undefined;
            resourceInputs["createTime"] = state ? state.createTime : undefined;
            resourceInputs["databaseFlags"] = state ? state.databaseFlags : undefined;
            resourceInputs["displayName"] = state ? state.displayName : undefined;
            resourceInputs["gceZone"] = state ? state.gceZone : undefined;
            resourceInputs["instanceId"] = state ? state.instanceId : undefined;
            resourceInputs["instanceType"] = state ? state.instanceType : undefined;
            resourceInputs["ipAddress"] = state ? state.ipAddress : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["machineConfig"] = state ? state.machineConfig : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["readPoolConfig"] = state ? state.readPoolConfig : undefined;
            resourceInputs["reconciling"] = state ? state.reconciling : undefined;
            resourceInputs["state"] = state ? state.state : undefined;
            resourceInputs["uid"] = state ? state.uid : undefined;
            resourceInputs["updateTime"] = state ? state.updateTime : undefined;
        } else {
            const args = argsOrState as InstanceArgs | undefined;
            if ((!args || args.cluster === undefined) && !opts.urn) {
                throw new Error("Missing required property 'cluster'");
            }
            if ((!args || args.instanceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'instanceId'");
            }
            if ((!args || args.instanceType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'instanceType'");
            }
            resourceInputs["annotations"] = args ? args.annotations : undefined;
            resourceInputs["availabilityType"] = args ? args.availabilityType : undefined;
            resourceInputs["cluster"] = args ? args.cluster : undefined;
            resourceInputs["databaseFlags"] = args ? args.databaseFlags : undefined;
            resourceInputs["displayName"] = args ? args.displayName : undefined;
            resourceInputs["gceZone"] = args ? args.gceZone : undefined;
            resourceInputs["instanceId"] = args ? args.instanceId : undefined;
            resourceInputs["instanceType"] = args ? args.instanceType : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["machineConfig"] = args ? args.machineConfig : undefined;
            resourceInputs["readPoolConfig"] = args ? args.readPoolConfig : undefined;
            resourceInputs["createTime"] = undefined /*out*/;
            resourceInputs["ipAddress"] = undefined /*out*/;
            resourceInputs["name"] = undefined /*out*/;
            resourceInputs["reconciling"] = undefined /*out*/;
            resourceInputs["state"] = undefined /*out*/;
            resourceInputs["uid"] = undefined /*out*/;
            resourceInputs["updateTime"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Instance.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Instance resources.
 */
export interface InstanceState {
    /**
     * Annotations to allow client tools to store small amount of arbitrary data. This is distinct from labels.
     */
    annotations?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Availability type of an Instance. Defaults to REGIONAL for both primary and read instances. Note that primary and read instances can have different availability types.
     * Possible values are `AVAILABILITY_TYPE_UNSPECIFIED`, `ZONAL`, and `REGIONAL`.
     */
    availabilityType?: pulumi.Input<string>;
    /**
     * Identifies the alloydb cluster. Must be in the format
     * 'projects/{project}/locations/{location}/clusters/{cluster_id}'
     */
    cluster?: pulumi.Input<string>;
    /**
     * Time the Instance was created in UTC.
     */
    createTime?: pulumi.Input<string>;
    /**
     * Database flags. Set at instance level. * They are copied from primary instance on read instance creation. * Read instances can set new or override existing flags that are relevant for reads, e.g. for enabling columnar cache on a read instance. Flags set on read instance may or may not be present on primary.
     */
    databaseFlags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * User-settable and human-readable display name for the Instance.
     */
    displayName?: pulumi.Input<string>;
    /**
     * The Compute Engine zone that the instance should serve from, per https://cloud.google.com/compute/docs/regions-zones This can ONLY be specified for ZONAL instances. If present for a REGIONAL instance, an error will be thrown. If this is absent for a ZONAL instance, instance is created in a random zone with available capacity.
     */
    gceZone?: pulumi.Input<string>;
    /**
     * The ID of the alloydb instance.
     */
    instanceId?: pulumi.Input<string>;
    /**
     * The type of the instance.
     * Possible values are `PRIMARY` and `READ_POOL`.
     */
    instanceType?: pulumi.Input<string>;
    /**
     * The IP address for the Instance. This is the connection endpoint for an end-user application.
     */
    ipAddress?: pulumi.Input<string>;
    /**
     * User-defined labels for the alloydb instance.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Configurations for the machines that host the underlying database engine.
     * Structure is documented below.
     */
    machineConfig?: pulumi.Input<inputs.alloydb.InstanceMachineConfig>;
    /**
     * The name of the instance resource.
     */
    name?: pulumi.Input<string>;
    /**
     * Read pool specific config.
     * Structure is documented below.
     */
    readPoolConfig?: pulumi.Input<inputs.alloydb.InstanceReadPoolConfig>;
    /**
     * Set to true if the current state of Instance does not match the user's intended state, and the service is actively
     * updating the resource to reconcile them. This can happen due to user-triggered updates or system actions like failover
     * or maintenance.
     */
    reconciling?: pulumi.Input<boolean>;
    /**
     * The current state of the alloydb instance.
     */
    state?: pulumi.Input<string>;
    /**
     * The system-generated UID of the resource.
     */
    uid?: pulumi.Input<string>;
    /**
     * Time the Instance was updated in UTC.
     */
    updateTime?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Instance resource.
 */
export interface InstanceArgs {
    /**
     * Annotations to allow client tools to store small amount of arbitrary data. This is distinct from labels.
     */
    annotations?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Availability type of an Instance. Defaults to REGIONAL for both primary and read instances. Note that primary and read instances can have different availability types.
     * Possible values are `AVAILABILITY_TYPE_UNSPECIFIED`, `ZONAL`, and `REGIONAL`.
     */
    availabilityType?: pulumi.Input<string>;
    /**
     * Identifies the alloydb cluster. Must be in the format
     * 'projects/{project}/locations/{location}/clusters/{cluster_id}'
     */
    cluster: pulumi.Input<string>;
    /**
     * Database flags. Set at instance level. * They are copied from primary instance on read instance creation. * Read instances can set new or override existing flags that are relevant for reads, e.g. for enabling columnar cache on a read instance. Flags set on read instance may or may not be present on primary.
     */
    databaseFlags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * User-settable and human-readable display name for the Instance.
     */
    displayName?: pulumi.Input<string>;
    /**
     * The Compute Engine zone that the instance should serve from, per https://cloud.google.com/compute/docs/regions-zones This can ONLY be specified for ZONAL instances. If present for a REGIONAL instance, an error will be thrown. If this is absent for a ZONAL instance, instance is created in a random zone with available capacity.
     */
    gceZone?: pulumi.Input<string>;
    /**
     * The ID of the alloydb instance.
     */
    instanceId: pulumi.Input<string>;
    /**
     * The type of the instance.
     * Possible values are `PRIMARY` and `READ_POOL`.
     */
    instanceType: pulumi.Input<string>;
    /**
     * User-defined labels for the alloydb instance.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Configurations for the machines that host the underlying database engine.
     * Structure is documented below.
     */
    machineConfig?: pulumi.Input<inputs.alloydb.InstanceMachineConfig>;
    /**
     * Read pool specific config.
     * Structure is documented below.
     */
    readPoolConfig?: pulumi.Input<inputs.alloydb.InstanceReadPoolConfig>;
}