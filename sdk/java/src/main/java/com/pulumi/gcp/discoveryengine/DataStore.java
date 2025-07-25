// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.discoveryengine;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.discoveryengine.DataStoreArgs;
import com.pulumi.gcp.discoveryengine.inputs.DataStoreState;
import com.pulumi.gcp.discoveryengine.outputs.DataStoreAdvancedSiteSearchConfig;
import com.pulumi.gcp.discoveryengine.outputs.DataStoreDocumentProcessingConfig;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Data store is a collection of websites and documents used to find answers for
 * end-user&#39;s questions in Discovery Engine (a.k.a. Vertex AI Search and
 * Conversation).
 * 
 * To get more information about DataStore, see:
 * 
 * * [API documentation](https://cloud.google.com/generative-ai-app-builder/docs/reference/rest/v1/projects.locations.collections.dataStores)
 * * How-to Guides
 *     * [Create a search data store](https://cloud.google.com/generative-ai-app-builder/docs/create-data-store-es)
 * 
 * ## Example Usage
 * 
 * ### Discoveryengine Datastore Basic
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.discoveryengine.DataStore;
 * import com.pulumi.gcp.discoveryengine.DataStoreArgs;
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
 *         var basic = new DataStore("basic", DataStoreArgs.builder()
 *             .location("global")
 *             .dataStoreId("data-store-id")
 *             .displayName("tf-test-structured-datastore")
 *             .industryVertical("GENERIC")
 *             .contentConfig("NO_CONTENT")
 *             .solutionTypes("SOLUTION_TYPE_SEARCH")
 *             .createAdvancedSiteSearch(false)
 *             .skipDefaultSchemaCreation(false)
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Discoveryengine Datastore Kms Key Name
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.discoveryengine.DataStore;
 * import com.pulumi.gcp.discoveryengine.DataStoreArgs;
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
 *         var kmsKeyName = new DataStore("kmsKeyName", DataStoreArgs.builder()
 *             .location("us")
 *             .dataStoreId("data-store-id")
 *             .displayName("tf-test-structured-datastore")
 *             .industryVertical("GENERIC")
 *             .contentConfig("NO_CONTENT")
 *             .solutionTypes("SOLUTION_TYPE_SEARCH")
 *             .kmsKeyName("kms-key")
 *             .createAdvancedSiteSearch(false)
 *             .skipDefaultSchemaCreation(false)
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Discoveryengine Datastore Document Processing Config
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.discoveryengine.DataStore;
 * import com.pulumi.gcp.discoveryengine.DataStoreArgs;
 * import com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigArgs;
 * import com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigDefaultParsingConfigArgs;
 * import com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigDefaultParsingConfigDigitalParsingConfigArgs;
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
 *         var documentProcessingConfig = new DataStore("documentProcessingConfig", DataStoreArgs.builder()
 *             .location("global")
 *             .dataStoreId("data-store-id")
 *             .displayName("tf-test-structured-datastore")
 *             .industryVertical("GENERIC")
 *             .contentConfig("NO_CONTENT")
 *             .solutionTypes("SOLUTION_TYPE_SEARCH")
 *             .createAdvancedSiteSearch(false)
 *             .documentProcessingConfig(DataStoreDocumentProcessingConfigArgs.builder()
 *                 .defaultParsingConfig(DataStoreDocumentProcessingConfigDefaultParsingConfigArgs.builder()
 *                     .digitalParsingConfig(DataStoreDocumentProcessingConfigDefaultParsingConfigDigitalParsingConfigArgs.builder()
 *                         .build())
 *                     .build())
 *                 .parsingConfigOverrides(DataStoreDocumentProcessingConfigParsingConfigOverrideArgs.builder()
 *                     .fileType("pdf")
 *                     .ocrParsingConfig(DataStoreDocumentProcessingConfigParsingConfigOverrideOcrParsingConfigArgs.builder()
 *                         .useNativeText(true)
 *                         .build())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Discoveryengine Datastore Advanced Site Search Config
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.discoveryengine.DataStore;
 * import com.pulumi.gcp.discoveryengine.DataStoreArgs;
 * import com.pulumi.gcp.discoveryengine.inputs.DataStoreAdvancedSiteSearchConfigArgs;
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
 *         var advancedSiteSearchConfig = new DataStore("advancedSiteSearchConfig", DataStoreArgs.builder()
 *             .location("global")
 *             .dataStoreId("data-store-id")
 *             .displayName("tf-test-advanced-site-search-config-datastore")
 *             .industryVertical("GENERIC")
 *             .contentConfig("PUBLIC_WEBSITE")
 *             .solutionTypes("SOLUTION_TYPE_CHAT")
 *             .createAdvancedSiteSearch(true)
 *             .skipDefaultSchemaCreation(false)
 *             .advancedSiteSearchConfig(DataStoreAdvancedSiteSearchConfigArgs.builder()
 *                 .disableInitialIndex(true)
 *                 .disableAutomaticRefresh(true)
 *                 .build())
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
 * DataStore can be imported using any of these accepted formats:
 * 
 * * `projects/{{project}}/locations/{{location}}/collections/default_collection/dataStores/{{data_store_id}}`
 * 
 * * `{{project}}/{{location}}/{{data_store_id}}`
 * 
 * * `{{location}}/{{data_store_id}}`
 * 
 * When using the `pulumi import` command, DataStore can be imported using one of the formats above. For example:
 * 
 * ```sh
 * $ pulumi import gcp:discoveryengine/dataStore:DataStore default projects/{{project}}/locations/{{location}}/collections/default_collection/dataStores/{{data_store_id}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:discoveryengine/dataStore:DataStore default {{project}}/{{location}}/{{data_store_id}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:discoveryengine/dataStore:DataStore default {{location}}/{{data_store_id}}
 * ```
 * 
 */
@ResourceType(type="gcp:discoveryengine/dataStore:DataStore")
public class DataStore extends com.pulumi.resources.CustomResource {
    /**
     * Configuration data for advance site search.
     * Structure is documented below.
     * 
     */
    @Export(name="advancedSiteSearchConfig", refs={DataStoreAdvancedSiteSearchConfig.class}, tree="[0]")
    private Output</* @Nullable */ DataStoreAdvancedSiteSearchConfig> advancedSiteSearchConfig;

    /**
     * @return Configuration data for advance site search.
     * Structure is documented below.
     * 
     */
    public Output<Optional<DataStoreAdvancedSiteSearchConfig>> advancedSiteSearchConfig() {
        return Codegen.optional(this.advancedSiteSearchConfig);
    }
    /**
     * The content config of the data store.
     * Possible values are: `NO_CONTENT`, `CONTENT_REQUIRED`, `PUBLIC_WEBSITE`.
     * 
     */
    @Export(name="contentConfig", refs={String.class}, tree="[0]")
    private Output<String> contentConfig;

    /**
     * @return The content config of the data store.
     * Possible values are: `NO_CONTENT`, `CONTENT_REQUIRED`, `PUBLIC_WEBSITE`.
     * 
     */
    public Output<String> contentConfig() {
        return this.contentConfig;
    }
    /**
     * If true, an advanced data store for site search will be created. If the
     * data store is not configured as site search (GENERIC vertical and
     * PUBLIC_WEBSITE contentConfig), this flag will be ignored.
     * 
     */
    @Export(name="createAdvancedSiteSearch", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> createAdvancedSiteSearch;

    /**
     * @return If true, an advanced data store for site search will be created. If the
     * data store is not configured as site search (GENERIC vertical and
     * PUBLIC_WEBSITE contentConfig), this flag will be ignored.
     * 
     */
    public Output<Optional<Boolean>> createAdvancedSiteSearch() {
        return Codegen.optional(this.createAdvancedSiteSearch);
    }
    /**
     * Timestamp when the DataStore was created.
     * 
     */
    @Export(name="createTime", refs={String.class}, tree="[0]")
    private Output<String> createTime;

    /**
     * @return Timestamp when the DataStore was created.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * The unique id of the data store.
     * 
     */
    @Export(name="dataStoreId", refs={String.class}, tree="[0]")
    private Output<String> dataStoreId;

    /**
     * @return The unique id of the data store.
     * 
     */
    public Output<String> dataStoreId() {
        return this.dataStoreId;
    }
    /**
     * The id of the default Schema associated with this data store.
     * 
     */
    @Export(name="defaultSchemaId", refs={String.class}, tree="[0]")
    private Output<String> defaultSchemaId;

    /**
     * @return The id of the default Schema associated with this data store.
     * 
     */
    public Output<String> defaultSchemaId() {
        return this.defaultSchemaId;
    }
    /**
     * The display name of the data store. This field must be a UTF-8 encoded
     * string with a length limit of 128 characters.
     * 
     */
    @Export(name="displayName", refs={String.class}, tree="[0]")
    private Output<String> displayName;

    /**
     * @return The display name of the data store. This field must be a UTF-8 encoded
     * string with a length limit of 128 characters.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * Configuration for Document understanding and enrichment.
     * Structure is documented below.
     * 
     */
    @Export(name="documentProcessingConfig", refs={DataStoreDocumentProcessingConfig.class}, tree="[0]")
    private Output</* @Nullable */ DataStoreDocumentProcessingConfig> documentProcessingConfig;

    /**
     * @return Configuration for Document understanding and enrichment.
     * Structure is documented below.
     * 
     */
    public Output<Optional<DataStoreDocumentProcessingConfig>> documentProcessingConfig() {
        return Codegen.optional(this.documentProcessingConfig);
    }
    /**
     * The industry vertical that the data store registers.
     * Possible values are: `GENERIC`, `MEDIA`, `HEALTHCARE_FHIR`.
     * 
     */
    @Export(name="industryVertical", refs={String.class}, tree="[0]")
    private Output<String> industryVertical;

    /**
     * @return The industry vertical that the data store registers.
     * Possible values are: `GENERIC`, `MEDIA`, `HEALTHCARE_FHIR`.
     * 
     */
    public Output<String> industryVertical() {
        return this.industryVertical;
    }
    /**
     * KMS key resource name which will be used to encrypt resources:
     * `/{project}/locations/{location}/keyRings/{keyRing}/cryptoKeys/{keyId}`
     * The KMS key to be used to protect this DataStore at creation time. Must be
     * set for requests that need to comply with CMEK Org Policy protections.
     * If this field is set and processed successfully, the DataStore will be
     * protected by the KMS key, as indicated in the cmek_config field.
     * 
     */
    @Export(name="kmsKeyName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> kmsKeyName;

    /**
     * @return KMS key resource name which will be used to encrypt resources:
     * `/{project}/locations/{location}/keyRings/{keyRing}/cryptoKeys/{keyId}`
     * The KMS key to be used to protect this DataStore at creation time. Must be
     * set for requests that need to comply with CMEK Org Policy protections.
     * If this field is set and processed successfully, the DataStore will be
     * protected by the KMS key, as indicated in the cmek_config field.
     * 
     */
    public Output<Optional<String>> kmsKeyName() {
        return Codegen.optional(this.kmsKeyName);
    }
    /**
     * The geographic location where the data store should reside. The value can
     * only be one of &#34;global&#34;, &#34;us&#34; and &#34;eu&#34;.
     * 
     */
    @Export(name="location", refs={String.class}, tree="[0]")
    private Output<String> location;

    /**
     * @return The geographic location where the data store should reside. The value can
     * only be one of &#34;global&#34;, &#34;us&#34; and &#34;eu&#34;.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The unique full resource name of the data store. Values are of the format
     * `projects/{project}/locations/{location}/collections/{collection_id}/dataStores/{data_store_id}`.
     * This field must be a UTF-8 encoded string with a length limit of 1024
     * characters.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The unique full resource name of the data store. Values are of the format
     * `projects/{project}/locations/{location}/collections/{collection_id}/dataStores/{data_store_id}`.
     * This field must be a UTF-8 encoded string with a length limit of 1024
     * characters.
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
     * A boolean flag indicating whether to skip the default schema creation for
     * the data store. Only enable this flag if you are certain that the default
     * schema is incompatible with your use case.
     * If set to true, you must manually create a schema for the data store
     * before any documents can be ingested.
     * This flag cannot be specified if `data_store.starting_schema` is
     * specified.
     * 
     */
    @Export(name="skipDefaultSchemaCreation", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> skipDefaultSchemaCreation;

    /**
     * @return A boolean flag indicating whether to skip the default schema creation for
     * the data store. Only enable this flag if you are certain that the default
     * schema is incompatible with your use case.
     * If set to true, you must manually create a schema for the data store
     * before any documents can be ingested.
     * This flag cannot be specified if `data_store.starting_schema` is
     * specified.
     * 
     */
    public Output<Optional<Boolean>> skipDefaultSchemaCreation() {
        return Codegen.optional(this.skipDefaultSchemaCreation);
    }
    /**
     * The solutions that the data store enrolls.
     * Each value may be one of: `SOLUTION_TYPE_RECOMMENDATION`, `SOLUTION_TYPE_SEARCH`, `SOLUTION_TYPE_CHAT`, `SOLUTION_TYPE_GENERATIVE_CHAT`.
     * 
     */
    @Export(name="solutionTypes", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> solutionTypes;

    /**
     * @return The solutions that the data store enrolls.
     * Each value may be one of: `SOLUTION_TYPE_RECOMMENDATION`, `SOLUTION_TYPE_SEARCH`, `SOLUTION_TYPE_CHAT`, `SOLUTION_TYPE_GENERATIVE_CHAT`.
     * 
     */
    public Output<Optional<List<String>>> solutionTypes() {
        return Codegen.optional(this.solutionTypes);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DataStore(java.lang.String name) {
        this(name, DataStoreArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DataStore(java.lang.String name, DataStoreArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DataStore(java.lang.String name, DataStoreArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:discoveryengine/dataStore:DataStore", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private DataStore(java.lang.String name, Output<java.lang.String> id, @Nullable DataStoreState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:discoveryengine/dataStore:DataStore", name, state, makeResourceOptions(options, id), false);
    }

    private static DataStoreArgs makeArgs(DataStoreArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? DataStoreArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static DataStore get(java.lang.String name, Output<java.lang.String> id, @Nullable DataStoreState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DataStore(name, id, state, options);
    }
}
