// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DataLoss.Inputs
{

    public sealed class PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsTransformGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Apply transformation to all findings not specified in other ImageTransformation's selectedInfoTypes.
        /// </summary>
        [Input("allInfoTypes")]
        public Input<Inputs.PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsTransformAllInfoTypesGetArgs>? AllInfoTypes { get; set; }

        /// <summary>
        /// Apply transformation to all text that doesn't match an infoType.
        /// </summary>
        [Input("allText")]
        public Input<Inputs.PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsTransformAllTextGetArgs>? AllText { get; set; }

        /// <summary>
        /// The color to use when redacting content from an image. If not specified, the default is black.
        /// Structure is documented below.
        /// </summary>
        [Input("redactionColor")]
        public Input<Inputs.PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsTransformRedactionColorGetArgs>? RedactionColor { get; set; }

        /// <summary>
        /// Apply transformation to the selected infoTypes.
        /// Structure is documented below.
        /// </summary>
        [Input("selectedInfoTypes")]
        public Input<Inputs.PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsTransformSelectedInfoTypesGetArgs>? SelectedInfoTypes { get; set; }

        public PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsTransformGetArgs()
        {
        }
        public static new PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsTransformGetArgs Empty => new PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsTransformGetArgs();
    }
}