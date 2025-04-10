// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.monitoring.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AlertPolicyAlertStrategyNotificationChannelStrategy {
    /**
     * @return The notification channels that these settings apply to. Each of these
     * correspond to the name field in one of the NotificationChannel objects
     * referenced in the notification_channels field of this AlertPolicy. The format is
     * `projects/[PROJECT_ID_OR_NUMBER]/notificationChannels/[CHANNEL_ID]`
     * 
     */
    private @Nullable List<String> notificationChannelNames;
    /**
     * @return The frequency at which to send reminder notifications for open incidents.
     * 
     */
    private @Nullable String renotifyInterval;

    private AlertPolicyAlertStrategyNotificationChannelStrategy() {}
    /**
     * @return The notification channels that these settings apply to. Each of these
     * correspond to the name field in one of the NotificationChannel objects
     * referenced in the notification_channels field of this AlertPolicy. The format is
     * `projects/[PROJECT_ID_OR_NUMBER]/notificationChannels/[CHANNEL_ID]`
     * 
     */
    public List<String> notificationChannelNames() {
        return this.notificationChannelNames == null ? List.of() : this.notificationChannelNames;
    }
    /**
     * @return The frequency at which to send reminder notifications for open incidents.
     * 
     */
    public Optional<String> renotifyInterval() {
        return Optional.ofNullable(this.renotifyInterval);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertPolicyAlertStrategyNotificationChannelStrategy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> notificationChannelNames;
        private @Nullable String renotifyInterval;
        public Builder() {}
        public Builder(AlertPolicyAlertStrategyNotificationChannelStrategy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.notificationChannelNames = defaults.notificationChannelNames;
    	      this.renotifyInterval = defaults.renotifyInterval;
        }

        @CustomType.Setter
        public Builder notificationChannelNames(@Nullable List<String> notificationChannelNames) {

            this.notificationChannelNames = notificationChannelNames;
            return this;
        }
        public Builder notificationChannelNames(String... notificationChannelNames) {
            return notificationChannelNames(List.of(notificationChannelNames));
        }
        @CustomType.Setter
        public Builder renotifyInterval(@Nullable String renotifyInterval) {

            this.renotifyInterval = renotifyInterval;
            return this;
        }
        public AlertPolicyAlertStrategyNotificationChannelStrategy build() {
            final var _resultValue = new AlertPolicyAlertStrategyNotificationChannelStrategy();
            _resultValue.notificationChannelNames = notificationChannelNames;
            _resultValue.renotifyInterval = renotifyInterval;
            return _resultValue;
        }
    }
}
