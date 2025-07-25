// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DataLoss.Inputs
{

    public sealed class PreventionInspectTemplateInspectConfigLimitsMaxFindingsPerInfoTypeGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Type of information the findings limit applies to. Only one limit per infoType should be provided. If InfoTypeLimit does
        /// not have an infoType, the DLP API applies the limit against all infoTypes that are found but not
        /// specified in another InfoTypeLimit.
        /// Structure is documented below.
        /// </summary>
        [Input("infoType")]
        public Input<Inputs.PreventionInspectTemplateInspectConfigLimitsMaxFindingsPerInfoTypeInfoTypeGetArgs>? InfoType { get; set; }

        /// <summary>
        /// Max findings limit for the given infoType.
        /// </summary>
        [Input("maxFindings", required: true)]
        public Input<int> MaxFindings { get; set; } = null!;

        public PreventionInspectTemplateInspectConfigLimitsMaxFindingsPerInfoTypeGetArgs()
        {
        }
        public static new PreventionInspectTemplateInspectConfigLimitsMaxFindingsPerInfoTypeGetArgs Empty => new PreventionInspectTemplateInspectConfigLimitsMaxFindingsPerInfoTypeGetArgs();
    }
}
