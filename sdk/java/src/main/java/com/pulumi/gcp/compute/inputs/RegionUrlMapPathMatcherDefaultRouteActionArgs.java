// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherDefaultRouteActionCorsPolicyArgs;
import com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherDefaultRouteActionFaultInjectionPolicyArgs;
import com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherDefaultRouteActionMaxStreamDurationArgs;
import com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherDefaultRouteActionRequestMirrorPolicyArgs;
import com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherDefaultRouteActionRetryPolicyArgs;
import com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherDefaultRouteActionTimeoutArgs;
import com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherDefaultRouteActionUrlRewriteArgs;
import com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherDefaultRouteActionWeightedBackendServiceArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegionUrlMapPathMatcherDefaultRouteActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegionUrlMapPathMatcherDefaultRouteActionArgs Empty = new RegionUrlMapPathMatcherDefaultRouteActionArgs();

    /**
     * The specification for allowing client side cross-origin requests. Please see
     * [W3C Recommendation for Cross Origin Resource Sharing](https://www.w3.org/TR/cors/)
     * Structure is documented below.
     * 
     */
    @Import(name="corsPolicy")
    private @Nullable Output<RegionUrlMapPathMatcherDefaultRouteActionCorsPolicyArgs> corsPolicy;

    /**
     * @return The specification for allowing client side cross-origin requests. Please see
     * [W3C Recommendation for Cross Origin Resource Sharing](https://www.w3.org/TR/cors/)
     * Structure is documented below.
     * 
     */
    public Optional<Output<RegionUrlMapPathMatcherDefaultRouteActionCorsPolicyArgs>> corsPolicy() {
        return Optional.ofNullable(this.corsPolicy);
    }

    /**
     * The specification for fault injection introduced into traffic to test the resiliency of clients to backend service failure.
     * As part of fault injection, when clients send requests to a backend service, delays can be introduced by a load balancer on a percentage of requests before sending those requests to the backend service.
     * Similarly requests from clients can be aborted by the load balancer for a percentage of requests.
     * timeout and retryPolicy is ignored by clients that are configured with a faultInjectionPolicy if: 1. The traffic is generated by fault injection AND 2. The fault injection is not a delay fault injection.
     * Fault injection is not supported with the global external HTTP(S) load balancer (classic). To see which load balancers support fault injection, see Load balancing: [Routing and traffic management features](https://cloud.google.com/load-balancing/docs/features#routing-traffic-management).
     * Structure is documented below.
     * 
     */
    @Import(name="faultInjectionPolicy")
    private @Nullable Output<RegionUrlMapPathMatcherDefaultRouteActionFaultInjectionPolicyArgs> faultInjectionPolicy;

    /**
     * @return The specification for fault injection introduced into traffic to test the resiliency of clients to backend service failure.
     * As part of fault injection, when clients send requests to a backend service, delays can be introduced by a load balancer on a percentage of requests before sending those requests to the backend service.
     * Similarly requests from clients can be aborted by the load balancer for a percentage of requests.
     * timeout and retryPolicy is ignored by clients that are configured with a faultInjectionPolicy if: 1. The traffic is generated by fault injection AND 2. The fault injection is not a delay fault injection.
     * Fault injection is not supported with the global external HTTP(S) load balancer (classic). To see which load balancers support fault injection, see Load balancing: [Routing and traffic management features](https://cloud.google.com/load-balancing/docs/features#routing-traffic-management).
     * Structure is documented below.
     * 
     */
    public Optional<Output<RegionUrlMapPathMatcherDefaultRouteActionFaultInjectionPolicyArgs>> faultInjectionPolicy() {
        return Optional.ofNullable(this.faultInjectionPolicy);
    }

    /**
     * Specifies the maximum duration (timeout) for streams on the selected route.
     * Unlike the `Timeout` field where the timeout duration starts from the time the request
     * has been fully processed (known as end-of-stream), the duration in this field
     * is computed from the beginning of the stream until the response has been processed,
     * including all retries. A stream that does not complete in this duration is closed.
     * Structure is documented below.
     * 
     */
    @Import(name="maxStreamDuration")
    private @Nullable Output<RegionUrlMapPathMatcherDefaultRouteActionMaxStreamDurationArgs> maxStreamDuration;

    /**
     * @return Specifies the maximum duration (timeout) for streams on the selected route.
     * Unlike the `Timeout` field where the timeout duration starts from the time the request
     * has been fully processed (known as end-of-stream), the duration in this field
     * is computed from the beginning of the stream until the response has been processed,
     * including all retries. A stream that does not complete in this duration is closed.
     * Structure is documented below.
     * 
     */
    public Optional<Output<RegionUrlMapPathMatcherDefaultRouteActionMaxStreamDurationArgs>> maxStreamDuration() {
        return Optional.ofNullable(this.maxStreamDuration);
    }

    /**
     * Specifies the policy on how requests intended for the route&#39;s backends are shadowed to a separate mirrored backend service.
     * The load balancer does not wait for responses from the shadow service. Before sending traffic to the shadow service, the host / authority header is suffixed with -shadow.
     * Not supported when the URL map is bound to a target gRPC proxy that has the validateForProxyless field set to true.
     * Structure is documented below.
     * 
     */
    @Import(name="requestMirrorPolicy")
    private @Nullable Output<RegionUrlMapPathMatcherDefaultRouteActionRequestMirrorPolicyArgs> requestMirrorPolicy;

    /**
     * @return Specifies the policy on how requests intended for the route&#39;s backends are shadowed to a separate mirrored backend service.
     * The load balancer does not wait for responses from the shadow service. Before sending traffic to the shadow service, the host / authority header is suffixed with -shadow.
     * Not supported when the URL map is bound to a target gRPC proxy that has the validateForProxyless field set to true.
     * Structure is documented below.
     * 
     */
    public Optional<Output<RegionUrlMapPathMatcherDefaultRouteActionRequestMirrorPolicyArgs>> requestMirrorPolicy() {
        return Optional.ofNullable(this.requestMirrorPolicy);
    }

    /**
     * Specifies the retry policy associated with this route.
     * Structure is documented below.
     * 
     */
    @Import(name="retryPolicy")
    private @Nullable Output<RegionUrlMapPathMatcherDefaultRouteActionRetryPolicyArgs> retryPolicy;

    /**
     * @return Specifies the retry policy associated with this route.
     * Structure is documented below.
     * 
     */
    public Optional<Output<RegionUrlMapPathMatcherDefaultRouteActionRetryPolicyArgs>> retryPolicy() {
        return Optional.ofNullable(this.retryPolicy);
    }

    /**
     * Specifies the timeout for the selected route. Timeout is computed from the time the request has been fully processed (known as end-of-stream) up until the response has been processed. Timeout includes all retries.
     * If not specified, this field uses the largest timeout among all backend services associated with the route.
     * Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
     * Structure is documented below.
     * 
     */
    @Import(name="timeout")
    private @Nullable Output<RegionUrlMapPathMatcherDefaultRouteActionTimeoutArgs> timeout;

    /**
     * @return Specifies the timeout for the selected route. Timeout is computed from the time the request has been fully processed (known as end-of-stream) up until the response has been processed. Timeout includes all retries.
     * If not specified, this field uses the largest timeout among all backend services associated with the route.
     * Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
     * Structure is documented below.
     * 
     */
    public Optional<Output<RegionUrlMapPathMatcherDefaultRouteActionTimeoutArgs>> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    /**
     * The spec to modify the URL of the request, before forwarding the request to the matched service.
     * urlRewrite is the only action supported in UrlMaps for external HTTP(S) load balancers.
     * Not supported when the URL map is bound to a target gRPC proxy that has the validateForProxyless field set to true.
     * Structure is documented below.
     * 
     */
    @Import(name="urlRewrite")
    private @Nullable Output<RegionUrlMapPathMatcherDefaultRouteActionUrlRewriteArgs> urlRewrite;

    /**
     * @return The spec to modify the URL of the request, before forwarding the request to the matched service.
     * urlRewrite is the only action supported in UrlMaps for external HTTP(S) load balancers.
     * Not supported when the URL map is bound to a target gRPC proxy that has the validateForProxyless field set to true.
     * Structure is documented below.
     * 
     */
    public Optional<Output<RegionUrlMapPathMatcherDefaultRouteActionUrlRewriteArgs>> urlRewrite() {
        return Optional.ofNullable(this.urlRewrite);
    }

    /**
     * A list of weighted backend services to send traffic to when a route match occurs. The weights determine the fraction of traffic that flows to their corresponding backend service. If all traffic needs to go to a single backend service, there must be one weightedBackendService with weight set to a non-zero number.
     * After a backend service is identified and before forwarding the request to the backend service, advanced routing actions such as URL rewrites and header transformations are applied depending on additional settings specified in this HttpRouteAction.
     * Structure is documented below.
     * 
     */
    @Import(name="weightedBackendServices")
    private @Nullable Output<List<RegionUrlMapPathMatcherDefaultRouteActionWeightedBackendServiceArgs>> weightedBackendServices;

    /**
     * @return A list of weighted backend services to send traffic to when a route match occurs. The weights determine the fraction of traffic that flows to their corresponding backend service. If all traffic needs to go to a single backend service, there must be one weightedBackendService with weight set to a non-zero number.
     * After a backend service is identified and before forwarding the request to the backend service, advanced routing actions such as URL rewrites and header transformations are applied depending on additional settings specified in this HttpRouteAction.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<RegionUrlMapPathMatcherDefaultRouteActionWeightedBackendServiceArgs>>> weightedBackendServices() {
        return Optional.ofNullable(this.weightedBackendServices);
    }

    private RegionUrlMapPathMatcherDefaultRouteActionArgs() {}

    private RegionUrlMapPathMatcherDefaultRouteActionArgs(RegionUrlMapPathMatcherDefaultRouteActionArgs $) {
        this.corsPolicy = $.corsPolicy;
        this.faultInjectionPolicy = $.faultInjectionPolicy;
        this.maxStreamDuration = $.maxStreamDuration;
        this.requestMirrorPolicy = $.requestMirrorPolicy;
        this.retryPolicy = $.retryPolicy;
        this.timeout = $.timeout;
        this.urlRewrite = $.urlRewrite;
        this.weightedBackendServices = $.weightedBackendServices;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegionUrlMapPathMatcherDefaultRouteActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegionUrlMapPathMatcherDefaultRouteActionArgs $;

        public Builder() {
            $ = new RegionUrlMapPathMatcherDefaultRouteActionArgs();
        }

        public Builder(RegionUrlMapPathMatcherDefaultRouteActionArgs defaults) {
            $ = new RegionUrlMapPathMatcherDefaultRouteActionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param corsPolicy The specification for allowing client side cross-origin requests. Please see
         * [W3C Recommendation for Cross Origin Resource Sharing](https://www.w3.org/TR/cors/)
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder corsPolicy(@Nullable Output<RegionUrlMapPathMatcherDefaultRouteActionCorsPolicyArgs> corsPolicy) {
            $.corsPolicy = corsPolicy;
            return this;
        }

        /**
         * @param corsPolicy The specification for allowing client side cross-origin requests. Please see
         * [W3C Recommendation for Cross Origin Resource Sharing](https://www.w3.org/TR/cors/)
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder corsPolicy(RegionUrlMapPathMatcherDefaultRouteActionCorsPolicyArgs corsPolicy) {
            return corsPolicy(Output.of(corsPolicy));
        }

        /**
         * @param faultInjectionPolicy The specification for fault injection introduced into traffic to test the resiliency of clients to backend service failure.
         * As part of fault injection, when clients send requests to a backend service, delays can be introduced by a load balancer on a percentage of requests before sending those requests to the backend service.
         * Similarly requests from clients can be aborted by the load balancer for a percentage of requests.
         * timeout and retryPolicy is ignored by clients that are configured with a faultInjectionPolicy if: 1. The traffic is generated by fault injection AND 2. The fault injection is not a delay fault injection.
         * Fault injection is not supported with the global external HTTP(S) load balancer (classic). To see which load balancers support fault injection, see Load balancing: [Routing and traffic management features](https://cloud.google.com/load-balancing/docs/features#routing-traffic-management).
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder faultInjectionPolicy(@Nullable Output<RegionUrlMapPathMatcherDefaultRouteActionFaultInjectionPolicyArgs> faultInjectionPolicy) {
            $.faultInjectionPolicy = faultInjectionPolicy;
            return this;
        }

        /**
         * @param faultInjectionPolicy The specification for fault injection introduced into traffic to test the resiliency of clients to backend service failure.
         * As part of fault injection, when clients send requests to a backend service, delays can be introduced by a load balancer on a percentage of requests before sending those requests to the backend service.
         * Similarly requests from clients can be aborted by the load balancer for a percentage of requests.
         * timeout and retryPolicy is ignored by clients that are configured with a faultInjectionPolicy if: 1. The traffic is generated by fault injection AND 2. The fault injection is not a delay fault injection.
         * Fault injection is not supported with the global external HTTP(S) load balancer (classic). To see which load balancers support fault injection, see Load balancing: [Routing and traffic management features](https://cloud.google.com/load-balancing/docs/features#routing-traffic-management).
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder faultInjectionPolicy(RegionUrlMapPathMatcherDefaultRouteActionFaultInjectionPolicyArgs faultInjectionPolicy) {
            return faultInjectionPolicy(Output.of(faultInjectionPolicy));
        }

        /**
         * @param maxStreamDuration Specifies the maximum duration (timeout) for streams on the selected route.
         * Unlike the `Timeout` field where the timeout duration starts from the time the request
         * has been fully processed (known as end-of-stream), the duration in this field
         * is computed from the beginning of the stream until the response has been processed,
         * including all retries. A stream that does not complete in this duration is closed.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder maxStreamDuration(@Nullable Output<RegionUrlMapPathMatcherDefaultRouteActionMaxStreamDurationArgs> maxStreamDuration) {
            $.maxStreamDuration = maxStreamDuration;
            return this;
        }

        /**
         * @param maxStreamDuration Specifies the maximum duration (timeout) for streams on the selected route.
         * Unlike the `Timeout` field where the timeout duration starts from the time the request
         * has been fully processed (known as end-of-stream), the duration in this field
         * is computed from the beginning of the stream until the response has been processed,
         * including all retries. A stream that does not complete in this duration is closed.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder maxStreamDuration(RegionUrlMapPathMatcherDefaultRouteActionMaxStreamDurationArgs maxStreamDuration) {
            return maxStreamDuration(Output.of(maxStreamDuration));
        }

        /**
         * @param requestMirrorPolicy Specifies the policy on how requests intended for the route&#39;s backends are shadowed to a separate mirrored backend service.
         * The load balancer does not wait for responses from the shadow service. Before sending traffic to the shadow service, the host / authority header is suffixed with -shadow.
         * Not supported when the URL map is bound to a target gRPC proxy that has the validateForProxyless field set to true.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder requestMirrorPolicy(@Nullable Output<RegionUrlMapPathMatcherDefaultRouteActionRequestMirrorPolicyArgs> requestMirrorPolicy) {
            $.requestMirrorPolicy = requestMirrorPolicy;
            return this;
        }

        /**
         * @param requestMirrorPolicy Specifies the policy on how requests intended for the route&#39;s backends are shadowed to a separate mirrored backend service.
         * The load balancer does not wait for responses from the shadow service. Before sending traffic to the shadow service, the host / authority header is suffixed with -shadow.
         * Not supported when the URL map is bound to a target gRPC proxy that has the validateForProxyless field set to true.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder requestMirrorPolicy(RegionUrlMapPathMatcherDefaultRouteActionRequestMirrorPolicyArgs requestMirrorPolicy) {
            return requestMirrorPolicy(Output.of(requestMirrorPolicy));
        }

        /**
         * @param retryPolicy Specifies the retry policy associated with this route.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder retryPolicy(@Nullable Output<RegionUrlMapPathMatcherDefaultRouteActionRetryPolicyArgs> retryPolicy) {
            $.retryPolicy = retryPolicy;
            return this;
        }

        /**
         * @param retryPolicy Specifies the retry policy associated with this route.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder retryPolicy(RegionUrlMapPathMatcherDefaultRouteActionRetryPolicyArgs retryPolicy) {
            return retryPolicy(Output.of(retryPolicy));
        }

        /**
         * @param timeout Specifies the timeout for the selected route. Timeout is computed from the time the request has been fully processed (known as end-of-stream) up until the response has been processed. Timeout includes all retries.
         * If not specified, this field uses the largest timeout among all backend services associated with the route.
         * Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder timeout(@Nullable Output<RegionUrlMapPathMatcherDefaultRouteActionTimeoutArgs> timeout) {
            $.timeout = timeout;
            return this;
        }

        /**
         * @param timeout Specifies the timeout for the selected route. Timeout is computed from the time the request has been fully processed (known as end-of-stream) up until the response has been processed. Timeout includes all retries.
         * If not specified, this field uses the largest timeout among all backend services associated with the route.
         * Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder timeout(RegionUrlMapPathMatcherDefaultRouteActionTimeoutArgs timeout) {
            return timeout(Output.of(timeout));
        }

        /**
         * @param urlRewrite The spec to modify the URL of the request, before forwarding the request to the matched service.
         * urlRewrite is the only action supported in UrlMaps for external HTTP(S) load balancers.
         * Not supported when the URL map is bound to a target gRPC proxy that has the validateForProxyless field set to true.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder urlRewrite(@Nullable Output<RegionUrlMapPathMatcherDefaultRouteActionUrlRewriteArgs> urlRewrite) {
            $.urlRewrite = urlRewrite;
            return this;
        }

        /**
         * @param urlRewrite The spec to modify the URL of the request, before forwarding the request to the matched service.
         * urlRewrite is the only action supported in UrlMaps for external HTTP(S) load balancers.
         * Not supported when the URL map is bound to a target gRPC proxy that has the validateForProxyless field set to true.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder urlRewrite(RegionUrlMapPathMatcherDefaultRouteActionUrlRewriteArgs urlRewrite) {
            return urlRewrite(Output.of(urlRewrite));
        }

        /**
         * @param weightedBackendServices A list of weighted backend services to send traffic to when a route match occurs. The weights determine the fraction of traffic that flows to their corresponding backend service. If all traffic needs to go to a single backend service, there must be one weightedBackendService with weight set to a non-zero number.
         * After a backend service is identified and before forwarding the request to the backend service, advanced routing actions such as URL rewrites and header transformations are applied depending on additional settings specified in this HttpRouteAction.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder weightedBackendServices(@Nullable Output<List<RegionUrlMapPathMatcherDefaultRouteActionWeightedBackendServiceArgs>> weightedBackendServices) {
            $.weightedBackendServices = weightedBackendServices;
            return this;
        }

        /**
         * @param weightedBackendServices A list of weighted backend services to send traffic to when a route match occurs. The weights determine the fraction of traffic that flows to their corresponding backend service. If all traffic needs to go to a single backend service, there must be one weightedBackendService with weight set to a non-zero number.
         * After a backend service is identified and before forwarding the request to the backend service, advanced routing actions such as URL rewrites and header transformations are applied depending on additional settings specified in this HttpRouteAction.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder weightedBackendServices(List<RegionUrlMapPathMatcherDefaultRouteActionWeightedBackendServiceArgs> weightedBackendServices) {
            return weightedBackendServices(Output.of(weightedBackendServices));
        }

        /**
         * @param weightedBackendServices A list of weighted backend services to send traffic to when a route match occurs. The weights determine the fraction of traffic that flows to their corresponding backend service. If all traffic needs to go to a single backend service, there must be one weightedBackendService with weight set to a non-zero number.
         * After a backend service is identified and before forwarding the request to the backend service, advanced routing actions such as URL rewrites and header transformations are applied depending on additional settings specified in this HttpRouteAction.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder weightedBackendServices(RegionUrlMapPathMatcherDefaultRouteActionWeightedBackendServiceArgs... weightedBackendServices) {
            return weightedBackendServices(List.of(weightedBackendServices));
        }

        public RegionUrlMapPathMatcherDefaultRouteActionArgs build() {
            return $;
        }
    }

}
