// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeBackup.Inputs
{

    public sealed class BackupPlanBackupConfigEncryptionKeyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Google Cloud KMS encryption key. Format: projects/*/locations/*/keyRings/*/cryptoKeys/*
        /// </summary>
        [Input("gcpKmsEncryptionKey", required: true)]
        public Input<string> GcpKmsEncryptionKey { get; set; } = null!;

        public BackupPlanBackupConfigEncryptionKeyArgs()
        {
        }
        public static new BackupPlanBackupConfigEncryptionKeyArgs Empty => new BackupPlanBackupConfigEncryptionKeyArgs();
    }
}