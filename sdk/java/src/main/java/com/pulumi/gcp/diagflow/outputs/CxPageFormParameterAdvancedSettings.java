// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.diagflow.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.diagflow.outputs.CxPageFormParameterAdvancedSettingsDtmfSettings;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CxPageFormParameterAdvancedSettings {
    /**
     * @return Define behaviors for DTMF (dual tone multi frequency). DTMF settings does not override each other. DTMF settings set at different levels define DTMF detections running in parallel. Exposed at the following levels:
     * * Agent level
     * * Flow level
     * * Page level
     * * Parameter level
     *   Structure is documented below.
     * 
     */
    private @Nullable CxPageFormParameterAdvancedSettingsDtmfSettings dtmfSettings;

    private CxPageFormParameterAdvancedSettings() {}
    /**
     * @return Define behaviors for DTMF (dual tone multi frequency). DTMF settings does not override each other. DTMF settings set at different levels define DTMF detections running in parallel. Exposed at the following levels:
     * * Agent level
     * * Flow level
     * * Page level
     * * Parameter level
     *   Structure is documented below.
     * 
     */
    public Optional<CxPageFormParameterAdvancedSettingsDtmfSettings> dtmfSettings() {
        return Optional.ofNullable(this.dtmfSettings);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxPageFormParameterAdvancedSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable CxPageFormParameterAdvancedSettingsDtmfSettings dtmfSettings;
        public Builder() {}
        public Builder(CxPageFormParameterAdvancedSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dtmfSettings = defaults.dtmfSettings;
        }

        @CustomType.Setter
        public Builder dtmfSettings(@Nullable CxPageFormParameterAdvancedSettingsDtmfSettings dtmfSettings) {
            this.dtmfSettings = dtmfSettings;
            return this;
        }
        public CxPageFormParameterAdvancedSettings build() {
            final var o = new CxPageFormParameterAdvancedSettings();
            o.dtmfSettings = dtmfSettings;
            return o;
        }
    }
}