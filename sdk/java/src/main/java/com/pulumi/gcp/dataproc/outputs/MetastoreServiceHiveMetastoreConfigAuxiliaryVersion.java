// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class MetastoreServiceHiveMetastoreConfigAuxiliaryVersion {
    /**
     * @return A mapping of Hive metastore configuration key-value pairs to apply to the auxiliary Hive metastore (configured in hive-site.xml) in addition to the primary version&#39;s overrides.
     * If keys are present in both the auxiliary version&#39;s overrides and the primary version&#39;s overrides, the value from the auxiliary version&#39;s overrides takes precedence.
     * 
     */
    private final @Nullable Map<String,String> configOverrides;
    /**
     * @return The identifier for this object. Format specified above.
     * 
     */
    private final String key;
    /**
     * @return The Hive metastore version of the auxiliary service. It must be less than the primary Hive metastore service&#39;s version.
     * 
     */
    private final String version;

    @CustomType.Constructor
    private MetastoreServiceHiveMetastoreConfigAuxiliaryVersion(
        @CustomType.Parameter("configOverrides") @Nullable Map<String,String> configOverrides,
        @CustomType.Parameter("key") String key,
        @CustomType.Parameter("version") String version) {
        this.configOverrides = configOverrides;
        this.key = key;
        this.version = version;
    }

    /**
     * @return A mapping of Hive metastore configuration key-value pairs to apply to the auxiliary Hive metastore (configured in hive-site.xml) in addition to the primary version&#39;s overrides.
     * If keys are present in both the auxiliary version&#39;s overrides and the primary version&#39;s overrides, the value from the auxiliary version&#39;s overrides takes precedence.
     * 
     */
    public Map<String,String> configOverrides() {
        return this.configOverrides == null ? Map.of() : this.configOverrides;
    }
    /**
     * @return The identifier for this object. Format specified above.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return The Hive metastore version of the auxiliary service. It must be less than the primary Hive metastore service&#39;s version.
     * 
     */
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetastoreServiceHiveMetastoreConfigAuxiliaryVersion defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,String> configOverrides;
        private String key;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(MetastoreServiceHiveMetastoreConfigAuxiliaryVersion defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configOverrides = defaults.configOverrides;
    	      this.key = defaults.key;
    	      this.version = defaults.version;
        }

        public Builder configOverrides(@Nullable Map<String,String> configOverrides) {
            this.configOverrides = configOverrides;
            return this;
        }
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }        public MetastoreServiceHiveMetastoreConfigAuxiliaryVersion build() {
            return new MetastoreServiceHiveMetastoreConfigAuxiliaryVersion(configOverrides, key, version);
        }
    }
}