// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PreventionJobTriggerInspectJobActionPubSub {
    /**
     * @return Cloud Pub/Sub topic to send notifications to.
     * 
     */
    private String topic;

    private PreventionJobTriggerInspectJobActionPubSub() {}
    /**
     * @return Cloud Pub/Sub topic to send notifications to.
     * 
     */
    public String topic() {
        return this.topic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionJobTriggerInspectJobActionPubSub defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String topic;
        public Builder() {}
        public Builder(PreventionJobTriggerInspectJobActionPubSub defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.topic = defaults.topic;
        }

        @CustomType.Setter
        public Builder topic(String topic) {
            this.topic = Objects.requireNonNull(topic);
            return this;
        }
        public PreventionJobTriggerInspectJobActionPubSub build() {
            final var o = new PreventionJobTriggerInspectJobActionPubSub();
            o.topic = topic;
            return o;
        }
    }
}