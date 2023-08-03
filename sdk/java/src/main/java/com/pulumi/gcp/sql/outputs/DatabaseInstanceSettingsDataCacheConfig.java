// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.sql.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DatabaseInstanceSettingsDataCacheConfig {
    /**
     * @return Whether data cache is enabled for the instance. Defaults to `false`
     * Can only be used with MYSQL.
     * 
     */
    private @Nullable Boolean dataCacheEnabled;

    private DatabaseInstanceSettingsDataCacheConfig() {}
    /**
     * @return Whether data cache is enabled for the instance. Defaults to `false`
     * Can only be used with MYSQL.
     * 
     */
    public Optional<Boolean> dataCacheEnabled() {
        return Optional.ofNullable(this.dataCacheEnabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseInstanceSettingsDataCacheConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean dataCacheEnabled;
        public Builder() {}
        public Builder(DatabaseInstanceSettingsDataCacheConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataCacheEnabled = defaults.dataCacheEnabled;
        }

        @CustomType.Setter
        public Builder dataCacheEnabled(@Nullable Boolean dataCacheEnabled) {
            this.dataCacheEnabled = dataCacheEnabled;
            return this;
        }
        public DatabaseInstanceSettingsDataCacheConfig build() {
            final var o = new DatabaseInstanceSettingsDataCacheConfig();
            o.dataCacheEnabled = dataCacheEnabled;
            return o;
        }
    }
}