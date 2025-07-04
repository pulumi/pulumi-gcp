// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.NetworkSecurity.Outputs
{

    [OutputType]
    public sealed class ServerTlsPolicyMtlsPolicy
    {
        /// <summary>
        /// Required if the policy is to be used with Traffic Director. For external HTTPS load balancers it must be empty.
        /// Defines the mechanism to obtain the Certificate Authority certificate to validate the client certificate.
        /// Structure is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.ServerTlsPolicyMtlsPolicyClientValidationCa> ClientValidationCas;
        /// <summary>
        /// When the client presents an invalid certificate or no certificate to the load balancer, the clientValidationMode specifies how the client connection is handled.
        /// Required if the policy is to be used with the external HTTPS load balancing. For Traffic Director it must be empty.
        /// Possible values are: `CLIENT_VALIDATION_MODE_UNSPECIFIED`, `ALLOW_INVALID_OR_MISSING_CLIENT_CERT`, `REJECT_INVALID`.
        /// </summary>
        public readonly string? ClientValidationMode;
        /// <summary>
        /// Reference to the TrustConfig from certificatemanager.googleapis.com namespace.
        /// If specified, the chain validation will be performed against certificates configured in the given TrustConfig.
        /// Allowed only if the policy is to be used with external HTTPS load balancers.
        /// </summary>
        public readonly string? ClientValidationTrustConfig;

        [OutputConstructor]
        private ServerTlsPolicyMtlsPolicy(
            ImmutableArray<Outputs.ServerTlsPolicyMtlsPolicyClientValidationCa> clientValidationCas,

            string? clientValidationMode,

            string? clientValidationTrustConfig)
        {
            ClientValidationCas = clientValidationCas;
            ClientValidationMode = clientValidationMode;
            ClientValidationTrustConfig = clientValidationTrustConfig;
        }
    }
}
