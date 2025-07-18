// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Three different resources help you manage your IAM policy for BigQuery Data Policy DataPolicy. Each of these resources serves a different use case:
 *
 * * `gcp.bigquerydatapolicy.DataPolicyIamPolicy`: Authoritative. Sets the IAM policy for the datapolicy and replaces any existing policy already attached.
 * * `gcp.bigquerydatapolicy.DataPolicyIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the datapolicy are preserved.
 * * `gcp.bigquerydatapolicy.DataPolicyIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the datapolicy are preserved.
 *
 * A data source can be used to retrieve policy data in advent you do not need creation
 *
 * * `gcp.bigquerydatapolicy.DataPolicyIamPolicy`: Retrieves the IAM policy for the datapolicy
 *
 * > **Note:** `gcp.bigquerydatapolicy.DataPolicyIamPolicy` **cannot** be used in conjunction with `gcp.bigquerydatapolicy.DataPolicyIamBinding` and `gcp.bigquerydatapolicy.DataPolicyIamMember` or they will fight over what your policy should be.
 *
 * > **Note:** `gcp.bigquerydatapolicy.DataPolicyIamBinding` resources **can be** used in conjunction with `gcp.bigquerydatapolicy.DataPolicyIamMember` resources **only if** they do not grant privilege to the same role.
 *
 * ## gcp.bigquerydatapolicy.DataPolicyIamPolicy
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
 * const policy = new gcp.bigquerydatapolicy.DataPolicyIamPolicy("policy", {
 *     project: dataPolicy.project,
 *     location: dataPolicy.location,
 *     dataPolicyId: dataPolicy.dataPolicyId,
 *     policyData: admin.then(admin => admin.policyData),
 * });
 * ```
 *
 * ## gcp.bigquerydatapolicy.DataPolicyIamBinding
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const binding = new gcp.bigquerydatapolicy.DataPolicyIamBinding("binding", {
 *     project: dataPolicy.project,
 *     location: dataPolicy.location,
 *     dataPolicyId: dataPolicy.dataPolicyId,
 *     role: "roles/viewer",
 *     members: ["user:jane@example.com"],
 * });
 * ```
 *
 * ## gcp.bigquerydatapolicy.DataPolicyIamMember
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const member = new gcp.bigquerydatapolicy.DataPolicyIamMember("member", {
 *     project: dataPolicy.project,
 *     location: dataPolicy.location,
 *     dataPolicyId: dataPolicy.dataPolicyId,
 *     role: "roles/viewer",
 *     member: "user:jane@example.com",
 * });
 * ```
 *
 * ## This resource supports User Project Overrides.
 *
 * - 
 *
 * # IAM policy for BigQuery Data Policy DataPolicy
 * Three different resources help you manage your IAM policy for BigQuery Data Policy DataPolicy. Each of these resources serves a different use case:
 *
 * * `gcp.bigquerydatapolicy.DataPolicyIamPolicy`: Authoritative. Sets the IAM policy for the datapolicy and replaces any existing policy already attached.
 * * `gcp.bigquerydatapolicy.DataPolicyIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the datapolicy are preserved.
 * * `gcp.bigquerydatapolicy.DataPolicyIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the datapolicy are preserved.
 *
 * A data source can be used to retrieve policy data in advent you do not need creation
 *
 * * `gcp.bigquerydatapolicy.DataPolicyIamPolicy`: Retrieves the IAM policy for the datapolicy
 *
 * > **Note:** `gcp.bigquerydatapolicy.DataPolicyIamPolicy` **cannot** be used in conjunction with `gcp.bigquerydatapolicy.DataPolicyIamBinding` and `gcp.bigquerydatapolicy.DataPolicyIamMember` or they will fight over what your policy should be.
 *
 * > **Note:** `gcp.bigquerydatapolicy.DataPolicyIamBinding` resources **can be** used in conjunction with `gcp.bigquerydatapolicy.DataPolicyIamMember` resources **only if** they do not grant privilege to the same role.
 *
 * ## gcp.bigquerydatapolicy.DataPolicyIamPolicy
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
 * const policy = new gcp.bigquerydatapolicy.DataPolicyIamPolicy("policy", {
 *     project: dataPolicy.project,
 *     location: dataPolicy.location,
 *     dataPolicyId: dataPolicy.dataPolicyId,
 *     policyData: admin.then(admin => admin.policyData),
 * });
 * ```
 *
 * ## gcp.bigquerydatapolicy.DataPolicyIamBinding
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const binding = new gcp.bigquerydatapolicy.DataPolicyIamBinding("binding", {
 *     project: dataPolicy.project,
 *     location: dataPolicy.location,
 *     dataPolicyId: dataPolicy.dataPolicyId,
 *     role: "roles/viewer",
 *     members: ["user:jane@example.com"],
 * });
 * ```
 *
 * ## gcp.bigquerydatapolicy.DataPolicyIamMember
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const member = new gcp.bigquerydatapolicy.DataPolicyIamMember("member", {
 *     project: dataPolicy.project,
 *     location: dataPolicy.location,
 *     dataPolicyId: dataPolicy.dataPolicyId,
 *     role: "roles/viewer",
 *     member: "user:jane@example.com",
 * });
 * ```
 *
 * ## Import
 *
 * For all import syntaxes, the "resource in question" can take any of the following forms:
 *
 * * projects/{{project}}/locations/{{location}}/dataPolicies/{{data_policy_id}}
 *
 * * {{project}}/{{location}}/{{data_policy_id}}
 *
 * * {{location}}/{{data_policy_id}}
 *
 * * {{data_policy_id}}
 *
 * Any variables not passed in the import command will be taken from the provider configuration.
 *
 * BigQuery Data Policy datapolicy IAM resources can be imported using the resource identifiers, role, and member.
 *
 * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
 *
 * ```sh
 * $ pulumi import gcp:bigquerydatapolicy/dataPolicyIamPolicy:DataPolicyIamPolicy editor "projects/{{project}}/locations/{{location}}/dataPolicies/{{data_policy_id}} roles/viewer user:jane@example.com"
 * ```
 *
 * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
 *
 * ```sh
 * $ pulumi import gcp:bigquerydatapolicy/dataPolicyIamPolicy:DataPolicyIamPolicy editor "projects/{{project}}/locations/{{location}}/dataPolicies/{{data_policy_id}} roles/viewer"
 * ```
 *
 * IAM policy imports use the identifier of the resource in question, e.g.
 *
 * ```sh
 * $ pulumi import gcp:bigquerydatapolicy/dataPolicyIamPolicy:DataPolicyIamPolicy editor projects/{{project}}/locations/{{location}}/dataPolicies/{{data_policy_id}}
 * ```
 *
 * -> **Custom Roles** If you're importing a IAM resource with a custom role, make sure to use the
 *
 *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
 */
