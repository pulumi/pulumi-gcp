// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Healthcare.Outputs
{

    [OutputType]
    public sealed class DatasetEncryptionSpec
    {
        /// <summary>
        /// KMS encryption key that is used to secure this dataset and its sub-resources. The key used for
        /// encryption and the dataset must be in the same location. If empty, the default Google encryption
        /// key will be used to secure this dataset. The format is
        /// projects/{projectId}/locations/{locationId}/keyRings/{keyRingId}/cryptoKeys/{keyId}.
        /// </summary>
        public readonly string? KmsKeyName;

        [OutputConstructor]
        private DatasetEncryptionSpec(string? kmsKeyName)
        {
            KmsKeyName = kmsKeyName;
        }
    }
}
