// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Logging.Outputs
{

    [OutputType]
    public sealed class LinkedDatasetBigqueryDataset
    {
        /// <summary>
        /// (Output)
        /// Output only. The full resource name of the BigQuery dataset. The DATASET_ID will match the ID
        /// of the link, so the link must match the naming restrictions of BigQuery datasets
        /// (alphanumeric characters and underscores only). The dataset will have a resource path of
        /// "bigquery.googleapis.com/projects/[PROJECT_ID]/datasets/[DATASET_ID]"
        /// </summary>
        public readonly string? DatasetId;

        [OutputConstructor]
        private LinkedDatasetBigqueryDataset(string? datasetId)
        {
            DatasetId = datasetId;
        }
    }
}