// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.BigQuery
{
    public static class GetTables
    {
        /// <summary>
        /// Get a list of tables in a BigQuery dataset. For more information see
        /// the [official documentation](https://cloud.google.com/bigquery/docs)
        /// and [API](https://cloud.google.com/bigquery/docs/reference/rest/v2/tables).
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
        ///     var tables = Gcp.BigQuery.GetTables.Invoke(new()
        ///     {
        ///         DatasetId = "my-bq-dataset",
        ///         Project = "my-project",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetTablesResult> InvokeAsync(GetTablesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetTablesResult>("gcp:bigquery/getTables:getTables", args ?? new GetTablesArgs(), options.WithDefaults());

        /// <summary>
        /// Get a list of tables in a BigQuery dataset. For more information see
        /// the [official documentation](https://cloud.google.com/bigquery/docs)
        /// and [API](https://cloud.google.com/bigquery/docs/reference/rest/v2/tables).
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
        ///     var tables = Gcp.BigQuery.GetTables.Invoke(new()
        ///     {
        ///         DatasetId = "my-bq-dataset",
        ///         Project = "my-project",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetTablesResult> Invoke(GetTablesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetTablesResult>("gcp:bigquery/getTables:getTables", args ?? new GetTablesInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Get a list of tables in a BigQuery dataset. For more information see
        /// the [official documentation](https://cloud.google.com/bigquery/docs)
        /// and [API](https://cloud.google.com/bigquery/docs/reference/rest/v2/tables).
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
        ///     var tables = Gcp.BigQuery.GetTables.Invoke(new()
        ///     {
        ///         DatasetId = "my-bq-dataset",
        ///         Project = "my-project",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetTablesResult> Invoke(GetTablesInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetTablesResult>("gcp:bigquery/getTables:getTables", args ?? new GetTablesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetTablesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The dataset ID.
        /// </summary>
        [Input("datasetId", required: true)]
        public string DatasetId { get; set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public string? Project { get; set; }

        public GetTablesArgs()
        {
        }
        public static new GetTablesArgs Empty => new GetTablesArgs();
    }

    public sealed class GetTablesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The dataset ID.
        /// </summary>
        [Input("datasetId", required: true)]
        public Input<string> DatasetId { get; set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        public GetTablesInvokeArgs()
        {
        }
        public static new GetTablesInvokeArgs Empty => new GetTablesInvokeArgs();
    }


    [OutputType]
    public sealed class GetTablesResult
    {
        public readonly string DatasetId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string? Project;
        /// <summary>
        /// A list of all retrieved BigQuery tables. Structure is defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetTablesTableResult> Tables;

        [OutputConstructor]
        private GetTablesResult(
            string datasetId,

            string id,

            string? project,

            ImmutableArray<Outputs.GetTablesTableResult> tables)
        {
            DatasetId = datasetId;
            Id = id;
            Project = project;
            Tables = tables;
        }
    }
}
