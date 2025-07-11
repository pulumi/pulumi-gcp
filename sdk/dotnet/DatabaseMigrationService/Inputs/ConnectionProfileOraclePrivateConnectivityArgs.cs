// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DatabaseMigrationService.Inputs
{

    public sealed class ConnectionProfileOraclePrivateConnectivityArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Required. The resource name (URI) of the private connection.
        /// </summary>
        [Input("privateConnection", required: true)]
        public Input<string> PrivateConnection { get; set; } = null!;

        public ConnectionProfileOraclePrivateConnectivityArgs()
        {
        }
        public static new ConnectionProfileOraclePrivateConnectivityArgs Empty => new ConnectionProfileOraclePrivateConnectivityArgs();
    }
}
