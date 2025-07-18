// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CloudBuildV2.Inputs
{

    public sealed class ConnectionBitbucketCloudConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Required. An access token with the `webhook`, `repository`, `repository:admin` and `pullrequest` scope access. It can be either a workspace, project or repository access token. It's recommended to use a system account to generate these credentials.
        /// Structure is documented below.
        /// </summary>
        [Input("authorizerCredential", required: true)]
        public Input<Inputs.ConnectionBitbucketCloudConfigAuthorizerCredentialArgs> AuthorizerCredential { get; set; } = null!;

        /// <summary>
        /// Required. An access token with the `repository` access. It can be either a workspace, project or repository access token. It's recommended to use a system account to generate the credentials.
        /// Structure is documented below.
        /// </summary>
        [Input("readAuthorizerCredential", required: true)]
        public Input<Inputs.ConnectionBitbucketCloudConfigReadAuthorizerCredentialArgs> ReadAuthorizerCredential { get; set; } = null!;

        /// <summary>
        /// Required. Immutable. SecretManager resource containing the webhook secret used to verify webhook events, formatted as `projects/*/secrets/*/versions/*`.
        /// </summary>
        [Input("webhookSecretSecretVersion", required: true)]
        public Input<string> WebhookSecretSecretVersion { get; set; } = null!;

        /// <summary>
        /// The Bitbucket Cloud Workspace ID to be connected to Google Cloud Platform.
        /// </summary>
        [Input("workspace", required: true)]
        public Input<string> Workspace { get; set; } = null!;

        public ConnectionBitbucketCloudConfigArgs()
        {
        }
        public static new ConnectionBitbucketCloudConfigArgs Empty => new ConnectionBitbucketCloudConfigArgs();
    }
}
