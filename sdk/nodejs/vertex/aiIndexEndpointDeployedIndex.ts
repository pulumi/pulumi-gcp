// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * An endpoint indexes are deployed into. An index endpoint can have multiple deployed indexes.
 *
 * To get more information about IndexEndpointDeployedIndex, see:
 *
 * * [API documentation](https://cloud.google.com/vertex-ai/docs/reference/rest/v1/projects.locations.indexEndpoints#DeployedIndex)
 *
 * ## Example Usage
 *
 * ### Vertex Ai Index Endpoint Deployed Index Basic
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const bucket = new gcp.storage.Bucket("bucket", {
 *     name: "bucket-name",
 *     location: "us-central1",
 *     uniformBucketLevelAccess: true,
 * });
 * const index = new gcp.vertex.AiIndex("index", {
 *     region: "us-central1",
 *     displayName: "test-index",
 *     description: "index for test",
 *     indexUpdateMethod: "BATCH_UPDATE",
 *     labels: {
 *         foo: "bar",
 *     },
 *     metadata: {
 *         contentsDeltaUri: pulumi.interpolate`gs://${bucket.name}/contents`,
 *         config: {
 *             dimensions: 2,
 *             approximateNeighborsCount: 150,
 *             shardSize: "SHARD_SIZE_SMALL",
 *             distanceMeasureType: "DOT_PRODUCT_DISTANCE",
 *             algorithmConfig: {
 *                 treeAhConfig: {
 *                     leafNodeEmbeddingCount: 500,
 *                     leafNodesToSearchPercent: 7,
 *                 },
 *             },
 *         },
 *     },
 * });
 * const vertexNetwork = gcp.compute.getNetwork({
 *     name: "network-name",
 * });
 * const project = gcp.organizations.getProject({});
 * const vertexIndexEndpointDeployed = new gcp.vertex.AiIndexEndpoint("vertex_index_endpoint_deployed", {
 *     displayName: "sample-endpoint",
 *     description: "A sample vertex endpoint",
 *     region: "us-central1",
 *     network: Promise.all([project, vertexNetwork]).then(([project, vertexNetwork]) => `projects/${project.number}/global/networks/${vertexNetwork.name}`),
 *     labels: {
 *         "label-one": "value-one",
 *     },
 * });
 * const sa = new gcp.serviceaccount.Account("sa", {accountId: "vertex-sa"});
 * const basicDeployedIndex = new gcp.vertex.AiIndexEndpointDeployedIndex("basic_deployed_index", {
 *     deployedIndexId: "deployed_index_id",
 *     displayName: "vertex-deployed-index",
 *     region: "us-central1",
 *     index: index.id,
 *     indexEndpoint: vertexIndexEndpointDeployed.id,
 *     enableAccessLogging: false,
 *     reservedIpRanges: ["vertex-ai-range"],
 *     deployedIndexAuthConfig: {
 *         authProvider: {
 *             audiences: ["123456-my-app"],
 *             allowedIssuers: [sa.email],
 *         },
 *     },
 * });
 * // The sample data comes from the following link:
 * // https://cloud.google.com/vertex-ai/docs/matching-engine/filtering#specify-namespaces-tokens
 * const data = new gcp.storage.BucketObject("data", {
 *     name: "contents/data.json",
 *     bucket: bucket.name,
 *     content: `{"id": "42", "embedding": [0.5, 1.0], "restricts": [{"namespace": "class", "allow": ["cat", "pet"]},{"namespace": "category", "allow": ["feline"]}]}
 * {"id": "43", "embedding": [0.6, 1.0], "restricts": [{"namespace": "class", "allow": ["dog", "pet"]},{"namespace": "category", "allow": ["canine"]}]}
 * `,
 * });
 * ```
 * ### Vertex Ai Index Endpoint Deployed Index Basic Two
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const sa = new gcp.serviceaccount.Account("sa", {accountId: "vertex-sa"});
 * const bucket = new gcp.storage.Bucket("bucket", {
 *     name: "bucket-name",
 *     location: "us-central1",
 *     uniformBucketLevelAccess: true,
 * });
 * const index = new gcp.vertex.AiIndex("index", {
 *     region: "us-central1",
 *     displayName: "test-index",
 *     description: "index for test",
 *     indexUpdateMethod: "BATCH_UPDATE",
 *     labels: {
 *         foo: "bar",
 *     },
 *     metadata: {
 *         contentsDeltaUri: pulumi.interpolate`gs://${bucket.name}/contents`,
 *         config: {
 *             dimensions: 2,
 *             approximateNeighborsCount: 150,
 *             shardSize: "SHARD_SIZE_SMALL",
 *             distanceMeasureType: "DOT_PRODUCT_DISTANCE",
 *             algorithmConfig: {
 *                 treeAhConfig: {
 *                     leafNodeEmbeddingCount: 500,
 *                     leafNodesToSearchPercent: 7,
 *                 },
 *             },
 *         },
 *     },
 * });
 * const vertexNetwork = gcp.compute.getNetwork({
 *     name: "network-name",
 * });
 * const project = gcp.organizations.getProject({});
 * const vertexIndexEndpointDeployed = new gcp.vertex.AiIndexEndpoint("vertex_index_endpoint_deployed", {
 *     displayName: "sample-endpoint",
 *     description: "A sample vertex endpoint",
 *     region: "us-central1",
 *     network: Promise.all([project, vertexNetwork]).then(([project, vertexNetwork]) => `projects/${project.number}/global/networks/${vertexNetwork.name}`),
 *     labels: {
 *         "label-one": "value-one",
 *     },
 * });
 * const basicDeployedIndex = new gcp.vertex.AiIndexEndpointDeployedIndex("basic_deployed_index", {
 *     deployedIndexId: "deployed_index_id",
 *     displayName: "vertex-deployed-index",
 *     region: "us-central1",
 *     index: index.id,
 *     indexEndpoint: vertexIndexEndpointDeployed.id,
 *     reservedIpRanges: ["vertex-ai-range"],
 *     enableAccessLogging: false,
 *     deployedIndexAuthConfig: {
 *         authProvider: {
 *             audiences: ["123456-my-app"],
 *             allowedIssuers: [sa.email],
 *         },
 *     },
 *     automaticResources: {
 *         maxReplicaCount: 4,
 *     },
 * });
 * // The sample data comes from the following link:
 * // https://cloud.google.com/vertex-ai/docs/matching-engine/filtering#specify-namespaces-tokens
 * const data = new gcp.storage.BucketObject("data", {
 *     name: "contents/data.json",
 *     bucket: bucket.name,
 *     content: `{"id": "42", "embedding": [0.5, 1.0], "restricts": [{"namespace": "class", "allow": ["cat", "pet"]},{"namespace": "category", "allow": ["feline"]}]}
 * {"id": "43", "embedding": [0.6, 1.0], "restricts": [{"namespace": "class", "allow": ["dog", "pet"]},{"namespace": "category", "allow": ["canine"]}]}
 * `,
 * });
 * ```
 *
 * ## Import
 *
 * IndexEndpointDeployedIndex can be imported using any of these accepted formats:
 *
 * * `projects/{{project}}/locations/{{region}}/indexEndpoints/{{index_endpoint}}/deployedIndex/{{deployed_index_id}}`
 *
 * * `{{project}}/{{region}}/{{index_endpoint}}/{{deployed_index_id}}`
 *
 * * `{{region}}/{{index_endpoint}}/{{deployed_index_id}}`
 *
 * * `{{index_endpoint}}/{{deployed_index_id}}`
 *
 * When using the `pulumi import` command, IndexEndpointDeployedIndex can be imported using one of the formats above. For example:
 *
 * ```sh
 * $ pulumi import gcp:vertex/aiIndexEndpointDeployedIndex:AiIndexEndpointDeployedIndex default projects/{{project}}/locations/{{region}}/indexEndpoints/{{index_endpoint}}/deployedIndex/{{deployed_index_id}}
 * ```
 *
 * ```sh
 * $ pulumi import gcp:vertex/aiIndexEndpointDeployedIndex:AiIndexEndpointDeployedIndex default {{project}}/{{region}}/{{index_endpoint}}/{{deployed_index_id}}
 * ```
 *
 * ```sh
 * $ pulumi import gcp:vertex/aiIndexEndpointDeployedIndex:AiIndexEndpointDeployedIndex default {{region}}/{{index_endpoint}}/{{deployed_index_id}}
 * ```
 *
 * ```sh
 * $ pulumi import gcp:vertex/aiIndexEndpointDeployedIndex:AiIndexEndpointDeployedIndex default {{index_endpoint}}/{{deployed_index_id}}
 * ```
 */
export class AiIndexEndpointDeployedIndex extends pulumi.CustomResource {
    /**
     * Get an existing AiIndexEndpointDeployedIndex resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AiIndexEndpointDeployedIndexState, opts?: pulumi.CustomResourceOptions): AiIndexEndpointDeployedIndex {
        return new AiIndexEndpointDeployedIndex(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:vertex/aiIndexEndpointDeployedIndex:AiIndexEndpointDeployedIndex';

    /**
     * Returns true if the given object is an instance of AiIndexEndpointDeployedIndex.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AiIndexEndpointDeployedIndex {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AiIndexEndpointDeployedIndex.__pulumiType;
    }

    /**
     * A description of resources that the DeployedIndex uses, which to large degree are decided by Vertex AI, and optionally allows only a modest additional configuration.
     * Structure is documented below.
     */
    public readonly automaticResources!: pulumi.Output<outputs.vertex.AiIndexEndpointDeployedIndexAutomaticResources>;
    /**
     * The timestamp of when the Index was created in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits.
     */
    public /*out*/ readonly createTime!: pulumi.Output<string>;
    /**
     * A description of resources that are dedicated to the DeployedIndex, and that need a higher degree of manual configuration. The field minReplicaCount must be set to a value strictly greater than 0, or else validation will fail. We don't provide SLA when minReplicaCount=1. If maxReplicaCount is not set, the default value is minReplicaCount. The max allowed replica count is 1000.
     * Available machine types for SMALL shard: e2-standard-2 and all machine types available for MEDIUM and LARGE shard.
     * Available machine types for MEDIUM shard: e2-standard-16 and all machine types available for LARGE shard.
     * Available machine types for LARGE shard: e2-highmem-16, n2d-standard-32.
     * n1-standard-16 and n1-standard-32 are still available, but we recommend e2-standard-16 and e2-highmem-16 for cost efficiency.
     * Structure is documented below.
     */
    public readonly dedicatedResources!: pulumi.Output<outputs.vertex.AiIndexEndpointDeployedIndexDedicatedResources | undefined>;
    /**
     * If set, the authentication is enabled for the private endpoint.
     * Structure is documented below.
     */
    public readonly deployedIndexAuthConfig!: pulumi.Output<outputs.vertex.AiIndexEndpointDeployedIndexDeployedIndexAuthConfig | undefined>;
    /**
     * The user specified ID of the DeployedIndex. The ID can be up to 128 characters long and must start with a letter and only contain letters, numbers, and underscores. The ID must be unique within the project it is created in.
     */
    public readonly deployedIndexId!: pulumi.Output<string>;
    /**
     * The deployment group can be no longer than 64 characters (eg: 'test', 'prod'). If not set, we will use the 'default' deployment group.
     * Creating deploymentGroups with reservedIpRanges is a recommended practice when the peered network has multiple peering ranges. This creates your deployments from predictable IP spaces for easier traffic administration. Also, one deploymentGroup (except 'default') can only be used with the same reservedIpRanges which means if the deploymentGroup has been used with reserved_ip_ranges: [a, b, c], using it with [a, b] or [d, e] is disallowed. [See the official documentation here](https://cloud.google.com/vertex-ai/docs/reference/rest/v1/projects.locations.indexEndpoints#DeployedIndex.FIELDS.deployment_group).
     * Note: we only support up to 5 deployment groups (not including 'default').
     */
    public readonly deploymentGroup!: pulumi.Output<string | undefined>;
    /**
     * The display name of the Index. The name can be up to 128 characters long and can consist of any UTF-8 characters.
     */
    public readonly displayName!: pulumi.Output<string | undefined>;
    /**
     * If true, private endpoint's access logs are sent to Cloud Logging.
     */
    public readonly enableAccessLogging!: pulumi.Output<boolean | undefined>;
    /**
     * The name of the Index this is the deployment of.
     */
    public readonly index!: pulumi.Output<string>;
    /**
     * Identifies the index endpoint. Must be in the format
     * 'projects/{{project}}/locations/{{region}}/indexEndpoints/{{indexEndpoint}}'
     */
    public readonly indexEndpoint!: pulumi.Output<string>;
    /**
     * The DeployedIndex may depend on various data on its original Index. Additionally when certain changes to the original Index are being done (e.g. when what the Index contains is being changed) the DeployedIndex may be asynchronously updated in the background to reflect these changes. If this timestamp's value is at least the [Index.update_time](https://cloud.google.com/vertex-ai/docs/reference/rest/v1/projects.locations.indexes#Index.FIELDS.update_time) of the original Index, it means that this DeployedIndex and the original Index are in sync. If this timestamp is older, then to see which updates this DeployedIndex already contains (and which it does not), one must [list](https://cloud.google.com/vertex-ai/docs/reference/rest/v1beta1/projects.locations.operations/list#google.longrunning.Operations.ListOperations) the operations that are running on the original Index. Only the successfully completed Operations with updateTime equal or before this sync time are contained in this DeployedIndex.
     * A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
     */
    public /*out*/ readonly indexSyncTime!: pulumi.Output<string>;
    /**
     * The name of the DeployedIndex resource.
     */
    public /*out*/ readonly name!: pulumi.Output<string>;
    /**
     * Provides paths for users to send requests directly to the deployed index services running on Cloud via private services access. This field is populated if [network](https://cloud.google.com/vertex-ai/docs/reference/rest/v1/projects.locations.indexEndpoints#IndexEndpoint.FIELDS.network) is configured.
     * Structure is documented below.
     */
    public /*out*/ readonly privateEndpoints!: pulumi.Output<outputs.vertex.AiIndexEndpointDeployedIndexPrivateEndpoint[]>;
    /**
     * The region of the index endpoint deployment. eg us-central1
     */
    public readonly region!: pulumi.Output<string | undefined>;
    /**
     * A list of reserved ip ranges under the VPC network that can be used for this DeployedIndex.
     * If set, we will deploy the index within the provided ip ranges. Otherwise, the index might be deployed to any ip ranges under the provided VPC network.
     * The value should be the name of the address (https://cloud.google.com/compute/docs/reference/rest/v1/addresses) Example: ['vertex-ai-ip-range'].
     * For more information about subnets and network IP ranges, please see https://cloud.google.com/vpc/docs/subnets#manually_created_subnet_ip_ranges.
     */
    public readonly reservedIpRanges!: pulumi.Output<string[] | undefined>;

    /**
     * Create a AiIndexEndpointDeployedIndex resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AiIndexEndpointDeployedIndexArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AiIndexEndpointDeployedIndexArgs | AiIndexEndpointDeployedIndexState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AiIndexEndpointDeployedIndexState | undefined;
            resourceInputs["automaticResources"] = state ? state.automaticResources : undefined;
            resourceInputs["createTime"] = state ? state.createTime : undefined;
            resourceInputs["dedicatedResources"] = state ? state.dedicatedResources : undefined;
            resourceInputs["deployedIndexAuthConfig"] = state ? state.deployedIndexAuthConfig : undefined;
            resourceInputs["deployedIndexId"] = state ? state.deployedIndexId : undefined;
            resourceInputs["deploymentGroup"] = state ? state.deploymentGroup : undefined;
            resourceInputs["displayName"] = state ? state.displayName : undefined;
            resourceInputs["enableAccessLogging"] = state ? state.enableAccessLogging : undefined;
            resourceInputs["index"] = state ? state.index : undefined;
            resourceInputs["indexEndpoint"] = state ? state.indexEndpoint : undefined;
            resourceInputs["indexSyncTime"] = state ? state.indexSyncTime : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["privateEndpoints"] = state ? state.privateEndpoints : undefined;
            resourceInputs["region"] = state ? state.region : undefined;
            resourceInputs["reservedIpRanges"] = state ? state.reservedIpRanges : undefined;
        } else {
            const args = argsOrState as AiIndexEndpointDeployedIndexArgs | undefined;
            if ((!args || args.deployedIndexId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'deployedIndexId'");
            }
            if ((!args || args.index === undefined) && !opts.urn) {
                throw new Error("Missing required property 'index'");
            }
            if ((!args || args.indexEndpoint === undefined) && !opts.urn) {
                throw new Error("Missing required property 'indexEndpoint'");
            }
            resourceInputs["automaticResources"] = args ? args.automaticResources : undefined;
            resourceInputs["dedicatedResources"] = args ? args.dedicatedResources : undefined;
            resourceInputs["deployedIndexAuthConfig"] = args ? args.deployedIndexAuthConfig : undefined;
            resourceInputs["deployedIndexId"] = args ? args.deployedIndexId : undefined;
            resourceInputs["deploymentGroup"] = args ? args.deploymentGroup : undefined;
            resourceInputs["displayName"] = args ? args.displayName : undefined;
            resourceInputs["enableAccessLogging"] = args ? args.enableAccessLogging : undefined;
            resourceInputs["index"] = args ? args.index : undefined;
            resourceInputs["indexEndpoint"] = args ? args.indexEndpoint : undefined;
            resourceInputs["region"] = args ? args.region : undefined;
            resourceInputs["reservedIpRanges"] = args ? args.reservedIpRanges : undefined;
            resourceInputs["createTime"] = undefined /*out*/;
            resourceInputs["indexSyncTime"] = undefined /*out*/;
            resourceInputs["name"] = undefined /*out*/;
            resourceInputs["privateEndpoints"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AiIndexEndpointDeployedIndex.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AiIndexEndpointDeployedIndex resources.
 */
export interface AiIndexEndpointDeployedIndexState {
    /**
     * A description of resources that the DeployedIndex uses, which to large degree are decided by Vertex AI, and optionally allows only a modest additional configuration.
     * Structure is documented below.
     */
    automaticResources?: pulumi.Input<inputs.vertex.AiIndexEndpointDeployedIndexAutomaticResources>;
    /**
     * The timestamp of when the Index was created in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits.
     */
    createTime?: pulumi.Input<string>;
    /**
     * A description of resources that are dedicated to the DeployedIndex, and that need a higher degree of manual configuration. The field minReplicaCount must be set to a value strictly greater than 0, or else validation will fail. We don't provide SLA when minReplicaCount=1. If maxReplicaCount is not set, the default value is minReplicaCount. The max allowed replica count is 1000.
     * Available machine types for SMALL shard: e2-standard-2 and all machine types available for MEDIUM and LARGE shard.
     * Available machine types for MEDIUM shard: e2-standard-16 and all machine types available for LARGE shard.
     * Available machine types for LARGE shard: e2-highmem-16, n2d-standard-32.
     * n1-standard-16 and n1-standard-32 are still available, but we recommend e2-standard-16 and e2-highmem-16 for cost efficiency.
     * Structure is documented below.
     */
    dedicatedResources?: pulumi.Input<inputs.vertex.AiIndexEndpointDeployedIndexDedicatedResources>;
    /**
     * If set, the authentication is enabled for the private endpoint.
     * Structure is documented below.
     */
    deployedIndexAuthConfig?: pulumi.Input<inputs.vertex.AiIndexEndpointDeployedIndexDeployedIndexAuthConfig>;
    /**
     * The user specified ID of the DeployedIndex. The ID can be up to 128 characters long and must start with a letter and only contain letters, numbers, and underscores. The ID must be unique within the project it is created in.
     */
    deployedIndexId?: pulumi.Input<string>;
    /**
     * The deployment group can be no longer than 64 characters (eg: 'test', 'prod'). If not set, we will use the 'default' deployment group.
     * Creating deploymentGroups with reservedIpRanges is a recommended practice when the peered network has multiple peering ranges. This creates your deployments from predictable IP spaces for easier traffic administration. Also, one deploymentGroup (except 'default') can only be used with the same reservedIpRanges which means if the deploymentGroup has been used with reserved_ip_ranges: [a, b, c], using it with [a, b] or [d, e] is disallowed. [See the official documentation here](https://cloud.google.com/vertex-ai/docs/reference/rest/v1/projects.locations.indexEndpoints#DeployedIndex.FIELDS.deployment_group).
     * Note: we only support up to 5 deployment groups (not including 'default').
     */
    deploymentGroup?: pulumi.Input<string>;
    /**
     * The display name of the Index. The name can be up to 128 characters long and can consist of any UTF-8 characters.
     */
    displayName?: pulumi.Input<string>;
    /**
     * If true, private endpoint's access logs are sent to Cloud Logging.
     */
    enableAccessLogging?: pulumi.Input<boolean>;
    /**
     * The name of the Index this is the deployment of.
     */
    index?: pulumi.Input<string>;
    /**
     * Identifies the index endpoint. Must be in the format
     * 'projects/{{project}}/locations/{{region}}/indexEndpoints/{{indexEndpoint}}'
     */
    indexEndpoint?: pulumi.Input<string>;
    /**
     * The DeployedIndex may depend on various data on its original Index. Additionally when certain changes to the original Index are being done (e.g. when what the Index contains is being changed) the DeployedIndex may be asynchronously updated in the background to reflect these changes. If this timestamp's value is at least the [Index.update_time](https://cloud.google.com/vertex-ai/docs/reference/rest/v1/projects.locations.indexes#Index.FIELDS.update_time) of the original Index, it means that this DeployedIndex and the original Index are in sync. If this timestamp is older, then to see which updates this DeployedIndex already contains (and which it does not), one must [list](https://cloud.google.com/vertex-ai/docs/reference/rest/v1beta1/projects.locations.operations/list#google.longrunning.Operations.ListOperations) the operations that are running on the original Index. Only the successfully completed Operations with updateTime equal or before this sync time are contained in this DeployedIndex.
     * A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
     */
    indexSyncTime?: pulumi.Input<string>;
    /**
     * The name of the DeployedIndex resource.
     */
    name?: pulumi.Input<string>;
    /**
     * Provides paths for users to send requests directly to the deployed index services running on Cloud via private services access. This field is populated if [network](https://cloud.google.com/vertex-ai/docs/reference/rest/v1/projects.locations.indexEndpoints#IndexEndpoint.FIELDS.network) is configured.
     * Structure is documented below.
     */
    privateEndpoints?: pulumi.Input<pulumi.Input<inputs.vertex.AiIndexEndpointDeployedIndexPrivateEndpoint>[]>;
    /**
     * The region of the index endpoint deployment. eg us-central1
     */
    region?: pulumi.Input<string>;
    /**
     * A list of reserved ip ranges under the VPC network that can be used for this DeployedIndex.
     * If set, we will deploy the index within the provided ip ranges. Otherwise, the index might be deployed to any ip ranges under the provided VPC network.
     * The value should be the name of the address (https://cloud.google.com/compute/docs/reference/rest/v1/addresses) Example: ['vertex-ai-ip-range'].
     * For more information about subnets and network IP ranges, please see https://cloud.google.com/vpc/docs/subnets#manually_created_subnet_ip_ranges.
     */
    reservedIpRanges?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a AiIndexEndpointDeployedIndex resource.
 */
export interface AiIndexEndpointDeployedIndexArgs {
    /**
     * A description of resources that the DeployedIndex uses, which to large degree are decided by Vertex AI, and optionally allows only a modest additional configuration.
     * Structure is documented below.
     */
    automaticResources?: pulumi.Input<inputs.vertex.AiIndexEndpointDeployedIndexAutomaticResources>;
    /**
     * A description of resources that are dedicated to the DeployedIndex, and that need a higher degree of manual configuration. The field minReplicaCount must be set to a value strictly greater than 0, or else validation will fail. We don't provide SLA when minReplicaCount=1. If maxReplicaCount is not set, the default value is minReplicaCount. The max allowed replica count is 1000.
     * Available machine types for SMALL shard: e2-standard-2 and all machine types available for MEDIUM and LARGE shard.
     * Available machine types for MEDIUM shard: e2-standard-16 and all machine types available for LARGE shard.
     * Available machine types for LARGE shard: e2-highmem-16, n2d-standard-32.
     * n1-standard-16 and n1-standard-32 are still available, but we recommend e2-standard-16 and e2-highmem-16 for cost efficiency.
     * Structure is documented below.
     */
    dedicatedResources?: pulumi.Input<inputs.vertex.AiIndexEndpointDeployedIndexDedicatedResources>;
    /**
     * If set, the authentication is enabled for the private endpoint.
     * Structure is documented below.
     */
    deployedIndexAuthConfig?: pulumi.Input<inputs.vertex.AiIndexEndpointDeployedIndexDeployedIndexAuthConfig>;
    /**
     * The user specified ID of the DeployedIndex. The ID can be up to 128 characters long and must start with a letter and only contain letters, numbers, and underscores. The ID must be unique within the project it is created in.
     */
    deployedIndexId: pulumi.Input<string>;
    /**
     * The deployment group can be no longer than 64 characters (eg: 'test', 'prod'). If not set, we will use the 'default' deployment group.
     * Creating deploymentGroups with reservedIpRanges is a recommended practice when the peered network has multiple peering ranges. This creates your deployments from predictable IP spaces for easier traffic administration. Also, one deploymentGroup (except 'default') can only be used with the same reservedIpRanges which means if the deploymentGroup has been used with reserved_ip_ranges: [a, b, c], using it with [a, b] or [d, e] is disallowed. [See the official documentation here](https://cloud.google.com/vertex-ai/docs/reference/rest/v1/projects.locations.indexEndpoints#DeployedIndex.FIELDS.deployment_group).
     * Note: we only support up to 5 deployment groups (not including 'default').
     */
    deploymentGroup?: pulumi.Input<string>;
    /**
     * The display name of the Index. The name can be up to 128 characters long and can consist of any UTF-8 characters.
     */
    displayName?: pulumi.Input<string>;
    /**
     * If true, private endpoint's access logs are sent to Cloud Logging.
     */
    enableAccessLogging?: pulumi.Input<boolean>;
    /**
     * The name of the Index this is the deployment of.
     */
    index: pulumi.Input<string>;
    /**
     * Identifies the index endpoint. Must be in the format
     * 'projects/{{project}}/locations/{{region}}/indexEndpoints/{{indexEndpoint}}'
     */
    indexEndpoint: pulumi.Input<string>;
    /**
     * The region of the index endpoint deployment. eg us-central1
     */
    region?: pulumi.Input<string>;
    /**
     * A list of reserved ip ranges under the VPC network that can be used for this DeployedIndex.
     * If set, we will deploy the index within the provided ip ranges. Otherwise, the index might be deployed to any ip ranges under the provided VPC network.
     * The value should be the name of the address (https://cloud.google.com/compute/docs/reference/rest/v1/addresses) Example: ['vertex-ai-ip-range'].
     * For more information about subnets and network IP ranges, please see https://cloud.google.com/vpc/docs/subnets#manually_created_subnet_ip_ranges.
     */
    reservedIpRanges?: pulumi.Input<pulumi.Input<string>[]>;
}
