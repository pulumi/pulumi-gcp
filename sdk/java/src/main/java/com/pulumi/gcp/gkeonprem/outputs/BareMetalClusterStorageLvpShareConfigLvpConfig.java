// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkeonprem.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class BareMetalClusterStorageLvpShareConfigLvpConfig {
    /**
     * @return The host machine path.
     * 
     */
    private String path;
    /**
     * @return The StorageClass name that PVs will be created with.
     * 
     */
    private String storageClass;

    private BareMetalClusterStorageLvpShareConfigLvpConfig() {}
    /**
     * @return The host machine path.
     * 
     */
    public String path() {
        return this.path;
    }
    /**
     * @return The StorageClass name that PVs will be created with.
     * 
     */
    public String storageClass() {
        return this.storageClass;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BareMetalClusterStorageLvpShareConfigLvpConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String path;
        private String storageClass;
        public Builder() {}
        public Builder(BareMetalClusterStorageLvpShareConfigLvpConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.path = defaults.path;
    	      this.storageClass = defaults.storageClass;
        }

        @CustomType.Setter
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        @CustomType.Setter
        public Builder storageClass(String storageClass) {
            this.storageClass = Objects.requireNonNull(storageClass);
            return this;
        }
        public BareMetalClusterStorageLvpShareConfigLvpConfig build() {
            final var o = new BareMetalClusterStorageLvpShareConfigLvpConfig();
            o.path = path;
            o.storageClass = storageClass;
            return o;
        }
    }
}