import * as pulumi from "@pulumi/pulumi";
/**
 * Get the service account from a project. For more information see
 * the official [API](https://cloud.google.com/compute/docs/access/service-accounts) documentation.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const objectViewer = pulumi.output(gcp.serviceAccount.getAccount({
 *     accountId: "object-viewer",
 * }));
 * ```
 */
export declare function getAccount(args: GetAccountArgs, opts?: pulumi.InvokeOptions): Promise<GetAccountResult>;
/**
 * A collection of arguments for invoking getAccount.
 */
export interface GetAccountArgs {
    /**
     * The Service account id.
     */
    readonly accountId: string;
    /**
     * The ID of the project that the service account will be created in.
     * Defaults to the provider project configuration.
     */
    readonly project?: string;
}
/**
 * A collection of values returned by getAccount.
 */
export interface GetAccountResult {
    /**
     * The display name for the service account.
     */
    readonly displayName: string;
    /**
     * The e-mail address of the service account. This value
     * should be referenced from any `google_iam_policy` data sources
     * that would grant the service account privileges.
     */
    readonly email: string;
    /**
     * The fully-qualified name of the service account.
     */
    readonly name: string;
    /**
     * The unique id of the service account.
     */
    readonly uniqueId: string;
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
