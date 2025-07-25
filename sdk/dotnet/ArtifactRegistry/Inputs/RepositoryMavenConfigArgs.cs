// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.ArtifactRegistry.Inputs
{

    public sealed class RepositoryMavenConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The repository with this flag will allow publishing the same
        /// snapshot versions.
        /// </summary>
        [Input("allowSnapshotOverwrites")]
        public Input<bool>? AllowSnapshotOverwrites { get; set; }

        /// <summary>
        /// Version policy defines the versions that the registry will accept.
        /// Default value is `VERSION_POLICY_UNSPECIFIED`.
        /// Possible values are: `VERSION_POLICY_UNSPECIFIED`, `RELEASE`, `SNAPSHOT`.
        /// </summary>
        [Input("versionPolicy")]
        public Input<string>? VersionPolicy { get; set; }

        public RepositoryMavenConfigArgs()
        {
        }
        public static new RepositoryMavenConfigArgs Empty => new RepositoryMavenConfigArgs();
    }
}
