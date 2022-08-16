// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * CertificateMapEntry is a list of certificate configurations,
 * that have been issued for a particular hostname
 *
 * > **Warning:** These resources require allow-listing to use, and are not openly available to all Cloud customers. Engage with your Cloud account team to discuss how to onboard.
 *
 * ## Example Usage
 * ### Certificate Manager Certificate Map Entry Full
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const certificateMap = new gcp.certificatemanager.CertificateMap("certificateMap", {
 *     description: "My acceptance test certificate map",
 *     labels: {
 *         terraform: "true",
 *         "acc-test": "true",
 *     },
 * });
 * const instance = new gcp.certificatemanager.DnsAuthorization("instance", {
 *     description: "The default dnss",
 *     domain: "subdomain.hashicorptest.com",
 * });
 * const instance2 = new gcp.certificatemanager.DnsAuthorization("instance2", {
 *     description: "The default dnss",
 *     domain: "subdomain2.hashicorptest.com",
 * });
 * const certificate = new gcp.certificatemanager.Certificate("certificate", {
 *     description: "The default cert",
 *     scope: "DEFAULT",
 *     managed: {
 *         domains: [
 *             instance.domain,
 *             instance2.domain,
 *         ],
 *         dnsAuthorizations: [
 *             instance.id,
 *             instance2.id,
 *         ],
 *     },
 * });
 * const _default = new gcp.certificatemanager.CertificateMapEntry("default", {
 *     description: "My acceptance test certificate map entry",
 *     map: certificateMap.name,
 *     labels: {
 *         terraform: "true",
 *         "acc-test": "true",
 *     },
 *     certificates: [certificate.id],
 *     matcher: "PRIMARY",
 * });
 * ```
 *
 * ## Import
 *
 * CertificateMapEntry can be imported using any of these accepted formats
 *
 * ```sh
 *  $ pulumi import gcp:certificatemanager/certificateMapEntry:CertificateMapEntry default projects/{{project}}/locations/global/certificateMaps/{{map}}/certificateMapEntries/{{name}}
 * ```
 *
 * ```sh
 *  $ pulumi import gcp:certificatemanager/certificateMapEntry:CertificateMapEntry default {{project}}/{{map}}/{{name}}
 * ```
 *
 * ```sh
 *  $ pulumi import gcp:certificatemanager/certificateMapEntry:CertificateMapEntry default {{map}}/{{name}}
 * ```
 */
export class CertificateMapEntry extends pulumi.CustomResource {
    /**
     * Get an existing CertificateMapEntry resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CertificateMapEntryState, opts?: pulumi.CustomResourceOptions): CertificateMapEntry {
        return new CertificateMapEntry(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:certificatemanager/certificateMapEntry:CertificateMapEntry';

    /**
     * Returns true if the given object is an instance of CertificateMapEntry.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is CertificateMapEntry {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === CertificateMapEntry.__pulumiType;
    }

    /**
     * A set of Certificates defines for the given hostname.
     * There can be defined up to fifteen certificates in each Certificate Map Entry.
     * Each certificate must match pattern projects/*&#47;locations/*&#47;certificates/*.
     */
    public readonly certificates!: pulumi.Output<string[]>;
    /**
     * Creation timestamp of a Certificate Map Entry. Timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up
     * to nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
     */
    public /*out*/ readonly createTime!: pulumi.Output<string>;
    /**
     * A human-readable description of the resource.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * A Hostname (FQDN, e.g. example.com) or a wildcard hostname expression (*.example.com)
     * for a set of hostnames with common suffix. Used as Server Name Indication (SNI) for
     * selecting a proper certificate.
     */
    public readonly hostname!: pulumi.Output<string | undefined>;
    /**
     * Set of labels associated with a Certificate Map Entry.
     * An object containing a list of "key": value pairs.
     * Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
     */
    public readonly labels!: pulumi.Output<{[key: string]: string}>;
    /**
     * A map entry that is inputted into the cetrificate map
     */
    public readonly map!: pulumi.Output<string>;
    /**
     * A predefined matcher for particular cases, other than SNI selection
     */
    public readonly matcher!: pulumi.Output<string | undefined>;
    /**
     * A user-defined name of the Certificate Map Entry. Certificate Map Entry
     * names must be unique globally and match pattern
     * 'projects/*&#47;locations/*&#47;certificateMaps/*&#47;certificateMapEntries/*'
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    public readonly project!: pulumi.Output<string>;
    /**
     * A serving state of this Certificate Map Entry.
     */
    public /*out*/ readonly state!: pulumi.Output<string>;
    /**
     * Update timestamp of a Certificate Map Entry. Timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up
     * to nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
     */
    public /*out*/ readonly updateTime!: pulumi.Output<string>;

    /**
     * Create a CertificateMapEntry resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: CertificateMapEntryArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CertificateMapEntryArgs | CertificateMapEntryState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as CertificateMapEntryState | undefined;
            resourceInputs["certificates"] = state ? state.certificates : undefined;
            resourceInputs["createTime"] = state ? state.createTime : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["hostname"] = state ? state.hostname : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["map"] = state ? state.map : undefined;
            resourceInputs["matcher"] = state ? state.matcher : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["project"] = state ? state.project : undefined;
            resourceInputs["state"] = state ? state.state : undefined;
            resourceInputs["updateTime"] = state ? state.updateTime : undefined;
        } else {
            const args = argsOrState as CertificateMapEntryArgs | undefined;
            if ((!args || args.certificates === undefined) && !opts.urn) {
                throw new Error("Missing required property 'certificates'");
            }
            if ((!args || args.map === undefined) && !opts.urn) {
                throw new Error("Missing required property 'map'");
            }
            resourceInputs["certificates"] = args ? args.certificates : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["hostname"] = args ? args.hostname : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["map"] = args ? args.map : undefined;
            resourceInputs["matcher"] = args ? args.matcher : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["createTime"] = undefined /*out*/;
            resourceInputs["state"] = undefined /*out*/;
            resourceInputs["updateTime"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(CertificateMapEntry.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering CertificateMapEntry resources.
 */
export interface CertificateMapEntryState {
    /**
     * A set of Certificates defines for the given hostname.
     * There can be defined up to fifteen certificates in each Certificate Map Entry.
     * Each certificate must match pattern projects/*&#47;locations/*&#47;certificates/*.
     */
    certificates?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Creation timestamp of a Certificate Map Entry. Timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up
     * to nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
     */
    createTime?: pulumi.Input<string>;
    /**
     * A human-readable description of the resource.
     */
    description?: pulumi.Input<string>;
    /**
     * A Hostname (FQDN, e.g. example.com) or a wildcard hostname expression (*.example.com)
     * for a set of hostnames with common suffix. Used as Server Name Indication (SNI) for
     * selecting a proper certificate.
     */
    hostname?: pulumi.Input<string>;
    /**
     * Set of labels associated with a Certificate Map Entry.
     * An object containing a list of "key": value pairs.
     * Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map entry that is inputted into the cetrificate map
     */
    map?: pulumi.Input<string>;
    /**
     * A predefined matcher for particular cases, other than SNI selection
     */
    matcher?: pulumi.Input<string>;
    /**
     * A user-defined name of the Certificate Map Entry. Certificate Map Entry
     * names must be unique globally and match pattern
     * 'projects/*&#47;locations/*&#47;certificateMaps/*&#47;certificateMapEntries/*'
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * A serving state of this Certificate Map Entry.
     */
    state?: pulumi.Input<string>;
    /**
     * Update timestamp of a Certificate Map Entry. Timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up
     * to nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
     */
    updateTime?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a CertificateMapEntry resource.
 */
export interface CertificateMapEntryArgs {
    /**
     * A set of Certificates defines for the given hostname.
     * There can be defined up to fifteen certificates in each Certificate Map Entry.
     * Each certificate must match pattern projects/*&#47;locations/*&#47;certificates/*.
     */
    certificates: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A human-readable description of the resource.
     */
    description?: pulumi.Input<string>;
    /**
     * A Hostname (FQDN, e.g. example.com) or a wildcard hostname expression (*.example.com)
     * for a set of hostnames with common suffix. Used as Server Name Indication (SNI) for
     * selecting a proper certificate.
     */
    hostname?: pulumi.Input<string>;
    /**
     * Set of labels associated with a Certificate Map Entry.
     * An object containing a list of "key": value pairs.
     * Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map entry that is inputted into the cetrificate map
     */
    map: pulumi.Input<string>;
    /**
     * A predefined matcher for particular cases, other than SNI selection
     */
    matcher?: pulumi.Input<string>;
    /**
     * A user-defined name of the Certificate Map Entry. Certificate Map Entry
     * names must be unique globally and match pattern
     * 'projects/*&#47;locations/*&#47;certificateMaps/*&#47;certificateMapEntries/*'
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
}