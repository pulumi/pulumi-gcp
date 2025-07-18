// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CloudBuildV2.Outputs
{

    [OutputType]
    public sealed class ConnectionBitbucketCloudConfig
    {
        /// <summary>
        /// Required. An access token with the `webhook`, `repository`, `repository:admin` and `pullrequest` scope access. It can be either a workspace, project or repository access token. It's recommended to use a system account to generate these credentials.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.ConnectionBitbucketCloudConfigAuthorizerCredential AuthorizerCredential;
        /// <summary>
        /// Required. An access token with the `repository` access. It can be either a workspace, project or repository access token. It's recommended to use a system account to generate the credentials.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.ConnectionBitbucketCloudConfigReadAuthorizerCredential ReadAuthorizerCredential;
        /// <summary>
        /// Required. Immutable. SecretManager resource containing the webhook secret used to verify webhook events, formatted as `projects/*/secrets/*/versions/*`.
        /// </summary>
        public readonly string WebhookSecretSecretVersion;
        /// <summary>
        /// The Bitbucket Cloud Workspace ID to be connected to Google Cloud Platform.
        /// </summary>
        public readonly string Workspace;

        [OutputConstructor]
        private ConnectionBitbucketCloudConfig(
            Outputs.ConnectionBitbucketCloudConfigAuthorizerCredential authorizerCredential,

            Outputs.ConnectionBitbucketCloudConfigReadAuthorizerCredential readAuthorizerCredential,

            string webhookSecretSecretVersion,

            string workspace)
        {
            AuthorizerCredential = authorizerCredential;
            ReadAuthorizerCredential = readAuthorizerCredential;
            WebhookSecretSecretVersion = webhookSecretSecretVersion;
            Workspace = workspace;
        }
    }
}
