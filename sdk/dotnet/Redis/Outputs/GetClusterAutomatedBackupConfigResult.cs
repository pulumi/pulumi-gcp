// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Redis.Outputs
{

    [OutputType]
    public sealed class GetClusterAutomatedBackupConfigResult
    {
        /// <summary>
        /// Trigger automated backups at a fixed frequency.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetClusterAutomatedBackupConfigFixedFrequencyScheduleResult> FixedFrequencySchedules;
        /// <summary>
        /// How long to keep automated backups before the backups are deleted.
        /// The value should be between 1 day and 365 days. If not specified, the default value is 35 days.
        /// A duration in seconds with up to nine fractional digits, ending with 's'. Example: "3.5s".
        /// </summary>
        public readonly string Retention;

        [OutputConstructor]
        private GetClusterAutomatedBackupConfigResult(
            ImmutableArray<Outputs.GetClusterAutomatedBackupConfigFixedFrequencyScheduleResult> fixedFrequencySchedules,

            string retention)
        {
            FixedFrequencySchedules = fixedFrequencySchedules;
            Retention = retention;
        }
    }
}
