// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Dataproc.Outputs
{

    [OutputType]
    public sealed class ClusterClusterConfigPreemptibleWorkerConfigInstanceFlexibilityPolicy
    {
        /// <summary>
        /// List of instance selection options that the group will use when creating new VMs.
        /// </summary>
        public readonly ImmutableArray<Outputs.ClusterClusterConfigPreemptibleWorkerConfigInstanceFlexibilityPolicyInstanceSelectionList> InstanceSelectionLists;
        /// <summary>
        /// A list of instance selection results in the group.
        /// </summary>
        public readonly ImmutableArray<Outputs.ClusterClusterConfigPreemptibleWorkerConfigInstanceFlexibilityPolicyInstanceSelectionResult> InstanceSelectionResults;
        /// <summary>
        /// Defines how the Group selects the provisioning model to ensure required reliability.
        /// </summary>
        public readonly Outputs.ClusterClusterConfigPreemptibleWorkerConfigInstanceFlexibilityPolicyProvisioningModelMix? ProvisioningModelMix;

        [OutputConstructor]
        private ClusterClusterConfigPreemptibleWorkerConfigInstanceFlexibilityPolicy(
            ImmutableArray<Outputs.ClusterClusterConfigPreemptibleWorkerConfigInstanceFlexibilityPolicyInstanceSelectionList> instanceSelectionLists,

            ImmutableArray<Outputs.ClusterClusterConfigPreemptibleWorkerConfigInstanceFlexibilityPolicyInstanceSelectionResult> instanceSelectionResults,

            Outputs.ClusterClusterConfigPreemptibleWorkerConfigInstanceFlexibilityPolicyProvisioningModelMix? provisioningModelMix)
        {
            InstanceSelectionLists = instanceSelectionLists;
            InstanceSelectionResults = instanceSelectionResults;
            ProvisioningModelMix = provisioningModelMix;
        }
    }
}
