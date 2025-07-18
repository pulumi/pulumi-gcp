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
 * const policy = gcp.apigateway.getGatewayIamPolicy({
 *     project: apiGw.project,
 *     region: apiGw.region,
 *     gateway: apiGw.gatewayId,
 * });
 * ```
 */
export function getGatewayIamPolicy(args: GetGatewayIamPolicyArgs, opts?: pulumi.InvokeOptions): Promise<GetGatewayIamPolicyResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("gcp:apigateway/getGatewayIamPolicy:getGatewayIamPolicy", {
        "gateway": args.gateway,
        "project": args.project,
        "region": args.region,
    }, opts);
}

/**
 * A collection of arguments for invoking getGatewayIamPolicy.
 */
export interface GetGatewayIamPolicyArgs {
    /**
     * Used to find the parent resource to bind the IAM policy to
     */
    gateway: string;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     */
    project?: string;
    /**
     * The region of the gateway for the API.
     * Used to find the parent resource to bind the IAM policy to. If not specified,
     * the value will be parsed from the identifier of the parent resource. If no region is provided in the parent identifier and no
     * region is specified, it is taken from the provider configuration.
     */
    region?: string;
}

/**
 * A collection of values returned by getGatewayIamPolicy.
 */
export interface GetGatewayIamPolicyResult {
    /**
     * (Computed) The etag of the IAM policy.
     */
    readonly etag: string;
    readonly gateway: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * (Required only by `gcp.apigateway.GatewayIamPolicy`) The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     */
    readonly policyData: string;
    readonly project: string;
    readonly region: string;
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const policy = gcp.apigateway.getGatewayIamPolicy({
 *     project: apiGw.project,
 *     region: apiGw.region,
 *     gateway: apiGw.gatewayId,
 * });
 * ```
 */
export function getGatewayIamPolicyOutput(args: GetGatewayIamPolicyOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetGatewayIamPolicyResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("gcp:apigateway/getGatewayIamPolicy:getGatewayIamPolicy", {
        "gateway": args.gateway,
        "project": args.project,
        "region": args.region,
    }, opts);
}

/**
 * A collection of arguments for invoking getGatewayIamPolicy.
 */
export interface GetGatewayIamPolicyOutputArgs {
    /**
     * Used to find the parent resource to bind the IAM policy to
     */
    gateway: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * The region of the gateway for the API.
     * Used to find the parent resource to bind the IAM policy to. If not specified,
     * the value will be parsed from the identifier of the parent resource. If no region is provided in the parent identifier and no
     * region is specified, it is taken from the provider configuration.
     */
    region?: pulumi.Input<string>;
}
