import * as pulumi from "@pulumi/pulumi";
/**
 * Manages a Cloud NAT. For more information see
 * [the official documentation](https://cloud.google.com/nat/docs/overview)
 * and
 * [API](https://cloud.google.com/compute/docs/reference/rest/beta/routers).
 *
 * ## Example Usage
 *
 * A simple NAT configuration: enable NAT for all Subnetworks associated with
 * the Network associated with the given Router.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const defaultNetwork = new gcp.compute.Network("default", {});
 * const defaultSubnetwork = new gcp.compute.Subnetwork("default", {
 *     ipCidrRange: "10.0.0.0/16",
 *     network: defaultNetwork.selfLink,
 *     region: "us-central1",
 * });
 * const router = new gcp.compute.Router("router", {
 *     bgp: {
 *         asn: 64514,
 *     },
 *     network: defaultNetwork.selfLink,
 *     region: defaultSubnetwork.region,
 * });
 * const simple_nat = new gcp.compute.RouterNat("simple-nat", {
 *     natIpAllocateOption: "AUTO_ONLY",
 *     region: "us-central1",
 *     router: router.name,
 *     sourceSubnetworkIpRangesToNat: "ALL_SUBNETWORKS_ALL_IP_RANGES",
 * });
 * ```
 *
 * A production-like configuration: enable NAT for one Subnetwork and use a list of
 * static external IP addresses.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const address: gcp.compute.Address[] = [];
 * for (let i = 0; i < 2; i++) {
 *     address.push(new gcp.compute.Address(`address-${i}`, {
 *         region: "us-central1",
 *     }));
 * }
 * const defaultNetwork = new gcp.compute.Network("default", {});
 * const defaultSubnetwork = new gcp.compute.Subnetwork("default", {
 *     ipCidrRange: "10.0.0.0/16",
 *     network: defaultNetwork.selfLink,
 *     region: "us-central1",
 * });
 * const router = new gcp.compute.Router("router", {
 *     bgp: {
 *         asn: 64514,
 *     },
 *     network: defaultNetwork.selfLink,
 *     region: defaultSubnetwork.region,
 * });
 * const advanced_nat = new gcp.compute.RouterNat("advanced-nat", {
 *     natIpAllocateOption: "MANUAL_ONLY",
 *     natIps: address.map(v => v.selfLink),
 *     region: "us-central1",
 *     router: router.name,
 *     sourceSubnetworkIpRangesToNat: "LIST_OF_SUBNETWORKS",
 *     subnetworks: [{
 *         name: google_compute_subnetwork_subnetwork.selfLink,
 *     }],
 * });
 * ```
 */
