// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigqueryanalyticshub.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.bigqueryanalyticshub.outputs.DataExchangeSharingEnvironmentConfigDcrExchangeConfig;
import com.pulumi.gcp.bigqueryanalyticshub.outputs.DataExchangeSharingEnvironmentConfigDefaultExchangeConfig;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DataExchangeSharingEnvironmentConfig {
    /**
     * @return Data Clean Room (DCR), used for privacy-safe and secured data sharing.
     * 
     */
    private @Nullable DataExchangeSharingEnvironmentConfigDcrExchangeConfig dcrExchangeConfig;
    /**
     * @return Default Analytics Hub data exchange, used for secured data sharing.
     * 
     */
    private @Nullable DataExchangeSharingEnvironmentConfigDefaultExchangeConfig defaultExchangeConfig;

    private DataExchangeSharingEnvironmentConfig() {}
    /**
     * @return Data Clean Room (DCR), used for privacy-safe and secured data sharing.
     * 
     */
    public Optional<DataExchangeSharingEnvironmentConfigDcrExchangeConfig> dcrExchangeConfig() {
        return Optional.ofNullable(this.dcrExchangeConfig);
    }
    /**
     * @return Default Analytics Hub data exchange, used for secured data sharing.
     * 
     */
    public Optional<DataExchangeSharingEnvironmentConfigDefaultExchangeConfig> defaultExchangeConfig() {
        return Optional.ofNullable(this.defaultExchangeConfig);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataExchangeSharingEnvironmentConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable DataExchangeSharingEnvironmentConfigDcrExchangeConfig dcrExchangeConfig;
        private @Nullable DataExchangeSharingEnvironmentConfigDefaultExchangeConfig defaultExchangeConfig;
        public Builder() {}
        public Builder(DataExchangeSharingEnvironmentConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dcrExchangeConfig = defaults.dcrExchangeConfig;
    	      this.defaultExchangeConfig = defaults.defaultExchangeConfig;
        }

        @CustomType.Setter
        public Builder dcrExchangeConfig(@Nullable DataExchangeSharingEnvironmentConfigDcrExchangeConfig dcrExchangeConfig) {

            this.dcrExchangeConfig = dcrExchangeConfig;
            return this;
        }
        @CustomType.Setter
        public Builder defaultExchangeConfig(@Nullable DataExchangeSharingEnvironmentConfigDefaultExchangeConfig defaultExchangeConfig) {

            this.defaultExchangeConfig = defaultExchangeConfig;
            return this;
        }
        public DataExchangeSharingEnvironmentConfig build() {
            final var _resultValue = new DataExchangeSharingEnvironmentConfig();
            _resultValue.dcrExchangeConfig = dcrExchangeConfig;
            _resultValue.defaultExchangeConfig = defaultExchangeConfig;
            return _resultValue;
        }
    }
}
