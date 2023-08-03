// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.networkservices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GrpcRouteRuleActionRetryPolicy {
    /**
     * @return Specifies the allowed number of retries.
     * 
     * ***
     * 
     */
    private @Nullable Integer numRetries;
    /**
     * @return Specifies one or more conditions when this retry policy applies.
     * Each value may be one of: `connect-failure`, `refused-stream`, `cancelled`, `deadline-exceeded`, `resource-exhausted`, `unavailable`.
     * 
     */
    private @Nullable List<String> retryConditions;

    private GrpcRouteRuleActionRetryPolicy() {}
    /**
     * @return Specifies the allowed number of retries.
     * 
     * ***
     * 
     */
    public Optional<Integer> numRetries() {
        return Optional.ofNullable(this.numRetries);
    }
    /**
     * @return Specifies one or more conditions when this retry policy applies.
     * Each value may be one of: `connect-failure`, `refused-stream`, `cancelled`, `deadline-exceeded`, `resource-exhausted`, `unavailable`.
     * 
     */
    public List<String> retryConditions() {
        return this.retryConditions == null ? List.of() : this.retryConditions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GrpcRouteRuleActionRetryPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer numRetries;
        private @Nullable List<String> retryConditions;
        public Builder() {}
        public Builder(GrpcRouteRuleActionRetryPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.numRetries = defaults.numRetries;
    	      this.retryConditions = defaults.retryConditions;
        }

        @CustomType.Setter
        public Builder numRetries(@Nullable Integer numRetries) {
            this.numRetries = numRetries;
            return this;
        }
        @CustomType.Setter
        public Builder retryConditions(@Nullable List<String> retryConditions) {
            this.retryConditions = retryConditions;
            return this;
        }
        public Builder retryConditions(String... retryConditions) {
            return retryConditions(List.of(retryConditions));
        }
        public GrpcRouteRuleActionRetryPolicy build() {
            final var o = new GrpcRouteRuleActionRetryPolicy();
            o.numRetries = numRetries;
            o.retryConditions = retryConditions;
            return o;
        }
    }
}