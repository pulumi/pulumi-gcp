// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 * ### Iam Workforce Pool Provider Saml Basic
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const pool = new gcp.iam.WorkforcePool("pool", {
 *     workforcePoolId: "example-pool",
 *     parent: "organizations/123456789",
 *     location: "global",
 * }, {
 *     provider: google_beta,
 * });
 * const example = new gcp.iam.WorkforcePoolProvider("example", {
 *     workforcePoolId: pool.workforcePoolId,
 *     location: pool.location,
 *     providerId: "example-prvdr",
 *     attributeMapping: {
 *         "google.subject": "assertion.sub",
 *     },
 *     saml: {
 *         idpMetadataXml: "<?xml version=\"1.0\"?><md:EntityDescriptor xmlns:md=\"urn:oasis:names:tc:SAML:2.0:metadata\" entityID=\"https://test.com\"><md:IDPSSODescriptor protocolSupportEnumeration=\"urn:oasis:names:tc:SAML:2.0:protocol\"> <md:KeyDescriptor use=\"signing\"><ds:KeyInfo xmlns:ds=\"http://www.w3.org/2000/09/xmldsig#\"><ds:X509Data><ds:X509Certificate>MIIDpDCCAoygAwIBAgIGAX7/5qPhMA0GCSqGSIb3DQEBCwUAMIGSMQswCQYDVQQGEwJVUzETMBEGA1UECAwKQ2FsaWZvcm5pYTEWMBQGA1UEBwwNU2FuIEZyYW5jaXNjbzENMAsGA1UECgwET2t0YTEUMBIGA1UECwwLU1NPUHJvdmlkZXIxEzARBgNVBAMMCmRldi00NTg0MjExHDAaBgkqhkiG9w0BCQEWDWluZm9Ab2t0YS5jb20wHhcNMjIwMjE2MDAxOTEyWhcNMzIwMjE2MDAyMDEyWjCBkjELMAkGA1UEBhMCVVMxEzARBgNVBAgMCkNhbGlmb3JuaWExFjAUBgNVBAcMDVNhbiBGcmFuY2lzY28xDTALBgNVBAoMBE9rdGExFDASBgNVBAsMC1NTT1Byb3ZpZGVyMRMwEQYDVQQDDApkZXYtNDU4NDIxMRwwGgYJKoZIhvcNAQkBFg1pbmZvQG9rdGEuY29tMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxrBl7GKz52cRpxF9xCsirnRuMxnhFBaUrsHqAQrLqWmdlpNYZTVg+T9iQ+aq/iE68L+BRZcZniKIvW58wqqS0ltXVvIkXuDSvnvnkkI5yMIVErR20K8jSOKQm1FmK+fgAJ4koshFiu9oLiqu0Ejc0DuL3/XRsb4RuxjktKTb1khgBBtb+7idEk0sFR0RPefAweXImJkDHDm7SxjDwGJUubbqpdTxasPr0W+AHI1VUzsUsTiHAoyb0XDkYqHfDzhj/ZdIEl4zHQ3bEZvlD984ztAnmX2SuFLLKfXeAAGHei8MMixJvwxYkkPeYZ/5h8WgBZPP4heS2CPjwYExt29L8QIDAQABMA0GCSqGSIb3DQEBCwUAA4IBAQARjJFz++a9Z5IQGFzsZMrX2EDR5ML4xxUiQkbhld1S1PljOLcYFARDmUC2YYHOueU4ee8Jid9nPGEUebV/4Jok+b+oQh+dWMgiWjSLI7h5q4OYZ3VJtdlVwgMFt2iz+/4yBKMUZ50g3Qgg36vE34us+eKitg759JgCNsibxn0qtJgSPm0sgP2L6yTaLnoEUbXBRxCwynTSkp9ZijZqEzbhN0e2dWv7Rx/nfpohpDP6vEiFImKFHpDSv3M/5de1ytQzPFrZBYt9WlzlYwE1aD9FHCxdd+rWgYMVVoRaRmndpV/Rq3QUuDuFJtaoX11bC7ExkOpg9KstZzA63i3VcfYv</ds:X509Certificate></ds:X509Data></ds:KeyInfo></md:KeyDescriptor><md:SingleSignOnService Binding=\"urn:oasis:names:tc:SAML:2.0:bindings:HTTP-Redirect\" Location=\"https://test.com/sso\"/></md:IDPSSODescriptor></md:EntityDescriptor>",
 *     },
 * }, {
 *     provider: google_beta,
 * });
 * ```
 * ### Iam Workforce Pool Provider Saml Full
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const pool = new gcp.iam.WorkforcePool("pool", {
 *     workforcePoolId: "example-pool",
 *     parent: "organizations/123456789",
 *     location: "global",
 * }, {
 *     provider: google_beta,
 * });
 * const example = new gcp.iam.WorkforcePoolProvider("example", {
 *     workforcePoolId: pool.workforcePoolId,
 *     location: pool.location,
 *     providerId: "example-prvdr",
 *     attributeMapping: {
 *         "google.subject": "assertion.sub",
 *     },
 *     saml: {
 *         idpMetadataXml: "<?xml version=\"1.0\"?><md:EntityDescriptor xmlns:md=\"urn:oasis:names:tc:SAML:2.0:metadata\" entityID=\"https://test.com\"><md:IDPSSODescriptor protocolSupportEnumeration=\"urn:oasis:names:tc:SAML:2.0:protocol\"> <md:KeyDescriptor use=\"signing\"><ds:KeyInfo xmlns:ds=\"http://www.w3.org/2000/09/xmldsig#\"><ds:X509Data><ds:X509Certificate>MIIDpDCCAoygAwIBAgIGAX7/5qPhMA0GCSqGSIb3DQEBCwUAMIGSMQswCQYDVQQGEwJVUzETMBEGA1UECAwKQ2FsaWZvcm5pYTEWMBQGA1UEBwwNU2FuIEZyYW5jaXNjbzENMAsGA1UECgwET2t0YTEUMBIGA1UECwwLU1NPUHJvdmlkZXIxEzARBgNVBAMMCmRldi00NTg0MjExHDAaBgkqhkiG9w0BCQEWDWluZm9Ab2t0YS5jb20wHhcNMjIwMjE2MDAxOTEyWhcNMzIwMjE2MDAyMDEyWjCBkjELMAkGA1UEBhMCVVMxEzARBgNVBAgMCkNhbGlmb3JuaWExFjAUBgNVBAcMDVNhbiBGcmFuY2lzY28xDTALBgNVBAoMBE9rdGExFDASBgNVBAsMC1NTT1Byb3ZpZGVyMRMwEQYDVQQDDApkZXYtNDU4NDIxMRwwGgYJKoZIhvcNAQkBFg1pbmZvQG9rdGEuY29tMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxrBl7GKz52cRpxF9xCsirnRuMxnhFBaUrsHqAQrLqWmdlpNYZTVg+T9iQ+aq/iE68L+BRZcZniKIvW58wqqS0ltXVvIkXuDSvnvnkkI5yMIVErR20K8jSOKQm1FmK+fgAJ4koshFiu9oLiqu0Ejc0DuL3/XRsb4RuxjktKTb1khgBBtb+7idEk0sFR0RPefAweXImJkDHDm7SxjDwGJUubbqpdTxasPr0W+AHI1VUzsUsTiHAoyb0XDkYqHfDzhj/ZdIEl4zHQ3bEZvlD984ztAnmX2SuFLLKfXeAAGHei8MMixJvwxYkkPeYZ/5h8WgBZPP4heS2CPjwYExt29L8QIDAQABMA0GCSqGSIb3DQEBCwUAA4IBAQARjJFz++a9Z5IQGFzsZMrX2EDR5ML4xxUiQkbhld1S1PljOLcYFARDmUC2YYHOueU4ee8Jid9nPGEUebV/4Jok+b+oQh+dWMgiWjSLI7h5q4OYZ3VJtdlVwgMFt2iz+/4yBKMUZ50g3Qgg36vE34us+eKitg759JgCNsibxn0qtJgSPm0sgP2L6yTaLnoEUbXBRxCwynTSkp9ZijZqEzbhN0e2dWv7Rx/nfpohpDP6vEiFImKFHpDSv3M/5de1ytQzPFrZBYt9WlzlYwE1aD9FHCxdd+rWgYMVVoRaRmndpV/Rq3QUuDuFJtaoX11bC7ExkOpg9KstZzA63i3VcfYv</ds:X509Certificate></ds:X509Data></ds:KeyInfo></md:KeyDescriptor><md:SingleSignOnService Binding=\"urn:oasis:names:tc:SAML:2.0:bindings:HTTP-Redirect\" Location=\"https://test.com/sso\"/></md:IDPSSODescriptor></md:EntityDescriptor>",
 *     },
 *     displayName: "Display name",
 *     description: "A sample SAML workforce pool provider.",
 *     disabled: false,
 *     attributeCondition: "true",
 * }, {
 *     provider: google_beta,
 * });
 * ```
 * ### Iam Workforce Pool Provider Oidc Basic
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const pool = new gcp.iam.WorkforcePool("pool", {
 *     workforcePoolId: "example-pool",
 *     parent: "organizations/123456789",
 *     location: "global",
 * }, {
 *     provider: google_beta,
 * });
 * const example = new gcp.iam.WorkforcePoolProvider("example", {
 *     workforcePoolId: pool.workforcePoolId,
 *     location: pool.location,
 *     providerId: "example-prvdr",
 *     attributeMapping: {
 *         "google.subject": "assertion.sub",
 *     },
 *     oidc: {
 *         issuerUri: "https://accounts.google.com",
 *         clientId: "client-id",
 *     },
 * }, {
 *     provider: google_beta,
 * });
 * ```
 * ### Iam Workforce Pool Provider Oidc Full
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const pool = new gcp.iam.WorkforcePool("pool", {
 *     workforcePoolId: "example-pool",
 *     parent: "organizations/123456789",
 *     location: "global",
 * }, {
 *     provider: google_beta,
 * });
 * const example = new gcp.iam.WorkforcePoolProvider("example", {
 *     workforcePoolId: pool.workforcePoolId,
 *     location: pool.location,
 *     providerId: "example-prvdr",
 *     attributeMapping: {
 *         "google.subject": "assertion.sub",
 *     },
 *     oidc: {
 *         issuerUri: "https://accounts.google.com",
 *         clientId: "client-id",
 *     },
 *     displayName: "Display name",
 *     description: "A sample OIDC workforce pool provider.",
 *     disabled: false,
 *     attributeCondition: "true",
 * }, {
 *     provider: google_beta,
 * });
 * ```
 *
 * ## Import
 *
 * WorkforcePoolProvider can be imported using any of these accepted formats
 *
 * ```sh
 *  $ pulumi import gcp:iam/workforcePoolProvider:WorkforcePoolProvider default locations/{{location}}/workforcePools/{{workforce_pool_id}}/providers/{{provider_id}}
 * ```
 *
 * ```sh
 *  $ pulumi import gcp:iam/workforcePoolProvider:WorkforcePoolProvider default {{location}}/{{workforce_pool_id}}/{{provider_id}}
 * ```
 */
