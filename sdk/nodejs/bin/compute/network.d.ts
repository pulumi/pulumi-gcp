import * as pulumi from "@pulumi/pulumi";
/**
 * Manages a network within GCE. For more information see
 * [the official documentation](https://cloud.google.com/compute/docs/vpc)
 * and
 * [API](https://cloud.google.com/compute/docs/reference/latest/networks).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const defaultNetwork = new gcp.compute.Network("default", {
 *     autoCreateSubnetworks: true,
 * });
 * ```
 */
export declare class Network extends pulumi.CustomResource {
    /**
     * Get an existing Network resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: NetworkState, opts?: pulumi.CustomResourceOptions): Network;
    /**
     * If set to true, this network will be
     * created in auto subnet mode, and Google will create a subnet for each region
     * automatically. If set to false, a custom subnetted network will be created that
     * can support `google_compute_subnetwork` resources. Defaults to true.
     */
    readonly autoCreateSubnetworks: pulumi.Output<boolean | undefined>;
    /**
     * A brief description of this resource.
     */
    readonly description: pulumi.Output<string | undefined>;
    /**
     * The IPv4 address of the gateway.
     */
    readonly gatewayIpv4: pulumi.Output<string>;
    /**
     * If set to a CIDR block, uses the legacy VPC API with the
     * specified range. This API is deprecated. If set, `auto_create_subnetworks` must be
     * explicitly set to false.
     */
    readonly ipv4Range: pulumi.Output<string | undefined>;
    /**
     * A unique name for the resource, required by GCE.
     * Changing this forces a new resource to be created.
     */
    readonly name: pulumi.Output<string>;
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    readonly project: pulumi.Output<string>;
    /**
     * Sets the network-wide routing mode for Cloud Routers
     * to use. Accepted values are `"GLOBAL"` or `"REGIONAL"`. Defaults to `"REGIONAL"`.
     * Refer to the [Cloud Router documentation](https://cloud.google.com/router/docs/concepts/overview#dynamic-routing-mode)
     * for more details.
     */
    readonly routingMode: pulumi.Output<string>;
    /**
     * The URI of the created resource.
     */
    readonly selfLink: pulumi.Output<string>;
    /**
     * Create a Network resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: NetworkArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering Network resources.
 */
export interface NetworkState {
    /**
     * If set to true, this network will be
     * created in auto subnet mode, and Google will create a subnet for each region
     * automatically. If set to false, a custom subnetted network will be created that
     * can support `google_compute_subnetwork` resources. Defaults to true.
     */
    readonly autoCreateSubnetworks?: pulumi.Input<boolean>;
    /**
     * A brief description of this resource.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * The IPv4 address of the gateway.
     */
    readonly gatewayIpv4?: pulumi.Input<string>;
    /**
     * If set to a CIDR block, uses the legacy VPC API with the
     * specified range. This API is deprecated. If set, `auto_create_subnetworks` must be
     * explicitly set to false.
     */
    readonly ipv4Range?: pulumi.Input<string>;
    /**
     * A unique name for the resource, required by GCE.
     * Changing this forces a new resource to be created.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    /**
     * Sets the network-wide routing mode for Cloud Routers
     * to use. Accepted values are `"GLOBAL"` or `"REGIONAL"`. Defaults to `"REGIONAL"`.
     * Refer to the [Cloud Router documentation](https://cloud.google.com/router/docs/concepts/overview#dynamic-routing-mode)
     * for more details.
     */
    readonly routingMode?: pulumi.Input<string>;
    /**
     * The URI of the created resource.
     */
    readonly selfLink?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a Network resource.
 */
export interface NetworkArgs {
    /**
     * If set to true, this network will be
     * created in auto subnet mode, and Google will create a subnet for each region
     * automatically. If set to false, a custom subnetted network will be created that
     * can support `google_compute_subnetwork` resources. Defaults to true.
     */
    readonly autoCreateSubnetworks?: pulumi.Input<boolean>;
    /**
     * A brief description of this resource.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * If set to a CIDR block, uses the legacy VPC API with the
     * specified range. This API is deprecated. If set, `auto_create_subnetworks` must be
     * explicitly set to false.
     */
    readonly ipv4Range?: pulumi.Input<string>;
    /**
     * A unique name for the resource, required by GCE.
     * Changing this forces a new resource to be created.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    /**
     * Sets the network-wide routing mode for Cloud Routers
     * to use. Accepted values are `"GLOBAL"` or `"REGIONAL"`. Defaults to `"REGIONAL"`.
     * Refer to the [Cloud Router documentation](https://cloud.google.com/router/docs/concepts/overview#dynamic-routing-mode)
     * for more details.
     */
    readonly routingMode?: pulumi.Input<string>;
}
