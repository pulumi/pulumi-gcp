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
    public sealed class GetTableTableConstraintResult
    {
        /// <summary>
        /// Present only if the table has a foreign key. The foreign key is not enforced.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetTableTableConstraintForeignKeyResult> ForeignKeys;
        /// <summary>
        /// Represents a primary key constraint on a table's columns. Present only if the table has a primary key. The primary key is not enforced.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetTableTableConstraintPrimaryKeyResult> PrimaryKeys;

        [OutputConstructor]
        private GetTableTableConstraintResult(
            ImmutableArray<Outputs.GetTableTableConstraintForeignKeyResult> foreignKeys,

            ImmutableArray<Outputs.GetTableTableConstraintPrimaryKeyResult> primaryKeys)
        {
            ForeignKeys = foreignKeys;
            PrimaryKeys = primaryKeys;
        }
    }
}
