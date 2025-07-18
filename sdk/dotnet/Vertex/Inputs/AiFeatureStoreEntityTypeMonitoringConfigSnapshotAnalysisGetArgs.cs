// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Vertex.Inputs
{

    public sealed class AiFeatureStoreEntityTypeMonitoringConfigSnapshotAnalysisGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The monitoring schedule for snapshot analysis. For EntityType-level config: unset / disabled = true indicates disabled by default for Features under it; otherwise by default enable snapshot analysis monitoring with monitoringInterval for Features under it.
        /// </summary>
        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        /// <summary>
        /// Configuration of the snapshot analysis based monitoring pipeline running interval. The value is rolled up to full day.
        /// A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s".
        /// 
        /// &gt; **Warning:** `monitoring_interval` is deprecated and will be removed in a future release.
        /// </summary>
        [Input("monitoringInterval")]
        public Input<string>? MonitoringInterval { get; set; }

        /// <summary>
        /// Configuration of the snapshot analysis based monitoring pipeline running interval. The value indicates number of days. The default value is 1.
        /// If both FeaturestoreMonitoringConfig.SnapshotAnalysis.monitoring_interval_days and [FeaturestoreMonitoringConfig.SnapshotAnalysis.monitoring_interval][] are set when creating/updating EntityTypes/Features, FeaturestoreMonitoringConfig.SnapshotAnalysis.monitoring_interval_days will be used.
        /// </summary>
        [Input("monitoringIntervalDays")]
        public Input<int>? MonitoringIntervalDays { get; set; }

        /// <summary>
        /// Customized export features time window for snapshot analysis. Unit is one day. The default value is 21 days. Minimum value is 1 day. Maximum value is 4000 days.
        /// </summary>
        [Input("stalenessDays")]
        public Input<int>? StalenessDays { get; set; }

        public AiFeatureStoreEntityTypeMonitoringConfigSnapshotAnalysisGetArgs()
        {
        }
        public static new AiFeatureStoreEntityTypeMonitoringConfigSnapshotAnalysisGetArgs Empty => new AiFeatureStoreEntityTypeMonitoringConfigSnapshotAnalysisGetArgs();
    }
}
