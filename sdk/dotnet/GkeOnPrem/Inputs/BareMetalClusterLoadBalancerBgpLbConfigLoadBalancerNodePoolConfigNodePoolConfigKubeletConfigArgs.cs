// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeOnPrem.Inputs
{

    public sealed class BareMetalClusterLoadBalancerBgpLbConfigLoadBalancerNodePoolConfigNodePoolConfigKubeletConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The maximum size of bursty pulls, temporarily allows pulls to burst to this
        /// number, while still not exceeding registry_pull_qps.
        /// The value must not be a negative number.
        /// Updating this field may impact scalability by changing the amount of
        /// traffic produced by image pulls.
        /// Defaults to 10.
        /// </summary>
        [Input("registryBurst")]
        public Input<int>? RegistryBurst { get; set; }

        /// <summary>
        /// The limit of registry pulls per second.
        /// Setting this value to 0 means no limit.
        /// Updating this field may impact scalability by changing the amount of
        /// traffic produced by image pulls.
        /// Defaults to 5.
        /// </summary>
        [Input("registryPullQps")]
        public Input<int>? RegistryPullQps { get; set; }

        /// <summary>
        /// Prevents the Kubelet from pulling multiple images at a time.
        /// We recommend *not* changing the default value on nodes that run docker
        /// daemon with version  &lt; 1.9 or an Another Union File System (Aufs) storage
        /// backend. Issue https://github.com/kubernetes/kubernetes/issues/10959 has
        /// more details.
        /// </summary>
        [Input("serializeImagePullsDisabled")]
        public Input<bool>? SerializeImagePullsDisabled { get; set; }

        public BareMetalClusterLoadBalancerBgpLbConfigLoadBalancerNodePoolConfigNodePoolConfigKubeletConfigArgs()
        {
        }
        public static new BareMetalClusterLoadBalancerBgpLbConfigLoadBalancerNodePoolConfigNodePoolConfigKubeletConfigArgs Empty => new BareMetalClusterLoadBalancerBgpLbConfigLoadBalancerNodePoolConfigNodePoolConfigKubeletConfigArgs();
    }
}
