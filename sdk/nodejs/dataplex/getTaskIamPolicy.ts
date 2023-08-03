// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Retrieves the current IAM policy data for task
 *
 * ## example
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const policy = gcp.dataplex.getTaskIamPolicy({
 *     project: google_dataplex_task.example.project,
 *     location: google_dataplex_task.example.location,
 *     lake: google_dataplex_task.example.lake,
 *     taskId: google_dataplex_task.example.task_id,
 * });
 * ```
 */
export function getTaskIamPolicy(args: GetTaskIamPolicyArgs, opts?: pulumi.InvokeOptions): Promise<GetTaskIamPolicyResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("gcp:dataplex/getTaskIamPolicy:getTaskIamPolicy", {
        "lake": args.lake,
        "location": args.location,
        "project": args.project,
        "taskId": args.taskId,
    }, opts);
}

/**
 * A collection of arguments for invoking getTaskIamPolicy.
 */
export interface GetTaskIamPolicyArgs {
    /**
     * The lake in which the task will be created in.
     * Used to find the parent resource to bind the IAM policy to
     */
    lake: string;
    /**
     * The location in which the task will be created in.
     * Used to find the parent resource to bind the IAM policy to
     */
    location?: string;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     */
    project?: string;
    taskId: string;
}

/**
 * A collection of values returned by getTaskIamPolicy.
 */
export interface GetTaskIamPolicyResult {
    /**
     * (Computed) The etag of the IAM policy.
     */
    readonly etag: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly lake: string;
    readonly location: string;
    /**
     * (Required only by `gcp.dataplex.TaskIamPolicy`) The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     */
    readonly policyData: string;
    readonly project: string;
    readonly taskId: string;
}
/**
 * Retrieves the current IAM policy data for task
 *
 * ## example
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const policy = gcp.dataplex.getTaskIamPolicy({
 *     project: google_dataplex_task.example.project,
 *     location: google_dataplex_task.example.location,
 *     lake: google_dataplex_task.example.lake,
 *     taskId: google_dataplex_task.example.task_id,
 * });
 * ```
 */
export function getTaskIamPolicyOutput(args: GetTaskIamPolicyOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetTaskIamPolicyResult> {
    return pulumi.output(args).apply((a: any) => getTaskIamPolicy(a, opts))
}

/**
 * A collection of arguments for invoking getTaskIamPolicy.
 */
export interface GetTaskIamPolicyOutputArgs {
    /**
     * The lake in which the task will be created in.
     * Used to find the parent resource to bind the IAM policy to
     */
    lake: pulumi.Input<string>;
    /**
     * The location in which the task will be created in.
     * Used to find the parent resource to bind the IAM policy to
     */
    location?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     */
    project?: pulumi.Input<string>;
    taskId: pulumi.Input<string>;
}