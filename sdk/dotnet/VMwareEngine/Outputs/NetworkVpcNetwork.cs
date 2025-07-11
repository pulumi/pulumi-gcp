// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.VMwareEngine.Outputs
{

    [OutputType]
    public sealed class NetworkVpcNetwork
    {
        /// <summary>
        /// (Output)
        /// The relative resource name of the service VPC network this VMware Engine network is attached to.
        /// For example: projects/123123/global/networks/my-network
        /// </summary>
        public readonly string? Network;
        /// <summary>
        /// VMware Engine network type.
        /// Possible values are: `LEGACY`, `STANDARD`.
        /// </summary>
        public readonly string? Type;

        [OutputConstructor]
        private NetworkVpcNetwork(
            string? network,

            string? type)
        {
            Network = network;
            Type = type;
        }
    }
}
