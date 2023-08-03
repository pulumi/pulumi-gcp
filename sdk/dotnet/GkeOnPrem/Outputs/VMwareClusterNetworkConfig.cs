// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeOnPrem.Outputs
{

    [OutputType]
    public sealed class VMwareClusterNetworkConfig
    {
        /// <summary>
        /// Configuration for control plane V2 mode.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.VMwareClusterNetworkConfigControlPlaneV2Config? ControlPlaneV2Config;
        /// <summary>
        /// Configuration settings for a DHCP IP configuration.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.VMwareClusterNetworkConfigDhcpIpConfig? DhcpIpConfig;
        /// <summary>
        /// Represents common network settings irrespective of the host's IP address.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.VMwareClusterNetworkConfigHostConfig? HostConfig;
        /// <summary>
        /// All pods in the cluster are assigned an RFC1918 IPv4 address from these ranges.
        /// Only a single range is supported. This field cannot be changed after creation.
        /// </summary>
        public readonly ImmutableArray<string> PodAddressCidrBlocks;
        /// <summary>
        /// All services in the cluster are assigned an RFC1918 IPv4 address
        /// from these ranges. Only a single range is supported.. This field
        /// cannot be changed after creation.
        /// </summary>
        public readonly ImmutableArray<string> ServiceAddressCidrBlocks;
        /// <summary>
        /// Configuration settings for a static IP configuration.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.VMwareClusterNetworkConfigStaticIpConfig? StaticIpConfig;
        /// <summary>
        /// (Output)
        /// vcenter_network specifies vCenter network name. Inherited from the admin cluster.
        /// </summary>
        public readonly string? VcenterNetwork;

        [OutputConstructor]
        private VMwareClusterNetworkConfig(
            Outputs.VMwareClusterNetworkConfigControlPlaneV2Config? controlPlaneV2Config,

            Outputs.VMwareClusterNetworkConfigDhcpIpConfig? dhcpIpConfig,

            Outputs.VMwareClusterNetworkConfigHostConfig? hostConfig,

            ImmutableArray<string> podAddressCidrBlocks,

            ImmutableArray<string> serviceAddressCidrBlocks,

            Outputs.VMwareClusterNetworkConfigStaticIpConfig? staticIpConfig,

            string? vcenterNetwork)
        {
            ControlPlaneV2Config = controlPlaneV2Config;
            DhcpIpConfig = dhcpIpConfig;
            HostConfig = hostConfig;
            PodAddressCidrBlocks = podAddressCidrBlocks;
            ServiceAddressCidrBlocks = serviceAddressCidrBlocks;
            StaticIpConfig = staticIpConfig;
            VcenterNetwork = vcenterNetwork;
        }
    }
}