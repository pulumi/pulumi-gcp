// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CloudDeploy.Inputs
{

    public sealed class TargetAssociatedEntityGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("anthosClusters")]
        private InputList<Inputs.TargetAssociatedEntityAnthosClusterGetArgs>? _anthosClusters;

        /// <summary>
        /// Optional. Information specifying Anthos clusters as associated entities.
        /// </summary>
        public InputList<Inputs.TargetAssociatedEntityAnthosClusterGetArgs> AnthosClusters
        {
            get => _anthosClusters ?? (_anthosClusters = new InputList<Inputs.TargetAssociatedEntityAnthosClusterGetArgs>());
            set => _anthosClusters = value;
        }

        /// <summary>
        /// The name for the key in the map for which this object is mapped to in the API
        /// </summary>
        [Input("entityId", required: true)]
        public Input<string> EntityId { get; set; } = null!;

        [Input("gkeClusters")]
        private InputList<Inputs.TargetAssociatedEntityGkeClusterGetArgs>? _gkeClusters;

        /// <summary>
        /// Optional. Information specifying GKE clusters as associated entities.
        /// </summary>
        public InputList<Inputs.TargetAssociatedEntityGkeClusterGetArgs> GkeClusters
        {
            get => _gkeClusters ?? (_gkeClusters = new InputList<Inputs.TargetAssociatedEntityGkeClusterGetArgs>());
            set => _gkeClusters = value;
        }

        public TargetAssociatedEntityGetArgs()
        {
        }
        public static new TargetAssociatedEntityGetArgs Empty => new TargetAssociatedEntityGetArgs();
    }
}
