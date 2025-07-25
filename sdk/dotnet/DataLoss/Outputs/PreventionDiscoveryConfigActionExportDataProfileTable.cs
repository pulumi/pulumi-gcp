// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DataLoss.Outputs
{

    [OutputType]
    public sealed class PreventionDiscoveryConfigActionExportDataProfileTable
    {
        /// <summary>
        /// Dataset Id of the table
        /// </summary>
        public readonly string? DatasetId;
        /// <summary>
        /// The Google Cloud Platform project ID of the project containing the table. If omitted, the project ID is inferred from the API call.
        /// </summary>
        public readonly string? ProjectId;
        /// <summary>
        /// Name of the table
        /// </summary>
        public readonly string? TableId;

        [OutputConstructor]
        private PreventionDiscoveryConfigActionExportDataProfileTable(
            string? datasetId,

            string? projectId,

            string? tableId)
        {
            DatasetId = datasetId;
            ProjectId = projectId;
            TableId = tableId;
        }
    }
}
