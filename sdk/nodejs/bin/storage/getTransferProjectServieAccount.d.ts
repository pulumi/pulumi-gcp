import * as pulumi from "@pulumi/pulumi";
/**
 * Use this data source to retrieve Storage Transfer service account for this project
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const defaultTransferProjectServieAccount = pulumi.output(gcp.storage.getTransferProjectServieAccount({}));
 *
 * export const defaultAccount = defaultTransferProjectServieAccount.apply(defaultTransferProjectServieAccount => defaultTransferProjectServieAccount.email);
 * ```
 */
export declare function getTransferProjectServieAccount(args?: GetTransferProjectServieAccountArgs, opts?: pulumi.InvokeOptions): Promise<GetTransferProjectServieAccountResult>;
/**
 * A collection of arguments for invoking getTransferProjectServieAccount.
 */
export interface GetTransferProjectServieAccountArgs {
    /**
     * The project ID. If it is not provided, the provider project is used.
     */
    readonly project?: string;
}
/**
 * A collection of values returned by getTransferProjectServieAccount.
 */
export interface GetTransferProjectServieAccountResult {
    /**
     * Email address of the default service account used by Storage Transfer Jobs running in this project
     */
    readonly email: string;
    readonly project: string;
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
