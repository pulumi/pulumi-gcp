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
    public sealed class AiFeatureOnlineStoreFeatureviewVectorSearchConfigTreeAhConfig
    {
        /// <summary>
        /// Number of embeddings on each leaf node. The default value is 1000 if not set.
        /// </summary>
        public readonly string? LeafNodeEmbeddingCount;

        [OutputConstructor]
        private AiFeatureOnlineStoreFeatureviewVectorSearchConfigTreeAhConfig(string? leafNodeEmbeddingCount)
        {
            LeafNodeEmbeddingCount = leafNodeEmbeddingCount;
        }
    }
}
