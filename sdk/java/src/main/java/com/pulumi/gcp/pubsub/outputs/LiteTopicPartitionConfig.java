// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.pubsub.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.pubsub.outputs.LiteTopicPartitionConfigCapacity;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LiteTopicPartitionConfig {
    /**
     * @return The capacity configuration.
     * Structure is documented below.
     * 
     */
    private @Nullable LiteTopicPartitionConfigCapacity capacity;
    /**
     * @return The number of partitions in the topic. Must be at least 1.
     * 
     */
    private Integer count;

    private LiteTopicPartitionConfig() {}
    /**
     * @return The capacity configuration.
     * Structure is documented below.
     * 
     */
    public Optional<LiteTopicPartitionConfigCapacity> capacity() {
        return Optional.ofNullable(this.capacity);
    }
    /**
     * @return The number of partitions in the topic. Must be at least 1.
     * 
     */
    public Integer count() {
        return this.count;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LiteTopicPartitionConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable LiteTopicPartitionConfigCapacity capacity;
        private Integer count;
        public Builder() {}
        public Builder(LiteTopicPartitionConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.count = defaults.count;
        }

        @CustomType.Setter
        public Builder capacity(@Nullable LiteTopicPartitionConfigCapacity capacity) {

            this.capacity = capacity;
            return this;
        }
        @CustomType.Setter
        public Builder count(Integer count) {
            if (count == null) {
              throw new MissingRequiredPropertyException("LiteTopicPartitionConfig", "count");
            }
            this.count = count;
            return this;
        }
        public LiteTopicPartitionConfig build() {
            final var _resultValue = new LiteTopicPartitionConfig();
            _resultValue.capacity = capacity;
            _resultValue.count = count;
            return _resultValue;
        }
    }
}
