// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class BucketEncryption {
    private final String defaultKmsKeyName;

    @CustomType.Constructor
    private BucketEncryption(@CustomType.Parameter("defaultKmsKeyName") String defaultKmsKeyName) {
        this.defaultKmsKeyName = defaultKmsKeyName;
    }

    public String defaultKmsKeyName() {
        return this.defaultKmsKeyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketEncryption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String defaultKmsKeyName;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketEncryption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultKmsKeyName = defaults.defaultKmsKeyName;
        }

        public Builder defaultKmsKeyName(String defaultKmsKeyName) {
            this.defaultKmsKeyName = Objects.requireNonNull(defaultKmsKeyName);
            return this;
        }        public BucketEncryption build() {
            return new BucketEncryption(defaultKmsKeyName);
        }
    }
}