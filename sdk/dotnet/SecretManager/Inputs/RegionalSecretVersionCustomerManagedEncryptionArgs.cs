// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.SecretManager.Inputs
{

    public sealed class RegionalSecretVersionCustomerManagedEncryptionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (Output)
        /// The resource name of the Cloud KMS CryptoKey used to encrypt secret payloads.
        /// </summary>
        [Input("kmsKeyVersionName")]
        public Input<string>? KmsKeyVersionName { get; set; }

        public RegionalSecretVersionCustomerManagedEncryptionArgs()
        {
        }
        public static new RegionalSecretVersionCustomerManagedEncryptionArgs Empty => new RegionalSecretVersionCustomerManagedEncryptionArgs();
    }
}
