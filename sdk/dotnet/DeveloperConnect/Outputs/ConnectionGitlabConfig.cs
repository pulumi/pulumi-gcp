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
    public sealed class ConnectionGitlabConfig
    {
        /// <summary>
        /// Represents a personal access token that authorized the Connection,
        /// and associated metadata.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.ConnectionGitlabConfigAuthorizerCredential AuthorizerCredential;
        /// <summary>
        /// Represents a personal access token that authorized the Connection,
        /// and associated metadata.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.ConnectionGitlabConfigReadAuthorizerCredential ReadAuthorizerCredential;
        /// <summary>
        /// Required. Immutable. SecretManager resource containing the webhook secret of a GitLab project,
        /// formatted as `projects/*/secrets/*/versions/*`. This is used to validate
        /// webhooks.
        /// </summary>
        public readonly string WebhookSecretSecretVersion;

        [OutputConstructor]
        private ConnectionGitlabConfig(
            Outputs.ConnectionGitlabConfigAuthorizerCredential authorizerCredential,

            Outputs.ConnectionGitlabConfigReadAuthorizerCredential readAuthorizerCredential,

            string webhookSecretSecretVersion)
        {
            AuthorizerCredential = authorizerCredential;
            ReadAuthorizerCredential = readAuthorizerCredential;
            WebhookSecretSecretVersion = webhookSecretSecretVersion;
        }
    }
}
