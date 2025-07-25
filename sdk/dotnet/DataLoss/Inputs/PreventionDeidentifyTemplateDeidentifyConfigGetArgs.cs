// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DataLoss.Inputs
{

    public sealed class PreventionDeidentifyTemplateDeidentifyConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Treat the dataset as an image and redact.
        /// Structure is documented below.
        /// </summary>
        [Input("imageTransformations")]
        public Input<Inputs.PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsGetArgs>? ImageTransformations { get; set; }

        /// <summary>
        /// Treat the dataset as free-form text and apply the same free text transformation everywhere
        /// Structure is documented below.
        /// </summary>
        [Input("infoTypeTransformations")]
        public Input<Inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsGetArgs>? InfoTypeTransformations { get; set; }

        /// <summary>
        /// Treat the dataset as structured. Transformations can be applied to specific locations within structured datasets, such as transforming a column within a table.
        /// Structure is documented below.
        /// </summary>
        [Input("recordTransformations")]
        public Input<Inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsGetArgs>? RecordTransformations { get; set; }

        public PreventionDeidentifyTemplateDeidentifyConfigGetArgs()
        {
        }
        public static new PreventionDeidentifyTemplateDeidentifyConfigGetArgs Empty => new PreventionDeidentifyTemplateDeidentifyConfigGetArgs();
    }
}
