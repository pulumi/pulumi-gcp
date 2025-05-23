// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.diagflow.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.diagflow.outputs.CxFlowEventHandlerTriggerFulfillmentMessageConversationSuccess;
import com.pulumi.gcp.diagflow.outputs.CxFlowEventHandlerTriggerFulfillmentMessageLiveAgentHandoff;
import com.pulumi.gcp.diagflow.outputs.CxFlowEventHandlerTriggerFulfillmentMessageOutputAudioText;
import com.pulumi.gcp.diagflow.outputs.CxFlowEventHandlerTriggerFulfillmentMessagePlayAudio;
import com.pulumi.gcp.diagflow.outputs.CxFlowEventHandlerTriggerFulfillmentMessageTelephonyTransferCall;
import com.pulumi.gcp.diagflow.outputs.CxFlowEventHandlerTriggerFulfillmentMessageText;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CxFlowEventHandlerTriggerFulfillmentMessage {
    /**
     * @return The channel which the response is associated with. Clients can specify the channel via QueryParameters.channel, and only associated channel response will be returned.
     * 
     */
    private @Nullable String channel;
    /**
     * @return Indicates that the conversation succeeded, i.e., the bot handled the issue that the customer talked to it about.
     * Dialogflow only uses this to determine which conversations should be counted as successful and doesn&#39;t process the metadata in this message in any way. Note that Dialogflow also considers conversations that get to the conversation end page as successful even if they don&#39;t return ConversationSuccess.
     * You may set this, for example:
     * * In the entryFulfillment of a Page if entering the page indicates that the conversation succeeded.
     * * In a webhook response when you determine that you handled the customer issue.
     *   This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
     *   Structure is documented below.
     * 
     */
    private @Nullable CxFlowEventHandlerTriggerFulfillmentMessageConversationSuccess conversationSuccess;
    /**
     * @return Indicates that the conversation should be handed off to a live agent.
     * Dialogflow only uses this to determine which conversations were handed off to a human agent for measurement purposes. What else to do with this signal is up to you and your handoff procedures.
     * You may set this, for example:
     * * In the entryFulfillment of a Page if entering the page indicates something went extremely wrong in the conversation.
     * * In a webhook response when you determine that the customer issue can only be handled by a human.
     *   This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
     *   Structure is documented below.
     * 
     */
    private @Nullable CxFlowEventHandlerTriggerFulfillmentMessageLiveAgentHandoff liveAgentHandoff;
    /**
     * @return A text or ssml response that is preferentially used for TTS output audio synthesis, as described in the comment on the ResponseMessage message.
     * This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
     * Structure is documented below.
     * 
     */
    private @Nullable CxFlowEventHandlerTriggerFulfillmentMessageOutputAudioText outputAudioText;
    /**
     * @return Returns a response containing a custom, platform-specific payload.
     * This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
     * 
     */
    private @Nullable String payload;
    /**
     * @return Specifies an audio clip to be played by the client as part of the response.
     * This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
     * Structure is documented below.
     * 
     */
    private @Nullable CxFlowEventHandlerTriggerFulfillmentMessagePlayAudio playAudio;
    /**
     * @return Represents the signal that telles the client to transfer the phone call connected to the agent to a third-party endpoint.
     * This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
     * Structure is documented below.
     * 
     */
    private @Nullable CxFlowEventHandlerTriggerFulfillmentMessageTelephonyTransferCall telephonyTransferCall;
    /**
     * @return The text response message.
     * This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
     * Structure is documented below.
     * 
     */
    private @Nullable CxFlowEventHandlerTriggerFulfillmentMessageText text;

    private CxFlowEventHandlerTriggerFulfillmentMessage() {}
    /**
     * @return The channel which the response is associated with. Clients can specify the channel via QueryParameters.channel, and only associated channel response will be returned.
     * 
     */
    public Optional<String> channel() {
        return Optional.ofNullable(this.channel);
    }
    /**
     * @return Indicates that the conversation succeeded, i.e., the bot handled the issue that the customer talked to it about.
     * Dialogflow only uses this to determine which conversations should be counted as successful and doesn&#39;t process the metadata in this message in any way. Note that Dialogflow also considers conversations that get to the conversation end page as successful even if they don&#39;t return ConversationSuccess.
     * You may set this, for example:
     * * In the entryFulfillment of a Page if entering the page indicates that the conversation succeeded.
     * * In a webhook response when you determine that you handled the customer issue.
     *   This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
     *   Structure is documented below.
     * 
     */
    public Optional<CxFlowEventHandlerTriggerFulfillmentMessageConversationSuccess> conversationSuccess() {
        return Optional.ofNullable(this.conversationSuccess);
    }
    /**
     * @return Indicates that the conversation should be handed off to a live agent.
     * Dialogflow only uses this to determine which conversations were handed off to a human agent for measurement purposes. What else to do with this signal is up to you and your handoff procedures.
     * You may set this, for example:
     * * In the entryFulfillment of a Page if entering the page indicates something went extremely wrong in the conversation.
     * * In a webhook response when you determine that the customer issue can only be handled by a human.
     *   This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
     *   Structure is documented below.
     * 
     */
    public Optional<CxFlowEventHandlerTriggerFulfillmentMessageLiveAgentHandoff> liveAgentHandoff() {
        return Optional.ofNullable(this.liveAgentHandoff);
    }
    /**
     * @return A text or ssml response that is preferentially used for TTS output audio synthesis, as described in the comment on the ResponseMessage message.
     * This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
     * Structure is documented below.
     * 
     */
    public Optional<CxFlowEventHandlerTriggerFulfillmentMessageOutputAudioText> outputAudioText() {
        return Optional.ofNullable(this.outputAudioText);
    }
    /**
     * @return Returns a response containing a custom, platform-specific payload.
     * This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
     * 
     */
    public Optional<String> payload() {
        return Optional.ofNullable(this.payload);
    }
    /**
     * @return Specifies an audio clip to be played by the client as part of the response.
     * This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
     * Structure is documented below.
     * 
     */
    public Optional<CxFlowEventHandlerTriggerFulfillmentMessagePlayAudio> playAudio() {
        return Optional.ofNullable(this.playAudio);
    }
    /**
     * @return Represents the signal that telles the client to transfer the phone call connected to the agent to a third-party endpoint.
     * This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
     * Structure is documented below.
     * 
     */
    public Optional<CxFlowEventHandlerTriggerFulfillmentMessageTelephonyTransferCall> telephonyTransferCall() {
        return Optional.ofNullable(this.telephonyTransferCall);
    }
    /**
     * @return The text response message.
     * This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
     * Structure is documented below.
     * 
     */
    public Optional<CxFlowEventHandlerTriggerFulfillmentMessageText> text() {
        return Optional.ofNullable(this.text);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxFlowEventHandlerTriggerFulfillmentMessage defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String channel;
        private @Nullable CxFlowEventHandlerTriggerFulfillmentMessageConversationSuccess conversationSuccess;
        private @Nullable CxFlowEventHandlerTriggerFulfillmentMessageLiveAgentHandoff liveAgentHandoff;
        private @Nullable CxFlowEventHandlerTriggerFulfillmentMessageOutputAudioText outputAudioText;
        private @Nullable String payload;
        private @Nullable CxFlowEventHandlerTriggerFulfillmentMessagePlayAudio playAudio;
        private @Nullable CxFlowEventHandlerTriggerFulfillmentMessageTelephonyTransferCall telephonyTransferCall;
        private @Nullable CxFlowEventHandlerTriggerFulfillmentMessageText text;
        public Builder() {}
        public Builder(CxFlowEventHandlerTriggerFulfillmentMessage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.channel = defaults.channel;
    	      this.conversationSuccess = defaults.conversationSuccess;
    	      this.liveAgentHandoff = defaults.liveAgentHandoff;
    	      this.outputAudioText = defaults.outputAudioText;
    	      this.payload = defaults.payload;
    	      this.playAudio = defaults.playAudio;
    	      this.telephonyTransferCall = defaults.telephonyTransferCall;
    	      this.text = defaults.text;
        }

        @CustomType.Setter
        public Builder channel(@Nullable String channel) {

            this.channel = channel;
            return this;
        }
        @CustomType.Setter
        public Builder conversationSuccess(@Nullable CxFlowEventHandlerTriggerFulfillmentMessageConversationSuccess conversationSuccess) {

            this.conversationSuccess = conversationSuccess;
            return this;
        }
        @CustomType.Setter
        public Builder liveAgentHandoff(@Nullable CxFlowEventHandlerTriggerFulfillmentMessageLiveAgentHandoff liveAgentHandoff) {

            this.liveAgentHandoff = liveAgentHandoff;
            return this;
        }
        @CustomType.Setter
        public Builder outputAudioText(@Nullable CxFlowEventHandlerTriggerFulfillmentMessageOutputAudioText outputAudioText) {

            this.outputAudioText = outputAudioText;
            return this;
        }
        @CustomType.Setter
        public Builder payload(@Nullable String payload) {

            this.payload = payload;
            return this;
        }
        @CustomType.Setter
        public Builder playAudio(@Nullable CxFlowEventHandlerTriggerFulfillmentMessagePlayAudio playAudio) {

            this.playAudio = playAudio;
            return this;
        }
        @CustomType.Setter
        public Builder telephonyTransferCall(@Nullable CxFlowEventHandlerTriggerFulfillmentMessageTelephonyTransferCall telephonyTransferCall) {

            this.telephonyTransferCall = telephonyTransferCall;
            return this;
        }
        @CustomType.Setter
        public Builder text(@Nullable CxFlowEventHandlerTriggerFulfillmentMessageText text) {

            this.text = text;
            return this;
        }
        public CxFlowEventHandlerTriggerFulfillmentMessage build() {
            final var _resultValue = new CxFlowEventHandlerTriggerFulfillmentMessage();
            _resultValue.channel = channel;
            _resultValue.conversationSuccess = conversationSuccess;
            _resultValue.liveAgentHandoff = liveAgentHandoff;
            _resultValue.outputAudioText = outputAudioText;
            _resultValue.payload = payload;
            _resultValue.playAudio = playAudio;
            _resultValue.telephonyTransferCall = telephonyTransferCall;
            _resultValue.text = text;
            return _resultValue;
        }
    }
}
