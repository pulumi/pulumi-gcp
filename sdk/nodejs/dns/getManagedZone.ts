// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

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
 * const envDnsZone = gcp.dns.getManagedZone({
 *     name: "qa-zone",
 * });
 * const dns = new gcp.dns.RecordSet("dns", {
 *     name: envDnsZone.then(envDnsZone => `my-address.${envDnsZone.dnsName}`),
 *     type: "TXT",
 *     ttl: 300,
 *     managedZone: envDnsZone.then(envDnsZone => envDnsZone.name),
 *     rrdatas: ["test"],
 * });
 * ```
 */
export function getManagedZone(args: GetManagedZoneArgs, opts?: pulumi.InvokeOptions): Promise<GetManagedZoneResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("gcp:dns/getManagedZone:getManagedZone", {
        "name": args.name,
        "project": args.project,
    }, opts);
}

/**
 * A collection of arguments for invoking getManagedZone.
 */
export interface GetManagedZoneArgs {
    /**
     * A unique name for the resource.
     */
    name: string;
    /**
     * The ID of the project for the Google Cloud DNS zone.  If this is not provided the default project will be used.
     */
    project?: string;
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
     * The fully qualified DNS name of this zone, e.g. `example.io.`.
     */
    readonly dnsName: string;
    readonly id: string;
    readonly managedZoneId: string;
    readonly name: string;
    /**
     * The list of nameservers that will be authoritative for this
     * domain. Use NS records to redirect from your DNS provider to these names,
     * thus making Google Cloud DNS authoritative for this zone.
     */
    readonly nameServers: string[];
    readonly project?: string;
    /**
     * The zone's visibility: public zones are exposed to the Internet,
     * while private zones are visible only to Virtual Private Cloud resources.
     */
    readonly visibility: string;
}
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
 * const envDnsZone = gcp.dns.getManagedZone({
 *     name: "qa-zone",
 * });
 * const dns = new gcp.dns.RecordSet("dns", {
 *     name: envDnsZone.then(envDnsZone => `my-address.${envDnsZone.dnsName}`),
 *     type: "TXT",
 *     ttl: 300,
 *     managedZone: envDnsZone.then(envDnsZone => envDnsZone.name),
 *     rrdatas: ["test"],
 * });
 * ```
 */
export function getManagedZoneOutput(args: GetManagedZoneOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetManagedZoneResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("gcp:dns/getManagedZone:getManagedZone", {
        "name": args.name,
        "project": args.project,
    }, opts);
}

/**
 * A collection of arguments for invoking getManagedZone.
 */
export interface GetManagedZoneOutputArgs {
    /**
     * A unique name for the resource.
     */
    name: pulumi.Input<string>;
    /**
     * The ID of the project for the Google Cloud DNS zone.  If this is not provided the default project will be used.
     */
    project?: pulumi.Input<string>;
}
