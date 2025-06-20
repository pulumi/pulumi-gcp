// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DataLoss.Inputs
{

    public sealed class PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsArgs : global::Pulumi.ResourceArgs
    {
        [Input("fieldTransformations")]
        private InputList<Inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationArgs>? _fieldTransformations;

        /// <summary>
        /// Transform the record by applying various field transformations.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationArgs> FieldTransformations
        {
            get => _fieldTransformations ?? (_fieldTransformations = new InputList<Inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationArgs>());
            set => _fieldTransformations = value;
        }

        [Input("recordSuppressions")]
        private InputList<Inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsRecordSuppressionArgs>? _recordSuppressions;

        /// <summary>
        /// Configuration defining which records get suppressed entirely. Records that match any suppression rule are omitted from the output.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsRecordSuppressionArgs> RecordSuppressions
        {
            get => _recordSuppressions ?? (_recordSuppressions = new InputList<Inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsRecordSuppressionArgs>());
            set => _recordSuppressions = value;
        }

        public PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsArgs()
        {
        }
        public static new PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsArgs Empty => new PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsArgs();
    }
}
