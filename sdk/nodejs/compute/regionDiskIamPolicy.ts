// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Three different resources help you manage your IAM policy for Compute Engine RegionDisk. Each of these resources serves a different use case:
 *
 * * `gcp.compute.RegionDiskIamPolicy`: Authoritative. Sets the IAM policy for the regiondisk and replaces any existing policy already attached.
 * * `gcp.compute.RegionDiskIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the regiondisk are preserved.
 * * `gcp.compute.RegionDiskIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the regiondisk are preserved.
 *
 * A data source can be used to retrieve policy data in advent you do not need creation
 *
 * * `gcp.compute.RegionDiskIamPolicy`: Retrieves the IAM policy for the regiondisk
 *
 * > **Note:** `gcp.compute.RegionDiskIamPolicy` **cannot** be used in conjunction with `gcp.compute.RegionDiskIamBinding` and `gcp.compute.RegionDiskIamMember` or they will fight over what your policy should be.
 *
 * > **Note:** `gcp.compute.RegionDiskIamBinding` resources **can be** used in conjunction with `gcp.compute.RegionDiskIamMember` resources **only if** they do not grant privilege to the same role.
 *
 * ## gcp.compute.RegionDiskIamPolicy
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
 * const policy = new gcp.compute.RegionDiskIamPolicy("policy", {
 *     project: regiondisk.project,
 *     region: regiondisk.region,
 *     name: regiondisk.name,
 *     policyData: admin.then(admin => admin.policyData),
 * });
 * ```
 *
 * ## gcp.compute.RegionDiskIamBinding
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const binding = new gcp.compute.RegionDiskIamBinding("binding", {
 *     project: regiondisk.project,
 *     region: regiondisk.region,
 *     name: regiondisk.name,
 *     role: "roles/viewer",
 *     members: ["user:jane@example.com"],
 * });
 * ```
 *
 * ## gcp.compute.RegionDiskIamMember
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const member = new gcp.compute.RegionDiskIamMember("member", {
 *     project: regiondisk.project,
 *     region: regiondisk.region,
 *     name: regiondisk.name,
 *     role: "roles/viewer",
 *     member: "user:jane@example.com",
 * });
 * ```
 *
 * ## This resource supports User Project Overrides.
 *
 * - 
 *
 * # IAM policy for Compute Engine RegionDisk
 * Three different resources help you manage your IAM policy for Compute Engine RegionDisk. Each of these resources serves a different use case:
 *
 * * `gcp.compute.RegionDiskIamPolicy`: Authoritative. Sets the IAM policy for the regiondisk and replaces any existing policy already attached.
 * * `gcp.compute.RegionDiskIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the regiondisk are preserved.
 * * `gcp.compute.RegionDiskIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the regiondisk are preserved.
 *
 * A data source can be used to retrieve policy data in advent you do not need creation
 *
 * * `gcp.compute.RegionDiskIamPolicy`: Retrieves the IAM policy for the regiondisk
 *
 * > **Note:** `gcp.compute.RegionDiskIamPolicy` **cannot** be used in conjunction with `gcp.compute.RegionDiskIamBinding` and `gcp.compute.RegionDiskIamMember` or they will fight over what your policy should be.
 *
 * > **Note:** `gcp.compute.RegionDiskIamBinding` resources **can be** used in conjunction with `gcp.compute.RegionDiskIamMember` resources **only if** they do not grant privilege to the same role.
 *
 * ## gcp.compute.RegionDiskIamPolicy
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
 * const policy = new gcp.compute.RegionDiskIamPolicy("policy", {
 *     project: regiondisk.project,
 *     region: regiondisk.region,
 *     name: regiondisk.name,
 *     policyData: admin.then(admin => admin.policyData),
 * });
 * ```
 *
 * ## gcp.compute.RegionDiskIamBinding
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const binding = new gcp.compute.RegionDiskIamBinding("binding", {
 *     project: regiondisk.project,
 *     region: regiondisk.region,
 *     name: regiondisk.name,
 *     role: "roles/viewer",
 *     members: ["user:jane@example.com"],
 * });
 * ```
 *
 * ## gcp.compute.RegionDiskIamMember
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const member = new gcp.compute.RegionDiskIamMember("member", {
 *     project: regiondisk.project,
 *     region: regiondisk.region,
 *     name: regiondisk.name,
 *     role: "roles/viewer",
 *     member: "user:jane@example.com",
 * });
 * ```
 *
 * ## Import
 *
 * For all import syntaxes, the "resource in question" can take any of the following forms:
 *
 * * projects/{{project}}/regions/{{region}}/disks/{{name}}
 *
 * * {{project}}/{{region}}/{{name}}
 *
 * * {{region}}/{{name}}
 *
 * * {{name}}
 *
 * Any variables not passed in the import command will be taken from the provider configuration.
 *
 * Compute Engine regiondisk IAM resources can be imported using the resource identifiers, role, and member.
 *
 * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
 *
 * ```sh
 * $ pulumi import gcp:compute/regionDiskIamPolicy:RegionDiskIamPolicy editor "projects/{{project}}/regions/{{region}}/disks/{{region_disk}} roles/viewer user:jane@example.com"
 * ```
 *
 * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
 *
 * ```sh
 * $ pulumi import gcp:compute/regionDiskIamPolicy:RegionDiskIamPolicy editor "projects/{{project}}/regions/{{region}}/disks/{{region_disk}} roles/viewer"
 * ```
 *
 * IAM policy imports use the identifier of the resource in question, e.g.
 *
 * ```sh
 * $ pulumi import gcp:compute/regionDiskIamPolicy:RegionDiskIamPolicy editor projects/{{project}}/regions/{{region}}/disks/{{region_disk}}
 * ```
 *
 * -> **Custom Roles** If you're importing a IAM resource with a custom role, make sure to use the
 *
 *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
 */
