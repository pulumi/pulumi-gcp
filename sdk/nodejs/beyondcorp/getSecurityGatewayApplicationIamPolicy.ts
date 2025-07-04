// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Retrieves the current IAM policy data for securitygatewayapplication
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const policy = gcp.beyondcorp.getSecurityGatewayApplicationIamPolicy({
 *     project: example.project,
 *     securityGatewayId: example.securityGatewayId,
 *     applicationId: example.applicationId,
 * });
 * ```
 */
export function getSecurityGatewayApplicationIamPolicy(args: GetSecurityGatewayApplicationIamPolicyArgs, opts?: pulumi.InvokeOptions): Promise<GetSecurityGatewayApplicationIamPolicyResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("gcp:beyondcorp/getSecurityGatewayApplicationIamPolicy:getSecurityGatewayApplicationIamPolicy", {
        "applicationId": args.applicationId,
        "project": args.project,
        "securityGatewayId": args.securityGatewayId,
    }, opts);
}

/**
 * A collection of arguments for invoking getSecurityGatewayApplicationIamPolicy.
 */
export interface GetSecurityGatewayApplicationIamPolicyArgs {
    /**
     * Used to find the parent resource to bind the IAM policy to
     */
    applicationId: string;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     */
    project?: string;
    /**
     * ID of the Security Gateway resource this belongs to. Used to find the parent resource to bind the IAM policy to
     */
    securityGatewayId: string;
}

/**
 * A collection of values returned by getSecurityGatewayApplicationIamPolicy.
 */
export interface GetSecurityGatewayApplicationIamPolicyResult {
    readonly applicationId: string;
    /**
     * (Computed) The etag of the IAM policy.
     */
    readonly etag: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * (Required only by `gcp.beyondcorp.SecurityGatewayApplicationIamPolicy`) The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     */
    readonly policyData: string;
    readonly project: string;
    readonly securityGatewayId: string;
}
/**
 * Retrieves the current IAM policy data for securitygatewayapplication
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const policy = gcp.beyondcorp.getSecurityGatewayApplicationIamPolicy({
 *     project: example.project,
 *     securityGatewayId: example.securityGatewayId,
 *     applicationId: example.applicationId,
 * });
 * ```
 */
export function getSecurityGatewayApplicationIamPolicyOutput(args: GetSecurityGatewayApplicationIamPolicyOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetSecurityGatewayApplicationIamPolicyResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("gcp:beyondcorp/getSecurityGatewayApplicationIamPolicy:getSecurityGatewayApplicationIamPolicy", {
        "applicationId": args.applicationId,
        "project": args.project,
        "securityGatewayId": args.securityGatewayId,
    }, opts);
}

/**
 * A collection of arguments for invoking getSecurityGatewayApplicationIamPolicy.
 */
export interface GetSecurityGatewayApplicationIamPolicyOutputArgs {
    /**
     * Used to find the parent resource to bind the IAM policy to
     */
    applicationId: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * ID of the Security Gateway resource this belongs to. Used to find the parent resource to bind the IAM policy to
     */
    securityGatewayId: pulumi.Input<string>;
}
