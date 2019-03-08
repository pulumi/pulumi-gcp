import * as pulumi from "@pulumi/pulumi";
/**
 * Use this data source to get the IP ranges from the sender policy framework (SPF) record of \_cloud-netblocks.googleusercontent
 *
 * https://cloud.google.com/compute/docs/faq#where_can_i_find_product_name_short_ip_ranges
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const netblock = pulumi.output(gcp.compute.getNetblockIPRanges({}));
 *
 * export const cidrBlocks = netblock.apply(netblock => netblock.cidrBlocks);
 * export const cidrBlocksIpv4 = netblock.apply(netblock => netblock.cidrBlocksIpv4s);
 * export const cidrBlocksIpv6 = netblock.apply(netblock => netblock.cidrBlocksIpv6s);
 * ```
 */
export declare function getNetblockIPRanges(opts?: pulumi.InvokeOptions): Promise<GetNetblockIPRangesResult>;
/**
 * A collection of values returned by getNetblockIPRanges.
 */
export interface GetNetblockIPRangesResult {
    /**
     * Retrieve list of all CIDR blocks.
     */
    readonly cidrBlocks: string[];
    /**
     * Retrieve list of the IP4 CIDR blocks
     */
    readonly cidrBlocksIpv4s: string[];
    /**
     * Retrieve list of the IP6 CIDR blocks.
     */
    readonly cidrBlocksIpv6s: string[];
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
