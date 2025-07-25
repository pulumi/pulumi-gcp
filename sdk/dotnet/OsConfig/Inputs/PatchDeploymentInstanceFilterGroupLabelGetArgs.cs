// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.OsConfig.Inputs
{

    public sealed class PatchDeploymentInstanceFilterGroupLabelGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("labels", required: true)]
        private InputMap<string>? _labels;

        /// <summary>
        /// Compute Engine instance labels that must be present for a VM instance to be targeted by this filter
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        public PatchDeploymentInstanceFilterGroupLabelGetArgs()
        {
        }
        public static new PatchDeploymentInstanceFilterGroupLabelGetArgs Empty => new PatchDeploymentInstanceFilterGroupLabelGetArgs();
    }
}
