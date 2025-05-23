// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.transcoder.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobConfigPubsubDestination {
    /**
     * @return The name of the Pub/Sub topic to publish job completion notification to. For example: projects/{project}/topics/{topic}.
     * 
     */
    private @Nullable String topic;

    private JobConfigPubsubDestination() {}
    /**
     * @return The name of the Pub/Sub topic to publish job completion notification to. For example: projects/{project}/topics/{topic}.
     * 
     */
    public Optional<String> topic() {
        return Optional.ofNullable(this.topic);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobConfigPubsubDestination defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String topic;
        public Builder() {}
        public Builder(JobConfigPubsubDestination defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.topic = defaults.topic;
        }

        @CustomType.Setter
        public Builder topic(@Nullable String topic) {

            this.topic = topic;
            return this;
        }
        public JobConfigPubsubDestination build() {
            final var _resultValue = new JobConfigPubsubDestination();
            _resultValue.topic = topic;
            return _resultValue;
        }
    }
}
