// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * A Cloud Spanner instance partition is a unit of Cloud Spanner database capacity
 * that can be used to partition data and processing capacity within an instance.
 *
 * To get more information about InstancePartition, see:
 *
 * * [API documentation](https://cloud.google.com/spanner/docs/reference/rest/v1/projects.instances.instancePartitions)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/spanner/docs/geo-partitioning)
 *
 * ## Example Usage
 *
 * ### Spanner Instance Partition Basic
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const main = new gcp.spanner.Instance("main", {
 *     name: "test-instance",
 *     config: "nam6",
 *     displayName: "main-instance",
 *     numNodes: 1,
 *     edition: "ENTERPRISE_PLUS",
 * });
 * const partition = new gcp.spanner.InstancePartition("partition", {
 *     name: "test-partition",
 *     instance: main.name,
 *     config: "nam8",
 *     displayName: "test-spanner-partition",
 *     nodeCount: 1,
 * });
 * ```
 *
 * ## Import
 *
 * InstancePartition can be imported using any of these accepted formats:
 *
 * * `projects/{{project}}/instances/{{instance}}/instancePartitions/{{name}}`
 *
 * * `{{project}}/{{instance}}/{{name}}`
 *
 * * `{{instance}}/{{name}}`
 *
 * When using the `pulumi import` command, InstancePartition can be imported using one of the formats above. For example:
 *
 * ```sh
 * $ pulumi import gcp:spanner/instancePartition:InstancePartition default projects/{{project}}/instances/{{instance}}/instancePartitions/{{name}}
 * ```
 *
 * ```sh
 * $ pulumi import gcp:spanner/instancePartition:InstancePartition default {{project}}/{{instance}}/{{name}}
 * ```
 *
 * ```sh
 * $ pulumi import gcp:spanner/instancePartition:InstancePartition default {{instance}}/{{name}}
 * ```
 */
export class InstancePartition extends pulumi.CustomResource {
    /**
     * Get an existing InstancePartition resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: InstancePartitionState, opts?: pulumi.CustomResourceOptions): InstancePartition {
        return new InstancePartition(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:spanner/instancePartition:InstancePartition';

    /**
     * Returns true if the given object is an instance of InstancePartition.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is InstancePartition {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === InstancePartition.__pulumiType;
    }

    /**
     * The name of the instance partition's configuration (similar to a region) which
     * defines the geographic placement and replication of data in this instance partition.
     */
    public readonly config!: pulumi.Output<string>;
    /**
     * The descriptive name for this instance partition as it appears in UIs.
     * Must be unique per project and between 4 and 30 characters in length.
     */
    public readonly displayName!: pulumi.Output<string>;
    /**
     * The instance to create the instance partition in.
     */
    public readonly instance!: pulumi.Output<string>;
    /**
     * A unique identifier for the instance partition, which cannot be changed after
     * the instance partition is created. The name must be between 2 and 64 characters
     * and match the regular expression [a-z][a-z0-9\\-]{0,61}[a-z0-9].
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The number of nodes allocated to this instance partition. One node equals
     * 1000 processing units. Exactly one of either nodeCount or processingUnits
     * must be present.
     */
    public readonly nodeCount!: pulumi.Output<number | undefined>;
    /**
     * The number of processing units allocated to this instance partition.
     * Exactly one of either nodeCount or processingUnits must be present.
     */
    public readonly processingUnits!: pulumi.Output<number | undefined>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    public readonly project!: pulumi.Output<string>;
    /**
     * The current instance partition state. Possible values are:
     * CREATING: The instance partition is being created. Resources are being
     * allocated for the instance partition.
     * READY: The instance partition has been allocated resources and is ready for use.
     */
    public /*out*/ readonly state!: pulumi.Output<string>;

    /**
     * Create a InstancePartition resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: InstancePartitionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: InstancePartitionArgs | InstancePartitionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as InstancePartitionState | undefined;
            resourceInputs["config"] = state ? state.config : undefined;
            resourceInputs["displayName"] = state ? state.displayName : undefined;
            resourceInputs["instance"] = state ? state.instance : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["nodeCount"] = state ? state.nodeCount : undefined;
            resourceInputs["processingUnits"] = state ? state.processingUnits : undefined;
            resourceInputs["project"] = state ? state.project : undefined;
            resourceInputs["state"] = state ? state.state : undefined;
        } else {
            const args = argsOrState as InstancePartitionArgs | undefined;
            if ((!args || args.config === undefined) && !opts.urn) {
                throw new Error("Missing required property 'config'");
            }
            if ((!args || args.displayName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'displayName'");
            }
            if ((!args || args.instance === undefined) && !opts.urn) {
                throw new Error("Missing required property 'instance'");
            }
            resourceInputs["config"] = args ? args.config : undefined;
            resourceInputs["displayName"] = args ? args.displayName : undefined;
            resourceInputs["instance"] = args ? args.instance : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["nodeCount"] = args ? args.nodeCount : undefined;
            resourceInputs["processingUnits"] = args ? args.processingUnits : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["state"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(InstancePartition.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering InstancePartition resources.
 */
export interface InstancePartitionState {
    /**
     * The name of the instance partition's configuration (similar to a region) which
     * defines the geographic placement and replication of data in this instance partition.
     */
    config?: pulumi.Input<string>;
    /**
     * The descriptive name for this instance partition as it appears in UIs.
     * Must be unique per project and between 4 and 30 characters in length.
     */
    displayName?: pulumi.Input<string>;
    /**
     * The instance to create the instance partition in.
     */
    instance?: pulumi.Input<string>;
    /**
     * A unique identifier for the instance partition, which cannot be changed after
     * the instance partition is created. The name must be between 2 and 64 characters
     * and match the regular expression [a-z][a-z0-9\\-]{0,61}[a-z0-9].
     */
    name?: pulumi.Input<string>;
    /**
     * The number of nodes allocated to this instance partition. One node equals
     * 1000 processing units. Exactly one of either nodeCount or processingUnits
     * must be present.
     */
    nodeCount?: pulumi.Input<number>;
    /**
     * The number of processing units allocated to this instance partition.
     * Exactly one of either nodeCount or processingUnits must be present.
     */
    processingUnits?: pulumi.Input<number>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * The current instance partition state. Possible values are:
     * CREATING: The instance partition is being created. Resources are being
     * allocated for the instance partition.
     * READY: The instance partition has been allocated resources and is ready for use.
     */
    state?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a InstancePartition resource.
 */
export interface InstancePartitionArgs {
    /**
     * The name of the instance partition's configuration (similar to a region) which
     * defines the geographic placement and replication of data in this instance partition.
     */
    config: pulumi.Input<string>;
    /**
     * The descriptive name for this instance partition as it appears in UIs.
     * Must be unique per project and between 4 and 30 characters in length.
     */
    displayName: pulumi.Input<string>;
    /**
     * The instance to create the instance partition in.
     */
    instance: pulumi.Input<string>;
    /**
     * A unique identifier for the instance partition, which cannot be changed after
     * the instance partition is created. The name must be between 2 and 64 characters
     * and match the regular expression [a-z][a-z0-9\\-]{0,61}[a-z0-9].
     */
    name?: pulumi.Input<string>;
    /**
     * The number of nodes allocated to this instance partition. One node equals
     * 1000 processing units. Exactly one of either nodeCount or processingUnits
     * must be present.
     */
    nodeCount?: pulumi.Input<number>;
    /**
     * The number of processing units allocated to this instance partition.
     * Exactly one of either nodeCount or processingUnits must be present.
     */
    processingUnits?: pulumi.Input<number>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
}
