// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.diagflow.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.diagflow.outputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentAdvancedSettingsDtmfSettings;
import com.pulumi.gcp.diagflow.outputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentAdvancedSettingsLoggingSettings;
import com.pulumi.gcp.diagflow.outputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentAdvancedSettingsSpeechSettings;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CxFlowKnowledgeConnectorSettingsTriggerFulfillmentAdvancedSettings {
    /**
     * @return Define behaviors for DTMF (dual tone multi frequency). DTMF settings does not override each other. DTMF settings set at different levels define DTMF detections running in parallel. Exposed at the following levels:
     * * Agent level
     * * Flow level
     * * Page level
     * * Parameter level
     *   Structure is documented below.
     * 
     */
    private @Nullable CxFlowKnowledgeConnectorSettingsTriggerFulfillmentAdvancedSettingsDtmfSettings dtmfSettings;
    /**
     * @return Settings for logging. Settings for Dialogflow History, Contact Center messages, StackDriver logs, and speech logging. Exposed at the following levels:
     * * Agent level
     *   Structure is documented below.
     * 
     */
    private @Nullable CxFlowKnowledgeConnectorSettingsTriggerFulfillmentAdvancedSettingsLoggingSettings loggingSettings;
    /**
     * @return Settings for speech to text detection. Exposed at the following levels:
     * * Agent level
     * * Flow level
     * * Page level
     * * Parameter level
     *   Structure is documented below.
     * 
     */
    private @Nullable CxFlowKnowledgeConnectorSettingsTriggerFulfillmentAdvancedSettingsSpeechSettings speechSettings;

    private CxFlowKnowledgeConnectorSettingsTriggerFulfillmentAdvancedSettings() {}
    /**
     * @return Define behaviors for DTMF (dual tone multi frequency). DTMF settings does not override each other. DTMF settings set at different levels define DTMF detections running in parallel. Exposed at the following levels:
     * * Agent level
     * * Flow level
     * * Page level
     * * Parameter level
     *   Structure is documented below.
     * 
     */
    public Optional<CxFlowKnowledgeConnectorSettingsTriggerFulfillmentAdvancedSettingsDtmfSettings> dtmfSettings() {
        return Optional.ofNullable(this.dtmfSettings);
    }
    /**
     * @return Settings for logging. Settings for Dialogflow History, Contact Center messages, StackDriver logs, and speech logging. Exposed at the following levels:
     * * Agent level
     *   Structure is documented below.
     * 
     */
    public Optional<CxFlowKnowledgeConnectorSettingsTriggerFulfillmentAdvancedSettingsLoggingSettings> loggingSettings() {
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
    public Optional<CxFlowKnowledgeConnectorSettingsTriggerFulfillmentAdvancedSettingsSpeechSettings> speechSettings() {
        return Optional.ofNullable(this.speechSettings);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxFlowKnowledgeConnectorSettingsTriggerFulfillmentAdvancedSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable CxFlowKnowledgeConnectorSettingsTriggerFulfillmentAdvancedSettingsDtmfSettings dtmfSettings;
        private @Nullable CxFlowKnowledgeConnectorSettingsTriggerFulfillmentAdvancedSettingsLoggingSettings loggingSettings;
        private @Nullable CxFlowKnowledgeConnectorSettingsTriggerFulfillmentAdvancedSettingsSpeechSettings speechSettings;
        public Builder() {}
        public Builder(CxFlowKnowledgeConnectorSettingsTriggerFulfillmentAdvancedSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dtmfSettings = defaults.dtmfSettings;
    	      this.loggingSettings = defaults.loggingSettings;
    	      this.speechSettings = defaults.speechSettings;
        }

        @CustomType.Setter
        public Builder dtmfSettings(@Nullable CxFlowKnowledgeConnectorSettingsTriggerFulfillmentAdvancedSettingsDtmfSettings dtmfSettings) {

            this.dtmfSettings = dtmfSettings;
            return this;
        }
        @CustomType.Setter
        public Builder loggingSettings(@Nullable CxFlowKnowledgeConnectorSettingsTriggerFulfillmentAdvancedSettingsLoggingSettings loggingSettings) {

            this.loggingSettings = loggingSettings;
            return this;
        }
        @CustomType.Setter
        public Builder speechSettings(@Nullable CxFlowKnowledgeConnectorSettingsTriggerFulfillmentAdvancedSettingsSpeechSettings speechSettings) {

            this.speechSettings = speechSettings;
            return this;
        }
        public CxFlowKnowledgeConnectorSettingsTriggerFulfillmentAdvancedSettings build() {
            final var _resultValue = new CxFlowKnowledgeConnectorSettingsTriggerFulfillmentAdvancedSettings();
            _resultValue.dtmfSettings = dtmfSettings;
            _resultValue.loggingSettings = loggingSettings;
            _resultValue.speechSettings = speechSettings;
            return _resultValue;
        }
    }
}
