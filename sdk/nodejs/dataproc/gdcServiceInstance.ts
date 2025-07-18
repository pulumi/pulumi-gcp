// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * A service instance is an instance of the Dataproc operator running on a GDC cluster.
 *
 * To get more information about ServiceInstance, see:
 *
 * * [API documentation](https://cloud.google.com/dataproc-gdc/docs/reference/rest/v1/projects.locations.serviceInstances)
 * * How-to Guides
 *     * [Dataproc Intro](https://cloud.google.com/dataproc/)
 *
 * ## Example Usage
 *
 * ### Dataprocgdc Serviceinstance
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const service_instance = new gcp.dataproc.GdcServiceInstance("service-instance", {
 *     serviceInstanceId: "tf-e2e-service-instance",
 *     project: "my-project",
 *     location: "us-west2",
 *     gdceCluster: {
 *         gdceCluster: "projects/gdce-cluster-monitoring/locations/us-west2/clusters/gdce-prism-prober-ord106",
 *     },
 *     displayName: "A service instance",
 *     labels: {
 *         "test-label": "label-value",
 *     },
 *     serviceAccount: "dataprocgdc-cep-workflows@gdce-cluster-monitoring.iam.gserviceaccount.com",
 * });
 * ```
 *
 * ## Import
 *
 * ServiceInstance can be imported using any of these accepted formats:
 *
 * * `projects/{{project}}/locations/{{location}}/serviceInstances/{{service_instance_id}}`
 *
 * * `{{project}}/{{location}}/{{service_instance_id}}`
 *
 * * `{{location}}/{{service_instance_id}}`
 *
 * When using the `pulumi import` command, ServiceInstance can be imported using one of the formats above. For example:
 *
 * ```sh
 * $ pulumi import gcp:dataproc/gdcServiceInstance:GdcServiceInstance default projects/{{project}}/locations/{{location}}/serviceInstances/{{service_instance_id}}
 * ```
 *
 * ```sh
 * $ pulumi import gcp:dataproc/gdcServiceInstance:GdcServiceInstance default {{project}}/{{location}}/{{service_instance_id}}
 * ```
 *
 * ```sh
 * $ pulumi import gcp:dataproc/gdcServiceInstance:GdcServiceInstance default {{location}}/{{service_instance_id}}
 * ```
 */
export class GdcServiceInstance extends pulumi.CustomResource {
    /**
     * Get an existing GdcServiceInstance resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: GdcServiceInstanceState, opts?: pulumi.CustomResourceOptions): GdcServiceInstance {
        return new GdcServiceInstance(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:dataproc/gdcServiceInstance:GdcServiceInstance';

    /**
     * Returns true if the given object is an instance of GdcServiceInstance.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is GdcServiceInstance {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === GdcServiceInstance.__pulumiType;
    }

    /**
     * The timestamp when the resource was created.
     */
    public /*out*/ readonly createTime!: pulumi.Output<string>;
    /**
     * User-provided human-readable name to be used in user interfaces.
     */
    public readonly displayName!: pulumi.Output<string | undefined>;
    /**
     * All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     */
    public /*out*/ readonly effectiveLabels!: pulumi.Output<{[key: string]: string}>;
    /**
     * Effective service account associated with ServiceInstance. This will be the serviceAccount if specified. Otherwise, it will be an automatically created per-resource P4SA that also automatically has Fleet Workload. Identity bindings applied.
     */
    public /*out*/ readonly effectiveServiceAccount!: pulumi.Output<string>;
    /**
     * Gdce cluster information.
     * Structure is documented below.
     */
    public readonly gdceCluster!: pulumi.Output<outputs.dataproc.GdcServiceInstanceGdceCluster | undefined>;
    /**
     * The labels to associate with this service instance. Labels may be used for filtering and billing tracking.
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effectiveLabels` for all of the labels present on the resource.
     */
    public readonly labels!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Location of the resource.
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * Identifier. The name of the service instance.
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
     * Whether the service instance is currently reconciling. True if the current state of the resource does not match the intended state, and the system is working to reconcile them, whether or not the change was user initiated.
     */
    public /*out*/ readonly reconciling!: pulumi.Output<boolean>;
    /**
     * The intended state to which the service instance is reconciling. Possible values:
     * * `CREATING`
     * * `ACTIVE`
     * * `DISCONNECTED`
     * * `DELETING`
     * * `STOPPING`
     * * `STOPPED`
     * * `STARTING`
     * * `UPDATING`
     * * `FAILED`
     */
    public /*out*/ readonly requestedState!: pulumi.Output<string>;
    /**
     * Requested service account to associate with ServiceInstance.
     */
    public readonly serviceAccount!: pulumi.Output<string | undefined>;
    /**
     * Id of the service instance.
     */
    public readonly serviceInstanceId!: pulumi.Output<string>;
    /**
     * Spark-specific service instance configuration.
     */
    public readonly sparkServiceInstanceConfig!: pulumi.Output<outputs.dataproc.GdcServiceInstanceSparkServiceInstanceConfig | undefined>;
    /**
     * The current state. Possible values:
     * * `CREATING`
     * * `ACTIVE`
     * * `DISCONNECTED`
     * * `DELETING`
     * * `STOPPING`
     * * `STOPPED`
     * * `STARTING`
     * * `UPDATING`
     * * `FAILED`
     */
    public /*out*/ readonly state!: pulumi.Output<string>;
    /**
     * A message explaining the current state.
     */
    public /*out*/ readonly stateMessage!: pulumi.Output<string>;
    /**
     * System generated unique identifier for this service instance, formatted as UUID4.
     */
    public /*out*/ readonly uid!: pulumi.Output<string>;
    /**
     * The timestamp when the resource was most recently updated.
     */
    public /*out*/ readonly updateTime!: pulumi.Output<string>;

    /**
     * Create a GdcServiceInstance resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: GdcServiceInstanceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: GdcServiceInstanceArgs | GdcServiceInstanceState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as GdcServiceInstanceState | undefined;
            resourceInputs["createTime"] = state ? state.createTime : undefined;
            resourceInputs["displayName"] = state ? state.displayName : undefined;
            resourceInputs["effectiveLabels"] = state ? state.effectiveLabels : undefined;
            resourceInputs["effectiveServiceAccount"] = state ? state.effectiveServiceAccount : undefined;
            resourceInputs["gdceCluster"] = state ? state.gdceCluster : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["project"] = state ? state.project : undefined;
            resourceInputs["pulumiLabels"] = state ? state.pulumiLabels : undefined;
            resourceInputs["reconciling"] = state ? state.reconciling : undefined;
            resourceInputs["requestedState"] = state ? state.requestedState : undefined;
            resourceInputs["serviceAccount"] = state ? state.serviceAccount : undefined;
            resourceInputs["serviceInstanceId"] = state ? state.serviceInstanceId : undefined;
            resourceInputs["sparkServiceInstanceConfig"] = state ? state.sparkServiceInstanceConfig : undefined;
            resourceInputs["state"] = state ? state.state : undefined;
            resourceInputs["stateMessage"] = state ? state.stateMessage : undefined;
            resourceInputs["uid"] = state ? state.uid : undefined;
            resourceInputs["updateTime"] = state ? state.updateTime : undefined;
        } else {
            const args = argsOrState as GdcServiceInstanceArgs | undefined;
            if ((!args || args.location === undefined) && !opts.urn) {
                throw new Error("Missing required property 'location'");
            }
            if ((!args || args.serviceInstanceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'serviceInstanceId'");
            }
            resourceInputs["displayName"] = args ? args.displayName : undefined;
            resourceInputs["gdceCluster"] = args ? args.gdceCluster : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["serviceAccount"] = args ? args.serviceAccount : undefined;
            resourceInputs["serviceInstanceId"] = args ? args.serviceInstanceId : undefined;
            resourceInputs["sparkServiceInstanceConfig"] = args ? args.sparkServiceInstanceConfig : undefined;
            resourceInputs["createTime"] = undefined /*out*/;
            resourceInputs["effectiveLabels"] = undefined /*out*/;
            resourceInputs["effectiveServiceAccount"] = undefined /*out*/;
            resourceInputs["name"] = undefined /*out*/;
            resourceInputs["pulumiLabels"] = undefined /*out*/;
            resourceInputs["reconciling"] = undefined /*out*/;
            resourceInputs["requestedState"] = undefined /*out*/;
            resourceInputs["state"] = undefined /*out*/;
            resourceInputs["stateMessage"] = undefined /*out*/;
            resourceInputs["uid"] = undefined /*out*/;
            resourceInputs["updateTime"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["effectiveLabels", "pulumiLabels"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(GdcServiceInstance.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering GdcServiceInstance resources.
 */
export interface GdcServiceInstanceState {
    /**
     * The timestamp when the resource was created.
     */
    createTime?: pulumi.Input<string>;
    /**
     * User-provided human-readable name to be used in user interfaces.
     */
    displayName?: pulumi.Input<string>;
    /**
     * All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     */
    effectiveLabels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Effective service account associated with ServiceInstance. This will be the serviceAccount if specified. Otherwise, it will be an automatically created per-resource P4SA that also automatically has Fleet Workload. Identity bindings applied.
     */
    effectiveServiceAccount?: pulumi.Input<string>;
    /**
     * Gdce cluster information.
     * Structure is documented below.
     */
    gdceCluster?: pulumi.Input<inputs.dataproc.GdcServiceInstanceGdceCluster>;
    /**
     * The labels to associate with this service instance. Labels may be used for filtering and billing tracking.
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effectiveLabels` for all of the labels present on the resource.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Location of the resource.
     */
    location?: pulumi.Input<string>;
    /**
     * Identifier. The name of the service instance.
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
     * Whether the service instance is currently reconciling. True if the current state of the resource does not match the intended state, and the system is working to reconcile them, whether or not the change was user initiated.
     */
    reconciling?: pulumi.Input<boolean>;
    /**
     * The intended state to which the service instance is reconciling. Possible values:
     * * `CREATING`
     * * `ACTIVE`
     * * `DISCONNECTED`
     * * `DELETING`
     * * `STOPPING`
     * * `STOPPED`
     * * `STARTING`
     * * `UPDATING`
     * * `FAILED`
     */
    requestedState?: pulumi.Input<string>;
    /**
     * Requested service account to associate with ServiceInstance.
     */
    serviceAccount?: pulumi.Input<string>;
    /**
     * Id of the service instance.
     */
    serviceInstanceId?: pulumi.Input<string>;
    /**
     * Spark-specific service instance configuration.
     */
    sparkServiceInstanceConfig?: pulumi.Input<inputs.dataproc.GdcServiceInstanceSparkServiceInstanceConfig>;
    /**
     * The current state. Possible values:
     * * `CREATING`
     * * `ACTIVE`
     * * `DISCONNECTED`
     * * `DELETING`
     * * `STOPPING`
     * * `STOPPED`
     * * `STARTING`
     * * `UPDATING`
     * * `FAILED`
     */
    state?: pulumi.Input<string>;
    /**
     * A message explaining the current state.
     */
    stateMessage?: pulumi.Input<string>;
    /**
     * System generated unique identifier for this service instance, formatted as UUID4.
     */
    uid?: pulumi.Input<string>;
    /**
     * The timestamp when the resource was most recently updated.
     */
    updateTime?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a GdcServiceInstance resource.
 */
export interface GdcServiceInstanceArgs {
    /**
     * User-provided human-readable name to be used in user interfaces.
     */
    displayName?: pulumi.Input<string>;
    /**
     * Gdce cluster information.
     * Structure is documented below.
     */
    gdceCluster?: pulumi.Input<inputs.dataproc.GdcServiceInstanceGdceCluster>;
    /**
     * The labels to associate with this service instance. Labels may be used for filtering and billing tracking.
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effectiveLabels` for all of the labels present on the resource.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Location of the resource.
     */
    location: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * Requested service account to associate with ServiceInstance.
     */
    serviceAccount?: pulumi.Input<string>;
    /**
     * Id of the service instance.
     */
    serviceInstanceId: pulumi.Input<string>;
    /**
     * Spark-specific service instance configuration.
     */
    sparkServiceInstanceConfig?: pulumi.Input<inputs.dataproc.GdcServiceInstanceSparkServiceInstanceConfig>;
}
