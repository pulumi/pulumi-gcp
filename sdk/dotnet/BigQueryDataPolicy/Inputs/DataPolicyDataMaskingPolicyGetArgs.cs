// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.BigQueryDataPolicy.Inputs
{

    public sealed class DataPolicyDataMaskingPolicyGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The available masking rules. Learn more here: https://cloud.google.com/bigquery/docs/column-data-masking-intro#masking_options.
        /// Possible values are `SHA256`, `ALWAYS_NULL`, and `DEFAULT_MASKING_VALUE`.
        /// </summary>
        [Input("predefinedExpression", required: true)]
        public Input<string> PredefinedExpression { get; set; } = null!;

        public DataPolicyDataMaskingPolicyGetArgs()
        {
        }
        public static new DataPolicyDataMaskingPolicyGetArgs Empty => new DataPolicyDataMaskingPolicyGetArgs();
    }
}