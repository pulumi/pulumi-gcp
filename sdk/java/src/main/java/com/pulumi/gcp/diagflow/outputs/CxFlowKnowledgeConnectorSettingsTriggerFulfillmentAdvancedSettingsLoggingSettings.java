// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.diagflow.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CxFlowKnowledgeConnectorSettingsTriggerFulfillmentAdvancedSettingsLoggingSettings {
    /**
     * @return Enables consent-based end-user input redaction, if true, a pre-defined session parameter **$session.params.conversation-redaction** will be used to determine if the utterance should be redacted.
     * 
     */
    private @Nullable Boolean enableConsentBasedRedaction;
    /**
     * @return Enables DF Interaction logging.
     * 
     */
    private @Nullable Boolean enableInteractionLogging;
    /**
     * @return Enables Google Cloud Logging.
     * 
     */
    private @Nullable Boolean enableStackdriverLogging;

    private CxFlowKnowledgeConnectorSettingsTriggerFulfillmentAdvancedSettingsLoggingSettings() {}
    /**
     * @return Enables consent-based end-user input redaction, if true, a pre-defined session parameter **$session.params.conversation-redaction** will be used to determine if the utterance should be redacted.
     * 
     */
    public Optional<Boolean> enableConsentBasedRedaction() {
        return Optional.ofNullable(this.enableConsentBasedRedaction);
    }
    /**
     * @return Enables DF Interaction logging.
     * 
     */
    public Optional<Boolean> enableInteractionLogging() {
        return Optional.ofNullable(this.enableInteractionLogging);
    }
    /**
     * @return Enables Google Cloud Logging.
     * 
     */
    public Optional<Boolean> enableStackdriverLogging() {
        return Optional.ofNullable(this.enableStackdriverLogging);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxFlowKnowledgeConnectorSettingsTriggerFulfillmentAdvancedSettingsLoggingSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enableConsentBasedRedaction;
        private @Nullable Boolean enableInteractionLogging;
        private @Nullable Boolean enableStackdriverLogging;
        public Builder() {}
        public Builder(CxFlowKnowledgeConnectorSettingsTriggerFulfillmentAdvancedSettingsLoggingSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableConsentBasedRedaction = defaults.enableConsentBasedRedaction;
    	      this.enableInteractionLogging = defaults.enableInteractionLogging;
    	      this.enableStackdriverLogging = defaults.enableStackdriverLogging;
        }

        @CustomType.Setter
        public Builder enableConsentBasedRedaction(@Nullable Boolean enableConsentBasedRedaction) {

            this.enableConsentBasedRedaction = enableConsentBasedRedaction;
            return this;
        }
        @CustomType.Setter
        public Builder enableInteractionLogging(@Nullable Boolean enableInteractionLogging) {

            this.enableInteractionLogging = enableInteractionLogging;
            return this;
        }
        @CustomType.Setter
        public Builder enableStackdriverLogging(@Nullable Boolean enableStackdriverLogging) {

            this.enableStackdriverLogging = enableStackdriverLogging;
            return this;
        }
        public CxFlowKnowledgeConnectorSettingsTriggerFulfillmentAdvancedSettingsLoggingSettings build() {
            final var _resultValue = new CxFlowKnowledgeConnectorSettingsTriggerFulfillmentAdvancedSettingsLoggingSettings();
            _resultValue.enableConsentBasedRedaction = enableConsentBasedRedaction;
            _resultValue.enableInteractionLogging = enableInteractionLogging;
            _resultValue.enableStackdriverLogging = enableStackdriverLogging;
            return _resultValue;
        }
    }
}
