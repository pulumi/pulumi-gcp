// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeOnPrem.Inputs
{

    public sealed class VMwareClusterNetworkConfigStaticIpConfigGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("ipBlocks", required: true)]
        private InputList<Inputs.VMwareClusterNetworkConfigStaticIpConfigIpBlockGetArgs>? _ipBlocks;

        /// <summary>
        /// Represents the configuration values for static IP allocation to nodes.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.VMwareClusterNetworkConfigStaticIpConfigIpBlockGetArgs> IpBlocks
        {
            get => _ipBlocks ?? (_ipBlocks = new InputList<Inputs.VMwareClusterNetworkConfigStaticIpConfigIpBlockGetArgs>());
            set => _ipBlocks = value;
        }

        public VMwareClusterNetworkConfigStaticIpConfigGetArgs()
        {
        }
        public static new VMwareClusterNetworkConfigStaticIpConfigGetArgs Empty => new VMwareClusterNetworkConfigStaticIpConfigGetArgs();
    }
}
