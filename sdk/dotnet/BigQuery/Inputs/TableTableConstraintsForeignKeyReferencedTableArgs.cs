// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.BigQuery.Inputs
{

    public sealed class TableTableConstraintsForeignKeyReferencedTableArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the dataset containing this table.
        /// </summary>
        [Input("datasetId", required: true)]
        public Input<string> DatasetId { get; set; } = null!;

        /// <summary>
        /// The ID of the project containing this table.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        /// <summary>
        /// The ID of the table. The ID must contain only
        /// letters (a-z, A-Z), numbers (0-9), or underscores (_). The maximum
        /// length is 1,024 characters. Certain operations allow suffixing of
        /// the table ID with a partition decorator, such as
        /// sample_table$20190123.
        /// </summary>
        [Input("tableId", required: true)]
        public Input<string> TableId { get; set; } = null!;

        public TableTableConstraintsForeignKeyReferencedTableArgs()
        {
        }
        public static new TableTableConstraintsForeignKeyReferencedTableArgs Empty => new TableTableConstraintsForeignKeyReferencedTableArgs();
    }
}