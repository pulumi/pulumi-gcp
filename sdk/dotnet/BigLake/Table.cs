// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.BigLake
{
    /// <summary>
    /// Represents a table.
    /// 
    /// To get more information about Table, see:
    /// 
    /// * [API documentation](https://cloud.google.com/bigquery/docs/reference/biglake/rest/v1/projects.locations.catalogs.databases.tables)
    /// * How-to Guides
    ///     * [Manage open source metadata with BigLake Metastore](https://cloud.google.com/bigquery/docs/manage-open-source-metadata#create_tables)
    /// 
    /// ## Example Usage
    /// 
    /// ### Biglake Table
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var catalog = new Gcp.BigLake.Catalog("catalog", new()
    ///     {
    ///         Name = "my_catalog",
    ///         Location = "US",
    ///     });
    /// 
    ///     var bucket = new Gcp.Storage.Bucket("bucket", new()
    ///     {
    ///         Name = "my_bucket",
    ///         Location = "US",
    ///         ForceDestroy = true,
    ///         UniformBucketLevelAccess = true,
    ///     });
    /// 
    ///     var metadataFolder = new Gcp.Storage.BucketObject("metadata_folder", new()
    ///     {
    ///         Name = "metadata/",
    ///         Content = " ",
    ///         Bucket = bucket.Name,
    ///     });
    /// 
    ///     var dataFolder = new Gcp.Storage.BucketObject("data_folder", new()
    ///     {
    ///         Name = "data/",
    ///         Content = " ",
    ///         Bucket = bucket.Name,
    ///     });
    /// 
    ///     var database = new Gcp.BigLake.Database("database", new()
    ///     {
    ///         Name = "my_database",
    ///         Catalog = catalog.Id,
    ///         Type = "HIVE",
    ///         HiveOptions = new Gcp.BigLake.Inputs.DatabaseHiveOptionsArgs
    ///         {
    ///             LocationUri = Output.Tuple(bucket.Name, metadataFolder.Name).Apply(values =&gt;
    ///             {
    ///                 var bucketName = values.Item1;
    ///                 var metadataFolderName = values.Item2;
    ///                 return $"gs://{bucketName}/{metadataFolderName}";
    ///             }),
    ///             Parameters = 
    ///             {
    ///                 { "owner", "Alex" },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var table = new Gcp.BigLake.Table("table", new()
    ///     {
    ///         Name = "my_table",
    ///         Database = database.Id,
    ///         Type = "HIVE",
    ///         HiveOptions = new Gcp.BigLake.Inputs.TableHiveOptionsArgs
    ///         {
    ///             TableType = "MANAGED_TABLE",
    ///             StorageDescriptor = new Gcp.BigLake.Inputs.TableHiveOptionsStorageDescriptorArgs
    ///             {
    ///                 LocationUri = Output.Tuple(bucket.Name, dataFolder.Name).Apply(values =&gt;
    ///                 {
    ///                     var bucketName = values.Item1;
    ///                     var dataFolderName = values.Item2;
    ///                     return $"gs://{bucketName}/{dataFolderName}";
    ///                 }),
    ///                 InputFormat = "org.apache.hadoop.mapred.SequenceFileInputFormat",
    ///                 OutputFormat = "org.apache.hadoop.hive.ql.io.HiveSequenceFileOutputFormat",
    ///             },
    ///             Parameters = 
    ///             {
    ///                 { "spark.sql.create.version", "3.1.3" },
    ///                 { "spark.sql.sources.schema.numParts", "1" },
    ///                 { "transient_lastDdlTime", "1680894197" },
    ///                 { "spark.sql.partitionProvider", "catalog" },
    ///                 { "owner", "John Doe" },
    ///                 { "spark.sql.sources.schema.part.0", "{\"type\":\"struct\",\"fields\":[{\"name\":\"id\",\"type\":\"integer\",\"nullable\":true,\"metadata\":{}},{\"name\":\"name\",\"type\":\"string\",\"nullable\":true,\"metadata\":{}},{\"name\":\"age\",\"type\":\"integer\",\"nullable\":true,\"metadata\":{}}]}" },
    ///                 { "spark.sql.sources.provider", "iceberg" },
    ///                 { "provider", "iceberg" },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Table can be imported using any of these accepted formats:
    /// 
    /// * `{{database}}/tables/{{name}}`
    /// 
    /// When using the `pulumi import` command, Table can be imported using one of the formats above. For example:
    /// 
    /// ```sh
    /// $ pulumi import gcp:biglake/table:Table default {{database}}/tables/{{name}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:biglake/table:Table")]
    public partial class Table : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Output only. The creation time of the table. A timestamp in RFC3339 UTC
        /// "Zulu" format, with nanosecond resolution and up to nine fractional
        /// digits. Examples: "2014-10-02T15:01:23Z" and
        /// "2014-10-02T15:01:23.045123456Z".
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// The id of the parent database.
        /// </summary>
        [Output("database")]
        public Output<string?> Database { get; private set; } = null!;

        /// <summary>
        /// Output only. The deletion time of the table. Only set after the
        /// table is deleted. A timestamp in RFC3339 UTC "Zulu" format, with
        /// nanosecond resolution and up to nine fractional digits. Examples:
        /// "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
        /// </summary>
        [Output("deleteTime")]
        public Output<string> DeleteTime { get; private set; } = null!;

        /// <summary>
        /// The checksum of a table object computed by the server based on the value
        /// of other fields. It may be sent on update requests to ensure the client
        /// has an up-to-date value before proceeding. It is only checked for update
        /// table operations.
        /// </summary>
        [Output("etag")]
        public Output<string> Etag { get; private set; } = null!;

        /// <summary>
        /// Output only. The time when this table is considered expired. Only set
        /// after the table is deleted. A timestamp in RFC3339 UTC "Zulu" format,
        /// with nanosecond resolution and up to nine fractional digits. Examples:
        /// "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
        /// </summary>
        [Output("expireTime")]
        public Output<string> ExpireTime { get; private set; } = null!;

        /// <summary>
        /// Options of a Hive table.
        /// Structure is documented below.
        /// </summary>
        [Output("hiveOptions")]
        public Output<Outputs.TableHiveOptions?> HiveOptions { get; private set; } = null!;

        /// <summary>
        /// Output only. The name of the Table. Format:
        /// projects/{project_id_or_number}/locations/{locationId}/catalogs/{catalogId}/databases/{databaseId}/tables/{tableId}
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The database type.
        /// Possible values are: `HIVE`.
        /// </summary>
        [Output("type")]
        public Output<string?> Type { get; private set; } = null!;

        /// <summary>
        /// Output only. The last modification time of the table. A timestamp in
        /// RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine
        /// fractional digits. Examples: "2014-10-02T15:01:23Z" and
        /// "2014-10-02T15:01:23.045123456Z".
        /// </summary>
        [Output("updateTime")]
        public Output<string> UpdateTime { get; private set; } = null!;


        /// <summary>
        /// Create a Table resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Table(string name, TableArgs? args = null, CustomResourceOptions? options = null)
            : base("gcp:biglake/table:Table", name, args ?? new TableArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Table(string name, Input<string> id, TableState? state = null, CustomResourceOptions? options = null)
            : base("gcp:biglake/table:Table", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Table resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Table Get(string name, Input<string> id, TableState? state = null, CustomResourceOptions? options = null)
        {
            return new Table(name, id, state, options);
        }
    }

    public sealed class TableArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The id of the parent database.
        /// </summary>
        [Input("database")]
        public Input<string>? Database { get; set; }

        /// <summary>
        /// Options of a Hive table.
        /// Structure is documented below.
        /// </summary>
        [Input("hiveOptions")]
        public Input<Inputs.TableHiveOptionsArgs>? HiveOptions { get; set; }

        /// <summary>
        /// Output only. The name of the Table. Format:
        /// projects/{project_id_or_number}/locations/{locationId}/catalogs/{catalogId}/databases/{databaseId}/tables/{tableId}
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The database type.
        /// Possible values are: `HIVE`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public TableArgs()
        {
        }
        public static new TableArgs Empty => new TableArgs();
    }

    public sealed class TableState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Output only. The creation time of the table. A timestamp in RFC3339 UTC
        /// "Zulu" format, with nanosecond resolution and up to nine fractional
        /// digits. Examples: "2014-10-02T15:01:23Z" and
        /// "2014-10-02T15:01:23.045123456Z".
        /// </summary>
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        /// <summary>
        /// The id of the parent database.
        /// </summary>
        [Input("database")]
        public Input<string>? Database { get; set; }

        /// <summary>
        /// Output only. The deletion time of the table. Only set after the
        /// table is deleted. A timestamp in RFC3339 UTC "Zulu" format, with
        /// nanosecond resolution and up to nine fractional digits. Examples:
        /// "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
        /// </summary>
        [Input("deleteTime")]
        public Input<string>? DeleteTime { get; set; }

        /// <summary>
        /// The checksum of a table object computed by the server based on the value
        /// of other fields. It may be sent on update requests to ensure the client
        /// has an up-to-date value before proceeding. It is only checked for update
        /// table operations.
        /// </summary>
        [Input("etag")]
        public Input<string>? Etag { get; set; }

        /// <summary>
        /// Output only. The time when this table is considered expired. Only set
        /// after the table is deleted. A timestamp in RFC3339 UTC "Zulu" format,
        /// with nanosecond resolution and up to nine fractional digits. Examples:
        /// "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
        /// </summary>
        [Input("expireTime")]
        public Input<string>? ExpireTime { get; set; }

        /// <summary>
        /// Options of a Hive table.
        /// Structure is documented below.
        /// </summary>
        [Input("hiveOptions")]
        public Input<Inputs.TableHiveOptionsGetArgs>? HiveOptions { get; set; }

        /// <summary>
        /// Output only. The name of the Table. Format:
        /// projects/{project_id_or_number}/locations/{locationId}/catalogs/{catalogId}/databases/{databaseId}/tables/{tableId}
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The database type.
        /// Possible values are: `HIVE`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// Output only. The last modification time of the table. A timestamp in
        /// RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine
        /// fractional digits. Examples: "2014-10-02T15:01:23Z" and
        /// "2014-10-02T15:01:23.045123456Z".
        /// </summary>
        [Input("updateTime")]
        public Input<string>? UpdateTime { get; set; }

        public TableState()
        {
        }
        public static new TableState Empty => new TableState();
    }
}
