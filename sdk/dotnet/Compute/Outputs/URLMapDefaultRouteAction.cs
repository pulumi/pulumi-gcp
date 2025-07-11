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
    public sealed class URLMapDefaultRouteAction
    {
        /// <summary>
        /// The specification for allowing client side cross-origin requests. Please see
        /// [W3C Recommendation for Cross Origin Resource Sharing](https://www.w3.org/TR/cors/)
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.URLMapDefaultRouteActionCorsPolicy? CorsPolicy;
        /// <summary>
        /// The specification for fault injection introduced into traffic to test the resiliency of clients to backend service failure.
        /// As part of fault injection, when clients send requests to a backend service, delays can be introduced by Loadbalancer on a
        /// percentage of requests before sending those request to the backend service. Similarly requests from clients can be aborted
        /// by the Loadbalancer for a percentage of requests.
        /// timeout and retryPolicy will be ignored by clients that are configured with a faultInjectionPolicy.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.URLMapDefaultRouteActionFaultInjectionPolicy? FaultInjectionPolicy;
        /// <summary>
        /// Specifies the maximum duration (timeout) for streams on the selected route.
        /// Unlike the `Timeout` field where the timeout duration starts from the time the request
        /// has been fully processed (known as end-of-stream), the duration in this field
        /// is computed from the beginning of the stream until the response has been processed,
        /// including all retries. A stream that does not complete in this duration is closed.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.URLMapDefaultRouteActionMaxStreamDuration? MaxStreamDuration;
        /// <summary>
        /// Specifies the policy on how requests intended for the route's backends are shadowed to a separate mirrored backend service.
        /// Loadbalancer does not wait for responses from the shadow service. Prior to sending traffic to the shadow service,
        /// the host / authority header is suffixed with -shadow.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.URLMapDefaultRouteActionRequestMirrorPolicy? RequestMirrorPolicy;
        /// <summary>
        /// Specifies the retry policy associated with this route.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.URLMapDefaultRouteActionRetryPolicy? RetryPolicy;
        /// <summary>
        /// Specifies the timeout for the selected route. Timeout is computed from the time the request has been
        /// fully processed (i.e. end-of-stream) up until the response has been completely processed. Timeout includes all retries.
        /// If not specified, will use the largest timeout among all backend services associated with the route.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.URLMapDefaultRouteActionTimeout? Timeout;
        /// <summary>
        /// The spec to modify the URL of the request, prior to forwarding the request to the matched service.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.URLMapDefaultRouteActionUrlRewrite? UrlRewrite;
        /// <summary>
        /// A list of weighted backend services to send traffic to when a route match occurs.
        /// The weights determine the fraction of traffic that flows to their corresponding backend service.
        /// If all traffic needs to go to a single backend service, there must be one weightedBackendService
        /// with weight set to a non 0 number.
        /// Once a backendService is identified and before forwarding the request to the backend service,
        /// advanced routing actions like Url rewrites and header transformations are applied depending on
        /// additional settings specified in this HttpRouteAction.
        /// Structure is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.URLMapDefaultRouteActionWeightedBackendService> WeightedBackendServices;

        [OutputConstructor]
        private URLMapDefaultRouteAction(
            Outputs.URLMapDefaultRouteActionCorsPolicy? corsPolicy,

            Outputs.URLMapDefaultRouteActionFaultInjectionPolicy? faultInjectionPolicy,

            Outputs.URLMapDefaultRouteActionMaxStreamDuration? maxStreamDuration,

            Outputs.URLMapDefaultRouteActionRequestMirrorPolicy? requestMirrorPolicy,

            Outputs.URLMapDefaultRouteActionRetryPolicy? retryPolicy,

            Outputs.URLMapDefaultRouteActionTimeout? timeout,

            Outputs.URLMapDefaultRouteActionUrlRewrite? urlRewrite,

            ImmutableArray<Outputs.URLMapDefaultRouteActionWeightedBackendService> weightedBackendServices)
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
