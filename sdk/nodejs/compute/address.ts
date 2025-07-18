// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

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
 * To get more information about Address, see:
 *
 * * [API documentation](https://cloud.google.com/compute/docs/reference/beta/addresses)
 * * How-to Guides
 *     * [Reserving a Static External IP Address](https://cloud.google.com/compute/docs/instances-and-network)
 *     * [Reserving a Static Internal IP Address](https://cloud.google.com/compute/docs/ip-addresses/reserve-static-internal-ip-address)
 *
 * ## Example Usage
 *
 * ### Address Basic
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const ipAddress = new gcp.compute.Address("ip_address", {name: "my-address"});
 * ```
 * ### Address With Subnetwork
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const _default = new gcp.compute.Network("default", {name: "my-network"});
 * const defaultSubnetwork = new gcp.compute.Subnetwork("default", {
 *     name: "my-subnet",
 *     ipCidrRange: "10.0.0.0/16",
 *     region: "us-central1",
 *     network: _default.id,
 * });
 * const internalWithSubnetAndAddress = new gcp.compute.Address("internal_with_subnet_and_address", {
 *     name: "my-internal-address",
 *     subnetwork: defaultSubnetwork.id,
 *     addressType: "INTERNAL",
 *     address: "10.0.42.42",
 *     region: "us-central1",
 * });
 * ```
 * ### Address With Gce Endpoint
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const internalWithGceEndpoint = new gcp.compute.Address("internal_with_gce_endpoint", {
 *     name: "my-internal-address-",
 *     addressType: "INTERNAL",
 *     purpose: "GCE_ENDPOINT",
 * });
 * ```
 * ### Instance With Ip
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const static = new gcp.compute.Address("static", {name: "ipv4-address"});
 * const debianImage = gcp.compute.getImage({
 *     family: "debian-11",
 *     project: "debian-cloud",
 * });
 * const instanceWithIp = new gcp.compute.Instance("instance_with_ip", {
 *     name: "vm-instance",
 *     machineType: "f1-micro",
 *     zone: "us-central1-a",
 *     bootDisk: {
 *         initializeParams: {
 *             image: debianImage.then(debianImage => debianImage.selfLink),
 *         },
 *     },
 *     networkInterfaces: [{
 *         network: "default",
 *         accessConfigs: [{
 *             natIp: static.address,
 *         }],
 *     }],
 * });
 * ```
 * ### Compute Address Ipsec Interconnect
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const network = new gcp.compute.Network("network", {
 *     name: "test-network",
 *     autoCreateSubnetworks: false,
 * });
 * const ipsec_interconnect_address = new gcp.compute.Address("ipsec-interconnect-address", {
 *     name: "test-address",
 *     addressType: "INTERNAL",
 *     purpose: "IPSEC_INTERCONNECT",
 *     address: "192.168.1.0",
 *     prefixLength: 29,
 *     network: network.selfLink,
 * });
 * ```
 *
 * ## Import
 *
 * Address can be imported using any of these accepted formats:
 *
 * * `projects/{{project}}/regions/{{region}}/addresses/{{name}}`
 *
 * * `{{project}}/{{region}}/{{name}}`
 *
 * * `{{region}}/{{name}}`
 *
 * * `{{name}}`
 *
 * When using the `pulumi import` command, Address can be imported using one of the formats above. For example:
 *
 * ```sh
 * $ pulumi import gcp:compute/address:Address default projects/{{project}}/regions/{{region}}/addresses/{{name}}
 * ```
 *
 * ```sh
 * $ pulumi import gcp:compute/address:Address default {{project}}/{{region}}/{{name}}
 * ```
 *
 * ```sh
 * $ pulumi import gcp:compute/address:Address default {{region}}/{{name}}
 * ```
 *
 * ```sh
 * $ pulumi import gcp:compute/address:Address default {{name}}
 * ```
 */
export class Address extends pulumi.CustomResource {
    /**
     * Get an existing Address resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AddressState, opts?: pulumi.CustomResourceOptions): Address {
        return new Address(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:compute/address:Address';

    /**
     * Returns true if the given object is an instance of Address.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Address {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Address.__pulumiType;
    }

    /**
     * The static external IP address represented by this resource.
     * The IP address must be inside the specified subnetwork,
     * if any. Set by the API if undefined.
     */
    public readonly address!: pulumi.Output<string>;
    /**
     * The type of address to reserve.
     * Note: if you set this argument's value as `INTERNAL` you need to leave the `networkTier` argument unset in that resource block.
     * Default value is `EXTERNAL`.
     * Possible values are: `INTERNAL`, `EXTERNAL`.
     */
    public readonly addressType!: pulumi.Output<string | undefined>;
    /**
     * Creation timestamp in RFC3339 text format.
     */
    public /*out*/ readonly creationTimestamp!: pulumi.Output<string>;
    /**
     * An optional description of this resource.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     */
    public /*out*/ readonly effectiveLabels!: pulumi.Output<{[key: string]: string}>;
    /**
     * The IP Version that will be used by this address. The default value is `IPV4`.
     * Possible values are: `IPV4`, `IPV6`.
     */
    public readonly ipVersion!: pulumi.Output<string | undefined>;
    /**
     * The endpoint type of this address, which should be VM or NETLB. This is
     * used for deciding which type of endpoint this address can be used after
     * the external IPv6 address reservation.
     * Possible values are: `VM`, `NETLB`.
     */
    public readonly ipv6EndpointType!: pulumi.Output<string | undefined>;
    /**
     * The fingerprint used for optimistic locking of this resource.  Used
     * internally during updates.
     */
    public /*out*/ readonly labelFingerprint!: pulumi.Output<string>;
    /**
     * Labels to apply to this address.  A list of key->value pairs.
     *
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effectiveLabels` for all of the labels present on the resource.
     */
    public readonly labels!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Name of the resource. The name must be 1-63 characters long, and
     * comply with RFC1035. Specifically, the name must be 1-63 characters
     * long and match the regular expression `a-z?`
     * which means the first character must be a lowercase letter, and all
     * following characters must be a dash, lowercase letter, or digit,
     * except the last character, which cannot be a dash.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The URL of the network in which to reserve the address. This field
     * can only be used with INTERNAL type with the VPC_PEERING and
     * IPSEC_INTERCONNECT purposes.
     */
    public readonly network!: pulumi.Output<string | undefined>;
    /**
     * The networking tier used for configuring this address. If this field is not
     * specified, it is assumed to be PREMIUM.
     * This argument should not be used when configuring Internal addresses, because [network tier cannot be set for internal traffic; it's always Premium](https://cloud.google.com/network-tiers/docs/overview).
     * Possible values are: `PREMIUM`, `STANDARD`.
     */
    public readonly networkTier!: pulumi.Output<string>;
    /**
     * The prefix length if the resource represents an IP range.
     */
    public readonly prefixLength!: pulumi.Output<number>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    public readonly project!: pulumi.Output<string>;
    /**
     * The combination of labels configured directly on the resource
     * and default labels configured on the provider.
     */
    public /*out*/ readonly pulumiLabels!: pulumi.Output<{[key: string]: string}>;
    /**
     * The purpose of this resource, which can be one of the following values.
     * * GCE_ENDPOINT for addresses that are used by VM instances, alias IP
     * ranges, load balancers, and similar resources.
     * * SHARED_LOADBALANCER_VIP for an address that can be used by multiple
     * internal load balancers.
     * * VPC_PEERING for addresses that are reserved for VPC peer networks.
     * * IPSEC_INTERCONNECT for addresses created from a private IP range that
     * are reserved for a VLAN attachment in an HA VPN over Cloud Interconnect
     * configuration. These addresses are regional resources.
     * * PRIVATE_SERVICE_CONNECT for a private network address that is used to
     * configure Private Service Connect. Only global internal addresses can use
     * this purpose.
     * This should only be set when using an Internal address.
     */
    public readonly purpose!: pulumi.Output<string>;
    /**
     * The Region in which the created address should reside.
     * If it is not provided, the provider region is used.
     */
    public readonly region!: pulumi.Output<string>;
    /**
     * The URI of the created resource.
     */
    public /*out*/ readonly selfLink!: pulumi.Output<string>;
    /**
     * The URL of the subnetwork in which to reserve the address. If an IP
     * address is specified, it must be within the subnetwork's IP range.
     * This field can only be used with INTERNAL type with
     * GCE_ENDPOINT/DNS_RESOLVER purposes.
     */
    public readonly subnetwork!: pulumi.Output<string>;
    /**
     * The URLs of the resources that are using this address.
     */
    public /*out*/ readonly users!: pulumi.Output<string[]>;

    /**
     * Create a Address resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: AddressArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AddressArgs | AddressState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AddressState | undefined;
            resourceInputs["address"] = state ? state.address : undefined;
            resourceInputs["addressType"] = state ? state.addressType : undefined;
            resourceInputs["creationTimestamp"] = state ? state.creationTimestamp : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["effectiveLabels"] = state ? state.effectiveLabels : undefined;
            resourceInputs["ipVersion"] = state ? state.ipVersion : undefined;
            resourceInputs["ipv6EndpointType"] = state ? state.ipv6EndpointType : undefined;
            resourceInputs["labelFingerprint"] = state ? state.labelFingerprint : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["network"] = state ? state.network : undefined;
            resourceInputs["networkTier"] = state ? state.networkTier : undefined;
            resourceInputs["prefixLength"] = state ? state.prefixLength : undefined;
            resourceInputs["project"] = state ? state.project : undefined;
            resourceInputs["pulumiLabels"] = state ? state.pulumiLabels : undefined;
            resourceInputs["purpose"] = state ? state.purpose : undefined;
            resourceInputs["region"] = state ? state.region : undefined;
            resourceInputs["selfLink"] = state ? state.selfLink : undefined;
            resourceInputs["subnetwork"] = state ? state.subnetwork : undefined;
            resourceInputs["users"] = state ? state.users : undefined;
        } else {
            const args = argsOrState as AddressArgs | undefined;
            resourceInputs["address"] = args ? args.address : undefined;
            resourceInputs["addressType"] = args ? args.addressType : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["ipVersion"] = args ? args.ipVersion : undefined;
            resourceInputs["ipv6EndpointType"] = args ? args.ipv6EndpointType : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["network"] = args ? args.network : undefined;
            resourceInputs["networkTier"] = args ? args.networkTier : undefined;
            resourceInputs["prefixLength"] = args ? args.prefixLength : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["purpose"] = args ? args.purpose : undefined;
            resourceInputs["region"] = args ? args.region : undefined;
            resourceInputs["subnetwork"] = args ? args.subnetwork : undefined;
            resourceInputs["creationTimestamp"] = undefined /*out*/;
            resourceInputs["effectiveLabels"] = undefined /*out*/;
            resourceInputs["labelFingerprint"] = undefined /*out*/;
            resourceInputs["pulumiLabels"] = undefined /*out*/;
            resourceInputs["selfLink"] = undefined /*out*/;
            resourceInputs["users"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["effectiveLabels", "pulumiLabels"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(Address.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Address resources.
 */
export interface AddressState {
    /**
     * The static external IP address represented by this resource.
     * The IP address must be inside the specified subnetwork,
     * if any. Set by the API if undefined.
     */
    address?: pulumi.Input<string>;
    /**
     * The type of address to reserve.
     * Note: if you set this argument's value as `INTERNAL` you need to leave the `networkTier` argument unset in that resource block.
     * Default value is `EXTERNAL`.
     * Possible values are: `INTERNAL`, `EXTERNAL`.
     */
    addressType?: pulumi.Input<string>;
    /**
     * Creation timestamp in RFC3339 text format.
     */
    creationTimestamp?: pulumi.Input<string>;
    /**
     * An optional description of this resource.
     */
    description?: pulumi.Input<string>;
    /**
     * All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     */
    effectiveLabels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The IP Version that will be used by this address. The default value is `IPV4`.
     * Possible values are: `IPV4`, `IPV6`.
     */
    ipVersion?: pulumi.Input<string>;
    /**
     * The endpoint type of this address, which should be VM or NETLB. This is
     * used for deciding which type of endpoint this address can be used after
     * the external IPv6 address reservation.
     * Possible values are: `VM`, `NETLB`.
     */
    ipv6EndpointType?: pulumi.Input<string>;
    /**
     * The fingerprint used for optimistic locking of this resource.  Used
     * internally during updates.
     */
    labelFingerprint?: pulumi.Input<string>;
    /**
     * Labels to apply to this address.  A list of key->value pairs.
     *
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effectiveLabels` for all of the labels present on the resource.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Name of the resource. The name must be 1-63 characters long, and
     * comply with RFC1035. Specifically, the name must be 1-63 characters
     * long and match the regular expression `a-z?`
     * which means the first character must be a lowercase letter, and all
     * following characters must be a dash, lowercase letter, or digit,
     * except the last character, which cannot be a dash.
     */
    name?: pulumi.Input<string>;
    /**
     * The URL of the network in which to reserve the address. This field
     * can only be used with INTERNAL type with the VPC_PEERING and
     * IPSEC_INTERCONNECT purposes.
     */
    network?: pulumi.Input<string>;
    /**
     * The networking tier used for configuring this address. If this field is not
     * specified, it is assumed to be PREMIUM.
     * This argument should not be used when configuring Internal addresses, because [network tier cannot be set for internal traffic; it's always Premium](https://cloud.google.com/network-tiers/docs/overview).
     * Possible values are: `PREMIUM`, `STANDARD`.
     */
    networkTier?: pulumi.Input<string>;
    /**
     * The prefix length if the resource represents an IP range.
     */
    prefixLength?: pulumi.Input<number>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * The combination of labels configured directly on the resource
     * and default labels configured on the provider.
     */
    pulumiLabels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The purpose of this resource, which can be one of the following values.
     * * GCE_ENDPOINT for addresses that are used by VM instances, alias IP
     * ranges, load balancers, and similar resources.
     * * SHARED_LOADBALANCER_VIP for an address that can be used by multiple
     * internal load balancers.
     * * VPC_PEERING for addresses that are reserved for VPC peer networks.
     * * IPSEC_INTERCONNECT for addresses created from a private IP range that
     * are reserved for a VLAN attachment in an HA VPN over Cloud Interconnect
     * configuration. These addresses are regional resources.
     * * PRIVATE_SERVICE_CONNECT for a private network address that is used to
     * configure Private Service Connect. Only global internal addresses can use
     * this purpose.
     * This should only be set when using an Internal address.
     */
    purpose?: pulumi.Input<string>;
    /**
     * The Region in which the created address should reside.
     * If it is not provided, the provider region is used.
     */
    region?: pulumi.Input<string>;
    /**
     * The URI of the created resource.
     */
    selfLink?: pulumi.Input<string>;
    /**
     * The URL of the subnetwork in which to reserve the address. If an IP
     * address is specified, it must be within the subnetwork's IP range.
     * This field can only be used with INTERNAL type with
     * GCE_ENDPOINT/DNS_RESOLVER purposes.
     */
    subnetwork?: pulumi.Input<string>;
    /**
     * The URLs of the resources that are using this address.
     */
    users?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a Address resource.
 */
export interface AddressArgs {
    /**
     * The static external IP address represented by this resource.
     * The IP address must be inside the specified subnetwork,
     * if any. Set by the API if undefined.
     */
    address?: pulumi.Input<string>;
    /**
     * The type of address to reserve.
     * Note: if you set this argument's value as `INTERNAL` you need to leave the `networkTier` argument unset in that resource block.
     * Default value is `EXTERNAL`.
     * Possible values are: `INTERNAL`, `EXTERNAL`.
     */
    addressType?: pulumi.Input<string>;
    /**
     * An optional description of this resource.
     */
    description?: pulumi.Input<string>;
    /**
     * The IP Version that will be used by this address. The default value is `IPV4`.
     * Possible values are: `IPV4`, `IPV6`.
     */
    ipVersion?: pulumi.Input<string>;
    /**
     * The endpoint type of this address, which should be VM or NETLB. This is
     * used for deciding which type of endpoint this address can be used after
     * the external IPv6 address reservation.
     * Possible values are: `VM`, `NETLB`.
     */
    ipv6EndpointType?: pulumi.Input<string>;
    /**
     * Labels to apply to this address.  A list of key->value pairs.
     *
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effectiveLabels` for all of the labels present on the resource.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Name of the resource. The name must be 1-63 characters long, and
     * comply with RFC1035. Specifically, the name must be 1-63 characters
     * long and match the regular expression `a-z?`
     * which means the first character must be a lowercase letter, and all
     * following characters must be a dash, lowercase letter, or digit,
     * except the last character, which cannot be a dash.
     */
    name?: pulumi.Input<string>;
    /**
     * The URL of the network in which to reserve the address. This field
     * can only be used with INTERNAL type with the VPC_PEERING and
     * IPSEC_INTERCONNECT purposes.
     */
    network?: pulumi.Input<string>;
    /**
     * The networking tier used for configuring this address. If this field is not
     * specified, it is assumed to be PREMIUM.
     * This argument should not be used when configuring Internal addresses, because [network tier cannot be set for internal traffic; it's always Premium](https://cloud.google.com/network-tiers/docs/overview).
     * Possible values are: `PREMIUM`, `STANDARD`.
     */
    networkTier?: pulumi.Input<string>;
    /**
     * The prefix length if the resource represents an IP range.
     */
    prefixLength?: pulumi.Input<number>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * The purpose of this resource, which can be one of the following values.
     * * GCE_ENDPOINT for addresses that are used by VM instances, alias IP
     * ranges, load balancers, and similar resources.
     * * SHARED_LOADBALANCER_VIP for an address that can be used by multiple
     * internal load balancers.
     * * VPC_PEERING for addresses that are reserved for VPC peer networks.
     * * IPSEC_INTERCONNECT for addresses created from a private IP range that
     * are reserved for a VLAN attachment in an HA VPN over Cloud Interconnect
     * configuration. These addresses are regional resources.
     * * PRIVATE_SERVICE_CONNECT for a private network address that is used to
     * configure Private Service Connect. Only global internal addresses can use
     * this purpose.
     * This should only be set when using an Internal address.
     */
    purpose?: pulumi.Input<string>;
    /**
     * The Region in which the created address should reside.
     * If it is not provided, the provider region is used.
     */
    region?: pulumi.Input<string>;
    /**
     * The URL of the subnetwork in which to reserve the address. If an IP
     * address is specified, it must be within the subnetwork's IP range.
     * This field can only be used with INTERNAL type with
     * GCE_ENDPOINT/DNS_RESOLVER purposes.
     */
    subnetwork?: pulumi.Input<string>;
}
