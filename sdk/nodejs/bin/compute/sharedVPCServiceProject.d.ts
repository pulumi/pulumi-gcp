import * as pulumi from "@pulumi/pulumi";
/**
 * Enables the Google Compute Engine
 * [Shared VPC](https://cloud.google.com/compute/docs/shared-vpc)
 * feature for a project, assigning it as a Shared VPC service project associated
 * with a given host project.
 *
 * For more information, see,
 * [the Project API documentation](https://cloud.google.com/compute/docs/reference/latest/projects),
 * where the Shared VPC feature is referred to by its former name "XPN".
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const service1 = new gcp.compute.SharedVPCServiceProject("service1", {
 *     hostProject: "host-project-id",
 *     serviceProject: "service-project-id-1",
 * });
 * ```
 *
 * For a complete Shared VPC example with both host and service projects, see
 * [`google_compute_shared_vpc_host_project`](https://www.terraform.io/docs/providers/google/r/compute_shared_vpc_host_project.html).
 */
export declare class SharedVPCServiceProject extends pulumi.CustomResource {
    /**
     * Get an existing SharedVPCServiceProject resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SharedVPCServiceProjectState, opts?: pulumi.CustomResourceOptions): SharedVPCServiceProject;
    /**
     * The ID of a host project to associate.
     */
    readonly hostProject: pulumi.Output<string>;
    /**
     * The ID of the project that will serve as a Shared VPC service project.
     */
    readonly serviceProject: pulumi.Output<string>;
    /**
     * Create a SharedVPCServiceProject resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SharedVPCServiceProjectArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering SharedVPCServiceProject resources.
 */
export interface SharedVPCServiceProjectState {
    /**
     * The ID of a host project to associate.
     */
    readonly hostProject?: pulumi.Input<string>;
    /**
     * The ID of the project that will serve as a Shared VPC service project.
     */
    readonly serviceProject?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a SharedVPCServiceProject resource.
 */
export interface SharedVPCServiceProjectArgs {
    /**
     * The ID of a host project to associate.
     */
    readonly hostProject: pulumi.Input<string>;
    /**
     * The ID of the project that will serve as a Shared VPC service project.
     */
    readonly serviceProject: pulumi.Input<string>;
}
