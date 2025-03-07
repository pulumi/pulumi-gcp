// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.MemoryStore.Outputs
{

    [OutputType]
    public sealed class InstanceStateInfoUpdateInfo
    {
        /// <summary>
        /// (Output)
        /// Output only. Target number of replica nodes per shard for the instance.
        /// </summary>
        public readonly int? TargetReplicaCount;
        /// <summary>
        /// (Output)
        /// Output only. Target number of shards for the instance.
        /// </summary>
        public readonly int? TargetShardCount;

        [OutputConstructor]
        private InstanceStateInfoUpdateInfo(
            int? targetReplicaCount,

            int? targetShardCount)
        {
            TargetReplicaCount = targetReplicaCount;
            TargetShardCount = targetShardCount;
        }
    }
}
