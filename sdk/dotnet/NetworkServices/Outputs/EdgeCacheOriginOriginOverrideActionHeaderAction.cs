// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.NetworkServices.Outputs
{

    [OutputType]
    public sealed class EdgeCacheOriginOriginOverrideActionHeaderAction
    {
        /// <summary>
        /// Describes a header to add.
        /// You may add a maximum of 25 request headers.
        /// Structure is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.EdgeCacheOriginOriginOverrideActionHeaderActionRequestHeadersToAdd> RequestHeadersToAdds;

        [OutputConstructor]
        private EdgeCacheOriginOriginOverrideActionHeaderAction(ImmutableArray<Outputs.EdgeCacheOriginOriginOverrideActionHeaderActionRequestHeadersToAdd> requestHeadersToAdds)
        {
            RequestHeadersToAdds = requestHeadersToAdds;
        }
    }
}
