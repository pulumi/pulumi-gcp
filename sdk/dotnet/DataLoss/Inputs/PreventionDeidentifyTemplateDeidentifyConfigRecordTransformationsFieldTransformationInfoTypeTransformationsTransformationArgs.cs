// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DataLoss.Inputs
{

    public sealed class PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationArgs : global::Pulumi.ResourceArgs
    {
        [Input("infoTypes")]
        private InputList<Inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationInfoTypeArgs>? _infoTypes;

        /// <summary>
        /// InfoTypes to apply the transformation to. Leaving this empty will apply the transformation to apply to
        /// all findings that correspond to infoTypes that were requested in InspectConfig.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationInfoTypeArgs> InfoTypes
        {
            get => _infoTypes ?? (_infoTypes = new InputList<Inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationInfoTypeArgs>());
            set => _infoTypes = value;
        }

        /// <summary>
        /// Apply the transformation to the entire field.
        /// The `primitive_transformation` block must only contain one argument, corresponding to the type of transformation.
        /// Structure is documented below.
        /// </summary>
        [Input("primitiveTransformation", required: true)]
        public Input<Inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationArgs> PrimitiveTransformation { get; set; } = null!;

        public PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationArgs()
        {
        }
        public static new PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationArgs Empty => new PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationArgs();
    }
}