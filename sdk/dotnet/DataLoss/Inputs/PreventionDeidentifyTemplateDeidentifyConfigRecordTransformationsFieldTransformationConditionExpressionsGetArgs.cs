// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DataLoss.Inputs
{

    public sealed class PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationConditionExpressionsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Conditions to apply to the expression.
        /// Structure is documented below.
        /// </summary>
        [Input("conditions")]
        public Input<Inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationConditionExpressionsConditionsGetArgs>? Conditions { get; set; }

        /// <summary>
        /// The operator to apply to the result of conditions. Default and currently only supported value is AND.
        /// Default value is `AND`.
        /// Possible values are: `AND`.
        /// </summary>
        [Input("logicalOperator")]
        public Input<string>? LogicalOperator { get; set; }

        public PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationConditionExpressionsGetArgs()
        {
        }
        public static new PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationConditionExpressionsGetArgs Empty => new PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationConditionExpressionsGetArgs();
    }
}
