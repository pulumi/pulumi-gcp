// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CloudDeploy.Inputs
{

    public sealed class DeliveryPipelineSerialPipelineStageStrategyCanaryArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Configures the progressive based deployment for a Target.
        /// </summary>
        [Input("canaryDeployment")]
        public Input<Inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentArgs>? CanaryDeployment { get; set; }

        /// <summary>
        /// Configures the progressive based deployment for a Target, but allows customizing at the phase level where a phase represents each of the percentage deployments.
        /// </summary>
        [Input("customCanaryDeployment")]
        public Input<Inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCustomCanaryDeploymentArgs>? CustomCanaryDeployment { get; set; }

        /// <summary>
        /// Optional. Runtime specific configurations for the deployment strategy. The runtime configuration is used to determine how Cloud Deploy will split traffic to enable a progressive deployment.
        /// </summary>
        [Input("runtimeConfig")]
        public Input<Inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryRuntimeConfigArgs>? RuntimeConfig { get; set; }

        public DeliveryPipelineSerialPipelineStageStrategyCanaryArgs()
        {
        }
        public static new DeliveryPipelineSerialPipelineStageStrategyCanaryArgs Empty => new DeliveryPipelineSerialPipelineStageStrategyCanaryArgs();
    }
}