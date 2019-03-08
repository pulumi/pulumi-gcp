import * as pulumi from "@pulumi/pulumi";
/**
 * > **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
 * See [Provider Versions](https://terraform.io/docs/providers/google/provider_versions.html) for more details on beta resources.
 *
 * Manages a private VPC connection with a GCP service provider. For more information see
 * [the official documentation](https://cloud.google.com/vpc/docs/configure-private-services-access#creating-connection)
 * and
 * [API](https://cloud.google.com/service-infrastructure/docs/service-networking/reference/rest/v1/services.connections).
 *
 * ## Example usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const peeringNetwork = new gcp.compute.Network("peering_network", {});
 * const privateIpAlloc = new gcp.compute.GlobalAddress("private_ip_alloc", {
 *     addressType: "INTERNAL",
 *     network: peeringNetwork.selfLink,
 *     prefixLength: 16,
 *     purpose: "VPC_PEERING",
 * });
 * const foobar = new gcp.servicenetworking.Connection("foobar", {
 *     network: peeringNetwork.selfLink,
 *     reservedPeeringRanges: [privateIpAlloc.name],
 *     service: "servicenetworking.googleapis.com",
 * });
 * ```
 */
export declare class Connection extends pulumi.CustomResource {
    /**
     * Get an existing Connection resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ConnectionState, opts?: pulumi.CustomResourceOptions): Connection;
    /**
     * Name of VPC network connected with service producers using VPC peering.
     */
    readonly network: pulumi.Output<string>;
    /**
     * Named IP address range(s) of PEERING type reserved for
     * this service provider. Note that invoking this method with a different range when connection
     * is already established will not reallocate already provisioned service producer subnetworks.
     */
    readonly reservedPeeringRanges: pulumi.Output<string[]>;
    /**
     * Provider peering service that is managing peering connectivity for a
     * service provider organization. For Google services that support this functionality it is
     * 'servicenetworking.googleapis.com'.
     */
    readonly service: pulumi.Output<string>;
    /**
     * Create a Connection resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ConnectionArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering Connection resources.
 */
export interface ConnectionState {
    /**
     * Name of VPC network connected with service producers using VPC peering.
     */
    readonly network?: pulumi.Input<string>;
    /**
     * Named IP address range(s) of PEERING type reserved for
     * this service provider. Note that invoking this method with a different range when connection
     * is already established will not reallocate already provisioned service producer subnetworks.
     */
    readonly reservedPeeringRanges?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Provider peering service that is managing peering connectivity for a
     * service provider organization. For Google services that support this functionality it is
     * 'servicenetworking.googleapis.com'.
     */
    readonly service?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a Connection resource.
 */
export interface ConnectionArgs {
    /**
     * Name of VPC network connected with service producers using VPC peering.
     */
    readonly network: pulumi.Input<string>;
    /**
     * Named IP address range(s) of PEERING type reserved for
     * this service provider. Note that invoking this method with a different range when connection
     * is already established will not reallocate already provisioned service producer subnetworks.
     */
    readonly reservedPeeringRanges: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Provider peering service that is managing peering connectivity for a
     * service provider organization. For Google services that support this functionality it is
     * 'servicenetworking.googleapis.com'.
     */
    readonly service: pulumi.Input<string>;
}
