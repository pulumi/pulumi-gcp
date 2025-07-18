// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.modelarmor.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.modelarmor.outputs.TemplateFilterConfigSdpSettingsAdvancedConfig;
import com.pulumi.gcp.modelarmor.outputs.TemplateFilterConfigSdpSettingsBasicConfig;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TemplateFilterConfigSdpSettings {
    /**
     * @return Sensitive Data Protection Advanced configuration.
     * Structure is documented below.
     * 
     */
    private @Nullable TemplateFilterConfigSdpSettingsAdvancedConfig advancedConfig;
    /**
     * @return Sensitive Data Protection basic configuration.
     * Structure is documented below.
     * 
     */
    private @Nullable TemplateFilterConfigSdpSettingsBasicConfig basicConfig;

    private TemplateFilterConfigSdpSettings() {}
    /**
     * @return Sensitive Data Protection Advanced configuration.
     * Structure is documented below.
     * 
     */
    public Optional<TemplateFilterConfigSdpSettingsAdvancedConfig> advancedConfig() {
        return Optional.ofNullable(this.advancedConfig);
    }
    /**
     * @return Sensitive Data Protection basic configuration.
     * Structure is documented below.
     * 
     */
    public Optional<TemplateFilterConfigSdpSettingsBasicConfig> basicConfig() {
        return Optional.ofNullable(this.basicConfig);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TemplateFilterConfigSdpSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable TemplateFilterConfigSdpSettingsAdvancedConfig advancedConfig;
        private @Nullable TemplateFilterConfigSdpSettingsBasicConfig basicConfig;
        public Builder() {}
        public Builder(TemplateFilterConfigSdpSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.advancedConfig = defaults.advancedConfig;
    	      this.basicConfig = defaults.basicConfig;
        }

        @CustomType.Setter
        public Builder advancedConfig(@Nullable TemplateFilterConfigSdpSettingsAdvancedConfig advancedConfig) {

            this.advancedConfig = advancedConfig;
            return this;
        }
        @CustomType.Setter
        public Builder basicConfig(@Nullable TemplateFilterConfigSdpSettingsBasicConfig basicConfig) {

            this.basicConfig = basicConfig;
            return this;
        }
        public TemplateFilterConfigSdpSettings build() {
            final var _resultValue = new TemplateFilterConfigSdpSettings();
            _resultValue.advancedConfig = advancedConfig;
            _resultValue.basicConfig = basicConfig;
            return _resultValue;
        }
    }
}
