// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DataLoss.Inputs
{

    public sealed class PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsTransformSelectedInfoTypesInfoTypeGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the information type.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Optional custom sensitivity for this InfoType. This only applies to data profiling.
        /// Structure is documented below.
        /// </summary>
        [Input("sensitivityScore")]
        public Input<Inputs.PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsTransformSelectedInfoTypesInfoTypeSensitivityScoreGetArgs>? SensitivityScore { get; set; }

        /// <summary>
        /// Version name for this InfoType.
        /// </summary>
        [Input("version")]
        public Input<string>? Version { get; set; }

        public PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsTransformSelectedInfoTypesInfoTypeGetArgs()
        {
        }
        public static new PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsTransformSelectedInfoTypesInfoTypeGetArgs Empty => new PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsTransformSelectedInfoTypesInfoTypeGetArgs();
    }
}