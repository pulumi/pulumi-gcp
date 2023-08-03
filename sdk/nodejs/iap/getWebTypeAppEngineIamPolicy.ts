// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Retrieves the current IAM policy data for webtypeappengine
 *
 * ## example
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const policy = gcp.iap.getWebTypeAppEngineIamPolicy({
 *     project: google_app_engine_application.app.project,
 *     appId: google_app_engine_application.app.app_id,
 * });
 * ```
 */
export function getWebTypeAppEngineIamPolicy(args: GetWebTypeAppEngineIamPolicyArgs, opts?: pulumi.InvokeOptions): Promise<GetWebTypeAppEngineIamPolicyResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("gcp:iap/getWebTypeAppEngineIamPolicy:getWebTypeAppEngineIamPolicy", {
        "appId": args.appId,
        "project": args.project,
    }, opts);
}

/**
 * A collection of arguments for invoking getWebTypeAppEngineIamPolicy.
 */
export interface GetWebTypeAppEngineIamPolicyArgs {
    /**
     * Id of the App Engine application. Used to find the parent resource to bind the IAM policy to
     */
    appId: string;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     */
    project?: string;
}

/**
 * A collection of values returned by getWebTypeAppEngineIamPolicy.
 */
export interface GetWebTypeAppEngineIamPolicyResult {
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
     * (Required only by `gcp.iap.WebTypeAppEngingIamPolicy`) The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     */
    readonly policyData: string;
    readonly project: string;
}
/**
 * Retrieves the current IAM policy data for webtypeappengine
 *
 * ## example
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const policy = gcp.iap.getWebTypeAppEngineIamPolicy({
 *     project: google_app_engine_application.app.project,
 *     appId: google_app_engine_application.app.app_id,
 * });
 * ```
 */
export function getWebTypeAppEngineIamPolicyOutput(args: GetWebTypeAppEngineIamPolicyOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetWebTypeAppEngineIamPolicyResult> {
    return pulumi.output(args).apply((a: any) => getWebTypeAppEngineIamPolicy(a, opts))
}

/**
 * A collection of arguments for invoking getWebTypeAppEngineIamPolicy.
 */
export interface GetWebTypeAppEngineIamPolicyOutputArgs {
    /**
     * Id of the App Engine application. Used to find the parent resource to bind the IAM policy to
     */
    appId: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     */
    project?: pulumi.Input<string>;
}