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
    public sealed class JobCopy
    {
        /// <summary>
        /// Specifies whether the job is allowed to create new tables. The following values are supported:
        /// CREATE_IF_NEEDED: If the table does not exist, BigQuery creates the table.
        /// CREATE_NEVER: The table must already exist. If it does not, a 'notFound' error is returned in the job result.
        /// Creation, truncation and append actions occur as one atomic update upon job completion
        /// Default value is `CREATE_IF_NEEDED`.
        /// Possible values are: `CREATE_IF_NEEDED`, `CREATE_NEVER`.
        /// </summary>
        public readonly string? CreateDisposition;
        /// <summary>
        /// Custom encryption configuration (e.g., Cloud KMS keys)
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.JobCopyDestinationEncryptionConfiguration? DestinationEncryptionConfiguration;
        /// <summary>
        /// The destination table.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.JobCopyDestinationTable? DestinationTable;
        /// <summary>
        /// Source tables to copy.
        /// Structure is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.JobCopySourceTable> SourceTables;
        /// <summary>
        /// Specifies the action that occurs if the destination table already exists. The following values are supported:
        /// WRITE_TRUNCATE: If the table already exists, BigQuery overwrites the table data and uses the schema from the query result.
        /// WRITE_APPEND: If the table already exists, BigQuery appends the data to the table.
        /// WRITE_EMPTY: If the table already exists and contains data, a 'duplicate' error is returned in the job result.
        /// Each action is atomic and only occurs if BigQuery is able to complete the job successfully.
        /// Creation, truncation and append actions occur as one atomic update upon job completion.
        /// Default value is `WRITE_EMPTY`.
        /// Possible values are: `WRITE_TRUNCATE`, `WRITE_APPEND`, `WRITE_EMPTY`.
        /// </summary>
        public readonly string? WriteDisposition;

        [OutputConstructor]
        private JobCopy(
            string? createDisposition,

            Outputs.JobCopyDestinationEncryptionConfiguration? destinationEncryptionConfiguration,

            Outputs.JobCopyDestinationTable? destinationTable,

            ImmutableArray<Outputs.JobCopySourceTable> sourceTables,

            string? writeDisposition)
        {
            CreateDisposition = createDisposition;
            DestinationEncryptionConfiguration = destinationEncryptionConfiguration;
            DestinationTable = destinationTable;
            SourceTables = sourceTables;
            WriteDisposition = writeDisposition;
        }
    }
}
