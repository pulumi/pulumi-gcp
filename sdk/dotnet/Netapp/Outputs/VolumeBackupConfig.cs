// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Netapp.Outputs
{

    [OutputType]
    public sealed class VolumeBackupConfig
    {
        /// <summary>
        /// Specify a single backup policy ID for scheduled backups. Format: `projects/{{projectId}}/locations/{{location}}/backupPolicies/{{backupPolicyName}}`
        /// </summary>
        public readonly ImmutableArray<string> BackupPolicies;
        /// <summary>
        /// ID of the backup vault to use. A backup vault is reqired to create manual or scheduled backups.
        /// Format: `projects/{{projectId}}/locations/{{location}}/backupVaults/{{backupVaultName}}`
        /// </summary>
        public readonly string? BackupVault;
        /// <summary>
        /// When set to true, scheduled backup is enabled on the volume. Omit if no backup_policy is specified.
        /// </summary>
        public readonly bool? ScheduledBackupEnabled;

        [OutputConstructor]
        private VolumeBackupConfig(
            ImmutableArray<string> backupPolicies,

            string? backupVault,

            bool? scheduledBackupEnabled)
        {
            BackupPolicies = backupPolicies;
            BackupVault = backupVault;
            ScheduledBackupEnabled = scheduledBackupEnabled;
        }
    }
}
