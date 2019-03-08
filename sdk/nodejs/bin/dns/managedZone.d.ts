import * as pulumi from "@pulumi/pulumi";
/**
 * A zone is a subtree of the DNS namespace under one administrative
 * responsibility. A ManagedZone is a resource that represents a DNS zone
 * hosted by the Cloud DNS service.
 *
 *
 * To get more information about ManagedZone, see:
 *
 * * [API documentation](https://cloud.google.com/dns/api/v1/managedZones)
 * * How-to Guides
 *     * [Managing Zones](https://cloud.google.com/dns/zones/)
 *
 * <div class = "oics-button" style="float: right; margin: 0 0 -15px">
 *   <a href="https://console.cloud.google.com/cloudshell/open?cloudshell_git_repo=https%3A%2F%2Fgithub.com%2Fterraform-google-modules%2Fdocs-examples.git&cloudshell_working_dir=dns_managed_zone_basic&cloudshell_image=gcr.io%2Fgraphite-cloud-shell-images%2Fterraform%3Alatest&open_in_editor=main.tf&cloudshell_print=.%2Fmotd&cloudshell_tutorial=.%2Ftutorial.md" target="_blank">
 *     <img alt="Open in Cloud Shell" src="//gstatic.com/cloudssh/images/open-btn.svg" style="max-height: 44px; margin: 32px auto; max-width: 100%;">
 *   </a>
 * </div>
 * ## Example Usage - Dns Managed Zone Basic
 *
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 * import * as random from "@pulumi/random";
 *
 * const rnd = new random.RandomId("rnd", {
 *     byteLength: 4,
 * });
 * const example_zone = new gcp.dns.ManagedZone("example-zone", {
 *     description: "Example DNS zone",
 *     dnsName: rnd.hex.apply(hex => `example-${hex}.com.`),
 *     labels: {
 *         foo: "bar",
 *     },
 * });
 * ```
 * ## Example Usage - Dns Managed Zone Private
 *
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const network_1 = new gcp.compute.Network("network-1", {
 *     autoCreateSubnetworks: false,
 * });
 * const network_2 = new gcp.compute.Network("network-2", {
 *     autoCreateSubnetworks: false,
 * });
 * const private_zone = new gcp.dns.ManagedZone("private-zone", {
 *     description: "Example private DNS zone",
 *     dnsName: "private.example.com.",
 *     forwardingConfig: {
 *         targetNameServers: [
 *             {
 *                 ipv4Address: "172.16.1.10",
 *             },
 *             {
 *                 ipv4Address: "172.16.1.20",
 *             },
 *         ],
 *     },
 *     labels: {
 *         foo: "bar",
 *     },
 *     privateVisibilityConfig: {
 *         networks: [
 *             {
 *                 networkUrl: network_1.selfLink,
 *             },
 *             {
 *                 networkUrl: network_2.selfLink,
 *             },
 *         ],
 *     },
 *     visibility: "private",
 * });
 * ```
 */
export declare class ManagedZone extends pulumi.CustomResource {
    /**
     * Get an existing ManagedZone resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ManagedZoneState, opts?: pulumi.CustomResourceOptions): ManagedZone;
    readonly description: pulumi.Output<string | undefined>;
    readonly dnsName: pulumi.Output<string>;
    readonly forwardingConfig: pulumi.Output<{
        targetNameServers?: {
            ipv4Address?: string;
        }[];
    } | undefined>;
    readonly labels: pulumi.Output<{
        [key: string]: string;
    } | undefined>;
    readonly name: pulumi.Output<string>;
    readonly nameServers: pulumi.Output<string[]>;
    readonly privateVisibilityConfig: pulumi.Output<{
        networks?: {
            networkUrl?: string;
        }[];
    } | undefined>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    readonly project: pulumi.Output<string>;
    readonly visibility: pulumi.Output<string | undefined>;
    /**
     * Create a ManagedZone resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ManagedZoneArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering ManagedZone resources.
 */
export interface ManagedZoneState {
    readonly description?: pulumi.Input<string>;
    readonly dnsName?: pulumi.Input<string>;
    readonly forwardingConfig?: pulumi.Input<{
        targetNameServers?: pulumi.Input<pulumi.Input<{
            ipv4Address?: pulumi.Input<string>;
        }>[]>;
    }>;
    readonly labels?: pulumi.Input<{
        [key: string]: pulumi.Input<string>;
    }>;
    readonly name?: pulumi.Input<string>;
    readonly nameServers?: pulumi.Input<pulumi.Input<string>[]>;
    readonly privateVisibilityConfig?: pulumi.Input<{
        networks?: pulumi.Input<pulumi.Input<{
            networkUrl?: pulumi.Input<string>;
        }>[]>;
    }>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    readonly visibility?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a ManagedZone resource.
 */
export interface ManagedZoneArgs {
    readonly description?: pulumi.Input<string>;
    readonly dnsName: pulumi.Input<string>;
    readonly forwardingConfig?: pulumi.Input<{
        targetNameServers?: pulumi.Input<pulumi.Input<{
            ipv4Address?: pulumi.Input<string>;
        }>[]>;
    }>;
    readonly labels?: pulumi.Input<{
        [key: string]: pulumi.Input<string>;
    }>;
    readonly name?: pulumi.Input<string>;
    readonly privateVisibilityConfig?: pulumi.Input<{
        networks?: pulumi.Input<pulumi.Input<{
            networkUrl?: pulumi.Input<string>;
        }>[]>;
    }>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    readonly visibility?: pulumi.Input<string>;
}
