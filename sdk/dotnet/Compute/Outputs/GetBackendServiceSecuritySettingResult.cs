// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute.Outputs
{

    [OutputType]
    public sealed class GetBackendServiceSecuritySettingResult
    {
        /// <summary>
        /// The configuration needed to generate a signature for access to private storage buckets that support AWS's Signature Version 4 for authentication.
        /// Allowed only for INTERNET_IP_PORT and INTERNET_FQDN_PORT NEG backends.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetBackendServiceSecuritySettingAwsV4AuthenticationResult> AwsV4Authentications;
        /// <summary>
        /// ClientTlsPolicy is a resource that specifies how a client should authenticate
        /// connections to backends of a service. This resource itself does not affect
        /// configuration unless it is attached to a backend service resource.
        /// </summary>
        public readonly string ClientTlsPolicy;
        /// <summary>
        /// A list of alternate names to verify the subject identity in the certificate.
        /// If specified, the client will verify that the server certificate's subject
        /// alt name matches one of the specified values.
        /// </summary>
        public readonly ImmutableArray<string> SubjectAltNames;

        [OutputConstructor]
        private GetBackendServiceSecuritySettingResult(
            ImmutableArray<Outputs.GetBackendServiceSecuritySettingAwsV4AuthenticationResult> awsV4Authentications,

            string clientTlsPolicy,

            ImmutableArray<string> subjectAltNames)
        {
            AwsV4Authentications = awsV4Authentications;
            ClientTlsPolicy = clientTlsPolicy;
            SubjectAltNames = subjectAltNames;
        }
    }
}
