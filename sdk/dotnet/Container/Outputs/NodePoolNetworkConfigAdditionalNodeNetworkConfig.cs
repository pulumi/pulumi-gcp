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
    public sealed class NodePoolNetworkConfigAdditionalNodeNetworkConfig
    {
        /// <summary>
        /// Name of the VPC where the additional interface belongs.
        /// </summary>
        public readonly string? Network;
        /// <summary>
        /// Name of the subnetwork where the additional interface belongs.
        /// </summary>
        public readonly string? Subnetwork;

        [OutputConstructor]
        private NodePoolNetworkConfigAdditionalNodeNetworkConfig(
            string? network,

            string? subnetwork)
        {
            Network = network;
            Subnetwork = subnetwork;
        }
    }
}