// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * A BackupChannel imposes constraints on where clusters can be backed up.
 * The BackupChannel should be in the same project and region
 * as the cluster being backed up.
 * The backup can be created only in destination_project.
 *
 * To get more information about BackupChannel, see:
 *
 * * [API documentation](https://cloud.google.com/kubernetes-engine/docs/add-on/backup-for-gke/reference/rest/v1/projects.locations.backupChannels)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/kubernetes-engine/docs/add-on/backup-for-gke)
 *
 * ## Example Usage
 *
 * ### Gkebackup Backupchannel Basic
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const basic = new gcp.gkebackup.BackupChannel("basic", {
 *     name: "basic-channel",
 *     location: "us-central1",
 *     description: "Description",
 *     destinationProject: "projects/24240755850",
 *     labels: {
 *         key: "some-value",
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * BackupChannel can be imported using any of these accepted formats:
 *
 * * `projects/{{project}}/locations/{{location}}/backupChannels/{{name}}`
 *
 * * `{{project}}/{{location}}/{{name}}`
 *
 * * `{{location}}/{{name}}`
 *
 * When using the `pulumi import` command, BackupChannel can be imported using one of the formats above. For example:
 *
 * ```sh
 * $ pulumi import gcp:gkebackup/backupChannel:BackupChannel default projects/{{project}}/locations/{{location}}/backupChannels/{{name}}
 * ```
 *
 * ```sh
 * $ pulumi import gcp:gkebackup/backupChannel:BackupChannel default {{project}}/{{location}}/{{name}}
 * ```
 *
 * ```sh
 * $ pulumi import gcp:gkebackup/backupChannel:BackupChannel default {{location}}/{{name}}
 * ```
 */
export class BackupChannel extends pulumi.CustomResource {
    /**
     * Get an existing BackupChannel resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: BackupChannelState, opts?: pulumi.CustomResourceOptions): BackupChannel {
        return new BackupChannel(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:gkebackup/backupChannel:BackupChannel';

    /**
     * Returns true if the given object is an instance of BackupChannel.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is BackupChannel {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === BackupChannel.__pulumiType;
    }

    /**
     * User specified descriptive string for this BackupChannel.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The project where Backups are allowed to be stored.
     * The format is `projects/{project}`.
     * {project} can be project number or project id.
     */
    public readonly destinationProject!: pulumi.Output<string>;
    /**
     * The projectId where Backups are allowed to be stored.
     * Example Project ID: "my-project-id".
     */
    public /*out*/ readonly destinationProjectId!: pulumi.Output<string>;
    /**
     * All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     */
    public /*out*/ readonly effectiveLabels!: pulumi.Output<{[key: string]: string}>;
    /**
     * etag is used for optimistic concurrency control as a way to help prevent simultaneous
     * updates of a backup channel from overwriting each other. It is strongly suggested that
     * systems make use of the 'etag' in the read-modify-write cycle to perform BackupChannel updates
     * in order to avoid race conditions: An etag is returned in the response to backupChannels.get,
     * and systems are expected to put that etag in the request to backupChannels.patch or
     * backupChannels.delete to ensure that their change will be applied to the same version of the resource.
     */
    public /*out*/ readonly etag!: pulumi.Output<string>;
    /**
     * Description: A set of custom labels supplied by the user.
     * A list of key->value pairs.
     * Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
     *
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effectiveLabels` for all of the labels present on the resource.
     */
    public readonly labels!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * The region of the Backup Channel.
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * The full name of the BackupChannel Resource.
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
     * Server generated, unique identifier of UUID format.
     */
    public /*out*/ readonly uid!: pulumi.Output<string>;

    /**
     * Create a BackupChannel resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: BackupChannelArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: BackupChannelArgs | BackupChannelState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as BackupChannelState | undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["destinationProject"] = state ? state.destinationProject : undefined;
            resourceInputs["destinationProjectId"] = state ? state.destinationProjectId : undefined;
            resourceInputs["effectiveLabels"] = state ? state.effectiveLabels : undefined;
            resourceInputs["etag"] = state ? state.etag : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["project"] = state ? state.project : undefined;
            resourceInputs["pulumiLabels"] = state ? state.pulumiLabels : undefined;
            resourceInputs["uid"] = state ? state.uid : undefined;
        } else {
            const args = argsOrState as BackupChannelArgs | undefined;
            if ((!args || args.destinationProject === undefined) && !opts.urn) {
                throw new Error("Missing required property 'destinationProject'");
            }
            if ((!args || args.location === undefined) && !opts.urn) {
                throw new Error("Missing required property 'location'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["destinationProject"] = args ? args.destinationProject : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["destinationProjectId"] = undefined /*out*/;
            resourceInputs["effectiveLabels"] = undefined /*out*/;
            resourceInputs["etag"] = undefined /*out*/;
            resourceInputs["pulumiLabels"] = undefined /*out*/;
            resourceInputs["uid"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["effectiveLabels", "pulumiLabels"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(BackupChannel.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering BackupChannel resources.
 */
export interface BackupChannelState {
    /**
     * User specified descriptive string for this BackupChannel.
     */
    description?: pulumi.Input<string>;
    /**
     * The project where Backups are allowed to be stored.
     * The format is `projects/{project}`.
     * {project} can be project number or project id.
     */
    destinationProject?: pulumi.Input<string>;
    /**
     * The projectId where Backups are allowed to be stored.
     * Example Project ID: "my-project-id".
     */
    destinationProjectId?: pulumi.Input<string>;
    /**
     * All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     */
    effectiveLabels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * etag is used for optimistic concurrency control as a way to help prevent simultaneous
     * updates of a backup channel from overwriting each other. It is strongly suggested that
     * systems make use of the 'etag' in the read-modify-write cycle to perform BackupChannel updates
     * in order to avoid race conditions: An etag is returned in the response to backupChannels.get,
     * and systems are expected to put that etag in the request to backupChannels.patch or
     * backupChannels.delete to ensure that their change will be applied to the same version of the resource.
     */
    etag?: pulumi.Input<string>;
    /**
     * Description: A set of custom labels supplied by the user.
     * A list of key->value pairs.
     * Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
     *
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effectiveLabels` for all of the labels present on the resource.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The region of the Backup Channel.
     */
    location?: pulumi.Input<string>;
    /**
     * The full name of the BackupChannel Resource.
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
     * Server generated, unique identifier of UUID format.
     */
    uid?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a BackupChannel resource.
 */
export interface BackupChannelArgs {
    /**
     * User specified descriptive string for this BackupChannel.
     */
    description?: pulumi.Input<string>;
    /**
     * The project where Backups are allowed to be stored.
     * The format is `projects/{project}`.
     * {project} can be project number or project id.
     */
    destinationProject: pulumi.Input<string>;
    /**
     * Description: A set of custom labels supplied by the user.
     * A list of key->value pairs.
     * Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
     *
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effectiveLabels` for all of the labels present on the resource.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The region of the Backup Channel.
     */
    location: pulumi.Input<string>;
    /**
     * The full name of the BackupChannel Resource.
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
}
