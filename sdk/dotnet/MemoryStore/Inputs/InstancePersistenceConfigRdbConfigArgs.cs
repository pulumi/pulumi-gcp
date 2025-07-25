// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.MemoryStore.Inputs
{

    public sealed class InstancePersistenceConfigRdbConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Optional. Period between RDB snapshots.
        /// Possible values:
        /// ONE_HOUR
        /// SIX_HOURS
        /// TWELVE_HOURS
        /// TWENTY_FOUR_HOURS
        /// </summary>
        [Input("rdbSnapshotPeriod")]
        public Input<string>? RdbSnapshotPeriod { get; set; }

        /// <summary>
        /// Optional. Time that the first snapshot was/will be attempted, and to which future
        /// snapshots will be aligned. If not provided, the current time will be
        /// used.
        /// </summary>
        [Input("rdbSnapshotStartTime")]
        public Input<string>? RdbSnapshotStartTime { get; set; }

        public InstancePersistenceConfigRdbConfigArgs()
        {
        }
        public static new InstancePersistenceConfigRdbConfigArgs Empty => new InstancePersistenceConfigRdbConfigArgs();
    }
}
