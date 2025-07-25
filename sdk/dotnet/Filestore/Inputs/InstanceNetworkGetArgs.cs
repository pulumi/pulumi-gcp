// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Filestore.Inputs
{

    public sealed class InstanceNetworkGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The network connect mode of the Filestore instance.
        /// If not provided, the connect mode defaults to
        /// DIRECT_PEERING.
        /// Default value is `DIRECT_PEERING`.
        /// Possible values are: `DIRECT_PEERING`, `PRIVATE_SERVICE_ACCESS`, `PRIVATE_SERVICE_CONNECT`.
        /// </summary>
        [Input("connectMode")]
        public Input<string>? ConnectMode { get; set; }

        [Input("ipAddresses")]
        private InputList<string>? _ipAddresses;

        /// <summary>
        /// (Output)
        /// A list of IPv4 or IPv6 addresses.
        /// </summary>
        public InputList<string> IpAddresses
        {
            get => _ipAddresses ?? (_ipAddresses = new InputList<string>());
            set => _ipAddresses = value;
        }

        [Input("modes", required: true)]
        private InputList<string>? _modes;

        /// <summary>
        /// IP versions for which the instance has
        /// IP addresses assigned.
        /// Each value may be one of: `ADDRESS_MODE_UNSPECIFIED`, `MODE_IPV4`, `MODE_IPV6`.
        /// </summary>
        public InputList<string> Modes
        {
            get => _modes ?? (_modes = new InputList<string>());
            set => _modes = value;
        }

        /// <summary>
        /// The name of the GCE VPC network to which the
        /// instance is connected.
        /// </summary>
        [Input("network", required: true)]
        public Input<string> Network { get; set; } = null!;

        /// <summary>
        /// Private Service Connect configuration.
        /// Should only be set when connect_mode is PRIVATE_SERVICE_CONNECT.
        /// Structure is documented below.
        /// </summary>
        [Input("pscConfig")]
        public Input<Inputs.InstanceNetworkPscConfigGetArgs>? PscConfig { get; set; }

        /// <summary>
        /// A /29 CIDR block that identifies the range of IP
        /// addresses reserved for this instance.
        /// </summary>
        [Input("reservedIpRange")]
        public Input<string>? ReservedIpRange { get; set; }

        public InstanceNetworkGetArgs()
        {
        }
        public static new InstanceNetworkGetArgs Empty => new InstanceNetworkGetArgs();
    }
}
