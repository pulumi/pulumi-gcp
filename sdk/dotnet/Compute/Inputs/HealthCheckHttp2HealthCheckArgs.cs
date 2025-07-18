// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute.Inputs
{

    public sealed class HealthCheckHttp2HealthCheckArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The value of the host header in the HTTP2 health check request.
        /// If left empty (default value), the public IP on behalf of which this health
        /// check is performed will be used.
        /// </summary>
        [Input("host")]
        public Input<string>? Host { get; set; }

        /// <summary>
        /// The TCP port number for the HTTP2 health check request.
        /// The default value is 443.
        /// </summary>
        [Input("port")]
        public Input<int>? Port { get; set; }

        /// <summary>
        /// Port name as defined in InstanceGroup#NamedPort#name. If both port and
        /// port_name are defined, port takes precedence.
        /// </summary>
        [Input("portName")]
        public Input<string>? PortName { get; set; }

        /// <summary>
        /// Specifies how port is selected for health checking, can be one of the
        /// following values:
        /// 
        ///   * 'USE_FIXED_PORT': The port number in 'port' is used for health checking.
        /// 
        ///   * 'USE_NAMED_PORT': The 'portName' is used for health checking.
        /// 
        ///   * 'USE_SERVING_PORT': For NetworkEndpointGroup, the port specified for each
        ///   network endpoint is used for health checking. For other backends, the
        ///   port or named port specified in the Backend Service is used for health
        ///   checking.
        /// 
        /// If not specified, HTTP2 health check follows behavior specified in 'port' and
        /// 'portName' fields. Possible values: ["USE_FIXED_PORT", "USE_NAMED_PORT", "USE_SERVING_PORT"]
        /// </summary>
        [Input("portSpecification")]
        public Input<string>? PortSpecification { get; set; }

        /// <summary>
        /// Specifies the type of proxy header to append before sending data to the
        /// backend. Default value: "NONE" Possible values: ["NONE", "PROXY_V1"]
        /// </summary>
        [Input("proxyHeader")]
        public Input<string>? ProxyHeader { get; set; }

        /// <summary>
        /// The request path of the HTTP2 health check request.
        /// The default value is /.
        /// </summary>
        [Input("requestPath")]
        public Input<string>? RequestPath { get; set; }

        /// <summary>
        /// The bytes to match against the beginning of the response data. If left empty
        /// (the default value), any response will indicate health. The response data
        /// can only be ASCII.
        /// </summary>
        [Input("response")]
        public Input<string>? Response { get; set; }

        public HealthCheckHttp2HealthCheckArgs()
        {
        }
        public static new HealthCheckHttp2HealthCheckArgs Empty => new HealthCheckHttp2HealthCheckArgs();
    }
}
