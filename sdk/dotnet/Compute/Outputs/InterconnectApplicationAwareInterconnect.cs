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
    public sealed class InterconnectApplicationAwareInterconnect
    {
        /// <summary>
        /// Bandwidth Percentage policy allows you to have granular control over how your Interconnect
        /// bandwidth is utilized among your workloads mapping to different traffic classes.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.InterconnectApplicationAwareInterconnectBandwidthPercentagePolicy? BandwidthPercentagePolicy;
        /// <summary>
        /// A description for the AAI profile on this interconnect.
        /// </summary>
        public readonly string? ProfileDescription;
        /// <summary>
        /// Optional field to specify a list of shape average percentages to be
        /// applied in conjunction with StrictPriorityPolicy or BandwidthPercentagePolicy
        /// Structure is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.InterconnectApplicationAwareInterconnectShapeAveragePercentage> ShapeAveragePercentages;
        /// <summary>
        /// Specify configuration for StrictPriorityPolicy.
        /// </summary>
        public readonly Outputs.InterconnectApplicationAwareInterconnectStrictPriorityPolicy? StrictPriorityPolicy;

        [OutputConstructor]
        private InterconnectApplicationAwareInterconnect(
            Outputs.InterconnectApplicationAwareInterconnectBandwidthPercentagePolicy? bandwidthPercentagePolicy,

            string? profileDescription,

            ImmutableArray<Outputs.InterconnectApplicationAwareInterconnectShapeAveragePercentage> shapeAveragePercentages,

            Outputs.InterconnectApplicationAwareInterconnectStrictPriorityPolicy? strictPriorityPolicy)
        {
            BandwidthPercentagePolicy = bandwidthPercentagePolicy;
            ProfileDescription = profileDescription;
            ShapeAveragePercentages = shapeAveragePercentages;
            StrictPriorityPolicy = strictPriorityPolicy;
        }
    }
}
