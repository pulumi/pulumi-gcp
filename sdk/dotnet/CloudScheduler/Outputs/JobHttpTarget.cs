// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CloudScheduler.Outputs
{

    [OutputType]
    public sealed class JobHttpTarget
    {
        /// <summary>
        /// HTTP request body.
        /// A request body is allowed only if the HTTP method is POST, PUT, or PATCH.
        /// It is an error to set body on a job with an incompatible HttpMethod.
        /// A base64-encoded string.
        /// </summary>
        public readonly string? Body;
        /// <summary>
        /// This map contains the header field names and values.
        /// Repeated headers are not supported, but a header value can contain commas.
        /// </summary>
        public readonly ImmutableDictionary<string, string>? Headers;
        /// <summary>
        /// Which HTTP method to use for the request.
        /// </summary>
        public readonly string? HttpMethod;
        /// <summary>
        /// Contains information needed for generating an OAuth token.
        /// This type of authorization should be used when sending requests to a GCP endpoint.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.JobHttpTargetOauthToken? OauthToken;
        /// <summary>
        /// Contains information needed for generating an OpenID Connect token.
        /// This type of authorization should be used when sending requests to third party endpoints or Cloud Run.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.JobHttpTargetOidcToken? OidcToken;
        /// <summary>
        /// The full URI path that the request will be sent to.
        /// </summary>
        public readonly string Uri;

        [OutputConstructor]
        private JobHttpTarget(
            string? body,

            ImmutableDictionary<string, string>? headers,

            string? httpMethod,

            Outputs.JobHttpTargetOauthToken? oauthToken,

            Outputs.JobHttpTargetOidcToken? oidcToken,

            string uri)
        {
            Body = body;
            Headers = headers;
            HttpMethod = httpMethod;
            OauthToken = oauthToken;
            OidcToken = oidcToken;
            Uri = uri;
        }
    }
}
