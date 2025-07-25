// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Storage.Outputs
{

    [OutputType]
    public sealed class GetBucketEncryptionResult
    {
        /// <summary>
        /// A Cloud KMS key that will be used to encrypt objects inserted into this bucket, if no encryption method is specified. You must pay attention to whether the crypto key is available in the location that this bucket is created in. See the docs for more details.
        /// </summary>
        public readonly string DefaultKmsKeyName;

        [OutputConstructor]
        private GetBucketEncryptionResult(string defaultKmsKeyName)
        {
            DefaultKmsKeyName = defaultKmsKeyName;
        }
    }
}
