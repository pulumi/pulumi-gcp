// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * A Cloud Security Command Center (Cloud SCC) notification configs. A
 * notification config is a Cloud SCC resource that contains the
 * configuration to send notifications for create/update events of
 * findings, assets and etc.
 * > **Note:** In order to use Cloud SCC resources, your organization must be enrolled
 * in [SCC Standard/Premium](https://cloud.google.com/security-command-center/docs/quickstart-security-command-center).
 * Without doing so, you may run into errors during resource creation.
 *
 * To get more information about FolderNotificationConfig, see:
 *
 * * [API documentation](https://cloud.google.com/security-command-center/docs/reference/rest/v1/folders.notificationConfigs)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/security-command-center/docs)
 *
 * ## Example Usage
 *
 * ## Import
 *
 * FolderNotificationConfig can be imported using any of these accepted formats:
 *
 * * `folders/{{folder}}/notificationConfigs/{{config_id}}`
 *
 * * `{{folder}}/{{config_id}}`
 *
 * When using the `pulumi import` command, FolderNotificationConfig can be imported using one of the formats above. For example:
 *
 * ```sh
 * $ pulumi import gcp:securitycenter/folderNotificationConfig:FolderNotificationConfig default folders/{{folder}}/notificationConfigs/{{config_id}}
 * ```
 *
 * ```sh
 * $ pulumi import gcp:securitycenter/folderNotificationConfig:FolderNotificationConfig default {{folder}}/{{config_id}}
 * ```
 */
export class FolderNotificationConfig extends pulumi.CustomResource {
    /**
     * Get an existing FolderNotificationConfig resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: FolderNotificationConfigState, opts?: pulumi.CustomResourceOptions): FolderNotificationConfig {
        return new FolderNotificationConfig(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:securitycenter/folderNotificationConfig:FolderNotificationConfig';

    /**
     * Returns true if the given object is an instance of FolderNotificationConfig.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is FolderNotificationConfig {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === FolderNotificationConfig.__pulumiType;
    }

    /**
     * This must be unique within the organization.
     */
    public readonly configId!: pulumi.Output<string>;
    /**
     * The description of the notification config (max of 1024 characters).
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Numerical ID of the parent folder.
     */
    public readonly folder!: pulumi.Output<string>;
    /**
     * The resource name of this notification config, in the format
     * `folders/{{folder}}/notificationConfigs/{{config_id}}`.
     */
    public /*out*/ readonly name!: pulumi.Output<string>;
    /**
     * The Pub/Sub topic to send notifications to. Its format is
     * "projects/[projectId]/topics/[topic]".
     */
    public readonly pubsubTopic!: pulumi.Output<string>;
    /**
     * The service account that needs "pubsub.topics.publish" permission to
     * publish to the Pub/Sub topic.
     */
    public /*out*/ readonly serviceAccount!: pulumi.Output<string>;
    /**
     * The config for triggering streaming-based notifications.
     * Structure is documented below.
     */
    public readonly streamingConfig!: pulumi.Output<outputs.securitycenter.FolderNotificationConfigStreamingConfig>;

    /**
     * Create a FolderNotificationConfig resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: FolderNotificationConfigArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: FolderNotificationConfigArgs | FolderNotificationConfigState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as FolderNotificationConfigState | undefined;
            resourceInputs["configId"] = state ? state.configId : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["folder"] = state ? state.folder : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["pubsubTopic"] = state ? state.pubsubTopic : undefined;
            resourceInputs["serviceAccount"] = state ? state.serviceAccount : undefined;
            resourceInputs["streamingConfig"] = state ? state.streamingConfig : undefined;
        } else {
            const args = argsOrState as FolderNotificationConfigArgs | undefined;
            if ((!args || args.configId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'configId'");
            }
            if ((!args || args.folder === undefined) && !opts.urn) {
                throw new Error("Missing required property 'folder'");
            }
            if ((!args || args.pubsubTopic === undefined) && !opts.urn) {
                throw new Error("Missing required property 'pubsubTopic'");
            }
            if ((!args || args.streamingConfig === undefined) && !opts.urn) {
                throw new Error("Missing required property 'streamingConfig'");
            }
            resourceInputs["configId"] = args ? args.configId : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["folder"] = args ? args.folder : undefined;
            resourceInputs["pubsubTopic"] = args ? args.pubsubTopic : undefined;
            resourceInputs["streamingConfig"] = args ? args.streamingConfig : undefined;
            resourceInputs["name"] = undefined /*out*/;
            resourceInputs["serviceAccount"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(FolderNotificationConfig.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering FolderNotificationConfig resources.
 */
export interface FolderNotificationConfigState {
    /**
     * This must be unique within the organization.
     */
    configId?: pulumi.Input<string>;
    /**
     * The description of the notification config (max of 1024 characters).
     */
    description?: pulumi.Input<string>;
    /**
     * Numerical ID of the parent folder.
     */
    folder?: pulumi.Input<string>;
    /**
     * The resource name of this notification config, in the format
     * `folders/{{folder}}/notificationConfigs/{{config_id}}`.
     */
    name?: pulumi.Input<string>;
    /**
     * The Pub/Sub topic to send notifications to. Its format is
     * "projects/[projectId]/topics/[topic]".
     */
    pubsubTopic?: pulumi.Input<string>;
    /**
     * The service account that needs "pubsub.topics.publish" permission to
     * publish to the Pub/Sub topic.
     */
    serviceAccount?: pulumi.Input<string>;
    /**
     * The config for triggering streaming-based notifications.
     * Structure is documented below.
     */
    streamingConfig?: pulumi.Input<inputs.securitycenter.FolderNotificationConfigStreamingConfig>;
}

/**
 * The set of arguments for constructing a FolderNotificationConfig resource.
 */
export interface FolderNotificationConfigArgs {
    /**
     * This must be unique within the organization.
     */
    configId: pulumi.Input<string>;
    /**
     * The description of the notification config (max of 1024 characters).
     */
    description?: pulumi.Input<string>;
    /**
     * Numerical ID of the parent folder.
     */
    folder: pulumi.Input<string>;
    /**
     * The Pub/Sub topic to send notifications to. Its format is
     * "projects/[projectId]/topics/[topic]".
     */
    pubsubTopic: pulumi.Input<string>;
    /**
     * The config for triggering streaming-based notifications.
     * Structure is documented below.
     */
    streamingConfig: pulumi.Input<inputs.securitycenter.FolderNotificationConfigStreamingConfig>;
}
