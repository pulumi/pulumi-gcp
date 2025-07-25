// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute.Inputs
{

    public sealed class InstanceBootDiskInitializeParamsSourceImageEncryptionKeyGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The self link of the encryption key that is stored in Google Cloud KMS. Only one of kms_key_self_link, rsa_encrypted_key and raw_key may be set.
        /// </summary>
        [Input("kmsKeySelfLink")]
        public Input<string>? KmsKeySelfLink { get; set; }

        /// <summary>
        /// The service account being used for the encryption request for the given KMS key. If absent, the Compute Engine default service account is used.
        /// </summary>
        [Input("kmsKeyServiceAccount")]
        public Input<string>? KmsKeyServiceAccount { get; set; }

        [Input("rawKey")]
        private Input<string>? _rawKey;

        /// <summary>
        /// Specifies a 256-bit customer-supplied encryption key, encoded in RFC 4648 base64 to either encrypt or decrypt this resource. Only one of kms_key_self_link, rsa_encrypted_key and raw_key may be set.
        /// </summary>
        public Input<string>? RawKey
        {
            get => _rawKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _rawKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("rsaEncryptedKey")]
        private Input<string>? _rsaEncryptedKey;

        /// <summary>
        /// Specifies an RFC 4648 base64 encoded, RSA-wrapped 2048-bit customer-supplied encryption key to either encrypt or decrypt this resource. Only one of kms_key_self_link, rsa_encrypted_key and raw_key may be set.
        /// </summary>
        public Input<string>? RsaEncryptedKey
        {
            get => _rsaEncryptedKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _rsaEncryptedKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The [RFC 4648 base64](https://tools.ietf.org/html/rfc4648#section-4)
        /// encoded SHA-256 hash of the [customer-supplied encryption key]
        /// (https://cloud.google.com/compute/docs/disks/customer-supplied-encryption) that protects this resource.
        /// </summary>
        [Input("sha256")]
        public Input<string>? Sha256 { get; set; }

        public InstanceBootDiskInitializeParamsSourceImageEncryptionKeyGetArgs()
        {
        }
        public static new InstanceBootDiskInitializeParamsSourceImageEncryptionKeyGetArgs Empty => new InstanceBootDiskInitializeParamsSourceImageEncryptionKeyGetArgs();
    }
}
