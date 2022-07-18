// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute.Outputs
{

    [OutputType]
    public sealed class BackendBucketCdnPolicyCacheKeyPolicy
    {
        /// <summary>
        /// Allows HTTP request headers (by name) to be used in the
        /// cache key.
        /// </summary>
        public readonly ImmutableArray<string> IncludeHttpHeaders;
        /// <summary>
        /// Names of query string parameters to include in cache keys.
        /// Default parameters are always included. '&amp;' and '=' will
        /// be percent encoded and not treated as delimiters.
        /// </summary>
        public readonly ImmutableArray<string> QueryStringWhitelists;

        [OutputConstructor]
        private BackendBucketCdnPolicyCacheKeyPolicy(
            ImmutableArray<string> includeHttpHeaders,

            ImmutableArray<string> queryStringWhitelists)
        {
            IncludeHttpHeaders = includeHttpHeaders;
            QueryStringWhitelists = queryStringWhitelists;
        }
    }
}