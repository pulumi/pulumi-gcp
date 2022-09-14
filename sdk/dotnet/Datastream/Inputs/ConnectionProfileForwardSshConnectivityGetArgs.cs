// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Datastream.Inputs
{

    public sealed class ConnectionProfileForwardSshConnectivityGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Hostname for the SSH tunnel.
        /// </summary>
        [Input("hostname", required: true)]
        public Input<string> Hostname { get; set; } = null!;

        /// <summary>
        /// SSH password.
        /// **Note**: This property is sensitive and will not be displayed in the plan.
        /// </summary>
        [Input("password")]
        public Input<string>? Password { get; set; }

        /// <summary>
        /// Port for the SSH tunnel.
        /// </summary>
        [Input("port")]
        public Input<int>? Port { get; set; }

        /// <summary>
        /// SSH private key.
        /// **Note**: This property is sensitive and will not be displayed in the plan.
        /// </summary>
        [Input("privateKey")]
        public Input<string>? PrivateKey { get; set; }

        /// <summary>
        /// Username for the SSH tunnel.
        /// </summary>
        [Input("username", required: true)]
        public Input<string> Username { get; set; } = null!;

        public ConnectionProfileForwardSshConnectivityGetArgs()
        {
        }
        public static new ConnectionProfileForwardSshConnectivityGetArgs Empty => new ConnectionProfileForwardSshConnectivityGetArgs();
    }
}