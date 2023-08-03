// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DataLoss.Inputs
{

    public sealed class PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationReplaceDictionaryConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A list of words to select from for random replacement. The [limits](https://cloud.google.com/dlp/limits) page contains details about the size limits of dictionaries.
        /// Structure is documented below.
        /// </summary>
        [Input("wordList", required: true)]
        public Input<Inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationReplaceDictionaryConfigWordListArgs> WordList { get; set; } = null!;

        public PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationReplaceDictionaryConfigArgs()
        {
        }
        public static new PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationReplaceDictionaryConfigArgs Empty => new PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationReplaceDictionaryConfigArgs();
    }
}