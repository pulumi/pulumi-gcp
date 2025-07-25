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
    public sealed class InterconnectApplicationAwareInterconnectBandwidthPercentagePolicy
    {
        /// <summary>
        /// Specify bandwidth percentages for various traffic classes for queuing
        /// type Bandwidth Percent.
        /// Structure is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.InterconnectApplicationAwareInterconnectBandwidthPercentagePolicyBandwidthPercentage> BandwidthPercentages;

        [OutputConstructor]
        private InterconnectApplicationAwareInterconnectBandwidthPercentagePolicy(ImmutableArray<Outputs.InterconnectApplicationAwareInterconnectBandwidthPercentagePolicyBandwidthPercentage> bandwidthPercentages)
        {
            BandwidthPercentages = bandwidthPercentages;
        }
    }
}
