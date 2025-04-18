// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.networkservices.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.networkservices.outputs.EdgeCacheServiceRoutingHostRule;
import com.pulumi.gcp.networkservices.outputs.EdgeCacheServiceRoutingPathMatcher;
import java.util.List;
import java.util.Objects;

@CustomType
public final class EdgeCacheServiceRouting {
    /**
     * @return The list of hostRules to match against. These rules define which hostnames the EdgeCacheService will match against, and which route configurations apply.
     * Structure is documented below.
     * 
     */
    private List<EdgeCacheServiceRoutingHostRule> hostRules;
    /**
     * @return The list of pathMatchers referenced via name by hostRules. PathMatcher is used to match the path portion of the URL when a HostRule matches the URL&#39;s host portion.
     * Structure is documented below.
     * 
     */
    private List<EdgeCacheServiceRoutingPathMatcher> pathMatchers;

    private EdgeCacheServiceRouting() {}
    /**
     * @return The list of hostRules to match against. These rules define which hostnames the EdgeCacheService will match against, and which route configurations apply.
     * Structure is documented below.
     * 
     */
    public List<EdgeCacheServiceRoutingHostRule> hostRules() {
        return this.hostRules;
    }
    /**
     * @return The list of pathMatchers referenced via name by hostRules. PathMatcher is used to match the path portion of the URL when a HostRule matches the URL&#39;s host portion.
     * Structure is documented below.
     * 
     */
    public List<EdgeCacheServiceRoutingPathMatcher> pathMatchers() {
        return this.pathMatchers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdgeCacheServiceRouting defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<EdgeCacheServiceRoutingHostRule> hostRules;
        private List<EdgeCacheServiceRoutingPathMatcher> pathMatchers;
        public Builder() {}
        public Builder(EdgeCacheServiceRouting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostRules = defaults.hostRules;
    	      this.pathMatchers = defaults.pathMatchers;
        }

        @CustomType.Setter
        public Builder hostRules(List<EdgeCacheServiceRoutingHostRule> hostRules) {
            if (hostRules == null) {
              throw new MissingRequiredPropertyException("EdgeCacheServiceRouting", "hostRules");
            }
            this.hostRules = hostRules;
            return this;
        }
        public Builder hostRules(EdgeCacheServiceRoutingHostRule... hostRules) {
            return hostRules(List.of(hostRules));
        }
        @CustomType.Setter
        public Builder pathMatchers(List<EdgeCacheServiceRoutingPathMatcher> pathMatchers) {
            if (pathMatchers == null) {
              throw new MissingRequiredPropertyException("EdgeCacheServiceRouting", "pathMatchers");
            }
            this.pathMatchers = pathMatchers;
            return this;
        }
        public Builder pathMatchers(EdgeCacheServiceRoutingPathMatcher... pathMatchers) {
            return pathMatchers(List.of(pathMatchers));
        }
        public EdgeCacheServiceRouting build() {
            final var _resultValue = new EdgeCacheServiceRouting();
            _resultValue.hostRules = hostRules;
            _resultValue.pathMatchers = pathMatchers;
            return _resultValue;
        }
    }
}
