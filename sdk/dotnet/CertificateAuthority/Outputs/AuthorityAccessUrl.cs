// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CertificateAuthority.Outputs
{

    [OutputType]
    public sealed class AuthorityAccessUrl
    {
        /// <summary>
        /// (Output)
        /// The URL where this CertificateAuthority's CA certificate is published. This will only be
        /// set for CAs that have been activated.
        /// </summary>
        public readonly string? CaCertificateAccessUrl;
        /// <summary>
        /// (Output)
        /// The URL where this CertificateAuthority's CRLs are published. This will only be set for
        /// CAs that have been activated.
        /// </summary>
        public readonly ImmutableArray<string> CrlAccessUrls;

        [OutputConstructor]
        private AuthorityAccessUrl(
            string? caCertificateAccessUrl,

            ImmutableArray<string> crlAccessUrls)
        {
            CaCertificateAccessUrl = caCertificateAccessUrl;
            CrlAccessUrls = crlAccessUrls;
        }
    }
}
