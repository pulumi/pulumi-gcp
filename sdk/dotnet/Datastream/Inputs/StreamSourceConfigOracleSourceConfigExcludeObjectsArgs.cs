// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Datastream.Inputs
{

    public sealed class StreamSourceConfigOracleSourceConfigExcludeObjectsArgs : global::Pulumi.ResourceArgs
    {
        [Input("oracleSchemas", required: true)]
        private InputList<Inputs.StreamSourceConfigOracleSourceConfigExcludeObjectsOracleSchemaArgs>? _oracleSchemas;

        /// <summary>
        /// Oracle schemas/databases in the database server
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.StreamSourceConfigOracleSourceConfigExcludeObjectsOracleSchemaArgs> OracleSchemas
        {
            get => _oracleSchemas ?? (_oracleSchemas = new InputList<Inputs.StreamSourceConfigOracleSourceConfigExcludeObjectsOracleSchemaArgs>());
            set => _oracleSchemas = value;
        }

        public StreamSourceConfigOracleSourceConfigExcludeObjectsArgs()
        {
        }
        public static new StreamSourceConfigOracleSourceConfigExcludeObjectsArgs Empty => new StreamSourceConfigOracleSourceConfigExcludeObjectsArgs();
    }
}