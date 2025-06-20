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
    public sealed class AiFeatureStoreEntityTypeMonitoringConfig
    {
        /// <summary>
        /// Threshold for categorical features of anomaly detection. This is shared by all types of Featurestore Monitoring for categorical features (i.e. Features with type (Feature.ValueType) BOOL or STRING).
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.AiFeatureStoreEntityTypeMonitoringConfigCategoricalThresholdConfig? CategoricalThresholdConfig;
        /// <summary>
        /// The config for ImportFeatures Analysis Based Feature Monitoring.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.AiFeatureStoreEntityTypeMonitoringConfigImportFeaturesAnalysis? ImportFeaturesAnalysis;
        /// <summary>
        /// Threshold for numerical features of anomaly detection. This is shared by all objectives of Featurestore Monitoring for numerical features (i.e. Features with type (Feature.ValueType) DOUBLE or INT64).
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.AiFeatureStoreEntityTypeMonitoringConfigNumericalThresholdConfig? NumericalThresholdConfig;
        /// <summary>
        /// The config for Snapshot Analysis Based Feature Monitoring.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.AiFeatureStoreEntityTypeMonitoringConfigSnapshotAnalysis? SnapshotAnalysis;

        [OutputConstructor]
        private AiFeatureStoreEntityTypeMonitoringConfig(
            Outputs.AiFeatureStoreEntityTypeMonitoringConfigCategoricalThresholdConfig? categoricalThresholdConfig,

            Outputs.AiFeatureStoreEntityTypeMonitoringConfigImportFeaturesAnalysis? importFeaturesAnalysis,

            Outputs.AiFeatureStoreEntityTypeMonitoringConfigNumericalThresholdConfig? numericalThresholdConfig,

            Outputs.AiFeatureStoreEntityTypeMonitoringConfigSnapshotAnalysis? snapshotAnalysis)
        {
            CategoricalThresholdConfig = categoricalThresholdConfig;
            ImportFeaturesAnalysis = importFeaturesAnalysis;
            NumericalThresholdConfig = numericalThresholdConfig;
            SnapshotAnalysis = snapshotAnalysis;
        }
    }
}
