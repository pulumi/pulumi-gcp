// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Diagflow.Inputs
{

    public sealed class FulfillmentGenericWebServiceGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The password for HTTP Basic authentication.
        /// </summary>
        [Input("password")]
        public Input<string>? Password { get; set; }

        [Input("requestHeaders")]
        private InputMap<string>? _requestHeaders;

        /// <summary>
        /// The HTTP request headers to send together with fulfillment requests.
        /// </summary>
        public InputMap<string> RequestHeaders
        {
            get => _requestHeaders ?? (_requestHeaders = new InputMap<string>());
            set => _requestHeaders = value;
        }

        /// <summary>
        /// The fulfillment URI for receiving POST requests. It must use https protocol.
        /// </summary>
        [Input("uri", required: true)]
        public Input<string> Uri { get; set; } = null!;

        /// <summary>
        /// The user name for HTTP Basic authentication.
        /// </summary>
        [Input("username")]
        public Input<string>? Username { get; set; }

        public FulfillmentGenericWebServiceGetArgs()
        {
        }
        public static new FulfillmentGenericWebServiceGetArgs Empty => new FulfillmentGenericWebServiceGetArgs();
    }
}
