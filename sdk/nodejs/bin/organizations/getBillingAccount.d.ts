import * as pulumi from "@pulumi/pulumi";
/**
 * Use this data source to get information about a Google Billing Account.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const acct = pulumi.output(gcp.organizations.getBillingAccount({
 *     displayName: "My Billing Account",
 *     open: true,
 * }));
 * const myProject = new gcp.organizations.Project("my_project", {
 *     billingAccount: acct.apply(acct => acct.id),
 *     orgId: "1234567",
 *     projectId: "your-project-id",
 * });
 * ```
 */
export declare function getBillingAccount(args?: GetBillingAccountArgs, opts?: pulumi.InvokeOptions): Promise<GetBillingAccountResult>;
/**
 * A collection of arguments for invoking getBillingAccount.
 */
export interface GetBillingAccountArgs {
    /**
     * The name of the billing account in the form `{billing_account_id}` or `billingAccounts/{billing_account_id}`.
     */
    readonly billingAccount?: string;
    /**
     * The display name of the billing account.
     */
    readonly displayName?: string;
    /**
     * `true` if the billing account is open, `false` if the billing account is closed.
     */
    readonly open?: boolean;
}
/**
 * A collection of values returned by getBillingAccount.
 */
export interface GetBillingAccountResult {
    readonly displayName: string;
    /**
     * The resource name of the billing account in the form `billingAccounts/{billing_account_id}`.
     */
    readonly name: string;
    readonly open: boolean;
    /**
     * The IDs of any projects associated with the billing account.
     */
    readonly projectIds: string[];
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
