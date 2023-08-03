// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DataLoss.Inputs
{

    public sealed class PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Upper bound of the range, exclusive; type must match min.
        /// The `max` block must only contain one argument. See the `bucketing_config` block description for more information about choosing a data type.
        /// Structure is documented below.
        /// </summary>
        [Input("max")]
        public Input<Inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketMaxArgs>? Max { get; set; }

        /// <summary>
        /// Lower bound of the range, inclusive. Type should be the same as max if used.
        /// The `min` block must only contain one argument. See the `bucketing_config` block description for more information about choosing a data type.
        /// Structure is documented below.
        /// </summary>
        [Input("min")]
        public Input<Inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketMinArgs>? Min { get; set; }

        /// <summary>
        /// Replacement value for this bucket.
        /// The `replacement_value` block must only contain one argument.
        /// Structure is documented below.
        /// </summary>
        [Input("replacementValue", required: true)]
        public Input<Inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketReplacementValueArgs> ReplacementValue { get; set; } = null!;

        public PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketArgs()
        {
        }
        public static new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketArgs Empty => new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketArgs();
    }
}