// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Composer.Outputs
{

    [OutputType]
    public sealed class EnvironmentConfigMasterAuthorizedNetworksConfig
    {
        /// <summary>
        /// cidr_blocks define up to 50 external networks that could access Kubernetes master through HTTPS.
        /// </summary>
        public readonly ImmutableArray<Outputs.EnvironmentConfigMasterAuthorizedNetworksConfigCidrBlock> CidrBlocks;
        /// <summary>
        /// Whether or not master authorized networks is enabled.
        /// </summary>
        public readonly bool Enabled;

        [OutputConstructor]
        private EnvironmentConfigMasterAuthorizedNetworksConfig(
            ImmutableArray<Outputs.EnvironmentConfigMasterAuthorizedNetworksConfigCidrBlock> cidrBlocks,

            bool enabled)
        {
            CidrBlocks = cidrBlocks;
            Enabled = enabled;
        }
    }
}
