// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Memcache.Outputs
{

    [OutputType]
    public sealed class GetInstanceMaintenancePolicyResult
    {
        /// <summary>
        /// Output only. The time when the policy was created.
        /// A timestamp in RFC3339 UTC "Zulu" format, with nanosecond
        /// resolution and up to nine fractional digits
        /// </summary>
        public readonly string CreateTime;
        /// <summary>
        /// Optional. Description of what this policy is for.
        /// Create/Update methods return INVALID_ARGUMENT if the
        /// length is greater than 512.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// Output only. The time when the policy was updated.
        /// A timestamp in RFC3339 UTC "Zulu" format, with nanosecond
        /// resolution and up to nine fractional digits.
        /// </summary>
        public readonly string UpdateTime;
        /// <summary>
        /// Required. Maintenance window that is applied to resources covered by this policy.
        /// Minimum 1. For the current version, the maximum number of weekly_maintenance_windows
        /// is expected to be one.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetInstanceMaintenancePolicyWeeklyMaintenanceWindowResult> WeeklyMaintenanceWindows;

        [OutputConstructor]
        private GetInstanceMaintenancePolicyResult(
            string createTime,

            string description,

            string updateTime,

            ImmutableArray<Outputs.GetInstanceMaintenancePolicyWeeklyMaintenanceWindowResult> weeklyMaintenanceWindows)
        {
            CreateTime = createTime;
            Description = description;
            UpdateTime = updateTime;
            WeeklyMaintenanceWindows = weeklyMaintenanceWindows;
        }
    }
}
