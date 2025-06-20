// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Monitoring.Inputs
{

    public sealed class AlertPolicyConditionConditionSqlGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A test that uses an alerting result in a boolean column produced by the SQL query.
        /// Structure is documented below.
        /// </summary>
        [Input("booleanTest")]
        public Input<Inputs.AlertPolicyConditionConditionSqlBooleanTestGetArgs>? BooleanTest { get; set; }

        /// <summary>
        /// Used to schedule the query to run every so many days.
        /// Structure is documented below.
        /// </summary>
        [Input("daily")]
        public Input<Inputs.AlertPolicyConditionConditionSqlDailyGetArgs>? Daily { get; set; }

        /// <summary>
        /// Used to schedule the query to run every so many hours.
        /// Structure is documented below.
        /// </summary>
        [Input("hourly")]
        public Input<Inputs.AlertPolicyConditionConditionSqlHourlyGetArgs>? Hourly { get; set; }

        /// <summary>
        /// Used to schedule the query to run every so many minutes.
        /// Structure is documented below.
        /// </summary>
        [Input("minutes")]
        public Input<Inputs.AlertPolicyConditionConditionSqlMinutesGetArgs>? Minutes { get; set; }

        /// <summary>
        /// The Log Analytics SQL query to run, as a string.  The query must
        /// conform to the required shape. Specifically, the query must not try to
        /// filter the input by time.  A filter will automatically be applied
        /// to filter the input so that the query receives all rows received
        /// since the last time the query was run.
        /// </summary>
        [Input("query", required: true)]
        public Input<string> Query { get; set; } = null!;

        /// <summary>
        /// A test that checks if the number of rows in the result set violates some threshold.
        /// Structure is documented below.
        /// </summary>
        [Input("rowCountTest")]
        public Input<Inputs.AlertPolicyConditionConditionSqlRowCountTestGetArgs>? RowCountTest { get; set; }

        public AlertPolicyConditionConditionSqlGetArgs()
        {
        }
        public static new AlertPolicyConditionConditionSqlGetArgs Empty => new AlertPolicyConditionConditionSqlGetArgs();
    }
}
