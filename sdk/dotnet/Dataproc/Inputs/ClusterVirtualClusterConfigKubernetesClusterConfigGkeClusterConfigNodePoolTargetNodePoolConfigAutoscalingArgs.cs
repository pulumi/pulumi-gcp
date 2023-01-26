// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Dataproc.Inputs
{

    public sealed class ClusterVirtualClusterConfigKubernetesClusterConfigGkeClusterConfigNodePoolTargetNodePoolConfigAutoscalingArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The maximum number of nodes in the node pool. Must be &gt;= minNodeCount, and must be &gt; 0.
        /// </summary>
        [Input("maxNodeCount")]
        public Input<int>? MaxNodeCount { get; set; }

        /// <summary>
        /// The minimum number of nodes in the node pool. Must be &gt;= 0 and &lt;= maxNodeCount.
        /// </summary>
        [Input("minNodeCount")]
        public Input<int>? MinNodeCount { get; set; }

        public ClusterVirtualClusterConfigKubernetesClusterConfigGkeClusterConfigNodePoolTargetNodePoolConfigAutoscalingArgs()
        {
        }
        public static new ClusterVirtualClusterConfigKubernetesClusterConfigGkeClusterConfigNodePoolTargetNodePoolConfigAutoscalingArgs Empty => new ClusterVirtualClusterConfigKubernetesClusterConfigGkeClusterConfigNodePoolTargetNodePoolConfigAutoscalingArgs();
    }
}