// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ClusterNotificationConfigPubsubFilter {
    /**
     * @return Can be used to filter what notifications are sent. Accepted values are `UPGRADE_AVAILABLE_EVENT`, `UPGRADE_EVENT`, `SECURITY_BULLETIN_EVENT` and `UPGRADE_INFO_EVENT`. See [Filtering notifications](https://cloud.google.com/kubernetes-engine/docs/concepts/cluster-notifications#filtering) for more details.
     * 
     */
    private List<String> eventTypes;

    private ClusterNotificationConfigPubsubFilter() {}
    /**
     * @return Can be used to filter what notifications are sent. Accepted values are `UPGRADE_AVAILABLE_EVENT`, `UPGRADE_EVENT`, `SECURITY_BULLETIN_EVENT` and `UPGRADE_INFO_EVENT`. See [Filtering notifications](https://cloud.google.com/kubernetes-engine/docs/concepts/cluster-notifications#filtering) for more details.
     * 
     */
    public List<String> eventTypes() {
        return this.eventTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterNotificationConfigPubsubFilter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> eventTypes;
        public Builder() {}
        public Builder(ClusterNotificationConfigPubsubFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventTypes = defaults.eventTypes;
        }

        @CustomType.Setter
        public Builder eventTypes(List<String> eventTypes) {
            if (eventTypes == null) {
              throw new MissingRequiredPropertyException("ClusterNotificationConfigPubsubFilter", "eventTypes");
            }
            this.eventTypes = eventTypes;
            return this;
        }
        public Builder eventTypes(String... eventTypes) {
            return eventTypes(List.of(eventTypes));
        }
        public ClusterNotificationConfigPubsubFilter build() {
            final var _resultValue = new ClusterNotificationConfigPubsubFilter();
            _resultValue.eventTypes = eventTypes;
            return _resultValue;
        }
    }
}
