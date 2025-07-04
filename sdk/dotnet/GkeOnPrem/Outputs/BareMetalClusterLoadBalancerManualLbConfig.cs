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
    public sealed class BareMetalClusterLoadBalancerManualLbConfig
    {
        /// <summary>
        /// Whether manual load balancing is enabled.
        /// </summary>
        public readonly bool Enabled;

        [OutputConstructor]
        private BareMetalClusterLoadBalancerManualLbConfig(bool enabled)
        {
            Enabled = enabled;
        }
    }
}
