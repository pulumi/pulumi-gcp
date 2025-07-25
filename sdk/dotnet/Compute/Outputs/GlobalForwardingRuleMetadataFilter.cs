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
    public sealed class GlobalForwardingRuleMetadataFilter
    {
        /// <summary>
        /// The list of label value pairs that must match labels in the
        /// provided metadata based on filterMatchCriteria
        /// This list must not be empty and can have at the most 64 entries.
        /// Structure is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GlobalForwardingRuleMetadataFilterFilterLabel> FilterLabels;
        /// <summary>
        /// Specifies how individual filterLabel matches within the list of
        /// filterLabels contribute towards the overall metadataFilter match.
        /// MATCH_ANY - At least one of the filterLabels must have a matching
        /// label in the provided metadata.
        /// MATCH_ALL - All filterLabels must have matching labels in the
        /// provided metadata.
        /// Possible values are: `MATCH_ANY`, `MATCH_ALL`.
        /// </summary>
        public readonly string FilterMatchCriteria;

        [OutputConstructor]
        private GlobalForwardingRuleMetadataFilter(
            ImmutableArray<Outputs.GlobalForwardingRuleMetadataFilterFilterLabel> filterLabels,

            string filterMatchCriteria)
        {
            FilterLabels = filterLabels;
            FilterMatchCriteria = filterMatchCriteria;
        }
    }
}
