// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Retrieves the current IAM policy data for consentstore
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const policy = gcp.healthcare.getConsentStoreIamPolicy({
 *     dataset: my_consent.dataset,
 *     consentStoreId: my_consent.name,
 * });
 * ```
 */
export function getConsentStoreIamPolicy(args: GetConsentStoreIamPolicyArgs, opts?: pulumi.InvokeOptions): Promise<GetConsentStoreIamPolicyResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("gcp:healthcare/getConsentStoreIamPolicy:getConsentStoreIamPolicy", {
        "consentStoreId": args.consentStoreId,
        "dataset": args.dataset,
    }, opts);
}

/**
 * A collection of arguments for invoking getConsentStoreIamPolicy.
 */
export interface GetConsentStoreIamPolicyArgs {
    /**
     * Used to find the parent resource to bind the IAM policy to
     */
    consentStoreId: string;
    /**
     * Identifies the dataset addressed by this request. Must be in the format
     * 'projects/{project}/locations/{location}/datasets/{dataset}'
     * Used to find the parent resource to bind the IAM policy to
     */
    dataset: string;
}

/**
 * A collection of values returned by getConsentStoreIamPolicy.
 */
export interface GetConsentStoreIamPolicyResult {
    readonly consentStoreId: string;
    readonly dataset: string;
    /**
     * (Computed) The etag of the IAM policy.
     */
    readonly etag: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * (Required only by `gcp.healthcare.ConsentStoreIamPolicy`) The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     */
    readonly policyData: string;
}
/**
 * Retrieves the current IAM policy data for consentstore
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const policy = gcp.healthcare.getConsentStoreIamPolicy({
 *     dataset: my_consent.dataset,
 *     consentStoreId: my_consent.name,
 * });
 * ```
 */
export function getConsentStoreIamPolicyOutput(args: GetConsentStoreIamPolicyOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetConsentStoreIamPolicyResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("gcp:healthcare/getConsentStoreIamPolicy:getConsentStoreIamPolicy", {
        "consentStoreId": args.consentStoreId,
        "dataset": args.dataset,
    }, opts);
}

/**
 * A collection of arguments for invoking getConsentStoreIamPolicy.
 */
export interface GetConsentStoreIamPolicyOutputArgs {
    /**
     * Used to find the parent resource to bind the IAM policy to
     */
    consentStoreId: pulumi.Input<string>;
    /**
     * Identifies the dataset addressed by this request. Must be in the format
     * 'projects/{project}/locations/{location}/datasets/{dataset}'
     * Used to find the parent resource to bind the IAM policy to
     */
    dataset: pulumi.Input<string>;
}
