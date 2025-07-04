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
    public sealed class EnvironmentConfigRecoveryConfig
    {
        /// <summary>
        /// The configuration settings for scheduled snapshots.
        /// </summary>
        public readonly Outputs.EnvironmentConfigRecoveryConfigScheduledSnapshotsConfig? ScheduledSnapshotsConfig;

        [OutputConstructor]
        private EnvironmentConfigRecoveryConfig(Outputs.EnvironmentConfigRecoveryConfigScheduledSnapshotsConfig? scheduledSnapshotsConfig)
        {
            ScheduledSnapshotsConfig = scheduledSnapshotsConfig;
        }
    }
}
