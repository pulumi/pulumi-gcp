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
    public sealed class CxSecuritySettingsAudioExportSettings
    {
        /// <summary>
        /// Filename pattern for exported audio.
        /// </summary>
        public readonly string? AudioExportPattern;
        /// <summary>
        /// File format for exported audio file. Currently only in telephony recordings.
        /// * MULAW: G.711 mu-law PCM with 8kHz sample rate.
        /// * MP3: MP3 file format.
        /// * OGG: OGG Vorbis.
        /// Possible values are: `MULAW`, `MP3`, `OGG`.
        /// </summary>
        public readonly string? AudioFormat;
        /// <summary>
        /// Enable audio redaction if it is true.
        /// </summary>
        public readonly bool? EnableAudioRedaction;
        /// <summary>
        /// Cloud Storage bucket to export audio record to. Setting this field would grant the Storage Object Creator role to the Dialogflow Service Agent. API caller that tries to modify this field should have the permission of storage.buckets.setIamPolicy.
        /// </summary>
        public readonly string? GcsBucket;

        [OutputConstructor]
        private CxSecuritySettingsAudioExportSettings(
            string? audioExportPattern,

            string? audioFormat,

            bool? enableAudioRedaction,

            string? gcsBucket)
        {
            AudioExportPattern = audioExportPattern;
            AudioFormat = audioFormat;
            EnableAudioRedaction = enableAudioRedaction;
            GcsBucket = gcsBucket;
        }
    }
}