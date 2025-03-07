// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute.Outputs
{

    [OutputType]
    public sealed class GetSnapshotSourceDiskEncryptionKeyResult
    {
        /// <summary>
        /// The service account used for the encryption request for the given KMS key.
        /// If absent, the Compute Engine Service Agent service account is used.
        /// </summary>
        public readonly string KmsKeyServiceAccount;
        /// <summary>
        /// Specifies a 256-bit customer-supplied encryption key, encoded in
        /// RFC 4648 base64 to either encrypt or decrypt this resource.
        /// </summary>
        public readonly string RawKey;

        [OutputConstructor]
        private GetSnapshotSourceDiskEncryptionKeyResult(
            string kmsKeyServiceAccount,

            string rawKey)
        {
            KmsKeyServiceAccount = kmsKeyServiceAccount;
            RawKey = rawKey;
        }
    }
}
