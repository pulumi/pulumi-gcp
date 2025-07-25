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
    public sealed class PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsTransform
    {
        /// <summary>
        /// Apply transformation to all findings not specified in other ImageTransformation's selectedInfoTypes.
        /// </summary>
        public readonly Outputs.PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsTransformAllInfoTypes? AllInfoTypes;
        /// <summary>
        /// Apply transformation to all text that doesn't match an infoType.
        /// </summary>
        public readonly Outputs.PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsTransformAllText? AllText;
        /// <summary>
        /// The color to use when redacting content from an image. If not specified, the default is black.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsTransformRedactionColor? RedactionColor;
        /// <summary>
        /// Apply transformation to the selected infoTypes.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsTransformSelectedInfoTypes? SelectedInfoTypes;

        [OutputConstructor]
        private PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsTransform(
            Outputs.PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsTransformAllInfoTypes? allInfoTypes,

            Outputs.PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsTransformAllText? allText,

            Outputs.PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsTransformRedactionColor? redactionColor,

            Outputs.PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsTransformSelectedInfoTypes? selectedInfoTypes)
        {
            AllInfoTypes = allInfoTypes;
            AllText = allText;
            RedactionColor = redactionColor;
            SelectedInfoTypes = selectedInfoTypes;
        }
    }
}
