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
    public sealed class GetClusterClusterAutoscalingAutoProvisioningDefaultUpgradeSettingResult
    {
        /// <summary>
        /// Settings for blue-green upgrade strategy.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetClusterClusterAutoscalingAutoProvisioningDefaultUpgradeSettingBlueGreenSettingResult> BlueGreenSettings;
        /// <summary>
        /// The maximum number of nodes that can be created beyond the current size of the node pool during the upgrade process.
        /// </summary>
        public readonly int MaxSurge;
        /// <summary>
        /// The maximum number of nodes that can be simultaneously unavailable during the upgrade process.
        /// </summary>
        public readonly int MaxUnavailable;
        /// <summary>
        /// Update strategy of the node pool.
        /// </summary>
        public readonly string Strategy;

        [OutputConstructor]
        private GetClusterClusterAutoscalingAutoProvisioningDefaultUpgradeSettingResult(
            ImmutableArray<Outputs.GetClusterClusterAutoscalingAutoProvisioningDefaultUpgradeSettingBlueGreenSettingResult> blueGreenSettings,

            int maxSurge,

            int maxUnavailable,

            string strategy)
        {
            BlueGreenSettings = blueGreenSettings;
            MaxSurge = maxSurge;
            MaxUnavailable = maxUnavailable;
            Strategy = strategy;
        }
    }
}
