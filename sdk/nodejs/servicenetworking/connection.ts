// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages a private VPC connection with a GCP service provider. For more information see
 * [the official documentation](https://cloud.google.com/vpc/docs/configure-private-services-access#creating-connection)
 * and
 * [API](https://cloud.google.com/service-infrastructure/docs/service-networking/reference/rest/v1/services.connections).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * // Create a VPC network
 * const peeringNetwork = new gcp.compute.Network("peering_network", {name: "peering-network"});
 * // Create an IP address
 * const privateIpAlloc = new gcp.compute.GlobalAddress("private_ip_alloc", {
 *     name: "private-ip-alloc",
 *     purpose: "VPC_PEERING",
 *     addressType: "INTERNAL",
 *     prefixLength: 16,
 *     network: peeringNetwork.id,
 * });
 * // Create a private connection
 * const _default = new gcp.servicenetworking.Connection("default", {
 *     network: peeringNetwork.id,
 *     service: "servicenetworking.googleapis.com",
 *     reservedPeeringRanges: [privateIpAlloc.name],
 * });
 * // (Optional) Import or export custom routes
 * const peeringRoutes = new gcp.compute.NetworkPeeringRoutesConfig("peering_routes", {
 *     peering: _default.peering,
 *     network: peeringNetwork.name,
 *     importCustomRoutes: true,
 *     exportCustomRoutes: true,
 * });
 * ```
 *
 * ## Import
 *
 * ServiceNetworkingConnection can be imported using any of these accepted formats
 *
 * * `{{peering-network}}:{{service}}`
 *
 * * `projects/{{project}}/global/networks/{{peering-network}}:{{service}}`
 *
 * When using the `pulumi import` command, NAME_HERE can be imported using one of the formats above. For example:
 *
 * ```sh
 * $ pulumi import gcp:servicenetworking/connection:Connection default {{peering-network}}:{{service}}
 * ```
 *
 * ```sh
 * $ pulumi import gcp:servicenetworking/connection:Connection default /projects/{{project}}/global/networks/{{peering-network}}:{{service}}
 * ```
 */
export class Connection extends pulumi.CustomResource {
    /**
     * Get an existing Connection resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ConnectionState, opts?: pulumi.CustomResourceOptions): Connection {
        return new Connection(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:servicenetworking/connection:Connection';

    /**
     * Returns true if the given object is an instance of Connection.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Connection {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Connection.__pulumiType;
    }

    public readonly deletionPolicy!: pulumi.Output<string | undefined>;
    /**
     * Name of VPC network connected with service producers using VPC peering.
     */
    public readonly network!: pulumi.Output<string>;
    /**
     * (Computed) The name of the VPC Network Peering connection that was created by the service producer.
     */
    public /*out*/ readonly peering!: pulumi.Output<string>;
    /**
     * Named IP address range(s) of PEERING type reserved for
     * this service provider. Note that invoking this method with a different range when connection
     * is already established will not reallocate already provisioned service producer subnetworks.
     */
    public readonly reservedPeeringRanges!: pulumi.Output<string[]>;
    /**
     * Provider peering service that is managing peering connectivity for a
     * service provider organization. For Google services that support this functionality it is
     * 'servicenetworking.googleapis.com'.
     */
    public readonly service!: pulumi.Output<string>;
    /**
     * When set to true, enforce an update of the reserved peering ranges on the existing service networking connection in case of a new connection creation failure.
     */
    public readonly updateOnCreationFail!: pulumi.Output<boolean | undefined>;

    /**
     * Create a Connection resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ConnectionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ConnectionArgs | ConnectionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ConnectionState | undefined;
            resourceInputs["deletionPolicy"] = state ? state.deletionPolicy : undefined;
            resourceInputs["network"] = state ? state.network : undefined;
            resourceInputs["peering"] = state ? state.peering : undefined;
            resourceInputs["reservedPeeringRanges"] = state ? state.reservedPeeringRanges : undefined;
            resourceInputs["service"] = state ? state.service : undefined;
            resourceInputs["updateOnCreationFail"] = state ? state.updateOnCreationFail : undefined;
        } else {
            const args = argsOrState as ConnectionArgs | undefined;
            if ((!args || args.network === undefined) && !opts.urn) {
                throw new Error("Missing required property 'network'");
            }
            if ((!args || args.reservedPeeringRanges === undefined) && !opts.urn) {
                throw new Error("Missing required property 'reservedPeeringRanges'");
            }
            if ((!args || args.service === undefined) && !opts.urn) {
                throw new Error("Missing required property 'service'");
            }
            resourceInputs["deletionPolicy"] = args ? args.deletionPolicy : undefined;
            resourceInputs["network"] = args ? args.network : undefined;
            resourceInputs["reservedPeeringRanges"] = args ? args.reservedPeeringRanges : undefined;
            resourceInputs["service"] = args ? args.service : undefined;
            resourceInputs["updateOnCreationFail"] = args ? args.updateOnCreationFail : undefined;
            resourceInputs["peering"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Connection.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Connection resources.
 */
export interface ConnectionState {
    deletionPolicy?: pulumi.Input<string>;
    /**
     * Name of VPC network connected with service producers using VPC peering.
     */
    network?: pulumi.Input<string>;
    /**
     * (Computed) The name of the VPC Network Peering connection that was created by the service producer.
     */
    peering?: pulumi.Input<string>;
    /**
     * Named IP address range(s) of PEERING type reserved for
     * this service provider. Note that invoking this method with a different range when connection
     * is already established will not reallocate already provisioned service producer subnetworks.
     */
    reservedPeeringRanges?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Provider peering service that is managing peering connectivity for a
     * service provider organization. For Google services that support this functionality it is
     * 'servicenetworking.googleapis.com'.
     */
    service?: pulumi.Input<string>;
    /**
     * When set to true, enforce an update of the reserved peering ranges on the existing service networking connection in case of a new connection creation failure.
     */
    updateOnCreationFail?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a Connection resource.
 */
export interface ConnectionArgs {
    deletionPolicy?: pulumi.Input<string>;
    /**
     * Name of VPC network connected with service producers using VPC peering.
     */
    network: pulumi.Input<string>;
    /**
     * Named IP address range(s) of PEERING type reserved for
     * this service provider. Note that invoking this method with a different range when connection
     * is already established will not reallocate already provisioned service producer subnetworks.
     */
    reservedPeeringRanges: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Provider peering service that is managing peering connectivity for a
     * service provider organization. For Google services that support this functionality it is
     * 'servicenetworking.googleapis.com'.
     */
    service: pulumi.Input<string>;
    /**
     * When set to true, enforce an update of the reserved peering ranges on the existing service networking connection in case of a new connection creation failure.
     */
    updateOnCreationFail?: pulumi.Input<boolean>;
}
