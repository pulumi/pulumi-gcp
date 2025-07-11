// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Storage.Outputs
{

    [OutputType]
    public sealed class InsightsReportConfigFrequencyOptionsEndDate
    {
        /// <summary>
        /// The day of the month to stop generating inventory reports.
        /// </summary>
        public readonly int Day;
        /// <summary>
        /// The month to stop generating inventory reports.
        /// </summary>
        public readonly int Month;
        /// <summary>
        /// The year to stop generating inventory reports
        /// </summary>
        public readonly int Year;

        [OutputConstructor]
        private InsightsReportConfigFrequencyOptionsEndDate(
            int day,

            int month,

            int year)
        {
            Day = day;
            Month = month;
            Year = year;
        }
    }
}
