// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Diagflow.Outputs
{

    [OutputType]
    public sealed class CxFlowTransitionRouteTriggerFulfillmentMessagePlayAudio
    {
        /// <summary>
        /// (Output)
        /// Whether the playback of this message can be interrupted by the end user's speech and the client can then starts the next Dialogflow request.
        /// </summary>
        public readonly bool? AllowPlaybackInterruption;
        /// <summary>
        /// URI of the audio clip. Dialogflow does not impose any validation on this value. It is specific to the client that reads it.
        /// </summary>
        public readonly string AudioUri;

        [OutputConstructor]
        private CxFlowTransitionRouteTriggerFulfillmentMessagePlayAudio(
            bool? allowPlaybackInterruption,

            string audioUri)
        {
            AllowPlaybackInterruption = allowPlaybackInterruption;
            AudioUri = audioUri;
        }
    }
}