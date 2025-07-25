// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.NetworkServices.Inputs
{

    public sealed class EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleHeaderMatchGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The value of the header should exactly match contents of exactMatch.
        /// </summary>
        [Input("exactMatch")]
        public Input<string>? ExactMatch { get; set; }

        /// <summary>
        /// The header name to match on.
        /// </summary>
        [Input("headerName", required: true)]
        public Input<string> HeaderName { get; set; } = null!;

        /// <summary>
        /// If set to false (default), the headerMatch is considered a match if the match criteria above are met.
        /// If set to true, the headerMatch is considered a match if the match criteria above are NOT met.
        /// </summary>
        [Input("invertMatch")]
        public Input<bool>? InvertMatch { get; set; }

        /// <summary>
        /// The value of the header must start with the contents of prefixMatch.
        /// </summary>
        [Input("prefixMatch")]
        public Input<string>? PrefixMatch { get; set; }

        /// <summary>
        /// A header with the contents of headerName must exist. The match takes place whether or not the request's header has a value.
        /// </summary>
        [Input("presentMatch")]
        public Input<bool>? PresentMatch { get; set; }

        /// <summary>
        /// The value of the header must end with the contents of suffixMatch.
        /// </summary>
        [Input("suffixMatch")]
        public Input<string>? SuffixMatch { get; set; }

        public EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleHeaderMatchGetArgs()
        {
        }
        public static new EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleHeaderMatchGetArgs Empty => new EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleHeaderMatchGetArgs();
    }
}
