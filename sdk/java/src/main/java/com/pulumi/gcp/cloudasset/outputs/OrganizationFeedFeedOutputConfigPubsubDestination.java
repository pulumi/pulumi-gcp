// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudasset.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class OrganizationFeedFeedOutputConfigPubsubDestination {
    /**
     * @return Destination on Cloud Pubsub topic.
     * 
     */
    private String topic;

    private OrganizationFeedFeedOutputConfigPubsubDestination() {}
    /**
     * @return Destination on Cloud Pubsub topic.
     * 
     */
    public String topic() {
        return this.topic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrganizationFeedFeedOutputConfigPubsubDestination defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String topic;
        public Builder() {}
        public Builder(OrganizationFeedFeedOutputConfigPubsubDestination defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.topic = defaults.topic;
        }

        @CustomType.Setter
        public Builder topic(String topic) {
            if (topic == null) {
              throw new MissingRequiredPropertyException("OrganizationFeedFeedOutputConfigPubsubDestination", "topic");
            }
            this.topic = topic;
            return this;
        }
        public OrganizationFeedFeedOutputConfigPubsubDestination build() {
            final var _resultValue = new OrganizationFeedFeedOutputConfigPubsubDestination();
            _resultValue.topic = topic;
            return _resultValue;
        }
    }
}
