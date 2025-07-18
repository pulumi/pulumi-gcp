// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Datastream.Inputs
{

    public sealed class StreamSourceConfigSqlServerSourceConfigExcludeObjectsSchemaTableGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("columns")]
        private InputList<Inputs.StreamSourceConfigSqlServerSourceConfigExcludeObjectsSchemaTableColumnGetArgs>? _columns;

        /// <summary>
        /// SQL Server columns in the schema. When unspecified as part of include/exclude objects, includes/excludes everything.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.StreamSourceConfigSqlServerSourceConfigExcludeObjectsSchemaTableColumnGetArgs> Columns
        {
            get => _columns ?? (_columns = new InputList<Inputs.StreamSourceConfigSqlServerSourceConfigExcludeObjectsSchemaTableColumnGetArgs>());
            set => _columns = value;
        }

        /// <summary>
        /// Table name.
        /// </summary>
        [Input("table", required: true)]
        public Input<string> Table { get; set; } = null!;

        public StreamSourceConfigSqlServerSourceConfigExcludeObjectsSchemaTableGetArgs()
        {
        }
        public static new StreamSourceConfigSqlServerSourceConfigExcludeObjectsSchemaTableGetArgs Empty => new StreamSourceConfigSqlServerSourceConfigExcludeObjectsSchemaTableGetArgs();
    }
}
