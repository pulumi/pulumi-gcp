import * as pulumi from "@pulumi/pulumi";
/**
 * Allows management of enabled API services for an existing Google Cloud
 * Platform project. Services in an existing project that are not defined
 * in the config will be removed.
 *
 * For a list of services available, visit the
 * [API library page](https://console.cloud.google.com/apis/library) or run `gcloud services list`.
 *
 * > **Note:** This resource attempts to be the authoritative source on *all* enabled APIs, which often
 * 	leads to conflicts when certain actions enable other APIs. If you do not need to ensure that
 * 	*exclusively* a particular set of APIs are enabled, you should most likely use the
 * 	google_project_service resource, one resource per API.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const project = new gcp.projects.Services("project", {
 *     project: "your-project-id",
 *     services: [
 *         "iam.googleapis.com",
 *         "cloudresourcemanager.googleapis.com",
 *     ],
 * });
 * ```
 */
export declare class Services extends pulumi.CustomResource {
    /**
     * Get an existing Services resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ServicesState, opts?: pulumi.CustomResourceOptions): Services;
    readonly disableOnDestroy: pulumi.Output<boolean | undefined>;
    /**
     * The project ID.
     * Changing this forces Terraform to attempt to disable all previously managed
     * API services in the previous project.
     */
    readonly project: pulumi.Output<string>;
    /**
     * The list of services that are enabled. Supports
     * update.
     */
    readonly services: pulumi.Output<string[]>;
    /**
     * Create a Services resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ServicesArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering Services resources.
 */
export interface ServicesState {
    readonly disableOnDestroy?: pulumi.Input<boolean>;
    /**
     * The project ID.
     * Changing this forces Terraform to attempt to disable all previously managed
     * API services in the previous project.
     */
    readonly project?: pulumi.Input<string>;
    /**
     * The list of services that are enabled. Supports
     * update.
     */
    readonly services?: pulumi.Input<pulumi.Input<string>[]>;
}
/**
 * The set of arguments for constructing a Services resource.
 */
export interface ServicesArgs {
    readonly disableOnDestroy?: pulumi.Input<boolean>;
    /**
     * The project ID.
     * Changing this forces Terraform to attempt to disable all previously managed
     * API services in the previous project.
     */
    readonly project?: pulumi.Input<string>;
    /**
     * The list of services that are enabled. Supports
     * update.
     */
    readonly services: pulumi.Input<pulumi.Input<string>[]>;
}
