// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.container.outputs.GetClusterNotificationConfigPubsub;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetClusterNotificationConfig {
    /**
     * @return Notification config for Cloud Pub/Sub
     * 
     */
    private List<GetClusterNotificationConfigPubsub> pubsubs;

    private GetClusterNotificationConfig() {}
    /**
     * @return Notification config for Cloud Pub/Sub
     * 
     */
    public List<GetClusterNotificationConfigPubsub> pubsubs() {
        return this.pubsubs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterNotificationConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetClusterNotificationConfigPubsub> pubsubs;
        public Builder() {}
        public Builder(GetClusterNotificationConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pubsubs = defaults.pubsubs;
        }

        @CustomType.Setter
        public Builder pubsubs(List<GetClusterNotificationConfigPubsub> pubsubs) {
            if (pubsubs == null) {
              throw new MissingRequiredPropertyException("GetClusterNotificationConfig", "pubsubs");
            }
            this.pubsubs = pubsubs;
            return this;
        }
        public Builder pubsubs(GetClusterNotificationConfigPubsub... pubsubs) {
            return pubsubs(List.of(pubsubs));
        }
        public GetClusterNotificationConfig build() {
            final var _resultValue = new GetClusterNotificationConfig();
            _resultValue.pubsubs = pubsubs;
            return _resultValue;
        }
    }
}
