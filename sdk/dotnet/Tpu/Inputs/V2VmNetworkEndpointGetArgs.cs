// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Tpu.Inputs
{

    public sealed class V2VmNetworkEndpointGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("accessConfigs")]
        private InputList<Inputs.V2VmNetworkEndpointAccessConfigGetArgs>? _accessConfigs;

        /// <summary>
        /// (Output)
        /// The access config for the TPU worker.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.V2VmNetworkEndpointAccessConfigGetArgs> AccessConfigs
        {
            get => _accessConfigs ?? (_accessConfigs = new InputList<Inputs.V2VmNetworkEndpointAccessConfigGetArgs>());
            set => _accessConfigs = value;
        }

        /// <summary>
        /// (Output)
        /// The internal IP address of this network endpoint.
        /// </summary>
        [Input("ipAddress")]
        public Input<string>? IpAddress { get; set; }

        /// <summary>
        /// (Output)
        /// The port of this network endpoint.
        /// </summary>
        [Input("port")]
        public Input<int>? Port { get; set; }

        public V2VmNetworkEndpointGetArgs()
        {
        }
        public static new V2VmNetworkEndpointGetArgs Empty => new V2VmNetworkEndpointGetArgs();
    }
}