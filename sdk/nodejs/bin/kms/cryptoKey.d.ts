import * as pulumi from "@pulumi/pulumi";
/**
 * Allows creation of a Google Cloud Platform KMS CryptoKey. For more information see
 * [the official documentation](https://cloud.google.com/kms/docs/object-hierarchy#key)
 * and
 * [API](https://cloud.google.com/kms/docs/reference/rest/v1/projects.locations.keyRings.cryptoKeys).
 *
 * A CryptoKey is an interface to key material which can be used to encrypt and decrypt data. A CryptoKey belongs to a
 * Google Cloud KMS KeyRing.
 *
 * > Note: CryptoKeys cannot be deleted from Google Cloud Platform. Destroying a
 * Terraform-managed CryptoKey will remove it from state and delete all
 * CryptoKeyVersions, rendering the key unusable, but **will not delete the
 * resource on the server**. When Terraform destroys these keys, any data
 * previously encrypted with these keys will be irrecoverable. For this reason, it
 * is strongly recommended that you add lifecycle hooks to the resource to prevent
 * accidental destruction.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const myKeyRing = new gcp.kms.KeyRing("my_key_ring", {
 *     location: "us-central1",
 *     project: "my-project",
 * });
 * const myCryptoKey = new gcp.kms.CryptoKey("my_crypto_key", {
 *     keyRing: myKeyRing.selfLink,
 *     rotationPeriod: "100000s",
 * });
 * ```
 */
export declare class CryptoKey extends pulumi.CustomResource {
    /**
     * Get an existing CryptoKey resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CryptoKeyState, opts?: pulumi.CustomResourceOptions): CryptoKey;
    /**
     * The id of the Google Cloud Platform KeyRing to which the key shall belong.
     */
    readonly keyRing: pulumi.Output<string>;
    /**
     * The CryptoKey's name.
     * A CryptoKey’s name must be unique within a location and match the regular expression `[a-zA-Z0-9_-]{1,63}`
     */
    readonly name: pulumi.Output<string>;
    /**
     * Every time this period passes, generate a new CryptoKeyVersion and set it as
     * the primary. The first rotation will take place after the specified period. The rotation period has the format
     * of a decimal number with up to 9 fractional digits, followed by the letter s (seconds). It must be greater than
     * a day (ie, 86400).
     */
    readonly rotationPeriod: pulumi.Output<string | undefined>;
    /**
     * The self link of the created CryptoKey. Its format is `projects/{projectId}/locations/{location}/keyRings/{keyRingName}/cryptoKeys/{cryptoKeyName}`.
     */
    readonly selfLink: pulumi.Output<string>;
    /**
     * A template describing settings for new crypto key versions. Structure is documented below.
     */
    readonly versionTemplate: pulumi.Output<{
        algorithm: string;
        protectionLevel?: string;
    }>;
    /**
     * Create a CryptoKey resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: CryptoKeyArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering CryptoKey resources.
 */
export interface CryptoKeyState {
    /**
     * The id of the Google Cloud Platform KeyRing to which the key shall belong.
     */
    readonly keyRing?: pulumi.Input<string>;
    /**
     * The CryptoKey's name.
     * A CryptoKey’s name must be unique within a location and match the regular expression `[a-zA-Z0-9_-]{1,63}`
     */
    readonly name?: pulumi.Input<string>;
    /**
     * Every time this period passes, generate a new CryptoKeyVersion and set it as
     * the primary. The first rotation will take place after the specified period. The rotation period has the format
     * of a decimal number with up to 9 fractional digits, followed by the letter s (seconds). It must be greater than
     * a day (ie, 86400).
     */
    readonly rotationPeriod?: pulumi.Input<string>;
    /**
     * The self link of the created CryptoKey. Its format is `projects/{projectId}/locations/{location}/keyRings/{keyRingName}/cryptoKeys/{cryptoKeyName}`.
     */
    readonly selfLink?: pulumi.Input<string>;
    /**
     * A template describing settings for new crypto key versions. Structure is documented below.
     */
    readonly versionTemplate?: pulumi.Input<{
        algorithm: pulumi.Input<string>;
        protectionLevel?: pulumi.Input<string>;
    }>;
}
/**
 * The set of arguments for constructing a CryptoKey resource.
 */
export interface CryptoKeyArgs {
    /**
     * The id of the Google Cloud Platform KeyRing to which the key shall belong.
     */
    readonly keyRing: pulumi.Input<string>;
    /**
     * The CryptoKey's name.
     * A CryptoKey’s name must be unique within a location and match the regular expression `[a-zA-Z0-9_-]{1,63}`
     */
    readonly name?: pulumi.Input<string>;
    /**
     * Every time this period passes, generate a new CryptoKeyVersion and set it as
     * the primary. The first rotation will take place after the specified period. The rotation period has the format
     * of a decimal number with up to 9 fractional digits, followed by the letter s (seconds). It must be greater than
     * a day (ie, 86400).
     */
    readonly rotationPeriod?: pulumi.Input<string>;
    /**
     * A template describing settings for new crypto key versions. Structure is documented below.
     */
    readonly versionTemplate?: pulumi.Input<{
        algorithm: pulumi.Input<string>;
        protectionLevel?: pulumi.Input<string>;
    }>;
}
