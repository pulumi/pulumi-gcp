// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Workbench.Outputs
{

    [OutputType]
    public sealed class InstanceGceSetupNetworkInterface
    {
        /// <summary>
        /// Optional. The name of the VPC that this VM instance is in.
        /// </summary>
        public readonly string? Network;
        /// <summary>
        /// Optional. The type of vNIC to be used on this interface. This
        /// may be gVNIC or VirtioNet.
        /// Possible values are: `VIRTIO_NET`, `GVNIC`.
        /// </summary>
        public readonly string? NicType;
        /// <summary>
        /// Optional. The name of the subnet that this VM instance is in.
        /// </summary>
        public readonly string? Subnet;

        [OutputConstructor]
        private InstanceGceSetupNetworkInterface(
            string? network,

            string? nicType,

            string? subnet)
        {
            Network = network;
            NicType = nicType;
            Subnet = subnet;
        }
    }
}
