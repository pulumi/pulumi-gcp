// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.ArtifactRegistry.Inputs
{

    public sealed class RepositoryRemoteRepositoryConfigPythonRepositoryGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// [Deprecated, please use commonRepository instead] Settings for a remote repository with a custom uri.
        /// Structure is documented below.
        /// </summary>
        [Input("customRepository")]
        public Input<Inputs.RepositoryRemoteRepositoryConfigPythonRepositoryCustomRepositoryGetArgs>? CustomRepository { get; set; }

        /// <summary>
        /// Address of the remote repository.
        /// Default value is `PYPI`.
        /// Possible values are: `PYPI`.
        /// </summary>
        [Input("publicRepository")]
        public Input<string>? PublicRepository { get; set; }

        public RepositoryRemoteRepositoryConfigPythonRepositoryGetArgs()
        {
        }
        public static new RepositoryRemoteRepositoryConfigPythonRepositoryGetArgs Empty => new RepositoryRemoteRepositoryConfigPythonRepositoryGetArgs();
    }
}
