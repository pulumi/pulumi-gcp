// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.ArtifactRegistry.Inputs
{

    public sealed class RepositoryRemoteRepositoryConfigUpstreamCredentialsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Use username and password to access the remote repository.
        /// Structure is documented below.
        /// </summary>
        [Input("usernamePasswordCredentials")]
        public Input<Inputs.RepositoryRemoteRepositoryConfigUpstreamCredentialsUsernamePasswordCredentialsArgs>? UsernamePasswordCredentials { get; set; }

        public RepositoryRemoteRepositoryConfigUpstreamCredentialsArgs()
        {
        }
        public static new RepositoryRemoteRepositoryConfigUpstreamCredentialsArgs Empty => new RepositoryRemoteRepositoryConfigUpstreamCredentialsArgs();
    }
}
