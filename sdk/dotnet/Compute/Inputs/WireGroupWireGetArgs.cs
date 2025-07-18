// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute.Inputs
{

    public sealed class WireGroupWireGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Indicates whether the wire group is administratively enabled.
        /// </summary>
        [Input("adminEnabled")]
        public Input<bool>? AdminEnabled { get; set; }

        [Input("endpoints")]
        private InputList<Inputs.WireGroupWireEndpointGetArgs>? _endpoints;

        /// <summary>
        /// Endpoints grouped by location, each mapping to interconnect configurations.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.WireGroupWireEndpointGetArgs> Endpoints
        {
            get => _endpoints ?? (_endpoints = new InputList<Inputs.WireGroupWireEndpointGetArgs>());
            set => _endpoints = value;
        }

        /// <summary>
        /// (Output)
        /// </summary>
        [Input("label")]
        public Input<string>? Label { get; set; }

        [Input("wireProperties")]
        private InputList<Inputs.WireGroupWireWirePropertyGetArgs>? _wireProperties;

        /// <summary>
        /// Default properties for wires within the group.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.WireGroupWireWirePropertyGetArgs> WireProperties
        {
            get => _wireProperties ?? (_wireProperties = new InputList<Inputs.WireGroupWireWirePropertyGetArgs>());
            set => _wireProperties = value;
        }

        public WireGroupWireGetArgs()
        {
        }
        public static new WireGroupWireGetArgs Empty => new WireGroupWireGetArgs();
    }
}
