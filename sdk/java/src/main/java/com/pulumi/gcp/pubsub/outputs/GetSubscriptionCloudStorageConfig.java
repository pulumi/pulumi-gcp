// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.pubsub.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.pubsub.outputs.GetSubscriptionCloudStorageConfigAvroConfig;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSubscriptionCloudStorageConfig {
    private List<GetSubscriptionCloudStorageConfigAvroConfig> avroConfigs;
    private String bucket;
    private String filenamePrefix;
    private String filenameSuffix;
    private Integer maxBytes;
    private String maxDuration;
    private String state;

    private GetSubscriptionCloudStorageConfig() {}
    public List<GetSubscriptionCloudStorageConfigAvroConfig> avroConfigs() {
        return this.avroConfigs;
    }
    public String bucket() {
        return this.bucket;
    }
    public String filenamePrefix() {
        return this.filenamePrefix;
    }
    public String filenameSuffix() {
        return this.filenameSuffix;
    }
    public Integer maxBytes() {
        return this.maxBytes;
    }
    public String maxDuration() {
        return this.maxDuration;
    }
    public String state() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSubscriptionCloudStorageConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetSubscriptionCloudStorageConfigAvroConfig> avroConfigs;
        private String bucket;
        private String filenamePrefix;
        private String filenameSuffix;
        private Integer maxBytes;
        private String maxDuration;
        private String state;
        public Builder() {}
        public Builder(GetSubscriptionCloudStorageConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.avroConfigs = defaults.avroConfigs;
    	      this.bucket = defaults.bucket;
    	      this.filenamePrefix = defaults.filenamePrefix;
    	      this.filenameSuffix = defaults.filenameSuffix;
    	      this.maxBytes = defaults.maxBytes;
    	      this.maxDuration = defaults.maxDuration;
    	      this.state = defaults.state;
        }

        @CustomType.Setter
        public Builder avroConfigs(List<GetSubscriptionCloudStorageConfigAvroConfig> avroConfigs) {
            this.avroConfigs = Objects.requireNonNull(avroConfigs);
            return this;
        }
        public Builder avroConfigs(GetSubscriptionCloudStorageConfigAvroConfig... avroConfigs) {
            return avroConfigs(List.of(avroConfigs));
        }
        @CustomType.Setter
        public Builder bucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }
        @CustomType.Setter
        public Builder filenamePrefix(String filenamePrefix) {
            this.filenamePrefix = Objects.requireNonNull(filenamePrefix);
            return this;
        }
        @CustomType.Setter
        public Builder filenameSuffix(String filenameSuffix) {
            this.filenameSuffix = Objects.requireNonNull(filenameSuffix);
            return this;
        }
        @CustomType.Setter
        public Builder maxBytes(Integer maxBytes) {
            this.maxBytes = Objects.requireNonNull(maxBytes);
            return this;
        }
        @CustomType.Setter
        public Builder maxDuration(String maxDuration) {
            this.maxDuration = Objects.requireNonNull(maxDuration);
            return this;
        }
        @CustomType.Setter
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public GetSubscriptionCloudStorageConfig build() {
            final var o = new GetSubscriptionCloudStorageConfig();
            o.avroConfigs = avroConfigs;
            o.bucket = bucket;
            o.filenamePrefix = filenamePrefix;
            o.filenameSuffix = filenameSuffix;
            o.maxBytes = maxBytes;
            o.maxDuration = maxDuration;
            o.state = state;
            return o;
        }
    }
}