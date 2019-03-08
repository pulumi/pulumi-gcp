import * as pulumi from "@pulumi/pulumi";
/**
 * Represents a Route resource.
 *
 * A route is a rule that specifies how certain packets should be handled by
 * the virtual network. Routes are associated with virtual machines by tag,
 * and the set of routes for a particular virtual machine is called its
 * routing table. For each packet leaving a virtual machine, the system
 * searches that virtual machine's routing table for a single best matching
 * route.
 *
 * Routes match packets by destination IP address, preferring smaller or more
 * specific ranges over larger ones. If there is a tie, the system selects
 * the route with the smallest priority value. If there is still a tie, it
 * uses the layer three and four packet headers to select just one of the
 * remaining matching routes. The packet is then forwarded as specified by
 * the next_hop field of the winning route -- either to another virtual
 * machine destination, a virtual machine gateway or a Compute
 * Engine-operated gateway. Packets that do not match any route in the
 * sending virtual machine's routing table will be dropped.
 *
 * A Route resource must have exactly one specification of either
 * nextHopGateway, nextHopInstance, nextHopIp, or nextHopVpnTunnel.
 *
 *
 * To get more information about Route, see:
 *
 * * [API documentation](https://cloud.google.com/compute/docs/reference/rest/v1/routes)
 * * How-to Guides
 *     * [Using Routes](https://cloud.google.com/vpc/docs/using-routes)
 *
 * <div class = "oics-button" style="float: right; margin: 0 0 -15px">
 *   <a href="https://console.cloud.google.com/cloudshell/open?cloudshell_git_repo=https%3A%2F%2Fgithub.com%2Fterraform-google-modules%2Fdocs-examples.git&cloudshell_working_dir=route_basic&cloudshell_image=gcr.io%2Fgraphite-cloud-shell-images%2Fterraform%3Alatest&open_in_editor=main.tf&cloudshell_print=.%2Fmotd&cloudshell_tutorial=.%2Ftutorial.md" target="_blank">
 *     <img alt="Open in Cloud Shell" src="//gstatic.com/cloudssh/images/open-btn.svg" style="max-height: 44px; margin: 32px auto; max-width: 100%;">
 *   </a>
 * </div>
 * ## Example Usage - Route Basic
 *
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const defaultNetwork = new gcp.compute.Network("default", {});
 * const defaultRoute = new gcp.compute.Route("default", {
 *     destRange: "15.0.0.0/24",
 *     network: defaultNetwork.name,
 *     nextHopIp: "10.132.1.5",
 *     priority: 100,
 * });
 * ```
 */
export declare class Route extends pulumi.CustomResource {
    /**
     * Get an existing Route resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RouteState, opts?: pulumi.CustomResourceOptions): Route;
    readonly description: pulumi.Output<string | undefined>;
    readonly destRange: pulumi.Output<string>;
    readonly name: pulumi.Output<string>;
    readonly network: pulumi.Output<string>;
    readonly nextHopGateway: pulumi.Output<string | undefined>;
    readonly nextHopInstance: pulumi.Output<string | undefined>;
    /**
     * (Optional when `next_hop_instance` is
     * specified)  The zone of the instance specified in
     * `next_hop_instance`.  Omit if `next_hop_instance` is specified as
     * a URL.
     */
    readonly nextHopInstanceZone: pulumi.Output<string | undefined>;
    readonly nextHopIp: pulumi.Output<string | undefined>;
    readonly nextHopNetwork: pulumi.Output<string>;
    readonly nextHopVpnTunnel: pulumi.Output<string | undefined>;
    readonly priority: pulumi.Output<number | undefined>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    readonly project: pulumi.Output<string>;
    /**
     * The URI of the created resource.
     */
    readonly selfLink: pulumi.Output<string>;
    readonly tags: pulumi.Output<string[] | undefined>;
    /**
     * Create a Route resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RouteArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering Route resources.
 */
export interface RouteState {
    readonly description?: pulumi.Input<string>;
    readonly destRange?: pulumi.Input<string>;
    readonly name?: pulumi.Input<string>;
    readonly network?: pulumi.Input<string>;
    readonly nextHopGateway?: pulumi.Input<string>;
    readonly nextHopInstance?: pulumi.Input<string>;
    /**
     * (Optional when `next_hop_instance` is
     * specified)  The zone of the instance specified in
     * `next_hop_instance`.  Omit if `next_hop_instance` is specified as
     * a URL.
     */
    readonly nextHopInstanceZone?: pulumi.Input<string>;
    readonly nextHopIp?: pulumi.Input<string>;
    readonly nextHopNetwork?: pulumi.Input<string>;
    readonly nextHopVpnTunnel?: pulumi.Input<string>;
    readonly priority?: pulumi.Input<number>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    /**
     * The URI of the created resource.
     */
    readonly selfLink?: pulumi.Input<string>;
    readonly tags?: pulumi.Input<pulumi.Input<string>[]>;
}
/**
 * The set of arguments for constructing a Route resource.
 */
export interface RouteArgs {
    readonly description?: pulumi.Input<string>;
    readonly destRange: pulumi.Input<string>;
    readonly name?: pulumi.Input<string>;
    readonly network: pulumi.Input<string>;
    readonly nextHopGateway?: pulumi.Input<string>;
    readonly nextHopInstance?: pulumi.Input<string>;
    /**
     * (Optional when `next_hop_instance` is
     * specified)  The zone of the instance specified in
     * `next_hop_instance`.  Omit if `next_hop_instance` is specified as
     * a URL.
     */
    readonly nextHopInstanceZone?: pulumi.Input<string>;
    readonly nextHopIp?: pulumi.Input<string>;
    readonly nextHopVpnTunnel?: pulumi.Input<string>;
    readonly priority?: pulumi.Input<number>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    readonly tags?: pulumi.Input<pulumi.Input<string>[]>;
}
