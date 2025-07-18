// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeOnPrem.Inputs
{

    public sealed class BareMetalClusterNetworkConfigMultipleNetworkInterfacesConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether to enable multiple network interfaces for your pods.
        /// When set network_config.advanced_networking is automatically
        /// set to true.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        public BareMetalClusterNetworkConfigMultipleNetworkInterfacesConfigGetArgs()
        {
        }
        public static new BareMetalClusterNetworkConfigMultipleNetworkInterfacesConfigGetArgs Empty => new BareMetalClusterNetworkConfigMultipleNetworkInterfacesConfigGetArgs();
    }
}
