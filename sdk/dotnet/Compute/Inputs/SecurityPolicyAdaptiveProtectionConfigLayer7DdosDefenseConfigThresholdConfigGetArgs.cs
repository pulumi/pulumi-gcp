// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute.Inputs
{

    public sealed class SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigThresholdConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Confidence threshold above which Adaptive Protection's auto-deploy takes actions.
        /// </summary>
        [Input("autoDeployConfidenceThreshold")]
        public Input<double>? AutoDeployConfidenceThreshold { get; set; }

        /// <summary>
        /// Duration over which Adaptive Protection's auto-deployed actions last.
        /// </summary>
        [Input("autoDeployExpirationSec")]
        public Input<int>? AutoDeployExpirationSec { get; set; }

        /// <summary>
        /// Impacted baseline threshold below which Adaptive Protection's auto-deploy takes actions.
        /// </summary>
        [Input("autoDeployImpactedBaselineThreshold")]
        public Input<double>? AutoDeployImpactedBaselineThreshold { get; set; }

        /// <summary>
        /// Load threshold above which Adaptive Protection automatically deploy threshold based on the backend load threshold and detect a new rule during an alerted attack.
        /// </summary>
        [Input("autoDeployLoadThreshold")]
        public Input<double>? AutoDeployLoadThreshold { get; set; }

        /// <summary>
        /// Detection threshold based on absolute QPS.
        /// </summary>
        [Input("detectionAbsoluteQps")]
        public Input<double>? DetectionAbsoluteQps { get; set; }

        /// <summary>
        /// Detection threshold based on the backend service's load.
        /// </summary>
        [Input("detectionLoadThreshold")]
        public Input<double>? DetectionLoadThreshold { get; set; }

        /// <summary>
        /// Detection threshold based on QPS relative to the average of baseline traffic.
        /// </summary>
        [Input("detectionRelativeToBaselineQps")]
        public Input<double>? DetectionRelativeToBaselineQps { get; set; }

        /// <summary>
        /// The name of config. The name must be 1-63 characters long, and comply with RFC1035. The name must be unique within the security policy.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("trafficGranularityConfigs")]
        private InputList<Inputs.SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigThresholdConfigTrafficGranularityConfigGetArgs>? _trafficGranularityConfigs;

        /// <summary>
        /// Configuration options for enabling Adaptive Protection to work on the specified service granularity. Structure is documented below.
        /// </summary>
        public InputList<Inputs.SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigThresholdConfigTrafficGranularityConfigGetArgs> TrafficGranularityConfigs
        {
            get => _trafficGranularityConfigs ?? (_trafficGranularityConfigs = new InputList<Inputs.SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigThresholdConfigTrafficGranularityConfigGetArgs>());
            set => _trafficGranularityConfigs = value;
        }

        public SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigThresholdConfigGetArgs()
        {
        }
        public static new SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigThresholdConfigGetArgs Empty => new SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigThresholdConfigGetArgs();
    }
}
