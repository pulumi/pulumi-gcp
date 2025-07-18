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
    public sealed class TableTableConstraintsPrimaryKey
    {
        /// <summary>
        /// The columns that are composed of the primary key constraint.
        /// </summary>
        public readonly ImmutableArray<string> Columns;

        [OutputConstructor]
        private TableTableConstraintsPrimaryKey(ImmutableArray<string> columns)
        {
            Columns = columns;
        }
    }
}
