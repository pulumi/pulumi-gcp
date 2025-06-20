// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * A representation of an ExternalAccountKey used for external account binding within ACME.
 *
 * To get more information about ExternalAccountKey, see:
 *
 * * [API documentation](https://cloud.google.com/certificate-manager/docs/reference/public-ca/rest/v1/projects.locations.externalAccountKeys/create)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/certificate-manager/docs/public-ca)
 *     * [Request Certificate Using Public CA](https://cloud.google.com/certificate-manager/docs/public-ca-tutorial)
 *     * [Request EAB key ID and HMAC](https://cloud.google.com/certificate-manager/docs/public-ca-tutorial#request-key-hmac)
 *
 * > **Warning:** This resource is create-only and could not be read from the API.
 * On delete, the resource would be removed from the state.
 * You must use an EAB secret within 7 days of obtaining it.
 * The EAB secret is invalidated if you don't use it within 7 days.
 * The ACME account registered by using an EAB secret has no expiration.
 *
 * ## Example Usage
 *
 * ### Public Ca External Account Key
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const prod = new gcp.compute.CaExternalAccountKey("prod", {project: "my-project-name"});
 * ```
 *
 * ## Import
 *
 * This resource does not support import.
 */
export class CaExternalAccountKey extends pulumi.CustomResource {
    /**
     * Get an existing CaExternalAccountKey resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CaExternalAccountKeyState, opts?: pulumi.CustomResourceOptions): CaExternalAccountKey {
        return new CaExternalAccountKey(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:compute/caExternalAccountKey:CaExternalAccountKey';

    /**
     * Returns true if the given object is an instance of CaExternalAccountKey.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is CaExternalAccountKey {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === CaExternalAccountKey.__pulumiType;
    }

    /**
     * (Deprecated)
     * Base64-URL-encoded HS256 key. It is generated by the PublicCertificateAuthorityService
     * when the ExternalAccountKey is created.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     *
     * @deprecated `b64MacKey` is deprecated and will be removed in a future major release. Use `b64urlMacKey` instead.
     */
    public /*out*/ readonly b64MacKey!: pulumi.Output<string>;
    /**
     * Base64-URL-encoded HS256 key. It is generated by the PublicCertificateAuthorityService
     * when the ExternalAccountKey is created.'
     * **Note**: This property is sensitive and will not be displayed in the plan.
     */
    public /*out*/ readonly b64urlMacKey!: pulumi.Output<string>;
    /**
     * It is generated by the PublicCertificateAuthorityService when the ExternalAccountKey is created.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     */
    public /*out*/ readonly keyId!: pulumi.Output<string>;
    /**
     * Location for the externalAccountKey. Currently only `global` is supported.
     */
    public readonly location!: pulumi.Output<string | undefined>;
    /**
     * Resource name. projects/{project}/locations/{location}/externalAccountKeys/{keyId}.
     */
    public /*out*/ readonly name!: pulumi.Output<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    public readonly project!: pulumi.Output<string>;

    /**
     * Create a CaExternalAccountKey resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: CaExternalAccountKeyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CaExternalAccountKeyArgs | CaExternalAccountKeyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as CaExternalAccountKeyState | undefined;
            resourceInputs["b64MacKey"] = state ? state.b64MacKey : undefined;
            resourceInputs["b64urlMacKey"] = state ? state.b64urlMacKey : undefined;
            resourceInputs["keyId"] = state ? state.keyId : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["project"] = state ? state.project : undefined;
        } else {
            const args = argsOrState as CaExternalAccountKeyArgs | undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["b64MacKey"] = undefined /*out*/;
            resourceInputs["b64urlMacKey"] = undefined /*out*/;
            resourceInputs["keyId"] = undefined /*out*/;
            resourceInputs["name"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["b64MacKey", "b64urlMacKey", "keyId"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(CaExternalAccountKey.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering CaExternalAccountKey resources.
 */
export interface CaExternalAccountKeyState {
    /**
     * (Deprecated)
     * Base64-URL-encoded HS256 key. It is generated by the PublicCertificateAuthorityService
     * when the ExternalAccountKey is created.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     *
     * @deprecated `b64MacKey` is deprecated and will be removed in a future major release. Use `b64urlMacKey` instead.
     */
    b64MacKey?: pulumi.Input<string>;
    /**
     * Base64-URL-encoded HS256 key. It is generated by the PublicCertificateAuthorityService
     * when the ExternalAccountKey is created.'
     * **Note**: This property is sensitive and will not be displayed in the plan.
     */
    b64urlMacKey?: pulumi.Input<string>;
    /**
     * It is generated by the PublicCertificateAuthorityService when the ExternalAccountKey is created.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     */
    keyId?: pulumi.Input<string>;
    /**
     * Location for the externalAccountKey. Currently only `global` is supported.
     */
    location?: pulumi.Input<string>;
    /**
     * Resource name. projects/{project}/locations/{location}/externalAccountKeys/{keyId}.
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a CaExternalAccountKey resource.
 */
export interface CaExternalAccountKeyArgs {
    /**
     * Location for the externalAccountKey. Currently only `global` is supported.
     */
    location?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
}
