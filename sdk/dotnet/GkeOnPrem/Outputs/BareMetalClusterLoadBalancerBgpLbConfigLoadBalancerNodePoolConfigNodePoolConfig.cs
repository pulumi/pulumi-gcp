// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeOnPrem.Outputs
{

    [OutputType]
    public sealed class BareMetalClusterLoadBalancerBgpLbConfigLoadBalancerNodePoolConfigNodePoolConfig
    {
        /// <summary>
        /// The modifiable kubelet configurations for the baremetal machines.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.BareMetalClusterLoadBalancerBgpLbConfigLoadBalancerNodePoolConfigNodePoolConfigKubeletConfig? KubeletConfig;
        /// <summary>
        /// The map of Kubernetes labels (key/value pairs) to be applied to
        /// each node. These will added in addition to any default label(s)
        /// that Kubernetes may apply to the node. In case of conflict in
        /// label keys, the applied set may differ depending on the Kubernetes
        /// version -- it's best to assume the behavior is undefined and
        /// conflicts should be avoided. For more information, including usage
        /// and the valid values, see:
        /// http://kubernetes.io/v1.1/docs/user-guide/labels.html
        /// An object containing a list of "key": value pairs.
        /// Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
        /// </summary>
        public readonly ImmutableDictionary<string, string>? Labels;
        /// <summary>
        /// The list of machine addresses in the Bare Metal Node Pool.
        /// Structure is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.BareMetalClusterLoadBalancerBgpLbConfigLoadBalancerNodePoolConfigNodePoolConfigNodeConfig> NodeConfigs;
        /// <summary>
        /// Specifies the nodes operating system (default: LINUX).
        /// </summary>
        public readonly string? OperatingSystem;
        /// <summary>
        /// The initial taints assigned to nodes of this node pool.
        /// Structure is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.BareMetalClusterLoadBalancerBgpLbConfigLoadBalancerNodePoolConfigNodePoolConfigTaint> Taints;

        [OutputConstructor]
        private BareMetalClusterLoadBalancerBgpLbConfigLoadBalancerNodePoolConfigNodePoolConfig(
            Outputs.BareMetalClusterLoadBalancerBgpLbConfigLoadBalancerNodePoolConfigNodePoolConfigKubeletConfig? kubeletConfig,

            ImmutableDictionary<string, string>? labels,

            ImmutableArray<Outputs.BareMetalClusterLoadBalancerBgpLbConfigLoadBalancerNodePoolConfigNodePoolConfigNodeConfig> nodeConfigs,

            string? operatingSystem,

            ImmutableArray<Outputs.BareMetalClusterLoadBalancerBgpLbConfigLoadBalancerNodePoolConfigNodePoolConfigTaint> taints)
        {
            KubeletConfig = kubeletConfig;
            Labels = labels;
            NodeConfigs = nodeConfigs;
            OperatingSystem = operatingSystem;
            Taints = taints;
        }
    }
}