// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Diagflow.Inputs
{

    public sealed class CxFlowKnowledgeConnectorSettingsTriggerFulfillmentMessageArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The channel which the response is associated with. Clients can specify the channel via QueryParameters.channel, and only associated channel response will be returned.
        /// </summary>
        [Input("channel")]
        public Input<string>? Channel { get; set; }

        /// <summary>
        /// Indicates that the conversation succeeded, i.e., the bot handled the issue that the customer talked to it about.
        /// Dialogflow only uses this to determine which conversations should be counted as successful and doesn't process the metadata in this message in any way. Note that Dialogflow also considers conversations that get to the conversation end page as successful even if they don't return ConversationSuccess.
        /// You may set this, for example:
        /// * In the entryFulfillment of a Page if entering the page indicates that the conversation succeeded.
        /// * In a webhook response when you determine that you handled the customer issue.
        /// This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
        /// Structure is documented below.
        /// </summary>
        [Input("conversationSuccess")]
        public Input<Inputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentMessageConversationSuccessArgs>? ConversationSuccess { get; set; }

        [Input("endInteractions")]
        private InputList<Inputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentMessageEndInteractionArgs>? _endInteractions;

        /// <summary>
        /// (Output)
        /// This type has no fields.
        /// Indicates that interaction with the Dialogflow agent has ended. This message is generated by Dialogflow only and not supposed to be defined by the user.
        /// This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
        /// </summary>
        public InputList<Inputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentMessageEndInteractionArgs> EndInteractions
        {
            get => _endInteractions ?? (_endInteractions = new InputList<Inputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentMessageEndInteractionArgs>());
            set => _endInteractions = value;
        }

        /// <summary>
        /// This type has no fields.
        /// Represents info card response. If the response contains generative knowledge prediction, Dialogflow will return a payload with Infobot Messenger compatible info card.
        /// Otherwise, the info card response is skipped.
        /// This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
        /// </summary>
        [Input("knowledgeInfoCard")]
        public Input<Inputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentMessageKnowledgeInfoCardArgs>? KnowledgeInfoCard { get; set; }

        /// <summary>
        /// Indicates that the conversation should be handed off to a live agent.
        /// Dialogflow only uses this to determine which conversations were handed off to a human agent for measurement purposes. What else to do with this signal is up to you and your handoff procedures.
        /// You may set this, for example:
        /// * In the entryFulfillment of a Page if entering the page indicates something went extremely wrong in the conversation.
        /// * In a webhook response when you determine that the customer issue can only be handled by a human.
        /// This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
        /// Structure is documented below.
        /// </summary>
        [Input("liveAgentHandoff")]
        public Input<Inputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentMessageLiveAgentHandoffArgs>? LiveAgentHandoff { get; set; }

        [Input("mixedAudios")]
        private InputList<Inputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentMessageMixedAudioArgs>? _mixedAudios;

        /// <summary>
        /// (Output)
        /// Represents an audio message that is composed of both segments synthesized from the Dialogflow agent prompts and ones hosted externally at the specified URIs. The external URIs are specified via playAudio. This message is generated by Dialogflow only and not supposed to be defined by the user.
        /// This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentMessageMixedAudioArgs> MixedAudios
        {
            get => _mixedAudios ?? (_mixedAudios = new InputList<Inputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentMessageMixedAudioArgs>());
            set => _mixedAudios = value;
        }

        /// <summary>
        /// A text or ssml response that is preferentially used for TTS output audio synthesis, as described in the comment on the ResponseMessage message.
        /// This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
        /// Structure is documented below.
        /// </summary>
        [Input("outputAudioText")]
        public Input<Inputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentMessageOutputAudioTextArgs>? OutputAudioText { get; set; }

        /// <summary>
        /// Returns a response containing a custom, platform-specific payload.
        /// This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
        /// </summary>
        [Input("payload")]
        public Input<string>? Payload { get; set; }

        /// <summary>
        /// Specifies an audio clip to be played by the client as part of the response.
        /// This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
        /// Structure is documented below.
        /// </summary>
        [Input("playAudio")]
        public Input<Inputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentMessagePlayAudioArgs>? PlayAudio { get; set; }

        /// <summary>
        /// Represents the signal that telles the client to transfer the phone call connected to the agent to a third-party endpoint.
        /// This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
        /// Structure is documented below.
        /// </summary>
        [Input("telephonyTransferCall")]
        public Input<Inputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentMessageTelephonyTransferCallArgs>? TelephonyTransferCall { get; set; }

        /// <summary>
        /// The text response message.
        /// This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
        /// Structure is documented below.
        /// </summary>
        [Input("text")]
        public Input<Inputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentMessageTextArgs>? Text { get; set; }

        public CxFlowKnowledgeConnectorSettingsTriggerFulfillmentMessageArgs()
        {
        }
        public static new CxFlowKnowledgeConnectorSettingsTriggerFulfillmentMessageArgs Empty => new CxFlowKnowledgeConnectorSettingsTriggerFulfillmentMessageArgs();
    }
}
