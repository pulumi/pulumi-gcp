// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.composer.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class EnvironmentStorageConfig {
    private String bucket;

    private EnvironmentStorageConfig() {}
    public String bucket() {
        return this.bucket;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentStorageConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String bucket;
        public Builder() {}
        public Builder(EnvironmentStorageConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
        }

        @CustomType.Setter
        public Builder bucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }
        public EnvironmentStorageConfig build() {
            final var o = new EnvironmentStorageConfig();
            o.bucket = bucket;
            return o;
        }
    }
}