// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeOnPrem.Inputs
{

    public sealed class BareMetalClusterNodeConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The available runtimes that can be used to run containers in a Bare Metal User Cluster.
        /// Possible values are: `CONTAINER_RUNTIME_UNSPECIFIED`, `DOCKER`, `CONTAINERD`.
        /// </summary>
        [Input("containerRuntime")]
        public Input<string>? ContainerRuntime { get; set; }

        /// <summary>
        /// The maximum number of pods a node can run. The size of the CIDR range
        /// assigned to the node will be derived from this parameter.
        /// </summary>
        [Input("maxPodsPerNode")]
        public Input<int>? MaxPodsPerNode { get; set; }

        public BareMetalClusterNodeConfigGetArgs()
        {
        }
        public static new BareMetalClusterNodeConfigGetArgs Empty => new BareMetalClusterNodeConfigGetArgs();
    }
}
