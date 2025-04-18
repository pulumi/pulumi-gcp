// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.monitoring.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.monitoring.outputs.AlertPolicyAlertStrategyNotificationChannelStrategy;
import com.pulumi.gcp.monitoring.outputs.AlertPolicyAlertStrategyNotificationRateLimit;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AlertPolicyAlertStrategy {
    /**
     * @return If an alert policy that was active has no data for this long, any open incidents will close.
     * 
     */
    private @Nullable String autoClose;
    /**
     * @return Control over how the notification channels in `notification_channels`
     * are notified when this alert fires, on a per-channel basis.
     * Structure is documented below.
     * 
     */
    private @Nullable List<AlertPolicyAlertStrategyNotificationChannelStrategy> notificationChannelStrategies;
    /**
     * @return Control when notifications will be sent out.
     * Each value may be one of: `NOTIFICATION_PROMPT_UNSPECIFIED`, `OPENED`, `CLOSED`.
     * 
     */
    private @Nullable List<String> notificationPrompts;
    /**
     * @return Required for alert policies with a LogMatch condition.
     * This limit is not implemented for alert policies that are not log-based.
     * Structure is documented below.
     * 
     */
    private @Nullable AlertPolicyAlertStrategyNotificationRateLimit notificationRateLimit;

    private AlertPolicyAlertStrategy() {}
    /**
     * @return If an alert policy that was active has no data for this long, any open incidents will close.
     * 
     */
    public Optional<String> autoClose() {
        return Optional.ofNullable(this.autoClose);
    }
    /**
     * @return Control over how the notification channels in `notification_channels`
     * are notified when this alert fires, on a per-channel basis.
     * Structure is documented below.
     * 
     */
    public List<AlertPolicyAlertStrategyNotificationChannelStrategy> notificationChannelStrategies() {
        return this.notificationChannelStrategies == null ? List.of() : this.notificationChannelStrategies;
    }
    /**
     * @return Control when notifications will be sent out.
     * Each value may be one of: `NOTIFICATION_PROMPT_UNSPECIFIED`, `OPENED`, `CLOSED`.
     * 
     */
    public List<String> notificationPrompts() {
        return this.notificationPrompts == null ? List.of() : this.notificationPrompts;
    }
    /**
     * @return Required for alert policies with a LogMatch condition.
     * This limit is not implemented for alert policies that are not log-based.
     * Structure is documented below.
     * 
     */
    public Optional<AlertPolicyAlertStrategyNotificationRateLimit> notificationRateLimit() {
        return Optional.ofNullable(this.notificationRateLimit);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertPolicyAlertStrategy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String autoClose;
        private @Nullable List<AlertPolicyAlertStrategyNotificationChannelStrategy> notificationChannelStrategies;
        private @Nullable List<String> notificationPrompts;
        private @Nullable AlertPolicyAlertStrategyNotificationRateLimit notificationRateLimit;
        public Builder() {}
        public Builder(AlertPolicyAlertStrategy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoClose = defaults.autoClose;
    	      this.notificationChannelStrategies = defaults.notificationChannelStrategies;
    	      this.notificationPrompts = defaults.notificationPrompts;
    	      this.notificationRateLimit = defaults.notificationRateLimit;
        }

        @CustomType.Setter
        public Builder autoClose(@Nullable String autoClose) {

            this.autoClose = autoClose;
            return this;
        }
        @CustomType.Setter
        public Builder notificationChannelStrategies(@Nullable List<AlertPolicyAlertStrategyNotificationChannelStrategy> notificationChannelStrategies) {

            this.notificationChannelStrategies = notificationChannelStrategies;
            return this;
        }
        public Builder notificationChannelStrategies(AlertPolicyAlertStrategyNotificationChannelStrategy... notificationChannelStrategies) {
            return notificationChannelStrategies(List.of(notificationChannelStrategies));
        }
        @CustomType.Setter
        public Builder notificationPrompts(@Nullable List<String> notificationPrompts) {

            this.notificationPrompts = notificationPrompts;
            return this;
        }
        public Builder notificationPrompts(String... notificationPrompts) {
            return notificationPrompts(List.of(notificationPrompts));
        }
        @CustomType.Setter
        public Builder notificationRateLimit(@Nullable AlertPolicyAlertStrategyNotificationRateLimit notificationRateLimit) {

            this.notificationRateLimit = notificationRateLimit;
            return this;
        }
        public AlertPolicyAlertStrategy build() {
            final var _resultValue = new AlertPolicyAlertStrategy();
            _resultValue.autoClose = autoClose;
            _resultValue.notificationChannelStrategies = notificationChannelStrategies;
            _resultValue.notificationPrompts = notificationPrompts;
            _resultValue.notificationRateLimit = notificationRateLimit;
            return _resultValue;
        }
    }
}
