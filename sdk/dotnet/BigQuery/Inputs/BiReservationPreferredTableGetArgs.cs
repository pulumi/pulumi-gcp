// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.BigQuery.Inputs
{

    public sealed class BiReservationPreferredTableGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the dataset in the above project.
        /// </summary>
        [Input("datasetId")]
        public Input<string>? DatasetId { get; set; }

        /// <summary>
        /// The assigned project ID of the project.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// The ID of the table in the above dataset.
        /// </summary>
        [Input("tableId")]
        public Input<string>? TableId { get; set; }

        public BiReservationPreferredTableGetArgs()
        {
        }
        public static new BiReservationPreferredTableGetArgs Empty => new BiReservationPreferredTableGetArgs();
    }
}
