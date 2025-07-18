// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Get a network within GCE from its name.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const my_network = gcp.compute.getNetwork({
 *     name: "default-us-east1",
 * });
 * ```
 */
export function getNetwork(args: GetNetworkArgs, opts?: pulumi.InvokeOptions): Promise<GetNetworkResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("gcp:compute/getNetwork:getNetwork", {
        "name": args.name,
        "networkProfile": args.networkProfile,
        "project": args.project,
    }, opts);
}

/**
 * A collection of arguments for invoking getNetwork.
 */
export interface GetNetworkArgs {
    /**
     * The name of the network.
     *
     *
     * - - -
     */
    name: string;
    /**
     * A full or partial URL of the network profile to apply to this network.
     */
    networkProfile?: string;
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    project?: string;
}

/**
 * A collection of values returned by getNetwork.
 */
export interface GetNetworkResult {
    /**
     * Description of this network.
     */
    readonly description: string;
    /**
     * The IP address of the gateway.
     */
    readonly gatewayIpv4: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The ula internal ipv6 range assigned to this network.
     */
    readonly internalIpv6Range: string;
    readonly name: string;
    /**
     * The numeric unique identifier for the resource.
     */
    readonly networkId: number;
    /**
     * A full or partial URL of the network profile to apply to this network.
     */
    readonly networkProfile?: string;
    /**
     * (Deprecated) The numeric unique identifier for the resource. `numericId` is deprecated and will be removed in a future major release. Use `networkId` instead.
     *
     * @deprecated `numericId` is deprecated and will be removed in a future major release. Use `networkId` instead.
     */
    readonly numericId: string;
    readonly project?: string;
    /**
     * The URI of the resource.
     */
    readonly selfLink: string;
    /**
     * the list of subnetworks which belong to the network
     */
    readonly subnetworksSelfLinks: string[];
}
/**
 * Get a network within GCE from its name.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const my_network = gcp.compute.getNetwork({
 *     name: "default-us-east1",
 * });
 * ```
 */
export function getNetworkOutput(args: GetNetworkOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetNetworkResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("gcp:compute/getNetwork:getNetwork", {
        "name": args.name,
        "networkProfile": args.networkProfile,
        "project": args.project,
    }, opts);
}

/**
 * A collection of arguments for invoking getNetwork.
 */
export interface GetNetworkOutputArgs {
    /**
     * The name of the network.
     *
     *
     * - - -
     */
    name: pulumi.Input<string>;
    /**
     * A full or partial URL of the network profile to apply to this network.
     */
    networkProfile?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
}
