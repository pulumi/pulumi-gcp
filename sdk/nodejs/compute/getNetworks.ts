// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * List all networks in a specified Google Cloud project.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const my-networks = gcp.compute.getNetworks({
 *     project: "my-cloud-project",
 * });
 * ```
 */
export function getNetworks(args?: GetNetworksArgs, opts?: pulumi.InvokeOptions): Promise<GetNetworksResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("gcp:compute/getNetworks:getNetworks", {
        "project": args.project,
    }, opts);
}

/**
 * A collection of arguments for invoking getNetworks.
 */
export interface GetNetworksArgs {
    /**
     * The name of the project.
     */
    project?: string;
}

/**
 * A collection of values returned by getNetworks.
 */
export interface GetNetworksResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The list of networks in the specified project.
     */
    readonly networks: string[];
    /**
     * The project name being queried.
     */
    readonly project?: string;
    /**
     * The URI of the resource.
     */
    readonly selfLink: string;
}
/**
 * List all networks in a specified Google Cloud project.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const my-networks = gcp.compute.getNetworks({
 *     project: "my-cloud-project",
 * });
 * ```
 */
export function getNetworksOutput(args?: GetNetworksOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetNetworksResult> {
    return pulumi.output(args).apply((a: any) => getNetworks(a, opts))
}

/**
 * A collection of arguments for invoking getNetworks.
 */
export interface GetNetworksOutputArgs {
    /**
     * The name of the project.
     */
    project?: pulumi.Input<string>;
}