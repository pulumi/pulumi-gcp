// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Diagflow.Inputs
{

    public sealed class CxSecuritySettingsAudioExportSettingsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Filename pattern for exported audio.
        /// </summary>
        [Input("audioExportPattern")]
        public Input<string>? AudioExportPattern { get; set; }

        /// <summary>
        /// File format for exported audio file. Currently only in telephony recordings.
        /// * MULAW: G.711 mu-law PCM with 8kHz sample rate.
        /// * MP3: MP3 file format.
        /// * OGG: OGG Vorbis.
        /// Possible values are: `MULAW`, `MP3`, `OGG`.
        /// </summary>
        [Input("audioFormat")]
        public Input<string>? AudioFormat { get; set; }

        /// <summary>
        /// Enable audio redaction if it is true.
        /// </summary>
        [Input("enableAudioRedaction")]
        public Input<bool>? EnableAudioRedaction { get; set; }

        /// <summary>
        /// Cloud Storage bucket to export audio record to. Setting this field would grant the Storage Object Creator role to the Dialogflow Service Agent. API caller that tries to modify this field should have the permission of storage.buckets.setIamPolicy.
        /// </summary>
        [Input("gcsBucket")]
        public Input<string>? GcsBucket { get; set; }

        public CxSecuritySettingsAudioExportSettingsGetArgs()
        {
        }
        public static new CxSecuritySettingsAudioExportSettingsGetArgs Empty => new CxSecuritySettingsAudioExportSettingsGetArgs();
    }
}