export class WorkforcePoolProvider extends pulumi.CustomResource {
    /**
     * Get an existing WorkforcePoolProvider resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: WorkforcePoolProviderState, opts?: pulumi.CustomResourceOptions): WorkforcePoolProvider {
        return new WorkforcePoolProvider(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:iam/workforcePoolProvider:WorkforcePoolProvider';

    /**
     * Returns true if the given object is an instance of WorkforcePoolProvider.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is WorkforcePoolProvider {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === WorkforcePoolProvider.__pulumiType;
    }

    /**
     * A [Common Expression Language](https://opensource.google/projects/cel) expression, in
     * plain text, to restrict what otherwise valid authentication credentials issued by the
     * provider should not be accepted.
     * The expression must output a boolean representing whether to allow the federation.
     * The following keywords may be referenced in the expressions:
     * * `assertion`: JSON representing the authentication credential issued by the provider.
     * * `google`: The Google attributes mapped from the assertion in the `attributeMappings`.
     * `google.profile_photo` and `google.display_name` are not supported.
     * * `attribute`: The custom attributes mapped from the assertion in the `attributeMappings`.
     * The maximum length of the attribute condition expression is 4096 characters.
     * If unspecified, all valid authentication credentials will be accepted.
     * The following example shows how to only allow credentials with a mapped `google.groups` value of `admins`:
     * ```typescript
     * import * as pulumi from "@pulumi/pulumi";
     * ```
     */
    public readonly attributeCondition!: pulumi.Output<string | undefined>;
    /**
     * Maps attributes from the authentication credentials issued by an external identity provider
     * to Google Cloud attributes, such as `subject` and `segment`.
     * Each key must be a string specifying the Google Cloud IAM attribute to map to.
     * The following keys are supported:
     * * `google.subject`: The principal IAM is authenticating. You can reference this value in IAM bindings.
     * This is also the subject that appears in Cloud Logging logs. This is a required field and
     * the mapped subject cannot exceed 127 bytes.
     * * `google.groups`: Groups the authenticating user belongs to. You can grant groups access to
     * resources using an IAM `principalSet` binding; access applies to all members of the group.
     * * `google.display_name`: The name of the authenticated user. This is an optional field and
     * the mapped display name cannot exceed 100 bytes. If not set, `google.subject` will be displayed instead.
     * This attribute cannot be referenced in IAM bindings.
     * * `google.profile_photo`: The URL that specifies the authenticated user's thumbnail photo.
     * This is an optional field. When set, the image will be visible as the user's profile picture.
     * If not set, a generic user icon will be displayed instead.
     * This attribute cannot be referenced in IAM bindings.
     * You can also provide custom attributes by specifying `attribute.{custom_attribute}`, where {custom_attribute}
     * is the name of the custom attribute to be mapped. You can define a maximum of 50 custom attributes.
     * The maximum length of a mapped attribute key is 100 characters, and the key may only contain the characters [a-z0-9_].
     * You can reference these attributes in IAM policies to define fine-grained access for a workforce pool
     * to Google Cloud resources. For example:
     * * `google.subject`:
     * `principal://iam.googleapis.com/locations/{location}/workforcePools/{pool}/subject/{value}`
     * * `google.groups`:
     * `principalSet://iam.googleapis.com/locations/{location}/workforcePools/{pool}/group/{value}`
     * * `attribute.{custom_attribute}`:
     * `principalSet://iam.googleapis.com/locations/{location}/workforcePools/{pool}/attribute.{custom_attribute}/{value}`
     * Each value must be a [Common Expression Language](https://opensource.google/projects/cel)
     * function that maps an identity provider credential to the normalized attribute specified
     * by the corresponding map key.
     * You can use the `assertion` keyword in the expression to access a JSON representation of
     * the authentication credential issued by the provider.
     * The maximum length of an attribute mapping expression is 2048 characters. When evaluated,
     * the total size of all mapped attributes must not exceed 8KB.
     * For OIDC providers, you must supply a custom mapping that includes the `google.subject` attribute.
     * For example, the following maps the sub claim of the incoming credential to the `subject` attribute
     * on a Google token:
     * ```typescript
     * import * as pulumi from "@pulumi/pulumi";
     * ```
     * An object containing a list of `"key": value` pairs.
     * Example: `{ "name": "wrench", "mass": "1.3kg", "count": "3" }`.
     */
    public readonly attributeMapping!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A user-specified description of the provider. Cannot exceed 256 characters.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Whether the provider is disabled. You cannot use a disabled provider to exchange tokens.
     * However, existing tokens still grant access.
     */
    public readonly disabled!: pulumi.Output<boolean | undefined>;
    /**
     * A user-specified display name for the provider. Cannot exceed 32 characters.
     */
    public readonly displayName!: pulumi.Output<string | undefined>;
    /**
     * The location for the resource.
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * Output only. The resource name of the provider. Format:
     * 'locations/{location}/workforcePools/{workforcePoolId}/providers/{providerId}'
     */
    public /*out*/ readonly name!: pulumi.Output<string>;
    /**
     * Represents an OpenId Connect 1.0 identity provider.
     * Structure is documented below.
     */
    public readonly oidc!: pulumi.Output<outputs.iam.WorkforcePoolProviderOidc | undefined>;
    /**
     * The ID for the provider, which becomes the final component of the resource name.
     * This value must be 4-32 characters, and may contain the characters [a-z0-9-].
     * The prefix `gcp-` is reserved for use by Google, and may not be specified.
     */
    public readonly providerId!: pulumi.Output<string>;
    /**
     * Represents a SAML identity provider.
     * Structure is documented below.
     */
    public readonly saml!: pulumi.Output<outputs.iam.WorkforcePoolProviderSaml | undefined>;
    /**
     * The current state of the provider. * STATE_UNSPECIFIED: State unspecified. * ACTIVE: The provider is active and may be
     * used to validate authentication credentials. * DELETED: The provider is soft-deleted. Soft-deleted providers are
     * permanently deleted after approximately 30 days. You can restore a soft-deleted provider using
     * [providers.undelete](https://cloud.google.com/iam/docs/reference/rest/v1/locations.workforcePools.providers/undelete#google.iam.admin.v1.WorkforcePools.UndeleteWorkforcePoolProvider).
     */
    public /*out*/ readonly state!: pulumi.Output<string>;
    /**
     * The ID to use for the pool, which becomes the final component of the resource name.
     * The IDs must be a globally unique string of 6 to 63 lowercase letters, digits, or hyphens.
     * It must start with a letter, and cannot have a trailing hyphen.
     * The prefix `gcp-` is reserved for use by Google, and may not be specified.
     */
    public readonly workforcePoolId!: pulumi.Output<string>;

