// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * The NetworkConnectivity Hub resource
 *
 * To get more information about Hub, see:
 *
 * * [API documentation](https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1beta/projects.locations.global.hubs)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/network-connectivity/docs/network-connectivity-center/concepts/overview)
 *
 * ## Example Usage
 *
 * ### Network Connectivity Hub Basic
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const primary = new gcp.networkconnectivity.Hub("primary", {
 *     name: "basic",
 *     description: "A sample hub",
 *     labels: {
 *         "label-one": "value-one",
 *     },
 * });
 * ```
 * ### Network Connectivity Hub With Export Psc
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const primary = new gcp.networkconnectivity.Hub("primary", {
 *     name: "basic",
 *     description: "A sample hub with Private Service Connect transitivity is enabled",
 *     exportPsc: true,
 * });
 * ```
 * ### Network Connectivity Hub Mesh Topology
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const primary = new gcp.networkconnectivity.Hub("primary", {
 *     name: "mesh",
 *     description: "A sample mesh hub",
 *     labels: {
 *         "label-one": "value-one",
 *     },
 * });
 * ```
 * ### Network Connectivity Hub Star Topology
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const primary = new gcp.networkconnectivity.Hub("primary", {
 *     name: "star",
 *     description: "A sample star hub",
 *     labels: {
 *         "label-one": "value-one",
 *     },
 *     presetTopology: "STAR",
 * });
 * ```
 * ### Network Connectivity Hub Policy Mode
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const primary = new gcp.networkconnectivity.Hub("primary", {
 *     name: "policy",
 *     description: "A sample hub with PRESET policy_mode and STAR topology",
 *     policyMode: "PRESET",
 *     presetTopology: "STAR",
 *     labels: {
 *         "label-one": "value-one",
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Hub can be imported using any of these accepted formats:
 *
 * * `projects/{{project}}/locations/global/hubs/{{name}}`
 *
 * * `{{project}}/{{name}}`
 *
 * * `{{name}}`
 *
 * When using the `pulumi import` command, Hub can be imported using one of the formats above. For example:
 *
 * ```sh
 * $ pulumi import gcp:networkconnectivity/hub:Hub default projects/{{project}}/locations/global/hubs/{{name}}
 * ```
 *
 * ```sh
 * $ pulumi import gcp:networkconnectivity/hub:Hub default {{project}}/{{name}}
 * ```
 *
 * ```sh
 * $ pulumi import gcp:networkconnectivity/hub:Hub default {{name}}
 * ```
 */
export class Hub extends pulumi.CustomResource {
    /**
     * Get an existing Hub resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: HubState, opts?: pulumi.CustomResourceOptions): Hub {
        return new Hub(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:networkconnectivity/hub:Hub';

    /**
     * Returns true if the given object is an instance of Hub.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Hub {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Hub.__pulumiType;
    }

    /**
     * Output only. The time the hub was created.
     */
    public /*out*/ readonly createTime!: pulumi.Output<string>;
    /**
     * An optional description of the hub.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     */
    public /*out*/ readonly effectiveLabels!: pulumi.Output<{[key: string]: string}>;
    /**
     * Whether Private Service Connect transitivity is enabled for the hub. If true, Private Service Connect endpoints in VPC spokes attached to the hub are made accessible to other VPC spokes attached to the hub. The default value is false.
     */
    public readonly exportPsc!: pulumi.Output<boolean>;
    /**
     * Optional labels in key:value format. For more information about labels, see [Requirements for labels](https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements).
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effectiveLabels` for all of the labels present on the resource.
     */
    public readonly labels!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Immutable. The name of the hub. Hub names must be unique. They use the following form: `projects/{project_number}/locations/global/hubs/{hub_id}`
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Optional. The policy mode of this hub. This field can be either PRESET or CUSTOM. If unspecified, the policyMode defaults to PRESET.
     * Possible values are: `CUSTOM`, `PRESET`.
     */
    public readonly policyMode!: pulumi.Output<string>;
    /**
     * Optional. The topology implemented in this hub. Currently, this field is only used when policyMode = PRESET. The available preset topologies are MESH and STAR. If presetTopology is unspecified and policyMode = PRESET, the presetTopology defaults to MESH. When policyMode = CUSTOM, the presetTopology is set to PRESET_TOPOLOGY_UNSPECIFIED.
     * Possible values are: `MESH`, `STAR`.
     */
    public readonly presetTopology!: pulumi.Output<string>;
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
     * The VPC network associated with this hub's spokes. All of the VPN tunnels, VLAN attachments, and router appliance instances referenced by this hub's spokes must belong to this VPC network. This field is read-only. Network Connectivity Center automatically populates it based on the set of spokes attached to the hub.
     * Structure is documented below.
     */
    public /*out*/ readonly routingVpcs!: pulumi.Output<outputs.networkconnectivity.HubRoutingVpc[]>;
    /**
     * Output only. The current lifecycle state of this hub.
     */
    public /*out*/ readonly state!: pulumi.Output<string>;
    /**
     * Output only. The Google-generated UUID for the hub. This value is unique across all hub resources. If a hub is deleted and another with the same name is created, the new hub is assigned a different unique_id.
     */
    public /*out*/ readonly uniqueId!: pulumi.Output<string>;
    /**
     * Output only. The time the hub was last updated.
     */
    public /*out*/ readonly updateTime!: pulumi.Output<string>;

    /**
     * Create a Hub resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: HubArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: HubArgs | HubState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as HubState | undefined;
            resourceInputs["createTime"] = state ? state.createTime : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["effectiveLabels"] = state ? state.effectiveLabels : undefined;
            resourceInputs["exportPsc"] = state ? state.exportPsc : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["policyMode"] = state ? state.policyMode : undefined;
            resourceInputs["presetTopology"] = state ? state.presetTopology : undefined;
            resourceInputs["project"] = state ? state.project : undefined;
            resourceInputs["pulumiLabels"] = state ? state.pulumiLabels : undefined;
            resourceInputs["routingVpcs"] = state ? state.routingVpcs : undefined;
            resourceInputs["state"] = state ? state.state : undefined;
            resourceInputs["uniqueId"] = state ? state.uniqueId : undefined;
            resourceInputs["updateTime"] = state ? state.updateTime : undefined;
        } else {
            const args = argsOrState as HubArgs | undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["exportPsc"] = args ? args.exportPsc : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["policyMode"] = args ? args.policyMode : undefined;
            resourceInputs["presetTopology"] = args ? args.presetTopology : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["createTime"] = undefined /*out*/;
            resourceInputs["effectiveLabels"] = undefined /*out*/;
            resourceInputs["pulumiLabels"] = undefined /*out*/;
            resourceInputs["routingVpcs"] = undefined /*out*/;
            resourceInputs["state"] = undefined /*out*/;
            resourceInputs["uniqueId"] = undefined /*out*/;
            resourceInputs["updateTime"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["effectiveLabels", "pulumiLabels"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(Hub.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Hub resources.
 */
export interface HubState {
    /**
     * Output only. The time the hub was created.
     */
    createTime?: pulumi.Input<string>;
    /**
     * An optional description of the hub.
     */
    description?: pulumi.Input<string>;
    /**
     * All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     */
    effectiveLabels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Whether Private Service Connect transitivity is enabled for the hub. If true, Private Service Connect endpoints in VPC spokes attached to the hub are made accessible to other VPC spokes attached to the hub. The default value is false.
     */
    exportPsc?: pulumi.Input<boolean>;
    /**
     * Optional labels in key:value format. For more information about labels, see [Requirements for labels](https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements).
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effectiveLabels` for all of the labels present on the resource.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Immutable. The name of the hub. Hub names must be unique. They use the following form: `projects/{project_number}/locations/global/hubs/{hub_id}`
     */
    name?: pulumi.Input<string>;
    /**
     * Optional. The policy mode of this hub. This field can be either PRESET or CUSTOM. If unspecified, the policyMode defaults to PRESET.
     * Possible values are: `CUSTOM`, `PRESET`.
     */
    policyMode?: pulumi.Input<string>;
    /**
     * Optional. The topology implemented in this hub. Currently, this field is only used when policyMode = PRESET. The available preset topologies are MESH and STAR. If presetTopology is unspecified and policyMode = PRESET, the presetTopology defaults to MESH. When policyMode = CUSTOM, the presetTopology is set to PRESET_TOPOLOGY_UNSPECIFIED.
     * Possible values are: `MESH`, `STAR`.
     */
    presetTopology?: pulumi.Input<string>;
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
     * The VPC network associated with this hub's spokes. All of the VPN tunnels, VLAN attachments, and router appliance instances referenced by this hub's spokes must belong to this VPC network. This field is read-only. Network Connectivity Center automatically populates it based on the set of spokes attached to the hub.
     * Structure is documented below.
     */
    routingVpcs?: pulumi.Input<pulumi.Input<inputs.networkconnectivity.HubRoutingVpc>[]>;
    /**
     * Output only. The current lifecycle state of this hub.
     */
    state?: pulumi.Input<string>;
    /**
     * Output only. The Google-generated UUID for the hub. This value is unique across all hub resources. If a hub is deleted and another with the same name is created, the new hub is assigned a different unique_id.
     */
    uniqueId?: pulumi.Input<string>;
    /**
     * Output only. The time the hub was last updated.
     */
    updateTime?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Hub resource.
 */
export interface HubArgs {
    /**
     * An optional description of the hub.
     */
    description?: pulumi.Input<string>;
    /**
     * Whether Private Service Connect transitivity is enabled for the hub. If true, Private Service Connect endpoints in VPC spokes attached to the hub are made accessible to other VPC spokes attached to the hub. The default value is false.
     */
    exportPsc?: pulumi.Input<boolean>;
    /**
     * Optional labels in key:value format. For more information about labels, see [Requirements for labels](https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements).
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effectiveLabels` for all of the labels present on the resource.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Immutable. The name of the hub. Hub names must be unique. They use the following form: `projects/{project_number}/locations/global/hubs/{hub_id}`
     */
    name?: pulumi.Input<string>;
    /**
     * Optional. The policy mode of this hub. This field can be either PRESET or CUSTOM. If unspecified, the policyMode defaults to PRESET.
     * Possible values are: `CUSTOM`, `PRESET`.
     */
    policyMode?: pulumi.Input<string>;
    /**
     * Optional. The topology implemented in this hub. Currently, this field is only used when policyMode = PRESET. The available preset topologies are MESH and STAR. If presetTopology is unspecified and policyMode = PRESET, the presetTopology defaults to MESH. When policyMode = CUSTOM, the presetTopology is set to PRESET_TOPOLOGY_UNSPECIFIED.
     * Possible values are: `MESH`, `STAR`.
     */
    presetTopology?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
}
