// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.diagflow.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.diagflow.outputs.CxTestCaseLastTestResultConversationTurnUserInputInput;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CxTestCaseLastTestResultConversationTurnUserInput {
    /**
     * @return Whether sentiment analysis is enabled.
     * 
     */
    private @Nullable Boolean enableSentimentAnalysis;
    /**
     * @return Parameters that need to be injected into the conversation during intent detection.
     * 
     */
    private @Nullable String injectedParameters;
    /**
     * @return User input. Supports text input, event input, dtmf input in the test case.
     * Structure is documented below.
     * 
     */
    private @Nullable CxTestCaseLastTestResultConversationTurnUserInputInput input;
    /**
     * @return If webhooks should be allowed to trigger in response to the user utterance. Often if parameters are injected, webhooks should not be enabled.
     * 
     */
    private @Nullable Boolean isWebhookEnabled;

    private CxTestCaseLastTestResultConversationTurnUserInput() {}
    /**
     * @return Whether sentiment analysis is enabled.
     * 
     */
    public Optional<Boolean> enableSentimentAnalysis() {
        return Optional.ofNullable(this.enableSentimentAnalysis);
    }
    /**
     * @return Parameters that need to be injected into the conversation during intent detection.
     * 
     */
    public Optional<String> injectedParameters() {
        return Optional.ofNullable(this.injectedParameters);
    }
    /**
     * @return User input. Supports text input, event input, dtmf input in the test case.
     * Structure is documented below.
     * 
     */
    public Optional<CxTestCaseLastTestResultConversationTurnUserInputInput> input() {
        return Optional.ofNullable(this.input);
    }
    /**
     * @return If webhooks should be allowed to trigger in response to the user utterance. Often if parameters are injected, webhooks should not be enabled.
     * 
     */
    public Optional<Boolean> isWebhookEnabled() {
        return Optional.ofNullable(this.isWebhookEnabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxTestCaseLastTestResultConversationTurnUserInput defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enableSentimentAnalysis;
        private @Nullable String injectedParameters;
        private @Nullable CxTestCaseLastTestResultConversationTurnUserInputInput input;
        private @Nullable Boolean isWebhookEnabled;
        public Builder() {}
        public Builder(CxTestCaseLastTestResultConversationTurnUserInput defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableSentimentAnalysis = defaults.enableSentimentAnalysis;
    	      this.injectedParameters = defaults.injectedParameters;
    	      this.input = defaults.input;
    	      this.isWebhookEnabled = defaults.isWebhookEnabled;
        }

        @CustomType.Setter
        public Builder enableSentimentAnalysis(@Nullable Boolean enableSentimentAnalysis) {
            this.enableSentimentAnalysis = enableSentimentAnalysis;
            return this;
        }
        @CustomType.Setter
        public Builder injectedParameters(@Nullable String injectedParameters) {
            this.injectedParameters = injectedParameters;
            return this;
        }
        @CustomType.Setter
        public Builder input(@Nullable CxTestCaseLastTestResultConversationTurnUserInputInput input) {
            this.input = input;
            return this;
        }
        @CustomType.Setter
        public Builder isWebhookEnabled(@Nullable Boolean isWebhookEnabled) {
            this.isWebhookEnabled = isWebhookEnabled;
            return this;
        }
        public CxTestCaseLastTestResultConversationTurnUserInput build() {
            final var o = new CxTestCaseLastTestResultConversationTurnUserInput();
            o.enableSentimentAnalysis = enableSentimentAnalysis;
            o.injectedParameters = injectedParameters;
            o.input = input;
            o.isWebhookEnabled = isWebhookEnabled;
            return o;
        }
    }
}