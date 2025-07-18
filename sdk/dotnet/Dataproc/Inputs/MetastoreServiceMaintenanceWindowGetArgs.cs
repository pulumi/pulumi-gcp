// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Dataproc.Inputs
{

    public sealed class MetastoreServiceMaintenanceWindowGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The day of week, when the window starts.
        /// Possible values are: `MONDAY`, `TUESDAY`, `WEDNESDAY`, `THURSDAY`, `FRIDAY`, `SATURDAY`, `SUNDAY`.
        /// </summary>
        [Input("dayOfWeek", required: true)]
        public Input<string> DayOfWeek { get; set; } = null!;

        /// <summary>
        /// The hour of day (0-23) when the window starts.
        /// </summary>
        [Input("hourOfDay", required: true)]
        public Input<int> HourOfDay { get; set; } = null!;

        public MetastoreServiceMaintenanceWindowGetArgs()
        {
        }
        public static new MetastoreServiceMaintenanceWindowGetArgs Empty => new MetastoreServiceMaintenanceWindowGetArgs();
    }
}
