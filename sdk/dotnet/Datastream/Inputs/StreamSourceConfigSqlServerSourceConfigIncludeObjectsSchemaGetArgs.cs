// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Datastream.Inputs
{

    public sealed class StreamSourceConfigSqlServerSourceConfigIncludeObjectsSchemaGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Schema name.
        /// </summary>
        [Input("schema", required: true)]
        public Input<string> Schema { get; set; } = null!;

        [Input("tables")]
        private InputList<Inputs.StreamSourceConfigSqlServerSourceConfigIncludeObjectsSchemaTableGetArgs>? _tables;

        /// <summary>
        /// Tables in the database.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.StreamSourceConfigSqlServerSourceConfigIncludeObjectsSchemaTableGetArgs> Tables
        {
            get => _tables ?? (_tables = new InputList<Inputs.StreamSourceConfigSqlServerSourceConfigIncludeObjectsSchemaTableGetArgs>());
            set => _tables = value;
        }

        public StreamSourceConfigSqlServerSourceConfigIncludeObjectsSchemaGetArgs()
        {
        }
        public static new StreamSourceConfigSqlServerSourceConfigIncludeObjectsSchemaGetArgs Empty => new StreamSourceConfigSqlServerSourceConfigIncludeObjectsSchemaGetArgs();
    }
}
