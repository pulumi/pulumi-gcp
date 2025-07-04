// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeHub.Outputs
{

    [OutputType]
    public sealed class GetFeatureSpecClusterupgradeGkeUpgradeOverrideUpgradeResult
    {
        /// <summary>
        /// The name of the feature you want to know the status of.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Version of the upgrade, e.g., "1.22.1-gke.100". It should be a valid version. It must not exceet 99 characters.
        /// </summary>
        public readonly string Version;

        [OutputConstructor]
        private GetFeatureSpecClusterupgradeGkeUpgradeOverrideUpgradeResult(
            string name,

            string version)
        {
            Name = name;
            Version = version;
        }
    }
}
