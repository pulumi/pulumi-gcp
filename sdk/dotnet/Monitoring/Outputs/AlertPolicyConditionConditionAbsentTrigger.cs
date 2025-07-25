// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Monitoring.Outputs
{

    [OutputType]
    public sealed class AlertPolicyConditionConditionAbsentTrigger
    {
        /// <summary>
        /// The absolute number of time series
        /// that must fail the predicate for the
        /// condition to be triggered.
        /// </summary>
        public readonly int? Count;
        /// <summary>
        /// The percentage of time series that
        /// must fail the predicate for the
        /// condition to be triggered.
        /// </summary>
        public readonly double? Percent;

        [OutputConstructor]
        private AlertPolicyConditionConditionAbsentTrigger(
            int? count,

            double? percent)
        {
            Count = count;
            Percent = percent;
        }
    }
}
