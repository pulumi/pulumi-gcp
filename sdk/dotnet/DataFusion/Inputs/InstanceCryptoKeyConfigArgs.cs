// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DataFusion.Inputs
{

    public sealed class InstanceCryptoKeyConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the key which is used to encrypt/decrypt customer data. For key in Cloud KMS, the key should be in the format of projects/*/locations/*/keyRings/*/cryptoKeys/*.
        /// </summary>
        [Input("keyReference", required: true)]
        public Input<string> KeyReference { get; set; } = null!;

        public InstanceCryptoKeyConfigArgs()
        {
        }
        public static new InstanceCryptoKeyConfigArgs Empty => new InstanceCryptoKeyConfigArgs();
    }
}
