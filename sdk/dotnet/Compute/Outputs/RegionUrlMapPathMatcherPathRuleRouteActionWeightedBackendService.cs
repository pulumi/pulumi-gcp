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
    public sealed class RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendService
    {
        /// <summary>
        /// The full or partial URL to the default BackendService resource. Before forwarding the request to backendService, the load balancer applies any relevant headerActions specified as part of this backendServiceWeight.
        /// </summary>
        public readonly string BackendService;
        /// <summary>
        /// Specifies changes to request and response headers that need to take effect for the selected backendService.
        /// headerAction specified here take effect before headerAction in the enclosing HttpRouteRule, PathMatcher and UrlMap.
        /// headerAction is not supported for load balancers that have their loadBalancingScheme set to EXTERNAL.
        /// Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderAction? HeaderAction;
        /// <summary>
        /// Specifies the fraction of traffic sent to a backend service, computed as weight / (sum of all weightedBackendService weights in routeAction) .
        /// The selection of a backend service is determined only for new traffic. Once a user's request has been directed to a backend service, subsequent requests are sent to the same backend service as determined by the backend service's session affinity policy.
        /// The value must be from 0 to 1000.
        /// </summary>
        public readonly int Weight;

        [OutputConstructor]
        private RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendService(
            string backendService,

            Outputs.RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderAction? headerAction,

            int weight)
        {
            BackendService = backendService;
            HeaderAction = headerAction;
            Weight = weight;
        }
    }
}
