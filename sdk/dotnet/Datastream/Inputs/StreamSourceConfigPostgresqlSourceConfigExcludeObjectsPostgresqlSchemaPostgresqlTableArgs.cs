// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Datastream.Inputs
{

    public sealed class StreamSourceConfigPostgresqlSourceConfigExcludeObjectsPostgresqlSchemaPostgresqlTableArgs : global::Pulumi.ResourceArgs
    {
        [Input("postgresqlColumns")]
        private InputList<Inputs.StreamSourceConfigPostgresqlSourceConfigExcludeObjectsPostgresqlSchemaPostgresqlTablePostgresqlColumnArgs>? _postgresqlColumns;

        /// <summary>
        /// PostgreSQL columns in the schema. When unspecified as part of include/exclude objects, includes/excludes everything.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.StreamSourceConfigPostgresqlSourceConfigExcludeObjectsPostgresqlSchemaPostgresqlTablePostgresqlColumnArgs> PostgresqlColumns
        {
            get => _postgresqlColumns ?? (_postgresqlColumns = new InputList<Inputs.StreamSourceConfigPostgresqlSourceConfigExcludeObjectsPostgresqlSchemaPostgresqlTablePostgresqlColumnArgs>());
            set => _postgresqlColumns = value;
        }

        /// <summary>
        /// Table name.
        /// </summary>
        [Input("table", required: true)]
        public Input<string> Table { get; set; } = null!;

        public StreamSourceConfigPostgresqlSourceConfigExcludeObjectsPostgresqlSchemaPostgresqlTableArgs()
        {
        }
        public static new StreamSourceConfigPostgresqlSourceConfigExcludeObjectsPostgresqlSchemaPostgresqlTableArgs Empty => new StreamSourceConfigPostgresqlSourceConfigExcludeObjectsPostgresqlSchemaPostgresqlTableArgs();
    }
}
