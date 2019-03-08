import * as pulumi from "@pulumi/pulumi";
/**
 * Allows creation and management of a single member for a single binding within
 * the IAM policy for an existing Google Cloud Platform Billing Account.
 *
 * > **Note:** This resource __must not__ be used in conjunction with
 *    `google_billing_account_iam_binding` for the __same role__ or they will fight over
 *    what your policy should be.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const binding = new gcp.billing.AccountIamMember("binding", {
 *     billingAccountId: "00AA00-000AAA-00AA0A",
 *     member: "user:alice@gmail.com",
 *     role: "roles/billing.viewer",
 * });
 * ```
 */
export declare class AccountIamMember extends pulumi.CustomResource {
    /**
     * Get an existing AccountIamMember resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AccountIamMemberState, opts?: pulumi.CustomResourceOptions): AccountIamMember;
    /**
     * The billing account id.
     */
    readonly billingAccountId: pulumi.Output<string>;
    /**
     * (Computed) The etag of the billing account's IAM policy.
     */
    readonly etag: pulumi.Output<string>;
    /**
     * The user that the role should apply to. For more details on format and restrictions see https://cloud.google.com/billing/reference/rest/v1/Policy#Binding
     */
    readonly member: pulumi.Output<string>;
    /**
     * The role that should be applied.
     */
    readonly role: pulumi.Output<string>;
    /**
     * Create a AccountIamMember resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AccountIamMemberArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering AccountIamMember resources.
 */
export interface AccountIamMemberState {
    /**
     * The billing account id.
     */
    readonly billingAccountId?: pulumi.Input<string>;
    /**
     * (Computed) The etag of the billing account's IAM policy.
     */
    readonly etag?: pulumi.Input<string>;
    /**
     * The user that the role should apply to. For more details on format and restrictions see https://cloud.google.com/billing/reference/rest/v1/Policy#Binding
     */
    readonly member?: pulumi.Input<string>;
    /**
     * The role that should be applied.
     */
    readonly role?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a AccountIamMember resource.
 */
export interface AccountIamMemberArgs {
    /**
     * The billing account id.
     */
    readonly billingAccountId: pulumi.Input<string>;
    /**
     * The user that the role should apply to. For more details on format and restrictions see https://cloud.google.com/billing/reference/rest/v1/Policy#Binding
     */
    readonly member: pulumi.Input<string>;
    /**
     * The role that should be applied.
     */
    readonly role: pulumi.Input<string>;
}
