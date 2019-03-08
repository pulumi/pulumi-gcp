import * as pulumi from "@pulumi/pulumi";
/**
 * Each network has its own firewall controlling access to and from the
 * instances.
 *
 * All traffic to instances, even from other instances, is blocked by the
 * firewall unless firewall rules are created to allow it.
 *
 * The default network has automatically created firewall rules that are
 * shown in default firewall rules. No manually created network has
 * automatically created firewall rules except for a default "allow" rule for
 * outgoing traffic and a default "deny" for incoming traffic. For all
 * networks except the default network, you must create any firewall rules
 * you need.
 *
 *
 * To get more information about Firewall, see:
 *
 * * [API documentation](https://cloud.google.com/compute/docs/reference/latest/firewalls)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/vpc/docs/firewalls)
 *
 * <div class = "oics-button" style="float: right; margin: 0 0 -15px">
 *   <a href="https://console.cloud.google.com/cloudshell/open?cloudshell_git_repo=https%3A%2F%2Fgithub.com%2Fterraform-google-modules%2Fdocs-examples.git&cloudshell_working_dir=firewall_basic&cloudshell_image=gcr.io%2Fgraphite-cloud-shell-images%2Fterraform%3Alatest&open_in_editor=main.tf&cloudshell_print=.%2Fmotd&cloudshell_tutorial=.%2Ftutorial.md" target="_blank">
 *     <img alt="Open in Cloud Shell" src="//gstatic.com/cloudssh/images/open-btn.svg" style="max-height: 44px; margin: 32px auto; max-width: 100%;">
 *   </a>
 * </div>
 * ## Example Usage - Firewall Basic
 *
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const defaultNetwork = new gcp.compute.Network("default", {});
 * const defaultFirewall = new gcp.compute.Firewall("default", {
 *     allows: [
 *         {
 *             protocol: "icmp",
 *         },
 *         {
 *             ports: [
 *                 "80",
 *                 "8080",
 *                 "1000-2000",
 *             ],
 *             protocol: "tcp",
 *         },
 *     ],
 *     network: defaultNetwork.name,
 *     sourceTags: ["web"],
 * });
 * ```
 */
export declare class Firewall extends pulumi.CustomResource {
    /**
     * Get an existing Firewall resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: FirewallState, opts?: pulumi.CustomResourceOptions): Firewall;
    readonly allows: pulumi.Output<{
        ports?: string[];
        protocol: string;
    }[] | undefined>;
    readonly creationTimestamp: pulumi.Output<string>;
    readonly denies: pulumi.Output<{
        ports?: string[];
        protocol: string;
    }[] | undefined>;
    readonly description: pulumi.Output<string | undefined>;
    readonly destinationRanges: pulumi.Output<string[]>;
    readonly direction: pulumi.Output<string>;
    readonly disabled: pulumi.Output<boolean | undefined>;
    readonly enableLogging: pulumi.Output<boolean | undefined>;
    readonly name: pulumi.Output<string>;
    readonly network: pulumi.Output<string>;
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
    readonly sourceRanges: pulumi.Output<string[]>;
    readonly sourceServiceAccounts: pulumi.Output<string[] | undefined>;
    readonly sourceTags: pulumi.Output<string[] | undefined>;
    readonly targetServiceAccounts: pulumi.Output<string[] | undefined>;
    readonly targetTags: pulumi.Output<string[] | undefined>;
    /**
     * Create a Firewall resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: FirewallArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering Firewall resources.
 */
export interface FirewallState {
    readonly allows?: pulumi.Input<pulumi.Input<{
        ports?: pulumi.Input<pulumi.Input<string>[]>;
        protocol: pulumi.Input<string>;
    }>[]>;
    readonly creationTimestamp?: pulumi.Input<string>;
    readonly denies?: pulumi.Input<pulumi.Input<{
        ports?: pulumi.Input<pulumi.Input<string>[]>;
        protocol: pulumi.Input<string>;
    }>[]>;
    readonly description?: pulumi.Input<string>;
    readonly destinationRanges?: pulumi.Input<pulumi.Input<string>[]>;
    readonly direction?: pulumi.Input<string>;
    readonly disabled?: pulumi.Input<boolean>;
    readonly enableLogging?: pulumi.Input<boolean>;
    readonly name?: pulumi.Input<string>;
    readonly network?: pulumi.Input<string>;
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
    readonly sourceRanges?: pulumi.Input<pulumi.Input<string>[]>;
    readonly sourceServiceAccounts?: pulumi.Input<pulumi.Input<string>[]>;
    readonly sourceTags?: pulumi.Input<pulumi.Input<string>[]>;
    readonly targetServiceAccounts?: pulumi.Input<pulumi.Input<string>[]>;
    readonly targetTags?: pulumi.Input<pulumi.Input<string>[]>;
}
/**
 * The set of arguments for constructing a Firewall resource.
 */
export interface FirewallArgs {
    readonly allows?: pulumi.Input<pulumi.Input<{
        ports?: pulumi.Input<pulumi.Input<string>[]>;
        protocol: pulumi.Input<string>;
    }>[]>;
    readonly denies?: pulumi.Input<pulumi.Input<{
        ports?: pulumi.Input<pulumi.Input<string>[]>;
        protocol: pulumi.Input<string>;
    }>[]>;
    readonly description?: pulumi.Input<string>;
    readonly destinationRanges?: pulumi.Input<pulumi.Input<string>[]>;
    readonly direction?: pulumi.Input<string>;
    readonly disabled?: pulumi.Input<boolean>;
    readonly enableLogging?: pulumi.Input<boolean>;
    readonly name?: pulumi.Input<string>;
    readonly network: pulumi.Input<string>;
    readonly priority?: pulumi.Input<number>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    readonly sourceRanges?: pulumi.Input<pulumi.Input<string>[]>;
    readonly sourceServiceAccounts?: pulumi.Input<pulumi.Input<string>[]>;
    readonly sourceTags?: pulumi.Input<pulumi.Input<string>[]>;
    readonly targetServiceAccounts?: pulumi.Input<pulumi.Input<string>[]>;
    readonly targetTags?: pulumi.Input<pulumi.Input<string>[]>;
}
