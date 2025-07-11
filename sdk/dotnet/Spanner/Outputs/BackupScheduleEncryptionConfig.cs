// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Spanner.Outputs
{

    [OutputType]
    public sealed class BackupScheduleEncryptionConfig
    {
        /// <summary>
        /// The encryption type of backups created by the backup schedule.
        /// Possible values are USE_DATABASE_ENCRYPTION, GOOGLE_DEFAULT_ENCRYPTION, or CUSTOMER_MANAGED_ENCRYPTION.
        /// If you use CUSTOMER_MANAGED_ENCRYPTION, you must specify a kmsKeyName.
        /// If your backup type is incremental-backup, the encryption type must be GOOGLE_DEFAULT_ENCRYPTION.
        /// Possible values are: `USE_DATABASE_ENCRYPTION`, `GOOGLE_DEFAULT_ENCRYPTION`, `CUSTOMER_MANAGED_ENCRYPTION`.
        /// </summary>
        public readonly string EncryptionType;
        /// <summary>
        /// The resource name of the Cloud KMS key to use for encryption.
        /// Format: 'projects/{project}/locations/{location}/keyRings/{keyRing}/cryptoKeys/{cryptoKey}'
        /// </summary>
        public readonly string? KmsKeyName;
        /// <summary>
        /// Fully qualified name of the KMS keys to use to encrypt this database. The keys must exist
        /// in the same locations as the Spanner Database.
        /// </summary>
        public readonly ImmutableArray<string> KmsKeyNames;

        [OutputConstructor]
        private BackupScheduleEncryptionConfig(
            string encryptionType,

            string? kmsKeyName,

            ImmutableArray<string> kmsKeyNames)
        {
            EncryptionType = encryptionType;
            KmsKeyName = kmsKeyName;
            KmsKeyNames = kmsKeyNames;
        }
    }
}
