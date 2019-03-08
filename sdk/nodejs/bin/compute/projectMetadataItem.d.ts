import * as pulumi from "@pulumi/pulumi";
/**
 * Manages a single key/value pair on metadata common to all instances for
 * a project in GCE. Using `google_compute_project_metadata_item` lets you
 * manage a single key/value setting in Terraform rather than the entire
 * project metadata map.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const defaultProjectMetadataItem = new gcp.compute.ProjectMetadataItem("default", {
 *     key: "my_metadata",
 *     value: "my_value",
 * });
 * ```
 */
export declare class ProjectMetadataItem extends pulumi.CustomResource {
    /**
     * Get an existing ProjectMetadataItem resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ProjectMetadataItemState, opts?: pulumi.CustomResourceOptions): ProjectMetadataItem;
    /**
     * The metadata key to set.
     */
    readonly key: pulumi.Output<string>;
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    readonly project: pulumi.Output<string>;
    /**
     * The value to set for the given metadata key.
     */
    readonly value: pulumi.Output<string>;
    /**
     * Create a ProjectMetadataItem resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ProjectMetadataItemArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering ProjectMetadataItem resources.
 */
export interface ProjectMetadataItemState {
    /**
     * The metadata key to set.
     */
    readonly key?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    /**
     * The value to set for the given metadata key.
     */
    readonly value?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a ProjectMetadataItem resource.
 */
export interface ProjectMetadataItemArgs {
    /**
     * The metadata key to set.
     */
    readonly key: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    /**
     * The value to set for the given metadata key.
     */
    readonly value: pulumi.Input<string>;
}
