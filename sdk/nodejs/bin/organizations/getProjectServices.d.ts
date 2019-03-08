import * as pulumi from "@pulumi/pulumi";
/**
 * Use this data source to get details on the enabled project services.
 *
 * For a list of services available, visit the
 * [API library page](https://console.cloud.google.com/apis/library) or run `gcloud services list`.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const project = pulumi.output(gcp.organizations.getProjectServices({
 *     project: "your-project-id",
 * }));
 *
 * export const projectServices = project.apply(project => project.services.join(","));
 * ```
 */
export declare function getProjectServices(args?: GetProjectServicesArgs, opts?: pulumi.InvokeOptions): Promise<GetProjectServicesResult>;
/**
 * A collection of arguments for invoking getProjectServices.
 */
export interface GetProjectServicesArgs {
    /**
     * The project ID.
     */
    readonly project?: string;
}
/**
 * A collection of values returned by getProjectServices.
 */
export interface GetProjectServicesResult {
    readonly disableOnDestroy: boolean;
    readonly services: string[];
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
