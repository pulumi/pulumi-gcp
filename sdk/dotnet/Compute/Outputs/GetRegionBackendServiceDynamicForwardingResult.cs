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
    public sealed class GetRegionBackendServiceDynamicForwardingResult
    {
        /// <summary>
        /// IP:PORT based dynamic forwarding configuration.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetRegionBackendServiceDynamicForwardingIpPortSelectionResult> IpPortSelections;

        [OutputConstructor]
        private GetRegionBackendServiceDynamicForwardingResult(ImmutableArray<Outputs.GetRegionBackendServiceDynamicForwardingIpPortSelectionResult> ipPortSelections)
        {
            IpPortSelections = ipPortSelections;
        }
    }
}
