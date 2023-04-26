// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CloudDeploy.Outputs
{

    [OutputType]
    public sealed class DeliveryPipelineSerialPipelineStageStrategyCanaryCustomCanaryDeployment
    {
        /// <summary>
        /// Required. Configuration for each phase in the canary deployment in the order executed.
        /// </summary>
        public readonly ImmutableArray<Outputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCustomCanaryDeploymentPhaseConfig> PhaseConfigs;

        [OutputConstructor]
        private DeliveryPipelineSerialPipelineStageStrategyCanaryCustomCanaryDeployment(ImmutableArray<Outputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCustomCanaryDeploymentPhaseConfig> phaseConfigs)
        {
            PhaseConfigs = phaseConfigs;
        }
    }
}