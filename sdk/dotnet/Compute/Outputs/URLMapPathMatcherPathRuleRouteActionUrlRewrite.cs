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
    public sealed class URLMapPathMatcherPathRuleRouteActionUrlRewrite
    {
        /// <summary>
        /// Prior to forwarding the request to the selected service, the request's host header is replaced
        /// with contents of hostRewrite.
        /// The value must be between 1 and 255 characters.
        /// </summary>
        public readonly string? HostRewrite;
        /// <summary>
        /// Prior to forwarding the request to the selected backend service, the matching portion of the
        /// request's path is replaced by pathPrefixRewrite.
        /// The value must be between 1 and 1024 characters.
        /// </summary>
        public readonly string? PathPrefixRewrite;

        [OutputConstructor]
        private URLMapPathMatcherPathRuleRouteActionUrlRewrite(
            string? hostRewrite,

            string? pathPrefixRewrite)
        {
            HostRewrite = hostRewrite;
            PathPrefixRewrite = pathPrefixRewrite;
        }
    }
}
