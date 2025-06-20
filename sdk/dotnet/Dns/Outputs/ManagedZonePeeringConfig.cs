// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Dns.Outputs
{

    [OutputType]
    public sealed class ManagedZonePeeringConfig
    {
        /// <summary>
        /// The network with which to peer.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.ManagedZonePeeringConfigTargetNetwork TargetNetwork;

        [OutputConstructor]
        private ManagedZonePeeringConfig(Outputs.ManagedZonePeeringConfigTargetNetwork targetNetwork)
        {
            TargetNetwork = targetNetwork;
        }
    }
}
