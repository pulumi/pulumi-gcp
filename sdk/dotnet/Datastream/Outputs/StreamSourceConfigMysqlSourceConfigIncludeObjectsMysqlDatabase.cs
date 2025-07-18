// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Datastream.Outputs
{

    [OutputType]
    public sealed class StreamSourceConfigMysqlSourceConfigIncludeObjectsMysqlDatabase
    {
        /// <summary>
        /// Database name.
        /// </summary>
        public readonly string Database;
        /// <summary>
        /// Tables in the database.
        /// Structure is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.StreamSourceConfigMysqlSourceConfigIncludeObjectsMysqlDatabaseMysqlTable> MysqlTables;

        [OutputConstructor]
        private StreamSourceConfigMysqlSourceConfigIncludeObjectsMysqlDatabase(
            string database,

            ImmutableArray<Outputs.StreamSourceConfigMysqlSourceConfigIncludeObjectsMysqlDatabaseMysqlTable> mysqlTables)
        {
            Database = database;
            MysqlTables = mysqlTables;
        }
    }
}
