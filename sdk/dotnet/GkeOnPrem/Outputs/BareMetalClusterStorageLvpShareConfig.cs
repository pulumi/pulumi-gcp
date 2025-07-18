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
    public sealed class BareMetalClusterStorageLvpShareConfig
    {
        /// <summary>
        /// Defines the machine path and storage class for the LVP Share.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.BareMetalClusterStorageLvpShareConfigLvpConfig LvpConfig;
        /// <summary>
        /// The number of subdirectories to create under path.
        /// </summary>
        public readonly int? SharedPathPvCount;

        [OutputConstructor]
        private BareMetalClusterStorageLvpShareConfig(
            Outputs.BareMetalClusterStorageLvpShareConfigLvpConfig lvpConfig,

            int? sharedPathPvCount)
        {
            LvpConfig = lvpConfig;
            SharedPathPvCount = sharedPathPvCount;
        }
    }
}
