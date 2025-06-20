// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Datastream.Inputs
{

    public sealed class StreamBackfillAllGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// MySQL data source objects to avoid backfilling.
        /// Structure is documented below.
        /// </summary>
        [Input("mysqlExcludedObjects")]
        public Input<Inputs.StreamBackfillAllMysqlExcludedObjectsGetArgs>? MysqlExcludedObjects { get; set; }

        /// <summary>
        /// PostgreSQL data source objects to avoid backfilling.
        /// Structure is documented below.
        /// </summary>
        [Input("oracleExcludedObjects")]
        public Input<Inputs.StreamBackfillAllOracleExcludedObjectsGetArgs>? OracleExcludedObjects { get; set; }

        /// <summary>
        /// PostgreSQL data source objects to avoid backfilling.
        /// Structure is documented below.
        /// </summary>
        [Input("postgresqlExcludedObjects")]
        public Input<Inputs.StreamBackfillAllPostgresqlExcludedObjectsGetArgs>? PostgresqlExcludedObjects { get; set; }

        /// <summary>
        /// Salesforce objects to avoid backfilling.
        /// Structure is documented below.
        /// </summary>
        [Input("salesforceExcludedObjects")]
        public Input<Inputs.StreamBackfillAllSalesforceExcludedObjectsGetArgs>? SalesforceExcludedObjects { get; set; }

        /// <summary>
        /// SQL Server data source objects to avoid backfilling.
        /// Structure is documented below.
        /// </summary>
        [Input("sqlServerExcludedObjects")]
        public Input<Inputs.StreamBackfillAllSqlServerExcludedObjectsGetArgs>? SqlServerExcludedObjects { get; set; }

        public StreamBackfillAllGetArgs()
        {
        }
        public static new StreamBackfillAllGetArgs Empty => new StreamBackfillAllGetArgs();
    }
}
