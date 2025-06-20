// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Container.Outputs
{

    [OutputType]
    public sealed class GetClusterResourceUsageExportConfigResult
    {
        /// <summary>
        /// Parameters for using BigQuery as the destination of resource usage export.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetClusterResourceUsageExportConfigBigqueryDestinationResult> BigqueryDestinations;
        /// <summary>
        /// Whether to enable network egress metering for this cluster. If enabled, a daemonset will be created in the cluster to meter network egress traffic.
        /// </summary>
        public readonly bool EnableNetworkEgressMetering;
        /// <summary>
        /// Whether to enable resource consumption metering on this cluster. When enabled, a table will be created in the resource export BigQuery dataset to store resource consumption data. The resulting table can be joined with the resource usage table or with BigQuery billing export. Defaults to true.
        /// </summary>
        public readonly bool EnableResourceConsumptionMetering;

        [OutputConstructor]
        private GetClusterResourceUsageExportConfigResult(
            ImmutableArray<Outputs.GetClusterResourceUsageExportConfigBigqueryDestinationResult> bigqueryDestinations,

            bool enableNetworkEgressMetering,

            bool enableResourceConsumptionMetering)
        {
            BigqueryDestinations = bigqueryDestinations;
            EnableNetworkEgressMetering = enableNetworkEgressMetering;
            EnableResourceConsumptionMetering = enableResourceConsumptionMetering;
        }
    }
}
