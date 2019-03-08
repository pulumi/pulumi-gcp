import * as pulumi from "@pulumi/pulumi";
/**
 * Allows creation and management of a single binding within IAM policy for
 * an existing Google Cloud KMS crypto key.
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
 * const cryptoKey = new gcp.kms.CryptoKeyIAMBinding("crypto_key", {
 *     cryptoKeyId: "my-gcp-project/us-central1/my-key-ring/my-crypto-key",
 *     members: ["user:alice@gmail.com"],
 *     role: "roles/editor",
 * });
 * ```
 */
export declare class CryptoKeyIAMBinding extends pulumi.CustomResource {
    /**
     * Get an existing CryptoKeyIAMBinding resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CryptoKeyIAMBindingState, opts?: pulumi.CustomResourceOptions): CryptoKeyIAMBinding;
    /**
     * The crypto key ID, in the form
     * `{project_id}/{location_name}/{key_ring_name}/{crypto_key_name}` or
     * `{location_name}/{key_ring_name}/{crypto_key_name}`.
     * In the second form, the provider's project setting will be used as a fallback.
     */
    readonly cryptoKeyId: pulumi.Output<string>;
    /**
     * (Computed) The etag of the crypto key's IAM policy.
     */
    readonly etag: pulumi.Output<string>;
    /**
     * A list of users that the role should apply to. For more details on format and restrictions see https://cloud.google.com/billing/reference/rest/v1/Policy#Binding
     */
    readonly members: pulumi.Output<string[]>;
    /**
     * The role that should be applied. Only one
     * `google_kms_crypto_key_iam_binding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     */
    readonly role: pulumi.Output<string>;
    /**
     * Create a CryptoKeyIAMBinding resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: CryptoKeyIAMBindingArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering CryptoKeyIAMBinding resources.
 */
export interface CryptoKeyIAMBindingState {
    /**
     * The crypto key ID, in the form
     * `{project_id}/{location_name}/{key_ring_name}/{crypto_key_name}` or
     * `{location_name}/{key_ring_name}/{crypto_key_name}`.
     * In the second form, the provider's project setting will be used as a fallback.
     */
    readonly cryptoKeyId?: pulumi.Input<string>;
    /**
     * (Computed) The etag of the crypto key's IAM policy.
     */
    readonly etag?: pulumi.Input<string>;
    /**
     * A list of users that the role should apply to. For more details on format and restrictions see https://cloud.google.com/billing/reference/rest/v1/Policy#Binding
     */
    readonly members?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The role that should be applied. Only one
     * `google_kms_crypto_key_iam_binding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     */
    readonly role?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a CryptoKeyIAMBinding resource.
 */
export interface CryptoKeyIAMBindingArgs {
    /**
     * The crypto key ID, in the form
     * `{project_id}/{location_name}/{key_ring_name}/{crypto_key_name}` or
     * `{location_name}/{key_ring_name}/{crypto_key_name}`.
     * In the second form, the provider's project setting will be used as a fallback.
     */
    readonly cryptoKeyId: pulumi.Input<string>;
    /**
     * A list of users that the role should apply to. For more details on format and restrictions see https://cloud.google.com/billing/reference/rest/v1/Policy#Binding
     */
    readonly members: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The role that should be applied. Only one
     * `google_kms_crypto_key_iam_binding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     */
    readonly role: pulumi.Input<string>;
}
