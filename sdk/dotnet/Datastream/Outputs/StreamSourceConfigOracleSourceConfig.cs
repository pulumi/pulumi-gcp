// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Datastream.Outputs
{

    [OutputType]
    public sealed class StreamSourceConfigOracleSourceConfig
    {
        /// <summary>
        /// Configuration to drop large object values.
        /// </summary>
        public readonly Outputs.StreamSourceConfigOracleSourceConfigDropLargeObjects? DropLargeObjects;
        /// <summary>
        /// Oracle objects to exclude from the stream.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.StreamSourceConfigOracleSourceConfigExcludeObjects? ExcludeObjects;
        /// <summary>
        /// Oracle objects to retrieve from the source.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.StreamSourceConfigOracleSourceConfigIncludeObjects? IncludeObjects;
        /// <summary>
        /// Maximum number of concurrent backfill tasks. The number should be non negative.
        /// If not set (or set to 0), the system's default value will be used.
        /// </summary>
        public readonly int? MaxConcurrentBackfillTasks;
        /// <summary>
        /// Maximum number of concurrent CDC tasks. The number should be non negative.
        /// If not set (or set to 0), the system's default value will be used.
        /// </summary>
        public readonly int? MaxConcurrentCdcTasks;
        /// <summary>
        /// Configuration to drop large object values.
        /// </summary>
        public readonly Outputs.StreamSourceConfigOracleSourceConfigStreamLargeObjects? StreamLargeObjects;

        [OutputConstructor]
        private StreamSourceConfigOracleSourceConfig(
            Outputs.StreamSourceConfigOracleSourceConfigDropLargeObjects? dropLargeObjects,

            Outputs.StreamSourceConfigOracleSourceConfigExcludeObjects? excludeObjects,

            Outputs.StreamSourceConfigOracleSourceConfigIncludeObjects? includeObjects,

            int? maxConcurrentBackfillTasks,

            int? maxConcurrentCdcTasks,

            Outputs.StreamSourceConfigOracleSourceConfigStreamLargeObjects? streamLargeObjects)
        {
            DropLargeObjects = dropLargeObjects;
            ExcludeObjects = excludeObjects;
            IncludeObjects = includeObjects;
            MaxConcurrentBackfillTasks = maxConcurrentBackfillTasks;
            MaxConcurrentCdcTasks = maxConcurrentCdcTasks;
            StreamLargeObjects = streamLargeObjects;
        }
    }
}