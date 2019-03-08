import * as pulumi from "@pulumi/pulumi";
/**
 * Allows management of the entire IAM policy for an existing Google Cloud Platform Organization.
 *
 * > **Warning:** New organizations have several default policies which will,
 *    without extreme caution, be **overwritten** by use of this resource.
 *    The safest alternative is to use multiple `google_organization_iam_binding`
 *    resources.  It is easy to use this resource to remove your own access to
 *    an organization, which will require a call to Google Support to have
 *    fixed, and can take multiple days to resolve.  If you do use this resource,
 *    the best way to be sure that you are not making dangerous changes is to start
 *    by importing your existing policy, and examining the diff very closely.
 *
 * > **Note:** This resource __must not__ be used in conjunction with
 *    `google_organization_iam_member` or `google_organization_iam_binding`
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
 *         role: "roles/editor",
 *     }],
 * }));
 * const policy = new gcp.organizations.IAMPolicy("policy", {
 *     orgId: "123456789",
 *     policyData: admin.apply(admin => admin.policyData),
 * });
 * ```
 */
export declare class IAMPolicy extends pulumi.CustomResource {
    /**
     * Get an existing IAMPolicy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: IAMPolicyState, opts?: pulumi.CustomResourceOptions): IAMPolicy;
    readonly etag: pulumi.Output<string>;
    /**
     * The numeric ID of the organization in which you want to create a custom role.
     */
    readonly orgId: pulumi.Output<string>;
    /**
     * The `google_iam_policy` data source that represents
     * the IAM policy that will be applied to the organization. This policy overrides any existing
     * policy applied to the organization.
     */
    readonly policyData: pulumi.Output<string>;
    /**
     * Create a IAMPolicy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: IAMPolicyArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering IAMPolicy resources.
 */
export interface IAMPolicyState {
    readonly etag?: pulumi.Input<string>;
    /**
     * The numeric ID of the organization in which you want to create a custom role.
     */
    readonly orgId?: pulumi.Input<string>;
    /**
     * The `google_iam_policy` data source that represents
     * the IAM policy that will be applied to the organization. This policy overrides any existing
     * policy applied to the organization.
     */
    readonly policyData?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a IAMPolicy resource.
 */
export interface IAMPolicyArgs {
    /**
     * The numeric ID of the organization in which you want to create a custom role.
     */
    readonly orgId: pulumi.Input<string>;
    /**
     * The `google_iam_policy` data source that represents
     * the IAM policy that will be applied to the organization. This policy overrides any existing
     * policy applied to the organization.
     */
    readonly policyData: pulumi.Input<string>;
}
