// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Container.Inputs
{

    public sealed class ClusterNetworkPerformanceConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the total network bandwidth tier for NodePools in the cluster.
        /// </summary>
        [Input("totalEgressBandwidthTier", required: true)]
        public Input<string> TotalEgressBandwidthTier { get; set; } = null!;

        public ClusterNetworkPerformanceConfigArgs()
        {
        }
        public static new ClusterNetworkPerformanceConfigArgs Empty => new ClusterNetworkPerformanceConfigArgs();
    }
}
