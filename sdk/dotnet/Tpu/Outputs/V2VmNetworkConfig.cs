// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Tpu.Outputs
{

    [OutputType]
    public sealed class V2VmNetworkConfig
    {
        /// <summary>
        /// Allows the TPU node to send and receive packets with non-matching destination or source
        /// IPs. This is required if you plan to use the TPU workers to forward routes.
        /// </summary>
        public readonly bool? CanIpForward;
        /// <summary>
        /// Indicates that external IP addresses would be associated with the TPU workers. If set to
        /// false, the specified subnetwork or network should have Private Google Access enabled.
        /// </summary>
        public readonly bool? EnableExternalIps;
        /// <summary>
        /// The name of the network for the TPU node. It must be a preexisting Google Compute Engine
        /// network. If none is provided, "default" will be used.
        /// </summary>
        public readonly string? Network;
        /// <summary>
        /// Specifies networking queue count for TPU VM instance's network interface.
        /// </summary>
        public readonly int? QueueCount;
        /// <summary>
        /// The name of the subnetwork for the TPU node. It must be a preexisting Google Compute
        /// Engine subnetwork. If none is provided, "default" will be used.
        /// </summary>
        public readonly string? Subnetwork;

        [OutputConstructor]
        private V2VmNetworkConfig(
            bool? canIpForward,

            bool? enableExternalIps,

            string? network,

            int? queueCount,

            string? subnetwork)
        {
            CanIpForward = canIpForward;
            EnableExternalIps = enableExternalIps;
            Network = network;
            QueueCount = queueCount;
            Subnetwork = subnetwork;
        }
    }
}
