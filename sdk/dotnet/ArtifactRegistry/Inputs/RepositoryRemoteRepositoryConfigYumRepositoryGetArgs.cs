// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.ArtifactRegistry.Inputs
{

    public sealed class RepositoryRemoteRepositoryConfigYumRepositoryGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// One of the publicly available Yum repositories supported by Artifact Registry.
        /// Structure is documented below.
        /// </summary>
        [Input("publicRepository")]
        public Input<Inputs.RepositoryRemoteRepositoryConfigYumRepositoryPublicRepositoryGetArgs>? PublicRepository { get; set; }

        public RepositoryRemoteRepositoryConfigYumRepositoryGetArgs()
        {
        }
        public static new RepositoryRemoteRepositoryConfigYumRepositoryGetArgs Empty => new RepositoryRemoteRepositoryConfigYumRepositoryGetArgs();
    }
}