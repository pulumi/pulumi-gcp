// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.ArtifactRegistry.Inputs
{

    public sealed class RepositoryRemoteRepositoryConfigYumRepositoryPublicRepositoryGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A common public repository base for Yum.
        /// Possible values are: `CENTOS`, `CENTOS_DEBUG`, `CENTOS_VAULT`, `CENTOS_STREAM`, `ROCKY`, `EPEL`.
        /// </summary>
        [Input("repositoryBase", required: true)]
        public Input<string> RepositoryBase { get; set; } = null!;

        /// <summary>
        /// Specific repository from the base, e.g. `"pub/rocky/9/BaseOS/x86_64/os"`
        /// </summary>
        [Input("repositoryPath", required: true)]
        public Input<string> RepositoryPath { get; set; } = null!;

        public RepositoryRemoteRepositoryConfigYumRepositoryPublicRepositoryGetArgs()
        {
        }
        public static new RepositoryRemoteRepositoryConfigYumRepositoryPublicRepositoryGetArgs Empty => new RepositoryRemoteRepositoryConfigYumRepositoryPublicRepositoryGetArgs();
    }
}
