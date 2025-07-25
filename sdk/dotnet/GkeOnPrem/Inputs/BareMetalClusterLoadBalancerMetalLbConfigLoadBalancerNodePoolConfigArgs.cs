// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeOnPrem.Inputs
{

    public sealed class BareMetalClusterLoadBalancerMetalLbConfigLoadBalancerNodePoolConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The generic configuration for a node pool running a load balancer.
        /// Structure is documented below.
        /// </summary>
        [Input("nodePoolConfig")]
        public Input<Inputs.BareMetalClusterLoadBalancerMetalLbConfigLoadBalancerNodePoolConfigNodePoolConfigArgs>? NodePoolConfig { get; set; }

        public BareMetalClusterLoadBalancerMetalLbConfigLoadBalancerNodePoolConfigArgs()
        {
        }
        public static new BareMetalClusterLoadBalancerMetalLbConfigLoadBalancerNodePoolConfigArgs Empty => new BareMetalClusterLoadBalancerMetalLbConfigLoadBalancerNodePoolConfigArgs();
    }
}
