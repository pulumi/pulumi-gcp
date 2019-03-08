import * as pulumi from "@pulumi/pulumi";
/**
 * Manages a Cloud Router BGP peer. For more information see
 * [the official documentation](https://cloud.google.com/compute/docs/cloudrouter)
 * and
 * [API](https://cloud.google.com/compute/docs/reference/latest/routers).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const foobar = new gcp.compute.RouterPeer("foobar", {
 *     advertisedRoutePriority: 100,
 *     interface: "interface-1",
 *     peerAsn: 65513,
 *     peerIpAddress: "169.254.1.2",
 *     region: "us-central1",
 *     router: "router-1",
 * });
 * ```
 */
export declare class RouterPeer extends pulumi.CustomResource {
    /**
     * Get an existing RouterPeer resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RouterPeerState, opts?: pulumi.CustomResourceOptions): RouterPeer;
    /**
     * The priority of routes advertised to this BGP peer.
     * Changing this forces a new peer to be created.
     */
    readonly advertisedRoutePriority: pulumi.Output<number | undefined>;
    /**
     * The name of the interface the BGP peer is associated with.
     * Changing this forces a new peer to be created.
     */
    readonly interface: pulumi.Output<string>;
    /**
     * IP address of the interface inside Google Cloud Platform.
     */
    readonly ipAddress: pulumi.Output<string>;
    /**
     * A unique name for BGP peer, required by GCE. Changing
     * this forces a new peer to be created.
     */
    readonly name: pulumi.Output<string>;
    /**
     * Peer BGP Autonomous System Number (ASN).
     * Changing this forces a new peer to be created.
     */
    readonly peerAsn: pulumi.Output<number>;
    /**
     * IP address of the BGP interface outside Google Cloud.
     * Changing this forces a new peer to be created.
     */
    readonly peerIpAddress: pulumi.Output<string | undefined>;
    /**
     * The ID of the project in which this peer's router belongs. If it
     * is not provided, the provider project is used. Changing this forces a new peer to be created.
     */
    readonly project: pulumi.Output<string>;
    /**
     * The region this peer's router sits in. If not specified,
     * the project region will be used. Changing this forces a new peer to be
     * created.
     */
    readonly region: pulumi.Output<string>;
    /**
     * The name of the router in which this BGP peer will be configured.
     * Changing this forces a new peer to be created.
     */
    readonly router: pulumi.Output<string>;
    /**
     * Create a RouterPeer resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RouterPeerArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering RouterPeer resources.
 */
export interface RouterPeerState {
    /**
     * The priority of routes advertised to this BGP peer.
     * Changing this forces a new peer to be created.
     */
    readonly advertisedRoutePriority?: pulumi.Input<number>;
    /**
     * The name of the interface the BGP peer is associated with.
     * Changing this forces a new peer to be created.
     */
    readonly interface?: pulumi.Input<string>;
    /**
     * IP address of the interface inside Google Cloud Platform.
     */
    readonly ipAddress?: pulumi.Input<string>;
    /**
     * A unique name for BGP peer, required by GCE. Changing
     * this forces a new peer to be created.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * Peer BGP Autonomous System Number (ASN).
     * Changing this forces a new peer to be created.
     */
    readonly peerAsn?: pulumi.Input<number>;
    /**
     * IP address of the BGP interface outside Google Cloud.
     * Changing this forces a new peer to be created.
     */
    readonly peerIpAddress?: pulumi.Input<string>;
    /**
     * The ID of the project in which this peer's router belongs. If it
     * is not provided, the provider project is used. Changing this forces a new peer to be created.
     */
    readonly project?: pulumi.Input<string>;
    /**
     * The region this peer's router sits in. If not specified,
     * the project region will be used. Changing this forces a new peer to be
     * created.
     */
    readonly region?: pulumi.Input<string>;
    /**
     * The name of the router in which this BGP peer will be configured.
     * Changing this forces a new peer to be created.
     */
    readonly router?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a RouterPeer resource.
 */
export interface RouterPeerArgs {
    /**
     * The priority of routes advertised to this BGP peer.
     * Changing this forces a new peer to be created.
     */
    readonly advertisedRoutePriority?: pulumi.Input<number>;
    /**
     * The name of the interface the BGP peer is associated with.
     * Changing this forces a new peer to be created.
     */
    readonly interface: pulumi.Input<string>;
    /**
     * A unique name for BGP peer, required by GCE. Changing
     * this forces a new peer to be created.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * Peer BGP Autonomous System Number (ASN).
     * Changing this forces a new peer to be created.
     */
    readonly peerAsn: pulumi.Input<number>;
    /**
     * IP address of the BGP interface outside Google Cloud.
     * Changing this forces a new peer to be created.
     */
    readonly peerIpAddress?: pulumi.Input<string>;
    /**
     * The ID of the project in which this peer's router belongs. If it
     * is not provided, the provider project is used. Changing this forces a new peer to be created.
     */
    readonly project?: pulumi.Input<string>;
    /**
     * The region this peer's router sits in. If not specified,
     * the project region will be used. Changing this forces a new peer to be
     * created.
     */
    readonly region?: pulumi.Input<string>;
    /**
     * The name of the router in which this BGP peer will be configured.
     * Changing this forces a new peer to be created.
     */
    readonly router: pulumi.Input<string>;
}
