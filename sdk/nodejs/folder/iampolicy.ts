// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Four different resources help you manage your IAM policy for a folder. Each of these resources serves a different use case:
 *
 * * `gcp.folder.IAMPolicy`: Authoritative. Sets the IAM policy for the folder and replaces any existing policy already attached.
 * * `gcp.folder.IAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the folder are preserved.
 * * `gcp.folder.IAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the folder are preserved.
 * * `gcp.folder.IamAuditConfig`: Authoritative for a given service. Updates the IAM policy to enable audit logging for the given service.
 *
 * > **Note:** `gcp.folder.IAMPolicy` **cannot** be used in conjunction with `gcp.folder.IAMBinding`, `gcp.folder.IAMMember`, or `gcp.folder.IamAuditConfig` or they will fight over what your policy should be.
 *
 * > **Note:** `gcp.folder.IAMBinding` resources **can be** used in conjunction with `gcp.folder.IAMMember` resources **only if** they do not grant privilege to the same role.
 *
 * > **Note:** The underlying API method `projects.setIamPolicy` has constraints which are documented [here](https://cloud.google.com/resource-manager/reference/rest/v1/projects/setIamPolicy). In addition to these constraints,
 *    IAM Conditions cannot be used with Basic Roles such as Owner. Violating these constraints will result in the API returning a 400 error code so please review these if you encounter errors with this resource.
 *
 * ## gcp.folder.IAMPolicy
 *
 * !> **Be careful!** You can accidentally lock yourself out of your folder
 *    using this resource. Deleting a `gcp.folder.IAMPolicy` removes access
 *    from anyone without permissions on its parent folder/organization. Proceed with caution.
 *    It's not recommended to use `gcp.folder.IAMPolicy` with your provider folder
 *    to avoid locking yourself out, and it should generally only be used with folders
 *    fully managed by this provider. If you do use this resource, it is recommended to **import** the policy before
 *    applying the change.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const admin = gcp.organizations.getIAMPolicy({
 *     bindings: [{
 *         role: "roles/editor",
 *         members: ["user:jane@example.com"],
 *     }],
 * });
 * const folder = new gcp.folder.IAMPolicy("folder", {
 *     folder: "folders/1234567",
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
 *         role: "roles/compute.admin",
 *         members: ["user:jane@example.com"],
 *         condition: {
 *             title: "expires_after_2019_12_31",
 *             description: "Expiring at midnight of 2019-12-31",
 *             expression: "request.time < timestamp(\"2020-01-01T00:00:00Z\")",
 *         },
 *     }],
 * });
 * const folder = new gcp.folder.IAMPolicy("folder", {
 *     folder: "folders/1234567",
 *     policyData: admin.then(admin => admin.policyData),
 * });
 * ```
 *
 * ## gcp.folder.IAMBinding
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const folder = new gcp.folder.IAMBinding("folder", {
 *     folder: "folders/1234567",
 *     role: "roles/editor",
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
 * const folder = new gcp.folder.IAMBinding("folder", {
 *     folder: "folders/1234567",
 *     role: "roles/container.admin",
 *     members: ["user:jane@example.com"],
 *     condition: {
 *         title: "expires_after_2019_12_31",
 *         description: "Expiring at midnight of 2019-12-31",
 *         expression: "request.time < timestamp(\"2020-01-01T00:00:00Z\")",
 *     },
 * });
 * ```
 *
 * ## gcp.folder.IAMMember
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const folder = new gcp.folder.IAMMember("folder", {
 *     folder: "folders/1234567",
 *     role: "roles/editor",
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
 * const folder = new gcp.folder.IAMMember("folder", {
 *     folder: "folders/1234567",
 *     role: "roles/firebase.admin",
 *     member: "user:jane@example.com",
 *     condition: {
 *         title: "expires_after_2019_12_31",
 *         description: "Expiring at midnight of 2019-12-31",
 *         expression: "request.time < timestamp(\"2020-01-01T00:00:00Z\")",
 *     },
 * });
 * ```
 *
 * ## gcp.folder.IamAuditConfig
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const folder = new gcp.folder.IamAuditConfig("folder", {
 *     folder: "folders/1234567",
 *     service: "allServices",
 *     auditLogConfigs: [
 *         {
 *             logType: "ADMIN_READ",
 *         },
 *         {
 *             logType: "DATA_READ",
 *             exemptedMembers: ["user:joebloggs@example.com"],
 *         },
 *     ],
 * });
 * ```
 *
 * ## gcp.folder.IAMBinding
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const folder = new gcp.folder.IAMBinding("folder", {
 *     folder: "folders/1234567",
 *     role: "roles/editor",
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
 * const folder = new gcp.folder.IAMBinding("folder", {
 *     folder: "folders/1234567",
 *     role: "roles/container.admin",
 *     members: ["user:jane@example.com"],
 *     condition: {
 *         title: "expires_after_2019_12_31",
 *         description: "Expiring at midnight of 2019-12-31",
 *         expression: "request.time < timestamp(\"2020-01-01T00:00:00Z\")",
 *     },
 * });
 * ```
 *
 * ## gcp.folder.IAMMember
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const folder = new gcp.folder.IAMMember("folder", {
 *     folder: "folders/1234567",
 *     role: "roles/editor",
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
 * const folder = new gcp.folder.IAMMember("folder", {
 *     folder: "folders/1234567",
 *     role: "roles/firebase.admin",
 *     member: "user:jane@example.com",
 *     condition: {
 *         title: "expires_after_2019_12_31",
 *         description: "Expiring at midnight of 2019-12-31",
 *         expression: "request.time < timestamp(\"2020-01-01T00:00:00Z\")",
 *     },
 * });
 * ```
 *
 * ## gcp.folder.IamAuditConfig
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const folder = new gcp.folder.IamAuditConfig("folder", {
 *     folder: "folders/1234567",
 *     service: "allServices",
 *     auditLogConfigs: [
 *         {
 *             logType: "ADMIN_READ",
 *         },
 *         {
 *             logType: "DATA_READ",
 *             exemptedMembers: ["user:joebloggs@example.com"],
 *         },
 *     ],
 * });
 * ```
 *
 * ## Import
 *
 * ### Importing Audit Configs
 *
 * An audit config can be imported into a `google_folder_iam_audit_config` resource using the resource's `folder_id` and the `service`, e.g:
 *
 * * `"folder/{{folder_id}} foo.googleapis.com"`
 *
 * An `import` block (Terraform v1.5.0 and later) can be used to import audit configs:
 *
 * tf
 *
 * import {
 *
 *   id = "folder/{{folder_id}} foo.googleapis.com"
 *
 *   to = google_folder_iam_audit_config.default
 *
 * }
 *
 * The `pulumi import` command can also be used:
 *
 * ```sh
 * $ pulumi import gcp:folder/iAMPolicy:IAMPolicy default "folder/{{folder_id}} foo.googleapis.com"
 * ```
 */
export class IAMPolicy extends pulumi.CustomResource {
    /**
     * Get an existing IAMPolicy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: IAMPolicyState, opts?: pulumi.CustomResourceOptions): IAMPolicy {
        return new IAMPolicy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:folder/iAMPolicy:IAMPolicy';

    /**
     * Returns true if the given object is an instance of IAMPolicy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is IAMPolicy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === IAMPolicy.__pulumiType;
    }

    /**
     * (Computed) The etag of the folder's IAM policy.
     */
    public /*out*/ readonly etag!: pulumi.Output<string>;
    /**
     * The resource name of the folder the policy is attached to. Its format is folders/{folder_id}.
     */
    public readonly folder!: pulumi.Output<string>;
    /**
     * The `gcp.organizations.getIAMPolicy` data source that represents
     * the IAM policy that will be applied to the folder. The policy will be
     * merged with any existing policy applied to the folder.
     *
     * Changing this updates the policy.
     *
     * Deleting this removes all policies from the folder, locking out users without
     * folder-level access.
     */
    public readonly policyData!: pulumi.Output<string>;

    /**
     * Create a IAMPolicy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: IAMPolicyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: IAMPolicyArgs | IAMPolicyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as IAMPolicyState | undefined;
            resourceInputs["etag"] = state ? state.etag : undefined;
            resourceInputs["folder"] = state ? state.folder : undefined;
            resourceInputs["policyData"] = state ? state.policyData : undefined;
        } else {
            const args = argsOrState as IAMPolicyArgs | undefined;
            if ((!args || args.folder === undefined) && !opts.urn) {
                throw new Error("Missing required property 'folder'");
            }
            if ((!args || args.policyData === undefined) && !opts.urn) {
                throw new Error("Missing required property 'policyData'");
            }
            resourceInputs["folder"] = args ? args.folder : undefined;
            resourceInputs["policyData"] = args ? args.policyData : undefined;
            resourceInputs["etag"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(IAMPolicy.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering IAMPolicy resources.
 */
export interface IAMPolicyState {
    /**
     * (Computed) The etag of the folder's IAM policy.
     */
    etag?: pulumi.Input<string>;
    /**
     * The resource name of the folder the policy is attached to. Its format is folders/{folder_id}.
     */
    folder?: pulumi.Input<string>;
    /**
     * The `gcp.organizations.getIAMPolicy` data source that represents
     * the IAM policy that will be applied to the folder. The policy will be
     * merged with any existing policy applied to the folder.
     *
     * Changing this updates the policy.
     *
     * Deleting this removes all policies from the folder, locking out users without
     * folder-level access.
     */
    policyData?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a IAMPolicy resource.
 */
export interface IAMPolicyArgs {
    /**
     * The resource name of the folder the policy is attached to. Its format is folders/{folder_id}.
     */
    folder: pulumi.Input<string>;
    /**
     * The `gcp.organizations.getIAMPolicy` data source that represents
     * the IAM policy that will be applied to the folder. The policy will be
     * merged with any existing policy applied to the folder.
     *
     * Changing this updates the policy.
     *
     * Deleting this removes all policies from the folder, locking out users without
     * folder-level access.
     */
    policyData: pulumi.Input<string>;
}
