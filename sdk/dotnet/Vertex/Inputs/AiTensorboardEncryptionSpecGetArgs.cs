// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Vertex.Inputs
{

    public sealed class AiTensorboardEncryptionSpecGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Cloud KMS resource identifier of the customer managed encryption key used to protect a resource.
        /// Has the form: projects/my-project/locations/my-region/keyRings/my-kr/cryptoKeys/my-key. The key needs to be in the same region as where the resource is created.
        /// </summary>
        [Input("kmsKeyName", required: true)]
        public Input<string> KmsKeyName { get; set; } = null!;

        public AiTensorboardEncryptionSpecGetArgs()
        {
        }
        public static new AiTensorboardEncryptionSpecGetArgs Empty => new AiTensorboardEncryptionSpecGetArgs();
    }
}
