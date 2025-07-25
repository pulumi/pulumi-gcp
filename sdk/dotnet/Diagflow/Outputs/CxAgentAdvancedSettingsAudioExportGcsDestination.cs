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
    public sealed class CxAgentAdvancedSettingsAudioExportGcsDestination
    {
        /// <summary>
        /// The Google Cloud Storage URI for the exported objects. Whether a full object name, or just a prefix, its usage depends on the Dialogflow operation.
        /// Format: gs://bucket/object-name-or-prefix
        /// </summary>
        public readonly string? Uri;

        [OutputConstructor]
        private CxAgentAdvancedSettingsAudioExportGcsDestination(string? uri)
        {
            Uri = uri;
        }
    }
}
