// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.BigQuery.Outputs
{

    [OutputType]
    public sealed class GetDatasetsDatasetResult
    {
        /// <summary>
        /// The id of the dataset.
        /// </summary>
        public readonly string DatasetId;
        /// <summary>
        /// The friendly name of the dataset.
        /// </summary>
        public readonly string FriendlyName;
        /// <summary>
        /// User-provided dataset labels, in key/value pairs.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Labels;
        /// <summary>
        /// The geographic location of the dataset.
        /// </summary>
        public readonly string Location;

        [OutputConstructor]
        private GetDatasetsDatasetResult(
            string datasetId,

            string friendlyName,

            ImmutableDictionary<string, string> labels,

            string location)
        {
            DatasetId = datasetId;
            FriendlyName = friendlyName;
            Labels = labels;
            Location = location;
        }
    }
}
