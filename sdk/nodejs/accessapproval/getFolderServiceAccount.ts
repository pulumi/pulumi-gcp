// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Get the email address of a folder's Access Approval service account.
 *
 * Each Google Cloud folder has a unique service account used by Access Approval.
 * When using Access Approval with a
 * [custom signing key](https://cloud.google.com/cloud-provider-access-management/access-approval/docs/review-approve-access-requests-custom-keys),
 * this account needs to be granted the `cloudkms.signerVerifier` IAM role on the
 * Cloud KMS key used to sign approvals.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const serviceAccount = gcp.accessapproval.getFolderServiceAccount({
 *     folderId: "my-folder",
 * });
 * const iam = new gcp.kms.CryptoKeyIAMMember("iam", {
 *     cryptoKeyId: cryptoKey.id,
 *     role: "roles/cloudkms.signerVerifier",
 *     member: serviceAccount.then(serviceAccount => `serviceAccount:${serviceAccount.accountEmail}`),
 * });
 * ```
 */
export function getFolderServiceAccount(args: GetFolderServiceAccountArgs, opts?: pulumi.InvokeOptions): Promise<GetFolderServiceAccountResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("gcp:accessapproval/getFolderServiceAccount:getFolderServiceAccount", {
        "folderId": args.folderId,
    }, opts);
}

/**
 * A collection of arguments for invoking getFolderServiceAccount.
 */
export interface GetFolderServiceAccountArgs {
    /**
     * The folder ID the service account was created for.
     */
    folderId: string;
}

/**
 * A collection of values returned by getFolderServiceAccount.
 */
export interface GetFolderServiceAccountResult {
    /**
     * The email address of the service account. This value is
     * often used to refer to the service account in order to grant IAM permissions.
     */
    readonly accountEmail: string;
    readonly folderId: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The Access Approval service account resource name. Format is "folders/{folder_id}/serviceAccount".
     */
    readonly name: string;
}
/**
 * Get the email address of a folder's Access Approval service account.
 *
 * Each Google Cloud folder has a unique service account used by Access Approval.
 * When using Access Approval with a
 * [custom signing key](https://cloud.google.com/cloud-provider-access-management/access-approval/docs/review-approve-access-requests-custom-keys),
 * this account needs to be granted the `cloudkms.signerVerifier` IAM role on the
 * Cloud KMS key used to sign approvals.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const serviceAccount = gcp.accessapproval.getFolderServiceAccount({
 *     folderId: "my-folder",
 * });
 * const iam = new gcp.kms.CryptoKeyIAMMember("iam", {
 *     cryptoKeyId: cryptoKey.id,
 *     role: "roles/cloudkms.signerVerifier",
 *     member: serviceAccount.then(serviceAccount => `serviceAccount:${serviceAccount.accountEmail}`),
 * });
 * ```
 */
export function getFolderServiceAccountOutput(args: GetFolderServiceAccountOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetFolderServiceAccountResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("gcp:accessapproval/getFolderServiceAccount:getFolderServiceAccount", {
        "folderId": args.folderId,
    }, opts);
}

/**
 * A collection of arguments for invoking getFolderServiceAccount.
 */
export interface GetFolderServiceAccountOutputArgs {
    /**
     * The folder ID the service account was created for.
     */
    folderId: pulumi.Input<string>;
}
