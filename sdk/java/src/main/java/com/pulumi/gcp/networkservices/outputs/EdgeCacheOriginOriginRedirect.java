// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.networkservices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class EdgeCacheOriginOriginRedirect {
    /**
     * @return The set of redirect response codes that the CDN
     * follows. Values of
     * [RedirectConditions](https://cloud.google.com/media-cdn/docs/reference/rest/v1/projects.locations.edgeCacheOrigins#redirectconditions)
     * are accepted.
     * 
     */
    private @Nullable List<String> redirectConditions;

    private EdgeCacheOriginOriginRedirect() {}
    /**
     * @return The set of redirect response codes that the CDN
     * follows. Values of
     * [RedirectConditions](https://cloud.google.com/media-cdn/docs/reference/rest/v1/projects.locations.edgeCacheOrigins#redirectconditions)
     * are accepted.
     * 
     */
    public List<String> redirectConditions() {
        return this.redirectConditions == null ? List.of() : this.redirectConditions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdgeCacheOriginOriginRedirect defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> redirectConditions;
        public Builder() {}
        public Builder(EdgeCacheOriginOriginRedirect defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.redirectConditions = defaults.redirectConditions;
        }

        @CustomType.Setter
        public Builder redirectConditions(@Nullable List<String> redirectConditions) {

            this.redirectConditions = redirectConditions;
            return this;
        }
        public Builder redirectConditions(String... redirectConditions) {
            return redirectConditions(List.of(redirectConditions));
        }
        public EdgeCacheOriginOriginRedirect build() {
            final var _resultValue = new EdgeCacheOriginOriginRedirect();
            _resultValue.redirectConditions = redirectConditions;
            return _resultValue;
        }
    }
}
