// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.IntegrationConnectors.Inputs
{

    public sealed class ConnectionAuthConfigSshPublicKeySshClientCertArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The resource name of the secret version in the format,
        /// format as: projects/*/secrets/*/versions/*.
        /// </summary>
        [Input("secretVersion", required: true)]
        public Input<string> SecretVersion { get; set; } = null!;

        public ConnectionAuthConfigSshPublicKeySshClientCertArgs()
        {
        }
        public static new ConnectionAuthConfigSshPublicKeySshClientCertArgs Empty => new ConnectionAuthConfigSshPublicKeySshClientCertArgs();
    }
}
