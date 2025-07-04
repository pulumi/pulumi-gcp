// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeOnPrem.Outputs
{

    [OutputType]
    public sealed class VMwareClusterLoadBalancer
    {
        /// <summary>
        /// Configuration for F5 Big IP typed load balancers.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.VMwareClusterLoadBalancerF5Config? F5Config;
        /// <summary>
        /// Manually configured load balancers.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.VMwareClusterLoadBalancerManualLbConfig? ManualLbConfig;
        /// <summary>
        /// Configuration for MetalLB typed load balancers.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.VMwareClusterLoadBalancerMetalLbConfig? MetalLbConfig;
        /// <summary>
        /// The VIPs used by the load balancer.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.VMwareClusterLoadBalancerVipConfig? VipConfig;

        [OutputConstructor]
        private VMwareClusterLoadBalancer(
            Outputs.VMwareClusterLoadBalancerF5Config? f5Config,

            Outputs.VMwareClusterLoadBalancerManualLbConfig? manualLbConfig,

            Outputs.VMwareClusterLoadBalancerMetalLbConfig? metalLbConfig,

            Outputs.VMwareClusterLoadBalancerVipConfig? vipConfig)
        {
            F5Config = f5Config;
            ManualLbConfig = manualLbConfig;
            MetalLbConfig = metalLbConfig;
            VipConfig = vipConfig;
        }
    }
}
