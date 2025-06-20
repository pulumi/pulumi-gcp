// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Get the email address of a project's unique BigQuery service account.
 *
 * Each Google Cloud project has a unique service account used by BigQuery. When using
 * BigQuery with [customer-managed encryption keys](https://cloud.google.com/bigquery/docs/customer-managed-encryption),
 * this account needs to be granted the
 * `cloudkms.cryptoKeyEncrypterDecrypter` IAM role on the customer-managed Cloud KMS key used to protect the data.
 *
 * For more information see
 * [the API reference](https://cloud.google.com/bigquery/docs/reference/rest/v2/projects/getServiceAccount).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const bqSa = gcp.bigquery.getDefaultServiceAccount({});
 * const keySaUser = new gcp.kms.CryptoKeyIAMMember("key_sa_user", {
 *     cryptoKeyId: key.id,
 *     role: "roles/cloudkms.cryptoKeyEncrypterDecrypter",
 *     member: bqSa.then(bqSa => `serviceAccount:${bqSa.email}`),
 * });
 * ```
 */
export function getDefaultServiceAccount(args?: GetDefaultServiceAccountArgs, opts?: pulumi.InvokeOptions): Promise<GetDefaultServiceAccountResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("gcp:bigquery/getDefaultServiceAccount:getDefaultServiceAccount", {
        "project": args.project,
    }, opts);
}

/**
 * A collection of arguments for invoking getDefaultServiceAccount.
 */
export interface GetDefaultServiceAccountArgs {
    /**
     * The project the unique service account was created for. If it is not provided, the provider project is used.
     */
    project?: string;
}

/**
 * A collection of values returned by getDefaultServiceAccount.
 */
export interface GetDefaultServiceAccountResult {
    /**
     * The email address of the service account. This value is often used to refer to the service account
     * in order to grant IAM permissions.
     */
    readonly email: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The Identity of the service account in the form `serviceAccount:{email}`. This value is often used to refer to the service account in order to grant IAM permissions.
     */
    readonly member: string;
    readonly project: string;
}
/**
 * Get the email address of a project's unique BigQuery service account.
 *
 * Each Google Cloud project has a unique service account used by BigQuery. When using
 * BigQuery with [customer-managed encryption keys](https://cloud.google.com/bigquery/docs/customer-managed-encryption),
 * this account needs to be granted the
 * `cloudkms.cryptoKeyEncrypterDecrypter` IAM role on the customer-managed Cloud KMS key used to protect the data.
 *
 * For more information see
 * [the API reference](https://cloud.google.com/bigquery/docs/reference/rest/v2/projects/getServiceAccount).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const bqSa = gcp.bigquery.getDefaultServiceAccount({});
 * const keySaUser = new gcp.kms.CryptoKeyIAMMember("key_sa_user", {
 *     cryptoKeyId: key.id,
 *     role: "roles/cloudkms.cryptoKeyEncrypterDecrypter",
 *     member: bqSa.then(bqSa => `serviceAccount:${bqSa.email}`),
 * });
 * ```
 */
export function getDefaultServiceAccountOutput(args?: GetDefaultServiceAccountOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetDefaultServiceAccountResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("gcp:bigquery/getDefaultServiceAccount:getDefaultServiceAccount", {
        "project": args.project,
    }, opts);
}

/**
 * A collection of arguments for invoking getDefaultServiceAccount.
 */
export interface GetDefaultServiceAccountOutputArgs {
    /**
     * The project the unique service account was created for. If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
}
