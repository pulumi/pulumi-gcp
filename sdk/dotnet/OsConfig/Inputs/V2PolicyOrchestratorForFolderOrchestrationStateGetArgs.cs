// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.OsConfig.Inputs
{

    public sealed class V2PolicyOrchestratorForFolderOrchestrationStateGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("currentIterationStates")]
        private InputList<Inputs.V2PolicyOrchestratorForFolderOrchestrationStateCurrentIterationStateGetArgs>? _currentIterationStates;

        /// <summary>
        /// (Output)
        /// Describes the state of a single iteration of the orchestrator.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.V2PolicyOrchestratorForFolderOrchestrationStateCurrentIterationStateGetArgs> CurrentIterationStates
        {
            get => _currentIterationStates ?? (_currentIterationStates = new InputList<Inputs.V2PolicyOrchestratorForFolderOrchestrationStateCurrentIterationStateGetArgs>());
            set => _currentIterationStates = value;
        }

        [Input("previousIterationStates")]
        private InputList<Inputs.V2PolicyOrchestratorForFolderOrchestrationStatePreviousIterationStateGetArgs>? _previousIterationStates;

        /// <summary>
        /// (Output)
        /// Describes the state of a single iteration of the orchestrator.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.V2PolicyOrchestratorForFolderOrchestrationStatePreviousIterationStateGetArgs> PreviousIterationStates
        {
            get => _previousIterationStates ?? (_previousIterationStates = new InputList<Inputs.V2PolicyOrchestratorForFolderOrchestrationStatePreviousIterationStateGetArgs>());
            set => _previousIterationStates = value;
        }

        public V2PolicyOrchestratorForFolderOrchestrationStateGetArgs()
        {
        }
        public static new V2PolicyOrchestratorForFolderOrchestrationStateGetArgs Empty => new V2PolicyOrchestratorForFolderOrchestrationStateGetArgs();
    }
}
