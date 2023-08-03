// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Retrieves the current IAM policy data for feature
 *
 * ## example
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const policy = gcp.gkehub.getFeatureIamPolicy({
 *     project: google_gke_hub_feature.feature.project,
 *     location: google_gke_hub_feature.feature.location,
 *     name: google_gke_hub_feature.feature.name,
 * });
 * ```
 */
export function getFeatureIamPolicy(args: GetFeatureIamPolicyArgs, opts?: pulumi.InvokeOptions): Promise<GetFeatureIamPolicyResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("gcp:gkehub/getFeatureIamPolicy:getFeatureIamPolicy", {
        "location": args.location,
        "name": args.name,
        "project": args.project,
    }, opts);
}

/**
 * A collection of arguments for invoking getFeatureIamPolicy.
 */
export interface GetFeatureIamPolicyArgs {
    /**
     * The location for the resource Used to find the parent resource to bind the IAM policy to
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
 * A collection of values returned by getFeatureIamPolicy.
 */
export interface GetFeatureIamPolicyResult {
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
     * (Required only by `gcp.gkehub.FeatureIamPolicy`) The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     */
    readonly policyData: string;
    readonly project: string;
}
/**
 * Retrieves the current IAM policy data for feature
 *
 * ## example
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const policy = gcp.gkehub.getFeatureIamPolicy({
 *     project: google_gke_hub_feature.feature.project,
 *     location: google_gke_hub_feature.feature.location,
 *     name: google_gke_hub_feature.feature.name,
 * });
 * ```
 */
export function getFeatureIamPolicyOutput(args: GetFeatureIamPolicyOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetFeatureIamPolicyResult> {
    return pulumi.output(args).apply((a: any) => getFeatureIamPolicy(a, opts))
}

/**
 * A collection of arguments for invoking getFeatureIamPolicy.
 */
export interface GetFeatureIamPolicyOutputArgs {
    /**
     * The location for the resource Used to find the parent resource to bind the IAM policy to
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