// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Datastream.Outputs
{

    [OutputType]
    public sealed class StreamBackfillAllMysqlExcludedObjectsMysqlDatabaseMysqlTableMysqlColumn
    {
        /// <summary>
        /// Column collation.
        /// </summary>
        public readonly string? Collation;
        /// <summary>
        /// Column name.
        /// </summary>
        public readonly string? Column;
        /// <summary>
        /// The MySQL data type. Full data types list can be found here:
        /// https://dev.mysql.com/doc/refman/8.0/en/data-types.html
        /// </summary>
        public readonly string? DataType;
        /// <summary>
        /// Column length.
        /// </summary>
        public readonly int? Length;
        /// <summary>
        /// Whether or not the column can accept a null value.
        /// </summary>
        public readonly bool? Nullable;
        /// <summary>
        /// The ordinal position of the column in the table.
        /// </summary>
        public readonly int? OrdinalPosition;
        /// <summary>
        /// Whether or not the column represents a primary key.
        /// </summary>
        public readonly bool? PrimaryKey;

        [OutputConstructor]
        private StreamBackfillAllMysqlExcludedObjectsMysqlDatabaseMysqlTableMysqlColumn(
            string? collation,

            string? column,

            string? dataType,

            int? length,

            bool? nullable,

            int? ordinalPosition,

            bool? primaryKey)
        {
            Collation = collation;
            Column = column;
            DataType = dataType;
            Length = length;
            Nullable = nullable;
            OrdinalPosition = ordinalPosition;
            PrimaryKey = primaryKey;
        }
    }
}