// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.ArtifactRegistry.Inputs
{

    public sealed class RepositoryVirtualRepositoryConfigUpstreamPolicyGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The user-provided ID of the upstream policy.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// Entries with a greater priority value take precedence in the pull order.
        /// </summary>
        [Input("priority")]
        public Input<int>? Priority { get; set; }

        /// <summary>
        /// A reference to the repository resource, for example:
        /// "projects/p1/locations/us-central1/repository/repo1".
        /// </summary>
        [Input("repository")]
        public Input<string>? Repository { get; set; }

        public RepositoryVirtualRepositoryConfigUpstreamPolicyGetArgs()
        {
        }
        public static new RepositoryVirtualRepositoryConfigUpstreamPolicyGetArgs Empty => new RepositoryVirtualRepositoryConfigUpstreamPolicyGetArgs();
    }
}