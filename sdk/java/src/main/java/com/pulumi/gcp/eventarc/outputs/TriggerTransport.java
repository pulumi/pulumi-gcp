// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.eventarc.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.eventarc.outputs.TriggerTransportPubsub;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TriggerTransport {
    /**
     * @return The Pub/Sub topic and subscription used by Eventarc as delivery intermediary.
     * Structure is documented below.
     * 
     */
    private @Nullable TriggerTransportPubsub pubsub;

    private TriggerTransport() {}
    /**
     * @return The Pub/Sub topic and subscription used by Eventarc as delivery intermediary.
     * Structure is documented below.
     * 
     */
    public Optional<TriggerTransportPubsub> pubsub() {
        return Optional.ofNullable(this.pubsub);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerTransport defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable TriggerTransportPubsub pubsub;
        public Builder() {}
        public Builder(TriggerTransport defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pubsub = defaults.pubsub;
        }

        @CustomType.Setter
        public Builder pubsub(@Nullable TriggerTransportPubsub pubsub) {

            this.pubsub = pubsub;
            return this;
        }
        public TriggerTransport build() {
            final var _resultValue = new TriggerTransport();
            _resultValue.pubsub = pubsub;
            return _resultValue;
        }
    }
}
