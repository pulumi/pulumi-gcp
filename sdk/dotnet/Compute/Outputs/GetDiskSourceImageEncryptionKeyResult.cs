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
    public sealed class GetDiskSourceImageEncryptionKeyResult
    {
        public readonly string KmsKeySelfLink;
        public readonly string KmsKeyServiceAccount;
        public readonly string RawKey;
        public readonly string Sha256;

        [OutputConstructor]
        private GetDiskSourceImageEncryptionKeyResult(
            string kmsKeySelfLink,

            string kmsKeyServiceAccount,

            string rawKey,

            string sha256)
        {
            KmsKeySelfLink = kmsKeySelfLink;
            KmsKeyServiceAccount = kmsKeyServiceAccount;
            RawKey = rawKey;
            Sha256 = sha256;
        }
    }
}