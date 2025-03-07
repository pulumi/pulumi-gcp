// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
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
 * const basic = gcp.parametermanager.getParameterVersionRender({
 *     parameter: "test-parameter",
 *     parameterVersionId: "test-parameter-version",
 * });
 * ```
 */
export function getParameterVersionRender(args: GetParameterVersionRenderArgs, opts?: pulumi.InvokeOptions): Promise<GetParameterVersionRenderResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("gcp:parametermanager/getParameterVersionRender:getParameterVersionRender", {
        "parameter": args.parameter,
        "parameterVersionId": args.parameterVersionId,
        "project": args.project,
    }, opts);
}

/**
 * A collection of arguments for invoking getParameterVersionRender.
 */
export interface GetParameterVersionRenderArgs {
    /**
     * The Parameter for obtaining the Parameter Version.
     * This can be either the reference of the parameter as in `projects/{{project}}/locations/global/parameters/{{parameter_id}}` or only the name of the parameter as in `{{parameter_id}}`.
     */
    parameter: string;
    /**
     * The version of the parameter to get.
     */
    parameterVersionId: string;
    /**
     * The project for retrieving the Parameter Version. If it's not specified, 
     * the provider project will be used.
     */
    project?: string;
}

/**
 * A collection of values returned by getParameterVersionRender.
 */
export interface GetParameterVersionRenderResult {
    /**
     * The current state of the Parameter Version.
     */
    readonly disabled: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The resource name of the ParameterVersion. Format:
     * `projects/{{project}}/locations/global/parameters/{{parameter_id}}/versions/{{parameter_version_id}}`
     */
    readonly name: string;
    readonly parameter: string;
    /**
     * The Parameter data.
     */
    readonly parameterData: string;
    readonly parameterVersionId: string;
    readonly project: string;
    /**
     * The Rendered Parameter Data specifies that if you use `__REF__()` to reference a secret and the format is JSON or YAML, the placeholder `__REF__()` will be replaced with the actual secret value. However, if the format is UNFORMATTED, it will stay the same as the original `parameterData`.
     */
    readonly renderedParameterData: string;
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const basic = gcp.parametermanager.getParameterVersionRender({
 *     parameter: "test-parameter",
 *     parameterVersionId: "test-parameter-version",
 * });
 * ```
 */
export function getParameterVersionRenderOutput(args: GetParameterVersionRenderOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetParameterVersionRenderResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("gcp:parametermanager/getParameterVersionRender:getParameterVersionRender", {
        "parameter": args.parameter,
        "parameterVersionId": args.parameterVersionId,
        "project": args.project,
    }, opts);
}

/**
 * A collection of arguments for invoking getParameterVersionRender.
 */
export interface GetParameterVersionRenderOutputArgs {
    /**
     * The Parameter for obtaining the Parameter Version.
     * This can be either the reference of the parameter as in `projects/{{project}}/locations/global/parameters/{{parameter_id}}` or only the name of the parameter as in `{{parameter_id}}`.
     */
    parameter: pulumi.Input<string>;
    /**
     * The version of the parameter to get.
     */
    parameterVersionId: pulumi.Input<string>;
    /**
     * The project for retrieving the Parameter Version. If it's not specified, 
     * the provider project will be used.
     */
    project?: pulumi.Input<string>;
}
