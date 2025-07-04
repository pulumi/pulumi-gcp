// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Netapp.Inputs
{

    public sealed class VolumeSnapshotPolicyGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Daily schedule policy.
        /// Structure is documented below.
        /// </summary>
        [Input("dailySchedule")]
        public Input<Inputs.VolumeSnapshotPolicyDailyScheduleGetArgs>? DailySchedule { get; set; }

        /// <summary>
        /// Enables automated snapshot creation according to defined schedule. Default is false.
        /// To disable automatic snapshot creation you have to remove the whole snapshot_policy block.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Hourly schedule policy.
        /// Structure is documented below.
        /// </summary>
        [Input("hourlySchedule")]
        public Input<Inputs.VolumeSnapshotPolicyHourlyScheduleGetArgs>? HourlySchedule { get; set; }

        /// <summary>
        /// Monthly schedule policy.
        /// Structure is documented below.
        /// </summary>
        [Input("monthlySchedule")]
        public Input<Inputs.VolumeSnapshotPolicyMonthlyScheduleGetArgs>? MonthlySchedule { get; set; }

        /// <summary>
        /// Weekly schedule policy.
        /// Structure is documented below.
        /// </summary>
        [Input("weeklySchedule")]
        public Input<Inputs.VolumeSnapshotPolicyWeeklyScheduleGetArgs>? WeeklySchedule { get; set; }

        public VolumeSnapshotPolicyGetArgs()
        {
        }
        public static new VolumeSnapshotPolicyGetArgs Empty => new VolumeSnapshotPolicyGetArgs();
    }
}
