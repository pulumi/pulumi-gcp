import * as pulumi from "@pulumi/pulumi";
/**
 * Allows management of a customized Cloud IAM organization role. For more information see
 * [the official documentation](https://cloud.google.com/iam/docs/understanding-custom-roles)
 * and
 * [API](https://cloud.google.com/iam/reference/rest/v1/organizations.roles).
 *
 * > **Warning:** Note that custom roles in GCP have the concept of a soft-delete. There are two issues that may arise
 *  from this and how roles are propagated. 1) creating a role may involve undeleting and then updating a role with the
 *  same name, possibly causing confusing behavior between undelete and update. 2) A deleted role is permanently deleted
 *  after 7 days, but it can take up to 30 more days (i.e. between 7 and 37 days after deletion) before the role name is
 *  made available again. This means a deleted role that has been deleted for more than 7 days cannot be changed at all
 *  by Terraform, and new roles cannot share that name.
 *
 * ## Example Usage
 *
 * This snippet creates a customized IAM organization role.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const my_custom_role = new gcp.organizations.IAMCustomRole("my-custom-role", {
 *     description: "A description",
 *     orgId: "123456789",
 *     permissions: [
 *         "iam.roles.list",
 *         "iam.roles.create",
 *         "iam.roles.delete",
 *     ],
 *     roleId: "myCustomRole",
 *     title: "My Custom Role",
 * });
 * ```
 */
export declare class IAMCustomRole extends pulumi.CustomResource {
    /**
     * Get an existing IAMCustomRole resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: IAMCustomRoleState, opts?: pulumi.CustomResourceOptions): IAMCustomRole;
    /**
     * (Optional) The current deleted state of the role.
     */
    readonly deleted: pulumi.Output<boolean>;
    /**
     * A human-readable description for the role.
     */
    readonly description: pulumi.Output<string | undefined>;
    /**
     * The numeric ID of the organization in which you want to create a custom role.
     */
    readonly orgId: pulumi.Output<string>;
    /**
     * The names of the permissions this role grants when bound in an IAM policy. At least one permission must be specified.
     */
    readonly permissions: pulumi.Output<string[]>;
    /**
     * The role id to use for this role.
     */
    readonly roleId: pulumi.Output<string>;
    /**
     * The current launch stage of the role.
     * Defaults to `GA`.
     * List of possible stages is [here](https://cloud.google.com/iam/reference/rest/v1/organizations.roles#Role.RoleLaunchStage).
     */
    readonly stage: pulumi.Output<string | undefined>;
    /**
     * A human-readable title for the role.
     */
    readonly title: pulumi.Output<string>;
    /**
     * Create a IAMCustomRole resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: IAMCustomRoleArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering IAMCustomRole resources.
 */
export interface IAMCustomRoleState {
    /**
     * (Optional) The current deleted state of the role.
     */
    readonly deleted?: pulumi.Input<boolean>;
    /**
     * A human-readable description for the role.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * The numeric ID of the organization in which you want to create a custom role.
     */
    readonly orgId?: pulumi.Input<string>;
    /**
     * The names of the permissions this role grants when bound in an IAM policy. At least one permission must be specified.
     */
    readonly permissions?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The role id to use for this role.
     */
    readonly roleId?: pulumi.Input<string>;
    /**
     * The current launch stage of the role.
     * Defaults to `GA`.
     * List of possible stages is [here](https://cloud.google.com/iam/reference/rest/v1/organizations.roles#Role.RoleLaunchStage).
     */
    readonly stage?: pulumi.Input<string>;
    /**
     * A human-readable title for the role.
     */
    readonly title?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a IAMCustomRole resource.
 */
export interface IAMCustomRoleArgs {
    /**
     * A human-readable description for the role.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * The numeric ID of the organization in which you want to create a custom role.
     */
    readonly orgId: pulumi.Input<string>;
    /**
     * The names of the permissions this role grants when bound in an IAM policy. At least one permission must be specified.
     */
    readonly permissions: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The role id to use for this role.
     */
    readonly roleId: pulumi.Input<string>;
    /**
     * The current launch stage of the role.
     * Defaults to `GA`.
     * List of possible stages is [here](https://cloud.google.com/iam/reference/rest/v1/organizations.roles#Role.RoleLaunchStage).
     */
    readonly stage?: pulumi.Input<string>;
    /**
     * A human-readable title for the role.
     */
    readonly title: pulumi.Input<string>;
}
