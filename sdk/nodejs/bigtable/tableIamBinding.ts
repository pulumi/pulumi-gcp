// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Three different resources help you manage IAM policies on bigtable tables. Each of these resources serves a different use case:
 *
 * * `gcp.bigtable.TableIamPolicy`: Authoritative. Sets the IAM policy for the tables and replaces any existing policy already attached.
 * * `gcp.bigtable.TableIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the table are preserved.
 * * `gcp.bigtable.TableIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the table are preserved.
 *
 * > **Note:** `gcp.bigtable.TableIamPolicy` **cannot** be used in conjunction with `gcp.bigtable.TableIamBinding` and `gcp.bigtable.TableIamMember` or they will fight over what your policy should be. In addition, be careful not to accidentally unset ownership of the table as `gcp.bigtable.TableIamPolicy` replaces the entire policy.
 *
 * > **Note:** `gcp.bigtable.TableIamBinding` resources **can be** used in conjunction with `gcp.bigtable.TableIamMember` resources **only if** they do not grant privilege to the same role.
 *
 * ## gcp.bigtable.TableIamPolicy
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const admin = gcp.organizations.getIAMPolicy({
 *     bindings: [{
 *         role: "roles/bigtable.user",
 *         members: ["user:jane@example.com"],
 *     }],
 * });
 * const editor = new gcp.bigtable.TableIamPolicy("editor", {
 *     project: "your-project",
 *     instance: "your-bigtable-instance",
 *     table: "your-bigtable-table",
 *     policyData: admin.then(admin => admin.policyData),
 * });
 * ```
 *
 * ## gcp.bigtable.TableIamBinding
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const editor = new gcp.bigtable.TableIamBinding("editor", {
 *     table: "your-bigtable-table",
 *     instance: "your-bigtable-instance",
 *     role: "roles/bigtable.user",
 *     members: ["user:jane@example.com"],
 * });
 * ```
 *
 * ## gcp.bigtable.TableIamMember
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const editor = new gcp.bigtable.TableIamMember("editor", {
 *     table: "your-bigtable-table",
 *     instance: "your-bigtable-instance",
 *     role: "roles/bigtable.user",
 *     member: "user:jane@example.com",
 * });
 * ```
 *
 * ## gcp.bigtable.TableIamPolicy
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const admin = gcp.organizations.getIAMPolicy({
 *     bindings: [{
 *         role: "roles/bigtable.user",
 *         members: ["user:jane@example.com"],
 *     }],
 * });
 * const editor = new gcp.bigtable.TableIamPolicy("editor", {
 *     project: "your-project",
 *     instance: "your-bigtable-instance",
 *     table: "your-bigtable-table",
 *     policyData: admin.then(admin => admin.policyData),
 * });
 * ```
 *
 * ## gcp.bigtable.TableIamBinding
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const editor = new gcp.bigtable.TableIamBinding("editor", {
 *     table: "your-bigtable-table",
 *     instance: "your-bigtable-instance",
 *     role: "roles/bigtable.user",
 *     members: ["user:jane@example.com"],
 * });
 * ```
 *
 * ## gcp.bigtable.TableIamMember
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const editor = new gcp.bigtable.TableIamMember("editor", {
 *     table: "your-bigtable-table",
 *     instance: "your-bigtable-instance",
 *     role: "roles/bigtable.user",
 *     member: "user:jane@example.com",
 * });
 * ```
 *
 * ## Import
 *
 * ### Importing IAM policies
 *
 * IAM policy imports use the `table` identifier of the Bigtable Table resource only. For example:
 *
 * * `"projects/{project}/instances/{instance}/tables/{table}"`
 *
 * An `import` block (Terraform v1.5.0 and later) can be used to import IAM policies:
 *
 * tf
 *
 * import {
 *
 *   id = "projects/{project}/instances/{instance}/tables/{table}"
 *
 *   to = google_bigtable_table_iam_policy.default
 *
 * }
 *
 * The `pulumi import` command can also be used:
 *
 * ```sh
 * $ pulumi import gcp:bigtable/tableIamBinding:TableIamBinding default projects/{project}/instances/{instance}/tables/{table}
 * ```
 */
