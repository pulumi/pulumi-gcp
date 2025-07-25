// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.vertex;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.vertex.AiIndexArgs;
import com.pulumi.gcp.vertex.inputs.AiIndexState;
import com.pulumi.gcp.vertex.outputs.AiIndexDeployedIndex;
import com.pulumi.gcp.vertex.outputs.AiIndexIndexStat;
import com.pulumi.gcp.vertex.outputs.AiIndexMetadata;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * A representation of a collection of database items organized in a way that allows for approximate nearest neighbor (a.k.a ANN) algorithms search.
 * 
 * To get more information about Index, see:
 * 
 * * [API documentation](https://cloud.google.com/vertex-ai/docs/reference/rest/v1/projects.locations.indexes/)
 * 
 * ## Example Usage
 * 
 * ### Vertex Ai Index
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.storage.Bucket;
 * import com.pulumi.gcp.storage.BucketArgs;
 * import com.pulumi.gcp.storage.BucketObject;
 * import com.pulumi.gcp.storage.BucketObjectArgs;
 * import com.pulumi.gcp.vertex.AiIndex;
 * import com.pulumi.gcp.vertex.AiIndexArgs;
 * import com.pulumi.gcp.vertex.inputs.AiIndexMetadataArgs;
 * import com.pulumi.gcp.vertex.inputs.AiIndexMetadataConfigArgs;
 * import com.pulumi.gcp.vertex.inputs.AiIndexMetadataConfigAlgorithmConfigArgs;
 * import com.pulumi.gcp.vertex.inputs.AiIndexMetadataConfigAlgorithmConfigTreeAhConfigArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var bucket = new Bucket("bucket", BucketArgs.builder()
 *             .name("vertex-ai-index-test")
 *             .location("us-central1")
 *             .uniformBucketLevelAccess(true)
 *             .build());
 * 
 *         // The sample data comes from the following link:
 *         // https://cloud.google.com/vertex-ai/docs/matching-engine/filtering#specify-namespaces-tokens
 *         var data = new BucketObject("data", BucketObjectArgs.builder()
 *             .name("contents/data.json")
 *             .bucket(bucket.name())
 *             .content("""
 * {"id": "42", "embedding": [0.5, 1.0], "restricts": [{"namespace": "class", "allow": ["cat", "pet"]},{"namespace": "category", "allow": ["feline"]}]}
 * {"id": "43", "embedding": [0.6, 1.0], "restricts": [{"namespace": "class", "allow": ["dog", "pet"]},{"namespace": "category", "allow": ["canine"]}]}
 *             """)
 *             .build());
 * 
 *         var index = new AiIndex("index", AiIndexArgs.builder()
 *             .labels(Map.of("foo", "bar"))
 *             .region("us-central1")
 *             .displayName("test-index")
 *             .description("index for test")
 *             .metadata(AiIndexMetadataArgs.builder()
 *                 .contentsDeltaUri(bucket.name().applyValue(_name -> String.format("gs://%s/contents", _name)))
 *                 .config(AiIndexMetadataConfigArgs.builder()
 *                     .dimensions(2)
 *                     .approximateNeighborsCount(150)
 *                     .shardSize("SHARD_SIZE_SMALL")
 *                     .distanceMeasureType("DOT_PRODUCT_DISTANCE")
 *                     .algorithmConfig(AiIndexMetadataConfigAlgorithmConfigArgs.builder()
 *                         .treeAhConfig(AiIndexMetadataConfigAlgorithmConfigTreeAhConfigArgs.builder()
 *                             .leafNodeEmbeddingCount(500)
 *                             .leafNodesToSearchPercent(7)
 *                             .build())
 *                         .build())
 *                     .build())
 *                 .build())
 *             .indexUpdateMethod("BATCH_UPDATE")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Vertex Ai Index Streaming
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.storage.Bucket;
 * import com.pulumi.gcp.storage.BucketArgs;
 * import com.pulumi.gcp.storage.BucketObject;
 * import com.pulumi.gcp.storage.BucketObjectArgs;
 * import com.pulumi.gcp.vertex.AiIndex;
 * import com.pulumi.gcp.vertex.AiIndexArgs;
 * import com.pulumi.gcp.vertex.inputs.AiIndexMetadataArgs;
 * import com.pulumi.gcp.vertex.inputs.AiIndexMetadataConfigArgs;
 * import com.pulumi.gcp.vertex.inputs.AiIndexMetadataConfigAlgorithmConfigArgs;
 * import com.pulumi.gcp.vertex.inputs.AiIndexMetadataConfigAlgorithmConfigBruteForceConfigArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var bucket = new Bucket("bucket", BucketArgs.builder()
 *             .name("vertex-ai-index-test")
 *             .location("us-central1")
 *             .uniformBucketLevelAccess(true)
 *             .build());
 * 
 *         // The sample data comes from the following link:
 *         // https://cloud.google.com/vertex-ai/docs/matching-engine/filtering#specify-namespaces-tokens
 *         var data = new BucketObject("data", BucketObjectArgs.builder()
 *             .name("contents/data.json")
 *             .bucket(bucket.name())
 *             .content("""
 * {"id": "42", "embedding": [0.5, 1.0], "restricts": [{"namespace": "class", "allow": ["cat", "pet"]},{"namespace": "category", "allow": ["feline"]}]}
 * {"id": "43", "embedding": [0.6, 1.0], "restricts": [{"namespace": "class", "allow": ["dog", "pet"]},{"namespace": "category", "allow": ["canine"]}]}
 *             """)
 *             .build());
 * 
 *         var index = new AiIndex("index", AiIndexArgs.builder()
 *             .labels(Map.of("foo", "bar"))
 *             .region("us-central1")
 *             .displayName("test-index")
 *             .description("index for test")
 *             .metadata(AiIndexMetadataArgs.builder()
 *                 .contentsDeltaUri(bucket.name().applyValue(_name -> String.format("gs://%s/contents", _name)))
 *                 .config(AiIndexMetadataConfigArgs.builder()
 *                     .dimensions(2)
 *                     .shardSize("SHARD_SIZE_LARGE")
 *                     .distanceMeasureType("COSINE_DISTANCE")
 *                     .featureNormType("UNIT_L2_NORM")
 *                     .algorithmConfig(AiIndexMetadataConfigAlgorithmConfigArgs.builder()
 *                         .bruteForceConfig(AiIndexMetadataConfigAlgorithmConfigBruteForceConfigArgs.builder()
 *                             .build())
 *                         .build())
 *                     .build())
 *                 .build())
 *             .indexUpdateMethod("STREAM_UPDATE")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Index can be imported using any of these accepted formats:
 * 
 * * `projects/{{project}}/locations/{{region}}/indexes/{{name}}`
 * 
 * * `{{project}}/{{region}}/{{name}}`
 * 
 * * `{{region}}/{{name}}`
 * 
 * * `{{name}}`
 * 
 * When using the `pulumi import` command, Index can be imported using one of the formats above. For example:
 * 
 * ```sh
 * $ pulumi import gcp:vertex/aiIndex:AiIndex default projects/{{project}}/locations/{{region}}/indexes/{{name}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:vertex/aiIndex:AiIndex default {{project}}/{{region}}/{{name}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:vertex/aiIndex:AiIndex default {{region}}/{{name}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:vertex/aiIndex:AiIndex default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:vertex/aiIndex:AiIndex")
public class AiIndex extends com.pulumi.resources.CustomResource {
    /**
     * The timestamp of when the Index was created in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional digits.
     * 
     */
    @Export(name="createTime", refs={String.class}, tree="[0]")
    private Output<String> createTime;

    /**
     * @return The timestamp of when the Index was created in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional digits.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * The pointers to DeployedIndexes created from this Index. An Index can be only deleted if all its DeployedIndexes had been undeployed first.
     * Structure is documented below.
     * 
     */
    @Export(name="deployedIndexes", refs={List.class,AiIndexDeployedIndex.class}, tree="[0,1]")
    private Output<List<AiIndexDeployedIndex>> deployedIndexes;

    /**
     * @return The pointers to DeployedIndexes created from this Index. An Index can be only deleted if all its DeployedIndexes had been undeployed first.
     * Structure is documented below.
     * 
     */
    public Output<List<AiIndexDeployedIndex>> deployedIndexes() {
        return this.deployedIndexes;
    }
    /**
     * The description of the Index.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the Index.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The display name of the Index. The name can be up to 128 characters long and can consist of any UTF-8 characters.
     * 
     */
    @Export(name="displayName", refs={String.class}, tree="[0]")
    private Output<String> displayName;

    /**
     * @return The display name of the Index. The name can be up to 128 characters long and can consist of any UTF-8 characters.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     * 
     */
    @Export(name="effectiveLabels", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> effectiveLabels;

    /**
     * @return All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     * 
     */
    public Output<Map<String,String>> effectiveLabels() {
        return this.effectiveLabels;
    }
    /**
     * Used to perform consistent read-modify-write updates.
     * 
     */
    @Export(name="etag", refs={String.class}, tree="[0]")
    private Output<String> etag;

    /**
     * @return Used to perform consistent read-modify-write updates.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * Stats of the index resource.
     * Structure is documented below.
     * 
     */
    @Export(name="indexStats", refs={List.class,AiIndexIndexStat.class}, tree="[0,1]")
    private Output<List<AiIndexIndexStat>> indexStats;

    /**
     * @return Stats of the index resource.
     * Structure is documented below.
     * 
     */
    public Output<List<AiIndexIndexStat>> indexStats() {
        return this.indexStats;
    }
    /**
     * The update method to use with this Index. The value must be the followings. If not set, BATCH_UPDATE will be used by default.
     * * BATCH_UPDATE: user can call indexes.patch with files on Cloud Storage of datapoints to update.
     * * STREAM_UPDATE: user can call indexes.upsertDatapoints/DeleteDatapoints to update the Index and the updates will be applied in corresponding DeployedIndexes in nearly real-time.
     * 
     */
    @Export(name="indexUpdateMethod", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> indexUpdateMethod;

    /**
     * @return The update method to use with this Index. The value must be the followings. If not set, BATCH_UPDATE will be used by default.
     * * BATCH_UPDATE: user can call indexes.patch with files on Cloud Storage of datapoints to update.
     * * STREAM_UPDATE: user can call indexes.upsertDatapoints/DeleteDatapoints to update the Index and the updates will be applied in corresponding DeployedIndexes in nearly real-time.
     * 
     */
    public Output<Optional<String>> indexUpdateMethod() {
        return Codegen.optional(this.indexUpdateMethod);
    }
    /**
     * The labels with user-defined metadata to organize your Indexes.
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    @Export(name="labels", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return The labels with user-defined metadata to organize your Indexes.
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> labels() {
        return Codegen.optional(this.labels);
    }
    /**
     * An additional information about the Index
     * Structure is documented below.
     * 
     */
    @Export(name="metadata", refs={AiIndexMetadata.class}, tree="[0]")
    private Output</* @Nullable */ AiIndexMetadata> metadata;

    /**
     * @return An additional information about the Index
     * Structure is documented below.
     * 
     */
    public Output<Optional<AiIndexMetadata>> metadata() {
        return Codegen.optional(this.metadata);
    }
    /**
     * Points to a YAML file stored on Google Cloud Storage describing additional information about the Index, that is specific to it. Unset if the Index does not have any additional information.
     * 
     */
    @Export(name="metadataSchemaUri", refs={String.class}, tree="[0]")
    private Output<String> metadataSchemaUri;

    /**
     * @return Points to a YAML file stored on Google Cloud Storage describing additional information about the Index, that is specific to it. Unset if the Index does not have any additional information.
     * 
     */
    public Output<String> metadataSchemaUri() {
        return this.metadataSchemaUri;
    }
    /**
     * The resource name of the Index.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The resource name of the Index.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Export(name="project", refs={String.class}, tree="[0]")
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * The combination of labels configured directly on the resource
     * and default labels configured on the provider.
     * 
     */
    @Export(name="pulumiLabels", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> pulumiLabels;

    /**
     * @return The combination of labels configured directly on the resource
     * and default labels configured on the provider.
     * 
     */
    public Output<Map<String,String>> pulumiLabels() {
        return this.pulumiLabels;
    }
    /**
     * The region of the index. eg us-central1
     * 
     */
    @Export(name="region", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> region;

    /**
     * @return The region of the index. eg us-central1
     * 
     */
    public Output<Optional<String>> region() {
        return Codegen.optional(this.region);
    }
    /**
     * The timestamp of when the Index was last updated in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional digits.
     * 
     */
    @Export(name="updateTime", refs={String.class}, tree="[0]")
    private Output<String> updateTime;

    /**
     * @return The timestamp of when the Index was last updated in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional digits.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AiIndex(java.lang.String name) {
        this(name, AiIndexArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AiIndex(java.lang.String name, AiIndexArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AiIndex(java.lang.String name, AiIndexArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:vertex/aiIndex:AiIndex", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private AiIndex(java.lang.String name, Output<java.lang.String> id, @Nullable AiIndexState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:vertex/aiIndex:AiIndex", name, state, makeResourceOptions(options, id), false);
    }

    private static AiIndexArgs makeArgs(AiIndexArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? AiIndexArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "effectiveLabels",
                "pulumiLabels"
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static AiIndex get(java.lang.String name, Output<java.lang.String> id, @Nullable AiIndexState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AiIndex(name, id, state, options);
    }
}
