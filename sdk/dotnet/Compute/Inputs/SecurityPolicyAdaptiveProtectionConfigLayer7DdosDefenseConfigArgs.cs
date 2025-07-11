// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute.Inputs
{

    public sealed class SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// If set to true, enables CAAP for L7 DDoS detection.
        /// </summary>
        [Input("enable")]
        public Input<bool>? Enable { get; set; }

        /// <summary>
        /// Rule visibility. Supported values include: "STANDARD", "PREMIUM".
        /// </summary>
        [Input("ruleVisibility")]
        public Input<string>? RuleVisibility { get; set; }

        [Input("thresholdConfigs")]
        private InputList<Inputs.SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigThresholdConfigArgs>? _thresholdConfigs;

        /// <summary>
        /// Configuration options for layer7 adaptive protection for various customizable thresholds.
        /// </summary>
        public InputList<Inputs.SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigThresholdConfigArgs> ThresholdConfigs
        {
            get => _thresholdConfigs ?? (_thresholdConfigs = new InputList<Inputs.SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigThresholdConfigArgs>());
            set => _thresholdConfigs = value;
        }

        public SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigArgs()
        {
        }
        public static new SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigArgs Empty => new SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigArgs();
    }
}
