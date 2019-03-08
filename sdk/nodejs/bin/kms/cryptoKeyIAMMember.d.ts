import * as pulumi from "@pulumi/pulumi";
/**
 * Allows creation and management of a single member for a single binding within
 * the IAM policy for an existing Google Cloud KMS crypto key.
 *
 * > **Note:** This resource _must not_ be used in conjunction with
 *    `google_kms_crypto_key_iam_policy` or they will fight over what your policy
 *    should be. Similarly, roles controlled by `google_kms_crypto_key_iam_binding`
 *    should not be assigned to using `google_kms_crypto_key_iam_member`.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const cryptoKey = new gcp.kms.CryptoKeyIAMMember("crypto_key", {
 *     cryptoKeyId: "your-crypto-key-id",
 *     member: "user:alice@gmail.com",
 *     role: "roles/editor",
 * });
 * ```
 */
export declare class CryptoKeyIAMMember extends pulumi.CustomResource {
    /**
     * Get an existing CryptoKeyIAMMember resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CryptoKeyIAMMemberState, opts?: pulumi.CustomResourceOptions): CryptoKeyIAMMember;
    /**
     * The key ring ID, in the form
     * `{project_id}/{location_name}/{key_ring_name}/{crypto_key_name}` or
     * `{location_name}/{key_ring_name}/{crypto_key_name}`. In the second form,
     * the provider's project setting will be used as a fallback.
     */
    readonly cryptoKeyId: pulumi.Output<string>;
    /**
     * (Computed) The etag of the project's IAM policy.
     */
    readonly etag: pulumi.Output<string>;
    /**
     * The user that the role should apply to. For more details on format and restrictions see https://cloud.google.com/billing/reference/rest/v1/Policy#Binding
     */
    readonly member: pulumi.Output<string>;
    /**
     * The role that should be applied. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     */
    readonly role: pulumi.Output<string>;
    /**
     * Create a CryptoKeyIAMMember resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: CryptoKeyIAMMemberArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering CryptoKeyIAMMember resources.
 */
export interface CryptoKeyIAMMemberState {
    /**
     * The key ring ID, in the form
     * `{project_id}/{location_name}/{key_ring_name}/{crypto_key_name}` or
     * `{location_name}/{key_ring_name}/{crypto_key_name}`. In the second form,
     * the provider's project setting will be used as a fallback.
     */
    readonly cryptoKeyId?: pulumi.Input<string>;
    /**
     * (Computed) The etag of the project's IAM policy.
     */
    readonly etag?: pulumi.Input<string>;
    /**
     * The user that the role should apply to. For more details on format and restrictions see https://cloud.google.com/billing/reference/rest/v1/Policy#Binding
     */
    readonly member?: pulumi.Input<string>;
    /**
     * The role that should be applied. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     */
    readonly role?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a CryptoKeyIAMMember resource.
 */
export interface CryptoKeyIAMMemberArgs {
    /**
     * The key ring ID, in the form
     * `{project_id}/{location_name}/{key_ring_name}/{crypto_key_name}` or
     * `{location_name}/{key_ring_name}/{crypto_key_name}`. In the second form,
     * the provider's project setting will be used as a fallback.
     */
    readonly cryptoKeyId: pulumi.Input<string>;
    /**
     * The user that the role should apply to. For more details on format and restrictions see https://cloud.google.com/billing/reference/rest/v1/Policy#Binding
     */
    readonly member: pulumi.Input<string>;
    /**
     * The role that should be applied. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     */
    readonly role: pulumi.Input<string>;
}
