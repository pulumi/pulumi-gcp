// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 *
 * First, create a KMS KeyRing and CryptoKey using the resource definitions:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const myKeyRing = new gcp.kms.KeyRing("my_key_ring", {
 *     project: "my-project",
 *     name: "my-key-ring",
 *     location: "us-central1",
 * });
 * const myCryptoKeyCryptoKey = new gcp.kms.CryptoKey("my_crypto_key", {
 *     name: "my-crypto-key",
 *     keyRing: myKeyRing.id,
 *     purpose: "ASYMMETRIC_DECRYPT",
 *     versionTemplate: {
 *         algorithm: "RSA_DECRYPT_OAEP_4096_SHA256",
 *     },
 * });
 * const myCryptoKey = gcp.kms.getKMSCryptoKeyVersionOutput({
 *     cryptoKey: myCryptoKeyCryptoKey.id,
 * });
 * ```
 *
 * Next, use the [Cloud SDK](https://cloud.google.com/kms/docs/encrypt-decrypt-rsa#kms-encrypt-asymmetric-cli) to encrypt
 * some sensitive information:
 *
 * Finally, reference the encrypted ciphertext in your resource definitions:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 * import * as random from "@pulumi/random";
 *
 * const sqlUserPassword = gcp.kms.getKMSSecretAsymmetric({
 *     cryptoKeyVersion: myCryptoKey.id,
 *     crc32: "12c59e54",
 *     ciphertext: `    M7nUoba9EGVTu2LjNjBKGdGVBYjyS/i/AY+4yQMQF0Qf/RfUfX31Jw6+VO9OuThq
 *     ylu/7ihX9XD4bM7yYdXnMv9p1OHQUlorSBSbb/J6n1W9UJhcp6um8Tw8/Isx4f75
 *     4PskYS6f8Y2ItliGt1/A9iR5BTgGtJBwOxMlgoX2Ggq+Nh4E5SbdoaE5o6CO1nBx
 *     eIPsPEebQ6qC4JehQM3IGuV/lrm58+hZhaXAqNzX1cEYyAt5GYqJIVCiI585SUYs
 *     wRToGyTgaN+zthF0HP9IWlR4Am4LmJ/1OcePTnYw11CkU8wNRbDzVAzogwNH+rXr
 *     LTmf7hxVjBm6bBSVSNFcBKAXFlllubSfIeZ5hgzGqn54OmSf6odO12L5JxllddHc
 *     yAd54vWKs2kJtnsKV2V4ZdkI0w6y1TeI67baFZDNGo6qsCpFMPnvv7d46Pg2VOp1
 *     J6Ivner0NnNHE4MzNmpZRk8WXMwqq4P/gTiT7F/aCX6oFCUQ4AWPQhJYh2dkcOmL
 *     IP+47Veb10aFn61F1CJwpmOOiGNXKdDT1vK8CMnnwhm825K0q/q9Zqpzc1+1ae1z
 *     mSqol1zCoa88CuSN6nTLQlVnN/dzfrGbc0boJPaM0iGhHtSzHk4SWg84LhiJB1q9
 *     A9XFJmOVdkvRY9nnz/iVLAdd0Q3vFtLqCdUYsNN2yh4=
 * `,
 * });
 * const dbNameSuffix = new random.RandomId("db_name_suffix", {byteLength: 4});
 * const main = new gcp.sql.DatabaseInstance("main", {
 *     name: pulumi.interpolate`main-instance-${dbNameSuffix.hex}`,
 *     databaseVersion: "MYSQL_5_7",
 *     settings: {
 *         tier: "db-f1-micro",
 *     },
 * });
 * const users = new gcp.sql.User("users", {
 *     name: "me",
 *     instance: main.name,
 *     host: "me.com",
 *     password: sqlUserPasswordGoogleKmsSecret.plaintext,
 * });
 * ```
 *
 * This will result in a Cloud SQL user being created with password `my-secret-password`.
 */
export function getKMSSecretAsymmetric(args: GetKMSSecretAsymmetricArgs, opts?: pulumi.InvokeOptions): Promise<GetKMSSecretAsymmetricResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("gcp:kms/getKMSSecretAsymmetric:getKMSSecretAsymmetric", {
        "ciphertext": args.ciphertext,
        "crc32": args.crc32,
        "cryptoKeyVersion": args.cryptoKeyVersion,
    }, opts);
}

/**
 * A collection of arguments for invoking getKMSSecretAsymmetric.
 */
export interface GetKMSSecretAsymmetricArgs {
    /**
     * The ciphertext to be decrypted, encoded in base64
     */
    ciphertext: string;
    /**
     * The crc32 checksum of the `ciphertext` in hexadecimal notation. If not specified, it will be computed.
     */
    crc32?: string;
    /**
     * The id of the CryptoKey version that will be used to
     * decrypt the provided ciphertext. This is represented by the format
     * `projects/{project}/locations/{location}/keyRings/{keyring}/cryptoKeys/{key}/cryptoKeyVersions/{version}`.
     */
    cryptoKeyVersion: string;
}

/**
 * A collection of values returned by getKMSSecretAsymmetric.
 */
