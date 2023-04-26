// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.ArtifactRegistry.Inputs
{

    public sealed class RepositoryDockerConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The repository which enabled this flag prevents all tags from being modified, moved or deleted. This does not prevent tags from being created.
        /// </summary>
        [Input("immutableTags")]
        public Input<bool>? ImmutableTags { get; set; }

        public RepositoryDockerConfigArgs()
        {
        }
        public static new RepositoryDockerConfigArgs Empty => new RepositoryDockerConfigArgs();
    }
}