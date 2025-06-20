// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Diagflow.Outputs
{

    [OutputType]
    public sealed class CxToolOpenApiSpecAuthenticationOauthConfig
    {
        /// <summary>
        /// The client ID from the OAuth provider.
        /// </summary>
        public readonly string ClientId;
        /// <summary>
        /// Optional. The client secret from the OAuth provider. If the `secretVersionForClientSecret` field is set, this field will be ignored.
        /// **Note**: This property is sensitive and will not be displayed in the plan.
        /// </summary>
        public readonly string? ClientSecret;
        /// <summary>
        /// OAuth grant types.
        /// See [OauthGrantType](https://cloud.google.com/dialogflow/cx/docs/reference/rest/v3/projects.locations.agents.tools#oauthgranttype) for valid values
        /// </summary>
        public readonly string OauthGrantType;
        /// <summary>
        /// Optional. The OAuth scopes to grant.
        /// </summary>
        public readonly ImmutableArray<string> Scopes;
        /// <summary>
        /// Optional. The name of the SecretManager secret version resource storing the client secret.
        /// If this field is set, the clientSecret field will be ignored.
        /// Format: projects/{project}/secrets/{secret}/versions/{version}
        /// </summary>
        public readonly string? SecretVersionForClientSecret;
        /// <summary>
        /// The token endpoint in the OAuth provider to exchange for an access token.
        /// </summary>
        public readonly string TokenEndpoint;

        [OutputConstructor]
        private CxToolOpenApiSpecAuthenticationOauthConfig(
            string clientId,

            string? clientSecret,

            string oauthGrantType,

            ImmutableArray<string> scopes,

            string? secretVersionForClientSecret,

            string tokenEndpoint)
        {
            ClientId = clientId;
            ClientSecret = clientSecret;
            OauthGrantType = oauthGrantType;
            Scopes = scopes;
            SecretVersionForClientSecret = secretVersionForClientSecret;
            TokenEndpoint = tokenEndpoint;
        }
    }
}
