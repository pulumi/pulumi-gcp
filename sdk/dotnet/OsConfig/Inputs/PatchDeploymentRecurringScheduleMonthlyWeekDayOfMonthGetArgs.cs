// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.OsConfig.Inputs
{

    public sealed class PatchDeploymentRecurringScheduleMonthlyWeekDayOfMonthGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A day of the week.
        /// Possible values are: `MONDAY`, `TUESDAY`, `WEDNESDAY`, `THURSDAY`, `FRIDAY`, `SATURDAY`, `SUNDAY`.
        /// </summary>
        [Input("dayOfWeek", required: true)]
        public Input<string> DayOfWeek { get; set; } = null!;

        /// <summary>
        /// Represents the number of days before or after the given week day of month that the patch deployment is scheduled for.
        /// </summary>
        [Input("dayOffset")]
        public Input<int>? DayOffset { get; set; }

        /// <summary>
        /// Week number in a month. 1-4 indicates the 1st to 4th week of the month. -1 indicates the last week of the month.
        /// </summary>
        [Input("weekOrdinal", required: true)]
        public Input<int> WeekOrdinal { get; set; } = null!;

        public PatchDeploymentRecurringScheduleMonthlyWeekDayOfMonthGetArgs()
        {
        }
        public static new PatchDeploymentRecurringScheduleMonthlyWeekDayOfMonthGetArgs Empty => new PatchDeploymentRecurringScheduleMonthlyWeekDayOfMonthGetArgs();
    }
}
