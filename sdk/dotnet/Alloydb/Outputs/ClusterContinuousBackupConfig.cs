// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Alloydb.Outputs
{

    [OutputType]
    public sealed class ClusterContinuousBackupConfig
    {
        /// <summary>
        /// Whether continuous backup recovery is enabled. If not set, defaults to true.
        /// </summary>
        public readonly bool? Enabled;
        /// <summary>
        /// EncryptionConfig describes the encryption config of a cluster or a backup that is encrypted with a CMEK (customer-managed encryption key).
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.ClusterContinuousBackupConfigEncryptionConfig? EncryptionConfig;
        /// <summary>
        /// The numbers of days that are eligible to restore from using PITR. To support the entire recovery window, backups and logs are retained for one day more than the recovery window.
        /// If not set, defaults to 14 days.
        /// </summary>
        public readonly int? RecoveryWindowDays;

        [OutputConstructor]
        private ClusterContinuousBackupConfig(
            bool? enabled,

            Outputs.ClusterContinuousBackupConfigEncryptionConfig? encryptionConfig,

            int? recoveryWindowDays)
        {
            Enabled = enabled;
            EncryptionConfig = encryptionConfig;
            RecoveryWindowDays = recoveryWindowDays;
        }
    }
}