export class TableIamBinding extends pulumi.CustomResource {
    /**
     * Get an existing TableIamBinding resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TableIamBindingState, opts?: pulumi.CustomResourceOptions): TableIamBinding {
        return new TableIamBinding(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:bigtable/tableIamBinding:TableIamBinding';

    /**
     * Returns true if the given object is an instance of TableIamBinding.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is TableIamBinding {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === TableIamBinding.__pulumiType;
    }

    public readonly condition!: pulumi.Output<outputs.bigtable.TableIamBindingCondition | undefined>;
    /**
     * (Computed) The etag of the tables's IAM policy.
     */
    public /*out*/ readonly etag!: pulumi.Output<string>;
    /**
     * The name or relative resource id of the instance that owns the table.
     */
    public readonly instance!: pulumi.Output<string>;
    /**
     * Identities that will be granted the privilege in `role`.
     * Each entry can have one of the following values:
     * * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
     * * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
     * * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
     * * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
     * * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
     * * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
     */
    public readonly members!: pulumi.Output<string[]>;
    /**
     * The project in which the table belongs. If it
     * is not provided, this provider will use the provider default.
     */
    public readonly project!: pulumi.Output<string>;
    /**
     * The role that should be applied. Only one
     * `gcp.bigtable.TableIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`. Read more about roles [here](https://cloud.google.com/bigtable/docs/access-control#roles).
     *
     * `gcp.bigtable.TableIamPolicy` only:
     */
    public readonly role!: pulumi.Output<string>;
    /**
     * The name or relative resource id of the table to manage IAM policies for.
     *
     * For `gcp.bigtable.TableIamMember` or `gcp.bigtable.TableIamBinding`:
     */
    public readonly table!: pulumi.Output<string>;

    /**
     * Create a TableIamBinding resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: TableIamBindingArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TableIamBindingArgs | TableIamBindingState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as TableIamBindingState | undefined;
            resourceInputs["condition"] = state ? state.condition : undefined;
            resourceInputs["etag"] = state ? state.etag : undefined;
            resourceInputs["instance"] = state ? state.instance : undefined;
            resourceInputs["members"] = state ? state.members : undefined;
            resourceInputs["project"] = state ? state.project : undefined;
            resourceInputs["role"] = state ? state.role : undefined;
            resourceInputs["table"] = state ? state.table : undefined;
        } else {
            const args = argsOrState as TableIamBindingArgs | undefined;
            if ((!args || args.instance === undefined) && !opts.urn) {
                throw new Error("Missing required property 'instance'");
            }
            if ((!args || args.members === undefined) && !opts.urn) {
                throw new Error("Missing required property 'members'");
            }
            if ((!args || args.role === undefined) && !opts.urn) {
                throw new Error("Missing required property 'role'");
            }
            if ((!args || args.table === undefined) && !opts.urn) {
                throw new Error("Missing required property 'table'");
            }
            resourceInputs["condition"] = args ? args.condition : undefined;
            resourceInputs["instance"] = args ? args.instance : undefined;
            resourceInputs["members"] = args ? args.members : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["role"] = args ? args.role : undefined;
            resourceInputs["table"] = args ? args.table : undefined;
            resourceInputs["etag"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(TableIamBinding.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering TableIamBinding resources.
 */
export interface TableIamBindingState {
    condition?: pulumi.Input<inputs.bigtable.TableIamBindingCondition>;
    /**
     * (Computed) The etag of the tables's IAM policy.
     */
    etag?: pulumi.Input<string>;
    /**
     * The name or relative resource id of the instance that owns the table.
     */
    instance?: pulumi.Input<string>;
    /**
     * Identities that will be granted the privilege in `role`.
     * Each entry can have one of the following values:
     * * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
     * * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
     * * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
     * * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
     * * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
     * * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
     */
    members?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The project in which the table belongs. If it
     * is not provided, this provider will use the provider default.
     */
    project?: pulumi.Input<string>;
    /**
     * The role that should be applied. Only one
     * `gcp.bigtable.TableIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`. Read more about roles [here](https://cloud.google.com/bigtable/docs/access-control#roles).
     *
     * `gcp.bigtable.TableIamPolicy` only:
     */
    role?: pulumi.Input<string>;
    /**
     * The name or relative resource id of the table to manage IAM policies for.
     *
     * For `gcp.bigtable.TableIamMember` or `gcp.bigtable.TableIamBinding`:
     */
    table?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a TableIamBinding resource.
 */
export interface TableIamBindingArgs {
    condition?: pulumi.Input<inputs.bigtable.TableIamBindingCondition>;
    /**
     * The name or relative resource id of the instance that owns the table.
     */
    instance: pulumi.Input<string>;
    /**
     * Identities that will be granted the privilege in `role`.
     * Each entry can have one of the following values:
     * * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
     * * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
     * * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
     * * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
     * * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
     * * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
     */
    members: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The project in which the table belongs. If it
     * is not provided, this provider will use the provider default.
     */
    project?: pulumi.Input<string>;
    /**
     * The role that should be applied. Only one
     * `gcp.bigtable.TableIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`. Read more about roles [here](https://cloud.google.com/bigtable/docs/access-control#roles).
     *
     * `gcp.bigtable.TableIamPolicy` only:
     */
    role: pulumi.Input<string>;
    /**
     * The name or relative resource id of the table to manage IAM policies for.
     *
     * For `gcp.bigtable.TableIamMember` or `gcp.bigtable.TableIamBinding`:
     */
    table: pulumi.Input<string>;
}
