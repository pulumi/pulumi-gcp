// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.ApplicationIntegration.Outputs
{

    [OutputType]
    public sealed class AuthConfigDecryptedCredentialOidcToken
    {
        /// <summary>
        /// Audience to be used when generating OIDC token. The audience claim identifies the recipients that the JWT is intended for.
        /// </summary>
        public readonly string? Audience;
        /// <summary>
        /// The service account email to be used as the identity for the token.
        /// </summary>
        public readonly string? ServiceAccountEmail;
        /// <summary>
        /// (Output)
        /// ID token obtained for the service account.
        /// </summary>
        public readonly string? Token;
        /// <summary>
        /// (Output)
        /// The approximate time until the token retrieved is valid.
        /// A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
        /// </summary>
        public readonly string? TokenExpireTime;

        [OutputConstructor]
        private AuthConfigDecryptedCredentialOidcToken(
            string? audience,

            string? serviceAccountEmail,

            string? token,

            string? tokenExpireTime)
        {
            Audience = audience;
            ServiceAccountEmail = serviceAccountEmail;
            Token = token;
            TokenExpireTime = tokenExpireTime;
        }
    }
}
