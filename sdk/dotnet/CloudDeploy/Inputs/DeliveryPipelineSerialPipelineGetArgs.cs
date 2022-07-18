// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CloudDeploy.Inputs
{

    public sealed class DeliveryPipelineSerialPipelineGetArgs : Pulumi.ResourceArgs
    {
        [Input("stages")]
        private InputList<Inputs.DeliveryPipelineSerialPipelineStageGetArgs>? _stages;

        /// <summary>
        /// Each stage specifies configuration for a `Target`. The ordering of this list defines the promotion flow.
        /// </summary>
        public InputList<Inputs.DeliveryPipelineSerialPipelineStageGetArgs> Stages
        {
            get => _stages ?? (_stages = new InputList<Inputs.DeliveryPipelineSerialPipelineStageGetArgs>());
            set => _stages = value;
        }

        public DeliveryPipelineSerialPipelineGetArgs()
        {
        }
    }
}