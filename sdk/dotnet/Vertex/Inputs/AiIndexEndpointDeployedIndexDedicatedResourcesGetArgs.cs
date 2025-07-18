// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Vertex.Inputs
{

    public sealed class AiIndexEndpointDeployedIndexDedicatedResourcesGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The minimum number of replicas this DeployedModel will be always deployed on.
        /// Structure is documented below.
        /// </summary>
        [Input("machineSpec", required: true)]
        public Input<Inputs.AiIndexEndpointDeployedIndexDedicatedResourcesMachineSpecGetArgs> MachineSpec { get; set; } = null!;

        /// <summary>
        /// The maximum number of replicas this DeployedModel may be deployed on when the traffic against it increases. If maxReplicaCount is not set, the default value is minReplicaCount
        /// </summary>
        [Input("maxReplicaCount")]
        public Input<int>? MaxReplicaCount { get; set; }

        /// <summary>
        /// The minimum number of machine replicas this DeployedModel will be always deployed on. This value must be greater than or equal to 1.
        /// </summary>
        [Input("minReplicaCount", required: true)]
        public Input<int> MinReplicaCount { get; set; } = null!;

        public AiIndexEndpointDeployedIndexDedicatedResourcesGetArgs()
        {
        }
        public static new AiIndexEndpointDeployedIndexDedicatedResourcesGetArgs Empty => new AiIndexEndpointDeployedIndexDedicatedResourcesGetArgs();
    }
}
