// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Retrieves the current IAM policy data for appengineversion
 *
 * ## example
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const policy = gcp.iap.getAppEngineVersionIamPolicy({
 *     appId: google_app_engine_standard_app_version.version.project,
 *     project: google_app_engine_standard_app_version.version.project,
 *     service: google_app_engine_standard_app_version.version.service,
 *     versionId: google_app_engine_standard_app_version.version.version_id,
 * });
 * ```
 */
export function getAppEngineVersionIamPolicy(args: GetAppEngineVersionIamPolicyArgs, opts?: pulumi.InvokeOptions): Promise<GetAppEngineVersionIamPolicyResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("gcp:iap/getAppEngineVersionIamPolicy:getAppEngineVersionIamPolicy", {
        "appId": args.appId,
        "project": args.project,
        "service": args.service,
        "versionId": args.versionId,
    }, opts);
}

/**
 * A collection of arguments for invoking getAppEngineVersionIamPolicy.
 */
export interface GetAppEngineVersionIamPolicyArgs {
    /**
     * Id of the App Engine application. Used to find the parent resource to bind the IAM policy to
     */
    appId: string;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     */
    project?: string;
    /**
     * Service id of the App Engine application Used to find the parent resource to bind the IAM policy to
     */
    service: string;
    /**
     * Version id of the App Engine application Used to find the parent resource to bind the IAM policy to
     */
    versionId: string;
}

/**
 * A collection of values returned by getAppEngineVersionIamPolicy.
 */
export interface GetAppEngineVersionIamPolicyResult {
    readonly appId: string;
    /**
     * (Computed) The etag of the IAM policy.
     */
    readonly etag: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * (Required only by `gcp.iap.AppEngineVersionIamPolicy`) The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     */
    readonly policyData: string;
    readonly project: string;
    readonly service: string;
    readonly versionId: string;
}
/**
 * Retrieves the current IAM policy data for appengineversion
 *
 * ## example
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const policy = gcp.iap.getAppEngineVersionIamPolicy({
 *     appId: google_app_engine_standard_app_version.version.project,
 *     project: google_app_engine_standard_app_version.version.project,
 *     service: google_app_engine_standard_app_version.version.service,
 *     versionId: google_app_engine_standard_app_version.version.version_id,
 * });
 * ```
 */
export function getAppEngineVersionIamPolicyOutput(args: GetAppEngineVersionIamPolicyOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetAppEngineVersionIamPolicyResult> {
    return pulumi.output(args).apply((a: any) => getAppEngineVersionIamPolicy(a, opts))
}

/**
 * A collection of arguments for invoking getAppEngineVersionIamPolicy.
 */
export interface GetAppEngineVersionIamPolicyOutputArgs {
    /**
     * Id of the App Engine application. Used to find the parent resource to bind the IAM policy to
     */
    appId: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * Service id of the App Engine application Used to find the parent resource to bind the IAM policy to
     */
    service: pulumi.Input<string>;
    /**
     * Version id of the App Engine application Used to find the parent resource to bind the IAM policy to
     */
    versionId: pulumi.Input<string>;
}