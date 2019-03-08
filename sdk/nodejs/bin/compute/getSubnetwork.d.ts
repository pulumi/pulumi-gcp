import * as pulumi from "@pulumi/pulumi";
/**
 * Get a subnetwork within GCE from its name and region.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const my_subnetwork = pulumi.output(gcp.compute.getSubnetwork({
 *     name: "default-us-east1",
 *     region: "us-east1",
 * }));
 * ```
 */
export declare function getSubnetwork(args?: GetSubnetworkArgs, opts?: pulumi.InvokeOptions): Promise<GetSubnetworkResult>;
/**
 * A collection of arguments for invoking getSubnetwork.
 */
export interface GetSubnetworkArgs {
    /**
     * The name of the subnetwork. One of `name` or `self_link`
     * must be specified.
     */
    readonly name?: string;
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    readonly project?: string;
    /**
     * The region this subnetwork has been created in. If
     * unspecified, this defaults to the region configured in the provider.
     */
    readonly region?: string;
    /**
     * The self link of the subnetwork. If `self_link` is
     * specified, `name`, `project`, and `region` are ignored.
     */
    readonly selfLink?: string;
}
/**
 * A collection of values returned by getSubnetwork.
 */
export interface GetSubnetworkResult {
    /**
     * Description of this subnetwork.
     */
    readonly description: string;
    /**
     * The IP address of the gateway.
     */
    readonly gatewayAddress: string;
    /**
     * The range of IP addresses belonging to this subnetwork
     * secondary range.
     */
    readonly ipCidrRange: string;
    /**
     * The network name or resource link to the parent
     * network of this subnetwork.
     */
    readonly network: string;
    /**
     * Whether the VMs in this subnet
     * can access Google services without assigned external IP
     * addresses.
     */
    readonly privateIpGoogleAccess: boolean;
    readonly project: string;
    readonly region: string;
    /**
     * An array of configurations for secondary IP ranges for
     * VM instances contained in this subnetwork. Structure is documented below.
     */
    readonly secondaryIpRanges: {
        ipCidrRange: string;
        rangeName: string;
    }[];
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
