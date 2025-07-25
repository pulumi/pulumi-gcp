// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages a folder-level logging exclusion. For more information see:
 *
 * * [API documentation](https://cloud.google.com/logging/docs/reference/v2/rest/v2/folders.exclusions)
 * * How-to Guides
 *     * [Excluding Logs](https://cloud.google.com/logging/docs/exclusions)
 *
 * > You can specify exclusions for log sinks created by the provider by using the exclusions field of `gcp.logging.FolderSink`
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const my_folder = new gcp.organizations.Folder("my-folder", {
 *     displayName: "My folder",
 *     parent: "organizations/123456",
 * });
 * const my_exclusion = new gcp.logging.FolderExclusion("my-exclusion", {
 *     name: "my-instance-debug-exclusion",
 *     folder: my_folder.name,
 *     description: "Exclude GCE instance debug logs",
 *     filter: "resource.type = gce_instance AND severity <= DEBUG",
 * });
 * ```
 *
 * ## Import
 *
 * Folder-level logging exclusions can be imported using their URI, e.g.
 *
 * * `folders/{{folder}}/exclusions/{{name}}`
 *
 * When using the `pulumi import` command, folder-level logging exclusions can be imported using one of the formats above. For example:
 *
 * ```sh
 * $ pulumi import gcp:logging/folderExclusion:FolderExclusion default folders/{{folder}}/exclusions/{{name}}
 * ```
 */
export class FolderExclusion extends pulumi.CustomResource {
    /**
     * Get an existing FolderExclusion resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: FolderExclusionState, opts?: pulumi.CustomResourceOptions): FolderExclusion {
        return new FolderExclusion(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:logging/folderExclusion:FolderExclusion';

    /**
     * Returns true if the given object is an instance of FolderExclusion.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is FolderExclusion {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === FolderExclusion.__pulumiType;
    }

    /**
     * A human-readable description.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Whether this exclusion rule should be disabled or not. This defaults to
     * false.
     */
    public readonly disabled!: pulumi.Output<boolean | undefined>;
    /**
     * The filter to apply when excluding logs. Only log entries that match the filter are excluded.
     * See [Advanced Log Filters](https://cloud.google.com/logging/docs/view/advanced-filters) for information on how to
     * write a filter.
     */
    public readonly filter!: pulumi.Output<string>;
    /**
     * The folder to be exported to the sink. Note that either [FOLDER_ID] or "folders/[FOLDER_ID]" is
     * accepted.
     */
    public readonly folder!: pulumi.Output<string>;
    /**
     * The name of the logging exclusion.
     */
    public readonly name!: pulumi.Output<string>;

    /**
     * Create a FolderExclusion resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: FolderExclusionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: FolderExclusionArgs | FolderExclusionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as FolderExclusionState | undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["disabled"] = state ? state.disabled : undefined;
            resourceInputs["filter"] = state ? state.filter : undefined;
            resourceInputs["folder"] = state ? state.folder : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
        } else {
            const args = argsOrState as FolderExclusionArgs | undefined;
            if ((!args || args.filter === undefined) && !opts.urn) {
                throw new Error("Missing required property 'filter'");
            }
            if ((!args || args.folder === undefined) && !opts.urn) {
                throw new Error("Missing required property 'folder'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["disabled"] = args ? args.disabled : undefined;
            resourceInputs["filter"] = args ? args.filter : undefined;
            resourceInputs["folder"] = args ? args.folder : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(FolderExclusion.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering FolderExclusion resources.
 */
export interface FolderExclusionState {
    /**
     * A human-readable description.
     */
    description?: pulumi.Input<string>;
    /**
     * Whether this exclusion rule should be disabled or not. This defaults to
     * false.
     */
    disabled?: pulumi.Input<boolean>;
    /**
     * The filter to apply when excluding logs. Only log entries that match the filter are excluded.
     * See [Advanced Log Filters](https://cloud.google.com/logging/docs/view/advanced-filters) for information on how to
     * write a filter.
     */
    filter?: pulumi.Input<string>;
    /**
     * The folder to be exported to the sink. Note that either [FOLDER_ID] or "folders/[FOLDER_ID]" is
     * accepted.
     */
    folder?: pulumi.Input<string>;
    /**
     * The name of the logging exclusion.
     */
    name?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a FolderExclusion resource.
 */
export interface FolderExclusionArgs {
    /**
     * A human-readable description.
     */
    description?: pulumi.Input<string>;
    /**
     * Whether this exclusion rule should be disabled or not. This defaults to
     * false.
     */
    disabled?: pulumi.Input<boolean>;
    /**
     * The filter to apply when excluding logs. Only log entries that match the filter are excluded.
     * See [Advanced Log Filters](https://cloud.google.com/logging/docs/view/advanced-filters) for information on how to
     * write a filter.
     */
    filter: pulumi.Input<string>;
    /**
     * The folder to be exported to the sink. Note that either [FOLDER_ID] or "folders/[FOLDER_ID]" is
     * accepted.
     */
    folder: pulumi.Input<string>;
    /**
     * The name of the logging exclusion.
     */
    name?: pulumi.Input<string>;
}
