// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
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
        public readonly ImmutableArray<Outputs.EnvironmentConfigMasterAuthorizedNetworksConfigCidrBlock> CidrBlocks;
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