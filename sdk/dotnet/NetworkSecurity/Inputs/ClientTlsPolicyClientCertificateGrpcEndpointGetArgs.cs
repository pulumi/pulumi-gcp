// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.NetworkSecurity.Inputs
{

    public sealed class ClientTlsPolicyClientCertificateGrpcEndpointGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The target URI of the gRPC endpoint. Only UDS path is supported, and should start with "unix:".
        /// </summary>
        [Input("targetUri", required: true)]
        public Input<string> TargetUri { get; set; } = null!;

        public ClientTlsPolicyClientCertificateGrpcEndpointGetArgs()
        {
        }
        public static new ClientTlsPolicyClientCertificateGrpcEndpointGetArgs Empty => new ClientTlsPolicyClientCertificateGrpcEndpointGetArgs();
    }
}
