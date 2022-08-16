// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * Three different resources help you manage your IAM policy for GKEHub Membership. Each of these resources serves a different use case:
 *
 * * `gcp.gkehub.MembershipIamPolicy`: Authoritative. Sets the IAM policy for the membership and replaces any existing policy already attached.
 * * `gcp.gkehub.MembershipIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the membership are preserved.
 * * `gcp.gkehub.MembershipIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the membership are preserved.
 *
 * > **Note:** `gcp.gkehub.MembershipIamPolicy` **cannot** be used in conjunction with `gcp.gkehub.MembershipIamBinding` and `gcp.gkehub.MembershipIamMember` or they will fight over what your policy should be.
 *
 * > **Note:** `gcp.gkehub.MembershipIamBinding` resources **can be** used in conjunction with `gcp.gkehub.MembershipIamMember` resources **only if** they do not grant privilege to the same role.
 *
 * ## google\_gke\_hub\_membership\_iam\_policy
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
 * const policy = new gcp.gkehub.MembershipIamPolicy("policy", {
 *     project: google_gke_hub_membership.membership.project,
 *     membershipId: google_gke_hub_membership.membership.membership_id,
 *     policyData: admin.then(admin => admin.policyData),
 * });
 * ```
 *
 * ## google\_gke\_hub\_membership\_iam\_binding
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const binding = new gcp.gkehub.MembershipIamBinding("binding", {
 *     project: google_gke_hub_membership.membership.project,
 *     membershipId: google_gke_hub_membership.membership.membership_id,
 *     role: "roles/viewer",
 *     members: ["user:jane@example.com"],
 * });
 * ```
 *
 * ## google\_gke\_hub\_membership\_iam\_member
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const member = new gcp.gkehub.MembershipIamMember("member", {
 *     project: google_gke_hub_membership.membership.project,
 *     membershipId: google_gke_hub_membership.membership.membership_id,
 *     role: "roles/viewer",
 *     member: "user:jane@example.com",
 * });
 * ```
 *
 * ## Import
 *
 * For all import syntaxes, the "resource in question" can take any of the following forms* projects/{{project}}/locations/{{location}}/memberships/{{membership_id}} * {{project}}/{{location}}/{{membership_id}} * {{location}}/{{membership_id}} * {{membership_id}} Any variables not passed in the import command will be taken from the provider configuration. GKEHub membership IAM resources can be imported using the resource identifiers, role, and member. IAM member imports use space-delimited identifiersthe resource in question, the role, and the member identity, e.g.
 *
 * ```sh
 *  $ pulumi import gcp:gkehub/membershipIamBinding:MembershipIamBinding editor "projects/{{project}}/locations/{{location}}/memberships/{{membership_id}} roles/viewer user:jane@example.com"
 * ```
 *
 *  IAM binding imports use space-delimited identifiersthe resource in question and the role, e.g.
 *
 * ```sh
 *  $ pulumi import gcp:gkehub/membershipIamBinding:MembershipIamBinding editor "projects/{{project}}/locations/{{location}}/memberships/{{membership_id}} roles/viewer"
 * ```
 *
 *  IAM policy imports use the identifier of the resource in question, e.g.
 *
 * ```sh
 *  $ pulumi import gcp:gkehub/membershipIamBinding:MembershipIamBinding editor projects/{{project}}/locations/{{location}}/memberships/{{membership_id}}
 * ```
 *
 *  -> **Custom Roles**If you're importing a IAM resource with a custom role, make sure to use the
 *
 * full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
 */
export class MembershipIamBinding extends pulumi.CustomResource {
    /**
     * Get an existing MembershipIamBinding resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: MembershipIamBindingState, opts?: pulumi.CustomResourceOptions): MembershipIamBinding {
        return new MembershipIamBinding(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:gkehub/membershipIamBinding:MembershipIamBinding';

    /**
     * Returns true if the given object is an instance of MembershipIamBinding.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is MembershipIamBinding {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === MembershipIamBinding.__pulumiType;
    }

    public readonly condition!: pulumi.Output<outputs.gkehub.MembershipIamBindingCondition | undefined>;
    /**
     * (Computed) The etag of the IAM policy.
     */
    public /*out*/ readonly etag!: pulumi.Output<string>;
    public readonly members!: pulumi.Output<string[]>;
    public readonly membershipId!: pulumi.Output<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     */
    public readonly project!: pulumi.Output<string>;
    /**
     * The role that should be applied. Only one
     * `gcp.gkehub.MembershipIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     */
    public readonly role!: pulumi.Output<string>;

    /**
     * Create a MembershipIamBinding resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: MembershipIamBindingArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: MembershipIamBindingArgs | MembershipIamBindingState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as MembershipIamBindingState | undefined;
            resourceInputs["condition"] = state ? state.condition : undefined;
            resourceInputs["etag"] = state ? state.etag : undefined;
            resourceInputs["members"] = state ? state.members : undefined;
            resourceInputs["membershipId"] = state ? state.membershipId : undefined;
            resourceInputs["project"] = state ? state.project : undefined;
            resourceInputs["role"] = state ? state.role : undefined;
        } else {
            const args = argsOrState as MembershipIamBindingArgs | undefined;
            if ((!args || args.members === undefined) && !opts.urn) {
                throw new Error("Missing required property 'members'");
            }
            if ((!args || args.membershipId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'membershipId'");
            }
            if ((!args || args.role === undefined) && !opts.urn) {
                throw new Error("Missing required property 'role'");
            }
            resourceInputs["condition"] = args ? args.condition : undefined;
            resourceInputs["members"] = args ? args.members : undefined;
            resourceInputs["membershipId"] = args ? args.membershipId : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["role"] = args ? args.role : undefined;
            resourceInputs["etag"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(MembershipIamBinding.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering MembershipIamBinding resources.
 */
export interface MembershipIamBindingState {
    condition?: pulumi.Input<inputs.gkehub.MembershipIamBindingCondition>;
    /**
     * (Computed) The etag of the IAM policy.
     */
    etag?: pulumi.Input<string>;
    members?: pulumi.Input<pulumi.Input<string>[]>;
    membershipId?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * The role that should be applied. Only one
     * `gcp.gkehub.MembershipIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     */
    role?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a MembershipIamBinding resource.
 */
export interface MembershipIamBindingArgs {
    condition?: pulumi.Input<inputs.gkehub.MembershipIamBindingCondition>;
    members: pulumi.Input<pulumi.Input<string>[]>;
    membershipId: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * The role that should be applied. Only one
     * `gcp.gkehub.MembershipIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     */
    role: pulumi.Input<string>;
}