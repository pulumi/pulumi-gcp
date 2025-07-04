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
    public sealed class SecurityPolicyAdaptiveProtectionConfig
    {
        /// <summary>
        /// Configuration for [Automatically deploy Adaptive Protection suggested rules](https://cloud.google.com/armor/docs/adaptive-protection-auto-deploy?hl=en). Structure is documented below.
        /// 
        /// &lt;a name="nested_layer_7_ddos_defense_config"&gt;&lt;/a&gt;The `layer_7_ddos_defense_config` block supports:
        /// </summary>
        public readonly Outputs.SecurityPolicyAdaptiveProtectionConfigAutoDeployConfig? AutoDeployConfig;
        /// <summary>
        /// Configuration for [Google Cloud Armor Adaptive Protection Layer 7 DDoS Defense](https://cloud.google.com/armor/docs/adaptive-protection-overview?hl=en). Structure is documented below.
        /// </summary>
        public readonly Outputs.SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfig? Layer7DdosDefenseConfig;

        [OutputConstructor]
        private SecurityPolicyAdaptiveProtectionConfig(
            Outputs.SecurityPolicyAdaptiveProtectionConfigAutoDeployConfig? autoDeployConfig,

            Outputs.SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfig? layer7DdosDefenseConfig)
        {
            AutoDeployConfig = autoDeployConfig;
            Layer7DdosDefenseConfig = layer7DdosDefenseConfig;
        }
    }
}
