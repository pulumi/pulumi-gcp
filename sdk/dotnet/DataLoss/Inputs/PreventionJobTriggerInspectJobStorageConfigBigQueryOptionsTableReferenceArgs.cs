// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DataLoss.Inputs
{

    public sealed class PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsTableReferenceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The dataset ID of the table.
        /// </summary>
        [Input("datasetId", required: true)]
        public Input<string> DatasetId { get; set; } = null!;

        /// <summary>
        /// The Google Cloud Platform project ID of the project containing the table.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        /// <summary>
        /// The name of the table.
        /// </summary>
        [Input("tableId", required: true)]
        public Input<string> TableId { get; set; } = null!;

        public PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsTableReferenceArgs()
        {
        }
        public static new PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsTableReferenceArgs Empty => new PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsTableReferenceArgs();
    }
}
