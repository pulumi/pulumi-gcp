// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Vertex.Outputs
{

    [OutputType]
    public sealed class AiFeatureOnlineStoreBigtableAutoScaling
    {
        /// <summary>
        /// A percentage of the cluster's CPU capacity. Can be from 10% to 80%. When a cluster's CPU utilization exceeds the target that you have set, Bigtable immediately adds nodes to the cluster. When CPU utilization is substantially lower than the target, Bigtable removes nodes. If not set will default to 50%.
        /// </summary>
        public readonly int? CpuUtilizationTarget;
        /// <summary>
        /// The maximum number of nodes to scale up to. Must be greater than or equal to minNodeCount, and less than or equal to 10 times of 'minNodeCount'.
        /// </summary>
        public readonly int MaxNodeCount;
        /// <summary>
        /// The minimum number of nodes to scale down to. Must be greater than or equal to 1.
        /// </summary>
        public readonly int MinNodeCount;

        [OutputConstructor]
        private AiFeatureOnlineStoreBigtableAutoScaling(
            int? cpuUtilizationTarget,

            int maxNodeCount,

            int minNodeCount)
        {
            CpuUtilizationTarget = cpuUtilizationTarget;
            MaxNodeCount = maxNodeCount;
            MinNodeCount = minNodeCount;
        }
    }
}
