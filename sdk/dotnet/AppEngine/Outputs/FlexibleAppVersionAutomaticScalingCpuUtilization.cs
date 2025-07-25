// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.AppEngine.Outputs
{

    [OutputType]
    public sealed class FlexibleAppVersionAutomaticScalingCpuUtilization
    {
        /// <summary>
        /// Period of time over which CPU utilization is calculated.
        /// </summary>
        public readonly string? AggregationWindowLength;
        /// <summary>
        /// Target CPU utilization ratio to maintain when scaling. Must be between 0 and 1.
        /// </summary>
        public readonly double TargetUtilization;

        [OutputConstructor]
        private FlexibleAppVersionAutomaticScalingCpuUtilization(
            string? aggregationWindowLength,

            double targetUtilization)
        {
            AggregationWindowLength = aggregationWindowLength;
            TargetUtilization = targetUtilization;
        }
    }
}
