// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SecurityPolicyRuleRateLimitOptionsBanThresholdArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecurityPolicyRuleRateLimitOptionsBanThresholdArgs Empty = new SecurityPolicyRuleRateLimitOptionsBanThresholdArgs();

    /**
     * Number of HTTP(S) requests for calculating the threshold.
     * 
     */
    @Import(name="count")
    private @Nullable Output<Integer> count;

    /**
     * @return Number of HTTP(S) requests for calculating the threshold.
     * 
     */
    public Optional<Output<Integer>> count() {
        return Optional.ofNullable(this.count);
    }

    /**
     * Interval over which the threshold is computed.
     * 
     */
    @Import(name="intervalSec")
    private @Nullable Output<Integer> intervalSec;

    /**
     * @return Interval over which the threshold is computed.
     * 
     */
    public Optional<Output<Integer>> intervalSec() {
        return Optional.ofNullable(this.intervalSec);
    }

    private SecurityPolicyRuleRateLimitOptionsBanThresholdArgs() {}

    private SecurityPolicyRuleRateLimitOptionsBanThresholdArgs(SecurityPolicyRuleRateLimitOptionsBanThresholdArgs $) {
        this.count = $.count;
        this.intervalSec = $.intervalSec;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecurityPolicyRuleRateLimitOptionsBanThresholdArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecurityPolicyRuleRateLimitOptionsBanThresholdArgs $;

        public Builder() {
            $ = new SecurityPolicyRuleRateLimitOptionsBanThresholdArgs();
        }

        public Builder(SecurityPolicyRuleRateLimitOptionsBanThresholdArgs defaults) {
            $ = new SecurityPolicyRuleRateLimitOptionsBanThresholdArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param count Number of HTTP(S) requests for calculating the threshold.
         * 
         * @return builder
         * 
         */
        public Builder count(@Nullable Output<Integer> count) {
            $.count = count;
            return this;
        }

        /**
         * @param count Number of HTTP(S) requests for calculating the threshold.
         * 
         * @return builder
         * 
         */
        public Builder count(Integer count) {
            return count(Output.of(count));
        }

        /**
         * @param intervalSec Interval over which the threshold is computed.
         * 
         * @return builder
         * 
         */
        public Builder intervalSec(@Nullable Output<Integer> intervalSec) {
            $.intervalSec = intervalSec;
            return this;
        }

        /**
         * @param intervalSec Interval over which the threshold is computed.
         * 
         * @return builder
         * 
         */
        public Builder intervalSec(Integer intervalSec) {
            return intervalSec(Output.of(intervalSec));
        }

        public SecurityPolicyRuleRateLimitOptionsBanThresholdArgs build() {
            return $;
        }
    }

}
