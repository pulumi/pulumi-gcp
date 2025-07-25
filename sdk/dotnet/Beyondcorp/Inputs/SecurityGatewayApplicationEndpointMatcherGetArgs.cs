// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Beyondcorp.Inputs
{

    public sealed class SecurityGatewayApplicationEndpointMatcherGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Required. Hostname of the application.
        /// </summary>
        [Input("hostname", required: true)]
        public Input<string> Hostname { get; set; } = null!;

        [Input("ports")]
        private InputList<int>? _ports;

        /// <summary>
        /// Optional. Ports of the application.
        /// </summary>
        public InputList<int> Ports
        {
            get => _ports ?? (_ports = new InputList<int>());
            set => _ports = value;
        }

        public SecurityGatewayApplicationEndpointMatcherGetArgs()
        {
        }
        public static new SecurityGatewayApplicationEndpointMatcherGetArgs Empty => new SecurityGatewayApplicationEndpointMatcherGetArgs();
    }
}
