// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Datastream.Inputs
{

    public sealed class StreamSourceConfigMysqlSourceConfigIncludeObjectsGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("mysqlDatabases", required: true)]
        private InputList<Inputs.StreamSourceConfigMysqlSourceConfigIncludeObjectsMysqlDatabaseGetArgs>? _mysqlDatabases;

        /// <summary>
        /// MySQL databases on the server
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.StreamSourceConfigMysqlSourceConfigIncludeObjectsMysqlDatabaseGetArgs> MysqlDatabases
        {
            get => _mysqlDatabases ?? (_mysqlDatabases = new InputList<Inputs.StreamSourceConfigMysqlSourceConfigIncludeObjectsMysqlDatabaseGetArgs>());
            set => _mysqlDatabases = value;
        }

        public StreamSourceConfigMysqlSourceConfigIncludeObjectsGetArgs()
        {
        }
        public static new StreamSourceConfigMysqlSourceConfigIncludeObjectsGetArgs Empty => new StreamSourceConfigMysqlSourceConfigIncludeObjectsGetArgs();
    }
}
