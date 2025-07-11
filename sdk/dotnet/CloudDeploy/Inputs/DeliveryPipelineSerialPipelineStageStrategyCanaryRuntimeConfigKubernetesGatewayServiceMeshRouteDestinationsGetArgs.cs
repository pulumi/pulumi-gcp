// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CloudDeploy.Inputs
{

    public sealed class DeliveryPipelineSerialPipelineStageStrategyCanaryRuntimeConfigKubernetesGatewayServiceMeshRouteDestinationsGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("destinationIds", required: true)]
        private InputList<string>? _destinationIds;

        /// <summary>
        /// Required. The clusters where the Gateway API HTTPRoute resource will be deployed to. Valid entries include the associated entities IDs configured in the Target resource and "@self" to include the Target cluster.
        /// </summary>
        public InputList<string> DestinationIds
        {
            get => _destinationIds ?? (_destinationIds = new InputList<string>());
            set => _destinationIds = value;
        }

        /// <summary>
        /// Optional. Whether to propagate the Kubernetes Service to the route destination clusters. The Service will always be deployed to the Target cluster even if the HTTPRoute is not. This option may be used to facilitiate successful DNS lookup in the route destination clusters. Can only be set to true if destinations are specified.
        /// </summary>
        [Input("propagateService")]
        public Input<bool>? PropagateService { get; set; }

        public DeliveryPipelineSerialPipelineStageStrategyCanaryRuntimeConfigKubernetesGatewayServiceMeshRouteDestinationsGetArgs()
        {
        }
        public static new DeliveryPipelineSerialPipelineStageStrategyCanaryRuntimeConfigKubernetesGatewayServiceMeshRouteDestinationsGetArgs Empty => new DeliveryPipelineSerialPipelineStageStrategyCanaryRuntimeConfigKubernetesGatewayServiceMeshRouteDestinationsGetArgs();
    }
}
