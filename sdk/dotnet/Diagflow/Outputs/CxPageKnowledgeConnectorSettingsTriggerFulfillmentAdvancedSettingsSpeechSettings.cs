// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Diagflow.Outputs
{

    [OutputType]
    public sealed class CxPageKnowledgeConnectorSettingsTriggerFulfillmentAdvancedSettingsSpeechSettings
    {
        /// <summary>
        /// Sensitivity of the speech model that detects the end of speech. Scale from 0 to 100.
        /// </summary>
        public readonly int? EndpointerSensitivity;
        /// <summary>
        /// Mapping from language to Speech-to-Text model. The mapped Speech-to-Text model will be selected for requests from its corresponding language. For more information, see [Speech models](https://cloud.google.com/dialogflow/cx/docs/concept/speech-models).
        /// An object containing a list of **"key": value** pairs. Example: **{ "name": "wrench", "mass": "1.3kg", "count": "3" }**.
        /// </summary>
        public readonly ImmutableDictionary<string, string>? Models;
        /// <summary>
        /// Timeout before detecting no speech.
        /// A duration in seconds with up to nine fractional digits, ending with 's'. Example: "3.500s".
        /// </summary>
        public readonly string? NoSpeechTimeout;
        /// <summary>
        /// Use timeout based endpointing, interpreting endpointer sensitivity as seconds of timeout value.
        /// </summary>
        public readonly bool? UseTimeoutBasedEndpointing;

        [OutputConstructor]
        private CxPageKnowledgeConnectorSettingsTriggerFulfillmentAdvancedSettingsSpeechSettings(
            int? endpointerSensitivity,

            ImmutableDictionary<string, string>? models,

            string? noSpeechTimeout,

            bool? useTimeoutBasedEndpointing)
        {
            EndpointerSensitivity = endpointerSensitivity;
            Models = models;
            NoSpeechTimeout = noSpeechTimeout;
            UseTimeoutBasedEndpointing = useTimeoutBasedEndpointing;
        }
    }
}
