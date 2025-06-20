// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Composer.Outputs
{

    [OutputType]
    public sealed class GetEnvironmentConfigDataRetentionConfigResult
    {
        /// <summary>
        /// Optional. The policy for airflow metadata database retention.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetEnvironmentConfigDataRetentionConfigAirflowMetadataRetentionConfigResult> AirflowMetadataRetentionConfigs;
        /// <summary>
        /// Optional. The configuration setting for Task Logs.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetEnvironmentConfigDataRetentionConfigTaskLogsRetentionConfigResult> TaskLogsRetentionConfigs;

        [OutputConstructor]
        private GetEnvironmentConfigDataRetentionConfigResult(
            ImmutableArray<Outputs.GetEnvironmentConfigDataRetentionConfigAirflowMetadataRetentionConfigResult> airflowMetadataRetentionConfigs,

            ImmutableArray<Outputs.GetEnvironmentConfigDataRetentionConfigTaskLogsRetentionConfigResult> taskLogsRetentionConfigs)
        {
            AirflowMetadataRetentionConfigs = airflowMetadataRetentionConfigs;
            TaskLogsRetentionConfigs = taskLogsRetentionConfigs;
        }
    }
}
