import * as pulumi from "@pulumi/pulumi";
/**
 * Allows creation and management of the IAM policy for an existing Google Cloud
 * Platform folder.
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
 * const department1 = new gcp.organizations.Folder("department1", {
 *     displayName: "Department 1",
 *     parent: "organizations/1234567",
 * });
 * const folderAdminPolicy = new gcp.folder.IAMPolicy("folder_admin_policy", {
 *     folder: department1.name,
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
    /**
     * (Computed) The etag of the folder's IAM policy. `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates of a policy from overwriting each other.
     */
    readonly etag: pulumi.Output<string>;
    /**
     * The resource name of the folder the policy is attached to. Its format is folders/{folder_id}.
     */
    readonly folder: pulumi.Output<string>;
    /**
     * The `google_iam_policy` data source that represents
     * the IAM policy that will be applied to the folder. This policy overrides any existing
     * policy applied to the folder.
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
    /**
     * (Computed) The etag of the folder's IAM policy. `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates of a policy from overwriting each other.
     */
    readonly etag?: pulumi.Input<string>;
    /**
     * The resource name of the folder the policy is attached to. Its format is folders/{folder_id}.
     */
    readonly folder?: pulumi.Input<string>;
    /**
     * The `google_iam_policy` data source that represents
     * the IAM policy that will be applied to the folder. This policy overrides any existing
     * policy applied to the folder.
     */
    readonly policyData?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a IAMPolicy resource.
 */
export interface IAMPolicyArgs {
    /**
     * The resource name of the folder the policy is attached to. Its format is folders/{folder_id}.
     */
    readonly folder: pulumi.Input<string>;
    /**
     * The `google_iam_policy` data source that represents
     * the IAM policy that will be applied to the folder. This policy overrides any existing
     * policy applied to the folder.
     */
    readonly policyData: pulumi.Input<string>;
}
