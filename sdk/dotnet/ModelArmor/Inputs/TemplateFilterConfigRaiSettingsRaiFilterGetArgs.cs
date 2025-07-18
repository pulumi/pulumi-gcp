// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.ModelArmor.Inputs
{

    public sealed class TemplateFilterConfigRaiSettingsRaiFilterGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Possible values:
        /// LOW_AND_ABOVE
        /// MEDIUM_AND_ABOVE
        /// HIGH
        /// </summary>
        [Input("confidenceLevel")]
        public Input<string>? ConfidenceLevel { get; set; }

        /// <summary>
        /// Possible values:
        /// SEXUALLY_EXPLICIT
        /// HATE_SPEECH
        /// HARASSMENT
        /// DANGEROUS
        /// </summary>
        [Input("filterType", required: true)]
        public Input<string> FilterType { get; set; } = null!;

        public TemplateFilterConfigRaiSettingsRaiFilterGetArgs()
        {
        }
        public static new TemplateFilterConfigRaiSettingsRaiFilterGetArgs Empty => new TemplateFilterConfigRaiSettingsRaiFilterGetArgs();
    }
}