export declare class RouterNat extends pulumi.CustomResource {
    /**
     * Get an existing RouterNat resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RouterNatState, opts?: pulumi.CustomResourceOptions): RouterNat;
    /**
     * Timeout (in seconds) for ICMP connections.
     * Defaults to 30s if not set. Changing this forces a new NAT to be created.
     */
    readonly icmpIdleTimeoutSec: pulumi.Output<number | undefined>;
    /**
     * Minimum number of ports allocated to a VM
     * from this NAT config. If not set, a default number of ports is allocated to a VM.
     * Changing this forces a new NAT to be created.
     */
    readonly minPortsPerVm: pulumi.Output<number | undefined>;
    /**
     * A unique name for Cloud NAT, required by GCE. Changing
     * this forces a new NAT to be created.
     */
    readonly name: pulumi.Output<string>;
    /**
     * How external IPs should be allocated for
     * this NAT. Valid values are `AUTO_ONLY` or `MANUAL_ONLY`. Changing this forces
     * a new NAT to be created.
     */
    readonly natIpAllocateOption: pulumi.Output<string>;
    /**
     * List of `self_link`s of external IPs. Only valid if
     * `nat_ip_allocate_option` is set to `MANUAL_ONLY`. Changing this forces a
     * new NAT to be created.
     */
    readonly natIps: pulumi.Output<string[] | undefined>;
    /**
     * The ID of the project in which this NAT's router belongs. If it
     * is not provided, the provider project is used. Changing this forces a new NAT to be created.
     */
    readonly project: pulumi.Output<string>;
    /**
     * The region this NAT's router sits in. If not specified,
     * the project region will be used. Changing this forces a new NAT to be
     * created.
     */
    readonly region: pulumi.Output<string>;
    /**
     * The name of the router in which this NAT will be configured.
     * Changing this forces a new NAT to be created.
     */
    readonly router: pulumi.Output<string>;
    /**
     * How NAT should be configured
     * per Subnetwork. Valid values include: `ALL_SUBNETWORKS_ALL_IP_RANGES`,
     * `ALL_SUBNETWORKS_ALL_PRIMARY_IP_RANGES`, `LIST_OF_SUBNETWORKS`. Changing
     * this forces a new NAT to be created.
     */
    readonly sourceSubnetworkIpRangesToNat: pulumi.Output<string | undefined>;
    /**
     * One or more subnetwork NAT configurations. Only used
     * if `source_subnetwork_ip_ranges_to_nat` is set to `LIST_OF_SUBNETWORKS`. See
     * the section below for details on configuration.
     */
    readonly subnetworks: pulumi.Output<{
        name: string;
        secondaryIpRangeNames?: string[];
        sourceIpRangesToNats: string[];
    }[] | undefined>;
    /**
     * Timeout (in seconds) for TCP
     * established connections. Defaults to 1200s if not set. Changing this forces
     * a new NAT to be created.
     */
    readonly tcpEstablishedIdleTimeoutSec: pulumi.Output<number | undefined>;
    /**
     * Timeout (in seconds) for TCP
     * transitory connections. Defaults to 30s if not set. Changing this forces a
     * new NAT to be created.
     */
    readonly tcpTransitoryIdleTimeoutSec: pulumi.Output<number | undefined>;
    /**
     * Timeout (in seconds) for UDP connections.
     * Defaults to 30s if not set. Changing this forces a new NAT to be created.
     */
    readonly udpIdleTimeoutSec: pulumi.Output<number | undefined>;
    /**
     * Create a RouterNat resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RouterNatArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering RouterNat resources.
 */
export interface RouterNatState {
    /**
     * Timeout (in seconds) for ICMP connections.
     * Defaults to 30s if not set. Changing this forces a new NAT to be created.
     */
    readonly icmpIdleTimeoutSec?: pulumi.Input<number>;
    /**
     * Minimum number of ports allocated to a VM
     * from this NAT config. If not set, a default number of ports is allocated to a VM.
     * Changing this forces a new NAT to be created.
     */
    readonly minPortsPerVm?: pulumi.Input<number>;
    /**
     * A unique name for Cloud NAT, required by GCE. Changing
     * this forces a new NAT to be created.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * How external IPs should be allocated for
     * this NAT. Valid values are `AUTO_ONLY` or `MANUAL_ONLY`. Changing this forces
     * a new NAT to be created.
     */
    readonly natIpAllocateOption?: pulumi.Input<string>;
    /**
     * List of `self_link`s of external IPs. Only valid if
     * `nat_ip_allocate_option` is set to `MANUAL_ONLY`. Changing this forces a
     * new NAT to be created.
     */
    readonly natIps?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The ID of the project in which this NAT's router belongs. If it
     * is not provided, the provider project is used. Changing this forces a new NAT to be created.
     */
    readonly project?: pulumi.Input<string>;
    /**
     * The region this NAT's router sits in. If not specified,
     * the project region will be used. Changing this forces a new NAT to be
     * created.
     */
    readonly region?: pulumi.Input<string>;
    /**
     * The name of the router in which this NAT will be configured.
     * Changing this forces a new NAT to be created.
     */
    readonly router?: pulumi.Input<string>;
    /**
     * How NAT should be configured
     * per Subnetwork. Valid values include: `ALL_SUBNETWORKS_ALL_IP_RANGES`,
     * `ALL_SUBNETWORKS_ALL_PRIMARY_IP_RANGES`, `LIST_OF_SUBNETWORKS`. Changing
     * this forces a new NAT to be created.
     */
    readonly sourceSubnetworkIpRangesToNat?: pulumi.Input<string>;
    /**
     * One or more subnetwork NAT configurations. Only used
     * if `source_subnetwork_ip_ranges_to_nat` is set to `LIST_OF_SUBNETWORKS`. See
     * the section below for details on configuration.
     */
    readonly subnetworks?: pulumi.Input<pulumi.Input<{
        name: pulumi.Input<string>;
        secondaryIpRangeNames?: pulumi.Input<pulumi.Input<string>[]>;
        sourceIpRangesToNats: pulumi.Input<pulumi.Input<string>[]>;
    }>[]>;
    /**
     * Timeout (in seconds) for TCP
     * established connections. Defaults to 1200s if not set. Changing this forces
     * a new NAT to be created.
     */
    readonly tcpEstablishedIdleTimeoutSec?: pulumi.Input<number>;
    /**
     * Timeout (in seconds) for TCP
     * transitory connections. Defaults to 30s if not set. Changing this forces a
     * new NAT to be created.
     */
    readonly tcpTransitoryIdleTimeoutSec?: pulumi.Input<number>;
    /**
     * Timeout (in seconds) for UDP connections.
     * Defaults to 30s if not set. Changing this forces a new NAT to be created.
     */
    readonly udpIdleTimeoutSec?: pulumi.Input<number>;
}
/**
 * The set of arguments for constructing a RouterNat resource.
 */
export interface RouterNatArgs {
    /**
     * Timeout (in seconds) for ICMP connections.
     * Defaults to 30s if not set. Changing this forces a new NAT to be created.
     */
    readonly icmpIdleTimeoutSec?: pulumi.Input<number>;
    /**
     * Minimum number of ports allocated to a VM
     * from this NAT config. If not set, a default number of ports is allocated to a VM.
     * Changing this forces a new NAT to be created.
     */
    readonly minPortsPerVm?: pulumi.Input<number>;
    /**
     * A unique name for Cloud NAT, required by GCE. Changing
     * this forces a new NAT to be created.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * How external IPs should be allocated for
     * this NAT. Valid values are `AUTO_ONLY` or `MANUAL_ONLY`. Changing this forces
     * a new NAT to be created.
     */
    readonly natIpAllocateOption: pulumi.Input<string>;
    /**
     * List of `self_link`s of external IPs. Only valid if
     * `nat_ip_allocate_option` is set to `MANUAL_ONLY`. Changing this forces a
     * new NAT to be created.
     */
    readonly natIps?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The ID of the project in which this NAT's router belongs. If it
     * is not provided, the provider project is used. Changing this forces a new NAT to be created.
     */
    readonly project?: pulumi.Input<string>;
    /**
     * The region this NAT's router sits in. If not specified,
     * the project region will be used. Changing this forces a new NAT to be
     * created.
     */
    readonly region?: pulumi.Input<string>;
    /**
     * The name of the router in which this NAT will be configured.
     * Changing this forces a new NAT to be created.
     */
    readonly router: pulumi.Input<string>;
    /**
     * How NAT should be configured
     * per Subnetwork. Valid values include: `ALL_SUBNETWORKS_ALL_IP_RANGES`,
     * `ALL_SUBNETWORKS_ALL_PRIMARY_IP_RANGES`, `LIST_OF_SUBNETWORKS`. Changing
     * this forces a new NAT to be created.
     */
    readonly sourceSubnetworkIpRangesToNat?: pulumi.Input<string>;
    /**
     * One or more subnetwork NAT configurations. Only used
     * if `source_subnetwork_ip_ranges_to_nat` is set to `LIST_OF_SUBNETWORKS`. See
     * the section below for details on configuration.
     */
    readonly subnetworks?: pulumi.Input<pulumi.Input<{
        name: pulumi.Input<string>;
        secondaryIpRangeNames?: pulumi.Input<pulumi.Input<string>[]>;
        sourceIpRangesToNats: pulumi.Input<pulumi.Input<string>[]>;
    }>[]>;
    /**
     * Timeout (in seconds) for TCP
     * established connections. Defaults to 1200s if not set. Changing this forces
     * a new NAT to be created.
     */
    readonly tcpEstablishedIdleTimeoutSec?: pulumi.Input<number>;
    /**
     * Timeout (in seconds) for TCP
     * transitory connections. Defaults to 30s if not set. Changing this forces a
     * new NAT to be created.
     */
    readonly tcpTransitoryIdleTimeoutSec?: pulumi.Input<number>;
    /**
     * Timeout (in seconds) for UDP connections.
     * Defaults to 30s if not set. Changing this forces a new NAT to be created.
     */
    readonly udpIdleTimeoutSec?: pulumi.Input<number>;
}
