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
    public sealed class StreamSourceConfigSqlServerSourceConfig
    {
        /// <summary>
        /// SQL Server objects to exclude from the stream.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.StreamSourceConfigSqlServerSourceConfigExcludeObjects? ExcludeObjects;
        /// <summary>
        /// SQL Server objects to retrieve from the source.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.StreamSourceConfigSqlServerSourceConfigIncludeObjects? IncludeObjects;
        /// <summary>
        /// Max concurrent backfill tasks.
        /// </summary>
        public readonly int? MaxConcurrentBackfillTasks;
        /// <summary>
        /// Max concurrent CDC tasks.
        /// </summary>
        public readonly int? MaxConcurrentCdcTasks;

        [OutputConstructor]
        private StreamSourceConfigSqlServerSourceConfig(
            Outputs.StreamSourceConfigSqlServerSourceConfigExcludeObjects? excludeObjects,

            Outputs.StreamSourceConfigSqlServerSourceConfigIncludeObjects? includeObjects,

            int? maxConcurrentBackfillTasks,

            int? maxConcurrentCdcTasks)
        {
            ExcludeObjects = excludeObjects;
            IncludeObjects = includeObjects;
            MaxConcurrentBackfillTasks = maxConcurrentBackfillTasks;
            MaxConcurrentCdcTasks = maxConcurrentCdcTasks;
        }
    }
}
