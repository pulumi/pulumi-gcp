// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.biglake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.biglake.TableArgs;
import com.pulumi.gcp.biglake.inputs.TableState;
import com.pulumi.gcp.biglake.outputs.TableHiveOptions;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Represents a table.
 * 
 * To get more information about Table, see:
 * 
 * * [API documentation](https://cloud.google.com/bigquery/docs/reference/biglake/rest/v1/projects.locations.catalogs.databases.tables)
 * * How-to Guides
 *     * [Manage open source metadata with BigLake Metastore](https://cloud.google.com/bigquery/docs/manage-open-source-metadata#create_tables)
 * 
 * ## Example Usage
 * 
 * ### Biglake Table
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.biglake.Catalog;
 * import com.pulumi.gcp.biglake.CatalogArgs;
 * import com.pulumi.gcp.storage.Bucket;
 * import com.pulumi.gcp.storage.BucketArgs;
 * import com.pulumi.gcp.storage.BucketObject;
 * import com.pulumi.gcp.storage.BucketObjectArgs;
 * import com.pulumi.gcp.biglake.Database;
 * import com.pulumi.gcp.biglake.DatabaseArgs;
 * import com.pulumi.gcp.biglake.inputs.DatabaseHiveOptionsArgs;
 * import com.pulumi.gcp.biglake.Table;
 * import com.pulumi.gcp.biglake.TableArgs;
 * import com.pulumi.gcp.biglake.inputs.TableHiveOptionsArgs;
 * import com.pulumi.gcp.biglake.inputs.TableHiveOptionsStorageDescriptorArgs;
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
 *         var catalog = new Catalog("catalog", CatalogArgs.builder()
 *             .name("my_catalog")
 *             .location("US")
 *             .build());
 * 
 *         var bucket = new Bucket("bucket", BucketArgs.builder()
 *             .name("my_bucket")
 *             .location("US")
 *             .forceDestroy(true)
 *             .uniformBucketLevelAccess(true)
 *             .build());
 * 
 *         var metadataFolder = new BucketObject("metadataFolder", BucketObjectArgs.builder()
 *             .name("metadata/")
 *             .content(" ")
 *             .bucket(bucket.name())
 *             .build());
 * 
 *         var dataFolder = new BucketObject("dataFolder", BucketObjectArgs.builder()
 *             .name("data/")
 *             .content(" ")
 *             .bucket(bucket.name())
 *             .build());
 * 
 *         var database = new Database("database", DatabaseArgs.builder()
 *             .name("my_database")
 *             .catalog(catalog.id())
 *             .type("HIVE")
 *             .hiveOptions(DatabaseHiveOptionsArgs.builder()
 *                 .locationUri(Output.tuple(bucket.name(), metadataFolder.name()).applyValue(values -> {
 *                     var bucketName = values.t1;
 *                     var metadataFolderName = values.t2;
 *                     return String.format("gs://%s/%s", bucketName,metadataFolderName);
 *                 }))
 *                 .parameters(Map.of("owner", "Alex"))
 *                 .build())
 *             .build());
 * 
 *         var table = new Table("table", TableArgs.builder()
 *             .name("my_table")
 *             .database(database.id())
 *             .type("HIVE")
 *             .hiveOptions(TableHiveOptionsArgs.builder()
 *                 .tableType("MANAGED_TABLE")
 *                 .storageDescriptor(TableHiveOptionsStorageDescriptorArgs.builder()
 *                     .locationUri(Output.tuple(bucket.name(), dataFolder.name()).applyValue(values -> {
 *                         var bucketName = values.t1;
 *                         var dataFolderName = values.t2;
 *                         return String.format("gs://%s/%s", bucketName,dataFolderName);
 *                     }))
 *                     .inputFormat("org.apache.hadoop.mapred.SequenceFileInputFormat")
 *                     .outputFormat("org.apache.hadoop.hive.ql.io.HiveSequenceFileOutputFormat")
 *                     .build())
 *                 .parameters(Map.ofEntries(
 *                     Map.entry("spark.sql.create.version", "3.1.3"),
 *                     Map.entry("spark.sql.sources.schema.numParts", "1"),
 *                     Map.entry("transient_lastDdlTime", "1680894197"),
 *                     Map.entry("spark.sql.partitionProvider", "catalog"),
 *                     Map.entry("owner", "John Doe"),
 *                     Map.entry("spark.sql.sources.schema.part.0", "{\"type\":\"struct\",\"fields\":[{\"name\":\"id\",\"type\":\"integer\",\"nullable\":true,\"metadata\":{}},{\"name\":\"name\",\"type\":\"string\",\"nullable\":true,\"metadata\":{}},{\"name\":\"age\",\"type\":\"integer\",\"nullable\":true,\"metadata\":{}}]}"),
 *                     Map.entry("spark.sql.sources.provider", "iceberg"),
 *                     Map.entry("provider", "iceberg")
 *                 ))
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
 * Table can be imported using any of these accepted formats:
 * 
 * * `{{database}}/tables/{{name}}`
 * 
 * When using the `pulumi import` command, Table can be imported using one of the formats above. For example:
 * 
 * ```sh
 * $ pulumi import gcp:biglake/table:Table default {{database}}/tables/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:biglake/table:Table")
public class Table extends com.pulumi.resources.CustomResource {
    /**
     * Output only. The creation time of the table. A timestamp in RFC3339 UTC
     * &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional
     * digits. Examples: &#34;2014-10-02T15:01:23Z&#34; and
     * &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    @Export(name="createTime", refs={String.class}, tree="[0]")
    private Output<String> createTime;

    /**
     * @return Output only. The creation time of the table. A timestamp in RFC3339 UTC
     * &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional
     * digits. Examples: &#34;2014-10-02T15:01:23Z&#34; and
     * &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * The id of the parent database.
     * 
     */
    @Export(name="database", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> database;

    /**
     * @return The id of the parent database.
     * 
     */
    public Output<Optional<String>> database() {
        return Codegen.optional(this.database);
    }
    /**
     * Output only. The deletion time of the table. Only set after the
     * table is deleted. A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with
     * nanosecond resolution and up to nine fractional digits. Examples:
     * &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    @Export(name="deleteTime", refs={String.class}, tree="[0]")
    private Output<String> deleteTime;

    /**
     * @return Output only. The deletion time of the table. Only set after the
     * table is deleted. A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with
     * nanosecond resolution and up to nine fractional digits. Examples:
     * &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    public Output<String> deleteTime() {
        return this.deleteTime;
    }
    /**
     * The checksum of a table object computed by the server based on the value
     * of other fields. It may be sent on update requests to ensure the client
     * has an up-to-date value before proceeding. It is only checked for update
     * table operations.
     * 
     */
    @Export(name="etag", refs={String.class}, tree="[0]")
    private Output<String> etag;

    /**
     * @return The checksum of a table object computed by the server based on the value
     * of other fields. It may be sent on update requests to ensure the client
     * has an up-to-date value before proceeding. It is only checked for update
     * table operations.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * Output only. The time when this table is considered expired. Only set
     * after the table is deleted. A timestamp in RFC3339 UTC &#34;Zulu&#34; format,
     * with nanosecond resolution and up to nine fractional digits. Examples:
     * &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    @Export(name="expireTime", refs={String.class}, tree="[0]")
    private Output<String> expireTime;

    /**
     * @return Output only. The time when this table is considered expired. Only set
     * after the table is deleted. A timestamp in RFC3339 UTC &#34;Zulu&#34; format,
     * with nanosecond resolution and up to nine fractional digits. Examples:
     * &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    public Output<String> expireTime() {
        return this.expireTime;
    }
    /**
     * Options of a Hive table.
     * Structure is documented below.
     * 
     */
    @Export(name="hiveOptions", refs={TableHiveOptions.class}, tree="[0]")
    private Output</* @Nullable */ TableHiveOptions> hiveOptions;

    /**
     * @return Options of a Hive table.
     * Structure is documented below.
     * 
     */
    public Output<Optional<TableHiveOptions>> hiveOptions() {
        return Codegen.optional(this.hiveOptions);
    }
    /**
     * Output only. The name of the Table. Format:
     * projects/{project_id_or_number}/locations/{locationId}/catalogs/{catalogId}/databases/{databaseId}/tables/{tableId}
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Output only. The name of the Table. Format:
     * projects/{project_id_or_number}/locations/{locationId}/catalogs/{catalogId}/databases/{databaseId}/tables/{tableId}
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The database type.
     * Possible values are: `HIVE`.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> type;

    /**
     * @return The database type.
     * Possible values are: `HIVE`.
     * 
     */
    public Output<Optional<String>> type() {
        return Codegen.optional(this.type);
    }
    /**
     * Output only. The last modification time of the table. A timestamp in
     * RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine
     * fractional digits. Examples: &#34;2014-10-02T15:01:23Z&#34; and
     * &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    @Export(name="updateTime", refs={String.class}, tree="[0]")
    private Output<String> updateTime;

    /**
     * @return Output only. The last modification time of the table. A timestamp in
     * RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine
     * fractional digits. Examples: &#34;2014-10-02T15:01:23Z&#34; and
     * &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Table(java.lang.String name) {
        this(name, TableArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Table(java.lang.String name, @Nullable TableArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Table(java.lang.String name, @Nullable TableArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:biglake/table:Table", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Table(java.lang.String name, Output<java.lang.String> id, @Nullable TableState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:biglake/table:Table", name, state, makeResourceOptions(options, id), false);
    }

    private static TableArgs makeArgs(@Nullable TableArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? TableArgs.Empty : args;
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
    public static Table get(java.lang.String name, Output<java.lang.String> id, @Nullable TableState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Table(name, id, state, options);
    }
}
