// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Firestore.Outputs
{

    [OutputType]
    public sealed class BackupScheduleWeeklyRecurrence
    {
        /// <summary>
        /// The day of week to run.
        /// Possible values are: `DAY_OF_WEEK_UNSPECIFIED`, `MONDAY`, `TUESDAY`, `WEDNESDAY`, `THURSDAY`, `FRIDAY`, `SATURDAY`, `SUNDAY`.
        /// </summary>
        public readonly string? Day;

        [OutputConstructor]
        private BackupScheduleWeeklyRecurrence(string? day)
        {
            Day = day;
        }
    }
}
