// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DataLoss.Inputs
{

    public sealed class PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationConditionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// An expression, consisting of an operator and conditions.
        /// Structure is documented below.
        /// </summary>
        [Input("expressions")]
        public Input<Inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationConditionExpressionsArgs>? Expressions { get; set; }

        public PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationConditionArgs()
        {
        }
        public static new PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationConditionArgs Empty => new PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationConditionArgs();
    }
}
