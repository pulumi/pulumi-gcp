// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute.Outputs
{

    [OutputType]
    public sealed class InstanceFromMachineImageBootDiskInitializeParamsSourceSnapshotEncryptionKey
    {
        /// <summary>
        /// The self link of the encryption key that is stored in Google Cloud KMS. Only one of kms_key_self_link, rsa_encrypted_key and raw_key may be set.
        /// </summary>
        public readonly string? KmsKeySelfLink;
        /// <summary>
        /// The service account being used for the encryption request for the given KMS key. If absent, the Compute Engine default service account is used.
        /// </summary>
        public readonly string? KmsKeyServiceAccount;
        /// <summary>
        /// Specifies a 256-bit customer-supplied encryption key, encoded in RFC 4648 base64 to either encrypt or decrypt this resource. Only one of kms_key_self_link, rsa_encrypted_key and raw_key may be set.
        /// </summary>
        public readonly string? RawKey;
        /// <summary>
        /// Specifies an RFC 4648 base64 encoded, RSA-wrapped 2048-bit customer-supplied encryption key to either encrypt or decrypt this resource. Only one of kms_key_self_link, rsa_encrypted_key and raw_key may be set.
        /// </summary>
        public readonly string? RsaEncryptedKey;
        /// <summary>
        /// The SHA256 hash of the encryption key used to encrypt this disk.
        /// </summary>
        public readonly string? Sha256;

        [OutputConstructor]
        private InstanceFromMachineImageBootDiskInitializeParamsSourceSnapshotEncryptionKey(
            string? kmsKeySelfLink,

            string? kmsKeyServiceAccount,

            string? rawKey,

            string? rsaEncryptedKey,

            string? sha256)
        {
            KmsKeySelfLink = kmsKeySelfLink;
            KmsKeyServiceAccount = kmsKeyServiceAccount;
            RawKey = rawKey;
            RsaEncryptedKey = rsaEncryptedKey;
            Sha256 = sha256;
        }
    }
}
