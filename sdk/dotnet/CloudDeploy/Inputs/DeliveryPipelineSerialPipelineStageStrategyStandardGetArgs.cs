// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CloudDeploy.Inputs
{

    public sealed class DeliveryPipelineSerialPipelineStageStrategyStandardGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Optional. Configuration for the postdeploy job. If this is not configured, postdeploy job will not be present.
        /// </summary>
        [Input("postdeploy")]
        public Input<Inputs.DeliveryPipelineSerialPipelineStageStrategyStandardPostdeployGetArgs>? Postdeploy { get; set; }

        /// <summary>
        /// Optional. Configuration for the predeploy job. If this is not configured, predeploy job will not be present.
        /// </summary>
        [Input("predeploy")]
        public Input<Inputs.DeliveryPipelineSerialPipelineStageStrategyStandardPredeployGetArgs>? Predeploy { get; set; }

        /// <summary>
        /// Whether to verify a deployment.
        /// </summary>
        [Input("verify")]
        public Input<bool>? Verify { get; set; }

        public DeliveryPipelineSerialPipelineStageStrategyStandardGetArgs()
        {
        }
        public static new DeliveryPipelineSerialPipelineStageStrategyStandardGetArgs Empty => new DeliveryPipelineSerialPipelineStageStrategyStandardGetArgs();
    }
}
