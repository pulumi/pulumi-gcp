// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Three different resources help you manage your IAM policy for Cloud Run Service. Each of these resources serves a different use case:
 *
 * * `gcp.cloudrun.IamPolicy`: Authoritative. Sets the IAM policy for the service and replaces any existing policy already attached.
 * * `gcp.cloudrun.IamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the service are preserved.
 * * `gcp.cloudrun.IamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the service are preserved.
 *
 * A data source can be used to retrieve policy data in advent you do not need creation
 *
 * * `gcp.cloudrun.IamPolicy`: Retrieves the IAM policy for the service
 *
 * > **Note:** `gcp.cloudrun.IamPolicy` **cannot** be used in conjunction with `gcp.cloudrun.IamBinding` and `gcp.cloudrun.IamMember` or they will fight over what your policy should be.
 *
 * > **Note:** `gcp.cloudrun.IamBinding` resources **can be** used in conjunction with `gcp.cloudrun.IamMember` resources **only if** they do not grant privilege to the same role.
 *
 * ## gcp.cloudrun.IamPolicy
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
 * const policy = new gcp.cloudrun.IamPolicy("policy", {
 *     location: _default.location,
 *     project: _default.project,
 *     service: _default.name,
 *     policyData: admin.then(admin => admin.policyData),
 * });
 * ```
 *
 * ## gcp.cloudrun.IamBinding
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const binding = new gcp.cloudrun.IamBinding("binding", {
 *     location: _default.location,
 *     project: _default.project,
 *     service: _default.name,
 *     role: "roles/viewer",
 *     members: ["user:jane@example.com"],
 * });
 * ```
 *
 * ## gcp.cloudrun.IamMember
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const member = new gcp.cloudrun.IamMember("member", {
 *     location: _default.location,
 *     project: _default.project,
 *     service: _default.name,
 *     role: "roles/viewer",
 *     member: "user:jane@example.com",
 * });
 * ```
 *
 * ## This resource supports User Project Overrides.
 *
 * - 
 *
 * # IAM policy for Cloud Run Service
 * Three different resources help you manage your IAM policy for Cloud Run Service. Each of these resources serves a different use case:
 *
 * * `gcp.cloudrun.IamPolicy`: Authoritative. Sets the IAM policy for the service and replaces any existing policy already attached.
 * * `gcp.cloudrun.IamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the service are preserved.
 * * `gcp.cloudrun.IamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the service are preserved.
 *
 * A data source can be used to retrieve policy data in advent you do not need creation
 *
 * * `gcp.cloudrun.IamPolicy`: Retrieves the IAM policy for the service
 *
 * > **Note:** `gcp.cloudrun.IamPolicy` **cannot** be used in conjunction with `gcp.cloudrun.IamBinding` and `gcp.cloudrun.IamMember` or they will fight over what your policy should be.
 *
 * > **Note:** `gcp.cloudrun.IamBinding` resources **can be** used in conjunction with `gcp.cloudrun.IamMember` resources **only if** they do not grant privilege to the same role.
 *
 * ## gcp.cloudrun.IamPolicy
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
 * const policy = new gcp.cloudrun.IamPolicy("policy", {
 *     location: _default.location,
 *     project: _default.project,
 *     service: _default.name,
 *     policyData: admin.then(admin => admin.policyData),
 * });
 * ```
 *
 * ## gcp.cloudrun.IamBinding
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const binding = new gcp.cloudrun.IamBinding("binding", {
 *     location: _default.location,
 *     project: _default.project,
 *     service: _default.name,
 *     role: "roles/viewer",
 *     members: ["user:jane@example.com"],
 * });
 * ```
 *
 * ## gcp.cloudrun.IamMember
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const member = new gcp.cloudrun.IamMember("member", {
 *     location: _default.location,
 *     project: _default.project,
 *     service: _default.name,
 *     role: "roles/viewer",
 *     member: "user:jane@example.com",
 * });
 * ```
 *
 * ## Import
 *
 * For all import syntaxes, the "resource in question" can take any of the following forms:
 *
 * * projects/{{project}}/locations/{{location}}/services/{{service}}
 *
 * * {{project}}/{{location}}/{{service}}
 *
 * * {{location}}/{{service}}
 *
 * * {{service}}
 *
 * Any variables not passed in the import command will be taken from the provider configuration.
 *
 * Cloud Run service IAM resources can be imported using the resource identifiers, role, and member.
 *
 * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
 *
 * ```sh
 * $ pulumi import gcp:cloudrun/iamMember:IamMember editor "projects/{{project}}/locations/{{location}}/services/{{service}} roles/viewer user:jane@example.com"
 * ```
 *
 * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
 *
 * ```sh
 * $ pulumi import gcp:cloudrun/iamMember:IamMember editor "projects/{{project}}/locations/{{location}}/services/{{service}} roles/viewer"
 * ```
 *
 * IAM policy imports use the identifier of the resource in question, e.g.
 *
 * ```sh
 * $ pulumi import gcp:cloudrun/iamMember:IamMember editor projects/{{project}}/locations/{{location}}/services/{{service}}
 * ```
 *
 * -> **Custom Roles** If you're importing a IAM resource with a custom role, make sure to use the
 *
 *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
 */
