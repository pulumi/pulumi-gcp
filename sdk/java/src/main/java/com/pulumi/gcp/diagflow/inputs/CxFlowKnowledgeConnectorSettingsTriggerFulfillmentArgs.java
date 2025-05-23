// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.diagflow.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.diagflow.inputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentAdvancedSettingsArgs;
import com.pulumi.gcp.diagflow.inputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentConditionalCaseArgs;
import com.pulumi.gcp.diagflow.inputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentMessageArgs;
import com.pulumi.gcp.diagflow.inputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentSetParameterActionArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CxFlowKnowledgeConnectorSettingsTriggerFulfillmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final CxFlowKnowledgeConnectorSettingsTriggerFulfillmentArgs Empty = new CxFlowKnowledgeConnectorSettingsTriggerFulfillmentArgs();

    /**
     * Hierarchical advanced settings for agent/flow/page/fulfillment/parameter. Settings exposed at lower level overrides the settings exposed at higher level. Overriding occurs at the sub-setting level. For example, the playbackInterruptionSettings at fulfillment level only overrides the playbackInterruptionSettings at the agent level, leaving other settings at the agent level unchanged.
     * DTMF settings does not override each other. DTMF settings set at different levels define DTMF detections running in parallel.
     * Hierarchy: Agent-&gt;Flow-&gt;Page-&gt;Fulfillment/Parameter.
     * Structure is documented below.
     * 
     */
    @Import(name="advancedSettings")
    private @Nullable Output<CxFlowKnowledgeConnectorSettingsTriggerFulfillmentAdvancedSettingsArgs> advancedSettings;

    /**
     * @return Hierarchical advanced settings for agent/flow/page/fulfillment/parameter. Settings exposed at lower level overrides the settings exposed at higher level. Overriding occurs at the sub-setting level. For example, the playbackInterruptionSettings at fulfillment level only overrides the playbackInterruptionSettings at the agent level, leaving other settings at the agent level unchanged.
     * DTMF settings does not override each other. DTMF settings set at different levels define DTMF detections running in parallel.
     * Hierarchy: Agent-&gt;Flow-&gt;Page-&gt;Fulfillment/Parameter.
     * Structure is documented below.
     * 
     */
    public Optional<Output<CxFlowKnowledgeConnectorSettingsTriggerFulfillmentAdvancedSettingsArgs>> advancedSettings() {
        return Optional.ofNullable(this.advancedSettings);
    }

    /**
     * Conditional cases for this fulfillment.
     * Structure is documented below.
     * 
     */
    @Import(name="conditionalCases")
    private @Nullable Output<List<CxFlowKnowledgeConnectorSettingsTriggerFulfillmentConditionalCaseArgs>> conditionalCases;

    /**
     * @return Conditional cases for this fulfillment.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<CxFlowKnowledgeConnectorSettingsTriggerFulfillmentConditionalCaseArgs>>> conditionalCases() {
        return Optional.ofNullable(this.conditionalCases);
    }

    /**
     * If the flag is true, the agent will utilize LLM to generate a text response. If LLM generation fails, the defined responses in the fulfillment will be respected. This flag is only useful for fulfillments associated with no-match event handlers.
     * 
     */
    @Import(name="enableGenerativeFallback")
    private @Nullable Output<Boolean> enableGenerativeFallback;

    /**
     * @return If the flag is true, the agent will utilize LLM to generate a text response. If LLM generation fails, the defined responses in the fulfillment will be respected. This flag is only useful for fulfillments associated with no-match event handlers.
     * 
     */
    public Optional<Output<Boolean>> enableGenerativeFallback() {
        return Optional.ofNullable(this.enableGenerativeFallback);
    }

    /**
     * The list of rich message responses to present to the user.
     * Structure is documented below.
     * 
     */
    @Import(name="messages")
    private @Nullable Output<List<CxFlowKnowledgeConnectorSettingsTriggerFulfillmentMessageArgs>> messages;

    /**
     * @return The list of rich message responses to present to the user.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<CxFlowKnowledgeConnectorSettingsTriggerFulfillmentMessageArgs>>> messages() {
        return Optional.ofNullable(this.messages);
    }

    /**
     * Whether Dialogflow should return currently queued fulfillment response messages in streaming APIs. If a webhook is specified, it happens before Dialogflow invokes webhook. Warning: 1) This flag only affects streaming API. Responses are still queued and returned once in non-streaming API. 2) The flag can be enabled in any fulfillment but only the first 3 partial responses will be returned. You may only want to apply it to fulfillments that have slow webhooks.
     * 
     */
    @Import(name="returnPartialResponses")
    private @Nullable Output<Boolean> returnPartialResponses;

    /**
     * @return Whether Dialogflow should return currently queued fulfillment response messages in streaming APIs. If a webhook is specified, it happens before Dialogflow invokes webhook. Warning: 1) This flag only affects streaming API. Responses are still queued and returned once in non-streaming API. 2) The flag can be enabled in any fulfillment but only the first 3 partial responses will be returned. You may only want to apply it to fulfillments that have slow webhooks.
     * 
     */
    public Optional<Output<Boolean>> returnPartialResponses() {
        return Optional.ofNullable(this.returnPartialResponses);
    }

    /**
     * Set parameter values before executing the webhook.
     * Structure is documented below.
     * 
     */
    @Import(name="setParameterActions")
    private @Nullable Output<List<CxFlowKnowledgeConnectorSettingsTriggerFulfillmentSetParameterActionArgs>> setParameterActions;

    /**
     * @return Set parameter values before executing the webhook.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<CxFlowKnowledgeConnectorSettingsTriggerFulfillmentSetParameterActionArgs>>> setParameterActions() {
        return Optional.ofNullable(this.setParameterActions);
    }

    /**
     * The tag used by the webhook to identify which fulfillment is being called. This field is required if webhook is specified.
     * 
     */
    @Import(name="tag")
    private @Nullable Output<String> tag;

    /**
     * @return The tag used by the webhook to identify which fulfillment is being called. This field is required if webhook is specified.
     * 
     */
    public Optional<Output<String>> tag() {
        return Optional.ofNullable(this.tag);
    }

    /**
     * The webhook to call. Format: projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;/webhooks/&lt;Webhook ID&gt;.
     * 
     */
    @Import(name="webhook")
    private @Nullable Output<String> webhook;

    /**
     * @return The webhook to call. Format: projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;/webhooks/&lt;Webhook ID&gt;.
     * 
     */
    public Optional<Output<String>> webhook() {
        return Optional.ofNullable(this.webhook);
    }

    private CxFlowKnowledgeConnectorSettingsTriggerFulfillmentArgs() {}

    private CxFlowKnowledgeConnectorSettingsTriggerFulfillmentArgs(CxFlowKnowledgeConnectorSettingsTriggerFulfillmentArgs $) {
        this.advancedSettings = $.advancedSettings;
        this.conditionalCases = $.conditionalCases;
        this.enableGenerativeFallback = $.enableGenerativeFallback;
        this.messages = $.messages;
        this.returnPartialResponses = $.returnPartialResponses;
        this.setParameterActions = $.setParameterActions;
        this.tag = $.tag;
        this.webhook = $.webhook;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CxFlowKnowledgeConnectorSettingsTriggerFulfillmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CxFlowKnowledgeConnectorSettingsTriggerFulfillmentArgs $;

        public Builder() {
            $ = new CxFlowKnowledgeConnectorSettingsTriggerFulfillmentArgs();
        }

        public Builder(CxFlowKnowledgeConnectorSettingsTriggerFulfillmentArgs defaults) {
            $ = new CxFlowKnowledgeConnectorSettingsTriggerFulfillmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param advancedSettings Hierarchical advanced settings for agent/flow/page/fulfillment/parameter. Settings exposed at lower level overrides the settings exposed at higher level. Overriding occurs at the sub-setting level. For example, the playbackInterruptionSettings at fulfillment level only overrides the playbackInterruptionSettings at the agent level, leaving other settings at the agent level unchanged.
         * DTMF settings does not override each other. DTMF settings set at different levels define DTMF detections running in parallel.
         * Hierarchy: Agent-&gt;Flow-&gt;Page-&gt;Fulfillment/Parameter.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder advancedSettings(@Nullable Output<CxFlowKnowledgeConnectorSettingsTriggerFulfillmentAdvancedSettingsArgs> advancedSettings) {
            $.advancedSettings = advancedSettings;
            return this;
        }

        /**
         * @param advancedSettings Hierarchical advanced settings for agent/flow/page/fulfillment/parameter. Settings exposed at lower level overrides the settings exposed at higher level. Overriding occurs at the sub-setting level. For example, the playbackInterruptionSettings at fulfillment level only overrides the playbackInterruptionSettings at the agent level, leaving other settings at the agent level unchanged.
         * DTMF settings does not override each other. DTMF settings set at different levels define DTMF detections running in parallel.
         * Hierarchy: Agent-&gt;Flow-&gt;Page-&gt;Fulfillment/Parameter.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder advancedSettings(CxFlowKnowledgeConnectorSettingsTriggerFulfillmentAdvancedSettingsArgs advancedSettings) {
            return advancedSettings(Output.of(advancedSettings));
        }

        /**
         * @param conditionalCases Conditional cases for this fulfillment.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder conditionalCases(@Nullable Output<List<CxFlowKnowledgeConnectorSettingsTriggerFulfillmentConditionalCaseArgs>> conditionalCases) {
            $.conditionalCases = conditionalCases;
            return this;
        }

        /**
         * @param conditionalCases Conditional cases for this fulfillment.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder conditionalCases(List<CxFlowKnowledgeConnectorSettingsTriggerFulfillmentConditionalCaseArgs> conditionalCases) {
            return conditionalCases(Output.of(conditionalCases));
        }

        /**
         * @param conditionalCases Conditional cases for this fulfillment.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder conditionalCases(CxFlowKnowledgeConnectorSettingsTriggerFulfillmentConditionalCaseArgs... conditionalCases) {
            return conditionalCases(List.of(conditionalCases));
        }

        /**
         * @param enableGenerativeFallback If the flag is true, the agent will utilize LLM to generate a text response. If LLM generation fails, the defined responses in the fulfillment will be respected. This flag is only useful for fulfillments associated with no-match event handlers.
         * 
         * @return builder
         * 
         */
        public Builder enableGenerativeFallback(@Nullable Output<Boolean> enableGenerativeFallback) {
            $.enableGenerativeFallback = enableGenerativeFallback;
            return this;
        }

        /**
         * @param enableGenerativeFallback If the flag is true, the agent will utilize LLM to generate a text response. If LLM generation fails, the defined responses in the fulfillment will be respected. This flag is only useful for fulfillments associated with no-match event handlers.
         * 
         * @return builder
         * 
         */
        public Builder enableGenerativeFallback(Boolean enableGenerativeFallback) {
            return enableGenerativeFallback(Output.of(enableGenerativeFallback));
        }

        /**
         * @param messages The list of rich message responses to present to the user.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder messages(@Nullable Output<List<CxFlowKnowledgeConnectorSettingsTriggerFulfillmentMessageArgs>> messages) {
            $.messages = messages;
            return this;
        }

        /**
         * @param messages The list of rich message responses to present to the user.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder messages(List<CxFlowKnowledgeConnectorSettingsTriggerFulfillmentMessageArgs> messages) {
            return messages(Output.of(messages));
        }

        /**
         * @param messages The list of rich message responses to present to the user.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder messages(CxFlowKnowledgeConnectorSettingsTriggerFulfillmentMessageArgs... messages) {
            return messages(List.of(messages));
        }

        /**
         * @param returnPartialResponses Whether Dialogflow should return currently queued fulfillment response messages in streaming APIs. If a webhook is specified, it happens before Dialogflow invokes webhook. Warning: 1) This flag only affects streaming API. Responses are still queued and returned once in non-streaming API. 2) The flag can be enabled in any fulfillment but only the first 3 partial responses will be returned. You may only want to apply it to fulfillments that have slow webhooks.
         * 
         * @return builder
         * 
         */
        public Builder returnPartialResponses(@Nullable Output<Boolean> returnPartialResponses) {
            $.returnPartialResponses = returnPartialResponses;
            return this;
        }

        /**
         * @param returnPartialResponses Whether Dialogflow should return currently queued fulfillment response messages in streaming APIs. If a webhook is specified, it happens before Dialogflow invokes webhook. Warning: 1) This flag only affects streaming API. Responses are still queued and returned once in non-streaming API. 2) The flag can be enabled in any fulfillment but only the first 3 partial responses will be returned. You may only want to apply it to fulfillments that have slow webhooks.
         * 
         * @return builder
         * 
         */
        public Builder returnPartialResponses(Boolean returnPartialResponses) {
            return returnPartialResponses(Output.of(returnPartialResponses));
        }

        /**
         * @param setParameterActions Set parameter values before executing the webhook.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder setParameterActions(@Nullable Output<List<CxFlowKnowledgeConnectorSettingsTriggerFulfillmentSetParameterActionArgs>> setParameterActions) {
            $.setParameterActions = setParameterActions;
            return this;
        }

        /**
         * @param setParameterActions Set parameter values before executing the webhook.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder setParameterActions(List<CxFlowKnowledgeConnectorSettingsTriggerFulfillmentSetParameterActionArgs> setParameterActions) {
            return setParameterActions(Output.of(setParameterActions));
        }

        /**
         * @param setParameterActions Set parameter values before executing the webhook.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder setParameterActions(CxFlowKnowledgeConnectorSettingsTriggerFulfillmentSetParameterActionArgs... setParameterActions) {
            return setParameterActions(List.of(setParameterActions));
        }

        /**
         * @param tag The tag used by the webhook to identify which fulfillment is being called. This field is required if webhook is specified.
         * 
         * @return builder
         * 
         */
        public Builder tag(@Nullable Output<String> tag) {
            $.tag = tag;
            return this;
        }

        /**
         * @param tag The tag used by the webhook to identify which fulfillment is being called. This field is required if webhook is specified.
         * 
         * @return builder
         * 
         */
        public Builder tag(String tag) {
            return tag(Output.of(tag));
        }

        /**
         * @param webhook The webhook to call. Format: projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;/webhooks/&lt;Webhook ID&gt;.
         * 
         * @return builder
         * 
         */
        public Builder webhook(@Nullable Output<String> webhook) {
            $.webhook = webhook;
            return this;
        }

        /**
         * @param webhook The webhook to call. Format: projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;/webhooks/&lt;Webhook ID&gt;.
         * 
         * @return builder
         * 
         */
        public Builder webhook(String webhook) {
            return webhook(Output.of(webhook));
        }

        public CxFlowKnowledgeConnectorSettingsTriggerFulfillmentArgs build() {
            return $;
        }
    }

}
