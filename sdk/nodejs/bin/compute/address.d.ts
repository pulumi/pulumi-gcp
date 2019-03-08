import * as pulumi from "@pulumi/pulumi";
/**
 * Represents an Address resource.
 *
 * Each virtual machine instance has an ephemeral internal IP address and,
 * optionally, an external IP address. To communicate between instances on
 * the same network, you can use an instance's internal IP address. To
 * communicate with the Internet and instances outside of the same network,
 * you must specify the instance's external IP address.
 *
 * Internal IP addresses are ephemeral and only belong to an instance for
 * the lifetime of the instance; if the instance is deleted and recreated,
 * the instance is assigned a new internal IP address, either by Compute
 * Engine or by you. External IP addresses can be either ephemeral or
 * static.
 *
 *
 * To get more information about Address, see:
 *
 * * [API documentation](https://cloud.google.com/compute/docs/reference/beta/addresses)
 * * How-to Guides
 *     * [Reserving a Static External IP Address](https://cloud.google.com/compute/docs/instances-and-network)
 *     * [Reserving a Static Internal IP Address](https://cloud.google.com/compute/docs/ip-addresses/reserve-static-internal-ip-address)
 *
 * <div class = "oics-button" style="float: right; margin: 0 0 -15px">
 *   <a href="https://console.cloud.google.com/cloudshell/open?cloudshell_git_repo=https%3A%2F%2Fgithub.com%2Fterraform-google-modules%2Fdocs-examples.git&cloudshell_working_dir=address_basic&cloudshell_image=gcr.io%2Fgraphite-cloud-shell-images%2Fterraform%3Alatest&open_in_editor=main.tf&cloudshell_print=.%2Fmotd&cloudshell_tutorial=.%2Ftutorial.md" target="_blank">
 *     <img alt="Open in Cloud Shell" src="//gstatic.com/cloudssh/images/open-btn.svg" style="max-height: 44px; margin: 32px auto; max-width: 100%;">
 *   </a>
 * </div>
 * ## Example Usage - Address Basic
 *
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const ipAddress = new gcp.compute.Address("ip_address", {});
 * ```
 * <div class = "oics-button" style="float: right; margin: 0 0 -15px">
 *   <a href="https://console.cloud.google.com/cloudshell/open?cloudshell_git_repo=https%3A%2F%2Fgithub.com%2Fterraform-google-modules%2Fdocs-examples.git&cloudshell_working_dir=address_with_subnetwork&cloudshell_image=gcr.io%2Fgraphite-cloud-shell-images%2Fterraform%3Alatest&open_in_editor=main.tf&cloudshell_print=.%2Fmotd&cloudshell_tutorial=.%2Ftutorial.md" target="_blank">
 *     <img alt="Open in Cloud Shell" src="//gstatic.com/cloudssh/images/open-btn.svg" style="max-height: 44px; margin: 32px auto; max-width: 100%;">
 *   </a>
 * </div>
 * ## Example Usage - Address With Subnetwork
 *
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
 * const internalWithSubnetAndAddress = new gcp.compute.Address("internal_with_subnet_and_address", {
 *     address: "10.0.42.42",
 *     addressType: "INTERNAL",
 *     region: "us-central1",
 *     subnetwork: defaultSubnetwork.selfLink,
 * });
 * ```
 * <div class = "oics-button" style="float: right; margin: 0 0 -15px">
 *   <a href="https://console.cloud.google.com/cloudshell/open?cloudshell_git_repo=https%3A%2F%2Fgithub.com%2Fterraform-google-modules%2Fdocs-examples.git&cloudshell_working_dir=instance_with_ip&cloudshell_image=gcr.io%2Fgraphite-cloud-shell-images%2Fterraform%3Alatest&open_in_editor=main.tf&cloudshell_print=.%2Fmotd&cloudshell_tutorial=.%2Ftutorial.md" target="_blank">
 *     <img alt="Open in Cloud Shell" src="//gstatic.com/cloudssh/images/open-btn.svg" style="max-height: 44px; margin: 32px auto; max-width: 100%;">
 *   </a>
 * </div>
 * ## Example Usage - Instance With Ip
 *
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const debianImage = pulumi.output(gcp.compute.getImage({
 *     family: "debian-9",
 *     project: "debian-cloud",
 * }));
 * const static = new gcp.compute.Address("static", {});
 * const instanceWithIp = new gcp.compute.Instance("instance_with_ip", {
 *     bootDisk: {
 *         initializeParams: {
 *             image: debianImage.apply(debianImage => debianImage.selfLink),
 *         },
 *     },
 *     machineType: "f1-micro",
 *     networkInterfaces: [{
 *         accessConfigs: [{
 *             natIp: static.address,
 *         }],
 *         network: "default",
 *     }],
 *     zone: "us-central1-a",
 * });
 * ```
 */
export declare class Address extends pulumi.CustomResource {
    /**
     * Get an existing Address resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AddressState, opts?: pulumi.CustomResourceOptions): Address;
    /**
     * The IP of the created resource.
     */
    readonly address: pulumi.Output<string>;
    readonly addressType: pulumi.Output<string | undefined>;
    readonly creationTimestamp: pulumi.Output<string>;
    readonly description: pulumi.Output<string | undefined>;
    readonly labelFingerprint: pulumi.Output<string>;
    readonly labels: pulumi.Output<{
        [key: string]: string;
    } | undefined>;
    readonly name: pulumi.Output<string>;
    readonly networkTier: pulumi.Output<string>;
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
    readonly subnetwork: pulumi.Output<string>;
    readonly users: pulumi.Output<string[]>;
    /**
     * Create a Address resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: AddressArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering Address resources.
 */
export interface AddressState {
    /**
     * The IP of the created resource.
     */
    readonly address?: pulumi.Input<string>;
    readonly addressType?: pulumi.Input<string>;
    readonly creationTimestamp?: pulumi.Input<string>;
    readonly description?: pulumi.Input<string>;
    readonly labelFingerprint?: pulumi.Input<string>;
    readonly labels?: pulumi.Input<{
        [key: string]: pulumi.Input<string>;
    }>;
    readonly name?: pulumi.Input<string>;
    readonly networkTier?: pulumi.Input<string>;
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
    readonly subnetwork?: pulumi.Input<string>;
    readonly users?: pulumi.Input<pulumi.Input<string>[]>;
}
/**
 * The set of arguments for constructing a Address resource.
 */
export interface AddressArgs {
    /**
     * The IP of the created resource.
     */
    readonly address?: pulumi.Input<string>;
    readonly addressType?: pulumi.Input<string>;
    readonly description?: pulumi.Input<string>;
    readonly labels?: pulumi.Input<{
        [key: string]: pulumi.Input<string>;
    }>;
    readonly name?: pulumi.Input<string>;
    readonly networkTier?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    readonly region?: pulumi.Input<string>;
    readonly subnetwork?: pulumi.Input<string>;
}