    /**
     * Create a WorkforcePoolProvider resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: WorkforcePoolProviderArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: WorkforcePoolProviderArgs | WorkforcePoolProviderState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as WorkforcePoolProviderState | undefined;
            resourceInputs["attributeCondition"] = state ? state.attributeCondition : undefined;
            resourceInputs["attributeMapping"] = state ? state.attributeMapping : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["disabled"] = state ? state.disabled : undefined;
            resourceInputs["displayName"] = state ? state.displayName : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["oidc"] = state ? state.oidc : undefined;
            resourceInputs["providerId"] = state ? state.providerId : undefined;
            resourceInputs["saml"] = state ? state.saml : undefined;
            resourceInputs["state"] = state ? state.state : undefined;
            resourceInputs["workforcePoolId"] = state ? state.workforcePoolId : undefined;
        } else {
            const args = argsOrState as WorkforcePoolProviderArgs | undefined;
            if ((!args || args.location === undefined) && !opts.urn) {
                throw new Error("Missing required property 'location'");
            }
            if ((!args || args.providerId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'providerId'");
            }
            if ((!args || args.workforcePoolId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'workforcePoolId'");
            }
            resourceInputs["attributeCondition"] = args ? args.attributeCondition : undefined;
            resourceInputs["attributeMapping"] = args ? args.attributeMapping : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["disabled"] = args ? args.disabled : undefined;
            resourceInputs["displayName"] = args ? args.displayName : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["oidc"] = args ? args.oidc : undefined;
            resourceInputs["providerId"] = args ? args.providerId : undefined;
            resourceInputs["saml"] = args ? args.saml : undefined;
            resourceInputs["workforcePoolId"] = args ? args.workforcePoolId : undefined;
            resourceInputs["name"] = undefined /*out*/;
            resourceInputs["state"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(WorkforcePoolProvider.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering WorkforcePoolProvider resources.
 */
export interface WorkforcePoolProviderState {
    /**
     * A [Common Expression Language](https://opensource.google/projects/cel) expression, in
     * plain text, to restrict what otherwise valid authentication credentials issued by the
     * provider should not be accepted.
     * The expression must output a boolean representing whether to allow the federation.
     * The following keywords may be referenced in the expressions:
     * * `assertion`: JSON representing the authentication credential issued by the provider.
     * * `google`: The Google attributes mapped from the assertion in the `attributeMappings`.
     * `google.profile_photo` and `google.display_name` are not supported.
     * * `attribute`: The custom attributes mapped from the assertion in the `attributeMappings`.
     * The maximum length of the attribute condition expression is 4096 characters.
     * If unspecified, all valid authentication credentials will be accepted.
     * The following example shows how to only allow credentials with a mapped `google.groups` value of `admins`:
     * ```typescript
     * import * as pulumi from "@pulumi/pulumi";
     * ```
     */
    attributeCondition?: pulumi.Input<string>;
    /**
     * Maps attributes from the authentication credentials issued by an external identity provider
     * to Google Cloud attributes, such as `subject` and `segment`.
     * Each key must be a string specifying the Google Cloud IAM attribute to map to.
     * The following keys are supported:
     * * `google.subject`: The principal IAM is authenticating. You can reference this value in IAM bindings.
     * This is also the subject that appears in Cloud Logging logs. This is a required field and
     * the mapped subject cannot exceed 127 bytes.
     * * `google.groups`: Groups the authenticating user belongs to. You can grant groups access to
     * resources using an IAM `principalSet` binding; access applies to all members of the group.
     * * `google.display_name`: The name of the authenticated user. This is an optional field and
     * the mapped display name cannot exceed 100 bytes. If not set, `google.subject` will be displayed instead.
     * This attribute cannot be referenced in IAM bindings.
     * * `google.profile_photo`: The URL that specifies the authenticated user's thumbnail photo.
     * This is an optional field. When set, the image will be visible as the user's profile picture.
     * If not set, a generic user icon will be displayed instead.
     * This attribute cannot be referenced in IAM bindings.
     * You can also provide custom attributes by specifying `attribute.{custom_attribute}`, where {custom_attribute}
     * is the name of the custom attribute to be mapped. You can define a maximum of 50 custom attributes.
     * The maximum length of a mapped attribute key is 100 characters, and the key may only contain the characters [a-z0-9_].
     * You can reference these attributes in IAM policies to define fine-grained access for a workforce pool
     * to Google Cloud resources. For example:
     * * `google.subject`:
     * `principal://iam.googleapis.com/locations/{location}/workforcePools/{pool}/subject/{value}`
     * * `google.groups`:
     * `principalSet://iam.googleapis.com/locations/{location}/workforcePools/{pool}/group/{value}`
     * * `attribute.{custom_attribute}`:
     * `principalSet://iam.googleapis.com/locations/{location}/workforcePools/{pool}/attribute.{custom_attribute}/{value}`
     * Each value must be a [Common Expression Language](https://opensource.google/projects/cel)
     * function that maps an identity provider credential to the normalized attribute specified
     * by the corresponding map key.
     * You can use the `assertion` keyword in the expression to access a JSON representation of
     * the authentication credential issued by the provider.
     * The maximum length of an attribute mapping expression is 2048 characters. When evaluated,
     * the total size of all mapped attributes must not exceed 8KB.
     * For OIDC providers, you must supply a custom mapping that includes the `google.subject` attribute.
     * For example, the following maps the sub claim of the incoming credential to the `subject` attribute
     * on a Google token:
     * ```typescript
     * import * as pulumi from "@pulumi/pulumi";
     * ```
     * An object containing a list of `"key": value` pairs.
     * Example: `{ "name": "wrench", "mass": "1.3kg", "count": "3" }`.
     */
    attributeMapping?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A user-specified description of the provider. Cannot exceed 256 characters.
     */
    description?: pulumi.Input<string>;
    /**
     * Whether the provider is disabled. You cannot use a disabled provider to exchange tokens.
     * However, existing tokens still grant access.
     */
    disabled?: pulumi.Input<boolean>;
    /**
     * A user-specified display name for the provider. Cannot exceed 32 characters.
     */
    displayName?: pulumi.Input<string>;
    /**
     * The location for the resource.
     */
    location?: pulumi.Input<string>;
    /**
     * Output only. The resource name of the provider. Format:
     * 'locations/{location}/workforcePools/{workforcePoolId}/providers/{providerId}'
     */
    name?: pulumi.Input<string>;
    /**
     * Represents an OpenId Connect 1.0 identity provider.
     * Structure is documented below.
     */
    oidc?: pulumi.Input<inputs.iam.WorkforcePoolProviderOidc>;
    /**
     * The ID for the provider, which becomes the final component of the resource name.
     * This value must be 4-32 characters, and may contain the characters [a-z0-9-].
     * The prefix `gcp-` is reserved for use by Google, and may not be specified.
     */
    providerId?: pulumi.Input<string>;
    /**
     * Represents a SAML identity provider.
     * Structure is documented below.
     */
    saml?: pulumi.Input<inputs.iam.WorkforcePoolProviderSaml>;
    /**
     * The current state of the provider. * STATE_UNSPECIFIED: State unspecified. * ACTIVE: The provider is active and may be
     * used to validate authentication credentials. * DELETED: The provider is soft-deleted. Soft-deleted providers are
     * permanently deleted after approximately 30 days. You can restore a soft-deleted provider using
     * [providers.undelete](https://cloud.google.com/iam/docs/reference/rest/v1/locations.workforcePools.providers/undelete#google.iam.admin.v1.WorkforcePools.UndeleteWorkforcePoolProvider).
     */
    state?: pulumi.Input<string>;
    /**
     * The ID to use for the pool, which becomes the final component of the resource name.
     * The IDs must be a globally unique string of 6 to 63 lowercase letters, digits, or hyphens.
     * It must start with a letter, and cannot have a trailing hyphen.
     * The prefix `gcp-` is reserved for use by Google, and may not be specified.
     */
    workforcePoolId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a WorkforcePoolProvider resource.
 */
export interface WorkforcePoolProviderArgs {
    /**
     * A [Common Expression Language](https://opensource.google/projects/cel) expression, in
     * plain text, to restrict what otherwise valid authentication credentials issued by the
     * provider should not be accepted.
     * The expression must output a boolean representing whether to allow the federation.
     * The following keywords may be referenced in the expressions:
     * * `assertion`: JSON representing the authentication credential issued by the provider.
     * * `google`: The Google attributes mapped from the assertion in the `attributeMappings`.
     * `google.profile_photo` and `google.display_name` are not supported.
     * * `attribute`: The custom attributes mapped from the assertion in the `attributeMappings`.
     * The maximum length of the attribute condition expression is 4096 characters.
     * If unspecified, all valid authentication credentials will be accepted.
     * The following example shows how to only allow credentials with a mapped `google.groups` value of `admins`:
     * ```typescript
     * import * as pulumi from "@pulumi/pulumi";
     * ```
     */
    attributeCondition?: pulumi.Input<string>;
    /**
     * Maps attributes from the authentication credentials issued by an external identity provider
     * to Google Cloud attributes, such as `subject` and `segment`.
     * Each key must be a string specifying the Google Cloud IAM attribute to map to.
     * The following keys are supported:
     * * `google.subject`: The principal IAM is authenticating. You can reference this value in IAM bindings.
     * This is also the subject that appears in Cloud Logging logs. This is a required field and
     * the mapped subject cannot exceed 127 bytes.
     * * `google.groups`: Groups the authenticating user belongs to. You can grant groups access to
     * resources using an IAM `principalSet` binding; access applies to all members of the group.
     * * `google.display_name`: The name of the authenticated user. This is an optional field and
     * the mapped display name cannot exceed 100 bytes. If not set, `google.subject` will be displayed instead.
     * This attribute cannot be referenced in IAM bindings.
     * * `google.profile_photo`: The URL that specifies the authenticated user's thumbnail photo.
     * This is an optional field. When set, the image will be visible as the user's profile picture.
     * If not set, a generic user icon will be displayed instead.
     * This attribute cannot be referenced in IAM bindings.
     * You can also provide custom attributes by specifying `attribute.{custom_attribute}`, where {custom_attribute}
     * is the name of the custom attribute to be mapped. You can define a maximum of 50 custom attributes.
     * The maximum length of a mapped attribute key is 100 characters, and the key may only contain the characters [a-z0-9_].
     * You can reference these attributes in IAM policies to define fine-grained access for a workforce pool
     * to Google Cloud resources. For example:
     * * `google.subject`:
     * `principal://iam.googleapis.com/locations/{location}/workforcePools/{pool}/subject/{value}`
     * * `google.groups`:
     * `principalSet://iam.googleapis.com/locations/{location}/workforcePools/{pool}/group/{value}`
     * * `attribute.{custom_attribute}`:
     * `principalSet://iam.googleapis.com/locations/{location}/workforcePools/{pool}/attribute.{custom_attribute}/{value}`
     * Each value must be a [Common Expression Language](https://opensource.google/projects/cel)
     * function that maps an identity provider credential to the normalized attribute specified
     * by the corresponding map key.
     * You can use the `assertion` keyword in the expression to access a JSON representation of
     * the authentication credential issued by the provider.
     * The maximum length of an attribute mapping expression is 2048 characters. When evaluated,
     * the total size of all mapped attributes must not exceed 8KB.
     * For OIDC providers, you must supply a custom mapping that includes the `google.subject` attribute.
     * For example, the following maps the sub claim of the incoming credential to the `subject` attribute
     * on a Google token:
     * ```typescript
     * import * as pulumi from "@pulumi/pulumi";
     * ```
     * An object containing a list of `"key": value` pairs.
     * Example: `{ "name": "wrench", "mass": "1.3kg", "count": "3" }`.
     */
    attributeMapping?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A user-specified description of the provider. Cannot exceed 256 characters.
     */
    description?: pulumi.Input<string>;
    /**
     * Whether the provider is disabled. You cannot use a disabled provider to exchange tokens.
     * However, existing tokens still grant access.
     */
    disabled?: pulumi.Input<boolean>;
    /**
     * A user-specified display name for the provider. Cannot exceed 32 characters.
     */
    displayName?: pulumi.Input<string>;
    /**
     * The location for the resource.
     */
    location: pulumi.Input<string>;
    /**
     * Represents an OpenId Connect 1.0 identity provider.
     * Structure is documented below.
     */
    oidc?: pulumi.Input<inputs.iam.WorkforcePoolProviderOidc>;
    /**
     * The ID for the provider, which becomes the final component of the resource name.
     * This value must be 4-32 characters, and may contain the characters [a-z0-9-].
     * The prefix `gcp-` is reserved for use by Google, and may not be specified.
     */
    providerId: pulumi.Input<string>;
    /**
     * Represents a SAML identity provider.
     * Structure is documented below.
     */
    saml?: pulumi.Input<inputs.iam.WorkforcePoolProviderSaml>;
    /**
     * The ID to use for the pool, which becomes the final component of the resource name.
     * The IDs must be a globally unique string of 6 to 63 lowercase letters, digits, or hyphens.
     * It must start with a letter, and cannot have a trailing hyphen.
     * The prefix `gcp-` is reserved for use by Google, and may not be specified.
     */
    workforcePoolId: pulumi.Input<string>;
}