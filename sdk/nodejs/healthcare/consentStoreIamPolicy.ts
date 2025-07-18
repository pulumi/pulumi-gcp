// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Three different resources help you manage your IAM policy for Cloud Healthcare ConsentStore. Each of these resources serves a different use case:
 *
 * * `gcp.healthcare.ConsentStoreIamPolicy`: Authoritative. Sets the IAM policy for the consentstore and replaces any existing policy already attached.
 * * `gcp.healthcare.ConsentStoreIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the consentstore are preserved.
 * * `gcp.healthcare.ConsentStoreIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the consentstore are preserved.
 *
 * A data source can be used to retrieve policy data in advent you do not need creation
 *
 * * `gcp.healthcare.ConsentStoreIamPolicy`: Retrieves the IAM policy for the consentstore
 *
 * > **Note:** `gcp.healthcare.ConsentStoreIamPolicy` **cannot** be used in conjunction with `gcp.healthcare.ConsentStoreIamBinding` and `gcp.healthcare.ConsentStoreIamMember` or they will fight over what your policy should be.
 *
 * > **Note:** `gcp.healthcare.ConsentStoreIamBinding` resources **can be** used in conjunction with `gcp.healthcare.ConsentStoreIamMember` resources **only if** they do not grant privilege to the same role.
 *
 * ## gcp.healthcare.ConsentStoreIamPolicy
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const admin = gcp.organizations.getIAMPolicy({
 *     bindings: [{
 *         role: "roles/viewer",
 *         members: ["user:jane@example.com"],
 *     }],
 * });
 * const policy = new gcp.healthcare.ConsentStoreIamPolicy("policy", {
 *     dataset: my_consent.dataset,
 *     consentStoreId: my_consent.name,
 *     policyData: admin.then(admin => admin.policyData),
 * });
 * ```
 *
 * ## gcp.healthcare.ConsentStoreIamBinding
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const binding = new gcp.healthcare.ConsentStoreIamBinding("binding", {
 *     dataset: my_consent.dataset,
 *     consentStoreId: my_consent.name,
 *     role: "roles/viewer",
 *     members: ["user:jane@example.com"],
 * });
 * ```
 *
 * ## gcp.healthcare.ConsentStoreIamMember
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const member = new gcp.healthcare.ConsentStoreIamMember("member", {
 *     dataset: my_consent.dataset,
 *     consentStoreId: my_consent.name,
 *     role: "roles/viewer",
 *     member: "user:jane@example.com",
 * });
 * ```
 *
 * ## > **Custom Roles** If you're importing a IAM resource with a custom role, make sure to use the
 *
 * full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
 * ---
 *
 * # IAM policy for Cloud Healthcare ConsentStore
 * Three different resources help you manage your IAM policy for Cloud Healthcare ConsentStore. Each of these resources serves a different use case:
 *
 * * `gcp.healthcare.ConsentStoreIamPolicy`: Authoritative. Sets the IAM policy for the consentstore and replaces any existing policy already attached.
 * * `gcp.healthcare.ConsentStoreIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the consentstore are preserved.
 * * `gcp.healthcare.ConsentStoreIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the consentstore are preserved.
 *
 * A data source can be used to retrieve policy data in advent you do not need creation
 *
 * * `gcp.healthcare.ConsentStoreIamPolicy`: Retrieves the IAM policy for the consentstore
 *
 * > **Note:** `gcp.healthcare.ConsentStoreIamPolicy` **cannot** be used in conjunction with `gcp.healthcare.ConsentStoreIamBinding` and `gcp.healthcare.ConsentStoreIamMember` or they will fight over what your policy should be.
 *
 * > **Note:** `gcp.healthcare.ConsentStoreIamBinding` resources **can be** used in conjunction with `gcp.healthcare.ConsentStoreIamMember` resources **only if** they do not grant privilege to the same role.
 *
 * ## gcp.healthcare.ConsentStoreIamPolicy
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const admin = gcp.organizations.getIAMPolicy({
 *     bindings: [{
 *         role: "roles/viewer",
 *         members: ["user:jane@example.com"],
 *     }],
 * });
 * const policy = new gcp.healthcare.ConsentStoreIamPolicy("policy", {
 *     dataset: my_consent.dataset,
 *     consentStoreId: my_consent.name,
 *     policyData: admin.then(admin => admin.policyData),
 * });
 * ```
 *
 * ## gcp.healthcare.ConsentStoreIamBinding
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const binding = new gcp.healthcare.ConsentStoreIamBinding("binding", {
 *     dataset: my_consent.dataset,
 *     consentStoreId: my_consent.name,
 *     role: "roles/viewer",
 *     members: ["user:jane@example.com"],
 * });
 * ```
 *
 * ## gcp.healthcare.ConsentStoreIamMember
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const member = new gcp.healthcare.ConsentStoreIamMember("member", {
 *     dataset: my_consent.dataset,
 *     consentStoreId: my_consent.name,
 *     role: "roles/viewer",
 *     member: "user:jane@example.com",
 * });
 * ```
 *
 * ## Import
 *
 * For all import syntaxes, the "resource in question" can take any of the following forms:
 *
 * * {{dataset}}/consentStores/{{name}}
 *
 * * {{name}}
 *
 * Any variables not passed in the import command will be taken from the provider configuration.
 *
 * Cloud Healthcare consentstore IAM resources can be imported using the resource identifiers, role, and member.
 *
 * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
 *
 * ```sh
 * $ pulumi import gcp:healthcare/consentStoreIamPolicy:ConsentStoreIamPolicy editor "{{dataset}}/consentStores/{{consent_store}} roles/viewer user:jane@example.com"
 * ```
 *
 * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
 *
 * ```sh
 * $ pulumi import gcp:healthcare/consentStoreIamPolicy:ConsentStoreIamPolicy editor "{{dataset}}/consentStores/{{consent_store}} roles/viewer"
 * ```
 *
 * IAM policy imports use the identifier of the resource in question, e.g.
 *
 * ```sh
 * $ pulumi import gcp:healthcare/consentStoreIamPolicy:ConsentStoreIamPolicy editor {{dataset}}/consentStores/{{consent_store}}
 * ```
 *
 * -> **Custom Roles** If you're importing a IAM resource with a custom role, make sure to use the
 *
 *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
 */
