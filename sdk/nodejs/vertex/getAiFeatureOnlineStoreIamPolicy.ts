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
 * const policy = gcp.vertex.getAiFeatureOnlineStoreIamPolicy({
 *     region: featureOnlineStore.region,
 *     featureOnlineStore: featureOnlineStore.name,
 * });
 * ```
 */
export function getAiFeatureOnlineStoreIamPolicy(args: GetAiFeatureOnlineStoreIamPolicyArgs, opts?: pulumi.InvokeOptions): Promise<GetAiFeatureOnlineStoreIamPolicyResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("gcp:vertex/getAiFeatureOnlineStoreIamPolicy:getAiFeatureOnlineStoreIamPolicy", {
        "featureOnlineStore": args.featureOnlineStore,
        "project": args.project,
        "region": args.region,
    }, opts);
}

/**
 * A collection of arguments for invoking getAiFeatureOnlineStoreIamPolicy.
 */
export interface GetAiFeatureOnlineStoreIamPolicyArgs {
    /**
     * Used to find the parent resource to bind the IAM policy to
     */
    featureOnlineStore: string;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     */
    project?: string;
    /**
     * The region of feature online store. eg us-central1 Used to find the parent resource to bind the IAM policy to. If not specified,
     * the value will be parsed from the identifier of the parent resource. If no region is provided in the parent identifier and no
     * region is specified, it is taken from the provider configuration.
     */
    region?: string;
}

/**
 * A collection of values returned by getAiFeatureOnlineStoreIamPolicy.
 */
export interface GetAiFeatureOnlineStoreIamPolicyResult {
    /**
     * (Computed) The etag of the IAM policy.
     */
    readonly etag: string;
    readonly featureOnlineStore: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * (Required only by `gcp.vertex.AiFeatureOnlineStoreIamPolicy`) The policy data generated by
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
 * const policy = gcp.vertex.getAiFeatureOnlineStoreIamPolicy({
 *     region: featureOnlineStore.region,
 *     featureOnlineStore: featureOnlineStore.name,
 * });
 * ```
 */
export function getAiFeatureOnlineStoreIamPolicyOutput(args: GetAiFeatureOnlineStoreIamPolicyOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetAiFeatureOnlineStoreIamPolicyResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("gcp:vertex/getAiFeatureOnlineStoreIamPolicy:getAiFeatureOnlineStoreIamPolicy", {
        "featureOnlineStore": args.featureOnlineStore,
        "project": args.project,
        "region": args.region,
    }, opts);
}

/**
 * A collection of arguments for invoking getAiFeatureOnlineStoreIamPolicy.
 */
export interface GetAiFeatureOnlineStoreIamPolicyOutputArgs {
    /**
     * Used to find the parent resource to bind the IAM policy to
     */
    featureOnlineStore: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * The region of feature online store. eg us-central1 Used to find the parent resource to bind the IAM policy to. If not specified,
     * the value will be parsed from the identifier of the parent resource. If no region is provided in the parent identifier and no
     * region is specified, it is taken from the provider configuration.
     */
    region?: pulumi.Input<string>;
}
