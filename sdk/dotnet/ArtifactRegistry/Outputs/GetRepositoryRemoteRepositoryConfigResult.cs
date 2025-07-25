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
    public sealed class GetRepositoryRemoteRepositoryConfigResult
    {
        /// <summary>
        /// Specific settings for an Apt remote repository.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetRepositoryRemoteRepositoryConfigAptRepositoryResult> AptRepositories;
        /// <summary>
        /// Specific settings for an Artifact Registory remote repository.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetRepositoryRemoteRepositoryConfigCommonRepositoryResult> CommonRepositories;
        /// <summary>
        /// The description of the remote source.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// If true, the remote repository upstream and upstream credentials will
        /// not be validated.
        /// </summary>
        public readonly bool DisableUpstreamValidation;
        /// <summary>
        /// Specific settings for a Docker remote repository.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetRepositoryRemoteRepositoryConfigDockerRepositoryResult> DockerRepositories;
        /// <summary>
        /// Specific settings for a Maven remote repository.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetRepositoryRemoteRepositoryConfigMavenRepositoryResult> MavenRepositories;
        /// <summary>
        /// Specific settings for an Npm remote repository.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetRepositoryRemoteRepositoryConfigNpmRepositoryResult> NpmRepositories;
        /// <summary>
        /// Specific settings for a Python remote repository.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetRepositoryRemoteRepositoryConfigPythonRepositoryResult> PythonRepositories;
        /// <summary>
        /// The credentials used to access the remote repository.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetRepositoryRemoteRepositoryConfigUpstreamCredentialResult> UpstreamCredentials;
        /// <summary>
        /// Specific settings for an Yum remote repository.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetRepositoryRemoteRepositoryConfigYumRepositoryResult> YumRepositories;

        [OutputConstructor]
        private GetRepositoryRemoteRepositoryConfigResult(
            ImmutableArray<Outputs.GetRepositoryRemoteRepositoryConfigAptRepositoryResult> aptRepositories,

            ImmutableArray<Outputs.GetRepositoryRemoteRepositoryConfigCommonRepositoryResult> commonRepositories,

            string description,

            bool disableUpstreamValidation,

            ImmutableArray<Outputs.GetRepositoryRemoteRepositoryConfigDockerRepositoryResult> dockerRepositories,

            ImmutableArray<Outputs.GetRepositoryRemoteRepositoryConfigMavenRepositoryResult> mavenRepositories,

            ImmutableArray<Outputs.GetRepositoryRemoteRepositoryConfigNpmRepositoryResult> npmRepositories,

            ImmutableArray<Outputs.GetRepositoryRemoteRepositoryConfigPythonRepositoryResult> pythonRepositories,

            ImmutableArray<Outputs.GetRepositoryRemoteRepositoryConfigUpstreamCredentialResult> upstreamCredentials,

            ImmutableArray<Outputs.GetRepositoryRemoteRepositoryConfigYumRepositoryResult> yumRepositories)
        {
            AptRepositories = aptRepositories;
            CommonRepositories = commonRepositories;
            Description = description;
            DisableUpstreamValidation = disableUpstreamValidation;
            DockerRepositories = dockerRepositories;
            MavenRepositories = mavenRepositories;
            NpmRepositories = npmRepositories;
            PythonRepositories = pythonRepositories;
            UpstreamCredentials = upstreamCredentials;
            YumRepositories = yumRepositories;
        }
    }
}
