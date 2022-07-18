// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class SecurityPolicyRuleRateLimitOptionsBanThreshold {
    /**
     * @return Number of HTTP(S) requests for calculating the threshold.
     * 
     */
    private final Integer count;
    /**
     * @return Interval over which the threshold is computed.
     * 
     */
    private final Integer intervalSec;

    @CustomType.Constructor
    private SecurityPolicyRuleRateLimitOptionsBanThreshold(
        @CustomType.Parameter("count") Integer count,
        @CustomType.Parameter("intervalSec") Integer intervalSec) {
        this.count = count;
        this.intervalSec = intervalSec;
    }

    /**
     * @return Number of HTTP(S) requests for calculating the threshold.
     * 
     */
    public Integer count() {
        return this.count;
    }
    /**
     * @return Interval over which the threshold is computed.
     * 
     */
    public Integer intervalSec() {
        return this.intervalSec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyRuleRateLimitOptionsBanThreshold defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer count;
        private Integer intervalSec;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyRuleRateLimitOptionsBanThreshold defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.intervalSec = defaults.intervalSec;
        }

        public Builder count(Integer count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }
        public Builder intervalSec(Integer intervalSec) {
            this.intervalSec = Objects.requireNonNull(intervalSec);
            return this;
        }        public SecurityPolicyRuleRateLimitOptionsBanThreshold build() {
            return new SecurityPolicyRuleRateLimitOptionsBanThreshold(count, intervalSec);
        }
    }
}