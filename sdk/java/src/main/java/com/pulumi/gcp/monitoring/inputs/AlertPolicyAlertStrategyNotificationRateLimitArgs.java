// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.monitoring.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AlertPolicyAlertStrategyNotificationRateLimitArgs extends com.pulumi.resources.ResourceArgs {

    public static final AlertPolicyAlertStrategyNotificationRateLimitArgs Empty = new AlertPolicyAlertStrategyNotificationRateLimitArgs();

    /**
     * Not more than one notification per period.
     * A duration in seconds with up to nine fractional digits, terminated by &#39;s&#39;. Example &#34;60.5s&#34;.
     * 
     */
    @Import(name="period")
    private @Nullable Output<String> period;

    /**
     * @return Not more than one notification per period.
     * A duration in seconds with up to nine fractional digits, terminated by &#39;s&#39;. Example &#34;60.5s&#34;.
     * 
     */
    public Optional<Output<String>> period() {
        return Optional.ofNullable(this.period);
    }

    private AlertPolicyAlertStrategyNotificationRateLimitArgs() {}

    private AlertPolicyAlertStrategyNotificationRateLimitArgs(AlertPolicyAlertStrategyNotificationRateLimitArgs $) {
        this.period = $.period;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AlertPolicyAlertStrategyNotificationRateLimitArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AlertPolicyAlertStrategyNotificationRateLimitArgs $;

        public Builder() {
            $ = new AlertPolicyAlertStrategyNotificationRateLimitArgs();
        }

        public Builder(AlertPolicyAlertStrategyNotificationRateLimitArgs defaults) {
            $ = new AlertPolicyAlertStrategyNotificationRateLimitArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param period Not more than one notification per period.
         * A duration in seconds with up to nine fractional digits, terminated by &#39;s&#39;. Example &#34;60.5s&#34;.
         * 
         * @return builder
         * 
         */
        public Builder period(@Nullable Output<String> period) {
            $.period = period;
            return this;
        }

        /**
         * @param period Not more than one notification per period.
         * A duration in seconds with up to nine fractional digits, terminated by &#39;s&#39;. Example &#34;60.5s&#34;.
         * 
         * @return builder
         * 
         */
        public Builder period(String period) {
            return period(Output.of(period));
        }

        public AlertPolicyAlertStrategyNotificationRateLimitArgs build() {
            return $;
        }
    }

}
