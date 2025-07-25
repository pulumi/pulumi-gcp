// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * A managed metastore federation.
 *
 * ## Example Usage
 *
 * ### Dataproc Metastore Federation Basic
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const defaultMetastoreService = new gcp.dataproc.MetastoreService("default", {
 *     serviceId: "metastore-service",
 *     location: "us-central1",
 *     tier: "DEVELOPER",
 *     hiveMetastoreConfig: {
 *         version: "3.1.2",
 *         endpointProtocol: "GRPC",
 *     },
 *     deletionProtection: false,
 * });
 * const _default = new gcp.dataproc.MetastoreFederation("default", {
 *     location: "us-central1",
 *     federationId: "metastore-fed",
 *     version: "3.1.2",
 *     backendMetastores: [{
 *         rank: "1",
 *         name: defaultMetastoreService.id,
 *         metastoreType: "DATAPROC_METASTORE",
 *     }],
 * });
 * ```
 * ### Dataproc Metastore Federation Bigquery
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const defaultMetastoreService = new gcp.dataproc.MetastoreService("default", {
 *     serviceId: "metastore-service",
 *     location: "us-central1",
 *     tier: "DEVELOPER",
 *     hiveMetastoreConfig: {
 *         version: "3.1.2",
 *         endpointProtocol: "GRPC",
 *     },
 * });
 * const project = gcp.organizations.getProject({});
 * const _default = new gcp.dataproc.MetastoreFederation("default", {
 *     location: "us-central1",
 *     federationId: "metastore-fed",
 *     version: "3.1.2",
 *     backendMetastores: [
 *         {
 *             rank: "2",
 *             name: project.then(project => project.id),
 *             metastoreType: "BIGQUERY",
 *         },
 *         {
 *             rank: "1",
 *             name: defaultMetastoreService.id,
 *             metastoreType: "DATAPROC_METASTORE",
 *         },
 *     ],
 * });
 * ```
 *
 * ## Import
 *
 * Federation can be imported using any of these accepted formats:
 *
 * * `projects/{{project}}/locations/{{location}}/federations/{{federation_id}}`
 *
 * * `{{project}}/{{location}}/{{federation_id}}`
 *
 * * `{{location}}/{{federation_id}}`
 *
 * When using the `pulumi import` command, Federation can be imported using one of the formats above. For example:
 *
 * ```sh
 * $ pulumi import gcp:dataproc/metastoreFederation:MetastoreFederation default projects/{{project}}/locations/{{location}}/federations/{{federation_id}}
 * ```
 *
 * ```sh
 * $ pulumi import gcp:dataproc/metastoreFederation:MetastoreFederation default {{project}}/{{location}}/{{federation_id}}
 * ```
 *
 * ```sh
 * $ pulumi import gcp:dataproc/metastoreFederation:MetastoreFederation default {{location}}/{{federation_id}}
 * ```
 */
export class MetastoreFederation extends pulumi.CustomResource {
    /**
     * Get an existing MetastoreFederation resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: MetastoreFederationState, opts?: pulumi.CustomResourceOptions): MetastoreFederation {
        return new MetastoreFederation(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:dataproc/metastoreFederation:MetastoreFederation';

    /**
     * Returns true if the given object is an instance of MetastoreFederation.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is MetastoreFederation {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === MetastoreFederation.__pulumiType;
    }

    /**
     * A map from BackendMetastore rank to BackendMetastores from which the federation service serves metadata at query time. The map key represents the order in which BackendMetastores should be evaluated to resolve database names at query time and should be greater than or equal to zero. A BackendMetastore with a lower number will be evaluated before a BackendMetastore with a higher number.
     * Structure is documented below.
     */
    public readonly backendMetastores!: pulumi.Output<outputs.dataproc.MetastoreFederationBackendMetastore[]>;
    /**
     * Output only. The time when the metastore federation was created.
     */
    public /*out*/ readonly createTime!: pulumi.Output<string>;
    public readonly deletionProtection!: pulumi.Output<boolean | undefined>;
    /**
     * All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     */
    public /*out*/ readonly effectiveLabels!: pulumi.Output<{[key: string]: string}>;
    /**
     * The URI of the endpoint used to access the metastore federation.
     */
    public /*out*/ readonly endpointUri!: pulumi.Output<string>;
    /**
     * The ID of the metastore federation. The id must contain only letters (a-z, A-Z), numbers (0-9), underscores (_),
     * and hyphens (-). Cannot begin or end with underscore or hyphen. Must consist of between
     * 3 and 63 characters.
     */
    public readonly federationId!: pulumi.Output<string>;
    /**
     * User-defined labels for the metastore federation.
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effectiveLabels` for all of the labels present on the resource.
     */
    public readonly labels!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * The location where the metastore federation should reside.
     */
    public readonly location!: pulumi.Output<string | undefined>;
    /**
     * The relative resource name of the metastore federation.
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
     * The current state of the metastore federation.
     */
    public /*out*/ readonly state!: pulumi.Output<string>;
    /**
     * Additional information about the current state of the metastore federation, if available.
     */
    public /*out*/ readonly stateMessage!: pulumi.Output<string>;
    /**
     * The globally unique resource identifier of the metastore federation.
     */
    public /*out*/ readonly uid!: pulumi.Output<string>;
    /**
     * Output only. The time when the metastore federation was last updated.
     */
    public /*out*/ readonly updateTime!: pulumi.Output<string>;
    /**
     * The Apache Hive metastore version of the federation. All backend metastore versions must be compatible with the federation version.
     */
    public readonly version!: pulumi.Output<string>;

