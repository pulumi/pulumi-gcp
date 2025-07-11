// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Get tag values from a `parent` key.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const environmentTagValues = gcp.tags.getTagValues({
 *     parent: "tagKeys/56789",
 * });
 * ```
 */
export function getTagValues(args: GetTagValuesArgs, opts?: pulumi.InvokeOptions): Promise<GetTagValuesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("gcp:tags/getTagValues:getTagValues", {
        "parent": args.parent,
    }, opts);
}

/**
 * A collection of arguments for invoking getTagValues.
 */
export interface GetTagValuesArgs {
    /**
     * The resource name of the parent tagKey in format `tagKey/{name}`.
     */
    parent: string;
}

/**
 * A collection of values returned by getTagValues.
 */
export interface GetTagValuesResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The resource name of the new TagValue's parent TagKey. Must be of the form tagKeys/{tag_key_id}.
     */
    readonly parent: string;
    readonly values: outputs.tags.GetTagValuesValue[];
}
/**
 * Get tag values from a `parent` key.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const environmentTagValues = gcp.tags.getTagValues({
 *     parent: "tagKeys/56789",
 * });
 * ```
 */
export function getTagValuesOutput(args: GetTagValuesOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetTagValuesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("gcp:tags/getTagValues:getTagValues", {
        "parent": args.parent,
    }, opts);
}

/**
 * A collection of arguments for invoking getTagValues.
 */
export interface GetTagValuesOutputArgs {
    /**
     * The resource name of the parent tagKey in format `tagKey/{name}`.
     */
    parent: pulumi.Input<string>;
}
