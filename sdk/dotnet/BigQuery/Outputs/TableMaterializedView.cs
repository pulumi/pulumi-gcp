// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.BigQuery.Outputs
{

    [OutputType]
    public sealed class TableMaterializedView
    {
        /// <summary>
        /// Allow non incremental materialized view definition.
        /// The default value is false.
        /// </summary>
        public readonly bool? AllowNonIncrementalDefinition;
        /// <summary>
        /// Specifies whether to use BigQuery's automatic refresh for this materialized view when the base table is updated.
        /// The default value is true.
        /// </summary>
        public readonly bool? EnableRefresh;
        /// <summary>
        /// A query whose result is persisted.
        /// </summary>
        public readonly string Query;
        /// <summary>
        /// The maximum frequency at which this materialized view will be refreshed.
        /// The default value is 1800000
        /// </summary>
        public readonly int? RefreshIntervalMs;

        [OutputConstructor]
        private TableMaterializedView(
            bool? allowNonIncrementalDefinition,

            bool? enableRefresh,

            string query,

            int? refreshIntervalMs)
        {
            AllowNonIncrementalDefinition = allowNonIncrementalDefinition;
            EnableRefresh = enableRefresh;
            Query = query;
            RefreshIntervalMs = refreshIntervalMs;
        }
    }
}
