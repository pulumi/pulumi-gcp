// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute.Outputs
{

    [OutputType]
    public sealed class InstanceFromMachineImageNetworkPerformanceConfig
    {
        /// <summary>
        /// The egress bandwidth tier to enable. Possible values:TIER_1, DEFAULT
        /// </summary>
        public readonly string TotalEgressBandwidthTier;

        [OutputConstructor]
        private InstanceFromMachineImageNetworkPerformanceConfig(string totalEgressBandwidthTier)
        {
            TotalEgressBandwidthTier = totalEgressBandwidthTier;
        }
    }
}
