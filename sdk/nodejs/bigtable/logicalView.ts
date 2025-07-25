// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * A logical view object that can be referenced in SQL queries.
 *
 * To get more information about LogicalView, see:
 *
 * * [API documentation](https://cloud.google.com/bigtable/docs/reference/admin/rest/v2/projects.instances.logicalViews)
 *
 * ## Example Usage
 *
 * ### Bigtable Logical View
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const instance = new gcp.bigtable.Instance("instance", {
 *     name: "bt-instance",
 *     clusters: [{
 *         clusterId: "cluster-1",
 *         zone: "us-east1-b",
 *         numNodes: 3,
 *         storageType: "HDD",
 *     }],
 *     deletionProtection: false,
 * });
 * const table = new gcp.bigtable.Table("table", {
 *     name: "bt-table",
 *     instanceName: instance.name,
 *     columnFamilies: [{
 *         family: "CF",
 *     }],
 * });
 * const logicalView = new gcp.bigtable.LogicalView("logical_view", {
 *     logicalViewId: "bt-logical-view",
 *     instance: instance.name,
 *     deletionProtection: false,
 *     query: `SELECT _key, CF
 * FROM \` + "\`bt-table\`" + \`
 * `,
 * }, {
 *     dependsOn: [table],
 * });
 * ```
 *
 * ## Import
 *
 * LogicalView can be imported using any of these accepted formats:
 *
 * * `projects/{{project}}/instances/{{instance}}/logicalViews/{{logical_view_id}}`
 *
 * * `{{project}}/{{instance}}/{{logical_view_id}}`
 *
 * * `{{instance}}/{{logical_view_id}}`
 *
 * When using the `pulumi import` command, LogicalView can be imported using one of the formats above. For example:
 *
 * ```sh
 * $ pulumi import gcp:bigtable/logicalView:LogicalView default projects/{{project}}/instances/{{instance}}/logicalViews/{{logical_view_id}}
 * ```
 *
 * ```sh
 * $ pulumi import gcp:bigtable/logicalView:LogicalView default {{project}}/{{instance}}/{{logical_view_id}}
 * ```
 *
 * ```sh
 * $ pulumi import gcp:bigtable/logicalView:LogicalView default {{instance}}/{{logical_view_id}}
 * ```
 */
export class LogicalView extends pulumi.CustomResource {
    /**
     * Get an existing LogicalView resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: LogicalViewState, opts?: pulumi.CustomResourceOptions): LogicalView {
        return new LogicalView(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:bigtable/logicalView:LogicalView';

    /**
     * Returns true if the given object is an instance of LogicalView.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is LogicalView {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === LogicalView.__pulumiType;
    }

    /**
     * Set to true to make the logical view protected against deletion.
     */
    public readonly deletionProtection!: pulumi.Output<boolean | undefined>;
    /**
     * The name of the instance to create the logical view within.
     */
    public readonly instance!: pulumi.Output<string | undefined>;
    /**
     * The unique name of the logical view in the form `[_a-zA-Z0-9][-_.a-zA-Z0-9]*`.
     */
    public readonly logicalViewId!: pulumi.Output<string>;
    /**
     * The unique name of the requested logical view. Values are of the form `projects/<project>/instances/<instance>/logicalViews/<logicalViewId>`.
     */
    public /*out*/ readonly name!: pulumi.Output<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    public readonly project!: pulumi.Output<string>;
    /**
     * The logical view's select query.
     */
    public readonly query!: pulumi.Output<string>;

    /**
     * Create a LogicalView resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: LogicalViewArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: LogicalViewArgs | LogicalViewState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as LogicalViewState | undefined;
            resourceInputs["deletionProtection"] = state ? state.deletionProtection : undefined;
            resourceInputs["instance"] = state ? state.instance : undefined;
            resourceInputs["logicalViewId"] = state ? state.logicalViewId : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["project"] = state ? state.project : undefined;
            resourceInputs["query"] = state ? state.query : undefined;
        } else {
            const args = argsOrState as LogicalViewArgs | undefined;
            if ((!args || args.logicalViewId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'logicalViewId'");
            }
            if ((!args || args.query === undefined) && !opts.urn) {
                throw new Error("Missing required property 'query'");
            }
            resourceInputs["deletionProtection"] = args ? args.deletionProtection : undefined;
            resourceInputs["instance"] = args ? args.instance : undefined;
            resourceInputs["logicalViewId"] = args ? args.logicalViewId : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["query"] = args ? args.query : undefined;
            resourceInputs["name"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(LogicalView.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering LogicalView resources.
 */
export interface LogicalViewState {
    /**
     * Set to true to make the logical view protected against deletion.
     */
    deletionProtection?: pulumi.Input<boolean>;
    /**
     * The name of the instance to create the logical view within.
     */
    instance?: pulumi.Input<string>;
    /**
     * The unique name of the logical view in the form `[_a-zA-Z0-9][-_.a-zA-Z0-9]*`.
     */
    logicalViewId?: pulumi.Input<string>;
    /**
     * The unique name of the requested logical view. Values are of the form `projects/<project>/instances/<instance>/logicalViews/<logicalViewId>`.
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * The logical view's select query.
     */
    query?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a LogicalView resource.
 */
export interface LogicalViewArgs {
    /**
     * Set to true to make the logical view protected against deletion.
     */
    deletionProtection?: pulumi.Input<boolean>;
    /**
     * The name of the instance to create the logical view within.
     */
    instance?: pulumi.Input<string>;
    /**
     * The unique name of the logical view in the form `[_a-zA-Z0-9][-_.a-zA-Z0-9]*`.
     */
    logicalViewId: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * The logical view's select query.
     */
    query: pulumi.Input<string>;
}
