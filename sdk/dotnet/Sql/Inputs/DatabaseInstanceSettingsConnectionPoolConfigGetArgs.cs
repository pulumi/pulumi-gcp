// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Sql.Inputs
{

    public sealed class DatabaseInstanceSettingsConnectionPoolConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// True if the manager connection pooling configuration is enabled.
        /// </summary>
        [Input("connectionPoolingEnabled")]
        public Input<bool>? ConnectionPoolingEnabled { get; set; }

        [Input("flags")]
        private InputList<Inputs.DatabaseInstanceSettingsConnectionPoolConfigFlagGetArgs>? _flags;

        /// <summary>
        /// List of connection pool configuration flags
        /// </summary>
        public InputList<Inputs.DatabaseInstanceSettingsConnectionPoolConfigFlagGetArgs> Flags
        {
            get => _flags ?? (_flags = new InputList<Inputs.DatabaseInstanceSettingsConnectionPoolConfigFlagGetArgs>());
            set => _flags = value;
        }

        public DatabaseInstanceSettingsConnectionPoolConfigGetArgs()
        {
        }
        public static new DatabaseInstanceSettingsConnectionPoolConfigGetArgs Empty => new DatabaseInstanceSettingsConnectionPoolConfigGetArgs();
    }
}
