// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DataPlex.Outputs
{

    [OutputType]
    public sealed class AssetResourceSpec
    {
        /// <summary>
        /// Immutable. Relative name of the cloud resource that contains the data that is being managed within a lake. For example: `projects/{project_number}/buckets/{bucket_id}` `projects/{project_number}/datasets/{dataset_id}`
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// Optional. Determines how read permissions are handled for each asset and their associated tables. Only available to storage buckets assets. Possible values: DIRECT, MANAGED
        /// </summary>
        public readonly string? ReadAccessMode;
        /// <summary>
        /// Required. Immutable. Type of resource. Possible values: STORAGE_BUCKET, BIGQUERY_DATASET
        /// 
        /// - - -
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private AssetResourceSpec(
            string? name,

            string? readAccessMode,

            string type)
        {
            Name = name;
            ReadAccessMode = readAccessMode;
            Type = type;
        }
    }
}
