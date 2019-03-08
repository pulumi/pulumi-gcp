import * as pulumi from "@pulumi/pulumi";
/**
 * Allows management of the entire IAM policy for an existing Google Cloud Platform Billing Account.
 *
 * > **Warning:** Billing accounts have a default user that can be **overwritten**
 * by use of this resource. The safest alternative is to use multiple `google_billing_account_iam_binding`
 *    resources. If you do use this resource, the best way to be sure that you are
 *    not making dangerous changes is to start by importing your existing policy,
 *    and examining the diff very closely.
 *
 * > **Note:** This resource __must not__ be used in conjunction with
 *    `google_billing_account_iam_member` or `google_billing_account_iam_binding`
 *    or they will fight over what your policy should be.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const admin = pulumi.output(gcp.organizations.getIAMPolicy({
 *     bindings: [{
 *         members: ["user:jane@example.com"],
 *         role: "roles/billing.viewer",
 *     }],
 * }));
 * const policy = new gcp.billing.AccountIamPolicy("policy", {
 *     billingAccountId: "00AA00-000AAA-00AA0A",
 *     policyData: admin.apply(admin => admin.policyData),
 * });
 * ```
 */
export declare class AccountIamPolicy extends pulumi.CustomResource {
    /**
     * Get an existing AccountIamPolicy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AccountIamPolicyState, opts?: pulumi.CustomResourceOptions): AccountIamPolicy;
    /**
     * The billing account id.
     */
    readonly billingAccountId: pulumi.Output<string>;
    readonly etag: pulumi.Output<string>;
    /**
     * The `google_iam_policy` data source that represents
     * the IAM policy that will be applied to the billing account. This policy overrides any existing
     * policy applied to the billing account.
     */
    readonly policyData: pulumi.Output<string>;
    /**
     * Create a AccountIamPolicy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AccountIamPolicyArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering AccountIamPolicy resources.
 */
export interface AccountIamPolicyState {
    /**
     * The billing account id.
     */
    readonly billingAccountId?: pulumi.Input<string>;
    readonly etag?: pulumi.Input<string>;
    /**
     * The `google_iam_policy` data source that represents
     * the IAM policy that will be applied to the billing account. This policy overrides any existing
     * policy applied to the billing account.
     */
    readonly policyData?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a AccountIamPolicy resource.
 */
export interface AccountIamPolicyArgs {
    /**
     * The billing account id.
     */
    readonly billingAccountId: pulumi.Input<string>;
    /**
     * The `google_iam_policy` data source that represents
     * the IAM policy that will be applied to the billing account. This policy overrides any existing
     * policy applied to the billing account.
     */
    readonly policyData: pulumi.Input<string>;
}
