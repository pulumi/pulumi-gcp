// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Dataform.Outputs
{

    [OutputType]
    public sealed class RepositoryGitRemoteSettingsSshAuthenticationConfig
    {
        /// <summary>
        /// Content of a public SSH key to verify an identity of a remote Git host.
        /// </summary>
        public readonly string HostPublicKey;
        /// <summary>
        /// The name of the Secret Manager secret version to use as a ssh private key for Git operations. Must be in the format projects/*/secrets/*/versions/*.
        /// </summary>
        public readonly string UserPrivateKeySecretVersion;

        [OutputConstructor]
        private RepositoryGitRemoteSettingsSshAuthenticationConfig(
            string hostPublicKey,

            string userPrivateKeySecretVersion)
        {
            HostPublicKey = hostPublicKey;
            UserPrivateKeySecretVersion = userPrivateKeySecretVersion;
        }
    }
}