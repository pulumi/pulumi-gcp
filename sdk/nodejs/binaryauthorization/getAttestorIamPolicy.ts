// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Retrieves the current IAM policy data for attestor
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const policy = gcp.binaryauthorization.getAttestorIamPolicy({
 *     project: attestor.project,
 *     attestor: attestor.name,
 * });
 * ```
 */
export function getAttestorIamPolicy(args: GetAttestorIamPolicyArgs, opts?: pulumi.InvokeOptions): Promise<GetAttestorIamPolicyResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("gcp:binaryauthorization/getAttestorIamPolicy:getAttestorIamPolicy", {
        "attestor": args.attestor,
        "project": args.project,
    }, opts);
}

/**
 * A collection of arguments for invoking getAttestorIamPolicy.
 */
export interface GetAttestorIamPolicyArgs {
    /**
     * Used to find the parent resource to bind the IAM policy to
     */
    attestor: string;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     */
    project?: string;
}

/**
 * A collection of values returned by getAttestorIamPolicy.
 */
export interface GetAttestorIamPolicyResult {
    readonly attestor: string;
    /**
     * (Computed) The etag of the IAM policy.
     */
    readonly etag: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * (Required only by `gcp.binaryauthorization.AttestorIamPolicy`) The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     */
    readonly policyData: string;
    readonly project: string;
}
/**
 * Retrieves the current IAM policy data for attestor
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const policy = gcp.binaryauthorization.getAttestorIamPolicy({
 *     project: attestor.project,
 *     attestor: attestor.name,
 * });
 * ```
 */
export function getAttestorIamPolicyOutput(args: GetAttestorIamPolicyOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetAttestorIamPolicyResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("gcp:binaryauthorization/getAttestorIamPolicy:getAttestorIamPolicy", {
        "attestor": args.attestor,
        "project": args.project,
    }, opts);
}

/**
 * A collection of arguments for invoking getAttestorIamPolicy.
 */
export interface GetAttestorIamPolicyOutputArgs {
    /**
     * Used to find the parent resource to bind the IAM policy to
     */
    attestor: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     */
    project?: pulumi.Input<string>;
}