export interface GetKMSSecretAsymmetricResult {
    readonly ciphertext: string;
    /**
     * Contains the crc32 checksum of the provided ciphertext.
     */
    readonly crc32?: string;
    readonly cryptoKeyVersion: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Contains the result of decrypting the provided ciphertext.
     */
    readonly plaintext: string;
}
/**
 * ## Example Usage
 *
 * First, create a KMS KeyRing and CryptoKey using the resource definitions:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const myKeyRing = new gcp.kms.KeyRing("my_key_ring", {
 *     project: "my-project",
 *     name: "my-key-ring",
 *     location: "us-central1",
 * });
 * const myCryptoKeyCryptoKey = new gcp.kms.CryptoKey("my_crypto_key", {
 *     name: "my-crypto-key",
 *     keyRing: myKeyRing.id,
 *     purpose: "ASYMMETRIC_DECRYPT",
 *     versionTemplate: {
 *         algorithm: "RSA_DECRYPT_OAEP_4096_SHA256",
 *     },
 * });
 * const myCryptoKey = gcp.kms.getKMSCryptoKeyVersionOutput({
 *     cryptoKey: myCryptoKeyCryptoKey.id,
 * });
 * ```
 *
 * Next, use the [Cloud SDK](https://cloud.google.com/kms/docs/encrypt-decrypt-rsa#kms-encrypt-asymmetric-cli) to encrypt
 * some sensitive information:
 *
 * Finally, reference the encrypted ciphertext in your resource definitions:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 * import * as random from "@pulumi/random";
 *
 * const sqlUserPassword = gcp.kms.getKMSSecretAsymmetric({
 *     cryptoKeyVersion: myCryptoKey.id,
 *     crc32: "12c59e54",
 *     ciphertext: `    M7nUoba9EGVTu2LjNjBKGdGVBYjyS/i/AY+4yQMQF0Qf/RfUfX31Jw6+VO9OuThq
 *     ylu/7ihX9XD4bM7yYdXnMv9p1OHQUlorSBSbb/J6n1W9UJhcp6um8Tw8/Isx4f75
 *     4PskYS6f8Y2ItliGt1/A9iR5BTgGtJBwOxMlgoX2Ggq+Nh4E5SbdoaE5o6CO1nBx
 *     eIPsPEebQ6qC4JehQM3IGuV/lrm58+hZhaXAqNzX1cEYyAt5GYqJIVCiI585SUYs
 *     wRToGyTgaN+zthF0HP9IWlR4Am4LmJ/1OcePTnYw11CkU8wNRbDzVAzogwNH+rXr
 *     LTmf7hxVjBm6bBSVSNFcBKAXFlllubSfIeZ5hgzGqn54OmSf6odO12L5JxllddHc
 *     yAd54vWKs2kJtnsKV2V4ZdkI0w6y1TeI67baFZDNGo6qsCpFMPnvv7d46Pg2VOp1
 *     J6Ivner0NnNHE4MzNmpZRk8WXMwqq4P/gTiT7F/aCX6oFCUQ4AWPQhJYh2dkcOmL
 *     IP+47Veb10aFn61F1CJwpmOOiGNXKdDT1vK8CMnnwhm825K0q/q9Zqpzc1+1ae1z
 *     mSqol1zCoa88CuSN6nTLQlVnN/dzfrGbc0boJPaM0iGhHtSzHk4SWg84LhiJB1q9
 *     A9XFJmOVdkvRY9nnz/iVLAdd0Q3vFtLqCdUYsNN2yh4=
 * `,
 * });
 * const dbNameSuffix = new random.RandomId("db_name_suffix", {byteLength: 4});
 * const main = new gcp.sql.DatabaseInstance("main", {
 *     name: pulumi.interpolate`main-instance-${dbNameSuffix.hex}`,
 *     databaseVersion: "MYSQL_5_7",
 *     settings: {
 *         tier: "db-f1-micro",
 *     },
 * });
 * const users = new gcp.sql.User("users", {
 *     name: "me",
 *     instance: main.name,
 *     host: "me.com",
 *     password: sqlUserPasswordGoogleKmsSecret.plaintext,
 * });
 * ```
 *
 * This will result in a Cloud SQL user being created with password `my-secret-password`.
 */
export function getKMSSecretAsymmetricOutput(args: GetKMSSecretAsymmetricOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetKMSSecretAsymmetricResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("gcp:kms/getKMSSecretAsymmetric:getKMSSecretAsymmetric", {
        "ciphertext": args.ciphertext,
        "crc32": args.crc32,
        "cryptoKeyVersion": args.cryptoKeyVersion,
    }, opts);
}

/**
 * A collection of arguments for invoking getKMSSecretAsymmetric.
 */
export interface GetKMSSecretAsymmetricOutputArgs {
    /**
     * The ciphertext to be decrypted, encoded in base64
     */
    ciphertext: pulumi.Input<string>;
    /**
     * The crc32 checksum of the `ciphertext` in hexadecimal notation. If not specified, it will be computed.
     */
    crc32?: pulumi.Input<string>;
    /**
     * The id of the CryptoKey version that will be used to
     * decrypt the provided ciphertext. This is represented by the format
     * `projects/{project}/locations/{location}/keyRings/{keyring}/cryptoKeys/{key}/cryptoKeyVersions/{version}`.
     */
    cryptoKeyVersion: pulumi.Input<string>;
}
