import * as pulumi from "@pulumi/pulumi";
/**
 * Use this data source to get project details.
 * For more information see
 * [API](https://cloud.google.com/resource-manager/reference/rest/v1/projects#Project)
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const project = pulumi.output(gcp.organizations.getProject({}));
 *
 * export const projectNumber = project.apply(project => project.number);
 * ```
 */
export declare function getProject(args?: GetProjectArgs, opts?: pulumi.InvokeOptions): Promise<GetProjectResult>;
/**
 * A collection of arguments for invoking getProject.
 */
export interface GetProjectArgs {
    /**
     * The project ID. If it is not provided, the provider project is used.
     */
    readonly projectId?: string;
}
/**
 * A collection of values returned by getProject.
 */
export interface GetProjectResult {
    readonly appEngines: {
        authDomain: string;
        codeBucket: string;
        defaultBucket: string;
        defaultHostname: string;
        featureSettings: {
            splitHealthChecks: boolean;
        }[];
        gcrDomain: string;
        locationId: string;
        name: string;
        servingStatus: string;
        urlDispatchRules: {
            domain: string;
            path: string;
            service: string;
        }[];
    }[];
    readonly autoCreateNetwork: boolean;
    readonly billingAccount: string;
    readonly folderId: string;
    readonly labels: {
        [key: string]: string;
    };
    readonly name: string;
    readonly number: string;
    readonly orgId: string;
    readonly policyData: string;
    readonly policyEtag: string;
    readonly skipDelete: boolean;
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
