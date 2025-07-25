// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CloudDeploy.Inputs
{

    public sealed class DeliveryPipelineSerialPipelineStageStrategyCanaryRuntimeConfigKubernetesServiceNetworkingGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Required. Name of the Kubernetes Deployment whose traffic is managed by the specified Service.
        /// </summary>
        [Input("deployment", required: true)]
        public Input<string> Deployment { get; set; } = null!;

        /// <summary>
        /// Optional. Whether to disable Pod overprovisioning. If Pod overprovisioning is disabled then Cloud Deploy will limit the number of total Pods used for the deployment strategy to the number of Pods the Deployment has on the cluster.
        /// </summary>
        [Input("disablePodOverprovisioning")]
        public Input<bool>? DisablePodOverprovisioning { get; set; }

        /// <summary>
        /// Optional. The label to use when selecting Pods for the Deployment resource. This label must already be present in the Deployment.
        /// </summary>
        [Input("podSelectorLabel")]
        public Input<string>? PodSelectorLabel { get; set; }

        /// <summary>
        /// Required. Name of the Kubernetes Service.
        /// </summary>
        [Input("service", required: true)]
        public Input<string> Service { get; set; } = null!;

        public DeliveryPipelineSerialPipelineStageStrategyCanaryRuntimeConfigKubernetesServiceNetworkingGetArgs()
        {
        }
        public static new DeliveryPipelineSerialPipelineStageStrategyCanaryRuntimeConfigKubernetesServiceNetworkingGetArgs Empty => new DeliveryPipelineSerialPipelineStageStrategyCanaryRuntimeConfigKubernetesServiceNetworkingGetArgs();
    }
}
