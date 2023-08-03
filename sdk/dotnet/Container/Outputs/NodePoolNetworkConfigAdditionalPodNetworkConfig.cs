// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Container.Outputs
{

    [OutputType]
    public sealed class NodePoolNetworkConfigAdditionalPodNetworkConfig
    {
        /// <summary>
        /// The maximum number of pods per node which use this pod network.
        /// </summary>
        public readonly int? MaxPodsPerNode;
        /// <summary>
        /// The name of the secondary range on the subnet which provides IP address for this pod range.
        /// </summary>
        public readonly string? SecondaryPodRange;
        /// <summary>
        /// Name of the subnetwork where the additional pod network belongs.
        /// </summary>
        public readonly string? Subnetwork;

        [OutputConstructor]
        private NodePoolNetworkConfigAdditionalPodNetworkConfig(
            int? maxPodsPerNode,

            string? secondaryPodRange,

            string? subnetwork)
        {
            MaxPodsPerNode = maxPodsPerNode;
            SecondaryPodRange = secondaryPodRange;
            Subnetwork = subnetwork;
        }
    }
}