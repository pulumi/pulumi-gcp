import * as pulumi from "@pulumi/pulumi";
/**
 * Represents a Router resource.
 *
 *
 * To get more information about Router, see:
 *
 * * [API documentation](https://cloud.google.com/compute/docs/reference/rest/v1/routers)
 * * How-to Guides
 *     * [Google Cloud Router](https://cloud.google.com/router/docs/)
 *
 * <div class = "oics-button" style="float: right; margin: 0 0 -15px">
 *   <a href="https://console.cloud.google.com/cloudshell/open?cloudshell_git_repo=https%3A%2F%2Fgithub.com%2Fterraform-google-modules%2Fdocs-examples.git&cloudshell_working_dir=router_basic&cloudshell_image=gcr.io%2Fgraphite-cloud-shell-images%2Fterraform%3Alatest&open_in_editor=main.tf&cloudshell_print=.%2Fmotd&cloudshell_tutorial=.%2Ftutorial.md" target="_blank">
 *     <img alt="Open in Cloud Shell" src="//gstatic.com/cloudssh/images/open-btn.svg" style="max-height: 44px; margin: 32px auto; max-width: 100%;">
 *   </a>
 * </div>
 * ## Example Usage - Router Basic
 *
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const foobarNetwork = new gcp.compute.Network("foobar", {
 *     autoCreateSubnetworks: false,
 * });
 * const foobarRouter = new gcp.compute.Router("foobar", {
 *     bgp: {
 *         advertiseMode: "CUSTOM",
 *         advertisedGroups: ["ALL_SUBNETS"],
 *         advertisedIpRanges: [
 *             {
 *                 range: "1.2.3.4",
 *             },
 *             {
 *                 range: "6.7.0.0/16",
 *             },
 *         ],
 *         asn: 64514,
 *     },
 *     network: foobarNetwork.name,
 * });
 * ```
 */
export declare class Router extends pulumi.CustomResource {
    /**
     * Get an existing Router resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RouterState, opts?: pulumi.CustomResourceOptions): Router;
    readonly bgp: pulumi.Output<{
        advertiseMode?: string;
        advertisedGroups?: string[];
        advertisedIpRanges?: {
            description?: string;
            range?: string;
        }[];
        asn: number;
    } | undefined>;
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
     * Create a Router resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RouterArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering Router resources.
 */
export interface RouterState {
    readonly bgp?: pulumi.Input<{
        advertiseMode?: pulumi.Input<string>;
        advertisedGroups?: pulumi.Input<pulumi.Input<string>[]>;
        advertisedIpRanges?: pulumi.Input<pulumi.Input<{
            description?: pulumi.Input<string>;
            range?: pulumi.Input<string>;
        }>[]>;
        asn: pulumi.Input<number>;
    }>;
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
 * The set of arguments for constructing a Router resource.
 */
export interface RouterArgs {
    readonly bgp?: pulumi.Input<{
        advertiseMode?: pulumi.Input<string>;
        advertisedGroups?: pulumi.Input<pulumi.Input<string>[]>;
        advertisedIpRanges?: pulumi.Input<pulumi.Input<{
            description?: pulumi.Input<string>;
            range?: pulumi.Input<string>;
        }>[]>;
        asn: pulumi.Input<number>;
    }>;
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
