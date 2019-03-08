import * as pulumi from "@pulumi/pulumi";
/**
 * Use this data source to access the configuration of the Google Cloud provider.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const current = pulumi.output(gcp.organizations.getClientConfig({}));
 *
 * export const project = current.apply(current => current.project);
 * ```
 */
export declare function getClientConfig(opts?: pulumi.InvokeOptions): Promise<GetClientConfigResult>;
/**
 * A collection of values returned by getClientConfig.
 */
export interface GetClientConfigResult {
    /**
     * The OAuth2 access token used by the client to authenticate against the Google Cloud API.
     */
    readonly accessToken: string;
    /**
     * The ID of the project to apply any resources to.
     */
    readonly project: string;
    /**
     * The region to operate under.
     */
    readonly region: string;
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
