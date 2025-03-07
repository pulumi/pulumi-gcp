// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.compute.outputs.RegionUrlMapDefaultRouteActionCorsPolicy;
import com.pulumi.gcp.compute.outputs.RegionUrlMapDefaultRouteActionFaultInjectionPolicy;
import com.pulumi.gcp.compute.outputs.RegionUrlMapDefaultRouteActionRequestMirrorPolicy;
import com.pulumi.gcp.compute.outputs.RegionUrlMapDefaultRouteActionRetryPolicy;
import com.pulumi.gcp.compute.outputs.RegionUrlMapDefaultRouteActionTimeout;
import com.pulumi.gcp.compute.outputs.RegionUrlMapDefaultRouteActionUrlRewrite;
import com.pulumi.gcp.compute.outputs.RegionUrlMapDefaultRouteActionWeightedBackendService;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RegionUrlMapDefaultRouteAction {
    /**
     * @return The specification for allowing client side cross-origin requests. Please see
     * [W3C Recommendation for Cross Origin Resource Sharing](https://www.w3.org/TR/cors/)
     * Structure is documented below.
     * 
     */
    private @Nullable RegionUrlMapDefaultRouteActionCorsPolicy corsPolicy;
    /**
     * @return The specification for fault injection introduced into traffic to test the resiliency of clients to backend service failure.
     * As part of fault injection, when clients send requests to a backend service, delays can be introduced by a load balancer on a percentage of requests before sending those requests to the backend service.
     * Similarly requests from clients can be aborted by the load balancer for a percentage of requests.
     * timeout and retryPolicy is ignored by clients that are configured with a faultInjectionPolicy if: 1. The traffic is generated by fault injection AND 2. The fault injection is not a delay fault injection.
     * Fault injection is not supported with the global external HTTP(S) load balancer (classic). To see which load balancers support fault injection, see Load balancing: [Routing and traffic management features](https://cloud.google.com/load-balancing/docs/features#routing-traffic-management).
     * Structure is documented below.
     * 
     */
    private @Nullable RegionUrlMapDefaultRouteActionFaultInjectionPolicy faultInjectionPolicy;
    /**
     * @return Specifies the policy on how requests intended for the route&#39;s backends are shadowed to a separate mirrored backend service.
     * The load balancer does not wait for responses from the shadow service. Before sending traffic to the shadow service, the host / authority header is suffixed with -shadow.
     * Not supported when the URL map is bound to a target gRPC proxy that has the validateForProxyless field set to true.
     * Structure is documented below.
     * 
     */
    private @Nullable RegionUrlMapDefaultRouteActionRequestMirrorPolicy requestMirrorPolicy;
    /**
     * @return Specifies the retry policy associated with this route.
     * Structure is documented below.
     * 
     */
    private @Nullable RegionUrlMapDefaultRouteActionRetryPolicy retryPolicy;
    /**
     * @return Specifies the timeout for the selected route. Timeout is computed from the time the request has been fully processed (known as end-of-stream) up until the response has been processed. Timeout includes all retries.
     * If not specified, this field uses the largest timeout among all backend services associated with the route.
     * Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
     * Structure is documented below.
     * 
     */
    private @Nullable RegionUrlMapDefaultRouteActionTimeout timeout;
    /**
     * @return The spec to modify the URL of the request, before forwarding the request to the matched service.
     * urlRewrite is the only action supported in UrlMaps for external HTTP(S) load balancers.
     * Not supported when the URL map is bound to a target gRPC proxy that has the validateForProxyless field set to true.
     * Structure is documented below.
     * 
     */
    private @Nullable RegionUrlMapDefaultRouteActionUrlRewrite urlRewrite;
    /**
     * @return A list of weighted backend services to send traffic to when a route match occurs. The weights determine the fraction of traffic that flows to their corresponding backend service. If all traffic needs to go to a single backend service, there must be one weightedBackendService with weight set to a non-zero number.
     * After a backend service is identified and before forwarding the request to the backend service, advanced routing actions such as URL rewrites and header transformations are applied depending on additional settings specified in this HttpRouteAction.
     * Structure is documented below.
     * 
     */
    private @Nullable List<RegionUrlMapDefaultRouteActionWeightedBackendService> weightedBackendServices;

    private RegionUrlMapDefaultRouteAction() {}
    /**
     * @return The specification for allowing client side cross-origin requests. Please see
     * [W3C Recommendation for Cross Origin Resource Sharing](https://www.w3.org/TR/cors/)
     * Structure is documented below.
     * 
     */
    public Optional<RegionUrlMapDefaultRouteActionCorsPolicy> corsPolicy() {
        return Optional.ofNullable(this.corsPolicy);
    }
    /**
     * @return The specification for fault injection introduced into traffic to test the resiliency of clients to backend service failure.
     * As part of fault injection, when clients send requests to a backend service, delays can be introduced by a load balancer on a percentage of requests before sending those requests to the backend service.
     * Similarly requests from clients can be aborted by the load balancer for a percentage of requests.
     * timeout and retryPolicy is ignored by clients that are configured with a faultInjectionPolicy if: 1. The traffic is generated by fault injection AND 2. The fault injection is not a delay fault injection.
     * Fault injection is not supported with the global external HTTP(S) load balancer (classic). To see which load balancers support fault injection, see Load balancing: [Routing and traffic management features](https://cloud.google.com/load-balancing/docs/features#routing-traffic-management).
     * Structure is documented below.
     * 
     */
    public Optional<RegionUrlMapDefaultRouteActionFaultInjectionPolicy> faultInjectionPolicy() {
        return Optional.ofNullable(this.faultInjectionPolicy);
    }
    /**
     * @return Specifies the policy on how requests intended for the route&#39;s backends are shadowed to a separate mirrored backend service.
     * The load balancer does not wait for responses from the shadow service. Before sending traffic to the shadow service, the host / authority header is suffixed with -shadow.
     * Not supported when the URL map is bound to a target gRPC proxy that has the validateForProxyless field set to true.
     * Structure is documented below.
     * 
     */
    public Optional<RegionUrlMapDefaultRouteActionRequestMirrorPolicy> requestMirrorPolicy() {
        return Optional.ofNullable(this.requestMirrorPolicy);
    }
    /**
     * @return Specifies the retry policy associated with this route.
     * Structure is documented below.
     * 
     */
    public Optional<RegionUrlMapDefaultRouteActionRetryPolicy> retryPolicy() {
        return Optional.ofNullable(this.retryPolicy);
    }
    /**
     * @return Specifies the timeout for the selected route. Timeout is computed from the time the request has been fully processed (known as end-of-stream) up until the response has been processed. Timeout includes all retries.
     * If not specified, this field uses the largest timeout among all backend services associated with the route.
     * Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
     * Structure is documented below.
     * 
     */
    public Optional<RegionUrlMapDefaultRouteActionTimeout> timeout() {
        return Optional.ofNullable(this.timeout);
    }
    /**
     * @return The spec to modify the URL of the request, before forwarding the request to the matched service.
     * urlRewrite is the only action supported in UrlMaps for external HTTP(S) load balancers.
     * Not supported when the URL map is bound to a target gRPC proxy that has the validateForProxyless field set to true.
     * Structure is documented below.
     * 
     */
    public Optional<RegionUrlMapDefaultRouteActionUrlRewrite> urlRewrite() {
        return Optional.ofNullable(this.urlRewrite);
    }
    /**
     * @return A list of weighted backend services to send traffic to when a route match occurs. The weights determine the fraction of traffic that flows to their corresponding backend service. If all traffic needs to go to a single backend service, there must be one weightedBackendService with weight set to a non-zero number.
     * After a backend service is identified and before forwarding the request to the backend service, advanced routing actions such as URL rewrites and header transformations are applied depending on additional settings specified in this HttpRouteAction.
     * Structure is documented below.
     * 
     */
    public List<RegionUrlMapDefaultRouteActionWeightedBackendService> weightedBackendServices() {
        return this.weightedBackendServices == null ? List.of() : this.weightedBackendServices;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionUrlMapDefaultRouteAction defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable RegionUrlMapDefaultRouteActionCorsPolicy corsPolicy;
        private @Nullable RegionUrlMapDefaultRouteActionFaultInjectionPolicy faultInjectionPolicy;
        private @Nullable RegionUrlMapDefaultRouteActionRequestMirrorPolicy requestMirrorPolicy;
        private @Nullable RegionUrlMapDefaultRouteActionRetryPolicy retryPolicy;
        private @Nullable RegionUrlMapDefaultRouteActionTimeout timeout;
        private @Nullable RegionUrlMapDefaultRouteActionUrlRewrite urlRewrite;
        private @Nullable List<RegionUrlMapDefaultRouteActionWeightedBackendService> weightedBackendServices;
        public Builder() {}
        public Builder(RegionUrlMapDefaultRouteAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.corsPolicy = defaults.corsPolicy;
    	      this.faultInjectionPolicy = defaults.faultInjectionPolicy;
    	      this.requestMirrorPolicy = defaults.requestMirrorPolicy;
    	      this.retryPolicy = defaults.retryPolicy;
    	      this.timeout = defaults.timeout;
    	      this.urlRewrite = defaults.urlRewrite;
    	      this.weightedBackendServices = defaults.weightedBackendServices;
        }

        @CustomType.Setter
        public Builder corsPolicy(@Nullable RegionUrlMapDefaultRouteActionCorsPolicy corsPolicy) {

            this.corsPolicy = corsPolicy;
            return this;
        }
        @CustomType.Setter
        public Builder faultInjectionPolicy(@Nullable RegionUrlMapDefaultRouteActionFaultInjectionPolicy faultInjectionPolicy) {

            this.faultInjectionPolicy = faultInjectionPolicy;
            return this;
        }
        @CustomType.Setter
        public Builder requestMirrorPolicy(@Nullable RegionUrlMapDefaultRouteActionRequestMirrorPolicy requestMirrorPolicy) {

            this.requestMirrorPolicy = requestMirrorPolicy;
            return this;
        }
        @CustomType.Setter
        public Builder retryPolicy(@Nullable RegionUrlMapDefaultRouteActionRetryPolicy retryPolicy) {

            this.retryPolicy = retryPolicy;
            return this;
        }
        @CustomType.Setter
        public Builder timeout(@Nullable RegionUrlMapDefaultRouteActionTimeout timeout) {

            this.timeout = timeout;
            return this;
        }
        @CustomType.Setter
        public Builder urlRewrite(@Nullable RegionUrlMapDefaultRouteActionUrlRewrite urlRewrite) {

            this.urlRewrite = urlRewrite;
            return this;
        }
        @CustomType.Setter
        public Builder weightedBackendServices(@Nullable List<RegionUrlMapDefaultRouteActionWeightedBackendService> weightedBackendServices) {

            this.weightedBackendServices = weightedBackendServices;
            return this;
        }
        public Builder weightedBackendServices(RegionUrlMapDefaultRouteActionWeightedBackendService... weightedBackendServices) {
            return weightedBackendServices(List.of(weightedBackendServices));
        }
        public RegionUrlMapDefaultRouteAction build() {
            final var _resultValue = new RegionUrlMapDefaultRouteAction();
            _resultValue.corsPolicy = corsPolicy;
            _resultValue.faultInjectionPolicy = faultInjectionPolicy;
            _resultValue.requestMirrorPolicy = requestMirrorPolicy;
            _resultValue.retryPolicy = retryPolicy;
            _resultValue.timeout = timeout;
            _resultValue.urlRewrite = urlRewrite;
            _resultValue.weightedBackendServices = weightedBackendServices;
            return _resultValue;
        }
    }
}
