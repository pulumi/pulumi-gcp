// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.ArtifactRegistry.Inputs
{

    public sealed class RepositoryRemoteRepositoryConfigDockerRepositoryGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Address of the remote repository.
        /// Default value is `DOCKER_HUB`.
        /// Possible values are: `DOCKER_HUB`.
        /// </summary>
        [Input("publicRepository")]
        public Input<string>? PublicRepository { get; set; }

        public RepositoryRemoteRepositoryConfigDockerRepositoryGetArgs()
        {
        }
        public static new RepositoryRemoteRepositoryConfigDockerRepositoryGetArgs Empty => new RepositoryRemoteRepositoryConfigDockerRepositoryGetArgs();
    }
}