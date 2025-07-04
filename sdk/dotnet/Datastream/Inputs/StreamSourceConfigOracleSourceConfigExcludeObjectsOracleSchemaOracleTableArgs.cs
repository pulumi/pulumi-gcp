// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Datastream.Inputs
{

    public sealed class StreamSourceConfigOracleSourceConfigExcludeObjectsOracleSchemaOracleTableArgs : global::Pulumi.ResourceArgs
    {
        [Input("oracleColumns")]
        private InputList<Inputs.StreamSourceConfigOracleSourceConfigExcludeObjectsOracleSchemaOracleTableOracleColumnArgs>? _oracleColumns;

        /// <summary>
        /// Oracle columns in the schema. When unspecified as part of include/exclude objects, includes/excludes everything.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.StreamSourceConfigOracleSourceConfigExcludeObjectsOracleSchemaOracleTableOracleColumnArgs> OracleColumns
        {
            get => _oracleColumns ?? (_oracleColumns = new InputList<Inputs.StreamSourceConfigOracleSourceConfigExcludeObjectsOracleSchemaOracleTableOracleColumnArgs>());
            set => _oracleColumns = value;
        }

        /// <summary>
        /// Table name.
        /// </summary>
        [Input("table", required: true)]
        public Input<string> Table { get; set; } = null!;

        public StreamSourceConfigOracleSourceConfigExcludeObjectsOracleSchemaOracleTableArgs()
        {
        }
        public static new StreamSourceConfigOracleSourceConfigExcludeObjectsOracleSchemaOracleTableArgs Empty => new StreamSourceConfigOracleSourceConfigExcludeObjectsOracleSchemaOracleTableArgs();
    }
}
