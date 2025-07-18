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
    public sealed class SearchEngineSearchEngineConfig
    {
        /// <summary>
        /// The add-on that this search engine enables.
        /// Each value may be one of: `SEARCH_ADD_ON_LLM`.
        /// </summary>
        public readonly ImmutableArray<string> SearchAddOns;
        /// <summary>
        /// The search feature tier of this engine. Defaults to SearchTier.SEARCH_TIER_STANDARD if not specified.
        /// Default value is `SEARCH_TIER_STANDARD`.
        /// Possible values are: `SEARCH_TIER_STANDARD`, `SEARCH_TIER_ENTERPRISE`.
        /// </summary>
        public readonly string? SearchTier;

        [OutputConstructor]
        private SearchEngineSearchEngineConfig(
            ImmutableArray<string> searchAddOns,

            string? searchTier)
        {
            SearchAddOns = searchAddOns;
            SearchTier = searchTier;
        }
    }
}
