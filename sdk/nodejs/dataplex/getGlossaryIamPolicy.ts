// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Retrieves the current IAM policy data for glossary
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const policy = gcp.dataplex.getGlossaryIamPolicy({
 *     project: glossaryTestId.project,
 *     location: glossaryTestId.location,
 *     glossaryId: glossaryTestId.glossaryId,
 * });
 * ```
 */
export function getGlossaryIamPolicy(args: GetGlossaryIamPolicyArgs, opts?: pulumi.InvokeOptions): Promise<GetGlossaryIamPolicyResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("gcp:dataplex/getGlossaryIamPolicy:getGlossaryIamPolicy", {
        "glossaryId": args.glossaryId,
        "location": args.location,
        "project": args.project,
    }, opts);
}

/**
 * A collection of arguments for invoking getGlossaryIamPolicy.
 */
export interface GetGlossaryIamPolicyArgs {
    /**
     * Used to find the parent resource to bind the IAM policy to
     */
    glossaryId: string;
    /**
     * The location where the glossary should reside.
     * Used to find the parent resource to bind the IAM policy to. If not specified,
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
 * A collection of values returned by getGlossaryIamPolicy.
 */
export interface GetGlossaryIamPolicyResult {
    /**
     * (Computed) The etag of the IAM policy.
     */
    readonly etag: string;
    readonly glossaryId: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly location: string;
    /**
     * (Required only by `gcp.dataplex.GlossaryIamPolicy`) The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     */
    readonly policyData: string;
    readonly project: string;
}
/**
 * Retrieves the current IAM policy data for glossary
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const policy = gcp.dataplex.getGlossaryIamPolicy({
 *     project: glossaryTestId.project,
 *     location: glossaryTestId.location,
 *     glossaryId: glossaryTestId.glossaryId,
 * });
 * ```
 */
export function getGlossaryIamPolicyOutput(args: GetGlossaryIamPolicyOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetGlossaryIamPolicyResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("gcp:dataplex/getGlossaryIamPolicy:getGlossaryIamPolicy", {
        "glossaryId": args.glossaryId,
        "location": args.location,
        "project": args.project,
    }, opts);
}

/**
 * A collection of arguments for invoking getGlossaryIamPolicy.
 */
export interface GetGlossaryIamPolicyOutputArgs {
    /**
     * Used to find the parent resource to bind the IAM policy to
     */
    glossaryId: pulumi.Input<string>;
    /**
     * The location where the glossary should reside.
     * Used to find the parent resource to bind the IAM policy to. If not specified,
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
