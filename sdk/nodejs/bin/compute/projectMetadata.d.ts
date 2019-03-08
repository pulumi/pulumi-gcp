import * as pulumi from "@pulumi/pulumi";
/**
 * Authoritatively manages metadata common to all instances for a project in GCE. For more information see
 * [the official documentation](https://cloud.google.com/compute/docs/storing-retrieving-metadata)
 * and
 * [API](https://cloud.google.com/compute/docs/reference/latest/projects/setCommonInstanceMetadata).
 *
 * > **Note:**  This resource manages all project-level metadata including project-level ssh keys.
 * Keys unset in config but set on the server will be removed. If you want to manage only single
 * key/value pairs within the project metadata rather than the entire set, then use
 * google_compute_project_metadata_item.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const defaultProjectMetadata = new gcp.compute.ProjectMetadata("default", {
 *     metadata: {
 *         "13": "42",
 *         fizz: "buzz",
 *         foo: "bar",
 *     },
 * });
 * ```
 */
export declare class ProjectMetadata extends pulumi.CustomResource {
    /**
     * Get an existing ProjectMetadata resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ProjectMetadataState, opts?: pulumi.CustomResourceOptions): ProjectMetadata;
    /**
     * A series of key value pairs.
     */
    readonly metadata: pulumi.Output<{
        [key: string]: string;
    }>;
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    readonly project: pulumi.Output<string>;
    /**
     * Create a ProjectMetadata resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ProjectMetadataArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering ProjectMetadata resources.
 */
export interface ProjectMetadataState {
    /**
     * A series of key value pairs.
     */
    readonly metadata?: pulumi.Input<{
        [key: string]: pulumi.Input<string>;
    }>;
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a ProjectMetadata resource.
 */
export interface ProjectMetadataArgs {
    /**
     * A series of key value pairs.
     */
    readonly metadata: pulumi.Input<{
        [key: string]: pulumi.Input<string>;
    }>;
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
}
