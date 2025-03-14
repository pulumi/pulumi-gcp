// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.diagflow.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.diagflow.outputs.CxAgentAdvancedSettingsAudioExportGcsDestination;
import com.pulumi.gcp.diagflow.outputs.CxAgentAdvancedSettingsDtmfSettings;
import com.pulumi.gcp.diagflow.outputs.CxAgentAdvancedSettingsLoggingSettings;
import com.pulumi.gcp.diagflow.outputs.CxAgentAdvancedSettingsSpeechSettings;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CxAgentAdvancedSettings {
    /**
     * @return If present, incoming audio is exported by Dialogflow to the configured Google Cloud Storage destination. Exposed at the following levels:
     * * Agent level
     * * Flow level
     *   Structure is documented below.
     * 
     */
    private @Nullable CxAgentAdvancedSettingsAudioExportGcsDestination audioExportGcsDestination;
    /**
     * @return Define behaviors for DTMF (dual tone multi frequency). DTMF settings does not override each other. DTMF settings set at different levels define DTMF detections running in parallel. Exposed at the following levels:
     * * Agent level
     * * Flow level
     * * Page level
     * * Parameter level
     *   Structure is documented below.
     * 
     */
    private @Nullable CxAgentAdvancedSettingsDtmfSettings dtmfSettings;
    /**
     * @return Settings for logging. Settings for Dialogflow History, Contact Center messages, StackDriver logs, and speech logging. Exposed at the following levels:
     * * Agent level
     *   Structure is documented below.
     * 
     */
    private @Nullable CxAgentAdvancedSettingsLoggingSettings loggingSettings;
    /**
     * @return Settings for speech to text detection. Exposed at the following levels:
     * * Agent level
     * * Flow level
     * * Page level
     * * Parameter level
     *   Structure is documented below.
     * 
     */
    private @Nullable CxAgentAdvancedSettingsSpeechSettings speechSettings;

    private CxAgentAdvancedSettings() {}
    /**
     * @return If present, incoming audio is exported by Dialogflow to the configured Google Cloud Storage destination. Exposed at the following levels:
     * * Agent level
     * * Flow level
     *   Structure is documented below.
     * 
     */
    public Optional<CxAgentAdvancedSettingsAudioExportGcsDestination> audioExportGcsDestination() {
        return Optional.ofNullable(this.audioExportGcsDestination);
    }
    /**
     * @return Define behaviors for DTMF (dual tone multi frequency). DTMF settings does not override each other. DTMF settings set at different levels define DTMF detections running in parallel. Exposed at the following levels:
     * * Agent level
     * * Flow level
     * * Page level
     * * Parameter level
     *   Structure is documented below.
     * 
     */
    public Optional<CxAgentAdvancedSettingsDtmfSettings> dtmfSettings() {
        return Optional.ofNullable(this.dtmfSettings);
    }
    /**
     * @return Settings for logging. Settings for Dialogflow History, Contact Center messages, StackDriver logs, and speech logging. Exposed at the following levels:
     * * Agent level
     *   Structure is documented below.
     * 
     */
    public Optional<CxAgentAdvancedSettingsLoggingSettings> loggingSettings() {
        return Optional.ofNullable(this.loggingSettings);
    }
    /**
     * @return Settings for speech to text detection. Exposed at the following levels:
     * * Agent level
     * * Flow level
     * * Page level
     * * Parameter level
     *   Structure is documented below.
     * 
     */
    public Optional<CxAgentAdvancedSettingsSpeechSettings> speechSettings() {
        return Optional.ofNullable(this.speechSettings);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxAgentAdvancedSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable CxAgentAdvancedSettingsAudioExportGcsDestination audioExportGcsDestination;
        private @Nullable CxAgentAdvancedSettingsDtmfSettings dtmfSettings;
        private @Nullable CxAgentAdvancedSettingsLoggingSettings loggingSettings;
        private @Nullable CxAgentAdvancedSettingsSpeechSettings speechSettings;
        public Builder() {}
        public Builder(CxAgentAdvancedSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audioExportGcsDestination = defaults.audioExportGcsDestination;
    	      this.dtmfSettings = defaults.dtmfSettings;
    	      this.loggingSettings = defaults.loggingSettings;
    	      this.speechSettings = defaults.speechSettings;
        }

        @CustomType.Setter
        public Builder audioExportGcsDestination(@Nullable CxAgentAdvancedSettingsAudioExportGcsDestination audioExportGcsDestination) {

            this.audioExportGcsDestination = audioExportGcsDestination;
            return this;
        }
        @CustomType.Setter
        public Builder dtmfSettings(@Nullable CxAgentAdvancedSettingsDtmfSettings dtmfSettings) {

            this.dtmfSettings = dtmfSettings;
            return this;
        }
        @CustomType.Setter
        public Builder loggingSettings(@Nullable CxAgentAdvancedSettingsLoggingSettings loggingSettings) {

            this.loggingSettings = loggingSettings;
            return this;
        }
        @CustomType.Setter
        public Builder speechSettings(@Nullable CxAgentAdvancedSettingsSpeechSettings speechSettings) {

            this.speechSettings = speechSettings;
            return this;
        }
        public CxAgentAdvancedSettings build() {
            final var _resultValue = new CxAgentAdvancedSettings();
            _resultValue.audioExportGcsDestination = audioExportGcsDestination;
            _resultValue.dtmfSettings = dtmfSettings;
            _resultValue.loggingSettings = loggingSettings;
            _resultValue.speechSettings = speechSettings;
            return _resultValue;
        }
    }
}
