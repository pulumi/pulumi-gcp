// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.EdgeContainer.Outputs
{

    [OutputType]
    public sealed class NodePoolLocalDiskEncryption
    {
        /// <summary>
        /// The Cloud KMS CryptoKey e.g. projects/{project}/locations/{location}/keyRings/{keyRing}/cryptoKeys/{cryptoKey} to use for protecting node local disks.
        /// If not specified, a Google-managed key will be used instead.
        /// </summary>
        public readonly string? KmsKey;
        /// <summary>
        /// (Output)
        /// The Cloud KMS CryptoKeyVersion currently in use for protecting node local disks. Only applicable if kmsKey is set.
        /// </summary>
        public readonly string? KmsKeyActiveVersion;
        /// <summary>
        /// (Output)
        /// Availability of the Cloud KMS CryptoKey. If not KEY_AVAILABLE, then nodes may go offline as they cannot access their local data.
        /// This can be caused by a lack of permissions to use the key, or if the key is disabled or deleted.
        /// </summary>
        public readonly string? KmsKeyState;

        [OutputConstructor]
        private NodePoolLocalDiskEncryption(
            string? kmsKey,

            string? kmsKeyActiveVersion,

            string? kmsKeyState)
        {
            KmsKey = kmsKey;
            KmsKeyActiveVersion = kmsKeyActiveVersion;
            KmsKeyState = kmsKeyState;
        }
    }
}
