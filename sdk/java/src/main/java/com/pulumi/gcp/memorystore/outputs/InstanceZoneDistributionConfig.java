// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.memorystore.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InstanceZoneDistributionConfig {
    /**
     * @return Optional. Current zone distribution mode. Defaults to MULTI_ZONE.
     * Possible values:
     * MULTI_ZONE
     * SINGLE_ZONE
     * Possible values are: `MULTI_ZONE`, `SINGLE_ZONE`.
     * 
     */
    private @Nullable String mode;
    /**
     * @return Optional. Defines zone where all resources will be allocated with SINGLE_ZONE mode.
     * Ignored for MULTI_ZONE mode.
     * 
     */
    private @Nullable String zone;

    private InstanceZoneDistributionConfig() {}
    /**
     * @return Optional. Current zone distribution mode. Defaults to MULTI_ZONE.
     * Possible values:
     * MULTI_ZONE
     * SINGLE_ZONE
     * Possible values are: `MULTI_ZONE`, `SINGLE_ZONE`.
     * 
     */
    public Optional<String> mode() {
        return Optional.ofNullable(this.mode);
    }
    /**
     * @return Optional. Defines zone where all resources will be allocated with SINGLE_ZONE mode.
     * Ignored for MULTI_ZONE mode.
     * 
     */
    public Optional<String> zone() {
        return Optional.ofNullable(this.zone);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceZoneDistributionConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String mode;
        private @Nullable String zone;
        public Builder() {}
        public Builder(InstanceZoneDistributionConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mode = defaults.mode;
    	      this.zone = defaults.zone;
        }

        @CustomType.Setter
        public Builder mode(@Nullable String mode) {

            this.mode = mode;
            return this;
        }
        @CustomType.Setter
        public Builder zone(@Nullable String zone) {

            this.zone = zone;
            return this;
        }
        public InstanceZoneDistributionConfig build() {
            final var _resultValue = new InstanceZoneDistributionConfig();
            _resultValue.mode = mode;
            _resultValue.zone = zone;
            return _resultValue;
        }
    }
}
