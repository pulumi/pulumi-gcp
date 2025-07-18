// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Describes a group of resources to read log entries from
 *
 * To get more information about LogScope, see:
 *
 * * [API documentation](https://cloud.google.com/logging/docs/reference/v2/rest/v2/projects.locations.logScopes)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/logging/docs/apis)
 *
 * ## Example Usage
 *
 * ### Logging Log Scope Basic
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const loggingLogScope = new gcp.logging.LogScope("logging_log_scope", {
 *     parent: "projects/my-project-name",
 *     location: "global",
 *     name: "projects/my-project-name/locations/global/logScopes/my-log-scope",
 *     resourceNames: [
 *         "projects/my-project-name",
 *         "projects/my-project-name/locations/global/buckets/_Default/views/view1",
 *         "projects/my-project-name/locations/global/buckets/_Default/views/view2",
 *     ],
 *     description: "A log scope configured with Terraform",
 * });
 * ```
 *
 * ## Import
 *
 * LogScope can be imported using any of these accepted formats:
 *
 * * `{{parent}}/locations/{{location}}/logScopes/{{name}}`
 *
 * When using the `pulumi import` command, LogScope can be imported using one of the formats above. For example:
 *
 * ```sh
 * $ pulumi import gcp:logging/logScope:LogScope default {{parent}}/locations/{{location}}/logScopes/{{name}}
 * ```
 */
export class LogScope extends pulumi.CustomResource {
    /**
     * Get an existing LogScope resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: LogScopeState, opts?: pulumi.CustomResourceOptions): LogScope {
        return new LogScope(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:logging/logScope:LogScope';

    /**
     * Returns true if the given object is an instance of LogScope.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is LogScope {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === LogScope.__pulumiType;
    }

    /**
     * Output only. The creation timestamp of the log scopes.
     */
    public /*out*/ readonly createTime!: pulumi.Output<string>;
    /**
     * Describes this log scopes.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The location of the resource. The only supported location is global so far.
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * The resource name of the log scope. For example: \`projects/my-project/locations/global/logScopes/my-log-scope\`
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The parent of the resource.
     */
    public readonly parent!: pulumi.Output<string>;
    /**
     * Names of one or more parent resources : *  \`projects/[PROJECT_ID]\` May alternatively be one or more views : * \`projects/[PROJECT_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID]\` A log scope can include a maximum of 50 projects and a maximum of 100 resources in total.
     */
    public readonly resourceNames!: pulumi.Output<string[]>;
    /**
     * Output only. The last update timestamp of the log scopes.
     */
    public /*out*/ readonly updateTime!: pulumi.Output<string>;

    /**
     * Create a LogScope resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: LogScopeArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: LogScopeArgs | LogScopeState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as LogScopeState | undefined;
            resourceInputs["createTime"] = state ? state.createTime : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["parent"] = state ? state.parent : undefined;
            resourceInputs["resourceNames"] = state ? state.resourceNames : undefined;
            resourceInputs["updateTime"] = state ? state.updateTime : undefined;
        } else {
            const args = argsOrState as LogScopeArgs | undefined;
            if ((!args || args.resourceNames === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceNames'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["parent"] = args ? args.parent : undefined;
            resourceInputs["resourceNames"] = args ? args.resourceNames : undefined;
            resourceInputs["createTime"] = undefined /*out*/;
            resourceInputs["updateTime"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(LogScope.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering LogScope resources.
 */
export interface LogScopeState {
    /**
     * Output only. The creation timestamp of the log scopes.
     */
    createTime?: pulumi.Input<string>;
    /**
     * Describes this log scopes.
     */
    description?: pulumi.Input<string>;
    /**
     * The location of the resource. The only supported location is global so far.
     */
    location?: pulumi.Input<string>;
    /**
     * The resource name of the log scope. For example: \`projects/my-project/locations/global/logScopes/my-log-scope\`
     */
    name?: pulumi.Input<string>;
    /**
     * The parent of the resource.
     */
    parent?: pulumi.Input<string>;
    /**
     * Names of one or more parent resources : *  \`projects/[PROJECT_ID]\` May alternatively be one or more views : * \`projects/[PROJECT_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID]\` A log scope can include a maximum of 50 projects and a maximum of 100 resources in total.
     */
    resourceNames?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Output only. The last update timestamp of the log scopes.
     */
    updateTime?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a LogScope resource.
 */
export interface LogScopeArgs {
    /**
     * Describes this log scopes.
     */
    description?: pulumi.Input<string>;
    /**
     * The location of the resource. The only supported location is global so far.
     */
    location?: pulumi.Input<string>;
    /**
     * The resource name of the log scope. For example: \`projects/my-project/locations/global/logScopes/my-log-scope\`
     */
    name?: pulumi.Input<string>;
    /**
     * The parent of the resource.
     */
    parent?: pulumi.Input<string>;
    /**
     * Names of one or more parent resources : *  \`projects/[PROJECT_ID]\` May alternatively be one or more views : * \`projects/[PROJECT_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID]\` A log scope can include a maximum of 50 projects and a maximum of 100 resources in total.
     */
    resourceNames: pulumi.Input<pulumi.Input<string>[]>;
}