export class RegionDiskIamPolicy extends pulumi.CustomResource {
    /**
     * Get an existing RegionDiskIamPolicy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RegionDiskIamPolicyState, opts?: pulumi.CustomResourceOptions): RegionDiskIamPolicy {
        return new RegionDiskIamPolicy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:compute/regionDiskIamPolicy:RegionDiskIamPolicy';

    /**
     * Returns true if the given object is an instance of RegionDiskIamPolicy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is RegionDiskIamPolicy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === RegionDiskIamPolicy.__pulumiType;
    }

    /**
     * (Computed) The etag of the IAM policy.
     */
    public /*out*/ readonly etag!: pulumi.Output<string>;
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
     * A reference to the region where the disk resides. Used to find the parent resource to bind the IAM policy to. If not specified,
     * the value will be parsed from the identifier of the parent resource. If no region is provided in the parent identifier and no
     * region is specified, it is taken from the provider configuration.
     */
    public readonly region!: pulumi.Output<string>;

    /**
     * Create a RegionDiskIamPolicy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RegionDiskIamPolicyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RegionDiskIamPolicyArgs | RegionDiskIamPolicyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as RegionDiskIamPolicyState | undefined;
            resourceInputs["etag"] = state ? state.etag : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["policyData"] = state ? state.policyData : undefined;
            resourceInputs["project"] = state ? state.project : undefined;
            resourceInputs["region"] = state ? state.region : undefined;
        } else {
            const args = argsOrState as RegionDiskIamPolicyArgs | undefined;
            if ((!args || args.policyData === undefined) && !opts.urn) {
                throw new Error("Missing required property 'policyData'");
            }
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["policyData"] = args ? args.policyData : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["region"] = args ? args.region : undefined;
            resourceInputs["etag"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(RegionDiskIamPolicy.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering RegionDiskIamPolicy resources.
 */
export interface RegionDiskIamPolicyState {
    /**
     * (Computed) The etag of the IAM policy.
     */
    etag?: pulumi.Input<string>;
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
    /**
     * A reference to the region where the disk resides. Used to find the parent resource to bind the IAM policy to. If not specified,
     * the value will be parsed from the identifier of the parent resource. If no region is provided in the parent identifier and no
     * region is specified, it is taken from the provider configuration.
     */
    region?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a RegionDiskIamPolicy resource.
 */
export interface RegionDiskIamPolicyArgs {
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
    /**
     * A reference to the region where the disk resides. Used to find the parent resource to bind the IAM policy to. If not specified,
     * the value will be parsed from the identifier of the parent resource. If no region is provided in the parent identifier and no
     * region is specified, it is taken from the provider configuration.
     */
    region?: pulumi.Input<string>;
}
