// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Container.Inputs
{

    public sealed class ClusterMonitoringConfigManagedPrometheusArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Configuration options for GKE Auto-Monitoring.
        /// </summary>
        [Input("autoMonitoringConfig")]
        public Input<Inputs.ClusterMonitoringConfigManagedPrometheusAutoMonitoringConfigArgs>? AutoMonitoringConfig { get; set; }

        /// <summary>
        /// Whether or not the managed collection is enabled.
        /// </summary>
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        public ClusterMonitoringConfigManagedPrometheusArgs()
        {
        }
        public static new ClusterMonitoringConfigManagedPrometheusArgs Empty => new ClusterMonitoringConfigManagedPrometheusArgs();
    }
}
