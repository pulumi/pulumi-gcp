// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Monitoring.Inputs
{

    public sealed class SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformanceAvailabilityArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether an availability SLI is enabled or not. Must be set to `true. Defaults to `true`.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        public SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformanceAvailabilityArgs()
        {
        }
        public static new SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformanceAvailabilityArgs Empty => new SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformanceAvailabilityArgs();
    }
}
