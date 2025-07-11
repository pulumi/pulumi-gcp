// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DataLoss.Inputs
{

    public sealed class PreventionJobTriggerInspectJobActionSaveFindingsOutputConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Schema used for writing the findings for Inspect jobs. This field is only used for
        /// Inspect and must be unspecified for Risk jobs. Columns are derived from the Finding
        /// object. If appending to an existing table, any columns from the predefined schema
        /// that are missing will be added. No columns in the existing table will be deleted.
        /// If unspecified, then all available columns will be used for a new table or an (existing)
        /// table with no schema, and no changes will be made to an existing table that has a schema.
        /// Only for use with external storage.
        /// Possible values are: `BASIC_COLUMNS`, `GCS_COLUMNS`, `DATASTORE_COLUMNS`, `BIG_QUERY_COLUMNS`, `ALL_COLUMNS`.
        /// </summary>
        [Input("outputSchema")]
        public Input<string>? OutputSchema { get; set; }

        /// <summary>
        /// Information on the location of the target BigQuery Table.
        /// Structure is documented below.
        /// </summary>
        [Input("table", required: true)]
        public Input<Inputs.PreventionJobTriggerInspectJobActionSaveFindingsOutputConfigTableGetArgs> Table { get; set; } = null!;

        public PreventionJobTriggerInspectJobActionSaveFindingsOutputConfigGetArgs()
        {
        }
        public static new PreventionJobTriggerInspectJobActionSaveFindingsOutputConfigGetArgs Empty => new PreventionJobTriggerInspectJobActionSaveFindingsOutputConfigGetArgs();
    }
}
