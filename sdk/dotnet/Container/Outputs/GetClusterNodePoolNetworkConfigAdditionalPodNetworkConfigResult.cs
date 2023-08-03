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
    public sealed class GetClusterNodePoolNetworkConfigAdditionalPodNetworkConfigResult
    {
        public readonly int MaxPodsPerNode;
        public readonly string SecondaryPodRange;
        public readonly string Subnetwork;

        [OutputConstructor]
        private GetClusterNodePoolNetworkConfigAdditionalPodNetworkConfigResult(
            int maxPodsPerNode,

            string secondaryPodRange,

            string subnetwork)
        {
            MaxPodsPerNode = maxPodsPerNode;
            SecondaryPodRange = secondaryPodRange;
            Subnetwork = subnetwork;
        }
    }
}