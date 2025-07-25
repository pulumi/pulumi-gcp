// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Vertex.Outputs
{

    [OutputType]
    public sealed class AiFeatureStoreEntityTypeMonitoringConfigSnapshotAnalysis
    {
        /// <summary>
        /// The monitoring schedule for snapshot analysis. For EntityType-level config: unset / disabled = true indicates disabled by default for Features under it; otherwise by default enable snapshot analysis monitoring with monitoringInterval for Features under it.
        /// </summary>
        public readonly bool? Disabled;
        /// <summary>
        /// Configuration of the snapshot analysis based monitoring pipeline running interval. The value is rolled up to full day.
        /// A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s".
        /// 
        /// &gt; **Warning:** `monitoring_interval` is deprecated and will be removed in a future release.
        /// </summary>
        public readonly string? MonitoringInterval;
        /// <summary>
        /// Configuration of the snapshot analysis based monitoring pipeline running interval. The value indicates number of days. The default value is 1.
        /// If both FeaturestoreMonitoringConfig.SnapshotAnalysis.monitoring_interval_days and [FeaturestoreMonitoringConfig.SnapshotAnalysis.monitoring_interval][] are set when creating/updating EntityTypes/Features, FeaturestoreMonitoringConfig.SnapshotAnalysis.monitoring_interval_days will be used.
        /// </summary>
        public readonly int? MonitoringIntervalDays;
        /// <summary>
        /// Customized export features time window for snapshot analysis. Unit is one day. The default value is 21 days. Minimum value is 1 day. Maximum value is 4000 days.
        /// </summary>
        public readonly int? StalenessDays;

        [OutputConstructor]
        private AiFeatureStoreEntityTypeMonitoringConfigSnapshotAnalysis(
            bool? disabled,

            string? monitoringInterval,

            int? monitoringIntervalDays,

            int? stalenessDays)
        {
            Disabled = disabled;
            MonitoringInterval = monitoringInterval;
            MonitoringIntervalDays = monitoringIntervalDays;
            StalenessDays = stalenessDays;
        }
    }
}
