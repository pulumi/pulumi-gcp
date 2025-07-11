// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Dataform.Outputs
{

    [OutputType]
    public sealed class RepositoryReleaseConfigCodeCompilationConfig
    {
        /// <summary>
        /// Optional. The default schema (BigQuery dataset ID) for assertions.
        /// </summary>
        public readonly string? AssertionSchema;
        /// <summary>
        /// Optional. The suffix that should be appended to all database (Google Cloud project ID) names.
        /// </summary>
        public readonly string? DatabaseSuffix;
        /// <summary>
        /// Optional. The default database (Google Cloud project ID).
        /// </summary>
        public readonly string? DefaultDatabase;
        /// <summary>
        /// Optional. The default BigQuery location to use. Defaults to "US".
        /// See the BigQuery docs for a full list of locations: https://cloud.google.com/bigquery/docs/locations.
        /// </summary>
        public readonly string? DefaultLocation;
        /// <summary>
        /// Optional. The default schema (BigQuery dataset ID).
        /// </summary>
        public readonly string? DefaultSchema;
        /// <summary>
        /// Optional. The suffix that should be appended to all schema (BigQuery dataset ID) names.
        /// </summary>
        public readonly string? SchemaSuffix;
        /// <summary>
        /// Optional. The prefix that should be prepended to all table names.
        /// </summary>
        public readonly string? TablePrefix;
        /// <summary>
        /// Optional. User-defined variables that are made available to project code during compilation.
        /// An object containing a list of "key": value pairs.
        /// Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
        /// </summary>
        public readonly ImmutableDictionary<string, string>? Vars;

        [OutputConstructor]
        private RepositoryReleaseConfigCodeCompilationConfig(
            string? assertionSchema,

            string? databaseSuffix,

            string? defaultDatabase,

            string? defaultLocation,

            string? defaultSchema,

            string? schemaSuffix,

            string? tablePrefix,

            ImmutableDictionary<string, string>? vars)
        {
            AssertionSchema = assertionSchema;
            DatabaseSuffix = databaseSuffix;
            DefaultDatabase = defaultDatabase;
            DefaultLocation = defaultLocation;
            DefaultSchema = defaultSchema;
            SchemaSuffix = schemaSuffix;
            TablePrefix = tablePrefix;
            Vars = vars;
        }
    }
}
