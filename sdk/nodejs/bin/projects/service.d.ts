import * as pulumi from "@pulumi/pulumi";
/**
 * Allows management of a single API service for an existing Google Cloud Platform project.
 *
 * For a list of services available, visit the
 * [API library page](https://console.cloud.google.com/apis/library) or run `gcloud services list`.
 *
 * > **Note:** This resource _must not_ be used in conjunction with
 *    `google_project_services` or they will fight over which services should be enabled.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const project = new gcp.projects.Service("project", {
 *     disableDependentServices: true,
 *     project: "your-project-id",
 *     service: "iam.googleapis.com",
 * });
 * ```
 */
export declare class Service extends pulumi.CustomResource {
    /**
     * Get an existing Service resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ServiceState, opts?: pulumi.CustomResourceOptions): Service;
    /**
     * If `true`, services that are enabled and which depend on this service should also be disabled when this service is destroyed.
     * If `false` or unset, an error will be generated if any enabled services depend on this service when destroying it.
     */
    readonly disableDependentServices: pulumi.Output<boolean | undefined>;
    /**
     * If true, disable the service when the terraform resource is destroyed.  Defaults to true.  May be useful in the event that a project is long-lived but the infrastructure running in that project changes frequently.
     */
    readonly disableOnDestroy: pulumi.Output<boolean | undefined>;
    /**
     * The project ID. If not provided, the provider project is used.
     */
    readonly project: pulumi.Output<string>;
    /**
     * The service to enable.
     */
    readonly service: pulumi.Output<string>;
    /**
     * Create a Service resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ServiceArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering Service resources.
 */
export interface ServiceState {
    /**
     * If `true`, services that are enabled and which depend on this service should also be disabled when this service is destroyed.
     * If `false` or unset, an error will be generated if any enabled services depend on this service when destroying it.
     */
    readonly disableDependentServices?: pulumi.Input<boolean>;
    /**
     * If true, disable the service when the terraform resource is destroyed.  Defaults to true.  May be useful in the event that a project is long-lived but the infrastructure running in that project changes frequently.
     */
    readonly disableOnDestroy?: pulumi.Input<boolean>;
    /**
     * The project ID. If not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    /**
     * The service to enable.
     */
    readonly service?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a Service resource.
 */
export interface ServiceArgs {
    /**
     * If `true`, services that are enabled and which depend on this service should also be disabled when this service is destroyed.
     * If `false` or unset, an error will be generated if any enabled services depend on this service when destroying it.
     */
    readonly disableDependentServices?: pulumi.Input<boolean>;
    /**
     * If true, disable the service when the terraform resource is destroyed.  Defaults to true.  May be useful in the event that a project is long-lived but the infrastructure running in that project changes frequently.
     */
    readonly disableOnDestroy?: pulumi.Input<boolean>;
    /**
     * The project ID. If not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    /**
     * The service to enable.
     */
    readonly service: pulumi.Input<string>;
}
