// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeOnPrem.Inputs
{

    public sealed class BareMetalClusterNetworkConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enables the use of advanced Anthos networking features, such as Bundled
        /// Load Balancing with BGP or the egress NAT gateway.
        /// Setting configuration for advanced networking features will automatically
        /// set this flag.
        /// </summary>
        [Input("advancedNetworking")]
        public Input<bool>? AdvancedNetworking { get; set; }

        /// <summary>
        /// A nested object resource
        /// Structure is documented below.
        /// </summary>
        [Input("islandModeCidr")]
        public Input<Inputs.BareMetalClusterNetworkConfigIslandModeCidrGetArgs>? IslandModeCidr { get; set; }

        /// <summary>
        /// Configuration for multiple network interfaces.
        /// Structure is documented below.
        /// </summary>
        [Input("multipleNetworkInterfacesConfig")]
        public Input<Inputs.BareMetalClusterNetworkConfigMultipleNetworkInterfacesConfigGetArgs>? MultipleNetworkInterfacesConfig { get; set; }

        /// <summary>
        /// Configuration for SR-IOV.
        /// Structure is documented below.
        /// </summary>
        [Input("srIovConfig")]
        public Input<Inputs.BareMetalClusterNetworkConfigSrIovConfigGetArgs>? SrIovConfig { get; set; }

        public BareMetalClusterNetworkConfigGetArgs()
        {
        }
        public static new BareMetalClusterNetworkConfigGetArgs Empty => new BareMetalClusterNetworkConfigGetArgs();
    }
}