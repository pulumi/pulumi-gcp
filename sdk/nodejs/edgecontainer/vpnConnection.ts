// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * A VPN connection
 *
 * To get more information about VpnConnection, see:
 *
 * * [API documentation](https://cloud.google.com/distributed-cloud/edge/latest/docs/reference/container/rest/v1/projects.locations.vpnConnections)
 * * How-to Guides
 *     * [Google Distributed Cloud Edge](https://cloud.google.com/distributed-cloud/edge/latest/docs)
 *
 * ## Example Usage
 * ### Edgecontainer Vpn Connection
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const project = gcp.organizations.getProject({});
 * const cluster = new gcp.edgecontainer.Cluster("cluster", {
 *     location: "us-central1",
 *     authorization: {
 *         adminUsers: {
 *             username: "admin@hashicorptest.com",
 *         },
 *     },
 *     networking: {
 *         clusterIpv4CidrBlocks: ["10.0.0.0/16"],
 *         servicesIpv4CidrBlocks: ["10.1.0.0/16"],
 *     },
 *     fleet: {
 *         project: project.then(project => `projects/${project.number}`),
 *     },
 * });
 * const nodePool = new gcp.edgecontainer.NodePool("nodePool", {
 *     cluster: cluster.name,
 *     location: "us-central1",
 *     nodeLocation: "us-central1-edge-example-edgesite",
 *     nodeCount: 3,
 * });
 * const vpc = new gcp.compute.Network("vpc", {});
 * const _default = new gcp.edgecontainer.VpnConnection("default", {
 *     location: "us-central1",
 *     cluster: pulumi.all([project, cluster.name]).apply(([project, name]) => `projects/${project.number}/locations/us-east1/clusters/${name}`),
 *     vpc: vpc.name,
 *     enableHighAvailability: true,
 *     labels: {
 *         my_key: "my_val",
 *         other_key: "other_val",
 *     },
 * }, {
 *     dependsOn: [nodePool],
 * });
 * ```
 *
 * ## Import
 *
 * VpnConnection can be imported using any of these accepted formats* `projects/{{project}}/locations/{{location}}/vpnConnections` * `{{project}}/{{location}}` * `{{location}}` In Terraform v1.5.0 and later, use an [`import` block](https://developer.hashicorp.com/terraform/language/import) to import VpnConnection using one of the formats above. For exampletf import {
 *
 *  id = "projects/{{project}}/locations/{{location}}/vpnConnections"
 *
 *  to = google_edgecontainer_vpn_connection.default }
 *
 * ```sh
 *  $ pulumi import gcp:edgecontainer/vpnConnection:VpnConnection When using the [`terraform import` command](https://developer.hashicorp.com/terraform/cli/commands/import), VpnConnection can be imported using one of the formats above. For example
 * ```
 *
 * ```sh
 *  $ pulumi import gcp:edgecontainer/vpnConnection:VpnConnection default projects/{{project}}/locations/{{location}}/vpnConnections
 * ```
 *
 * ```sh
 *  $ pulumi import gcp:edgecontainer/vpnConnection:VpnConnection default {{project}}/{{location}}
 * ```
 *
 * ```sh
 *  $ pulumi import gcp:edgecontainer/vpnConnection:VpnConnection default {{location}}
 * ```
 */
export class VpnConnection extends pulumi.CustomResource {
    /**
     * Get an existing VpnConnection resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: VpnConnectionState, opts?: pulumi.CustomResourceOptions): VpnConnection {
        return new VpnConnection(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:edgecontainer/vpnConnection:VpnConnection';

    /**
     * Returns true if the given object is an instance of VpnConnection.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is VpnConnection {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === VpnConnection.__pulumiType;
    }

    /**
     * The canonical Cluster name to connect to. It is in the form of projects/{project}/locations/{location}/clusters/{cluster}.
     */
    public readonly cluster!: pulumi.Output<string>;
    /**
     * The time when the VPN connection was created.
     */
    public /*out*/ readonly createTime!: pulumi.Output<string>;
    /**
     * A nested object resource
     * Structure is documented below.
     */
    public /*out*/ readonly details!: pulumi.Output<outputs.edgecontainer.VpnConnectionDetail[]>;
    /**
     * All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     */
    public /*out*/ readonly effectiveLabels!: pulumi.Output<{[key: string]: string}>;
    /**
     * Whether this VPN connection has HA enabled on cluster side. If enabled, when creating VPN connection we will attempt to use 2 ANG floating IPs.
     */
    public readonly enableHighAvailability!: pulumi.Output<boolean>;
    /**
     * Labels associated with this resource.
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effectiveLabels` for all of the labels present on the resource.
     */
    public readonly labels!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Google Cloud Platform location.
     *
     *
     * - - -
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * The resource name of VPN connection
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * NAT gateway IP, or WAN IP address. If a customer has multiple NAT IPs, the customer needs to configure NAT such that only one external IP maps to the GMEC Anthos cluster.
     * This is empty if NAT is not used.
     */
    public readonly natGatewayIp!: pulumi.Output<string | undefined>;
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
     * The VPN connection Cloud Router name.
     */
    public readonly router!: pulumi.Output<string | undefined>;
    /**
     * The time when the VPN connection was last updated.
     */
    public /*out*/ readonly updateTime!: pulumi.Output<string>;
    /**
     * The network ID of VPC to connect to.
     */
    public readonly vpc!: pulumi.Output<string | undefined>;
    /**
     * Project detail of the VPC network. Required if VPC is in a different project than the cluster project.
     * Structure is documented below.
     */
    public readonly vpcProject!: pulumi.Output<outputs.edgecontainer.VpnConnectionVpcProject | undefined>;

    /**
     * Create a VpnConnection resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: VpnConnectionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: VpnConnectionArgs | VpnConnectionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as VpnConnectionState | undefined;
            resourceInputs["cluster"] = state ? state.cluster : undefined;
            resourceInputs["createTime"] = state ? state.createTime : undefined;
            resourceInputs["details"] = state ? state.details : undefined;
            resourceInputs["effectiveLabels"] = state ? state.effectiveLabels : undefined;
            resourceInputs["enableHighAvailability"] = state ? state.enableHighAvailability : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["natGatewayIp"] = state ? state.natGatewayIp : undefined;
            resourceInputs["project"] = state ? state.project : undefined;
            resourceInputs["pulumiLabels"] = state ? state.pulumiLabels : undefined;
            resourceInputs["router"] = state ? state.router : undefined;
            resourceInputs["updateTime"] = state ? state.updateTime : undefined;
            resourceInputs["vpc"] = state ? state.vpc : undefined;
            resourceInputs["vpcProject"] = state ? state.vpcProject : undefined;
        } else {
            const args = argsOrState as VpnConnectionArgs | undefined;
            if ((!args || args.cluster === undefined) && !opts.urn) {
                throw new Error("Missing required property 'cluster'");
            }
            if ((!args || args.location === undefined) && !opts.urn) {
                throw new Error("Missing required property 'location'");
            }
            resourceInputs["cluster"] = args ? args.cluster : undefined;
            resourceInputs["enableHighAvailability"] = args ? args.enableHighAvailability : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["natGatewayIp"] = args ? args.natGatewayIp : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["router"] = args ? args.router : undefined;
            resourceInputs["vpc"] = args ? args.vpc : undefined;
            resourceInputs["vpcProject"] = args ? args.vpcProject : undefined;
            resourceInputs["createTime"] = undefined /*out*/;
            resourceInputs["details"] = undefined /*out*/;
            resourceInputs["effectiveLabels"] = undefined /*out*/;
            resourceInputs["pulumiLabels"] = undefined /*out*/;
            resourceInputs["updateTime"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["effectiveLabels", "pulumiLabels"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(VpnConnection.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering VpnConnection resources.
 */
export interface VpnConnectionState {
    /**
     * The canonical Cluster name to connect to. It is in the form of projects/{project}/locations/{location}/clusters/{cluster}.
     */
    cluster?: pulumi.Input<string>;
    /**
     * The time when the VPN connection was created.
     */
    createTime?: pulumi.Input<string>;
    /**
     * A nested object resource
     * Structure is documented below.
     */
    details?: pulumi.Input<pulumi.Input<inputs.edgecontainer.VpnConnectionDetail>[]>;
    /**
     * All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     */
    effectiveLabels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Whether this VPN connection has HA enabled on cluster side. If enabled, when creating VPN connection we will attempt to use 2 ANG floating IPs.
     */
    enableHighAvailability?: pulumi.Input<boolean>;
    /**
     * Labels associated with this resource.
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effectiveLabels` for all of the labels present on the resource.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Google Cloud Platform location.
     *
     *
     * - - -
     */
    location?: pulumi.Input<string>;
    /**
     * The resource name of VPN connection
     */
    name?: pulumi.Input<string>;
    /**
     * NAT gateway IP, or WAN IP address. If a customer has multiple NAT IPs, the customer needs to configure NAT such that only one external IP maps to the GMEC Anthos cluster.
     * This is empty if NAT is not used.
     */
    natGatewayIp?: pulumi.Input<string>;
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
     * The VPN connection Cloud Router name.
     */
    router?: pulumi.Input<string>;
    /**
     * The time when the VPN connection was last updated.
     */
    updateTime?: pulumi.Input<string>;
    /**
     * The network ID of VPC to connect to.
     */
    vpc?: pulumi.Input<string>;
    /**
     * Project detail of the VPC network. Required if VPC is in a different project than the cluster project.
     * Structure is documented below.
     */
    vpcProject?: pulumi.Input<inputs.edgecontainer.VpnConnectionVpcProject>;
}

/**
 * The set of arguments for constructing a VpnConnection resource.
 */
export interface VpnConnectionArgs {
    /**
     * The canonical Cluster name to connect to. It is in the form of projects/{project}/locations/{location}/clusters/{cluster}.
     */
    cluster: pulumi.Input<string>;
    /**
     * Whether this VPN connection has HA enabled on cluster side. If enabled, when creating VPN connection we will attempt to use 2 ANG floating IPs.
     */
    enableHighAvailability?: pulumi.Input<boolean>;
    /**
     * Labels associated with this resource.
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effectiveLabels` for all of the labels present on the resource.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Google Cloud Platform location.
     *
     *
     * - - -
     */
    location: pulumi.Input<string>;
    /**
     * The resource name of VPN connection
     */
    name?: pulumi.Input<string>;
    /**
     * NAT gateway IP, or WAN IP address. If a customer has multiple NAT IPs, the customer needs to configure NAT such that only one external IP maps to the GMEC Anthos cluster.
     * This is empty if NAT is not used.
     */
    natGatewayIp?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * The VPN connection Cloud Router name.
     */
    router?: pulumi.Input<string>;
    /**
     * The network ID of VPC to connect to.
     */
    vpc?: pulumi.Input<string>;
    /**
     * Project detail of the VPC network. Required if VPC is in a different project than the cluster project.
     * Structure is documented below.
     */
    vpcProject?: pulumi.Input<inputs.edgecontainer.VpnConnectionVpcProject>;
}