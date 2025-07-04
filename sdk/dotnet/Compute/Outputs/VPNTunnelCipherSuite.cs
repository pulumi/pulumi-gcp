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
    public sealed class VPNTunnelCipherSuite
    {
        /// <summary>
        /// Cipher configuration for phase 1 of the IKE protocol.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.VPNTunnelCipherSuitePhase1? Phase1;
        /// <summary>
        /// Cipher configuration for phase 2 of the IKE protocol.
        /// Structure is documented below.
        /// 
        /// 
        /// &lt;a name="nested_cipher_suite_phase1"&gt;&lt;/a&gt;The `phase1` block supports:
        /// </summary>
        public readonly Outputs.VPNTunnelCipherSuitePhase2? Phase2;

        [OutputConstructor]
        private VPNTunnelCipherSuite(
            Outputs.VPNTunnelCipherSuitePhase1? phase1,

            Outputs.VPNTunnelCipherSuitePhase2? phase2)
        {
            Phase1 = phase1;
            Phase2 = phase2;
        }
    }
}
