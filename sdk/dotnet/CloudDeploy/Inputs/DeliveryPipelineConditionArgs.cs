// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CloudDeploy.Inputs
{

    public sealed class DeliveryPipelineConditionArgs : global::Pulumi.ResourceArgs
    {
        [Input("pipelineReadyConditions")]
        private InputList<Inputs.DeliveryPipelineConditionPipelineReadyConditionArgs>? _pipelineReadyConditions;

        /// <summary>
        /// Details around the Pipeline's overall status.
        /// </summary>
        public InputList<Inputs.DeliveryPipelineConditionPipelineReadyConditionArgs> PipelineReadyConditions
        {
            get => _pipelineReadyConditions ?? (_pipelineReadyConditions = new InputList<Inputs.DeliveryPipelineConditionPipelineReadyConditionArgs>());
            set => _pipelineReadyConditions = value;
        }

        [Input("targetsPresentConditions")]
        private InputList<Inputs.DeliveryPipelineConditionTargetsPresentConditionArgs>? _targetsPresentConditions;

        /// <summary>
        /// Details around targets enumerated in the pipeline.
        /// </summary>
        public InputList<Inputs.DeliveryPipelineConditionTargetsPresentConditionArgs> TargetsPresentConditions
        {
            get => _targetsPresentConditions ?? (_targetsPresentConditions = new InputList<Inputs.DeliveryPipelineConditionTargetsPresentConditionArgs>());
            set => _targetsPresentConditions = value;
        }

        [Input("targetsTypeConditions")]
        private InputList<Inputs.DeliveryPipelineConditionTargetsTypeConditionArgs>? _targetsTypeConditions;

        /// <summary>
        /// Details on the whether the targets enumerated in the pipeline are of the same type.
        /// </summary>
        public InputList<Inputs.DeliveryPipelineConditionTargetsTypeConditionArgs> TargetsTypeConditions
        {
            get => _targetsTypeConditions ?? (_targetsTypeConditions = new InputList<Inputs.DeliveryPipelineConditionTargetsTypeConditionArgs>());
            set => _targetsTypeConditions = value;
        }

        public DeliveryPipelineConditionArgs()
        {
        }
        public static new DeliveryPipelineConditionArgs Empty => new DeliveryPipelineConditionArgs();
    }
}
