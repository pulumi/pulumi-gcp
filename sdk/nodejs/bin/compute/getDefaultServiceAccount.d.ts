import * as pulumi from "@pulumi/pulumi";
/**
 * Use this data source to retrieve default service account for this project
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const defaultDefaultServiceAccount = pulumi.output(gcp.compute.getDefaultServiceAccount({}));
 *
 * export const defaultAccount = defaultDefaultServiceAccount.apply(defaultDefaultServiceAccount => defaultDefaultServiceAccount.email);
 * ```
 */
export declare function getDefaultServiceAccount(args?: GetDefaultServiceAccountArgs, opts?: pulumi.InvokeOptions): Promise<GetDefaultServiceAccountResult>;
/**
 * A collection of arguments for invoking getDefaultServiceAccount.
 */
export interface GetDefaultServiceAccountArgs {
    /**
     * The project ID. If it is not provided, the provider project is used.
     */
    readonly project?: string;
}
/**
 * A collection of values returned by getDefaultServiceAccount.
 */
export interface GetDefaultServiceAccountResult {
    /**
     * The display name for the service account.
     */
    readonly displayName: string;
    /**
     * Email address of the default service account used by VMs running in this project
     */
    readonly email: string;
    /**
     * The fully-qualified name of the service account.
     */
    readonly name: string;
    readonly project: string;
    /**
     * The unique id of the service account.
     */
    readonly uniqueId: string;
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
