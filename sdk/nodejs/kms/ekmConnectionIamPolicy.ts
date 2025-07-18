// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Three different resources help you manage your IAM policy for Cloud Key Management Service EkmConnection. Each of these resources serves a different use case:
 *
 * * `gcp.kms.EkmConnectionIamPolicy`: Authoritative. Sets the IAM policy for the ekmconnection and replaces any existing policy already attached.
 * * `gcp.kms.EkmConnectionIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the ekmconnection are preserved.
 * * `gcp.kms.EkmConnectionIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the ekmconnection are preserved.
 *
 * A data source can be used to retrieve policy data in advent you do not need creation
 *
 * * `gcp.kms.EkmConnectionIamPolicy`: Retrieves the IAM policy for the ekmconnection
 *
 * > **Note:** `gcp.kms.EkmConnectionIamPolicy` **cannot** be used in conjunction with `gcp.kms.EkmConnectionIamBinding` and `gcp.kms.EkmConnectionIamMember` or they will fight over what your policy should be.
 *
 * > **Note:** `gcp.kms.EkmConnectionIamBinding` resources **can be** used in conjunction with `gcp.kms.EkmConnectionIamMember` resources **only if** they do not grant privilege to the same role.
 *
 * > **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
 *
 * ## gcp.kms.EkmConnectionIamPolicy
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
 * const policy = new gcp.kms.EkmConnectionIamPolicy("policy", {
 *     project: example_ekmconnection.project,
 *     location: example_ekmconnection.location,
 *     name: example_ekmconnection.name,
 *     policyData: admin.then(admin => admin.policyData),
 * });
 * ```
 *
 * With IAM Conditions:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const admin = gcp.organizations.getIAMPolicy({
 *     bindings: [{
 *         role: "roles/viewer",
 *         members: ["user:jane@example.com"],
 *         condition: {
 *             title: "expires_after_2019_12_31",
 *             description: "Expiring at midnight of 2019-12-31",
 *             expression: "request.time < timestamp(\"2020-01-01T00:00:00Z\")",
 *         },
 *     }],
 * });
 * const policy = new gcp.kms.EkmConnectionIamPolicy("policy", {
 *     project: example_ekmconnection.project,
 *     location: example_ekmconnection.location,
 *     name: example_ekmconnection.name,
 *     policyData: admin.then(admin => admin.policyData),
 * });
 * ```
 * ## gcp.kms.EkmConnectionIamBinding
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const binding = new gcp.kms.EkmConnectionIamBinding("binding", {
 *     project: example_ekmconnection.project,
 *     location: example_ekmconnection.location,
 *     name: example_ekmconnection.name,
 *     role: "roles/viewer",
 *     members: ["user:jane@example.com"],
 * });
 * ```
 *
 * With IAM Conditions:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const binding = new gcp.kms.EkmConnectionIamBinding("binding", {
 *     project: example_ekmconnection.project,
 *     location: example_ekmconnection.location,
 *     name: example_ekmconnection.name,
 *     role: "roles/viewer",
 *     members: ["user:jane@example.com"],
 *     condition: {
 *         title: "expires_after_2019_12_31",
 *         description: "Expiring at midnight of 2019-12-31",
 *         expression: "request.time < timestamp(\"2020-01-01T00:00:00Z\")",
 *     },
 * });
 * ```
 * ## gcp.kms.EkmConnectionIamMember
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const member = new gcp.kms.EkmConnectionIamMember("member", {
 *     project: example_ekmconnection.project,
 *     location: example_ekmconnection.location,
 *     name: example_ekmconnection.name,
 *     role: "roles/viewer",
 *     member: "user:jane@example.com",
 * });
 * ```
 *
 * With IAM Conditions:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const member = new gcp.kms.EkmConnectionIamMember("member", {
 *     project: example_ekmconnection.project,
 *     location: example_ekmconnection.location,
 *     name: example_ekmconnection.name,
 *     role: "roles/viewer",
 *     member: "user:jane@example.com",
 *     condition: {
 *         title: "expires_after_2019_12_31",
 *         description: "Expiring at midnight of 2019-12-31",
 *         expression: "request.time < timestamp(\"2020-01-01T00:00:00Z\")",
 *     },
 * });
 * ```
 *
 * ## This resource supports User Project Overrides.
 *
 * - 
 *
 * # IAM policy for Cloud Key Management Service EkmConnection
 * Three different resources help you manage your IAM policy for Cloud Key Management Service EkmConnection. Each of these resources serves a different use case:
 *
 * * `gcp.kms.EkmConnectionIamPolicy`: Authoritative. Sets the IAM policy for the ekmconnection and replaces any existing policy already attached.
 * * `gcp.kms.EkmConnectionIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the ekmconnection are preserved.
 * * `gcp.kms.EkmConnectionIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the ekmconnection are preserved.
 *
 * A data source can be used to retrieve policy data in advent you do not need creation
 *
 * * `gcp.kms.EkmConnectionIamPolicy`: Retrieves the IAM policy for the ekmconnection
 *
 * > **Note:** `gcp.kms.EkmConnectionIamPolicy` **cannot** be used in conjunction with `gcp.kms.EkmConnectionIamBinding` and `gcp.kms.EkmConnectionIamMember` or they will fight over what your policy should be.
 *
 * > **Note:** `gcp.kms.EkmConnectionIamBinding` resources **can be** used in conjunction with `gcp.kms.EkmConnectionIamMember` resources **only if** they do not grant privilege to the same role.
 *
 * > **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
 *
 * ## gcp.kms.EkmConnectionIamPolicy
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
 * const policy = new gcp.kms.EkmConnectionIamPolicy("policy", {
 *     project: example_ekmconnection.project,
 *     location: example_ekmconnection.location,
 *     name: example_ekmconnection.name,
 *     policyData: admin.then(admin => admin.policyData),
 * });
 * ```
 *
 * With IAM Conditions:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const admin = gcp.organizations.getIAMPolicy({
 *     bindings: [{
 *         role: "roles/viewer",
 *         members: ["user:jane@example.com"],
 *         condition: {
 *             title: "expires_after_2019_12_31",
 *             description: "Expiring at midnight of 2019-12-31",
 *             expression: "request.time < timestamp(\"2020-01-01T00:00:00Z\")",
 *         },
 *     }],
 * });
 * const policy = new gcp.kms.EkmConnectionIamPolicy("policy", {
 *     project: example_ekmconnection.project,
 *     location: example_ekmconnection.location,
 *     name: example_ekmconnection.name,
 *     policyData: admin.then(admin => admin.policyData),
 * });
 * ```
 * ## gcp.kms.EkmConnectionIamBinding
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const binding = new gcp.kms.EkmConnectionIamBinding("binding", {
 *     project: example_ekmconnection.project,
 *     location: example_ekmconnection.location,
 *     name: example_ekmconnection.name,
 *     role: "roles/viewer",
 *     members: ["user:jane@example.com"],
 * });
 * ```
 *
 * With IAM Conditions:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const binding = new gcp.kms.EkmConnectionIamBinding("binding", {
 *     project: example_ekmconnection.project,
 *     location: example_ekmconnection.location,
 *     name: example_ekmconnection.name,
 *     role: "roles/viewer",
 *     members: ["user:jane@example.com"],
 *     condition: {
 *         title: "expires_after_2019_12_31",
 *         description: "Expiring at midnight of 2019-12-31",
 *         expression: "request.time < timestamp(\"2020-01-01T00:00:00Z\")",
 *     },
 * });
 * ```
 * ## gcp.kms.EkmConnectionIamMember
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const member = new gcp.kms.EkmConnectionIamMember("member", {
 *     project: example_ekmconnection.project,
 *     location: example_ekmconnection.location,
 *     name: example_ekmconnection.name,
 *     role: "roles/viewer",
 *     member: "user:jane@example.com",
 * });
 * ```
 *
 * With IAM Conditions:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const member = new gcp.kms.EkmConnectionIamMember("member", {
 *     project: example_ekmconnection.project,
 *     location: example_ekmconnection.location,
 *     name: example_ekmconnection.name,
 *     role: "roles/viewer",
 *     member: "user:jane@example.com",
 *     condition: {
 *         title: "expires_after_2019_12_31",
 *         description: "Expiring at midnight of 2019-12-31",
 *         expression: "request.time < timestamp(\"2020-01-01T00:00:00Z\")",
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * For all import syntaxes, the "resource in question" can take any of the following forms:
 *
 * * projects/{{project}}/locations/{{location}}/ekmConnections/{{name}}
 *
 * * {{project}}/{{location}}/{{name}}
 *
 * * {{location}}/{{name}}
 *
 * Any variables not passed in the import command will be taken from the provider configuration.
 *
 * Cloud Key Management Service ekmconnection IAM resources can be imported using the resource identifiers, role, and member.
 *
 * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
 *
 * ```sh
 * $ pulumi import gcp:kms/ekmConnectionIamPolicy:EkmConnectionIamPolicy editor "projects/{{project}}/locations/{{location}}/ekmConnections/{{ekm_connection}} roles/viewer user:jane@example.com"
 * ```
 *
 * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
 *
 * ```sh
 * $ pulumi import gcp:kms/ekmConnectionIamPolicy:EkmConnectionIamPolicy editor "projects/{{project}}/locations/{{location}}/ekmConnections/{{ekm_connection}} roles/viewer"
 * ```
 *
 * IAM policy imports use the identifier of the resource in question, e.g.
 *
 * ```sh
 * $ pulumi import gcp:kms/ekmConnectionIamPolicy:EkmConnectionIamPolicy editor projects/{{project}}/locations/{{location}}/ekmConnections/{{ekm_connection}}
 * ```
 *
 * -> **Custom Roles** If you're importing a IAM resource with a custom role, make sure to use the
 *
 *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
 */
export class EkmConnectionIamPolicy extends pulumi.CustomResource {
    /**
     * Get an existing EkmConnectionIamPolicy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: EkmConnectionIamPolicyState, opts?: pulumi.CustomResourceOptions): EkmConnectionIamPolicy {
        return new EkmConnectionIamPolicy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:kms/ekmConnectionIamPolicy:EkmConnectionIamPolicy';

    /**
     * Returns true if the given object is an instance of EkmConnectionIamPolicy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is EkmConnectionIamPolicy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === EkmConnectionIamPolicy.__pulumiType;
    }

    /**
     * (Computed) The etag of the IAM policy.
     */
    public /*out*/ readonly etag!: pulumi.Output<string>;
    /**
     * The location for the EkmConnection.
     * A full list of valid locations can be found by running `gcloud kms locations list`.
     * Used to find the parent resource to bind the IAM policy to. If not specified,
     * the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
     * location is specified, it is taken from the provider configuration.
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * Used to find the parent resource to bind the IAM policy to
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     */
    public readonly policyData!: pulumi.Output<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     */
    public readonly project!: pulumi.Output<string>;

    /**
     * Create a EkmConnectionIamPolicy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: EkmConnectionIamPolicyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: EkmConnectionIamPolicyArgs | EkmConnectionIamPolicyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as EkmConnectionIamPolicyState | undefined;
            resourceInputs["etag"] = state ? state.etag : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["policyData"] = state ? state.policyData : undefined;
            resourceInputs["project"] = state ? state.project : undefined;
        } else {
            const args = argsOrState as EkmConnectionIamPolicyArgs | undefined;
            if ((!args || args.policyData === undefined) && !opts.urn) {
                throw new Error("Missing required property 'policyData'");
            }
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["policyData"] = args ? args.policyData : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["etag"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(EkmConnectionIamPolicy.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering EkmConnectionIamPolicy resources.
 */
export interface EkmConnectionIamPolicyState {
    /**
     * (Computed) The etag of the IAM policy.
     */
    etag?: pulumi.Input<string>;
    /**
     * The location for the EkmConnection.
     * A full list of valid locations can be found by running `gcloud kms locations list`.
     * Used to find the parent resource to bind the IAM policy to. If not specified,
     * the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
     * location is specified, it is taken from the provider configuration.
     */
    location?: pulumi.Input<string>;
    /**
     * Used to find the parent resource to bind the IAM policy to
     */
    name?: pulumi.Input<string>;
    /**
     * The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     */
    policyData?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     */
    project?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a EkmConnectionIamPolicy resource.
 */
export interface EkmConnectionIamPolicyArgs {
    /**
     * The location for the EkmConnection.
     * A full list of valid locations can be found by running `gcloud kms locations list`.
     * Used to find the parent resource to bind the IAM policy to. If not specified,
     * the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
     * location is specified, it is taken from the provider configuration.
     */
    location?: pulumi.Input<string>;
    /**
     * Used to find the parent resource to bind the IAM policy to
     */
    name?: pulumi.Input<string>;
    /**
     * The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     */
    policyData: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     */
    project?: pulumi.Input<string>;
}
