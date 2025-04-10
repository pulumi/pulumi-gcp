// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.networkservices.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.networkservices.outputs.EdgeCacheServiceRoutingPathMatcherRouteRule;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EdgeCacheServiceRoutingPathMatcher {
    /**
     * @return A human-readable description of the resource.
     * 
     */
    private @Nullable String description;
    /**
     * @return The name to which this PathMatcher is referred by the HostRule.
     * 
     */
    private String name;
    /**
     * @return The routeRules to match against. routeRules support advanced routing behaviour, and can match on paths, headers and query parameters, as well as status codes and HTTP methods.
     * Structure is documented below.
     * 
     */
    private List<EdgeCacheServiceRoutingPathMatcherRouteRule> routeRules;

    private EdgeCacheServiceRoutingPathMatcher() {}
    /**
     * @return A human-readable description of the resource.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return The name to which this PathMatcher is referred by the HostRule.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The routeRules to match against. routeRules support advanced routing behaviour, and can match on paths, headers and query parameters, as well as status codes and HTTP methods.
     * Structure is documented below.
     * 
     */
    public List<EdgeCacheServiceRoutingPathMatcherRouteRule> routeRules() {
        return this.routeRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdgeCacheServiceRoutingPathMatcher defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String description;
        private String name;
        private List<EdgeCacheServiceRoutingPathMatcherRouteRule> routeRules;
        public Builder() {}
        public Builder(EdgeCacheServiceRoutingPathMatcher defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.routeRules = defaults.routeRules;
        }

        @CustomType.Setter
        public Builder description(@Nullable String description) {

            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("EdgeCacheServiceRoutingPathMatcher", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder routeRules(List<EdgeCacheServiceRoutingPathMatcherRouteRule> routeRules) {
            if (routeRules == null) {
              throw new MissingRequiredPropertyException("EdgeCacheServiceRoutingPathMatcher", "routeRules");
            }
            this.routeRules = routeRules;
            return this;
        }
        public Builder routeRules(EdgeCacheServiceRoutingPathMatcherRouteRule... routeRules) {
            return routeRules(List.of(routeRules));
        }
        public EdgeCacheServiceRoutingPathMatcher build() {
            final var _resultValue = new EdgeCacheServiceRoutingPathMatcher();
            _resultValue.description = description;
            _resultValue.name = name;
            _resultValue.routeRules = routeRules;
            return _resultValue;
        }
    }
}
