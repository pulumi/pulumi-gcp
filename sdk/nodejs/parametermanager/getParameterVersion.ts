// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Get the value and metadata from a Parameter Manager Parameter version. For more information see the [official documentation](https://cloud.google.com/secret-manager/parameter-manager/docs/overview)  and [API](https://cloud.google.com/secret-manager/parameter-manager/docs/reference/rest/v1/projects.locations.parameters.versions).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const basic = gcp.parametermanager.getParameterVersion({
 *     parameter: "test-parameter",
 *     parameterVersionId: "test-parameter-version",
 * });
 * ```
 */
export function getParameterVersion(args: GetParameterVersionArgs, opts?: pulumi.InvokeOptions): Promise<GetParameterVersionResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("gcp:parametermanager/getParameterVersion:getParameterVersion", {
        "parameter": args.parameter,
        "parameterVersionId": args.parameterVersionId,
        "project": args.project,
    }, opts);
}

/**
 * A collection of arguments for invoking getParameterVersion.
 */
export interface GetParameterVersionArgs {
    /**
     * The parameter for obtaining the Parameter Version.
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
 * A collection of values returned by getParameterVersion.
 */
export interface GetParameterVersionResult {
    /**
     * The time at which the Parameter Version was created.
     */
    readonly createTime: string;
    /**
     * The current state of the Parameter Version.
     */
    readonly disabled: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The resource name of the Cloud KMS CryptoKeyVersion used to decrypt parameter version payload. Format `projects/{{project}}/locations/global/keyRings/{{key_ring}}/cryptoKeys/{{crypto_key}}/cryptoKeyVersions/{{crypto_key_version}}`
     */
    readonly kmsKeyVersion: string;
    /**
     * The resource name of the ParameterVersion. Format:
     * `projects/{{project}}/locations/global/parameters/{{parameter_id}}/versions/{{parameter_version_id}}`
     */
    readonly name: string;
    readonly parameter: string;
    /**
     * The parameter data.
     */
    readonly parameterData: string;
    readonly parameterVersionId: string;
    readonly project: string;
    /**
     * The time at which the Parameter Version was last updated.
     */
    readonly updateTime: string;
}
/**
 * Get the value and metadata from a Parameter Manager Parameter version. For more information see the [official documentation](https://cloud.google.com/secret-manager/parameter-manager/docs/overview)  and [API](https://cloud.google.com/secret-manager/parameter-manager/docs/reference/rest/v1/projects.locations.parameters.versions).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const basic = gcp.parametermanager.getParameterVersion({
 *     parameter: "test-parameter",
 *     parameterVersionId: "test-parameter-version",
 * });
 * ```
 */
export function getParameterVersionOutput(args: GetParameterVersionOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetParameterVersionResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("gcp:parametermanager/getParameterVersion:getParameterVersion", {
        "parameter": args.parameter,
        "parameterVersionId": args.parameterVersionId,
        "project": args.project,
    }, opts);
}

/**
 * A collection of arguments for invoking getParameterVersion.
 */
export interface GetParameterVersionOutputArgs {
    /**
     * The parameter for obtaining the Parameter Version.
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
