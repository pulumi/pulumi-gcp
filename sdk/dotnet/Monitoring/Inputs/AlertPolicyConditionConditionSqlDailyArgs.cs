// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Monitoring.Inputs
{

    public sealed class AlertPolicyConditionConditionSqlDailyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The time of day (in UTC) at which the query should run. If left
        /// unspecified, the server picks an arbitrary time of day and runs
        /// the query at the same time each day.
        /// Structure is documented below.
        /// </summary>
        [Input("executionTime")]
        public Input<Inputs.AlertPolicyConditionConditionSqlDailyExecutionTimeArgs>? ExecutionTime { get; set; }

        /// <summary>
        /// The number of days between runs. Must be greater than or equal
        /// to 1 day and less than or equal to 30 days.
        /// </summary>
        [Input("periodicity", required: true)]
        public Input<int> Periodicity { get; set; } = null!;

        public AlertPolicyConditionConditionSqlDailyArgs()
        {
        }
        public static new AlertPolicyConditionConditionSqlDailyArgs Empty => new AlertPolicyConditionConditionSqlDailyArgs();
    }
}
