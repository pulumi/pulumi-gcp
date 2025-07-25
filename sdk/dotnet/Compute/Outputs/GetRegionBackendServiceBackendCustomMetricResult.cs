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
    public sealed class GetRegionBackendServiceBackendCustomMetricResult
    {
        /// <summary>
        /// If true, the metric data is collected and reported to Cloud
        /// Monitoring, but is not used for load balancing.
        /// </summary>
        public readonly bool DryRun;
        /// <summary>
        /// Optional parameter to define a target utilization for the Custom Metrics
        /// balancing mode. The valid range is &lt;code&gt;[0.0, 1.0]&lt;/code&gt;.
        /// </summary>
        public readonly double MaxUtilization;
        /// <summary>
        /// The name of the regional backend service.
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private GetRegionBackendServiceBackendCustomMetricResult(
            bool dryRun,

            double maxUtilization,

            string name)
        {
            DryRun = dryRun;
            MaxUtilization = maxUtilization;
            Name = name;
        }
    }
}
