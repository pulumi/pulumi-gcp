// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Encrypts secret data with Google Cloud KMS and provides access to the ciphertext.
 *
 * > **NOTE:** Using this resource will allow you to conceal secret data within your
 * resource definitions, but it does not take care of protecting that data in the
 * logging output, plan output, or state output.  Please take care to secure your secret
 * data outside of resource definitions.
 *
 * To get more information about SecretCiphertext, see:
 *
 * * [API documentation](https://cloud.google.com/kms/docs/reference/rest/v1/projects.locations.keyRings.cryptoKeys/encrypt)
 * * How-to Guides
 *     * [Encrypting and decrypting data with a symmetric key](https://cloud.google.com/kms/docs/encrypt-decrypt)
 *
 * ## Example Usage
 *
 * ### Kms Secret Ciphertext Basic
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const keyring = new gcp.kms.KeyRing("keyring", {
 *     name: "keyring-example",
 *     location: "global",
 * });
 * const cryptokey = new gcp.kms.CryptoKey("cryptokey", {
 *     name: "crypto-key-example",
 *     keyRing: keyring.id,
 *     rotationPeriod: "7776000s",
 * });
 * const myPassword = new gcp.kms.SecretCiphertext("my_password", {
 *     cryptoKey: cryptokey.id,
 *     plaintext: "my-secret-password",
 * });
 * const instance = new gcp.compute.Instance("instance", {
 *     networkInterfaces: [{
 *         accessConfigs: [{}],
 *         network: "default",
 *     }],
 *     name: "my-instance",
 *     machineType: "e2-medium",
 *     zone: "us-central1-a",
 *     bootDisk: {
 *         initializeParams: {
 *             image: "debian-cloud/debian-11",
 *         },
 *     },
 *     metadata: {
 *         password: myPassword.ciphertext,
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * This resource does not support import.
 */
export class SecretCiphertext extends pulumi.CustomResource {
    /**
     * Get an existing SecretCiphertext resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SecretCiphertextState, opts?: pulumi.CustomResourceOptions): SecretCiphertext {
        return new SecretCiphertext(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:kms/secretCiphertext:SecretCiphertext';

    /**
     * Returns true if the given object is an instance of SecretCiphertext.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SecretCiphertext {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SecretCiphertext.__pulumiType;
    }

    /**
     * The additional authenticated data used for integrity checks during encryption and decryption.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     */
    public readonly additionalAuthenticatedData!: pulumi.Output<string | undefined>;
    /**
     * Contains the result of encrypting the provided plaintext, encoded in base64.
     */
    public /*out*/ readonly ciphertext!: pulumi.Output<string>;
    /**
     * The full name of the CryptoKey that will be used to encrypt the provided plaintext.
     * Format: `'projects/{{project}}/locations/{{location}}/keyRings/{{keyRing}}/cryptoKeys/{{cryptoKey}}'`
     */
    public readonly cryptoKey!: pulumi.Output<string>;
    /**
     * The plaintext to be encrypted.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     */
    public readonly plaintext!: pulumi.Output<string>;

    /**
     * Create a SecretCiphertext resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SecretCiphertextArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SecretCiphertextArgs | SecretCiphertextState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SecretCiphertextState | undefined;
            resourceInputs["additionalAuthenticatedData"] = state ? state.additionalAuthenticatedData : undefined;
            resourceInputs["ciphertext"] = state ? state.ciphertext : undefined;
            resourceInputs["cryptoKey"] = state ? state.cryptoKey : undefined;
            resourceInputs["plaintext"] = state ? state.plaintext : undefined;
        } else {
            const args = argsOrState as SecretCiphertextArgs | undefined;
            if ((!args || args.cryptoKey === undefined) && !opts.urn) {
                throw new Error("Missing required property 'cryptoKey'");
            }
            if ((!args || args.plaintext === undefined) && !opts.urn) {
                throw new Error("Missing required property 'plaintext'");
            }
            resourceInputs["additionalAuthenticatedData"] = args?.additionalAuthenticatedData ? pulumi.secret(args.additionalAuthenticatedData) : undefined;
            resourceInputs["cryptoKey"] = args ? args.cryptoKey : undefined;
            resourceInputs["plaintext"] = args?.plaintext ? pulumi.secret(args.plaintext) : undefined;
            resourceInputs["ciphertext"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["additionalAuthenticatedData", "plaintext"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(SecretCiphertext.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SecretCiphertext resources.
 */
export interface SecretCiphertextState {
    /**
     * The additional authenticated data used for integrity checks during encryption and decryption.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     */
    additionalAuthenticatedData?: pulumi.Input<string>;
    /**
     * Contains the result of encrypting the provided plaintext, encoded in base64.
     */
    ciphertext?: pulumi.Input<string>;
    /**
     * The full name of the CryptoKey that will be used to encrypt the provided plaintext.
     * Format: `'projects/{{project}}/locations/{{location}}/keyRings/{{keyRing}}/cryptoKeys/{{cryptoKey}}'`
     */
    cryptoKey?: pulumi.Input<string>;
    /**
     * The plaintext to be encrypted.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     */
    plaintext?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a SecretCiphertext resource.
 */
export interface SecretCiphertextArgs {
    /**
     * The additional authenticated data used for integrity checks during encryption and decryption.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     */
    additionalAuthenticatedData?: pulumi.Input<string>;
    /**
     * The full name of the CryptoKey that will be used to encrypt the provided plaintext.
     * Format: `'projects/{{project}}/locations/{{location}}/keyRings/{{keyRing}}/cryptoKeys/{{cryptoKey}}'`
     */
    cryptoKey: pulumi.Input<string>;
    /**
     * The plaintext to be encrypted.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     */
    plaintext: pulumi.Input<string>;
}
