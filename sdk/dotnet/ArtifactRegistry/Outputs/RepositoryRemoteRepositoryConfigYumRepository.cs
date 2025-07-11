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
    public sealed class RepositoryRemoteRepositoryConfigYumRepository
    {
        /// <summary>
        /// One of the publicly available Yum repositories supported by Artifact Registry.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.RepositoryRemoteRepositoryConfigYumRepositoryPublicRepository? PublicRepository;

        [OutputConstructor]
        private RepositoryRemoteRepositoryConfigYumRepository(Outputs.RepositoryRemoteRepositoryConfigYumRepositoryPublicRepository? publicRepository)
        {
            PublicRepository = publicRepository;
        }
    }
}
