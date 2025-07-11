// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Get a IAM workload identity pool from Google Cloud by its id.
 * > **Note:** The following resource requires the Beta IAM role `roles/iam.workloadIdentityPoolAdmin` in order to succeed. `OWNER` and `EDITOR` roles do not include the necessary permissions.
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const foo = gcp.iam.getWorkloadIdentityPool({
 *     workloadIdentityPoolId: "foo-pool",
 * });
 * ```
 */
export function getWorkloadIdentityPool(args: GetWorkloadIdentityPoolArgs, opts?: pulumi.InvokeOptions): Promise<GetWorkloadIdentityPoolResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("gcp:iam/getWorkloadIdentityPool:getWorkloadIdentityPool", {
        "project": args.project,
        "workloadIdentityPoolId": args.workloadIdentityPoolId,
    }, opts);
}

/**
 * A collection of arguments for invoking getWorkloadIdentityPool.
 */
export interface GetWorkloadIdentityPoolArgs {
    /**
     * The project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    project?: string;
    /**
     * The id of the pool which is the
     * final component of the resource name.
     *
     * - - -
     */
    workloadIdentityPoolId: string;
}

/**
 * A collection of values returned by getWorkloadIdentityPool.
 */
export interface GetWorkloadIdentityPoolResult {
    readonly description: string;
    readonly disabled: boolean;
    readonly displayName: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly inlineCertificateIssuanceConfigs: outputs.iam.GetWorkloadIdentityPoolInlineCertificateIssuanceConfig[];
    readonly inlineTrustConfigs: outputs.iam.GetWorkloadIdentityPoolInlineTrustConfig[];
    readonly mode: string;
    readonly name: string;
    readonly project?: string;
    readonly state: string;
    readonly workloadIdentityPoolId: string;
}
/**
 * Get a IAM workload identity pool from Google Cloud by its id.
 * > **Note:** The following resource requires the Beta IAM role `roles/iam.workloadIdentityPoolAdmin` in order to succeed. `OWNER` and `EDITOR` roles do not include the necessary permissions.
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const foo = gcp.iam.getWorkloadIdentityPool({
 *     workloadIdentityPoolId: "foo-pool",
 * });
 * ```
 */
export function getWorkloadIdentityPoolOutput(args: GetWorkloadIdentityPoolOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetWorkloadIdentityPoolResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("gcp:iam/getWorkloadIdentityPool:getWorkloadIdentityPool", {
        "project": args.project,
        "workloadIdentityPoolId": args.workloadIdentityPoolId,
    }, opts);
}

/**
 * A collection of arguments for invoking getWorkloadIdentityPool.
 */
export interface GetWorkloadIdentityPoolOutputArgs {
    /**
     * The project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * The id of the pool which is the
     * final component of the resource name.
     *
     * - - -
     */
    workloadIdentityPoolId: pulumi.Input<string>;
}
