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
    public sealed class VPNTunnelCipherSuitePhase1
    {
        /// <summary>
        /// Diffie-Hellman groups.
        /// </summary>
        public readonly ImmutableArray<string> Dhs;
        /// <summary>
        /// Encryption algorithms.
        /// </summary>
        public readonly ImmutableArray<string> Encryptions;
        /// <summary>
        /// Integrity algorithms.
        /// </summary>
        public readonly ImmutableArray<string> Integrities;
        /// <summary>
        /// Pseudo-random functions.
        /// </summary>
        public readonly ImmutableArray<string> Prves;

        [OutputConstructor]
        private VPNTunnelCipherSuitePhase1(
            ImmutableArray<string> dhs,

            ImmutableArray<string> encryptions,

            ImmutableArray<string> integrities,

            ImmutableArray<string> prves)
        {
            Dhs = dhs;
            Encryptions = encryptions;
            Integrities = integrities;
            Prves = prves;
        }
    }
}
