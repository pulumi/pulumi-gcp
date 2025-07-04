// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Dataproc.Outputs
{

    [OutputType]
    public sealed class ClusterVirtualClusterConfigKubernetesClusterConfigGkeClusterConfigNodePoolTarget
    {
        /// <summary>
        /// The target GKE node pool.
        /// </summary>
        public readonly string NodePool;
        /// <summary>
        /// The configuration for the GKE node pool. 
        /// If specified, Dataproc attempts to create a node pool with the specified shape.
        /// If one with the same name already exists, it is verified against all specified fields.
        /// If a field differs, the virtual cluster creation will fail.
        /// </summary>
        public readonly Outputs.ClusterVirtualClusterConfigKubernetesClusterConfigGkeClusterConfigNodePoolTargetNodePoolConfig? NodePoolConfig;
        /// <summary>
        /// The roles associated with the GKE node pool. 
        /// One of `"DEFAULT"`, `"CONTROLLER"`, `"SPARK_DRIVER"` or `"SPARK_EXECUTOR"`.
        /// </summary>
        public readonly ImmutableArray<string> Roles;

        [OutputConstructor]
        private ClusterVirtualClusterConfigKubernetesClusterConfigGkeClusterConfigNodePoolTarget(
            string nodePool,

            Outputs.ClusterVirtualClusterConfigKubernetesClusterConfigGkeClusterConfigNodePoolTargetNodePoolConfig? nodePoolConfig,

            ImmutableArray<string> roles)
        {
            NodePool = nodePool;
            NodePoolConfig = nodePoolConfig;
            Roles = roles;
        }
    }
}
