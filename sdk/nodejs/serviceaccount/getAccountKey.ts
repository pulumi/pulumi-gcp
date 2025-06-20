// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Get service account public key. For more information, see [the official documentation](https://cloud.google.com/iam/docs/creating-managing-service-account-keys) and [API](https://cloud.google.com/iam/reference/rest/v1/projects.serviceAccounts.keys/get).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const myaccount = new gcp.serviceaccount.Account("myaccount", {accountId: "dev-foo-account"});
 * const mykeyKey = new gcp.serviceaccount.Key("mykey", {serviceAccountId: myaccount.name});
 * const mykey = gcp.serviceaccount.getAccountKeyOutput({
 *     name: mykeyKey.name,
 *     publicKeyType: "TYPE_X509_PEM_FILE",
 * });
 * ```
 */
export function getAccountKey(args: GetAccountKeyArgs, opts?: pulumi.InvokeOptions): Promise<GetAccountKeyResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("gcp:serviceaccount/getAccountKey:getAccountKey", {
        "name": args.name,
        "project": args.project,
        "publicKeyType": args.publicKeyType,
    }, opts);
}

/**
 * A collection of arguments for invoking getAccountKey.
 */
export interface GetAccountKeyArgs {
    /**
     * The name of the service account key. This must have format
     * `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}/keys/{KEYID}`, where `{ACCOUNT}`
     * is the email address or unique id of the service account.
     */
    name: string;
    /**
     * The ID of the project that the service account is present in.
     * Defaults to the provider project configuration.
     */
    project?: string;
    /**
     * The output format of the public key requested. TYPE_X509_PEM_FILE is the default output format.
     */
    publicKeyType?: string;
}

/**
 * A collection of values returned by getAccountKey.
 */
export interface GetAccountKeyResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly keyAlgorithm: string;
    readonly name: string;
    readonly project?: string;
    /**
     * The public key, base64 encoded
     */
    readonly publicKey: string;
    readonly publicKeyType?: string;
}
/**
 * Get service account public key. For more information, see [the official documentation](https://cloud.google.com/iam/docs/creating-managing-service-account-keys) and [API](https://cloud.google.com/iam/reference/rest/v1/projects.serviceAccounts.keys/get).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const myaccount = new gcp.serviceaccount.Account("myaccount", {accountId: "dev-foo-account"});
 * const mykeyKey = new gcp.serviceaccount.Key("mykey", {serviceAccountId: myaccount.name});
 * const mykey = gcp.serviceaccount.getAccountKeyOutput({
 *     name: mykeyKey.name,
 *     publicKeyType: "TYPE_X509_PEM_FILE",
 * });
 * ```
 */
export function getAccountKeyOutput(args: GetAccountKeyOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetAccountKeyResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("gcp:serviceaccount/getAccountKey:getAccountKey", {
        "name": args.name,
        "project": args.project,
        "publicKeyType": args.publicKeyType,
    }, opts);
}

/**
 * A collection of arguments for invoking getAccountKey.
 */
export interface GetAccountKeyOutputArgs {
    /**
     * The name of the service account key. This must have format
     * `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}/keys/{KEYID}`, where `{ACCOUNT}`
     * is the email address or unique id of the service account.
     */
    name: pulumi.Input<string>;
    /**
     * The ID of the project that the service account is present in.
     * Defaults to the provider project configuration.
     */
    project?: pulumi.Input<string>;
    /**
     * The output format of the public key requested. TYPE_X509_PEM_FILE is the default output format.
     */
    publicKeyType?: pulumi.Input<string>;
}
