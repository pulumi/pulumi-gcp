// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Retrieves the current IAM policy data for restoreplan
 *
 * ## example
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const policy = gcp.gkebackup.getRestorePlanIamPolicy({
 *     project: google_gke_backup_restore_plan.all_ns.project,
 *     location: google_gke_backup_restore_plan.all_ns.location,
 *     name: google_gke_backup_restore_plan.all_ns.name,
 * });
 * ```
 */
export function getRestorePlanIamPolicy(args: GetRestorePlanIamPolicyArgs, opts?: pulumi.InvokeOptions): Promise<GetRestorePlanIamPolicyResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("gcp:gkebackup/getRestorePlanIamPolicy:getRestorePlanIamPolicy", {
        "location": args.location,
        "name": args.name,
        "project": args.project,
    }, opts);
}

/**
 * A collection of arguments for invoking getRestorePlanIamPolicy.
 */
export interface GetRestorePlanIamPolicyArgs {
    /**
     * The region of the Restore Plan.
     * Used to find the parent resource to bind the IAM policy to
     */
    location?: string;
    /**
     * Used to find the parent resource to bind the IAM policy to
     */
    name: string;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     */
    project?: string;
}

/**
 * A collection of values returned by getRestorePlanIamPolicy.
 */
export interface GetRestorePlanIamPolicyResult {
    /**
     * (Computed) The etag of the IAM policy.
     */
    readonly etag: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly location: string;
    readonly name: string;
    /**
     * (Required only by `gcp.gkebackup.RestorePlanIamPolicy`) The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     */
    readonly policyData: string;
    readonly project: string;
}
/**
 * Retrieves the current IAM policy data for restoreplan
 *
 * ## example
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const policy = gcp.gkebackup.getRestorePlanIamPolicy({
 *     project: google_gke_backup_restore_plan.all_ns.project,
 *     location: google_gke_backup_restore_plan.all_ns.location,
 *     name: google_gke_backup_restore_plan.all_ns.name,
 * });
 * ```
 */
export function getRestorePlanIamPolicyOutput(args: GetRestorePlanIamPolicyOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetRestorePlanIamPolicyResult> {
    return pulumi.output(args).apply((a: any) => getRestorePlanIamPolicy(a, opts))
}

/**
 * A collection of arguments for invoking getRestorePlanIamPolicy.
 */
export interface GetRestorePlanIamPolicyOutputArgs {
    /**
     * The region of the Restore Plan.
     * Used to find the parent resource to bind the IAM policy to
     */
    location?: pulumi.Input<string>;
    /**
     * Used to find the parent resource to bind the IAM policy to
     */
    name: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     */
    project?: pulumi.Input<string>;
}