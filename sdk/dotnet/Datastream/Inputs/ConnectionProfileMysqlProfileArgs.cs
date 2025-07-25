// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Datastream.Inputs
{

    public sealed class ConnectionProfileMysqlProfileArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Hostname for the MySQL connection.
        /// </summary>
        [Input("hostname", required: true)]
        public Input<string> Hostname { get; set; } = null!;

        [Input("password")]
        private Input<string>? _password;

        /// <summary>
        /// Password for the MySQL connection.
        /// **Note**: This property is sensitive and will not be displayed in the plan.
        /// </summary>
        public Input<string>? Password
        {
            get => _password;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _password = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Port for the MySQL connection.
        /// </summary>
        [Input("port")]
        public Input<int>? Port { get; set; }

        /// <summary>
        /// A reference to a Secret Manager resource name storing the user's password.
        /// </summary>
        [Input("secretManagerStoredPassword")]
        public Input<string>? SecretManagerStoredPassword { get; set; }

        /// <summary>
        /// SSL configuration for the MySQL connection.
        /// Structure is documented below.
        /// </summary>
        [Input("sslConfig")]
        public Input<Inputs.ConnectionProfileMysqlProfileSslConfigArgs>? SslConfig { get; set; }

        /// <summary>
        /// Username for the MySQL connection.
        /// </summary>
        [Input("username", required: true)]
        public Input<string> Username { get; set; } = null!;

        public ConnectionProfileMysqlProfileArgs()
        {
        }
        public static new ConnectionProfileMysqlProfileArgs Empty => new ConnectionProfileMysqlProfileArgs();
    }
}
