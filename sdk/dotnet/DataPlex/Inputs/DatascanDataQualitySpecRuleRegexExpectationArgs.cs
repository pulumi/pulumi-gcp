// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DataPlex.Inputs
{

    public sealed class DatascanDataQualitySpecRuleRegexExpectationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A regular expression the column value is expected to match.
        /// </summary>
        [Input("regex", required: true)]
        public Input<string> Regex { get; set; } = null!;

        public DatascanDataQualitySpecRuleRegexExpectationArgs()
        {
        }
        public static new DatascanDataQualitySpecRuleRegexExpectationArgs Empty => new DatascanDataQualitySpecRuleRegexExpectationArgs();
    }
}
