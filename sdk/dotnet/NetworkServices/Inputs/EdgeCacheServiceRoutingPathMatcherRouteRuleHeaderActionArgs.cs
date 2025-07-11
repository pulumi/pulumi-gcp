// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.NetworkServices.Inputs
{

    public sealed class EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionArgs : global::Pulumi.ResourceArgs
    {
        [Input("requestHeaderToAdds")]
        private InputList<Inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToAddArgs>? _requestHeaderToAdds;

        /// <summary>
        /// Describes a header to add.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToAddArgs> RequestHeaderToAdds
        {
            get => _requestHeaderToAdds ?? (_requestHeaderToAdds = new InputList<Inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToAddArgs>());
            set => _requestHeaderToAdds = value;
        }

        [Input("requestHeaderToRemoves")]
        private InputList<Inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToRemoveArgs>? _requestHeaderToRemoves;

        /// <summary>
        /// A list of header names for headers that need to be removed from the request prior to forwarding the request to the origin.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToRemoveArgs> RequestHeaderToRemoves
        {
            get => _requestHeaderToRemoves ?? (_requestHeaderToRemoves = new InputList<Inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToRemoveArgs>());
            set => _requestHeaderToRemoves = value;
        }

        [Input("responseHeaderToAdds")]
        private InputList<Inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionResponseHeaderToAddArgs>? _responseHeaderToAdds;

        /// <summary>
        /// Headers to add to the response prior to sending it back to the client.
        /// Response headers are only sent to the client, and do not have an effect on the cache serving the response.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionResponseHeaderToAddArgs> ResponseHeaderToAdds
        {
            get => _responseHeaderToAdds ?? (_responseHeaderToAdds = new InputList<Inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionResponseHeaderToAddArgs>());
            set => _responseHeaderToAdds = value;
        }

        [Input("responseHeaderToRemoves")]
        private InputList<Inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionResponseHeaderToRemoveArgs>? _responseHeaderToRemoves;

        /// <summary>
        /// A list of header names for headers that need to be removed from the request prior to forwarding the request to the origin.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionResponseHeaderToRemoveArgs> ResponseHeaderToRemoves
        {
            get => _responseHeaderToRemoves ?? (_responseHeaderToRemoves = new InputList<Inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionResponseHeaderToRemoveArgs>());
            set => _responseHeaderToRemoves = value;
        }

        public EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionArgs()
        {
        }
        public static new EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionArgs Empty => new EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionArgs();
    }
}
