// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DiscoveryEngine.Outputs
{

    [OutputType]
    public sealed class DataStoreAdvancedSiteSearchConfig
    {
        /// <summary>
        /// If set true, automatic refresh is disabled for the DataStore.
        /// </summary>
        public readonly bool? DisableAutomaticRefresh;
        /// <summary>
        /// If set true, initial indexing is disabled for the DataStore.
        /// </summary>
        public readonly bool? DisableInitialIndex;

        [OutputConstructor]
        private DataStoreAdvancedSiteSearchConfig(
            bool? disableAutomaticRefresh,

            bool? disableInitialIndex)
        {
            DisableAutomaticRefresh = disableAutomaticRefresh;
            DisableInitialIndex = disableInitialIndex;
        }
    }
}
