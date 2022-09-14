// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Datastream.Outputs
{

    [OutputType]
    public sealed class ConnectionProfileMysqlProfile
    {
        /// <summary>
        /// Hostname for the SSH tunnel.
        /// </summary>
        public readonly string Hostname;
        /// <summary>
        /// SSH password.
        /// **Note**: This property is sensitive and will not be displayed in the plan.
        /// </summary>
        public readonly string Password;
        /// <summary>
        /// Port for the SSH tunnel.
        /// </summary>
        public readonly int? Port;
        /// <summary>
        /// SSL configuration for the MySQL connection.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.ConnectionProfileMysqlProfileSslConfig? SslConfig;
        /// <summary>
        /// Username for the SSH tunnel.
        /// </summary>
        public readonly string Username;

        [OutputConstructor]
        private ConnectionProfileMysqlProfile(
            string hostname,

            string password,

            int? port,

            Outputs.ConnectionProfileMysqlProfileSslConfig? sslConfig,

            string username)
        {
            Hostname = hostname;
            Password = password;
            Port = port;
            SslConfig = sslConfig;
            Username = username;
        }
    }
}