// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeHub.Inputs
{

    public sealed class FeatureSpecClusterupgradeGkeUpgradeOverrideUpgradeGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the upgrade, e.g., "k8s_control_plane". It should be a valid upgrade name. It must not exceet 99 characters.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Version of the upgrade, e.g., "1.22.1-gke.100". It should be a valid version. It must not exceet 99 characters.
        /// </summary>
        [Input("version", required: true)]
        public Input<string> Version { get; set; } = null!;

        public FeatureSpecClusterupgradeGkeUpgradeOverrideUpgradeGetArgs()
        {
        }
        public static new FeatureSpecClusterupgradeGkeUpgradeOverrideUpgradeGetArgs Empty => new FeatureSpecClusterupgradeGkeUpgradeOverrideUpgradeGetArgs();
    }
}
