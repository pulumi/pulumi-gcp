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
    public sealed class EnvironmentConfigDataRetentionConfigAirflowMetadataRetentionConfig
    {
        /// <summary>
        /// How many days data should be retained for. This field is supported for Cloud Composer environments in composer 3 and newer.
        /// </summary>
        public readonly int? RetentionDays;
        /// <summary>
        /// Whether database retention is enabled or not. This field is supported for Cloud Composer environments in composer 3 and newer.
        /// </summary>
        public readonly string? RetentionMode;

        [OutputConstructor]
        private EnvironmentConfigDataRetentionConfigAirflowMetadataRetentionConfig(
            int? retentionDays,

            string? retentionMode)
        {
            RetentionDays = retentionDays;
            RetentionMode = retentionMode;
        }
    }
}