    /**
     * Create a MetastoreFederation resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: MetastoreFederationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: MetastoreFederationArgs | MetastoreFederationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as MetastoreFederationState | undefined;
            resourceInputs["backendMetastores"] = state ? state.backendMetastores : undefined;
            resourceInputs["createTime"] = state ? state.createTime : undefined;
            resourceInputs["deletionProtection"] = state ? state.deletionProtection : undefined;
            resourceInputs["effectiveLabels"] = state ? state.effectiveLabels : undefined;
            resourceInputs["endpointUri"] = state ? state.endpointUri : undefined;
            resourceInputs["federationId"] = state ? state.federationId : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["project"] = state ? state.project : undefined;
            resourceInputs["pulumiLabels"] = state ? state.pulumiLabels : undefined;
            resourceInputs["state"] = state ? state.state : undefined;
            resourceInputs["stateMessage"] = state ? state.stateMessage : undefined;
            resourceInputs["uid"] = state ? state.uid : undefined;
            resourceInputs["updateTime"] = state ? state.updateTime : undefined;
            resourceInputs["version"] = state ? state.version : undefined;
        } else {
            const args = argsOrState as MetastoreFederationArgs | undefined;
            if ((!args || args.backendMetastores === undefined) && !opts.urn) {
                throw new Error("Missing required property 'backendMetastores'");
            }
            if ((!args || args.federationId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'federationId'");
            }
            if ((!args || args.version === undefined) && !opts.urn) {
                throw new Error("Missing required property 'version'");
            }
            resourceInputs["backendMetastores"] = args ? args.backendMetastores : undefined;
            resourceInputs["deletionProtection"] = args ? args.deletionProtection : undefined;
            resourceInputs["federationId"] = args ? args.federationId : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["version"] = args ? args.version : undefined;
            resourceInputs["createTime"] = undefined /*out*/;
            resourceInputs["effectiveLabels"] = undefined /*out*/;
            resourceInputs["endpointUri"] = undefined /*out*/;
            resourceInputs["name"] = undefined /*out*/;
            resourceInputs["pulumiLabels"] = undefined /*out*/;
            resourceInputs["state"] = undefined /*out*/;
            resourceInputs["stateMessage"] = undefined /*out*/;
            resourceInputs["uid"] = undefined /*out*/;
            resourceInputs["updateTime"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["effectiveLabels", "pulumiLabels"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(MetastoreFederation.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering MetastoreFederation resources.
 */
export interface MetastoreFederationState {
    /**
     * A map from BackendMetastore rank to BackendMetastores from which the federation service serves metadata at query time. The map key represents the order in which BackendMetastores should be evaluated to resolve database names at query time and should be greater than or equal to zero. A BackendMetastore with a lower number will be evaluated before a BackendMetastore with a higher number.
     * Structure is documented below.
     */
    backendMetastores?: pulumi.Input<pulumi.Input<inputs.dataproc.MetastoreFederationBackendMetastore>[]>;
    /**
     * Output only. The time when the metastore federation was created.
     */
    createTime?: pulumi.Input<string>;
    deletionProtection?: pulumi.Input<boolean>;
    /**
     * All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     */
    effectiveLabels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The URI of the endpoint used to access the metastore federation.
     */
    endpointUri?: pulumi.Input<string>;
    /**
     * The ID of the metastore federation. The id must contain only letters (a-z, A-Z), numbers (0-9), underscores (_),
     * and hyphens (-). Cannot begin or end with underscore or hyphen. Must consist of between
     * 3 and 63 characters.
     */
    federationId?: pulumi.Input<string>;
    /**
     * User-defined labels for the metastore federation.
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effectiveLabels` for all of the labels present on the resource.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The location where the metastore federation should reside.
     */
    location?: pulumi.Input<string>;
    /**
     * The relative resource name of the metastore federation.
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
     * The current state of the metastore federation.
     */
    state?: pulumi.Input<string>;
    /**
     * Additional information about the current state of the metastore federation, if available.
     */
    stateMessage?: pulumi.Input<string>;
    /**
     * The globally unique resource identifier of the metastore federation.
     */
    uid?: pulumi.Input<string>;
    /**
     * Output only. The time when the metastore federation was last updated.
     */
    updateTime?: pulumi.Input<string>;
    /**
     * The Apache Hive metastore version of the federation. All backend metastore versions must be compatible with the federation version.
     */
    version?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a MetastoreFederation resource.
 */
export interface MetastoreFederationArgs {
    /**
     * A map from BackendMetastore rank to BackendMetastores from which the federation service serves metadata at query time. The map key represents the order in which BackendMetastores should be evaluated to resolve database names at query time and should be greater than or equal to zero. A BackendMetastore with a lower number will be evaluated before a BackendMetastore with a higher number.
     * Structure is documented below.
     */
    backendMetastores: pulumi.Input<pulumi.Input<inputs.dataproc.MetastoreFederationBackendMetastore>[]>;
    deletionProtection?: pulumi.Input<boolean>;
    /**
     * The ID of the metastore federation. The id must contain only letters (a-z, A-Z), numbers (0-9), underscores (_),
     * and hyphens (-). Cannot begin or end with underscore or hyphen. Must consist of between
     * 3 and 63 characters.
     */
    federationId: pulumi.Input<string>;
    /**
     * User-defined labels for the metastore federation.
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effectiveLabels` for all of the labels present on the resource.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The location where the metastore federation should reside.
     */
    location?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * The Apache Hive metastore version of the federation. All backend metastore versions must be compatible with the federation version.
     */
    version: pulumi.Input<string>;
}
