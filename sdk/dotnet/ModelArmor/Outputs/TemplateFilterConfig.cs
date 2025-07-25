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
    public sealed class TemplateFilterConfig
    {
        /// <summary>
        /// Malicious URI filter settings.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.TemplateFilterConfigMaliciousUriFilterSettings? MaliciousUriFilterSettings;
        /// <summary>
        /// Prompt injection and Jailbreak Filter settings.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.TemplateFilterConfigPiAndJailbreakFilterSettings? PiAndJailbreakFilterSettings;
        /// <summary>
        /// Responsible AI Filter settings.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.TemplateFilterConfigRaiSettings? RaiSettings;
        /// <summary>
        /// Sensitive Data Protection settings.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.TemplateFilterConfigSdpSettings? SdpSettings;

        [OutputConstructor]
        private TemplateFilterConfig(
            Outputs.TemplateFilterConfigMaliciousUriFilterSettings? maliciousUriFilterSettings,

            Outputs.TemplateFilterConfigPiAndJailbreakFilterSettings? piAndJailbreakFilterSettings,

            Outputs.TemplateFilterConfigRaiSettings? raiSettings,

            Outputs.TemplateFilterConfigSdpSettings? sdpSettings)
        {
            MaliciousUriFilterSettings = maliciousUriFilterSettings;
            PiAndJailbreakFilterSettings = piAndJailbreakFilterSettings;
            RaiSettings = raiSettings;
            SdpSettings = sdpSettings;
        }
    }
}
