// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DataCatalog.Inputs
{

    public sealed class EntryBigqueryDateShardedSpecArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (Output)
        /// The Data Catalog resource name of the dataset entry the current table belongs to, for example,
        /// projects/{project_id}/locations/{location}/entrygroups/{entryGroupId}/entries/{entryId}
        /// </summary>
        [Input("dataset")]
        public Input<string>? Dataset { get; set; }

        /// <summary>
        /// (Output)
        /// Total number of shards.
        /// </summary>
        [Input("shardCount")]
        public Input<int>? ShardCount { get; set; }

        /// <summary>
        /// (Output)
        /// The table name prefix of the shards. The name of any given shard is [tablePrefix]YYYYMMDD,
        /// for example, for shard MyTable20180101, the tablePrefix is MyTable.
        /// </summary>
        [Input("tablePrefix")]
        public Input<string>? TablePrefix { get; set; }

        public EntryBigqueryDateShardedSpecArgs()
        {
        }
        public static new EntryBigqueryDateShardedSpecArgs Empty => new EntryBigqueryDateShardedSpecArgs();
    }
}
