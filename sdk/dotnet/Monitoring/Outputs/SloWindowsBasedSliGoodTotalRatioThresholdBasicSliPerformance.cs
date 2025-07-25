// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Monitoring.Outputs
{

    [OutputType]
    public sealed class SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformance
    {
        /// <summary>
        /// Availability based SLI, dervied from count of requests made to this service that return successfully.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformanceAvailability? Availability;
        /// <summary>
        /// Parameters for a latency threshold SLI.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformanceLatency? Latency;
        /// <summary>
        /// An optional set of locations to which this SLI is relevant.
        /// Telemetry from other locations will not be used to calculate
        /// performance for this SLI. If omitted, this SLI applies to all
        /// locations in which the Service has activity. For service types
        /// that don't support breaking down by location, setting this
        /// field will result in an error.
        /// </summary>
        public readonly ImmutableArray<string> Locations;
        /// <summary>
        /// An optional set of RPCs to which this SLI is relevant.
        /// Telemetry from other methods will not be used to calculate
        /// performance for this SLI. If omitted, this SLI applies to all
        /// the Service's methods. For service types that don't support
        /// breaking down by method, setting this field will result in an
        /// error.
        /// </summary>
        public readonly ImmutableArray<string> Methods;
        /// <summary>
        /// The set of API versions to which this SLI is relevant.
        /// Telemetry from other API versions will not be used to
        /// calculate performance for this SLI. If omitted,
        /// this SLI applies to all API versions. For service types
        /// that don't support breaking down by version, setting this
        /// field will result in an error.
        /// </summary>
        public readonly ImmutableArray<string> Versions;

        [OutputConstructor]
        private SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformance(
            Outputs.SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformanceAvailability? availability,

            Outputs.SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformanceLatency? latency,

            ImmutableArray<string> locations,

            ImmutableArray<string> methods,

            ImmutableArray<string> versions)
        {
            Availability = availability;
            Latency = latency;
            Locations = locations;
            Methods = methods;
            Versions = versions;
        }
    }
}
