// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DataLoss.Inputs
{

    public sealed class PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsRecordSuppressionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A condition that when it evaluates to true will result in the record being evaluated to be suppressed from the transformed content.
        /// Structure is documented below.
        /// </summary>
        [Input("condition")]
        public Input<Inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsRecordSuppressionConditionArgs>? Condition { get; set; }

        public PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsRecordSuppressionArgs()
        {
        }
        public static new PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsRecordSuppressionArgs Empty => new PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsRecordSuppressionArgs();
    }
}
