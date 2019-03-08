import * as pulumi from "@pulumi/pulumi";
/**
 * Provides access to a zone's attributes within Google Cloud DNS.
 * For more information see
 * [the official documentation](https://cloud.google.com/dns/zones/)
 * and
 * [API](https://cloud.google.com/dns/api/v1/managedZones).
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const envDnsZone = pulumi.output(gcp.dns.getManagedZone({
 *     name: "qa-zone",
 * }));
 * const dns = new gcp.dns.RecordSet("dns", {
 *     managedZone: envDnsZone.apply(envDnsZone => envDnsZone.name),
 *     rrdatas: ["test"],
 *     ttl: 300,
 *     type: "TXT",
 * });
 * ```
 */
export declare function getManagedZone(args: GetManagedZoneArgs, opts?: pulumi.InvokeOptions): Promise<GetManagedZoneResult>;
/**
 * A collection of arguments for invoking getManagedZone.
 */
export interface GetManagedZoneArgs {
    /**
     * A unique name for the resource.
     */
    readonly name: string;
    /**
     * The ID of the project for the Google Cloud DNS zone.
     */
    readonly project?: string;
}
/**
 * A collection of values returned by getManagedZone.
 */
export interface GetManagedZoneResult {
    /**
     * A textual description field.
     */
    readonly description: string;
    /**
     * The fully qualified DNS name of this zone, e.g. `terraform.io.`.
     */
    readonly dnsName: string;
    /**
     * The list of nameservers that will be authoritative for this
     * domain. Use NS records to redirect from your DNS provider to these names,
     * thus making Google Cloud DNS authoritative for this zone.
     */
    readonly nameServers: string[];
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
