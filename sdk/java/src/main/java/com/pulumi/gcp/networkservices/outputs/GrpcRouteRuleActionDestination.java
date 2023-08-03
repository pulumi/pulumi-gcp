// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.networkservices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GrpcRouteRuleActionDestination {
    /**
     * @return The URL of a BackendService to route traffic to.
     * 
     */
    private @Nullable String serviceName;
    /**
     * @return Specifies the proportion of requests forwarded to the backend referenced by the serviceName field.
     * 
     */
    private @Nullable Integer weight;

    private GrpcRouteRuleActionDestination() {}
    /**
     * @return The URL of a BackendService to route traffic to.
     * 
     */
    public Optional<String> serviceName() {
        return Optional.ofNullable(this.serviceName);
    }
    /**
     * @return Specifies the proportion of requests forwarded to the backend referenced by the serviceName field.
     * 
     */
    public Optional<Integer> weight() {
        return Optional.ofNullable(this.weight);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GrpcRouteRuleActionDestination defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String serviceName;
        private @Nullable Integer weight;
        public Builder() {}
        public Builder(GrpcRouteRuleActionDestination defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.serviceName = defaults.serviceName;
    	      this.weight = defaults.weight;
        }

        @CustomType.Setter
        public Builder serviceName(@Nullable String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        @CustomType.Setter
        public Builder weight(@Nullable Integer weight) {
            this.weight = weight;
            return this;
        }
        public GrpcRouteRuleActionDestination build() {
            final var o = new GrpcRouteRuleActionDestination();
            o.serviceName = serviceName;
            o.weight = weight;
            return o;
        }
    }
}