// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Monitoring.Inputs
{

    public sealed class AlertPolicyConditionConditionSqlHourlyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The number of minutes after the hour (in UTC) to run the query.
        /// Must be greater than or equal to 0 minutes and less than or equal to
        /// 59 minutes.  If left unspecified, then an arbitrary offset is used.
        /// </summary>
        [Input("minuteOffset")]
        public Input<int>? MinuteOffset { get; set; }

        /// <summary>
        /// Number of hours between runs. The interval must be greater than or
        /// equal to 1 hour and less than or equal to 48 hours.
        /// </summary>
        [Input("periodicity", required: true)]
        public Input<int> Periodicity { get; set; } = null!;

        public AlertPolicyConditionConditionSqlHourlyArgs()
        {
        }
        public static new AlertPolicyConditionConditionSqlHourlyArgs Empty => new AlertPolicyConditionConditionSqlHourlyArgs();
    }
}
