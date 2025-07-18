// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Dataproc.Inputs
{

    public sealed class ClusterClusterConfigPreemptibleWorkerConfigInstanceFlexibilityPolicyArgs : global::Pulumi.ResourceArgs
    {
        [Input("instanceSelectionLists")]
        private InputList<Inputs.ClusterClusterConfigPreemptibleWorkerConfigInstanceFlexibilityPolicyInstanceSelectionListArgs>? _instanceSelectionLists;

        /// <summary>
        /// List of instance selection options that the group will use when creating new VMs.
        /// </summary>
        public InputList<Inputs.ClusterClusterConfigPreemptibleWorkerConfigInstanceFlexibilityPolicyInstanceSelectionListArgs> InstanceSelectionLists
        {
            get => _instanceSelectionLists ?? (_instanceSelectionLists = new InputList<Inputs.ClusterClusterConfigPreemptibleWorkerConfigInstanceFlexibilityPolicyInstanceSelectionListArgs>());
            set => _instanceSelectionLists = value;
        }

        [Input("instanceSelectionResults")]
        private InputList<Inputs.ClusterClusterConfigPreemptibleWorkerConfigInstanceFlexibilityPolicyInstanceSelectionResultArgs>? _instanceSelectionResults;

        /// <summary>
        /// A list of instance selection results in the group.
        /// </summary>
        public InputList<Inputs.ClusterClusterConfigPreemptibleWorkerConfigInstanceFlexibilityPolicyInstanceSelectionResultArgs> InstanceSelectionResults
        {
            get => _instanceSelectionResults ?? (_instanceSelectionResults = new InputList<Inputs.ClusterClusterConfigPreemptibleWorkerConfigInstanceFlexibilityPolicyInstanceSelectionResultArgs>());
            set => _instanceSelectionResults = value;
        }

        /// <summary>
        /// Defines how the Group selects the provisioning model to ensure required reliability.
        /// </summary>
        [Input("provisioningModelMix")]
        public Input<Inputs.ClusterClusterConfigPreemptibleWorkerConfigInstanceFlexibilityPolicyProvisioningModelMixArgs>? ProvisioningModelMix { get; set; }

        public ClusterClusterConfigPreemptibleWorkerConfigInstanceFlexibilityPolicyArgs()
        {
        }
        public static new ClusterClusterConfigPreemptibleWorkerConfigInstanceFlexibilityPolicyArgs Empty => new ClusterClusterConfigPreemptibleWorkerConfigInstanceFlexibilityPolicyArgs();
    }
}
