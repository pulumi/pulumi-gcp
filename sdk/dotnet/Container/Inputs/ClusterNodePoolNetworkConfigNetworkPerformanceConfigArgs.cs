// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Container.Inputs
{

    public sealed class ClusterNodePoolNetworkConfigNetworkPerformanceConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the total network bandwidth tier for the NodePool.
        /// </summary>
        [Input("totalEgressBandwidthTier", required: true)]
        public Input<string> TotalEgressBandwidthTier { get; set; } = null!;

        public ClusterNodePoolNetworkConfigNetworkPerformanceConfigArgs()
        {
        }
        public static new ClusterNodePoolNetworkConfigNetworkPerformanceConfigArgs Empty => new ClusterNodePoolNetworkConfigNetworkPerformanceConfigArgs();
    }
}