// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DataLoss.Inputs
{

    public sealed class PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationDateShiftConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Points to the field that contains the context, for example, an entity id.
        /// If set, must also set cryptoKey. If set, shift will be consistent for the given context.
        /// Structure is documented below.
        /// </summary>
        [Input("context")]
        public Input<Inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationDateShiftConfigContextGetArgs>? Context { get; set; }

        /// <summary>
        /// Causes the shift to be computed based on this key and the context. This results in the same shift for the same context and cryptoKey. If set, must also set context. Can only be applied to table items.
        /// Structure is documented below.
        /// </summary>
        [Input("cryptoKey")]
        public Input<Inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationDateShiftConfigCryptoKeyGetArgs>? CryptoKey { get; set; }

        /// <summary>
        /// For example, -5 means shift date to at most 5 days back in the past.
        /// </summary>
        [Input("lowerBoundDays", required: true)]
        public Input<int> LowerBoundDays { get; set; } = null!;

        /// <summary>
        /// Range of shift in days. Actual shift will be selected at random within this range (inclusive ends). Negative means shift to earlier in time. Must not be more than 365250 days (1000 years) each direction.
        /// For example, 3 means shift date to at most 3 days into the future.
        /// </summary>
        [Input("upperBoundDays", required: true)]
        public Input<int> UpperBoundDays { get; set; } = null!;

        public PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationDateShiftConfigGetArgs()
        {
        }
        public static new PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationDateShiftConfigGetArgs Empty => new PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationDateShiftConfigGetArgs();
    }
}
