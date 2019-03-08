import * as pulumi from "@pulumi/pulumi";
/**
 * Manages a folder-level logging exclusion. For more information see
 * [the official documentation](https://cloud.google.com/logging/docs/) and
 * [Excluding Logs](https://cloud.google.com/logging/docs/exclusions).
 *
 * Note that you must have the "Logs Configuration Writer" IAM role (`roles/logging.configWriter`)
 * granted to the credentials used with Terraform.
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
 *     description: "Exclude GCE instance debug logs",
 *     // Exclude all DEBUG or lower severity messages relating to instances
 *     filter: "resource.type = gce_instance AND severity <= DEBUG",
 *     folder: my_folder.name,
 * });
 * ```
 */
export declare class FolderExclusion extends pulumi.CustomResource {
    /**
     * Get an existing FolderExclusion resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: FolderExclusionState, opts?: pulumi.CustomResourceOptions): FolderExclusion;
    /**
     * A human-readable description.
     */
    readonly description: pulumi.Output<string | undefined>;
    /**
     * Whether this exclusion rule should be disabled or not. This defaults to
     * false.
     */
    readonly disabled: pulumi.Output<boolean | undefined>;
    /**
     * The filter to apply when excluding logs. Only log entries that match the filter are excluded.
     * See [Advanced Log Filters](https://cloud.google.com/logging/docs/view/advanced-filters) for information on how to
     * write a filter.
     */
    readonly filter: pulumi.Output<string>;
    /**
     * The folder to be exported to the sink. Note that either [FOLDER_ID] or "folders/[FOLDER_ID]" is
     * accepted.
     */
    readonly folder: pulumi.Output<string>;
    /**
     * The name of the logging exclusion.
     */
    readonly name: pulumi.Output<string>;
    /**
     * Create a FolderExclusion resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: FolderExclusionArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering FolderExclusion resources.
 */
export interface FolderExclusionState {
    /**
     * A human-readable description.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * Whether this exclusion rule should be disabled or not. This defaults to
     * false.
     */
    readonly disabled?: pulumi.Input<boolean>;
    /**
     * The filter to apply when excluding logs. Only log entries that match the filter are excluded.
     * See [Advanced Log Filters](https://cloud.google.com/logging/docs/view/advanced-filters) for information on how to
     * write a filter.
     */
    readonly filter?: pulumi.Input<string>;
    /**
     * The folder to be exported to the sink. Note that either [FOLDER_ID] or "folders/[FOLDER_ID]" is
     * accepted.
     */
    readonly folder?: pulumi.Input<string>;
    /**
     * The name of the logging exclusion.
     */
    readonly name?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a FolderExclusion resource.
 */
export interface FolderExclusionArgs {
    /**
     * A human-readable description.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * Whether this exclusion rule should be disabled or not. This defaults to
     * false.
     */
    readonly disabled?: pulumi.Input<boolean>;
    /**
     * The filter to apply when excluding logs. Only log entries that match the filter are excluded.
     * See [Advanced Log Filters](https://cloud.google.com/logging/docs/view/advanced-filters) for information on how to
     * write a filter.
     */
    readonly filter: pulumi.Input<string>;
    /**
     * The folder to be exported to the sink. Note that either [FOLDER_ID] or "folders/[FOLDER_ID]" is
     * accepted.
     */
    readonly folder: pulumi.Input<string>;
    /**
     * The name of the logging exclusion.
     */
    readonly name?: pulumi.Input<string>;
}
