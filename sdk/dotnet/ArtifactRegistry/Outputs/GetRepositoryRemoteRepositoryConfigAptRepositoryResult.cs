// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.ArtifactRegistry.Outputs
{

    [OutputType]
    public sealed class GetRepositoryRemoteRepositoryConfigAptRepositoryResult
    {
        /// <summary>
        /// One of the publicly available Apt repositories supported by Artifact Registry.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetRepositoryRemoteRepositoryConfigAptRepositoryPublicRepositoryResult> PublicRepositories;

        [OutputConstructor]
        private GetRepositoryRemoteRepositoryConfigAptRepositoryResult(ImmutableArray<Outputs.GetRepositoryRemoteRepositoryConfigAptRepositoryPublicRepositoryResult> publicRepositories)
        {
            PublicRepositories = publicRepositories;
        }
    }
}
