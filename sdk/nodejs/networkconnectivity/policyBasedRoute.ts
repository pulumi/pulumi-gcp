// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Policy-based Routes are more powerful routes that route L4 network traffic based on not just destination IP, but also source IP, protocol and more. A Policy-based Route always take precedence when it conflicts with other types of routes.
 *
 * To get more information about PolicyBasedRoute, see:
 *
 * * [API documentation](https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/projects.locations.global.policyBasedRoutes)
 * * How-to Guides
 *     * [Use policy-based routes](https://cloud.google.com/vpc/docs/use-policy-based-routes#api)
 *
 * ## Example Usage
 * ### Network Connectivity Policy Based Route Basic
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const myNetwork = new gcp.compute.Network("myNetwork", {autoCreateSubnetworks: false});
 * const _default = new gcp.networkconnectivity.PolicyBasedRoute("default", {
 *     network: myNetwork.id,
 *     filter: {
 *         protocolVersion: "IPV4",
 *     },
 *     nextHopOtherRoutes: "DEFAULT_ROUTING",
 * });
 * ```
 * ### Network Connectivity Policy Based Route Full
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const myNetwork = new gcp.compute.Network("myNetwork", {autoCreateSubnetworks: false});
 * // This example substitutes an arbitrary internal IP for an internal network
 * // load balancer for brevity. Consult https://cloud.google.com/load-balancing/docs/internal
 * // to set one up.
 * const ilb = new gcp.compute.GlobalAddress("ilb", {});
 * const _default = new gcp.networkconnectivity.PolicyBasedRoute("default", {
 *     description: "My routing policy",
 *     network: myNetwork.id,
 *     priority: 2302,
 *     filter: {
 *         protocolVersion: "IPV4",
 *         ipProtocol: "UDP",
 *         srcRange: "10.0.0.0/24",
 *         destRange: "0.0.0.0/0",
 *     },
 *     nextHopIlbIp: ilb.address,
 *     virtualMachine: {
 *         tags: ["restricted"],
 *     },
 *     labels: {
 *         env: "default",
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * PolicyBasedRoute can be imported using any of these accepted formats* `projects/{{project}}/locations/global/policyBasedRoutes/{{name}}` * `{{project}}/{{name}}` * `{{name}}` In Terraform v1.5.0 and later, use an [`import` block](https://developer.hashicorp.com/terraform/language/import) to import PolicyBasedRoute using one of the formats above. For exampletf import {
 *
 *  id = "projects/{{project}}/locations/global/policyBasedRoutes/{{name}}"
 *
 *  to = google_network_connectivity_policy_based_route.default }
 *
 * ```sh
 *  $ pulumi import gcp:networkconnectivity/policyBasedRoute:PolicyBasedRoute When using the [`terraform import` command](https://developer.hashicorp.com/terraform/cli/commands/import), PolicyBasedRoute can be imported using one of the formats above. For example
 * ```
 *
 * ```sh
 *  $ pulumi import gcp:networkconnectivity/policyBasedRoute:PolicyBasedRoute default projects/{{project}}/locations/global/policyBasedRoutes/{{name}}
 * ```
 *
 * ```sh
 *  $ pulumi import gcp:networkconnectivity/policyBasedRoute:PolicyBasedRoute default {{project}}/{{name}}
 * ```
 *
 * ```sh
 *  $ pulumi import gcp:networkconnectivity/policyBasedRoute:PolicyBasedRoute default {{name}}
 * ```
 */
export class PolicyBasedRoute extends pulumi.CustomResource {
    /**
     * Get an existing PolicyBasedRoute resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PolicyBasedRouteState, opts?: pulumi.CustomResourceOptions): PolicyBasedRoute {
        return new PolicyBasedRoute(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:networkconnectivity/policyBasedRoute:PolicyBasedRoute';

    /**
     * Returns true if the given object is an instance of PolicyBasedRoute.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is PolicyBasedRoute {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === PolicyBasedRoute.__pulumiType;
    }

    /**
     * Time when the policy-based route was created.
     */
    public /*out*/ readonly createTime!: pulumi.Output<string>;
    /**
     * An optional description of this resource.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     */
    public /*out*/ readonly effectiveLabels!: pulumi.Output<{[key: string]: string}>;
    /**
     * The filter to match L4 traffic.
     * Structure is documented below.
     */
    public readonly filter!: pulumi.Output<outputs.networkconnectivity.PolicyBasedRouteFilter>;
    /**
     * The interconnect attachments that this policy-based route applies to.
     * Structure is documented below.
     */
    public readonly interconnectAttachment!: pulumi.Output<outputs.networkconnectivity.PolicyBasedRouteInterconnectAttachment | undefined>;
    /**
     * Type of this resource.
     */
    public /*out*/ readonly kind!: pulumi.Output<string>;
    /**
     * User-defined labels.
     *
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effectiveLabels` for all of the labels present on the resource.
     */
    public readonly labels!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * The name of the policy based route.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Fully-qualified URL of the network that this route applies to, for example: projects/my-project/global/networks/my-network.
     */
    public readonly network!: pulumi.Output<string>;
    /**
     * The IP address of a global-access-enabled L4 ILB that is the next hop for matching packets.
     */
    public readonly nextHopIlbIp!: pulumi.Output<string | undefined>;
    /**
     * Other routes that will be referenced to determine the next hop of the packet.
     * Possible values are: `DEFAULT_ROUTING`.
     */
    public readonly nextHopOtherRoutes!: pulumi.Output<string | undefined>;
    /**
     * The priority of this policy-based route. Priority is used to break ties in cases where there are more than one matching policy-based routes found. In cases where multiple policy-based routes are matched, the one with the lowest-numbered priority value wins. The default value is 1000. The priority value must be from 1 to 65535, inclusive.
     */
    public readonly priority!: pulumi.Output<number | undefined>;
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
     * Time when the policy-based route was created.
     */
    public /*out*/ readonly updateTime!: pulumi.Output<string>;
    /**
     * VM instances to which this policy-based route applies to.
     * Structure is documented below.
     */
    public readonly virtualMachine!: pulumi.Output<outputs.networkconnectivity.PolicyBasedRouteVirtualMachine | undefined>;
    /**
     * If potential misconfigurations are detected for this route, this field will be populated with warning messages.
     * Structure is documented below.
     */
    public /*out*/ readonly warnings!: pulumi.Output<outputs.networkconnectivity.PolicyBasedRouteWarning[]>;

    /**
     * Create a PolicyBasedRoute resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: PolicyBasedRouteArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: PolicyBasedRouteArgs | PolicyBasedRouteState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as PolicyBasedRouteState | undefined;
            resourceInputs["createTime"] = state ? state.createTime : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["effectiveLabels"] = state ? state.effectiveLabels : undefined;
            resourceInputs["filter"] = state ? state.filter : undefined;
            resourceInputs["interconnectAttachment"] = state ? state.interconnectAttachment : undefined;
            resourceInputs["kind"] = state ? state.kind : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["network"] = state ? state.network : undefined;
            resourceInputs["nextHopIlbIp"] = state ? state.nextHopIlbIp : undefined;
            resourceInputs["nextHopOtherRoutes"] = state ? state.nextHopOtherRoutes : undefined;
            resourceInputs["priority"] = state ? state.priority : undefined;
            resourceInputs["project"] = state ? state.project : undefined;
            resourceInputs["pulumiLabels"] = state ? state.pulumiLabels : undefined;
            resourceInputs["updateTime"] = state ? state.updateTime : undefined;
            resourceInputs["virtualMachine"] = state ? state.virtualMachine : undefined;
            resourceInputs["warnings"] = state ? state.warnings : undefined;
        } else {
            const args = argsOrState as PolicyBasedRouteArgs | undefined;
            if ((!args || args.filter === undefined) && !opts.urn) {
                throw new Error("Missing required property 'filter'");
            }
            if ((!args || args.network === undefined) && !opts.urn) {
                throw new Error("Missing required property 'network'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["filter"] = args ? args.filter : undefined;
            resourceInputs["interconnectAttachment"] = args ? args.interconnectAttachment : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["network"] = args ? args.network : undefined;
            resourceInputs["nextHopIlbIp"] = args ? args.nextHopIlbIp : undefined;
            resourceInputs["nextHopOtherRoutes"] = args ? args.nextHopOtherRoutes : undefined;
            resourceInputs["priority"] = args ? args.priority : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["virtualMachine"] = args ? args.virtualMachine : undefined;
            resourceInputs["createTime"] = undefined /*out*/;
            resourceInputs["effectiveLabels"] = undefined /*out*/;
            resourceInputs["kind"] = undefined /*out*/;
            resourceInputs["pulumiLabels"] = undefined /*out*/;
            resourceInputs["updateTime"] = undefined /*out*/;
            resourceInputs["warnings"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["effectiveLabels", "pulumiLabels"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(PolicyBasedRoute.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering PolicyBasedRoute resources.
 */
export interface PolicyBasedRouteState {
    /**
     * Time when the policy-based route was created.
     */
    createTime?: pulumi.Input<string>;
    /**
     * An optional description of this resource.
     */
    description?: pulumi.Input<string>;
    /**
     * All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     */
    effectiveLabels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The filter to match L4 traffic.
     * Structure is documented below.
     */
    filter?: pulumi.Input<inputs.networkconnectivity.PolicyBasedRouteFilter>;
    /**
     * The interconnect attachments that this policy-based route applies to.
     * Structure is documented below.
     */
    interconnectAttachment?: pulumi.Input<inputs.networkconnectivity.PolicyBasedRouteInterconnectAttachment>;
    /**
     * Type of this resource.
     */
    kind?: pulumi.Input<string>;
    /**
     * User-defined labels.
     *
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effectiveLabels` for all of the labels present on the resource.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The name of the policy based route.
     */
    name?: pulumi.Input<string>;
    /**
     * Fully-qualified URL of the network that this route applies to, for example: projects/my-project/global/networks/my-network.
     */
    network?: pulumi.Input<string>;
    /**
     * The IP address of a global-access-enabled L4 ILB that is the next hop for matching packets.
     */
    nextHopIlbIp?: pulumi.Input<string>;
    /**
     * Other routes that will be referenced to determine the next hop of the packet.
     * Possible values are: `DEFAULT_ROUTING`.
     */
    nextHopOtherRoutes?: pulumi.Input<string>;
    /**
     * The priority of this policy-based route. Priority is used to break ties in cases where there are more than one matching policy-based routes found. In cases where multiple policy-based routes are matched, the one with the lowest-numbered priority value wins. The default value is 1000. The priority value must be from 1 to 65535, inclusive.
     */
    priority?: pulumi.Input<number>;
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
     * Time when the policy-based route was created.
     */
    updateTime?: pulumi.Input<string>;
    /**
     * VM instances to which this policy-based route applies to.
     * Structure is documented below.
     */
    virtualMachine?: pulumi.Input<inputs.networkconnectivity.PolicyBasedRouteVirtualMachine>;
    /**
     * If potential misconfigurations are detected for this route, this field will be populated with warning messages.
     * Structure is documented below.
     */
    warnings?: pulumi.Input<pulumi.Input<inputs.networkconnectivity.PolicyBasedRouteWarning>[]>;
}

/**
 * The set of arguments for constructing a PolicyBasedRoute resource.
 */
export interface PolicyBasedRouteArgs {
    /**
     * An optional description of this resource.
     */
    description?: pulumi.Input<string>;
    /**
     * The filter to match L4 traffic.
     * Structure is documented below.
     */
    filter: pulumi.Input<inputs.networkconnectivity.PolicyBasedRouteFilter>;
    /**
     * The interconnect attachments that this policy-based route applies to.
     * Structure is documented below.
     */
    interconnectAttachment?: pulumi.Input<inputs.networkconnectivity.PolicyBasedRouteInterconnectAttachment>;
    /**
     * User-defined labels.
     *
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effectiveLabels` for all of the labels present on the resource.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The name of the policy based route.
     */
    name?: pulumi.Input<string>;
    /**
     * Fully-qualified URL of the network that this route applies to, for example: projects/my-project/global/networks/my-network.
     */
    network: pulumi.Input<string>;
    /**
     * The IP address of a global-access-enabled L4 ILB that is the next hop for matching packets.
     */
    nextHopIlbIp?: pulumi.Input<string>;
    /**
     * Other routes that will be referenced to determine the next hop of the packet.
     * Possible values are: `DEFAULT_ROUTING`.
     */
    nextHopOtherRoutes?: pulumi.Input<string>;
    /**
     * The priority of this policy-based route. Priority is used to break ties in cases where there are more than one matching policy-based routes found. In cases where multiple policy-based routes are matched, the one with the lowest-numbered priority value wins. The default value is 1000. The priority value must be from 1 to 65535, inclusive.
     */
    priority?: pulumi.Input<number>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * VM instances to which this policy-based route applies to.
     * Structure is documented below.
     */
    virtualMachine?: pulumi.Input<inputs.networkconnectivity.PolicyBasedRouteVirtualMachine>;
}