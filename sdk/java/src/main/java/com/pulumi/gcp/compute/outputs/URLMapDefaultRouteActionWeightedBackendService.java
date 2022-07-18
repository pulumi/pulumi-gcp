// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.compute.outputs.URLMapDefaultRouteActionWeightedBackendServiceHeaderAction;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class URLMapDefaultRouteActionWeightedBackendService {
    /**
     * @return The full or partial URL to the BackendService resource being mirrored to.
     * 
     */
    private final @Nullable String backendService;
    /**
     * @return Specifies changes to request and response headers that need to take effect for
     * the selected backendService.
     * headerAction specified here take effect before headerAction in the enclosing
     * HttpRouteRule, PathMatcher and UrlMap.
     * Structure is documented below.
     * 
     */
    private final @Nullable URLMapDefaultRouteActionWeightedBackendServiceHeaderAction headerAction;
    /**
     * @return Specifies the fraction of traffic sent to backendService, computed as
     * weight / (sum of all weightedBackendService weights in routeAction) .
     * The selection of a backend service is determined only for new traffic. Once a user&#39;s request
     * has been directed to a backendService, subsequent requests will be sent to the same backendService
     * as determined by the BackendService&#39;s session affinity policy.
     * The value must be between 0 and 1000
     * 
     */
    private final @Nullable Integer weight;

    @CustomType.Constructor
    private URLMapDefaultRouteActionWeightedBackendService(
        @CustomType.Parameter("backendService") @Nullable String backendService,
        @CustomType.Parameter("headerAction") @Nullable URLMapDefaultRouteActionWeightedBackendServiceHeaderAction headerAction,
        @CustomType.Parameter("weight") @Nullable Integer weight) {
        this.backendService = backendService;
        this.headerAction = headerAction;
        this.weight = weight;
    }

    /**
     * @return The full or partial URL to the BackendService resource being mirrored to.
     * 
     */
    public Optional<String> backendService() {
        return Optional.ofNullable(this.backendService);
    }
    /**
     * @return Specifies changes to request and response headers that need to take effect for
     * the selected backendService.
     * headerAction specified here take effect before headerAction in the enclosing
     * HttpRouteRule, PathMatcher and UrlMap.
     * Structure is documented below.
     * 
     */
    public Optional<URLMapDefaultRouteActionWeightedBackendServiceHeaderAction> headerAction() {
        return Optional.ofNullable(this.headerAction);
    }
    /**
     * @return Specifies the fraction of traffic sent to backendService, computed as
     * weight / (sum of all weightedBackendService weights in routeAction) .
     * The selection of a backend service is determined only for new traffic. Once a user&#39;s request
     * has been directed to a backendService, subsequent requests will be sent to the same backendService
     * as determined by the BackendService&#39;s session affinity policy.
     * The value must be between 0 and 1000
     * 
     */
    public Optional<Integer> weight() {
        return Optional.ofNullable(this.weight);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapDefaultRouteActionWeightedBackendService defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String backendService;
        private @Nullable URLMapDefaultRouteActionWeightedBackendServiceHeaderAction headerAction;
        private @Nullable Integer weight;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapDefaultRouteActionWeightedBackendService defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendService = defaults.backendService;
    	      this.headerAction = defaults.headerAction;
    	      this.weight = defaults.weight;
        }

        public Builder backendService(@Nullable String backendService) {
            this.backendService = backendService;
            return this;
        }
        public Builder headerAction(@Nullable URLMapDefaultRouteActionWeightedBackendServiceHeaderAction headerAction) {
            this.headerAction = headerAction;
            return this;
        }
        public Builder weight(@Nullable Integer weight) {
            this.weight = weight;
            return this;
        }        public URLMapDefaultRouteActionWeightedBackendService build() {
            return new URLMapDefaultRouteActionWeightedBackendService(backendService, headerAction, weight);
        }
    }
}