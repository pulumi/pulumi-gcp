// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DataPlex.Inputs
{

    public sealed class DatascanDataQualitySpecRuleTableConditionExpectationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The SQL expression.
        /// </summary>
        [Input("sqlExpression", required: true)]
        public Input<string> SqlExpression { get; set; } = null!;

        public DatascanDataQualitySpecRuleTableConditionExpectationArgs()
        {
        }
        public static new DatascanDataQualitySpecRuleTableConditionExpectationArgs Empty => new DatascanDataQualitySpecRuleTableConditionExpectationArgs();
    }
}
