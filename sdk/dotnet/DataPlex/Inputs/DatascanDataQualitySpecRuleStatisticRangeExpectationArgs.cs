// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DataPlex.Inputs
{

    public sealed class DatascanDataQualitySpecRuleStatisticRangeExpectationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The maximum column statistic value allowed for a row to pass this validation.
        /// At least one of minValue and maxValue need to be provided.
        /// </summary>
        [Input("maxValue")]
        public Input<string>? MaxValue { get; set; }

        /// <summary>
        /// The minimum column statistic value allowed for a row to pass this validation.
        /// At least one of minValue and maxValue need to be provided.
        /// </summary>
        [Input("minValue")]
        public Input<string>? MinValue { get; set; }

        /// <summary>
        /// column statistics.
        /// Possible values are: `STATISTIC_UNDEFINED`, `MEAN`, `MIN`, `MAX`.
        /// </summary>
        [Input("statistic", required: true)]
        public Input<string> Statistic { get; set; } = null!;

        /// <summary>
        /// Whether column statistic needs to be strictly lesser than ('&lt;') the maximum, or if equality is allowed.
        /// Only relevant if a maxValue has been defined. Default = false.
        /// </summary>
        [Input("strictMaxEnabled")]
        public Input<bool>? StrictMaxEnabled { get; set; }

        /// <summary>
        /// Whether column statistic needs to be strictly greater than ('&gt;') the minimum, or if equality is allowed.
        /// Only relevant if a minValue has been defined. Default = false.
        /// </summary>
        [Input("strictMinEnabled")]
        public Input<bool>? StrictMinEnabled { get; set; }

        public DatascanDataQualitySpecRuleStatisticRangeExpectationArgs()
        {
        }
        public static new DatascanDataQualitySpecRuleStatisticRangeExpectationArgs Empty => new DatascanDataQualitySpecRuleStatisticRangeExpectationArgs();
    }
}
