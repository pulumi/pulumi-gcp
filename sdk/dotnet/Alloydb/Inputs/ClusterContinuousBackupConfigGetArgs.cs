// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Alloydb.Inputs
{

    public sealed class ClusterContinuousBackupConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether continuous backup recovery is enabled. If not set, defaults to true.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// EncryptionConfig describes the encryption config of a cluster or a backup that is encrypted with a CMEK (customer-managed encryption key).
        /// Structure is documented below.
        /// </summary>
        [Input("encryptionConfig")]
        public Input<Inputs.ClusterContinuousBackupConfigEncryptionConfigGetArgs>? EncryptionConfig { get; set; }

        /// <summary>
        /// The numbers of days that are eligible to restore from using PITR. To support the entire recovery window, backups and logs are retained for one day more than the recovery window.
        /// If not set, defaults to 14 days.
        /// </summary>
        [Input("recoveryWindowDays")]
        public Input<int>? RecoveryWindowDays { get; set; }

        public ClusterContinuousBackupConfigGetArgs()
        {
        }
        public static new ClusterContinuousBackupConfigGetArgs Empty => new ClusterContinuousBackupConfigGetArgs();
    }
}