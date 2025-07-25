// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.NetworkSecurity.Inputs
{

    public sealed class ServerTlsPolicyMtlsPolicyClientValidationCaArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Optional if policy is to be used with Traffic Director. For external HTTPS load balancer must be empty.
        /// Defines a mechanism to provision server identity (public and private keys). Cannot be combined with allowOpen as a permissive mode that allows both plain text and TLS is not supported.
        /// Structure is documented below.
        /// </summary>
        [Input("certificateProviderInstance")]
        public Input<Inputs.ServerTlsPolicyMtlsPolicyClientValidationCaCertificateProviderInstanceArgs>? CertificateProviderInstance { get; set; }

        /// <summary>
        /// gRPC specific configuration to access the gRPC server to obtain the cert and private key.
        /// Structure is documented below.
        /// </summary>
        [Input("grpcEndpoint")]
        public Input<Inputs.ServerTlsPolicyMtlsPolicyClientValidationCaGrpcEndpointArgs>? GrpcEndpoint { get; set; }

        public ServerTlsPolicyMtlsPolicyClientValidationCaArgs()
        {
        }
        public static new ServerTlsPolicyMtlsPolicyClientValidationCaArgs Empty => new ServerTlsPolicyMtlsPolicyClientValidationCaArgs();
    }
}
