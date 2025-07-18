// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DeveloperConnect.Outputs
{

    [OutputType]
    public sealed class ConnectionBitbucketCloudConfig
    {
        /// <summary>
        /// Represents a personal access token that authorized the Connection,
        /// and associated metadata.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.ConnectionBitbucketCloudConfigAuthorizerCredential AuthorizerCredential;
        /// <summary>
        /// Represents a personal access token that authorized the Connection,
        /// and associated metadata.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.ConnectionBitbucketCloudConfigReadAuthorizerCredential ReadAuthorizerCredential;
        /// <summary>
        /// Required. Immutable. SecretManager resource containing the webhook secret used to verify webhook
        /// events, formatted as `projects/*/secrets/*/versions/*`. This is used to
        /// validate and create webhooks.
        /// </summary>
        public readonly string WebhookSecretSecretVersion;
        /// <summary>
        /// Required. The Bitbucket Cloud Workspace ID to be connected to Google Cloud Platform.
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
