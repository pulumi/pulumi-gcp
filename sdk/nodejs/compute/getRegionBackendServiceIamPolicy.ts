// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

export function getRegionBackendServiceIamPolicy(args: GetRegionBackendServiceIamPolicyArgs, opts?: pulumi.InvokeOptions): Promise<GetRegionBackendServiceIamPolicyResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("gcp:compute/getRegionBackendServiceIamPolicy:getRegionBackendServiceIamPolicy", {
        "name": args.name,
        "project": args.project,
        "region": args.region,
    }, opts);
}

/**
 * A collection of arguments for invoking getRegionBackendServiceIamPolicy.
 */
export interface GetRegionBackendServiceIamPolicyArgs {
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
     * The Region in which the created backend service should reside.
     * If it is not provided, the provider region is used.
     * Used to find the parent resource to bind the IAM policy to. If not specified,
     * the value will be parsed from the identifier of the parent resource. If no region is provided in the parent identifier and no
     * region is specified, it is taken from the provider configuration.
     */
    region?: string;
}

/**
 * A collection of values returned by getRegionBackendServiceIamPolicy.
 */
export interface GetRegionBackendServiceIamPolicyResult {
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
     * (Required only by `gcp.compute.RegionBackendServiceIamPolicy`) The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     */
    readonly policyData: string;
    readonly project: string;
    readonly region: string;
}
export function getRegionBackendServiceIamPolicyOutput(args: GetRegionBackendServiceIamPolicyOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetRegionBackendServiceIamPolicyResult> {
    return pulumi.output(args).apply((a: any) => getRegionBackendServiceIamPolicy(a, opts))
}

/**
 * A collection of arguments for invoking getRegionBackendServiceIamPolicy.
 */
export interface GetRegionBackendServiceIamPolicyOutputArgs {
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
     * The Region in which the created backend service should reside.
     * If it is not provided, the provider region is used.
     * Used to find the parent resource to bind the IAM policy to. If not specified,
     * the value will be parsed from the identifier of the parent resource. If no region is provided in the parent identifier and no
     * region is specified, it is taken from the provider configuration.
     */
    region?: pulumi.Input<string>;
}