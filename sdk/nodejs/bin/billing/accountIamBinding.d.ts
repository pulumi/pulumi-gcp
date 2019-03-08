import * as pulumi from "@pulumi/pulumi";
/**
 * Allows creation and management of a single binding within IAM policy for
 * an existing Google Cloud Platform Billing Account.
 *
 * > **Note:** This resource __must not__ be used in conjunction with
 *    `google_billing_account_iam_member` for the __same role__ or they will fight over
 *    what your policy should be.
 *
 * > **Note:** On create, this resource will overwrite members of any existing roles.
 *     Use `terraform import` and inspect the `terraform plan` output to ensure
 *     your existing members are preserved.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const binding = new gcp.billing.AccountIamBinding("binding", {
 *     billingAccountId: "00AA00-000AAA-00AA0A",
 *     members: ["user:alice@gmail.com"],
 *     role: "roles/billing.viewer",
 * });
 * ```
 */
export declare class AccountIamBinding extends pulumi.CustomResource {
    /**
     * Get an existing AccountIamBinding resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AccountIamBindingState, opts?: pulumi.CustomResourceOptions): AccountIamBinding;
    /**
     * The billing account id.
     */
    readonly billingAccountId: pulumi.Output<string>;
    /**
     * (Computed) The etag of the billing account's IAM policy.
     */
    readonly etag: pulumi.Output<string>;
    /**
     * A list of users that the role should apply to. For more details on format and restrictions see https://cloud.google.com/billing/reference/rest/v1/Policy#Binding
     */
    readonly members: pulumi.Output<string[]>;
    /**
     * The role that should be applied.
     */
    readonly role: pulumi.Output<string>;
    /**
     * Create a AccountIamBinding resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AccountIamBindingArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering AccountIamBinding resources.
 */
export interface AccountIamBindingState {
    /**
     * The billing account id.
     */
    readonly billingAccountId?: pulumi.Input<string>;
    /**
     * (Computed) The etag of the billing account's IAM policy.
     */
    readonly etag?: pulumi.Input<string>;
    /**
     * A list of users that the role should apply to. For more details on format and restrictions see https://cloud.google.com/billing/reference/rest/v1/Policy#Binding
     */
    readonly members?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The role that should be applied.
     */
    readonly role?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a AccountIamBinding resource.
 */
export interface AccountIamBindingArgs {
    /**
     * The billing account id.
     */
    readonly billingAccountId: pulumi.Input<string>;
    /**
     * A list of users that the role should apply to. For more details on format and restrictions see https://cloud.google.com/billing/reference/rest/v1/Policy#Binding
     */
    readonly members: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The role that should be applied.
     */
    readonly role: pulumi.Input<string>;
}
