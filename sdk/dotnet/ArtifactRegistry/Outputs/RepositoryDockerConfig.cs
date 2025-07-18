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
    public sealed class RepositoryDockerConfig
    {
        /// <summary>
        /// The repository which enabled this flag prevents all tags from being modified, moved or deleted. This does not prevent tags from being created.
        /// </summary>
        public readonly bool? ImmutableTags;

        [OutputConstructor]
        private RepositoryDockerConfig(bool? immutableTags)
        {
            ImmutableTags = immutableTags;
        }
    }
}
