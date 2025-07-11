// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Retrieves the current IAM policy data for instance
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const policy = gcp.notebooks.getInstanceIamPolicy({
 *     project: instance.project,
 *     location: instance.location,
 *     instanceName: instance.name,
 * });
 * ```
 */
export function getInstanceIamPolicy(args: GetInstanceIamPolicyArgs, opts?: pulumi.InvokeOptions): Promise<GetInstanceIamPolicyResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("gcp:notebooks/getInstanceIamPolicy:getInstanceIamPolicy", {
        "instanceName": args.instanceName,
        "location": args.location,
        "project": args.project,
    }, opts);
}

/**
 * A collection of arguments for invoking getInstanceIamPolicy.
 */
export interface GetInstanceIamPolicyArgs {
    /**
     * Used to find the parent resource to bind the IAM policy to
     */
    instanceName: string;
    /**
     * A reference to the zone where the machine resides. Used to find the parent resource to bind the IAM policy to. If not specified,
     * the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
     * location is specified, it is taken from the provider configuration.
     */
    location?: string;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     */
    project?: string;
}

/**
 * A collection of values returned by getInstanceIamPolicy.
 */
export interface GetInstanceIamPolicyResult {
    /**
     * (Computed) The etag of the IAM policy.
     */
    readonly etag: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly instanceName: string;
    readonly location: string;
    /**
     * (Required only by `gcp.notebooks.InstanceIamPolicy`) The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     */
    readonly policyData: string;
    readonly project: string;
}
/**
 * Retrieves the current IAM policy data for instance
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const policy = gcp.notebooks.getInstanceIamPolicy({
 *     project: instance.project,
 *     location: instance.location,
 *     instanceName: instance.name,
 * });
 * ```
 */
export function getInstanceIamPolicyOutput(args: GetInstanceIamPolicyOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetInstanceIamPolicyResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("gcp:notebooks/getInstanceIamPolicy:getInstanceIamPolicy", {
        "instanceName": args.instanceName,
        "location": args.location,
        "project": args.project,
    }, opts);
}

/**
 * A collection of arguments for invoking getInstanceIamPolicy.
 */
export interface GetInstanceIamPolicyOutputArgs {
    /**
     * Used to find the parent resource to bind the IAM policy to
     */
    instanceName: pulumi.Input<string>;
    /**
     * A reference to the zone where the machine resides. Used to find the parent resource to bind the IAM policy to. If not specified,
     * the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
     * location is specified, it is taken from the provider configuration.
     */
    location?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     */
    project?: pulumi.Input<string>;
}
