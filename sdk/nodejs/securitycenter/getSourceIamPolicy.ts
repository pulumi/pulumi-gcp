// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Retrieves the current IAM policy data for source
 *
 * ## example
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const policy = gcp.securitycenter.getSourceIamPolicy({
 *     source: google_scc_source.custom_source.name,
 * });
 * ```
 */
export function getSourceIamPolicy(args: GetSourceIamPolicyArgs, opts?: pulumi.InvokeOptions): Promise<GetSourceIamPolicyResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("gcp:securitycenter/getSourceIamPolicy:getSourceIamPolicy", {
        "organization": args.organization,
        "source": args.source,
    }, opts);
}

/**
 * A collection of arguments for invoking getSourceIamPolicy.
 */
export interface GetSourceIamPolicyArgs {
    organization: string;
    /**
     * Used to find the parent resource to bind the IAM policy to
     */
    source: string;
}

/**
 * A collection of values returned by getSourceIamPolicy.
 */
export interface GetSourceIamPolicyResult {
    /**
     * (Computed) The etag of the IAM policy.
     */
    readonly etag: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly organization: string;
    /**
     * (Required only by `gcp.securitycenter.SourceIamPolicy`) The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     */
    readonly policyData: string;
    readonly source: string;
}
/**
 * Retrieves the current IAM policy data for source
 *
 * ## example
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const policy = gcp.securitycenter.getSourceIamPolicy({
 *     source: google_scc_source.custom_source.name,
 * });
 * ```
 */
export function getSourceIamPolicyOutput(args: GetSourceIamPolicyOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSourceIamPolicyResult> {
    return pulumi.output(args).apply((a: any) => getSourceIamPolicy(a, opts))
}

/**
 * A collection of arguments for invoking getSourceIamPolicy.
 */
export interface GetSourceIamPolicyOutputArgs {
    organization: pulumi.Input<string>;
    /**
     * Used to find the parent resource to bind the IAM policy to
     */
    source: pulumi.Input<string>;
}