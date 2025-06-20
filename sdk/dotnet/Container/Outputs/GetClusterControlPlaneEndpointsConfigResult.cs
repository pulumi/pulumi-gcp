// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Container.Outputs
{

    [OutputType]
    public sealed class GetClusterControlPlaneEndpointsConfigResult
    {
        /// <summary>
        /// DNS endpoint configuration.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetClusterControlPlaneEndpointsConfigDnsEndpointConfigResult> DnsEndpointConfigs;
        /// <summary>
        /// IP endpoint configuration.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetClusterControlPlaneEndpointsConfigIpEndpointsConfigResult> IpEndpointsConfigs;

        [OutputConstructor]
        private GetClusterControlPlaneEndpointsConfigResult(
            ImmutableArray<Outputs.GetClusterControlPlaneEndpointsConfigDnsEndpointConfigResult> dnsEndpointConfigs,

            ImmutableArray<Outputs.GetClusterControlPlaneEndpointsConfigIpEndpointsConfigResult> ipEndpointsConfigs)
        {
            DnsEndpointConfigs = dnsEndpointConfigs;
            IpEndpointsConfigs = ipEndpointsConfigs;
        }
    }
}
