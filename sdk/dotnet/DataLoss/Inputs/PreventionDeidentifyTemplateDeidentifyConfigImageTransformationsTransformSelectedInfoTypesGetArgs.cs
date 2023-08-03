// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DataLoss.Inputs
{

    public sealed class PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsTransformSelectedInfoTypesGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("infoTypes", required: true)]
        private InputList<Inputs.PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsTransformSelectedInfoTypesInfoTypeGetArgs>? _infoTypes;

        /// <summary>
        /// InfoTypes to apply the transformation to. Leaving this empty will apply the transformation to apply to
        /// all findings that correspond to infoTypes that were requested in InspectConfig.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsTransformSelectedInfoTypesInfoTypeGetArgs> InfoTypes
        {
            get => _infoTypes ?? (_infoTypes = new InputList<Inputs.PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsTransformSelectedInfoTypesInfoTypeGetArgs>());
            set => _infoTypes = value;
        }

        public PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsTransformSelectedInfoTypesGetArgs()
        {
        }
        public static new PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsTransformSelectedInfoTypesGetArgs Empty => new PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsTransformSelectedInfoTypesGetArgs();
    }
}