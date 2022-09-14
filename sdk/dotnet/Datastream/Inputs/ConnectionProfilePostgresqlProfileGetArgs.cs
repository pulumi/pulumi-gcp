// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Datastream.Inputs
{

    public sealed class ConnectionProfilePostgresqlProfileGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Database for the PostgreSQL connection.
        /// </summary>
        [Input("database", required: true)]
        public Input<string> Database { get; set; } = null!;

        /// <summary>
        /// Hostname for the SSH tunnel.
        /// </summary>
        [Input("hostname", required: true)]
        public Input<string> Hostname { get; set; } = null!;

        /// <summary>
        /// SSH password.
        /// **Note**: This property is sensitive and will not be displayed in the plan.
        /// </summary>
        [Input("password", required: true)]
        public Input<string> Password { get; set; } = null!;

        /// <summary>
        /// Port for the SSH tunnel.
        /// </summary>
        [Input("port")]
        public Input<int>? Port { get; set; }

        /// <summary>
        /// Username for the SSH tunnel.
        /// </summary>
        [Input("username", required: true)]
        public Input<string> Username { get; set; } = null!;

        public ConnectionProfilePostgresqlProfileGetArgs()
        {
        }
        public static new ConnectionProfilePostgresqlProfileGetArgs Empty => new ConnectionProfilePostgresqlProfileGetArgs();
    }
}