import * as pulumi from "@pulumi/pulumi";
/**
 * VPN tunnel resource.
 *
 *
 * To get more information about VpnTunnel, see:
 *
 * * [API documentation](https://cloud.google.com/compute/docs/reference/rest/v1/vpnTunnels)
 * * How-to Guides
 *     * [Cloud VPN Overview](https://cloud.google.com/vpn/docs/concepts/overview)
 *     * [Networks and Tunnel Routing](https://cloud.google.com/vpn/docs/concepts/choosing-networks-routing)
 *
 * > **Warning:** All arguments including the shared secret will be stored in the raw
 * state as plain-text.
 * [Read more about sensitive data in state](https://www.terraform.io/docs/state/sensitive-data.html).
 *
 * <div class = "oics-button" style="float: right; margin: 0 0 -15px">
 *   <a href="https://console.cloud.google.com/cloudshell/open?cloudshell_git_repo=https%3A%2F%2Fgithub.com%2Fterraform-google-modules%2Fdocs-examples.git&cloudshell_working_dir=vpn_tunnel_basic&cloudshell_image=gcr.io%2Fgraphite-cloud-shell-images%2Fterraform%3Alatest&open_in_editor=main.tf&cloudshell_print=.%2Fmotd&cloudshell_tutorial=.%2Ftutorial.md" target="_blank">
 *     <img alt="Open in Cloud Shell" src="//gstatic.com/cloudssh/images/open-btn.svg" style="max-height: 44px; margin: 32px auto; max-width: 100%;">
 *   </a>
 * </div>
 * ## Example Usage - Vpn Tunnel Basic
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
export declare class VPNTunnel extends pulumi.CustomResource {
    /**
     * Get an existing VPNTunnel resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: VPNTunnelState, opts?: pulumi.CustomResourceOptions): VPNTunnel;
    readonly creationTimestamp: pulumi.Output<string>;
    readonly description: pulumi.Output<string | undefined>;
    readonly detailedStatus: pulumi.Output<string>;
    readonly ikeVersion: pulumi.Output<number | undefined>;
    readonly labelFingerprint: pulumi.Output<string>;
    readonly labels: pulumi.Output<{
        [key: string]: string;
    } | undefined>;
    readonly localTrafficSelectors: pulumi.Output<string[]>;
    readonly name: pulumi.Output<string>;
    readonly peerIp: pulumi.Output<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    readonly project: pulumi.Output<string>;
    readonly region: pulumi.Output<string>;
    readonly remoteTrafficSelectors: pulumi.Output<string[]>;
    readonly router: pulumi.Output<string | undefined>;
    /**
     * The URI of the created resource.
     */
    readonly selfLink: pulumi.Output<string>;
    readonly sharedSecret: pulumi.Output<string>;
    readonly sharedSecretHash: pulumi.Output<string>;
    readonly targetVpnGateway: pulumi.Output<string>;
    /**
     * Create a VPNTunnel resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: VPNTunnelArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering VPNTunnel resources.
 */
export interface VPNTunnelState {
    readonly creationTimestamp?: pulumi.Input<string>;
    readonly description?: pulumi.Input<string>;
    readonly detailedStatus?: pulumi.Input<string>;
    readonly ikeVersion?: pulumi.Input<number>;
    readonly labelFingerprint?: pulumi.Input<string>;
    readonly labels?: pulumi.Input<{
        [key: string]: pulumi.Input<string>;
    }>;
    readonly localTrafficSelectors?: pulumi.Input<pulumi.Input<string>[]>;
    readonly name?: pulumi.Input<string>;
    readonly peerIp?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    readonly region?: pulumi.Input<string>;
    readonly remoteTrafficSelectors?: pulumi.Input<pulumi.Input<string>[]>;
    readonly router?: pulumi.Input<string>;
    /**
     * The URI of the created resource.
     */
    readonly selfLink?: pulumi.Input<string>;
    readonly sharedSecret?: pulumi.Input<string>;
    readonly sharedSecretHash?: pulumi.Input<string>;
    readonly targetVpnGateway?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a VPNTunnel resource.
 */
export interface VPNTunnelArgs {
    readonly description?: pulumi.Input<string>;
    readonly ikeVersion?: pulumi.Input<number>;
    readonly labels?: pulumi.Input<{
        [key: string]: pulumi.Input<string>;
    }>;
    readonly localTrafficSelectors?: pulumi.Input<pulumi.Input<string>[]>;
    readonly name?: pulumi.Input<string>;
    readonly peerIp: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    readonly region?: pulumi.Input<string>;
    readonly remoteTrafficSelectors?: pulumi.Input<pulumi.Input<string>[]>;
    readonly router?: pulumi.Input<string>;
    readonly sharedSecret: pulumi.Input<string>;
    readonly targetVpnGateway: pulumi.Input<string>;
}
