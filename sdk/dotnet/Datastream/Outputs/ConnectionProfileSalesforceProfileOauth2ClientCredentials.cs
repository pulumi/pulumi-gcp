// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Datastream.Outputs
{

    [OutputType]
    public sealed class ConnectionProfileSalesforceProfileOauth2ClientCredentials
    {
        /// <summary>
        /// Client ID to use for authentication.
        /// </summary>
        public readonly string? ClientId;
        /// <summary>
        /// Client secret to use for authentication.
        /// </summary>
        public readonly string? ClientSecret;
        /// <summary>
        /// A reference to a Secret Manager resource name storing the client secret.
        /// </summary>
        public readonly string? SecretManagerStoredClientSecret;

        [OutputConstructor]
        private ConnectionProfileSalesforceProfileOauth2ClientCredentials(
            string? clientId,

            string? clientSecret,

            string? secretManagerStoredClientSecret)
        {
            ClientId = clientId;
            ClientSecret = clientSecret;
            SecretManagerStoredClientSecret = secretManagerStoredClientSecret;
        }
    }
}
