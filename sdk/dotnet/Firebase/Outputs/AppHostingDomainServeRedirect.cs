// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Firebase.Outputs
{

    [OutputType]
    public sealed class AppHostingDomainServeRedirect
    {
        /// <summary>
        /// The status code to use in a redirect response. Must be a valid HTTP 3XX
        /// status code. Defaults to 302 if not present.
        /// </summary>
        public readonly string? Status;
        /// <summary>
        /// The URI of the redirect's intended destination. This URI will be
        /// prepended to the original request path. URI without a scheme are
        /// assumed to be HTTPS.
        /// </summary>
        public readonly string Uri;

        [OutputConstructor]
        private AppHostingDomainServeRedirect(
            string? status,

            string uri)
        {
            Status = status;
            Uri = uri;
        }
    }
}
