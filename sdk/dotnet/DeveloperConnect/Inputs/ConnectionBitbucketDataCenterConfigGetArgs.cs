// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DeveloperConnect.Inputs
{

    public sealed class ConnectionBitbucketDataCenterConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Represents a personal access token that authorized the Connection,
        /// and associated metadata.
        /// Structure is documented below.
        /// </summary>
        [Input("authorizerCredential", required: true)]
        public Input<Inputs.ConnectionBitbucketDataCenterConfigAuthorizerCredentialGetArgs> AuthorizerCredential { get; set; } = null!;

        /// <summary>
        /// Required. The URI of the Bitbucket Data Center host this connection is for.
        /// </summary>
        [Input("hostUri", required: true)]
        public Input<string> HostUri { get; set; } = null!;

        /// <summary>
        /// Represents a personal access token that authorized the Connection,
        /// and associated metadata.
        /// Structure is documented below.
        /// </summary>
        [Input("readAuthorizerCredential", required: true)]
        public Input<Inputs.ConnectionBitbucketDataCenterConfigReadAuthorizerCredentialGetArgs> ReadAuthorizerCredential { get; set; } = null!;

        /// <summary>
        /// (Output)
        /// Output only. Version of the Bitbucket Data Center server running on the `host_uri`.
        /// </summary>
        [Input("serverVersion")]
        public Input<string>? ServerVersion { get; set; }

        /// <summary>
        /// ServiceDirectoryConfig represents Service Directory configuration for a
        /// connection.
        /// Structure is documented below.
        /// </summary>
        [Input("serviceDirectoryConfig")]
        public Input<Inputs.ConnectionBitbucketDataCenterConfigServiceDirectoryConfigGetArgs>? ServiceDirectoryConfig { get; set; }

        /// <summary>
        /// Optional. SSL certificate authority to trust when making requests to Bitbucket Data
        /// Center.
        /// </summary>
        [Input("sslCaCertificate")]
        public Input<string>? SslCaCertificate { get; set; }

        /// <summary>
        /// Required. Immutable. SecretManager resource containing the webhook secret used to verify webhook
        /// events, formatted as `projects/*/secrets/*/versions/*`. This is used to
        /// validate webhooks.
        /// </summary>
        [Input("webhookSecretSecretVersion", required: true)]
        public Input<string> WebhookSecretSecretVersion { get; set; } = null!;

        public ConnectionBitbucketDataCenterConfigGetArgs()
        {
        }
        public static new ConnectionBitbucketDataCenterConfigGetArgs Empty => new ConnectionBitbucketDataCenterConfigGetArgs();
    }
}
