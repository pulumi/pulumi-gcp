// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.ModelArmor.Outputs
{

    [OutputType]
    public sealed class TemplateFilterConfigPiAndJailbreakFilterSettings
    {
        /// <summary>
        /// Possible values:
        /// LOW_AND_ABOVE
        /// MEDIUM_AND_ABOVE
        /// HIGH
        /// </summary>
        public readonly string? ConfidenceLevel;
        /// <summary>
        /// Tells whether Prompt injection and Jailbreak filter is enabled or
        /// disabled.
        /// Possible values:
        /// ENABLED
        /// DISABLED
        /// </summary>
        public readonly string? FilterEnforcement;

        [OutputConstructor]
        private TemplateFilterConfigPiAndJailbreakFilterSettings(
            string? confidenceLevel,

            string? filterEnforcement)
        {
            ConfidenceLevel = confidenceLevel;
            FilterEnforcement = filterEnforcement;
        }
    }
}
