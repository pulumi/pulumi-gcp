// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.OracleDatabase
{
    public static class GetDbServers
    {
        /// <summary>
        /// List all DbServers of a Cloud Exdata Infrastructure.
        /// 
        /// For more information see the
        /// [API](https://cloud.google.com/oracle/database/docs/reference/rest/v1/projects.locations.cloudExadataInfrastructures.dbServers).
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Gcp = Pulumi.Gcp;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var myDbServers = Gcp.OracleDatabase.GetDbServers.Invoke(new()
        ///     {
        ///         Location = "us-east4",
        ///         CloudExadataInfrastructure = "exadata-id",
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// ## Attributes reference
        /// 
        /// The following attributes are exported:
        /// 
        /// * `db_servers` - List of dbServers. Structure is documented below.
        /// 
        /// &lt;a name="nested_dbservers"&gt;&lt;/a&gt; The `db_servers` block supports:
        /// 
        /// * `display_name` - User friendly name for the resource.
        /// 
        /// * `properties` - Various properties of the databse server. Structure is documented below.
        /// 
        /// &lt;a name="nested_properties"&gt;&lt;/a&gt; The `properties` block supports:
        /// 
        /// * `ocid` - The OCID of database server.
        /// 
        /// * `ocpu_count` - The OCPU count per database.
        /// 
        /// * `max_ocpu_count` - The total number of CPU cores available.
        /// 
        /// * `memory_size_gb` - The allocated memory in gigabytes on the database server.
        /// 
        /// * `max_memory_size_gb` - The total memory available in gigabytes.
        /// 
        /// * `db_node_storage_size_gb` - The local storage per VM.
        /// 
        /// * `max_db_node_storage_size_gb` - The total local node storage available in GBs.
        /// 
        /// * `vm_count` - The VM count per database.
        /// 
        /// * `state` - The current state of the database server.
        /// &lt;a name="nested_states"&gt;&lt;/a&gt;Allowed values for `state` are:&lt;br&gt;
        /// `CREATING` - Indicates that the resource is being created.&lt;br&gt;
        /// `AVAILABLE` - Indicates that the resource is available.&lt;br&gt;
        /// `UNAVAILABLE` - Indicates that the resource is unavailable.&lt;br&gt;
        /// `DELETING` - Indicates that the resource is being deleted.&lt;br&gt;
        /// `DELETED` - Indicates that the resource has been deleted.&lt;br&gt;
        /// 
        /// * `db_node_ids` - The OCID of database nodes associated with the database server.
        /// </summary>
        public static Task<GetDbServersResult> InvokeAsync(GetDbServersArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetDbServersResult>("gcp:oracledatabase/getDbServers:getDbServers", args ?? new GetDbServersArgs(), options.WithDefaults());

        /// <summary>
        /// List all DbServers of a Cloud Exdata Infrastructure.
        /// 
        /// For more information see the
        /// [API](https://cloud.google.com/oracle/database/docs/reference/rest/v1/projects.locations.cloudExadataInfrastructures.dbServers).
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Gcp = Pulumi.Gcp;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var myDbServers = Gcp.OracleDatabase.GetDbServers.Invoke(new()
        ///     {
        ///         Location = "us-east4",
        ///         CloudExadataInfrastructure = "exadata-id",
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// ## Attributes reference
        /// 
        /// The following attributes are exported:
        /// 
        /// * `db_servers` - List of dbServers. Structure is documented below.
        /// 
        /// &lt;a name="nested_dbservers"&gt;&lt;/a&gt; The `db_servers` block supports:
        /// 
        /// * `display_name` - User friendly name for the resource.
        /// 
        /// * `properties` - Various properties of the databse server. Structure is documented below.
        /// 
        /// &lt;a name="nested_properties"&gt;&lt;/a&gt; The `properties` block supports:
        /// 
        /// * `ocid` - The OCID of database server.
        /// 
        /// * `ocpu_count` - The OCPU count per database.
        /// 
        /// * `max_ocpu_count` - The total number of CPU cores available.
        /// 
        /// * `memory_size_gb` - The allocated memory in gigabytes on the database server.
        /// 
        /// * `max_memory_size_gb` - The total memory available in gigabytes.
        /// 
        /// * `db_node_storage_size_gb` - The local storage per VM.
        /// 
        /// * `max_db_node_storage_size_gb` - The total local node storage available in GBs.
        /// 
        /// * `vm_count` - The VM count per database.
        /// 
        /// * `state` - The current state of the database server.
        /// &lt;a name="nested_states"&gt;&lt;/a&gt;Allowed values for `state` are:&lt;br&gt;
        /// `CREATING` - Indicates that the resource is being created.&lt;br&gt;
        /// `AVAILABLE` - Indicates that the resource is available.&lt;br&gt;
        /// `UNAVAILABLE` - Indicates that the resource is unavailable.&lt;br&gt;
        /// `DELETING` - Indicates that the resource is being deleted.&lt;br&gt;
        /// `DELETED` - Indicates that the resource has been deleted.&lt;br&gt;
        /// 
        /// * `db_node_ids` - The OCID of database nodes associated with the database server.
        /// </summary>
        public static Output<GetDbServersResult> Invoke(GetDbServersInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetDbServersResult>("gcp:oracledatabase/getDbServers:getDbServers", args ?? new GetDbServersInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// List all DbServers of a Cloud Exdata Infrastructure.
        /// 
        /// For more information see the
        /// [API](https://cloud.google.com/oracle/database/docs/reference/rest/v1/projects.locations.cloudExadataInfrastructures.dbServers).
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Gcp = Pulumi.Gcp;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var myDbServers = Gcp.OracleDatabase.GetDbServers.Invoke(new()
        ///     {
        ///         Location = "us-east4",
        ///         CloudExadataInfrastructure = "exadata-id",
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// ## Attributes reference
        /// 
        /// The following attributes are exported:
        /// 
        /// * `db_servers` - List of dbServers. Structure is documented below.
        /// 
        /// &lt;a name="nested_dbservers"&gt;&lt;/a&gt; The `db_servers` block supports:
        /// 
        /// * `display_name` - User friendly name for the resource.
        /// 
        /// * `properties` - Various properties of the databse server. Structure is documented below.
        /// 
        /// &lt;a name="nested_properties"&gt;&lt;/a&gt; The `properties` block supports:
        /// 
        /// * `ocid` - The OCID of database server.
        /// 
        /// * `ocpu_count` - The OCPU count per database.
        /// 
        /// * `max_ocpu_count` - The total number of CPU cores available.
        /// 
        /// * `memory_size_gb` - The allocated memory in gigabytes on the database server.
        /// 
        /// * `max_memory_size_gb` - The total memory available in gigabytes.
        /// 
        /// * `db_node_storage_size_gb` - The local storage per VM.
        /// 
        /// * `max_db_node_storage_size_gb` - The total local node storage available in GBs.
        /// 
        /// * `vm_count` - The VM count per database.
        /// 
        /// * `state` - The current state of the database server.
        /// &lt;a name="nested_states"&gt;&lt;/a&gt;Allowed values for `state` are:&lt;br&gt;
        /// `CREATING` - Indicates that the resource is being created.&lt;br&gt;
        /// `AVAILABLE` - Indicates that the resource is available.&lt;br&gt;
        /// `UNAVAILABLE` - Indicates that the resource is unavailable.&lt;br&gt;
        /// `DELETING` - Indicates that the resource is being deleted.&lt;br&gt;
        /// `DELETED` - Indicates that the resource has been deleted.&lt;br&gt;
        /// 
        /// * `db_node_ids` - The OCID of database nodes associated with the database server.
        /// </summary>
        public static Output<GetDbServersResult> Invoke(GetDbServersInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetDbServersResult>("gcp:oracledatabase/getDbServers:getDbServers", args ?? new GetDbServersInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDbServersArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Exadata Infrastructure id.
        /// </summary>
        [Input("cloudExadataInfrastructure", required: true)]
        public string CloudExadataInfrastructure { get; set; } = null!;

        /// <summary>
        /// The location of resource.
        /// </summary>
        [Input("location", required: true)]
        public string Location { get; set; } = null!;

        /// <summary>
        /// The project to which the resource belongs. If it
        /// is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public string? Project { get; set; }

        public GetDbServersArgs()
        {
        }
        public static new GetDbServersArgs Empty => new GetDbServersArgs();
    }

    public sealed class GetDbServersInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Exadata Infrastructure id.
        /// </summary>
        [Input("cloudExadataInfrastructure", required: true)]
        public Input<string> CloudExadataInfrastructure { get; set; } = null!;

        /// <summary>
        /// The location of resource.
        /// </summary>
        [Input("location", required: true)]
        public Input<string> Location { get; set; } = null!;

        /// <summary>
        /// The project to which the resource belongs. If it
        /// is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        public GetDbServersInvokeArgs()
        {
        }
        public static new GetDbServersInvokeArgs Empty => new GetDbServersInvokeArgs();
    }


    [OutputType]
    public sealed class GetDbServersResult
    {
        public readonly string CloudExadataInfrastructure;
        public readonly ImmutableArray<Outputs.GetDbServersDbServerResult> DbServers;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Location;
        public readonly string? Project;

        [OutputConstructor]
        private GetDbServersResult(
            string cloudExadataInfrastructure,

            ImmutableArray<Outputs.GetDbServersDbServerResult> dbServers,

            string id,

            string location,

            string? project)
        {
            CloudExadataInfrastructure = cloudExadataInfrastructure;
            DbServers = dbServers;
            Id = id;
            Location = location;
            Project = project;
        }
    }
}
