import * as pulumi from "@pulumi/pulumi";
/**
 * Manages a network peering within GCE. For more information see
 * [the official documentation](https://cloud.google.com/compute/docs/vpc/vpc-peering)
 * and
 * [API](https://cloud.google.com/compute/docs/reference/latest/networks).
 *
 * > **Note:** Both network must create a peering with each other for the peering to be functional.
 *
 * > **Note:** Subnets IP ranges across peered VPC networks cannot overlap.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const defaultNetwork = new gcp.compute.Network("default", {
 *     autoCreateSubnetworks: false,
 * });
 * const other = new gcp.compute.Network("other", {
 *     autoCreateSubnetworks: false,
 * });
 * const peering1 = new gcp.compute.NetworkPeering("peering1", {
 *     network: defaultNetwork.selfLink,
 *     peerNetwork: other.selfLink,
 * });
 * const peering2 = new gcp.compute.NetworkPeering("peering2", {
 *     network: other.selfLink,
 *     peerNetwork: defaultNetwork.selfLink,
 * });
 * ```
 */
export declare class NetworkPeering extends pulumi.CustomResource {
    /**
     * Get an existing NetworkPeering resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: NetworkPeeringState, opts?: pulumi.CustomResourceOptions): NetworkPeering;
    /**
     * If set to `true`, the routes between the two networks will
     * be created and managed automatically. Defaults to `true`.
     */
    readonly autoCreateRoutes: pulumi.Output<boolean | undefined>;
    /**
     * Name of the peering.
     */
    readonly name: pulumi.Output<string>;
    /**
     * Resource link of the network to add a peering to.
     */
    readonly network: pulumi.Output<string>;
    /**
     * Resource link of the peer network.
     */
    readonly peerNetwork: pulumi.Output<string>;
    /**
     * State for the peering.
     */
    readonly state: pulumi.Output<string>;
    /**
     * Details about the current state of the peering.
     */
    readonly stateDetails: pulumi.Output<string>;
    /**
     * Create a NetworkPeering resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: NetworkPeeringArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering NetworkPeering resources.
 */
export interface NetworkPeeringState {
    /**
     * If set to `true`, the routes between the two networks will
     * be created and managed automatically. Defaults to `true`.
     */
    readonly autoCreateRoutes?: pulumi.Input<boolean>;
    /**
     * Name of the peering.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * Resource link of the network to add a peering to.
     */
    readonly network?: pulumi.Input<string>;
    /**
     * Resource link of the peer network.
     */
    readonly peerNetwork?: pulumi.Input<string>;
    /**
     * State for the peering.
     */
    readonly state?: pulumi.Input<string>;
    /**
     * Details about the current state of the peering.
     */
    readonly stateDetails?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a NetworkPeering resource.
 */
export interface NetworkPeeringArgs {
    /**
     * If set to `true`, the routes between the two networks will
     * be created and managed automatically. Defaults to `true`.
     */
    readonly autoCreateRoutes?: pulumi.Input<boolean>;
    /**
     * Name of the peering.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * Resource link of the network to add a peering to.
     */
    readonly network: pulumi.Input<string>;
    /**
     * Resource link of the peer network.
     */
    readonly peerNetwork: pulumi.Input<string>;
}
