// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Redis.Outputs
{

    [OutputType]
    public sealed class ClusterStateInfoUpdateInfo
    {
        /// <summary>
        /// Target number of replica nodes per shard.
        /// </summary>
        public readonly int? TargetReplicaCount;
        /// <summary>
        /// Target number of shards for redis cluster.
        /// </summary>
        public readonly int? TargetShardCount;

        [OutputConstructor]
        private ClusterStateInfoUpdateInfo(
            int? targetReplicaCount,

            int? targetShardCount)
        {
            TargetReplicaCount = targetReplicaCount;
            TargetShardCount = targetShardCount;
        }
    }
}
