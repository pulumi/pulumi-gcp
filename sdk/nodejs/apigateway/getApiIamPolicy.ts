// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const policy = gcp.apigateway.getApiIamPolicy({
 *     project: api.project,
 *     api: api.apiId,
 * });
 * ```
 */
export function getApiIamPolicy(args: GetApiIamPolicyArgs, opts?: pulumi.InvokeOptions): Promise<GetApiIamPolicyResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("gcp:apigateway/getApiIamPolicy:getApiIamPolicy", {
        "api": args.api,
        "project": args.project,
    }, opts);
}

/**
 * A collection of arguments for invoking getApiIamPolicy.
 */
export interface GetApiIamPolicyArgs {
    /**
     * Used to find the parent resource to bind the IAM policy to
     */
    api: string;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     */
    project?: string;
}

/**
 * A collection of values returned by getApiIamPolicy.
 */
export interface GetApiIamPolicyResult {
    readonly api: string;
    /**
     * (Computed) The etag of the IAM policy.
     */
    readonly etag: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * (Required only by `gcp.apigateway.ApiIamPolicy`) The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     */
    readonly policyData: string;
    readonly project: string;
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const policy = gcp.apigateway.getApiIamPolicy({
 *     project: api.project,
 *     api: api.apiId,
 * });
 * ```
 */
export function getApiIamPolicyOutput(args: GetApiIamPolicyOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetApiIamPolicyResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("gcp:apigateway/getApiIamPolicy:getApiIamPolicy", {
        "api": args.api,
        "project": args.project,
    }, opts);
}

/**
 * A collection of arguments for invoking getApiIamPolicy.
 */
export interface GetApiIamPolicyOutputArgs {
    /**
     * Used to find the parent resource to bind the IAM policy to
     */
    api: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     */
    project?: pulumi.Input<string>;
}
