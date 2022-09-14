// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.apigee.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EnvironmentNodeConfig {
    /**
     * @return -
     * The current total number of gateway nodes that each environment currently has across
     * all instances.
     * 
     */
    private @Nullable String currentAggregateNodeCount;
    /**
     * @return The maximum total number of gateway nodes that the is reserved for all instances that
     * has the specified environment. If not specified, the default is determined by the
     * recommended maximum number of nodes for that gateway.
     * 
     */
    private @Nullable String maxNodeCount;
    /**
     * @return The minimum total number of gateway nodes that the is reserved for all instances that
     * has the specified environment. If not specified, the default is determined by the
     * recommended minimum number of nodes for that gateway.
     * 
     */
    private @Nullable String minNodeCount;

    private EnvironmentNodeConfig() {}
    /**
     * @return -
     * The current total number of gateway nodes that each environment currently has across
     * all instances.
     * 
     */
    public Optional<String> currentAggregateNodeCount() {
        return Optional.ofNullable(this.currentAggregateNodeCount);
    }
    /**
     * @return The maximum total number of gateway nodes that the is reserved for all instances that
     * has the specified environment. If not specified, the default is determined by the
     * recommended maximum number of nodes for that gateway.
     * 
     */
    public Optional<String> maxNodeCount() {
        return Optional.ofNullable(this.maxNodeCount);
    }
    /**
     * @return The minimum total number of gateway nodes that the is reserved for all instances that
     * has the specified environment. If not specified, the default is determined by the
     * recommended minimum number of nodes for that gateway.
     * 
     */
    public Optional<String> minNodeCount() {
        return Optional.ofNullable(this.minNodeCount);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentNodeConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String currentAggregateNodeCount;
        private @Nullable String maxNodeCount;
        private @Nullable String minNodeCount;
        public Builder() {}
        public Builder(EnvironmentNodeConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.currentAggregateNodeCount = defaults.currentAggregateNodeCount;
    	      this.maxNodeCount = defaults.maxNodeCount;
    	      this.minNodeCount = defaults.minNodeCount;
        }

        @CustomType.Setter
        public Builder currentAggregateNodeCount(@Nullable String currentAggregateNodeCount) {
            this.currentAggregateNodeCount = currentAggregateNodeCount;
            return this;
        }
        @CustomType.Setter
        public Builder maxNodeCount(@Nullable String maxNodeCount) {
            this.maxNodeCount = maxNodeCount;
            return this;
        }
        @CustomType.Setter
        public Builder minNodeCount(@Nullable String minNodeCount) {
            this.minNodeCount = minNodeCount;
            return this;
        }
        public EnvironmentNodeConfig build() {
            final var o = new EnvironmentNodeConfig();
            o.currentAggregateNodeCount = currentAggregateNodeCount;
            o.maxNodeCount = maxNodeCount;
            o.minNodeCount = minNodeCount;
            return o;
        }
    }
}