// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Vertex.Inputs
{

    public sealed class AiFeatureStoreEntityTypeMonitoringConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Threshold for categorical features of anomaly detection. This is shared by all types of Featurestore Monitoring for categorical features (i.e. Features with type (Feature.ValueType) BOOL or STRING).
        /// Structure is documented below.
        /// </summary>
        [Input("categoricalThresholdConfig")]
        public Input<Inputs.AiFeatureStoreEntityTypeMonitoringConfigCategoricalThresholdConfigArgs>? CategoricalThresholdConfig { get; set; }

        /// <summary>
        /// The config for ImportFeatures Analysis Based Feature Monitoring.
        /// Structure is documented below.
        /// </summary>
        [Input("importFeaturesAnalysis")]
        public Input<Inputs.AiFeatureStoreEntityTypeMonitoringConfigImportFeaturesAnalysisArgs>? ImportFeaturesAnalysis { get; set; }

        /// <summary>
        /// Threshold for numerical features of anomaly detection. This is shared by all objectives of Featurestore Monitoring for numerical features (i.e. Features with type (Feature.ValueType) DOUBLE or INT64).
        /// Structure is documented below.
        /// </summary>
        [Input("numericalThresholdConfig")]
        public Input<Inputs.AiFeatureStoreEntityTypeMonitoringConfigNumericalThresholdConfigArgs>? NumericalThresholdConfig { get; set; }

        /// <summary>
        /// The config for Snapshot Analysis Based Feature Monitoring.
        /// Structure is documented below.
        /// </summary>
        [Input("snapshotAnalysis")]
        public Input<Inputs.AiFeatureStoreEntityTypeMonitoringConfigSnapshotAnalysisArgs>? SnapshotAnalysis { get; set; }

        public AiFeatureStoreEntityTypeMonitoringConfigArgs()
        {
        }
        public static new AiFeatureStoreEntityTypeMonitoringConfigArgs Empty => new AiFeatureStoreEntityTypeMonitoringConfigArgs();
    }
}
