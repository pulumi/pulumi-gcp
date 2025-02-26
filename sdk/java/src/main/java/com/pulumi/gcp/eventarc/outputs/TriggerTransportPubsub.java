// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.eventarc.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TriggerTransportPubsub {
    /**
     * @return (Output)
     * Output only. The name of the Pub/Sub subscription created and managed by Eventarc system as a transport for the event delivery. Format: `projects/{PROJECT_ID}/subscriptions/{SUBSCRIPTION_NAME}`.
     * 
     */
    private @Nullable String subscription;
    /**
     * @return Optional. The name of the Pub/Sub topic created and managed by Eventarc system as a transport for the event delivery. Format: `projects/{PROJECT_ID}/topics/{TOPIC_NAME}. You may set an existing topic for triggers of the type google.cloud.pubsub.topic.v1.messagePublished` only. The topic you provide here will not be deleted by Eventarc at trigger deletion.
     * 
     */
    private @Nullable String topic;

    private TriggerTransportPubsub() {}
    /**
     * @return (Output)
     * Output only. The name of the Pub/Sub subscription created and managed by Eventarc system as a transport for the event delivery. Format: `projects/{PROJECT_ID}/subscriptions/{SUBSCRIPTION_NAME}`.
     * 
     */
    public Optional<String> subscription() {
        return Optional.ofNullable(this.subscription);
    }
    /**
     * @return Optional. The name of the Pub/Sub topic created and managed by Eventarc system as a transport for the event delivery. Format: `projects/{PROJECT_ID}/topics/{TOPIC_NAME}. You may set an existing topic for triggers of the type google.cloud.pubsub.topic.v1.messagePublished` only. The topic you provide here will not be deleted by Eventarc at trigger deletion.
     * 
     */
    public Optional<String> topic() {
        return Optional.ofNullable(this.topic);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerTransportPubsub defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String subscription;
        private @Nullable String topic;
        public Builder() {}
        public Builder(TriggerTransportPubsub defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subscription = defaults.subscription;
    	      this.topic = defaults.topic;
        }

        @CustomType.Setter
        public Builder subscription(@Nullable String subscription) {

            this.subscription = subscription;
            return this;
        }
        @CustomType.Setter
        public Builder topic(@Nullable String topic) {

            this.topic = topic;
            return this;
        }
        public TriggerTransportPubsub build() {
            final var _resultValue = new TriggerTransportPubsub();
            _resultValue.subscription = subscription;
            _resultValue.topic = topic;
            return _resultValue;
        }
    }
}
