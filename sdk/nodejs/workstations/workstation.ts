// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 *
 * ### Workstation Basic
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const _default = new gcp.compute.Network("default", {
 *     name: "workstation-cluster",
 *     autoCreateSubnetworks: false,
 * });
 * const defaultSubnetwork = new gcp.compute.Subnetwork("default", {
 *     name: "workstation-cluster",
 *     ipCidrRange: "10.0.0.0/24",
 *     region: "us-central1",
 *     network: _default.name,
 * });
 * const defaultWorkstationCluster = new gcp.workstations.WorkstationCluster("default", {
 *     workstationClusterId: "workstation-cluster",
 *     network: _default.id,
 *     subnetwork: defaultSubnetwork.id,
 *     location: "us-central1",
 *     labels: {
 *         label: "key",
 *     },
 *     annotations: {
 *         "label-one": "value-one",
 *     },
 * });
 * const defaultWorkstationConfig = new gcp.workstations.WorkstationConfig("default", {
 *     workstationConfigId: "workstation-config",
 *     workstationClusterId: defaultWorkstationCluster.workstationClusterId,
 *     location: "us-central1",
 *     host: {
 *         gceInstance: {
 *             machineType: "e2-standard-4",
 *             bootDiskSizeGb: 35,
 *             disablePublicIpAddresses: true,
 *         },
 *     },
 * });
 * const defaultWorkstation = new gcp.workstations.Workstation("default", {
 *     workstationId: "work-station",
 *     workstationConfigId: defaultWorkstationConfig.workstationConfigId,
 *     workstationClusterId: defaultWorkstationCluster.workstationClusterId,
 *     location: "us-central1",
 *     labels: {
 *         label: "key",
 *     },
 *     env: {
 *         name: "foo",
 *     },
 *     annotations: {
 *         "label-one": "value-one",
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Workstation can be imported using any of these accepted formats:
 *
 * * `projects/{{project}}/locations/{{location}}/workstationClusters/{{workstation_cluster_id}}/workstationConfigs/{{workstation_config_id}}/workstations/{{workstation_id}}`
 *
 * * `{{project}}/{{location}}/{{workstation_cluster_id}}/{{workstation_config_id}}/{{workstation_id}}`
 *
 * * `{{location}}/{{workstation_cluster_id}}/{{workstation_config_id}}/{{workstation_id}}`
 *
 * When using the `pulumi import` command, Workstation can be imported using one of the formats above. For example:
 *
 * ```sh
 * $ pulumi import gcp:workstations/workstation:Workstation default projects/{{project}}/locations/{{location}}/workstationClusters/{{workstation_cluster_id}}/workstationConfigs/{{workstation_config_id}}/workstations/{{workstation_id}}
 * ```
 *
 * ```sh
 * $ pulumi import gcp:workstations/workstation:Workstation default {{project}}/{{location}}/{{workstation_cluster_id}}/{{workstation_config_id}}/{{workstation_id}}
 * ```
 *
 * ```sh
 * $ pulumi import gcp:workstations/workstation:Workstation default {{location}}/{{workstation_cluster_id}}/{{workstation_config_id}}/{{workstation_id}}
 * ```
 */
export class Workstation extends pulumi.CustomResource {
    /**
     * Get an existing Workstation resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: WorkstationState, opts?: pulumi.CustomResourceOptions): Workstation {
        return new Workstation(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:workstations/workstation:Workstation';

    /**
     * Returns true if the given object is an instance of Workstation.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Workstation {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Workstation.__pulumiType;
    }

    /**
     * Client-specified annotations. This is distinct from labels.
     * **Note**: This field is non-authoritative, and will only manage the annotations present in your configuration.
     * Please refer to the field `effectiveAnnotations` for all of the annotations present on the resource.
     */
    public readonly annotations!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Time when this resource was created.
     */
    public /*out*/ readonly createTime!: pulumi.Output<string>;
    /**
     * Human-readable name for this resource.
     */
    public readonly displayName!: pulumi.Output<string | undefined>;
    public /*out*/ readonly effectiveAnnotations!: pulumi.Output<{[key: string]: string}>;
    /**
     * All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     */
    public /*out*/ readonly effectiveLabels!: pulumi.Output<{[key: string]: string}>;
    /**
     * 'Client-specified environment variables passed to the workstation container's entrypoint.'
     */
    public readonly env!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Host to which clients can send HTTPS traffic that will be received by the workstation.
     * Authorized traffic will be received to the workstation as HTTP on port 80.
     * To send traffic to a different port, clients may prefix the host with the destination port in the format "{port}-{host}".
     */
    public /*out*/ readonly host!: pulumi.Output<string>;
    /**
     * Client-specified labels that are applied to the resource and that are also propagated to the underlying Compute Engine resources.
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effectiveLabels` for all of the labels present on the resource.
     */
    public readonly labels!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * The location where the workstation parent resources reside.
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * Full name of this resource.
     */
    public /*out*/ readonly name!: pulumi.Output<string>;
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
     * Full resource name of the source workstation from which the workstation's persistent
     * directories will be cloned from during creation.
     */
    public readonly sourceWorkstation!: pulumi.Output<string | undefined>;
    /**
     * Current state of the workstation.
     */
    public /*out*/ readonly state!: pulumi.Output<string>;
    /**
     * A system-assigned unique identified for this resource.
     */
    public /*out*/ readonly uid!: pulumi.Output<string>;
    /**
     * The ID of the parent workstation cluster.
     */
    public readonly workstationClusterId!: pulumi.Output<string>;
    /**
     * The ID of the parent workstation cluster config.
     */
    public readonly workstationConfigId!: pulumi.Output<string>;
    /**
     * ID to use for the workstation.
     */
    public readonly workstationId!: pulumi.Output<string>;

    /**
     * Create a Workstation resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: WorkstationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: WorkstationArgs | WorkstationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as WorkstationState | undefined;
            resourceInputs["annotations"] = state ? state.annotations : undefined;
            resourceInputs["createTime"] = state ? state.createTime : undefined;
            resourceInputs["displayName"] = state ? state.displayName : undefined;
            resourceInputs["effectiveAnnotations"] = state ? state.effectiveAnnotations : undefined;
            resourceInputs["effectiveLabels"] = state ? state.effectiveLabels : undefined;
            resourceInputs["env"] = state ? state.env : undefined;
            resourceInputs["host"] = state ? state.host : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["project"] = state ? state.project : undefined;
            resourceInputs["pulumiLabels"] = state ? state.pulumiLabels : undefined;
            resourceInputs["sourceWorkstation"] = state ? state.sourceWorkstation : undefined;
            resourceInputs["state"] = state ? state.state : undefined;
            resourceInputs["uid"] = state ? state.uid : undefined;
            resourceInputs["workstationClusterId"] = state ? state.workstationClusterId : undefined;
            resourceInputs["workstationConfigId"] = state ? state.workstationConfigId : undefined;
            resourceInputs["workstationId"] = state ? state.workstationId : undefined;
        } else {
            const args = argsOrState as WorkstationArgs | undefined;
            if ((!args || args.location === undefined) && !opts.urn) {
                throw new Error("Missing required property 'location'");
            }
            if ((!args || args.workstationClusterId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'workstationClusterId'");
            }
            if ((!args || args.workstationConfigId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'workstationConfigId'");
            }
            if ((!args || args.workstationId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'workstationId'");
            }
            resourceInputs["annotations"] = args ? args.annotations : undefined;
            resourceInputs["displayName"] = args ? args.displayName : undefined;
            resourceInputs["env"] = args ? args.env : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["sourceWorkstation"] = args ? args.sourceWorkstation : undefined;
            resourceInputs["workstationClusterId"] = args ? args.workstationClusterId : undefined;
            resourceInputs["workstationConfigId"] = args ? args.workstationConfigId : undefined;
            resourceInputs["workstationId"] = args ? args.workstationId : undefined;
            resourceInputs["createTime"] = undefined /*out*/;
            resourceInputs["effectiveAnnotations"] = undefined /*out*/;
            resourceInputs["effectiveLabels"] = undefined /*out*/;
            resourceInputs["host"] = undefined /*out*/;
            resourceInputs["name"] = undefined /*out*/;
            resourceInputs["pulumiLabels"] = undefined /*out*/;
            resourceInputs["state"] = undefined /*out*/;
            resourceInputs["uid"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["effectiveLabels", "pulumiLabels"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(Workstation.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Workstation resources.
 */
export interface WorkstationState {
    /**
     * Client-specified annotations. This is distinct from labels.
     * **Note**: This field is non-authoritative, and will only manage the annotations present in your configuration.
     * Please refer to the field `effectiveAnnotations` for all of the annotations present on the resource.
     */
    annotations?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Time when this resource was created.
     */
    createTime?: pulumi.Input<string>;
    /**
     * Human-readable name for this resource.
     */
    displayName?: pulumi.Input<string>;
    effectiveAnnotations?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     */
    effectiveLabels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * 'Client-specified environment variables passed to the workstation container's entrypoint.'
     */
    env?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Host to which clients can send HTTPS traffic that will be received by the workstation.
     * Authorized traffic will be received to the workstation as HTTP on port 80.
     * To send traffic to a different port, clients may prefix the host with the destination port in the format "{port}-{host}".
     */
    host?: pulumi.Input<string>;
    /**
     * Client-specified labels that are applied to the resource and that are also propagated to the underlying Compute Engine resources.
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effectiveLabels` for all of the labels present on the resource.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The location where the workstation parent resources reside.
     */
    location?: pulumi.Input<string>;
    /**
     * Full name of this resource.
     */
    name?: pulumi.Input<string>;
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
     * Full resource name of the source workstation from which the workstation's persistent
     * directories will be cloned from during creation.
     */
    sourceWorkstation?: pulumi.Input<string>;
    /**
     * Current state of the workstation.
     */
    state?: pulumi.Input<string>;
    /**
     * A system-assigned unique identified for this resource.
     */
    uid?: pulumi.Input<string>;
    /**
     * The ID of the parent workstation cluster.
     */
    workstationClusterId?: pulumi.Input<string>;
    /**
     * The ID of the parent workstation cluster config.
     */
    workstationConfigId?: pulumi.Input<string>;
    /**
     * ID to use for the workstation.
     */
    workstationId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Workstation resource.
 */
export interface WorkstationArgs {
    /**
     * Client-specified annotations. This is distinct from labels.
     * **Note**: This field is non-authoritative, and will only manage the annotations present in your configuration.
     * Please refer to the field `effectiveAnnotations` for all of the annotations present on the resource.
     */
    annotations?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Human-readable name for this resource.
     */
    displayName?: pulumi.Input<string>;
    /**
     * 'Client-specified environment variables passed to the workstation container's entrypoint.'
     */
    env?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Client-specified labels that are applied to the resource and that are also propagated to the underlying Compute Engine resources.
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effectiveLabels` for all of the labels present on the resource.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The location where the workstation parent resources reside.
     */
    location: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * Full resource name of the source workstation from which the workstation's persistent
     * directories will be cloned from during creation.
     */
    sourceWorkstation?: pulumi.Input<string>;
    /**
     * The ID of the parent workstation cluster.
     */
    workstationClusterId: pulumi.Input<string>;
    /**
     * The ID of the parent workstation cluster config.
     */
    workstationConfigId: pulumi.Input<string>;
    /**
     * ID to use for the workstation.
     */
    workstationId: pulumi.Input<string>;
}
