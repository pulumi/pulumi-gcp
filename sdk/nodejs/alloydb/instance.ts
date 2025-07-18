// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 *
 * ### Alloydb Instance Basic
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const defaultNetwork = new gcp.compute.Network("default", {name: "alloydb-network"});
 * const defaultCluster = new gcp.alloydb.Cluster("default", {
 *     clusterId: "alloydb-cluster",
 *     location: "us-central1",
 *     networkConfig: {
 *         network: defaultNetwork.id,
 *     },
 *     initialUser: {
 *         password: "alloydb-cluster",
 *     },
 * });
 * const privateIpAlloc = new gcp.compute.GlobalAddress("private_ip_alloc", {
 *     name: "alloydb-cluster",
 *     addressType: "INTERNAL",
 *     purpose: "VPC_PEERING",
 *     prefixLength: 16,
 *     network: defaultNetwork.id,
 * });
 * const vpcConnection = new gcp.servicenetworking.Connection("vpc_connection", {
 *     network: defaultNetwork.id,
 *     service: "servicenetworking.googleapis.com",
 *     reservedPeeringRanges: [privateIpAlloc.name],
 * });
 * const _default = new gcp.alloydb.Instance("default", {
 *     cluster: defaultCluster.name,
 *     instanceId: "alloydb-instance",
 *     instanceType: "PRIMARY",
 *     machineConfig: {
 *         cpuCount: 2,
 *     },
 * }, {
 *     dependsOn: [vpcConnection],
 * });
 * const project = gcp.organizations.getProject({});
 * ```
 * ### Alloydb Secondary Instance Basic
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const _default = new gcp.compute.Network("default", {name: "alloydb-secondary-network"});
 * const primary = new gcp.alloydb.Cluster("primary", {
 *     clusterId: "alloydb-primary-cluster",
 *     location: "us-central1",
 *     networkConfig: {
 *         network: _default.id,
 *     },
 * });
 * const privateIpAlloc = new gcp.compute.GlobalAddress("private_ip_alloc", {
 *     name: "alloydb-secondary-instance",
 *     addressType: "INTERNAL",
 *     purpose: "VPC_PEERING",
 *     prefixLength: 16,
 *     network: _default.id,
 * });
 * const vpcConnection = new gcp.servicenetworking.Connection("vpc_connection", {
 *     network: _default.id,
 *     service: "servicenetworking.googleapis.com",
 *     reservedPeeringRanges: [privateIpAlloc.name],
 * });
 * const primaryInstance = new gcp.alloydb.Instance("primary", {
 *     cluster: primary.name,
 *     instanceId: "alloydb-primary-instance",
 *     instanceType: "PRIMARY",
 *     machineConfig: {
 *         cpuCount: 2,
 *     },
 * }, {
 *     dependsOn: [vpcConnection],
 * });
 * const secondary = new gcp.alloydb.Cluster("secondary", {
 *     clusterId: "alloydb-secondary-cluster",
 *     location: "us-east1",
 *     networkConfig: {
 *         network: defaultGoogleComputeNetwork.id,
 *     },
 *     clusterType: "SECONDARY",
 *     continuousBackupConfig: {
 *         enabled: false,
 *     },
 *     secondaryConfig: {
 *         primaryClusterName: primary.name,
 *     },
 *     deletionPolicy: "FORCE",
 * }, {
 *     dependsOn: [primaryInstance],
 * });
 * const secondaryInstance = new gcp.alloydb.Instance("secondary", {
 *     cluster: secondary.name,
 *     instanceId: "alloydb-secondary-instance",
 *     instanceType: secondary.clusterType,
 *     machineConfig: {
 *         cpuCount: 2,
 *     },
 * }, {
 *     dependsOn: [vpcConnection],
 * });
 * const project = gcp.organizations.getProject({});
 * ```
 *
 * ## Import
 *
 * Instance can be imported using any of these accepted formats:
 *
 * * `projects/{{project}}/locations/{{location}}/clusters/{{cluster}}/instances/{{instance_id}}`
 *
 * * `{{project}}/{{location}}/{{cluster}}/{{instance_id}}`
 *
 * * `{{location}}/{{cluster}}/{{instance_id}}`
 *
 * When using the `pulumi import` command, Instance can be imported using one of the formats above. For example:
 *
 * ```sh
 * $ pulumi import gcp:alloydb/instance:Instance default projects/{{project}}/locations/{{location}}/clusters/{{cluster}}/instances/{{instance_id}}
 * ```
 *
 * ```sh
 * $ pulumi import gcp:alloydb/instance:Instance default {{project}}/{{location}}/{{cluster}}/{{instance_id}}
 * ```
 *
 * ```sh
 * $ pulumi import gcp:alloydb/instance:Instance default {{location}}/{{cluster}}/{{instance_id}}
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
     * 'Specifies whether an instance needs to spin up. Once the instance is
     * active, the activation policy can be updated to the `NEVER` to stop the
     * instance. Likewise, the activation policy can be updated to `ALWAYS` to
     * start the instance.
     * There are restrictions around when an instance can/cannot be activated (for
     * example, a read pool instance should be stopped before stopping primary
     * etc.). Please refer to the API documentation for more details.
     * Possible values are: `ACTIVATION_POLICY_UNSPECIFIED`, `ALWAYS`, `NEVER`.'
     * Possible values are: `ACTIVATION_POLICY_UNSPECIFIED`, `ALWAYS`, `NEVER`.
     */
    public readonly activationPolicy!: pulumi.Output<string>;
    /**
     * Annotations to allow client tools to store small amount of arbitrary data. This is distinct from labels.
     * **Note**: This field is non-authoritative, and will only manage the annotations present in your configuration.
     * Please refer to the field `effectiveAnnotations` for all of the annotations present on the resource.
     */
    public readonly annotations!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * 'Availability type of an Instance. Defaults to REGIONAL for both primary and read instances.
     * Note that primary and read instances can have different availability types.
     * Primary instances can be either ZONAL or REGIONAL. Read Pool instances can also be either ZONAL or REGIONAL.
     * Read pools of size 1 can only have zonal availability. Read pools with a node count of 2 or more
     * can have regional availability (nodes are present in 2 or more zones in a region).
     * Possible values are: `AVAILABILITY_TYPE_UNSPECIFIED`, `ZONAL`, `REGIONAL`.'
     * Possible values are: `AVAILABILITY_TYPE_UNSPECIFIED`, `ZONAL`, `REGIONAL`.
     */
    public readonly availabilityType!: pulumi.Output<string>;
    /**
     * Client connection specific configurations.
     * Structure is documented below.
     */
    public readonly clientConnectionConfig!: pulumi.Output<outputs.alloydb.InstanceClientConnectionConfig>;
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
    public readonly databaseFlags!: pulumi.Output<{[key: string]: string}>;
    /**
     * User-settable and human-readable display name for the Instance.
     */
    public readonly displayName!: pulumi.Output<string | undefined>;
    public /*out*/ readonly effectiveAnnotations!: pulumi.Output<{[key: string]: string}>;
    /**
     * All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     */
    public /*out*/ readonly effectiveLabels!: pulumi.Output<{[key: string]: string}>;
    /**
     * The Compute Engine zone that the instance should serve from, per https://cloud.google.com/compute/docs/regions-zones This can ONLY be specified for ZONAL instances. If present for a REGIONAL instance, an error will be thrown. If this is absent for a ZONAL instance, instance is created in a random zone with available capacity.
     */
    public readonly gceZone!: pulumi.Output<string | undefined>;
    /**
     * The ID of the alloydb instance.
     */
    public readonly instanceId!: pulumi.Output<string>;
    public readonly instanceType!: pulumi.Output<string>;
    /**
     * The IP address for the Instance. This is the connection endpoint for an end-user application.
     */
    public /*out*/ readonly ipAddress!: pulumi.Output<string>;
    /**
     * User-defined labels for the alloydb instance.
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effectiveLabels` for all of the labels present on the resource.
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
     * Instance level network configuration.
     * Structure is documented below.
     */
    public readonly networkConfig!: pulumi.Output<outputs.alloydb.InstanceNetworkConfig>;
    /**
     * Configuration for enhanced query insights.
     * Structure is documented below.
     */
    public readonly observabilityConfig!: pulumi.Output<outputs.alloydb.InstanceObservabilityConfig>;
    /**
     * The outbound public IP addresses for the instance. This is available ONLY when
     * networkConfig.enableOutboundPublicIp is set to true. These IP addresses are used
     * for outbound connections.
     */
    public /*out*/ readonly outboundPublicIpAddresses!: pulumi.Output<string[]>;
    /**
     * Configuration for Private Service Connect (PSC) for the instance.
     * Structure is documented below.
     */
    public readonly pscInstanceConfig!: pulumi.Output<outputs.alloydb.InstancePscInstanceConfig>;
    /**
     * The public IP addresses for the Instance. This is available ONLY when
     * networkConfig.enablePublicIp is set to true. This is the connection
     * endpoint for an end-user application.
     */
    public /*out*/ readonly publicIpAddress!: pulumi.Output<string>;
    /**
     * The combination of labels configured directly on the resource
     * and default labels configured on the provider.
     */
    public /*out*/ readonly pulumiLabels!: pulumi.Output<{[key: string]: string}>;
    /**
     * Configuration for query insights.
     * Structure is documented below.
     */
    public readonly queryInsightsConfig!: pulumi.Output<outputs.alloydb.InstanceQueryInsightsConfig>;
    /**
     * Read pool specific config. If the instance type is READ_POOL, this configuration must be provided.
     * Structure is documented below.
     */
    public readonly readPoolConfig!: pulumi.Output<outputs.alloydb.InstanceReadPoolConfig | undefined>;
    /**
     * Set to true if the current state of Instance does not match the user's intended state, and the service is actively updating the resource to reconcile them. This can happen due to user-triggered updates or system actions like failover or maintenance.
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
            resourceInputs["activationPolicy"] = state ? state.activationPolicy : undefined;
            resourceInputs["annotations"] = state ? state.annotations : undefined;
            resourceInputs["availabilityType"] = state ? state.availabilityType : undefined;
            resourceInputs["clientConnectionConfig"] = state ? state.clientConnectionConfig : undefined;
            resourceInputs["cluster"] = state ? state.cluster : undefined;
            resourceInputs["createTime"] = state ? state.createTime : undefined;
            resourceInputs["databaseFlags"] = state ? state.databaseFlags : undefined;
            resourceInputs["displayName"] = state ? state.displayName : undefined;
            resourceInputs["effectiveAnnotations"] = state ? state.effectiveAnnotations : undefined;
            resourceInputs["effectiveLabels"] = state ? state.effectiveLabels : undefined;
            resourceInputs["gceZone"] = state ? state.gceZone : undefined;
            resourceInputs["instanceId"] = state ? state.instanceId : undefined;
            resourceInputs["instanceType"] = state ? state.instanceType : undefined;
            resourceInputs["ipAddress"] = state ? state.ipAddress : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["machineConfig"] = state ? state.machineConfig : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["networkConfig"] = state ? state.networkConfig : undefined;
            resourceInputs["observabilityConfig"] = state ? state.observabilityConfig : undefined;
            resourceInputs["outboundPublicIpAddresses"] = state ? state.outboundPublicIpAddresses : undefined;
            resourceInputs["pscInstanceConfig"] = state ? state.pscInstanceConfig : undefined;
            resourceInputs["publicIpAddress"] = state ? state.publicIpAddress : undefined;
            resourceInputs["pulumiLabels"] = state ? state.pulumiLabels : undefined;
            resourceInputs["queryInsightsConfig"] = state ? state.queryInsightsConfig : undefined;
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
            resourceInputs["activationPolicy"] = args ? args.activationPolicy : undefined;
            resourceInputs["annotations"] = args ? args.annotations : undefined;
            resourceInputs["availabilityType"] = args ? args.availabilityType : undefined;
            resourceInputs["clientConnectionConfig"] = args ? args.clientConnectionConfig : undefined;
            resourceInputs["cluster"] = args ? args.cluster : undefined;
            resourceInputs["databaseFlags"] = args ? args.databaseFlags : undefined;
            resourceInputs["displayName"] = args ? args.displayName : undefined;
            resourceInputs["gceZone"] = args ? args.gceZone : undefined;
            resourceInputs["instanceId"] = args ? args.instanceId : undefined;
            resourceInputs["instanceType"] = args ? args.instanceType : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["machineConfig"] = args ? args.machineConfig : undefined;
            resourceInputs["networkConfig"] = args ? args.networkConfig : undefined;
            resourceInputs["observabilityConfig"] = args ? args.observabilityConfig : undefined;
            resourceInputs["pscInstanceConfig"] = args ? args.pscInstanceConfig : undefined;
            resourceInputs["queryInsightsConfig"] = args ? args.queryInsightsConfig : undefined;
            resourceInputs["readPoolConfig"] = args ? args.readPoolConfig : undefined;
            resourceInputs["createTime"] = undefined /*out*/;
            resourceInputs["effectiveAnnotations"] = undefined /*out*/;
            resourceInputs["effectiveLabels"] = undefined /*out*/;
            resourceInputs["ipAddress"] = undefined /*out*/;
            resourceInputs["name"] = undefined /*out*/;
            resourceInputs["outboundPublicIpAddresses"] = undefined /*out*/;
            resourceInputs["publicIpAddress"] = undefined /*out*/;
            resourceInputs["pulumiLabels"] = undefined /*out*/;
            resourceInputs["reconciling"] = undefined /*out*/;
            resourceInputs["state"] = undefined /*out*/;
            resourceInputs["uid"] = undefined /*out*/;
            resourceInputs["updateTime"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["effectiveLabels", "pulumiLabels"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(Instance.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Instance resources.
 */
export interface InstanceState {
    /**
     * 'Specifies whether an instance needs to spin up. Once the instance is
     * active, the activation policy can be updated to the `NEVER` to stop the
     * instance. Likewise, the activation policy can be updated to `ALWAYS` to
     * start the instance.
     * There are restrictions around when an instance can/cannot be activated (for
     * example, a read pool instance should be stopped before stopping primary
     * etc.). Please refer to the API documentation for more details.
     * Possible values are: `ACTIVATION_POLICY_UNSPECIFIED`, `ALWAYS`, `NEVER`.'
     * Possible values are: `ACTIVATION_POLICY_UNSPECIFIED`, `ALWAYS`, `NEVER`.
     */
    activationPolicy?: pulumi.Input<string>;
    /**
     * Annotations to allow client tools to store small amount of arbitrary data. This is distinct from labels.
     * **Note**: This field is non-authoritative, and will only manage the annotations present in your configuration.
     * Please refer to the field `effectiveAnnotations` for all of the annotations present on the resource.
     */
    annotations?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * 'Availability type of an Instance. Defaults to REGIONAL for both primary and read instances.
     * Note that primary and read instances can have different availability types.
     * Primary instances can be either ZONAL or REGIONAL. Read Pool instances can also be either ZONAL or REGIONAL.
     * Read pools of size 1 can only have zonal availability. Read pools with a node count of 2 or more
     * can have regional availability (nodes are present in 2 or more zones in a region).
     * Possible values are: `AVAILABILITY_TYPE_UNSPECIFIED`, `ZONAL`, `REGIONAL`.'
     * Possible values are: `AVAILABILITY_TYPE_UNSPECIFIED`, `ZONAL`, `REGIONAL`.
     */
    availabilityType?: pulumi.Input<string>;
    /**
     * Client connection specific configurations.
     * Structure is documented below.
     */
    clientConnectionConfig?: pulumi.Input<inputs.alloydb.InstanceClientConnectionConfig>;
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
    effectiveAnnotations?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     */
    effectiveLabels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The Compute Engine zone that the instance should serve from, per https://cloud.google.com/compute/docs/regions-zones This can ONLY be specified for ZONAL instances. If present for a REGIONAL instance, an error will be thrown. If this is absent for a ZONAL instance, instance is created in a random zone with available capacity.
     */
    gceZone?: pulumi.Input<string>;
    /**
     * The ID of the alloydb instance.
     */
    instanceId?: pulumi.Input<string>;
    instanceType?: pulumi.Input<string>;
    /**
     * The IP address for the Instance. This is the connection endpoint for an end-user application.
     */
    ipAddress?: pulumi.Input<string>;
    /**
     * User-defined labels for the alloydb instance.
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effectiveLabels` for all of the labels present on the resource.
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
     * Instance level network configuration.
     * Structure is documented below.
     */
    networkConfig?: pulumi.Input<inputs.alloydb.InstanceNetworkConfig>;
    /**
     * Configuration for enhanced query insights.
     * Structure is documented below.
     */
    observabilityConfig?: pulumi.Input<inputs.alloydb.InstanceObservabilityConfig>;
    /**
     * The outbound public IP addresses for the instance. This is available ONLY when
     * networkConfig.enableOutboundPublicIp is set to true. These IP addresses are used
     * for outbound connections.
     */
    outboundPublicIpAddresses?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Configuration for Private Service Connect (PSC) for the instance.
     * Structure is documented below.
     */
    pscInstanceConfig?: pulumi.Input<inputs.alloydb.InstancePscInstanceConfig>;
    /**
     * The public IP addresses for the Instance. This is available ONLY when
     * networkConfig.enablePublicIp is set to true. This is the connection
     * endpoint for an end-user application.
     */
    publicIpAddress?: pulumi.Input<string>;
    /**
     * The combination of labels configured directly on the resource
     * and default labels configured on the provider.
     */
    pulumiLabels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Configuration for query insights.
     * Structure is documented below.
     */
    queryInsightsConfig?: pulumi.Input<inputs.alloydb.InstanceQueryInsightsConfig>;
    /**
     * Read pool specific config. If the instance type is READ_POOL, this configuration must be provided.
     * Structure is documented below.
     */
    readPoolConfig?: pulumi.Input<inputs.alloydb.InstanceReadPoolConfig>;
    /**
     * Set to true if the current state of Instance does not match the user's intended state, and the service is actively updating the resource to reconcile them. This can happen due to user-triggered updates or system actions like failover or maintenance.
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
     * 'Specifies whether an instance needs to spin up. Once the instance is
     * active, the activation policy can be updated to the `NEVER` to stop the
     * instance. Likewise, the activation policy can be updated to `ALWAYS` to
     * start the instance.
     * There are restrictions around when an instance can/cannot be activated (for
     * example, a read pool instance should be stopped before stopping primary
     * etc.). Please refer to the API documentation for more details.
     * Possible values are: `ACTIVATION_POLICY_UNSPECIFIED`, `ALWAYS`, `NEVER`.'
     * Possible values are: `ACTIVATION_POLICY_UNSPECIFIED`, `ALWAYS`, `NEVER`.
     */
    activationPolicy?: pulumi.Input<string>;
    /**
     * Annotations to allow client tools to store small amount of arbitrary data. This is distinct from labels.
     * **Note**: This field is non-authoritative, and will only manage the annotations present in your configuration.
     * Please refer to the field `effectiveAnnotations` for all of the annotations present on the resource.
     */
    annotations?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * 'Availability type of an Instance. Defaults to REGIONAL for both primary and read instances.
     * Note that primary and read instances can have different availability types.
     * Primary instances can be either ZONAL or REGIONAL. Read Pool instances can also be either ZONAL or REGIONAL.
     * Read pools of size 1 can only have zonal availability. Read pools with a node count of 2 or more
     * can have regional availability (nodes are present in 2 or more zones in a region).
     * Possible values are: `AVAILABILITY_TYPE_UNSPECIFIED`, `ZONAL`, `REGIONAL`.'
     * Possible values are: `AVAILABILITY_TYPE_UNSPECIFIED`, `ZONAL`, `REGIONAL`.
     */
    availabilityType?: pulumi.Input<string>;
    /**
     * Client connection specific configurations.
     * Structure is documented below.
     */
    clientConnectionConfig?: pulumi.Input<inputs.alloydb.InstanceClientConnectionConfig>;
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
    instanceType: pulumi.Input<string>;
    /**
     * User-defined labels for the alloydb instance.
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effectiveLabels` for all of the labels present on the resource.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Configurations for the machines that host the underlying database engine.
     * Structure is documented below.
     */
    machineConfig?: pulumi.Input<inputs.alloydb.InstanceMachineConfig>;
    /**
     * Instance level network configuration.
     * Structure is documented below.
     */
    networkConfig?: pulumi.Input<inputs.alloydb.InstanceNetworkConfig>;
    /**
     * Configuration for enhanced query insights.
     * Structure is documented below.
     */
    observabilityConfig?: pulumi.Input<inputs.alloydb.InstanceObservabilityConfig>;
    /**
     * Configuration for Private Service Connect (PSC) for the instance.
     * Structure is documented below.
     */
    pscInstanceConfig?: pulumi.Input<inputs.alloydb.InstancePscInstanceConfig>;
    /**
     * Configuration for query insights.
     * Structure is documented below.
     */
    queryInsightsConfig?: pulumi.Input<inputs.alloydb.InstanceQueryInsightsConfig>;
    /**
     * Read pool specific config. If the instance type is READ_POOL, this configuration must be provided.
     * Structure is documented below.
     */
    readPoolConfig?: pulumi.Input<inputs.alloydb.InstanceReadPoolConfig>;
}
