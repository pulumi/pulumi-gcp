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
    public sealed class RegionUrlMapPathMatcherDefaultRouteAction
    {
        /// <summary>
        /// The specification for allowing client side cross-origin requests. Please see
        /// [W3C Recommendation for Cross Origin Resource Sharing](https://www.w3.org/TR/cors/)
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.RegionUrlMapPathMatcherDefaultRouteActionCorsPolicy? CorsPolicy;
        /// <summary>
        /// The specification for fault injection introduced into traffic to test the resiliency of clients to backend service failure.
        /// As part of fault injection, when clients send requests to a backend service, delays can be introduced by a load balancer on a percentage of requests before sending those requests to the backend service.
        /// Similarly requests from clients can be aborted by the load balancer for a percentage of requests.
        /// timeout and retryPolicy is ignored by clients that are configured with a faultInjectionPolicy if: 1. The traffic is generated by fault injection AND 2. The fault injection is not a delay fault injection.
        /// Fault injection is not supported with the global external HTTP(S) load balancer (classic). To see which load balancers support fault injection, see Load balancing: [Routing and traffic management features](https://cloud.google.com/load-balancing/docs/features#routing-traffic-management).
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.RegionUrlMapPathMatcherDefaultRouteActionFaultInjectionPolicy? FaultInjectionPolicy;
        /// <summary>
        /// Specifies the maximum duration (timeout) for streams on the selected route.
        /// Unlike the `Timeout` field where the timeout duration starts from the time the request
        /// has been fully processed (known as end-of-stream), the duration in this field
        /// is computed from the beginning of the stream until the response has been processed,
        /// including all retries. A stream that does not complete in this duration is closed.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.RegionUrlMapPathMatcherDefaultRouteActionMaxStreamDuration? MaxStreamDuration;
        /// <summary>
        /// Specifies the policy on how requests intended for the route's backends are shadowed to a separate mirrored backend service.
        /// The load balancer does not wait for responses from the shadow service. Before sending traffic to the shadow service, the host / authority header is suffixed with -shadow.
        /// Not supported when the URL map is bound to a target gRPC proxy that has the validateForProxyless field set to true.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.RegionUrlMapPathMatcherDefaultRouteActionRequestMirrorPolicy? RequestMirrorPolicy;
        /// <summary>
        /// Specifies the retry policy associated with this route.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.RegionUrlMapPathMatcherDefaultRouteActionRetryPolicy? RetryPolicy;
        /// <summary>
        /// Specifies the timeout for the selected route. Timeout is computed from the time the request has been fully processed (known as end-of-stream) up until the response has been processed. Timeout includes all retries.
        /// If not specified, this field uses the largest timeout among all backend services associated with the route.
        /// Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.RegionUrlMapPathMatcherDefaultRouteActionTimeout? Timeout;
        /// <summary>
        /// The spec to modify the URL of the request, before forwarding the request to the matched service.
        /// urlRewrite is the only action supported in UrlMaps for external HTTP(S) load balancers.
        /// Not supported when the URL map is bound to a target gRPC proxy that has the validateForProxyless field set to true.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.RegionUrlMapPathMatcherDefaultRouteActionUrlRewrite? UrlRewrite;
        /// <summary>
        /// A list of weighted backend services to send traffic to when a route match occurs. The weights determine the fraction of traffic that flows to their corresponding backend service. If all traffic needs to go to a single backend service, there must be one weightedBackendService with weight set to a non-zero number.
        /// After a backend service is identified and before forwarding the request to the backend service, advanced routing actions such as URL rewrites and header transformations are applied depending on additional settings specified in this HttpRouteAction.
        /// Structure is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.RegionUrlMapPathMatcherDefaultRouteActionWeightedBackendService> WeightedBackendServices;

        [OutputConstructor]
        private RegionUrlMapPathMatcherDefaultRouteAction(
            Outputs.RegionUrlMapPathMatcherDefaultRouteActionCorsPolicy? corsPolicy,

            Outputs.RegionUrlMapPathMatcherDefaultRouteActionFaultInjectionPolicy? faultInjectionPolicy,

            Outputs.RegionUrlMapPathMatcherDefaultRouteActionMaxStreamDuration? maxStreamDuration,

            Outputs.RegionUrlMapPathMatcherDefaultRouteActionRequestMirrorPolicy? requestMirrorPolicy,

            Outputs.RegionUrlMapPathMatcherDefaultRouteActionRetryPolicy? retryPolicy,

            Outputs.RegionUrlMapPathMatcherDefaultRouteActionTimeout? timeout,

            Outputs.RegionUrlMapPathMatcherDefaultRouteActionUrlRewrite? urlRewrite,

            ImmutableArray<Outputs.RegionUrlMapPathMatcherDefaultRouteActionWeightedBackendService> weightedBackendServices)
        {
            CorsPolicy = corsPolicy;
            FaultInjectionPolicy = faultInjectionPolicy;
            MaxStreamDuration = maxStreamDuration;
            RequestMirrorPolicy = requestMirrorPolicy;
            RetryPolicy = retryPolicy;
            Timeout = timeout;
            UrlRewrite = urlRewrite;
            WeightedBackendServices = weightedBackendServices;
        }
    }
}
