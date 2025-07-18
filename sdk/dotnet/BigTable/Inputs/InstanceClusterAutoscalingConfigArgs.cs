// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.BigTable.Inputs
{

    public sealed class InstanceClusterAutoscalingConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The target CPU utilization for autoscaling, in percentage. Must be between 10 and 80.
        /// </summary>
        [Input("cpuTarget", required: true)]
        public Input<int> CpuTarget { get; set; } = null!;

        /// <summary>
        /// The maximum number of nodes for autoscaling.
        /// </summary>
        [Input("maxNodes", required: true)]
        public Input<int> MaxNodes { get; set; } = null!;

        /// <summary>
        /// The minimum number of nodes for autoscaling.
        /// </summary>
        [Input("minNodes", required: true)]
        public Input<int> MinNodes { get; set; } = null!;

        /// <summary>
        /// The target storage utilization for autoscaling, in GB, for each node in a cluster. This number is limited between 2560 (2.5TiB) and 5120 (5TiB) for a SSD cluster and between 8192 (8TiB) and 16384 (16 TiB) for an HDD cluster. If not set, whatever is already set for the cluster will not change, or if the cluster is just being created, it will use the default value of 2560 for SSD clusters and 8192 for HDD clusters.
        /// 
        /// !&gt; **Warning**: Only one of `autoscaling_config` or `num_nodes` should be set for a cluster. If both are set, `num_nodes` is ignored. If none is set, autoscaling will be disabled and sized to the current node count.
        /// </summary>
        [Input("storageTarget")]
        public Input<int>? StorageTarget { get; set; }

        public InstanceClusterAutoscalingConfigArgs()
        {
        }
        public static new InstanceClusterAutoscalingConfigArgs Empty => new InstanceClusterAutoscalingConfigArgs();
    }
}
