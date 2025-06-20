// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Storage.Outputs
{

    [OutputType]
    public sealed class ControlProjectIntelligenceConfigFilter
    {
        /// <summary>
        /// Buckets to exclude from the Storage Intelligence plan.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.ControlProjectIntelligenceConfigFilterExcludedCloudStorageBuckets? ExcludedCloudStorageBuckets;
        /// <summary>
        /// Locations to exclude from the Storage Intelligence plan.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.ControlProjectIntelligenceConfigFilterExcludedCloudStorageLocations? ExcludedCloudStorageLocations;
        /// <summary>
        /// Buckets to include in the Storage Intelligence plan.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.ControlProjectIntelligenceConfigFilterIncludedCloudStorageBuckets? IncludedCloudStorageBuckets;
        /// <summary>
        /// Locations to include in the Storage Intelligence plan.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.ControlProjectIntelligenceConfigFilterIncludedCloudStorageLocations? IncludedCloudStorageLocations;

        [OutputConstructor]
        private ControlProjectIntelligenceConfigFilter(
            Outputs.ControlProjectIntelligenceConfigFilterExcludedCloudStorageBuckets? excludedCloudStorageBuckets,

            Outputs.ControlProjectIntelligenceConfigFilterExcludedCloudStorageLocations? excludedCloudStorageLocations,

            Outputs.ControlProjectIntelligenceConfigFilterIncludedCloudStorageBuckets? includedCloudStorageBuckets,

            Outputs.ControlProjectIntelligenceConfigFilterIncludedCloudStorageLocations? includedCloudStorageLocations)
        {
            ExcludedCloudStorageBuckets = excludedCloudStorageBuckets;
            ExcludedCloudStorageLocations = excludedCloudStorageLocations;
            IncludedCloudStorageBuckets = includedCloudStorageBuckets;
            IncludedCloudStorageLocations = includedCloudStorageLocations;
        }
    }
}
