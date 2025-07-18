// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class URLMapDefaultRouteActionRequestMirrorPolicy {
    /**
     * @return The full or partial URL to the BackendService resource being mirrored to.
     * 
     */
    private String backendService;
    /**
     * @return The percentage of requests to be mirrored to backendService.
     * The value must be between 0.0 and 100.0 inclusive.
     * 
     */
    private @Nullable Double mirrorPercent;

    private URLMapDefaultRouteActionRequestMirrorPolicy() {}
    /**
     * @return The full or partial URL to the BackendService resource being mirrored to.
     * 
     */
    public String backendService() {
        return this.backendService;
    }
    /**
     * @return The percentage of requests to be mirrored to backendService.
     * The value must be between 0.0 and 100.0 inclusive.
     * 
     */
    public Optional<Double> mirrorPercent() {
        return Optional.ofNullable(this.mirrorPercent);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapDefaultRouteActionRequestMirrorPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String backendService;
        private @Nullable Double mirrorPercent;
        public Builder() {}
        public Builder(URLMapDefaultRouteActionRequestMirrorPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendService = defaults.backendService;
    	      this.mirrorPercent = defaults.mirrorPercent;
        }

        @CustomType.Setter
        public Builder backendService(String backendService) {
            if (backendService == null) {
              throw new MissingRequiredPropertyException("URLMapDefaultRouteActionRequestMirrorPolicy", "backendService");
            }
            this.backendService = backendService;
            return this;
        }
        @CustomType.Setter
        public Builder mirrorPercent(@Nullable Double mirrorPercent) {

            this.mirrorPercent = mirrorPercent;
            return this;
        }
        public URLMapDefaultRouteActionRequestMirrorPolicy build() {
            final var _resultValue = new URLMapDefaultRouteActionRequestMirrorPolicy();
            _resultValue.backendService = backendService;
            _resultValue.mirrorPercent = mirrorPercent;
            return _resultValue;
        }
    }
}
