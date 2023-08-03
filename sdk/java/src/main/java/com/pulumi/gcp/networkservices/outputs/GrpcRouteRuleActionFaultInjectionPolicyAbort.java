// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.networkservices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GrpcRouteRuleActionFaultInjectionPolicyAbort {
    /**
     * @return The HTTP status code used to abort the request.
     * 
     */
    private @Nullable Integer httpStatus;
    /**
     * @return The percentage of traffic which will be aborted.
     * 
     */
    private @Nullable Integer percentage;

    private GrpcRouteRuleActionFaultInjectionPolicyAbort() {}
    /**
     * @return The HTTP status code used to abort the request.
     * 
     */
    public Optional<Integer> httpStatus() {
        return Optional.ofNullable(this.httpStatus);
    }
    /**
     * @return The percentage of traffic which will be aborted.
     * 
     */
    public Optional<Integer> percentage() {
        return Optional.ofNullable(this.percentage);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GrpcRouteRuleActionFaultInjectionPolicyAbort defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer httpStatus;
        private @Nullable Integer percentage;
        public Builder() {}
        public Builder(GrpcRouteRuleActionFaultInjectionPolicyAbort defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpStatus = defaults.httpStatus;
    	      this.percentage = defaults.percentage;
        }

        @CustomType.Setter
        public Builder httpStatus(@Nullable Integer httpStatus) {
            this.httpStatus = httpStatus;
            return this;
        }
        @CustomType.Setter
        public Builder percentage(@Nullable Integer percentage) {
            this.percentage = percentage;
            return this;
        }
        public GrpcRouteRuleActionFaultInjectionPolicyAbort build() {
            final var o = new GrpcRouteRuleActionFaultInjectionPolicyAbort();
            o.httpStatus = httpStatus;
            o.percentage = percentage;
            return o;
        }
    }
}