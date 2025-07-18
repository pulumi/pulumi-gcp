// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * A Google Cloud Filestore snapshot.
 *
 * To get more information about Snapshot, see:
 *
 * * [API documentation](https://cloud.google.com/filestore/docs/reference/rest/v1/projects.locations.instances.snapshots)
 * * How-to Guides
 *     * [Creating Snapshots](https://cloud.google.com/filestore/docs/create-snapshots)
 *     * [Official Documentation](https://cloud.google.com/filestore/docs/snapshots)
 *
 * ## Example Usage
 *
 * ### Filestore Snapshot Basic
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const instance = new gcp.filestore.Instance("instance", {
 *     name: "test-instance-for-snapshot",
 *     location: "us-east1",
 *     tier: "ENTERPRISE",
 *     fileShares: {
 *         capacityGb: 1024,
 *         name: "share1",
 *     },
 *     networks: [{
 *         network: "default",
 *         modes: ["MODE_IPV4"],
 *     }],
 * });
 * const snapshot = new gcp.filestore.Snapshot("snapshot", {
 *     name: "test-snapshot",
 *     instance: instance.name,
 *     location: "us-east1",
 * });
 * ```
 * ### Filestore Snapshot Full
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const instance = new gcp.filestore.Instance("instance", {
 *     name: "test-instance-for-snapshot",
 *     location: "us-west1",
 *     tier: "ENTERPRISE",
 *     fileShares: {
 *         capacityGb: 1024,
 *         name: "share1",
 *     },
 *     networks: [{
 *         network: "default",
 *         modes: ["MODE_IPV4"],
 *     }],
 * });
 * const snapshot = new gcp.filestore.Snapshot("snapshot", {
 *     name: "test-snapshot",
 *     instance: instance.name,
 *     location: "us-west1",
 *     description: "Snapshot of test-instance-for-snapshot",
 *     labels: {
 *         my_label: "value",
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Snapshot can be imported using any of these accepted formats:
 *
 * * `projects/{{project}}/locations/{{location}}/instances/{{instance}}/snapshots/{{name}}`
 *
 * * `{{project}}/{{location}}/{{instance}}/{{name}}`
 *
 * * `{{location}}/{{instance}}/{{name}}`
 *
 * When using the `pulumi import` command, Snapshot can be imported using one of the formats above. For example:
 *
 * ```sh
 * $ pulumi import gcp:filestore/snapshot:Snapshot default projects/{{project}}/locations/{{location}}/instances/{{instance}}/snapshots/{{name}}
 * ```
 *
 * ```sh
 * $ pulumi import gcp:filestore/snapshot:Snapshot default {{project}}/{{location}}/{{instance}}/{{name}}
 * ```
 *
 * ```sh
 * $ pulumi import gcp:filestore/snapshot:Snapshot default {{location}}/{{instance}}/{{name}}
 * ```
 */
export class Snapshot extends pulumi.CustomResource {
    /**
     * Get an existing Snapshot resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SnapshotState, opts?: pulumi.CustomResourceOptions): Snapshot {
        return new Snapshot(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:filestore/snapshot:Snapshot';

    /**
     * Returns true if the given object is an instance of Snapshot.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Snapshot {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Snapshot.__pulumiType;
    }

    /**
     * The time when the snapshot was created in RFC3339 text format.
     */
    public /*out*/ readonly createTime!: pulumi.Output<string>;
    /**
     * A description of the snapshot with 2048 characters or less. Requests with longer descriptions will be rejected.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     */
    public /*out*/ readonly effectiveLabels!: pulumi.Output<{[key: string]: string}>;
    /**
     * The amount of bytes needed to allocate a full copy of the snapshot content.
     */
    public /*out*/ readonly filesystemUsedBytes!: pulumi.Output<string>;
    /**
     * The resource name of the filestore instance.
     */
    public readonly instance!: pulumi.Output<string>;
    /**
     * Resource labels to represent user-provided metadata.
     *
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effectiveLabels` for all of the labels present on the resource.
     */
    public readonly labels!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * The name of the location of the instance. This can be a region for ENTERPRISE tier instances.
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * The resource name of the snapshot. The name must be unique within the specified instance.
     * The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    public readonly project!: pulumi.Output<string>;
    /**
     * The combination of labels configured directly on the resource
     * and default labels configured on the provider.
     */
    public /*out*/ readonly pulumiLabels!: pulumi.Output<{[key: string]: string}>;
    /**
     * The snapshot state.
     */
    public /*out*/ readonly state!: pulumi.Output<string>;

    /**
     * Create a Snapshot resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SnapshotArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SnapshotArgs | SnapshotState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SnapshotState | undefined;
            resourceInputs["createTime"] = state ? state.createTime : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["effectiveLabels"] = state ? state.effectiveLabels : undefined;
            resourceInputs["filesystemUsedBytes"] = state ? state.filesystemUsedBytes : undefined;
            resourceInputs["instance"] = state ? state.instance : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["project"] = state ? state.project : undefined;
            resourceInputs["pulumiLabels"] = state ? state.pulumiLabels : undefined;
            resourceInputs["state"] = state ? state.state : undefined;
        } else {
            const args = argsOrState as SnapshotArgs | undefined;
            if ((!args || args.instance === undefined) && !opts.urn) {
                throw new Error("Missing required property 'instance'");
            }
            if ((!args || args.location === undefined) && !opts.urn) {
                throw new Error("Missing required property 'location'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["instance"] = args ? args.instance : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["createTime"] = undefined /*out*/;
            resourceInputs["effectiveLabels"] = undefined /*out*/;
            resourceInputs["filesystemUsedBytes"] = undefined /*out*/;
            resourceInputs["pulumiLabels"] = undefined /*out*/;
            resourceInputs["state"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["effectiveLabels", "pulumiLabels"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(Snapshot.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Snapshot resources.
 */
export interface SnapshotState {
    /**
     * The time when the snapshot was created in RFC3339 text format.
     */
    createTime?: pulumi.Input<string>;
    /**
     * A description of the snapshot with 2048 characters or less. Requests with longer descriptions will be rejected.
     */
    description?: pulumi.Input<string>;
    /**
     * All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     */
    effectiveLabels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The amount of bytes needed to allocate a full copy of the snapshot content.
     */
    filesystemUsedBytes?: pulumi.Input<string>;
    /**
     * The resource name of the filestore instance.
     */
    instance?: pulumi.Input<string>;
    /**
     * Resource labels to represent user-provided metadata.
     *
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effectiveLabels` for all of the labels present on the resource.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The name of the location of the instance. This can be a region for ENTERPRISE tier instances.
     */
    location?: pulumi.Input<string>;
    /**
     * The resource name of the snapshot. The name must be unique within the specified instance.
     * The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * The combination of labels configured directly on the resource
     * and default labels configured on the provider.
     */
    pulumiLabels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The snapshot state.
     */
    state?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Snapshot resource.
 */
export interface SnapshotArgs {
    /**
     * A description of the snapshot with 2048 characters or less. Requests with longer descriptions will be rejected.
     */
    description?: pulumi.Input<string>;
    /**
     * The resource name of the filestore instance.
     */
    instance: pulumi.Input<string>;
    /**
     * Resource labels to represent user-provided metadata.
     *
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effectiveLabels` for all of the labels present on the resource.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The name of the location of the instance. This can be a region for ENTERPRISE tier instances.
     */
    location: pulumi.Input<string>;
    /**
     * The resource name of the snapshot. The name must be unique within the specified instance.
     * The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
}
