// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Vertex.Outputs
{

    [OutputType]
    public sealed class AiEndpointEncryptionSpec
    {
        /// <summary>
        /// Required. The Cloud KMS resource identifier of the customer managed encryption key used to protect a resource. Has the form: `projects/my-project/locations/my-region/keyRings/my-kr/cryptoKeys/my-key`. The key needs to be in the same region as where the compute resource is created.
        /// </summary>
        public readonly string KmsKeyName;

        [OutputConstructor]
        private AiEndpointEncryptionSpec(string kmsKeyName)
        {
            KmsKeyName = kmsKeyName;
        }
    }
}
