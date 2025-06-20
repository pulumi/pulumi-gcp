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
    public sealed class AiFeatureOnlineStoreFeatureviewVectorSearchConfig
    {
        /// <summary>
        /// Configuration options for using brute force search, which simply implements the standard linear search in the database for each query. It is primarily meant for benchmarking and to generate the ground truth for approximate search.
        /// </summary>
        public readonly Outputs.AiFeatureOnlineStoreFeatureviewVectorSearchConfigBruteForceConfig? BruteForceConfig;
        /// <summary>
        /// Column of crowding. This column contains crowding attribute which is a constraint on a neighbor list produced by nearest neighbor search requiring that no more than some value k' of the k neighbors returned have the same value of crowdingAttribute.
        /// </summary>
        public readonly string? CrowdingColumn;
        /// <summary>
        /// The distance measure used in nearest neighbor search.
        /// For details on allowed values, see the [API documentation](https://cloud.google.com/vertex-ai/docs/reference/rest/v1beta1/projects.locations.featureOnlineStores.featureViews#DistanceMeasureType).
        /// Possible values are: `SQUARED_L2_DISTANCE`, `COSINE_DISTANCE`, `DOT_PRODUCT_DISTANCE`.
        /// </summary>
        public readonly string? DistanceMeasureType;
        /// <summary>
        /// Column of embedding. This column contains the source data to create index for vector search.
        /// </summary>
        public readonly string EmbeddingColumn;
        /// <summary>
        /// The number of dimensions of the input embedding.
        /// </summary>
        public readonly int? EmbeddingDimension;
        /// <summary>
        /// Columns of features that are used to filter vector search results.
        /// </summary>
        public readonly ImmutableArray<string> FilterColumns;
        /// <summary>
        /// Configuration options for the tree-AH algorithm (Shallow tree + Asymmetric Hashing). Please refer to this paper for more details: https://arxiv.org/abs/1908.10396
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.AiFeatureOnlineStoreFeatureviewVectorSearchConfigTreeAhConfig? TreeAhConfig;

        [OutputConstructor]
        private AiFeatureOnlineStoreFeatureviewVectorSearchConfig(
            Outputs.AiFeatureOnlineStoreFeatureviewVectorSearchConfigBruteForceConfig? bruteForceConfig,

            string? crowdingColumn,

            string? distanceMeasureType,

            string embeddingColumn,

            int? embeddingDimension,

            ImmutableArray<string> filterColumns,

            Outputs.AiFeatureOnlineStoreFeatureviewVectorSearchConfigTreeAhConfig? treeAhConfig)
        {
            BruteForceConfig = bruteForceConfig;
            CrowdingColumn = crowdingColumn;
            DistanceMeasureType = distanceMeasureType;
            EmbeddingColumn = embeddingColumn;
            EmbeddingDimension = embeddingDimension;
            FilterColumns = filterColumns;
            TreeAhConfig = treeAhConfig;
        }
    }
}
