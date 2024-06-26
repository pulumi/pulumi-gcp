// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.identityplatform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.identityplatform.outputs.ConfigMonitoringRequestLogging;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConfigMonitoring {
    /**
     * @return Configuration for logging requests made to this project to Stackdriver Logging
     * Structure is documented below.
     * 
     */
    private @Nullable ConfigMonitoringRequestLogging requestLogging;

    private ConfigMonitoring() {}
    /**
     * @return Configuration for logging requests made to this project to Stackdriver Logging
     * Structure is documented below.
     * 
     */
    public Optional<ConfigMonitoringRequestLogging> requestLogging() {
        return Optional.ofNullable(this.requestLogging);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigMonitoring defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ConfigMonitoringRequestLogging requestLogging;
        public Builder() {}
        public Builder(ConfigMonitoring defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.requestLogging = defaults.requestLogging;
        }

        @CustomType.Setter
        public Builder requestLogging(@Nullable ConfigMonitoringRequestLogging requestLogging) {

            this.requestLogging = requestLogging;
            return this;
        }
        public ConfigMonitoring build() {
            final var _resultValue = new ConfigMonitoring();
            _resultValue.requestLogging = requestLogging;
            return _resultValue;
        }
    }
}
