// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Tpu.Inputs
{

    public sealed class V2VmNetworkEndpointArgs : global::Pulumi.ResourceArgs
    {
        [Input("accessConfigs")]
        private InputList<Inputs.V2VmNetworkEndpointAccessConfigArgs>? _accessConfigs;

        /// <summary>
        /// (Output)
        /// The access config for the TPU worker.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.V2VmNetworkEndpointAccessConfigArgs> AccessConfigs
        {
            get => _accessConfigs ?? (_accessConfigs = new InputList<Inputs.V2VmNetworkEndpointAccessConfigArgs>());
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

        public V2VmNetworkEndpointArgs()
        {
        }
        public static new V2VmNetworkEndpointArgs Empty => new V2VmNetworkEndpointArgs();
    }
}