export class DataPolicyIamPolicy extends pulumi.CustomResource {
    /**
     * Get an existing DataPolicyIamPolicy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DataPolicyIamPolicyState, opts?: pulumi.CustomResourceOptions): DataPolicyIamPolicy {
        return new DataPolicyIamPolicy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:bigquerydatapolicy/dataPolicyIamPolicy:DataPolicyIamPolicy';

    /**
     * Returns true if the given object is an instance of DataPolicyIamPolicy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DataPolicyIamPolicy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DataPolicyIamPolicy.__pulumiType;
    }

    /**
     * Used to find the parent resource to bind the IAM policy to
     */
    public readonly dataPolicyId!: pulumi.Output<string>;
    /**
     * (Computed) The etag of the IAM policy.
     */
    public /*out*/ readonly etag!: pulumi.Output<string>;
    /**
     * The name of the location of the data policy.
     * Used to find the parent resource to bind the IAM policy to. If not specified,
     * the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
     * location is specified, it is taken from the provider configuration.
     */
    public readonly location!: pulumi.Output<string>;
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
     * Create a DataPolicyIamPolicy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DataPolicyIamPolicyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DataPolicyIamPolicyArgs | DataPolicyIamPolicyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DataPolicyIamPolicyState | undefined;
            resourceInputs["dataPolicyId"] = state ? state.dataPolicyId : undefined;
            resourceInputs["etag"] = state ? state.etag : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["policyData"] = state ? state.policyData : undefined;
            resourceInputs["project"] = state ? state.project : undefined;
        } else {
            const args = argsOrState as DataPolicyIamPolicyArgs | undefined;
            if ((!args || args.dataPolicyId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'dataPolicyId'");
            }
            if ((!args || args.policyData === undefined) && !opts.urn) {
                throw new Error("Missing required property 'policyData'");
            }
            resourceInputs["dataPolicyId"] = args ? args.dataPolicyId : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["policyData"] = args ? args.policyData : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["etag"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(DataPolicyIamPolicy.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DataPolicyIamPolicy resources.
 */
export interface DataPolicyIamPolicyState {
    /**
     * Used to find the parent resource to bind the IAM policy to
     */
    dataPolicyId?: pulumi.Input<string>;
    /**
     * (Computed) The etag of the IAM policy.
     */
    etag?: pulumi.Input<string>;
    /**
     * The name of the location of the data policy.
     * Used to find the parent resource to bind the IAM policy to. If not specified,
     * the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
     * location is specified, it is taken from the provider configuration.
     */
    location?: pulumi.Input<string>;
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
 * The set of arguments for constructing a DataPolicyIamPolicy resource.
 */
export interface DataPolicyIamPolicyArgs {
    /**
     * Used to find the parent resource to bind the IAM policy to
     */
    dataPolicyId: pulumi.Input<string>;
    /**
     * The name of the location of the data policy.
     * Used to find the parent resource to bind the IAM policy to. If not specified,
     * the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
     * location is specified, it is taken from the provider configuration.
     */
    location?: pulumi.Input<string>;
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
