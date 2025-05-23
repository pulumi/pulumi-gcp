// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.diagflow.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CxFlowKnowledgeConnectorSettingsTriggerFulfillmentAdvancedSettingsDtmfSettings {
    /**
     * @return If true, incoming audio is processed for DTMF (dual tone multi frequtectency) events. For example, if the caller presses a button on their telephone keypad and DTMF processing is enabled, Dialogflow will de the event (e.g. a &#34;3&#34; was pressed) in the incoming audio and pass the event to the bot to drive business logic (e.g. when 3 is pressed, return the account balance).
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return Endpoint timeout setting for matching dtmf input to regex.
     * A duration in seconds with up to nine fractional digits, ending with &#39;s&#39;. Example: &#34;3.500s&#34;.
     * 
     */
    private @Nullable String endpointingTimeoutDuration;
    /**
     * @return The digit that terminates a DTMF digit sequence.
     * 
     */
    private @Nullable String finishDigit;
    /**
     * @return Interdigit timeout setting for matching dtmf input to regex.
     * A duration in seconds with up to nine fractional digits, ending with &#39;s&#39;. Example: &#34;3.500s&#34;.
     * 
     */
    private @Nullable String interdigitTimeoutDuration;
    /**
     * @return Max length of DTMF digits.
     * 
     */
    private @Nullable Integer maxDigits;

    private CxFlowKnowledgeConnectorSettingsTriggerFulfillmentAdvancedSettingsDtmfSettings() {}
    /**
     * @return If true, incoming audio is processed for DTMF (dual tone multi frequtectency) events. For example, if the caller presses a button on their telephone keypad and DTMF processing is enabled, Dialogflow will de the event (e.g. a &#34;3&#34; was pressed) in the incoming audio and pass the event to the bot to drive business logic (e.g. when 3 is pressed, return the account balance).
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return Endpoint timeout setting for matching dtmf input to regex.
     * A duration in seconds with up to nine fractional digits, ending with &#39;s&#39;. Example: &#34;3.500s&#34;.
     * 
     */
    public Optional<String> endpointingTimeoutDuration() {
        return Optional.ofNullable(this.endpointingTimeoutDuration);
    }
    /**
     * @return The digit that terminates a DTMF digit sequence.
     * 
     */
    public Optional<String> finishDigit() {
        return Optional.ofNullable(this.finishDigit);
    }
    /**
     * @return Interdigit timeout setting for matching dtmf input to regex.
     * A duration in seconds with up to nine fractional digits, ending with &#39;s&#39;. Example: &#34;3.500s&#34;.
     * 
     */
    public Optional<String> interdigitTimeoutDuration() {
        return Optional.ofNullable(this.interdigitTimeoutDuration);
    }
    /**
     * @return Max length of DTMF digits.
     * 
     */
    public Optional<Integer> maxDigits() {
        return Optional.ofNullable(this.maxDigits);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxFlowKnowledgeConnectorSettingsTriggerFulfillmentAdvancedSettingsDtmfSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable String endpointingTimeoutDuration;
        private @Nullable String finishDigit;
        private @Nullable String interdigitTimeoutDuration;
        private @Nullable Integer maxDigits;
        public Builder() {}
        public Builder(CxFlowKnowledgeConnectorSettingsTriggerFulfillmentAdvancedSettingsDtmfSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.endpointingTimeoutDuration = defaults.endpointingTimeoutDuration;
    	      this.finishDigit = defaults.finishDigit;
    	      this.interdigitTimeoutDuration = defaults.interdigitTimeoutDuration;
    	      this.maxDigits = defaults.maxDigits;
        }

        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder endpointingTimeoutDuration(@Nullable String endpointingTimeoutDuration) {

            this.endpointingTimeoutDuration = endpointingTimeoutDuration;
            return this;
        }
        @CustomType.Setter
        public Builder finishDigit(@Nullable String finishDigit) {

            this.finishDigit = finishDigit;
            return this;
        }
        @CustomType.Setter
        public Builder interdigitTimeoutDuration(@Nullable String interdigitTimeoutDuration) {

            this.interdigitTimeoutDuration = interdigitTimeoutDuration;
            return this;
        }
        @CustomType.Setter
        public Builder maxDigits(@Nullable Integer maxDigits) {

            this.maxDigits = maxDigits;
            return this;
        }
        public CxFlowKnowledgeConnectorSettingsTriggerFulfillmentAdvancedSettingsDtmfSettings build() {
            final var _resultValue = new CxFlowKnowledgeConnectorSettingsTriggerFulfillmentAdvancedSettingsDtmfSettings();
            _resultValue.enabled = enabled;
            _resultValue.endpointingTimeoutDuration = endpointingTimeoutDuration;
            _resultValue.finishDigit = finishDigit;
            _resultValue.interdigitTimeoutDuration = interdigitTimeoutDuration;
            _resultValue.maxDigits = maxDigits;
            return _resultValue;
        }
    }
}
