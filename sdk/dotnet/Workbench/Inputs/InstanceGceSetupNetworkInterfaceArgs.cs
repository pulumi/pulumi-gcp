// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Workbench.Inputs
{

    public sealed class InstanceGceSetupNetworkInterfaceArgs : global::Pulumi.ResourceArgs
    {
        [Input("accessConfigs")]
        private InputList<Inputs.InstanceGceSetupNetworkInterfaceAccessConfigArgs>? _accessConfigs;

        /// <summary>
        /// Optional. An array of configurations for this interface. Currently, only one access
        /// config, ONE_TO_ONE_NAT, is supported. If no accessConfigs specified, the
        /// instance will have an external internet access through an ephemeral
        /// external IP address.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.InstanceGceSetupNetworkInterfaceAccessConfigArgs> AccessConfigs
        {
            get => _accessConfigs ?? (_accessConfigs = new InputList<Inputs.InstanceGceSetupNetworkInterfaceAccessConfigArgs>());
            set => _accessConfigs = value;
        }

        /// <summary>
        /// Optional. The name of the VPC that this VM instance is in.
        /// </summary>
        [Input("network")]
        public Input<string>? Network { get; set; }

        /// <summary>
        /// Optional. The type of vNIC to be used on this interface. This
        /// may be gVNIC or VirtioNet.
        /// Possible values are: `VIRTIO_NET`, `GVNIC`.
        /// </summary>
        [Input("nicType")]
        public Input<string>? NicType { get; set; }

        /// <summary>
        /// Optional. The name of the subnet that this VM instance is in.
        /// </summary>
        [Input("subnet")]
        public Input<string>? Subnet { get; set; }

        public InstanceGceSetupNetworkInterfaceArgs()
        {
        }
        public static new InstanceGceSetupNetworkInterfaceArgs Empty => new InstanceGceSetupNetworkInterfaceArgs();
    }
}
