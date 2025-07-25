// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.healthcare;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.healthcare.DicomStoreArgs;
import com.pulumi.gcp.healthcare.inputs.DicomStoreState;
import com.pulumi.gcp.healthcare.outputs.DicomStoreNotificationConfig;
import com.pulumi.gcp.healthcare.outputs.DicomStoreStreamConfig;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * A DicomStore is a datastore inside a Healthcare dataset that conforms to the DICOM
 * (https://www.dicomstandard.org/about/) standard for Healthcare information exchange
 * 
 * To get more information about DicomStore, see:
 * 
 * * [API documentation](https://cloud.google.com/healthcare/docs/reference/rest/v1/projects.locations.datasets.dicomStores)
 * * How-to Guides
 *     * [Creating a DICOM store](https://cloud.google.com/healthcare/docs/how-tos/dicom)
 * 
 * ## Example Usage
 * 
 * ### Healthcare Dicom Store Basic
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.pubsub.Topic;
 * import com.pulumi.gcp.pubsub.TopicArgs;
 * import com.pulumi.gcp.healthcare.Dataset;
 * import com.pulumi.gcp.healthcare.DatasetArgs;
 * import com.pulumi.gcp.healthcare.DicomStore;
 * import com.pulumi.gcp.healthcare.DicomStoreArgs;
 * import com.pulumi.gcp.healthcare.inputs.DicomStoreNotificationConfigArgs;
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
 *         var topic = new Topic("topic", TopicArgs.builder()
 *             .name("dicom-notifications")
 *             .build());
 * 
 *         var dataset = new Dataset("dataset", DatasetArgs.builder()
 *             .name("example-dataset")
 *             .location("us-central1")
 *             .build());
 * 
 *         var default_ = new DicomStore("default", DicomStoreArgs.builder()
 *             .name("example-dicom-store")
 *             .dataset(dataset.id())
 *             .notificationConfig(DicomStoreNotificationConfigArgs.builder()
 *                 .pubsubTopic(topic.id())
 *                 .build())
 *             .labels(Map.of("label1", "labelvalue1"))
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Healthcare Dicom Store Bq Stream
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.pubsub.Topic;
 * import com.pulumi.gcp.pubsub.TopicArgs;
 * import com.pulumi.gcp.bigquery.Table;
 * import com.pulumi.gcp.bigquery.TableArgs;
 * import com.pulumi.gcp.healthcare.DicomStore;
 * import com.pulumi.gcp.healthcare.DicomStoreArgs;
 * import com.pulumi.gcp.healthcare.inputs.DicomStoreNotificationConfigArgs;
 * import com.pulumi.gcp.healthcare.inputs.DicomStoreStreamConfigArgs;
 * import com.pulumi.gcp.healthcare.inputs.DicomStoreStreamConfigBigqueryDestinationArgs;
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
 *         var topic = new Topic("topic", TopicArgs.builder()
 *             .name("dicom-notifications")
 *             .build());
 * 
 *         var dataset = new com.pulumi.gcp.healthcare.Dataset("dataset", com.pulumi.gcp.healthcare.DatasetArgs.builder()
 *             .name("example-dataset")
 *             .location("us-central1")
 *             .build());
 * 
 *         var bqDataset = new com.pulumi.gcp.bigquery.Dataset("bqDataset", com.pulumi.gcp.bigquery.DatasetArgs.builder()
 *             .datasetId("dicom_bq_ds")
 *             .friendlyName("test")
 *             .description("This is a test description")
 *             .location("US")
 *             .deleteContentsOnDestroy(true)
 *             .build());
 * 
 *         var bqTable = new Table("bqTable", TableArgs.builder()
 *             .deletionProtection(false)
 *             .datasetId(bqDataset.datasetId())
 *             .tableId("dicom_bq_tb")
 *             .build());
 * 
 *         var default_ = new DicomStore("default", DicomStoreArgs.builder()
 *             .name("example-dicom-store")
 *             .dataset(dataset.id())
 *             .notificationConfig(DicomStoreNotificationConfigArgs.builder()
 *                 .pubsubTopic(topic.id())
 *                 .sendForBulkImport(true)
 *                 .build())
 *             .labels(Map.of("label1", "labelvalue1"))
 *             .streamConfigs(DicomStoreStreamConfigArgs.builder()
 *                 .bigqueryDestination(DicomStoreStreamConfigBigqueryDestinationArgs.builder()
 *                     .tableUri(Output.tuple(bqDataset.project(), bqDataset.datasetId(), bqTable.tableId()).applyValue(values -> {
 *                         var project = values.t1;
 *                         var datasetId = values.t2;
 *                         var tableId = values.t3;
 *                         return String.format("bq://%s.%s.%s", project,datasetId,tableId);
 *                     }))
 *                     .build())
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
 * DicomStore can be imported using any of these accepted formats:
 * 
 * * `{{dataset}}/dicomStores/{{name}}`
 * 
 * * `{{dataset}}/{{name}}`
 * 
 * When using the `pulumi import` command, DicomStore can be imported using one of the formats above. For example:
 * 
 * ```sh
 * $ pulumi import gcp:healthcare/dicomStore:DicomStore default {{dataset}}/dicomStores/{{name}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:healthcare/dicomStore:DicomStore default {{dataset}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:healthcare/dicomStore:DicomStore")
public class DicomStore extends com.pulumi.resources.CustomResource {
    /**
     * Identifies the dataset addressed by this request. Must be in the format
     * &#39;projects/{project}/locations/{location}/datasets/{dataset}&#39;
     * 
     */
    @Export(name="dataset", refs={String.class}, tree="[0]")
    private Output<String> dataset;

    /**
     * @return Identifies the dataset addressed by this request. Must be in the format
     * &#39;projects/{project}/locations/{location}/datasets/{dataset}&#39;
     * 
     */
    public Output<String> dataset() {
        return this.dataset;
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
     * User-supplied key-value pairs used to organize DICOM stores.
     * Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must
     * conform to the following PCRE regular expression: [\p{Ll}\p{Lo}][\p{Ll}\p{Lo}\p{N}_-]{0,62}
     * Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128
     * bytes, and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63}
     * No more than 64 labels can be associated with a given store.
     * An object containing a list of &#34;key&#34;: value pairs.
     * Example: { &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }.
     * 
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    @Export(name="labels", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return User-supplied key-value pairs used to organize DICOM stores.
     * Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must
     * conform to the following PCRE regular expression: [\p{Ll}\p{Lo}][\p{Ll}\p{Lo}\p{N}_-]{0,62}
     * Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128
     * bytes, and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63}
     * No more than 64 labels can be associated with a given store.
     * An object containing a list of &#34;key&#34;: value pairs.
     * Example: { &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }.
     * 
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> labels() {
        return Codegen.optional(this.labels);
    }
    /**
     * The resource name for the DicomStore.
     * ** Changing this property may recreate the Dicom store (removing all data) **
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The resource name for the DicomStore.
     * ** Changing this property may recreate the Dicom store (removing all data) **
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A nested object resource.
     * Structure is documented below.
     * 
     */
    @Export(name="notificationConfig", refs={DicomStoreNotificationConfig.class}, tree="[0]")
    private Output</* @Nullable */ DicomStoreNotificationConfig> notificationConfig;

    /**
     * @return A nested object resource.
     * Structure is documented below.
     * 
     */
    public Output<Optional<DicomStoreNotificationConfig>> notificationConfig() {
        return Codegen.optional(this.notificationConfig);
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
     * The fully qualified name of this dataset
     * 
     */
    @Export(name="selfLink", refs={String.class}, tree="[0]")
    private Output<String> selfLink;

    /**
     * @return The fully qualified name of this dataset
     * 
     */
    public Output<String> selfLink() {
        return this.selfLink;
    }
    /**
     * To enable streaming to BigQuery, configure the streamConfigs object in your DICOM store.
     * streamConfigs is an array, so you can specify multiple BigQuery destinations. You can stream metadata from a single DICOM store to up to five BigQuery tables in a BigQuery dataset.
     * Structure is documented below.
     * 
     */
    @Export(name="streamConfigs", refs={List.class,DicomStoreStreamConfig.class}, tree="[0,1]")
    private Output</* @Nullable */ List<DicomStoreStreamConfig>> streamConfigs;

    /**
     * @return To enable streaming to BigQuery, configure the streamConfigs object in your DICOM store.
     * streamConfigs is an array, so you can specify multiple BigQuery destinations. You can stream metadata from a single DICOM store to up to five BigQuery tables in a BigQuery dataset.
     * Structure is documented below.
     * 
     */
    public Output<Optional<List<DicomStoreStreamConfig>>> streamConfigs() {
        return Codegen.optional(this.streamConfigs);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DicomStore(java.lang.String name) {
        this(name, DicomStoreArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DicomStore(java.lang.String name, DicomStoreArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DicomStore(java.lang.String name, DicomStoreArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:healthcare/dicomStore:DicomStore", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private DicomStore(java.lang.String name, Output<java.lang.String> id, @Nullable DicomStoreState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:healthcare/dicomStore:DicomStore", name, state, makeResourceOptions(options, id), false);
    }

    private static DicomStoreArgs makeArgs(DicomStoreArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? DicomStoreArgs.Empty : args;
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
    public static DicomStore get(java.lang.String name, Output<java.lang.String> id, @Nullable DicomStoreState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DicomStore(name, id, state, options);
    }
}
