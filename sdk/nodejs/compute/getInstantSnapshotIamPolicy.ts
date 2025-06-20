// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Retrieves the current IAM policy data for instantsnapshot
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const policy = gcp.compute.getInstantSnapshotIamPolicy({
 *     project: _default.project,
 *     zone: _default.zone,
 *     name: _default.name,
 * });
 * ```
 */
export function getInstantSnapshotIamPolicy(args: GetInstantSnapshotIamPolicyArgs, opts?: pulumi.InvokeOptions): Promise<GetInstantSnapshotIamPolicyResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("gcp:compute/getInstantSnapshotIamPolicy:getInstantSnapshotIamPolicy", {
        "name": args.name,
        "project": args.project,
        "zone": args.zone,
    }, opts);
}

/**
 * A collection of arguments for invoking getInstantSnapshotIamPolicy.
 */
export interface GetInstantSnapshotIamPolicyArgs {
    /**
     * Used to find the parent resource to bind the IAM policy to
     */
    name: string;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     */
    project?: string;
    /**
     * A reference to the zone where the disk is located. Used to find the parent resource to bind the IAM policy to. If not specified,
     * the value will be parsed from the identifier of the parent resource. If no zone is provided in the parent identifier and no
     * zone is specified, it is taken from the provider configuration.
     */
    zone?: string;
}

/**
 * A collection of values returned by getInstantSnapshotIamPolicy.
 */
export interface GetInstantSnapshotIamPolicyResult {
    /**
     * (Computed) The etag of the IAM policy.
     */
    readonly etag: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly name: string;
    /**
     * (Required only by `gcp.compute.InstantSnapshotIamPolicy`) The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     */
    readonly policyData: string;
    readonly project: string;
    readonly zone: string;
}
/**
 * Retrieves the current IAM policy data for instantsnapshot
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const policy = gcp.compute.getInstantSnapshotIamPolicy({
 *     project: _default.project,
 *     zone: _default.zone,
 *     name: _default.name,
 * });
 * ```
 */
export function getInstantSnapshotIamPolicyOutput(args: GetInstantSnapshotIamPolicyOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetInstantSnapshotIamPolicyResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("gcp:compute/getInstantSnapshotIamPolicy:getInstantSnapshotIamPolicy", {
        "name": args.name,
        "project": args.project,
        "zone": args.zone,
    }, opts);
}

/**
 * A collection of arguments for invoking getInstantSnapshotIamPolicy.
 */
export interface GetInstantSnapshotIamPolicyOutputArgs {
    /**
     * Used to find the parent resource to bind the IAM policy to
     */
    name: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * A reference to the zone where the disk is located. Used to find the parent resource to bind the IAM policy to. If not specified,
     * the value will be parsed from the identifier of the parent resource. If no zone is provided in the parent identifier and no
     * zone is specified, it is taken from the provider configuration.
     */
    zone?: pulumi.Input<string>;
}
