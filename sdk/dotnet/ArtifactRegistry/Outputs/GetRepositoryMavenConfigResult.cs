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
    public sealed class GetRepositoryMavenConfigResult
    {
        /// <summary>
        /// The repository with this flag will allow publishing the same
        /// snapshot versions.
        /// </summary>
        public readonly bool AllowSnapshotOverwrites;
        /// <summary>
        /// Version policy defines the versions that the registry will accept. Default value: "VERSION_POLICY_UNSPECIFIED" Possible values: ["VERSION_POLICY_UNSPECIFIED", "RELEASE", "SNAPSHOT"]
        /// </summary>
        public readonly string VersionPolicy;

        [OutputConstructor]
        private GetRepositoryMavenConfigResult(
            bool allowSnapshotOverwrites,

            string versionPolicy)
        {
            AllowSnapshotOverwrites = allowSnapshotOverwrites;
            VersionPolicy = versionPolicy;
        }
    }
}
