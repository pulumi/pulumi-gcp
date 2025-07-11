// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeOnPrem.Outputs
{

    [OutputType]
    public sealed class BareMetalClusterNetworkConfig
    {
        /// <summary>
        /// Enables the use of advanced Anthos networking features, such as Bundled
        /// Load Balancing with BGP or the egress NAT gateway.
        /// Setting configuration for advanced networking features will automatically
        /// set this flag.
        /// </summary>
        public readonly bool? AdvancedNetworking;
        /// <summary>
        /// A nested object resource.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.BareMetalClusterNetworkConfigIslandModeCidr? IslandModeCidr;
        /// <summary>
        /// Configuration for multiple network interfaces.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.BareMetalClusterNetworkConfigMultipleNetworkInterfacesConfig? MultipleNetworkInterfacesConfig;
        /// <summary>
        /// Configuration for SR-IOV.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.BareMetalClusterNetworkConfigSrIovConfig? SrIovConfig;

        [OutputConstructor]
        private BareMetalClusterNetworkConfig(
            bool? advancedNetworking,

            Outputs.BareMetalClusterNetworkConfigIslandModeCidr? islandModeCidr,

            Outputs.BareMetalClusterNetworkConfigMultipleNetworkInterfacesConfig? multipleNetworkInterfacesConfig,

            Outputs.BareMetalClusterNetworkConfigSrIovConfig? srIovConfig)
        {
            AdvancedNetworking = advancedNetworking;
            IslandModeCidr = islandModeCidr;
            MultipleNetworkInterfacesConfig = multipleNetworkInterfacesConfig;
            SrIovConfig = srIovConfig;
        }
    }
}
