// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.OsConfig.Inputs
{

    public sealed class V2PolicyOrchestratorForFolderOrchestrationScopeSelectorLocationSelectorArgs : global::Pulumi.ResourceArgs
    {
        [Input("includedLocations")]
        private InputList<string>? _includedLocations;

        /// <summary>
        /// Names of the locations in scope.
        /// Format: `us-central1-a`
        /// </summary>
        public InputList<string> IncludedLocations
        {
            get => _includedLocations ?? (_includedLocations = new InputList<string>());
            set => _includedLocations = value;
        }

        public V2PolicyOrchestratorForFolderOrchestrationScopeSelectorLocationSelectorArgs()
        {
        }
        public static new V2PolicyOrchestratorForFolderOrchestrationScopeSelectorLocationSelectorArgs Empty => new V2PolicyOrchestratorForFolderOrchestrationScopeSelectorLocationSelectorArgs();
    }
}
