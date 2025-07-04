// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Retrieves the current IAM policy data for autoscalingpolicy
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const policy = gcp.dataproc.getAutoscalingPolicyIamPolicy({
 *     project: basic.project,
 *     location: basic.location,
 *     policyId: basic.policyId,
 * });
 * ```
 */
export function getAutoscalingPolicyIamPolicy(args: GetAutoscalingPolicyIamPolicyArgs, opts?: pulumi.InvokeOptions): Promise<GetAutoscalingPolicyIamPolicyResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("gcp:dataproc/getAutoscalingPolicyIamPolicy:getAutoscalingPolicyIamPolicy", {
        "location": args.location,
        "policyId": args.policyId,
        "project": args.project,
    }, opts);
}

/**
 * A collection of arguments for invoking getAutoscalingPolicyIamPolicy.
 */
export interface GetAutoscalingPolicyIamPolicyArgs {
    /**
     * The  location where the autoscaling policy should reside.
     * The default value is `global`.
     * Used to find the parent resource to bind the IAM policy to. If not specified,
     * the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
     * location is specified, it is taken from the provider configuration.
     */
    location?: string;
    /**
     * Used to find the parent resource to bind the IAM policy to
     */
    policyId: string;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     */
    project?: string;
}

/**
 * A collection of values returned by getAutoscalingPolicyIamPolicy.
 */
export interface GetAutoscalingPolicyIamPolicyResult {
    /**
     * (Computed) The etag of the IAM policy.
     */
    readonly etag: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly location: string;
    /**
     * (Required only by `gcp.dataproc.AutoscalingPolicyIamPolicy`) The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     */
    readonly policyData: string;
    readonly policyId: string;
    readonly project: string;
}
/**
 * Retrieves the current IAM policy data for autoscalingpolicy
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const policy = gcp.dataproc.getAutoscalingPolicyIamPolicy({
 *     project: basic.project,
 *     location: basic.location,
 *     policyId: basic.policyId,
 * });
 * ```
 */
export function getAutoscalingPolicyIamPolicyOutput(args: GetAutoscalingPolicyIamPolicyOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetAutoscalingPolicyIamPolicyResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("gcp:dataproc/getAutoscalingPolicyIamPolicy:getAutoscalingPolicyIamPolicy", {
        "location": args.location,
        "policyId": args.policyId,
        "project": args.project,
    }, opts);
}

/**
 * A collection of arguments for invoking getAutoscalingPolicyIamPolicy.
 */
export interface GetAutoscalingPolicyIamPolicyOutputArgs {
    /**
     * The  location where the autoscaling policy should reside.
     * The default value is `global`.
     * Used to find the parent resource to bind the IAM policy to. If not specified,
     * the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
     * location is specified, it is taken from the provider configuration.
     */
    location?: pulumi.Input<string>;
    /**
     * Used to find the parent resource to bind the IAM policy to
     */
    policyId: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     */
    project?: pulumi.Input<string>;
}
