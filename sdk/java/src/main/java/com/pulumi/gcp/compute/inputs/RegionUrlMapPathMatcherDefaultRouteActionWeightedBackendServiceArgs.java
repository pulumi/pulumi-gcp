// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherDefaultRouteActionWeightedBackendServiceHeaderActionArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegionUrlMapPathMatcherDefaultRouteActionWeightedBackendServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegionUrlMapPathMatcherDefaultRouteActionWeightedBackendServiceArgs Empty = new RegionUrlMapPathMatcherDefaultRouteActionWeightedBackendServiceArgs();

    /**
     * The full or partial URL to the default BackendService resource. Before forwarding the request to backendService, the load balancer applies any relevant headerActions specified as part of this backendServiceWeight.
     * 
     */
    @Import(name="backendService")
    private @Nullable Output<String> backendService;

    /**
     * @return The full or partial URL to the default BackendService resource. Before forwarding the request to backendService, the load balancer applies any relevant headerActions specified as part of this backendServiceWeight.
     * 
     */
    public Optional<Output<String>> backendService() {
        return Optional.ofNullable(this.backendService);
    }

    /**
     * Specifies changes to request and response headers that need to take effect for the selected backendService.
     * headerAction specified here take effect before headerAction in the enclosing HttpRouteRule, PathMatcher and UrlMap.
     * headerAction is not supported for load balancers that have their loadBalancingScheme set to EXTERNAL.
     * Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
     * Structure is documented below.
     * 
     */
    @Import(name="headerAction")
    private @Nullable Output<RegionUrlMapPathMatcherDefaultRouteActionWeightedBackendServiceHeaderActionArgs> headerAction;

    /**
     * @return Specifies changes to request and response headers that need to take effect for the selected backendService.
     * headerAction specified here take effect before headerAction in the enclosing HttpRouteRule, PathMatcher and UrlMap.
     * headerAction is not supported for load balancers that have their loadBalancingScheme set to EXTERNAL.
     * Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
     * Structure is documented below.
     * 
     */
    public Optional<Output<RegionUrlMapPathMatcherDefaultRouteActionWeightedBackendServiceHeaderActionArgs>> headerAction() {
        return Optional.ofNullable(this.headerAction);
    }

    /**
     * Specifies the fraction of traffic sent to a backend service, computed as weight / (sum of all weightedBackendService weights in routeAction) .
     * The selection of a backend service is determined only for new traffic. Once a user&#39;s request has been directed to a backend service, subsequent requests are sent to the same backend service as determined by the backend service&#39;s session affinity policy.
     * The value must be from 0 to 1000.
     * 
     */
    @Import(name="weight")
    private @Nullable Output<Integer> weight;

    /**
     * @return Specifies the fraction of traffic sent to a backend service, computed as weight / (sum of all weightedBackendService weights in routeAction) .
     * The selection of a backend service is determined only for new traffic. Once a user&#39;s request has been directed to a backend service, subsequent requests are sent to the same backend service as determined by the backend service&#39;s session affinity policy.
     * The value must be from 0 to 1000.
     * 
     */
    public Optional<Output<Integer>> weight() {
        return Optional.ofNullable(this.weight);
    }

    private RegionUrlMapPathMatcherDefaultRouteActionWeightedBackendServiceArgs() {}

    private RegionUrlMapPathMatcherDefaultRouteActionWeightedBackendServiceArgs(RegionUrlMapPathMatcherDefaultRouteActionWeightedBackendServiceArgs $) {
        this.backendService = $.backendService;
        this.headerAction = $.headerAction;
        this.weight = $.weight;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegionUrlMapPathMatcherDefaultRouteActionWeightedBackendServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegionUrlMapPathMatcherDefaultRouteActionWeightedBackendServiceArgs $;

        public Builder() {
            $ = new RegionUrlMapPathMatcherDefaultRouteActionWeightedBackendServiceArgs();
        }

        public Builder(RegionUrlMapPathMatcherDefaultRouteActionWeightedBackendServiceArgs defaults) {
            $ = new RegionUrlMapPathMatcherDefaultRouteActionWeightedBackendServiceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param backendService The full or partial URL to the default BackendService resource. Before forwarding the request to backendService, the load balancer applies any relevant headerActions specified as part of this backendServiceWeight.
         * 
         * @return builder
         * 
         */
        public Builder backendService(@Nullable Output<String> backendService) {
            $.backendService = backendService;
            return this;
        }

        /**
         * @param backendService The full or partial URL to the default BackendService resource. Before forwarding the request to backendService, the load balancer applies any relevant headerActions specified as part of this backendServiceWeight.
         * 
         * @return builder
         * 
         */
        public Builder backendService(String backendService) {
            return backendService(Output.of(backendService));
        }

        /**
         * @param headerAction Specifies changes to request and response headers that need to take effect for the selected backendService.
         * headerAction specified here take effect before headerAction in the enclosing HttpRouteRule, PathMatcher and UrlMap.
         * headerAction is not supported for load balancers that have their loadBalancingScheme set to EXTERNAL.
         * Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder headerAction(@Nullable Output<RegionUrlMapPathMatcherDefaultRouteActionWeightedBackendServiceHeaderActionArgs> headerAction) {
            $.headerAction = headerAction;
            return this;
        }

        /**
         * @param headerAction Specifies changes to request and response headers that need to take effect for the selected backendService.
         * headerAction specified here take effect before headerAction in the enclosing HttpRouteRule, PathMatcher and UrlMap.
         * headerAction is not supported for load balancers that have their loadBalancingScheme set to EXTERNAL.
         * Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder headerAction(RegionUrlMapPathMatcherDefaultRouteActionWeightedBackendServiceHeaderActionArgs headerAction) {
            return headerAction(Output.of(headerAction));
        }

        /**
         * @param weight Specifies the fraction of traffic sent to a backend service, computed as weight / (sum of all weightedBackendService weights in routeAction) .
         * The selection of a backend service is determined only for new traffic. Once a user&#39;s request has been directed to a backend service, subsequent requests are sent to the same backend service as determined by the backend service&#39;s session affinity policy.
         * The value must be from 0 to 1000.
         * 
         * @return builder
         * 
         */
        public Builder weight(@Nullable Output<Integer> weight) {
            $.weight = weight;
            return this;
        }

        /**
         * @param weight Specifies the fraction of traffic sent to a backend service, computed as weight / (sum of all weightedBackendService weights in routeAction) .
         * The selection of a backend service is determined only for new traffic. Once a user&#39;s request has been directed to a backend service, subsequent requests are sent to the same backend service as determined by the backend service&#39;s session affinity policy.
         * The value must be from 0 to 1000.
         * 
         * @return builder
         * 
         */
        public Builder weight(Integer weight) {
            return weight(Output.of(weight));
        }

        public RegionUrlMapPathMatcherDefaultRouteActionWeightedBackendServiceArgs build() {
            return $;
        }
    }

}
