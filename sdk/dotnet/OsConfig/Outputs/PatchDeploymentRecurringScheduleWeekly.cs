// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.OsConfig.Outputs
{

    [OutputType]
    public sealed class PatchDeploymentRecurringScheduleWeekly
    {
        /// <summary>
        /// IANA Time Zone Database time zone, e.g. "America/New_York".
        /// Possible values are: `MONDAY`, `TUESDAY`, `WEDNESDAY`, `THURSDAY`, `FRIDAY`, `SATURDAY`, `SUNDAY`.
        /// </summary>
        public readonly string DayOfWeek;

        [OutputConstructor]
        private PatchDeploymentRecurringScheduleWeekly(string dayOfWeek)
        {
            DayOfWeek = dayOfWeek;
        }
    }
}
