// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Diagflow.Inputs
{

    public sealed class CxPageTransitionRouteTriggerFulfillmentMessageArgs : global::Pulumi.ResourceArgs
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
        public Input<Inputs.CxPageTransitionRouteTriggerFulfillmentMessageConversationSuccessArgs>? ConversationSuccess { get; set; }

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
        public Input<Inputs.CxPageTransitionRouteTriggerFulfillmentMessageLiveAgentHandoffArgs>? LiveAgentHandoff { get; set; }

        /// <summary>
        /// A text or ssml response that is preferentially used for TTS output audio synthesis, as described in the comment on the ResponseMessage message.
        /// This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
        /// Structure is documented below.
        /// </summary>
        [Input("outputAudioText")]
        public Input<Inputs.CxPageTransitionRouteTriggerFulfillmentMessageOutputAudioTextArgs>? OutputAudioText { get; set; }

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
        public Input<Inputs.CxPageTransitionRouteTriggerFulfillmentMessagePlayAudioArgs>? PlayAudio { get; set; }

        /// <summary>
        /// Represents the signal that telles the client to transfer the phone call connected to the agent to a third-party endpoint.
        /// This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
        /// Structure is documented below.
        /// </summary>
        [Input("telephonyTransferCall")]
        public Input<Inputs.CxPageTransitionRouteTriggerFulfillmentMessageTelephonyTransferCallArgs>? TelephonyTransferCall { get; set; }

        /// <summary>
        /// The text response message.
        /// This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
        /// Structure is documented below.
        /// </summary>
        [Input("text")]
        public Input<Inputs.CxPageTransitionRouteTriggerFulfillmentMessageTextArgs>? Text { get; set; }

        public CxPageTransitionRouteTriggerFulfillmentMessageArgs()
        {
        }
        public static new CxPageTransitionRouteTriggerFulfillmentMessageArgs Empty => new CxPageTransitionRouteTriggerFulfillmentMessageArgs();
    }
}
