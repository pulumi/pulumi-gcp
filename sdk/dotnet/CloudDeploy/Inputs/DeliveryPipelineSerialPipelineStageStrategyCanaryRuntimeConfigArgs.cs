// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CloudDeploy.Inputs
{

    public sealed class DeliveryPipelineSerialPipelineStageStrategyCanaryRuntimeConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Cloud Run runtime configuration.
        /// </summary>
        [Input("cloudRun")]
        public Input<Inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryRuntimeConfigCloudRunArgs>? CloudRun { get; set; }

        /// <summary>
        /// Kubernetes runtime configuration.
        /// </summary>
        [Input("kubernetes")]
        public Input<Inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryRuntimeConfigKubernetesArgs>? Kubernetes { get; set; }

        public DeliveryPipelineSerialPipelineStageStrategyCanaryRuntimeConfigArgs()
        {
        }
        public static new DeliveryPipelineSerialPipelineStageStrategyCanaryRuntimeConfigArgs Empty => new DeliveryPipelineSerialPipelineStageStrategyCanaryRuntimeConfigArgs();
    }
}
