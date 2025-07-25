// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.SecretManager.Inputs
{

    public sealed class SecretReplicationAutoArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The customer-managed encryption configuration of the Secret.
        /// If no configuration is provided, Google-managed default
        /// encryption is used.
        /// Structure is documented below.
        /// </summary>
        [Input("customerManagedEncryption")]
        public Input<Inputs.SecretReplicationAutoCustomerManagedEncryptionArgs>? CustomerManagedEncryption { get; set; }

        public SecretReplicationAutoArgs()
        {
        }
        public static new SecretReplicationAutoArgs Empty => new SecretReplicationAutoArgs();
    }
}
