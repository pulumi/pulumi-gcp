import * as pulumi from "@pulumi/pulumi";
/**
 * Use this data source to access IP ranges in your firewall rules.
 *
 * https://cloud.google.com/compute/docs/load-balancing/health-checks#health_check_source_ips_and_firewall_rules
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const ranges = pulumi.output(gcp.compute.getLBIPRanges({}));
 * const lb = new gcp.compute.Firewall("lb", {
 *     allows: [{
 *         ports: ["80"],
 *         protocol: "tcp",
 *     }],
 *     network: google_compute_network_main.name,
 *     sourceRanges: ranges.apply(ranges => ranges.networks),
 *     targetTags: ["InstanceBehindLoadBalancer"],
 * });
 * ```
 */
export declare function getLBIPRanges(opts?: pulumi.InvokeOptions): Promise<GetLBIPRangesResult>;
/**
 * A collection of values returned by getLBIPRanges.
 */
export interface GetLBIPRangesResult {
    /**
     * The IP ranges used for health checks when **HTTP(S), SSL proxy, TCP proxy, and Internal load balancing** is used
     */
    readonly httpSslTcpInternals: string[];
    /**
     * The IP ranges used for health checks when **Network load balancing** is used
     */
    readonly networks: string[];
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
