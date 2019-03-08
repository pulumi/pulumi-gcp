import * as pulumi from "@pulumi/pulumi";
/**
 * Allows creation and management of a single binding within IAM policy for
 * an existing Google Cloud Platform Organization.
 *
 * > **Note:** This resource __must not__ be used in conjunction with
 *    `google_organization_iam_member` for the __same role__ or they will fight over
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
 * const binding = new gcp.organizations.IAMBinding("binding", {
 *     members: ["user:alice@gmail.com"],
 *     orgId: "123456789",
 *     role: "roles/browser",
 * });
 * ```
 */
export declare class IAMBinding extends pulumi.CustomResource {
    /**
     * Get an existing IAMBinding resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: IAMBindingState, opts?: pulumi.CustomResourceOptions): IAMBinding;
    /**
     * (Computed) The etag of the organization's IAM policy.
     */
    readonly etag: pulumi.Output<string>;
    /**
     * A list of users that the role should apply to. For more details on format and restrictions see https://cloud.google.com/billing/reference/rest/v1/Policy#Binding
     */
    readonly members: pulumi.Output<string[]>;
    /**
     * The numeric ID of the organization in which you want to create a custom role.
     */
    readonly orgId: pulumi.Output<string>;
    /**
     * The role that should be applied. Only one
     * `google_organization_iam_binding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     */
    readonly role: pulumi.Output<string>;
    /**
     * Create a IAMBinding resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: IAMBindingArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering IAMBinding resources.
 */
export interface IAMBindingState {
    /**
     * (Computed) The etag of the organization's IAM policy.
     */
    readonly etag?: pulumi.Input<string>;
    /**
     * A list of users that the role should apply to. For more details on format and restrictions see https://cloud.google.com/billing/reference/rest/v1/Policy#Binding
     */
    readonly members?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The numeric ID of the organization in which you want to create a custom role.
     */
    readonly orgId?: pulumi.Input<string>;
    /**
     * The role that should be applied. Only one
     * `google_organization_iam_binding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     */
    readonly role?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a IAMBinding resource.
 */
export interface IAMBindingArgs {
    /**
     * A list of users that the role should apply to. For more details on format and restrictions see https://cloud.google.com/billing/reference/rest/v1/Policy#Binding
     */
    readonly members: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The numeric ID of the organization in which you want to create a custom role.
     */
    readonly orgId: pulumi.Input<string>;
    /**
     * The role that should be applied. Only one
     * `google_organization_iam_binding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     */
    readonly role: pulumi.Input<string>;
}
