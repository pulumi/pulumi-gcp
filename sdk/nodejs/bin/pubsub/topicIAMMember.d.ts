import * as pulumi from "@pulumi/pulumi";
/**
 * Three different resources help you manage your IAM policy for pubsub topic. Each of these resources serves a different use case:
 *
 * * `google_pubsub_topic_iam_policy`: Authoritative. Sets the IAM policy for the topic and replaces any existing policy already attached.
 * * `google_pubsub_topic_iam_binding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the topic are preserved.
 * * `google_pubsub_topic_iam_member`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the topic are preserved.
 *
 * > **Note:** `google_pubsub_topic_iam_policy` **cannot** be used in conjunction with `google_pubsub_topic_iam_binding` and `google_pubsub_topic_iam_member` or they will fight over what your policy should be.
 *
 * > **Note:** `google_pubsub_topic_iam_binding` resources **can be** used in conjunction with `google_pubsub_topic_iam_member` resources **only if** they do not grant privilege to the same role.
 *
 * ## google\_pubsub\_topic\_iam\_policy
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
 * const editor = new gcp.pubsub.TopicIAMPolicy("editor", {
 *     policyData: admin.apply(admin => admin.policyData),
 *     topic: "your-topic-name",
 * });
 * ```
 *
 * ## google\_pubsub\_topic\_iam\_binding
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const editor = new gcp.pubsub.TopicIAMBinding("editor", {
 *     members: ["user:jane@example.com"],
 *     role: "roles/editor",
 *     topic: "your-topic-name",
 * });
 * ```
 *
 * ## google\_pubsub\_topic\_iam\_member
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const editor = new gcp.pubsub.TopicIAMMember("editor", {
 *     member: "user:jane@example.com",
 *     role: "roles/editor",
 *     topic: "your-topic-name",
 * });
 * ```
 */
export declare class TopicIAMMember extends pulumi.CustomResource {
    /**
     * Get an existing TopicIAMMember resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TopicIAMMemberState, opts?: pulumi.CustomResourceOptions): TopicIAMMember;
    /**
     * (Computed) The etag of the topic's IAM policy.
     */
    readonly etag: pulumi.Output<string>;
    readonly member: pulumi.Output<string>;
    /**
     * The project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    readonly project: pulumi.Output<string>;
    /**
     * The role that should be applied. Only one
     * `google_pubsub_topic_iam_binding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     */
    readonly role: pulumi.Output<string>;
    /**
     * The topic name or id to bind to attach IAM policy to.
     */
    readonly topic: pulumi.Output<string>;
    /**
     * Create a TopicIAMMember resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: TopicIAMMemberArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering TopicIAMMember resources.
 */
export interface TopicIAMMemberState {
    /**
     * (Computed) The etag of the topic's IAM policy.
     */
    readonly etag?: pulumi.Input<string>;
    readonly member?: pulumi.Input<string>;
    /**
     * The project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    /**
     * The role that should be applied. Only one
     * `google_pubsub_topic_iam_binding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     */
    readonly role?: pulumi.Input<string>;
    /**
     * The topic name or id to bind to attach IAM policy to.
     */
    readonly topic?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a TopicIAMMember resource.
 */
export interface TopicIAMMemberArgs {
    readonly member: pulumi.Input<string>;
    /**
     * The project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    /**
     * The role that should be applied. Only one
     * `google_pubsub_topic_iam_binding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     */
    readonly role: pulumi.Input<string>;
    /**
     * The topic name or id to bind to attach IAM policy to.
     */
    readonly topic: pulumi.Input<string>;
}
