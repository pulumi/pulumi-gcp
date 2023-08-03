// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CloudBuildV2.Inputs
{

    public sealed class ConnectionGitlabConfigAuthorizerCredentialArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Required. A SecretManager resource containing the user token that authorizes the Cloud Build connection. Format: `projects/*/secrets/*/versions/*`.
        /// </summary>
        [Input("userTokenSecretVersion", required: true)]
        public Input<string> UserTokenSecretVersion { get; set; } = null!;

        /// <summary>
        /// Output only. The username associated to this token.
        /// </summary>
        [Input("username")]
        public Input<string>? Username { get; set; }

        public ConnectionGitlabConfigAuthorizerCredentialArgs()
        {
        }
        public static new ConnectionGitlabConfigAuthorizerCredentialArgs Empty => new ConnectionGitlabConfigAuthorizerCredentialArgs();
    }
}