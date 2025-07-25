// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute.Outputs
{

    [OutputType]
    public sealed class ResourcePolicySnapshotSchedulePolicy
    {
        /// <summary>
        /// Retention policy applied to snapshots created by this resource policy.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.ResourcePolicySnapshotSchedulePolicyRetentionPolicy? RetentionPolicy;
        /// <summary>
        /// Contains one of an `hourlySchedule`, `dailySchedule`, or `weeklySchedule`.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.ResourcePolicySnapshotSchedulePolicySchedule Schedule;
        /// <summary>
        /// Properties with which the snapshots are created, such as labels.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.ResourcePolicySnapshotSchedulePolicySnapshotProperties? SnapshotProperties;

        [OutputConstructor]
        private ResourcePolicySnapshotSchedulePolicy(
            Outputs.ResourcePolicySnapshotSchedulePolicyRetentionPolicy? retentionPolicy,

            Outputs.ResourcePolicySnapshotSchedulePolicySchedule schedule,

            Outputs.ResourcePolicySnapshotSchedulePolicySnapshotProperties? snapshotProperties)
        {
            RetentionPolicy = retentionPolicy;
            Schedule = schedule;
            SnapshotProperties = snapshotProperties;
        }
    }
}
