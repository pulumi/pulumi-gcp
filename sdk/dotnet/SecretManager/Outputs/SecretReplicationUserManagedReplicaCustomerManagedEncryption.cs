// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.SecretManager.Outputs
{

    [OutputType]
    public sealed class SecretReplicationUserManagedReplicaCustomerManagedEncryption
    {
        /// <summary>
        /// Describes the Cloud KMS encryption key that will be used to protect destination secret.
        /// </summary>
        public readonly string KmsKeyName;

        [OutputConstructor]
        private SecretReplicationUserManagedReplicaCustomerManagedEncryption(string kmsKeyName)
        {
            KmsKeyName = kmsKeyName;
        }
    }
}
