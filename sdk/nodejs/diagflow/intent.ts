// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Represents a Dialogflow intent. Intents convert a number of user expressions or patterns into an action. An action
 * is an extraction of a user command or sentence semantics.
 *
 * To get more information about Intent, see:
 *
 * * [API documentation](https://cloud.google.com/dialogflow/docs/reference/rest/v2/projects.agent.intents)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/dialogflow/docs/)
 *
 * ## Example Usage
 *
 * ### Dialogflow Intent Basic
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const basicAgent = new gcp.diagflow.Agent("basic_agent", {
 *     displayName: "example_agent",
 *     defaultLanguageCode: "en",
 *     timeZone: "America/New_York",
 * });
 * const basicIntent = new gcp.diagflow.Intent("basic_intent", {displayName: "basic-intent"}, {
 *     dependsOn: [basicAgent],
 * });
 * ```
 * ### Dialogflow Intent Full
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const agentProject = new gcp.organizations.Project("agent_project", {
 *     projectId: "my-project",
 *     name: "my-project",
 *     orgId: "123456789",
 *     deletionPolicy: "DELETE",
 * });
 * const agentProjectService = new gcp.projects.Service("agent_project", {
 *     project: agentProject.projectId,
 *     service: "dialogflow.googleapis.com",
 *     disableDependentServices: false,
 * });
 * const dialogflowServiceAccount = new gcp.serviceaccount.Account("dialogflow_service_account", {accountId: "my-account"});
 * const agentCreate = new gcp.projects.IAMMember("agent_create", {
 *     project: agentProjectService.project,
 *     role: "roles/dialogflow.admin",
 *     member: pulumi.interpolate`serviceAccount:${dialogflowServiceAccount.email}`,
 * });
 * const basicAgent = new gcp.diagflow.Agent("basic_agent", {
 *     project: agentProject.projectId,
 *     displayName: "example_agent",
 *     defaultLanguageCode: "en",
 *     timeZone: "America/New_York",
 * });
 * const fullIntent = new gcp.diagflow.Intent("full_intent", {
 *     project: agentProject.projectId,
 *     displayName: "full-intent",
 *     webhookState: "WEBHOOK_STATE_ENABLED",
 *     priority: 1,
 *     isFallback: false,
 *     mlDisabled: true,
 *     action: "some_action",
 *     resetContexts: true,
 *     inputContextNames: [pulumi.interpolate`projects/${agentProject.projectId}/agent/sessions/-/contexts/some_id`],
 *     events: ["some_event"],
 *     defaultResponsePlatforms: [
 *         "FACEBOOK",
 *         "SLACK",
 *     ],
 * }, {
 *     dependsOn: [basicAgent],
 * });
 * ```
 *
 * ## Import
 *
 * Intent can be imported using any of these accepted formats:
 *
 * * `{{name}}`
 *
 * When using the `pulumi import` command, Intent can be imported using one of the formats above. For example:
 *
 * ```sh
 * $ pulumi import gcp:diagflow/intent:Intent default {{name}}
 * ```
 */
export class Intent extends pulumi.CustomResource {
    /**
     * Get an existing Intent resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: IntentState, opts?: pulumi.CustomResourceOptions): Intent {
        return new Intent(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:diagflow/intent:Intent';

    /**
     * Returns true if the given object is an instance of Intent.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Intent {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Intent.__pulumiType;
    }

    /**
     * The name of the action associated with the intent.
     * Note: The action name must not contain whitespaces.
     */
    public readonly action!: pulumi.Output<string>;
    /**
     * The list of platforms for which the first responses will be copied from the messages in PLATFORM_UNSPECIFIED
     * (i.e. default platform).
     * Each value may be one of: `FACEBOOK`, `SLACK`, `TELEGRAM`, `KIK`, `SKYPE`, `LINE`, `VIBER`, `ACTIONS_ON_GOOGLE`, `GOOGLE_HANGOUTS`.
     */
    public readonly defaultResponsePlatforms!: pulumi.Output<string[] | undefined>;
    /**
     * The name of this intent to be displayed on the console.
     */
    public readonly displayName!: pulumi.Output<string>;
    /**
     * The collection of event names that trigger the intent. If the collection of input contexts is not empty, all of
     * the contexts must be present in the active user session for an event to trigger this intent. See the
     * [events reference](https://cloud.google.com/dialogflow/docs/events-overview) for more details.
     */
    public readonly events!: pulumi.Output<string[] | undefined>;
    /**
     * Information about all followup intents that have this intent as a direct or indirect parent. We populate this field
     * only in the output.
     * Structure is documented below.
     */
    public /*out*/ readonly followupIntentInfos!: pulumi.Output<outputs.diagflow.IntentFollowupIntentInfo[]>;
    /**
     * The list of context names required for this intent to be triggered.
     * Format: projects/<Project ID>/agent/sessions/-/contexts/<Context ID>.
     */
    public readonly inputContextNames!: pulumi.Output<string[] | undefined>;
    /**
     * Indicates whether this is a fallback intent.
     */
    public readonly isFallback!: pulumi.Output<boolean>;
    /**
     * Indicates whether Machine Learning is disabled for the intent.
     * Note: If mlDisabled setting is set to true, then this intent is not taken into account during inference in ML
     * ONLY match mode. Also, auto-markup in the UI is turned off.
     */
    public readonly mlDisabled!: pulumi.Output<boolean>;
    /**
     * The unique identifier of this intent.
     * Format: projects/<Project ID>/agent/intents/<Intent ID>.
     */
    public /*out*/ readonly name!: pulumi.Output<string>;
    /**
     * The unique identifier of the parent intent in the chain of followup intents.
     * Format: projects/<Project ID>/agent/intents/<Intent ID>.
     */
    public readonly parentFollowupIntentName!: pulumi.Output<string>;
    /**
     * The priority of this intent. Higher numbers represent higher priorities.
     * - If the supplied value is unspecified or 0, the service translates the value to 500,000, which corresponds
     * to the Normal priority in the console.
     * - If the supplied value is negative, the intent is ignored in runtime detect intent requests.
     */
    public readonly priority!: pulumi.Output<number>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    public readonly project!: pulumi.Output<string>;
    /**
     * Indicates whether to delete all contexts in the current session when this intent is matched.
     */
    public readonly resetContexts!: pulumi.Output<boolean>;
    /**
     * The unique identifier of the root intent in the chain of followup intents. It identifies the correct followup
     * intents chain for this intent.
     * Format: projects/<Project ID>/agent/intents/<Intent ID>.
     */
    public /*out*/ readonly rootFollowupIntentName!: pulumi.Output<string>;
    /**
     * Indicates whether webhooks are enabled for the intent.
     * * WEBHOOK_STATE_ENABLED: Webhook is enabled in the agent and in the intent.
     * * WEBHOOK_STATE_ENABLED_FOR_SLOT_FILLING: Webhook is enabled in the agent and in the intent. Also, each slot
     * filling prompt is forwarded to the webhook.
     * Possible values are: `WEBHOOK_STATE_ENABLED`, `WEBHOOK_STATE_ENABLED_FOR_SLOT_FILLING`.
     */
    public readonly webhookState!: pulumi.Output<string>;

    /**
     * Create a Intent resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: IntentArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: IntentArgs | IntentState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as IntentState | undefined;
            resourceInputs["action"] = state ? state.action : undefined;
            resourceInputs["defaultResponsePlatforms"] = state ? state.defaultResponsePlatforms : undefined;
            resourceInputs["displayName"] = state ? state.displayName : undefined;
            resourceInputs["events"] = state ? state.events : undefined;
            resourceInputs["followupIntentInfos"] = state ? state.followupIntentInfos : undefined;
            resourceInputs["inputContextNames"] = state ? state.inputContextNames : undefined;
            resourceInputs["isFallback"] = state ? state.isFallback : undefined;
            resourceInputs["mlDisabled"] = state ? state.mlDisabled : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["parentFollowupIntentName"] = state ? state.parentFollowupIntentName : undefined;
            resourceInputs["priority"] = state ? state.priority : undefined;
            resourceInputs["project"] = state ? state.project : undefined;
            resourceInputs["resetContexts"] = state ? state.resetContexts : undefined;
            resourceInputs["rootFollowupIntentName"] = state ? state.rootFollowupIntentName : undefined;
            resourceInputs["webhookState"] = state ? state.webhookState : undefined;
        } else {
            const args = argsOrState as IntentArgs | undefined;
            if ((!args || args.displayName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'displayName'");
            }
            resourceInputs["action"] = args ? args.action : undefined;
            resourceInputs["defaultResponsePlatforms"] = args ? args.defaultResponsePlatforms : undefined;
            resourceInputs["displayName"] = args ? args.displayName : undefined;
            resourceInputs["events"] = args ? args.events : undefined;
            resourceInputs["inputContextNames"] = args ? args.inputContextNames : undefined;
            resourceInputs["isFallback"] = args ? args.isFallback : undefined;
            resourceInputs["mlDisabled"] = args ? args.mlDisabled : undefined;
            resourceInputs["parentFollowupIntentName"] = args ? args.parentFollowupIntentName : undefined;
            resourceInputs["priority"] = args ? args.priority : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["resetContexts"] = args ? args.resetContexts : undefined;
            resourceInputs["webhookState"] = args ? args.webhookState : undefined;
            resourceInputs["followupIntentInfos"] = undefined /*out*/;
            resourceInputs["name"] = undefined /*out*/;
            resourceInputs["rootFollowupIntentName"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Intent.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Intent resources.
 */
export interface IntentState {
    /**
     * The name of the action associated with the intent.
     * Note: The action name must not contain whitespaces.
     */
    action?: pulumi.Input<string>;
    /**
     * The list of platforms for which the first responses will be copied from the messages in PLATFORM_UNSPECIFIED
     * (i.e. default platform).
     * Each value may be one of: `FACEBOOK`, `SLACK`, `TELEGRAM`, `KIK`, `SKYPE`, `LINE`, `VIBER`, `ACTIONS_ON_GOOGLE`, `GOOGLE_HANGOUTS`.
     */
    defaultResponsePlatforms?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of this intent to be displayed on the console.
     */
    displayName?: pulumi.Input<string>;
    /**
     * The collection of event names that trigger the intent. If the collection of input contexts is not empty, all of
     * the contexts must be present in the active user session for an event to trigger this intent. See the
     * [events reference](https://cloud.google.com/dialogflow/docs/events-overview) for more details.
     */
    events?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Information about all followup intents that have this intent as a direct or indirect parent. We populate this field
     * only in the output.
     * Structure is documented below.
     */
    followupIntentInfos?: pulumi.Input<pulumi.Input<inputs.diagflow.IntentFollowupIntentInfo>[]>;
    /**
     * The list of context names required for this intent to be triggered.
     * Format: projects/<Project ID>/agent/sessions/-/contexts/<Context ID>.
     */
    inputContextNames?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Indicates whether this is a fallback intent.
     */
    isFallback?: pulumi.Input<boolean>;
    /**
     * Indicates whether Machine Learning is disabled for the intent.
     * Note: If mlDisabled setting is set to true, then this intent is not taken into account during inference in ML
     * ONLY match mode. Also, auto-markup in the UI is turned off.
     */
    mlDisabled?: pulumi.Input<boolean>;
    /**
     * The unique identifier of this intent.
     * Format: projects/<Project ID>/agent/intents/<Intent ID>.
     */
    name?: pulumi.Input<string>;
    /**
     * The unique identifier of the parent intent in the chain of followup intents.
     * Format: projects/<Project ID>/agent/intents/<Intent ID>.
     */
    parentFollowupIntentName?: pulumi.Input<string>;
    /**
     * The priority of this intent. Higher numbers represent higher priorities.
     * - If the supplied value is unspecified or 0, the service translates the value to 500,000, which corresponds
     * to the Normal priority in the console.
     * - If the supplied value is negative, the intent is ignored in runtime detect intent requests.
     */
    priority?: pulumi.Input<number>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * Indicates whether to delete all contexts in the current session when this intent is matched.
     */
    resetContexts?: pulumi.Input<boolean>;
    /**
     * The unique identifier of the root intent in the chain of followup intents. It identifies the correct followup
     * intents chain for this intent.
     * Format: projects/<Project ID>/agent/intents/<Intent ID>.
     */
    rootFollowupIntentName?: pulumi.Input<string>;
    /**
     * Indicates whether webhooks are enabled for the intent.
     * * WEBHOOK_STATE_ENABLED: Webhook is enabled in the agent and in the intent.
     * * WEBHOOK_STATE_ENABLED_FOR_SLOT_FILLING: Webhook is enabled in the agent and in the intent. Also, each slot
     * filling prompt is forwarded to the webhook.
     * Possible values are: `WEBHOOK_STATE_ENABLED`, `WEBHOOK_STATE_ENABLED_FOR_SLOT_FILLING`.
     */
    webhookState?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Intent resource.
 */
export interface IntentArgs {
    /**
     * The name of the action associated with the intent.
     * Note: The action name must not contain whitespaces.
     */
    action?: pulumi.Input<string>;
    /**
     * The list of platforms for which the first responses will be copied from the messages in PLATFORM_UNSPECIFIED
     * (i.e. default platform).
     * Each value may be one of: `FACEBOOK`, `SLACK`, `TELEGRAM`, `KIK`, `SKYPE`, `LINE`, `VIBER`, `ACTIONS_ON_GOOGLE`, `GOOGLE_HANGOUTS`.
     */
    defaultResponsePlatforms?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of this intent to be displayed on the console.
     */
    displayName: pulumi.Input<string>;
    /**
     * The collection of event names that trigger the intent. If the collection of input contexts is not empty, all of
     * the contexts must be present in the active user session for an event to trigger this intent. See the
     * [events reference](https://cloud.google.com/dialogflow/docs/events-overview) for more details.
     */
    events?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The list of context names required for this intent to be triggered.
     * Format: projects/<Project ID>/agent/sessions/-/contexts/<Context ID>.
     */
    inputContextNames?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Indicates whether this is a fallback intent.
     */
    isFallback?: pulumi.Input<boolean>;
    /**
     * Indicates whether Machine Learning is disabled for the intent.
     * Note: If mlDisabled setting is set to true, then this intent is not taken into account during inference in ML
     * ONLY match mode. Also, auto-markup in the UI is turned off.
     */
    mlDisabled?: pulumi.Input<boolean>;
    /**
     * The unique identifier of the parent intent in the chain of followup intents.
     * Format: projects/<Project ID>/agent/intents/<Intent ID>.
     */
    parentFollowupIntentName?: pulumi.Input<string>;
    /**
     * The priority of this intent. Higher numbers represent higher priorities.
     * - If the supplied value is unspecified or 0, the service translates the value to 500,000, which corresponds
     * to the Normal priority in the console.
     * - If the supplied value is negative, the intent is ignored in runtime detect intent requests.
     */
    priority?: pulumi.Input<number>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * Indicates whether to delete all contexts in the current session when this intent is matched.
     */
    resetContexts?: pulumi.Input<boolean>;
    /**
     * Indicates whether webhooks are enabled for the intent.
     * * WEBHOOK_STATE_ENABLED: Webhook is enabled in the agent and in the intent.
     * * WEBHOOK_STATE_ENABLED_FOR_SLOT_FILLING: Webhook is enabled in the agent and in the intent. Also, each slot
     * filling prompt is forwarded to the webhook.
     * Possible values are: `WEBHOOK_STATE_ENABLED`, `WEBHOOK_STATE_ENABLED_FOR_SLOT_FILLING`.
     */
    webhookState?: pulumi.Input<string>;
}