export class IamMember extends pulumi.CustomResource {
    /**
     * Get an existing IamMember resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: IamMemberState, opts?: pulumi.CustomResourceOptions): IamMember {
        return new IamMember(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:cloudrun/iamMember:IamMember';

    /**
     * Returns true if the given object is an instance of IamMember.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is IamMember {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === IamMember.__pulumiType;
    }

    public readonly condition!: pulumi.Output<outputs.cloudrun.IamMemberCondition | undefined>;
    /**
     * (Computed) The etag of the IAM policy.
     */
    public /*out*/ readonly etag!: pulumi.Output<string>;
    /**
     * The location of the cloud run instance. eg us-central1 Used to find the parent resource to bind the IAM policy to. If not specified,
     * the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
     * location is specified, it is taken from the provider configuration.
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * Identities that will be granted the privilege in `role`.
     * Each entry can have one of the following values:
     * * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
     * * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
     * * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
     * * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
     * * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
     * * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
     * * **projectOwner:projectid**: Owners of the given project. For example, "projectOwner:my-example-project"
     * * **projectEditor:projectid**: Editors of the given project. For example, "projectEditor:my-example-project"
     * * **projectViewer:projectid**: Viewers of the given project. For example, "projectViewer:my-example-project"
     */
    public readonly member!: pulumi.Output<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     */
    public readonly project!: pulumi.Output<string>;
    /**
     * The role that should be applied. Only one
     * `gcp.cloudrun.IamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     */
    public readonly role!: pulumi.Output<string>;
    /**
     * Used to find the parent resource to bind the IAM policy to
     */
    public readonly service!: pulumi.Output<string>;

    /**
     * Create a IamMember resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: IamMemberArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: IamMemberArgs | IamMemberState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as IamMemberState | undefined;
            resourceInputs["condition"] = state ? state.condition : undefined;
            resourceInputs["etag"] = state ? state.etag : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["member"] = state ? state.member : undefined;
            resourceInputs["project"] = state ? state.project : undefined;
            resourceInputs["role"] = state ? state.role : undefined;
            resourceInputs["service"] = state ? state.service : undefined;
        } else {
            const args = argsOrState as IamMemberArgs | undefined;
            if ((!args || args.member === undefined) && !opts.urn) {
                throw new Error("Missing required property 'member'");
            }
            if ((!args || args.role === undefined) && !opts.urn) {
                throw new Error("Missing required property 'role'");
            }
            if ((!args || args.service === undefined) && !opts.urn) {
                throw new Error("Missing required property 'service'");
            }
            resourceInputs["condition"] = args ? args.condition : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["member"] = args ? args.member : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["role"] = args ? args.role : undefined;
            resourceInputs["service"] = args ? args.service : undefined;
            resourceInputs["etag"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(IamMember.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering IamMember resources.
 */
export interface IamMemberState {
    condition?: pulumi.Input<inputs.cloudrun.IamMemberCondition>;
    /**
     * (Computed) The etag of the IAM policy.
     */
    etag?: pulumi.Input<string>;
    /**
     * The location of the cloud run instance. eg us-central1 Used to find the parent resource to bind the IAM policy to. If not specified,
     * the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
     * location is specified, it is taken from the provider configuration.
     */
    location?: pulumi.Input<string>;
    /**
     * Identities that will be granted the privilege in `role`.
     * Each entry can have one of the following values:
     * * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
     * * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
     * * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
     * * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
     * * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
     * * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
     * * **projectOwner:projectid**: Owners of the given project. For example, "projectOwner:my-example-project"
     * * **projectEditor:projectid**: Editors of the given project. For example, "projectEditor:my-example-project"
     * * **projectViewer:projectid**: Viewers of the given project. For example, "projectViewer:my-example-project"
     */
    member?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * The role that should be applied. Only one
     * `gcp.cloudrun.IamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     */
    role?: pulumi.Input<string>;
    /**
     * Used to find the parent resource to bind the IAM policy to
     */
    service?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a IamMember resource.
 */
export interface IamMemberArgs {
    condition?: pulumi.Input<inputs.cloudrun.IamMemberCondition>;
    /**
     * The location of the cloud run instance. eg us-central1 Used to find the parent resource to bind the IAM policy to. If not specified,
     * the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
     * location is specified, it is taken from the provider configuration.
     */
    location?: pulumi.Input<string>;
    /**
     * Identities that will be granted the privilege in `role`.
     * Each entry can have one of the following values:
     * * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
     * * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
     * * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
     * * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
     * * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
     * * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
     * * **projectOwner:projectid**: Owners of the given project. For example, "projectOwner:my-example-project"
     * * **projectEditor:projectid**: Editors of the given project. For example, "projectEditor:my-example-project"
     * * **projectViewer:projectid**: Viewers of the given project. For example, "projectViewer:my-example-project"
     */
    member: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * The role that should be applied. Only one
     * `gcp.cloudrun.IamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     */
    role: pulumi.Input<string>;
    /**
     * Used to find the parent resource to bind the IAM policy to
     */
    service: pulumi.Input<string>;
}
