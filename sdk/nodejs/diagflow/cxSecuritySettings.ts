// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Represents the settings related to security issues, such as data redaction and data retention. It may take hours for updates on the settings to propagate to all the related components and take effect.
 * Multiple security settings can be configured in each location. Each agent can specify the security settings to apply, and each setting can be applied to multiple agents in the same project and location.
 *
 * To get more information about SecuritySettings, see:
 *
 * * [API documentation](https://cloud.google.com/dialogflow/cx/docs/reference/rest/v3/projects.locations.securitySettings)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/dialogflow/cx/docs)
 *
 * ## Example Usage
 *
 * ### Dialogflowcx Security Settings Basic
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const basicSecuritySettings = new gcp.diagflow.CxSecuritySettings("basic_security_settings", {
 *     displayName: "dialogflowcx-security-settings",
 *     location: "global",
 *     purgeDataTypes: [],
 *     retentionWindowDays: 7,
 * });
 * ```
 * ### Dialogflowcx Security Settings Full
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const inspect = new gcp.dataloss.PreventionInspectTemplate("inspect", {
 *     parent: "projects/my-project-name/locations/global",
 *     displayName: "dialogflowcx-inspect-template",
 *     inspectConfig: {
 *         infoTypes: [{
 *             name: "EMAIL_ADDRESS",
 *         }],
 *     },
 * });
 * const deidentify = new gcp.dataloss.PreventionDeidentifyTemplate("deidentify", {
 *     parent: "projects/my-project-name/locations/global",
 *     displayName: "dialogflowcx-deidentify-template",
 *     deidentifyConfig: {
 *         infoTypeTransformations: {
 *             transformations: [{
 *                 primitiveTransformation: {
 *                     replaceConfig: {
 *                         newValue: {
 *                             stringValue: "[REDACTED]",
 *                         },
 *                     },
 *                 },
 *             }],
 *         },
 *     },
 * });
 * const bucket = new gcp.storage.Bucket("bucket", {
 *     name: "dialogflowcx-bucket",
 *     location: "US",
 *     uniformBucketLevelAccess: true,
 * });
 * const basicSecuritySettings = new gcp.diagflow.CxSecuritySettings("basic_security_settings", {
 *     displayName: "dialogflowcx-security-settings",
 *     location: "global",
 *     redactionStrategy: "REDACT_WITH_SERVICE",
 *     redactionScope: "REDACT_DISK_STORAGE",
 *     inspectTemplate: inspect.id,
 *     deidentifyTemplate: deidentify.id,
 *     purgeDataTypes: ["DIALOGFLOW_HISTORY"],
 *     audioExportSettings: {
 *         gcsBucket: bucket.id,
 *         audioExportPattern: "export",
 *         enableAudioRedaction: true,
 *         audioFormat: "OGG",
 *     },
 *     insightsExportSettings: {
 *         enableInsightsExport: true,
 *     },
 *     retentionStrategy: "REMOVE_AFTER_CONVERSATION",
 * });
 * ```
 *
 * ## Import
 *
 * SecuritySettings can be imported using any of these accepted formats:
 *
 * * `projects/{{project}}/locations/{{location}}/securitySettings/{{name}}`
 *
 * * `{{project}}/{{location}}/{{name}}`
 *
 * * `{{location}}/{{name}}`
 *
 * When using the `pulumi import` command, SecuritySettings can be imported using one of the formats above. For example:
 *
 * ```sh
 * $ pulumi import gcp:diagflow/cxSecuritySettings:CxSecuritySettings default projects/{{project}}/locations/{{location}}/securitySettings/{{name}}
 * ```
 *
 * ```sh
 * $ pulumi import gcp:diagflow/cxSecuritySettings:CxSecuritySettings default {{project}}/{{location}}/{{name}}
 * ```
 *
 * ```sh
 * $ pulumi import gcp:diagflow/cxSecuritySettings:CxSecuritySettings default {{location}}/{{name}}
 * ```
 */
export class CxSecuritySettings extends pulumi.CustomResource {
    /**
     * Get an existing CxSecuritySettings resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CxSecuritySettingsState, opts?: pulumi.CustomResourceOptions): CxSecuritySettings {
        return new CxSecuritySettings(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:diagflow/cxSecuritySettings:CxSecuritySettings';

    /**
     * Returns true if the given object is an instance of CxSecuritySettings.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is CxSecuritySettings {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === CxSecuritySettings.__pulumiType;
    }

    /**
     * Controls audio export settings for post-conversation analytics when ingesting audio to conversations.
     * If retentionStrategy is set to REMOVE_AFTER_CONVERSATION or gcsBucket is empty, audio export is disabled.
     * If audio export is enabled, audio is recorded and saved to gcs_bucket, subject to retention policy of gcs_bucket.
     * This setting won't effect audio input for implicit sessions via [Sessions.DetectIntent](https://cloud.google.com/dialogflow/cx/docs/reference/rest/v3/projects.locations.agents.sessions/detectIntent#google.cloud.dialogflow.cx.v3.Sessions.DetectIntent).
     * Structure is documented below.
     */
    public readonly audioExportSettings!: pulumi.Output<outputs.diagflow.CxSecuritySettingsAudioExportSettings | undefined>;
    /**
     * [DLP](https://cloud.google.com/dlp/docs) deidentify template name. Use this template to define de-identification configuration for the content. If empty, Dialogflow replaces sensitive info with [redacted] text.
     * Note: deidentifyTemplate must be located in the same region as the SecuritySettings.
     * Format: projects/<Project ID>/locations/<Location ID>/deidentifyTemplates/<Template ID> OR organizations/<Organization ID>/locations/<Location ID>/deidentifyTemplates/<Template ID>
     */
    public readonly deidentifyTemplate!: pulumi.Output<string | undefined>;
    /**
     * The human-readable name of the security settings, unique within the location.
     */
    public readonly displayName!: pulumi.Output<string>;
    /**
     * Controls conversation exporting settings to Insights after conversation is completed.
     * If retentionStrategy is set to REMOVE_AFTER_CONVERSATION, Insights export is disabled no matter what you configure here.
     * Structure is documented below.
     */
    public readonly insightsExportSettings!: pulumi.Output<outputs.diagflow.CxSecuritySettingsInsightsExportSettings | undefined>;
    /**
     * [DLP](https://cloud.google.com/dlp/docs) inspect template name. Use this template to define inspect base settings. If empty, we use the default DLP inspect config.
     * Note: inspectTemplate must be located in the same region as the SecuritySettings.
     * Format: projects/<Project ID>/locations/<Location ID>/inspectTemplates/<Template ID> OR organizations/<Organization ID>/locations/<Location ID>/inspectTemplates/<Template ID>
     */
    public readonly inspectTemplate!: pulumi.Output<string | undefined>;
    /**
     * The location these settings are located in. Settings can only be applied to an agent in the same location.
     * See [Available Regions](https://cloud.google.com/dialogflow/cx/docs/concept/region#avail) for a list of supported locations.
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * The unique identifier of the settings.
     * Format: projects/<Project ID>/locations/<Location ID>/securitySettings/<Security Settings ID>.
     */
    public /*out*/ readonly name!: pulumi.Output<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    public readonly project!: pulumi.Output<string>;
    /**
     * List of types of data to remove when retention settings triggers purge.
     * Each value may be one of: `DIALOGFLOW_HISTORY`.
     */
    public readonly purgeDataTypes!: pulumi.Output<string[] | undefined>;
    /**
     * Defines what types of data to redact. If not set, defaults to not redacting any kind of data.
     * * REDACT_DISK_STORAGE: On data to be written to disk or similar devices that are capable of holding data even if power is disconnected. This includes data that are temporarily saved on disk.
     * Possible values are: `REDACT_DISK_STORAGE`.
     */
    public readonly redactionScope!: pulumi.Output<string | undefined>;
    /**
     * Defines how we redact data. If not set, defaults to not redacting.
     * * REDACT_WITH_SERVICE: Call redaction service to clean up the data to be persisted.
     * Possible values are: `REDACT_WITH_SERVICE`.
     */
    public readonly redactionStrategy!: pulumi.Output<string | undefined>;
    /**
     * Defines how long we retain persisted data that contains sensitive info. Only one of `retentionWindowDays` and `retentionStrategy` may be set.
     * * REMOVE_AFTER_CONVERSATION: Removes data when the conversation ends. If there is no conversation explicitly established, a default conversation ends when the corresponding Dialogflow session ends.
     * Possible values are: `REMOVE_AFTER_CONVERSATION`.
     */
    public readonly retentionStrategy!: pulumi.Output<string | undefined>;
    /**
     * Retains the data for the specified number of days. User must set a value lower than Dialogflow's default 365d TTL (30 days for Agent Assist traffic), higher value will be ignored and use default. Setting a value higher than that has no effect. A missing value or setting to 0 also means we use default TTL.
     * Only one of `retentionWindowDays` and `retentionStrategy` may be set.
     */
    public readonly retentionWindowDays!: pulumi.Output<number | undefined>;

    /**
     * Create a CxSecuritySettings resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: CxSecuritySettingsArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CxSecuritySettingsArgs | CxSecuritySettingsState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as CxSecuritySettingsState | undefined;
            resourceInputs["audioExportSettings"] = state ? state.audioExportSettings : undefined;
            resourceInputs["deidentifyTemplate"] = state ? state.deidentifyTemplate : undefined;
            resourceInputs["displayName"] = state ? state.displayName : undefined;
            resourceInputs["insightsExportSettings"] = state ? state.insightsExportSettings : undefined;
            resourceInputs["inspectTemplate"] = state ? state.inspectTemplate : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["project"] = state ? state.project : undefined;
            resourceInputs["purgeDataTypes"] = state ? state.purgeDataTypes : undefined;
            resourceInputs["redactionScope"] = state ? state.redactionScope : undefined;
            resourceInputs["redactionStrategy"] = state ? state.redactionStrategy : undefined;
            resourceInputs["retentionStrategy"] = state ? state.retentionStrategy : undefined;
            resourceInputs["retentionWindowDays"] = state ? state.retentionWindowDays : undefined;
        } else {
            const args = argsOrState as CxSecuritySettingsArgs | undefined;
            if ((!args || args.displayName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'displayName'");
            }
            if ((!args || args.location === undefined) && !opts.urn) {
                throw new Error("Missing required property 'location'");
            }
            resourceInputs["audioExportSettings"] = args ? args.audioExportSettings : undefined;
            resourceInputs["deidentifyTemplate"] = args ? args.deidentifyTemplate : undefined;
            resourceInputs["displayName"] = args ? args.displayName : undefined;
            resourceInputs["insightsExportSettings"] = args ? args.insightsExportSettings : undefined;
            resourceInputs["inspectTemplate"] = args ? args.inspectTemplate : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["purgeDataTypes"] = args ? args.purgeDataTypes : undefined;
            resourceInputs["redactionScope"] = args ? args.redactionScope : undefined;
            resourceInputs["redactionStrategy"] = args ? args.redactionStrategy : undefined;
            resourceInputs["retentionStrategy"] = args ? args.retentionStrategy : undefined;
            resourceInputs["retentionWindowDays"] = args ? args.retentionWindowDays : undefined;
            resourceInputs["name"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(CxSecuritySettings.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering CxSecuritySettings resources.
 */
export interface CxSecuritySettingsState {
    /**
     * Controls audio export settings for post-conversation analytics when ingesting audio to conversations.
     * If retentionStrategy is set to REMOVE_AFTER_CONVERSATION or gcsBucket is empty, audio export is disabled.
     * If audio export is enabled, audio is recorded and saved to gcs_bucket, subject to retention policy of gcs_bucket.
     * This setting won't effect audio input for implicit sessions via [Sessions.DetectIntent](https://cloud.google.com/dialogflow/cx/docs/reference/rest/v3/projects.locations.agents.sessions/detectIntent#google.cloud.dialogflow.cx.v3.Sessions.DetectIntent).
     * Structure is documented below.
     */
    audioExportSettings?: pulumi.Input<inputs.diagflow.CxSecuritySettingsAudioExportSettings>;
    /**
     * [DLP](https://cloud.google.com/dlp/docs) deidentify template name. Use this template to define de-identification configuration for the content. If empty, Dialogflow replaces sensitive info with [redacted] text.
     * Note: deidentifyTemplate must be located in the same region as the SecuritySettings.
     * Format: projects/<Project ID>/locations/<Location ID>/deidentifyTemplates/<Template ID> OR organizations/<Organization ID>/locations/<Location ID>/deidentifyTemplates/<Template ID>
     */
    deidentifyTemplate?: pulumi.Input<string>;
    /**
     * The human-readable name of the security settings, unique within the location.
     */
    displayName?: pulumi.Input<string>;
    /**
     * Controls conversation exporting settings to Insights after conversation is completed.
     * If retentionStrategy is set to REMOVE_AFTER_CONVERSATION, Insights export is disabled no matter what you configure here.
     * Structure is documented below.
     */
    insightsExportSettings?: pulumi.Input<inputs.diagflow.CxSecuritySettingsInsightsExportSettings>;
    /**
     * [DLP](https://cloud.google.com/dlp/docs) inspect template name. Use this template to define inspect base settings. If empty, we use the default DLP inspect config.
     * Note: inspectTemplate must be located in the same region as the SecuritySettings.
     * Format: projects/<Project ID>/locations/<Location ID>/inspectTemplates/<Template ID> OR organizations/<Organization ID>/locations/<Location ID>/inspectTemplates/<Template ID>
     */
    inspectTemplate?: pulumi.Input<string>;
    /**
     * The location these settings are located in. Settings can only be applied to an agent in the same location.
     * See [Available Regions](https://cloud.google.com/dialogflow/cx/docs/concept/region#avail) for a list of supported locations.
     */
    location?: pulumi.Input<string>;
    /**
     * The unique identifier of the settings.
     * Format: projects/<Project ID>/locations/<Location ID>/securitySettings/<Security Settings ID>.
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * List of types of data to remove when retention settings triggers purge.
     * Each value may be one of: `DIALOGFLOW_HISTORY`.
     */
    purgeDataTypes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Defines what types of data to redact. If not set, defaults to not redacting any kind of data.
     * * REDACT_DISK_STORAGE: On data to be written to disk or similar devices that are capable of holding data even if power is disconnected. This includes data that are temporarily saved on disk.
     * Possible values are: `REDACT_DISK_STORAGE`.
     */
    redactionScope?: pulumi.Input<string>;
    /**
     * Defines how we redact data. If not set, defaults to not redacting.
     * * REDACT_WITH_SERVICE: Call redaction service to clean up the data to be persisted.
     * Possible values are: `REDACT_WITH_SERVICE`.
     */
    redactionStrategy?: pulumi.Input<string>;
    /**
     * Defines how long we retain persisted data that contains sensitive info. Only one of `retentionWindowDays` and `retentionStrategy` may be set.
     * * REMOVE_AFTER_CONVERSATION: Removes data when the conversation ends. If there is no conversation explicitly established, a default conversation ends when the corresponding Dialogflow session ends.
     * Possible values are: `REMOVE_AFTER_CONVERSATION`.
     */
    retentionStrategy?: pulumi.Input<string>;
    /**
     * Retains the data for the specified number of days. User must set a value lower than Dialogflow's default 365d TTL (30 days for Agent Assist traffic), higher value will be ignored and use default. Setting a value higher than that has no effect. A missing value or setting to 0 also means we use default TTL.
     * Only one of `retentionWindowDays` and `retentionStrategy` may be set.
     */
    retentionWindowDays?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a CxSecuritySettings resource.
 */
export interface CxSecuritySettingsArgs {
    /**
     * Controls audio export settings for post-conversation analytics when ingesting audio to conversations.
     * If retentionStrategy is set to REMOVE_AFTER_CONVERSATION or gcsBucket is empty, audio export is disabled.
     * If audio export is enabled, audio is recorded and saved to gcs_bucket, subject to retention policy of gcs_bucket.
     * This setting won't effect audio input for implicit sessions via [Sessions.DetectIntent](https://cloud.google.com/dialogflow/cx/docs/reference/rest/v3/projects.locations.agents.sessions/detectIntent#google.cloud.dialogflow.cx.v3.Sessions.DetectIntent).
     * Structure is documented below.
     */
    audioExportSettings?: pulumi.Input<inputs.diagflow.CxSecuritySettingsAudioExportSettings>;
    /**
     * [DLP](https://cloud.google.com/dlp/docs) deidentify template name. Use this template to define de-identification configuration for the content. If empty, Dialogflow replaces sensitive info with [redacted] text.
     * Note: deidentifyTemplate must be located in the same region as the SecuritySettings.
     * Format: projects/<Project ID>/locations/<Location ID>/deidentifyTemplates/<Template ID> OR organizations/<Organization ID>/locations/<Location ID>/deidentifyTemplates/<Template ID>
     */
    deidentifyTemplate?: pulumi.Input<string>;
    /**
     * The human-readable name of the security settings, unique within the location.
     */
    displayName: pulumi.Input<string>;
    /**
     * Controls conversation exporting settings to Insights after conversation is completed.
     * If retentionStrategy is set to REMOVE_AFTER_CONVERSATION, Insights export is disabled no matter what you configure here.
     * Structure is documented below.
     */
    insightsExportSettings?: pulumi.Input<inputs.diagflow.CxSecuritySettingsInsightsExportSettings>;
    /**
     * [DLP](https://cloud.google.com/dlp/docs) inspect template name. Use this template to define inspect base settings. If empty, we use the default DLP inspect config.
     * Note: inspectTemplate must be located in the same region as the SecuritySettings.
     * Format: projects/<Project ID>/locations/<Location ID>/inspectTemplates/<Template ID> OR organizations/<Organization ID>/locations/<Location ID>/inspectTemplates/<Template ID>
     */
    inspectTemplate?: pulumi.Input<string>;
    /**
     * The location these settings are located in. Settings can only be applied to an agent in the same location.
     * See [Available Regions](https://cloud.google.com/dialogflow/cx/docs/concept/region#avail) for a list of supported locations.
     */
    location: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * List of types of data to remove when retention settings triggers purge.
     * Each value may be one of: `DIALOGFLOW_HISTORY`.
     */
    purgeDataTypes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Defines what types of data to redact. If not set, defaults to not redacting any kind of data.
     * * REDACT_DISK_STORAGE: On data to be written to disk or similar devices that are capable of holding data even if power is disconnected. This includes data that are temporarily saved on disk.
     * Possible values are: `REDACT_DISK_STORAGE`.
     */
    redactionScope?: pulumi.Input<string>;
    /**
     * Defines how we redact data. If not set, defaults to not redacting.
     * * REDACT_WITH_SERVICE: Call redaction service to clean up the data to be persisted.
     * Possible values are: `REDACT_WITH_SERVICE`.
     */
    redactionStrategy?: pulumi.Input<string>;
    /**
     * Defines how long we retain persisted data that contains sensitive info. Only one of `retentionWindowDays` and `retentionStrategy` may be set.
     * * REMOVE_AFTER_CONVERSATION: Removes data when the conversation ends. If there is no conversation explicitly established, a default conversation ends when the corresponding Dialogflow session ends.
     * Possible values are: `REMOVE_AFTER_CONVERSATION`.
     */
    retentionStrategy?: pulumi.Input<string>;
    /**
     * Retains the data for the specified number of days. User must set a value lower than Dialogflow's default 365d TTL (30 days for Agent Assist traffic), higher value will be ignored and use default. Setting a value higher than that has no effect. A missing value or setting to 0 also means we use default TTL.
     * Only one of `retentionWindowDays` and `retentionStrategy` may be set.
     */
    retentionWindowDays?: pulumi.Input<number>;
}
