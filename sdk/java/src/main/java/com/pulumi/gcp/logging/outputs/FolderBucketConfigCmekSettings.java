// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.logging.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FolderBucketConfigCmekSettings {
    private String kmsKeyName;
    private @Nullable String kmsKeyVersionName;
    /**
     * @return The resource name of the bucket. For example: &#34;folders/my-folder-id/locations/my-location/buckets/my-bucket-id&#34;
     * 
     */
    private @Nullable String name;
    private @Nullable String serviceAccountId;

    private FolderBucketConfigCmekSettings() {}
    public String kmsKeyName() {
        return this.kmsKeyName;
    }
    public Optional<String> kmsKeyVersionName() {
        return Optional.ofNullable(this.kmsKeyVersionName);
    }
    /**
     * @return The resource name of the bucket. For example: &#34;folders/my-folder-id/locations/my-location/buckets/my-bucket-id&#34;
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    public Optional<String> serviceAccountId() {
        return Optional.ofNullable(this.serviceAccountId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FolderBucketConfigCmekSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String kmsKeyName;
        private @Nullable String kmsKeyVersionName;
        private @Nullable String name;
        private @Nullable String serviceAccountId;
        public Builder() {}
        public Builder(FolderBucketConfigCmekSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyName = defaults.kmsKeyName;
    	      this.kmsKeyVersionName = defaults.kmsKeyVersionName;
    	      this.name = defaults.name;
    	      this.serviceAccountId = defaults.serviceAccountId;
        }

        @CustomType.Setter
        public Builder kmsKeyName(String kmsKeyName) {
            this.kmsKeyName = Objects.requireNonNull(kmsKeyName);
            return this;
        }
        @CustomType.Setter
        public Builder kmsKeyVersionName(@Nullable String kmsKeyVersionName) {
            this.kmsKeyVersionName = kmsKeyVersionName;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder serviceAccountId(@Nullable String serviceAccountId) {
            this.serviceAccountId = serviceAccountId;
            return this;
        }
        public FolderBucketConfigCmekSettings build() {
            final var o = new FolderBucketConfigCmekSettings();
            o.kmsKeyName = kmsKeyName;
            o.kmsKeyVersionName = kmsKeyVersionName;
            o.name = name;
            o.serviceAccountId = serviceAccountId;
            return o;
        }
    }
}