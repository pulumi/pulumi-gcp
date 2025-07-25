// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DataLoss.Outputs
{

    [OutputType]
    public sealed class PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsRecordSuppressionConditionExpressionsConditionsCondition
    {
        /// <summary>
        /// Field within the record this condition is evaluated against.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsRecordSuppressionConditionExpressionsConditionsConditionField Field;
        /// <summary>
        /// Operator used to compare the field or infoType to the value.
        /// Possible values are: `EQUAL_TO`, `NOT_EQUAL_TO`, `GREATER_THAN`, `LESS_THAN`, `GREATER_THAN_OR_EQUALS`, `LESS_THAN_OR_EQUALS`, `EXISTS`.
        /// </summary>
        public readonly string Operator;
        /// <summary>
        /// Value to compare against. [Mandatory, except for EXISTS tests.]
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsRecordSuppressionConditionExpressionsConditionsConditionValue? Value;

        [OutputConstructor]
        private PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsRecordSuppressionConditionExpressionsConditionsCondition(
            Outputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsRecordSuppressionConditionExpressionsConditionsConditionField field,

            string @operator,

            Outputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsRecordSuppressionConditionExpressionsConditionsConditionValue? value)
        {
            Field = field;
            Operator = @operator;
            Value = value;
        }
    }
}
