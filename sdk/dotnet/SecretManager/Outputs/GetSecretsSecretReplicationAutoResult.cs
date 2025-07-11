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
    public sealed class GetSecretsSecretReplicationAutoResult
    {
        /// <summary>
        /// Customer Managed Encryption for the secret.
        /// Structure is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSecretsSecretReplicationAutoCustomerManagedEncryptionResult> CustomerManagedEncryptions;

        [OutputConstructor]
        private GetSecretsSecretReplicationAutoResult(ImmutableArray<Outputs.GetSecretsSecretReplicationAutoCustomerManagedEncryptionResult> customerManagedEncryptions)
        {
            CustomerManagedEncryptions = customerManagedEncryptions;
        }
    }
}
