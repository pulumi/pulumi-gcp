// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeOnPrem.Inputs
{

    public sealed class VMwareClusterLoadBalancerMetalLbConfigGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("addressPools", required: true)]
        private InputList<Inputs.VMwareClusterLoadBalancerMetalLbConfigAddressPoolGetArgs>? _addressPools;

        /// <summary>
        /// AddressPools is a list of non-overlapping IP pools used by load balancer
        /// typed services. All addresses must be routable to load balancer nodes.
        /// IngressVIP must be included in the pools.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.VMwareClusterLoadBalancerMetalLbConfigAddressPoolGetArgs> AddressPools
        {
            get => _addressPools ?? (_addressPools = new InputList<Inputs.VMwareClusterLoadBalancerMetalLbConfigAddressPoolGetArgs>());
            set => _addressPools = value;
        }

        public VMwareClusterLoadBalancerMetalLbConfigGetArgs()
        {
        }
        public static new VMwareClusterLoadBalancerMetalLbConfigGetArgs Empty => new VMwareClusterLoadBalancerMetalLbConfigGetArgs();
    }
}
