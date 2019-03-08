import * as pulumi from "@pulumi/pulumi";
/**
 * Manages a set of DNS records within Google Cloud DNS. For more information see [the official documentation](https://cloud.google.com/dns/records/) and
 * [API](https://cloud.google.com/dns/api/v1/resourceRecordSets).
 *
 * > **Note:** The Google Cloud DNS API requires NS records be present at all
 * times. To accommodate this, when creating NS records, the default records
 * Google automatically creates will be silently overwritten.  Also, when
 * destroying NS records, Terraform will not actually remove NS records, but will
 * report that it did.
 *
 * ## Example Usage
 *
 * ### Binding a DNS name to the ephemeral IP of a new instance:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const frontendInstance = new gcp.compute.Instance("frontend", {
 *     bootDisk: {
 *         initializeParams: {
 *             image: "debian-cloud/debian-9",
 *         },
 *     },
 *     machineType: "g1-small",
 *     networkInterfaces: [{
 *         accessConfigs: [{}],
 *         network: "default",
 *     }],
 *     zone: "us-central1-b",
 * });
 * const prod = new gcp.dns.ManagedZone("prod", {
 *     dnsName: "prod.mydomain.com.",
 * });
 * const frontendRecordSet = new gcp.dns.RecordSet("frontend", {
 *     managedZone: prod.name,
 *     rrdatas: [frontendInstance.networkInterfaces.apply(networkInterfaces => networkInterfaces[0].accessConfig.0.natIp)],
 *     ttl: 300,
 *     type: "A",
 * });
 * ```
 *
 * ### Adding an A record
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const prod = new gcp.dns.ManagedZone("prod", {
 *     dnsName: "prod.mydomain.com.",
 * });
 * const recordSet = new gcp.dns.RecordSet("a", {
 *     managedZone: prod.name,
 *     rrdatas: ["8.8.8.8"],
 *     ttl: 300,
 *     type: "A",
 * });
 * ```
 *
 * ### Adding an MX record
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const prod = new gcp.dns.ManagedZone("prod", {
 *     dnsName: "prod.mydomain.com.",
 * });
 * const mx = new gcp.dns.RecordSet("mx", {
 *     managedZone: prod.name,
 *     rrdatas: [
 *         "1 aspmx.l.google.com.",
 *         "5 alt1.aspmx.l.google.com.",
 *         "5 alt2.aspmx.l.google.com.",
 *         "10 alt3.aspmx.l.google.com.",
 *         "10 alt4.aspmx.l.google.com.",
 *     ],
 *     ttl: 3600,
 *     type: "MX",
 * });
 * ```
 *
 * ### Adding an SPF record
 *
 * Quotes (`""`) must be added around your `rrdatas` for a SPF record. Otherwise `rrdatas` string gets split on spaces.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const prod = new gcp.dns.ManagedZone("prod", {
 *     dnsName: "prod.mydomain.com.",
 * });
 * const spf = new gcp.dns.RecordSet("spf", {
 *     managedZone: prod.name,
 *     rrdatas: ["\"v=spf1 ip4:111.111.111.111 include:backoff.email-example.com -all\""],
 *     ttl: 300,
 *     type: "TXT",
 * });
 * ```
 */
export declare class RecordSet extends pulumi.CustomResource {
    /**
     * Get an existing RecordSet resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RecordSetState, opts?: pulumi.CustomResourceOptions): RecordSet;
    /**
     * The name of the zone in which this record set will
     * reside.
     */
    readonly managedZone: pulumi.Output<string>;
    /**
     * The DNS name this record set will apply to.
     */
    readonly name: pulumi.Output<string>;
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    readonly project: pulumi.Output<string>;
    /**
     * The string data for the records in this record set
     * whose meaning depends on the DNS type. For TXT record, if the string data contains spaces, add surrounding `\"` if you don't want your string to get split on spaces.
     */
    readonly rrdatas: pulumi.Output<string[]>;
    /**
     * The time-to-live of this record set (seconds).
     */
    readonly ttl: pulumi.Output<number>;
    /**
     * The DNS record set type.
     */
    readonly type: pulumi.Output<string>;
    /**
     * Create a RecordSet resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RecordSetArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering RecordSet resources.
 */
export interface RecordSetState {
    /**
     * The name of the zone in which this record set will
     * reside.
     */
    readonly managedZone?: pulumi.Input<string>;
    /**
     * The DNS name this record set will apply to.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    /**
     * The string data for the records in this record set
     * whose meaning depends on the DNS type. For TXT record, if the string data contains spaces, add surrounding `\"` if you don't want your string to get split on spaces.
     */
    readonly rrdatas?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The time-to-live of this record set (seconds).
     */
    readonly ttl?: pulumi.Input<number>;
    /**
     * The DNS record set type.
     */
    readonly type?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a RecordSet resource.
 */
export interface RecordSetArgs {
    /**
     * The name of the zone in which this record set will
     * reside.
     */
    readonly managedZone: pulumi.Input<string>;
    /**
     * The DNS name this record set will apply to.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    /**
     * The string data for the records in this record set
     * whose meaning depends on the DNS type. For TXT record, if the string data contains spaces, add surrounding `\"` if you don't want your string to get split on spaces.
     */
    readonly rrdatas: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The time-to-live of this record set (seconds).
     */
    readonly ttl: pulumi.Input<number>;
    /**
     * The DNS record set type.
     */
    readonly type: pulumi.Input<string>;
}
