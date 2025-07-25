// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Three different resources help you manage your IAM policy for Healthcare DICOM store. Each of these resources serves a different use case:
 *
 * * `gcp.healthcare.DicomStoreIamPolicy`: Authoritative. Sets the IAM policy for the DICOM store and replaces any existing policy already attached.
 * * `gcp.healthcare.DicomStoreIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the DICOM store are preserved.
 * * `gcp.healthcare.DicomStoreIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the DICOM store are preserved.
 *
 * > **Note:** `gcp.healthcare.DicomStoreIamPolicy` **cannot** be used in conjunction with `gcp.healthcare.DicomStoreIamBinding` and `gcp.healthcare.DicomStoreIamMember` or they will fight over what your policy should be.
 *
 * > **Note:** `gcp.healthcare.DicomStoreIamBinding` resources **can be** used in conjunction with `gcp.healthcare.DicomStoreIamMember` resources **only if** they do not grant privilege to the same role.
 *
 * ## gcp.healthcare.DicomStoreIamPolicy
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
 * const dicomStore = new gcp.healthcare.DicomStoreIamPolicy("dicom_store", {
 *     dicomStoreId: "your-dicom-store-id",
 *     policyData: admin.then(admin => admin.policyData),
 * });
 * ```
 *
 * ## gcp.healthcare.DicomStoreIamBinding
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const dicomStore = new gcp.healthcare.DicomStoreIamBinding("dicom_store", {
 *     dicomStoreId: "your-dicom-store-id",
 *     role: "roles/editor",
 *     members: ["user:jane@example.com"],
 * });
 * ```
 *
 * ## gcp.healthcare.DicomStoreIamMember
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const dicomStore = new gcp.healthcare.DicomStoreIamMember("dicom_store", {
 *     dicomStoreId: "your-dicom-store-id",
 *     role: "roles/editor",
 *     member: "user:jane@example.com",
 * });
 * ```
 *
 * ## gcp.healthcare.DicomStoreIamBinding
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const dicomStore = new gcp.healthcare.DicomStoreIamBinding("dicom_store", {
 *     dicomStoreId: "your-dicom-store-id",
 *     role: "roles/editor",
 *     members: ["user:jane@example.com"],
 * });
 * ```
 *
 * ## gcp.healthcare.DicomStoreIamMember
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const dicomStore = new gcp.healthcare.DicomStoreIamMember("dicom_store", {
 *     dicomStoreId: "your-dicom-store-id",
 *     role: "roles/editor",
 *     member: "user:jane@example.com",
 * });
 * ```
 *
 * ## Import
 *
 * ### Importing IAM policies
 *
 * IAM policy imports use the identifier of the Healthcare DICOM store resource. For example:
 *
 * * `"{{project_id}}/{{location}}/{{dataset}}/{{dicom_store}}"`
 *
 * An `import` block (Terraform v1.5.0 and later) can be used to import IAM policies:
 *
 * tf
 *
 * import {
 *
 *   id = "{{project_id}}/{{location}}/{{dataset}}/{{dicom_store}}"
 *
 *   to = google_healthcare_dicom_store_iam_policy.default
 *
 * }
 *
 * The `pulumi import` command can also be used:
 *
 * ```sh
 * $ pulumi import gcp:healthcare/dicomStoreIamBinding:DicomStoreIamBinding default {{project_id}}/{{location}}/{{dataset}}/{{dicom_store}}
 * ```
 */
export class DicomStoreIamBinding extends pulumi.CustomResource {
    /**
     * Get an existing DicomStoreIamBinding resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DicomStoreIamBindingState, opts?: pulumi.CustomResourceOptions): DicomStoreIamBinding {
        return new DicomStoreIamBinding(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:healthcare/dicomStoreIamBinding:DicomStoreIamBinding';

    /**
     * Returns true if the given object is an instance of DicomStoreIamBinding.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DicomStoreIamBinding {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DicomStoreIamBinding.__pulumiType;
    }

    public readonly condition!: pulumi.Output<outputs.healthcare.DicomStoreIamBindingCondition | undefined>;
    /**
     * The DICOM store ID, in the form
     * `{project_id}/{location_name}/{dataset_name}/{dicom_store_name}` or
     * `{location_name}/{dataset_name}/{dicom_store_name}`. In the second form, the provider's
     * project setting will be used as a fallback.
     */
    public readonly dicomStoreId!: pulumi.Output<string>;
    /**
     * (Computed) The etag of the DICOM store's IAM policy.
     */
    public /*out*/ readonly etag!: pulumi.Output<string>;
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
     * The role that should be applied. Only one
     * `gcp.healthcare.DicomStoreIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     */
    public readonly role!: pulumi.Output<string>;

    /**
     * Create a DicomStoreIamBinding resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DicomStoreIamBindingArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DicomStoreIamBindingArgs | DicomStoreIamBindingState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DicomStoreIamBindingState | undefined;
            resourceInputs["condition"] = state ? state.condition : undefined;
            resourceInputs["dicomStoreId"] = state ? state.dicomStoreId : undefined;
            resourceInputs["etag"] = state ? state.etag : undefined;
            resourceInputs["members"] = state ? state.members : undefined;
            resourceInputs["role"] = state ? state.role : undefined;
        } else {
            const args = argsOrState as DicomStoreIamBindingArgs | undefined;
            if ((!args || args.dicomStoreId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'dicomStoreId'");
            }
            if ((!args || args.members === undefined) && !opts.urn) {
                throw new Error("Missing required property 'members'");
            }
            if ((!args || args.role === undefined) && !opts.urn) {
                throw new Error("Missing required property 'role'");
            }
            resourceInputs["condition"] = args ? args.condition : undefined;
            resourceInputs["dicomStoreId"] = args ? args.dicomStoreId : undefined;
            resourceInputs["members"] = args ? args.members : undefined;
            resourceInputs["role"] = args ? args.role : undefined;
            resourceInputs["etag"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(DicomStoreIamBinding.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DicomStoreIamBinding resources.
 */
export interface DicomStoreIamBindingState {
    condition?: pulumi.Input<inputs.healthcare.DicomStoreIamBindingCondition>;
    /**
     * The DICOM store ID, in the form
     * `{project_id}/{location_name}/{dataset_name}/{dicom_store_name}` or
     * `{location_name}/{dataset_name}/{dicom_store_name}`. In the second form, the provider's
     * project setting will be used as a fallback.
     */
    dicomStoreId?: pulumi.Input<string>;
    /**
     * (Computed) The etag of the DICOM store's IAM policy.
     */
    etag?: pulumi.Input<string>;
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
     * The role that should be applied. Only one
     * `gcp.healthcare.DicomStoreIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     */
    role?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a DicomStoreIamBinding resource.
 */
export interface DicomStoreIamBindingArgs {
    condition?: pulumi.Input<inputs.healthcare.DicomStoreIamBindingCondition>;
    /**
     * The DICOM store ID, in the form
     * `{project_id}/{location_name}/{dataset_name}/{dicom_store_name}` or
     * `{location_name}/{dataset_name}/{dicom_store_name}`. In the second form, the provider's
     * project setting will be used as a fallback.
     */
    dicomStoreId: pulumi.Input<string>;
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
     * The role that should be applied. Only one
     * `gcp.healthcare.DicomStoreIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     */
    role: pulumi.Input<string>;
}
