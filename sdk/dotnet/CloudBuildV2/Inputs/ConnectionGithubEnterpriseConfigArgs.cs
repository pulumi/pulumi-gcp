// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CloudBuildV2.Inputs
{

    public sealed class ConnectionGithubEnterpriseConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Id of the GitHub App created from the manifest.
        /// </summary>
        [Input("appId")]
        public Input<int>? AppId { get; set; }

        /// <summary>
        /// ID of the installation of the GitHub App.
        /// </summary>
        [Input("appInstallationId")]
        public Input<int>? AppInstallationId { get; set; }

        /// <summary>
        /// The URL-friendly name of the GitHub App.
        /// </summary>
        [Input("appSlug")]
        public Input<string>? AppSlug { get; set; }

        /// <summary>
        /// Required. The URI of the GitHub Enterprise host this connection is for.
        /// </summary>
        [Input("hostUri", required: true)]
        public Input<string> HostUri { get; set; } = null!;

        /// <summary>
        /// SecretManager resource containing the private key of the GitHub App, formatted as `projects/*/secrets/*/versions/*`.
        /// </summary>
        [Input("privateKeySecretVersion")]
        public Input<string>? PrivateKeySecretVersion { get; set; }

        /// <summary>
        /// Configuration for using Service Directory to privately connect to a GitHub Enterprise server. This should only be set if the GitHub Enterprise server is hosted on-premises and not reachable by public internet. If this field is left empty, calls to the GitHub Enterprise server will be made over the public internet.
        /// </summary>
        [Input("serviceDirectoryConfig")]
        public Input<Inputs.ConnectionGithubEnterpriseConfigServiceDirectoryConfigArgs>? ServiceDirectoryConfig { get; set; }

        /// <summary>
        /// SSL certificate to use for requests to GitHub Enterprise.
        /// </summary>
        [Input("sslCa")]
        public Input<string>? SslCa { get; set; }

        /// <summary>
        /// SecretManager resource containing the webhook secret of the GitHub App, formatted as `projects/*/secrets/*/versions/*`.
        /// </summary>
        [Input("webhookSecretSecretVersion")]
        public Input<string>? WebhookSecretSecretVersion { get; set; }

        public ConnectionGithubEnterpriseConfigArgs()
        {
        }
        public static new ConnectionGithubEnterpriseConfigArgs Empty => new ConnectionGithubEnterpriseConfigArgs();
    }
}