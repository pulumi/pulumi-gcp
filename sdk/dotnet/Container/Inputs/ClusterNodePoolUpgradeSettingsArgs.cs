// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Container.Inputs
{

    public sealed class ClusterNodePoolUpgradeSettingsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Settings for blue-green upgrade strategy. To be specified when strategy is set to BLUE_GREEN. Structure is documented below.
        /// </summary>
        [Input("blueGreenSettings")]
        public Input<Inputs.ClusterNodePoolUpgradeSettingsBlueGreenSettingsArgs>? BlueGreenSettings { get; set; }

        /// <summary>
        /// The maximum number of nodes that can be created beyond the current size of the node pool during the upgrade process. To be used when strategy is set to SURGE. Default is 0.
        /// </summary>
        [Input("maxSurge")]
        public Input<int>? MaxSurge { get; set; }

        /// <summary>
        /// The maximum number of nodes that can be simultaneously unavailable during the upgrade process. To be used when strategy is set to SURGE. Default is 0.
        /// </summary>
        [Input("maxUnavailable")]
        public Input<int>? MaxUnavailable { get; set; }

        /// <summary>
        /// Strategy used for node pool update. Strategy can only be one of BLUE_GREEN or SURGE. The default is value is SURGE.
        /// </summary>
        [Input("strategy")]
        public Input<string>? Strategy { get; set; }

        public ClusterNodePoolUpgradeSettingsArgs()
        {
        }
        public static new ClusterNodePoolUpgradeSettingsArgs Empty => new ClusterNodePoolUpgradeSettingsArgs();
    }
}
