import * as pulumi from "@pulumi/pulumi";
/**
 * Three different resources help you manage your IAM policy for pubsub subscription. Each of these resources serves a different use case:
 *
 * * `google_pubsub_subscription_iam_policy`: Authoritative. Sets the IAM policy for the subscription and replaces any existing policy already attached.
 * * `google_pubsub_subscription_iam_binding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the subscription are preserved.
 * * `google_pubsub_subscription_iam_member`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the subscription are preserved.
 *
 * > **Note:** `google_pubsub_subscription_iam_policy` **cannot** be used in conjunction with `google_pubsub_subscription_iam_binding` and `google_pubsub_subscription_iam_member` or they will fight over what your policy should be.
 *
 * > **Note:** `google_pubsub_subscription_iam_binding` resources **can be** used in conjunction with `google_pubsub_subscription_iam_member` resources **only if** they do not grant privilege to the same role.
 *
 * ## google\_pubsub\_subscription\_iam\_policy
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
 * const editor = new gcp.pubsub.SubscriptionIAMPolicy("editor", {
 *     policyData: admin.apply(admin => admin.policyData),
 *     subscription: "your-subscription-name",
 * });
 * ```
 *
 * ## google\_pubsub\_subscription\_iam\_binding
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const editor = new gcp.pubsub.SubscriptionIAMBinding("editor", {
 *     members: ["user:jane@example.com"],
 *     role: "roles/editor",
 *     subscription: "your-subscription-name",
 * });
 * ```
 *
 * ## google\_pubsub\_subscription\_iam\_member
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const editor = new gcp.pubsub.SubscriptionIAMMember("editor", {
 *     member: "user:jane@example.com",
 *     role: "roles/editor",
 *     subscription: "your-subscription-name",
 * });
 * ```
 */
export declare class SubscriptionIAMBinding extends pulumi.CustomResource {
    /**
     * Get an existing SubscriptionIAMBinding resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SubscriptionIAMBindingState, opts?: pulumi.CustomResourceOptions): SubscriptionIAMBinding;
    /**
     * (Computed) The etag of the subscription's IAM policy.
     */
    readonly etag: pulumi.Output<string>;
    readonly members: pulumi.Output<string[]>;
    /**
     * The project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    readonly project: pulumi.Output<string>;
    /**
     * The role that should be applied. Only one
     * `google_pubsub_subscription_iam_binding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     */
    readonly role: pulumi.Output<string>;
    /**
     * The subscription name or id to bind to attach IAM policy to.
     */
    readonly subscription: pulumi.Output<string>;
    /**
     * Create a SubscriptionIAMBinding resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SubscriptionIAMBindingArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering SubscriptionIAMBinding resources.
 */
export interface SubscriptionIAMBindingState {
    /**
     * (Computed) The etag of the subscription's IAM policy.
     */
    readonly etag?: pulumi.Input<string>;
    readonly members?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    /**
     * The role that should be applied. Only one
     * `google_pubsub_subscription_iam_binding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     */
    readonly role?: pulumi.Input<string>;
    /**
     * The subscription name or id to bind to attach IAM policy to.
     */
    readonly subscription?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a SubscriptionIAMBinding resource.
 */
export interface SubscriptionIAMBindingArgs {
    readonly members: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    /**
     * The role that should be applied. Only one
     * `google_pubsub_subscription_iam_binding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     */
    readonly role: pulumi.Input<string>;
    /**
     * The subscription name or id to bind to attach IAM policy to.
     */
    readonly subscription: pulumi.Input<string>;
}
