// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.EdgeContainer.Inputs
{

    public sealed class VpnConnectionDetailArgs : global::Pulumi.ResourceArgs
    {
        [Input("cloudRouters")]
        private InputList<Inputs.VpnConnectionDetailCloudRouterArgs>? _cloudRouters;

        /// <summary>
        /// (Output)
        /// The Cloud Router info.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.VpnConnectionDetailCloudRouterArgs> CloudRouters
        {
            get => _cloudRouters ?? (_cloudRouters = new InputList<Inputs.VpnConnectionDetailCloudRouterArgs>());
            set => _cloudRouters = value;
        }

        [Input("cloudVpns")]
        private InputList<Inputs.VpnConnectionDetailCloudVpnArgs>? _cloudVpns;

        /// <summary>
        /// (Output)
        /// Each connection has multiple Cloud VPN gateways.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.VpnConnectionDetailCloudVpnArgs> CloudVpns
        {
            get => _cloudVpns ?? (_cloudVpns = new InputList<Inputs.VpnConnectionDetailCloudVpnArgs>());
            set => _cloudVpns = value;
        }

        /// <summary>
        /// (Output)
        /// The error message. This is only populated when state=ERROR.
        /// </summary>
        [Input("error")]
        public Input<string>? Error { get; set; }

        /// <summary>
        /// (Output)
        /// The current connection state.
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        public VpnConnectionDetailArgs()
        {
        }
        public static new VpnConnectionDetailArgs Empty => new VpnConnectionDetailArgs();
    }
}