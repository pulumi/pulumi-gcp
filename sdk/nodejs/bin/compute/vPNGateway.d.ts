import * as pulumi from "@pulumi/pulumi";
/**
 * Represents a VPN gateway running in GCP. This virtual device is managed
 * by Google, but used only by you.
 *
 *
 * To get more information about VpnGateway, see:
 *
 * * [API documentation](https://cloud.google.com/compute/docs/reference/rest/v1/targetVpnGateways)
 *
 * <div class = "oics-button" style="float: right; margin: 0 0 -15px">
 *   <a href="https://console.cloud.google.com/cloudshell/open?cloudshell_git_repo=https%3A%2F%2Fgithub.com%2Fterraform-google-modules%2Fdocs-examples.git&cloudshell_working_dir=target_vpn_gateway_basic&cloudshell_image=gcr.io%2Fgraphite-cloud-shell-images%2Fterraform%3Alatest&open_in_editor=main.tf&cloudshell_print=.%2Fmotd&cloudshell_tutorial=.%2Ftutorial.md" target="_blank">
 *     <img alt="Open in Cloud Shell" src="//gstatic.com/cloudssh/images/open-btn.svg" style="max-height: 44px; margin: 32px auto; max-width: 100%;">
 *   </a>
 * </div>
 * ## Example Usage - Target Vpn Gateway Basic
 *
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const vpnStaticIp = new gcp.compute.Address("vpn_static_ip", {});
 * const network1 = new gcp.compute.Network("network1", {});
 * const targetGateway = new gcp.compute.VPNGateway("target_gateway", {
 *     network: network1.selfLink,
 * });
 * const frEsp = new gcp.compute.ForwardingRule("fr_esp", {
 *     ipAddress: vpnStaticIp.address,
 *     ipProtocol: "ESP",
 *     target: targetGateway.selfLink,
 * });
 * const frUdp4500 = new gcp.compute.ForwardingRule("fr_udp4500", {
 *     ipAddress: vpnStaticIp.address,
 *     ipProtocol: "UDP",
 *     portRange: "4500",
 *     target: targetGateway.selfLink,
 * });
 * const frUdp500 = new gcp.compute.ForwardingRule("fr_udp500", {
 *     ipAddress: vpnStaticIp.address,
 *     ipProtocol: "UDP",
 *     portRange: "500",
 *     target: targetGateway.selfLink,
 * });
 * const tunnel1 = new gcp.compute.VPNTunnel("tunnel1", {
 *     peerIp: "15.0.0.120",
 *     sharedSecret: "a secret message",
 *     targetVpnGateway: targetGateway.selfLink,
 * }, {dependsOn: [frEsp, frUdp4500, frUdp500]});
 * const route1 = new gcp.compute.Route("route1", {
 *     destRange: "15.0.0.0/24",
 *     network: network1.name,
 *     nextHopVpnTunnel: tunnel1.selfLink,
 *     priority: 1000,
 * });
 * ```
 */
export declare class VPNGateway extends pulumi.CustomResource {
    /**
     * Get an existing VPNGateway resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: VPNGatewayState, opts?: pulumi.CustomResourceOptions): VPNGateway;
    readonly creationTimestamp: pulumi.Output<string>;
    readonly description: pulumi.Output<string | undefined>;
    readonly name: pulumi.Output<string>;
    readonly network: pulumi.Output<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    readonly project: pulumi.Output<string>;
    readonly region: pulumi.Output<string>;
    /**
     * The URI of the created resource.
     */
    readonly selfLink: pulumi.Output<string>;
    /**
     * Create a VPNGateway resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: VPNGatewayArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering VPNGateway resources.
 */
export interface VPNGatewayState {
    readonly creationTimestamp?: pulumi.Input<string>;
    readonly description?: pulumi.Input<string>;
    readonly name?: pulumi.Input<string>;
    readonly network?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    readonly region?: pulumi.Input<string>;
    /**
     * The URI of the created resource.
     */
    readonly selfLink?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a VPNGateway resource.
 */
export interface VPNGatewayArgs {
    readonly description?: pulumi.Input<string>;
    readonly name?: pulumi.Input<string>;
    readonly network: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    readonly region?: pulumi.Input<string>;
}
