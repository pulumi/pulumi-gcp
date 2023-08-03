// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CloudBuildV2.Outputs
{

    [OutputType]
    public sealed class ConnectionGitlabConfigReadAuthorizerCredential
    {
        /// <summary>
        /// Required. A SecretManager resource containing the user token that authorizes the Cloud Build connection. Format: `projects/*/secrets/*/versions/*`.
        /// </summary>
        public readonly string UserTokenSecretVersion;
        /// <summary>
        /// Output only. The username associated to this token.
        /// 
        /// - - -
        /// </summary>
        public readonly string? Username;

        [OutputConstructor]
        private ConnectionGitlabConfigReadAuthorizerCredential(
            string userTokenSecretVersion,

            string? username)
        {
            UserTokenSecretVersion = userTokenSecretVersion;
            Username = username;
        }
    }
}