export class ConsentStoreIamPolicy extends pulumi.CustomResource {
    /**
     * Get an existing ConsentStoreIamPolicy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ConsentStoreIamPolicyState, opts?: pulumi.CustomResourceOptions): ConsentStoreIamPolicy {
        return new ConsentStoreIamPolicy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:healthcare/consentStoreIamPolicy:ConsentStoreIamPolicy';

    /**
     * Returns true if the given object is an instance of ConsentStoreIamPolicy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ConsentStoreIamPolicy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ConsentStoreIamPolicy.__pulumiType;
    }

    /**
     * Used to find the parent resource to bind the IAM policy to
     */
    public readonly consentStoreId!: pulumi.Output<string>;
    /**
     * Identifies the dataset addressed by this request. Must be in the format
     * 'projects/{project}/locations/{location}/datasets/{dataset}'
     * Used to find the parent resource to bind the IAM policy to
     */
    public readonly dataset!: pulumi.Output<string>;
    /**
     * (Computed) The etag of the IAM policy.
     */
    public /*out*/ readonly etag!: pulumi.Output<string>;
    /**
     * The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     */
    public readonly policyData!: pulumi.Output<string>;

    /**
     * Create a ConsentStoreIamPolicy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ConsentStoreIamPolicyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ConsentStoreIamPolicyArgs | ConsentStoreIamPolicyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ConsentStoreIamPolicyState | undefined;
            resourceInputs["consentStoreId"] = state ? state.consentStoreId : undefined;
            resourceInputs["dataset"] = state ? state.dataset : undefined;
            resourceInputs["etag"] = state ? state.etag : undefined;
            resourceInputs["policyData"] = state ? state.policyData : undefined;
        } else {
            const args = argsOrState as ConsentStoreIamPolicyArgs | undefined;
            if ((!args || args.consentStoreId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'consentStoreId'");
            }
            if ((!args || args.dataset === undefined) && !opts.urn) {
                throw new Error("Missing required property 'dataset'");
            }
            if ((!args || args.policyData === undefined) && !opts.urn) {
                throw new Error("Missing required property 'policyData'");
            }
            resourceInputs["consentStoreId"] = args ? args.consentStoreId : undefined;
            resourceInputs["dataset"] = args ? args.dataset : undefined;
            resourceInputs["policyData"] = args ? args.policyData : undefined;
            resourceInputs["etag"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ConsentStoreIamPolicy.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ConsentStoreIamPolicy resources.
 */
export interface ConsentStoreIamPolicyState {
    /**
     * Used to find the parent resource to bind the IAM policy to
     */
    consentStoreId?: pulumi.Input<string>;
    /**
     * Identifies the dataset addressed by this request. Must be in the format
     * 'projects/{project}/locations/{location}/datasets/{dataset}'
     * Used to find the parent resource to bind the IAM policy to
     */
    dataset?: pulumi.Input<string>;
    /**
     * (Computed) The etag of the IAM policy.
     */
    etag?: pulumi.Input<string>;
    /**
     * The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     */
    policyData?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ConsentStoreIamPolicy resource.
 */
export interface ConsentStoreIamPolicyArgs {
    /**
     * Used to find the parent resource to bind the IAM policy to
     */
    consentStoreId: pulumi.Input<string>;
    /**
     * Identifies the dataset addressed by this request. Must be in the format
     * 'projects/{project}/locations/{location}/datasets/{dataset}'
     * Used to find the parent resource to bind the IAM policy to
     */
    dataset: pulumi.Input<string>;
    /**
     * The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     */
    policyData: pulumi.Input<string>;
}
