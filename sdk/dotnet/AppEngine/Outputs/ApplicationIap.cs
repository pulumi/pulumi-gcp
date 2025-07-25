// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.AppEngine.Outputs
{

    [OutputType]
    public sealed class ApplicationIap
    {
        /// <summary>
        /// (Optional) Whether the serving infrastructure will authenticate and authorize all incoming requests. 
        /// (default is false)
        /// </summary>
        public readonly bool? Enabled;
        /// <summary>
        /// OAuth2 client ID to use for the authentication flow.
        /// </summary>
        public readonly string Oauth2ClientId;
        /// <summary>
        /// OAuth2 client secret to use for the authentication flow.
        /// The SHA-256 hash of the value is returned in the oauth2ClientSecretSha256 field.
        /// </summary>
        public readonly string Oauth2ClientSecret;
        /// <summary>
        /// Hex-encoded SHA-256 hash of the client secret.
        /// </summary>
        public readonly string? Oauth2ClientSecretSha256;

        [OutputConstructor]
        private ApplicationIap(
            bool? enabled,

            string oauth2ClientId,

            string oauth2ClientSecret,

            string? oauth2ClientSecretSha256)
        {
            Enabled = enabled;
            Oauth2ClientId = oauth2ClientId;
            Oauth2ClientSecret = oauth2ClientSecret;
            Oauth2ClientSecretSha256 = oauth2ClientSecretSha256;
        }
    }
}
