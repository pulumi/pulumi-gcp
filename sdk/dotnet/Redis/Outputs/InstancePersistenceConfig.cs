// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Redis.Outputs
{

    [OutputType]
    public sealed class InstancePersistenceConfig
    {
        /// <summary>
        /// Optional. Controls whether Persistence features are enabled. If not provided, the existing value will be used.
        /// - DISABLED: 	Persistence is disabled for the instance, and any existing snapshots are deleted.
        /// - RDB: RDB based Persistence is enabled.
        /// Possible values are `DISABLED` and `RDB`.
        /// </summary>
        public readonly string? PersistenceMode;
        /// <summary>
        /// -
        /// Output only. The next time that a snapshot attempt is scheduled to occur.
        /// A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up
        /// to nine fractional digits.
        /// Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
        /// </summary>
        public readonly string? RdbNextSnapshotTime;
        /// <summary>
        /// Optional. Available snapshot periods for scheduling.
        /// - ONE_HOUR:	Snapshot every 1 hour.
        /// - SIX_HOURS:	Snapshot every 6 hours.
        /// - TWELVE_HOURS:	Snapshot every 12 hours.
        /// - TWENTY_FOUR_HOURS:	Snapshot every 24 horus.
        /// Possible values are `ONE_HOUR`, `SIX_HOURS`, `TWELVE_HOURS`, and `TWENTY_FOUR_HOURS`.
        /// </summary>
        public readonly string? RdbSnapshotPeriod;
        /// <summary>
        /// Optional. Date and time that the first snapshot was/will be attempted,
        /// and to which future snapshots will be aligned. If not provided,
        /// the current time will be used.
        /// A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution
        /// and up to nine fractional digits.
        /// Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
        /// </summary>
        public readonly string? RdbSnapshotStartTime;

        [OutputConstructor]
        private InstancePersistenceConfig(
            string? persistenceMode,

            string? rdbNextSnapshotTime,

            string? rdbSnapshotPeriod,

            string? rdbSnapshotStartTime)
        {
            PersistenceMode = persistenceMode;
            RdbNextSnapshotTime = rdbNextSnapshotTime;
            RdbSnapshotPeriod = rdbSnapshotPeriod;
            RdbSnapshotStartTime = rdbSnapshotStartTime;
        }
    }
}